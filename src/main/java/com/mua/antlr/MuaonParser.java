// Generated from /home/maifee/Desktop/muaon-parser-java-antlr/src/main/java/com/mua/antlr/Muaon.g4 by ANTLR 4.8
package com.mua.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuaonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INTEGER=14, FLOAT=15, KEYELEM=16, 
		STRING=17, WhiteSpace=18, MultiLineComments=19;
	public static final int
		RULE_muaon = 0, RULE_defBlock = 1, RULE_definationSet = 2, RULE_defination = 3, 
		RULE_key = 4, RULE_keySet = 5, RULE_dataBlock = 6, RULE_value = 7, RULE_bool = 8, 
		RULE_object = 9, RULE_valueSetObject = 10, RULE_array = 11, RULE_valueSetArray = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"muaon", "defBlock", "definationSet", "defination", "key", "keySet", 
			"dataBlock", "value", "bool", "object", "valueSetObject", "array", "valueSetArray"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'def'", "'='", "'['", "']'", "','", "'('", "')'", 
			"'data'", "'true'", "'false'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INTEGER", "FLOAT", "KEYELEM", "STRING", "WhiteSpace", "MultiLineComments"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Muaon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MuaonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MuaonContext extends ParserRuleContext {
		public DefBlockContext defBlock() {
			return getRuleContext(DefBlockContext.class,0);
		}
		public DataBlockContext dataBlock() {
			return getRuleContext(DataBlockContext.class,0);
		}
		public MuaonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muaon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterMuaon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitMuaon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitMuaon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuaonContext muaon() throws RecognitionException {
		MuaonContext _localctx = new MuaonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_muaon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			defBlock();
			setState(28);
			dataBlock();
			setState(29);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefBlockContext extends ParserRuleContext {
		public DefinationSetContext definationSet() {
			return getRuleContext(DefinationSetContext.class,0);
		}
		public DefBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterDefBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitDefBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitDefBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefBlockContext defBlock() throws RecognitionException {
		DefBlockContext _localctx = new DefBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defBlock);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__2);
				setState(32);
				match(T__3);
				setState(33);
				match(T__4);
				setState(34);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__2);
				setState(36);
				match(T__3);
				setState(37);
				match(T__4);
				setState(38);
				definationSet(0);
				setState(39);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinationSetContext extends ParserRuleContext {
		public DefinationContext defination() {
			return getRuleContext(DefinationContext.class,0);
		}
		public DefinationSetContext definationSet() {
			return getRuleContext(DefinationSetContext.class,0);
		}
		public DefinationSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definationSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterDefinationSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitDefinationSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitDefinationSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinationSetContext definationSet() throws RecognitionException {
		return definationSet(0);
	}

	private DefinationSetContext definationSet(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefinationSetContext _localctx = new DefinationSetContext(_ctx, _parentState);
		DefinationSetContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_definationSet, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			defination();
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefinationSetContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_definationSet);
					setState(46);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(47);
					match(T__6);
					setState(48);
					defination();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefinationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MuaonParser.INTEGER, 0); }
		public KeySetContext keySet() {
			return getRuleContext(KeySetContext.class,0);
		}
		public DefinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterDefination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitDefination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitDefination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinationContext defination() throws RecognitionException {
		DefinationContext _localctx = new DefinationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defination);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(INTEGER);
				setState(55);
				match(T__7);
				setState(56);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(INTEGER);
				setState(58);
				match(T__7);
				setState(59);
				keySet(0);
				setState(60);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public List<TerminalNode> KEYELEM() { return getTokens(MuaonParser.KEYELEM); }
		public TerminalNode KEYELEM(int i) {
			return getToken(MuaonParser.KEYELEM, i);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					match(KEYELEM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeySetContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(MuaonParser.INTEGER, 0); }
		public KeySetContext keySet() {
			return getRuleContext(KeySetContext.class,0);
		}
		public KeySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterKeySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitKeySet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitKeySet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeySetContext keySet() throws RecognitionException {
		return keySet(0);
	}

	private KeySetContext keySet(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		KeySetContext _localctx = new KeySetContext(_ctx, _parentState);
		KeySetContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_keySet, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYELEM:
				{
				setState(70);
				key();
				}
				break;
			case INTEGER:
				{
				setState(71);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new KeySetContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_keySet);
						setState(74);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(75);
						match(T__6);
						setState(76);
						key();
						}
						break;
					case 2:
						{
						_localctx = new KeySetContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_keySet);
						setState(77);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(78);
						match(T__6);
						setState(79);
						match(INTEGER);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DataBlockContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DataBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterDataBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitDataBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitDataBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBlockContext dataBlock() throws RecognitionException {
		DataBlockContext _localctx = new DataBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__9);
			setState(86);
			match(T__3);
			setState(87);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MuaonParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(MuaonParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(MuaonParser.FLOAT, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(STRING);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(FLOAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				array();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public ValueSetObjectContext valueSetObject() {
			return getRuleContext(ValueSetObjectContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(MuaonParser.INTEGER, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_object);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__0);
				setState(100);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__0);
				setState(102);
				match(T__6);
				setState(103);
				valueSetObject(0);
				setState(104);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__0);
				setState(107);
				match(INTEGER);
				setState(108);
				match(T__6);
				setState(109);
				valueSetObject(0);
				setState(110);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueSetObjectContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueSetObjectContext valueSetObject() {
			return getRuleContext(ValueSetObjectContext.class,0);
		}
		public ValueSetObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSetObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterValueSetObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitValueSetObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitValueSetObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueSetObjectContext valueSetObject() throws RecognitionException {
		return valueSetObject(0);
	}

	private ValueSetObjectContext valueSetObject(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueSetObjectContext _localctx = new ValueSetObjectContext(_ctx, _parentState);
		ValueSetObjectContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_valueSetObject, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ValueSetObjectContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueSetObject);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(T__6);
						setState(119);
						value();
						}
						break;
					case 2:
						{
						_localctx = new ValueSetObjectContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueSetObject);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MuaonParser.INTEGER, 0); }
		public ValueSetArrayContext valueSetArray() {
			return getRuleContext(ValueSetArrayContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__4);
				setState(128);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__4);
				setState(130);
				match(INTEGER);
				setState(131);
				match(T__6);
				setState(132);
				valueSetArray(0);
				setState(133);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__4);
				setState(136);
				match(T__12);
				setState(137);
				match(T__6);
				setState(138);
				valueSetArray(0);
				setState(139);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueSetArrayContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueSetArrayContext valueSetArray() {
			return getRuleContext(ValueSetArrayContext.class,0);
		}
		public ValueSetArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSetArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).enterValueSetArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuaonListener ) ((MuaonListener)listener).exitValueSetArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuaonVisitor ) return ((MuaonVisitor<? extends T>)visitor).visitValueSetArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueSetArrayContext valueSetArray() throws RecognitionException {
		return valueSetArray(0);
	}

	private ValueSetArrayContext valueSetArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueSetArrayContext _localctx = new ValueSetArrayContext(_ctx, _parentState);
		ValueSetArrayContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_valueSetArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueSetArrayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_valueSetArray);
					setState(146);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(147);
					match(T__6);
					setState(148);
					value();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return definationSet_sempred((DefinationSetContext)_localctx, predIndex);
		case 5:
			return keySet_sempred((KeySetContext)_localctx, predIndex);
		case 10:
			return valueSetObject_sempred((ValueSetObjectContext)_localctx, predIndex);
		case 12:
			return valueSetArray_sempred((ValueSetArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean definationSet_sempred(DefinationSetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean keySet_sempred(KeySetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueSetObject_sempred(ValueSetObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueSetArray_sempred(ValueSetArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4\f\4"+
		"\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\6\6D\n\6\r"+
		"\6\16\6E\3\7\3\7\3\7\5\7K\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16"+
		"\7V\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f}\n\f\f\f\16\f\u0080\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13\16\3\16\2"+
		"\6\6\f\26\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\r\16\2\u00a2"+
		"\2\34\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b@\3\2\2\2\nC\3\2\2\2\fJ\3\2\2\2\16"+
		"W\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24r\3\2\2\2\26t\3\2\2\2\30\u008f\3\2"+
		"\2\2\32\u0091\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2\36\37\5\16\b\2\37 \7"+
		"\4\2\2 \3\3\2\2\2!\"\7\5\2\2\"#\7\6\2\2#$\7\7\2\2$,\7\b\2\2%&\7\5\2\2"+
		"&\'\7\6\2\2\'(\7\7\2\2()\5\6\4\2)*\7\b\2\2*,\3\2\2\2+!\3\2\2\2+%\3\2\2"+
		"\2,\5\3\2\2\2-.\b\4\1\2./\5\b\5\2/\65\3\2\2\2\60\61\f\3\2\2\61\62\7\t"+
		"\2\2\62\64\5\b\5\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\7\3\2\2\2\67\65\3\2\2\289\7\20\2\29:\7\n\2\2:A\7\13\2\2;<\7\20"+
		"\2\2<=\7\n\2\2=>\5\f\7\2>?\7\13\2\2?A\3\2\2\2@8\3\2\2\2@;\3\2\2\2A\t\3"+
		"\2\2\2BD\7\22\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2"+
		"GH\b\7\1\2HK\5\n\6\2IK\7\20\2\2JG\3\2\2\2JI\3\2\2\2KT\3\2\2\2LM\f\4\2"+
		"\2MN\7\t\2\2NS\5\n\6\2OP\f\3\2\2PQ\7\t\2\2QS\7\20\2\2RL\3\2\2\2RO\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VT\3\2\2\2WX\7\f\2\2XY\7"+
		"\6\2\2YZ\5\20\t\2Z\17\3\2\2\2[b\7\23\2\2\\b\7\20\2\2]b\7\21\2\2^b\5\24"+
		"\13\2_b\5\30\r\2`b\5\22\n\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a"+
		"_\3\2\2\2a`\3\2\2\2b\21\3\2\2\2cd\t\2\2\2d\23\3\2\2\2ef\7\3\2\2fs\7\4"+
		"\2\2gh\7\3\2\2hi\7\t\2\2ij\5\26\f\2jk\7\4\2\2ks\3\2\2\2lm\7\3\2\2mn\7"+
		"\20\2\2no\7\t\2\2op\5\26\f\2pq\7\4\2\2qs\3\2\2\2re\3\2\2\2rg\3\2\2\2r"+
		"l\3\2\2\2s\25\3\2\2\2tu\b\f\1\2uv\5\20\t\2v~\3\2\2\2wx\f\4\2\2xy\7\t\2"+
		"\2y}\5\20\t\2z{\f\3\2\2{}\7\t\2\2|w\3\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~"+
		"|\3\2\2\2~\177\3\2\2\2\177\27\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\7\2"+
		"\2\u0082\u0090\7\b\2\2\u0083\u0084\7\7\2\2\u0084\u0085\7\20\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7\b\2\2\u0088\u0090\3"+
		"\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b\7\17\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\u008e\7\b\2\2\u008e\u0090\3\2\2\2\u008f\u0081\3"+
		"\2\2\2\u008f\u0083\3\2\2\2\u008f\u0089\3\2\2\2\u0090\31\3\2\2\2\u0091"+
		"\u0092\b\16\1\2\u0092\u0093\5\20\t\2\u0093\u0099\3\2\2\2\u0094\u0095\f"+
		"\3\2\2\u0095\u0096\7\t\2\2\u0096\u0098\5\20\t\2\u0097\u0094\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\17+\65@EJRTar|~\u008f\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}