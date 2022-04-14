// Generated from /home/user/projects/sdk/vm/grammar/TParser.g4 by ANTLR 4.8
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
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, Class=17, 
		Implements=18, New=19, Break=20, Next=21, ArrowRight=22, ARightLB=23, 
		End=24, Attr=25, Point=26, TwoPoint=27, TwoTwoPoint=28, Separator=29, 
		OpenArIndex=30, CloseArIndex=31, OpenBlock=32, CloseBlock=33, OpenOp=34, 
		CloseOp=35, ArithmeticOperator=36, AssignmentOperator=37, Not=38, IncDecOperators=39, 
		Identifier=40, IDPrefix=41, TypeSpec=42, String=43, Integer=44, Float=45, 
		Whitespace=46, Newline=47, Words=48, BlockComment=49, LineComment=50;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_breakFor = 4, RULE_nextFor = 5, RULE_use = 6, RULE_useValue = 7, 
		RULE_useString = 8, RULE_variable = 9, RULE_variableModes = 10, RULE_variableModesBkp = 11, 
		RULE_variableMembers = 12, RULE_variableDefinition = 13, RULE_variableDefinitionGeneral = 14, 
		RULE_indexArray = 15, RULE_indexArrayElements = 16, RULE_associativeArray = 17, 
		RULE_associativeArrayElements = 18, RULE_operationBlock = 19, RULE_operationElements = 20, 
		RULE_operationValue = 21, RULE_firstIncDec = 22, RULE_lastIncDec = 23, 
		RULE_callingFunction = 24, RULE_functionCall = 25, RULE_functionCallParamAC = 26, 
		RULE_methodCascadingModes = 27, RULE_functionCallCascading = 28, RULE_functionCallCascadingItem = 29, 
		RULE_identifierB = 30, RULE_pointSeparator = 31, RULE_functionCallParam = 32, 
		RULE_functionCallParamElements = 33, RULE_conditionalExpression = 34, 
		RULE_conditionalExpressionStructBlock = 35, RULE_ifElementUnique = 36, 
		RULE_elifElements = 37, RULE_elifElementUnique = 38, RULE_elseElementUnique = 39, 
		RULE_conditionalExpressionItems = 40, RULE_conditionalBlockElements = 41, 
		RULE_conditionalBlockElsItems = 42, RULE_conditionalExpressionElements = 43, 
		RULE_conditionExpValue = 44, RULE_conditionExpBlock = 45, RULE_conditionExpBlockItemValue = 46, 
		RULE_conditionExpBlockItem = 47, RULE_conditionalExpValue = 48, RULE_functionCallAndAttr = 49, 
		RULE_identifierAttrFn = 50, RULE_functionCallAttrFn = 51, RULE_functionCallAttrFnItem = 52, 
		RULE_loop = 53, RULE_loopExpressionItems = 54, RULE_loopExpression = 55, 
		RULE_loopInfinite = 56, RULE_loopComplete = 57, RULE_loopConditional = 58, 
		RULE_endOne = 59, RULE_endTwo = 60, RULE_loopOneMembers = 61, RULE_loopTwoMembers = 62, 
		RULE_loopThreeMembers = 63, RULE_loopThreeMembersValues = 64, RULE_loopBlockElements = 65, 
		RULE_loopBlockElementsLimited = 66, RULE_ret = 67, RULE_retValues = 68, 
		RULE_functions = 69, RULE_functionsModes = 70, RULE_functionGeneralModes = 71, 
		RULE_identifierRet = 72, RULE_functionMethodsModes = 73, RULE_functionMethodsModesBkp = 74, 
		RULE_methodPerm = 75, RULE_visibilityItems = 76, RULE_methodVisibility = 77, 
		RULE_constructClassMethod = 78, RULE_interfaceMethod = 79, RULE_functionCodeBlock = 80, 
		RULE_functionCodeBlockElements = 81, RULE_functionParams = 82, RULE_functionParamsControl = 83, 
		RULE_functionParamElements = 84, RULE_oopGeneral = 85, RULE_interfaceClass = 86, 
		RULE_interfaceClassDefinition = 87, RULE_interfaceCodeBlock = 88, RULE_abstractClass = 89, 
		RULE_abstractClassDefinition = 90, RULE_abstractCodeBlock = 91, RULE_classDefination = 92, 
		RULE_classCodeBlock = 93, RULE_classModes = 94, RULE_identifierC = 95, 
		RULE_anonymousClassCall = 96, RULE_anonymousClassCallExpr = 97, RULE_anonymousClass = 98, 
		RULE_anonymousClassElements = 99, RULE_arrayAccessElements = 100, RULE_arrayAccessElementsItems = 101, 
		RULE_accessBlockAr = 102, RULE_arrayIndexAccess = 103, RULE_anonymousFunction = 104, 
		RULE_anFnItems = 105, RULE_functionsModesFn = 106, RULE_anonymousObjectCall = 107, 
		RULE_anonymousObjectCallExpr = 108, RULE_anonymousObject = 109, RULE_variableMultipleAssignments = 110, 
		RULE_variableMultipleAssignmentsModes = 111, RULE_variableMultipleAItems = 112, 
		RULE_lambdaFunctions = 113, RULE_lambdaFnParams = 114, RULE_lambdaFnRet = 115, 
		RULE_lambdaFnCodeBlock = 116, RULE_lambdaFnCodeBlockItems = 117, RULE_generalValue = 118, 
		RULE_objIdentifierA = 119, RULE_objIdentifierB = 120;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "breakFor", "nextFor", 
			"use", "useValue", "useString", "variable", "variableModes", "variableModesBkp", 
			"variableMembers", "variableDefinition", "variableDefinitionGeneral", 
			"indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
			"operationBlock", "operationElements", "operationValue", "firstIncDec", 
			"lastIncDec", "callingFunction", "functionCall", "functionCallParamAC", 
			"methodCascadingModes", "functionCallCascading", "functionCallCascadingItem", 
			"identifierB", "pointSeparator", "functionCallParam", "functionCallParamElements", 
			"conditionalExpression", "conditionalExpressionStructBlock", "ifElementUnique", 
			"elifElements", "elifElementUnique", "elseElementUnique", "conditionalExpressionItems", 
			"conditionalBlockElements", "conditionalBlockElsItems", "conditionalExpressionElements", 
			"conditionExpValue", "conditionExpBlock", "conditionExpBlockItemValue", 
			"conditionExpBlockItem", "conditionalExpValue", "functionCallAndAttr", 
			"identifierAttrFn", "functionCallAttrFn", "functionCallAttrFnItem", "loop", 
			"loopExpressionItems", "loopExpression", "loopInfinite", "loopComplete", 
			"loopConditional", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
			"ret", "retValues", "functions", "functionsModes", "functionGeneralModes", 
			"identifierRet", "functionMethodsModes", "functionMethodsModesBkp", "methodPerm", 
			"visibilityItems", "methodVisibility", "constructClassMethod", "interfaceMethod", 
			"functionCodeBlock", "functionCodeBlockElements", "functionParams", "functionParamsControl", 
			"functionParamElements", "oopGeneral", "interfaceClass", "interfaceClassDefinition", 
			"interfaceCodeBlock", "abstractClass", "abstractClassDefinition", "abstractCodeBlock", 
			"classDefination", "classCodeBlock", "classModes", "identifierC", "anonymousClassCall", 
			"anonymousClassCallExpr", "anonymousClass", "anonymousClassElements", 
			"arrayAccessElements", "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", 
			"anonymousFunction", "anFnItems", "functionsModesFn", "anonymousObjectCall", 
			"anonymousObjectCallExpr", "anonymousObject", "variableMultipleAssignments", 
			"variableMultipleAssignmentsModes", "variableMultipleAItems", "lambdaFunctions", 
			"lambdaFnParams", "lambdaFnRet", "lambdaFnCodeBlock", "lambdaFnCodeBlockItems", 
			"generalValue", "objIdentifierA", "objIdentifierB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'->'", "'=>'", "';'", "'='", "'.'", "':'", "'::'", "','", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "ARightLB", 
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
			setState(242);
			fileContent();
			setState(243);
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
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FileContentContext fileContent() {
			return getRuleContext(FileContentContext.class,0);
		}
		public FileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileContent; }
	}

	public final FileContentContext fileContent() throws RecognitionException {
		FileContentContext _localctx = new FileContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileContent);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				sentence();
				setState(247);
				fileContent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
		public AnonymousClassCallContext anonymousClassCall() {
			return getRuleContext(AnonymousClassCallContext.class,0);
		}
		public AnonymousObjectCallContext anonymousObjectCall() {
			return getRuleContext(AnonymousObjectCallContext.class,0);
		}
		public VariableMultipleAssignmentsContext variableMultipleAssignments() {
			return getRuleContext(VariableMultipleAssignmentsContext.class,0);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				oopGeneral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				anonymousClassCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(262);
				anonymousObjectCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				variableMultipleAssignments();
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
		public BreakForContext breakFor() {
			return getRuleContext(BreakForContext.class,0);
		}
		public NextForContext nextFor() {
			return getRuleContext(NextForContext.class,0);
		}
		public LiveTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liveToken; }
	}

	public final LiveTokenContext liveToken() throws RecognitionException {
		LiveTokenContext _localctx = new LiveTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liveToken);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				nextFor();
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

	public static class BreakForContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BreakForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakFor; }
	}

	public final BreakForContext breakFor() throws RecognitionException {
		BreakForContext _localctx = new BreakForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_breakFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(Break);
			setState(272);
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

	public static class NextForContext extends ParserRuleContext {
		public TerminalNode Next() { return getToken(TParser.Next, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public NextForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextFor; }
	}

	public final NextForContext nextFor() throws RecognitionException {
		NextForContext _localctx = new NextForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nextFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Next);
			setState(275);
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
		enterRule(_localctx, 12, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Use);
			setState(278);
			useValue();
			setState(279);
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
		enterRule(_localctx, 14, RULE_useValue);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				useString();
				setState(283);
				match(Separator);
				setState(284);
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
		enterRule(_localctx, 16, RULE_useString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		public VariableModesContext variableModes() {
			return getRuleContext(VariableModesContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			variableModes();
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

	public static class VariableModesContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public MethodVisibilityContext methodVisibility() {
			return getRuleContext(MethodVisibilityContext.class,0);
		}
		public VariableModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModes; }
	}

	public final VariableModesContext variableModes() throws RecognitionException {
		VariableModesContext _localctx = new VariableModesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableModes);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(Var);
				setState(293);
				variableMembers();
				setState(294);
				match(End);
				}
				break;
			case Pub:
			case Pro:
			case Priv:
			case Static:
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				methodVisibility();
				setState(297);
				match(Var);
				setState(298);
				variableMembers();
				setState(299);
				match(End);
				}
				break;
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				variableMembers();
				setState(302);
				match(End);
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

	public static class VariableModesBkpContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public MethodPermContext methodPerm() {
			return getRuleContext(MethodPermContext.class,0);
		}
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public VariableModesBkpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModesBkp; }
	}

	public final VariableModesBkpContext variableModesBkp() throws RecognitionException {
		VariableModesBkpContext _localctx = new VariableModesBkpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableModesBkp);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(Var);
				setState(307);
				variableMembers();
				setState(308);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				methodPerm();
				setState(311);
				match(Var);
				setState(312);
				variableMembers();
				setState(313);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(Static);
				setState(316);
				match(Var);
				setState(317);
				variableMembers();
				setState(318);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				methodPerm();
				setState(321);
				match(Static);
				setState(322);
				match(Var);
				setState(323);
				variableMembers();
				setState(324);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(Final);
				setState(327);
				methodPerm();
				setState(328);
				match(Static);
				setState(329);
				match(Var);
				setState(330);
				variableMembers();
				setState(331);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(Final);
				setState(334);
				methodPerm();
				setState(335);
				match(Var);
				setState(336);
				variableMembers();
				setState(337);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				match(Final);
				setState(340);
				match(Var);
				setState(341);
				variableMembers();
				setState(342);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				match(Final);
				setState(345);
				match(Static);
				setState(346);
				match(Var);
				setState(347);
				variableMembers();
				setState(348);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				variableMembers();
				setState(351);
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
		enterRule(_localctx, 24, RULE_variableMembers);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				variableDefinition();
				setState(357);
				match(Separator);
				setState(358);
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
		public VariableDefinitionGeneralContext variableDefinitionGeneral() {
			return getRuleContext(VariableDefinitionGeneralContext.class,0);
		}
		public ObjIdentifierAContext objIdentifierA() {
			return getRuleContext(ObjIdentifierAContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public ObjIdentifierBContext objIdentifierB() {
			return getRuleContext(ObjIdentifierBContext.class,0);
		}
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDefinition);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(Identifier);
				setState(363);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				objIdentifierA();
				setState(365);
				match(Point);
				setState(366);
				objIdentifierB();
				setState(367);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				objIdentifierA();
				setState(370);
				match(TwoTwoPoint);
				setState(371);
				objIdentifierB();
				setState(372);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				arrayAccessElements();
				setState(375);
				variableDefinitionGeneral();
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

	public static class VariableDefinitionGeneralContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public VariableDefinitionGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionGeneral; }
	}

	public final VariableDefinitionGeneralContext variableDefinitionGeneral() throws RecognitionException {
		VariableDefinitionGeneralContext _localctx = new VariableDefinitionGeneralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDefinitionGeneral);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(TypeSpec);
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				match(New);
				setState(386);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(TypeSpec);
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				match(New);
				setState(390);
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
		enterRule(_localctx, 30, RULE_indexArray);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(OpenArIndex);
				setState(394);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(OpenArIndex);
				setState(396);
				indexArrayElements();
				setState(397);
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
		enterRule(_localctx, 32, RULE_indexArrayElements);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				generalValue();
				setState(403);
				match(Separator);
				setState(404);
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
		enterRule(_localctx, 34, RULE_associativeArray);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(OpenBlock);
				setState(409);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OpenBlock);
				setState(411);
				associativeArrayElements();
				setState(412);
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
		enterRule(_localctx, 36, RULE_associativeArrayElements);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(Identifier);
				setState(417);
				match(TwoPoint);
				setState(418);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(Identifier);
				setState(420);
				match(TwoPoint);
				setState(421);
				generalValue();
				setState(422);
				match(Separator);
				setState(423);
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
		enterRule(_localctx, 38, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(OpenOp);
			setState(428);
			operationElements();
			setState(429);
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
		enterRule(_localctx, 40, RULE_operationElements);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				operationValue();
				setState(433);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public OperationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationValue; }
	}

	public final OperationValueContext operationValue() throws RecognitionException {
		OperationValueContext _localctx = new OperationValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operationValue);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				functionCall();
				setState(439);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				functionCall();
				setState(442);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				functionCall();
				setState(445);
				match(TypeSpec);
				setState(446);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				match(Identifier);
				setState(450);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				match(Identifier);
				setState(452);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				match(Identifier);
				setState(454);
				match(TypeSpec);
				setState(455);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(456);
				firstIncDec();
				setState(457);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(459);
				firstIncDec();
				setState(460);
				match(Identifier);
				setState(461);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(463);
				firstIncDec();
				setState(464);
				match(Identifier);
				setState(465);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(467);
				firstIncDec();
				setState(468);
				match(Identifier);
				setState(469);
				match(TypeSpec);
				setState(470);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(472);
				match(Identifier);
				setState(473);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(474);
				match(Identifier);
				setState(475);
				lastIncDec();
				setState(476);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(478);
				match(Identifier);
				setState(479);
				lastIncDec();
				setState(480);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(482);
				match(Identifier);
				setState(483);
				lastIncDec();
				setState(484);
				match(TypeSpec);
				setState(485);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(487);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(488);
				match(Integer);
				setState(489);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(490);
				match(Integer);
				setState(491);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(492);
				match(Integer);
				setState(493);
				match(TypeSpec);
				setState(494);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(495);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(496);
				match(Float);
				setState(497);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(498);
				match(Float);
				setState(499);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(500);
				match(Float);
				setState(501);
				match(TypeSpec);
				setState(502);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(503);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(504);
				operationBlock();
				setState(505);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(507);
				operationBlock();
				setState(508);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(510);
				operationBlock();
				setState(511);
				match(TypeSpec);
				setState(512);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(514);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(515);
				arrayAccessElements();
				setState(516);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(518);
				arrayAccessElements();
				setState(519);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(521);
				arrayAccessElements();
				setState(522);
				match(TypeSpec);
				setState(523);
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
		enterRule(_localctx, 44, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		enterRule(_localctx, 46, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
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
		enterRule(_localctx, 48, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			functionCall();
			setState(532);
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
		public MethodCascadingModesContext methodCascadingModes() {
			return getRuleContext(MethodCascadingModesContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public FunctionCallParamACContext functionCallParamAC() {
			return getRuleContext(FunctionCallParamACContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(Identifier);
				setState(535);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(Identifier);
				setState(537);
				match(Point);
				setState(538);
				identifierB();
				setState(539);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(Identifier);
				setState(542);
				match(TwoTwoPoint);
				setState(543);
				identifierB();
				setState(544);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				arrayAccessElements();
				setState(548);
				functionCallParamAC();
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

	public static class FunctionCallParamACContext extends ParserRuleContext {
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public FunctionCallParamACContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParamAC; }
	}

	public final FunctionCallParamACContext functionCallParamAC() throws RecognitionException {
		FunctionCallParamACContext _localctx = new FunctionCallParamACContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCallParamAC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			functionCallParam();
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

	public static class MethodCascadingModesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public MethodCascadingModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCascadingModes; }
	}

	public final MethodCascadingModesContext methodCascadingModes() throws RecognitionException {
		MethodCascadingModesContext _localctx = new MethodCascadingModesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodCascadingModes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(Identifier);
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==Point || _la==TwoTwoPoint) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(556);
			functionCallCascading();
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

	public static class FunctionCallCascadingContext extends ParserRuleContext {
		public FunctionCallCascadingItemContext functionCallCascadingItem() {
			return getRuleContext(FunctionCallCascadingItemContext.class,0);
		}
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallCascadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallCascading; }
	}

	public final FunctionCallCascadingContext functionCallCascading() throws RecognitionException {
		FunctionCallCascadingContext _localctx = new FunctionCallCascadingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCallCascading);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				functionCallCascadingItem();
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				functionCallCascading();
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

	public static class FunctionCallCascadingItemContext extends ParserRuleContext {
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public FunctionCallParamACContext functionCallParamAC() {
			return getRuleContext(FunctionCallParamACContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallCascadingItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallCascadingItem; }
	}

	public final FunctionCallCascadingItemContext functionCallCascadingItem() throws RecognitionException {
		FunctionCallCascadingItemContext _localctx = new FunctionCallCascadingItemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCallCascadingItem);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				identifierB();
				setState(566);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				arrayAccessElements();
				setState(569);
				functionCallParamAC();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
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

	public static class IdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierB; }
	}

	public final IdentifierBContext identifierB() throws RecognitionException {
		IdentifierBContext _localctx = new IdentifierBContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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

	public static class PointSeparatorContext extends ParserRuleContext {
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public PointSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointSeparator; }
	}

	public final PointSeparatorContext pointSeparator() throws RecognitionException {
		PointSeparatorContext _localctx = new PointSeparatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pointSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(Point);
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
		enterRule(_localctx, 64, RULE_functionCallParam);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(OpenOp);
				setState(579);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(OpenOp);
				setState(581);
				functionCallParamElements();
				setState(582);
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
		enterRule(_localctx, 66, RULE_functionCallParamElements);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				generalValue();
				setState(588);
				match(Separator);
				setState(589);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				operationElements();
				setState(593);
				match(Separator);
				setState(594);
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
		public ConditionalExpressionStructBlockContext conditionalExpressionStructBlock() {
			return getRuleContext(ConditionalExpressionStructBlockContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalExpression);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				conditionalExpressionStructBlock();
				setState(600);
				conditionalExpression();
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

	public static class ConditionalExpressionStructBlockContext extends ParserRuleContext {
		public IfElementUniqueContext ifElementUnique() {
			return getRuleContext(IfElementUniqueContext.class,0);
		}
		public ElifElementsContext elifElements() {
			return getRuleContext(ElifElementsContext.class,0);
		}
		public ElseElementUniqueContext elseElementUnique() {
			return getRuleContext(ElseElementUniqueContext.class,0);
		}
		public ConditionalExpressionStructBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionStructBlock; }
	}

	public final ConditionalExpressionStructBlockContext conditionalExpressionStructBlock() throws RecognitionException {
		ConditionalExpressionStructBlockContext _localctx = new ConditionalExpressionStructBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalExpressionStructBlock);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				ifElementUnique();
				setState(606);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				ifElementUnique();
				setState(609);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				ifElementUnique();
				setState(612);
				elifElements();
				setState(613);
				elseElementUnique();
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

	public static class IfElementUniqueContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalExpressionItemsContext conditionalExpressionItems() {
			return getRuleContext(ConditionalExpressionItemsContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public IfElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElementUnique; }
	}

	public final IfElementUniqueContext ifElementUnique() throws RecognitionException {
		IfElementUniqueContext _localctx = new IfElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(If);
			setState(618);
			conditionalExpressionItems();
			setState(619);
			conditionalBlockElements();
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

	public static class ElifElementsContext extends ParserRuleContext {
		public ElifElementUniqueContext elifElementUnique() {
			return getRuleContext(ElifElementUniqueContext.class,0);
		}
		public ElifElementsContext elifElements() {
			return getRuleContext(ElifElementsContext.class,0);
		}
		public ElifElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifElements; }
	}

	public final ElifElementsContext elifElements() throws RecognitionException {
		ElifElementsContext _localctx = new ElifElementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elifElements);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				elifElementUnique();
				setState(623);
				elifElements();
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

	public static class ElifElementUniqueContext extends ParserRuleContext {
		public TerminalNode Elif() { return getToken(TParser.Elif, 0); }
		public ConditionalExpressionItemsContext conditionalExpressionItems() {
			return getRuleContext(ConditionalExpressionItemsContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public ElifElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifElementUnique; }
	}

	public final ElifElementUniqueContext elifElementUnique() throws RecognitionException {
		ElifElementUniqueContext _localctx = new ElifElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(Elif);
			setState(628);
			conditionalExpressionItems();
			setState(629);
			conditionalBlockElements();
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

	public static class ElseElementUniqueContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TParser.Else, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public ElseElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseElementUnique; }
	}

	public final ElseElementUniqueContext elseElementUnique() throws RecognitionException {
		ElseElementUniqueContext _localctx = new ElseElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(Else);
			setState(632);
			conditionalBlockElements();
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

	public static class ConditionalExpressionItemsContext extends ParserRuleContext {
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public ConditionalExpressionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionItems; }
	}

	public final ConditionalExpressionItemsContext conditionalExpressionItems() throws RecognitionException {
		ConditionalExpressionItemsContext _localctx = new ConditionalExpressionItemsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			conditionalExpressionElements();
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
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElsItemsContext conditionalBlockElsItems() {
			return getRuleContext(ConditionalBlockElsItemsContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ConditionalBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElements; }
	}

	public final ConditionalBlockElementsContext conditionalBlockElements() throws RecognitionException {
		ConditionalBlockElementsContext _localctx = new ConditionalBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conditionalBlockElements);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(OpenBlock);
				setState(637);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(OpenBlock);
				setState(639);
				conditionalBlockElsItems();
				setState(640);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(645);
				ret();
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

	public static class ConditionalBlockElsItemsContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ConditionalBlockElsItemsContext conditionalBlockElsItems() {
			return getRuleContext(ConditionalBlockElsItemsContext.class,0);
		}
		public ConditionalBlockElsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElsItems; }
	}

	public final ConditionalBlockElsItemsContext conditionalBlockElsItems() throws RecognitionException {
		ConditionalBlockElsItemsContext _localctx = new ConditionalBlockElsItemsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalBlockElsItems);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				sentence();
				setState(650);
				conditionalBlockElsItems();
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
		public ConditionExpValueContext conditionExpValue() {
			return getRuleContext(ConditionExpValueContext.class,0);
		}
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public ConditionExpBlockContext conditionExpBlock() {
			return getRuleContext(ConditionExpBlockContext.class,0);
		}
		public ConditionalExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionElements; }
	}

	public final ConditionalExpressionElementsContext conditionalExpressionElements() throws RecognitionException {
		ConditionalExpressionElementsContext _localctx = new ConditionalExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalExpressionElements);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				conditionExpValue();
				setState(656);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				conditionExpBlock();
				setState(660);
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

	public static class ConditionExpValueContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public ConditionalExpValueContext conditionalExpValue() {
			return getRuleContext(ConditionalExpValueContext.class,0);
		}
		public ConditionExpValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpValue; }
	}

	public final ConditionExpValueContext conditionExpValue() throws RecognitionException {
		ConditionExpValueContext _localctx = new ConditionExpValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionExpValue);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(Not);
				setState(665);
				conditionalExpValue();
				}
				break;
			case OpenOp:
			case IncDecOperators:
			case Identifier:
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				conditionalExpValue();
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

	public static class ConditionExpBlockContext extends ParserRuleContext {
		public ConditionExpBlockItemValueContext conditionExpBlockItemValue() {
			return getRuleContext(ConditionExpBlockItemValueContext.class,0);
		}
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public ConditionExpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlock; }
	}

	public final ConditionExpBlockContext conditionExpBlock() throws RecognitionException {
		ConditionExpBlockContext _localctx = new ConditionExpBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_conditionExpBlock);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(Not);
				setState(671);
				conditionExpBlockItemValue();
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

	public static class ConditionExpBlockItemValueContext extends ParserRuleContext {
		public ConditionExpBlockItemContext conditionExpBlockItem() {
			return getRuleContext(ConditionExpBlockItemContext.class,0);
		}
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public ConditionExpBlockItemValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlockItemValue; }
	}

	public final ConditionExpBlockItemValueContext conditionExpBlockItemValue() throws RecognitionException {
		ConditionExpBlockItemValueContext _localctx = new ConditionExpBlockItemValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditionExpBlockItemValue);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				conditionExpBlockItem();
				setState(676);
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
				setState(678);
				conditionExpBlockItem();
				setState(679);
				match(TypeSpec);
				setState(680);
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

	public static class ConditionExpBlockItemContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public ConditionExpBlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlockItem; }
	}

	public final ConditionExpBlockItemContext conditionExpBlockItem() throws RecognitionException {
		ConditionExpBlockItemContext _localctx = new ConditionExpBlockItemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditionExpBlockItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(OpenOp);
			setState(685);
			conditionalExpressionElements();
			setState(686);
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

	public static class ConditionalExpValueContext extends ParserRuleContext {
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public FunctionCallAndAttrContext functionCallAndAttr() {
			return getRuleContext(FunctionCallAndAttrContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public ConditionalExpValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpValue; }
	}

	public final ConditionalExpValueContext conditionalExpValue() throws RecognitionException {
		ConditionalExpValueContext _localctx = new ConditionalExpValueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_conditionalExpValue);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				firstIncDec();
				setState(689);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				firstIncDec();
				setState(692);
				match(Identifier);
				setState(693);
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
				setState(695);
				firstIncDec();
				setState(696);
				match(Identifier);
				setState(697);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				firstIncDec();
				setState(700);
				match(Identifier);
				setState(701);
				match(TypeSpec);
				setState(702);
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
				setState(704);
				match(Identifier);
				setState(705);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(706);
				match(Identifier);
				setState(707);
				lastIncDec();
				setState(708);
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
				setState(710);
				match(Identifier);
				setState(711);
				lastIncDec();
				setState(712);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(714);
				match(Identifier);
				setState(715);
				lastIncDec();
				setState(716);
				match(TypeSpec);
				setState(717);
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
				setState(719);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(720);
				match(Integer);
				setState(721);
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
				setState(722);
				match(Integer);
				setState(723);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(724);
				match(Integer);
				setState(725);
				match(TypeSpec);
				setState(726);
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
				setState(727);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(728);
				match(Float);
				setState(729);
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
				setState(730);
				match(Float);
				setState(731);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(732);
				match(Float);
				setState(733);
				match(TypeSpec);
				setState(734);
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
				setState(735);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(736);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(737);
				functionCall();
				setState(738);
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(740);
				functionCall();
				setState(741);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(743);
				functionCall();
				setState(744);
				match(TypeSpec);
				setState(745);
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
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(747);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(748);
				operationBlock();
				setState(749);
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(751);
				operationBlock();
				setState(752);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(754);
				operationBlock();
				setState(755);
				match(TypeSpec);
				setState(756);
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
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(758);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(759);
				match(Identifier);
				setState(760);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(761);
				match(Identifier);
				setState(762);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(763);
				match(Identifier);
				setState(764);
				match(TypeSpec);
				setState(765);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(766);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(767);
				arrayAccessElements();
				setState(768);
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(770);
				arrayAccessElements();
				setState(771);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(773);
				arrayAccessElements();
				setState(774);
				match(TypeSpec);
				setState(775);
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

	public static class FunctionCallAndAttrContext extends ParserRuleContext {
		public IdentifierAttrFnContext identifierAttrFn() {
			return getRuleContext(IdentifierAttrFnContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public FunctionCallAttrFnContext functionCallAttrFn() {
			return getRuleContext(FunctionCallAttrFnContext.class,0);
		}
		public FunctionCallAndAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallAndAttr; }
	}

	public final FunctionCallAndAttrContext functionCallAndAttr() throws RecognitionException {
		FunctionCallAndAttrContext _localctx = new FunctionCallAndAttrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionCallAndAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			identifierAttrFn();
			setState(780);
			match(Attr);
			setState(781);
			functionCallAttrFn();
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

	public static class IdentifierAttrFnContext extends ParserRuleContext {
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierAttrFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierAttrFn; }
	}

	public final IdentifierAttrFnContext identifierAttrFn() throws RecognitionException {
		IdentifierAttrFnContext _localctx = new IdentifierAttrFnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierAttrFn);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
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

	public static class FunctionCallAttrFnContext extends ParserRuleContext {
		public FunctionCallAttrFnItemContext functionCallAttrFnItem() {
			return getRuleContext(FunctionCallAttrFnItemContext.class,0);
		}
		public FunctionCallAttrFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallAttrFn; }
	}

	public final FunctionCallAttrFnContext functionCallAttrFn() throws RecognitionException {
		FunctionCallAttrFnContext _localctx = new FunctionCallAttrFnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionCallAttrFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			functionCallAttrFnItem();
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

	public static class FunctionCallAttrFnItemContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FunctionCallAttrFnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallAttrFnItem; }
	}

	public final FunctionCallAttrFnItemContext functionCallAttrFnItem() throws RecognitionException {
		FunctionCallAttrFnItemContext _localctx = new FunctionCallAttrFnItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionCallAttrFnItem);
		int _la;
		try {
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				functionCall();
				setState(791);
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
				setState(793);
				functionCall();
				setState(794);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				functionCall();
				setState(797);
				match(TypeSpec);
				setState(798);
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
		public LoopExpressionItemsContext loopExpressionItems() {
			return getRuleContext(LoopExpressionItemsContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_loop);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				loopExpressionItems();
				setState(804);
				loop();
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

	public static class LoopExpressionItemsContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public LoopExpressionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpressionItems; }
	}

	public final LoopExpressionItemsContext loopExpressionItems() throws RecognitionException {
		LoopExpressionItemsContext _localctx = new LoopExpressionItemsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_loopExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(For);
			setState(809);
			loopExpression();
			setState(810);
			loopBlockElementsLimited();
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
		public LoopInfiniteContext loopInfinite() {
			return getRuleContext(LoopInfiniteContext.class,0);
		}
		public LoopCompleteContext loopComplete() {
			return getRuleContext(LoopCompleteContext.class,0);
		}
		public LoopConditionalContext loopConditional() {
			return getRuleContext(LoopConditionalContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_loopExpression);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				loopConditional();
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

	public static class LoopInfiniteContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopInfiniteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInfinite; }
	}

	public final LoopInfiniteContext loopInfinite() throws RecognitionException {
		LoopInfiniteContext _localctx = new LoopInfiniteContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_loopInfinite);
		try {
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				match(OpenOp);
				setState(818);
				match(CloseOp);
				}
				break;
			case If:
			case For:
			case Ret:
			case OpenBlock:
			case IncDecOperators:
			case Identifier:
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

	public static class LoopCompleteContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public LoopOneMembersContext loopOneMembers() {
			return getRuleContext(LoopOneMembersContext.class,0);
		}
		public EndOneContext endOne() {
			return getRuleContext(EndOneContext.class,0);
		}
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public EndTwoContext endTwo() {
			return getRuleContext(EndTwoContext.class,0);
		}
		public LoopThreeMembersContext loopThreeMembers() {
			return getRuleContext(LoopThreeMembersContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopCompleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopComplete; }
	}

	public final LoopCompleteContext loopComplete() throws RecognitionException {
		LoopCompleteContext _localctx = new LoopCompleteContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_loopComplete);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(OpenOp);
				setState(823);
				loopOneMembers();
				setState(824);
				endOne();
				setState(825);
				loopTwoMembers();
				setState(826);
				endTwo();
				setState(827);
				loopThreeMembers();
				setState(828);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				loopOneMembers();
				setState(831);
				endOne();
				setState(832);
				loopTwoMembers();
				setState(833);
				endTwo();
				setState(834);
				loopThreeMembers();
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

	public static class LoopConditionalContext extends ParserRuleContext {
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public LoopConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopConditional; }
	}

	public final LoopConditionalContext loopConditional() throws RecognitionException {
		LoopConditionalContext _localctx = new LoopConditionalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			loopTwoMembers();
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

	public static class EndOneContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOne; }
	}

	public final EndOneContext endOne() throws RecognitionException {
		EndOneContext _localctx = new EndOneContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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

	public static class EndTwoContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndTwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTwo; }
	}

	public final EndTwoContext endTwo() throws RecognitionException {
		EndTwoContext _localctx = new EndTwoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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

	public static class LoopOneMembersContext extends ParserRuleContext {
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public LoopOneMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOneMembers; }
	}

	public final LoopOneMembersContext loopOneMembers() throws RecognitionException {
		LoopOneMembersContext _localctx = new LoopOneMembersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_loopOneMembers);
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(Var);
				setState(846);
				variableMembers();
				}
				break;
			case End:
				enterOuterAlt(_localctx, 3);
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
		enterRule(_localctx, 124, RULE_loopTwoMembers);
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				conditionalExpressionElements();
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
		enterRule(_localctx, 126, RULE_loopThreeMembers);
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
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
		enterRule(_localctx, 128, RULE_loopThreeMembersValues);
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				operationElements();
				setState(860);
				match(Separator);
				setState(861);
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
		enterRule(_localctx, 130, RULE_loopBlockElements);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				sentence();
				setState(867);
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
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public LoopBlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElementsLimited; }
	}

	public final LoopBlockElementsLimitedContext loopBlockElementsLimited() throws RecognitionException {
		LoopBlockElementsLimitedContext _localctx = new LoopBlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_loopBlockElementsLimited);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(OpenBlock);
				setState(872);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(OpenBlock);
				setState(874);
				loopBlockElements();
				setState(875);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(879);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(880);
				ret();
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
		enterRule(_localctx, 134, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(Ret);
			setState(884);
			retValues();
			setState(885);
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
		public RetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retValues; }
	}

	public final RetValuesContext retValues() throws RecognitionException {
		RetValuesContext _localctx = new RetValuesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_retValues);
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
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
		enterRule(_localctx, 138, RULE_functions);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				functionsModes();
				setState(892);
				match(OpenBlock);
				setState(893);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				functionsModes();
				setState(896);
				match(OpenBlock);
				setState(897);
				functionCodeBlock();
				setState(898);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				functionMethodsModes();
				setState(901);
				match(OpenBlock);
				setState(902);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(904);
				functionMethodsModes();
				setState(905);
				match(OpenBlock);
				setState(906);
				functionCodeBlock();
				setState(907);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(909);
				constructClassMethod();
				setState(910);
				match(OpenBlock);
				setState(911);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(913);
				constructClassMethod();
				setState(914);
				match(OpenBlock);
				setState(915);
				functionCodeBlock();
				setState(916);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(918);
				interfaceMethod();
				setState(919);
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
		enterRule(_localctx, 140, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
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

	public static class FunctionGeneralModesContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public IdentifierRetContext identifierRet() {
			return getRuleContext(IdentifierRetContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
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
		enterRule(_localctx, 142, RULE_functionGeneralModes);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(Function);
				setState(926);
				match(Identifier);
				setState(927);
				match(OpenOp);
				setState(928);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(Function);
				setState(930);
				match(Identifier);
				setState(931);
				match(OpenOp);
				setState(932);
				match(CloseOp);
				setState(933);
				match(ArrowRight);
				setState(936);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(934);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(935);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
				match(Function);
				setState(939);
				match(Identifier);
				setState(940);
				match(OpenOp);
				setState(941);
				functionParams();
				setState(942);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				match(Function);
				setState(945);
				match(Identifier);
				setState(946);
				match(OpenOp);
				setState(947);
				functionParams();
				setState(948);
				match(CloseOp);
				setState(949);
				match(ArrowRight);
				setState(952);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(950);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(951);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class IdentifierRetContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierRet; }
	}

	public final IdentifierRetContext identifierRet() throws RecognitionException {
		IdentifierRetContext _localctx = new IdentifierRetContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
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

	public static class FunctionMethodsModesContext extends ParserRuleContext {
		public MethodVisibilityContext methodVisibility() {
			return getRuleContext(MethodVisibilityContext.class,0);
		}
		public FunctionGeneralModesContext functionGeneralModes() {
			return getRuleContext(FunctionGeneralModesContext.class,0);
		}
		public FunctionMethodsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMethodsModes; }
	}

	public final FunctionMethodsModesContext functionMethodsModes() throws RecognitionException {
		FunctionMethodsModesContext _localctx = new FunctionMethodsModesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionMethodsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			methodVisibility();
			setState(959);
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

	public static class FunctionMethodsModesBkpContext extends ParserRuleContext {
		public MethodPermContext methodPerm() {
			return getRuleContext(MethodPermContext.class,0);
		}
		public FunctionGeneralModesContext functionGeneralModes() {
			return getRuleContext(FunctionGeneralModesContext.class,0);
		}
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public FunctionMethodsModesBkpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMethodsModesBkp; }
	}

	public final FunctionMethodsModesBkpContext functionMethodsModesBkp() throws RecognitionException {
		FunctionMethodsModesBkpContext _localctx = new FunctionMethodsModesBkpContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionMethodsModesBkp);
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				methodPerm();
				setState(962);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(Static);
				setState(965);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				methodPerm();
				setState(967);
				match(Static);
				setState(968);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(970);
				match(Final);
				setState(971);
				methodPerm();
				setState(972);
				match(Static);
				setState(973);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(975);
				match(Final);
				setState(976);
				methodPerm();
				setState(977);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(979);
				match(Final);
				setState(980);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				match(Final);
				setState(982);
				match(Static);
				setState(983);
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
		enterRule(_localctx, 150, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
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

	public static class VisibilityItemsContext extends ParserRuleContext {
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public VisibilityItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityItems; }
	}

	public final VisibilityItemsContext visibilityItems() throws RecognitionException {
		VisibilityItemsContext _localctx = new VisibilityItemsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_visibilityItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final))) != 0)) ) {
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

	public static class MethodVisibilityContext extends ParserRuleContext {
		public VisibilityItemsContext visibilityItems() {
			return getRuleContext(VisibilityItemsContext.class,0);
		}
		public MethodVisibilityContext methodVisibility() {
			return getRuleContext(MethodVisibilityContext.class,0);
		}
		public MethodVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodVisibility; }
	}

	public final MethodVisibilityContext methodVisibility() throws RecognitionException {
		MethodVisibilityContext _localctx = new MethodVisibilityContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodVisibility);
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				visibilityItems();
				setState(992);
				methodVisibility();
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
		enterRule(_localctx, 156, RULE_constructClassMethod);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(Identifier);
				setState(997);
				match(OpenOp);
				setState(998);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(Identifier);
				setState(1000);
				match(OpenOp);
				setState(1001);
				functionParams();
				setState(1002);
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
		enterRule(_localctx, 158, RULE_interfaceMethod);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
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
				setState(1007);
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
		public FunctionCodeBlockElementsContext functionCodeBlockElements() {
			return getRuleContext(FunctionCodeBlockElementsContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			functionCodeBlockElements();
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

	public static class FunctionCodeBlockElementsContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FunctionCodeBlockElementsContext functionCodeBlockElements() {
			return getRuleContext(FunctionCodeBlockElementsContext.class,0);
		}
		public FunctionCodeBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlockElements; }
	}

	public final FunctionCodeBlockElementsContext functionCodeBlockElements() throws RecognitionException {
		FunctionCodeBlockElementsContext _localctx = new FunctionCodeBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionCodeBlockElements);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				sentence();
				setState(1014);
				functionCodeBlockElements();
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
		public FunctionParamsControlContext functionParamsControl() {
			return getRuleContext(FunctionParamsControlContext.class,0);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_functionParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			functionParamsControl();
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

	public static class FunctionParamsControlContext extends ParserRuleContext {
		public FunctionParamElementsContext functionParamElements() {
			return getRuleContext(FunctionParamElementsContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionParamsControlContext functionParamsControl() {
			return getRuleContext(FunctionParamsControlContext.class,0);
		}
		public FunctionParamsControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamsControl; }
	}

	public final FunctionParamsControlContext functionParamsControl() throws RecognitionException {
		FunctionParamsControlContext _localctx = new FunctionParamsControlContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_functionParamsControl);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				functionParamElements();
				setState(1022);
				match(Separator);
				setState(1023);
				functionParamsControl();
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
		enterRule(_localctx, 168, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Identifier);
			setState(1028);
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
		public InterfaceClassContext interfaceClass() {
			return getRuleContext(InterfaceClassContext.class,0);
		}
		public AbstractClassContext abstractClass() {
			return getRuleContext(AbstractClassContext.class,0);
		}
		public ClassDefinationContext classDefination() {
			return getRuleContext(ClassDefinationContext.class,0);
		}
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public OopGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oopGeneral; }
	}

	public final OopGeneralContext oopGeneral() throws RecognitionException {
		OopGeneralContext _localctx = new OopGeneralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_oopGeneral);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				classDefination();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				anonymousClass();
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

	public static class InterfaceClassContext extends ParserRuleContext {
		public InterfaceClassDefinitionContext interfaceClassDefinition() {
			return getRuleContext(InterfaceClassDefinitionContext.class,0);
		}
		public InterfaceClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceClass; }
	}

	public final InterfaceClassContext interfaceClass() throws RecognitionException {
		InterfaceClassContext _localctx = new InterfaceClassContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			interfaceClassDefinition();
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

	public static class InterfaceClassDefinitionContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(TParser.Interface, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public InterfaceCodeBlockContext interfaceCodeBlock() {
			return getRuleContext(InterfaceCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public InterfaceClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceClassDefinition; }
	}

	public final InterfaceClassDefinitionContext interfaceClassDefinition() throws RecognitionException {
		InterfaceClassDefinitionContext _localctx = new InterfaceClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_interfaceClassDefinition);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(Interface);
				setState(1039);
				match(Identifier);
				setState(1040);
				match(OpenBlock);
				setState(1041);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(Interface);
				setState(1043);
				match(Identifier);
				setState(1044);
				match(OpenBlock);
				setState(1045);
				interfaceCodeBlock();
				setState(1046);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				match(Interface);
				setState(1049);
				match(Identifier);
				setState(1050);
				match(Extends);
				setState(1051);
				identifierB();
				setState(1052);
				match(OpenBlock);
				setState(1053);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				match(Interface);
				setState(1056);
				match(Identifier);
				setState(1057);
				match(Extends);
				setState(1058);
				identifierB();
				setState(1059);
				match(OpenBlock);
				setState(1060);
				interfaceCodeBlock();
				setState(1061);
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

	public static class InterfaceCodeBlockContext extends ParserRuleContext {
		public FunctionCodeBlockElementsContext functionCodeBlockElements() {
			return getRuleContext(FunctionCodeBlockElementsContext.class,0);
		}
		public InterfaceCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCodeBlock; }
	}

	public final InterfaceCodeBlockContext interfaceCodeBlock() throws RecognitionException {
		InterfaceCodeBlockContext _localctx = new InterfaceCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			functionCodeBlockElements();
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

	public static class AbstractClassContext extends ParserRuleContext {
		public AbstractClassDefinitionContext abstractClassDefinition() {
			return getRuleContext(AbstractClassDefinitionContext.class,0);
		}
		public AbstractClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractClass; }
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			abstractClassDefinition();
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

	public static class AbstractClassDefinitionContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(TParser.Abstract, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public AbstractCodeBlockContext abstractCodeBlock() {
			return getRuleContext(AbstractCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public AbstractClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractClassDefinition; }
	}

	public final AbstractClassDefinitionContext abstractClassDefinition() throws RecognitionException {
		AbstractClassDefinitionContext _localctx = new AbstractClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_abstractClassDefinition);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				match(Abstract);
				setState(1070);
				match(Identifier);
				setState(1071);
				match(OpenBlock);
				setState(1072);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(Abstract);
				setState(1074);
				match(Identifier);
				setState(1075);
				match(OpenBlock);
				setState(1076);
				abstractCodeBlock();
				setState(1077);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(Abstract);
				setState(1080);
				match(Identifier);
				setState(1081);
				match(Extends);
				setState(1082);
				identifierB();
				setState(1083);
				match(OpenBlock);
				setState(1084);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(Abstract);
				setState(1087);
				match(Identifier);
				setState(1088);
				match(Extends);
				setState(1089);
				identifierB();
				setState(1090);
				match(OpenBlock);
				setState(1091);
				abstractCodeBlock();
				setState(1092);
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

	public static class AbstractCodeBlockContext extends ParserRuleContext {
		public FunctionCodeBlockElementsContext functionCodeBlockElements() {
			return getRuleContext(FunctionCodeBlockElementsContext.class,0);
		}
		public AbstractCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractCodeBlock; }
	}

	public final AbstractCodeBlockContext abstractCodeBlock() throws RecognitionException {
		AbstractCodeBlockContext _localctx = new AbstractCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_abstractCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			functionCodeBlockElements();
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

	public static class ClassDefinationContext extends ParserRuleContext {
		public ClassModesContext classModes() {
			return getRuleContext(ClassModesContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public ClassDefinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefination; }
	}

	public final ClassDefinationContext classDefination() throws RecognitionException {
		ClassDefinationContext _localctx = new ClassDefinationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_classDefination);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				classModes();
				setState(1099);
				match(OpenBlock);
				setState(1100);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				classModes();
				setState(1103);
				match(OpenBlock);
				setState(1104);
				classCodeBlock();
				setState(1105);
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

	public static class ClassCodeBlockContext extends ParserRuleContext {
		public FunctionCodeBlockElementsContext functionCodeBlockElements() {
			return getRuleContext(FunctionCodeBlockElementsContext.class,0);
		}
		public ClassCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCodeBlock; }
	}

	public final ClassCodeBlockContext classCodeBlock() throws RecognitionException {
		ClassCodeBlockContext _localctx = new ClassCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			functionCodeBlockElements();
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

	public static class ClassModesContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public IdentifierCContext identifierC() {
			return getRuleContext(IdentifierCContext.class,0);
		}
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public ClassModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModes; }
	}

	public final ClassModesContext classModes() throws RecognitionException {
		ClassModesContext _localctx = new ClassModesContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classModes);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				match(Class);
				setState(1112);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				match(Class);
				setState(1114);
				match(Identifier);
				setState(1115);
				match(Extends);
				setState(1116);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				match(Class);
				setState(1118);
				match(Identifier);
				setState(1119);
				match(Implements);
				setState(1120);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1121);
				match(Class);
				setState(1122);
				match(Identifier);
				setState(1123);
				match(Extends);
				setState(1124);
				identifierB();
				setState(1125);
				match(Implements);
				setState(1126);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1128);
				match(Final);
				setState(1129);
				match(Class);
				setState(1130);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131);
				match(Final);
				setState(1132);
				match(Class);
				setState(1133);
				match(Identifier);
				setState(1134);
				match(Extends);
				setState(1135);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1136);
				match(Final);
				setState(1137);
				match(Class);
				setState(1138);
				match(Identifier);
				setState(1139);
				match(Implements);
				setState(1140);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1141);
				match(Final);
				setState(1142);
				match(Class);
				setState(1143);
				match(Identifier);
				setState(1144);
				match(Extends);
				setState(1145);
				identifierB();
				setState(1146);
				match(Implements);
				setState(1147);
				identifierC();
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

	public static class IdentifierCContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierC; }
	}

	public final IdentifierCContext identifierC() throws RecognitionException {
		IdentifierCContext _localctx = new IdentifierCContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
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

	public static class AnonymousClassCallContext extends ParserRuleContext {
		public AnonymousClassCallExprContext anonymousClassCallExpr() {
			return getRuleContext(AnonymousClassCallExprContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public AnonymousClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassCall; }
	}

	public final AnonymousClassCallContext anonymousClassCall() throws RecognitionException {
		AnonymousClassCallContext _localctx = new AnonymousClassCallContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_anonymousClassCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			anonymousClassCallExpr();
			setState(1154);
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

	public static class AnonymousClassCallExprContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public AnonymousClassCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassCallExpr; }
	}

	public final AnonymousClassCallExprContext anonymousClassCallExpr() throws RecognitionException {
		AnonymousClassCallExprContext _localctx = new AnonymousClassCallExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_anonymousClassCallExpr);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(OpenOp);
				setState(1157);
				anonymousClass();
				setState(1158);
				match(CloseOp);
				setState(1159);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1160);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(OpenOp);
				setState(1163);
				anonymousClass();
				setState(1164);
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

	public static class AnonymousClassContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public AnonymousClassElementsContext anonymousClassElements() {
			return getRuleContext(AnonymousClassElementsContext.class,0);
		}
		public AnonymousClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClass; }
	}

	public final AnonymousClassContext anonymousClass() throws RecognitionException {
		AnonymousClassContext _localctx = new AnonymousClassContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_anonymousClass);
		try {
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				match(New);
				setState(1169);
				match(Class);
				setState(1170);
				match(OpenBlock);
				setState(1171);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(New);
				setState(1173);
				match(Class);
				setState(1174);
				match(OpenBlock);
				setState(1175);
				anonymousClassElements();
				setState(1176);
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

	public static class AnonymousClassElementsContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public AnonymousClassElementsContext anonymousClassElements() {
			return getRuleContext(AnonymousClassElementsContext.class,0);
		}
		public AnonymousClassElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassElements; }
	}

	public final AnonymousClassElementsContext anonymousClassElements() throws RecognitionException {
		AnonymousClassElementsContext _localctx = new AnonymousClassElementsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_anonymousClassElements);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				sentence();
				setState(1182);
				anonymousClassElements();
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

	public static class ArrayAccessElementsContext extends ParserRuleContext {
		public ArrayAccessElementsItemsContext arrayAccessElementsItems() {
			return getRuleContext(ArrayAccessElementsItemsContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public ArrayAccessElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElements; }
	}

	public final ArrayAccessElementsContext arrayAccessElements() throws RecognitionException {
		ArrayAccessElementsContext _localctx = new ArrayAccessElementsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arrayAccessElements);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				arrayAccessElementsItems();
				setState(1188);
				arrayAccessElements();
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

	public static class ArrayAccessElementsItemsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arrayAccessElementsItems);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				match(Identifier);
				setState(1194);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195);
				match(Identifier);
				setState(1196);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1197);
				match(Identifier);
				setState(1198);
				accessBlockAr();
				setState(1199);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1201);
				firstIncDec();
				setState(1202);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1204);
				match(Identifier);
				setState(1205);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1206);
				firstIncDec();
				setState(1207);
				match(Identifier);
				setState(1208);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1210);
				match(Identifier);
				setState(1211);
				accessBlockAr();
				setState(1212);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1214);
				match(Identifier);
				setState(1215);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1216);
				match(Identifier);
				setState(1217);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1218);
				match(Identifier);
				setState(1219);
				accessBlockAr();
				setState(1220);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1222);
				match(Identifier);
				setState(1223);
				accessBlockAr();
				setState(1224);
				match(Point);
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

	public static class AccessBlockArContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public ArrayIndexAccessContext arrayIndexAccess() {
			return getRuleContext(ArrayIndexAccessContext.class,0);
		}
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public AccessBlockArContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessBlockAr; }
	}

	public final AccessBlockArContext accessBlockAr() throws RecognitionException {
		AccessBlockArContext _localctx = new AccessBlockArContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_accessBlockAr);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				match(OpenArIndex);
				setState(1229);
				arrayIndexAccess();
				setState(1230);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(OpenArIndex);
				setState(1233);
				arrayIndexAccess();
				setState(1234);
				match(CloseArIndex);
				setState(1235);
				accessBlockAr();
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

	public static class ArrayIndexAccessContext extends ParserRuleContext {
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public ArrayIndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexAccess; }
	}

	public final ArrayIndexAccessContext arrayIndexAccess() throws RecognitionException {
		ArrayIndexAccessContext _localctx = new ArrayIndexAccessContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			operationElements();
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

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public AnFnItemsContext anFnItems() {
			return getRuleContext(AnFnItemsContext.class,0);
		}
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_anonymousFunction);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				match(OpenOp);
				setState(1242);
				anFnItems();
				setState(1243);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(OpenOp);
				setState(1246);
				anFnItems();
				setState(1247);
				match(CloseOp);
				setState(1248);
				match(OpenOp);
				setState(1249);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				match(OpenOp);
				setState(1252);
				anFnItems();
				setState(1253);
				match(CloseOp);
				setState(1254);
				match(OpenOp);
				setState(1255);
				operationElements();
				setState(1256);
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

	public static class AnFnItemsContext extends ParserRuleContext {
		public FunctionsModesFnContext functionsModesFn() {
			return getRuleContext(FunctionsModesFnContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public AnFnItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anFnItems; }
	}

	public final AnFnItemsContext anFnItems() throws RecognitionException {
		AnFnItemsContext _localctx = new AnFnItemsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_anFnItems);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				functionsModesFn();
				setState(1261);
				match(OpenBlock);
				setState(1262);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				functionsModesFn();
				setState(1265);
				match(OpenBlock);
				setState(1266);
				functionCodeBlock();
				setState(1267);
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

	public static class FunctionsModesFnContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public IdentifierRetContext identifierRet() {
			return getRuleContext(IdentifierRetContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionsModesFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsModesFn; }
	}

	public final FunctionsModesFnContext functionsModesFn() throws RecognitionException {
		FunctionsModesFnContext _localctx = new FunctionsModesFnContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_functionsModesFn);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				match(Function);
				setState(1272);
				match(OpenOp);
				setState(1273);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(Function);
				setState(1275);
				match(OpenOp);
				setState(1276);
				match(CloseOp);
				setState(1277);
				match(ArrowRight);
				setState(1280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1278);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1279);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1282);
				match(Function);
				setState(1283);
				match(OpenOp);
				setState(1284);
				functionParams();
				setState(1285);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1287);
				match(Function);
				setState(1288);
				match(OpenOp);
				setState(1289);
				functionParams();
				setState(1290);
				match(CloseOp);
				setState(1291);
				match(ArrowRight);
				setState(1294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1292);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1293);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AnonymousObjectCallContext extends ParserRuleContext {
		public AnonymousObjectCallExprContext anonymousObjectCallExpr() {
			return getRuleContext(AnonymousObjectCallExprContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public AnonymousObjectCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousObjectCall; }
	}

	public final AnonymousObjectCallContext anonymousObjectCall() throws RecognitionException {
		AnonymousObjectCallContext _localctx = new AnonymousObjectCallContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_anonymousObjectCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			anonymousObjectCallExpr();
			setState(1299);
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

	public static class AnonymousObjectCallExprContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public AnonymousObjectContext anonymousObject() {
			return getRuleContext(AnonymousObjectContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public AnonymousObjectCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousObjectCallExpr; }
	}

	public final AnonymousObjectCallExprContext anonymousObjectCallExpr() throws RecognitionException {
		AnonymousObjectCallExprContext _localctx = new AnonymousObjectCallExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_anonymousObjectCallExpr);
		int _la;
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(OpenOp);
				setState(1302);
				anonymousObject();
				setState(1303);
				match(CloseOp);
				setState(1304);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1305);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(OpenOp);
				setState(1308);
				anonymousObject();
				setState(1309);
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

	public static class AnonymousObjectContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public AnonymousObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousObject; }
	}

	public final AnonymousObjectContext anonymousObject() throws RecognitionException {
		AnonymousObjectContext _localctx = new AnonymousObjectContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_anonymousObject);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(New);
				setState(1314);
				match(Identifier);
				setState(1315);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				match(New);
				setState(1317);
				match(Identifier);
				setState(1318);
				functionCallParam();
				setState(1319);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1320);
				functionCallCascading();
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

	public static class VariableMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public VariableMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignments; }
	}

	public final VariableMultipleAssignmentsContext variableMultipleAssignments() throws RecognitionException {
		VariableMultipleAssignmentsContext _localctx = new VariableMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_variableMultipleAssignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			variableMultipleAssignmentsModes();
			setState(1325);
			match(Attr);
			setState(1326);
			generalValue();
			setState(1327);
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

	public static class VariableMultipleAssignmentsModesContext extends ParserRuleContext {
		public VariableMultipleAItemsContext variableMultipleAItems() {
			return getRuleContext(VariableMultipleAItemsContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public VariableMultipleAssignmentsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsModes; }
	}

	public final VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() throws RecognitionException {
		VariableMultipleAssignmentsModesContext _localctx = new VariableMultipleAssignmentsModesContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_variableMultipleAssignmentsModes);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				variableMultipleAItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				variableMultipleAItems();
				setState(1331);
				match(Attr);
				setState(1332);
				variableMultipleAssignmentsModes();
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

	public static class VariableMultipleAItemsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public VariableMultipleAItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAItems; }
	}

	public final VariableMultipleAItemsContext variableMultipleAItems() throws RecognitionException {
		VariableMultipleAItemsContext _localctx = new VariableMultipleAItemsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_variableMultipleAItems);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(Identifier);
				setState(1338);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340);
				arrayAccessElements();
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

	public static class LambdaFunctionsContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public LambdaFnParamsContext lambdaFnParams() {
			return getRuleContext(LambdaFnParamsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LambdaFnRetContext lambdaFnRet() {
			return getRuleContext(LambdaFnRetContext.class,0);
		}
		public LambdaFnCodeBlockContext lambdaFnCodeBlock() {
			return getRuleContext(LambdaFnCodeBlockContext.class,0);
		}
		public LambdaFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctions; }
	}

	public final LambdaFunctionsContext lambdaFunctions() throws RecognitionException {
		LambdaFunctionsContext _localctx = new LambdaFunctionsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_lambdaFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(OpenOp);
			setState(1344);
			lambdaFnParams();
			setState(1345);
			match(CloseOp);
			setState(1346);
			lambdaFnRet();
			setState(1347);
			lambdaFnCodeBlock();
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

	public static class LambdaFnParamsContext extends ParserRuleContext {
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public LambdaFnParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParams; }
	}

	public final LambdaFnParamsContext lambdaFnParams() throws RecognitionException {
		LambdaFnParamsContext _localctx = new LambdaFnParamsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lambdaFnParams);
		try {
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				functionParams();
				}
				break;
			case CloseOp:
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

	public static class LambdaFnRetContext extends ParserRuleContext {
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public LambdaFnRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnRet; }
	}

	public final LambdaFnRetContext lambdaFnRet() throws RecognitionException {
		LambdaFnRetContext _localctx = new LambdaFnRetContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_lambdaFnRet);
		int _la;
		try {
			setState(1356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ArrowRight:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(ArrowRight);
				setState(1354);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==TypeSpec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ARightLB:
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

	public static class LambdaFnCodeBlockContext extends ParserRuleContext {
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public LambdaFnCodeBlockItemsContext lambdaFnCodeBlockItems() {
			return getRuleContext(LambdaFnCodeBlockItemsContext.class,0);
		}
		public LambdaFnCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlock; }
	}

	public final LambdaFnCodeBlockContext lambdaFnCodeBlock() throws RecognitionException {
		LambdaFnCodeBlockContext _localctx = new LambdaFnCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_lambdaFnCodeBlock);
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				match(ARightLB);
				setState(1359);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(ARightLB);
				setState(1361);
				match(OpenBlock);
				setState(1362);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1363);
				match(ARightLB);
				setState(1364);
				match(OpenBlock);
				setState(1365);
				lambdaFnCodeBlockItems();
				setState(1366);
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

	public static class LambdaFnCodeBlockItemsContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public LambdaFnCodeBlockItemsContext lambdaFnCodeBlockItems() {
			return getRuleContext(LambdaFnCodeBlockItemsContext.class,0);
		}
		public LambdaFnCodeBlockItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlockItems; }
	}

	public final LambdaFnCodeBlockItemsContext lambdaFnCodeBlockItems() throws RecognitionException {
		LambdaFnCodeBlockItemsContext _localctx = new LambdaFnCodeBlockItemsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_lambdaFnCodeBlockItems);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				sentence();
				setState(1372);
				lambdaFnCodeBlockItems();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjIdentifierAContext objIdentifierA() {
			return getRuleContext(ObjIdentifierAContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public ObjIdentifierBContext objIdentifierB() {
			return getRuleContext(ObjIdentifierBContext.class,0);
		}
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousClassCallExprContext anonymousClassCallExpr() {
			return getRuleContext(AnonymousClassCallExprContext.class,0);
		}
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public AnonymousObjectCallExprContext anonymousObjectCallExpr() {
			return getRuleContext(AnonymousObjectCallExprContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public LambdaFunctionsContext lambdaFunctions() {
			return getRuleContext(LambdaFunctionsContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_generalValue);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				match(Identifier);
				setState(1378);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				match(Integer);
				setState(1381);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1382);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1383);
				match(Float);
				setState(1384);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1385);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1386);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1387);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1388);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1389);
				objIdentifierA();
				setState(1390);
				match(Point);
				setState(1391);
				objIdentifierB();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1393);
				objIdentifierA();
				setState(1394);
				match(TwoTwoPoint);
				setState(1395);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1397);
				arrayAccessElements();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1398);
				anonymousFunction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1399);
				anonymousClassCallExpr();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1400);
				anonymousClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1401);
				anonymousObjectCallExpr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1402);
				operationElements();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1403);
				lambdaFunctions();
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

	public static class ObjIdentifierAContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public ObjIdentifierAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdentifierA; }
	}

	public final ObjIdentifierAContext objIdentifierA() throws RecognitionException {
		ObjIdentifierAContext _localctx = new ObjIdentifierAContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
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

	public static class ObjIdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public ObjIdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdentifierB; }
	}

	public final ObjIdentifierBContext objIdentifierB() throws RecognitionException {
		ObjIdentifierBContext _localctx = new ObjIdentifierBContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0585\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00fd\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u010b\n\4\3\5\3\5\3"+
		"\5\5\5\u0110\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0121\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0133\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0164\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u016b\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u017c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u018a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0192\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0199\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u01a1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01ac"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u01b6\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0210\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0229\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0236\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u023f\n\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u024b\n\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u0257\n#\3$\3$\3$\3$\5$\u025d\n$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u026a\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0274\n\'\3(\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0289\n+\3,\3,"+
		"\3,\3,\5,\u028f\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0299\n-\3.\3.\3.\5.\u029e"+
		"\n.\3/\3/\3/\5/\u02a3\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u02ad\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u030c\n\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u0314\n\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0323\n\66\3\67\3\67\3\67"+
		"\3\67\5\67\u0329\n\67\38\38\38\38\39\39\39\59\u0332\n9\3:\3:\3:\5:\u0337"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0347\n;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3?\3?\5?\u0353\n?\3@\3@\5@\u0357\n@\3A\3A\5A\u035b\nA\3B"+
		"\3B\3B\3B\3B\5B\u0362\nB\3C\3C\3C\3C\5C\u0368\nC\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u0374\nD\3E\3E\3E\3E\3F\3F\5F\u037c\nF\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\5G\u039c\nG\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03ab\nI\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03bb\nI\5I\u03bd\nI\3J\3J"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u03db\nL\3M\3M\3N\3N\3O\3O\3O\3O\5O\u03e5\nO\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\5P\u03ef\nP\3Q\3Q\5Q\u03f3\nQ\3R\3R\3S\3S\3S\3S\5S\u03fb"+
		"\nS\3T\3T\3U\3U\3U\3U\3U\5U\u0404\nU\3V\3V\3V\3W\3W\3W\3W\5W\u040d\nW"+
		"\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\5Y\u042a\nY\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u0449\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0456\n^\3_\3_\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0480\n`\3a\3a\3b\3b\3b\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0491\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u049d\nd\3e\3e\3e\3e\5e\u04a3\ne\3f\3f\3f\3f\5f\u04a9\nf\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\5g\u04cd\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04d8"+
		"\nh\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u04ed"+
		"\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u04f8\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l"+
		"\5l\u0503\nl\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0511\nl\5l\u0513"+
		"\nl\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0522\nn\3o\3o\3o\3o\3o"+
		"\3o\3o\3o\3o\5o\u052d\no\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\5q\u0539\nq\3r"+
		"\3r\3r\3r\3r\5r\u0540\nr\3s\3s\3s\3s\3s\3s\3t\3t\5t\u054a\nt\3u\3u\3u"+
		"\5u\u054f\nu\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u055b\nv\3w\3w\3w\3w\5w"+
		"\u0561\nw\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x"+
		"\3x\3x\3x\3x\3x\3x\3x\3x\5x\u057f\nx\3y\3y\3z\3z\3z\2\2{\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\2\b\4\2\33\33\'\'\4\2\34\34\36\36\3\2&\'\3\2\13\r\3\2\13\17\4\2**,,\2"+
		"\u05fe\2\u00f4\3\2\2\2\4\u00fc\3\2\2\2\6\u010a\3\2\2\2\b\u010f\3\2\2\2"+
		"\n\u0111\3\2\2\2\f\u0114\3\2\2\2\16\u0117\3\2\2\2\20\u0120\3\2\2\2\22"+
		"\u0122\3\2\2\2\24\u0124\3\2\2\2\26\u0132\3\2\2\2\30\u0163\3\2\2\2\32\u016a"+
		"\3\2\2\2\34\u017b\3\2\2\2\36\u0189\3\2\2\2 \u0191\3\2\2\2\"\u0198\3\2"+
		"\2\2$\u01a0\3\2\2\2&\u01ab\3\2\2\2(\u01ad\3\2\2\2*\u01b5\3\2\2\2,\u020f"+
		"\3\2\2\2.\u0211\3\2\2\2\60\u0213\3\2\2\2\62\u0215\3\2\2\2\64\u0228\3\2"+
		"\2\2\66\u022a\3\2\2\28\u022c\3\2\2\2:\u0235\3\2\2\2<\u023e\3\2\2\2>\u0240"+
		"\3\2\2\2@\u0242\3\2\2\2B\u024a\3\2\2\2D\u0256\3\2\2\2F\u025c\3\2\2\2H"+
		"\u0269\3\2\2\2J\u026b\3\2\2\2L\u0273\3\2\2\2N\u0275\3\2\2\2P\u0279\3\2"+
		"\2\2R\u027c\3\2\2\2T\u0288\3\2\2\2V\u028e\3\2\2\2X\u0298\3\2\2\2Z\u029d"+
		"\3\2\2\2\\\u02a2\3\2\2\2^\u02ac\3\2\2\2`\u02ae\3\2\2\2b\u030b\3\2\2\2"+
		"d\u030d\3\2\2\2f\u0313\3\2\2\2h\u0315\3\2\2\2j\u0322\3\2\2\2l\u0328\3"+
		"\2\2\2n\u032a\3\2\2\2p\u0331\3\2\2\2r\u0336\3\2\2\2t\u0346\3\2\2\2v\u0348"+
		"\3\2\2\2x\u034a\3\2\2\2z\u034c\3\2\2\2|\u0352\3\2\2\2~\u0356\3\2\2\2\u0080"+
		"\u035a\3\2\2\2\u0082\u0361\3\2\2\2\u0084\u0367\3\2\2\2\u0086\u0373\3\2"+
		"\2\2\u0088\u0375\3\2\2\2\u008a\u037b\3\2\2\2\u008c\u039b\3\2\2\2\u008e"+
		"\u039d\3\2\2\2\u0090\u03bc\3\2\2\2\u0092\u03be\3\2\2\2\u0094\u03c0\3\2"+
		"\2\2\u0096\u03da\3\2\2\2\u0098\u03dc\3\2\2\2\u009a\u03de\3\2\2\2\u009c"+
		"\u03e4\3\2\2\2\u009e\u03ee\3\2\2\2\u00a0\u03f2\3\2\2\2\u00a2\u03f4\3\2"+
		"\2\2\u00a4\u03fa\3\2\2\2\u00a6\u03fc\3\2\2\2\u00a8\u0403\3\2\2\2\u00aa"+
		"\u0405\3\2\2\2\u00ac\u040c\3\2\2\2\u00ae\u040e\3\2\2\2\u00b0\u0429\3\2"+
		"\2\2\u00b2\u042b\3\2\2\2\u00b4\u042d\3\2\2\2\u00b6\u0448\3\2\2\2\u00b8"+
		"\u044a\3\2\2\2\u00ba\u0455\3\2\2\2\u00bc\u0457\3\2\2\2\u00be\u047f\3\2"+
		"\2\2\u00c0\u0481\3\2\2\2\u00c2\u0483\3\2\2\2\u00c4\u0490\3\2\2\2\u00c6"+
		"\u049c\3\2\2\2\u00c8\u04a2\3\2\2\2\u00ca\u04a8\3\2\2\2\u00cc\u04cc\3\2"+
		"\2\2\u00ce\u04d7\3\2\2\2\u00d0\u04d9\3\2\2\2\u00d2\u04ec\3\2\2\2\u00d4"+
		"\u04f7\3\2\2\2\u00d6\u0512\3\2\2\2\u00d8\u0514\3\2\2\2\u00da\u0521\3\2"+
		"\2\2\u00dc\u052c\3\2\2\2\u00de\u052e\3\2\2\2\u00e0\u0538\3\2\2\2\u00e2"+
		"\u053f\3\2\2\2\u00e4\u0541\3\2\2\2\u00e6\u0549\3\2\2\2\u00e8\u054e\3\2"+
		"\2\2\u00ea\u055a\3\2\2\2\u00ec\u0560\3\2\2\2\u00ee\u057e\3\2\2\2\u00f0"+
		"\u0580\3\2\2\2\u00f2\u0582\3\2\2\2\u00f4\u00f5\5\4\3\2\u00f5\u00f6\7\2"+
		"\2\3\u00f6\3\3\2\2\2\u00f7\u00fd\5\6\4\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa"+
		"\5\4\3\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\5\3\2\2\2\u00fe\u010b\5\b\5\2"+
		"\u00ff\u010b\5\16\b\2\u0100\u010b\5\24\13\2\u0101\u010b\5\62\32\2\u0102"+
		"\u010b\5F$\2\u0103\u010b\5l\67\2\u0104\u010b\5\u008cG\2\u0105\u010b\5"+
		"\u0088E\2\u0106\u010b\5\u00acW\2\u0107\u010b\5\u00c2b\2\u0108\u010b\5"+
		"\u00d8m\2\u0109\u010b\5\u00dep\2\u010a\u00fe\3\2\2\2\u010a\u00ff\3\2\2"+
		"\2\u010a\u0100\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0103"+
		"\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\7\3\2\2\2"+
		"\u010c\u0110\7\61\2\2\u010d\u0110\5\n\6\2\u010e\u0110\5\f\7\2\u010f\u010c"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\t\3\2\2\2\u0111"+
		"\u0112\7\26\2\2\u0112\u0113\7\32\2\2\u0113\13\3\2\2\2\u0114\u0115\7\27"+
		"\2\2\u0115\u0116\7\32\2\2\u0116\r\3\2\2\2\u0117\u0118\7\3\2\2\u0118\u0119"+
		"\5\20\t\2\u0119\u011a\7\32\2\2\u011a\17\3\2\2\2\u011b\u0121\5\22\n\2\u011c"+
		"\u011d\5\22\n\2\u011d\u011e\7\37\2\2\u011e\u011f\5\20\t\2\u011f\u0121"+
		"\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0121\21\3\2\2\2\u0122"+
		"\u0123\7-\2\2\u0123\23\3\2\2\2\u0124\u0125\5\26\f\2\u0125\25\3\2\2\2\u0126"+
		"\u0127\7\4\2\2\u0127\u0128\5\32\16\2\u0128\u0129\7\32\2\2\u0129\u0133"+
		"\3\2\2\2\u012a\u012b\5\u009cO\2\u012b\u012c\7\4\2\2\u012c\u012d\5\32\16"+
		"\2\u012d\u012e\7\32\2\2\u012e\u0133\3\2\2\2\u012f\u0130\5\32\16\2\u0130"+
		"\u0131\7\32\2\2\u0131\u0133\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u012a\3"+
		"\2\2\2\u0132\u012f\3\2\2\2\u0133\27\3\2\2\2\u0134\u0135\7\4\2\2\u0135"+
		"\u0136\5\32\16\2\u0136\u0137\7\32\2\2\u0137\u0164\3\2\2\2\u0138\u0139"+
		"\5\u0098M\2\u0139\u013a\7\4\2\2\u013a\u013b\5\32\16\2\u013b\u013c\7\32"+
		"\2\2\u013c\u0164\3\2\2\2\u013d\u013e\7\16\2\2\u013e\u013f\7\4\2\2\u013f"+
		"\u0140\5\32\16\2\u0140\u0141\7\32\2\2\u0141\u0164\3\2\2\2\u0142\u0143"+
		"\5\u0098M\2\u0143\u0144\7\16\2\2\u0144\u0145\7\4\2\2\u0145\u0146\5\32"+
		"\16\2\u0146\u0147\7\32\2\2\u0147\u0164\3\2\2\2\u0148\u0149\7\17\2\2\u0149"+
		"\u014a\5\u0098M\2\u014a\u014b\7\16\2\2\u014b\u014c\7\4\2\2\u014c\u014d"+
		"\5\32\16\2\u014d\u014e\7\32\2\2\u014e\u0164\3\2\2\2\u014f\u0150\7\17\2"+
		"\2\u0150\u0151\5\u0098M\2\u0151\u0152\7\4\2\2\u0152\u0153\5\32\16\2\u0153"+
		"\u0154\7\32\2\2\u0154\u0164\3\2\2\2\u0155\u0156\7\17\2\2\u0156\u0157\7"+
		"\4\2\2\u0157\u0158\5\32\16\2\u0158\u0159\7\32\2\2\u0159\u0164\3\2\2\2"+
		"\u015a\u015b\7\17\2\2\u015b\u015c\7\16\2\2\u015c\u015d\7\4\2\2\u015d\u015e"+
		"\5\32\16\2\u015e\u015f\7\32\2\2\u015f\u0164\3\2\2\2\u0160\u0161\5\32\16"+
		"\2\u0161\u0162\7\32\2\2\u0162\u0164\3\2\2\2\u0163\u0134\3\2\2\2\u0163"+
		"\u0138\3\2\2\2\u0163\u013d\3\2\2\2\u0163\u0142\3\2\2\2\u0163\u0148\3\2"+
		"\2\2\u0163\u014f\3\2\2\2\u0163\u0155\3\2\2\2\u0163\u015a\3\2\2\2\u0163"+
		"\u0160\3\2\2\2\u0164\31\3\2\2\2\u0165\u016b\5\34\17\2\u0166\u0167\5\34"+
		"\17\2\u0167\u0168\7\37\2\2\u0168\u0169\5\32\16\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016b\33\3\2\2\2\u016c\u016d\7*\2\2"+
		"\u016d\u017c\5\36\20\2\u016e\u016f\5\u00f0y\2\u016f\u0170\7\34\2\2\u0170"+
		"\u0171\5\u00f2z\2\u0171\u0172\5\36\20\2\u0172\u017c\3\2\2\2\u0173\u0174"+
		"\5\u00f0y\2\u0174\u0175\7\36\2\2\u0175\u0176\5\u00f2z\2\u0176\u0177\5"+
		"\36\20\2\u0177\u017c\3\2\2\2\u0178\u0179\5\u00caf\2\u0179\u017a\5\36\20"+
		"\2\u017a\u017c\3\2\2\2\u017b\u016c\3\2\2\2\u017b\u016e\3\2\2\2\u017b\u0173"+
		"\3\2\2\2\u017b\u0178\3\2\2\2\u017c\35\3\2\2\2\u017d\u017e\t\2\2\2\u017e"+
		"\u018a\5\u00eex\2\u017f\u0180\7,\2\2\u0180\u0181\t\2\2\2\u0181\u018a\5"+
		"\u00eex\2\u0182\u0183\t\2\2\2\u0183\u0184\7\25\2\2\u0184\u018a\5\u00ee"+
		"x\2\u0185\u0186\7,\2\2\u0186\u0187\t\2\2\2\u0187\u0188\7\25\2\2\u0188"+
		"\u018a\5\u00eex\2\u0189\u017d\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0182"+
		"\3\2\2\2\u0189\u0185\3\2\2\2\u018a\37\3\2\2\2\u018b\u018c\7 \2\2\u018c"+
		"\u0192\7!\2\2\u018d\u018e\7 \2\2\u018e\u018f\5\"\22\2\u018f\u0190\7!\2"+
		"\2\u0190\u0192\3\2\2\2\u0191\u018b\3\2\2\2\u0191\u018d\3\2\2\2\u0192!"+
		"\3\2\2\2\u0193\u0199\5\u00eex\2\u0194\u0195\5\u00eex\2\u0195\u0196\7\37"+
		"\2\2\u0196\u0197\5\"\22\2\u0197\u0199\3\2\2\2\u0198\u0193\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0199#\3\2\2\2\u019a\u019b\7\"\2\2\u019b\u01a1\7#\2\2\u019c"+
		"\u019d\7\"\2\2\u019d\u019e\5&\24\2\u019e\u019f\7#\2\2\u019f\u01a1\3\2"+
		"\2\2\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1%\3\2\2\2\u01a2\u01a3"+
		"\7*\2\2\u01a3\u01a4\7\35\2\2\u01a4\u01ac\5\u00eex\2\u01a5\u01a6\7*\2\2"+
		"\u01a6\u01a7\7\35\2\2\u01a7\u01a8\5\u00eex\2\u01a8\u01a9\7\37\2\2\u01a9"+
		"\u01aa\5&\24\2\u01aa\u01ac\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a5\3\2"+
		"\2\2\u01ac\'\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af\5*\26\2\u01af\u01b0"+
		"\7%\2\2\u01b0)\3\2\2\2\u01b1\u01b6\5,\27\2\u01b2\u01b3\5,\27\2\u01b3\u01b4"+
		"\5*\26\2\u01b4\u01b6\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6"+
		"+\3\2\2\2\u01b7\u0210\5\64\33\2\u01b8\u01b9\5\64\33\2\u01b9\u01ba\7&\2"+
		"\2\u01ba\u0210\3\2\2\2\u01bb\u01bc\5\64\33\2\u01bc\u01bd\7,\2\2\u01bd"+
		"\u0210\3\2\2\2\u01be\u01bf\5\64\33\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7"+
		"&\2\2\u01c1\u0210\3\2\2\2\u01c2\u0210\7*\2\2\u01c3\u01c4\7*\2\2\u01c4"+
		"\u0210\7&\2\2\u01c5\u01c6\7*\2\2\u01c6\u0210\7,\2\2\u01c7\u01c8\7*\2\2"+
		"\u01c8\u01c9\7,\2\2\u01c9\u0210\7&\2\2\u01ca\u01cb\5.\30\2\u01cb\u01cc"+
		"\7*\2\2\u01cc\u0210\3\2\2\2\u01cd\u01ce\5.\30\2\u01ce\u01cf\7*\2\2\u01cf"+
		"\u01d0\7&\2\2\u01d0\u0210\3\2\2\2\u01d1\u01d2\5.\30\2\u01d2\u01d3\7*\2"+
		"\2\u01d3\u01d4\7,\2\2\u01d4\u0210\3\2\2\2\u01d5\u01d6\5.\30\2\u01d6\u01d7"+
		"\7*\2\2\u01d7\u01d8\7,\2\2\u01d8\u01d9\7&\2\2\u01d9\u0210\3\2\2\2\u01da"+
		"\u01db\7*\2\2\u01db\u0210\5\60\31\2\u01dc\u01dd\7*\2\2\u01dd\u01de\5\60"+
		"\31\2\u01de\u01df\7&\2\2\u01df\u0210\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1"+
		"\u01e2\5\60\31\2\u01e2\u01e3\7,\2\2\u01e3\u0210\3\2\2\2\u01e4\u01e5\7"+
		"*\2\2\u01e5\u01e6\5\60\31\2\u01e6\u01e7\7,\2\2\u01e7\u01e8\7&\2\2\u01e8"+
		"\u0210\3\2\2\2\u01e9\u0210\7.\2\2\u01ea\u01eb\7.\2\2\u01eb\u0210\7&\2"+
		"\2\u01ec\u01ed\7.\2\2\u01ed\u0210\7,\2\2\u01ee\u01ef\7.\2\2\u01ef\u01f0"+
		"\7,\2\2\u01f0\u0210\7&\2\2\u01f1\u0210\7/\2\2\u01f2\u01f3\7/\2\2\u01f3"+
		"\u0210\7&\2\2\u01f4\u01f5\7/\2\2\u01f5\u0210\7,\2\2\u01f6\u01f7\7/\2\2"+
		"\u01f7\u01f8\7,\2\2\u01f8\u0210\7&\2\2\u01f9\u0210\5(\25\2\u01fa\u01fb"+
		"\5(\25\2\u01fb\u01fc\7&\2\2\u01fc\u0210\3\2\2\2\u01fd\u01fe\5(\25\2\u01fe"+
		"\u01ff\7,\2\2\u01ff\u0210\3\2\2\2\u0200\u0201\5(\25\2\u0201\u0202\7,\2"+
		"\2\u0202\u0203\7&\2\2\u0203\u0210\3\2\2\2\u0204\u0210\5\u00caf\2\u0205"+
		"\u0206\5\u00caf\2\u0206\u0207\7&\2\2\u0207\u0210\3\2\2\2\u0208\u0209\5"+
		"\u00caf\2\u0209\u020a\7,\2\2\u020a\u0210\3\2\2\2\u020b\u020c\5\u00caf"+
		"\2\u020c\u020d\7,\2\2\u020d\u020e\7&\2\2\u020e\u0210\3\2\2\2\u020f\u01b7"+
		"\3\2\2\2\u020f\u01b8\3\2\2\2\u020f\u01bb\3\2\2\2\u020f\u01be\3\2\2\2\u020f"+
		"\u01c2\3\2\2\2\u020f\u01c3\3\2\2\2\u020f\u01c5\3\2\2\2\u020f\u01c7\3\2"+
		"\2\2\u020f\u01ca\3\2\2\2\u020f\u01cd\3\2\2\2\u020f\u01d1\3\2\2\2\u020f"+
		"\u01d5\3\2\2\2\u020f\u01da\3\2\2\2\u020f\u01dc\3\2\2\2\u020f\u01e0\3\2"+
		"\2\2\u020f\u01e4\3\2\2\2\u020f\u01e9\3\2\2\2\u020f\u01ea\3\2\2\2\u020f"+
		"\u01ec\3\2\2\2\u020f\u01ee\3\2\2\2\u020f\u01f1\3\2\2\2\u020f\u01f2\3\2"+
		"\2\2\u020f\u01f4\3\2\2\2\u020f\u01f6\3\2\2\2\u020f\u01f9\3\2\2\2\u020f"+
		"\u01fa\3\2\2\2\u020f\u01fd\3\2\2\2\u020f\u0200\3\2\2\2\u020f\u0204\3\2"+
		"\2\2\u020f\u0205\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u020b\3\2\2\2\u0210"+
		"-\3\2\2\2\u0211\u0212\7)\2\2\u0212/\3\2\2\2\u0213\u0214\7)\2\2\u0214\61"+
		"\3\2\2\2\u0215\u0216\5\64\33\2\u0216\u0217\7\32\2\2\u0217\63\3\2\2\2\u0218"+
		"\u0219\7*\2\2\u0219\u0229\5B\"\2\u021a\u021b\7*\2\2\u021b\u021c\7\34\2"+
		"\2\u021c\u021d\5> \2\u021d\u021e\5B\"\2\u021e\u0229\3\2\2\2\u021f\u0220"+
		"\7*\2\2\u0220\u0221\7\36\2\2\u0221\u0222\5> \2\u0222\u0223\5B\"\2\u0223"+
		"\u0229\3\2\2\2\u0224\u0229\58\35\2\u0225\u0226\5\u00caf\2\u0226\u0227"+
		"\5\66\34\2\u0227\u0229\3\2\2\2\u0228\u0218\3\2\2\2\u0228\u021a\3\2\2\2"+
		"\u0228\u021f\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0229\65"+
		"\3\2\2\2\u022a\u022b\5B\"\2\u022b\67\3\2\2\2\u022c\u022d\7*\2\2\u022d"+
		"\u022e\t\3\2\2\u022e\u022f\5:\36\2\u022f9\3\2\2\2\u0230\u0236\5<\37\2"+
		"\u0231\u0232\5<\37\2\u0232\u0233\t\3\2\2\u0233\u0234\5:\36\2\u0234\u0236"+
		"\3\2\2\2\u0235\u0230\3\2\2\2\u0235\u0231\3\2\2\2\u0236;\3\2\2\2\u0237"+
		"\u0238\5> \2\u0238\u0239\5B\"\2\u0239\u023f\3\2\2\2\u023a\u023b\5\u00ca"+
		"f\2\u023b\u023c\5\66\34\2\u023c\u023f\3\2\2\2\u023d\u023f\7*\2\2\u023e"+
		"\u0237\3\2\2\2\u023e\u023a\3\2\2\2\u023e\u023d\3\2\2\2\u023f=\3\2\2\2"+
		"\u0240\u0241\7*\2\2\u0241?\3\2\2\2\u0242\u0243\7\34\2\2\u0243A\3\2\2\2"+
		"\u0244\u0245\7$\2\2\u0245\u024b\7%\2\2\u0246\u0247\7$\2\2\u0247\u0248"+
		"\5D#\2\u0248\u0249\7%\2\2\u0249\u024b\3\2\2\2\u024a\u0244\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024bC\3\2\2\2\u024c\u0257\5\u00eex\2\u024d\u024e\5\u00ee"+
		"x\2\u024e\u024f\7\37\2\2\u024f\u0250\5D#\2\u0250\u0257\3\2\2\2\u0251\u0257"+
		"\5*\26\2\u0252\u0253\5*\26\2\u0253\u0254\7\37\2\2\u0254\u0255\5D#\2\u0255"+
		"\u0257\3\2\2\2\u0256\u024c\3\2\2\2\u0256\u024d\3\2\2\2\u0256\u0251\3\2"+
		"\2\2\u0256\u0252\3\2\2\2\u0257E\3\2\2\2\u0258\u025d\5H%\2\u0259\u025a"+
		"\5H%\2\u025a\u025b\5F$\2\u025b\u025d\3\2\2\2\u025c\u0258\3\2\2\2\u025c"+
		"\u0259\3\2\2\2\u025dG\3\2\2\2\u025e\u026a\5J&\2\u025f\u0260\5J&\2\u0260"+
		"\u0261\5L\'\2\u0261\u026a\3\2\2\2\u0262\u0263\5J&\2\u0263\u0264\5P)\2"+
		"\u0264\u026a\3\2\2\2\u0265\u0266\5J&\2\u0266\u0267\5L\'\2\u0267\u0268"+
		"\5P)\2\u0268\u026a\3\2\2\2\u0269\u025e\3\2\2\2\u0269\u025f\3\2\2\2\u0269"+
		"\u0262\3\2\2\2\u0269\u0265\3\2\2\2\u026aI\3\2\2\2\u026b\u026c\7\5\2\2"+
		"\u026c\u026d\5R*\2\u026d\u026e\5T+\2\u026eK\3\2\2\2\u026f\u0274\5N(\2"+
		"\u0270\u0271\5N(\2\u0271\u0272\5L\'\2\u0272\u0274\3\2\2\2\u0273\u026f"+
		"\3\2\2\2\u0273\u0270\3\2\2\2\u0274M\3\2\2\2\u0275\u0276\7\6\2\2\u0276"+
		"\u0277\5R*\2\u0277\u0278\5T+\2\u0278O\3\2\2\2\u0279\u027a\7\7\2\2\u027a"+
		"\u027b\5T+\2\u027bQ\3\2\2\2\u027c\u027d\5X-\2\u027dS\3\2\2\2\u027e\u027f"+
		"\7\"\2\2\u027f\u0289\7#\2\2\u0280\u0281\7\"\2\2\u0281\u0282\5V,\2\u0282"+
		"\u0283\7#\2\2\u0283\u0289\3\2\2\2\u0284\u0289\5F$\2\u0285\u0289\5\62\32"+
		"\2\u0286\u0289\5l\67\2\u0287\u0289\5\u0088E\2\u0288\u027e\3\2\2\2\u0288"+
		"\u0280\3\2\2\2\u0288\u0284\3\2\2\2\u0288\u0285\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0287\3\2\2\2\u0289U\3\2\2\2\u028a\u028f\5\6\4\2\u028b\u028c"+
		"\5\6\4\2\u028c\u028d\5V,\2\u028d\u028f\3\2\2\2\u028e\u028a\3\2\2\2\u028e"+
		"\u028b\3\2\2\2\u028fW\3\2\2\2\u0290\u0299\5Z.\2\u0291\u0292\5Z.\2\u0292"+
		"\u0293\5X-\2\u0293\u0299\3\2\2\2\u0294\u0299\5\\/\2\u0295\u0296\5\\/\2"+
		"\u0296\u0297\5X-\2\u0297\u0299\3\2\2\2\u0298\u0290\3\2\2\2\u0298\u0291"+
		"\3\2\2\2\u0298\u0294\3\2\2\2\u0298\u0295\3\2\2\2\u0299Y\3\2\2\2\u029a"+
		"\u029b\7(\2\2\u029b\u029e\5b\62\2\u029c\u029e\5b\62\2\u029d\u029a\3\2"+
		"\2\2\u029d\u029c\3\2\2\2\u029e[\3\2\2\2\u029f\u02a3\5^\60\2\u02a0\u02a1"+
		"\7(\2\2\u02a1\u02a3\5^\60\2\u02a2\u029f\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"]\3\2\2\2\u02a4\u02ad\5`\61\2\u02a5\u02a6\5`\61\2\u02a6\u02a7\t\4\2\2"+
		"\u02a7\u02ad\3\2\2\2\u02a8\u02a9\5`\61\2\u02a9\u02aa\7,\2\2\u02aa\u02ab"+
		"\t\4\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a4\3\2\2\2\u02ac\u02a5\3\2\2\2\u02ac"+
		"\u02a8\3\2\2\2\u02ad_\3\2\2\2\u02ae\u02af\7$\2\2\u02af\u02b0\5X-\2\u02b0"+
		"\u02b1\7%\2\2\u02b1a\3\2\2\2\u02b2\u02b3\5.\30\2\u02b3\u02b4\7*\2\2\u02b4"+
		"\u030c\3\2\2\2\u02b5\u02b6\5.\30\2\u02b6\u02b7\7*\2\2\u02b7\u02b8\t\4"+
		"\2\2\u02b8\u030c\3\2\2\2\u02b9\u02ba\5.\30\2\u02ba\u02bb\7*\2\2\u02bb"+
		"\u02bc\7,\2\2\u02bc\u030c\3\2\2\2\u02bd\u02be\5.\30\2\u02be\u02bf\7*\2"+
		"\2\u02bf\u02c0\7,\2\2\u02c0\u02c1\t\4\2\2\u02c1\u030c\3\2\2\2\u02c2\u02c3"+
		"\7*\2\2\u02c3\u030c\5\60\31\2\u02c4\u02c5\7*\2\2\u02c5\u02c6\5\60\31\2"+
		"\u02c6\u02c7\t\4\2\2\u02c7\u030c\3\2\2\2\u02c8\u02c9\7*\2\2\u02c9\u02ca"+
		"\5\60\31\2\u02ca\u02cb\7,\2\2\u02cb\u030c\3\2\2\2\u02cc\u02cd\7*\2\2\u02cd"+
		"\u02ce\5\60\31\2\u02ce\u02cf\7,\2\2\u02cf\u02d0\t\4\2\2\u02d0\u030c\3"+
		"\2\2\2\u02d1\u030c\7.\2\2\u02d2\u02d3\7.\2\2\u02d3\u030c\t\4\2\2\u02d4"+
		"\u02d5\7.\2\2\u02d5\u030c\7,\2\2\u02d6\u02d7\7.\2\2\u02d7\u02d8\7,\2\2"+
		"\u02d8\u030c\t\4\2\2\u02d9\u030c\7/\2\2\u02da\u02db\7/\2\2\u02db\u030c"+
		"\t\4\2\2\u02dc\u02dd\7/\2\2\u02dd\u030c\7,\2\2\u02de\u02df\7/\2\2\u02df"+
		"\u02e0\7,\2\2\u02e0\u030c\t\4\2\2\u02e1\u030c\5d\63\2\u02e2\u030c\5\64"+
		"\33\2\u02e3\u02e4\5\64\33\2\u02e4\u02e5\t\4\2\2\u02e5\u030c\3\2\2\2\u02e6"+
		"\u02e7\5\64\33\2\u02e7\u02e8\7,\2\2\u02e8\u030c\3\2\2\2\u02e9\u02ea\5"+
		"\64\33\2\u02ea\u02eb\7,\2\2\u02eb\u02ec\t\4\2\2\u02ec\u030c\3\2\2\2\u02ed"+
		"\u030c\5(\25\2\u02ee\u02ef\5(\25\2\u02ef\u02f0\t\4\2\2\u02f0\u030c\3\2"+
		"\2\2\u02f1\u02f2\5(\25\2\u02f2\u02f3\7,\2\2\u02f3\u030c\3\2\2\2\u02f4"+
		"\u02f5\5(\25\2\u02f5\u02f6\7,\2\2\u02f6\u02f7\t\4\2\2\u02f7\u030c\3\2"+
		"\2\2\u02f8\u030c\7*\2\2\u02f9\u02fa\7*\2\2\u02fa\u030c\t\4\2\2\u02fb\u02fc"+
		"\7*\2\2\u02fc\u030c\7,\2\2\u02fd\u02fe\7*\2\2\u02fe\u02ff\7,\2\2\u02ff"+
		"\u030c\t\4\2\2\u0300\u030c\5\u00caf\2\u0301\u0302\5\u00caf\2\u0302\u0303"+
		"\t\4\2\2\u0303\u030c\3\2\2\2\u0304\u0305\5\u00caf\2\u0305\u0306\7,\2\2"+
		"\u0306\u030c\3\2\2\2\u0307\u0308\5\u00caf\2\u0308\u0309\7,\2\2\u0309\u030a"+
		"\t\4\2\2\u030a\u030c\3\2\2\2\u030b\u02b2\3\2\2\2\u030b\u02b5\3\2\2\2\u030b"+
		"\u02b9\3\2\2\2\u030b\u02bd\3\2\2\2\u030b\u02c2\3\2\2\2\u030b\u02c4\3\2"+
		"\2\2\u030b\u02c8\3\2\2\2\u030b\u02cc\3\2\2\2\u030b\u02d1\3\2\2\2\u030b"+
		"\u02d2\3\2\2\2\u030b\u02d4\3\2\2\2\u030b\u02d6\3\2\2\2\u030b\u02d9\3\2"+
		"\2\2\u030b\u02da\3\2\2\2\u030b\u02dc\3\2\2\2\u030b\u02de\3\2\2\2\u030b"+
		"\u02e1\3\2\2\2\u030b\u02e2\3\2\2\2\u030b\u02e3\3\2\2\2\u030b\u02e6\3\2"+
		"\2\2\u030b\u02e9\3\2\2\2\u030b\u02ed\3\2\2\2\u030b\u02ee\3\2\2\2\u030b"+
		"\u02f1\3\2\2\2\u030b\u02f4\3\2\2\2\u030b\u02f8\3\2\2\2\u030b\u02f9\3\2"+
		"\2\2\u030b\u02fb\3\2\2\2\u030b\u02fd\3\2\2\2\u030b\u0300\3\2\2\2\u030b"+
		"\u0301\3\2\2\2\u030b\u0304\3\2\2\2\u030b\u0307\3\2\2\2\u030cc\3\2\2\2"+
		"\u030d\u030e\5f\64\2\u030e\u030f\7\33\2\2\u030f\u0310\5h\65\2\u0310e\3"+
		"\2\2\2\u0311\u0314\5\u00caf\2\u0312\u0314\7*\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0312\3\2\2\2\u0314g\3\2\2\2\u0315\u0316\5j\66\2\u0316i\3\2\2\2\u0317"+
		"\u0323\5\64\33\2\u0318\u0319\5\64\33\2\u0319\u031a\t\4\2\2\u031a\u0323"+
		"\3\2\2\2\u031b\u031c\5\64\33\2\u031c\u031d\7,\2\2\u031d\u0323\3\2\2\2"+
		"\u031e\u031f\5\64\33\2\u031f\u0320\7,\2\2\u0320\u0321\t\4\2\2\u0321\u0323"+
		"\3\2\2\2\u0322\u0317\3\2\2\2\u0322\u0318\3\2\2\2\u0322\u031b\3\2\2\2\u0322"+
		"\u031e\3\2\2\2\u0323k\3\2\2\2\u0324\u0329\5n8\2\u0325\u0326\5n8\2\u0326"+
		"\u0327\5l\67\2\u0327\u0329\3\2\2\2\u0328\u0324\3\2\2\2\u0328\u0325\3\2"+
		"\2\2\u0329m\3\2\2\2\u032a\u032b\7\b\2\2\u032b\u032c\5p9\2\u032c\u032d"+
		"\5\u0086D\2\u032do\3\2\2\2\u032e\u0332\5r:\2\u032f\u0332\5t;\2\u0330\u0332"+
		"\5v<\2\u0331\u032e\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0330\3\2\2\2\u0332"+
		"q\3\2\2\2\u0333\u0334\7$\2\2\u0334\u0337\7%\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u0333\3\2\2\2\u0336\u0335\3\2\2\2\u0337s\3\2\2\2\u0338\u0339\7$\2\2\u0339"+
		"\u033a\5|?\2\u033a\u033b\5x=\2\u033b\u033c\5~@\2\u033c\u033d\5z>\2\u033d"+
		"\u033e\5\u0080A\2\u033e\u033f\7%\2\2\u033f\u0347\3\2\2\2\u0340\u0341\5"+
		"|?\2\u0341\u0342\5x=\2\u0342\u0343\5~@\2\u0343\u0344\5z>\2\u0344\u0345"+
		"\5\u0080A\2\u0345\u0347\3\2\2\2\u0346\u0338\3\2\2\2\u0346\u0340\3\2\2"+
		"\2\u0347u\3\2\2\2\u0348\u0349\5~@\2\u0349w\3\2\2\2\u034a\u034b\7\32\2"+
		"\2\u034by\3\2\2\2\u034c\u034d\7\32\2\2\u034d{\3\2\2\2\u034e\u0353\5\32"+
		"\16\2\u034f\u0350\7\4\2\2\u0350\u0353\5\32\16\2\u0351\u0353\3\2\2\2\u0352"+
		"\u034e\3\2\2\2\u0352\u034f\3\2\2\2\u0352\u0351\3\2\2\2\u0353}\3\2\2\2"+
		"\u0354\u0357\5X-\2\u0355\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0355"+
		"\3\2\2\2\u0357\177\3\2\2\2\u0358\u035b\5\u0082B\2\u0359\u035b\3\2\2\2"+
		"\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0081\3\2\2\2\u035c\u0362"+
		"\5*\26\2\u035d\u035e\5*\26\2\u035e\u035f\7\37\2\2\u035f\u0360\5\u0082"+
		"B\2\u0360\u0362\3\2\2\2\u0361\u035c\3\2\2\2\u0361\u035d\3\2\2\2\u0362"+
		"\u0083\3\2\2\2\u0363\u0368\5\6\4\2\u0364\u0365\5\6\4\2\u0365\u0366\5\u0084"+
		"C\2\u0366\u0368\3\2\2\2\u0367\u0363\3\2\2\2\u0367\u0364\3\2\2\2\u0368"+
		"\u0085\3\2\2\2\u0369\u036a\7\"\2\2\u036a\u0374\7#\2\2\u036b\u036c\7\""+
		"\2\2\u036c\u036d\5\u0084C\2\u036d\u036e\7#\2\2\u036e\u0374\3\2\2\2\u036f"+
		"\u0374\5F$\2\u0370\u0374\5\62\32\2\u0371\u0374\5l\67\2\u0372\u0374\5\u0088"+
		"E\2\u0373\u0369\3\2\2\2\u0373\u036b\3\2\2\2\u0373\u036f\3\2\2\2\u0373"+
		"\u0370\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u0087\3\2"+
		"\2\2\u0375\u0376\7\t\2\2\u0376\u0377\5\u008aF\2\u0377\u0378\7\32\2\2\u0378"+
		"\u0089\3\2\2\2\u0379\u037c\5\u00eex\2\u037a\u037c\5*\26\2\u037b\u0379"+
		"\3\2\2\2\u037b\u037a\3\2\2\2\u037c\u008b\3\2\2\2\u037d\u037e\5\u008eH"+
		"\2\u037e\u037f\7\"\2\2\u037f\u0380\7#\2\2\u0380\u039c\3\2\2\2\u0381\u0382"+
		"\5\u008eH\2\u0382\u0383\7\"\2\2\u0383\u0384\5\u00a2R\2\u0384\u0385\7#"+
		"\2\2\u0385\u039c\3\2\2\2\u0386\u0387\5\u0094K\2\u0387\u0388\7\"\2\2\u0388"+
		"\u0389\7#\2\2\u0389\u039c\3\2\2\2\u038a\u038b\5\u0094K\2\u038b\u038c\7"+
		"\"\2\2\u038c\u038d\5\u00a2R\2\u038d\u038e\7#\2\2\u038e\u039c\3\2\2\2\u038f"+
		"\u0390\5\u009eP\2\u0390\u0391\7\"\2\2\u0391\u0392\7#\2\2\u0392\u039c\3"+
		"\2\2\2\u0393\u0394\5\u009eP\2\u0394\u0395\7\"\2\2\u0395\u0396\5\u00a2"+
		"R\2\u0396\u0397\7#\2\2\u0397\u039c\3\2\2\2\u0398\u0399\5\u00a0Q\2\u0399"+
		"\u039a\7\32\2\2\u039a\u039c\3\2\2\2\u039b\u037d\3\2\2\2\u039b\u0381\3"+
		"\2\2\2\u039b\u0386\3\2\2\2\u039b\u038a\3\2\2\2\u039b\u038f\3\2\2\2\u039b"+
		"\u0393\3\2\2\2\u039b\u0398\3\2\2\2\u039c\u008d\3\2\2\2\u039d\u039e\5\u0090"+
		"I\2\u039e\u008f\3\2\2\2\u039f\u03a0\7\n\2\2\u03a0\u03a1\7*\2\2\u03a1\u03a2"+
		"\7$\2\2\u03a2\u03bd\7%\2\2\u03a3\u03a4\7\n\2\2\u03a4\u03a5\7*\2\2\u03a5"+
		"\u03a6\7$\2\2\u03a6\u03a7\7%\2\2\u03a7\u03aa\7\30\2\2\u03a8\u03ab\5\u0092"+
		"J\2\u03a9\u03ab\7,\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03bd"+
		"\3\2\2\2\u03ac\u03ad\7\n\2\2\u03ad\u03ae\7*\2\2\u03ae\u03af\7$\2\2\u03af"+
		"\u03b0\5\u00a6T\2\u03b0\u03b1\7%\2\2\u03b1\u03bd\3\2\2\2\u03b2\u03b3\7"+
		"\n\2\2\u03b3\u03b4\7*\2\2\u03b4\u03b5\7$\2\2\u03b5\u03b6\5\u00a6T\2\u03b6"+
		"\u03b7\7%\2\2\u03b7\u03ba\7\30\2\2\u03b8\u03bb\5\u0092J\2\u03b9\u03bb"+
		"\7,\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u039f\3\2\2\2\u03bc\u03a3\3\2\2\2\u03bc\u03ac\3\2\2\2\u03bc\u03b2\3\2"+
		"\2\2\u03bd\u0091\3\2\2\2\u03be\u03bf\7*\2\2\u03bf\u0093\3\2\2\2\u03c0"+
		"\u03c1\5\u009cO\2\u03c1\u03c2\5\u0090I\2\u03c2\u0095\3\2\2\2\u03c3\u03c4"+
		"\5\u0098M\2\u03c4\u03c5\5\u0090I\2\u03c5\u03db\3\2\2\2\u03c6\u03c7\7\16"+
		"\2\2\u03c7\u03db\5\u0090I\2\u03c8\u03c9\5\u0098M\2\u03c9\u03ca\7\16\2"+
		"\2\u03ca\u03cb\5\u0090I\2\u03cb\u03db\3\2\2\2\u03cc\u03cd\7\17\2\2\u03cd"+
		"\u03ce\5\u0098M\2\u03ce\u03cf\7\16\2\2\u03cf\u03d0\5\u0090I\2\u03d0\u03db"+
		"\3\2\2\2\u03d1\u03d2\7\17\2\2\u03d2\u03d3\5\u0098M\2\u03d3\u03d4\5\u0090"+
		"I\2\u03d4\u03db\3\2\2\2\u03d5\u03d6\7\17\2\2\u03d6\u03db\5\u0090I\2\u03d7"+
		"\u03d8\7\17\2\2\u03d8\u03d9\7\16\2\2\u03d9\u03db\5\u0090I\2\u03da\u03c3"+
		"\3\2\2\2\u03da\u03c6\3\2\2\2\u03da\u03c8\3\2\2\2\u03da\u03cc\3\2\2\2\u03da"+
		"\u03d1\3\2\2\2\u03da\u03d5\3\2\2\2\u03da\u03d7\3\2\2\2\u03db\u0097\3\2"+
		"\2\2\u03dc\u03dd\t\5\2\2\u03dd\u0099\3\2\2\2\u03de\u03df\t\6\2\2\u03df"+
		"\u009b\3\2\2\2\u03e0\u03e5\5\u009aN\2\u03e1\u03e2\5\u009aN\2\u03e2\u03e3"+
		"\5\u009cO\2\u03e3\u03e5\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e1\3\2\2"+
		"\2\u03e5\u009d\3\2\2\2\u03e6\u03e7\7*\2\2\u03e7\u03e8\7$\2\2\u03e8\u03ef"+
		"\7%\2\2\u03e9\u03ea\7*\2\2\u03ea\u03eb\7$\2\2\u03eb\u03ec\5\u00a6T\2\u03ec"+
		"\u03ed\7%\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ee\u03e9\3\2"+
		"\2\2\u03ef\u009f\3\2\2\2\u03f0\u03f3\5\u008eH\2\u03f1\u03f3\5\u0094K\2"+
		"\u03f2\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3\u00a1\3\2\2\2\u03f4\u03f5"+
		"\5\u00a4S\2\u03f5\u00a3\3\2\2\2\u03f6\u03fb\5\6\4\2\u03f7\u03f8\5\6\4"+
		"\2\u03f8\u03f9\5\u00a4S\2\u03f9\u03fb\3\2\2\2\u03fa\u03f6\3\2\2\2\u03fa"+
		"\u03f7\3\2\2\2\u03fb\u00a5\3\2\2\2\u03fc\u03fd\5\u00a8U\2\u03fd\u00a7"+
		"\3\2\2\2\u03fe\u0404\5\u00aaV\2\u03ff\u0400\5\u00aaV\2\u0400\u0401\7\37"+
		"\2\2\u0401\u0402\5\u00a8U\2\u0402\u0404\3\2\2\2\u0403\u03fe\3\2\2\2\u0403"+
		"\u03ff\3\2\2\2\u0404\u00a9\3\2\2\2\u0405\u0406\7*\2\2\u0406\u0407\7,\2"+
		"\2\u0407\u00ab\3\2\2\2\u0408\u040d\5\u00aeX\2\u0409\u040d\5\u00b4[\2\u040a"+
		"\u040d\5\u00ba^\2\u040b\u040d\5\u00c6d\2\u040c\u0408\3\2\2\2\u040c\u0409"+
		"\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u00ad\3\2\2\2\u040e"+
		"\u040f\5\u00b0Y\2\u040f\u00af\3\2\2\2\u0410\u0411\7\20\2\2\u0411\u0412"+
		"\7*\2\2\u0412\u0413\7\"\2\2\u0413\u042a\7#\2\2\u0414\u0415\7\20\2\2\u0415"+
		"\u0416\7*\2\2\u0416\u0417\7\"\2\2\u0417\u0418\5\u00b2Z\2\u0418\u0419\7"+
		"#\2\2\u0419\u042a\3\2\2\2\u041a\u041b\7\20\2\2\u041b\u041c\7*\2\2\u041c"+
		"\u041d\7\22\2\2\u041d\u041e\5> \2\u041e\u041f\7\"\2\2\u041f\u0420\7#\2"+
		"\2\u0420\u042a\3\2\2\2\u0421\u0422\7\20\2\2\u0422\u0423\7*\2\2\u0423\u0424"+
		"\7\22\2\2\u0424\u0425\5> \2\u0425\u0426\7\"\2\2\u0426\u0427\5\u00b2Z\2"+
		"\u0427\u0428\7#\2\2\u0428\u042a\3\2\2\2\u0429\u0410\3\2\2\2\u0429\u0414"+
		"\3\2\2\2\u0429\u041a\3\2\2\2\u0429\u0421\3\2\2\2\u042a\u00b1\3\2\2\2\u042b"+
		"\u042c\5\u00a4S\2\u042c\u00b3\3\2\2\2\u042d\u042e\5\u00b6\\\2\u042e\u00b5"+
		"\3\2\2\2\u042f\u0430\7\21\2\2\u0430\u0431\7*\2\2\u0431\u0432\7\"\2\2\u0432"+
		"\u0449\7#\2\2\u0433\u0434\7\21\2\2\u0434\u0435\7*\2\2\u0435\u0436\7\""+
		"\2\2\u0436\u0437\5\u00b8]\2\u0437\u0438\7#\2\2\u0438\u0449\3\2\2\2\u0439"+
		"\u043a\7\21\2\2\u043a\u043b\7*\2\2\u043b\u043c\7\22\2\2\u043c\u043d\5"+
		"> \2\u043d\u043e\7\"\2\2\u043e\u043f\7#\2\2\u043f\u0449\3\2\2\2\u0440"+
		"\u0441\7\21\2\2\u0441\u0442\7*\2\2\u0442\u0443\7\22\2\2\u0443\u0444\5"+
		"> \2\u0444\u0445\7\"\2\2\u0445\u0446\5\u00b8]\2\u0446\u0447\7#\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u042f\3\2\2\2\u0448\u0433\3\2\2\2\u0448\u0439\3\2"+
		"\2\2\u0448\u0440\3\2\2\2\u0449\u00b7\3\2\2\2\u044a\u044b\5\u00a4S\2\u044b"+
		"\u00b9\3\2\2\2\u044c\u044d\5\u00be`\2\u044d\u044e\7\"\2\2\u044e\u044f"+
		"\7#\2\2\u044f\u0456\3\2\2\2\u0450\u0451\5\u00be`\2\u0451\u0452\7\"\2\2"+
		"\u0452\u0453\5\u00bc_\2\u0453\u0454\7#\2\2\u0454\u0456\3\2\2\2\u0455\u044c"+
		"\3\2\2\2\u0455\u0450\3\2\2\2\u0456\u00bb\3\2\2\2\u0457\u0458\5\u00a4S"+
		"\2\u0458\u00bd\3\2\2\2\u0459\u045a\7\23\2\2\u045a\u0480\7*\2\2\u045b\u045c"+
		"\7\23\2\2\u045c\u045d\7*\2\2\u045d\u045e\7\22\2\2\u045e\u0480\5> \2\u045f"+
		"\u0460\7\23\2\2\u0460\u0461\7*\2\2\u0461\u0462\7\24\2\2\u0462\u0480\5"+
		"> \2\u0463\u0464\7\23\2\2\u0464\u0465\7*\2\2\u0465\u0466\7\22\2\2\u0466"+
		"\u0467\5> \2\u0467\u0468\7\24\2\2\u0468\u0469\5\u00c0a\2\u0469\u0480\3"+
		"\2\2\2\u046a\u046b\7\17\2\2\u046b\u046c\7\23\2\2\u046c\u0480\7*\2\2\u046d"+
		"\u046e\7\17\2\2\u046e\u046f\7\23\2\2\u046f\u0470\7*\2\2\u0470\u0471\7"+
		"\22\2\2\u0471\u0480\5> \2\u0472\u0473\7\17\2\2\u0473\u0474\7\23\2\2\u0474"+
		"\u0475\7*\2\2\u0475\u0476\7\24\2\2\u0476\u0480\5> \2\u0477\u0478\7\17"+
		"\2\2\u0478\u0479\7\23\2\2\u0479\u047a\7*\2\2\u047a\u047b\7\22\2\2\u047b"+
		"\u047c\5> \2\u047c\u047d\7\24\2\2\u047d\u047e\5\u00c0a\2\u047e\u0480\3"+
		"\2\2\2\u047f\u0459\3\2\2\2\u047f\u045b\3\2\2\2\u047f\u045f\3\2\2\2\u047f"+
		"\u0463\3\2\2\2\u047f\u046a\3\2\2\2\u047f\u046d\3\2\2\2\u047f\u0472\3\2"+
		"\2\2\u047f\u0477\3\2\2\2\u0480\u00bf\3\2\2\2\u0481\u0482\7*\2\2\u0482"+
		"\u00c1\3\2\2\2\u0483\u0484\5\u00c4c\2\u0484\u0485\7\32\2\2\u0485\u00c3"+
		"\3\2\2\2\u0486\u0487\7$\2\2\u0487\u0488\5\u00c6d\2\u0488\u0489\7%\2\2"+
		"\u0489\u048a\t\3\2\2\u048a\u048b\5:\36\2\u048b\u0491\3\2\2\2\u048c\u048d"+
		"\7$\2\2\u048d\u048e\5\u00c6d\2\u048e\u048f\7%\2\2\u048f\u0491\3\2\2\2"+
		"\u0490\u0486\3\2\2\2\u0490\u048c\3\2\2\2\u0491\u00c5\3\2\2\2\u0492\u0493"+
		"\7\25\2\2\u0493\u0494\7\23\2\2\u0494\u0495\7\"\2\2\u0495\u049d\7#\2\2"+
		"\u0496\u0497\7\25\2\2\u0497\u0498\7\23\2\2\u0498\u0499\7\"\2\2\u0499\u049a"+
		"\5\u00c8e\2\u049a\u049b\7#\2\2\u049b\u049d\3\2\2\2\u049c\u0492\3\2\2\2"+
		"\u049c\u0496\3\2\2\2\u049d\u00c7\3\2\2\2\u049e\u04a3\5\6\4\2\u049f\u04a0"+
		"\5\6\4\2\u04a0\u04a1\5\u00c8e\2\u04a1\u04a3\3\2\2\2\u04a2\u049e\3\2\2"+
		"\2\u04a2\u049f\3\2\2\2\u04a3\u00c9\3\2\2\2\u04a4\u04a9\5\u00ccg\2\u04a5"+
		"\u04a6\5\u00ccg\2\u04a6\u04a7\5\u00caf\2\u04a7\u04a9\3\2\2\2\u04a8\u04a4"+
		"\3\2\2\2\u04a8\u04a5\3\2\2\2\u04a9\u00cb\3\2\2\2\u04aa\u04cd\7*\2\2\u04ab"+
		"\u04ac\7*\2\2\u04ac\u04cd\7\34\2\2\u04ad\u04ae\7*\2\2\u04ae\u04cd\5\u00ce"+
		"h\2\u04af\u04b0\7*\2\2\u04b0\u04b1\5\u00ceh\2\u04b1\u04b2\7\34\2\2\u04b2"+
		"\u04cd\3\2\2\2\u04b3\u04b4\5.\30\2\u04b4\u04b5\7*\2\2\u04b5\u04cd\3\2"+
		"\2\2\u04b6\u04b7\7*\2\2\u04b7\u04cd\7\34\2\2\u04b8\u04b9\5.\30\2\u04b9"+
		"\u04ba\7*\2\2\u04ba\u04bb\5\u00ceh\2\u04bb\u04cd\3\2\2\2\u04bc\u04bd\7"+
		"*\2\2\u04bd\u04be\5\u00ceh\2\u04be\u04bf\7\34\2\2\u04bf\u04cd\3\2\2\2"+
		"\u04c0\u04c1\7*\2\2\u04c1\u04cd\5\60\31\2\u04c2\u04c3\7*\2\2\u04c3\u04cd"+
		"\7\34\2\2\u04c4\u04c5\7*\2\2\u04c5\u04c6\5\u00ceh\2\u04c6\u04c7\5\60\31"+
		"\2\u04c7\u04cd\3\2\2\2\u04c8\u04c9\7*\2\2\u04c9\u04ca\5\u00ceh\2\u04ca"+
		"\u04cb\7\34\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04aa\3\2\2\2\u04cc\u04ab\3"+
		"\2\2\2\u04cc\u04ad\3\2\2\2\u04cc\u04af\3\2\2\2\u04cc\u04b3\3\2\2\2\u04cc"+
		"\u04b6\3\2\2\2\u04cc\u04b8\3\2\2\2\u04cc\u04bc\3\2\2\2\u04cc\u04c0\3\2"+
		"\2\2\u04cc\u04c2\3\2\2\2\u04cc\u04c4\3\2\2\2\u04cc\u04c8\3\2\2\2\u04cd"+
		"\u00cd\3\2\2\2\u04ce\u04cf\7 \2\2\u04cf\u04d0\5\u00d0i\2\u04d0\u04d1\7"+
		"!\2\2\u04d1\u04d8\3\2\2\2\u04d2\u04d3\7 \2\2\u04d3\u04d4\5\u00d0i\2\u04d4"+
		"\u04d5\7!\2\2\u04d5\u04d6\5\u00ceh\2\u04d6\u04d8\3\2\2\2\u04d7\u04ce\3"+
		"\2\2\2\u04d7\u04d2\3\2\2\2\u04d8\u00cf\3\2\2\2\u04d9\u04da\5*\26\2\u04da"+
		"\u00d1\3\2\2\2\u04db\u04dc\7$\2\2\u04dc\u04dd\5\u00d4k\2\u04dd\u04de\7"+
		"%\2\2\u04de\u04ed\3\2\2\2\u04df\u04e0\7$\2\2\u04e0\u04e1\5\u00d4k\2\u04e1"+
		"\u04e2\7%\2\2\u04e2\u04e3\7$\2\2\u04e3\u04e4\7%\2\2\u04e4\u04ed\3\2\2"+
		"\2\u04e5\u04e6\7$\2\2\u04e6\u04e7\5\u00d4k\2\u04e7\u04e8\7%\2\2\u04e8"+
		"\u04e9\7$\2\2\u04e9\u04ea\5*\26\2\u04ea\u04eb\7%\2\2\u04eb\u04ed\3\2\2"+
		"\2\u04ec\u04db\3\2\2\2\u04ec\u04df\3\2\2\2\u04ec\u04e5\3\2\2\2\u04ed\u00d3"+
		"\3\2\2\2\u04ee\u04ef\5\u00d6l\2\u04ef\u04f0\7\"\2\2\u04f0\u04f1\7#\2\2"+
		"\u04f1\u04f8\3\2\2\2\u04f2\u04f3\5\u00d6l\2\u04f3\u04f4\7\"\2\2\u04f4"+
		"\u04f5\5\u00a2R\2\u04f5\u04f6\7#\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04ee\3"+
		"\2\2\2\u04f7\u04f2\3\2\2\2\u04f8\u00d5\3\2\2\2\u04f9\u04fa\7\n\2\2\u04fa"+
		"\u04fb\7$\2\2\u04fb\u0513\7%\2\2\u04fc\u04fd\7\n\2\2\u04fd\u04fe\7$\2"+
		"\2\u04fe\u04ff\7%\2\2\u04ff\u0502\7\30\2\2\u0500\u0503\5\u0092J\2\u0501"+
		"\u0503\7,\2\2\u0502\u0500\3\2\2\2\u0502\u0501\3\2\2\2\u0503\u0513\3\2"+
		"\2\2\u0504\u0505\7\n\2\2\u0505\u0506\7$\2\2\u0506\u0507\5\u00a6T\2\u0507"+
		"\u0508\7%\2\2\u0508\u0513\3\2\2\2\u0509\u050a\7\n\2\2\u050a\u050b\7$\2"+
		"\2\u050b\u050c\5\u00a6T\2\u050c\u050d\7%\2\2\u050d\u0510\7\30\2\2\u050e"+
		"\u0511\5\u0092J\2\u050f\u0511\7,\2\2\u0510\u050e\3\2\2\2\u0510\u050f\3"+
		"\2\2\2\u0511\u0513\3\2\2\2\u0512\u04f9\3\2\2\2\u0512\u04fc\3\2\2\2\u0512"+
		"\u0504\3\2\2\2\u0512\u0509\3\2\2\2\u0513\u00d7\3\2\2\2\u0514\u0515\5\u00da"+
		"n\2\u0515\u0516\7\32\2\2\u0516\u00d9\3\2\2\2\u0517\u0518\7$\2\2\u0518"+
		"\u0519\5\u00dco\2\u0519\u051a\7%\2\2\u051a\u051b\t\3\2\2\u051b\u051c\5"+
		":\36\2\u051c\u0522\3\2\2\2\u051d\u051e\7$\2\2\u051e\u051f\5\u00dco\2\u051f"+
		"\u0520\7%\2\2\u0520\u0522\3\2\2\2\u0521\u0517\3\2\2\2\u0521\u051d\3\2"+
		"\2\2\u0522\u00db\3\2\2\2\u0523\u0524\7\25\2\2\u0524\u0525\7*\2\2\u0525"+
		"\u052d\5B\"\2\u0526\u0527\7\25\2\2\u0527\u0528\7*\2\2\u0528\u0529\5B\""+
		"\2\u0529\u052a\t\3\2\2\u052a\u052b\5:\36\2\u052b\u052d\3\2\2\2\u052c\u0523"+
		"\3\2\2\2\u052c\u0526\3\2\2\2\u052d\u00dd\3\2\2\2\u052e\u052f\5\u00e0q"+
		"\2\u052f\u0530\7\33\2\2\u0530\u0531\5\u00eex\2\u0531\u0532\7\32\2\2\u0532"+
		"\u00df\3\2\2\2\u0533\u0539\5\u00e2r\2\u0534\u0535\5\u00e2r\2\u0535\u0536"+
		"\7\33\2\2\u0536\u0537\5\u00e0q\2\u0537\u0539\3\2\2\2\u0538\u0533\3\2\2"+
		"\2\u0538\u0534\3\2\2\2\u0539\u00e1\3\2\2\2\u053a\u0540\7*\2\2\u053b\u053c"+
		"\7*\2\2\u053c\u0540\7,\2\2\u053d\u0540\5\64\33\2\u053e\u0540\5\u00caf"+
		"\2\u053f\u053a\3\2\2\2\u053f\u053b\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u053e"+
		"\3\2\2\2\u0540\u00e3\3\2\2\2\u0541\u0542\7$\2\2\u0542\u0543\5\u00e6t\2"+
		"\u0543\u0544\7%\2\2\u0544\u0545\5\u00e8u\2\u0545\u0546\5\u00eav\2\u0546"+
		"\u00e5\3\2\2\2\u0547\u054a\5\u00a6T\2\u0548\u054a\3\2\2\2\u0549\u0547"+
		"\3\2\2\2\u0549\u0548\3\2\2\2\u054a\u00e7\3\2\2\2\u054b\u054c\7\30\2\2"+
		"\u054c\u054f\t\7\2\2\u054d\u054f\3\2\2\2\u054e\u054b\3\2\2\2\u054e\u054d"+
		"\3\2\2\2\u054f\u00e9\3\2\2\2\u0550\u0551\7\31\2\2\u0551\u055b\5*\26\2"+
		"\u0552\u0553\7\31\2\2\u0553\u0554\7\"\2\2\u0554\u055b\7#\2\2\u0555\u0556"+
		"\7\31\2\2\u0556\u0557\7\"\2\2\u0557\u0558\5\u00ecw\2\u0558\u0559\7#\2"+
		"\2\u0559\u055b\3\2\2\2\u055a\u0550\3\2\2\2\u055a\u0552\3\2\2\2\u055a\u0555"+
		"\3\2\2\2\u055b\u00eb\3\2\2\2\u055c\u0561\5\6\4\2\u055d\u055e\5\6\4\2\u055e"+
		"\u055f\5\u00ecw\2\u055f\u0561\3\2\2\2\u0560\u055c\3\2\2\2\u0560\u055d"+
		"\3\2\2\2\u0561\u00ed\3\2\2\2\u0562\u057f\7*\2\2\u0563\u0564\7*\2\2\u0564"+
		"\u057f\7,\2\2\u0565\u057f\7.\2\2\u0566\u0567\7.\2\2\u0567\u057f\7,\2\2"+
		"\u0568\u057f\7/\2\2\u0569\u056a\7/\2\2\u056a\u057f\7,\2\2\u056b\u057f"+
		"\7-\2\2\u056c\u057f\5 \21\2\u056d\u057f\5$\23\2\u056e\u057f\5\64\33\2"+
		"\u056f\u0570\5\u00f0y\2\u0570\u0571\7\34\2\2\u0571\u0572\5\u00f2z\2\u0572"+
		"\u057f\3\2\2\2\u0573\u0574\5\u00f0y\2\u0574\u0575\7\36\2\2\u0575\u0576"+
		"\5\u00f2z\2\u0576\u057f\3\2\2\2\u0577\u057f\5\u00caf\2\u0578\u057f\5\u00d2"+
		"j\2\u0579\u057f\5\u00c4c\2\u057a\u057f\5\u00c6d\2\u057b\u057f\5\u00da"+
		"n\2\u057c\u057f\5*\26\2\u057d\u057f\5\u00e4s\2\u057e\u0562\3\2\2\2\u057e"+
		"\u0563\3\2\2\2\u057e\u0565\3\2\2\2\u057e\u0566\3\2\2\2\u057e\u0568\3\2"+
		"\2\2\u057e\u0569\3\2\2\2\u057e\u056b\3\2\2\2\u057e\u056c\3\2\2\2\u057e"+
		"\u056d\3\2\2\2\u057e\u056e\3\2\2\2\u057e\u056f\3\2\2\2\u057e\u0573\3\2"+
		"\2\2\u057e\u0577\3\2\2\2\u057e\u0578\3\2\2\2\u057e\u0579\3\2\2\2\u057e"+
		"\u057a\3\2\2\2\u057e\u057b\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2"+
		"\2\2\u057f\u00ef\3\2\2\2\u0580\u0581\7*\2\2\u0581\u00f1\3\2\2\2\u0582"+
		"\u0583\7*\2\2\u0583\u00f3\3\2\2\2P\u00fc\u010a\u010f\u0120\u0132\u0163"+
		"\u016a\u017b\u0189\u0191\u0198\u01a0\u01ab\u01b5\u020f\u0228\u0235\u023e"+
		"\u024a\u0256\u025c\u0269\u0273\u0288\u028e\u0298\u029d\u02a2\u02ac\u030b"+
		"\u0313\u0322\u0328\u0331\u0336\u0346\u0352\u0356\u035a\u0361\u0367\u0373"+
		"\u037b\u039b\u03aa\u03ba\u03bc\u03da\u03e4\u03ee\u03f2\u03fa\u0403\u040c"+
		"\u0429\u0448\u0455\u047f\u0490\u049c\u04a2\u04a8\u04cc\u04d7\u04ec\u04f7"+
		"\u0502\u0510\u0512\u0521\u052c\u0538\u053f\u0549\u054e\u055a\u0560\u057e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}