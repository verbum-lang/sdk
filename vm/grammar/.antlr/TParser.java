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
		RULE_anFnItems = 108, RULE_functionsModesFn = 109, RULE_anonymousObjectCall = 110, 
		RULE_anonymousObjectCallExpr = 111, RULE_anonymousObject = 112, RULE_generalValue = 113, 
		RULE_objIdentifierA = 114, RULE_objIdentifierB = 115;
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
			"anonymousFunction", "anFnItems", "functionsModesFn", "anonymousObjectCall", 
			"anonymousObjectCallExpr", "anonymousObject", "generalValue", "objIdentifierA", 
			"objIdentifierB"
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
			setState(232);
			fileContent();
			setState(233);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				sentence();
				setState(237);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				oopGeneral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				anonymousClassCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
				anonymousObjectCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
			setState(260);
			match(Break);
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
			setState(263);
			match(Next);
			setState(264);
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
			setState(266);
			match(Use);
			setState(267);
			useValue();
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				useString();
				setState(272);
				match(Separator);
				setState(273);
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
			setState(277);
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
			setState(279);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(Var);
				setState(282);
				variableMembers();
				setState(283);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				methodVisibility();
				setState(286);
				match(Var);
				setState(287);
				variableMembers();
				setState(288);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				variableMembers();
				setState(291);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				variableMultipleAssignments();
				setState(294);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(Var);
				setState(299);
				variableMembers();
				setState(300);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				methodPerm();
				setState(303);
				match(Var);
				setState(304);
				variableMembers();
				setState(305);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(Static);
				setState(308);
				match(Var);
				setState(309);
				variableMembers();
				setState(310);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(Final);
				setState(319);
				methodPerm();
				setState(320);
				match(Static);
				setState(321);
				match(Var);
				setState(322);
				variableMembers();
				setState(323);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(Final);
				setState(326);
				methodPerm();
				setState(327);
				match(Var);
				setState(328);
				variableMembers();
				setState(329);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				match(Final);
				setState(332);
				match(Var);
				setState(333);
				variableMembers();
				setState(334);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				match(Final);
				setState(337);
				match(Static);
				setState(338);
				match(Var);
				setState(339);
				variableMembers();
				setState(340);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				variableMembers();
				setState(343);
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
			setState(347);
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				variableDefinitionMA();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				variableDefinitionMA();
				setState(351);
				match(Attr);
				setState(352);
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
			setState(356);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				variableDefinition();
				setState(360);
				match(Separator);
				setState(361);
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(Identifier);
				setState(366);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				objIdentifierA();
				setState(368);
				match(Point);
				setState(369);
				objIdentifierB();
				setState(370);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				objIdentifierA();
				setState(373);
				match(TwoTwoPoint);
				setState(374);
				objIdentifierB();
				setState(375);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				arrayAccessElements();
				setState(378);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(TypeSpec);
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				match(New);
				setState(389);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(TypeSpec);
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
				match(New);
				setState(393);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(OpenArIndex);
				setState(397);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(OpenArIndex);
				setState(399);
				indexArrayElements();
				setState(400);
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
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				generalValue();
				setState(406);
				match(Separator);
				setState(407);
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
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(OpenBlock);
				setState(412);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(OpenBlock);
				setState(414);
				associativeArrayElements();
				setState(415);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(Identifier);
				setState(420);
				match(TwoPoint);
				setState(421);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Identifier);
				setState(423);
				match(TwoPoint);
				setState(424);
				generalValue();
				setState(425);
				match(Separator);
				setState(426);
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
			setState(430);
			match(OpenOp);
			setState(431);
			operationElements();
			setState(432);
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
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				operationValue();
				setState(436);
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
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				functionCall();
				setState(442);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				functionCall();
				setState(445);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				functionCall();
				setState(448);
				match(TypeSpec);
				setState(449);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				match(Identifier);
				setState(453);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				match(Identifier);
				setState(455);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
				match(Identifier);
				setState(457);
				match(TypeSpec);
				setState(458);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				firstIncDec();
				setState(460);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(462);
				firstIncDec();
				setState(463);
				match(Identifier);
				setState(464);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(466);
				firstIncDec();
				setState(467);
				match(Identifier);
				setState(468);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(470);
				firstIncDec();
				setState(471);
				match(Identifier);
				setState(472);
				match(TypeSpec);
				setState(473);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(475);
				match(Identifier);
				setState(476);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(477);
				match(Identifier);
				setState(478);
				lastIncDec();
				setState(479);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(481);
				match(Identifier);
				setState(482);
				lastIncDec();
				setState(483);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(485);
				match(Identifier);
				setState(486);
				lastIncDec();
				setState(487);
				match(TypeSpec);
				setState(488);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(490);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(491);
				match(Integer);
				setState(492);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(493);
				match(Integer);
				setState(494);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(495);
				match(Integer);
				setState(496);
				match(TypeSpec);
				setState(497);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(498);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(499);
				match(Float);
				setState(500);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(501);
				match(Float);
				setState(502);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(503);
				match(Float);
				setState(504);
				match(TypeSpec);
				setState(505);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(506);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(507);
				operationBlock();
				setState(508);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(510);
				operationBlock();
				setState(511);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(513);
				operationBlock();
				setState(514);
				match(TypeSpec);
				setState(515);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(517);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(518);
				arrayAccessElements();
				setState(519);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(521);
				arrayAccessElements();
				setState(522);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(524);
				arrayAccessElements();
				setState(525);
				match(TypeSpec);
				setState(526);
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
			setState(530);
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
			setState(532);
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
			setState(534);
			functionCall();
			setState(535);
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
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(Identifier);
				setState(538);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(Identifier);
				setState(540);
				match(Point);
				setState(541);
				identifierB();
				setState(542);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(Identifier);
				setState(545);
				match(TwoTwoPoint);
				setState(546);
				identifierB();
				setState(547);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				arrayAccessElements();
				setState(551);
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
			setState(555);
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
			setState(557);
			match(Identifier);
			setState(558);
			_la = _input.LA(1);
			if ( !(_la==Point || _la==TwoTwoPoint) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
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
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				functionCallCascadingItem();
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
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
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				identifierB();
				setState(569);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				arrayAccessElements();
				setState(572);
				functionCallParamAC();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
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
			setState(577);
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
			setState(579);
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
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(OpenOp);
				setState(582);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(OpenOp);
				setState(584);
				functionCallParamElements();
				setState(585);
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
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				generalValue();
				setState(591);
				match(Separator);
				setState(592);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				operationElements();
				setState(596);
				match(Separator);
				setState(597);
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
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				conditionalExpressionStructBlock();
				setState(603);
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
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				ifElementUnique();
				setState(609);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				ifElementUnique();
				setState(612);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				ifElementUnique();
				setState(615);
				elifElements();
				setState(616);
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
			setState(620);
			match(If);
			setState(621);
			conditionalExpressionItems();
			setState(622);
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
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				elifElementUnique();
				setState(626);
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
			setState(630);
			match(Elif);
			setState(631);
			conditionalExpressionItems();
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
			setState(634);
			match(Else);
			setState(635);
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
			setState(637);
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
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(OpenBlock);
				setState(640);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(OpenBlock);
				setState(642);
				conditionalBlockElsItems();
				setState(643);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(647);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(648);
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
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				sentence();
				setState(653);
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
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				conditionExpValue();
				setState(659);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				conditionExpBlock();
				setState(663);
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
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(Not);
				setState(668);
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
				setState(669);
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
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(Not);
				setState(674);
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
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				conditionExpBlockItem();
				setState(679);
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
				setState(681);
				conditionExpBlockItem();
				setState(682);
				match(TypeSpec);
				setState(683);
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
			setState(687);
			match(OpenOp);
			setState(688);
			conditionalExpressionElements();
			setState(689);
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
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				firstIncDec();
				setState(692);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				firstIncDec();
				setState(695);
				match(Identifier);
				setState(696);
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
				setState(698);
				firstIncDec();
				setState(699);
				match(Identifier);
				setState(700);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				firstIncDec();
				setState(703);
				match(Identifier);
				setState(704);
				match(TypeSpec);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(707);
				match(Identifier);
				setState(708);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(709);
				match(Identifier);
				setState(710);
				lastIncDec();
				setState(711);
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
				setState(713);
				match(Identifier);
				setState(714);
				lastIncDec();
				setState(715);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
				match(Identifier);
				setState(718);
				lastIncDec();
				setState(719);
				match(TypeSpec);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(723);
				match(Integer);
				setState(724);
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
				setState(725);
				match(Integer);
				setState(726);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(727);
				match(Integer);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(730);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(731);
				match(Float);
				setState(732);
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
				setState(733);
				match(Float);
				setState(734);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(735);
				match(Float);
				setState(736);
				match(TypeSpec);
				setState(737);
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
				setState(738);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(739);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(740);
				functionCall();
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(743);
				functionCall();
				setState(744);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(746);
				functionCall();
				setState(747);
				match(TypeSpec);
				setState(748);
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
				setState(750);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(751);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(754);
				operationBlock();
				setState(755);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(757);
				operationBlock();
				setState(758);
				match(TypeSpec);
				setState(759);
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
				setState(761);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(762);
				match(Identifier);
				setState(763);
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
				setState(764);
				match(Identifier);
				setState(765);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(766);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(769);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(770);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(773);
				arrayAccessElements();
				setState(774);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(776);
				arrayAccessElements();
				setState(777);
				match(TypeSpec);
				setState(778);
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
			setState(782);
			identifierAttrFn();
			setState(783);
			match(Attr);
			setState(784);
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
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
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
			setState(790);
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
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				functionCall();
				setState(797);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				functionCall();
				setState(800);
				match(TypeSpec);
				setState(801);
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
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				loopExpressionItems();
				setState(807);
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
			setState(811);
			match(For);
			setState(812);
			loopExpression();
			setState(813);
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
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
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
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(OpenOp);
				setState(821);
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
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				match(OpenOp);
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
				setState(831);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				loopOneMembers();
				setState(834);
				endOne();
				setState(835);
				loopTwoMembers();
				setState(836);
				endTwo();
				setState(837);
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
			setState(841);
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
			setState(843);
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
			setState(845);
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
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(Var);
				setState(849);
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
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
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
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
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
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				operationElements();
				setState(863);
				match(Separator);
				setState(864);
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
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				sentence();
				setState(870);
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
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(OpenBlock);
				setState(875);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				match(OpenBlock);
				setState(877);
				loopBlockElements();
				setState(878);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
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
			setState(886);
			match(Ret);
			setState(887);
			retValues();
			setState(888);
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
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
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
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				functionsModes();
				setState(895);
				match(OpenBlock);
				setState(896);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				functionsModes();
				setState(899);
				match(OpenBlock);
				setState(900);
				functionCodeBlock();
				setState(901);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
				functionMethodsModes();
				setState(904);
				match(OpenBlock);
				setState(905);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				functionMethodsModes();
				setState(908);
				match(OpenBlock);
				setState(909);
				functionCodeBlock();
				setState(910);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(912);
				constructClassMethod();
				setState(913);
				match(OpenBlock);
				setState(914);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(916);
				constructClassMethod();
				setState(917);
				match(OpenBlock);
				setState(918);
				functionCodeBlock();
				setState(919);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				interfaceMethod();
				setState(922);
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
			setState(926);
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
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(Function);
				setState(929);
				match(Identifier);
				setState(930);
				match(OpenOp);
				setState(931);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				match(Function);
				setState(933);
				match(Identifier);
				setState(934);
				match(OpenOp);
				setState(935);
				match(CloseOp);
				setState(936);
				match(ArrowRight);
				setState(939);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(937);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(938);
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
				setState(941);
				match(Function);
				setState(942);
				match(Identifier);
				setState(943);
				match(OpenOp);
				setState(944);
				functionParams();
				setState(945);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(947);
				match(Function);
				setState(948);
				match(Identifier);
				setState(949);
				match(OpenOp);
				setState(950);
				functionParams();
				setState(951);
				match(CloseOp);
				setState(952);
				match(ArrowRight);
				setState(955);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(953);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(954);
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
			setState(959);
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
			setState(961);
			methodVisibility();
			setState(962);
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
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				methodPerm();
				setState(965);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(Static);
				setState(968);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
				methodPerm();
				setState(970);
				match(Static);
				setState(971);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				match(Final);
				setState(974);
				methodPerm();
				setState(975);
				match(Static);
				setState(976);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(978);
				match(Final);
				setState(979);
				methodPerm();
				setState(980);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(982);
				match(Final);
				setState(983);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(984);
				match(Final);
				setState(985);
				match(Static);
				setState(986);
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
			setState(989);
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
			setState(991);
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
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				visibilityItems();
				setState(995);
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
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				match(Identifier);
				setState(1000);
				match(OpenOp);
				setState(1001);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(Identifier);
				setState(1003);
				match(OpenOp);
				setState(1004);
				functionParams();
				setState(1005);
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
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
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
				setState(1010);
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
			setState(1013);
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
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				sentence();
				setState(1017);
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
			setState(1021);
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
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				functionParamElements();
				setState(1025);
				match(Separator);
				setState(1026);
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
			setState(1030);
			match(Identifier);
			setState(1031);
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
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				classDefination();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
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
			setState(1039);
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
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				match(Interface);
				setState(1042);
				match(Identifier);
				setState(1043);
				match(OpenBlock);
				setState(1044);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				match(Interface);
				setState(1046);
				match(Identifier);
				setState(1047);
				match(OpenBlock);
				setState(1048);
				interfaceCodeBlock();
				setState(1049);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1058);
				match(Interface);
				setState(1059);
				match(Identifier);
				setState(1060);
				match(Extends);
				setState(1061);
				identifierB();
				setState(1062);
				match(OpenBlock);
				setState(1063);
				interfaceCodeBlock();
				setState(1064);
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
			setState(1068);
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
			setState(1070);
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
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(Abstract);
				setState(1073);
				match(Identifier);
				setState(1074);
				match(OpenBlock);
				setState(1075);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(Abstract);
				setState(1077);
				match(Identifier);
				setState(1078);
				match(OpenBlock);
				setState(1079);
				abstractCodeBlock();
				setState(1080);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				match(Abstract);
				setState(1090);
				match(Identifier);
				setState(1091);
				match(Extends);
				setState(1092);
				identifierB();
				setState(1093);
				match(OpenBlock);
				setState(1094);
				abstractCodeBlock();
				setState(1095);
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
			setState(1099);
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
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				classModes();
				setState(1102);
				match(OpenBlock);
				setState(1103);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				classModes();
				setState(1106);
				match(OpenBlock);
				setState(1107);
				classCodeBlock();
				setState(1108);
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
			setState(1112);
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
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				match(Class);
				setState(1115);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(Class);
				setState(1117);
				match(Identifier);
				setState(1118);
				match(Extends);
				setState(1119);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				match(Class);
				setState(1121);
				match(Identifier);
				setState(1122);
				match(Implements);
				setState(1123);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				match(Class);
				setState(1125);
				match(Identifier);
				setState(1126);
				match(Extends);
				setState(1127);
				identifierB();
				setState(1128);
				match(Implements);
				setState(1129);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1131);
				match(Final);
				setState(1132);
				match(Class);
				setState(1133);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				match(Final);
				setState(1135);
				match(Class);
				setState(1136);
				match(Identifier);
				setState(1137);
				match(Extends);
				setState(1138);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1139);
				match(Final);
				setState(1140);
				match(Class);
				setState(1141);
				match(Identifier);
				setState(1142);
				match(Implements);
				setState(1143);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1144);
				match(Final);
				setState(1145);
				match(Class);
				setState(1146);
				match(Identifier);
				setState(1147);
				match(Extends);
				setState(1148);
				identifierB();
				setState(1149);
				match(Implements);
				setState(1150);
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
			setState(1154);
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
			setState(1156);
			anonymousClassCallExpr();
			setState(1157);
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
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				match(OpenOp);
				setState(1160);
				anonymousClass();
				setState(1161);
				match(CloseOp);
				setState(1162);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1163);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				match(OpenOp);
				setState(1166);
				anonymousClass();
				setState(1167);
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
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(New);
				setState(1172);
				match(Class);
				setState(1173);
				match(OpenBlock);
				setState(1174);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				match(New);
				setState(1176);
				match(Class);
				setState(1177);
				match(OpenBlock);
				setState(1178);
				anonymousClassElements();
				setState(1179);
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
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				sentence();
				setState(1185);
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
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				arrayAccessElementsItems();
				setState(1191);
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
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				match(Identifier);
				setState(1197);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1198);
				match(Identifier);
				setState(1199);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1200);
				match(Identifier);
				setState(1201);
				accessBlockAr();
				setState(1202);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1204);
				firstIncDec();
				setState(1205);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1207);
				match(Identifier);
				setState(1208);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1209);
				firstIncDec();
				setState(1210);
				match(Identifier);
				setState(1211);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1213);
				match(Identifier);
				setState(1214);
				accessBlockAr();
				setState(1215);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1217);
				match(Identifier);
				setState(1218);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1219);
				match(Identifier);
				setState(1220);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1221);
				match(Identifier);
				setState(1222);
				accessBlockAr();
				setState(1223);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1225);
				match(Identifier);
				setState(1226);
				accessBlockAr();
				setState(1227);
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
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				match(OpenArIndex);
				setState(1232);
				arrayIndexAccess();
				setState(1233);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				match(OpenArIndex);
				setState(1236);
				arrayIndexAccess();
				setState(1237);
				match(CloseArIndex);
				setState(1238);
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
			setState(1242);
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
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				match(OpenOp);
				setState(1245);
				anFnItems();
				setState(1246);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(OpenOp);
				setState(1249);
				anFnItems();
				setState(1250);
				match(CloseOp);
				setState(1251);
				match(OpenOp);
				setState(1252);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				match(OpenOp);
				setState(1255);
				anFnItems();
				setState(1256);
				match(CloseOp);
				setState(1257);
				match(OpenOp);
				setState(1258);
				operationElements();
				setState(1259);
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
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				functionsModesFn();
				setState(1264);
				match(OpenBlock);
				setState(1265);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				functionsModesFn();
				setState(1268);
				match(OpenBlock);
				setState(1269);
				functionCodeBlock();
				setState(1270);
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
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				match(Function);
				setState(1275);
				match(OpenOp);
				setState(1276);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				match(Function);
				setState(1278);
				match(OpenOp);
				setState(1279);
				match(CloseOp);
				setState(1280);
				match(ArrowRight);
				setState(1283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1281);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1282);
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
				setState(1285);
				match(Function);
				setState(1286);
				match(OpenOp);
				setState(1287);
				functionParams();
				setState(1288);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1290);
				match(Function);
				setState(1291);
				match(OpenOp);
				setState(1292);
				functionParams();
				setState(1293);
				match(CloseOp);
				setState(1294);
				match(ArrowRight);
				setState(1297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1295);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1296);
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
		enterRule(_localctx, 220, RULE_anonymousObjectCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			anonymousObjectCallExpr();
			setState(1302);
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
		enterRule(_localctx, 222, RULE_anonymousObjectCallExpr);
		int _la;
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(OpenOp);
				setState(1305);
				anonymousObject();
				setState(1306);
				match(CloseOp);
				setState(1307);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1308);
				functionCallCascading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(OpenOp);
				setState(1311);
				anonymousObject();
				setState(1312);
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
		enterRule(_localctx, 224, RULE_anonymousObject);
		int _la;
		try {
			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				match(New);
				setState(1317);
				match(Identifier);
				setState(1318);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				match(New);
				setState(1320);
				match(Identifier);
				setState(1321);
				functionCallParam();
				setState(1322);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1323);
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
		public AnonymousObjectCallExprContext anonymousObjectCallExpr() {
			return getRuleContext(AnonymousObjectCallExprContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_generalValue);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(Identifier);
				setState(1329);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1331);
				match(Integer);
				setState(1332);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1333);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1334);
				match(Float);
				setState(1335);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1336);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1337);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1338);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1339);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1340);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1341);
				objIdentifierA();
				setState(1342);
				match(Point);
				setState(1343);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1345);
				objIdentifierA();
				setState(1346);
				match(TwoTwoPoint);
				setState(1347);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1349);
				arrayAccessElements();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1350);
				anonymousFunction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1351);
				anonymousClassCallExpr();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1352);
				anonymousClass();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1353);
				anonymousObjectCallExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
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
		enterRule(_localctx, 230, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0553\4\2\t\2"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00f3\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u0100\n\4\3\5\3\5\3\5\5\5\u0105\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0116\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u012b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u015c\n"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0165\n\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u016e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u017f\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u018d\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0195\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u019c"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01a4\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01af\n\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u01b9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0213\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u022c\n\36\3\37\3\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\5!\u0239\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0242"+
		"\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\5%\u024e\n%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u025a\n&\3\'\3\'\3\'\3\'\5\'\u0260\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u026d\n(\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0277\n*\3+\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u028c\n.\3/\3/\3"+
		"/\3/\5/\u0292\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u029c\n"+
		"\60\3\61\3\61\3\61\5\61\u02a1\n\61\3\62\3\62\3\62\5\62\u02a6\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02b0\n\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u030f\n\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\5\67\u0317\n\67\38\38\39\39\39\39\39\39\39\39\39\39\39\59\u0326\n9\3"+
		":\3:\3:\3:\5:\u032c\n:\3;\3;\3;\3;\3<\3<\3<\5<\u0335\n<\3=\3=\3=\5=\u033a"+
		"\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u034a\n>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3B\3B\5B\u0356\nB\3C\3C\5C\u035a\nC\3D\3D\5D\u035e\nD\3E"+
		"\3E\3E\3E\3E\5E\u0365\nE\3F\3F\3F\3F\5F\u036b\nF\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\5G\u0377\nG\3H\3H\3H\3H\3I\3I\5I\u037f\nI\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\5J\u039f\nJ\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03ae\nL\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03be\nL\5L\u03c0\nL\3M\3M"+
		"\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u03de\nO\3P\3P\3Q\3Q\3R\3R\3R\3R\5R\u03e8\nR\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\5S\u03f2\nS\3T\3T\5T\u03f6\nT\3U\3U\3V\3V\3V\3V\5V\u03fe"+
		"\nV\3W\3W\3X\3X\3X\3X\3X\5X\u0407\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0410\nZ"+
		"\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u042d\n\\\3]\3]\3^\3^\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5"+
		"_\u044c\n_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0459\na\3b\3b\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0483\nc\3d\3d\3e\3e\3e\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0494\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5"+
		"g\u04a0\ng\3h\3h\3h\3h\5h\u04a6\nh\3i\3i\3i\3i\5i\u04ac\ni\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\5j\u04d0\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u04db"+
		"\nk\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u04f0"+
		"\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u04fb\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o"+
		"\5o\u0506\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0514\no\5o\u0516"+
		"\no\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0525\nq\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\5r\u0530\nr\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u054d\ns\3t\3t\3u\3u\3u\2\2v\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\2\7\4\2\32\32&"+
		"&\4\2\33\33\35\35\3\2%&\3\2\13\r\3\2\13\17\2\u05c8\2\u00ea\3\2\2\2\4\u00f2"+
		"\3\2\2\2\6\u00ff\3\2\2\2\b\u0104\3\2\2\2\n\u0106\3\2\2\2\f\u0109\3\2\2"+
		"\2\16\u010c\3\2\2\2\20\u0115\3\2\2\2\22\u0117\3\2\2\2\24\u0119\3\2\2\2"+
		"\26\u012a\3\2\2\2\30\u015b\3\2\2\2\32\u015d\3\2\2\2\34\u0164\3\2\2\2\36"+
		"\u0166\3\2\2\2 \u016d\3\2\2\2\"\u017e\3\2\2\2$\u018c\3\2\2\2&\u0194\3"+
		"\2\2\2(\u019b\3\2\2\2*\u01a3\3\2\2\2,\u01ae\3\2\2\2.\u01b0\3\2\2\2\60"+
		"\u01b8\3\2\2\2\62\u0212\3\2\2\2\64\u0214\3\2\2\2\66\u0216\3\2\2\28\u0218"+
		"\3\2\2\2:\u022b\3\2\2\2<\u022d\3\2\2\2>\u022f\3\2\2\2@\u0238\3\2\2\2B"+
		"\u0241\3\2\2\2D\u0243\3\2\2\2F\u0245\3\2\2\2H\u024d\3\2\2\2J\u0259\3\2"+
		"\2\2L\u025f\3\2\2\2N\u026c\3\2\2\2P\u026e\3\2\2\2R\u0276\3\2\2\2T\u0278"+
		"\3\2\2\2V\u027c\3\2\2\2X\u027f\3\2\2\2Z\u028b\3\2\2\2\\\u0291\3\2\2\2"+
		"^\u029b\3\2\2\2`\u02a0\3\2\2\2b\u02a5\3\2\2\2d\u02af\3\2\2\2f\u02b1\3"+
		"\2\2\2h\u030e\3\2\2\2j\u0310\3\2\2\2l\u0316\3\2\2\2n\u0318\3\2\2\2p\u0325"+
		"\3\2\2\2r\u032b\3\2\2\2t\u032d\3\2\2\2v\u0334\3\2\2\2x\u0339\3\2\2\2z"+
		"\u0349\3\2\2\2|\u034b\3\2\2\2~\u034d\3\2\2\2\u0080\u034f\3\2\2\2\u0082"+
		"\u0355\3\2\2\2\u0084\u0359\3\2\2\2\u0086\u035d\3\2\2\2\u0088\u0364\3\2"+
		"\2\2\u008a\u036a\3\2\2\2\u008c\u0376\3\2\2\2\u008e\u0378\3\2\2\2\u0090"+
		"\u037e\3\2\2\2\u0092\u039e\3\2\2\2\u0094\u03a0\3\2\2\2\u0096\u03bf\3\2"+
		"\2\2\u0098\u03c1\3\2\2\2\u009a\u03c3\3\2\2\2\u009c\u03dd\3\2\2\2\u009e"+
		"\u03df\3\2\2\2\u00a0\u03e1\3\2\2\2\u00a2\u03e7\3\2\2\2\u00a4\u03f1\3\2"+
		"\2\2\u00a6\u03f5\3\2\2\2\u00a8\u03f7\3\2\2\2\u00aa\u03fd\3\2\2\2\u00ac"+
		"\u03ff\3\2\2\2\u00ae\u0406\3\2\2\2\u00b0\u0408\3\2\2\2\u00b2\u040f\3\2"+
		"\2\2\u00b4\u0411\3\2\2\2\u00b6\u042c\3\2\2\2\u00b8\u042e\3\2\2\2\u00ba"+
		"\u0430\3\2\2\2\u00bc\u044b\3\2\2\2\u00be\u044d\3\2\2\2\u00c0\u0458\3\2"+
		"\2\2\u00c2\u045a\3\2\2\2\u00c4\u0482\3\2\2\2\u00c6\u0484\3\2\2\2\u00c8"+
		"\u0486\3\2\2\2\u00ca\u0493\3\2\2\2\u00cc\u049f\3\2\2\2\u00ce\u04a5\3\2"+
		"\2\2\u00d0\u04ab\3\2\2\2\u00d2\u04cf\3\2\2\2\u00d4\u04da\3\2\2\2\u00d6"+
		"\u04dc\3\2\2\2\u00d8\u04ef\3\2\2\2\u00da\u04fa\3\2\2\2\u00dc\u0515\3\2"+
		"\2\2\u00de\u0517\3\2\2\2\u00e0\u0524\3\2\2\2\u00e2\u052f\3\2\2\2\u00e4"+
		"\u054c\3\2\2\2\u00e6\u054e\3\2\2\2\u00e8\u0550\3\2\2\2\u00ea\u00eb\5\4"+
		"\3\2\u00eb\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00f3\5\6\4\2\u00ee\u00ef"+
		"\5\6\4\2\u00ef\u00f0\5\4\3\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\5\3\2\2\2"+
		"\u00f4\u0100\5\b\5\2\u00f5\u0100\5\16\b\2\u00f6\u0100\5\24\13\2\u00f7"+
		"\u0100\58\35\2\u00f8\u0100\5L\'\2\u00f9\u0100\5r:\2\u00fa\u0100\5\u0092"+
		"J\2\u00fb\u0100\5\u008eH\2\u00fc\u0100\5\u00b2Z\2\u00fd\u0100\5\u00c8"+
		"e\2\u00fe\u0100\5\u00dep\2\u00ff\u00f4\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff"+
		"\u00f6\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9\3\2"+
		"\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\7\3\2\2\2\u0101\u0105\7\60\2"+
		"\2\u0102\u0105\5\n\6\2\u0103\u0105\5\f\7\2\u0104\u0101\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\t\3\2\2\2\u0106\u0107\7\26\2\2\u0107"+
		"\u0108\7\31\2\2\u0108\13\3\2\2\2\u0109\u010a\7\27\2\2\u010a\u010b\7\31"+
		"\2\2\u010b\r\3\2\2\2\u010c\u010d\7\3\2\2\u010d\u010e\5\20\t\2\u010e\u010f"+
		"\7\31\2\2\u010f\17\3\2\2\2\u0110\u0116\5\22\n\2\u0111\u0112\5\22\n\2\u0112"+
		"\u0113\7\36\2\2\u0113\u0114\5\20\t\2\u0114\u0116\3\2\2\2\u0115\u0110\3"+
		"\2\2\2\u0115\u0111\3\2\2\2\u0116\21\3\2\2\2\u0117\u0118\7,\2\2\u0118\23"+
		"\3\2\2\2\u0119\u011a\5\26\f\2\u011a\25\3\2\2\2\u011b\u011c\7\4\2\2\u011c"+
		"\u011d\5 \21\2\u011d\u011e\7\31\2\2\u011e\u012b\3\2\2\2\u011f\u0120\5"+
		"\u00a2R\2\u0120\u0121\7\4\2\2\u0121\u0122\5 \21\2\u0122\u0123\7\31\2\2"+
		"\u0123\u012b\3\2\2\2\u0124\u0125\5 \21\2\u0125\u0126\7\31\2\2\u0126\u012b"+
		"\3\2\2\2\u0127\u0128\5\32\16\2\u0128\u0129\7\31\2\2\u0129\u012b\3\2\2"+
		"\2\u012a\u011b\3\2\2\2\u012a\u011f\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127"+
		"\3\2\2\2\u012b\27\3\2\2\2\u012c\u012d\7\4\2\2\u012d\u012e\5 \21\2\u012e"+
		"\u012f\7\31\2\2\u012f\u015c\3\2\2\2\u0130\u0131\5\u009eP\2\u0131\u0132"+
		"\7\4\2\2\u0132\u0133\5 \21\2\u0133\u0134\7\31\2\2\u0134\u015c\3\2\2\2"+
		"\u0135\u0136\7\16\2\2\u0136\u0137\7\4\2\2\u0137\u0138\5 \21\2\u0138\u0139"+
		"\7\31\2\2\u0139\u015c\3\2\2\2\u013a\u013b\5\u009eP\2\u013b\u013c\7\16"+
		"\2\2\u013c\u013d\7\4\2\2\u013d\u013e\5 \21\2\u013e\u013f\7\31\2\2\u013f"+
		"\u015c\3\2\2\2\u0140\u0141\7\17\2\2\u0141\u0142\5\u009eP\2\u0142\u0143"+
		"\7\16\2\2\u0143\u0144\7\4\2\2\u0144\u0145\5 \21\2\u0145\u0146\7\31\2\2"+
		"\u0146\u015c\3\2\2\2\u0147\u0148\7\17\2\2\u0148\u0149\5\u009eP\2\u0149"+
		"\u014a\7\4\2\2\u014a\u014b\5 \21\2\u014b\u014c\7\31\2\2\u014c\u015c\3"+
		"\2\2\2\u014d\u014e\7\17\2\2\u014e\u014f\7\4\2\2\u014f\u0150\5 \21\2\u0150"+
		"\u0151\7\31\2\2\u0151\u015c\3\2\2\2\u0152\u0153\7\17\2\2\u0153\u0154\7"+
		"\16\2\2\u0154\u0155\7\4\2\2\u0155\u0156\5 \21\2\u0156\u0157\7\31\2\2\u0157"+
		"\u015c\3\2\2\2\u0158\u0159\5 \21\2\u0159\u015a\7\31\2\2\u015a\u015c\3"+
		"\2\2\2\u015b\u012c\3\2\2\2\u015b\u0130\3\2\2\2\u015b\u0135\3\2\2\2\u015b"+
		"\u013a\3\2\2\2\u015b\u0140\3\2\2\2\u015b\u0147\3\2\2\2\u015b\u014d\3\2"+
		"\2\2\u015b\u0152\3\2\2\2\u015b\u0158\3\2\2\2\u015c\31\3\2\2\2\u015d\u015e"+
		"\5\34\17\2\u015e\33\3\2\2\2\u015f\u0165\5\36\20\2\u0160\u0161\5\36\20"+
		"\2\u0161\u0162\7\32\2\2\u0162\u0163\5\34\17\2\u0163\u0165\3\2\2\2\u0164"+
		"\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0165\35\3\2\2\2\u0166\u0167\5\"\22"+
		"\2\u0167\37\3\2\2\2\u0168\u016e\5\"\22\2\u0169\u016a\5\"\22\2\u016a\u016b"+
		"\7\36\2\2\u016b\u016c\5 \21\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2"+
		"\u016d\u0169\3\2\2\2\u016e!\3\2\2\2\u016f\u0170\7)\2\2\u0170\u017f\5$"+
		"\23\2\u0171\u0172\5\u00e6t\2\u0172\u0173\7\33\2\2\u0173\u0174\5\u00e8"+
		"u\2\u0174\u0175\5$\23\2\u0175\u017f\3\2\2\2\u0176\u0177\5\u00e6t\2\u0177"+
		"\u0178\7\35\2\2\u0178\u0179\5\u00e8u\2\u0179\u017a\5$\23\2\u017a\u017f"+
		"\3\2\2\2\u017b\u017c\5\u00d0i\2\u017c\u017d\5$\23\2\u017d\u017f\3\2\2"+
		"\2\u017e\u016f\3\2\2\2\u017e\u0171\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u017b"+
		"\3\2\2\2\u017f#\3\2\2\2\u0180\u0181\t\2\2\2\u0181\u018d\5\u00e4s\2\u0182"+
		"\u0183\7+\2\2\u0183\u0184\t\2\2\2\u0184\u018d\5\u00e4s\2\u0185\u0186\t"+
		"\2\2\2\u0186\u0187\7\25\2\2\u0187\u018d\5\u00e4s\2\u0188\u0189\7+\2\2"+
		"\u0189\u018a\t\2\2\2\u018a\u018b\7\25\2\2\u018b\u018d\5\u00e4s\2\u018c"+
		"\u0180\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0188\3\2"+
		"\2\2\u018d%\3\2\2\2\u018e\u018f\7\37\2\2\u018f\u0195\7 \2\2\u0190\u0191"+
		"\7\37\2\2\u0191\u0192\5(\25\2\u0192\u0193\7 \2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u018e\3\2\2\2\u0194\u0190\3\2\2\2\u0195\'\3\2\2\2\u0196\u019c\5\u00e4"+
		"s\2\u0197\u0198\5\u00e4s\2\u0198\u0199\7\36\2\2\u0199\u019a\5(\25\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u0197\3\2\2\2\u019c)\3\2\2\2"+
		"\u019d\u019e\7!\2\2\u019e\u01a4\7\"\2\2\u019f\u01a0\7!\2\2\u01a0\u01a1"+
		"\5,\27\2\u01a1\u01a2\7\"\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a4+\3\2\2\2\u01a5\u01a6\7)\2\2\u01a6\u01a7\7\34\2\2"+
		"\u01a7\u01af\5\u00e4s\2\u01a8\u01a9\7)\2\2\u01a9\u01aa\7\34\2\2\u01aa"+
		"\u01ab\5\u00e4s\2\u01ab\u01ac\7\36\2\2\u01ac\u01ad\5,\27\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a8\3\2\2\2\u01af-\3\2\2\2\u01b0"+
		"\u01b1\7#\2\2\u01b1\u01b2\5\60\31\2\u01b2\u01b3\7$\2\2\u01b3/\3\2\2\2"+
		"\u01b4\u01b9\5\62\32\2\u01b5\u01b6\5\62\32\2\u01b6\u01b7\5\60\31\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9\61\3\2\2"+
		"\2\u01ba\u0213\5:\36\2\u01bb\u01bc\5:\36\2\u01bc\u01bd\7%\2\2\u01bd\u0213"+
		"\3\2\2\2\u01be\u01bf\5:\36\2\u01bf\u01c0\7+\2\2\u01c0\u0213\3\2\2\2\u01c1"+
		"\u01c2\5:\36\2\u01c2\u01c3\7+\2\2\u01c3\u01c4\7%\2\2\u01c4\u0213\3\2\2"+
		"\2\u01c5\u0213\7)\2\2\u01c6\u01c7\7)\2\2\u01c7\u0213\7%\2\2\u01c8\u01c9"+
		"\7)\2\2\u01c9\u0213\7+\2\2\u01ca\u01cb\7)\2\2\u01cb\u01cc\7+\2\2\u01cc"+
		"\u0213\7%\2\2\u01cd\u01ce\5\64\33\2\u01ce\u01cf\7)\2\2\u01cf\u0213\3\2"+
		"\2\2\u01d0\u01d1\5\64\33\2\u01d1\u01d2\7)\2\2\u01d2\u01d3\7%\2\2\u01d3"+
		"\u0213\3\2\2\2\u01d4\u01d5\5\64\33\2\u01d5\u01d6\7)\2\2\u01d6\u01d7\7"+
		"+\2\2\u01d7\u0213\3\2\2\2\u01d8\u01d9\5\64\33\2\u01d9\u01da\7)\2\2\u01da"+
		"\u01db\7+\2\2\u01db\u01dc\7%\2\2\u01dc\u0213\3\2\2\2\u01dd\u01de\7)\2"+
		"\2\u01de\u0213\5\66\34\2\u01df\u01e0\7)\2\2\u01e0\u01e1\5\66\34\2\u01e1"+
		"\u01e2\7%\2\2\u01e2\u0213\3\2\2\2\u01e3\u01e4\7)\2\2\u01e4\u01e5\5\66"+
		"\34\2\u01e5\u01e6\7+\2\2\u01e6\u0213\3\2\2\2\u01e7\u01e8\7)\2\2\u01e8"+
		"\u01e9\5\66\34\2\u01e9\u01ea\7+\2\2\u01ea\u01eb\7%\2\2\u01eb\u0213\3\2"+
		"\2\2\u01ec\u0213\7-\2\2\u01ed\u01ee\7-\2\2\u01ee\u0213\7%\2\2\u01ef\u01f0"+
		"\7-\2\2\u01f0\u0213\7+\2\2\u01f1\u01f2\7-\2\2\u01f2\u01f3\7+\2\2\u01f3"+
		"\u0213\7%\2\2\u01f4\u0213\7.\2\2\u01f5\u01f6\7.\2\2\u01f6\u0213\7%\2\2"+
		"\u01f7\u01f8\7.\2\2\u01f8\u0213\7+\2\2\u01f9\u01fa\7.\2\2\u01fa\u01fb"+
		"\7+\2\2\u01fb\u0213\7%\2\2\u01fc\u0213\5.\30\2\u01fd\u01fe\5.\30\2\u01fe"+
		"\u01ff\7%\2\2\u01ff\u0213\3\2\2\2\u0200\u0201\5.\30\2\u0201\u0202\7+\2"+
		"\2\u0202\u0213\3\2\2\2\u0203\u0204\5.\30\2\u0204\u0205\7+\2\2\u0205\u0206"+
		"\7%\2\2\u0206\u0213\3\2\2\2\u0207\u0213\5\u00d0i\2\u0208\u0209\5\u00d0"+
		"i\2\u0209\u020a\7%\2\2\u020a\u0213\3\2\2\2\u020b\u020c\5\u00d0i\2\u020c"+
		"\u020d\7+\2\2\u020d\u0213\3\2\2\2\u020e\u020f\5\u00d0i\2\u020f\u0210\7"+
		"+\2\2\u0210\u0211\7%\2\2\u0211\u0213\3\2\2\2\u0212\u01ba\3\2\2\2\u0212"+
		"\u01bb\3\2\2\2\u0212\u01be\3\2\2\2\u0212\u01c1\3\2\2\2\u0212\u01c5\3\2"+
		"\2\2\u0212\u01c6\3\2\2\2\u0212\u01c8\3\2\2\2\u0212\u01ca\3\2\2\2\u0212"+
		"\u01cd\3\2\2\2\u0212\u01d0\3\2\2\2\u0212\u01d4\3\2\2\2\u0212\u01d8\3\2"+
		"\2\2\u0212\u01dd\3\2\2\2\u0212\u01df\3\2\2\2\u0212\u01e3\3\2\2\2\u0212"+
		"\u01e7\3\2\2\2\u0212\u01ec\3\2\2\2\u0212\u01ed\3\2\2\2\u0212\u01ef\3\2"+
		"\2\2\u0212\u01f1\3\2\2\2\u0212\u01f4\3\2\2\2\u0212\u01f5\3\2\2\2\u0212"+
		"\u01f7\3\2\2\2\u0212\u01f9\3\2\2\2\u0212\u01fc\3\2\2\2\u0212\u01fd\3\2"+
		"\2\2\u0212\u0200\3\2\2\2\u0212\u0203\3\2\2\2\u0212\u0207\3\2\2\2\u0212"+
		"\u0208\3\2\2\2\u0212\u020b\3\2\2\2\u0212\u020e\3\2\2\2\u0213\63\3\2\2"+
		"\2\u0214\u0215\7(\2\2\u0215\65\3\2\2\2\u0216\u0217\7(\2\2\u0217\67\3\2"+
		"\2\2\u0218\u0219\5:\36\2\u0219\u021a\7\31\2\2\u021a9\3\2\2\2\u021b\u021c"+
		"\7)\2\2\u021c\u022c\5H%\2\u021d\u021e\7)\2\2\u021e\u021f\7\33\2\2\u021f"+
		"\u0220\5D#\2\u0220\u0221\5H%\2\u0221\u022c\3\2\2\2\u0222\u0223\7)\2\2"+
		"\u0223\u0224\7\35\2\2\u0224\u0225\5D#\2\u0225\u0226\5H%\2\u0226\u022c"+
		"\3\2\2\2\u0227\u022c\5> \2\u0228\u0229\5\u00d0i\2\u0229\u022a\5<\37\2"+
		"\u022a\u022c\3\2\2\2\u022b\u021b\3\2\2\2\u022b\u021d\3\2\2\2\u022b\u0222"+
		"\3\2\2\2\u022b\u0227\3\2\2\2\u022b\u0228\3\2\2\2\u022c;\3\2\2\2\u022d"+
		"\u022e\5H%\2\u022e=\3\2\2\2\u022f\u0230\7)\2\2\u0230\u0231\t\3\2\2\u0231"+
		"\u0232\5@!\2\u0232?\3\2\2\2\u0233\u0239\5B\"\2\u0234\u0235\5B\"\2\u0235"+
		"\u0236\t\3\2\2\u0236\u0237\5@!\2\u0237\u0239\3\2\2\2\u0238\u0233\3\2\2"+
		"\2\u0238\u0234\3\2\2\2\u0239A\3\2\2\2\u023a\u023b\5D#\2\u023b\u023c\5"+
		"H%\2\u023c\u0242\3\2\2\2\u023d\u023e\5\u00d0i\2\u023e\u023f\5<\37\2\u023f"+
		"\u0242\3\2\2\2\u0240\u0242\7)\2\2\u0241\u023a\3\2\2\2\u0241\u023d\3\2"+
		"\2\2\u0241\u0240\3\2\2\2\u0242C\3\2\2\2\u0243\u0244\7)\2\2\u0244E\3\2"+
		"\2\2\u0245\u0246\7\33\2\2\u0246G\3\2\2\2\u0247\u0248\7#\2\2\u0248\u024e"+
		"\7$\2\2\u0249\u024a\7#\2\2\u024a\u024b\5J&\2\u024b\u024c\7$\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u0247\3\2\2\2\u024d\u0249\3\2\2\2\u024eI\3\2\2\2"+
		"\u024f\u025a\5\u00e4s\2\u0250\u0251\5\u00e4s\2\u0251\u0252\7\36\2\2\u0252"+
		"\u0253\5J&\2\u0253\u025a\3\2\2\2\u0254\u025a\5\60\31\2\u0255\u0256\5\60"+
		"\31\2\u0256\u0257\7\36\2\2\u0257\u0258\5J&\2\u0258\u025a\3\2\2\2\u0259"+
		"\u024f\3\2\2\2\u0259\u0250\3\2\2\2\u0259\u0254\3\2\2\2\u0259\u0255\3\2"+
		"\2\2\u025aK\3\2\2\2\u025b\u0260\5N(\2\u025c\u025d\5N(\2\u025d\u025e\5"+
		"L\'\2\u025e\u0260\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u025c\3\2\2\2\u0260"+
		"M\3\2\2\2\u0261\u026d\5P)\2\u0262\u0263\5P)\2\u0263\u0264\5R*\2\u0264"+
		"\u026d\3\2\2\2\u0265\u0266\5P)\2\u0266\u0267\5V,\2\u0267\u026d\3\2\2\2"+
		"\u0268\u0269\5P)\2\u0269\u026a\5R*\2\u026a\u026b\5V,\2\u026b\u026d\3\2"+
		"\2\2\u026c\u0261\3\2\2\2\u026c\u0262\3\2\2\2\u026c\u0265\3\2\2\2\u026c"+
		"\u0268\3\2\2\2\u026dO\3\2\2\2\u026e\u026f\7\5\2\2\u026f\u0270\5X-\2\u0270"+
		"\u0271\5Z.\2\u0271Q\3\2\2\2\u0272\u0277\5T+\2\u0273\u0274\5T+\2\u0274"+
		"\u0275\5R*\2\u0275\u0277\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0273\3\2\2"+
		"\2\u0277S\3\2\2\2\u0278\u0279\7\6\2\2\u0279\u027a\5X-\2\u027a\u027b\5"+
		"Z.\2\u027bU\3\2\2\2\u027c\u027d\7\7\2\2\u027d\u027e\5Z.\2\u027eW\3\2\2"+
		"\2\u027f\u0280\5^\60\2\u0280Y\3\2\2\2\u0281\u0282\7!\2\2\u0282\u028c\7"+
		"\"\2\2\u0283\u0284\7!\2\2\u0284\u0285\5\\/\2\u0285\u0286\7\"\2\2\u0286"+
		"\u028c\3\2\2\2\u0287\u028c\5L\'\2\u0288\u028c\58\35\2\u0289\u028c\5r:"+
		"\2\u028a\u028c\5\u008eH\2\u028b\u0281\3\2\2\2\u028b\u0283\3\2\2\2\u028b"+
		"\u0287\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2"+
		"\2\2\u028c[\3\2\2\2\u028d\u0292\5\6\4\2\u028e\u028f\5\6\4\2\u028f\u0290"+
		"\5\\/\2\u0290\u0292\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0292"+
		"]\3\2\2\2\u0293\u029c\5`\61\2\u0294\u0295\5`\61\2\u0295\u0296\5^\60\2"+
		"\u0296\u029c\3\2\2\2\u0297\u029c\5b\62\2\u0298\u0299\5b\62\2\u0299\u029a"+
		"\5^\60\2\u029a\u029c\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0294\3\2\2\2\u029b"+
		"\u0297\3\2\2\2\u029b\u0298\3\2\2\2\u029c_\3\2\2\2\u029d\u029e\7\'\2\2"+
		"\u029e\u02a1\5h\65\2\u029f\u02a1\5h\65\2\u02a0\u029d\3\2\2\2\u02a0\u029f"+
		"\3\2\2\2\u02a1a\3\2\2\2\u02a2\u02a6\5d\63\2\u02a3\u02a4\7\'\2\2\u02a4"+
		"\u02a6\5d\63\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6c\3\2\2\2"+
		"\u02a7\u02b0\5f\64\2\u02a8\u02a9\5f\64\2\u02a9\u02aa\t\4\2\2\u02aa\u02b0"+
		"\3\2\2\2\u02ab\u02ac\5f\64\2\u02ac\u02ad\7+\2\2\u02ad\u02ae\t\4\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02a7\3\2\2\2\u02af\u02a8\3\2\2\2\u02af\u02ab\3\2"+
		"\2\2\u02b0e\3\2\2\2\u02b1\u02b2\7#\2\2\u02b2\u02b3\5^\60\2\u02b3\u02b4"+
		"\7$\2\2\u02b4g\3\2\2\2\u02b5\u02b6\5\64\33\2\u02b6\u02b7\7)\2\2\u02b7"+
		"\u030f\3\2\2\2\u02b8\u02b9\5\64\33\2\u02b9\u02ba\7)\2\2\u02ba\u02bb\t"+
		"\4\2\2\u02bb\u030f\3\2\2\2\u02bc\u02bd\5\64\33\2\u02bd\u02be\7)\2\2\u02be"+
		"\u02bf\7+\2\2\u02bf\u030f\3\2\2\2\u02c0\u02c1\5\64\33\2\u02c1\u02c2\7"+
		")\2\2\u02c2\u02c3\7+\2\2\u02c3\u02c4\t\4\2\2\u02c4\u030f\3\2\2\2\u02c5"+
		"\u02c6\7)\2\2\u02c6\u030f\5\66\34\2\u02c7\u02c8\7)\2\2\u02c8\u02c9\5\66"+
		"\34\2\u02c9\u02ca\t\4\2\2\u02ca\u030f\3\2\2\2\u02cb\u02cc\7)\2\2\u02cc"+
		"\u02cd\5\66\34\2\u02cd\u02ce\7+\2\2\u02ce\u030f\3\2\2\2\u02cf\u02d0\7"+
		")\2\2\u02d0\u02d1\5\66\34\2\u02d1\u02d2\7+\2\2\u02d2\u02d3\t\4\2\2\u02d3"+
		"\u030f\3\2\2\2\u02d4\u030f\7-\2\2\u02d5\u02d6\7-\2\2\u02d6\u030f\t\4\2"+
		"\2\u02d7\u02d8\7-\2\2\u02d8\u030f\7+\2\2\u02d9\u02da\7-\2\2\u02da\u02db"+
		"\7+\2\2\u02db\u030f\t\4\2\2\u02dc\u030f\7.\2\2\u02dd\u02de\7.\2\2\u02de"+
		"\u030f\t\4\2\2\u02df\u02e0\7.\2\2\u02e0\u030f\7+\2\2\u02e1\u02e2\7.\2"+
		"\2\u02e2\u02e3\7+\2\2\u02e3\u030f\t\4\2\2\u02e4\u030f\5j\66\2\u02e5\u030f"+
		"\5:\36\2\u02e6\u02e7\5:\36\2\u02e7\u02e8\t\4\2\2\u02e8\u030f\3\2\2\2\u02e9"+
		"\u02ea\5:\36\2\u02ea\u02eb\7+\2\2\u02eb\u030f\3\2\2\2\u02ec\u02ed\5:\36"+
		"\2\u02ed\u02ee\7+\2\2\u02ee\u02ef\t\4\2\2\u02ef\u030f\3\2\2\2\u02f0\u030f"+
		"\5.\30\2\u02f1\u02f2\5.\30\2\u02f2\u02f3\t\4\2\2\u02f3\u030f\3\2\2\2\u02f4"+
		"\u02f5\5.\30\2\u02f5\u02f6\7+\2\2\u02f6\u030f\3\2\2\2\u02f7\u02f8\5.\30"+
		"\2\u02f8\u02f9\7+\2\2\u02f9\u02fa\t\4\2\2\u02fa\u030f\3\2\2\2\u02fb\u030f"+
		"\7)\2\2\u02fc\u02fd\7)\2\2\u02fd\u030f\t\4\2\2\u02fe\u02ff\7)\2\2\u02ff"+
		"\u030f\7+\2\2\u0300\u0301\7)\2\2\u0301\u0302\7+\2\2\u0302\u030f\t\4\2"+
		"\2\u0303\u030f\5\u00d0i\2\u0304\u0305\5\u00d0i\2\u0305\u0306\t\4\2\2\u0306"+
		"\u030f\3\2\2\2\u0307\u0308\5\u00d0i\2\u0308\u0309\7+\2\2\u0309\u030f\3"+
		"\2\2\2\u030a\u030b\5\u00d0i\2\u030b\u030c\7+\2\2\u030c\u030d\t\4\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u02b5\3\2\2\2\u030e\u02b8\3\2\2\2\u030e\u02bc\3\2"+
		"\2\2\u030e\u02c0\3\2\2\2\u030e\u02c5\3\2\2\2\u030e\u02c7\3\2\2\2\u030e"+
		"\u02cb\3\2\2\2\u030e\u02cf\3\2\2\2\u030e\u02d4\3\2\2\2\u030e\u02d5\3\2"+
		"\2\2\u030e\u02d7\3\2\2\2\u030e\u02d9\3\2\2\2\u030e\u02dc\3\2\2\2\u030e"+
		"\u02dd\3\2\2\2\u030e\u02df\3\2\2\2\u030e\u02e1\3\2\2\2\u030e\u02e4\3\2"+
		"\2\2\u030e\u02e5\3\2\2\2\u030e\u02e6\3\2\2\2\u030e\u02e9\3\2\2\2\u030e"+
		"\u02ec\3\2\2\2\u030e\u02f0\3\2\2\2\u030e\u02f1\3\2\2\2\u030e\u02f4\3\2"+
		"\2\2\u030e\u02f7\3\2\2\2\u030e\u02fb\3\2\2\2\u030e\u02fc\3\2\2\2\u030e"+
		"\u02fe\3\2\2\2\u030e\u0300\3\2\2\2\u030e\u0303\3\2\2\2\u030e\u0304\3\2"+
		"\2\2\u030e\u0307\3\2\2\2\u030e\u030a\3\2\2\2\u030fi\3\2\2\2\u0310\u0311"+
		"\5l\67\2\u0311\u0312\7\32\2\2\u0312\u0313\5n8\2\u0313k\3\2\2\2\u0314\u0317"+
		"\5\u00d0i\2\u0315\u0317\7)\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2"+
		"\u0317m\3\2\2\2\u0318\u0319\5p9\2\u0319o\3\2\2\2\u031a\u0326\5:\36\2\u031b"+
		"\u031c\5:\36\2\u031c\u031d\t\4\2\2\u031d\u0326\3\2\2\2\u031e\u031f\5:"+
		"\36\2\u031f\u0320\7+\2\2\u0320\u0326\3\2\2\2\u0321\u0322\5:\36\2\u0322"+
		"\u0323\7+\2\2\u0323\u0324\t\4\2\2\u0324\u0326\3\2\2\2\u0325\u031a\3\2"+
		"\2\2\u0325\u031b\3\2\2\2\u0325\u031e\3\2\2\2\u0325\u0321\3\2\2\2\u0326"+
		"q\3\2\2\2\u0327\u032c\5t;\2\u0328\u0329\5t;\2\u0329\u032a\5r:\2\u032a"+
		"\u032c\3\2\2\2\u032b\u0327\3\2\2\2\u032b\u0328\3\2\2\2\u032cs\3\2\2\2"+
		"\u032d\u032e\7\b\2\2\u032e\u032f\5v<\2\u032f\u0330\5\u008cG\2\u0330u\3"+
		"\2\2\2\u0331\u0335\5x=\2\u0332\u0335\5z>\2\u0333\u0335\5|?\2\u0334\u0331"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335w\3\2\2\2\u0336"+
		"\u0337\7#\2\2\u0337\u033a\7$\2\2\u0338\u033a\3\2\2\2\u0339\u0336\3\2\2"+
		"\2\u0339\u0338\3\2\2\2\u033ay\3\2\2\2\u033b\u033c\7#\2\2\u033c\u033d\5"+
		"\u0082B\2\u033d\u033e\5~@\2\u033e\u033f\5\u0084C\2\u033f\u0340\5\u0080"+
		"A\2\u0340\u0341\5\u0086D\2\u0341\u0342\7$\2\2\u0342\u034a\3\2\2\2\u0343"+
		"\u0344\5\u0082B\2\u0344\u0345\5~@\2\u0345\u0346\5\u0084C\2\u0346\u0347"+
		"\5\u0080A\2\u0347\u0348\5\u0086D\2\u0348\u034a\3\2\2\2\u0349\u033b\3\2"+
		"\2\2\u0349\u0343\3\2\2\2\u034a{\3\2\2\2\u034b\u034c\5\u0084C\2\u034c}"+
		"\3\2\2\2\u034d\u034e\7\31\2\2\u034e\177\3\2\2\2\u034f\u0350\7\31\2\2\u0350"+
		"\u0081\3\2\2\2\u0351\u0356\5 \21\2\u0352\u0353\7\4\2\2\u0353\u0356\5 "+
		"\21\2\u0354\u0356\3\2\2\2\u0355\u0351\3\2\2\2\u0355\u0352\3\2\2\2\u0355"+
		"\u0354\3\2\2\2\u0356\u0083\3\2\2\2\u0357\u035a\5^\60\2\u0358\u035a\3\2"+
		"\2\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u0085\3\2\2\2\u035b"+
		"\u035e\5\u0088E\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035c"+
		"\3\2\2\2\u035e\u0087\3\2\2\2\u035f\u0365\5\60\31\2\u0360\u0361\5\60\31"+
		"\2\u0361\u0362\7\36\2\2\u0362\u0363\5\u0088E\2\u0363\u0365\3\2\2\2\u0364"+
		"\u035f\3\2\2\2\u0364\u0360\3\2\2\2\u0365\u0089\3\2\2\2\u0366\u036b\5\6"+
		"\4\2\u0367\u0368\5\6\4\2\u0368\u0369\5\u008aF\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0366\3\2\2\2\u036a\u0367\3\2\2\2\u036b\u008b\3\2\2\2\u036c\u036d\7!"+
		"\2\2\u036d\u0377\7\"\2\2\u036e\u036f\7!\2\2\u036f\u0370\5\u008aF\2\u0370"+
		"\u0371\7\"\2\2\u0371\u0377\3\2\2\2\u0372\u0377\5L\'\2\u0373\u0377\58\35"+
		"\2\u0374\u0377\5r:\2\u0375\u0377\5\u008eH\2\u0376\u036c\3\2\2\2\u0376"+
		"\u036e\3\2\2\2\u0376\u0372\3\2\2\2\u0376\u0373\3\2\2\2\u0376\u0374\3\2"+
		"\2\2\u0376\u0375\3\2\2\2\u0377\u008d\3\2\2\2\u0378\u0379\7\t\2\2\u0379"+
		"\u037a\5\u0090I\2\u037a\u037b\7\31\2\2\u037b\u008f\3\2\2\2\u037c\u037f"+
		"\5\u00e4s\2\u037d\u037f\5\60\31\2\u037e\u037c\3\2\2\2\u037e\u037d\3\2"+
		"\2\2\u037f\u0091\3\2\2\2\u0380\u0381\5\u0094K\2\u0381\u0382\7!\2\2\u0382"+
		"\u0383\7\"\2\2\u0383\u039f\3\2\2\2\u0384\u0385\5\u0094K\2\u0385\u0386"+
		"\7!\2\2\u0386\u0387\5\u00a8U\2\u0387\u0388\7\"\2\2\u0388\u039f\3\2\2\2"+
		"\u0389\u038a\5\u009aN\2\u038a\u038b\7!\2\2\u038b\u038c\7\"\2\2\u038c\u039f"+
		"\3\2\2\2\u038d\u038e\5\u009aN\2\u038e\u038f\7!\2\2\u038f\u0390\5\u00a8"+
		"U\2\u0390\u0391\7\"\2\2\u0391\u039f\3\2\2\2\u0392\u0393\5\u00a4S\2\u0393"+
		"\u0394\7!\2\2\u0394\u0395\7\"\2\2\u0395\u039f\3\2\2\2\u0396\u0397\5\u00a4"+
		"S\2\u0397\u0398\7!\2\2\u0398\u0399\5\u00a8U\2\u0399\u039a\7\"\2\2\u039a"+
		"\u039f\3\2\2\2\u039b\u039c\5\u00a6T\2\u039c\u039d\7\31\2\2\u039d\u039f"+
		"\3\2\2\2\u039e\u0380\3\2\2\2\u039e\u0384\3\2\2\2\u039e\u0389\3\2\2\2\u039e"+
		"\u038d\3\2\2\2\u039e\u0392\3\2\2\2\u039e\u0396\3\2\2\2\u039e\u039b\3\2"+
		"\2\2\u039f\u0093\3\2\2\2\u03a0\u03a1\5\u0096L\2\u03a1\u0095\3\2\2\2\u03a2"+
		"\u03a3\7\n\2\2\u03a3\u03a4\7)\2\2\u03a4\u03a5\7#\2\2\u03a5\u03c0\7$\2"+
		"\2\u03a6\u03a7\7\n\2\2\u03a7\u03a8\7)\2\2\u03a8\u03a9\7#\2\2\u03a9\u03aa"+
		"\7$\2\2\u03aa\u03ad\7\30\2\2\u03ab\u03ae\5\u0098M\2\u03ac\u03ae\7+\2\2"+
		"\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03c0\3\2\2\2\u03af\u03b0"+
		"\7\n\2\2\u03b0\u03b1\7)\2\2\u03b1\u03b2\7#\2\2\u03b2\u03b3\5\u00acW\2"+
		"\u03b3\u03b4\7$\2\2\u03b4\u03c0\3\2\2\2\u03b5\u03b6\7\n\2\2\u03b6\u03b7"+
		"\7)\2\2\u03b7\u03b8\7#\2\2\u03b8\u03b9\5\u00acW\2\u03b9\u03ba\7$\2\2\u03ba"+
		"\u03bd\7\30\2\2\u03bb\u03be\5\u0098M\2\u03bc\u03be\7+\2\2\u03bd\u03bb"+
		"\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03a2\3\2\2\2\u03bf"+
		"\u03a6\3\2\2\2\u03bf\u03af\3\2\2\2\u03bf\u03b5\3\2\2\2\u03c0\u0097\3\2"+
		"\2\2\u03c1\u03c2\7)\2\2\u03c2\u0099\3\2\2\2\u03c3\u03c4\5\u00a2R\2\u03c4"+
		"\u03c5\5\u0096L\2\u03c5\u009b\3\2\2\2\u03c6\u03c7\5\u009eP\2\u03c7\u03c8"+
		"\5\u0096L\2\u03c8\u03de\3\2\2\2\u03c9\u03ca\7\16\2\2\u03ca\u03de\5\u0096"+
		"L\2\u03cb\u03cc\5\u009eP\2\u03cc\u03cd\7\16\2\2\u03cd\u03ce\5\u0096L\2"+
		"\u03ce\u03de\3\2\2\2\u03cf\u03d0\7\17\2\2\u03d0\u03d1\5\u009eP\2\u03d1"+
		"\u03d2\7\16\2\2\u03d2\u03d3\5\u0096L\2\u03d3\u03de\3\2\2\2\u03d4\u03d5"+
		"\7\17\2\2\u03d5\u03d6\5\u009eP\2\u03d6\u03d7\5\u0096L\2\u03d7\u03de\3"+
		"\2\2\2\u03d8\u03d9\7\17\2\2\u03d9\u03de\5\u0096L\2\u03da\u03db\7\17\2"+
		"\2\u03db\u03dc\7\16\2\2\u03dc\u03de\5\u0096L\2\u03dd\u03c6\3\2\2\2\u03dd"+
		"\u03c9\3\2\2\2\u03dd\u03cb\3\2\2\2\u03dd\u03cf\3\2\2\2\u03dd\u03d4\3\2"+
		"\2\2\u03dd\u03d8\3\2\2\2\u03dd\u03da\3\2\2\2\u03de\u009d\3\2\2\2\u03df"+
		"\u03e0\t\5\2\2\u03e0\u009f\3\2\2\2\u03e1\u03e2\t\6\2\2\u03e2\u00a1\3\2"+
		"\2\2\u03e3\u03e8\5\u00a0Q\2\u03e4\u03e5\5\u00a0Q\2\u03e5\u03e6\5\u00a2"+
		"R\2\u03e6\u03e8\3\2\2\2\u03e7\u03e3\3\2\2\2\u03e7\u03e4\3\2\2\2\u03e8"+
		"\u00a3\3\2\2\2\u03e9\u03ea\7)\2\2\u03ea\u03eb\7#\2\2\u03eb\u03f2\7$\2"+
		"\2\u03ec\u03ed\7)\2\2\u03ed\u03ee\7#\2\2\u03ee\u03ef\5\u00acW\2\u03ef"+
		"\u03f0\7$\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03e9\3\2\2\2\u03f1\u03ec\3\2"+
		"\2\2\u03f2\u00a5\3\2\2\2\u03f3\u03f6\5\u0094K\2\u03f4\u03f6\5\u009aN\2"+
		"\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2\2\2\u03f6\u00a7\3\2\2\2\u03f7\u03f8"+
		"\5\u00aaV\2\u03f8\u00a9\3\2\2\2\u03f9\u03fe\5\6\4\2\u03fa\u03fb\5\6\4"+
		"\2\u03fb\u03fc\5\u00aaV\2\u03fc\u03fe\3\2\2\2\u03fd\u03f9\3\2\2\2\u03fd"+
		"\u03fa\3\2\2\2\u03fe\u00ab\3\2\2\2\u03ff\u0400\5\u00aeX\2\u0400\u00ad"+
		"\3\2\2\2\u0401\u0407\5\u00b0Y\2\u0402\u0403\5\u00b0Y\2\u0403\u0404\7\36"+
		"\2\2\u0404\u0405\5\u00aeX\2\u0405\u0407\3\2\2\2\u0406\u0401\3\2\2\2\u0406"+
		"\u0402\3\2\2\2\u0407\u00af\3\2\2\2\u0408\u0409\7)\2\2\u0409\u040a\7+\2"+
		"\2\u040a\u00b1\3\2\2\2\u040b\u0410\5\u00b4[\2\u040c\u0410\5\u00ba^\2\u040d"+
		"\u0410\5\u00c0a\2\u040e\u0410\5\u00ccg\2\u040f\u040b\3\2\2\2\u040f\u040c"+
		"\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410\u00b3\3\2\2\2\u0411"+
		"\u0412\5\u00b6\\\2\u0412\u00b5\3\2\2\2\u0413\u0414\7\20\2\2\u0414\u0415"+
		"\7)\2\2\u0415\u0416\7!\2\2\u0416\u042d\7\"\2\2\u0417\u0418\7\20\2\2\u0418"+
		"\u0419\7)\2\2\u0419\u041a\7!\2\2\u041a\u041b\5\u00b8]\2\u041b\u041c\7"+
		"\"\2\2\u041c\u042d\3\2\2\2\u041d\u041e\7\20\2\2\u041e\u041f\7)\2\2\u041f"+
		"\u0420\7\22\2\2\u0420\u0421\5D#\2\u0421\u0422\7!\2\2\u0422\u0423\7\"\2"+
		"\2\u0423\u042d\3\2\2\2\u0424\u0425\7\20\2\2\u0425\u0426\7)\2\2\u0426\u0427"+
		"\7\22\2\2\u0427\u0428\5D#\2\u0428\u0429\7!\2\2\u0429\u042a\5\u00b8]\2"+
		"\u042a\u042b\7\"\2\2\u042b\u042d\3\2\2\2\u042c\u0413\3\2\2\2\u042c\u0417"+
		"\3\2\2\2\u042c\u041d\3\2\2\2\u042c\u0424\3\2\2\2\u042d\u00b7\3\2\2\2\u042e"+
		"\u042f\5\u00aaV\2\u042f\u00b9\3\2\2\2\u0430\u0431\5\u00bc_\2\u0431\u00bb"+
		"\3\2\2\2\u0432\u0433\7\21\2\2\u0433\u0434\7)\2\2\u0434\u0435\7!\2\2\u0435"+
		"\u044c\7\"\2\2\u0436\u0437\7\21\2\2\u0437\u0438\7)\2\2\u0438\u0439\7!"+
		"\2\2\u0439\u043a\5\u00be`\2\u043a\u043b\7\"\2\2\u043b\u044c\3\2\2\2\u043c"+
		"\u043d\7\21\2\2\u043d\u043e\7)\2\2\u043e\u043f\7\22\2\2\u043f\u0440\5"+
		"D#\2\u0440\u0441\7!\2\2\u0441\u0442\7\"\2\2\u0442\u044c\3\2\2\2\u0443"+
		"\u0444\7\21\2\2\u0444\u0445\7)\2\2\u0445\u0446\7\22\2\2\u0446\u0447\5"+
		"D#\2\u0447\u0448\7!\2\2\u0448\u0449\5\u00be`\2\u0449\u044a\7\"\2\2\u044a"+
		"\u044c\3\2\2\2\u044b\u0432\3\2\2\2\u044b\u0436\3\2\2\2\u044b\u043c\3\2"+
		"\2\2\u044b\u0443\3\2\2\2\u044c\u00bd\3\2\2\2\u044d\u044e\5\u00aaV\2\u044e"+
		"\u00bf\3\2\2\2\u044f\u0450\5\u00c4c\2\u0450\u0451\7!\2\2\u0451\u0452\7"+
		"\"\2\2\u0452\u0459\3\2\2\2\u0453\u0454\5\u00c4c\2\u0454\u0455\7!\2\2\u0455"+
		"\u0456\5\u00c2b\2\u0456\u0457\7\"\2\2\u0457\u0459\3\2\2\2\u0458\u044f"+
		"\3\2\2\2\u0458\u0453\3\2\2\2\u0459\u00c1\3\2\2\2\u045a\u045b\5\u00aaV"+
		"\2\u045b\u00c3\3\2\2\2\u045c\u045d\7\23\2\2\u045d\u0483\7)\2\2\u045e\u045f"+
		"\7\23\2\2\u045f\u0460\7)\2\2\u0460\u0461\7\22\2\2\u0461\u0483\5D#\2\u0462"+
		"\u0463\7\23\2\2\u0463\u0464\7)\2\2\u0464\u0465\7\24\2\2\u0465\u0483\5"+
		"D#\2\u0466\u0467\7\23\2\2\u0467\u0468\7)\2\2\u0468\u0469\7\22\2\2\u0469"+
		"\u046a\5D#\2\u046a\u046b\7\24\2\2\u046b\u046c\5\u00c6d\2\u046c\u0483\3"+
		"\2\2\2\u046d\u046e\7\17\2\2\u046e\u046f\7\23\2\2\u046f\u0483\7)\2\2\u0470"+
		"\u0471\7\17\2\2\u0471\u0472\7\23\2\2\u0472\u0473\7)\2\2\u0473\u0474\7"+
		"\22\2\2\u0474\u0483\5D#\2\u0475\u0476\7\17\2\2\u0476\u0477\7\23\2\2\u0477"+
		"\u0478\7)\2\2\u0478\u0479\7\24\2\2\u0479\u0483\5D#\2\u047a\u047b\7\17"+
		"\2\2\u047b\u047c\7\23\2\2\u047c\u047d\7)\2\2\u047d\u047e\7\22\2\2\u047e"+
		"\u047f\5D#\2\u047f\u0480\7\24\2\2\u0480\u0481\5\u00c6d\2\u0481\u0483\3"+
		"\2\2\2\u0482\u045c\3\2\2\2\u0482\u045e\3\2\2\2\u0482\u0462\3\2\2\2\u0482"+
		"\u0466\3\2\2\2\u0482\u046d\3\2\2\2\u0482\u0470\3\2\2\2\u0482\u0475\3\2"+
		"\2\2\u0482\u047a\3\2\2\2\u0483\u00c5\3\2\2\2\u0484\u0485\7)\2\2\u0485"+
		"\u00c7\3\2\2\2\u0486\u0487\5\u00caf\2\u0487\u0488\7\31\2\2\u0488\u00c9"+
		"\3\2\2\2\u0489\u048a\7#\2\2\u048a\u048b\5\u00ccg\2\u048b\u048c\7$\2\2"+
		"\u048c\u048d\t\3\2\2\u048d\u048e\5@!\2\u048e\u0494\3\2\2\2\u048f\u0490"+
		"\7#\2\2\u0490\u0491\5\u00ccg\2\u0491\u0492\7$\2\2\u0492\u0494\3\2\2\2"+
		"\u0493\u0489\3\2\2\2\u0493\u048f\3\2\2\2\u0494\u00cb\3\2\2\2\u0495\u0496"+
		"\7\25\2\2\u0496\u0497\7\23\2\2\u0497\u0498\7!\2\2\u0498\u04a0\7\"\2\2"+
		"\u0499\u049a\7\25\2\2\u049a\u049b\7\23\2\2\u049b\u049c\7!\2\2\u049c\u049d"+
		"\5\u00ceh\2\u049d\u049e\7\"\2\2\u049e\u04a0\3\2\2\2\u049f\u0495\3\2\2"+
		"\2\u049f\u0499\3\2\2\2\u04a0\u00cd\3\2\2\2\u04a1\u04a6\5\6\4\2\u04a2\u04a3"+
		"\5\6\4\2\u04a3\u04a4\5\u00ceh\2\u04a4\u04a6\3\2\2\2\u04a5\u04a1\3\2\2"+
		"\2\u04a5\u04a2\3\2\2\2\u04a6\u00cf\3\2\2\2\u04a7\u04ac\5\u00d2j\2\u04a8"+
		"\u04a9\5\u00d2j\2\u04a9\u04aa\5\u00d0i\2\u04aa\u04ac\3\2\2\2\u04ab\u04a7"+
		"\3\2\2\2\u04ab\u04a8\3\2\2\2\u04ac\u00d1\3\2\2\2\u04ad\u04d0\7)\2\2\u04ae"+
		"\u04af\7)\2\2\u04af\u04d0\7\33\2\2\u04b0\u04b1\7)\2\2\u04b1\u04d0\5\u00d4"+
		"k\2\u04b2\u04b3\7)\2\2\u04b3\u04b4\5\u00d4k\2\u04b4\u04b5\7\33\2\2\u04b5"+
		"\u04d0\3\2\2\2\u04b6\u04b7\5\64\33\2\u04b7\u04b8\7)\2\2\u04b8\u04d0\3"+
		"\2\2\2\u04b9\u04ba\7)\2\2\u04ba\u04d0\7\33\2\2\u04bb\u04bc\5\64\33\2\u04bc"+
		"\u04bd\7)\2\2\u04bd\u04be\5\u00d4k\2\u04be\u04d0\3\2\2\2\u04bf\u04c0\7"+
		")\2\2\u04c0\u04c1\5\u00d4k\2\u04c1\u04c2\7\33\2\2\u04c2\u04d0\3\2\2\2"+
		"\u04c3\u04c4\7)\2\2\u04c4\u04d0\5\66\34\2\u04c5\u04c6\7)\2\2\u04c6\u04d0"+
		"\7\33\2\2\u04c7\u04c8\7)\2\2\u04c8\u04c9\5\u00d4k\2\u04c9\u04ca\5\66\34"+
		"\2\u04ca\u04d0\3\2\2\2\u04cb\u04cc\7)\2\2\u04cc\u04cd\5\u00d4k\2\u04cd"+
		"\u04ce\7\33\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04ad\3\2\2\2\u04cf\u04ae\3"+
		"\2\2\2\u04cf\u04b0\3\2\2\2\u04cf\u04b2\3\2\2\2\u04cf\u04b6\3\2\2\2\u04cf"+
		"\u04b9\3\2\2\2\u04cf\u04bb\3\2\2\2\u04cf\u04bf\3\2\2\2\u04cf\u04c3\3\2"+
		"\2\2\u04cf\u04c5\3\2\2\2\u04cf\u04c7\3\2\2\2\u04cf\u04cb\3\2\2\2\u04d0"+
		"\u00d3\3\2\2\2\u04d1\u04d2\7\37\2\2\u04d2\u04d3\5\u00d6l\2\u04d3\u04d4"+
		"\7 \2\2\u04d4\u04db\3\2\2\2\u04d5\u04d6\7\37\2\2\u04d6\u04d7\5\u00d6l"+
		"\2\u04d7\u04d8\7 \2\2\u04d8\u04d9\5\u00d4k\2\u04d9\u04db\3\2\2\2\u04da"+
		"\u04d1\3\2\2\2\u04da\u04d5\3\2\2\2\u04db\u00d5\3\2\2\2\u04dc\u04dd\5\60"+
		"\31\2\u04dd\u00d7\3\2\2\2\u04de\u04df\7#\2\2\u04df\u04e0\5\u00dan\2\u04e0"+
		"\u04e1\7$\2\2\u04e1\u04f0\3\2\2\2\u04e2\u04e3\7#\2\2\u04e3\u04e4\5\u00da"+
		"n\2\u04e4\u04e5\7$\2\2\u04e5\u04e6\7#\2\2\u04e6\u04e7\7$\2\2\u04e7\u04f0"+
		"\3\2\2\2\u04e8\u04e9\7#\2\2\u04e9\u04ea\5\u00dan\2\u04ea\u04eb\7$\2\2"+
		"\u04eb\u04ec\7#\2\2\u04ec\u04ed\5\60\31\2\u04ed\u04ee\7$\2\2\u04ee\u04f0"+
		"\3\2\2\2\u04ef\u04de\3\2\2\2\u04ef\u04e2\3\2\2\2\u04ef\u04e8\3\2\2\2\u04f0"+
		"\u00d9\3\2\2\2\u04f1\u04f2\5\u00dco\2\u04f2\u04f3\7!\2\2\u04f3\u04f4\7"+
		"\"\2\2\u04f4\u04fb\3\2\2\2\u04f5\u04f6\5\u00dco\2\u04f6\u04f7\7!\2\2\u04f7"+
		"\u04f8\5\u00a8U\2\u04f8\u04f9\7\"\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f1"+
		"\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fb\u00db\3\2\2\2\u04fc\u04fd\7\n\2\2\u04fd"+
		"\u04fe\7#\2\2\u04fe\u0516\7$\2\2\u04ff\u0500\7\n\2\2\u0500\u0501\7#\2"+
		"\2\u0501\u0502\7$\2\2\u0502\u0505\7\30\2\2\u0503\u0506\5\u0098M\2\u0504"+
		"\u0506\7+\2\2\u0505\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0506\u0516\3\2"+
		"\2\2\u0507\u0508\7\n\2\2\u0508\u0509\7#\2\2\u0509\u050a\5\u00acW\2\u050a"+
		"\u050b\7$\2\2\u050b\u0516\3\2\2\2\u050c\u050d\7\n\2\2\u050d\u050e\7#\2"+
		"\2\u050e\u050f\5\u00acW\2\u050f\u0510\7$\2\2\u0510\u0513\7\30\2\2\u0511"+
		"\u0514\5\u0098M\2\u0512\u0514\7+\2\2\u0513\u0511\3\2\2\2\u0513\u0512\3"+
		"\2\2\2\u0514\u0516\3\2\2\2\u0515\u04fc\3\2\2\2\u0515\u04ff\3\2\2\2\u0515"+
		"\u0507\3\2\2\2\u0515\u050c\3\2\2\2\u0516\u00dd\3\2\2\2\u0517\u0518\5\u00e0"+
		"q\2\u0518\u0519\7\31\2\2\u0519\u00df\3\2\2\2\u051a\u051b\7#\2\2\u051b"+
		"\u051c\5\u00e2r\2\u051c\u051d\7$\2\2\u051d\u051e\t\3\2\2\u051e\u051f\5"+
		"@!\2\u051f\u0525\3\2\2\2\u0520\u0521\7#\2\2\u0521\u0522\5\u00e2r\2\u0522"+
		"\u0523\7$\2\2\u0523\u0525\3\2\2\2\u0524\u051a\3\2\2\2\u0524\u0520\3\2"+
		"\2\2\u0525\u00e1\3\2\2\2\u0526\u0527\7\25\2\2\u0527\u0528\7)\2\2\u0528"+
		"\u0530\5H%\2\u0529\u052a\7\25\2\2\u052a\u052b\7)\2\2\u052b\u052c\5H%\2"+
		"\u052c\u052d\t\3\2\2\u052d\u052e\5@!\2\u052e\u0530\3\2\2\2\u052f\u0526"+
		"\3\2\2\2\u052f\u0529\3\2\2\2\u0530\u00e3\3\2\2\2\u0531\u054d\7)\2\2\u0532"+
		"\u0533\7)\2\2\u0533\u054d\7+\2\2\u0534\u054d\7-\2\2\u0535\u0536\7-\2\2"+
		"\u0536\u054d\7+\2\2\u0537\u054d\7.\2\2\u0538\u0539\7.\2\2\u0539\u054d"+
		"\7+\2\2\u053a\u054d\7,\2\2\u053b\u054d\5&\24\2\u053c\u054d\5*\26\2\u053d"+
		"\u054d\5\60\31\2\u053e\u054d\5:\36\2\u053f\u0540\5\u00e6t\2\u0540\u0541"+
		"\7\33\2\2\u0541\u0542\5\u00e8u\2\u0542\u054d\3\2\2\2\u0543\u0544\5\u00e6"+
		"t\2\u0544\u0545\7\35\2\2\u0545\u0546\5\u00e8u\2\u0546\u054d\3\2\2\2\u0547"+
		"\u054d\5\u00d0i\2\u0548\u054d\5\u00d8m\2\u0549\u054d\5\u00caf\2\u054a"+
		"\u054d\5\u00ccg\2\u054b\u054d\5\u00e0q\2\u054c\u0531\3\2\2\2\u054c\u0532"+
		"\3\2\2\2\u054c\u0534\3\2\2\2\u054c\u0535\3\2\2\2\u054c\u0537\3\2\2\2\u054c"+
		"\u0538\3\2\2\2\u054c\u053a\3\2\2\2\u054c\u053b\3\2\2\2\u054c\u053c\3\2"+
		"\2\2\u054c\u053d\3\2\2\2\u054c\u053e\3\2\2\2\u054c\u053f\3\2\2\2\u054c"+
		"\u0543\3\2\2\2\u054c\u0547\3\2\2\2\u054c\u0548\3\2\2\2\u054c\u0549\3\2"+
		"\2\2\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d\u00e5\3\2\2\2\u054e"+
		"\u054f\7)\2\2\u054f\u00e7\3\2\2\2\u0550\u0551\7)\2\2\u0551\u00e9\3\2\2"+
		"\2K\u00f2\u00ff\u0104\u0115\u012a\u015b\u0164\u016d\u017e\u018c\u0194"+
		"\u019b\u01a3\u01ae\u01b8\u0212\u022b\u0238\u0241\u024d\u0259\u025f\u026c"+
		"\u0276\u028b\u0291\u029b\u02a0\u02a5\u02af\u030e\u0316\u0325\u032b\u0334"+
		"\u0339\u0349\u0355\u0359\u035d\u0364\u036a\u0376\u037e\u039e\u03ad\u03bd"+
		"\u03bf\u03dd\u03e7\u03f1\u03f5\u03fd\u0406\u040f\u042c\u044b\u0458\u0482"+
		"\u0493\u049f\u04a5\u04ab\u04cf\u04da\u04ef\u04fa\u0505\u0513\u0515\u0524"+
		"\u052f\u054c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}