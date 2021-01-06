package com.mua.muaon;

import com.mua.antlr.MuaonLexer;
import com.mua.antlr.MuaonParser;
import com.mua.muaon.internal.MArray;
import com.mua.muaon.internal.MObject;
import com.mua.muaon.internal.MValue;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.*;

public class MuaonDecoder {

    private Stack<Integer> a_default_id=new Stack<Integer>();
    private int key_tem=0;
    private List<String> def_tem=new ArrayList<String>();
    private final Map<Integer, List<String>> defs=new HashMap<Integer, List<String>>();
    private MValue res=new MValue();

    public void decode(String muaon){
        MuaonLexer lexer = new MuaonLexer(new ANTLRInputStream(muaon));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MuaonParser parser = new MuaonParser(tokens);


        parser.addErrorListener(new BaseErrorListener() {
            //@Override
            public void syntaxError(Recognizer<?, ?> recognizer, MObject offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        decodeMuaon(parser.muaon());

        //printDefs();
        printData();
    }

    private void printData(){
        System.out.println(res);
    }

    private void printDefs(){
        for(Integer id: defs.keySet()){
            System.out.print(id + " : " );
            for(String key:defs.get(id)){
                System.out.print(key+" - ");
            }
            System.out.println();
        }
    }

    private void decodeMuaon(MuaonParser.MuaonContext muaonContext){
        decodeMuaonDef(muaonContext.defBlock());
        decodeMuaonData(muaonContext.dataBlock());
    }

    private void decodeMuaonDef(MuaonParser.DefBlockContext defblockContext){
        decodeDefinationSet(defblockContext.definationSet());
    }

    private void decodeDefinationSet(MuaonParser.DefinationSetContext definationsetContext){
        for(ParseTree pt:definationsetContext.children){
            if(pt instanceof MuaonParser.DefinationContext){
                decodeDefination(definationsetContext.defination());
            }else if(pt instanceof MuaonParser.DefinationSetContext){
                decodeDefinationSet(definationsetContext.definationSet());
            }
        }
    }

    private void decodeDefination(MuaonParser.DefinationContext definationContext){
        key_tem = Integer.parseInt(definationContext.INTEGER().toString());
        def_tem=new ArrayList<String>();
        if(definationContext.keySet()!=null){
            decodeKeyset(definationContext.keySet());
        }
        defs.put(key_tem,def_tem);
    }

    private void decodeKeyset(MuaonParser.KeySetContext keysetContext){
        for(ParseTree pt:keysetContext.children){
            if(pt instanceof MuaonParser.KeyContext){
                def_tem.add(keysetContext.key().getText());
            }else if(pt instanceof MuaonParser.KeySetContext){
                decodeKeyset(keysetContext.keySet());
            }else if(!pt.getText().equals(",")){
                def_tem.add(pt.getText());
            }
        }
    }

    private void decodeMuaonData(MuaonParser.DataBlockContext datablockContext){
        res = decodeValue(datablockContext.value());
    }


    private MValue decodeValueSet(MuaonParser.ValueSetObjectContext valuesetoContext){
        //System.out.println("^*^ "+valuesetoContext.getText());

        for(ParseTree pt:valuesetoContext.children){
            if(pt instanceof MuaonParser.ValueSetObjectContext){
                return decodeValueSet(pt);
            }else if(pt instanceof MuaonParser.ValueContext){
                return decodeValue(pt);
            }
        }

        return new MValue();
    }

    private MValue decodeValueSet(ParseTree valueTree){
        MuaonLexer lexer = new MuaonLexer(new ANTLRInputStream(valueTree.getText()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MuaonParser parser = new MuaonParser(tokens);
        return decodeValueSet(parser.valueSetObject());
    }


    private MValue decodeTerminalNode(ParseTree pt){
        if(((TerminalNodeImpl)pt).symbol.getType()==MuaonParser.INTEGER)
            return decodeInteger(pt);
        else if(((TerminalNodeImpl)pt).symbol.getType()==MuaonParser.FLOAT)
            return decodeFloat(pt);
        else if(((TerminalNodeImpl)pt).symbol.getType()==MuaonParser.STRING)
            return decodeString(pt);
        else
            return new MValue();
    }

    private List<MValue> decodeValuesSetObject(ParseTree valueSet){
        //System.out.println(valueSet.getText());
        if(valueSet.getChildCount()==1){
            return Arrays.asList(decodeValue(valueSet.getChild(0)));
        }else if(valueSet.getChildCount()==2){
            List<MValue> mValues=new ArrayList<MValue>();
            mValues.addAll(decodeValuesSetObject(valueSet.getChild(0)));
            mValues.add(new MValue());
            return mValues;
        }else{
            List<MValue> mValues=new ArrayList<MValue>();
            mValues.addAll(decodeValuesSetObject(valueSet.getChild(0)));
            mValues.add(decodeValue(valueSet.getChild(2)));
            return mValues;
        }
    }


    private MValue decodeObject(ParseTree objectTree){
        //System.out.println("obbbbjj "+objectTree.getText());
        if(((TerminalNodeImpl)objectTree.getChild(1)).symbol.getType()!=MuaonParser.INTEGER){
            List<MValue> mValues = decodeValuesSetObject(objectTree.getChild(2));
            MObject mObject=new MObject();
            List<String> keys=defs.get(a_default_id.peek());
            int i=0;
            for(String key:keys){
                mObject.pairs.put(key,mValues.get(i++));
            }
            return new MValue(mObject);
        }
        else{
            /*
            System.out.println(objectTree.getChildCount()+" child count");
            if(objectTree.getChildCount()==4){
            }else{
                */
                List<MValue> mValues = decodeValuesSetObject(objectTree.getChild(3));
                MObject mObject=new MObject();
                int id=Integer.parseInt(objectTree.getChild(1).getText());
                List<String> keys=defs.get(id);
                int i=0;
                for(String key:keys)
                    mObject.pairs.put(key,mValues.get(i++));
                return new MValue(mObject);
            //}
        }
    }

    private void decodeValues(){

    }

    private MValue decodeArray(ParseTree arrayTree){
        if(arrayTree.getChildCount()==2){
            return new MValue(new MArray());
        }else{
            List<MValue> mValues;
            if(((TerminalNodeImpl)arrayTree.getChild(1)).symbol.getType()==MuaonParser.INTEGER){

                a_default_id.push(Integer.parseInt(arrayTree.getChild(1).getText()));
                //System.out.println(arrayTree.getChild(3).getText());
                mValues=decodeValuesSetObject(arrayTree.getChild(3));
                /*
                for(MValue mValue:mValues){
                    //System.out.println(mValue.toString()+" ^^");
                }
                */
                a_default_id.pop();

            }else{
                /*
                for(int i=0;i<arrayTree.getChildCount();i++){
                    //System.out.println(i+" -- "+arrayTree.getChild(i).getText());
                }

                 */
                mValues=decodeValuesSetObject(arrayTree.getChild(3));
                /*
                for(MValue mValue:mValues){
                    System.out.println(mValue.toString()+" --");
                }

                 */
            }
            return new MValue(new MArray(mValues));
        }
        //System.out.println("array "+arrayTree.getText());
        //return new MValue();
    }










    private MValue decodeString(ParseTree pt){
        return new MValue(pt.getText());
    }

    private MValue decodeInteger(ParseTree pt){
        return new MValue(Integer.parseInt(pt.getText()));
    }

    private MValue decodeFloat(ParseTree pt){
        return new MValue(Double.parseDouble(pt.getText()));
    }

    private MValue decodeBool(ParseTree pt){
        return new MValue(Boolean.parseBoolean(pt.getText()));
    }

    private MValue decodeValue(ParseTree valueTree){
        MuaonLexer lexer = new MuaonLexer(new ANTLRInputStream(valueTree.getText()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MuaonParser parser = new MuaonParser(tokens);
        return decodeValue(parser.value());
    }

    private MValue decodeValue(MuaonParser.ValueContext valueContext){
        ParseTree pt=valueContext.children.get(0);
        if(pt instanceof MuaonParser.ObjectContext){
            return decodeObject(pt);
        }
        else if(pt instanceof MuaonParser.ArrayContext){
            return decodeArray(pt);
        }else if(pt instanceof MuaonParser.BoolContext){
            return decodeBool(pt);
        }
        else{
            return decodeTerminalNode(pt);
        }
    }

}
