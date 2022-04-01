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
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, End=7, Attr=8, Point=9, TwoPoint=10, 
		TwoTwoPoint=11, Separator=12, OpenArIndex=13, CloseArIndex=14, OpenBlock=15, 
		CloseBlock=16, OpenOp=17, CloseOp=18, ArithmeticOperator=19, AssignmentOperator=20, 
		Not=21, IncDecOperators=22, Identifier=23, IDPrefix=24, TypeSpec=25, String=26, 
		Integer=27, Float=28, Whitespace=29, Newline=30, Words=31, BlockComment=32, 
		LineComment=33;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_callingFunction = 19, 
		RULE_functionCall = 20, RULE_identifierB = 21, RULE_functionCallParam = 22, 
		RULE_functionCallParamElements = 23, RULE_conditionalExpression = 24, 
		RULE_conditionalBlockElements = 25, RULE_ifConditions = 26, RULE_elifConditions = 27, 
		RULE_elseConditions = 28, RULE_condBlockElementsLimited = 29, RULE_conditionalExpressionElements = 30, 
		RULE_conditionalExpElementsValue = 31, RULE_conditionExpBlock = 32, RULE_conditionalExpValue = 33, 
		RULE_loop = 34, RULE_loopExpression = 35, RULE_loopOneMembers = 36, RULE_loopTwoMembers = 37, 
		RULE_loopThreeMembers = 38, RULE_loopThreeMembersValues = 39, RULE_loopBlockElements = 40, 
		RULE_loopBlockElementsLimited = 41, RULE_generalValue = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalBlockElements", "ifConditions", "elifConditions", "elseConditions", 
			"condBlockElementsLimited", "conditionalExpressionElements", "conditionalExpElementsValue", 
			"conditionExpBlock", "conditionalExpValue", "loop", "loopExpression", 
			"loopOneMembers", "loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", 
			"loopBlockElements", "loopBlockElementsLimited", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "';'", "'='", 
			"'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
			"BlockComment", "LineComment"
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
			setState(86);
			fileContent(0);
			setState(87);
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
			setState(94);
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
					setState(90);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(91);
					sentence();
					}
					} 
				}
				setState(96);
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
		public LiveTokenContext liveToken() {
			return getRuleContext(LiveTokenContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				liveToken();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				callingFunction();
				}
				break;
			case If:
			case Elif:
			case Else:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				conditionalExpression();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				loop();
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

	public static class LiveTokenContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(TParser.Newline, 0); }
		public LiveTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liveToken; }
	}

	public final LiveTokenContext liveToken() throws RecognitionException {
		LiveTokenContext _localctx = new LiveTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liveToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
			setState(107);
			match(Use);
			setState(108);
			useValue();
			setState(109);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				useString();
				setState(113);
				match(Separator);
				setState(114);
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
			setState(118);
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
			setState(120);
			match(Var);
			setState(121);
			variableMembers();
			setState(122);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				variableDefinition();
				setState(126);
				match(Separator);
				setState(127);
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
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(Identifier);
				setState(132);
				match(Attr);
				setState(133);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(Identifier);
				setState(135);
				match(TypeSpec);
				setState(136);
				match(Attr);
				setState(137);
				generalValue();
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
		enterRule(_localctx, 20, RULE_indexArray);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(OpenArIndex);
				setState(141);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(OpenArIndex);
				setState(143);
				indexArrayElements();
				setState(144);
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
		enterRule(_localctx, 22, RULE_indexArrayElements);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				generalValue();
				setState(150);
				match(Separator);
				setState(151);
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
		enterRule(_localctx, 24, RULE_associativeArray);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(OpenBlock);
				setState(156);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(OpenBlock);
				setState(158);
				associativeArrayElements();
				setState(159);
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
		enterRule(_localctx, 26, RULE_associativeArrayElements);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(Identifier);
				setState(164);
				match(TwoPoint);
				setState(165);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(Identifier);
				setState(167);
				match(TwoPoint);
				setState(168);
				generalValue();
				setState(169);
				match(Separator);
				setState(170);
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
		enterRule(_localctx, 28, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OpenOp);
			setState(175);
			operationElements();
			setState(176);
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
		enterRule(_localctx, 30, RULE_operationElements);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				operationValue();
				setState(180);
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
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_operationValue);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(Identifier);
				setState(186);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(Identifier);
				setState(188);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(Identifier);
				setState(190);
				match(TypeSpec);
				setState(191);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				firstIncDec();
				setState(193);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				firstIncDec();
				setState(196);
				match(Identifier);
				setState(197);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				firstIncDec();
				setState(200);
				match(Identifier);
				setState(201);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				firstIncDec();
				setState(204);
				match(Identifier);
				setState(205);
				match(TypeSpec);
				setState(206);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				match(Identifier);
				setState(209);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				match(Identifier);
				setState(211);
				lastIncDec();
				setState(212);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(214);
				match(Identifier);
				setState(215);
				lastIncDec();
				setState(216);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				match(Identifier);
				setState(219);
				lastIncDec();
				setState(220);
				match(TypeSpec);
				setState(221);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(223);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(224);
				match(Integer);
				setState(225);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(226);
				match(Integer);
				setState(227);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(228);
				match(Integer);
				setState(229);
				match(TypeSpec);
				setState(230);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(231);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(232);
				match(Float);
				setState(233);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(234);
				match(Float);
				setState(235);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(236);
				match(Float);
				setState(237);
				match(TypeSpec);
				setState(238);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(239);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(240);
				functionCall();
				setState(241);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(243);
				functionCall();
				setState(244);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(246);
				functionCall();
				setState(247);
				match(TypeSpec);
				setState(248);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(250);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(251);
				operationBlock();
				setState(252);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(254);
				operationBlock();
				setState(255);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(257);
				operationBlock();
				setState(258);
				match(TypeSpec);
				setState(259);
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

	public static class FirstIncDecContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public FirstIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstIncDec; }
	}

	public final FirstIncDecContext firstIncDec() throws RecognitionException {
		FirstIncDecContext _localctx = new FirstIncDecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IncDecOperators);
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

	public static class LastIncDecContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public LastIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastIncDec; }
	}

	public final LastIncDecContext lastIncDec() throws RecognitionException {
		LastIncDecContext _localctx = new LastIncDecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IncDecOperators);
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

	public static class CallingFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public CallingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingFunction; }
	}

	public final CallingFunctionContext callingFunction() throws RecognitionException {
		CallingFunctionContext _localctx = new CallingFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			functionCall();
			setState(268);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(Identifier);
				setState(271);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(Identifier);
				setState(273);
				match(Point);
				setState(274);
				identifierB();
				setState(275);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(Identifier);
				setState(278);
				match(TwoTwoPoint);
				setState(279);
				identifierB();
				setState(280);
				functionCallParam();
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

	public static class IdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierB; }
	}

	public final IdentifierBContext identifierB() throws RecognitionException {
		IdentifierBContext _localctx = new IdentifierBContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Identifier);
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

	public static class FunctionCallParamContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallParamElementsContext functionCallParamElements() {
			return getRuleContext(FunctionCallParamElementsContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCallParam);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(OpenOp);
				setState(287);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(OpenOp);
				setState(289);
				functionCallParamElements();
				setState(290);
				match(CloseOp);
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

	public static class FunctionCallParamElementsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionCallParamElementsContext functionCallParamElements() {
			return getRuleContext(FunctionCallParamElementsContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public FunctionCallParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParamElements; }
	}

	public final FunctionCallParamElementsContext functionCallParamElements() throws RecognitionException {
		FunctionCallParamElementsContext _localctx = new FunctionCallParamElementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCallParamElements);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				generalValue();
				setState(296);
				match(Separator);
				setState(297);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				operationElements();
				setState(301);
				match(Separator);
				setState(302);
				functionCallParamElements();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public ElifConditionsContext elifConditions() {
			return getRuleContext(ElifConditionsContext.class,0);
		}
		public ElseConditionsContext elseConditions() {
			return getRuleContext(ElseConditionsContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalExpression);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				elseConditions();
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

	public static class ConditionalBlockElementsContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ConditionalBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElements; }
	}

	public final ConditionalBlockElementsContext conditionalBlockElements() throws RecognitionException {
		ConditionalBlockElementsContext _localctx = new ConditionalBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalBlockElements);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				conditionalExpression();
				setState(313);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				sentence();
				setState(317);
				conditionalBlockElements();
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

	public static class IfConditionsContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public IfConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditions; }
	}

	public final IfConditionsContext ifConditions() throws RecognitionException {
		IfConditionsContext _localctx = new IfConditionsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifConditions);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(If);
				setState(322);
				conditionalExpressionElements();
				setState(323);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(If);
				setState(326);
				conditionalExpressionElements();
				setState(327);
				match(OpenBlock);
				setState(328);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(If);
				setState(331);
				conditionalExpressionElements();
				setState(332);
				match(OpenBlock);
				setState(333);
				conditionalBlockElements();
				setState(334);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(If);
				setState(337);
				conditionalExpressionElements();
				setState(338);
				condBlockElementsLimited();
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

	public static class ElifConditionsContext extends ParserRuleContext {
		public TerminalNode Elif() { return getToken(TParser.Elif, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public ElifConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifConditions; }
	}

	public final ElifConditionsContext elifConditions() throws RecognitionException {
		ElifConditionsContext _localctx = new ElifConditionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elifConditions);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(Elif);
				setState(343);
				conditionalExpressionElements();
				setState(344);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(Elif);
				setState(347);
				conditionalExpressionElements();
				setState(348);
				match(OpenBlock);
				setState(349);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(Elif);
				setState(352);
				conditionalExpressionElements();
				setState(353);
				match(OpenBlock);
				setState(354);
				conditionalBlockElements();
				setState(355);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(Elif);
				setState(358);
				conditionalExpressionElements();
				setState(359);
				condBlockElementsLimited();
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

	public static class ElseConditionsContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TParser.Else, 0); }
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public ElseConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseConditions; }
	}

	public final ElseConditionsContext elseConditions() throws RecognitionException {
		ElseConditionsContext _localctx = new ElseConditionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseConditions);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(Else);
				setState(364);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(Else);
				setState(366);
				match(OpenBlock);
				setState(367);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(Else);
				setState(369);
				match(OpenBlock);
				setState(370);
				conditionalBlockElements();
				setState(371);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(Else);
				setState(374);
				condBlockElementsLimited();
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

	public static class CondBlockElementsLimitedContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public CondBlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBlockElementsLimited; }
	}

	public final CondBlockElementsLimitedContext condBlockElementsLimited() throws RecognitionException {
		CondBlockElementsLimitedContext _localctx = new CondBlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condBlockElementsLimited);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				ifConditions();
				setState(379);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				loop();
				setState(383);
				loopBlockElementsLimited();
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

	public static class ConditionalExpressionElementsContext extends ParserRuleContext {
		public ConditionalExpElementsValueContext conditionalExpElementsValue() {
			return getRuleContext(ConditionalExpElementsValueContext.class,0);
		}
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public ConditionExpBlockContext conditionExpBlock() {
			return getRuleContext(ConditionExpBlockContext.class,0);
		}
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public ConditionalExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionElements; }
	}

	public final ConditionalExpressionElementsContext conditionalExpressionElements() throws RecognitionException {
		ConditionalExpressionElementsContext _localctx = new ConditionalExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionalExpressionElements);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				conditionalExpElementsValue();
				setState(389);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				conditionExpBlock(0);
				setState(393);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				match(Not);
				setState(396);
				conditionalExpressionElements();
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

	public static class ConditionalExpElementsValueContext extends ParserRuleContext {
		public ConditionalExpValueContext conditionalExpValue() {
			return getRuleContext(ConditionalExpValueContext.class,0);
		}
		public ConditionalExpElementsValueContext conditionalExpElementsValue() {
			return getRuleContext(ConditionalExpElementsValueContext.class,0);
		}
		public ConditionalExpElementsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpElementsValue; }
	}

	public final ConditionalExpElementsValueContext conditionalExpElementsValue() throws RecognitionException {
		ConditionalExpElementsValueContext _localctx = new ConditionalExpElementsValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionalExpElementsValue);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				conditionalExpValue();
				setState(401);
				conditionalExpElementsValue();
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

	public static class ConditionExpBlockContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public ConditionExpBlockContext conditionExpBlock() {
			return getRuleContext(ConditionExpBlockContext.class,0);
		}
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public ConditionExpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlock; }
	}

	public final ConditionExpBlockContext conditionExpBlock() throws RecognitionException {
		return conditionExpBlock(0);
	}

	private ConditionExpBlockContext conditionExpBlock(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionExpBlockContext _localctx = new ConditionExpBlockContext(_ctx, _parentState);
		ConditionExpBlockContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			match(OpenOp);
			setState(407);
			conditionalExpressionElements();
			setState(408);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpBlock);
					setState(410);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(411);
					match(AssignmentOperator);
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ConditionalExpValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public ConditionalExpValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpValue; }
	}

	public final ConditionalExpValueContext conditionalExpValue() throws RecognitionException {
		ConditionalExpValueContext _localctx = new ConditionalExpValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalExpValue);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(Identifier);
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(Identifier);
				setState(421);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(Identifier);
				setState(423);
				match(TypeSpec);
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				firstIncDec();
				setState(426);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				firstIncDec();
				setState(429);
				match(Identifier);
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				firstIncDec();
				setState(433);
				match(Identifier);
				setState(434);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(436);
				firstIncDec();
				setState(437);
				match(Identifier);
				setState(438);
				match(TypeSpec);
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(441);
				match(Identifier);
				setState(442);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(443);
				match(Identifier);
				setState(444);
				lastIncDec();
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(447);
				match(Identifier);
				setState(448);
				lastIncDec();
				setState(449);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(451);
				match(Identifier);
				setState(452);
				lastIncDec();
				setState(453);
				match(TypeSpec);
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(456);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(457);
				match(Integer);
				setState(458);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(459);
				match(Integer);
				setState(460);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(461);
				match(Integer);
				setState(462);
				match(TypeSpec);
				setState(463);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(464);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(465);
				match(Float);
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(467);
				match(Float);
				setState(468);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(469);
				match(Float);
				setState(470);
				match(TypeSpec);
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(472);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(473);
				functionCall();
				setState(474);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(476);
				functionCall();
				setState(477);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(479);
				functionCall();
				setState(480);
				match(TypeSpec);
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(483);
				match(Identifier);
				setState(484);
				match(Attr);
				setState(485);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(486);
				match(Identifier);
				setState(487);
				match(Attr);
				setState(488);
				functionCall();
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(491);
				match(Identifier);
				setState(492);
				match(Attr);
				setState(493);
				functionCall();
				setState(494);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(496);
				match(Identifier);
				setState(497);
				match(Attr);
				setState(498);
				functionCall();
				setState(499);
				match(TypeSpec);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(502);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(503);
				operationBlock();
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(506);
				operationBlock();
				setState(507);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(509);
				operationBlock();
				setState(510);
				match(TypeSpec);
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==ArithmeticOperator || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_loop);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(For);
				setState(516);
				loopExpression();
				setState(517);
				match(OpenBlock);
				setState(518);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(For);
				setState(521);
				loopExpression();
				setState(522);
				match(OpenBlock);
				setState(523);
				loopBlockElements();
				setState(524);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(For);
				setState(527);
				loopExpression();
				setState(528);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(For);
				setState(531);
				loopExpression();
				setState(532);
				loopBlockElementsLimited();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public LoopOneMembersContext loopOneMembers() {
			return getRuleContext(LoopOneMembersContext.class,0);
		}
		public List<TerminalNode> End() { return getTokens(TParser.End); }
		public TerminalNode End(int i) {
			return getToken(TParser.End, i);
		}
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public LoopThreeMembersContext loopThreeMembers() {
			return getRuleContext(LoopThreeMembersContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loopExpression);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(OpenOp);
				setState(537);
				loopOneMembers();
				setState(538);
				match(End);
				setState(539);
				loopTwoMembers();
				setState(540);
				match(End);
				setState(541);
				loopThreeMembers();
				setState(542);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				loopOneMembers();
				setState(545);
				match(End);
				setState(546);
				loopTwoMembers();
				setState(547);
				match(End);
				setState(548);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(OpenOp);
				setState(552);
				match(CloseOp);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class LoopOneMembersContext extends ParserRuleContext {
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public LoopOneMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOneMembers; }
	}

	public final LoopOneMembersContext loopOneMembers() throws RecognitionException {
		LoopOneMembersContext _localctx = new LoopOneMembersContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loopOneMembers);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				variableMembers();
				}
				break;
			case End:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LoopTwoMembersContext extends ParserRuleContext {
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public LoopTwoMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopTwoMembers; }
	}

	public final LoopTwoMembersContext loopTwoMembers() throws RecognitionException {
		LoopTwoMembersContext _localctx = new LoopTwoMembersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_loopTwoMembers);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
			case Not:
			case IncDecOperators:
			case Identifier:
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				conditionalExpressionElements();
				}
				break;
			case End:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LoopThreeMembersContext extends ParserRuleContext {
		public LoopThreeMembersValuesContext loopThreeMembersValues() {
			return getRuleContext(LoopThreeMembersValuesContext.class,0);
		}
		public LoopThreeMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThreeMembers; }
	}

	public final LoopThreeMembersContext loopThreeMembers() throws RecognitionException {
		LoopThreeMembersContext _localctx = new LoopThreeMembersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loopThreeMembers);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				loopThreeMembersValues();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LoopThreeMembersValuesContext extends ParserRuleContext {
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public LoopThreeMembersValuesContext loopThreeMembersValues() {
			return getRuleContext(LoopThreeMembersValuesContext.class,0);
		}
		public LoopThreeMembersValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThreeMembersValues; }
	}

	public final LoopThreeMembersValuesContext loopThreeMembersValues() throws RecognitionException {
		LoopThreeMembersValuesContext _localctx = new LoopThreeMembersValuesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_loopThreeMembersValues);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				operationElements();
				setState(571);
				match(Separator);
				setState(572);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				operationBlock();
				setState(575);
				match(Separator);
				setState(576);
				loopThreeMembersValues();
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

	public static class LoopBlockElementsContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public LoopBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElements; }
	}

	public final LoopBlockElementsContext loopBlockElements() throws RecognitionException {
		LoopBlockElementsContext _localctx = new LoopBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_loopBlockElements);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				sentence();
				setState(582);
				loopBlockElements();
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

	public static class LoopBlockElementsLimitedContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopBlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElementsLimited; }
	}

	public final LoopBlockElementsLimitedContext loopBlockElementsLimited() throws RecognitionException {
		LoopBlockElementsLimitedContext _localctx = new LoopBlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_loopBlockElementsLimited);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				ifConditions();
				setState(588);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				loop();
				setState(592);
				loopBlockElementsLimited();
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
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public IndexArrayContext indexArray() {
			return getRuleContext(IndexArrayContext.class,0);
		}
		public AssociativeArrayContext associativeArray() {
			return getRuleContext(AssociativeArrayContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generalValue);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(Identifier);
				setState(598);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(Integer);
				setState(601);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(602);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				match(Float);
				setState(604);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(608);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(609);
				functionCall();
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
		case 32:
			return conditionExpBlock_sempred((ConditionExpBlockContext)_localctx, predIndex);
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
	private boolean conditionExpBlock_sempred(ConditionExpBlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0267\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4j\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7w\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0095"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00af"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u011d\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0127\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0133\n\31\3\32"+
		"\3\32\3\32\5\32\u0138\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0142\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0157\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u016c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u017a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0184\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0190\n \3!\3!\3!\3!\5!\u0196"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u019f\n\"\f\"\16\"\u01a2\13\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0204\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u0219\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u022d\n%\3&\3&\5&\u0231\n&\3\'\3\'\5\'\u0235\n\'\3(\3(\5(\u0239"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0245\n)\3*\3*\3*\3*\5*\u024b\n*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0255\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\5,\u0265\n,\3,\2\4\4B-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\3\3\2\25\26\2\u02bb\2X\3\2\2\2"+
		"\4[\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\nm\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20"+
		"z\3\2\2\2\22\u0083\3\2\2\2\24\u008c\3\2\2\2\26\u0094\3\2\2\2\30\u009b"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00ae\3\2\2\2\36\u00b0\3\2\2\2 \u00b8\3\2"+
		"\2\2\"\u0107\3\2\2\2$\u0109\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u011c"+
		"\3\2\2\2,\u011e\3\2\2\2.\u0126\3\2\2\2\60\u0132\3\2\2\2\62\u0137\3\2\2"+
		"\2\64\u0141\3\2\2\2\66\u0156\3\2\2\28\u016b\3\2\2\2:\u0179\3\2\2\2<\u0183"+
		"\3\2\2\2>\u018f\3\2\2\2@\u0195\3\2\2\2B\u0197\3\2\2\2D\u0203\3\2\2\2F"+
		"\u0218\3\2\2\2H\u022c\3\2\2\2J\u0230\3\2\2\2L\u0234\3\2\2\2N\u0238\3\2"+
		"\2\2P\u0244\3\2\2\2R\u024a\3\2\2\2T\u0254\3\2\2\2V\u0264\3\2\2\2XY\5\4"+
		"\3\2YZ\7\2\2\3Z\3\3\2\2\2[`\b\3\1\2\\]\f\4\2\2]_\5\6\4\2^\\\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2b`\3\2\2\2cj\5\b\5\2dj\5\n\6\2"+
		"ej\5\20\t\2fj\5(\25\2gj\5\62\32\2hj\5F$\2ic\3\2\2\2id\3\2\2\2ie\3\2\2"+
		"\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\7\3\2\2\2kl\7 \2\2l\t\3\2\2\2mn\7\3"+
		"\2\2no\5\f\7\2op\7\t\2\2p\13\3\2\2\2qw\5\16\b\2rs\5\16\b\2st\7\16\2\2"+
		"tu\5\f\7\2uw\3\2\2\2vq\3\2\2\2vr\3\2\2\2w\r\3\2\2\2xy\7\34\2\2y\17\3\2"+
		"\2\2z{\7\4\2\2{|\5\22\n\2|}\7\t\2\2}\21\3\2\2\2~\u0084\5\24\13\2\177\u0080"+
		"\5\24\13\2\u0080\u0081\7\16\2\2\u0081\u0082\5\22\n\2\u0082\u0084\3\2\2"+
		"\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\31"+
		"\2\2\u0086\u0087\7\n\2\2\u0087\u008d\5V,\2\u0088\u0089\7\31\2\2\u0089"+
		"\u008a\7\33\2\2\u008a\u008b\7\n\2\2\u008b\u008d\5V,\2\u008c\u0085\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f\7\17\2\2\u008f\u0095"+
		"\7\20\2\2\u0090\u0091\7\17\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\20\2"+
		"\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0090\3\2\2\2\u0095\27"+
		"\3\2\2\2\u0096\u009c\5V,\2\u0097\u0098\5V,\2\u0098\u0099\7\16\2\2\u0099"+
		"\u009a\5\30\r\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3"+
		"\2\2\2\u009c\31\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u00a4\7\22\2\2\u009f"+
		"\u00a0\7\21\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7\22\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00af\5V,\2\u00a8\u00a9\7\31"+
		"\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5V,\2\u00ab\u00ac\7\16\2\2\u00ac"+
		"\u00ad\5\34\17\2\u00ad\u00af\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3"+
		"\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5 \21\2\u00b2"+
		"\u00b3\7\24\2\2\u00b3\37\3\2\2\2\u00b4\u00b9\5\"\22\2\u00b5\u00b6\5\""+
		"\22\2\u00b6\u00b7\5 \21\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b9!\3\2\2\2\u00ba\u0108\7\31\2\2\u00bb\u00bc\7\31\2"+
		"\2\u00bc\u0108\7\25\2\2\u00bd\u00be\7\31\2\2\u00be\u0108\7\33\2\2\u00bf"+
		"\u00c0\7\31\2\2\u00c0\u00c1\7\33\2\2\u00c1\u0108\7\25\2\2\u00c2\u00c3"+
		"\5$\23\2\u00c3\u00c4\7\31\2\2\u00c4\u0108\3\2\2\2\u00c5\u00c6\5$\23\2"+
		"\u00c6\u00c7\7\31\2\2\u00c7\u00c8\7\25\2\2\u00c8\u0108\3\2\2\2\u00c9\u00ca"+
		"\5$\23\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\7\33\2\2\u00cc\u0108\3\2\2\2"+
		"\u00cd\u00ce\5$\23\2\u00ce\u00cf\7\31\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1"+
		"\7\25\2\2\u00d1\u0108\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\u0108\5&\24\2"+
		"\u00d4\u00d5\7\31\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7\25\2\2\u00d7\u0108"+
		"\3\2\2\2\u00d8\u00d9\7\31\2\2\u00d9\u00da\5&\24\2\u00da\u00db\7\33\2\2"+
		"\u00db\u0108\3\2\2\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\5&\24\2\u00de\u00df"+
		"\7\33\2\2\u00df\u00e0\7\25\2\2\u00e0\u0108\3\2\2\2\u00e1\u0108\7\35\2"+
		"\2\u00e2\u00e3\7\35\2\2\u00e3\u0108\7\25\2\2\u00e4\u00e5\7\35\2\2\u00e5"+
		"\u0108\7\33\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7\33\2\2\u00e8\u0108"+
		"\7\25\2\2\u00e9\u0108\7\36\2\2\u00ea\u00eb\7\36\2\2\u00eb\u0108\7\25\2"+
		"\2\u00ec\u00ed\7\36\2\2\u00ed\u0108\7\33\2\2\u00ee\u00ef\7\36\2\2\u00ef"+
		"\u00f0\7\33\2\2\u00f0\u0108\7\25\2\2\u00f1\u0108\5*\26\2\u00f2\u00f3\5"+
		"*\26\2\u00f3\u00f4\7\25\2\2\u00f4\u0108\3\2\2\2\u00f5\u00f6\5*\26\2\u00f6"+
		"\u00f7\7\33\2\2\u00f7\u0108\3\2\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\7"+
		"\33\2\2\u00fa\u00fb\7\25\2\2\u00fb\u0108\3\2\2\2\u00fc\u0108\5\36\20\2"+
		"\u00fd\u00fe\5\36\20\2\u00fe\u00ff\7\25\2\2\u00ff\u0108\3\2\2\2\u0100"+
		"\u0101\5\36\20\2\u0101\u0102\7\33\2\2\u0102\u0108\3\2\2\2\u0103\u0104"+
		"\5\36\20\2\u0104\u0105\7\33\2\2\u0105\u0106\7\25\2\2\u0106\u0108\3\2\2"+
		"\2\u0107\u00ba\3\2\2\2\u0107\u00bb\3\2\2\2\u0107\u00bd\3\2\2\2\u0107\u00bf"+
		"\3\2\2\2\u0107\u00c2\3\2\2\2\u0107\u00c5\3\2\2\2\u0107\u00c9\3\2\2\2\u0107"+
		"\u00cd\3\2\2\2\u0107\u00d2\3\2\2\2\u0107\u00d4\3\2\2\2\u0107\u00d8\3\2"+
		"\2\2\u0107\u00dc\3\2\2\2\u0107\u00e1\3\2\2\2\u0107\u00e2\3\2\2\2\u0107"+
		"\u00e4\3\2\2\2\u0107\u00e6\3\2\2\2\u0107\u00e9\3\2\2\2\u0107\u00ea\3\2"+
		"\2\2\u0107\u00ec\3\2\2\2\u0107\u00ee\3\2\2\2\u0107\u00f1\3\2\2\2\u0107"+
		"\u00f2\3\2\2\2\u0107\u00f5\3\2\2\2\u0107\u00f8\3\2\2\2\u0107\u00fc\3\2"+
		"\2\2\u0107\u00fd\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0103\3\2\2\2\u0108"+
		"#\3\2\2\2\u0109\u010a\7\30\2\2\u010a%\3\2\2\2\u010b\u010c\7\30\2\2\u010c"+
		"\'\3\2\2\2\u010d\u010e\5*\26\2\u010e\u010f\7\t\2\2\u010f)\3\2\2\2\u0110"+
		"\u0111\7\31\2\2\u0111\u011d\5.\30\2\u0112\u0113\7\31\2\2\u0113\u0114\7"+
		"\13\2\2\u0114\u0115\5,\27\2\u0115\u0116\5.\30\2\u0116\u011d\3\2\2\2\u0117"+
		"\u0118\7\31\2\2\u0118\u0119\7\r\2\2\u0119\u011a\5,\27\2\u011a\u011b\5"+
		".\30\2\u011b\u011d\3\2\2\2\u011c\u0110\3\2\2\2\u011c\u0112\3\2\2\2\u011c"+
		"\u0117\3\2\2\2\u011d+\3\2\2\2\u011e\u011f\7\31\2\2\u011f-\3\2\2\2\u0120"+
		"\u0121\7\23\2\2\u0121\u0127\7\24\2\2\u0122\u0123\7\23\2\2\u0123\u0124"+
		"\5\60\31\2\u0124\u0125\7\24\2\2\u0125\u0127\3\2\2\2\u0126\u0120\3\2\2"+
		"\2\u0126\u0122\3\2\2\2\u0127/\3\2\2\2\u0128\u0133\5V,\2\u0129\u012a\5"+
		"V,\2\u012a\u012b\7\16\2\2\u012b\u012c\5\60\31\2\u012c\u0133\3\2\2\2\u012d"+
		"\u0133\5 \21\2\u012e\u012f\5 \21\2\u012f\u0130\7\16\2\2\u0130\u0131\5"+
		"\60\31\2\u0131\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u0129\3\2\2\2\u0132"+
		"\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0133\61\3\2\2\2\u0134\u0138\5\66\34"+
		"\2\u0135\u0138\58\35\2\u0136\u0138\5:\36\2\u0137\u0134\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\63\3\2\2\2\u0139\u0142\5\62\32\2\u013a"+
		"\u013b\5\62\32\2\u013b\u013c\5\64\33\2\u013c\u0142\3\2\2\2\u013d\u0142"+
		"\5\6\4\2\u013e\u013f\5\6\4\2\u013f\u0140\5\64\33\2\u0140\u0142\3\2\2\2"+
		"\u0141\u0139\3\2\2\2\u0141\u013a\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e"+
		"\3\2\2\2\u0142\65\3\2\2\2\u0143\u0144\7\5\2\2\u0144\u0145\5> \2\u0145"+
		"\u0146\5(\25\2\u0146\u0157\3\2\2\2\u0147\u0148\7\5\2\2\u0148\u0149\5>"+
		" \2\u0149\u014a\7\21\2\2\u014a\u014b\7\22\2\2\u014b\u0157\3\2\2\2\u014c"+
		"\u014d\7\5\2\2\u014d\u014e\5> \2\u014e\u014f\7\21\2\2\u014f\u0150\5\64"+
		"\33\2\u0150\u0151\7\22\2\2\u0151\u0157\3\2\2\2\u0152\u0153\7\5\2\2\u0153"+
		"\u0154\5> \2\u0154\u0155\5<\37\2\u0155\u0157\3\2\2\2\u0156\u0143\3\2\2"+
		"\2\u0156\u0147\3\2\2\2\u0156\u014c\3\2\2\2\u0156\u0152\3\2\2\2\u0157\67"+
		"\3\2\2\2\u0158\u0159\7\6\2\2\u0159\u015a\5> \2\u015a\u015b\5(\25\2\u015b"+
		"\u016c\3\2\2\2\u015c\u015d\7\6\2\2\u015d\u015e\5> \2\u015e\u015f\7\21"+
		"\2\2\u015f\u0160\7\22\2\2\u0160\u016c\3\2\2\2\u0161\u0162\7\6\2\2\u0162"+
		"\u0163\5> \2\u0163\u0164\7\21\2\2\u0164\u0165\5\64\33\2\u0165\u0166\7"+
		"\22\2\2\u0166\u016c\3\2\2\2\u0167\u0168\7\6\2\2\u0168\u0169\5> \2\u0169"+
		"\u016a\5<\37\2\u016a\u016c\3\2\2\2\u016b\u0158\3\2\2\2\u016b\u015c\3\2"+
		"\2\2\u016b\u0161\3\2\2\2\u016b\u0167\3\2\2\2\u016c9\3\2\2\2\u016d\u016e"+
		"\7\7\2\2\u016e\u017a\5(\25\2\u016f\u0170\7\7\2\2\u0170\u0171\7\21\2\2"+
		"\u0171\u017a\7\22\2\2\u0172\u0173\7\7\2\2\u0173\u0174\7\21\2\2\u0174\u0175"+
		"\5\64\33\2\u0175\u0176\7\22\2\2\u0176\u017a\3\2\2\2\u0177\u0178\7\7\2"+
		"\2\u0178\u017a\5<\37\2\u0179\u016d\3\2\2\2\u0179\u016f\3\2\2\2\u0179\u0172"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a;\3\2\2\2\u017b\u0184\5\66\34\2\u017c"+
		"\u017d\5\66\34\2\u017d\u017e\5\64\33\2\u017e\u0184\3\2\2\2\u017f\u0184"+
		"\5F$\2\u0180\u0181\5F$\2\u0181\u0182\5T+\2\u0182\u0184\3\2\2\2\u0183\u017b"+
		"\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0184"+
		"=\3\2\2\2\u0185\u0190\5@!\2\u0186\u0187\5@!\2\u0187\u0188\5> \2\u0188"+
		"\u0190\3\2\2\2\u0189\u0190\5B\"\2\u018a\u018b\5B\"\2\u018b\u018c\5> \2"+
		"\u018c\u0190\3\2\2\2\u018d\u018e\7\27\2\2\u018e\u0190\5> \2\u018f\u0185"+
		"\3\2\2\2\u018f\u0186\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190?\3\2\2\2\u0191\u0196\5D#\2\u0192\u0193\5D#\2\u0193"+
		"\u0194\5@!\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2"+
		"\2\u0196A\3\2\2\2\u0197\u0198\b\"\1\2\u0198\u0199\7\23\2\2\u0199\u019a"+
		"\5> \2\u019a\u019b\7\24\2\2\u019b\u01a0\3\2\2\2\u019c\u019d\f\3\2\2\u019d"+
		"\u019f\7\26\2\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1C\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u0204"+
		"\7\31\2\2\u01a4\u01a5\7\31\2\2\u01a5\u0204\t\2\2\2\u01a6\u01a7\7\31\2"+
		"\2\u01a7\u0204\7\33\2\2\u01a8\u01a9\7\31\2\2\u01a9\u01aa\7\33\2\2\u01aa"+
		"\u0204\t\2\2\2\u01ab\u01ac\5$\23\2\u01ac\u01ad\7\31\2\2\u01ad\u0204\3"+
		"\2\2\2\u01ae\u01af\5$\23\2\u01af\u01b0\7\31\2\2\u01b0\u01b1\t\2\2\2\u01b1"+
		"\u0204\3\2\2\2\u01b2\u01b3\5$\23\2\u01b3\u01b4\7\31\2\2\u01b4\u01b5\7"+
		"\33\2\2\u01b5\u0204\3\2\2\2\u01b6\u01b7\5$\23\2\u01b7\u01b8\7\31\2\2\u01b8"+
		"\u01b9\7\33\2\2\u01b9\u01ba\t\2\2\2\u01ba\u0204\3\2\2\2\u01bb\u01bc\7"+
		"\31\2\2\u01bc\u0204\5&\24\2\u01bd\u01be\7\31\2\2\u01be\u01bf\5&\24\2\u01bf"+
		"\u01c0\t\2\2\2\u01c0\u0204\3\2\2\2\u01c1\u01c2\7\31\2\2\u01c2\u01c3\5"+
		"&\24\2\u01c3\u01c4\7\33\2\2\u01c4\u0204\3\2\2\2\u01c5\u01c6\7\31\2\2\u01c6"+
		"\u01c7\5&\24\2\u01c7\u01c8\7\33\2\2\u01c8\u01c9\t\2\2\2\u01c9\u0204\3"+
		"\2\2\2\u01ca\u0204\7\35\2\2\u01cb\u01cc\7\35\2\2\u01cc\u0204\t\2\2\2\u01cd"+
		"\u01ce\7\35\2\2\u01ce\u0204\7\33\2\2\u01cf\u01d0\7\35\2\2\u01d0\u01d1"+
		"\7\33\2\2\u01d1\u0204\t\2\2\2\u01d2\u0204\7\36\2\2\u01d3\u01d4\7\36\2"+
		"\2\u01d4\u0204\t\2\2\2\u01d5\u01d6\7\36\2\2\u01d6\u0204\7\33\2\2\u01d7"+
		"\u01d8\7\36\2\2\u01d8\u01d9\7\33\2\2\u01d9\u0204\t\2\2\2\u01da\u0204\5"+
		"*\26\2\u01db\u01dc\5*\26\2\u01dc\u01dd\t\2\2\2\u01dd\u0204\3\2\2\2\u01de"+
		"\u01df\5*\26\2\u01df\u01e0\7\33\2\2\u01e0\u0204\3\2\2\2\u01e1\u01e2\5"+
		"*\26\2\u01e2\u01e3\7\33\2\2\u01e3\u01e4\t\2\2\2\u01e4\u0204\3\2\2\2\u01e5"+
		"\u01e6\7\31\2\2\u01e6\u01e7\7\n\2\2\u01e7\u0204\5*\26\2\u01e8\u01e9\7"+
		"\31\2\2\u01e9\u01ea\7\n\2\2\u01ea\u01eb\5*\26\2\u01eb\u01ec\t\2\2\2\u01ec"+
		"\u0204\3\2\2\2\u01ed\u01ee\7\31\2\2\u01ee\u01ef\7\n\2\2\u01ef\u01f0\5"+
		"*\26\2\u01f0\u01f1\7\33\2\2\u01f1\u0204\3\2\2\2\u01f2\u01f3\7\31\2\2\u01f3"+
		"\u01f4\7\n\2\2\u01f4\u01f5\5*\26\2\u01f5\u01f6\7\33\2\2\u01f6\u01f7\t"+
		"\2\2\2\u01f7\u0204\3\2\2\2\u01f8\u0204\5\36\20\2\u01f9\u01fa\5\36\20\2"+
		"\u01fa\u01fb\t\2\2\2\u01fb\u0204\3\2\2\2\u01fc\u01fd\5\36\20\2\u01fd\u01fe"+
		"\7\33\2\2\u01fe\u0204\3\2\2\2\u01ff\u0200\5\36\20\2\u0200\u0201\7\33\2"+
		"\2\u0201\u0202\t\2\2\2\u0202\u0204\3\2\2\2\u0203\u01a3\3\2\2\2\u0203\u01a4"+
		"\3\2\2\2\u0203\u01a6\3\2\2\2\u0203\u01a8\3\2\2\2\u0203\u01ab\3\2\2\2\u0203"+
		"\u01ae\3\2\2\2\u0203\u01b2\3\2\2\2\u0203\u01b6\3\2\2\2\u0203\u01bb\3\2"+
		"\2\2\u0203\u01bd\3\2\2\2\u0203\u01c1\3\2\2\2\u0203\u01c5\3\2\2\2\u0203"+
		"\u01ca\3\2\2\2\u0203\u01cb\3\2\2\2\u0203\u01cd\3\2\2\2\u0203\u01cf\3\2"+
		"\2\2\u0203\u01d2\3\2\2\2\u0203\u01d3\3\2\2\2\u0203\u01d5\3\2\2\2\u0203"+
		"\u01d7\3\2\2\2\u0203\u01da\3\2\2\2\u0203\u01db\3\2\2\2\u0203\u01de\3\2"+
		"\2\2\u0203\u01e1\3\2\2\2\u0203\u01e5\3\2\2\2\u0203\u01e8\3\2\2\2\u0203"+
		"\u01ed\3\2\2\2\u0203\u01f2\3\2\2\2\u0203\u01f8\3\2\2\2\u0203\u01f9\3\2"+
		"\2\2\u0203\u01fc\3\2\2\2\u0203\u01ff\3\2\2\2\u0204E\3\2\2\2\u0205\u0206"+
		"\7\b\2\2\u0206\u0207\5H%\2\u0207\u0208\7\21\2\2\u0208\u0209\7\22\2\2\u0209"+
		"\u0219\3\2\2\2\u020a\u020b\7\b\2\2\u020b\u020c\5H%\2\u020c\u020d\7\21"+
		"\2\2\u020d\u020e\5R*\2\u020e\u020f\7\22\2\2\u020f\u0219\3\2\2\2\u0210"+
		"\u0211\7\b\2\2\u0211\u0212\5H%\2\u0212\u0213\5(\25\2\u0213\u0219\3\2\2"+
		"\2\u0214\u0215\7\b\2\2\u0215\u0216\5H%\2\u0216\u0217\5T+\2\u0217\u0219"+
		"\3\2\2\2\u0218\u0205\3\2\2\2\u0218\u020a\3\2\2\2\u0218\u0210\3\2\2\2\u0218"+
		"\u0214\3\2\2\2\u0219G\3\2\2\2\u021a\u021b\7\23\2\2\u021b\u021c\5J&\2\u021c"+
		"\u021d\7\t\2\2\u021d\u021e\5L\'\2\u021e\u021f\7\t\2\2\u021f\u0220\5N("+
		"\2\u0220\u0221\7\24\2\2\u0221\u022d\3\2\2\2\u0222\u0223\5J&\2\u0223\u0224"+
		"\7\t\2\2\u0224\u0225\5L\'\2\u0225\u0226\7\t\2\2\u0226\u0227\5N(\2\u0227"+
		"\u022d\3\2\2\2\u0228\u022d\5> \2\u0229\u022a\7\23\2\2\u022a\u022d\7\24"+
		"\2\2\u022b\u022d\3\2\2\2\u022c\u021a\3\2\2\2\u022c\u0222\3\2\2\2\u022c"+
		"\u0228\3\2\2\2\u022c\u0229\3\2\2\2\u022c\u022b\3\2\2\2\u022dI\3\2\2\2"+
		"\u022e\u0231\5\22\n\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f"+
		"\3\2\2\2\u0231K\3\2\2\2\u0232\u0235\5> \2\u0233\u0235\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0233\3\2\2\2\u0235M\3\2\2\2\u0236\u0239\5P)\2\u0237\u0239"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239O\3\2\2\2\u023a"+
		"\u0245\5 \21\2\u023b\u0245\5\36\20\2\u023c\u023d\5 \21\2\u023d\u023e\7"+
		"\16\2\2\u023e\u023f\5P)\2\u023f\u0245\3\2\2\2\u0240\u0241\5\36\20\2\u0241"+
		"\u0242\7\16\2\2\u0242\u0243\5P)\2\u0243\u0245\3\2\2\2\u0244\u023a\3\2"+
		"\2\2\u0244\u023b\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u0240\3\2\2\2\u0245"+
		"Q\3\2\2\2\u0246\u024b\5\6\4\2\u0247\u0248\5\6\4\2\u0248\u0249\5R*\2\u0249"+
		"\u024b\3\2\2\2\u024a\u0246\3\2\2\2\u024a\u0247\3\2\2\2\u024bS\3\2\2\2"+
		"\u024c\u0255\5\66\34\2\u024d\u024e\5\66\34\2\u024e\u024f\5T+\2\u024f\u0255"+
		"\3\2\2\2\u0250\u0255\5F$\2\u0251\u0252\5F$\2\u0252\u0253\5T+\2\u0253\u0255"+
		"\3\2\2\2\u0254\u024c\3\2\2\2\u0254\u024d\3\2\2\2\u0254\u0250\3\2\2\2\u0254"+
		"\u0251\3\2\2\2\u0255U\3\2\2\2\u0256\u0265\7\31\2\2\u0257\u0258\7\31\2"+
		"\2\u0258\u0265\7\33\2\2\u0259\u0265\7\35\2\2\u025a\u025b\7\35\2\2\u025b"+
		"\u0265\7\33\2\2\u025c\u0265\7\36\2\2\u025d\u025e\7\36\2\2\u025e\u0265"+
		"\7\33\2\2\u025f\u0265\7\34\2\2\u0260\u0265\5\26\f\2\u0261\u0265\5\32\16"+
		"\2\u0262\u0265\5\36\20\2\u0263\u0265\5*\26\2\u0264\u0256\3\2\2\2\u0264"+
		"\u0257\3\2\2\2\u0264\u0259\3\2\2\2\u0264\u025a\3\2\2\2\u0264\u025c\3\2"+
		"\2\2\u0264\u025d\3\2\2\2\u0264\u025f\3\2\2\2\u0264\u0260\3\2\2\2\u0264"+
		"\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265W\3\2\2\2"+
		"#`iv\u0083\u008c\u0094\u009b\u00a3\u00ae\u00b8\u0107\u011c\u0126\u0132"+
		"\u0137\u0141\u0156\u016b\u0179\u0183\u018f\u0195\u01a0\u0203\u0218\u022c"+
		"\u0230\u0234\u0238\u0244\u024a\u0254\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}