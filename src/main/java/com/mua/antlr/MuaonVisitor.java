// Generated from /home/maifee/Desktop/muaon-parser-java-antlr/src/main/java/com/mua/antlr/Muaon.g4 by ANTLR 4.8
package com.mua.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MuaonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MuaonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MuaonParser#muaon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuaon(MuaonParser.MuaonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#defBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefBlock(MuaonParser.DefBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#definationSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinationSet(MuaonParser.DefinationSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#defination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefination(MuaonParser.DefinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(MuaonParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#keySet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeySet(MuaonParser.KeySetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#dataBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlock(MuaonParser.DataBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MuaonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MuaonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(MuaonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#valueSetObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueSetObject(MuaonParser.ValueSetObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MuaonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuaonParser#valueSetArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueSetArray(MuaonParser.ValueSetArrayContext ctx);
}