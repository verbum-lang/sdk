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
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, Function=8, Pub=9, Pro=10, 
		Priv=11, Static=12, Final=13, Interface=14, Extends=15, ArrowRight=16, 
		End=17, Attr=18, Point=19, TwoPoint=20, TwoTwoPoint=21, Separator=22, 
		OpenArIndex=23, CloseArIndex=24, OpenBlock=25, CloseBlock=26, OpenOp=27, 
		CloseOp=28, ArithmeticOperator=29, AssignmentOperator=30, Not=31, IncDecOperators=32, 
		Identifier=33, IDPrefix=34, TypeSpec=35, String=36, Integer=37, Float=38, 
		Whitespace=39, Newline=40, Words=41, BlockComment=42, LineComment=43;
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
		RULE_functions = 44, RULE_functionGeneralModes = 45, RULE_functionsModes = 46, 
		RULE_functionMethodsModes = 47, RULE_methodPerm = 48, RULE_constructClassMethod = 49, 
		RULE_interfaceMethod = 50, RULE_functionCodeBlock = 51, RULE_functionParams = 52, 
		RULE_functionParamElements = 53, RULE_oopGeneral = 54, RULE_interfaceControl = 55, 
		RULE_generalValue = 56;
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
			"functions", "functionGeneralModes", "functionsModes", "functionMethodsModes", 
			"methodPerm", "constructClassMethod", "interfaceMethod", "functionCodeBlock", 
			"functionParams", "functionParamElements", "oopGeneral", "interfaceControl", 
			"generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'extends'", "'->'", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Extends", "ArrowRight", 
			"End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
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
			setState(114);
			fileContent(0);
			setState(115);
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
			setState(122);
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
					setState(118);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(119);
					sentence();
					}
					} 
				}
				setState(124);
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
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public OopGeneralContext oopGeneral() {
			return getRuleContext(OopGeneralContext.class,0);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				oopGeneral();
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
			setState(136);
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
			setState(138);
			match(Use);
			setState(139);
			useValue();
			setState(140);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				useString();
				setState(144);
				match(Separator);
				setState(145);
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
			setState(149);
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
			setState(151);
			match(Var);
			setState(152);
			variableMembers();
			setState(153);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				variableDefinition();
				setState(157);
				match(Separator);
				setState(158);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Identifier);
				setState(163);
				match(Attr);
				setState(164);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(Identifier);
				setState(166);
				match(TypeSpec);
				setState(167);
				match(Attr);
				setState(168);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(OpenArIndex);
				setState(172);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(OpenArIndex);
				setState(174);
				indexArrayElements();
				setState(175);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				generalValue();
				setState(181);
				match(Separator);
				setState(182);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(OpenBlock);
				setState(187);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(OpenBlock);
				setState(189);
				associativeArrayElements();
				setState(190);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Identifier);
				setState(195);
				match(TwoPoint);
				setState(196);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(Identifier);
				setState(198);
				match(TwoPoint);
				setState(199);
				generalValue();
				setState(200);
				match(Separator);
				setState(201);
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
			setState(205);
			match(OpenOp);
			setState(206);
			operationElements();
			setState(207);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				operationValue();
				setState(211);
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(Identifier);
				setState(217);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(Identifier);
				setState(219);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(Identifier);
				setState(221);
				match(TypeSpec);
				setState(222);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				firstIncDec();
				setState(224);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				firstIncDec();
				setState(227);
				match(Identifier);
				setState(228);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				firstIncDec();
				setState(231);
				match(Identifier);
				setState(232);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				firstIncDec();
				setState(235);
				match(Identifier);
				setState(236);
				match(TypeSpec);
				setState(237);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				match(Identifier);
				setState(240);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				match(Identifier);
				setState(242);
				lastIncDec();
				setState(243);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(245);
				match(Identifier);
				setState(246);
				lastIncDec();
				setState(247);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				match(Identifier);
				setState(250);
				lastIncDec();
				setState(251);
				match(TypeSpec);
				setState(252);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(255);
				match(Integer);
				setState(256);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(257);
				match(Integer);
				setState(258);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(259);
				match(Integer);
				setState(260);
				match(TypeSpec);
				setState(261);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(262);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(263);
				match(Float);
				setState(264);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(265);
				match(Float);
				setState(266);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(267);
				match(Float);
				setState(268);
				match(TypeSpec);
				setState(269);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(270);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(271);
				functionCall();
				setState(272);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(274);
				functionCall();
				setState(275);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(277);
				functionCall();
				setState(278);
				match(TypeSpec);
				setState(279);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(281);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(282);
				operationBlock();
				setState(283);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(285);
				operationBlock();
				setState(286);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(288);
				operationBlock();
				setState(289);
				match(TypeSpec);
				setState(290);
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
			setState(294);
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
			setState(296);
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
			setState(298);
			functionCall();
			setState(299);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(Identifier);
				setState(302);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(Identifier);
				setState(304);
				match(Point);
				setState(305);
				identifierB();
				setState(306);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(Identifier);
				setState(309);
				match(TwoTwoPoint);
				setState(310);
				identifierB();
				setState(311);
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
			setState(315);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(OpenOp);
				setState(318);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(OpenOp);
				setState(320);
				functionCallParamElements();
				setState(321);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				generalValue();
				setState(327);
				match(Separator);
				setState(328);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				operationElements();
				setState(332);
				match(Separator);
				setState(333);
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
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
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				conditionalExpression();
				setState(344);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				sentence();
				setState(348);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(If);
				setState(353);
				conditionalExpressionElements();
				setState(354);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(If);
				setState(357);
				conditionalExpressionElements();
				setState(358);
				match(OpenBlock);
				setState(359);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(If);
				setState(362);
				conditionalExpressionElements();
				setState(363);
				match(OpenBlock);
				setState(364);
				conditionalBlockElements();
				setState(365);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(If);
				setState(368);
				conditionalExpressionElements();
				setState(369);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(Elif);
				setState(374);
				conditionalExpressionElements();
				setState(375);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(Elif);
				setState(378);
				conditionalExpressionElements();
				setState(379);
				match(OpenBlock);
				setState(380);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(Elif);
				setState(383);
				conditionalExpressionElements();
				setState(384);
				match(OpenBlock);
				setState(385);
				conditionalBlockElements();
				setState(386);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				match(Elif);
				setState(389);
				conditionalExpressionElements();
				setState(390);
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
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(Else);
				setState(395);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(Else);
				setState(397);
				match(OpenBlock);
				setState(398);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(Else);
				setState(400);
				match(OpenBlock);
				setState(401);
				conditionalBlockElements();
				setState(402);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(Else);
				setState(405);
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
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				ifConditions();
				setState(410);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				loop();
				setState(414);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				conditionalExpElementsValue();
				setState(420);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				conditionExpBlock(0);
				setState(424);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				match(Not);
				setState(427);
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
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				conditionalExpValue();
				setState(432);
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
			setState(437);
			match(OpenOp);
			setState(438);
			conditionalExpressionElements();
			setState(439);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
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
					setState(441);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(442);
					match(AssignmentOperator);
					}
					} 
				}
				setState(447);
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
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(Identifier);
				setState(452);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(Identifier);
				setState(454);
				match(TypeSpec);
				setState(455);
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
				setState(456);
				firstIncDec();
				setState(457);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				firstIncDec();
				setState(460);
				match(Identifier);
				setState(461);
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
				setState(463);
				firstIncDec();
				setState(464);
				match(Identifier);
				setState(465);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(467);
				firstIncDec();
				setState(468);
				match(Identifier);
				setState(469);
				match(TypeSpec);
				setState(470);
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
				setState(472);
				match(Identifier);
				setState(473);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				match(Identifier);
				setState(475);
				lastIncDec();
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(478);
				match(Identifier);
				setState(479);
				lastIncDec();
				setState(480);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(482);
				match(Identifier);
				setState(483);
				lastIncDec();
				setState(484);
				match(TypeSpec);
				setState(485);
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
				setState(487);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(488);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(490);
				match(Integer);
				setState(491);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(492);
				match(Integer);
				setState(493);
				match(TypeSpec);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(495);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(496);
				match(Float);
				setState(497);
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
				setState(498);
				match(Float);
				setState(499);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(500);
				match(Float);
				setState(501);
				match(TypeSpec);
				setState(502);
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
				setState(503);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(504);
				functionCall();
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
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(507);
				functionCall();
				setState(508);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(510);
				functionCall();
				setState(511);
				match(TypeSpec);
				setState(512);
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
				setState(514);
				match(Identifier);
				setState(515);
				match(Attr);
				setState(516);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(517);
				match(Identifier);
				setState(518);
				match(Attr);
				setState(519);
				functionCall();
				setState(520);
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
				setState(522);
				match(Identifier);
				setState(523);
				match(Attr);
				setState(524);
				functionCall();
				setState(525);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(527);
				match(Identifier);
				setState(528);
				match(Attr);
				setState(529);
				functionCall();
				setState(530);
				match(TypeSpec);
				setState(531);
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
				setState(533);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(534);
				operationBlock();
				setState(535);
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
				setState(537);
				operationBlock();
				setState(538);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(540);
				operationBlock();
				setState(541);
				match(TypeSpec);
				setState(542);
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
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(For);
				setState(547);
				loopExpression();
				setState(548);
				match(OpenBlock);
				setState(549);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(For);
				setState(552);
				loopExpression();
				setState(553);
				match(OpenBlock);
				setState(554);
				loopBlockElements();
				setState(555);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(For);
				setState(558);
				loopExpression();
				setState(559);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				match(For);
				setState(562);
				loopExpression();
				setState(563);
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
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(OpenOp);
				setState(568);
				loopOneMembers();
				setState(569);
				match(End);
				setState(570);
				loopTwoMembers();
				setState(571);
				match(End);
				setState(572);
				loopThreeMembers();
				setState(573);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				loopOneMembers();
				setState(576);
				match(End);
				setState(577);
				loopTwoMembers();
				setState(578);
				match(End);
				setState(579);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				match(OpenOp);
				setState(583);
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
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
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
			setState(593);
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
				setState(591);
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
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
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
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				operationElements();
				setState(602);
				match(Separator);
				setState(603);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				operationBlock();
				setState(606);
				match(Separator);
				setState(607);
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
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				sentence();
				setState(613);
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
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				ifConditions();
				setState(619);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				loop();
				setState(623);
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
			setState(627);
			match(Ret);
			setState(628);
			retValues();
			setState(629);
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
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctionsModesContext functionsModes() {
			return getRuleContext(FunctionsModesContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public FunctionMethodsModesContext functionMethodsModes() {
			return getRuleContext(FunctionMethodsModesContext.class,0);
		}
		public ConstructClassMethodContext constructClassMethod() {
			return getRuleContext(ConstructClassMethodContext.class,0);
		}
		public InterfaceMethodContext interfaceMethod() {
			return getRuleContext(InterfaceMethodContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functions);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				functionsModes();
				setState(637);
				match(OpenBlock);
				setState(638);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				functionsModes();
				setState(641);
				match(OpenBlock);
				setState(642);
				functionCodeBlock();
				setState(643);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				functionMethodsModes();
				setState(646);
				match(OpenBlock);
				setState(647);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(649);
				functionMethodsModes();
				setState(650);
				match(OpenBlock);
				setState(651);
				functionCodeBlock();
				setState(652);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				constructClassMethod();
				setState(655);
				match(OpenBlock);
				setState(656);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				constructClassMethod();
				setState(659);
				match(OpenBlock);
				setState(660);
				functionCodeBlock();
				setState(661);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(663);
				interfaceMethod();
				setState(664);
				match(End);
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

	public static class FunctionGeneralModesContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TParser.Identifier, i);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionGeneralModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionGeneralModes; }
	}

	public final FunctionGeneralModesContext functionGeneralModes() throws RecognitionException {
		FunctionGeneralModesContext _localctx = new FunctionGeneralModesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionGeneralModes);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(Function);
				setState(669);
				match(Identifier);
				setState(670);
				match(OpenOp);
				setState(671);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(Function);
				setState(673);
				match(Identifier);
				setState(674);
				match(OpenOp);
				setState(675);
				match(CloseOp);
				setState(676);
				match(ArrowRight);
				setState(677);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(Function);
				setState(679);
				match(Identifier);
				setState(680);
				match(OpenOp);
				setState(681);
				functionParams();
				setState(682);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				match(Function);
				setState(685);
				match(Identifier);
				setState(686);
				match(OpenOp);
				setState(687);
				functionParams();
				setState(688);
				match(CloseOp);
				setState(689);
				match(ArrowRight);
				setState(690);
				match(Identifier);
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

	public static class FunctionsModesContext extends ParserRuleContext {
		public FunctionGeneralModesContext functionGeneralModes() {
			return getRuleContext(FunctionGeneralModesContext.class,0);
		}
		public FunctionsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsModes; }
	}

	public final FunctionsModesContext functionsModes() throws RecognitionException {
		FunctionsModesContext _localctx = new FunctionsModesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			functionGeneralModes();
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

	public static class FunctionMethodsModesContext extends ParserRuleContext {
		public MethodPermContext methodPerm() {
			return getRuleContext(MethodPermContext.class,0);
		}
		public FunctionGeneralModesContext functionGeneralModes() {
			return getRuleContext(FunctionGeneralModesContext.class,0);
		}
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public FunctionMethodsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMethodsModes; }
	}

	public final FunctionMethodsModesContext functionMethodsModes() throws RecognitionException {
		FunctionMethodsModesContext _localctx = new FunctionMethodsModesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionMethodsModes);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				methodPerm();
				setState(697);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(Static);
				setState(700);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				methodPerm();
				setState(702);
				match(Static);
				setState(703);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				match(Final);
				setState(706);
				methodPerm();
				setState(707);
				match(Static);
				setState(708);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(710);
				match(Final);
				setState(711);
				methodPerm();
				setState(712);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				match(Final);
				setState(715);
				functionGeneralModes();
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

	public static class MethodPermContext extends ParserRuleContext {
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public MethodPermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPerm; }
	}

	public final MethodPermContext methodPerm() throws RecognitionException {
		MethodPermContext _localctx = new MethodPermContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv))) != 0)) ) {
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

	public static class ConstructClassMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public ConstructClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructClassMethod; }
	}

	public final ConstructClassMethodContext constructClassMethod() throws RecognitionException {
		ConstructClassMethodContext _localctx = new ConstructClassMethodContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructClassMethod);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(Identifier);
				setState(721);
				match(OpenOp);
				setState(722);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(Identifier);
				setState(724);
				match(OpenOp);
				setState(725);
				functionParams();
				setState(726);
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

	public static class InterfaceMethodContext extends ParserRuleContext {
		public FunctionsModesContext functionsModes() {
			return getRuleContext(FunctionsModesContext.class,0);
		}
		public FunctionMethodsModesContext functionMethodsModes() {
			return getRuleContext(FunctionMethodsModesContext.class,0);
		}
		public InterfaceMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethod; }
	}

	public final InterfaceMethodContext interfaceMethod() throws RecognitionException {
		InterfaceMethodContext _localctx = new InterfaceMethodContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interfaceMethod);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				functionsModes();
				}
				break;
			case Pub:
			case Pro:
			case Priv:
			case Static:
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				functionMethodsModes();
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

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionCodeBlock);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				sentence();
				setState(736);
				functionCodeBlock();
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

	public static class FunctionParamsContext extends ParserRuleContext {
		public FunctionParamElementsContext functionParamElements() {
			return getRuleContext(FunctionParamElementsContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionParams);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				functionParamElements();
				setState(742);
				match(Separator);
				setState(743);
				functionParams();
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

	public static class FunctionParamElementsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FunctionParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamElements; }
	}

	public final FunctionParamElementsContext functionParamElements() throws RecognitionException {
		FunctionParamElementsContext _localctx = new FunctionParamElementsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(Identifier);
			setState(748);
			match(TypeSpec);
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

	public static class OopGeneralContext extends ParserRuleContext {
		public InterfaceControlContext interfaceControl() {
			return getRuleContext(InterfaceControlContext.class,0);
		}
		public OopGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oopGeneral; }
	}

	public final OopGeneralContext oopGeneral() throws RecognitionException {
		OopGeneralContext _localctx = new OopGeneralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_oopGeneral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			interfaceControl();
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

	public static class InterfaceControlContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(TParser.Interface, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TParser.Identifier, i);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public InterfaceControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceControl; }
	}

	public final InterfaceControlContext interfaceControl() throws RecognitionException {
		InterfaceControlContext _localctx = new InterfaceControlContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_interfaceControl);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(Interface);
				setState(753);
				match(Identifier);
				setState(754);
				match(OpenBlock);
				setState(755);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(Interface);
				setState(757);
				match(Identifier);
				setState(758);
				match(OpenBlock);
				setState(759);
				functionCodeBlock();
				setState(760);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				match(Interface);
				setState(763);
				match(Identifier);
				setState(764);
				match(Extends);
				setState(765);
				match(Identifier);
				setState(766);
				match(OpenBlock);
				setState(767);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768);
				match(Interface);
				setState(769);
				match(Identifier);
				setState(770);
				match(Extends);
				setState(771);
				match(Identifier);
				setState(772);
				match(OpenBlock);
				setState(773);
				functionCodeBlock();
				setState(774);
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
		enterRule(_localctx, 112, RULE_generalValue);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				match(Identifier);
				setState(780);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				match(Integer);
				setState(783);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(785);
				match(Float);
				setState(786);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(787);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(788);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(789);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(790);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(791);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u031d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0089\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00c3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0127\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u013c\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0146\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0152\n\31\3\32"+
		"\3\32\3\32\5\32\u0157\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0161\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0176\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u018b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0199\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01a3\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01af\n \3!\3!\3!\3!\5!\u01b5"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01be\n\"\f\"\16\"\u01c1\13\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0223\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u0238\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u024c\n%\3&\3&\5&\u0250\n&\3\'\3\'\5\'\u0254\n\'\3(\3(\5(\u0258"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0264\n)\3*\3*\3*\3*\5*\u026a\n*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0274\n+\3,\3,\3,\3,\3-\3-\3-\5-\u027d\n-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u029d\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02b7\n/\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u02cf\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u02db\n\63\3\64\3\64\5\64\u02df\n\64\3\65\3\65\3"+
		"\65\3\65\5\65\u02e5\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u02ec\n\66\3\67"+
		"\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\59\u030b\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\5:\u031b\n:\3:\2\4\4B;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\4\3\2\37 \3\2\13\r"+
		"\2\u037d\2t\3\2\2\2\4w\3\2\2\2\6\u0088\3\2\2\2\b\u008a\3\2\2\2\n\u008c"+
		"\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2\2\22\u00a2\3"+
		"\2\2\2\24\u00ab\3\2\2\2\26\u00b3\3\2\2\2\30\u00ba\3\2\2\2\32\u00c2\3\2"+
		"\2\2\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00d7\3\2\2\2\"\u0126\3\2\2\2"+
		"$\u0128\3\2\2\2&\u012a\3\2\2\2(\u012c\3\2\2\2*\u013b\3\2\2\2,\u013d\3"+
		"\2\2\2.\u0145\3\2\2\2\60\u0151\3\2\2\2\62\u0156\3\2\2\2\64\u0160\3\2\2"+
		"\2\66\u0175\3\2\2\28\u018a\3\2\2\2:\u0198\3\2\2\2<\u01a2\3\2\2\2>\u01ae"+
		"\3\2\2\2@\u01b4\3\2\2\2B\u01b6\3\2\2\2D\u0222\3\2\2\2F\u0237\3\2\2\2H"+
		"\u024b\3\2\2\2J\u024f\3\2\2\2L\u0253\3\2\2\2N\u0257\3\2\2\2P\u0263\3\2"+
		"\2\2R\u0269\3\2\2\2T\u0273\3\2\2\2V\u0275\3\2\2\2X\u027c\3\2\2\2Z\u029c"+
		"\3\2\2\2\\\u02b6\3\2\2\2^\u02b8\3\2\2\2`\u02ce\3\2\2\2b\u02d0\3\2\2\2"+
		"d\u02da\3\2\2\2f\u02de\3\2\2\2h\u02e4\3\2\2\2j\u02eb\3\2\2\2l\u02ed\3"+
		"\2\2\2n\u02f0\3\2\2\2p\u030a\3\2\2\2r\u031a\3\2\2\2tu\5\4\3\2uv\7\2\2"+
		"\3v\3\3\2\2\2w|\b\3\1\2xy\f\4\2\2y{\5\6\4\2zx\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\5\3\2\2\2~|\3\2\2\2\177\u0089\5\b\5\2\u0080\u0089\5\n"+
		"\6\2\u0081\u0089\5\20\t\2\u0082\u0089\5(\25\2\u0083\u0089\5\62\32\2\u0084"+
		"\u0089\5F$\2\u0085\u0089\5Z.\2\u0086\u0089\5V,\2\u0087\u0089\5n8\2\u0088"+
		"\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2"+
		"\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\7\3\2\2\2\u008a\u008b\7*\2\2\u008b"+
		"\t\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\23\2"+
		"\2\u008f\13\3\2\2\2\u0090\u0096\5\16\b\2\u0091\u0092\5\16\b\2\u0092\u0093"+
		"\7\30\2\2\u0093\u0094\5\f\7\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2"+
		"\u0095\u0091\3\2\2\2\u0096\r\3\2\2\2\u0097\u0098\7&\2\2\u0098\17\3\2\2"+
		"\2\u0099\u009a\7\4\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7\23\2\2\u009c"+
		"\21\3\2\2\2\u009d\u00a3\5\24\13\2\u009e\u009f\5\24\13\2\u009f\u00a0\7"+
		"\30\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7\24\2"+
		"\2\u00a6\u00ac\5r:\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7%\2\2\u00a9\u00aa"+
		"\7\24\2\2\u00aa\u00ac\5r:\2\u00ab\u00a4\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b4\7\32\2\2\u00af\u00b0\7\31"+
		"\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\32\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00bb\5r:\2"+
		"\u00b6\u00b7\5r:\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\31\3\2\2\2\u00bc"+
		"\u00bd\7\33\2\2\u00bd\u00c3\7\34\2\2\u00be\u00bf\7\33\2\2\u00bf\u00c0"+
		"\5\34\17\2\u00c0\u00c1\7\34\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2"+
		"\2\u00c2\u00be\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\7\26\2\2\u00c6\u00ce\5r:\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7\26\2\2\u00c9"+
		"\u00ca\5r:\2\u00ca\u00cb\7\30\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00ce\3"+
		"\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c7\3\2\2\2\u00ce\35\3\2\2\2\u00cf"+
		"\u00d0\7\35\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\36\2\2\u00d2\37\3\2"+
		"\2\2\u00d3\u00d8\5\"\22\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\5 \21\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8!\3\2\2\2"+
		"\u00d9\u0127\7#\2\2\u00da\u00db\7#\2\2\u00db\u0127\7\37\2\2\u00dc\u00dd"+
		"\7#\2\2\u00dd\u0127\7%\2\2\u00de\u00df\7#\2\2\u00df\u00e0\7%\2\2\u00e0"+
		"\u0127\7\37\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7#\2\2\u00e3\u0127\3\2"+
		"\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7\37\2\2\u00e7"+
		"\u0127\3\2\2\2\u00e8\u00e9\5$\23\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7%\2"+
		"\2\u00eb\u0127\3\2\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7#\2\2\u00ee\u00ef"+
		"\7%\2\2\u00ef\u00f0\7\37\2\2\u00f0\u0127\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2"+
		"\u0127\5&\24\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\5&\24\2\u00f5\u00f6\7\37"+
		"\2\2\u00f6\u0127\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\5&\24\2\u00f9"+
		"\u00fa\7%\2\2\u00fa\u0127\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\5&\24"+
		"\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0127\3\2\2\2\u0100\u0127"+
		"\7\'\2\2\u0101\u0102\7\'\2\2\u0102\u0127\7\37\2\2\u0103\u0104\7\'\2\2"+
		"\u0104\u0127\7%\2\2\u0105\u0106\7\'\2\2\u0106\u0107\7%\2\2\u0107\u0127"+
		"\7\37\2\2\u0108\u0127\7(\2\2\u0109\u010a\7(\2\2\u010a\u0127\7\37\2\2\u010b"+
		"\u010c\7(\2\2\u010c\u0127\7%\2\2\u010d\u010e\7(\2\2\u010e\u010f\7%\2\2"+
		"\u010f\u0127\7\37\2\2\u0110\u0127\5*\26\2\u0111\u0112\5*\26\2\u0112\u0113"+
		"\7\37\2\2\u0113\u0127\3\2\2\2\u0114\u0115\5*\26\2\u0115\u0116\7%\2\2\u0116"+
		"\u0127\3\2\2\2\u0117\u0118\5*\26\2\u0118\u0119\7%\2\2\u0119\u011a\7\37"+
		"\2\2\u011a\u0127\3\2\2\2\u011b\u0127\5\36\20\2\u011c\u011d\5\36\20\2\u011d"+
		"\u011e\7\37\2\2\u011e\u0127\3\2\2\2\u011f\u0120\5\36\20\2\u0120\u0121"+
		"\7%\2\2\u0121\u0127\3\2\2\2\u0122\u0123\5\36\20\2\u0123\u0124\7%\2\2\u0124"+
		"\u0125\7\37\2\2\u0125\u0127\3\2\2\2\u0126\u00d9\3\2\2\2\u0126\u00da\3"+
		"\2\2\2\u0126\u00dc\3\2\2\2\u0126\u00de\3\2\2\2\u0126\u00e1\3\2\2\2\u0126"+
		"\u00e4\3\2\2\2\u0126\u00e8\3\2\2\2\u0126\u00ec\3\2\2\2\u0126\u00f1\3\2"+
		"\2\2\u0126\u00f3\3\2\2\2\u0126\u00f7\3\2\2\2\u0126\u00fb\3\2\2\2\u0126"+
		"\u0100\3\2\2\2\u0126\u0101\3\2\2\2\u0126\u0103\3\2\2\2\u0126\u0105\3\2"+
		"\2\2\u0126\u0108\3\2\2\2\u0126\u0109\3\2\2\2\u0126\u010b\3\2\2\2\u0126"+
		"\u010d\3\2\2\2\u0126\u0110\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0114\3\2"+
		"\2\2\u0126\u0117\3\2\2\2\u0126\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0126\u0122\3\2\2\2\u0127#\3\2\2\2\u0128\u0129\7\"\2\2"+
		"\u0129%\3\2\2\2\u012a\u012b\7\"\2\2\u012b\'\3\2\2\2\u012c\u012d\5*\26"+
		"\2\u012d\u012e\7\23\2\2\u012e)\3\2\2\2\u012f\u0130\7#\2\2\u0130\u013c"+
		"\5.\30\2\u0131\u0132\7#\2\2\u0132\u0133\7\25\2\2\u0133\u0134\5,\27\2\u0134"+
		"\u0135\5.\30\2\u0135\u013c\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\7\27"+
		"\2\2\u0138\u0139\5,\27\2\u0139\u013a\5.\30\2\u013a\u013c\3\2\2\2\u013b"+
		"\u012f\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0136\3\2\2\2\u013c+\3\2\2\2"+
		"\u013d\u013e\7#\2\2\u013e-\3\2\2\2\u013f\u0140\7\35\2\2\u0140\u0146\7"+
		"\36\2\2\u0141\u0142\7\35\2\2\u0142\u0143\5\60\31\2\u0143\u0144\7\36\2"+
		"\2\u0144\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0141\3\2\2\2\u0146/"+
		"\3\2\2\2\u0147\u0152\5r:\2\u0148\u0149\5r:\2\u0149\u014a\7\30\2\2\u014a"+
		"\u014b\5\60\31\2\u014b\u0152\3\2\2\2\u014c\u0152\5 \21\2\u014d\u014e\5"+
		" \21\2\u014e\u014f\7\30\2\2\u014f\u0150\5\60\31\2\u0150\u0152\3\2\2\2"+
		"\u0151\u0147\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d"+
		"\3\2\2\2\u0152\61\3\2\2\2\u0153\u0157\5\66\34\2\u0154\u0157\58\35\2\u0155"+
		"\u0157\5:\36\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\63\3\2\2\2\u0158\u0161\5\62\32\2\u0159\u015a\5\62\32\2\u015a"+
		"\u015b\5\64\33\2\u015b\u0161\3\2\2\2\u015c\u0161\5\6\4\2\u015d\u015e\5"+
		"\6\4\2\u015e\u015f\5\64\33\2\u015f\u0161\3\2\2\2\u0160\u0158\3\2\2\2\u0160"+
		"\u0159\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0161\65\3\2\2"+
		"\2\u0162\u0163\7\5\2\2\u0163\u0164\5> \2\u0164\u0165\5(\25\2\u0165\u0176"+
		"\3\2\2\2\u0166\u0167\7\5\2\2\u0167\u0168\5> \2\u0168\u0169\7\33\2\2\u0169"+
		"\u016a\7\34\2\2\u016a\u0176\3\2\2\2\u016b\u016c\7\5\2\2\u016c\u016d\5"+
		"> \2\u016d\u016e\7\33\2\2\u016e\u016f\5\64\33\2\u016f\u0170\7\34\2\2\u0170"+
		"\u0176\3\2\2\2\u0171\u0172\7\5\2\2\u0172\u0173\5> \2\u0173\u0174\5<\37"+
		"\2\u0174\u0176\3\2\2\2\u0175\u0162\3\2\2\2\u0175\u0166\3\2\2\2\u0175\u016b"+
		"\3\2\2\2\u0175\u0171\3\2\2\2\u0176\67\3\2\2\2\u0177\u0178\7\6\2\2\u0178"+
		"\u0179\5> \2\u0179\u017a\5(\25\2\u017a\u018b\3\2\2\2\u017b\u017c\7\6\2"+
		"\2\u017c\u017d\5> \2\u017d\u017e\7\33\2\2\u017e\u017f\7\34\2\2\u017f\u018b"+
		"\3\2\2\2\u0180\u0181\7\6\2\2\u0181\u0182\5> \2\u0182\u0183\7\33\2\2\u0183"+
		"\u0184\5\64\33\2\u0184\u0185\7\34\2\2\u0185\u018b\3\2\2\2\u0186\u0187"+
		"\7\6\2\2\u0187\u0188\5> \2\u0188\u0189\5<\37\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0177\3\2\2\2\u018a\u017b\3\2\2\2\u018a\u0180\3\2\2\2\u018a\u0186\3\2"+
		"\2\2\u018b9\3\2\2\2\u018c\u018d\7\7\2\2\u018d\u0199\5(\25\2\u018e\u018f"+
		"\7\7\2\2\u018f\u0190\7\33\2\2\u0190\u0199\7\34\2\2\u0191\u0192\7\7\2\2"+
		"\u0192\u0193\7\33\2\2\u0193\u0194\5\64\33\2\u0194\u0195\7\34\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u0197\7\7\2\2\u0197\u0199\5<\37\2\u0198\u018c\3\2"+
		"\2\2\u0198\u018e\3\2\2\2\u0198\u0191\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		";\3\2\2\2\u019a\u01a3\5\66\34\2\u019b\u019c\5\66\34\2\u019c\u019d\5\64"+
		"\33\2\u019d\u01a3\3\2\2\2\u019e\u01a3\5F$\2\u019f\u01a0\5F$\2\u01a0\u01a1"+
		"\5T+\2\u01a1\u01a3\3\2\2\2\u01a2\u019a\3\2\2\2\u01a2\u019b\3\2\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3=\3\2\2\2\u01a4\u01af\5@!\2\u01a5"+
		"\u01a6\5@!\2\u01a6\u01a7\5> \2\u01a7\u01af\3\2\2\2\u01a8\u01af\5B\"\2"+
		"\u01a9\u01aa\5B\"\2\u01aa\u01ab\5> \2\u01ab\u01af\3\2\2\2\u01ac\u01ad"+
		"\7!\2\2\u01ad\u01af\5> \2\u01ae\u01a4\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae"+
		"\u01a8\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af?\3\2\2\2"+
		"\u01b0\u01b5\5D#\2\u01b1\u01b2\5D#\2\u01b2\u01b3\5@!\2\u01b3\u01b5\3\2"+
		"\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5A\3\2\2\2\u01b6\u01b7"+
		"\b\"\1\2\u01b7\u01b8\7\35\2\2\u01b8\u01b9\5> \2\u01b9\u01ba\7\36\2\2\u01ba"+
		"\u01bf\3\2\2\2\u01bb\u01bc\f\3\2\2\u01bc\u01be\7 \2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"C\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u0223\7#\2\2\u01c3\u01c4\7#\2\2\u01c4"+
		"\u0223\t\2\2\2\u01c5\u01c6\7#\2\2\u01c6\u0223\7%\2\2\u01c7\u01c8\7#\2"+
		"\2\u01c8\u01c9\7%\2\2\u01c9\u0223\t\2\2\2\u01ca\u01cb\5$\23\2\u01cb\u01cc"+
		"\7#\2\2\u01cc\u0223\3\2\2\2\u01cd\u01ce\5$\23\2\u01ce\u01cf\7#\2\2\u01cf"+
		"\u01d0\t\2\2\2\u01d0\u0223\3\2\2\2\u01d1\u01d2\5$\23\2\u01d2\u01d3\7#"+
		"\2\2\u01d3\u01d4\7%\2\2\u01d4\u0223\3\2\2\2\u01d5\u01d6\5$\23\2\u01d6"+
		"\u01d7\7#\2\2\u01d7\u01d8\7%\2\2\u01d8\u01d9\t\2\2\2\u01d9\u0223\3\2\2"+
		"\2\u01da\u01db\7#\2\2\u01db\u0223\5&\24\2\u01dc\u01dd\7#\2\2\u01dd\u01de"+
		"\5&\24\2\u01de\u01df\t\2\2\2\u01df\u0223\3\2\2\2\u01e0\u01e1\7#\2\2\u01e1"+
		"\u01e2\5&\24\2\u01e2\u01e3\7%\2\2\u01e3\u0223\3\2\2\2\u01e4\u01e5\7#\2"+
		"\2\u01e5\u01e6\5&\24\2\u01e6\u01e7\7%\2\2\u01e7\u01e8\t\2\2\2\u01e8\u0223"+
		"\3\2\2\2\u01e9\u0223\7\'\2\2\u01ea\u01eb\7\'\2\2\u01eb\u0223\t\2\2\2\u01ec"+
		"\u01ed\7\'\2\2\u01ed\u0223\7%\2\2\u01ee\u01ef\7\'\2\2\u01ef\u01f0\7%\2"+
		"\2\u01f0\u0223\t\2\2\2\u01f1\u0223\7(\2\2\u01f2\u01f3\7(\2\2\u01f3\u0223"+
		"\t\2\2\2\u01f4\u01f5\7(\2\2\u01f5\u0223\7%\2\2\u01f6\u01f7\7(\2\2\u01f7"+
		"\u01f8\7%\2\2\u01f8\u0223\t\2\2\2\u01f9\u0223\5*\26\2\u01fa\u01fb\5*\26"+
		"\2\u01fb\u01fc\t\2\2\2\u01fc\u0223\3\2\2\2\u01fd\u01fe\5*\26\2\u01fe\u01ff"+
		"\7%\2\2\u01ff\u0223\3\2\2\2\u0200\u0201\5*\26\2\u0201\u0202\7%\2\2\u0202"+
		"\u0203\t\2\2\2\u0203\u0223\3\2\2\2\u0204\u0205\7#\2\2\u0205\u0206\7\24"+
		"\2\2\u0206\u0223\5*\26\2\u0207\u0208\7#\2\2\u0208\u0209\7\24\2\2\u0209"+
		"\u020a\5*\26\2\u020a\u020b\t\2\2\2\u020b\u0223\3\2\2\2\u020c\u020d\7#"+
		"\2\2\u020d\u020e\7\24\2\2\u020e\u020f\5*\26\2\u020f\u0210\7%\2\2\u0210"+
		"\u0223\3\2\2\2\u0211\u0212\7#\2\2\u0212\u0213\7\24\2\2\u0213\u0214\5*"+
		"\26\2\u0214\u0215\7%\2\2\u0215\u0216\t\2\2\2\u0216\u0223\3\2\2\2\u0217"+
		"\u0223\5\36\20\2\u0218\u0219\5\36\20\2\u0219\u021a\t\2\2\2\u021a\u0223"+
		"\3\2\2\2\u021b\u021c\5\36\20\2\u021c\u021d\7%\2\2\u021d\u0223\3\2\2\2"+
		"\u021e\u021f\5\36\20\2\u021f\u0220\7%\2\2\u0220\u0221\t\2\2\2\u0221\u0223"+
		"\3\2\2\2\u0222\u01c2\3\2\2\2\u0222\u01c3\3\2\2\2\u0222\u01c5\3\2\2\2\u0222"+
		"\u01c7\3\2\2\2\u0222\u01ca\3\2\2\2\u0222\u01cd\3\2\2\2\u0222\u01d1\3\2"+
		"\2\2\u0222\u01d5\3\2\2\2\u0222\u01da\3\2\2\2\u0222\u01dc\3\2\2\2\u0222"+
		"\u01e0\3\2\2\2\u0222\u01e4\3\2\2\2\u0222\u01e9\3\2\2\2\u0222\u01ea\3\2"+
		"\2\2\u0222\u01ec\3\2\2\2\u0222\u01ee\3\2\2\2\u0222\u01f1\3\2\2\2\u0222"+
		"\u01f2\3\2\2\2\u0222\u01f4\3\2\2\2\u0222\u01f6\3\2\2\2\u0222\u01f9\3\2"+
		"\2\2\u0222\u01fa\3\2\2\2\u0222\u01fd\3\2\2\2\u0222\u0200\3\2\2\2\u0222"+
		"\u0204\3\2\2\2\u0222\u0207\3\2\2\2\u0222\u020c\3\2\2\2\u0222\u0211\3\2"+
		"\2\2\u0222\u0217\3\2\2\2\u0222\u0218\3\2\2\2\u0222\u021b\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0223E\3\2\2\2\u0224\u0225\7\b\2\2\u0225\u0226\5H%\2\u0226"+
		"\u0227\7\33\2\2\u0227\u0228\7\34\2\2\u0228\u0238\3\2\2\2\u0229\u022a\7"+
		"\b\2\2\u022a\u022b\5H%\2\u022b\u022c\7\33\2\2\u022c\u022d\5R*\2\u022d"+
		"\u022e\7\34\2\2\u022e\u0238\3\2\2\2\u022f\u0230\7\b\2\2\u0230\u0231\5"+
		"H%\2\u0231\u0232\5(\25\2\u0232\u0238\3\2\2\2\u0233\u0234\7\b\2\2\u0234"+
		"\u0235\5H%\2\u0235\u0236\5T+\2\u0236\u0238\3\2\2\2\u0237\u0224\3\2\2\2"+
		"\u0237\u0229\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0233\3\2\2\2\u0238G\3"+
		"\2\2\2\u0239\u023a\7\35\2\2\u023a\u023b\5J&\2\u023b\u023c\7\23\2\2\u023c"+
		"\u023d\5L\'\2\u023d\u023e\7\23\2\2\u023e\u023f\5N(\2\u023f\u0240\7\36"+
		"\2\2\u0240\u024c\3\2\2\2\u0241\u0242\5J&\2\u0242\u0243\7\23\2\2\u0243"+
		"\u0244\5L\'\2\u0244\u0245\7\23\2\2\u0245\u0246\5N(\2\u0246\u024c\3\2\2"+
		"\2\u0247\u024c\5> \2\u0248\u0249\7\35\2\2\u0249\u024c\7\36\2\2\u024a\u024c"+
		"\3\2\2\2\u024b\u0239\3\2\2\2\u024b\u0241\3\2\2\2\u024b\u0247\3\2\2\2\u024b"+
		"\u0248\3\2\2\2\u024b\u024a\3\2\2\2\u024cI\3\2\2\2\u024d\u0250\5\22\n\2"+
		"\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250K\3"+
		"\2\2\2\u0251\u0254\5> \2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0252\3\2\2\2\u0254M\3\2\2\2\u0255\u0258\5P)\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258O\3\2\2\2\u0259\u0264\5 \21\2"+
		"\u025a\u0264\5\36\20\2\u025b\u025c\5 \21\2\u025c\u025d\7\30\2\2\u025d"+
		"\u025e\5P)\2\u025e\u0264\3\2\2\2\u025f\u0260\5\36\20\2\u0260\u0261\7\30"+
		"\2\2\u0261\u0262\5P)\2\u0262\u0264\3\2\2\2\u0263\u0259\3\2\2\2\u0263\u025a"+
		"\3\2\2\2\u0263\u025b\3\2\2\2\u0263\u025f\3\2\2\2\u0264Q\3\2\2\2\u0265"+
		"\u026a\5\6\4\2\u0266\u0267\5\6\4\2\u0267\u0268\5R*\2\u0268\u026a\3\2\2"+
		"\2\u0269\u0265\3\2\2\2\u0269\u0266\3\2\2\2\u026aS\3\2\2\2\u026b\u0274"+
		"\5\66\34\2\u026c\u026d\5\66\34\2\u026d\u026e\5T+\2\u026e\u0274\3\2\2\2"+
		"\u026f\u0274\5F$\2\u0270\u0271\5F$\2\u0271\u0272\5T+\2\u0272\u0274\3\2"+
		"\2\2\u0273\u026b\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u026f\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0274U\3\2\2\2\u0275\u0276\7\t\2\2\u0276\u0277\5X-\2\u0277"+
		"\u0278\7\23\2\2\u0278W\3\2\2\2\u0279\u027d\5r:\2\u027a\u027d\5 \21\2\u027b"+
		"\u027d\5\36\20\2\u027c\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3"+
		"\2\2\2\u027dY\3\2\2\2\u027e\u027f\5^\60\2\u027f\u0280\7\33\2\2\u0280\u0281"+
		"\7\34\2\2\u0281\u029d\3\2\2\2\u0282\u0283\5^\60\2\u0283\u0284\7\33\2\2"+
		"\u0284\u0285\5h\65\2\u0285\u0286\7\34\2\2\u0286\u029d\3\2\2\2\u0287\u0288"+
		"\5`\61\2\u0288\u0289\7\33\2\2\u0289\u028a\7\34\2\2\u028a\u029d\3\2\2\2"+
		"\u028b\u028c\5`\61\2\u028c\u028d\7\33\2\2\u028d\u028e\5h\65\2\u028e\u028f"+
		"\7\34\2\2\u028f\u029d\3\2\2\2\u0290\u0291\5d\63\2\u0291\u0292\7\33\2\2"+
		"\u0292\u0293\7\34\2\2\u0293\u029d\3\2\2\2\u0294\u0295\5d\63\2\u0295\u0296"+
		"\7\33\2\2\u0296\u0297\5h\65\2\u0297\u0298\7\34\2\2\u0298\u029d\3\2\2\2"+
		"\u0299\u029a\5f\64\2\u029a\u029b\7\23\2\2\u029b\u029d\3\2\2\2\u029c\u027e"+
		"\3\2\2\2\u029c\u0282\3\2\2\2\u029c\u0287\3\2\2\2\u029c\u028b\3\2\2\2\u029c"+
		"\u0290\3\2\2\2\u029c\u0294\3\2\2\2\u029c\u0299\3\2\2\2\u029d[\3\2\2\2"+
		"\u029e\u029f\7\n\2\2\u029f\u02a0\7#\2\2\u02a0\u02a1\7\35\2\2\u02a1\u02b7"+
		"\7\36\2\2\u02a2\u02a3\7\n\2\2\u02a3\u02a4\7#\2\2\u02a4\u02a5\7\35\2\2"+
		"\u02a5\u02a6\7\36\2\2\u02a6\u02a7\7\22\2\2\u02a7\u02b7\7#\2\2\u02a8\u02a9"+
		"\7\n\2\2\u02a9\u02aa\7#\2\2\u02aa\u02ab\7\35\2\2\u02ab\u02ac\5j\66\2\u02ac"+
		"\u02ad\7\36\2\2\u02ad\u02b7\3\2\2\2\u02ae\u02af\7\n\2\2\u02af\u02b0\7"+
		"#\2\2\u02b0\u02b1\7\35\2\2\u02b1\u02b2\5j\66\2\u02b2\u02b3\7\36\2\2\u02b3"+
		"\u02b4\7\22\2\2\u02b4\u02b5\7#\2\2\u02b5\u02b7\3\2\2\2\u02b6\u029e\3\2"+
		"\2\2\u02b6\u02a2\3\2\2\2\u02b6\u02a8\3\2\2\2\u02b6\u02ae\3\2\2\2\u02b7"+
		"]\3\2\2\2\u02b8\u02b9\5\\/\2\u02b9_\3\2\2\2\u02ba\u02bb\5b\62\2\u02bb"+
		"\u02bc\5\\/\2\u02bc\u02cf\3\2\2\2\u02bd\u02be\7\16\2\2\u02be\u02cf\5\\"+
		"/\2\u02bf\u02c0\5b\62\2\u02c0\u02c1\7\16\2\2\u02c1\u02c2\5\\/\2\u02c2"+
		"\u02cf\3\2\2\2\u02c3\u02c4\7\17\2\2\u02c4\u02c5\5b\62\2\u02c5\u02c6\7"+
		"\16\2\2\u02c6\u02c7\5\\/\2\u02c7\u02cf\3\2\2\2\u02c8\u02c9\7\17\2\2\u02c9"+
		"\u02ca\5b\62\2\u02ca\u02cb\5\\/\2\u02cb\u02cf\3\2\2\2\u02cc\u02cd\7\17"+
		"\2\2\u02cd\u02cf\5\\/\2\u02ce\u02ba\3\2\2\2\u02ce\u02bd\3\2\2\2\u02ce"+
		"\u02bf\3\2\2\2\u02ce\u02c3\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02cc\3\2"+
		"\2\2\u02cfa\3\2\2\2\u02d0\u02d1\t\3\2\2\u02d1c\3\2\2\2\u02d2\u02d3\7#"+
		"\2\2\u02d3\u02d4\7\35\2\2\u02d4\u02db\7\36\2\2\u02d5\u02d6\7#\2\2\u02d6"+
		"\u02d7\7\35\2\2\u02d7\u02d8\5j\66\2\u02d8\u02d9\7\36\2\2\u02d9\u02db\3"+
		"\2\2\2\u02da\u02d2\3\2\2\2\u02da\u02d5\3\2\2\2\u02dbe\3\2\2\2\u02dc\u02df"+
		"\5^\60\2\u02dd\u02df\5`\61\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df"+
		"g\3\2\2\2\u02e0\u02e5\5\6\4\2\u02e1\u02e2\5\6\4\2\u02e2\u02e3\5h\65\2"+
		"\u02e3\u02e5\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e5i\3"+
		"\2\2\2\u02e6\u02ec\5l\67\2\u02e7\u02e8\5l\67\2\u02e8\u02e9\7\30\2\2\u02e9"+
		"\u02ea\5j\66\2\u02ea\u02ec\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb\u02e7\3\2"+
		"\2\2\u02eck\3\2\2\2\u02ed\u02ee\7#\2\2\u02ee\u02ef\7%\2\2\u02efm\3\2\2"+
		"\2\u02f0\u02f1\5p9\2\u02f1o\3\2\2\2\u02f2\u02f3\7\20\2\2\u02f3\u02f4\7"+
		"#\2\2\u02f4\u02f5\7\33\2\2\u02f5\u030b\7\34\2\2\u02f6\u02f7\7\20\2\2\u02f7"+
		"\u02f8\7#\2\2\u02f8\u02f9\7\33\2\2\u02f9\u02fa\5h\65\2\u02fa\u02fb\7\34"+
		"\2\2\u02fb\u030b\3\2\2\2\u02fc\u02fd\7\20\2\2\u02fd\u02fe\7#\2\2\u02fe"+
		"\u02ff\7\21\2\2\u02ff\u0300\7#\2\2\u0300\u0301\7\33\2\2\u0301\u030b\7"+
		"\34\2\2\u0302\u0303\7\20\2\2\u0303\u0304\7#\2\2\u0304\u0305\7\21\2\2\u0305"+
		"\u0306\7#\2\2\u0306\u0307\7\33\2\2\u0307\u0308\5h\65\2\u0308\u0309\7\34"+
		"\2\2\u0309\u030b\3\2\2\2\u030a\u02f2\3\2\2\2\u030a\u02f6\3\2\2\2\u030a"+
		"\u02fc\3\2\2\2\u030a\u0302\3\2\2\2\u030bq\3\2\2\2\u030c\u031b\7#\2\2\u030d"+
		"\u030e\7#\2\2\u030e\u031b\7%\2\2\u030f\u031b\7\'\2\2\u0310\u0311\7\'\2"+
		"\2\u0311\u031b\7%\2\2\u0312\u031b\7(\2\2\u0313\u0314\7(\2\2\u0314\u031b"+
		"\7%\2\2\u0315\u031b\7&\2\2\u0316\u031b\5\26\f\2\u0317\u031b\5\32\16\2"+
		"\u0318\u031b\5\36\20\2\u0319\u031b\5*\26\2\u031a\u030c\3\2\2\2\u031a\u030d"+
		"\3\2\2\2\u031a\u030f\3\2\2\2\u031a\u0310\3\2\2\2\u031a\u0312\3\2\2\2\u031a"+
		"\u0313\3\2\2\2\u031a\u0315\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u0317\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031bs\3\2\2\2,|\u0088\u0095"+
		"\u00a2\u00ab\u00b3\u00ba\u00c2\u00cd\u00d7\u0126\u013b\u0145\u0151\u0156"+
		"\u0160\u0175\u018a\u0198\u01a2\u01ae\u01b4\u01bf\u0222\u0237\u024b\u024f"+
		"\u0253\u0257\u0263\u0269\u0273\u027c\u029c\u02b6\u02ce\u02da\u02de\u02e4"+
		"\u02eb\u030a\u031a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}