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
		RULE_lambdaFnCodeBlock = 116, RULE_lambdaFnCodeBlockSimple = 117, RULE_lambdaFnCodeBlockKey = 118, 
		RULE_lambdaFnCodeBlockItemsControl = 119, RULE_lambdaFnCodeBlockItems = 120, 
		RULE_lambdaFnParamsItems = 121, RULE_lambdaFnParamsControl = 122, RULE_lambdaFnParamsElements = 123, 
		RULE_generalValue = 124, RULE_objIdentifierA = 125, RULE_objIdentifierB = 126;
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
			"lambdaFnParams", "lambdaFnRet", "lambdaFnCodeBlock", "lambdaFnCodeBlockSimple", 
			"lambdaFnCodeBlockKey", "lambdaFnCodeBlockItemsControl", "lambdaFnCodeBlockItems", 
			"lambdaFnParamsItems", "lambdaFnParamsControl", "lambdaFnParamsElements", 
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
			setState(254);
			fileContent();
			setState(255);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				sentence();
				setState(259);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				oopGeneral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				anonymousClassCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				anonymousObjectCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(275);
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
			setState(283);
			match(Break);
			setState(284);
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
			setState(286);
			match(Next);
			setState(287);
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
			setState(289);
			match(Use);
			setState(290);
			useValue();
			setState(291);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				useString();
				setState(295);
				match(Separator);
				setState(296);
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
			setState(300);
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
			setState(302);
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
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(Var);
				setState(305);
				variableMembers();
				setState(306);
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
				setState(308);
				methodVisibility();
				setState(309);
				match(Var);
				setState(310);
				variableMembers();
				setState(311);
				match(End);
				}
				break;
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				variableMembers();
				setState(314);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(Var);
				setState(319);
				variableMembers();
				setState(320);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				methodPerm();
				setState(323);
				match(Var);
				setState(324);
				variableMembers();
				setState(325);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(Static);
				setState(328);
				match(Var);
				setState(329);
				variableMembers();
				setState(330);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				methodPerm();
				setState(333);
				match(Static);
				setState(334);
				match(Var);
				setState(335);
				variableMembers();
				setState(336);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(Final);
				setState(339);
				methodPerm();
				setState(340);
				match(Static);
				setState(341);
				match(Var);
				setState(342);
				variableMembers();
				setState(343);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				match(Final);
				setState(346);
				methodPerm();
				setState(347);
				match(Var);
				setState(348);
				variableMembers();
				setState(349);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				match(Final);
				setState(352);
				match(Var);
				setState(353);
				variableMembers();
				setState(354);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				match(Final);
				setState(357);
				match(Static);
				setState(358);
				match(Var);
				setState(359);
				variableMembers();
				setState(360);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				variableMembers();
				setState(363);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				variableDefinition();
				setState(369);
				match(Separator);
				setState(370);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(Identifier);
				setState(375);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				objIdentifierA();
				setState(377);
				match(Point);
				setState(378);
				objIdentifierB();
				setState(379);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				objIdentifierA();
				setState(382);
				match(TwoTwoPoint);
				setState(383);
				objIdentifierB();
				setState(384);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				arrayAccessElements();
				setState(387);
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
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(392);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(TypeSpec);
				setState(394);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(395);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
				match(New);
				setState(398);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(TypeSpec);
				setState(400);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(401);
				match(New);
				setState(402);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(OpenArIndex);
				setState(406);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(OpenArIndex);
				setState(408);
				indexArrayElements();
				setState(409);
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
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				generalValue();
				setState(415);
				match(Separator);
				setState(416);
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
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(OpenBlock);
				setState(421);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(OpenBlock);
				setState(423);
				associativeArrayElements();
				setState(424);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(Identifier);
				setState(429);
				match(TwoPoint);
				setState(430);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(Identifier);
				setState(432);
				match(TwoPoint);
				setState(433);
				generalValue();
				setState(434);
				match(Separator);
				setState(435);
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
			setState(439);
			match(OpenOp);
			setState(440);
			operationElements();
			setState(441);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				operationValue();
				setState(445);
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
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				functionCall();
				setState(451);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				functionCall();
				setState(454);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				functionCall();
				setState(457);
				match(TypeSpec);
				setState(458);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(461);
				match(Identifier);
				setState(462);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				match(Identifier);
				setState(464);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				match(Identifier);
				setState(466);
				match(TypeSpec);
				setState(467);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(468);
				firstIncDec();
				setState(469);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(471);
				firstIncDec();
				setState(472);
				match(Identifier);
				setState(473);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(475);
				firstIncDec();
				setState(476);
				match(Identifier);
				setState(477);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(479);
				firstIncDec();
				setState(480);
				match(Identifier);
				setState(481);
				match(TypeSpec);
				setState(482);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(484);
				match(Identifier);
				setState(485);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(486);
				match(Identifier);
				setState(487);
				lastIncDec();
				setState(488);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(490);
				match(Identifier);
				setState(491);
				lastIncDec();
				setState(492);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(494);
				match(Identifier);
				setState(495);
				lastIncDec();
				setState(496);
				match(TypeSpec);
				setState(497);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(499);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(500);
				match(Integer);
				setState(501);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(502);
				match(Integer);
				setState(503);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(504);
				match(Integer);
				setState(505);
				match(TypeSpec);
				setState(506);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(507);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(508);
				match(Float);
				setState(509);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(510);
				match(Float);
				setState(511);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(512);
				match(Float);
				setState(513);
				match(TypeSpec);
				setState(514);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(515);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(516);
				operationBlock();
				setState(517);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(519);
				operationBlock();
				setState(520);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(522);
				operationBlock();
				setState(523);
				match(TypeSpec);
				setState(524);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(526);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(527);
				arrayAccessElements();
				setState(528);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(530);
				arrayAccessElements();
				setState(531);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(533);
				arrayAccessElements();
				setState(534);
				match(TypeSpec);
				setState(535);
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
			setState(539);
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
			setState(541);
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
			setState(543);
			functionCall();
			setState(544);
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
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(Identifier);
				setState(547);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(Identifier);
				setState(549);
				match(Point);
				setState(550);
				identifierB();
				setState(551);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				match(Identifier);
				setState(554);
				match(TwoTwoPoint);
				setState(555);
				identifierB();
				setState(556);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				arrayAccessElements();
				setState(560);
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
			setState(564);
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
			setState(566);
			match(Identifier);
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==Point || _la==TwoTwoPoint) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(568);
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
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				functionCallCascadingItem();
				setState(572);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
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
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				identifierB();
				setState(578);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				arrayAccessElements();
				setState(581);
				functionCallParamAC();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
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
			setState(586);
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
			setState(588);
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(OpenOp);
				setState(591);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(OpenOp);
				setState(593);
				functionCallParamElements();
				setState(594);
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
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				generalValue();
				setState(600);
				match(Separator);
				setState(601);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				operationElements();
				setState(605);
				match(Separator);
				setState(606);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				conditionalExpressionStructBlock();
				setState(612);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				ifElementUnique();
				setState(618);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				ifElementUnique();
				setState(621);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				ifElementUnique();
				setState(624);
				elifElements();
				setState(625);
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
			setState(629);
			match(If);
			setState(630);
			conditionalExpressionItems();
			setState(631);
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				elifElementUnique();
				setState(635);
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
			setState(639);
			match(Elif);
			setState(640);
			conditionalExpressionItems();
			setState(641);
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
			setState(643);
			match(Else);
			setState(644);
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
			setState(646);
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
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(OpenBlock);
				setState(649);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(OpenBlock);
				setState(651);
				conditionalBlockElsItems();
				setState(652);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
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
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				sentence();
				setState(662);
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
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				conditionExpValue();
				setState(668);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				conditionExpBlock();
				setState(672);
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
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(Not);
				setState(677);
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
				setState(678);
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
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(Not);
				setState(683);
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
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				conditionExpBlockItem();
				setState(688);
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
				setState(690);
				conditionExpBlockItem();
				setState(691);
				match(TypeSpec);
				setState(692);
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
			setState(696);
			match(OpenOp);
			setState(697);
			conditionalExpressionElements();
			setState(698);
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
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				firstIncDec();
				setState(701);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				firstIncDec();
				setState(704);
				match(Identifier);
				setState(705);
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
				setState(707);
				firstIncDec();
				setState(708);
				match(Identifier);
				setState(709);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				firstIncDec();
				setState(712);
				match(Identifier);
				setState(713);
				match(TypeSpec);
				setState(714);
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
				setState(716);
				match(Identifier);
				setState(717);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(718);
				match(Identifier);
				setState(719);
				lastIncDec();
				setState(720);
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
				setState(722);
				match(Identifier);
				setState(723);
				lastIncDec();
				setState(724);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(726);
				match(Identifier);
				setState(727);
				lastIncDec();
				setState(728);
				match(TypeSpec);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(731);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(732);
				match(Integer);
				setState(733);
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
				setState(734);
				match(Integer);
				setState(735);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(736);
				match(Integer);
				setState(737);
				match(TypeSpec);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(739);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(740);
				match(Float);
				setState(741);
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
				setState(742);
				match(Float);
				setState(743);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(744);
				match(Float);
				setState(745);
				match(TypeSpec);
				setState(746);
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
				setState(747);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(748);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(749);
				functionCall();
				setState(750);
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
				setState(752);
				functionCall();
				setState(753);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(755);
				functionCall();
				setState(756);
				match(TypeSpec);
				setState(757);
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
				setState(759);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(760);
				operationBlock();
				setState(761);
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
				setState(763);
				operationBlock();
				setState(764);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(766);
				operationBlock();
				setState(767);
				match(TypeSpec);
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
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(770);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(771);
				match(Identifier);
				setState(772);
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
				setState(773);
				match(Identifier);
				setState(774);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(775);
				match(Identifier);
				setState(776);
				match(TypeSpec);
				setState(777);
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
				setState(778);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(779);
				arrayAccessElements();
				setState(780);
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
				setState(782);
				arrayAccessElements();
				setState(783);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(785);
				arrayAccessElements();
				setState(786);
				match(TypeSpec);
				setState(787);
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
			setState(791);
			identifierAttrFn();
			setState(792);
			match(Attr);
			setState(793);
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
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
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
			setState(799);
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
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				functionCall();
				setState(803);
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
				setState(805);
				functionCall();
				setState(806);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				functionCall();
				setState(809);
				match(TypeSpec);
				setState(810);
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
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				loopExpressionItems();
				setState(816);
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
			setState(820);
			match(For);
			setState(821);
			loopExpression();
			setState(822);
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
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
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
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(OpenOp);
				setState(830);
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
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				match(OpenOp);
				setState(835);
				loopOneMembers();
				setState(836);
				endOne();
				setState(837);
				loopTwoMembers();
				setState(838);
				endTwo();
				setState(839);
				loopThreeMembers();
				setState(840);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				loopOneMembers();
				setState(843);
				endOne();
				setState(844);
				loopTwoMembers();
				setState(845);
				endTwo();
				setState(846);
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
			setState(850);
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
			setState(852);
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
			setState(854);
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
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(Var);
				setState(858);
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
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
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
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
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
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				operationElements();
				setState(872);
				match(Separator);
				setState(873);
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
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				sentence();
				setState(879);
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
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(OpenBlock);
				setState(884);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(OpenBlock);
				setState(886);
				loopBlockElements();
				setState(887);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(890);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(891);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(892);
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
			setState(895);
			match(Ret);
			setState(896);
			retValues();
			setState(897);
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
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
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
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				functionsModes();
				setState(904);
				match(OpenBlock);
				setState(905);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				functionsModes();
				setState(908);
				match(OpenBlock);
				setState(909);
				functionCodeBlock();
				setState(910);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(912);
				functionMethodsModes();
				setState(913);
				match(OpenBlock);
				setState(914);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(916);
				functionMethodsModes();
				setState(917);
				match(OpenBlock);
				setState(918);
				functionCodeBlock();
				setState(919);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				constructClassMethod();
				setState(922);
				match(OpenBlock);
				setState(923);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(925);
				constructClassMethod();
				setState(926);
				match(OpenBlock);
				setState(927);
				functionCodeBlock();
				setState(928);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(930);
				interfaceMethod();
				setState(931);
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
			setState(935);
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
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				match(Function);
				setState(938);
				match(Identifier);
				setState(939);
				match(OpenOp);
				setState(940);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(Function);
				setState(942);
				match(Identifier);
				setState(943);
				match(OpenOp);
				setState(944);
				match(CloseOp);
				setState(945);
				match(ArrowRight);
				setState(948);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(946);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(947);
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
				setState(950);
				match(Function);
				setState(951);
				match(Identifier);
				setState(952);
				match(OpenOp);
				setState(953);
				functionParams();
				setState(954);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(956);
				match(Function);
				setState(957);
				match(Identifier);
				setState(958);
				match(OpenOp);
				setState(959);
				functionParams();
				setState(960);
				match(CloseOp);
				setState(961);
				match(ArrowRight);
				setState(964);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(962);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(963);
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
			setState(968);
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
			setState(970);
			methodVisibility();
			setState(971);
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
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				methodPerm();
				setState(974);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(Static);
				setState(977);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				methodPerm();
				setState(979);
				match(Static);
				setState(980);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(982);
				match(Final);
				setState(983);
				methodPerm();
				setState(984);
				match(Static);
				setState(985);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(987);
				match(Final);
				setState(988);
				methodPerm();
				setState(989);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(991);
				match(Final);
				setState(992);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993);
				match(Final);
				setState(994);
				match(Static);
				setState(995);
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
			setState(998);
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
			setState(1000);
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
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				visibilityItems();
				setState(1004);
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
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				match(Identifier);
				setState(1009);
				match(OpenOp);
				setState(1010);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				match(Identifier);
				setState(1012);
				match(OpenOp);
				setState(1013);
				functionParams();
				setState(1014);
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
			setState(1020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
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
				setState(1019);
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
			setState(1022);
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
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				sentence();
				setState(1026);
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
			setState(1030);
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
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				functionParamElements();
				setState(1034);
				match(Separator);
				setState(1035);
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
			setState(1039);
			match(Identifier);
			setState(1040);
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
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				classDefination();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(1045);
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
			setState(1048);
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
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(Interface);
				setState(1051);
				match(Identifier);
				setState(1052);
				match(OpenBlock);
				setState(1053);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				match(Interface);
				setState(1055);
				match(Identifier);
				setState(1056);
				match(OpenBlock);
				setState(1057);
				interfaceCodeBlock();
				setState(1058);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(Interface);
				setState(1061);
				match(Identifier);
				setState(1062);
				match(Extends);
				setState(1063);
				identifierB();
				setState(1064);
				match(OpenBlock);
				setState(1065);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1067);
				match(Interface);
				setState(1068);
				match(Identifier);
				setState(1069);
				match(Extends);
				setState(1070);
				identifierB();
				setState(1071);
				match(OpenBlock);
				setState(1072);
				interfaceCodeBlock();
				setState(1073);
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
			setState(1077);
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
			setState(1079);
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
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(Abstract);
				setState(1082);
				match(Identifier);
				setState(1083);
				match(OpenBlock);
				setState(1084);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				match(Abstract);
				setState(1086);
				match(Identifier);
				setState(1087);
				match(OpenBlock);
				setState(1088);
				abstractCodeBlock();
				setState(1089);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1091);
				match(Abstract);
				setState(1092);
				match(Identifier);
				setState(1093);
				match(Extends);
				setState(1094);
				identifierB();
				setState(1095);
				match(OpenBlock);
				setState(1096);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1098);
				match(Abstract);
				setState(1099);
				match(Identifier);
				setState(1100);
				match(Extends);
				setState(1101);
				identifierB();
				setState(1102);
				match(OpenBlock);
				setState(1103);
				abstractCodeBlock();
				setState(1104);
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
			setState(1108);
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
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				classModes();
				setState(1111);
				match(OpenBlock);
				setState(1112);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				classModes();
				setState(1115);
				match(OpenBlock);
				setState(1116);
				classCodeBlock();
				setState(1117);
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
			setState(1121);
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
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				match(Class);
				setState(1124);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				match(Class);
				setState(1126);
				match(Identifier);
				setState(1127);
				match(Extends);
				setState(1128);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				match(Class);
				setState(1130);
				match(Identifier);
				setState(1131);
				match(Implements);
				setState(1132);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				match(Class);
				setState(1134);
				match(Identifier);
				setState(1135);
				match(Extends);
				setState(1136);
				identifierB();
				setState(1137);
				match(Implements);
				setState(1138);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1140);
				match(Final);
				setState(1141);
				match(Class);
				setState(1142);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1143);
				match(Final);
				setState(1144);
				match(Class);
				setState(1145);
				match(Identifier);
				setState(1146);
				match(Extends);
				setState(1147);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1148);
				match(Final);
				setState(1149);
				match(Class);
				setState(1150);
				match(Identifier);
				setState(1151);
				match(Implements);
				setState(1152);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1153);
				match(Final);
				setState(1154);
				match(Class);
				setState(1155);
				match(Identifier);
				setState(1156);
				match(Extends);
				setState(1157);
				identifierB();
				setState(1158);
				match(Implements);
				setState(1159);
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
			setState(1163);
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
			setState(1165);
			anonymousClassCallExpr();
			setState(1166);
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
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				match(OpenOp);
				setState(1169);
				anonymousClass();
				setState(1170);
				match(CloseOp);
				setState(1171);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1172);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(OpenOp);
				setState(1175);
				anonymousClass();
				setState(1176);
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
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				match(New);
				setState(1181);
				match(Class);
				setState(1182);
				match(OpenBlock);
				setState(1183);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(New);
				setState(1185);
				match(Class);
				setState(1186);
				match(OpenBlock);
				setState(1187);
				anonymousClassElements();
				setState(1188);
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
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				sentence();
				setState(1194);
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
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				arrayAccessElementsItems();
				setState(1200);
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
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				match(Identifier);
				setState(1206);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				match(Identifier);
				setState(1208);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209);
				match(Identifier);
				setState(1210);
				accessBlockAr();
				setState(1211);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213);
				firstIncDec();
				setState(1214);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1216);
				match(Identifier);
				setState(1217);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1218);
				firstIncDec();
				setState(1219);
				match(Identifier);
				setState(1220);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1222);
				match(Identifier);
				setState(1223);
				accessBlockAr();
				setState(1224);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1226);
				match(Identifier);
				setState(1227);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1228);
				match(Identifier);
				setState(1229);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1230);
				match(Identifier);
				setState(1231);
				accessBlockAr();
				setState(1232);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1234);
				match(Identifier);
				setState(1235);
				accessBlockAr();
				setState(1236);
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
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				match(OpenArIndex);
				setState(1241);
				arrayIndexAccess();
				setState(1242);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				match(OpenArIndex);
				setState(1245);
				arrayIndexAccess();
				setState(1246);
				match(CloseArIndex);
				setState(1247);
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
			setState(1251);
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
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(OpenOp);
				setState(1254);
				anFnItems();
				setState(1255);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(OpenOp);
				setState(1258);
				anFnItems();
				setState(1259);
				match(CloseOp);
				setState(1260);
				match(OpenOp);
				setState(1261);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1263);
				match(OpenOp);
				setState(1264);
				anFnItems();
				setState(1265);
				match(CloseOp);
				setState(1266);
				match(OpenOp);
				setState(1267);
				operationElements();
				setState(1268);
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
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				functionsModesFn();
				setState(1273);
				match(OpenBlock);
				setState(1274);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				functionsModesFn();
				setState(1277);
				match(OpenBlock);
				setState(1278);
				functionCodeBlock();
				setState(1279);
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
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				match(Function);
				setState(1284);
				match(OpenOp);
				setState(1285);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				match(Function);
				setState(1287);
				match(OpenOp);
				setState(1288);
				match(CloseOp);
				setState(1289);
				match(ArrowRight);
				setState(1292);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1290);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1291);
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
				setState(1294);
				match(Function);
				setState(1295);
				match(OpenOp);
				setState(1296);
				functionParams();
				setState(1297);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299);
				match(Function);
				setState(1300);
				match(OpenOp);
				setState(1301);
				functionParams();
				setState(1302);
				match(CloseOp);
				setState(1303);
				match(ArrowRight);
				setState(1306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1304);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1305);
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
			setState(1310);
			anonymousObjectCallExpr();
			setState(1311);
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
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(OpenOp);
				setState(1314);
				anonymousObject();
				setState(1315);
				match(CloseOp);
				setState(1316);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1317);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				match(OpenOp);
				setState(1320);
				anonymousObject();
				setState(1321);
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
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				match(New);
				setState(1326);
				match(Identifier);
				setState(1327);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(New);
				setState(1329);
				match(Identifier);
				setState(1330);
				functionCallParam();
				setState(1331);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1332);
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
			setState(1336);
			variableMultipleAssignmentsModes();
			setState(1337);
			match(Attr);
			setState(1338);
			generalValue();
			setState(1339);
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
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				variableMultipleAItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				variableMultipleAItems();
				setState(1343);
				match(Attr);
				setState(1344);
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
			setState(1353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				match(Identifier);
				setState(1350);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1352);
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
			setState(1355);
			match(OpenOp);
			setState(1356);
			lambdaFnParams();
			setState(1357);
			match(CloseOp);
			setState(1358);
			lambdaFnRet();
			setState(1359);
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
		public LambdaFnParamsItemsContext lambdaFnParamsItems() {
			return getRuleContext(LambdaFnParamsItemsContext.class,0);
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
			setState(1363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				lambdaFnParamsItems();
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
			setState(1368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ArrowRight:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				match(ArrowRight);
				setState(1366);
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
		public LambdaFnCodeBlockSimpleContext lambdaFnCodeBlockSimple() {
			return getRuleContext(LambdaFnCodeBlockSimpleContext.class,0);
		}
		public LambdaFnCodeBlockKeyContext lambdaFnCodeBlockKey() {
			return getRuleContext(LambdaFnCodeBlockKeyContext.class,0);
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
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				match(ARightLB);
				setState(1371);
				lambdaFnCodeBlockSimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				match(ARightLB);
				setState(1373);
				lambdaFnCodeBlockKey();
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

	public static class LambdaFnCodeBlockSimpleContext extends ParserRuleContext {
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public LambdaFnCodeBlockSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlockSimple; }
	}

	public final LambdaFnCodeBlockSimpleContext lambdaFnCodeBlockSimple() throws RecognitionException {
		LambdaFnCodeBlockSimpleContext _localctx = new LambdaFnCodeBlockSimpleContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_lambdaFnCodeBlockSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
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

	public static class LambdaFnCodeBlockKeyContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public LambdaFnCodeBlockItemsControlContext lambdaFnCodeBlockItemsControl() {
			return getRuleContext(LambdaFnCodeBlockItemsControlContext.class,0);
		}
		public LambdaFnCodeBlockKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlockKey; }
	}

	public final LambdaFnCodeBlockKeyContext lambdaFnCodeBlockKey() throws RecognitionException {
		LambdaFnCodeBlockKeyContext _localctx = new LambdaFnCodeBlockKeyContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_lambdaFnCodeBlockKey);
		try {
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				match(OpenBlock);
				setState(1379);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				match(OpenBlock);
				setState(1381);
				lambdaFnCodeBlockItemsControl();
				setState(1382);
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

	public static class LambdaFnCodeBlockItemsControlContext extends ParserRuleContext {
		public LambdaFnCodeBlockItemsContext lambdaFnCodeBlockItems() {
			return getRuleContext(LambdaFnCodeBlockItemsContext.class,0);
		}
		public LambdaFnCodeBlockItemsControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlockItemsControl; }
	}

	public final LambdaFnCodeBlockItemsControlContext lambdaFnCodeBlockItemsControl() throws RecognitionException {
		LambdaFnCodeBlockItemsControlContext _localctx = new LambdaFnCodeBlockItemsControlContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_lambdaFnCodeBlockItemsControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			lambdaFnCodeBlockItems();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_lambdaFnCodeBlockItems);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				sentence();
				setState(1390);
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

	public static class LambdaFnParamsItemsContext extends ParserRuleContext {
		public LambdaFnParamsControlContext lambdaFnParamsControl() {
			return getRuleContext(LambdaFnParamsControlContext.class,0);
		}
		public LambdaFnParamsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParamsItems; }
	}

	public final LambdaFnParamsItemsContext lambdaFnParamsItems() throws RecognitionException {
		LambdaFnParamsItemsContext _localctx = new LambdaFnParamsItemsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_lambdaFnParamsItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			lambdaFnParamsControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFnParamsControlContext extends ParserRuleContext {
		public LambdaFnParamsElementsContext lambdaFnParamsElements() {
			return getRuleContext(LambdaFnParamsElementsContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public LambdaFnParamsControlContext lambdaFnParamsControl() {
			return getRuleContext(LambdaFnParamsControlContext.class,0);
		}
		public LambdaFnParamsControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParamsControl; }
	}

	public final LambdaFnParamsControlContext lambdaFnParamsControl() throws RecognitionException {
		LambdaFnParamsControlContext _localctx = new LambdaFnParamsControlContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_lambdaFnParamsControl);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				lambdaFnParamsElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				lambdaFnParamsElements();
				setState(1398);
				match(Separator);
				setState(1399);
				lambdaFnParamsControl();
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

	public static class LambdaFnParamsElementsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public LambdaFnParamsElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParamsElements; }
	}

	public final LambdaFnParamsElementsContext lambdaFnParamsElements() throws RecognitionException {
		LambdaFnParamsElementsContext _localctx = new LambdaFnParamsElementsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lambdaFnParamsElements);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				match(Identifier);
				setState(1404);
				match(TypeSpec);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
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
		enterRule(_localctx, 248, RULE_generalValue);
		try {
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				match(Identifier);
				setState(1410);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1411);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1412);
				match(Integer);
				setState(1413);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1414);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1415);
				match(Float);
				setState(1416);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1417);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1418);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1419);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1420);
				functionCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1421);
				objIdentifierA();
				setState(1422);
				match(Point);
				setState(1423);
				objIdentifierB();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1425);
				objIdentifierA();
				setState(1426);
				match(TwoTwoPoint);
				setState(1427);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1429);
				arrayAccessElements();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1430);
				anonymousFunction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1431);
				anonymousClassCallExpr();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1432);
				anonymousClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1433);
				anonymousObjectCallExpr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1434);
				operationElements();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1435);
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
		enterRule(_localctx, 250, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
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
		enterRule(_localctx, 252, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u05a5\4\2\t\2"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0109\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0117\n\4\3\5\3\5\3\5\5\5\u011c\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u012d\n\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u013f"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0170\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0177\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0188\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0196\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u019e\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01a5"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01ad\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01b8\n\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\5\26\u01c2\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021c\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0235\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0242\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u024b\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0257\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0263\n#\3$\3$\3$\3$\5$"+
		"\u0269\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0276\n%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\5\'\u0280\n\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u0295\n+\3,\3,\3,\3,\5,\u029b\n,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u02a5\n-\3.\3.\3.\5.\u02aa\n.\3/\3/\3/\5/\u02af\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u02b9\n\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0318\n\62\3\63\3\63\3\63\3\63\3\64\3\64\5\64"+
		"\u0320\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u032f\n\66\3\67\3\67\3\67\3\67\5\67\u0335\n\67\38\38\38\38"+
		"\39\39\39\59\u033e\n9\3:\3:\3:\5:\u0343\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\5;\u0353\n;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\5?\u035f\n?"+
		"\3@\3@\5@\u0363\n@\3A\3A\5A\u0367\nA\3B\3B\3B\3B\3B\5B\u036e\nB\3C\3C"+
		"\3C\3C\5C\u0374\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0380\nD\3E\3E\3E"+
		"\3E\3F\3F\5F\u0388\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03a8\nG\3H\3H\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03b7\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\5I\u03c7\nI\5I\u03c9\nI\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03e7\nL\3M\3M\3N"+
		"\3N\3O\3O\3O\3O\5O\u03f1\nO\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03fb\nP\3Q\3Q"+
		"\5Q\u03ff\nQ\3R\3R\3S\3S\3S\3S\5S\u0407\nS\3T\3T\3U\3U\3U\3U\3U\5U\u0410"+
		"\nU\3V\3V\3V\3W\3W\3W\3W\5W\u0419\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0436\nY\3Z\3Z\3["+
		"\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0455\n\\\3]\3]\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\5^\u0462\n^\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\5`\u048c\n`\3a\3a\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u049d"+
		"\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u04a9\nd\3e\3e\3e\3e\5e\u04af\ne"+
		"\3f\3f\3f\3f\5f\u04b5\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u04d9\ng"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04e4\nh\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u04f9\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k"+
		"\u0504\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u050f\nl\3l\3l\3l\3l\3l\3l\3l"+
		"\3l\3l\3l\3l\3l\5l\u051d\nl\5l\u051f\nl\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\3n\5n\u052e\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0539\no\3p\3p\3p"+
		"\3p\3p\3q\3q\3q\3q\3q\5q\u0545\nq\3r\3r\3r\3r\3r\5r\u054c\nr\3s\3s\3s"+
		"\3s\3s\3s\3t\3t\5t\u0556\nt\3u\3u\3u\5u\u055b\nu\3v\3v\3v\3v\5v\u0561"+
		"\nv\3w\3w\3x\3x\3x\3x\3x\3x\5x\u056b\nx\3y\3y\3z\3z\3z\3z\5z\u0573\nz"+
		"\3{\3{\3|\3|\3|\3|\3|\5|\u057c\n|\3}\3}\3}\5}\u0581\n}\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\5~\u059f\n~\3\177\3\177\3\u0080\3\u0080\3\u0080\2\2\u0081\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\2\b\4\2\33\33\'\'\4\2\34\34"+
		"\36\36\3\2&\'\3\2\13\r\3\2\13\17\4\2**,,\2\u061a\2\u0100\3\2\2\2\4\u0108"+
		"\3\2\2\2\6\u0116\3\2\2\2\b\u011b\3\2\2\2\n\u011d\3\2\2\2\f\u0120\3\2\2"+
		"\2\16\u0123\3\2\2\2\20\u012c\3\2\2\2\22\u012e\3\2\2\2\24\u0130\3\2\2\2"+
		"\26\u013e\3\2\2\2\30\u016f\3\2\2\2\32\u0176\3\2\2\2\34\u0187\3\2\2\2\36"+
		"\u0195\3\2\2\2 \u019d\3\2\2\2\"\u01a4\3\2\2\2$\u01ac\3\2\2\2&\u01b7\3"+
		"\2\2\2(\u01b9\3\2\2\2*\u01c1\3\2\2\2,\u021b\3\2\2\2.\u021d\3\2\2\2\60"+
		"\u021f\3\2\2\2\62\u0221\3\2\2\2\64\u0234\3\2\2\2\66\u0236\3\2\2\28\u0238"+
		"\3\2\2\2:\u0241\3\2\2\2<\u024a\3\2\2\2>\u024c\3\2\2\2@\u024e\3\2\2\2B"+
		"\u0256\3\2\2\2D\u0262\3\2\2\2F\u0268\3\2\2\2H\u0275\3\2\2\2J\u0277\3\2"+
		"\2\2L\u027f\3\2\2\2N\u0281\3\2\2\2P\u0285\3\2\2\2R\u0288\3\2\2\2T\u0294"+
		"\3\2\2\2V\u029a\3\2\2\2X\u02a4\3\2\2\2Z\u02a9\3\2\2\2\\\u02ae\3\2\2\2"+
		"^\u02b8\3\2\2\2`\u02ba\3\2\2\2b\u0317\3\2\2\2d\u0319\3\2\2\2f\u031f\3"+
		"\2\2\2h\u0321\3\2\2\2j\u032e\3\2\2\2l\u0334\3\2\2\2n\u0336\3\2\2\2p\u033d"+
		"\3\2\2\2r\u0342\3\2\2\2t\u0352\3\2\2\2v\u0354\3\2\2\2x\u0356\3\2\2\2z"+
		"\u0358\3\2\2\2|\u035e\3\2\2\2~\u0362\3\2\2\2\u0080\u0366\3\2\2\2\u0082"+
		"\u036d\3\2\2\2\u0084\u0373\3\2\2\2\u0086\u037f\3\2\2\2\u0088\u0381\3\2"+
		"\2\2\u008a\u0387\3\2\2\2\u008c\u03a7\3\2\2\2\u008e\u03a9\3\2\2\2\u0090"+
		"\u03c8\3\2\2\2\u0092\u03ca\3\2\2\2\u0094\u03cc\3\2\2\2\u0096\u03e6\3\2"+
		"\2\2\u0098\u03e8\3\2\2\2\u009a\u03ea\3\2\2\2\u009c\u03f0\3\2\2\2\u009e"+
		"\u03fa\3\2\2\2\u00a0\u03fe\3\2\2\2\u00a2\u0400\3\2\2\2\u00a4\u0406\3\2"+
		"\2\2\u00a6\u0408\3\2\2\2\u00a8\u040f\3\2\2\2\u00aa\u0411\3\2\2\2\u00ac"+
		"\u0418\3\2\2\2\u00ae\u041a\3\2\2\2\u00b0\u0435\3\2\2\2\u00b2\u0437\3\2"+
		"\2\2\u00b4\u0439\3\2\2\2\u00b6\u0454\3\2\2\2\u00b8\u0456\3\2\2\2\u00ba"+
		"\u0461\3\2\2\2\u00bc\u0463\3\2\2\2\u00be\u048b\3\2\2\2\u00c0\u048d\3\2"+
		"\2\2\u00c2\u048f\3\2\2\2\u00c4\u049c\3\2\2\2\u00c6\u04a8\3\2\2\2\u00c8"+
		"\u04ae\3\2\2\2\u00ca\u04b4\3\2\2\2\u00cc\u04d8\3\2\2\2\u00ce\u04e3\3\2"+
		"\2\2\u00d0\u04e5\3\2\2\2\u00d2\u04f8\3\2\2\2\u00d4\u0503\3\2\2\2\u00d6"+
		"\u051e\3\2\2\2\u00d8\u0520\3\2\2\2\u00da\u052d\3\2\2\2\u00dc\u0538\3\2"+
		"\2\2\u00de\u053a\3\2\2\2\u00e0\u0544\3\2\2\2\u00e2\u054b\3\2\2\2\u00e4"+
		"\u054d\3\2\2\2\u00e6\u0555\3\2\2\2\u00e8\u055a\3\2\2\2\u00ea\u0560\3\2"+
		"\2\2\u00ec\u0562\3\2\2\2\u00ee\u056a\3\2\2\2\u00f0\u056c\3\2\2\2\u00f2"+
		"\u0572\3\2\2\2\u00f4\u0574\3\2\2\2\u00f6\u057b\3\2\2\2\u00f8\u0580\3\2"+
		"\2\2\u00fa\u059e\3\2\2\2\u00fc\u05a0\3\2\2\2\u00fe\u05a2\3\2\2\2\u0100"+
		"\u0101\5\4\3\2\u0101\u0102\7\2\2\3\u0102\3\3\2\2\2\u0103\u0109\5\6\4\2"+
		"\u0104\u0105\5\6\4\2\u0105\u0106\5\4\3\2\u0106\u0109\3\2\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\5\3\2\2\2\u010a\u0117\5\b\5\2\u010b\u0117\5\16\b\2\u010c\u0117\5\24\13"+
		"\2\u010d\u0117\5\62\32\2\u010e\u0117\5F$\2\u010f\u0117\5l\67\2\u0110\u0117"+
		"\5\u008cG\2\u0111\u0117\5\u0088E\2\u0112\u0117\5\u00acW\2\u0113\u0117"+
		"\5\u00c2b\2\u0114\u0117\5\u00d8m\2\u0115\u0117\5\u00dep\2\u0116\u010a"+
		"\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u010d\3\2\2\2\u0116"+
		"\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2"+
		"\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\7\3\2\2\2\u0118\u011c\7\61\2\2\u0119\u011c\5\n\6"+
		"\2\u011a\u011c\5\f\7\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\t\3\2\2\2\u011d\u011e\7\26\2\2\u011e\u011f\7\32\2\2\u011f"+
		"\13\3\2\2\2\u0120\u0121\7\27\2\2\u0121\u0122\7\32\2\2\u0122\r\3\2\2\2"+
		"\u0123\u0124\7\3\2\2\u0124\u0125\5\20\t\2\u0125\u0126\7\32\2\2\u0126\17"+
		"\3\2\2\2\u0127\u012d\5\22\n\2\u0128\u0129\5\22\n\2\u0129\u012a\7\37\2"+
		"\2\u012a\u012b\5\20\t\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012d\21\3\2\2\2\u012e\u012f\7-\2\2\u012f\23\3\2\2\2\u0130"+
		"\u0131\5\26\f\2\u0131\25\3\2\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5\32"+
		"\16\2\u0134\u0135\7\32\2\2\u0135\u013f\3\2\2\2\u0136\u0137\5\u009cO\2"+
		"\u0137\u0138\7\4\2\2\u0138\u0139\5\32\16\2\u0139\u013a\7\32\2\2\u013a"+
		"\u013f\3\2\2\2\u013b\u013c\5\32\16\2\u013c\u013d\7\32\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"\27\3\2\2\2\u0140\u0141\7\4\2\2\u0141\u0142\5\32\16\2\u0142\u0143\7\32"+
		"\2\2\u0143\u0170\3\2\2\2\u0144\u0145\5\u0098M\2\u0145\u0146\7\4\2\2\u0146"+
		"\u0147\5\32\16\2\u0147\u0148\7\32\2\2\u0148\u0170\3\2\2\2\u0149\u014a"+
		"\7\16\2\2\u014a\u014b\7\4\2\2\u014b\u014c\5\32\16\2\u014c\u014d\7\32\2"+
		"\2\u014d\u0170\3\2\2\2\u014e\u014f\5\u0098M\2\u014f\u0150\7\16\2\2\u0150"+
		"\u0151\7\4\2\2\u0151\u0152\5\32\16\2\u0152\u0153\7\32\2\2\u0153\u0170"+
		"\3\2\2\2\u0154\u0155\7\17\2\2\u0155\u0156\5\u0098M\2\u0156\u0157\7\16"+
		"\2\2\u0157\u0158\7\4\2\2\u0158\u0159\5\32\16\2\u0159\u015a\7\32\2\2\u015a"+
		"\u0170\3\2\2\2\u015b\u015c\7\17\2\2\u015c\u015d\5\u0098M\2\u015d\u015e"+
		"\7\4\2\2\u015e\u015f\5\32\16\2\u015f\u0160\7\32\2\2\u0160\u0170\3\2\2"+
		"\2\u0161\u0162\7\17\2\2\u0162\u0163\7\4\2\2\u0163\u0164\5\32\16\2\u0164"+
		"\u0165\7\32\2\2\u0165\u0170\3\2\2\2\u0166\u0167\7\17\2\2\u0167\u0168\7"+
		"\16\2\2\u0168\u0169\7\4\2\2\u0169\u016a\5\32\16\2\u016a\u016b\7\32\2\2"+
		"\u016b\u0170\3\2\2\2\u016c\u016d\5\32\16\2\u016d\u016e\7\32\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u0140\3\2\2\2\u016f\u0144\3\2\2\2\u016f\u0149\3\2"+
		"\2\2\u016f\u014e\3\2\2\2\u016f\u0154\3\2\2\2\u016f\u015b\3\2\2\2\u016f"+
		"\u0161\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u016c\3\2\2\2\u0170\31\3\2\2"+
		"\2\u0171\u0177\5\34\17\2\u0172\u0173\5\34\17\2\u0173\u0174\7\37\2\2\u0174"+
		"\u0175\5\32\16\2\u0175\u0177\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0172\3"+
		"\2\2\2\u0177\33\3\2\2\2\u0178\u0179\7*\2\2\u0179\u0188\5\36\20\2\u017a"+
		"\u017b\5\u00fc\177\2\u017b\u017c\7\34\2\2\u017c\u017d\5\u00fe\u0080\2"+
		"\u017d\u017e\5\36\20\2\u017e\u0188\3\2\2\2\u017f\u0180\5\u00fc\177\2\u0180"+
		"\u0181\7\36\2\2\u0181\u0182\5\u00fe\u0080\2\u0182\u0183\5\36\20\2\u0183"+
		"\u0188\3\2\2\2\u0184\u0185\5\u00caf\2\u0185\u0186\5\36\20\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0178\3\2\2\2\u0187\u017a\3\2\2\2\u0187\u017f\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0188\35\3\2\2\2\u0189\u018a\t\2\2\2\u018a\u0196\5\u00fa"+
		"~\2\u018b\u018c\7,\2\2\u018c\u018d\t\2\2\2\u018d\u0196\5\u00fa~\2\u018e"+
		"\u018f\t\2\2\2\u018f\u0190\7\25\2\2\u0190\u0196\5\u00fa~\2\u0191\u0192"+
		"\7,\2\2\u0192\u0193\t\2\2\2\u0193\u0194\7\25\2\2\u0194\u0196\5\u00fa~"+
		"\2\u0195\u0189\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u018e\3\2\2\2\u0195\u0191"+
		"\3\2\2\2\u0196\37\3\2\2\2\u0197\u0198\7 \2\2\u0198\u019e\7!\2\2\u0199"+
		"\u019a\7 \2\2\u019a\u019b\5\"\22\2\u019b\u019c\7!\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u0197\3\2\2\2\u019d\u0199\3\2\2\2\u019e!\3\2\2\2\u019f\u01a5"+
		"\5\u00fa~\2\u01a0\u01a1\5\u00fa~\2\u01a1\u01a2\7\37\2\2\u01a2\u01a3\5"+
		"\"\22\2\u01a3\u01a5\3\2\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5"+
		"#\3\2\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01ad\7#\2\2\u01a8\u01a9\7\"\2\2\u01a9"+
		"\u01aa\5&\24\2\u01aa\u01ab\7#\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a6\3\2"+
		"\2\2\u01ac\u01a8\3\2\2\2\u01ad%\3\2\2\2\u01ae\u01af\7*\2\2\u01af\u01b0"+
		"\7\35\2\2\u01b0\u01b8\5\u00fa~\2\u01b1\u01b2\7*\2\2\u01b2\u01b3\7\35\2"+
		"\2\u01b3\u01b4\5\u00fa~\2\u01b4\u01b5\7\37\2\2\u01b5\u01b6\5&\24\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b8\'\3\2\2\2"+
		"\u01b9\u01ba\7$\2\2\u01ba\u01bb\5*\26\2\u01bb\u01bc\7%\2\2\u01bc)\3\2"+
		"\2\2\u01bd\u01c2\5,\27\2\u01be\u01bf\5,\27\2\u01bf\u01c0\5*\26\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2+\3\2\2\2"+
		"\u01c3\u021c\5\64\33\2\u01c4\u01c5\5\64\33\2\u01c5\u01c6\7&\2\2\u01c6"+
		"\u021c\3\2\2\2\u01c7\u01c8\5\64\33\2\u01c8\u01c9\7,\2\2\u01c9\u021c\3"+
		"\2\2\2\u01ca\u01cb\5\64\33\2\u01cb\u01cc\7,\2\2\u01cc\u01cd\7&\2\2\u01cd"+
		"\u021c\3\2\2\2\u01ce\u021c\7*\2\2\u01cf\u01d0\7*\2\2\u01d0\u021c\7&\2"+
		"\2\u01d1\u01d2\7*\2\2\u01d2\u021c\7,\2\2\u01d3\u01d4\7*\2\2\u01d4\u01d5"+
		"\7,\2\2\u01d5\u021c\7&\2\2\u01d6\u01d7\5.\30\2\u01d7\u01d8\7*\2\2\u01d8"+
		"\u021c\3\2\2\2\u01d9\u01da\5.\30\2\u01da\u01db\7*\2\2\u01db\u01dc\7&\2"+
		"\2\u01dc\u021c\3\2\2\2\u01dd\u01de\5.\30\2\u01de\u01df\7*\2\2\u01df\u01e0"+
		"\7,\2\2\u01e0\u021c\3\2\2\2\u01e1\u01e2\5.\30\2\u01e2\u01e3\7*\2\2\u01e3"+
		"\u01e4\7,\2\2\u01e4\u01e5\7&\2\2\u01e5\u021c\3\2\2\2\u01e6\u01e7\7*\2"+
		"\2\u01e7\u021c\5\60\31\2\u01e8\u01e9\7*\2\2\u01e9\u01ea\5\60\31\2\u01ea"+
		"\u01eb\7&\2\2\u01eb\u021c\3\2\2\2\u01ec\u01ed\7*\2\2\u01ed\u01ee\5\60"+
		"\31\2\u01ee\u01ef\7,\2\2\u01ef\u021c\3\2\2\2\u01f0\u01f1\7*\2\2\u01f1"+
		"\u01f2\5\60\31\2\u01f2\u01f3\7,\2\2\u01f3\u01f4\7&\2\2\u01f4\u021c\3\2"+
		"\2\2\u01f5\u021c\7.\2\2\u01f6\u01f7\7.\2\2\u01f7\u021c\7&\2\2\u01f8\u01f9"+
		"\7.\2\2\u01f9\u021c\7,\2\2\u01fa\u01fb\7.\2\2\u01fb\u01fc\7,\2\2\u01fc"+
		"\u021c\7&\2\2\u01fd\u021c\7/\2\2\u01fe\u01ff\7/\2\2\u01ff\u021c\7&\2\2"+
		"\u0200\u0201\7/\2\2\u0201\u021c\7,\2\2\u0202\u0203\7/\2\2\u0203\u0204"+
		"\7,\2\2\u0204\u021c\7&\2\2\u0205\u021c\5(\25\2\u0206\u0207\5(\25\2\u0207"+
		"\u0208\7&\2\2\u0208\u021c\3\2\2\2\u0209\u020a\5(\25\2\u020a\u020b\7,\2"+
		"\2\u020b\u021c\3\2\2\2\u020c\u020d\5(\25\2\u020d\u020e\7,\2\2\u020e\u020f"+
		"\7&\2\2\u020f\u021c\3\2\2\2\u0210\u021c\5\u00caf\2\u0211\u0212\5\u00ca"+
		"f\2\u0212\u0213\7&\2\2\u0213\u021c\3\2\2\2\u0214\u0215\5\u00caf\2\u0215"+
		"\u0216\7,\2\2\u0216\u021c\3\2\2\2\u0217\u0218\5\u00caf\2\u0218\u0219\7"+
		",\2\2\u0219\u021a\7&\2\2\u021a\u021c\3\2\2\2\u021b\u01c3\3\2\2\2\u021b"+
		"\u01c4\3\2\2\2\u021b\u01c7\3\2\2\2\u021b\u01ca\3\2\2\2\u021b\u01ce\3\2"+
		"\2\2\u021b\u01cf\3\2\2\2\u021b\u01d1\3\2\2\2\u021b\u01d3\3\2\2\2\u021b"+
		"\u01d6\3\2\2\2\u021b\u01d9\3\2\2\2\u021b\u01dd\3\2\2\2\u021b\u01e1\3\2"+
		"\2\2\u021b\u01e6\3\2\2\2\u021b\u01e8\3\2\2\2\u021b\u01ec\3\2\2\2\u021b"+
		"\u01f0\3\2\2\2\u021b\u01f5\3\2\2\2\u021b\u01f6\3\2\2\2\u021b\u01f8\3\2"+
		"\2\2\u021b\u01fa\3\2\2\2\u021b\u01fd\3\2\2\2\u021b\u01fe\3\2\2\2\u021b"+
		"\u0200\3\2\2\2\u021b\u0202\3\2\2\2\u021b\u0205\3\2\2\2\u021b\u0206\3\2"+
		"\2\2\u021b\u0209\3\2\2\2\u021b\u020c\3\2\2\2\u021b\u0210\3\2\2\2\u021b"+
		"\u0211\3\2\2\2\u021b\u0214\3\2\2\2\u021b\u0217\3\2\2\2\u021c-\3\2\2\2"+
		"\u021d\u021e\7)\2\2\u021e/\3\2\2\2\u021f\u0220\7)\2\2\u0220\61\3\2\2\2"+
		"\u0221\u0222\5\64\33\2\u0222\u0223\7\32\2\2\u0223\63\3\2\2\2\u0224\u0225"+
		"\7*\2\2\u0225\u0235\5B\"\2\u0226\u0227\7*\2\2\u0227\u0228\7\34\2\2\u0228"+
		"\u0229\5> \2\u0229\u022a\5B\"\2\u022a\u0235\3\2\2\2\u022b\u022c\7*\2\2"+
		"\u022c\u022d\7\36\2\2\u022d\u022e\5> \2\u022e\u022f\5B\"\2\u022f\u0235"+
		"\3\2\2\2\u0230\u0235\58\35\2\u0231\u0232\5\u00caf\2\u0232\u0233\5\66\34"+
		"\2\u0233\u0235\3\2\2\2\u0234\u0224\3\2\2\2\u0234\u0226\3\2\2\2\u0234\u022b"+
		"\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0235\65\3\2\2\2\u0236"+
		"\u0237\5B\"\2\u0237\67\3\2\2\2\u0238\u0239\7*\2\2\u0239\u023a\t\3\2\2"+
		"\u023a\u023b\5:\36\2\u023b9\3\2\2\2\u023c\u0242\5<\37\2\u023d\u023e\5"+
		"<\37\2\u023e\u023f\t\3\2\2\u023f\u0240\5:\36\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0242;\3\2\2\2\u0243\u0244\5> \2\u0244"+
		"\u0245\5B\"\2\u0245\u024b\3\2\2\2\u0246\u0247\5\u00caf\2\u0247\u0248\5"+
		"\66\34\2\u0248\u024b\3\2\2\2\u0249\u024b\7*\2\2\u024a\u0243\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024a\u0249\3\2\2\2\u024b=\3\2\2\2\u024c\u024d\7*\2\2\u024d"+
		"?\3\2\2\2\u024e\u024f\7\34\2\2\u024fA\3\2\2\2\u0250\u0251\7$\2\2\u0251"+
		"\u0257\7%\2\2\u0252\u0253\7$\2\2\u0253\u0254\5D#\2\u0254\u0255\7%\2\2"+
		"\u0255\u0257\3\2\2\2\u0256\u0250\3\2\2\2\u0256\u0252\3\2\2\2\u0257C\3"+
		"\2\2\2\u0258\u0263\5\u00fa~\2\u0259\u025a\5\u00fa~\2\u025a\u025b\7\37"+
		"\2\2\u025b\u025c\5D#\2\u025c\u0263\3\2\2\2\u025d\u0263\5*\26\2\u025e\u025f"+
		"\5*\26\2\u025f\u0260\7\37\2\2\u0260\u0261\5D#\2\u0261\u0263\3\2\2\2\u0262"+
		"\u0258\3\2\2\2\u0262\u0259\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u025e\3\2"+
		"\2\2\u0263E\3\2\2\2\u0264\u0269\5H%\2\u0265\u0266\5H%\2\u0266\u0267\5"+
		"F$\2\u0267\u0269\3\2\2\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0269"+
		"G\3\2\2\2\u026a\u0276\5J&\2\u026b\u026c\5J&\2\u026c\u026d\5L\'\2\u026d"+
		"\u0276\3\2\2\2\u026e\u026f\5J&\2\u026f\u0270\5P)\2\u0270\u0276\3\2\2\2"+
		"\u0271\u0272\5J&\2\u0272\u0273\5L\'\2\u0273\u0274\5P)\2\u0274\u0276\3"+
		"\2\2\2\u0275\u026a\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u026e\3\2\2\2\u0275"+
		"\u0271\3\2\2\2\u0276I\3\2\2\2\u0277\u0278\7\5\2\2\u0278\u0279\5R*\2\u0279"+
		"\u027a\5T+\2\u027aK\3\2\2\2\u027b\u0280\5N(\2\u027c\u027d\5N(\2\u027d"+
		"\u027e\5L\'\2\u027e\u0280\3\2\2\2\u027f\u027b\3\2\2\2\u027f\u027c\3\2"+
		"\2\2\u0280M\3\2\2\2\u0281\u0282\7\6\2\2\u0282\u0283\5R*\2\u0283\u0284"+
		"\5T+\2\u0284O\3\2\2\2\u0285\u0286\7\7\2\2\u0286\u0287\5T+\2\u0287Q\3\2"+
		"\2\2\u0288\u0289\5X-\2\u0289S\3\2\2\2\u028a\u028b\7\"\2\2\u028b\u0295"+
		"\7#\2\2\u028c\u028d\7\"\2\2\u028d\u028e\5V,\2\u028e\u028f\7#\2\2\u028f"+
		"\u0295\3\2\2\2\u0290\u0295\5F$\2\u0291\u0295\5\62\32\2\u0292\u0295\5l"+
		"\67\2\u0293\u0295\5\u0088E\2\u0294\u028a\3\2\2\2\u0294\u028c\3\2\2\2\u0294"+
		"\u0290\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2"+
		"\2\2\u0295U\3\2\2\2\u0296\u029b\5\6\4\2\u0297\u0298\5\6\4\2\u0298\u0299"+
		"\5V,\2\u0299\u029b\3\2\2\2\u029a\u0296\3\2\2\2\u029a\u0297\3\2\2\2\u029b"+
		"W\3\2\2\2\u029c\u02a5\5Z.\2\u029d\u029e\5Z.\2\u029e\u029f\5X-\2\u029f"+
		"\u02a5\3\2\2\2\u02a0\u02a5\5\\/\2\u02a1\u02a2\5\\/\2\u02a2\u02a3\5X-\2"+
		"\u02a3\u02a5\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4\u029d\3\2\2\2\u02a4\u02a0"+
		"\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a5Y\3\2\2\2\u02a6\u02a7\7(\2\2\u02a7\u02aa"+
		"\5b\62\2\u02a8\u02aa\5b\62\2\u02a9\u02a6\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"[\3\2\2\2\u02ab\u02af\5^\60\2\u02ac\u02ad\7(\2\2\u02ad\u02af\5^\60\2\u02ae"+
		"\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af]\3\2\2\2\u02b0\u02b9\5`\61\2"+
		"\u02b1\u02b2\5`\61\2\u02b2\u02b3\t\4\2\2\u02b3\u02b9\3\2\2\2\u02b4\u02b5"+
		"\5`\61\2\u02b5\u02b6\7,\2\2\u02b6\u02b7\t\4\2\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02b0\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9_\3\2\2\2"+
		"\u02ba\u02bb\7$\2\2\u02bb\u02bc\5X-\2\u02bc\u02bd\7%\2\2\u02bda\3\2\2"+
		"\2\u02be\u02bf\5.\30\2\u02bf\u02c0\7*\2\2\u02c0\u0318\3\2\2\2\u02c1\u02c2"+
		"\5.\30\2\u02c2\u02c3\7*\2\2\u02c3\u02c4\t\4\2\2\u02c4\u0318\3\2\2\2\u02c5"+
		"\u02c6\5.\30\2\u02c6\u02c7\7*\2\2\u02c7\u02c8\7,\2\2\u02c8\u0318\3\2\2"+
		"\2\u02c9\u02ca\5.\30\2\u02ca\u02cb\7*\2\2\u02cb\u02cc\7,\2\2\u02cc\u02cd"+
		"\t\4\2\2\u02cd\u0318\3\2\2\2\u02ce\u02cf\7*\2\2\u02cf\u0318\5\60\31\2"+
		"\u02d0\u02d1\7*\2\2\u02d1\u02d2\5\60\31\2\u02d2\u02d3\t\4\2\2\u02d3\u0318"+
		"\3\2\2\2\u02d4\u02d5\7*\2\2\u02d5\u02d6\5\60\31\2\u02d6\u02d7\7,\2\2\u02d7"+
		"\u0318\3\2\2\2\u02d8\u02d9\7*\2\2\u02d9\u02da\5\60\31\2\u02da\u02db\7"+
		",\2\2\u02db\u02dc\t\4\2\2\u02dc\u0318\3\2\2\2\u02dd\u0318\7.\2\2\u02de"+
		"\u02df\7.\2\2\u02df\u0318\t\4\2\2\u02e0\u02e1\7.\2\2\u02e1\u0318\7,\2"+
		"\2\u02e2\u02e3\7.\2\2\u02e3\u02e4\7,\2\2\u02e4\u0318\t\4\2\2\u02e5\u0318"+
		"\7/\2\2\u02e6\u02e7\7/\2\2\u02e7\u0318\t\4\2\2\u02e8\u02e9\7/\2\2\u02e9"+
		"\u0318\7,\2\2\u02ea\u02eb\7/\2\2\u02eb\u02ec\7,\2\2\u02ec\u0318\t\4\2"+
		"\2\u02ed\u0318\5d\63\2\u02ee\u0318\5\64\33\2\u02ef\u02f0\5\64\33\2\u02f0"+
		"\u02f1\t\4\2\2\u02f1\u0318\3\2\2\2\u02f2\u02f3\5\64\33\2\u02f3\u02f4\7"+
		",\2\2\u02f4\u0318\3\2\2\2\u02f5\u02f6\5\64\33\2\u02f6\u02f7\7,\2\2\u02f7"+
		"\u02f8\t\4\2\2\u02f8\u0318\3\2\2\2\u02f9\u0318\5(\25\2\u02fa\u02fb\5("+
		"\25\2\u02fb\u02fc\t\4\2\2\u02fc\u0318\3\2\2\2\u02fd\u02fe\5(\25\2\u02fe"+
		"\u02ff\7,\2\2\u02ff\u0318\3\2\2\2\u0300\u0301\5(\25\2\u0301\u0302\7,\2"+
		"\2\u0302\u0303\t\4\2\2\u0303\u0318\3\2\2\2\u0304\u0318\7*\2\2\u0305\u0306"+
		"\7*\2\2\u0306\u0318\t\4\2\2\u0307\u0308\7*\2\2\u0308\u0318\7,\2\2\u0309"+
		"\u030a\7*\2\2\u030a\u030b\7,\2\2\u030b\u0318\t\4\2\2\u030c\u0318\5\u00ca"+
		"f\2\u030d\u030e\5\u00caf\2\u030e\u030f\t\4\2\2\u030f\u0318\3\2\2\2\u0310"+
		"\u0311\5\u00caf\2\u0311\u0312\7,\2\2\u0312\u0318\3\2\2\2\u0313\u0314\5"+
		"\u00caf\2\u0314\u0315\7,\2\2\u0315\u0316\t\4\2\2\u0316\u0318\3\2\2\2\u0317"+
		"\u02be\3\2\2\2\u0317\u02c1\3\2\2\2\u0317\u02c5\3\2\2\2\u0317\u02c9\3\2"+
		"\2\2\u0317\u02ce\3\2\2\2\u0317\u02d0\3\2\2\2\u0317\u02d4\3\2\2\2\u0317"+
		"\u02d8\3\2\2\2\u0317\u02dd\3\2\2\2\u0317\u02de\3\2\2\2\u0317\u02e0\3\2"+
		"\2\2\u0317\u02e2\3\2\2\2\u0317\u02e5\3\2\2\2\u0317\u02e6\3\2\2\2\u0317"+
		"\u02e8\3\2\2\2\u0317\u02ea\3\2\2\2\u0317\u02ed\3\2\2\2\u0317\u02ee\3\2"+
		"\2\2\u0317\u02ef\3\2\2\2\u0317\u02f2\3\2\2\2\u0317\u02f5\3\2\2\2\u0317"+
		"\u02f9\3\2\2\2\u0317\u02fa\3\2\2\2\u0317\u02fd\3\2\2\2\u0317\u0300\3\2"+
		"\2\2\u0317\u0304\3\2\2\2\u0317\u0305\3\2\2\2\u0317\u0307\3\2\2\2\u0317"+
		"\u0309\3\2\2\2\u0317\u030c\3\2\2\2\u0317\u030d\3\2\2\2\u0317\u0310\3\2"+
		"\2\2\u0317\u0313\3\2\2\2\u0318c\3\2\2\2\u0319\u031a\5f\64\2\u031a\u031b"+
		"\7\33\2\2\u031b\u031c\5h\65\2\u031ce\3\2\2\2\u031d\u0320\5\u00caf\2\u031e"+
		"\u0320\7*\2\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320g\3\2\2\2\u0321"+
		"\u0322\5j\66\2\u0322i\3\2\2\2\u0323\u032f\5\64\33\2\u0324\u0325\5\64\33"+
		"\2\u0325\u0326\t\4\2\2\u0326\u032f\3\2\2\2\u0327\u0328\5\64\33\2\u0328"+
		"\u0329\7,\2\2\u0329\u032f\3\2\2\2\u032a\u032b\5\64\33\2\u032b\u032c\7"+
		",\2\2\u032c\u032d\t\4\2\2\u032d\u032f\3\2\2\2\u032e\u0323\3\2\2\2\u032e"+
		"\u0324\3\2\2\2\u032e\u0327\3\2\2\2\u032e\u032a\3\2\2\2\u032fk\3\2\2\2"+
		"\u0330\u0335\5n8\2\u0331\u0332\5n8\2\u0332\u0333\5l\67\2\u0333\u0335\3"+
		"\2\2\2\u0334\u0330\3\2\2\2\u0334\u0331\3\2\2\2\u0335m\3\2\2\2\u0336\u0337"+
		"\7\b\2\2\u0337\u0338\5p9\2\u0338\u0339\5\u0086D\2\u0339o\3\2\2\2\u033a"+
		"\u033e\5r:\2\u033b\u033e\5t;\2\u033c\u033e\5v<\2\u033d\u033a\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033c\3\2\2\2\u033eq\3\2\2\2\u033f\u0340\7$\2\2\u0340"+
		"\u0343\7%\2\2\u0341\u0343\3\2\2\2\u0342\u033f\3\2\2\2\u0342\u0341\3\2"+
		"\2\2\u0343s\3\2\2\2\u0344\u0345\7$\2\2\u0345\u0346\5|?\2\u0346\u0347\5"+
		"x=\2\u0347\u0348\5~@\2\u0348\u0349\5z>\2\u0349\u034a\5\u0080A\2\u034a"+
		"\u034b\7%\2\2\u034b\u0353\3\2\2\2\u034c\u034d\5|?\2\u034d\u034e\5x=\2"+
		"\u034e\u034f\5~@\2\u034f\u0350\5z>\2\u0350\u0351\5\u0080A\2\u0351\u0353"+
		"\3\2\2\2\u0352\u0344\3\2\2\2\u0352\u034c\3\2\2\2\u0353u\3\2\2\2\u0354"+
		"\u0355\5~@\2\u0355w\3\2\2\2\u0356\u0357\7\32\2\2\u0357y\3\2\2\2\u0358"+
		"\u0359\7\32\2\2\u0359{\3\2\2\2\u035a\u035f\5\32\16\2\u035b\u035c\7\4\2"+
		"\2\u035c\u035f\5\32\16\2\u035d\u035f\3\2\2\2\u035e\u035a\3\2\2\2\u035e"+
		"\u035b\3\2\2\2\u035e\u035d\3\2\2\2\u035f}\3\2\2\2\u0360\u0363\5X-\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2\2\2\u0363\177\3\2\2"+
		"\2\u0364\u0367\5\u0082B\2\u0365\u0367\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0365\3\2\2\2\u0367\u0081\3\2\2\2\u0368\u036e\5*\26\2\u0369\u036a\5*"+
		"\26\2\u036a\u036b\7\37\2\2\u036b\u036c\5\u0082B\2\u036c\u036e\3\2\2\2"+
		"\u036d\u0368\3\2\2\2\u036d\u0369\3\2\2\2\u036e\u0083\3\2\2\2\u036f\u0374"+
		"\5\6\4\2\u0370\u0371\5\6\4\2\u0371\u0372\5\u0084C\2\u0372\u0374\3\2\2"+
		"\2\u0373\u036f\3\2\2\2\u0373\u0370\3\2\2\2\u0374\u0085\3\2\2\2\u0375\u0376"+
		"\7\"\2\2\u0376\u0380\7#\2\2\u0377\u0378\7\"\2\2\u0378\u0379\5\u0084C\2"+
		"\u0379\u037a\7#\2\2\u037a\u0380\3\2\2\2\u037b\u0380\5F$\2\u037c\u0380"+
		"\5\62\32\2\u037d\u0380\5l\67\2\u037e\u0380\5\u0088E\2\u037f\u0375\3\2"+
		"\2\2\u037f\u0377\3\2\2\2\u037f\u037b\3\2\2\2\u037f\u037c\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u037e\3\2\2\2\u0380\u0087\3\2\2\2\u0381\u0382\7\t"+
		"\2\2\u0382\u0383\5\u008aF\2\u0383\u0384\7\32\2\2\u0384\u0089\3\2\2\2\u0385"+
		"\u0388\5\u00fa~\2\u0386\u0388\5*\26\2\u0387\u0385\3\2\2\2\u0387\u0386"+
		"\3\2\2\2\u0388\u008b\3\2\2\2\u0389\u038a\5\u008eH\2\u038a\u038b\7\"\2"+
		"\2\u038b\u038c\7#\2\2\u038c\u03a8\3\2\2\2\u038d\u038e\5\u008eH\2\u038e"+
		"\u038f\7\"\2\2\u038f\u0390\5\u00a2R\2\u0390\u0391\7#\2\2\u0391\u03a8\3"+
		"\2\2\2\u0392\u0393\5\u0094K\2\u0393\u0394\7\"\2\2\u0394\u0395\7#\2\2\u0395"+
		"\u03a8\3\2\2\2\u0396\u0397\5\u0094K\2\u0397\u0398\7\"\2\2\u0398\u0399"+
		"\5\u00a2R\2\u0399\u039a\7#\2\2\u039a\u03a8\3\2\2\2\u039b\u039c\5\u009e"+
		"P\2\u039c\u039d\7\"\2\2\u039d\u039e\7#\2\2\u039e\u03a8\3\2\2\2\u039f\u03a0"+
		"\5\u009eP\2\u03a0\u03a1\7\"\2\2\u03a1\u03a2\5\u00a2R\2\u03a2\u03a3\7#"+
		"\2\2\u03a3\u03a8\3\2\2\2\u03a4\u03a5\5\u00a0Q\2\u03a5\u03a6\7\32\2\2\u03a6"+
		"\u03a8\3\2\2\2\u03a7\u0389\3\2\2\2\u03a7\u038d\3\2\2\2\u03a7\u0392\3\2"+
		"\2\2\u03a7\u0396\3\2\2\2\u03a7\u039b\3\2\2\2\u03a7\u039f\3\2\2\2\u03a7"+
		"\u03a4\3\2\2\2\u03a8\u008d\3\2\2\2\u03a9\u03aa\5\u0090I\2\u03aa\u008f"+
		"\3\2\2\2\u03ab\u03ac\7\n\2\2\u03ac\u03ad\7*\2\2\u03ad\u03ae\7$\2\2\u03ae"+
		"\u03c9\7%\2\2\u03af\u03b0\7\n\2\2\u03b0\u03b1\7*\2\2\u03b1\u03b2\7$\2"+
		"\2\u03b2\u03b3\7%\2\2\u03b3\u03b6\7\30\2\2\u03b4\u03b7\5\u0092J\2\u03b5"+
		"\u03b7\7,\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03c9\3\2"+
		"\2\2\u03b8\u03b9\7\n\2\2\u03b9\u03ba\7*\2\2\u03ba\u03bb\7$\2\2\u03bb\u03bc"+
		"\5\u00a6T\2\u03bc\u03bd\7%\2\2\u03bd\u03c9\3\2\2\2\u03be\u03bf\7\n\2\2"+
		"\u03bf\u03c0\7*\2\2\u03c0\u03c1\7$\2\2\u03c1\u03c2\5\u00a6T\2\u03c2\u03c3"+
		"\7%\2\2\u03c3\u03c6\7\30\2\2\u03c4\u03c7\5\u0092J\2\u03c5\u03c7\7,\2\2"+
		"\u03c6\u03c4\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03ab"+
		"\3\2\2\2\u03c8\u03af\3\2\2\2\u03c8\u03b8\3\2\2\2\u03c8\u03be\3\2\2\2\u03c9"+
		"\u0091\3\2\2\2\u03ca\u03cb\7*\2\2\u03cb\u0093\3\2\2\2\u03cc\u03cd\5\u009c"+
		"O\2\u03cd\u03ce\5\u0090I\2\u03ce\u0095\3\2\2\2\u03cf\u03d0\5\u0098M\2"+
		"\u03d0\u03d1\5\u0090I\2\u03d1\u03e7\3\2\2\2\u03d2\u03d3\7\16\2\2\u03d3"+
		"\u03e7\5\u0090I\2\u03d4\u03d5\5\u0098M\2\u03d5\u03d6\7\16\2\2\u03d6\u03d7"+
		"\5\u0090I\2\u03d7\u03e7\3\2\2\2\u03d8\u03d9\7\17\2\2\u03d9\u03da\5\u0098"+
		"M\2\u03da\u03db\7\16\2\2\u03db\u03dc\5\u0090I\2\u03dc\u03e7\3\2\2\2\u03dd"+
		"\u03de\7\17\2\2\u03de\u03df\5\u0098M\2\u03df\u03e0\5\u0090I\2\u03e0\u03e7"+
		"\3\2\2\2\u03e1\u03e2\7\17\2\2\u03e2\u03e7\5\u0090I\2\u03e3\u03e4\7\17"+
		"\2\2\u03e4\u03e5\7\16\2\2\u03e5\u03e7\5\u0090I\2\u03e6\u03cf\3\2\2\2\u03e6"+
		"\u03d2\3\2\2\2\u03e6\u03d4\3\2\2\2\u03e6\u03d8\3\2\2\2\u03e6\u03dd\3\2"+
		"\2\2\u03e6\u03e1\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e7\u0097\3\2\2\2\u03e8"+
		"\u03e9\t\5\2\2\u03e9\u0099\3\2\2\2\u03ea\u03eb\t\6\2\2\u03eb\u009b\3\2"+
		"\2\2\u03ec\u03f1\5\u009aN\2\u03ed\u03ee\5\u009aN\2\u03ee\u03ef\5\u009c"+
		"O\2\u03ef\u03f1\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f1"+
		"\u009d\3\2\2\2\u03f2\u03f3\7*\2\2\u03f3\u03f4\7$\2\2\u03f4\u03fb\7%\2"+
		"\2\u03f5\u03f6\7*\2\2\u03f6\u03f7\7$\2\2\u03f7\u03f8\5\u00a6T\2\u03f8"+
		"\u03f9\7%\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f2\3\2\2\2\u03fa\u03f5\3\2"+
		"\2\2\u03fb\u009f\3\2\2\2\u03fc\u03ff\5\u008eH\2\u03fd\u03ff\5\u0094K\2"+
		"\u03fe\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u00a1\3\2\2\2\u0400\u0401"+
		"\5\u00a4S\2\u0401\u00a3\3\2\2\2\u0402\u0407\5\6\4\2\u0403\u0404\5\6\4"+
		"\2\u0404\u0405\5\u00a4S\2\u0405\u0407\3\2\2\2\u0406\u0402\3\2\2\2\u0406"+
		"\u0403\3\2\2\2\u0407\u00a5\3\2\2\2\u0408\u0409\5\u00a8U\2\u0409\u00a7"+
		"\3\2\2\2\u040a\u0410\5\u00aaV\2\u040b\u040c\5\u00aaV\2\u040c\u040d\7\37"+
		"\2\2\u040d\u040e\5\u00a8U\2\u040e\u0410\3\2\2\2\u040f\u040a\3\2\2\2\u040f"+
		"\u040b\3\2\2\2\u0410\u00a9\3\2\2\2\u0411\u0412\7*\2\2\u0412\u0413\7,\2"+
		"\2\u0413\u00ab\3\2\2\2\u0414\u0419\5\u00aeX\2\u0415\u0419\5\u00b4[\2\u0416"+
		"\u0419\5\u00ba^\2\u0417\u0419\5\u00c6d\2\u0418\u0414\3\2\2\2\u0418\u0415"+
		"\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419\u00ad\3\2\2\2\u041a"+
		"\u041b\5\u00b0Y\2\u041b\u00af\3\2\2\2\u041c\u041d\7\20\2\2\u041d\u041e"+
		"\7*\2\2\u041e\u041f\7\"\2\2\u041f\u0436\7#\2\2\u0420\u0421\7\20\2\2\u0421"+
		"\u0422\7*\2\2\u0422\u0423\7\"\2\2\u0423\u0424\5\u00b2Z\2\u0424\u0425\7"+
		"#\2\2\u0425\u0436\3\2\2\2\u0426\u0427\7\20\2\2\u0427\u0428\7*\2\2\u0428"+
		"\u0429\7\22\2\2\u0429\u042a\5> \2\u042a\u042b\7\"\2\2\u042b\u042c\7#\2"+
		"\2\u042c\u0436\3\2\2\2\u042d\u042e\7\20\2\2\u042e\u042f\7*\2\2\u042f\u0430"+
		"\7\22\2\2\u0430\u0431\5> \2\u0431\u0432\7\"\2\2\u0432\u0433\5\u00b2Z\2"+
		"\u0433\u0434\7#\2\2\u0434\u0436\3\2\2\2\u0435\u041c\3\2\2\2\u0435\u0420"+
		"\3\2\2\2\u0435\u0426\3\2\2\2\u0435\u042d\3\2\2\2\u0436\u00b1\3\2\2\2\u0437"+
		"\u0438\5\u00a4S\2\u0438\u00b3\3\2\2\2\u0439\u043a\5\u00b6\\\2\u043a\u00b5"+
		"\3\2\2\2\u043b\u043c\7\21\2\2\u043c\u043d\7*\2\2\u043d\u043e\7\"\2\2\u043e"+
		"\u0455\7#\2\2\u043f\u0440\7\21\2\2\u0440\u0441\7*\2\2\u0441\u0442\7\""+
		"\2\2\u0442\u0443\5\u00b8]\2\u0443\u0444\7#\2\2\u0444\u0455\3\2\2\2\u0445"+
		"\u0446\7\21\2\2\u0446\u0447\7*\2\2\u0447\u0448\7\22\2\2\u0448\u0449\5"+
		"> \2\u0449\u044a\7\"\2\2\u044a\u044b\7#\2\2\u044b\u0455\3\2\2\2\u044c"+
		"\u044d\7\21\2\2\u044d\u044e\7*\2\2\u044e\u044f\7\22\2\2\u044f\u0450\5"+
		"> \2\u0450\u0451\7\"\2\2\u0451\u0452\5\u00b8]\2\u0452\u0453\7#\2\2\u0453"+
		"\u0455\3\2\2\2\u0454\u043b\3\2\2\2\u0454\u043f\3\2\2\2\u0454\u0445\3\2"+
		"\2\2\u0454\u044c\3\2\2\2\u0455\u00b7\3\2\2\2\u0456\u0457\5\u00a4S\2\u0457"+
		"\u00b9\3\2\2\2\u0458\u0459\5\u00be`\2\u0459\u045a\7\"\2\2\u045a\u045b"+
		"\7#\2\2\u045b\u0462\3\2\2\2\u045c\u045d\5\u00be`\2\u045d\u045e\7\"\2\2"+
		"\u045e\u045f\5\u00bc_\2\u045f\u0460\7#\2\2\u0460\u0462\3\2\2\2\u0461\u0458"+
		"\3\2\2\2\u0461\u045c\3\2\2\2\u0462\u00bb\3\2\2\2\u0463\u0464\5\u00a4S"+
		"\2\u0464\u00bd\3\2\2\2\u0465\u0466\7\23\2\2\u0466\u048c\7*\2\2\u0467\u0468"+
		"\7\23\2\2\u0468\u0469\7*\2\2\u0469\u046a\7\22\2\2\u046a\u048c\5> \2\u046b"+
		"\u046c\7\23\2\2\u046c\u046d\7*\2\2\u046d\u046e\7\24\2\2\u046e\u048c\5"+
		"> \2\u046f\u0470\7\23\2\2\u0470\u0471\7*\2\2\u0471\u0472\7\22\2\2\u0472"+
		"\u0473\5> \2\u0473\u0474\7\24\2\2\u0474\u0475\5\u00c0a\2\u0475\u048c\3"+
		"\2\2\2\u0476\u0477\7\17\2\2\u0477\u0478\7\23\2\2\u0478\u048c\7*\2\2\u0479"+
		"\u047a\7\17\2\2\u047a\u047b\7\23\2\2\u047b\u047c\7*\2\2\u047c\u047d\7"+
		"\22\2\2\u047d\u048c\5> \2\u047e\u047f\7\17\2\2\u047f\u0480\7\23\2\2\u0480"+
		"\u0481\7*\2\2\u0481\u0482\7\24\2\2\u0482\u048c\5> \2\u0483\u0484\7\17"+
		"\2\2\u0484\u0485\7\23\2\2\u0485\u0486\7*\2\2\u0486\u0487\7\22\2\2\u0487"+
		"\u0488\5> \2\u0488\u0489\7\24\2\2\u0489\u048a\5\u00c0a\2\u048a\u048c\3"+
		"\2\2\2\u048b\u0465\3\2\2\2\u048b\u0467\3\2\2\2\u048b\u046b\3\2\2\2\u048b"+
		"\u046f\3\2\2\2\u048b\u0476\3\2\2\2\u048b\u0479\3\2\2\2\u048b\u047e\3\2"+
		"\2\2\u048b\u0483\3\2\2\2\u048c\u00bf\3\2\2\2\u048d\u048e\7*\2\2\u048e"+
		"\u00c1\3\2\2\2\u048f\u0490\5\u00c4c\2\u0490\u0491\7\32\2\2\u0491\u00c3"+
		"\3\2\2\2\u0492\u0493\7$\2\2\u0493\u0494\5\u00c6d\2\u0494\u0495\7%\2\2"+
		"\u0495\u0496\t\3\2\2\u0496\u0497\5:\36\2\u0497\u049d\3\2\2\2\u0498\u0499"+
		"\7$\2\2\u0499\u049a\5\u00c6d\2\u049a\u049b\7%\2\2\u049b\u049d\3\2\2\2"+
		"\u049c\u0492\3\2\2\2\u049c\u0498\3\2\2\2\u049d\u00c5\3\2\2\2\u049e\u049f"+
		"\7\25\2\2\u049f\u04a0\7\23\2\2\u04a0\u04a1\7\"\2\2\u04a1\u04a9\7#\2\2"+
		"\u04a2\u04a3\7\25\2\2\u04a3\u04a4\7\23\2\2\u04a4\u04a5\7\"\2\2\u04a5\u04a6"+
		"\5\u00c8e\2\u04a6\u04a7\7#\2\2\u04a7\u04a9\3\2\2\2\u04a8\u049e\3\2\2\2"+
		"\u04a8\u04a2\3\2\2\2\u04a9\u00c7\3\2\2\2\u04aa\u04af\5\6\4\2\u04ab\u04ac"+
		"\5\6\4\2\u04ac\u04ad\5\u00c8e\2\u04ad\u04af\3\2\2\2\u04ae\u04aa\3\2\2"+
		"\2\u04ae\u04ab\3\2\2\2\u04af\u00c9\3\2\2\2\u04b0\u04b5\5\u00ccg\2\u04b1"+
		"\u04b2\5\u00ccg\2\u04b2\u04b3\5\u00caf\2\u04b3\u04b5\3\2\2\2\u04b4\u04b0"+
		"\3\2\2\2\u04b4\u04b1\3\2\2\2\u04b5\u00cb\3\2\2\2\u04b6\u04d9\7*\2\2\u04b7"+
		"\u04b8\7*\2\2\u04b8\u04d9\7\34\2\2\u04b9\u04ba\7*\2\2\u04ba\u04d9\5\u00ce"+
		"h\2\u04bb\u04bc\7*\2\2\u04bc\u04bd\5\u00ceh\2\u04bd\u04be\7\34\2\2\u04be"+
		"\u04d9\3\2\2\2\u04bf\u04c0\5.\30\2\u04c0\u04c1\7*\2\2\u04c1\u04d9\3\2"+
		"\2\2\u04c2\u04c3\7*\2\2\u04c3\u04d9\7\34\2\2\u04c4\u04c5\5.\30\2\u04c5"+
		"\u04c6\7*\2\2\u04c6\u04c7\5\u00ceh\2\u04c7\u04d9\3\2\2\2\u04c8\u04c9\7"+
		"*\2\2\u04c9\u04ca\5\u00ceh\2\u04ca\u04cb\7\34\2\2\u04cb\u04d9\3\2\2\2"+
		"\u04cc\u04cd\7*\2\2\u04cd\u04d9\5\60\31\2\u04ce\u04cf\7*\2\2\u04cf\u04d9"+
		"\7\34\2\2\u04d0\u04d1\7*\2\2\u04d1\u04d2\5\u00ceh\2\u04d2\u04d3\5\60\31"+
		"\2\u04d3\u04d9\3\2\2\2\u04d4\u04d5\7*\2\2\u04d5\u04d6\5\u00ceh\2\u04d6"+
		"\u04d7\7\34\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04b6\3\2\2\2\u04d8\u04b7\3"+
		"\2\2\2\u04d8\u04b9\3\2\2\2\u04d8\u04bb\3\2\2\2\u04d8\u04bf\3\2\2\2\u04d8"+
		"\u04c2\3\2\2\2\u04d8\u04c4\3\2\2\2\u04d8\u04c8\3\2\2\2\u04d8\u04cc\3\2"+
		"\2\2\u04d8\u04ce\3\2\2\2\u04d8\u04d0\3\2\2\2\u04d8\u04d4\3\2\2\2\u04d9"+
		"\u00cd\3\2\2\2\u04da\u04db\7 \2\2\u04db\u04dc\5\u00d0i\2\u04dc\u04dd\7"+
		"!\2\2\u04dd\u04e4\3\2\2\2\u04de\u04df\7 \2\2\u04df\u04e0\5\u00d0i\2\u04e0"+
		"\u04e1\7!\2\2\u04e1\u04e2\5\u00ceh\2\u04e2\u04e4\3\2\2\2\u04e3\u04da\3"+
		"\2\2\2\u04e3\u04de\3\2\2\2\u04e4\u00cf\3\2\2\2\u04e5\u04e6\5*\26\2\u04e6"+
		"\u00d1\3\2\2\2\u04e7\u04e8\7$\2\2\u04e8\u04e9\5\u00d4k\2\u04e9\u04ea\7"+
		"%\2\2\u04ea\u04f9\3\2\2\2\u04eb\u04ec\7$\2\2\u04ec\u04ed\5\u00d4k\2\u04ed"+
		"\u04ee\7%\2\2\u04ee\u04ef\7$\2\2\u04ef\u04f0\7%\2\2\u04f0\u04f9\3\2\2"+
		"\2\u04f1\u04f2\7$\2\2\u04f2\u04f3\5\u00d4k\2\u04f3\u04f4\7%\2\2\u04f4"+
		"\u04f5\7$\2\2\u04f5\u04f6\5*\26\2\u04f6\u04f7\7%\2\2\u04f7\u04f9\3\2\2"+
		"\2\u04f8\u04e7\3\2\2\2\u04f8\u04eb\3\2\2\2\u04f8\u04f1\3\2\2\2\u04f9\u00d3"+
		"\3\2\2\2\u04fa\u04fb\5\u00d6l\2\u04fb\u04fc\7\"\2\2\u04fc\u04fd\7#\2\2"+
		"\u04fd\u0504\3\2\2\2\u04fe\u04ff\5\u00d6l\2\u04ff\u0500\7\"\2\2\u0500"+
		"\u0501\5\u00a2R\2\u0501\u0502\7#\2\2\u0502\u0504\3\2\2\2\u0503\u04fa\3"+
		"\2\2\2\u0503\u04fe\3\2\2\2\u0504\u00d5\3\2\2\2\u0505\u0506\7\n\2\2\u0506"+
		"\u0507\7$\2\2\u0507\u051f\7%\2\2\u0508\u0509\7\n\2\2\u0509\u050a\7$\2"+
		"\2\u050a\u050b\7%\2\2\u050b\u050e\7\30\2\2\u050c\u050f\5\u0092J\2\u050d"+
		"\u050f\7,\2\2\u050e\u050c\3\2\2\2\u050e\u050d\3\2\2\2\u050f\u051f\3\2"+
		"\2\2\u0510\u0511\7\n\2\2\u0511\u0512\7$\2\2\u0512\u0513\5\u00a6T\2\u0513"+
		"\u0514\7%\2\2\u0514\u051f\3\2\2\2\u0515\u0516\7\n\2\2\u0516\u0517\7$\2"+
		"\2\u0517\u0518\5\u00a6T\2\u0518\u0519\7%\2\2\u0519\u051c\7\30\2\2\u051a"+
		"\u051d\5\u0092J\2\u051b\u051d\7,\2\2\u051c\u051a\3\2\2\2\u051c\u051b\3"+
		"\2\2\2\u051d\u051f\3\2\2\2\u051e\u0505\3\2\2\2\u051e\u0508\3\2\2\2\u051e"+
		"\u0510\3\2\2\2\u051e\u0515\3\2\2\2\u051f\u00d7\3\2\2\2\u0520\u0521\5\u00da"+
		"n\2\u0521\u0522\7\32\2\2\u0522\u00d9\3\2\2\2\u0523\u0524\7$\2\2\u0524"+
		"\u0525\5\u00dco\2\u0525\u0526\7%\2\2\u0526\u0527\t\3\2\2\u0527\u0528\5"+
		":\36\2\u0528\u052e\3\2\2\2\u0529\u052a\7$\2\2\u052a\u052b\5\u00dco\2\u052b"+
		"\u052c\7%\2\2\u052c\u052e\3\2\2\2\u052d\u0523\3\2\2\2\u052d\u0529\3\2"+
		"\2\2\u052e\u00db\3\2\2\2\u052f\u0530\7\25\2\2\u0530\u0531\7*\2\2\u0531"+
		"\u0539\5B\"\2\u0532\u0533\7\25\2\2\u0533\u0534\7*\2\2\u0534\u0535\5B\""+
		"\2\u0535\u0536\t\3\2\2\u0536\u0537\5:\36\2\u0537\u0539\3\2\2\2\u0538\u052f"+
		"\3\2\2\2\u0538\u0532\3\2\2\2\u0539\u00dd\3\2\2\2\u053a\u053b\5\u00e0q"+
		"\2\u053b\u053c\7\33\2\2\u053c\u053d\5\u00fa~\2\u053d\u053e\7\32\2\2\u053e"+
		"\u00df\3\2\2\2\u053f\u0545\5\u00e2r\2\u0540\u0541\5\u00e2r\2\u0541\u0542"+
		"\7\33\2\2\u0542\u0543\5\u00e0q\2\u0543\u0545\3\2\2\2\u0544\u053f\3\2\2"+
		"\2\u0544\u0540\3\2\2\2\u0545\u00e1\3\2\2\2\u0546\u054c\7*\2\2\u0547\u0548"+
		"\7*\2\2\u0548\u054c\7,\2\2\u0549\u054c\5\64\33\2\u054a\u054c\5\u00caf"+
		"\2\u054b\u0546\3\2\2\2\u054b\u0547\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054a"+
		"\3\2\2\2\u054c\u00e3\3\2\2\2\u054d\u054e\7$\2\2\u054e\u054f\5\u00e6t\2"+
		"\u054f\u0550\7%\2\2\u0550\u0551\5\u00e8u\2\u0551\u0552\5\u00eav\2\u0552"+
		"\u00e5\3\2\2\2\u0553\u0556\5\u00f4{\2\u0554\u0556\3\2\2\2\u0555\u0553"+
		"\3\2\2\2\u0555\u0554\3\2\2\2\u0556\u00e7\3\2\2\2\u0557\u0558\7\30\2\2"+
		"\u0558\u055b\t\7\2\2\u0559\u055b\3\2\2\2\u055a\u0557\3\2\2\2\u055a\u0559"+
		"\3\2\2\2\u055b\u00e9\3\2\2\2\u055c\u055d\7\31\2\2\u055d\u0561\5\u00ec"+
		"w\2\u055e\u055f\7\31\2\2\u055f\u0561\5\u00eex\2\u0560\u055c\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0561\u00eb\3\2\2\2\u0562\u0563\5*\26\2\u0563\u00ed\3\2"+
		"\2\2\u0564\u0565\7\"\2\2\u0565\u056b\7#\2\2\u0566\u0567\7\"\2\2\u0567"+
		"\u0568\5\u00f0y\2\u0568\u0569\7#\2\2\u0569\u056b\3\2\2\2\u056a\u0564\3"+
		"\2\2\2\u056a\u0566\3\2\2\2\u056b\u00ef\3\2\2\2\u056c\u056d\5\u00f2z\2"+
		"\u056d\u00f1\3\2\2\2\u056e\u0573\5\6\4\2\u056f\u0570\5\6\4\2\u0570\u0571"+
		"\5\u00f2z\2\u0571\u0573\3\2\2\2\u0572\u056e\3\2\2\2\u0572\u056f\3\2\2"+
		"\2\u0573\u00f3\3\2\2\2\u0574\u0575\5\u00f6|\2\u0575\u00f5\3\2\2\2\u0576"+
		"\u057c\5\u00f8}\2\u0577\u0578\5\u00f8}\2\u0578\u0579\7\37\2\2\u0579\u057a"+
		"\5\u00f6|\2\u057a\u057c\3\2\2\2\u057b\u0576\3\2\2\2\u057b\u0577\3\2\2"+
		"\2\u057c\u00f7\3\2\2\2\u057d\u057e\7*\2\2\u057e\u0581\7,\2\2\u057f\u0581"+
		"\7*\2\2\u0580\u057d\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u00f9\3\2\2\2\u0582"+
		"\u059f\7*\2\2\u0583\u0584\7*\2\2\u0584\u059f\7,\2\2\u0585\u059f\7.\2\2"+
		"\u0586\u0587\7.\2\2\u0587\u059f\7,\2\2\u0588\u059f\7/\2\2\u0589\u058a"+
		"\7/\2\2\u058a\u059f\7,\2\2\u058b\u059f\7-\2\2\u058c\u059f\5 \21\2\u058d"+
		"\u059f\5$\23\2\u058e\u059f\5\64\33\2\u058f\u0590\5\u00fc\177\2\u0590\u0591"+
		"\7\34\2\2\u0591\u0592\5\u00fe\u0080\2\u0592\u059f\3\2\2\2\u0593\u0594"+
		"\5\u00fc\177\2\u0594\u0595\7\36\2\2\u0595\u0596\5\u00fe\u0080\2\u0596"+
		"\u059f\3\2\2\2\u0597\u059f\5\u00caf\2\u0598\u059f\5\u00d2j\2\u0599\u059f"+
		"\5\u00c4c\2\u059a\u059f\5\u00c6d\2\u059b\u059f\5\u00dan\2\u059c\u059f"+
		"\5*\26\2\u059d\u059f\5\u00e4s\2\u059e\u0582\3\2\2\2\u059e\u0583\3\2\2"+
		"\2\u059e\u0585\3\2\2\2\u059e\u0586\3\2\2\2\u059e\u0588\3\2\2\2\u059e\u0589"+
		"\3\2\2\2\u059e\u058b\3\2\2\2\u059e\u058c\3\2\2\2\u059e\u058d\3\2\2\2\u059e"+
		"\u058e\3\2\2\2\u059e\u058f\3\2\2\2\u059e\u0593\3\2\2\2\u059e\u0597\3\2"+
		"\2\2\u059e\u0598\3\2\2\2\u059e\u0599\3\2\2\2\u059e\u059a\3\2\2\2\u059e"+
		"\u059b\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u00fb\3\2"+
		"\2\2\u05a0\u05a1\7*\2\2\u05a1\u00fd\3\2\2\2\u05a2\u05a3\7*\2\2\u05a3\u00ff"+
		"\3\2\2\2S\u0108\u0116\u011b\u012c\u013e\u016f\u0176\u0187\u0195\u019d"+
		"\u01a4\u01ac\u01b7\u01c1\u021b\u0234\u0241\u024a\u0256\u0262\u0268\u0275"+
		"\u027f\u0294\u029a\u02a4\u02a9\u02ae\u02b8\u0317\u031f\u032e\u0334\u033d"+
		"\u0342\u0352\u035e\u0362\u0366\u036d\u0373\u037f\u0387\u03a7\u03b6\u03c6"+
		"\u03c8\u03e6\u03f0\u03fa\u03fe\u0406\u040f\u0418\u0435\u0454\u0461\u048b"+
		"\u049c\u04a8\u04ae\u04b4\u04d8\u04e3\u04f8\u0503\u050e\u051c\u051e\u052d"+
		"\u0538\u0544\u054b\u0555\u055a\u0560\u056a\u0572\u057b\u0580\u059e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}