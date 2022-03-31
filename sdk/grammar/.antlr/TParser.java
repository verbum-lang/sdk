// Generated from /home/user/projects/sdk/sdk/grammar/TParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Use=1, Var=2, Bool=3, End=4, Attr=5, TwoPoint=6, Separator=7, OpenArIndex=8, 
		CloseArIndex=9, OpenBlock=10, CloseBlock=11, OpenOp=12, CloseOp=13, ArithmeticOperator=14, 
		IncDecOperators=15, Identifier=16, IDPrefix=17, TypeSpec=18, String=19, 
		Integer=20, Float=21, Whitespace=22, Newline=23, Words=24, BlockComment=25, 
		LineComment=26;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveTokens = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_variableValue = 10, 
		RULE_indexArray = 11, RULE_indexArrayElements = 12, RULE_associativeArray = 13, 
		RULE_associativeArrayElements = 14, RULE_operationBlock = 15, RULE_operationElements = 16, 
		RULE_operationValue = 17, RULE_generalValue = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "variableValue", 
			"indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
			"operationBlock", "operationElements", "operationValue", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", null, "';'", "'='", "':'", "','", "'['", "']'", 
			"'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", "Integer", 
			"Float", "Whitespace", "Newline", "Words", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "TParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public FileContentContext fileContent() {
			return getRuleContext(FileContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			fileContent(0);
			setState(39);
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

	public static class FileContentContext extends ParserRuleContext {
		public FileContentContext fileContent() {
			return getRuleContext(FileContentContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileContent; }
	}

	public final FileContentContext fileContent() throws RecognitionException {
		return fileContent(0);
	}

	private FileContentContext fileContent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FileContentContext _localctx = new FileContentContext(_ctx, _parentState);
		FileContentContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_fileContent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FileContentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fileContent);
					setState(42);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(43);
					sentence();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class SentenceContext extends ParserRuleContext {
		public LiveTokensContext liveTokens() {
			return getRuleContext(LiveTokensContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				liveTokens();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				variable();
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

	public static class LiveTokensContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(TParser.Newline, 0); }
		public LiveTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liveTokens; }
	}

	public final LiveTokensContext liveTokens() throws RecognitionException {
		LiveTokensContext _localctx = new LiveTokensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liveTokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Newline);
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

	public static class UseContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(TParser.Use, 0); }
		public UseValueContext useValue() {
			return getRuleContext(UseValueContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Use);
			setState(57);
			useValue();
			setState(58);
			match(End);
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

	public static class UseValueContext extends ParserRuleContext {
		public UseStringContext useString() {
			return getRuleContext(UseStringContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public UseValueContext useValue() {
			return getRuleContext(UseValueContext.class,0);
		}
		public UseValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useValue; }
	}

	public final UseValueContext useValue() throws RecognitionException {
		UseValueContext _localctx = new UseValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useValue);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				useString();
				setState(62);
				match(Separator);
				setState(63);
				useValue();
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

	public static class UseStringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public UseStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useString; }
	}

	public final UseStringContext useString() throws RecognitionException {
		UseStringContext _localctx = new UseStringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(String);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Var);
			setState(70);
			variableMembers();
			setState(71);
			match(End);
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

	public static class VariableMembersContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public VariableMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMembers; }
	}

	public final VariableMembersContext variableMembers() throws RecognitionException {
		VariableMembersContext _localctx = new VariableMembersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableMembers);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				variableDefinition();
				setState(75);
				match(Separator);
				setState(76);
				variableMembers();
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDefinition);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Identifier);
				setState(81);
				match(Attr);
				setState(82);
				variableValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(Identifier);
				setState(84);
				match(TypeSpec);
				setState(85);
				match(Attr);
				setState(86);
				variableValue();
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

	public static class VariableValueContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			generalValue();
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

	public static class IndexArrayContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public IndexArrayElementsContext indexArrayElements() {
			return getRuleContext(IndexArrayElementsContext.class,0);
		}
		public IndexArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArray; }
	}

	public final IndexArrayContext indexArray() throws RecognitionException {
		IndexArrayContext _localctx = new IndexArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_indexArray);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(OpenArIndex);
				setState(92);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(OpenArIndex);
				setState(94);
				indexArrayElements();
				setState(95);
				match(CloseArIndex);
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

	public static class IndexArrayElementsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public IndexArrayElementsContext indexArrayElements() {
			return getRuleContext(IndexArrayElementsContext.class,0);
		}
		public IndexArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArrayElements; }
	}

	public final IndexArrayElementsContext indexArrayElements() throws RecognitionException {
		IndexArrayElementsContext _localctx = new IndexArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexArrayElements);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				generalValue();
				setState(101);
				match(Separator);
				setState(102);
				indexArrayElements();
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

	public static class AssociativeArrayContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public AssociativeArrayElementsContext associativeArrayElements() {
			return getRuleContext(AssociativeArrayElementsContext.class,0);
		}
		public AssociativeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArray; }
	}

	public final AssociativeArrayContext associativeArray() throws RecognitionException {
		AssociativeArrayContext _localctx = new AssociativeArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_associativeArray);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(OpenBlock);
				setState(107);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(OpenBlock);
				setState(109);
				associativeArrayElements();
				setState(110);
				match(CloseBlock);
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

	public static class AssociativeArrayElementsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public AssociativeArrayElementsContext associativeArrayElements() {
			return getRuleContext(AssociativeArrayElementsContext.class,0);
		}
		public AssociativeArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArrayElements; }
	}

	public final AssociativeArrayElementsContext associativeArrayElements() throws RecognitionException {
		AssociativeArrayElementsContext _localctx = new AssociativeArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_associativeArrayElements);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(Identifier);
				setState(115);
				match(TwoPoint);
				setState(116);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(Identifier);
				setState(118);
				match(TwoPoint);
				setState(119);
				generalValue();
				setState(120);
				match(Separator);
				setState(121);
				associativeArrayElements();
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

	public static class OperationBlockContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public OperationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationBlock; }
	}

	public final OperationBlockContext operationBlock() throws RecognitionException {
		OperationBlockContext _localctx = new OperationBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OpenOp);
			setState(126);
			operationElements();
			setState(127);
			match(CloseOp);
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

	public static class OperationElementsContext extends ParserRuleContext {
		public OperationValueContext operationValue() {
			return getRuleContext(OperationValueContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public OperationElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationElements; }
	}

	public final OperationElementsContext operationElements() throws RecognitionException {
		OperationElementsContext _localctx = new OperationElementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operationElements);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				operationValue();
				setState(131);
				operationElements();
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

	public static class OperationValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public OperationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationValue; }
	}

	public final OperationValueContext operationValue() throws RecognitionException {
		OperationValueContext _localctx = new OperationValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operationValue);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(Identifier);
				setState(137);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(Identifier);
				setState(139);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(Identifier);
				setState(141);
				match(TypeSpec);
				setState(142);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(Integer);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(Integer);
				setState(145);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(Integer);
				setState(147);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(Integer);
				setState(149);
				match(TypeSpec);
				setState(150);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(Float);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				match(Float);
				setState(153);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				match(Float);
				setState(155);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(156);
				match(Float);
				setState(157);
				match(TypeSpec);
				setState(158);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(159);
				operationBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(160);
				operationBlock();
				setState(161);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(163);
				operationBlock();
				setState(164);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(166);
				operationBlock();
				setState(167);
				match(TypeSpec);
				setState(168);
				match(ArithmeticOperator);
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

	public static class GeneralValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode Bool() { return getToken(TParser.Bool, 0); }
		public IndexArrayContext indexArray() {
			return getRuleContext(IndexArrayContext.class,0);
		}
		public AssociativeArrayContext associativeArray() {
			return getRuleContext(AssociativeArrayContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_generalValue);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Identifier);
				setState(174);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(Integer);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(Integer);
				setState(178);
				match(TypeSpec);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(Float);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(Float);
				setState(181);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(185);
				operationBlock();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return fileContent_sempred((FileContentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fileContent_sempred(FileContentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\3\4\3\4\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\7D\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13Z\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\rd\n\r\3\16\3\16\3\16\3\16\3\16\5\16k\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17s\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20~\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00ad\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bd\n\24\3\24\2\3\4\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00cf\2(\3\2\2\2\4+\3\2"+
		"\2\2\6\66\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20G\3\2"+
		"\2\2\22P\3\2\2\2\24Y\3\2\2\2\26[\3\2\2\2\30c\3\2\2\2\32j\3\2\2\2\34r\3"+
		"\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0087\3\2\2\2$\u00ac\3\2\2\2&\u00bc"+
		"\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+\60\b\3\1\2,-\f\4\2\2-/\5\6\4"+
		"\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60"+
		"\3\2\2\2\63\67\5\b\5\2\64\67\5\n\6\2\65\67\5\20\t\2\66\63\3\2\2\2\66\64"+
		"\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\7\31\2\29\t\3\2\2\2:;\7\3\2\2;<"+
		"\5\f\7\2<=\7\6\2\2=\13\3\2\2\2>D\5\16\b\2?@\5\16\b\2@A\7\t\2\2AB\5\f\7"+
		"\2BD\3\2\2\2C>\3\2\2\2C?\3\2\2\2D\r\3\2\2\2EF\7\25\2\2F\17\3\2\2\2GH\7"+
		"\4\2\2HI\5\22\n\2IJ\7\6\2\2J\21\3\2\2\2KQ\5\24\13\2LM\5\24\13\2MN\7\t"+
		"\2\2NO\5\22\n\2OQ\3\2\2\2PK\3\2\2\2PL\3\2\2\2Q\23\3\2\2\2RS\7\22\2\2S"+
		"T\7\7\2\2TZ\5\26\f\2UV\7\22\2\2VW\7\24\2\2WX\7\7\2\2XZ\5\26\f\2YR\3\2"+
		"\2\2YU\3\2\2\2Z\25\3\2\2\2[\\\5&\24\2\\\27\3\2\2\2]^\7\n\2\2^d\7\13\2"+
		"\2_`\7\n\2\2`a\5\32\16\2ab\7\13\2\2bd\3\2\2\2c]\3\2\2\2c_\3\2\2\2d\31"+
		"\3\2\2\2ek\5&\24\2fg\5&\24\2gh\7\t\2\2hi\5\32\16\2ik\3\2\2\2je\3\2\2\2"+
		"jf\3\2\2\2k\33\3\2\2\2lm\7\f\2\2ms\7\r\2\2no\7\f\2\2op\5\36\20\2pq\7\r"+
		"\2\2qs\3\2\2\2rl\3\2\2\2rn\3\2\2\2s\35\3\2\2\2tu\7\22\2\2uv\7\b\2\2v~"+
		"\5&\24\2wx\7\22\2\2xy\7\b\2\2yz\5&\24\2z{\7\t\2\2{|\5\36\20\2|~\3\2\2"+
		"\2}t\3\2\2\2}w\3\2\2\2~\37\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\5\""+
		"\22\2\u0081\u0082\7\17\2\2\u0082!\3\2\2\2\u0083\u0088\5$\23\2\u0084\u0085"+
		"\5$\23\2\u0085\u0086\5\"\22\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2"+
		"\u0087\u0084\3\2\2\2\u0088#\3\2\2\2\u0089\u00ad\7\22\2\2\u008a\u008b\7"+
		"\22\2\2\u008b\u00ad\7\20\2\2\u008c\u008d\7\22\2\2\u008d\u00ad\7\24\2\2"+
		"\u008e\u008f\7\22\2\2\u008f\u0090\7\24\2\2\u0090\u00ad\7\20\2\2\u0091"+
		"\u00ad\7\26\2\2\u0092\u0093\7\26\2\2\u0093\u00ad\7\20\2\2\u0094\u0095"+
		"\7\26\2\2\u0095\u00ad\7\24\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\24\2"+
		"\2\u0098\u00ad\7\20\2\2\u0099\u00ad\7\27\2\2\u009a\u009b\7\27\2\2\u009b"+
		"\u00ad\7\20\2\2\u009c\u009d\7\27\2\2\u009d\u00ad\7\24\2\2\u009e\u009f"+
		"\7\27\2\2\u009f\u00a0\7\24\2\2\u00a0\u00ad\7\20\2\2\u00a1\u00ad\5 \21"+
		"\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7\20\2\2\u00a4\u00ad\3\2\2\2\u00a5"+
		"\u00a6\5 \21\2\u00a6\u00a7\7\24\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\5"+
		" \21\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u0089\3\2\2\2\u00ac\u008a\3\2\2\2\u00ac\u008c\3\2\2\2\u00ac\u008e\3\2"+
		"\2\2\u00ac\u0091\3\2\2\2\u00ac\u0092\3\2\2\2\u00ac\u0094\3\2\2\2\u00ac"+
		"\u0096\3\2\2\2\u00ac\u0099\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac\u009c\3\2"+
		"\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad%\3\2\2\2\u00ae\u00bd\7\22\2\2"+
		"\u00af\u00b0\7\22\2\2\u00b0\u00bd\7\24\2\2\u00b1\u00bd\7\25\2\2\u00b2"+
		"\u00bd\7\26\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00bd\7\24\2\2\u00b5\u00bd"+
		"\7\27\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00bd\7\24\2\2\u00b8\u00bd\7\5\2"+
		"\2\u00b9\u00bd\5\30\r\2\u00ba\u00bd\5\34\17\2\u00bb\u00bd\5 \21\2\u00bc"+
		"\u00ae\3\2\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b2\3\2"+
		"\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\'\3\2\2\2\16\60\66CPYcjr}\u0087\u00ac\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}