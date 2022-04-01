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
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, End=8, Attr=9, Point=10, 
		TwoPoint=11, TwoTwoPoint=12, Separator=13, OpenArIndex=14, CloseArIndex=15, 
		OpenBlock=16, CloseBlock=17, OpenOp=18, CloseOp=19, ArithmeticOperator=20, 
		AssignmentOperator=21, Not=22, IncDecOperators=23, Identifier=24, IDPrefix=25, 
		TypeSpec=26, String=27, Integer=28, Float=29, Whitespace=30, Newline=31, 
		Words=32, BlockComment=33, LineComment=34;
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
		RULE_loopBlockElementsLimited = 41, RULE_ret = 42, RULE_retValues = 43, 
		RULE_generalValue = 44;
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
			"loopBlockElements", "loopBlockElementsLimited", "ret", "retValues", 
			"generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "End", "Attr", 
			"Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
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
			setState(90);
			fileContent(0);
			setState(91);
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
			setState(98);
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
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95);
					sentence();
					}
					} 
				}
				setState(100);
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
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				liveToken();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				callingFunction();
				}
				break;
			case If:
			case Elif:
			case Else:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				conditionalExpression();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				loop();
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				ret();
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
			setState(110);
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
			setState(112);
			match(Use);
			setState(113);
			useValue();
			setState(114);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				useString();
				setState(118);
				match(Separator);
				setState(119);
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
			setState(123);
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
			setState(125);
			match(Var);
			setState(126);
			variableMembers();
			setState(127);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				variableDefinition();
				setState(131);
				match(Separator);
				setState(132);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Identifier);
				setState(137);
				match(Attr);
				setState(138);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(Identifier);
				setState(140);
				match(TypeSpec);
				setState(141);
				match(Attr);
				setState(142);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(OpenArIndex);
				setState(146);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(OpenArIndex);
				setState(148);
				indexArrayElements();
				setState(149);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				generalValue();
				setState(155);
				match(Separator);
				setState(156);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(OpenBlock);
				setState(161);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(OpenBlock);
				setState(163);
				associativeArrayElements();
				setState(164);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Identifier);
				setState(169);
				match(TwoPoint);
				setState(170);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(Identifier);
				setState(172);
				match(TwoPoint);
				setState(173);
				generalValue();
				setState(174);
				match(Separator);
				setState(175);
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
			setState(179);
			match(OpenOp);
			setState(180);
			operationElements();
			setState(181);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				operationValue();
				setState(185);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(Identifier);
				setState(193);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(Identifier);
				setState(195);
				match(TypeSpec);
				setState(196);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				firstIncDec();
				setState(198);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				firstIncDec();
				setState(201);
				match(Identifier);
				setState(202);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				firstIncDec();
				setState(205);
				match(Identifier);
				setState(206);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				firstIncDec();
				setState(209);
				match(Identifier);
				setState(210);
				match(TypeSpec);
				setState(211);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				match(Identifier);
				setState(214);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(215);
				match(Identifier);
				setState(216);
				lastIncDec();
				setState(217);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				match(Identifier);
				setState(220);
				lastIncDec();
				setState(221);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(223);
				match(Identifier);
				setState(224);
				lastIncDec();
				setState(225);
				match(TypeSpec);
				setState(226);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				match(Integer);
				setState(230);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(231);
				match(Integer);
				setState(232);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(233);
				match(Integer);
				setState(234);
				match(TypeSpec);
				setState(235);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(236);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(237);
				match(Float);
				setState(238);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(239);
				match(Float);
				setState(240);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(241);
				match(Float);
				setState(242);
				match(TypeSpec);
				setState(243);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(244);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(245);
				functionCall();
				setState(246);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(248);
				functionCall();
				setState(249);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(251);
				functionCall();
				setState(252);
				match(TypeSpec);
				setState(253);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(255);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(256);
				operationBlock();
				setState(257);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(259);
				operationBlock();
				setState(260);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(262);
				operationBlock();
				setState(263);
				match(TypeSpec);
				setState(264);
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
			setState(268);
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
			setState(270);
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
			setState(272);
			functionCall();
			setState(273);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(Identifier);
				setState(276);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Identifier);
				setState(278);
				match(Point);
				setState(279);
				identifierB();
				setState(280);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(Identifier);
				setState(283);
				match(TwoTwoPoint);
				setState(284);
				identifierB();
				setState(285);
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
			setState(289);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(OpenOp);
				setState(292);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(OpenOp);
				setState(294);
				functionCallParamElements();
				setState(295);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				generalValue();
				setState(301);
				match(Separator);
				setState(302);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				operationElements();
				setState(306);
				match(Separator);
				setState(307);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				conditionalExpression();
				setState(318);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				sentence();
				setState(322);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(If);
				setState(327);
				conditionalExpressionElements();
				setState(328);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(If);
				setState(331);
				conditionalExpressionElements();
				setState(332);
				match(OpenBlock);
				setState(333);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(If);
				setState(336);
				conditionalExpressionElements();
				setState(337);
				match(OpenBlock);
				setState(338);
				conditionalBlockElements();
				setState(339);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				match(If);
				setState(342);
				conditionalExpressionElements();
				setState(343);
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
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(Elif);
				setState(348);
				conditionalExpressionElements();
				setState(349);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(Elif);
				setState(352);
				conditionalExpressionElements();
				setState(353);
				match(OpenBlock);
				setState(354);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(Elif);
				setState(357);
				conditionalExpressionElements();
				setState(358);
				match(OpenBlock);
				setState(359);
				conditionalBlockElements();
				setState(360);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(Elif);
				setState(363);
				conditionalExpressionElements();
				setState(364);
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(Else);
				setState(369);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(Else);
				setState(371);
				match(OpenBlock);
				setState(372);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(Else);
				setState(374);
				match(OpenBlock);
				setState(375);
				conditionalBlockElements();
				setState(376);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(Else);
				setState(379);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				ifConditions();
				setState(384);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				loop();
				setState(388);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				conditionalExpElementsValue();
				setState(394);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				conditionExpBlock(0);
				setState(398);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				match(Not);
				setState(401);
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				conditionalExpValue();
				setState(406);
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
			setState(411);
			match(OpenOp);
			setState(412);
			conditionalExpressionElements();
			setState(413);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
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
					setState(415);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(416);
					match(AssignmentOperator);
					}
					} 
				}
				setState(421);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				match(Identifier);
				setState(426);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(Identifier);
				setState(428);
				match(TypeSpec);
				setState(429);
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
				setState(430);
				firstIncDec();
				setState(431);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				firstIncDec();
				setState(434);
				match(Identifier);
				setState(435);
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
				setState(437);
				firstIncDec();
				setState(438);
				match(Identifier);
				setState(439);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441);
				firstIncDec();
				setState(442);
				match(Identifier);
				setState(443);
				match(TypeSpec);
				setState(444);
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
				setState(446);
				match(Identifier);
				setState(447);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(448);
				match(Identifier);
				setState(449);
				lastIncDec();
				setState(450);
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
				setState(452);
				match(Identifier);
				setState(453);
				lastIncDec();
				setState(454);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(456);
				match(Identifier);
				setState(457);
				lastIncDec();
				setState(458);
				match(TypeSpec);
				setState(459);
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
				setState(461);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(462);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(464);
				match(Integer);
				setState(465);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(466);
				match(Integer);
				setState(467);
				match(TypeSpec);
				setState(468);
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
				setState(469);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(470);
				match(Float);
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(472);
				match(Float);
				setState(473);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(474);
				match(Float);
				setState(475);
				match(TypeSpec);
				setState(476);
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
				setState(477);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(478);
				functionCall();
				setState(479);
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
				setState(481);
				functionCall();
				setState(482);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(484);
				functionCall();
				setState(485);
				match(TypeSpec);
				setState(486);
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
				setState(488);
				match(Identifier);
				setState(489);
				match(Attr);
				setState(490);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(491);
				match(Identifier);
				setState(492);
				match(Attr);
				setState(493);
				functionCall();
				setState(494);
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
				setState(496);
				match(Identifier);
				setState(497);
				match(Attr);
				setState(498);
				functionCall();
				setState(499);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(501);
				match(Identifier);
				setState(502);
				match(Attr);
				setState(503);
				functionCall();
				setState(504);
				match(TypeSpec);
				setState(505);
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
				setState(507);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(508);
				operationBlock();
				setState(509);
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
				setState(511);
				operationBlock();
				setState(512);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(514);
				operationBlock();
				setState(515);
				match(TypeSpec);
				setState(516);
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
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(For);
				setState(521);
				loopExpression();
				setState(522);
				match(OpenBlock);
				setState(523);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(For);
				setState(526);
				loopExpression();
				setState(527);
				match(OpenBlock);
				setState(528);
				loopBlockElements();
				setState(529);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(For);
				setState(532);
				loopExpression();
				setState(533);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(For);
				setState(536);
				loopExpression();
				setState(537);
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
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(OpenOp);
				setState(542);
				loopOneMembers();
				setState(543);
				match(End);
				setState(544);
				loopTwoMembers();
				setState(545);
				match(End);
				setState(546);
				loopThreeMembers();
				setState(547);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				loopOneMembers();
				setState(550);
				match(End);
				setState(551);
				loopTwoMembers();
				setState(552);
				match(End);
				setState(553);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				match(OpenOp);
				setState(557);
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
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
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
			setState(567);
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
				setState(565);
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
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				operationElements();
				setState(576);
				match(Separator);
				setState(577);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				operationBlock();
				setState(580);
				match(Separator);
				setState(581);
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
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				sentence();
				setState(587);
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
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				ifConditions();
				setState(593);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				loop();
				setState(597);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode Ret() { return getToken(TParser.Ret, 0); }
		public RetValuesContext retValues() {
			return getRuleContext(RetValuesContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(Ret);
			setState(602);
			retValues();
			setState(603);
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

	public static class RetValuesContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public RetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retValues; }
	}

	public final RetValuesContext retValues() throws RecognitionException {
		RetValuesContext _localctx = new RetValuesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_retValues);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
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
		enterRule(_localctx, 88, RULE_generalValue);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(Identifier);
				setState(612);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(Integer);
				setState(615);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(617);
				match(Float);
				setState(618);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(619);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(620);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(621);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(622);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(623);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0275\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7|\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0089"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00be\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0122\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u012c\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0138\n\31\3\32\3\32\3\32\5\32\u013d\n\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0147\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015c\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0171\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u017f\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0189\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0195"+
		"\n \3!\3!\3!\3!\5!\u019b\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01a4\n\""+
		"\f\"\16\"\u01a7\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0209\n#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u021e\n$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0232\n%\3&\3&\5&\u0236\n&\3\'\3\'\5\'"+
		"\u023a\n\'\3(\3(\5(\u023e\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u024a\n"+
		")\3*\3*\3*\3*\5*\u0250\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u025a\n+\3,\3,\3"+
		",\3,\3-\3-\3-\5-\u0263\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u0273\n.\3.\2\4\4B/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\2\3\3\2\26\27\2\u02ca\2\\\3\2\2\2\4_\3"+
		"\2\2\2\6n\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\177"+
		"\3\2\2\2\22\u0088\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3\2\2\2\30\u00a0\3"+
		"\2\2\2\32\u00a8\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2 \u00bd\3\2\2"+
		"\2\"\u010c\3\2\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u0112\3\2\2\2*\u0121"+
		"\3\2\2\2,\u0123\3\2\2\2.\u012b\3\2\2\2\60\u0137\3\2\2\2\62\u013c\3\2\2"+
		"\2\64\u0146\3\2\2\2\66\u015b\3\2\2\28\u0170\3\2\2\2:\u017e\3\2\2\2<\u0188"+
		"\3\2\2\2>\u0194\3\2\2\2@\u019a\3\2\2\2B\u019c\3\2\2\2D\u0208\3\2\2\2F"+
		"\u021d\3\2\2\2H\u0231\3\2\2\2J\u0235\3\2\2\2L\u0239\3\2\2\2N\u023d\3\2"+
		"\2\2P\u0249\3\2\2\2R\u024f\3\2\2\2T\u0259\3\2\2\2V\u025b\3\2\2\2X\u0262"+
		"\3\2\2\2Z\u0272\3\2\2\2\\]\5\4\3\2]^\7\2\2\3^\3\3\2\2\2_d\b\3\1\2`a\f"+
		"\4\2\2ac\5\6\4\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\5\3\2\2\2fd"+
		"\3\2\2\2go\5\b\5\2ho\5\n\6\2io\5\20\t\2jo\5(\25\2ko\5\62\32\2lo\5F$\2"+
		"mo\5V,\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2n"+
		"m\3\2\2\2o\7\3\2\2\2pq\7!\2\2q\t\3\2\2\2rs\7\3\2\2st\5\f\7\2tu\7\n\2\2"+
		"u\13\3\2\2\2v|\5\16\b\2wx\5\16\b\2xy\7\17\2\2yz\5\f\7\2z|\3\2\2\2{v\3"+
		"\2\2\2{w\3\2\2\2|\r\3\2\2\2}~\7\35\2\2~\17\3\2\2\2\177\u0080\7\4\2\2\u0080"+
		"\u0081\5\22\n\2\u0081\u0082\7\n\2\2\u0082\21\3\2\2\2\u0083\u0089\5\24"+
		"\13\2\u0084\u0085\5\24\13\2\u0085\u0086\7\17\2\2\u0086\u0087\5\22\n\2"+
		"\u0087\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0089\23"+
		"\3\2\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7\13\2\2\u008c\u0092\5Z.\2\u008d"+
		"\u008e\7\32\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7\13\2\2\u0090\u0092"+
		"\5Z.\2\u0091\u008a\3\2\2\2\u0091\u008d\3\2\2\2\u0092\25\3\2\2\2\u0093"+
		"\u0094\7\20\2\2\u0094\u009a\7\21\2\2\u0095\u0096\7\20\2\2\u0096\u0097"+
		"\5\30\r\2\u0097\u0098\7\21\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2"+
		"\u0099\u0095\3\2\2\2\u009a\27\3\2\2\2\u009b\u00a1\5Z.\2\u009c\u009d\5"+
		"Z.\2\u009d\u009e\7\17\2\2\u009e\u009f\5\30\r\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\22\2"+
		"\2\u00a3\u00a9\7\23\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\34\17\2\u00a6"+
		"\u00a7\7\23\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a4\3"+
		"\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\7\r\2\2\u00ac"+
		"\u00b4\5Z.\2\u00ad\u00ae\7\32\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\5Z."+
		"\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\24\2"+
		"\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\25\2\2\u00b8\37\3\2\2\2\u00b9\u00be"+
		"\5\"\22\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\5 \21\2\u00bc\u00be\3\2\2\2"+
		"\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be!\3\2\2\2\u00bf\u010d\7"+
		"\32\2\2\u00c0\u00c1\7\32\2\2\u00c1\u010d\7\26\2\2\u00c2\u00c3\7\32\2\2"+
		"\u00c3\u010d\7\34\2\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6\7\34\2\2\u00c6"+
		"\u010d\7\26\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7\32\2\2\u00c9\u010d\3"+
		"\2\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\7\26\2\2\u00cd"+
		"\u010d\3\2\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\7\32\2\2\u00d0\u00d1\7"+
		"\34\2\2\u00d1\u010d\3\2\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\32\2\2\u00d4"+
		"\u00d5\7\34\2\2\u00d5\u00d6\7\26\2\2\u00d6\u010d\3\2\2\2\u00d7\u00d8\7"+
		"\32\2\2\u00d8\u010d\5&\24\2\u00d9\u00da\7\32\2\2\u00da\u00db\5&\24\2\u00db"+
		"\u00dc\7\26\2\2\u00dc\u010d\3\2\2\2\u00dd\u00de\7\32\2\2\u00de\u00df\5"+
		"&\24\2\u00df\u00e0\7\34\2\2\u00e0\u010d\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2"+
		"\u00e3\5&\24\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5\7\26\2\2\u00e5\u010d\3"+
		"\2\2\2\u00e6\u010d\7\36\2\2\u00e7\u00e8\7\36\2\2\u00e8\u010d\7\26\2\2"+
		"\u00e9\u00ea\7\36\2\2\u00ea\u010d\7\34\2\2\u00eb\u00ec\7\36\2\2\u00ec"+
		"\u00ed\7\34\2\2\u00ed\u010d\7\26\2\2\u00ee\u010d\7\37\2\2\u00ef\u00f0"+
		"\7\37\2\2\u00f0\u010d\7\26\2\2\u00f1\u00f2\7\37\2\2\u00f2\u010d\7\34\2"+
		"\2\u00f3\u00f4\7\37\2\2\u00f4\u00f5\7\34\2\2\u00f5\u010d\7\26\2\2\u00f6"+
		"\u010d\5*\26\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7\26\2\2\u00f9\u010d\3"+
		"\2\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc\7\34\2\2\u00fc\u010d\3\2\2\2\u00fd"+
		"\u00fe\5*\26\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\7\26\2\2\u0100\u010d\3"+
		"\2\2\2\u0101\u010d\5\36\20\2\u0102\u0103\5\36\20\2\u0103\u0104\7\26\2"+
		"\2\u0104\u010d\3\2\2\2\u0105\u0106\5\36\20\2\u0106\u0107\7\34\2\2\u0107"+
		"\u010d\3\2\2\2\u0108\u0109\5\36\20\2\u0109\u010a\7\34\2\2\u010a\u010b"+
		"\7\26\2\2\u010b\u010d\3\2\2\2\u010c\u00bf\3\2\2\2\u010c\u00c0\3\2\2\2"+
		"\u010c\u00c2\3\2\2\2\u010c\u00c4\3\2\2\2\u010c\u00c7\3\2\2\2\u010c\u00ca"+
		"\3\2\2\2\u010c\u00ce\3\2\2\2\u010c\u00d2\3\2\2\2\u010c\u00d7\3\2\2\2\u010c"+
		"\u00d9\3\2\2\2\u010c\u00dd\3\2\2\2\u010c\u00e1\3\2\2\2\u010c\u00e6\3\2"+
		"\2\2\u010c\u00e7\3\2\2\2\u010c\u00e9\3\2\2\2\u010c\u00eb\3\2\2\2\u010c"+
		"\u00ee\3\2\2\2\u010c\u00ef\3\2\2\2\u010c\u00f1\3\2\2\2\u010c\u00f3\3\2"+
		"\2\2\u010c\u00f6\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00fa\3\2\2\2\u010c"+
		"\u00fd\3\2\2\2\u010c\u0101\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0105\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010d#\3\2\2\2\u010e\u010f\7\31\2\2\u010f%\3"+
		"\2\2\2\u0110\u0111\7\31\2\2\u0111\'\3\2\2\2\u0112\u0113\5*\26\2\u0113"+
		"\u0114\7\n\2\2\u0114)\3\2\2\2\u0115\u0116\7\32\2\2\u0116\u0122\5.\30\2"+
		"\u0117\u0118\7\32\2\2\u0118\u0119\7\f\2\2\u0119\u011a\5,\27\2\u011a\u011b"+
		"\5.\30\2\u011b\u0122\3\2\2\2\u011c\u011d\7\32\2\2\u011d\u011e\7\16\2\2"+
		"\u011e\u011f\5,\27\2\u011f\u0120\5.\30\2\u0120\u0122\3\2\2\2\u0121\u0115"+
		"\3\2\2\2\u0121\u0117\3\2\2\2\u0121\u011c\3\2\2\2\u0122+\3\2\2\2\u0123"+
		"\u0124\7\32\2\2\u0124-\3\2\2\2\u0125\u0126\7\24\2\2\u0126\u012c\7\25\2"+
		"\2\u0127\u0128\7\24\2\2\u0128\u0129\5\60\31\2\u0129\u012a\7\25\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012c/\3\2\2\2"+
		"\u012d\u0138\5Z.\2\u012e\u012f\5Z.\2\u012f\u0130\7\17\2\2\u0130\u0131"+
		"\5\60\31\2\u0131\u0138\3\2\2\2\u0132\u0138\5 \21\2\u0133\u0134\5 \21\2"+
		"\u0134\u0135\7\17\2\2\u0135\u0136\5\60\31\2\u0136\u0138\3\2\2\2\u0137"+
		"\u012d\3\2\2\2\u0137\u012e\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2"+
		"\2\2\u0138\61\3\2\2\2\u0139\u013d\5\66\34\2\u013a\u013d\58\35\2\u013b"+
		"\u013d\5:\36\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\63\3\2\2\2\u013e\u0147\5\62\32\2\u013f\u0140\5\62\32\2\u0140"+
		"\u0141\5\64\33\2\u0141\u0147\3\2\2\2\u0142\u0147\5\6\4\2\u0143\u0144\5"+
		"\6\4\2\u0144\u0145\5\64\33\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146"+
		"\u013f\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0147\65\3\2\2"+
		"\2\u0148\u0149\7\5\2\2\u0149\u014a\5> \2\u014a\u014b\5(\25\2\u014b\u015c"+
		"\3\2\2\2\u014c\u014d\7\5\2\2\u014d\u014e\5> \2\u014e\u014f\7\22\2\2\u014f"+
		"\u0150\7\23\2\2\u0150\u015c\3\2\2\2\u0151\u0152\7\5\2\2\u0152\u0153\5"+
		"> \2\u0153\u0154\7\22\2\2\u0154\u0155\5\64\33\2\u0155\u0156\7\23\2\2\u0156"+
		"\u015c\3\2\2\2\u0157\u0158\7\5\2\2\u0158\u0159\5> \2\u0159\u015a\5<\37"+
		"\2\u015a\u015c\3\2\2\2\u015b\u0148\3\2\2\2\u015b\u014c\3\2\2\2\u015b\u0151"+
		"\3\2\2\2\u015b\u0157\3\2\2\2\u015c\67\3\2\2\2\u015d\u015e\7\6\2\2\u015e"+
		"\u015f\5> \2\u015f\u0160\5(\25\2\u0160\u0171\3\2\2\2\u0161\u0162\7\6\2"+
		"\2\u0162\u0163\5> \2\u0163\u0164\7\22\2\2\u0164\u0165\7\23\2\2\u0165\u0171"+
		"\3\2\2\2\u0166\u0167\7\6\2\2\u0167\u0168\5> \2\u0168\u0169\7\22\2\2\u0169"+
		"\u016a\5\64\33\2\u016a\u016b\7\23\2\2\u016b\u0171\3\2\2\2\u016c\u016d"+
		"\7\6\2\2\u016d\u016e\5> \2\u016e\u016f\5<\37\2\u016f\u0171\3\2\2\2\u0170"+
		"\u015d\3\2\2\2\u0170\u0161\3\2\2\2\u0170\u0166\3\2\2\2\u0170\u016c\3\2"+
		"\2\2\u01719\3\2\2\2\u0172\u0173\7\7\2\2\u0173\u017f\5(\25\2\u0174\u0175"+
		"\7\7\2\2\u0175\u0176\7\22\2\2\u0176\u017f\7\23\2\2\u0177\u0178\7\7\2\2"+
		"\u0178\u0179\7\22\2\2\u0179\u017a\5\64\33\2\u017a\u017b\7\23\2\2\u017b"+
		"\u017f\3\2\2\2\u017c\u017d\7\7\2\2\u017d\u017f\5<\37\2\u017e\u0172\3\2"+
		"\2\2\u017e\u0174\3\2\2\2\u017e\u0177\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		";\3\2\2\2\u0180\u0189\5\66\34\2\u0181\u0182\5\66\34\2\u0182\u0183\5\64"+
		"\33\2\u0183\u0189\3\2\2\2\u0184\u0189\5F$\2\u0185\u0186\5F$\2\u0186\u0187"+
		"\5T+\2\u0187\u0189\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0189=\3\2\2\2\u018a\u0195\5@!\2\u018b"+
		"\u018c\5@!\2\u018c\u018d\5> \2\u018d\u0195\3\2\2\2\u018e\u0195\5B\"\2"+
		"\u018f\u0190\5B\"\2\u0190\u0191\5> \2\u0191\u0195\3\2\2\2\u0192\u0193"+
		"\7\30\2\2\u0193\u0195\5> \2\u0194\u018a\3\2\2\2\u0194\u018b\3\2\2\2\u0194"+
		"\u018e\3\2\2\2\u0194\u018f\3\2\2\2\u0194\u0192\3\2\2\2\u0195?\3\2\2\2"+
		"\u0196\u019b\5D#\2\u0197\u0198\5D#\2\u0198\u0199\5@!\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019bA\3\2\2\2\u019c\u019d"+
		"\b\"\1\2\u019d\u019e\7\24\2\2\u019e\u019f\5> \2\u019f\u01a0\7\25\2\2\u01a0"+
		"\u01a5\3\2\2\2\u01a1\u01a2\f\3\2\2\u01a2\u01a4\7\27\2\2\u01a3\u01a1\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"C\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u0209\7\32\2\2\u01a9\u01aa\7\32\2"+
		"\2\u01aa\u0209\t\2\2\2\u01ab\u01ac\7\32\2\2\u01ac\u0209\7\34\2\2\u01ad"+
		"\u01ae\7\32\2\2\u01ae\u01af\7\34\2\2\u01af\u0209\t\2\2\2\u01b0\u01b1\5"+
		"$\23\2\u01b1\u01b2\7\32\2\2\u01b2\u0209\3\2\2\2\u01b3\u01b4\5$\23\2\u01b4"+
		"\u01b5\7\32\2\2\u01b5\u01b6\t\2\2\2\u01b6\u0209\3\2\2\2\u01b7\u01b8\5"+
		"$\23\2\u01b8\u01b9\7\32\2\2\u01b9\u01ba\7\34\2\2\u01ba\u0209\3\2\2\2\u01bb"+
		"\u01bc\5$\23\2\u01bc\u01bd\7\32\2\2\u01bd\u01be\7\34\2\2\u01be\u01bf\t"+
		"\2\2\2\u01bf\u0209\3\2\2\2\u01c0\u01c1\7\32\2\2\u01c1\u0209\5&\24\2\u01c2"+
		"\u01c3\7\32\2\2\u01c3\u01c4\5&\24\2\u01c4\u01c5\t\2\2\2\u01c5\u0209\3"+
		"\2\2\2\u01c6\u01c7\7\32\2\2\u01c7\u01c8\5&\24\2\u01c8\u01c9\7\34\2\2\u01c9"+
		"\u0209\3\2\2\2\u01ca\u01cb\7\32\2\2\u01cb\u01cc\5&\24\2\u01cc\u01cd\7"+
		"\34\2\2\u01cd\u01ce\t\2\2\2\u01ce\u0209\3\2\2\2\u01cf\u0209\7\36\2\2\u01d0"+
		"\u01d1\7\36\2\2\u01d1\u0209\t\2\2\2\u01d2\u01d3\7\36\2\2\u01d3\u0209\7"+
		"\34\2\2\u01d4\u01d5\7\36\2\2\u01d5\u01d6\7\34\2\2\u01d6\u0209\t\2\2\2"+
		"\u01d7\u0209\7\37\2\2\u01d8\u01d9\7\37\2\2\u01d9\u0209\t\2\2\2\u01da\u01db"+
		"\7\37\2\2\u01db\u0209\7\34\2\2\u01dc\u01dd\7\37\2\2\u01dd\u01de\7\34\2"+
		"\2\u01de\u0209\t\2\2\2\u01df\u0209\5*\26\2\u01e0\u01e1\5*\26\2\u01e1\u01e2"+
		"\t\2\2\2\u01e2\u0209\3\2\2\2\u01e3\u01e4\5*\26\2\u01e4\u01e5\7\34\2\2"+
		"\u01e5\u0209\3\2\2\2\u01e6\u01e7\5*\26\2\u01e7\u01e8\7\34\2\2\u01e8\u01e9"+
		"\t\2\2\2\u01e9\u0209\3\2\2\2\u01ea\u01eb\7\32\2\2\u01eb\u01ec\7\13\2\2"+
		"\u01ec\u0209\5*\26\2\u01ed\u01ee\7\32\2\2\u01ee\u01ef\7\13\2\2\u01ef\u01f0"+
		"\5*\26\2\u01f0\u01f1\t\2\2\2\u01f1\u0209\3\2\2\2\u01f2\u01f3\7\32\2\2"+
		"\u01f3\u01f4\7\13\2\2\u01f4\u01f5\5*\26\2\u01f5\u01f6\7\34\2\2\u01f6\u0209"+
		"\3\2\2\2\u01f7\u01f8\7\32\2\2\u01f8\u01f9\7\13\2\2\u01f9\u01fa\5*\26\2"+
		"\u01fa\u01fb\7\34\2\2\u01fb\u01fc\t\2\2\2\u01fc\u0209\3\2\2\2\u01fd\u0209"+
		"\5\36\20\2\u01fe\u01ff\5\36\20\2\u01ff\u0200\t\2\2\2\u0200\u0209\3\2\2"+
		"\2\u0201\u0202\5\36\20\2\u0202\u0203\7\34\2\2\u0203\u0209\3\2\2\2\u0204"+
		"\u0205\5\36\20\2\u0205\u0206\7\34\2\2\u0206\u0207\t\2\2\2\u0207\u0209"+
		"\3\2\2\2\u0208\u01a8\3\2\2\2\u0208\u01a9\3\2\2\2\u0208\u01ab\3\2\2\2\u0208"+
		"\u01ad\3\2\2\2\u0208\u01b0\3\2\2\2\u0208\u01b3\3\2\2\2\u0208\u01b7\3\2"+
		"\2\2\u0208\u01bb\3\2\2\2\u0208\u01c0\3\2\2\2\u0208\u01c2\3\2\2\2\u0208"+
		"\u01c6\3\2\2\2\u0208\u01ca\3\2\2\2\u0208\u01cf\3\2\2\2\u0208\u01d0\3\2"+
		"\2\2\u0208\u01d2\3\2\2\2\u0208\u01d4\3\2\2\2\u0208\u01d7\3\2\2\2\u0208"+
		"\u01d8\3\2\2\2\u0208\u01da\3\2\2\2\u0208\u01dc\3\2\2\2\u0208\u01df\3\2"+
		"\2\2\u0208\u01e0\3\2\2\2\u0208\u01e3\3\2\2\2\u0208\u01e6\3\2\2\2\u0208"+
		"\u01ea\3\2\2\2\u0208\u01ed\3\2\2\2\u0208\u01f2\3\2\2\2\u0208\u01f7\3\2"+
		"\2\2\u0208\u01fd\3\2\2\2\u0208\u01fe\3\2\2\2\u0208\u0201\3\2\2\2\u0208"+
		"\u0204\3\2\2\2\u0209E\3\2\2\2\u020a\u020b\7\b\2\2\u020b\u020c\5H%\2\u020c"+
		"\u020d\7\22\2\2\u020d\u020e\7\23\2\2\u020e\u021e\3\2\2\2\u020f\u0210\7"+
		"\b\2\2\u0210\u0211\5H%\2\u0211\u0212\7\22\2\2\u0212\u0213\5R*\2\u0213"+
		"\u0214\7\23\2\2\u0214\u021e\3\2\2\2\u0215\u0216\7\b\2\2\u0216\u0217\5"+
		"H%\2\u0217\u0218\5(\25\2\u0218\u021e\3\2\2\2\u0219\u021a\7\b\2\2\u021a"+
		"\u021b\5H%\2\u021b\u021c\5T+\2\u021c\u021e\3\2\2\2\u021d\u020a\3\2\2\2"+
		"\u021d\u020f\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0219\3\2\2\2\u021eG\3"+
		"\2\2\2\u021f\u0220\7\24\2\2\u0220\u0221\5J&\2\u0221\u0222\7\n\2\2\u0222"+
		"\u0223\5L\'\2\u0223\u0224\7\n\2\2\u0224\u0225\5N(\2\u0225\u0226\7\25\2"+
		"\2\u0226\u0232\3\2\2\2\u0227\u0228\5J&\2\u0228\u0229\7\n\2\2\u0229\u022a"+
		"\5L\'\2\u022a\u022b\7\n\2\2\u022b\u022c\5N(\2\u022c\u0232\3\2\2\2\u022d"+
		"\u0232\5> \2\u022e\u022f\7\24\2\2\u022f\u0232\7\25\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u021f\3\2\2\2\u0231\u0227\3\2\2\2\u0231\u022d\3\2\2\2\u0231"+
		"\u022e\3\2\2\2\u0231\u0230\3\2\2\2\u0232I\3\2\2\2\u0233\u0236\5\22\n\2"+
		"\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236K\3"+
		"\2\2\2\u0237\u023a\5> \2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u0238\3\2\2\2\u023aM\3\2\2\2\u023b\u023e\5P)\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023eO\3\2\2\2\u023f\u024a\5 \21\2"+
		"\u0240\u024a\5\36\20\2\u0241\u0242\5 \21\2\u0242\u0243\7\17\2\2\u0243"+
		"\u0244\5P)\2\u0244\u024a\3\2\2\2\u0245\u0246\5\36\20\2\u0246\u0247\7\17"+
		"\2\2\u0247\u0248\5P)\2\u0248\u024a\3\2\2\2\u0249\u023f\3\2\2\2\u0249\u0240"+
		"\3\2\2\2\u0249\u0241\3\2\2\2\u0249\u0245\3\2\2\2\u024aQ\3\2\2\2\u024b"+
		"\u0250\5\6\4\2\u024c\u024d\5\6\4\2\u024d\u024e\5R*\2\u024e\u0250\3\2\2"+
		"\2\u024f\u024b\3\2\2\2\u024f\u024c\3\2\2\2\u0250S\3\2\2\2\u0251\u025a"+
		"\5\66\34\2\u0252\u0253\5\66\34\2\u0253\u0254\5T+\2\u0254\u025a\3\2\2\2"+
		"\u0255\u025a\5F$\2\u0256\u0257\5F$\2\u0257\u0258\5T+\2\u0258\u025a\3\2"+
		"\2\2\u0259\u0251\3\2\2\2\u0259\u0252\3\2\2\2\u0259\u0255\3\2\2\2\u0259"+
		"\u0256\3\2\2\2\u025aU\3\2\2\2\u025b\u025c\7\t\2\2\u025c\u025d\5X-\2\u025d"+
		"\u025e\7\n\2\2\u025eW\3\2\2\2\u025f\u0263\5Z.\2\u0260\u0263\5 \21\2\u0261"+
		"\u0263\5\36\20\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3"+
		"\2\2\2\u0263Y\3\2\2\2\u0264\u0273\7\32\2\2\u0265\u0266\7\32\2\2\u0266"+
		"\u0273\7\34\2\2\u0267\u0273\7\36\2\2\u0268\u0269\7\36\2\2\u0269\u0273"+
		"\7\34\2\2\u026a\u0273\7\37\2\2\u026b\u026c\7\37\2\2\u026c\u0273\7\34\2"+
		"\2\u026d\u0273\7\35\2\2\u026e\u0273\5\26\f\2\u026f\u0273\5\32\16\2\u0270"+
		"\u0273\5\36\20\2\u0271\u0273\5*\26\2\u0272\u0264\3\2\2\2\u0272\u0265\3"+
		"\2\2\2\u0272\u0267\3\2\2\2\u0272\u0268\3\2\2\2\u0272\u026a\3\2\2\2\u0272"+
		"\u026b\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273[\3\2\2\2$dn{\u0088"+
		"\u0091\u0099\u00a0\u00a8\u00b3\u00bd\u010c\u0121\u012b\u0137\u013c\u0146"+
		"\u015b\u0170\u017e\u0188\u0194\u019a\u01a5\u0208\u021d\u0231\u0235\u0239"+
		"\u023d\u0249\u024f\u0259\u0262\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}