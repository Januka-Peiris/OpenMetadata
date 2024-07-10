// Generated from org/openmetadata/schema/EntityLink.g4 by ANTLR 4.13.1
package org.openmetadata.schema;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EntityLinkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, RESERVED_START=3, ENTITY_TYPE=4, ENTITY_FIELD=5, NAME_OR_FQN=6;
	public static final int
		RULE_entitylink = 0, RULE_entity_type = 1, RULE_name_or_fqn = 2, RULE_entity_field = 3, 
		RULE_separator = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"entitylink", "entity_type", "name_or_fqn", "entity_field", "separator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'::'", "'<#E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "RESERVED_START", "ENTITY_TYPE", "ENTITY_FIELD", "NAME_OR_FQN"
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
	public String getGrammarFileName() { return "EntityLink.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EntityLinkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntitylinkContext extends ParserRuleContext {
		public TerminalNode RESERVED_START() { return getToken(EntityLinkParser.RESERVED_START, 0); }
		public TerminalNode EOF() { return getToken(EntityLinkParser.EOF, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Entity_typeContext> entity_type() {
			return getRuleContexts(Entity_typeContext.class);
		}
		public Entity_typeContext entity_type(int i) {
			return getRuleContext(Entity_typeContext.class,i);
		}
		public List<Name_or_fqnContext> name_or_fqn() {
			return getRuleContexts(Name_or_fqnContext.class);
		}
		public Name_or_fqnContext name_or_fqn(int i) {
			return getRuleContext(Name_or_fqnContext.class,i);
		}
		public List<Entity_fieldContext> entity_field() {
			return getRuleContexts(Entity_fieldContext.class);
		}
		public Entity_fieldContext entity_field(int i) {
			return getRuleContext(Entity_fieldContext.class,i);
		}
		public EntitylinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entitylink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntitylink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntitylink(this);
		}
	}

	public final EntitylinkContext entitylink() throws RecognitionException {
		EntitylinkContext _localctx = new EntitylinkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entitylink);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(RESERVED_START);
			setState(16); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(11);
					separator();
					setState(12);
					entity_type();
					setState(13);
					separator();
					setState(14);
					name_or_fqn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(18); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(20);
				separator();
				setState(21);
				entity_field();
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(22);
						separator();
						setState(23);
						name_or_fqn();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(T__0);
			setState(36);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_typeContext extends ParserRuleContext {
		public Entity_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_type; }
	 
		public Entity_typeContext() { }
		public void copyFrom(Entity_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityTypeContext extends Entity_typeContext {
		public TerminalNode ENTITY_TYPE() { return getToken(EntityLinkParser.ENTITY_TYPE, 0); }
		public EntityTypeContext(Entity_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityType(this);
		}
	}

	public final Entity_typeContext entity_type() throws RecognitionException {
		Entity_typeContext _localctx = new Entity_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity_type);
		try {
			_localctx = new EntityTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ENTITY_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Name_or_fqnContext extends ParserRuleContext {
		public Name_or_fqnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_or_fqn; }
	 
		public Name_or_fqnContext() { }
		public void copyFrom(Name_or_fqnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameOrFQNContext extends Name_or_fqnContext {
		public TerminalNode NAME_OR_FQN() { return getToken(EntityLinkParser.NAME_OR_FQN, 0); }
		public NameOrFQNContext(Name_or_fqnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterNameOrFQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitNameOrFQN(this);
		}
	}

	public final Name_or_fqnContext name_or_fqn() throws RecognitionException {
		Name_or_fqnContext _localctx = new Name_or_fqnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name_or_fqn);
		try {
			_localctx = new NameOrFQNContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NAME_OR_FQN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_fieldContext extends ParserRuleContext {
		public Entity_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_field; }
	 
		public Entity_fieldContext() { }
		public void copyFrom(Entity_fieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityFieldContext extends Entity_fieldContext {
		public TerminalNode ENTITY_FIELD() { return getToken(EntityLinkParser.ENTITY_FIELD, 0); }
		public EntityFieldContext(Entity_fieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityField(this);
		}
	}

	public final Entity_fieldContext entity_field() throws RecognitionException {
		Entity_fieldContext _localctx = new Entity_fieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entity_field);
		try {
			_localctx = new EntityFieldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ENTITY_FIELD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeparatorContext extends ParserRuleContext {
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0006/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000"+
		"\f\u0000\u001d\t\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000,\u0000\n\u0001"+
		"\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000"+
		"\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n\u0010"+
		"\u0005\u0003\u0000\u0000\u000b\f\u0003\b\u0004\u0000\f\r\u0003\u0002\u0001"+
		"\u0000\r\u000e\u0003\b\u0004\u0000\u000e\u000f\u0003\u0004\u0002\u0000"+
		"\u000f\u0011\u0001\u0000\u0000\u0000\u0010\u000b\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0001\u0000\u0000\u0000\u0013 \u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\b\u0004\u0000\u0015\u001b\u0003\u0006\u0003\u0000\u0016\u0017"+
		"\u0003\b\u0004\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u001a\u0001"+
		"\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u0014\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0001\u0000"+
		"\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0004\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0006\u0000"+
		"\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0005\u0000\u0000+\u0007"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0002\u0000\u0000-\t\u0001\u0000\u0000"+
		"\u0000\u0003\u0012\u001b ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}