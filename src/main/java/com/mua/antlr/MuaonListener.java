// Generated from /home/maifee/Desktop/muaon-parser-java-antlr/src/main/java/com/mua/antlr/Muaon.g4 by ANTLR 4.8
package com.mua.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuaonParser}.
 */
public interface MuaonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuaonParser#muaon}.
	 * @param ctx the parse tree
	 */
	void enterMuaon(MuaonParser.MuaonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#muaon}.
	 * @param ctx the parse tree
	 */
	void exitMuaon(MuaonParser.MuaonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#defBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefBlock(MuaonParser.DefBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#defBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefBlock(MuaonParser.DefBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#definationSet}.
	 * @param ctx the parse tree
	 */
	void enterDefinationSet(MuaonParser.DefinationSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#definationSet}.
	 * @param ctx the parse tree
	 */
	void exitDefinationSet(MuaonParser.DefinationSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#defination}.
	 * @param ctx the parse tree
	 */
	void enterDefination(MuaonParser.DefinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#defination}.
	 * @param ctx the parse tree
	 */
	void exitDefination(MuaonParser.DefinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(MuaonParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(MuaonParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#keySet}.
	 * @param ctx the parse tree
	 */
	void enterKeySet(MuaonParser.KeySetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#keySet}.
	 * @param ctx the parse tree
	 */
	void exitKeySet(MuaonParser.KeySetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#dataBlock}.
	 * @param ctx the parse tree
	 */
	void enterDataBlock(MuaonParser.DataBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#dataBlock}.
	 * @param ctx the parse tree
	 */
	void exitDataBlock(MuaonParser.DataBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MuaonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MuaonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MuaonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MuaonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(MuaonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(MuaonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#valueSetObject}.
	 * @param ctx the parse tree
	 */
	void enterValueSetObject(MuaonParser.ValueSetObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#valueSetObject}.
	 * @param ctx the parse tree
	 */
	void exitValueSetObject(MuaonParser.ValueSetObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MuaonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MuaonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuaonParser#valueSetArray}.
	 * @param ctx the parse tree
	 */
	void enterValueSetArray(MuaonParser.ValueSetArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuaonParser#valueSetArray}.
	 * @param ctx the parse tree
	 */
	void exitValueSetArray(MuaonParser.ValueSetArrayContext ctx);
}