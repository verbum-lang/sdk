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
		Implements=18, New=19, Break=20, Next=21, ArrowRight=22, End=23, Attr=24, 
		Point=25, TwoPoint=26, TwoTwoPoint=27, Separator=28, OpenArIndex=29, CloseArIndex=30, 
		OpenBlock=31, CloseBlock=32, OpenOp=33, CloseOp=34, ArithmeticOperator=35, 
		AssignmentOperator=36, Not=37, IncDecOperators=38, Identifier=39, IDPrefix=40, 
		TypeSpec=41, String=42, Integer=43, Float=44, Whitespace=45, Newline=46, 
		Words=47, BlockComment=48, LineComment=49;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_breakFor = 4, RULE_nextFor = 5, RULE_use = 6, RULE_useValue = 7, 
		RULE_useString = 8, RULE_variable = 9, RULE_variableModes = 10, RULE_variableModesBkp = 11, 
		RULE_variableMultipleAssignments = 12, RULE_variableMultipleAssignmentsExpr = 13, 
		RULE_variableDefinitionMA = 14, RULE_variableMembers = 15, RULE_variableDefinition = 16, 
		RULE_variableDefinitionGeneral = 17, RULE_indexArray = 18, RULE_indexArrayElements = 19, 
		RULE_associativeArray = 20, RULE_associativeArrayElements = 21, RULE_operationBlock = 22, 
		RULE_operationElements = 23, RULE_operationValue = 24, RULE_firstIncDec = 25, 
		RULE_lastIncDec = 26, RULE_callingFunction = 27, RULE_functionCall = 28, 
		RULE_functionCallParamAC = 29, RULE_methodCascadingModes = 30, RULE_functionCallCascading = 31, 
		RULE_functionCallCascadingItem = 32, RULE_identifierB = 33, RULE_pointSeparator = 34, 
		RULE_functionCallParam = 35, RULE_functionCallParamElements = 36, RULE_conditionalExpression = 37, 
		RULE_conditionalExpressionStructBlock = 38, RULE_ifElementUnique = 39, 
		RULE_elifElements = 40, RULE_elifElementUnique = 41, RULE_elseElementUnique = 42, 
		RULE_conditionalExpressionItems = 43, RULE_conditionalBlockElements = 44, 
		RULE_conditionalBlockElsItems = 45, RULE_conditionalExpressionElements = 46, 
		RULE_conditionExpValue = 47, RULE_conditionExpBlock = 48, RULE_conditionExpBlockItemValue = 49, 
		RULE_conditionExpBlockItem = 50, RULE_conditionalExpValue = 51, RULE_functionCallAndAttr = 52, 
		RULE_identifierAttrFn = 53, RULE_functionCallAttrFn = 54, RULE_functionCallAttrFnItem = 55, 
		RULE_loop = 56, RULE_loopExpressionItems = 57, RULE_loopExpression = 58, 
		RULE_loopInfinite = 59, RULE_loopComplete = 60, RULE_loopConditional = 61, 
		RULE_endOne = 62, RULE_endTwo = 63, RULE_loopOneMembers = 64, RULE_loopTwoMembers = 65, 
		RULE_loopThreeMembers = 66, RULE_loopThreeMembersValues = 67, RULE_loopBlockElements = 68, 
		RULE_loopBlockElementsLimited = 69, RULE_ret = 70, RULE_retValues = 71, 
		RULE_functions = 72, RULE_functionsModes = 73, RULE_functionGeneralModes = 74, 
		RULE_identifierRet = 75, RULE_functionMethodsModes = 76, RULE_functionMethodsModesBkp = 77, 
		RULE_methodPerm = 78, RULE_visibilityItems = 79, RULE_methodVisibility = 80, 
		RULE_constructClassMethod = 81, RULE_interfaceMethod = 82, RULE_functionCodeBlock = 83, 
		RULE_functionCodeBlockElements = 84, RULE_functionParams = 85, RULE_functionParamsControl = 86, 
		RULE_functionParamElements = 87, RULE_oopGeneral = 88, RULE_interfaceClass = 89, 
		RULE_interfaceClassDefinition = 90, RULE_interfaceCodeBlock = 91, RULE_abstractClass = 92, 
		RULE_abstractClassDefinition = 93, RULE_abstractCodeBlock = 94, RULE_classDefination = 95, 
		RULE_classCodeBlock = 96, RULE_classModes = 97, RULE_identifierC = 98, 
		RULE_anonymousClassCall = 99, RULE_anonymousClassCallExpr = 100, RULE_anonymousClass = 101, 
		RULE_anonymousClassElements = 102, RULE_arrayAccessElements = 103, RULE_arrayAccessElementsItems = 104, 
		RULE_accessBlockAr = 105, RULE_arrayIndexAccess = 106, RULE_anonymousFunction = 107, 
		RULE_anFnItems = 108, RULE_functionsModesFn = 109, RULE_generalValue = 110, 
		RULE_objIdentifierA = 111, RULE_objIdentifierB = 112;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "breakFor", "nextFor", 
			"use", "useValue", "useString", "variable", "variableModes", "variableModesBkp", 
			"variableMultipleAssignments", "variableMultipleAssignmentsExpr", "variableDefinitionMA", 
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
			"anonymousFunction", "anFnItems", "functionsModesFn", "generalValue", 
			"objIdentifierA", "objIdentifierB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'->'", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", 
			"'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "End", "Attr", 
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
			setState(226);
			fileContent();
			setState(227);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				sentence();
				setState(231);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				oopGeneral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				anonymousClassCall();
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
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
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
			setState(253);
			match(Break);
			setState(254);
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
			setState(256);
			match(Next);
			setState(257);
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
			setState(259);
			match(Use);
			setState(260);
			useValue();
			setState(261);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				useString();
				setState(265);
				match(Separator);
				setState(266);
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
			setState(270);
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
			setState(272);
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
		public VariableMultipleAssignmentsContext variableMultipleAssignments() {
			return getRuleContext(VariableMultipleAssignmentsContext.class,0);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Var);
				setState(275);
				variableMembers();
				setState(276);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				methodVisibility();
				setState(279);
				match(Var);
				setState(280);
				variableMembers();
				setState(281);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				variableMembers();
				setState(284);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				variableMultipleAssignments();
				setState(287);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(Var);
				setState(292);
				variableMembers();
				setState(293);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				methodPerm();
				setState(296);
				match(Var);
				setState(297);
				variableMembers();
				setState(298);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(Static);
				setState(301);
				match(Var);
				setState(302);
				variableMembers();
				setState(303);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				methodPerm();
				setState(306);
				match(Static);
				setState(307);
				match(Var);
				setState(308);
				variableMembers();
				setState(309);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(Final);
				setState(312);
				methodPerm();
				setState(313);
				match(Static);
				setState(314);
				match(Var);
				setState(315);
				variableMembers();
				setState(316);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				match(Final);
				setState(319);
				methodPerm();
				setState(320);
				match(Var);
				setState(321);
				variableMembers();
				setState(322);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				match(Final);
				setState(325);
				match(Var);
				setState(326);
				variableMembers();
				setState(327);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				match(Final);
				setState(330);
				match(Static);
				setState(331);
				match(Var);
				setState(332);
				variableMembers();
				setState(333);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				variableMembers();
				setState(336);
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

	public static class VariableMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsExprContext variableMultipleAssignmentsExpr() {
			return getRuleContext(VariableMultipleAssignmentsExprContext.class,0);
		}
		public VariableMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignments; }
	}

	public final VariableMultipleAssignmentsContext variableMultipleAssignments() throws RecognitionException {
		VariableMultipleAssignmentsContext _localctx = new VariableMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableMultipleAssignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			variableMultipleAssignmentsExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableMultipleAssignmentsExprContext extends ParserRuleContext {
		public VariableDefinitionMAContext variableDefinitionMA() {
			return getRuleContext(VariableDefinitionMAContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public VariableMultipleAssignmentsExprContext variableMultipleAssignmentsExpr() {
			return getRuleContext(VariableMultipleAssignmentsExprContext.class,0);
		}
		public VariableMultipleAssignmentsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsExpr; }
	}

	public final VariableMultipleAssignmentsExprContext variableMultipleAssignmentsExpr() throws RecognitionException {
		VariableMultipleAssignmentsExprContext _localctx = new VariableMultipleAssignmentsExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableMultipleAssignmentsExpr);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				variableDefinitionMA();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				variableDefinitionMA();
				setState(344);
				match(Attr);
				setState(345);
				variableMultipleAssignmentsExpr();
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

	public static class VariableDefinitionMAContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public VariableDefinitionMAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionMA; }
	}

	public final VariableDefinitionMAContext variableDefinitionMA() throws RecognitionException {
		VariableDefinitionMAContext _localctx = new VariableDefinitionMAContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDefinitionMA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			variableDefinition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_variableMembers);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				variableDefinition();
				setState(353);
				match(Separator);
				setState(354);
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
		enterRule(_localctx, 32, RULE_variableDefinition);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(Identifier);
				setState(359);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				objIdentifierA();
				setState(361);
				match(Point);
				setState(362);
				objIdentifierB();
				setState(363);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				objIdentifierA();
				setState(366);
				match(TwoTwoPoint);
				setState(367);
				objIdentifierB();
				setState(368);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				arrayAccessElements();
				setState(371);
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
		enterRule(_localctx, 34, RULE_variableDefinitionGeneral);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(376);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(TypeSpec);
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(381);
				match(New);
				setState(382);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_indexArray);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(OpenArIndex);
				setState(390);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(OpenArIndex);
				setState(392);
				indexArrayElements();
				setState(393);
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
		enterRule(_localctx, 38, RULE_indexArrayElements);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				generalValue();
				setState(399);
				match(Separator);
				setState(400);
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
		enterRule(_localctx, 40, RULE_associativeArray);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(OpenBlock);
				setState(405);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(OpenBlock);
				setState(407);
				associativeArrayElements();
				setState(408);
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
		enterRule(_localctx, 42, RULE_associativeArrayElements);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(Identifier);
				setState(413);
				match(TwoPoint);
				setState(414);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(Identifier);
				setState(416);
				match(TwoPoint);
				setState(417);
				generalValue();
				setState(418);
				match(Separator);
				setState(419);
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
		enterRule(_localctx, 44, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(OpenOp);
			setState(424);
			operationElements();
			setState(425);
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
		enterRule(_localctx, 46, RULE_operationElements);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				operationValue();
				setState(429);
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
		enterRule(_localctx, 48, RULE_operationValue);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				functionCall();
				setState(435);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				functionCall();
				setState(438);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				functionCall();
				setState(441);
				match(TypeSpec);
				setState(442);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
				match(Identifier);
				setState(446);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(447);
				match(Identifier);
				setState(448);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				match(Identifier);
				setState(450);
				match(TypeSpec);
				setState(451);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(452);
				firstIncDec();
				setState(453);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				firstIncDec();
				setState(456);
				match(Identifier);
				setState(457);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(459);
				firstIncDec();
				setState(460);
				match(Identifier);
				setState(461);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(463);
				firstIncDec();
				setState(464);
				match(Identifier);
				setState(465);
				match(TypeSpec);
				setState(466);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(468);
				match(Identifier);
				setState(469);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(470);
				match(Identifier);
				setState(471);
				lastIncDec();
				setState(472);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(474);
				match(Identifier);
				setState(475);
				lastIncDec();
				setState(476);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(478);
				match(Identifier);
				setState(479);
				lastIncDec();
				setState(480);
				match(TypeSpec);
				setState(481);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(483);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(484);
				match(Integer);
				setState(485);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(486);
				match(Integer);
				setState(487);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(488);
				match(Integer);
				setState(489);
				match(TypeSpec);
				setState(490);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(491);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(492);
				match(Float);
				setState(493);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(494);
				match(Float);
				setState(495);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(496);
				match(Float);
				setState(497);
				match(TypeSpec);
				setState(498);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(499);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(500);
				operationBlock();
				setState(501);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(503);
				operationBlock();
				setState(504);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(506);
				operationBlock();
				setState(507);
				match(TypeSpec);
				setState(508);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(510);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(511);
				arrayAccessElements();
				setState(512);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(514);
				arrayAccessElements();
				setState(515);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(517);
				arrayAccessElements();
				setState(518);
				match(TypeSpec);
				setState(519);
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
		enterRule(_localctx, 50, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 52, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		enterRule(_localctx, 54, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			functionCall();
			setState(528);
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
		enterRule(_localctx, 56, RULE_functionCall);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(Identifier);
				setState(531);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(Identifier);
				setState(533);
				match(Point);
				setState(534);
				identifierB();
				setState(535);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				match(Identifier);
				setState(538);
				match(TwoTwoPoint);
				setState(539);
				identifierB();
				setState(540);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				arrayAccessElements();
				setState(544);
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
		enterRule(_localctx, 58, RULE_functionCallParamAC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		enterRule(_localctx, 60, RULE_methodCascadingModes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Identifier);
			setState(551);
			_la = _input.LA(1);
			if ( !(_la==Point || _la==TwoTwoPoint) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(552);
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
		enterRule(_localctx, 62, RULE_functionCallCascading);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				functionCallCascadingItem();
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
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
		enterRule(_localctx, 64, RULE_functionCallCascadingItem);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				identifierB();
				setState(562);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				arrayAccessElements();
				setState(565);
				functionCallParamAC();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
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
		enterRule(_localctx, 66, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		enterRule(_localctx, 68, RULE_pointSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		enterRule(_localctx, 70, RULE_functionCallParam);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(OpenOp);
				setState(575);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(OpenOp);
				setState(577);
				functionCallParamElements();
				setState(578);
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
		enterRule(_localctx, 72, RULE_functionCallParamElements);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				generalValue();
				setState(584);
				match(Separator);
				setState(585);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				operationElements();
				setState(589);
				match(Separator);
				setState(590);
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
		enterRule(_localctx, 74, RULE_conditionalExpression);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				conditionalExpressionStructBlock();
				setState(596);
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
		enterRule(_localctx, 76, RULE_conditionalExpressionStructBlock);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				ifElementUnique();
				setState(602);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				ifElementUnique();
				setState(605);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				ifElementUnique();
				setState(608);
				elifElements();
				setState(609);
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
		enterRule(_localctx, 78, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(If);
			setState(614);
			conditionalExpressionItems();
			setState(615);
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
		enterRule(_localctx, 80, RULE_elifElements);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				elifElementUnique();
				setState(619);
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
		enterRule(_localctx, 82, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Elif);
			setState(624);
			conditionalExpressionItems();
			setState(625);
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
		enterRule(_localctx, 84, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(Else);
			setState(628);
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
		enterRule(_localctx, 86, RULE_conditionalExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		enterRule(_localctx, 88, RULE_conditionalBlockElements);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(OpenBlock);
				setState(633);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(OpenBlock);
				setState(635);
				conditionalBlockElsItems();
				setState(636);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(641);
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
		enterRule(_localctx, 90, RULE_conditionalBlockElsItems);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				sentence();
				setState(646);
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
		enterRule(_localctx, 92, RULE_conditionalExpressionElements);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				conditionExpValue();
				setState(652);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				conditionExpBlock();
				setState(656);
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
		enterRule(_localctx, 94, RULE_conditionExpValue);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				match(Not);
				setState(661);
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
				setState(662);
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
		enterRule(_localctx, 96, RULE_conditionExpBlock);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(Not);
				setState(667);
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
		enterRule(_localctx, 98, RULE_conditionExpBlockItemValue);
		int _la;
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				conditionExpBlockItem();
				setState(672);
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
				setState(674);
				conditionExpBlockItem();
				setState(675);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_conditionExpBlockItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(OpenOp);
			setState(681);
			conditionalExpressionElements();
			setState(682);
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
		enterRule(_localctx, 102, RULE_conditionalExpValue);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				firstIncDec();
				setState(685);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				firstIncDec();
				setState(688);
				match(Identifier);
				setState(689);
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
				setState(691);
				firstIncDec();
				setState(692);
				match(Identifier);
				setState(693);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				firstIncDec();
				setState(696);
				match(Identifier);
				setState(697);
				match(TypeSpec);
				setState(698);
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
				setState(700);
				match(Identifier);
				setState(701);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(702);
				match(Identifier);
				setState(703);
				lastIncDec();
				setState(704);
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
				setState(706);
				match(Identifier);
				setState(707);
				lastIncDec();
				setState(708);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(710);
				match(Identifier);
				setState(711);
				lastIncDec();
				setState(712);
				match(TypeSpec);
				setState(713);
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
				setState(715);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(716);
				match(Integer);
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(718);
				match(Integer);
				setState(719);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(720);
				match(Integer);
				setState(721);
				match(TypeSpec);
				setState(722);
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
				setState(723);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(724);
				match(Float);
				setState(725);
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
				setState(726);
				match(Float);
				setState(727);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(728);
				match(Float);
				setState(729);
				match(TypeSpec);
				setState(730);
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
				setState(731);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(732);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(733);
				functionCall();
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(736);
				functionCall();
				setState(737);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(739);
				functionCall();
				setState(740);
				match(TypeSpec);
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
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(743);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(744);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(747);
				operationBlock();
				setState(748);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(750);
				operationBlock();
				setState(751);
				match(TypeSpec);
				setState(752);
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
				setState(754);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(755);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(757);
				match(Identifier);
				setState(758);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(759);
				match(Identifier);
				setState(760);
				match(TypeSpec);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(762);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(763);
				arrayAccessElements();
				setState(764);
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
				setState(766);
				arrayAccessElements();
				setState(767);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(769);
				arrayAccessElements();
				setState(770);
				match(TypeSpec);
				setState(771);
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
		enterRule(_localctx, 104, RULE_functionCallAndAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			identifierAttrFn();
			setState(776);
			match(Attr);
			setState(777);
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
		enterRule(_localctx, 106, RULE_identifierAttrFn);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
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
		enterRule(_localctx, 108, RULE_functionCallAttrFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
		enterRule(_localctx, 110, RULE_functionCallAttrFnItem);
		int _la;
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				functionCall();
				setState(790);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				functionCall();
				setState(793);
				match(TypeSpec);
				setState(794);
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
		enterRule(_localctx, 112, RULE_loop);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				loopExpressionItems();
				setState(800);
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
		enterRule(_localctx, 114, RULE_loopExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(For);
			setState(805);
			loopExpression();
			setState(806);
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
		enterRule(_localctx, 116, RULE_loopExpression);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
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
		enterRule(_localctx, 118, RULE_loopInfinite);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(OpenOp);
				setState(814);
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
		enterRule(_localctx, 120, RULE_loopComplete);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(OpenOp);
				setState(819);
				loopOneMembers();
				setState(820);
				endOne();
				setState(821);
				loopTwoMembers();
				setState(822);
				endTwo();
				setState(823);
				loopThreeMembers();
				setState(824);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				loopOneMembers();
				setState(827);
				endOne();
				setState(828);
				loopTwoMembers();
				setState(829);
				endTwo();
				setState(830);
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
		enterRule(_localctx, 122, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
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
		enterRule(_localctx, 124, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		enterRule(_localctx, 126, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
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
		enterRule(_localctx, 128, RULE_loopOneMembers);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(Var);
				setState(842);
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
		enterRule(_localctx, 130, RULE_loopTwoMembers);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
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
		enterRule(_localctx, 132, RULE_loopThreeMembers);
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
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
		enterRule(_localctx, 134, RULE_loopThreeMembersValues);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				operationElements();
				setState(856);
				match(Separator);
				setState(857);
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
		enterRule(_localctx, 136, RULE_loopBlockElements);
		try {
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				sentence();
				setState(863);
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
		enterRule(_localctx, 138, RULE_loopBlockElementsLimited);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				match(OpenBlock);
				setState(868);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(OpenBlock);
				setState(870);
				loopBlockElements();
				setState(871);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(875);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(876);
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
		enterRule(_localctx, 140, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(Ret);
			setState(880);
			retValues();
			setState(881);
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
		enterRule(_localctx, 142, RULE_retValues);
		try {
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
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
		enterRule(_localctx, 144, RULE_functions);
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				functionsModes();
				setState(888);
				match(OpenBlock);
				setState(889);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				functionsModes();
				setState(892);
				match(OpenBlock);
				setState(893);
				functionCodeBlock();
				setState(894);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				functionMethodsModes();
				setState(897);
				match(OpenBlock);
				setState(898);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(900);
				functionMethodsModes();
				setState(901);
				match(OpenBlock);
				setState(902);
				functionCodeBlock();
				setState(903);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(905);
				constructClassMethod();
				setState(906);
				match(OpenBlock);
				setState(907);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(909);
				constructClassMethod();
				setState(910);
				match(OpenBlock);
				setState(911);
				functionCodeBlock();
				setState(912);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(914);
				interfaceMethod();
				setState(915);
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
		enterRule(_localctx, 146, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
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
		enterRule(_localctx, 148, RULE_functionGeneralModes);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(Function);
				setState(922);
				match(Identifier);
				setState(923);
				match(OpenOp);
				setState(924);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(Function);
				setState(926);
				match(Identifier);
				setState(927);
				match(OpenOp);
				setState(928);
				match(CloseOp);
				setState(929);
				match(ArrowRight);
				setState(932);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(930);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(931);
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
				setState(934);
				match(Function);
				setState(935);
				match(Identifier);
				setState(936);
				match(OpenOp);
				setState(937);
				functionParams();
				setState(938);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				match(Function);
				setState(941);
				match(Identifier);
				setState(942);
				match(OpenOp);
				setState(943);
				functionParams();
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_identifierRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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
		enterRule(_localctx, 152, RULE_functionMethodsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			methodVisibility();
			setState(955);
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
		enterRule(_localctx, 154, RULE_functionMethodsModesBkp);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				methodPerm();
				setState(958);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(Static);
				setState(961);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(962);
				methodPerm();
				setState(963);
				match(Static);
				setState(964);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				match(Final);
				setState(967);
				methodPerm();
				setState(968);
				match(Static);
				setState(969);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(971);
				match(Final);
				setState(972);
				methodPerm();
				setState(973);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(975);
				match(Final);
				setState(976);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(977);
				match(Final);
				setState(978);
				match(Static);
				setState(979);
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
		enterRule(_localctx, 156, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
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
		enterRule(_localctx, 158, RULE_visibilityItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
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
		enterRule(_localctx, 160, RULE_methodVisibility);
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				visibilityItems();
				setState(988);
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
		enterRule(_localctx, 162, RULE_constructClassMethod);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(Identifier);
				setState(993);
				match(OpenOp);
				setState(994);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(Identifier);
				setState(996);
				match(OpenOp);
				setState(997);
				functionParams();
				setState(998);
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
		enterRule(_localctx, 164, RULE_interfaceMethod);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
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
				setState(1003);
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
		enterRule(_localctx, 166, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
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
		enterRule(_localctx, 168, RULE_functionCodeBlockElements);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				sentence();
				setState(1010);
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
		enterRule(_localctx, 170, RULE_functionParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		enterRule(_localctx, 172, RULE_functionParamsControl);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				functionParamElements();
				setState(1018);
				match(Separator);
				setState(1019);
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
		enterRule(_localctx, 174, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(Identifier);
			setState(1024);
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
		enterRule(_localctx, 176, RULE_oopGeneral);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(1028);
				classDefination();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
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
		enterRule(_localctx, 178, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 180, RULE_interfaceClassDefinition);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(Interface);
				setState(1035);
				match(Identifier);
				setState(1036);
				match(OpenBlock);
				setState(1037);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				match(Interface);
				setState(1039);
				match(Identifier);
				setState(1040);
				match(OpenBlock);
				setState(1041);
				interfaceCodeBlock();
				setState(1042);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				match(Interface);
				setState(1045);
				match(Identifier);
				setState(1046);
				match(Extends);
				setState(1047);
				identifierB();
				setState(1048);
				match(OpenBlock);
				setState(1049);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				match(Interface);
				setState(1052);
				match(Identifier);
				setState(1053);
				match(Extends);
				setState(1054);
				identifierB();
				setState(1055);
				match(OpenBlock);
				setState(1056);
				interfaceCodeBlock();
				setState(1057);
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
		enterRule(_localctx, 182, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
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
		enterRule(_localctx, 184, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
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
		enterRule(_localctx, 186, RULE_abstractClassDefinition);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				match(Abstract);
				setState(1066);
				match(Identifier);
				setState(1067);
				match(OpenBlock);
				setState(1068);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(Abstract);
				setState(1070);
				match(Identifier);
				setState(1071);
				match(OpenBlock);
				setState(1072);
				abstractCodeBlock();
				setState(1073);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				match(Abstract);
				setState(1076);
				match(Identifier);
				setState(1077);
				match(Extends);
				setState(1078);
				identifierB();
				setState(1079);
				match(OpenBlock);
				setState(1080);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1082);
				match(Abstract);
				setState(1083);
				match(Identifier);
				setState(1084);
				match(Extends);
				setState(1085);
				identifierB();
				setState(1086);
				match(OpenBlock);
				setState(1087);
				abstractCodeBlock();
				setState(1088);
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
		enterRule(_localctx, 188, RULE_abstractCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
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
		enterRule(_localctx, 190, RULE_classDefination);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				classModes();
				setState(1095);
				match(OpenBlock);
				setState(1096);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				classModes();
				setState(1099);
				match(OpenBlock);
				setState(1100);
				classCodeBlock();
				setState(1101);
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
		enterRule(_localctx, 192, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
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
		enterRule(_localctx, 194, RULE_classModes);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				match(Class);
				setState(1108);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(Class);
				setState(1110);
				match(Identifier);
				setState(1111);
				match(Extends);
				setState(1112);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				match(Class);
				setState(1114);
				match(Identifier);
				setState(1115);
				match(Implements);
				setState(1116);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1117);
				match(Class);
				setState(1118);
				match(Identifier);
				setState(1119);
				match(Extends);
				setState(1120);
				identifierB();
				setState(1121);
				match(Implements);
				setState(1122);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1124);
				match(Final);
				setState(1125);
				match(Class);
				setState(1126);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1127);
				match(Final);
				setState(1128);
				match(Class);
				setState(1129);
				match(Identifier);
				setState(1130);
				match(Extends);
				setState(1131);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1132);
				match(Final);
				setState(1133);
				match(Class);
				setState(1134);
				match(Identifier);
				setState(1135);
				match(Implements);
				setState(1136);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1137);
				match(Final);
				setState(1138);
				match(Class);
				setState(1139);
				match(Identifier);
				setState(1140);
				match(Extends);
				setState(1141);
				identifierB();
				setState(1142);
				match(Implements);
				setState(1143);
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
		enterRule(_localctx, 196, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
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
		enterRule(_localctx, 198, RULE_anonymousClassCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			anonymousClassCallExpr();
			setState(1150);
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
		enterRule(_localctx, 200, RULE_anonymousClassCallExpr);
		int _la;
		try {
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				match(OpenOp);
				setState(1153);
				anonymousClass();
				setState(1154);
				match(CloseOp);
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1156);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(OpenOp);
				setState(1159);
				anonymousClass();
				setState(1160);
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
		enterRule(_localctx, 202, RULE_anonymousClass);
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(New);
				setState(1165);
				match(Class);
				setState(1166);
				match(OpenBlock);
				setState(1167);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(New);
				setState(1169);
				match(Class);
				setState(1170);
				match(OpenBlock);
				setState(1171);
				anonymousClassElements();
				setState(1172);
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
		enterRule(_localctx, 204, RULE_anonymousClassElements);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				sentence();
				setState(1178);
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
		enterRule(_localctx, 206, RULE_arrayAccessElements);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				arrayAccessElementsItems();
				setState(1184);
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
		enterRule(_localctx, 208, RULE_arrayAccessElementsItems);
		try {
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				match(Identifier);
				setState(1190);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1191);
				match(Identifier);
				setState(1192);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1193);
				match(Identifier);
				setState(1194);
				accessBlockAr();
				setState(1195);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1197);
				firstIncDec();
				setState(1198);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1200);
				match(Identifier);
				setState(1201);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1202);
				firstIncDec();
				setState(1203);
				match(Identifier);
				setState(1204);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1206);
				match(Identifier);
				setState(1207);
				accessBlockAr();
				setState(1208);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1210);
				match(Identifier);
				setState(1211);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1212);
				match(Identifier);
				setState(1213);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1214);
				match(Identifier);
				setState(1215);
				accessBlockAr();
				setState(1216);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1218);
				match(Identifier);
				setState(1219);
				accessBlockAr();
				setState(1220);
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
		enterRule(_localctx, 210, RULE_accessBlockAr);
		try {
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				match(OpenArIndex);
				setState(1225);
				arrayIndexAccess();
				setState(1226);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				match(OpenArIndex);
				setState(1229);
				arrayIndexAccess();
				setState(1230);
				match(CloseArIndex);
				setState(1231);
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
		enterRule(_localctx, 212, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
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
		enterRule(_localctx, 214, RULE_anonymousFunction);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				match(OpenOp);
				setState(1238);
				anFnItems();
				setState(1239);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(OpenOp);
				setState(1242);
				anFnItems();
				setState(1243);
				match(CloseOp);
				setState(1244);
				match(OpenOp);
				setState(1245);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(OpenOp);
				setState(1248);
				anFnItems();
				setState(1249);
				match(CloseOp);
				setState(1250);
				match(OpenOp);
				setState(1251);
				operationElements();
				setState(1252);
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
		enterRule(_localctx, 216, RULE_anFnItems);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				functionsModesFn();
				setState(1257);
				match(OpenBlock);
				setState(1258);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				functionsModesFn();
				setState(1261);
				match(OpenBlock);
				setState(1262);
				functionCodeBlock();
				setState(1263);
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
		enterRule(_localctx, 218, RULE_functionsModesFn);
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				match(Function);
				setState(1268);
				match(OpenOp);
				setState(1269);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				match(Function);
				setState(1271);
				match(OpenOp);
				setState(1272);
				match(CloseOp);
				setState(1273);
				match(ArrowRight);
				setState(1276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1274);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1275);
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
				setState(1278);
				match(Function);
				setState(1279);
				match(OpenOp);
				setState(1280);
				functionParams();
				setState(1281);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1283);
				match(Function);
				setState(1284);
				match(OpenOp);
				setState(1285);
				functionParams();
				setState(1286);
				match(CloseOp);
				setState(1287);
				match(ArrowRight);
				setState(1290);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1288);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1289);
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
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
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
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_generalValue);
		try {
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				match(Identifier);
				setState(1296);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1298);
				match(Integer);
				setState(1299);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1300);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1301);
				match(Float);
				setState(1302);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1303);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1304);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1305);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1306);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1307);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1308);
				objIdentifierA();
				setState(1309);
				match(Point);
				setState(1310);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1312);
				objIdentifierA();
				setState(1313);
				match(TwoTwoPoint);
				setState(1314);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1316);
				arrayAccessElements();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1317);
				anonymousFunction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1318);
				anonymousClassCallExpr();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1319);
				anonymousClass();
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
		enterRule(_localctx, 222, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
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
		enterRule(_localctx, 224, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0531\4\2\t\2"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00ed\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f9"+
		"\n\4\3\5\3\5\3\5\5\5\u00fe\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u010f\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0124\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0155\n\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u015e\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0167\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0178\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0186\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u018e\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0195\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u019d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01a8\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01b2"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u020c\n\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0225\n\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5"+
		"!\u0232\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u023b\n\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\5%\u0247\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0253\n&\3"+
		"\'\3\'\3\'\3\'\5\'\u0259\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0266"+
		"\n(\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0270\n*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0285\n.\3/\3/\3/\3/\5/\u028b\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0295\n\60\3\61\3\61\3\61\5\61"+
		"\u029a\n\61\3\62\3\62\3\62\5\62\u029f\n\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u02a9\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0308\n\65\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u0310\n\67\3"+
		"8\38\39\39\39\39\39\39\39\39\39\39\39\59\u031f\n9\3:\3:\3:\3:\5:\u0325"+
		"\n:\3;\3;\3;\3;\3<\3<\3<\5<\u032e\n<\3=\3=\3=\5=\u0333\n=\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0343\n>\3?\3?\3@\3@\3A\3A\3B\3B\3B"+
		"\3B\5B\u034f\nB\3C\3C\5C\u0353\nC\3D\3D\5D\u0357\nD\3E\3E\3E\3E\3E\5E"+
		"\u035e\nE\3F\3F\3F\3F\5F\u0364\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0370"+
		"\nG\3H\3H\3H\3H\3I\3I\5I\u0378\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0398\nJ\3K"+
		"\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03a7\nL\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\5L\u03b7\nL\5L\u03b9\nL\3M\3M\3N\3N\3N\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03d7"+
		"\nO\3P\3P\3Q\3Q\3R\3R\3R\3R\5R\u03e1\nR\3S\3S\3S\3S\3S\3S\3S\3S\5S\u03eb"+
		"\nS\3T\3T\5T\u03ef\nT\3U\3U\3V\3V\3V\3V\5V\u03f7\nV\3W\3W\3X\3X\3X\3X"+
		"\3X\5X\u0400\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0409\nZ\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\5\\\u0426\n\\\3]\3]\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0445\n_\3`\3`\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\5a\u0452\na\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\5c\u047c\nc\3d\3d\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\5f\u048d\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0499\ng\3h\3h\3h\3"+
		"h\5h\u049f\nh\3i\3i\3i\3i\5i\u04a5\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\5j\u04c9\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u04d4\nk\3l\3l\3m\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u04e9\nm\3n\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\5n\u04f4\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u04ff\no\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u050d\no\5o\u050f\no\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u052b"+
		"\np\3q\3q\3r\3r\3r\2\2s\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\2\7"+
		"\4\2\32\32&&\4\2\33\33\35\35\3\2%&\3\2\13\r\3\2\13\17\2\u05a5\2\u00e4"+
		"\3\2\2\2\4\u00ec\3\2\2\2\6\u00f8\3\2\2\2\b\u00fd\3\2\2\2\n\u00ff\3\2\2"+
		"\2\f\u0102\3\2\2\2\16\u0105\3\2\2\2\20\u010e\3\2\2\2\22\u0110\3\2\2\2"+
		"\24\u0112\3\2\2\2\26\u0123\3\2\2\2\30\u0154\3\2\2\2\32\u0156\3\2\2\2\34"+
		"\u015d\3\2\2\2\36\u015f\3\2\2\2 \u0166\3\2\2\2\"\u0177\3\2\2\2$\u0185"+
		"\3\2\2\2&\u018d\3\2\2\2(\u0194\3\2\2\2*\u019c\3\2\2\2,\u01a7\3\2\2\2."+
		"\u01a9\3\2\2\2\60\u01b1\3\2\2\2\62\u020b\3\2\2\2\64\u020d\3\2\2\2\66\u020f"+
		"\3\2\2\28\u0211\3\2\2\2:\u0224\3\2\2\2<\u0226\3\2\2\2>\u0228\3\2\2\2@"+
		"\u0231\3\2\2\2B\u023a\3\2\2\2D\u023c\3\2\2\2F\u023e\3\2\2\2H\u0246\3\2"+
		"\2\2J\u0252\3\2\2\2L\u0258\3\2\2\2N\u0265\3\2\2\2P\u0267\3\2\2\2R\u026f"+
		"\3\2\2\2T\u0271\3\2\2\2V\u0275\3\2\2\2X\u0278\3\2\2\2Z\u0284\3\2\2\2\\"+
		"\u028a\3\2\2\2^\u0294\3\2\2\2`\u0299\3\2\2\2b\u029e\3\2\2\2d\u02a8\3\2"+
		"\2\2f\u02aa\3\2\2\2h\u0307\3\2\2\2j\u0309\3\2\2\2l\u030f\3\2\2\2n\u0311"+
		"\3\2\2\2p\u031e\3\2\2\2r\u0324\3\2\2\2t\u0326\3\2\2\2v\u032d\3\2\2\2x"+
		"\u0332\3\2\2\2z\u0342\3\2\2\2|\u0344\3\2\2\2~\u0346\3\2\2\2\u0080\u0348"+
		"\3\2\2\2\u0082\u034e\3\2\2\2\u0084\u0352\3\2\2\2\u0086\u0356\3\2\2\2\u0088"+
		"\u035d\3\2\2\2\u008a\u0363\3\2\2\2\u008c\u036f\3\2\2\2\u008e\u0371\3\2"+
		"\2\2\u0090\u0377\3\2\2\2\u0092\u0397\3\2\2\2\u0094\u0399\3\2\2\2\u0096"+
		"\u03b8\3\2\2\2\u0098\u03ba\3\2\2\2\u009a\u03bc\3\2\2\2\u009c\u03d6\3\2"+
		"\2\2\u009e\u03d8\3\2\2\2\u00a0\u03da\3\2\2\2\u00a2\u03e0\3\2\2\2\u00a4"+
		"\u03ea\3\2\2\2\u00a6\u03ee\3\2\2\2\u00a8\u03f0\3\2\2\2\u00aa\u03f6\3\2"+
		"\2\2\u00ac\u03f8\3\2\2\2\u00ae\u03ff\3\2\2\2\u00b0\u0401\3\2\2\2\u00b2"+
		"\u0408\3\2\2\2\u00b4\u040a\3\2\2\2\u00b6\u0425\3\2\2\2\u00b8\u0427\3\2"+
		"\2\2\u00ba\u0429\3\2\2\2\u00bc\u0444\3\2\2\2\u00be\u0446\3\2\2\2\u00c0"+
		"\u0451\3\2\2\2\u00c2\u0453\3\2\2\2\u00c4\u047b\3\2\2\2\u00c6\u047d\3\2"+
		"\2\2\u00c8\u047f\3\2\2\2\u00ca\u048c\3\2\2\2\u00cc\u0498\3\2\2\2\u00ce"+
		"\u049e\3\2\2\2\u00d0\u04a4\3\2\2\2\u00d2\u04c8\3\2\2\2\u00d4\u04d3\3\2"+
		"\2\2\u00d6\u04d5\3\2\2\2\u00d8\u04e8\3\2\2\2\u00da\u04f3\3\2\2\2\u00dc"+
		"\u050e\3\2\2\2\u00de\u052a\3\2\2\2\u00e0\u052c\3\2\2\2\u00e2\u052e\3\2"+
		"\2\2\u00e4\u00e5\5\4\3\2\u00e5\u00e6\7\2\2\3\u00e6\3\3\2\2\2\u00e7\u00ed"+
		"\5\6\4\2\u00e8\u00e9\5\6\4\2\u00e9\u00ea\5\4\3\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\5\3\2\2\2\u00ee\u00f9\5\b\5\2\u00ef\u00f9\5\16\b\2\u00f0\u00f9"+
		"\5\24\13\2\u00f1\u00f9\58\35\2\u00f2\u00f9\5L\'\2\u00f3\u00f9\5r:\2\u00f4"+
		"\u00f9\5\u0092J\2\u00f5\u00f9\5\u008eH\2\u00f6\u00f9\5\u00b2Z\2\u00f7"+
		"\u00f9\5\u00c8e\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0"+
		"\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8"+
		"\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\7\3\2\2\2\u00fa\u00fe\7\60\2\2\u00fb\u00fe\5\n\6\2\u00fc\u00fe"+
		"\5\f\7\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\t\3\2\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\7\31\2\2\u0101\13\3\2\2\2"+
		"\u0102\u0103\7\27\2\2\u0103\u0104\7\31\2\2\u0104\r\3\2\2\2\u0105\u0106"+
		"\7\3\2\2\u0106\u0107\5\20\t\2\u0107\u0108\7\31\2\2\u0108\17\3\2\2\2\u0109"+
		"\u010f\5\22\n\2\u010a\u010b\5\22\n\2\u010b\u010c\7\36\2\2\u010c\u010d"+
		"\5\20\t\2\u010d\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2"+
		"\u010f\21\3\2\2\2\u0110\u0111\7,\2\2\u0111\23\3\2\2\2\u0112\u0113\5\26"+
		"\f\2\u0113\25\3\2\2\2\u0114\u0115\7\4\2\2\u0115\u0116\5 \21\2\u0116\u0117"+
		"\7\31\2\2\u0117\u0124\3\2\2\2\u0118\u0119\5\u00a2R\2\u0119\u011a\7\4\2"+
		"\2\u011a\u011b\5 \21\2\u011b\u011c\7\31\2\2\u011c\u0124\3\2\2\2\u011d"+
		"\u011e\5 \21\2\u011e\u011f\7\31\2\2\u011f\u0124\3\2\2\2\u0120\u0121\5"+
		"\32\16\2\u0121\u0122\7\31\2\2\u0122\u0124\3\2\2\2\u0123\u0114\3\2\2\2"+
		"\u0123\u0118\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124\27"+
		"\3\2\2\2\u0125\u0126\7\4\2\2\u0126\u0127\5 \21\2\u0127\u0128\7\31\2\2"+
		"\u0128\u0155\3\2\2\2\u0129\u012a\5\u009eP\2\u012a\u012b\7\4\2\2\u012b"+
		"\u012c\5 \21\2\u012c\u012d\7\31\2\2\u012d\u0155\3\2\2\2\u012e\u012f\7"+
		"\16\2\2\u012f\u0130\7\4\2\2\u0130\u0131\5 \21\2\u0131\u0132\7\31\2\2\u0132"+
		"\u0155\3\2\2\2\u0133\u0134\5\u009eP\2\u0134\u0135\7\16\2\2\u0135\u0136"+
		"\7\4\2\2\u0136\u0137\5 \21\2\u0137\u0138\7\31\2\2\u0138\u0155\3\2\2\2"+
		"\u0139\u013a\7\17\2\2\u013a\u013b\5\u009eP\2\u013b\u013c\7\16\2\2\u013c"+
		"\u013d\7\4\2\2\u013d\u013e\5 \21\2\u013e\u013f\7\31\2\2\u013f\u0155\3"+
		"\2\2\2\u0140\u0141\7\17\2\2\u0141\u0142\5\u009eP\2\u0142\u0143\7\4\2\2"+
		"\u0143\u0144\5 \21\2\u0144\u0145\7\31\2\2\u0145\u0155\3\2\2\2\u0146\u0147"+
		"\7\17\2\2\u0147\u0148\7\4\2\2\u0148\u0149\5 \21\2\u0149\u014a\7\31\2\2"+
		"\u014a\u0155\3\2\2\2\u014b\u014c\7\17\2\2\u014c\u014d\7\16\2\2\u014d\u014e"+
		"\7\4\2\2\u014e\u014f\5 \21\2\u014f\u0150\7\31\2\2\u0150\u0155\3\2\2\2"+
		"\u0151\u0152\5 \21\2\u0152\u0153\7\31\2\2\u0153\u0155\3\2\2\2\u0154\u0125"+
		"\3\2\2\2\u0154\u0129\3\2\2\2\u0154\u012e\3\2\2\2\u0154\u0133\3\2\2\2\u0154"+
		"\u0139\3\2\2\2\u0154\u0140\3\2\2\2\u0154\u0146\3\2\2\2\u0154\u014b\3\2"+
		"\2\2\u0154\u0151\3\2\2\2\u0155\31\3\2\2\2\u0156\u0157\5\34\17\2\u0157"+
		"\33\3\2\2\2\u0158\u015e\5\36\20\2\u0159\u015a\5\36\20\2\u015a\u015b\7"+
		"\32\2\2\u015b\u015c\5\34\17\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2"+
		"\u015d\u0159\3\2\2\2\u015e\35\3\2\2\2\u015f\u0160\5\"\22\2\u0160\37\3"+
		"\2\2\2\u0161\u0167\5\"\22\2\u0162\u0163\5\"\22\2\u0163\u0164\7\36\2\2"+
		"\u0164\u0165\5 \21\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0162"+
		"\3\2\2\2\u0167!\3\2\2\2\u0168\u0169\7)\2\2\u0169\u0178\5$\23\2\u016a\u016b"+
		"\5\u00e0q\2\u016b\u016c\7\33\2\2\u016c\u016d\5\u00e2r\2\u016d\u016e\5"+
		"$\23\2\u016e\u0178\3\2\2\2\u016f\u0170\5\u00e0q\2\u0170\u0171\7\35\2\2"+
		"\u0171\u0172\5\u00e2r\2\u0172\u0173\5$\23\2\u0173\u0178\3\2\2\2\u0174"+
		"\u0175\5\u00d0i\2\u0175\u0176\5$\23\2\u0176\u0178\3\2\2\2\u0177\u0168"+
		"\3\2\2\2\u0177\u016a\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0174\3\2\2\2\u0178"+
		"#\3\2\2\2\u0179\u017a\t\2\2\2\u017a\u0186\5\u00dep\2\u017b\u017c\7+\2"+
		"\2\u017c\u017d\t\2\2\2\u017d\u0186\5\u00dep\2\u017e\u017f\t\2\2\2\u017f"+
		"\u0180\7\25\2\2\u0180\u0186\5\u00dep\2\u0181\u0182\7+\2\2\u0182\u0183"+
		"\t\2\2\2\u0183\u0184\7\25\2\2\u0184\u0186\5\u00dep\2\u0185\u0179\3\2\2"+
		"\2\u0185\u017b\3\2\2\2\u0185\u017e\3\2\2\2\u0185\u0181\3\2\2\2\u0186%"+
		"\3\2\2\2\u0187\u0188\7\37\2\2\u0188\u018e\7 \2\2\u0189\u018a\7\37\2\2"+
		"\u018a\u018b\5(\25\2\u018b\u018c\7 \2\2\u018c\u018e\3\2\2\2\u018d\u0187"+
		"\3\2\2\2\u018d\u0189\3\2\2\2\u018e\'\3\2\2\2\u018f\u0195\5\u00dep\2\u0190"+
		"\u0191\5\u00dep\2\u0191\u0192\7\36\2\2\u0192\u0193\5(\25\2\u0193\u0195"+
		"\3\2\2\2\u0194\u018f\3\2\2\2\u0194\u0190\3\2\2\2\u0195)\3\2\2\2\u0196"+
		"\u0197\7!\2\2\u0197\u019d\7\"\2\2\u0198\u0199\7!\2\2\u0199\u019a\5,\27"+
		"\2\u019a\u019b\7\"\2\2\u019b\u019d\3\2\2\2\u019c\u0196\3\2\2\2\u019c\u0198"+
		"\3\2\2\2\u019d+\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a0\7\34\2\2\u01a0"+
		"\u01a8\5\u00dep\2\u01a1\u01a2\7)\2\2\u01a2\u01a3\7\34\2\2\u01a3\u01a4"+
		"\5\u00dep\2\u01a4\u01a5\7\36\2\2\u01a5\u01a6\5,\27\2\u01a6\u01a8\3\2\2"+
		"\2\u01a7\u019e\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a8-\3\2\2\2\u01a9\u01aa"+
		"\7#\2\2\u01aa\u01ab\5\60\31\2\u01ab\u01ac\7$\2\2\u01ac/\3\2\2\2\u01ad"+
		"\u01b2\5\62\32\2\u01ae\u01af\5\62\32\2\u01af\u01b0\5\60\31\2\u01b0\u01b2"+
		"\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\61\3\2\2\2\u01b3"+
		"\u020c\5:\36\2\u01b4\u01b5\5:\36\2\u01b5\u01b6\7%\2\2\u01b6\u020c\3\2"+
		"\2\2\u01b7\u01b8\5:\36\2\u01b8\u01b9\7+\2\2\u01b9\u020c\3\2\2\2\u01ba"+
		"\u01bb\5:\36\2\u01bb\u01bc\7+\2\2\u01bc\u01bd\7%\2\2\u01bd\u020c\3\2\2"+
		"\2\u01be\u020c\7)\2\2\u01bf\u01c0\7)\2\2\u01c0\u020c\7%\2\2\u01c1\u01c2"+
		"\7)\2\2\u01c2\u020c\7+\2\2\u01c3\u01c4\7)\2\2\u01c4\u01c5\7+\2\2\u01c5"+
		"\u020c\7%\2\2\u01c6\u01c7\5\64\33\2\u01c7\u01c8\7)\2\2\u01c8\u020c\3\2"+
		"\2\2\u01c9\u01ca\5\64\33\2\u01ca\u01cb\7)\2\2\u01cb\u01cc\7%\2\2\u01cc"+
		"\u020c\3\2\2\2\u01cd\u01ce\5\64\33\2\u01ce\u01cf\7)\2\2\u01cf\u01d0\7"+
		"+\2\2\u01d0\u020c\3\2\2\2\u01d1\u01d2\5\64\33\2\u01d2\u01d3\7)\2\2\u01d3"+
		"\u01d4\7+\2\2\u01d4\u01d5\7%\2\2\u01d5\u020c\3\2\2\2\u01d6\u01d7\7)\2"+
		"\2\u01d7\u020c\5\66\34\2\u01d8\u01d9\7)\2\2\u01d9\u01da\5\66\34\2\u01da"+
		"\u01db\7%\2\2\u01db\u020c\3\2\2\2\u01dc\u01dd\7)\2\2\u01dd\u01de\5\66"+
		"\34\2\u01de\u01df\7+\2\2\u01df\u020c\3\2\2\2\u01e0\u01e1\7)\2\2\u01e1"+
		"\u01e2\5\66\34\2\u01e2\u01e3\7+\2\2\u01e3\u01e4\7%\2\2\u01e4\u020c\3\2"+
		"\2\2\u01e5\u020c\7-\2\2\u01e6\u01e7\7-\2\2\u01e7\u020c\7%\2\2\u01e8\u01e9"+
		"\7-\2\2\u01e9\u020c\7+\2\2\u01ea\u01eb\7-\2\2\u01eb\u01ec\7+\2\2\u01ec"+
		"\u020c\7%\2\2\u01ed\u020c\7.\2\2\u01ee\u01ef\7.\2\2\u01ef\u020c\7%\2\2"+
		"\u01f0\u01f1\7.\2\2\u01f1\u020c\7+\2\2\u01f2\u01f3\7.\2\2\u01f3\u01f4"+
		"\7+\2\2\u01f4\u020c\7%\2\2\u01f5\u020c\5.\30\2\u01f6\u01f7\5.\30\2\u01f7"+
		"\u01f8\7%\2\2\u01f8\u020c\3\2\2\2\u01f9\u01fa\5.\30\2\u01fa\u01fb\7+\2"+
		"\2\u01fb\u020c\3\2\2\2\u01fc\u01fd\5.\30\2\u01fd\u01fe\7+\2\2\u01fe\u01ff"+
		"\7%\2\2\u01ff\u020c\3\2\2\2\u0200\u020c\5\u00d0i\2\u0201\u0202\5\u00d0"+
		"i\2\u0202\u0203\7%\2\2\u0203\u020c\3\2\2\2\u0204\u0205\5\u00d0i\2\u0205"+
		"\u0206\7+\2\2\u0206\u020c\3\2\2\2\u0207\u0208\5\u00d0i\2\u0208\u0209\7"+
		"+\2\2\u0209\u020a\7%\2\2\u020a\u020c\3\2\2\2\u020b\u01b3\3\2\2\2\u020b"+
		"\u01b4\3\2\2\2\u020b\u01b7\3\2\2\2\u020b\u01ba\3\2\2\2\u020b\u01be\3\2"+
		"\2\2\u020b\u01bf\3\2\2\2\u020b\u01c1\3\2\2\2\u020b\u01c3\3\2\2\2\u020b"+
		"\u01c6\3\2\2\2\u020b\u01c9\3\2\2\2\u020b\u01cd\3\2\2\2\u020b\u01d1\3\2"+
		"\2\2\u020b\u01d6\3\2\2\2\u020b\u01d8\3\2\2\2\u020b\u01dc\3\2\2\2\u020b"+
		"\u01e0\3\2\2\2\u020b\u01e5\3\2\2\2\u020b\u01e6\3\2\2\2\u020b\u01e8\3\2"+
		"\2\2\u020b\u01ea\3\2\2\2\u020b\u01ed\3\2\2\2\u020b\u01ee\3\2\2\2\u020b"+
		"\u01f0\3\2\2\2\u020b\u01f2\3\2\2\2\u020b\u01f5\3\2\2\2\u020b\u01f6\3\2"+
		"\2\2\u020b\u01f9\3\2\2\2\u020b\u01fc\3\2\2\2\u020b\u0200\3\2\2\2\u020b"+
		"\u0201\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u0207\3\2\2\2\u020c\63\3\2\2"+
		"\2\u020d\u020e\7(\2\2\u020e\65\3\2\2\2\u020f\u0210\7(\2\2\u0210\67\3\2"+
		"\2\2\u0211\u0212\5:\36\2\u0212\u0213\7\31\2\2\u02139\3\2\2\2\u0214\u0215"+
		"\7)\2\2\u0215\u0225\5H%\2\u0216\u0217\7)\2\2\u0217\u0218\7\33\2\2\u0218"+
		"\u0219\5D#\2\u0219\u021a\5H%\2\u021a\u0225\3\2\2\2\u021b\u021c\7)\2\2"+
		"\u021c\u021d\7\35\2\2\u021d\u021e\5D#\2\u021e\u021f\5H%\2\u021f\u0225"+
		"\3\2\2\2\u0220\u0225\5> \2\u0221\u0222\5\u00d0i\2\u0222\u0223\5<\37\2"+
		"\u0223\u0225\3\2\2\2\u0224\u0214\3\2\2\2\u0224\u0216\3\2\2\2\u0224\u021b"+
		"\3\2\2\2\u0224\u0220\3\2\2\2\u0224\u0221\3\2\2\2\u0225;\3\2\2\2\u0226"+
		"\u0227\5H%\2\u0227=\3\2\2\2\u0228\u0229\7)\2\2\u0229\u022a\t\3\2\2\u022a"+
		"\u022b\5@!\2\u022b?\3\2\2\2\u022c\u0232\5B\"\2\u022d\u022e\5B\"\2\u022e"+
		"\u022f\t\3\2\2\u022f\u0230\5@!\2\u0230\u0232\3\2\2\2\u0231\u022c\3\2\2"+
		"\2\u0231\u022d\3\2\2\2\u0232A\3\2\2\2\u0233\u0234\5D#\2\u0234\u0235\5"+
		"H%\2\u0235\u023b\3\2\2\2\u0236\u0237\5\u00d0i\2\u0237\u0238\5<\37\2\u0238"+
		"\u023b\3\2\2\2\u0239\u023b\7)\2\2\u023a\u0233\3\2\2\2\u023a\u0236\3\2"+
		"\2\2\u023a\u0239\3\2\2\2\u023bC\3\2\2\2\u023c\u023d\7)\2\2\u023dE\3\2"+
		"\2\2\u023e\u023f\7\33\2\2\u023fG\3\2\2\2\u0240\u0241\7#\2\2\u0241\u0247"+
		"\7$\2\2\u0242\u0243\7#\2\2\u0243\u0244\5J&\2\u0244\u0245\7$\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0240\3\2\2\2\u0246\u0242\3\2\2\2\u0247I\3\2\2\2"+
		"\u0248\u0253\5\u00dep\2\u0249\u024a\5\u00dep\2\u024a\u024b\7\36\2\2\u024b"+
		"\u024c\5J&\2\u024c\u0253\3\2\2\2\u024d\u0253\5\60\31\2\u024e\u024f\5\60"+
		"\31\2\u024f\u0250\7\36\2\2\u0250\u0251\5J&\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0248\3\2\2\2\u0252\u0249\3\2\2\2\u0252\u024d\3\2\2\2\u0252\u024e\3\2"+
		"\2\2\u0253K\3\2\2\2\u0254\u0259\5N(\2\u0255\u0256\5N(\2\u0256\u0257\5"+
		"L\'\2\u0257\u0259\3\2\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0259"+
		"M\3\2\2\2\u025a\u0266\5P)\2\u025b\u025c\5P)\2\u025c\u025d\5R*\2\u025d"+
		"\u0266\3\2\2\2\u025e\u025f\5P)\2\u025f\u0260\5V,\2\u0260\u0266\3\2\2\2"+
		"\u0261\u0262\5P)\2\u0262\u0263\5R*\2\u0263\u0264\5V,\2\u0264\u0266\3\2"+
		"\2\2\u0265\u025a\3\2\2\2\u0265\u025b\3\2\2\2\u0265\u025e\3\2\2\2\u0265"+
		"\u0261\3\2\2\2\u0266O\3\2\2\2\u0267\u0268\7\5\2\2\u0268\u0269\5X-\2\u0269"+
		"\u026a\5Z.\2\u026aQ\3\2\2\2\u026b\u0270\5T+\2\u026c\u026d\5T+\2\u026d"+
		"\u026e\5R*\2\u026e\u0270\3\2\2\2\u026f\u026b\3\2\2\2\u026f\u026c\3\2\2"+
		"\2\u0270S\3\2\2\2\u0271\u0272\7\6\2\2\u0272\u0273\5X-\2\u0273\u0274\5"+
		"Z.\2\u0274U\3\2\2\2\u0275\u0276\7\7\2\2\u0276\u0277\5Z.\2\u0277W\3\2\2"+
		"\2\u0278\u0279\5^\60\2\u0279Y\3\2\2\2\u027a\u027b\7!\2\2\u027b\u0285\7"+
		"\"\2\2\u027c\u027d\7!\2\2\u027d\u027e\5\\/\2\u027e\u027f\7\"\2\2\u027f"+
		"\u0285\3\2\2\2\u0280\u0285\5L\'\2\u0281\u0285\58\35\2\u0282\u0285\5r:"+
		"\2\u0283\u0285\5\u008eH\2\u0284\u027a\3\2\2\2\u0284\u027c\3\2\2\2\u0284"+
		"\u0280\3\2\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2"+
		"\2\2\u0285[\3\2\2\2\u0286\u028b\5\6\4\2\u0287\u0288\5\6\4\2\u0288\u0289"+
		"\5\\/\2\u0289\u028b\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287\3\2\2\2\u028b"+
		"]\3\2\2\2\u028c\u0295\5`\61\2\u028d\u028e\5`\61\2\u028e\u028f\5^\60\2"+
		"\u028f\u0295\3\2\2\2\u0290\u0295\5b\62\2\u0291\u0292\5b\62\2\u0292\u0293"+
		"\5^\60\2\u0293\u0295\3\2\2\2\u0294\u028c\3\2\2\2\u0294\u028d\3\2\2\2\u0294"+
		"\u0290\3\2\2\2\u0294\u0291\3\2\2\2\u0295_\3\2\2\2\u0296\u0297\7\'\2\2"+
		"\u0297\u029a\5h\65\2\u0298\u029a\5h\65\2\u0299\u0296\3\2\2\2\u0299\u0298"+
		"\3\2\2\2\u029aa\3\2\2\2\u029b\u029f\5d\63\2\u029c\u029d\7\'\2\2\u029d"+
		"\u029f\5d\63\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029fc\3\2\2\2"+
		"\u02a0\u02a9\5f\64\2\u02a1\u02a2\5f\64\2\u02a2\u02a3\t\4\2\2\u02a3\u02a9"+
		"\3\2\2\2\u02a4\u02a5\5f\64\2\u02a5\u02a6\7+\2\2\u02a6\u02a7\t\4\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a1\3\2\2\2\u02a8\u02a4\3\2"+
		"\2\2\u02a9e\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab\u02ac\5^\60\2\u02ac\u02ad"+
		"\7$\2\2\u02adg\3\2\2\2\u02ae\u02af\5\64\33\2\u02af\u02b0\7)\2\2\u02b0"+
		"\u0308\3\2\2\2\u02b1\u02b2\5\64\33\2\u02b2\u02b3\7)\2\2\u02b3\u02b4\t"+
		"\4\2\2\u02b4\u0308\3\2\2\2\u02b5\u02b6\5\64\33\2\u02b6\u02b7\7)\2\2\u02b7"+
		"\u02b8\7+\2\2\u02b8\u0308\3\2\2\2\u02b9\u02ba\5\64\33\2\u02ba\u02bb\7"+
		")\2\2\u02bb\u02bc\7+\2\2\u02bc\u02bd\t\4\2\2\u02bd\u0308\3\2\2\2\u02be"+
		"\u02bf\7)\2\2\u02bf\u0308\5\66\34\2\u02c0\u02c1\7)\2\2\u02c1\u02c2\5\66"+
		"\34\2\u02c2\u02c3\t\4\2\2\u02c3\u0308\3\2\2\2\u02c4\u02c5\7)\2\2\u02c5"+
		"\u02c6\5\66\34\2\u02c6\u02c7\7+\2\2\u02c7\u0308\3\2\2\2\u02c8\u02c9\7"+
		")\2\2\u02c9\u02ca\5\66\34\2\u02ca\u02cb\7+\2\2\u02cb\u02cc\t\4\2\2\u02cc"+
		"\u0308\3\2\2\2\u02cd\u0308\7-\2\2\u02ce\u02cf\7-\2\2\u02cf\u0308\t\4\2"+
		"\2\u02d0\u02d1\7-\2\2\u02d1\u0308\7+\2\2\u02d2\u02d3\7-\2\2\u02d3\u02d4"+
		"\7+\2\2\u02d4\u0308\t\4\2\2\u02d5\u0308\7.\2\2\u02d6\u02d7\7.\2\2\u02d7"+
		"\u0308\t\4\2\2\u02d8\u02d9\7.\2\2\u02d9\u0308\7+\2\2\u02da\u02db\7.\2"+
		"\2\u02db\u02dc\7+\2\2\u02dc\u0308\t\4\2\2\u02dd\u0308\5j\66\2\u02de\u0308"+
		"\5:\36\2\u02df\u02e0\5:\36\2\u02e0\u02e1\t\4\2\2\u02e1\u0308\3\2\2\2\u02e2"+
		"\u02e3\5:\36\2\u02e3\u02e4\7+\2\2\u02e4\u0308\3\2\2\2\u02e5\u02e6\5:\36"+
		"\2\u02e6\u02e7\7+\2\2\u02e7\u02e8\t\4\2\2\u02e8\u0308\3\2\2\2\u02e9\u0308"+
		"\5.\30\2\u02ea\u02eb\5.\30\2\u02eb\u02ec\t\4\2\2\u02ec\u0308\3\2\2\2\u02ed"+
		"\u02ee\5.\30\2\u02ee\u02ef\7+\2\2\u02ef\u0308\3\2\2\2\u02f0\u02f1\5.\30"+
		"\2\u02f1\u02f2\7+\2\2\u02f2\u02f3\t\4\2\2\u02f3\u0308\3\2\2\2\u02f4\u0308"+
		"\7)\2\2\u02f5\u02f6\7)\2\2\u02f6\u0308\t\4\2\2\u02f7\u02f8\7)\2\2\u02f8"+
		"\u0308\7+\2\2\u02f9\u02fa\7)\2\2\u02fa\u02fb\7+\2\2\u02fb\u0308\t\4\2"+
		"\2\u02fc\u0308\5\u00d0i\2\u02fd\u02fe\5\u00d0i\2\u02fe\u02ff\t\4\2\2\u02ff"+
		"\u0308\3\2\2\2\u0300\u0301\5\u00d0i\2\u0301\u0302\7+\2\2\u0302\u0308\3"+
		"\2\2\2\u0303\u0304\5\u00d0i\2\u0304\u0305\7+\2\2\u0305\u0306\t\4\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u02ae\3\2\2\2\u0307\u02b1\3\2\2\2\u0307\u02b5\3\2"+
		"\2\2\u0307\u02b9\3\2\2\2\u0307\u02be\3\2\2\2\u0307\u02c0\3\2\2\2\u0307"+
		"\u02c4\3\2\2\2\u0307\u02c8\3\2\2\2\u0307\u02cd\3\2\2\2\u0307\u02ce\3\2"+
		"\2\2\u0307\u02d0\3\2\2\2\u0307\u02d2\3\2\2\2\u0307\u02d5\3\2\2\2\u0307"+
		"\u02d6\3\2\2\2\u0307\u02d8\3\2\2\2\u0307\u02da\3\2\2\2\u0307\u02dd\3\2"+
		"\2\2\u0307\u02de\3\2\2\2\u0307\u02df\3\2\2\2\u0307\u02e2\3\2\2\2\u0307"+
		"\u02e5\3\2\2\2\u0307\u02e9\3\2\2\2\u0307\u02ea\3\2\2\2\u0307\u02ed\3\2"+
		"\2\2\u0307\u02f0\3\2\2\2\u0307\u02f4\3\2\2\2\u0307\u02f5\3\2\2\2\u0307"+
		"\u02f7\3\2\2\2\u0307\u02f9\3\2\2\2\u0307\u02fc\3\2\2\2\u0307\u02fd\3\2"+
		"\2\2\u0307\u0300\3\2\2\2\u0307\u0303\3\2\2\2\u0308i\3\2\2\2\u0309\u030a"+
		"\5l\67\2\u030a\u030b\7\32\2\2\u030b\u030c\5n8\2\u030ck\3\2\2\2\u030d\u0310"+
		"\5\u00d0i\2\u030e\u0310\7)\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2\2"+
		"\u0310m\3\2\2\2\u0311\u0312\5p9\2\u0312o\3\2\2\2\u0313\u031f\5:\36\2\u0314"+
		"\u0315\5:\36\2\u0315\u0316\t\4\2\2\u0316\u031f\3\2\2\2\u0317\u0318\5:"+
		"\36\2\u0318\u0319\7+\2\2\u0319\u031f\3\2\2\2\u031a\u031b\5:\36\2\u031b"+
		"\u031c\7+\2\2\u031c\u031d\t\4\2\2\u031d\u031f\3\2\2\2\u031e\u0313\3\2"+
		"\2\2\u031e\u0314\3\2\2\2\u031e\u0317\3\2\2\2\u031e\u031a\3\2\2\2\u031f"+
		"q\3\2\2\2\u0320\u0325\5t;\2\u0321\u0322\5t;\2\u0322\u0323\5r:\2\u0323"+
		"\u0325\3\2\2\2\u0324\u0320\3\2\2\2\u0324\u0321\3\2\2\2\u0325s\3\2\2\2"+
		"\u0326\u0327\7\b\2\2\u0327\u0328\5v<\2\u0328\u0329\5\u008cG\2\u0329u\3"+
		"\2\2\2\u032a\u032e\5x=\2\u032b\u032e\5z>\2\u032c\u032e\5|?\2\u032d\u032a"+
		"\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032ew\3\2\2\2\u032f"+
		"\u0330\7#\2\2\u0330\u0333\7$\2\2\u0331\u0333\3\2\2\2\u0332\u032f\3\2\2"+
		"\2\u0332\u0331\3\2\2\2\u0333y\3\2\2\2\u0334\u0335\7#\2\2\u0335\u0336\5"+
		"\u0082B\2\u0336\u0337\5~@\2\u0337\u0338\5\u0084C\2\u0338\u0339\5\u0080"+
		"A\2\u0339\u033a\5\u0086D\2\u033a\u033b\7$\2\2\u033b\u0343\3\2\2\2\u033c"+
		"\u033d\5\u0082B\2\u033d\u033e\5~@\2\u033e\u033f\5\u0084C\2\u033f\u0340"+
		"\5\u0080A\2\u0340\u0341\5\u0086D\2\u0341\u0343\3\2\2\2\u0342\u0334\3\2"+
		"\2\2\u0342\u033c\3\2\2\2\u0343{\3\2\2\2\u0344\u0345\5\u0084C\2\u0345}"+
		"\3\2\2\2\u0346\u0347\7\31\2\2\u0347\177\3\2\2\2\u0348\u0349\7\31\2\2\u0349"+
		"\u0081\3\2\2\2\u034a\u034f\5 \21\2\u034b\u034c\7\4\2\2\u034c\u034f\5 "+
		"\21\2\u034d\u034f\3\2\2\2\u034e\u034a\3\2\2\2\u034e\u034b\3\2\2\2\u034e"+
		"\u034d\3\2\2\2\u034f\u0083\3\2\2\2\u0350\u0353\5^\60\2\u0351\u0353\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2\2\2\u0353\u0085\3\2\2\2\u0354"+
		"\u0357\5\u0088E\2\u0355\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0355"+
		"\3\2\2\2\u0357\u0087\3\2\2\2\u0358\u035e\5\60\31\2\u0359\u035a\5\60\31"+
		"\2\u035a\u035b\7\36\2\2\u035b\u035c\5\u0088E\2\u035c\u035e\3\2\2\2\u035d"+
		"\u0358\3\2\2\2\u035d\u0359\3\2\2\2\u035e\u0089\3\2\2\2\u035f\u0364\5\6"+
		"\4\2\u0360\u0361\5\6\4\2\u0361\u0362\5\u008aF\2\u0362\u0364\3\2\2\2\u0363"+
		"\u035f\3\2\2\2\u0363\u0360\3\2\2\2\u0364\u008b\3\2\2\2\u0365\u0366\7!"+
		"\2\2\u0366\u0370\7\"\2\2\u0367\u0368\7!\2\2\u0368\u0369\5\u008aF\2\u0369"+
		"\u036a\7\"\2\2\u036a\u0370\3\2\2\2\u036b\u0370\5L\'\2\u036c\u0370\58\35"+
		"\2\u036d\u0370\5r:\2\u036e\u0370\5\u008eH\2\u036f\u0365\3\2\2\2\u036f"+
		"\u0367\3\2\2\2\u036f\u036b\3\2\2\2\u036f\u036c\3\2\2\2\u036f\u036d\3\2"+
		"\2\2\u036f\u036e\3\2\2\2\u0370\u008d\3\2\2\2\u0371\u0372\7\t\2\2\u0372"+
		"\u0373\5\u0090I\2\u0373\u0374\7\31\2\2\u0374\u008f\3\2\2\2\u0375\u0378"+
		"\5\u00dep\2\u0376\u0378\5\60\31\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2"+
		"\2\2\u0378\u0091\3\2\2\2\u0379\u037a\5\u0094K\2\u037a\u037b\7!\2\2\u037b"+
		"\u037c\7\"\2\2\u037c\u0398\3\2\2\2\u037d\u037e\5\u0094K\2\u037e\u037f"+
		"\7!\2\2\u037f\u0380\5\u00a8U\2\u0380\u0381\7\"\2\2\u0381\u0398\3\2\2\2"+
		"\u0382\u0383\5\u009aN\2\u0383\u0384\7!\2\2\u0384\u0385\7\"\2\2\u0385\u0398"+
		"\3\2\2\2\u0386\u0387\5\u009aN\2\u0387\u0388\7!\2\2\u0388\u0389\5\u00a8"+
		"U\2\u0389\u038a\7\"\2\2\u038a\u0398\3\2\2\2\u038b\u038c\5\u00a4S\2\u038c"+
		"\u038d\7!\2\2\u038d\u038e\7\"\2\2\u038e\u0398\3\2\2\2\u038f\u0390\5\u00a4"+
		"S\2\u0390\u0391\7!\2\2\u0391\u0392\5\u00a8U\2\u0392\u0393\7\"\2\2\u0393"+
		"\u0398\3\2\2\2\u0394\u0395\5\u00a6T\2\u0395\u0396\7\31\2\2\u0396\u0398"+
		"\3\2\2\2\u0397\u0379\3\2\2\2\u0397\u037d\3\2\2\2\u0397\u0382\3\2\2\2\u0397"+
		"\u0386\3\2\2\2\u0397\u038b\3\2\2\2\u0397\u038f\3\2\2\2\u0397\u0394\3\2"+
		"\2\2\u0398\u0093\3\2\2\2\u0399\u039a\5\u0096L\2\u039a\u0095\3\2\2\2\u039b"+
		"\u039c\7\n\2\2\u039c\u039d\7)\2\2\u039d\u039e\7#\2\2\u039e\u03b9\7$\2"+
		"\2\u039f\u03a0\7\n\2\2\u03a0\u03a1\7)\2\2\u03a1\u03a2\7#\2\2\u03a2\u03a3"+
		"\7$\2\2\u03a3\u03a6\7\30\2\2\u03a4\u03a7\5\u0098M\2\u03a5\u03a7\7+\2\2"+
		"\u03a6\u03a4\3\2\2\2\u03a6\u03a5\3\2\2\2\u03a7\u03b9\3\2\2\2\u03a8\u03a9"+
		"\7\n\2\2\u03a9\u03aa\7)\2\2\u03aa\u03ab\7#\2\2\u03ab\u03ac\5\u00acW\2"+
		"\u03ac\u03ad\7$\2\2\u03ad\u03b9\3\2\2\2\u03ae\u03af\7\n\2\2\u03af\u03b0"+
		"\7)\2\2\u03b0\u03b1\7#\2\2\u03b1\u03b2\5\u00acW\2\u03b2\u03b3\7$\2\2\u03b3"+
		"\u03b6\7\30\2\2\u03b4\u03b7\5\u0098M\2\u03b5\u03b7\7+\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u039b\3\2\2\2\u03b8"+
		"\u039f\3\2\2\2\u03b8\u03a8\3\2\2\2\u03b8\u03ae\3\2\2\2\u03b9\u0097\3\2"+
		"\2\2\u03ba\u03bb\7)\2\2\u03bb\u0099\3\2\2\2\u03bc\u03bd\5\u00a2R\2\u03bd"+
		"\u03be\5\u0096L\2\u03be\u009b\3\2\2\2\u03bf\u03c0\5\u009eP\2\u03c0\u03c1"+
		"\5\u0096L\2\u03c1\u03d7\3\2\2\2\u03c2\u03c3\7\16\2\2\u03c3\u03d7\5\u0096"+
		"L\2\u03c4\u03c5\5\u009eP\2\u03c5\u03c6\7\16\2\2\u03c6\u03c7\5\u0096L\2"+
		"\u03c7\u03d7\3\2\2\2\u03c8\u03c9\7\17\2\2\u03c9\u03ca\5\u009eP\2\u03ca"+
		"\u03cb\7\16\2\2\u03cb\u03cc\5\u0096L\2\u03cc\u03d7\3\2\2\2\u03cd\u03ce"+
		"\7\17\2\2\u03ce\u03cf\5\u009eP\2\u03cf\u03d0\5\u0096L\2\u03d0\u03d7\3"+
		"\2\2\2\u03d1\u03d2\7\17\2\2\u03d2\u03d7\5\u0096L\2\u03d3\u03d4\7\17\2"+
		"\2\u03d4\u03d5\7\16\2\2\u03d5\u03d7\5\u0096L\2\u03d6\u03bf\3\2\2\2\u03d6"+
		"\u03c2\3\2\2\2\u03d6\u03c4\3\2\2\2\u03d6\u03c8\3\2\2\2\u03d6\u03cd\3\2"+
		"\2\2\u03d6\u03d1\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d7\u009d\3\2\2\2\u03d8"+
		"\u03d9\t\5\2\2\u03d9\u009f\3\2\2\2\u03da\u03db\t\6\2\2\u03db\u00a1\3\2"+
		"\2\2\u03dc\u03e1\5\u00a0Q\2\u03dd\u03de\5\u00a0Q\2\u03de\u03df\5\u00a2"+
		"R\2\u03df\u03e1\3\2\2\2\u03e0\u03dc\3\2\2\2\u03e0\u03dd\3\2\2\2\u03e1"+
		"\u00a3\3\2\2\2\u03e2\u03e3\7)\2\2\u03e3\u03e4\7#\2\2\u03e4\u03eb\7$\2"+
		"\2\u03e5\u03e6\7)\2\2\u03e6\u03e7\7#\2\2\u03e7\u03e8\5\u00acW\2\u03e8"+
		"\u03e9\7$\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e2\3\2\2\2\u03ea\u03e5\3\2"+
		"\2\2\u03eb\u00a5\3\2\2\2\u03ec\u03ef\5\u0094K\2\u03ed\u03ef\5\u009aN\2"+
		"\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef\u00a7\3\2\2\2\u03f0\u03f1"+
		"\5\u00aaV\2\u03f1\u00a9\3\2\2\2\u03f2\u03f7\5\6\4\2\u03f3\u03f4\5\6\4"+
		"\2\u03f4\u03f5\5\u00aaV\2\u03f5\u03f7\3\2\2\2\u03f6\u03f2\3\2\2\2\u03f6"+
		"\u03f3\3\2\2\2\u03f7\u00ab\3\2\2\2\u03f8\u03f9\5\u00aeX\2\u03f9\u00ad"+
		"\3\2\2\2\u03fa\u0400\5\u00b0Y\2\u03fb\u03fc\5\u00b0Y\2\u03fc\u03fd\7\36"+
		"\2\2\u03fd\u03fe\5\u00aeX\2\u03fe\u0400\3\2\2\2\u03ff\u03fa\3\2\2\2\u03ff"+
		"\u03fb\3\2\2\2\u0400\u00af\3\2\2\2\u0401\u0402\7)\2\2\u0402\u0403\7+\2"+
		"\2\u0403\u00b1\3\2\2\2\u0404\u0409\5\u00b4[\2\u0405\u0409\5\u00ba^\2\u0406"+
		"\u0409\5\u00c0a\2\u0407\u0409\5\u00ccg\2\u0408\u0404\3\2\2\2\u0408\u0405"+
		"\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u00b3\3\2\2\2\u040a"+
		"\u040b\5\u00b6\\\2\u040b\u00b5\3\2\2\2\u040c\u040d\7\20\2\2\u040d\u040e"+
		"\7)\2\2\u040e\u040f\7!\2\2\u040f\u0426\7\"\2\2\u0410\u0411\7\20\2\2\u0411"+
		"\u0412\7)\2\2\u0412\u0413\7!\2\2\u0413\u0414\5\u00b8]\2\u0414\u0415\7"+
		"\"\2\2\u0415\u0426\3\2\2\2\u0416\u0417\7\20\2\2\u0417\u0418\7)\2\2\u0418"+
		"\u0419\7\22\2\2\u0419\u041a\5D#\2\u041a\u041b\7!\2\2\u041b\u041c\7\"\2"+
		"\2\u041c\u0426\3\2\2\2\u041d\u041e\7\20\2\2\u041e\u041f\7)\2\2\u041f\u0420"+
		"\7\22\2\2\u0420\u0421\5D#\2\u0421\u0422\7!\2\2\u0422\u0423\5\u00b8]\2"+
		"\u0423\u0424\7\"\2\2\u0424\u0426\3\2\2\2\u0425\u040c\3\2\2\2\u0425\u0410"+
		"\3\2\2\2\u0425\u0416\3\2\2\2\u0425\u041d\3\2\2\2\u0426\u00b7\3\2\2\2\u0427"+
		"\u0428\5\u00aaV\2\u0428\u00b9\3\2\2\2\u0429\u042a\5\u00bc_\2\u042a\u00bb"+
		"\3\2\2\2\u042b\u042c\7\21\2\2\u042c\u042d\7)\2\2\u042d\u042e\7!\2\2\u042e"+
		"\u0445\7\"\2\2\u042f\u0430\7\21\2\2\u0430\u0431\7)\2\2\u0431\u0432\7!"+
		"\2\2\u0432\u0433\5\u00be`\2\u0433\u0434\7\"\2\2\u0434\u0445\3\2\2\2\u0435"+
		"\u0436\7\21\2\2\u0436\u0437\7)\2\2\u0437\u0438\7\22\2\2\u0438\u0439\5"+
		"D#\2\u0439\u043a\7!\2\2\u043a\u043b\7\"\2\2\u043b\u0445\3\2\2\2\u043c"+
		"\u043d\7\21\2\2\u043d\u043e\7)\2\2\u043e\u043f\7\22\2\2\u043f\u0440\5"+
		"D#\2\u0440\u0441\7!\2\2\u0441\u0442\5\u00be`\2\u0442\u0443\7\"\2\2\u0443"+
		"\u0445\3\2\2\2\u0444\u042b\3\2\2\2\u0444\u042f\3\2\2\2\u0444\u0435\3\2"+
		"\2\2\u0444\u043c\3\2\2\2\u0445\u00bd\3\2\2\2\u0446\u0447\5\u00aaV\2\u0447"+
		"\u00bf\3\2\2\2\u0448\u0449\5\u00c4c\2\u0449\u044a\7!\2\2\u044a\u044b\7"+
		"\"\2\2\u044b\u0452\3\2\2\2\u044c\u044d\5\u00c4c\2\u044d\u044e\7!\2\2\u044e"+
		"\u044f\5\u00c2b\2\u044f\u0450\7\"\2\2\u0450\u0452\3\2\2\2\u0451\u0448"+
		"\3\2\2\2\u0451\u044c\3\2\2\2\u0452\u00c1\3\2\2\2\u0453\u0454\5\u00aaV"+
		"\2\u0454\u00c3\3\2\2\2\u0455\u0456\7\23\2\2\u0456\u047c\7)\2\2\u0457\u0458"+
		"\7\23\2\2\u0458\u0459\7)\2\2\u0459\u045a\7\22\2\2\u045a\u047c\5D#\2\u045b"+
		"\u045c\7\23\2\2\u045c\u045d\7)\2\2\u045d\u045e\7\24\2\2\u045e\u047c\5"+
		"D#\2\u045f\u0460\7\23\2\2\u0460\u0461\7)\2\2\u0461\u0462\7\22\2\2\u0462"+
		"\u0463\5D#\2\u0463\u0464\7\24\2\2\u0464\u0465\5\u00c6d\2\u0465\u047c\3"+
		"\2\2\2\u0466\u0467\7\17\2\2\u0467\u0468\7\23\2\2\u0468\u047c\7)\2\2\u0469"+
		"\u046a\7\17\2\2\u046a\u046b\7\23\2\2\u046b\u046c\7)\2\2\u046c\u046d\7"+
		"\22\2\2\u046d\u047c\5D#\2\u046e\u046f\7\17\2\2\u046f\u0470\7\23\2\2\u0470"+
		"\u0471\7)\2\2\u0471\u0472\7\24\2\2\u0472\u047c\5D#\2\u0473\u0474\7\17"+
		"\2\2\u0474\u0475\7\23\2\2\u0475\u0476\7)\2\2\u0476\u0477\7\22\2\2\u0477"+
		"\u0478\5D#\2\u0478\u0479\7\24\2\2\u0479\u047a\5\u00c6d\2\u047a\u047c\3"+
		"\2\2\2\u047b\u0455\3\2\2\2\u047b\u0457\3\2\2\2\u047b\u045b\3\2\2\2\u047b"+
		"\u045f\3\2\2\2\u047b\u0466\3\2\2\2\u047b\u0469\3\2\2\2\u047b\u046e\3\2"+
		"\2\2\u047b\u0473\3\2\2\2\u047c\u00c5\3\2\2\2\u047d\u047e\7)\2\2\u047e"+
		"\u00c7\3\2\2\2\u047f\u0480\5\u00caf\2\u0480\u0481\7\31\2\2\u0481\u00c9"+
		"\3\2\2\2\u0482\u0483\7#\2\2\u0483\u0484\5\u00ccg\2\u0484\u0485\7$\2\2"+
		"\u0485\u0486\t\3\2\2\u0486\u0487\5@!\2\u0487\u048d\3\2\2\2\u0488\u0489"+
		"\7#\2\2\u0489\u048a\5\u00ccg\2\u048a\u048b\7$\2\2\u048b\u048d\3\2\2\2"+
		"\u048c\u0482\3\2\2\2\u048c\u0488\3\2\2\2\u048d\u00cb\3\2\2\2\u048e\u048f"+
		"\7\25\2\2\u048f\u0490\7\23\2\2\u0490\u0491\7!\2\2\u0491\u0499\7\"\2\2"+
		"\u0492\u0493\7\25\2\2\u0493\u0494\7\23\2\2\u0494\u0495\7!\2\2\u0495\u0496"+
		"\5\u00ceh\2\u0496\u0497\7\"\2\2\u0497\u0499\3\2\2\2\u0498\u048e\3\2\2"+
		"\2\u0498\u0492\3\2\2\2\u0499\u00cd\3\2\2\2\u049a\u049f\5\6\4\2\u049b\u049c"+
		"\5\6\4\2\u049c\u049d\5\u00ceh\2\u049d\u049f\3\2\2\2\u049e\u049a\3\2\2"+
		"\2\u049e\u049b\3\2\2\2\u049f\u00cf\3\2\2\2\u04a0\u04a5\5\u00d2j\2\u04a1"+
		"\u04a2\5\u00d2j\2\u04a2\u04a3\5\u00d0i\2\u04a3\u04a5\3\2\2\2\u04a4\u04a0"+
		"\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a5\u00d1\3\2\2\2\u04a6\u04c9\7)\2\2\u04a7"+
		"\u04a8\7)\2\2\u04a8\u04c9\7\33\2\2\u04a9\u04aa\7)\2\2\u04aa\u04c9\5\u00d4"+
		"k\2\u04ab\u04ac\7)\2\2\u04ac\u04ad\5\u00d4k\2\u04ad\u04ae\7\33\2\2\u04ae"+
		"\u04c9\3\2\2\2\u04af\u04b0\5\64\33\2\u04b0\u04b1\7)\2\2\u04b1\u04c9\3"+
		"\2\2\2\u04b2\u04b3\7)\2\2\u04b3\u04c9\7\33\2\2\u04b4\u04b5\5\64\33\2\u04b5"+
		"\u04b6\7)\2\2\u04b6\u04b7\5\u00d4k\2\u04b7\u04c9\3\2\2\2\u04b8\u04b9\7"+
		")\2\2\u04b9\u04ba\5\u00d4k\2\u04ba\u04bb\7\33\2\2\u04bb\u04c9\3\2\2\2"+
		"\u04bc\u04bd\7)\2\2\u04bd\u04c9\5\66\34\2\u04be\u04bf\7)\2\2\u04bf\u04c9"+
		"\7\33\2\2\u04c0\u04c1\7)\2\2\u04c1\u04c2\5\u00d4k\2\u04c2\u04c3\5\66\34"+
		"\2\u04c3\u04c9\3\2\2\2\u04c4\u04c5\7)\2\2\u04c5\u04c6\5\u00d4k\2\u04c6"+
		"\u04c7\7\33\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04a6\3\2\2\2\u04c8\u04a7\3"+
		"\2\2\2\u04c8\u04a9\3\2\2\2\u04c8\u04ab\3\2\2\2\u04c8\u04af\3\2\2\2\u04c8"+
		"\u04b2\3\2\2\2\u04c8\u04b4\3\2\2\2\u04c8\u04b8\3\2\2\2\u04c8\u04bc\3\2"+
		"\2\2\u04c8\u04be\3\2\2\2\u04c8\u04c0\3\2\2\2\u04c8\u04c4\3\2\2\2\u04c9"+
		"\u00d3\3\2\2\2\u04ca\u04cb\7\37\2\2\u04cb\u04cc\5\u00d6l\2\u04cc\u04cd"+
		"\7 \2\2\u04cd\u04d4\3\2\2\2\u04ce\u04cf\7\37\2\2\u04cf\u04d0\5\u00d6l"+
		"\2\u04d0\u04d1\7 \2\2\u04d1\u04d2\5\u00d4k\2\u04d2\u04d4\3\2\2\2\u04d3"+
		"\u04ca\3\2\2\2\u04d3\u04ce\3\2\2\2\u04d4\u00d5\3\2\2\2\u04d5\u04d6\5\60"+
		"\31\2\u04d6\u00d7\3\2\2\2\u04d7\u04d8\7#\2\2\u04d8\u04d9\5\u00dan\2\u04d9"+
		"\u04da\7$\2\2\u04da\u04e9\3\2\2\2\u04db\u04dc\7#\2\2\u04dc\u04dd\5\u00da"+
		"n\2\u04dd\u04de\7$\2\2\u04de\u04df\7#\2\2\u04df\u04e0\7$\2\2\u04e0\u04e9"+
		"\3\2\2\2\u04e1\u04e2\7#\2\2\u04e2\u04e3\5\u00dan\2\u04e3\u04e4\7$\2\2"+
		"\u04e4\u04e5\7#\2\2\u04e5\u04e6\5\60\31\2\u04e6\u04e7\7$\2\2\u04e7\u04e9"+
		"\3\2\2\2\u04e8\u04d7\3\2\2\2\u04e8\u04db\3\2\2\2\u04e8\u04e1\3\2\2\2\u04e9"+
		"\u00d9\3\2\2\2\u04ea\u04eb\5\u00dco\2\u04eb\u04ec\7!\2\2\u04ec\u04ed\7"+
		"\"\2\2\u04ed\u04f4\3\2\2\2\u04ee\u04ef\5\u00dco\2\u04ef\u04f0\7!\2\2\u04f0"+
		"\u04f1\5\u00a8U\2\u04f1\u04f2\7\"\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04ea"+
		"\3\2\2\2\u04f3\u04ee\3\2\2\2\u04f4\u00db\3\2\2\2\u04f5\u04f6\7\n\2\2\u04f6"+
		"\u04f7\7#\2\2\u04f7\u050f\7$\2\2\u04f8\u04f9\7\n\2\2\u04f9\u04fa\7#\2"+
		"\2\u04fa\u04fb\7$\2\2\u04fb\u04fe\7\30\2\2\u04fc\u04ff\5\u0098M\2\u04fd"+
		"\u04ff\7+\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff\u050f\3\2"+
		"\2\2\u0500\u0501\7\n\2\2\u0501\u0502\7#\2\2\u0502\u0503\5\u00acW\2\u0503"+
		"\u0504\7$\2\2\u0504\u050f\3\2\2\2\u0505\u0506\7\n\2\2\u0506\u0507\7#\2"+
		"\2\u0507\u0508\5\u00acW\2\u0508\u0509\7$\2\2\u0509\u050c\7\30\2\2\u050a"+
		"\u050d\5\u0098M\2\u050b\u050d\7+\2\2\u050c\u050a\3\2\2\2\u050c\u050b\3"+
		"\2\2\2\u050d\u050f\3\2\2\2\u050e\u04f5\3\2\2\2\u050e\u04f8\3\2\2\2\u050e"+
		"\u0500\3\2\2\2\u050e\u0505\3\2\2\2\u050f\u00dd\3\2\2\2\u0510\u052b\7)"+
		"\2\2\u0511\u0512\7)\2\2\u0512\u052b\7+\2\2\u0513\u052b\7-\2\2\u0514\u0515"+
		"\7-\2\2\u0515\u052b\7+\2\2\u0516\u052b\7.\2\2\u0517\u0518\7.\2\2\u0518"+
		"\u052b\7+\2\2\u0519\u052b\7,\2\2\u051a\u052b\5&\24\2\u051b\u052b\5*\26"+
		"\2\u051c\u052b\5\60\31\2\u051d\u052b\5:\36\2\u051e\u051f\5\u00e0q\2\u051f"+
		"\u0520\7\33\2\2\u0520\u0521\5\u00e2r\2\u0521\u052b\3\2\2\2\u0522\u0523"+
		"\5\u00e0q\2\u0523\u0524\7\35\2\2\u0524\u0525\5\u00e2r\2\u0525\u052b\3"+
		"\2\2\2\u0526\u052b\5\u00d0i\2\u0527\u052b\5\u00d8m\2\u0528\u052b\5\u00ca"+
		"f\2\u0529\u052b\5\u00ccg\2\u052a\u0510\3\2\2\2\u052a\u0511\3\2\2\2\u052a"+
		"\u0513\3\2\2\2\u052a\u0514\3\2\2\2\u052a\u0516\3\2\2\2\u052a\u0517\3\2"+
		"\2\2\u052a\u0519\3\2\2\2\u052a\u051a\3\2\2\2\u052a\u051b\3\2\2\2\u052a"+
		"\u051c\3\2\2\2\u052a\u051d\3\2\2\2\u052a\u051e\3\2\2\2\u052a\u0522\3\2"+
		"\2\2\u052a\u0526\3\2\2\2\u052a\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u0529\3\2\2\2\u052b\u00df\3\2\2\2\u052c\u052d\7)\2\2\u052d\u00e1\3\2"+
		"\2\2\u052e\u052f\7)\2\2\u052f\u00e3\3\2\2\2I\u00ec\u00f8\u00fd\u010e\u0123"+
		"\u0154\u015d\u0166\u0177\u0185\u018d\u0194\u019c\u01a7\u01b1\u020b\u0224"+
		"\u0231\u023a\u0246\u0252\u0258\u0265\u026f\u0284\u028a\u0294\u0299\u029e"+
		"\u02a8\u0307\u030f\u031e\u0324\u032d\u0332\u0342\u034e\u0352\u0356\u035d"+
		"\u0363\u036f\u0377\u0397\u03a6\u03b6\u03b8\u03d6\u03e0\u03ea\u03ee\u03f6"+
		"\u03ff\u0408\u0425\u0444\u0451\u047b\u048c\u0498\u049e\u04a4\u04c8\u04d3"+
		"\u04e8\u04f3\u04fe\u050c\u050e\u052a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}