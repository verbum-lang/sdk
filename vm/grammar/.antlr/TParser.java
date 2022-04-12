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
		RULE_arrayAccessElements = 99, RULE_arrayAccessElementsItems = 100, RULE_accessBlockAr = 101, 
		RULE_arrayIndexAccess = 102, RULE_anonymousFunction = 103, RULE_anFnItems = 104, 
		RULE_functionsModesFn = 105, RULE_generalValue = 106, RULE_objIdentifierA = 107, 
		RULE_objIdentifierB = 108;
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
			"classDefination", "classCodeBlock", "classModes", "identifierC", "arrayAccessElements", 
			"arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "anonymousFunction", 
			"anFnItems", "functionsModesFn", "generalValue", "objIdentifierA", "objIdentifierB"
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
			setState(218);
			fileContent();
			setState(219);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				sentence();
				setState(223);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
			setState(244);
			match(Break);
			setState(245);
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
			setState(247);
			match(Next);
			setState(248);
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
			setState(250);
			match(Use);
			setState(251);
			useValue();
			setState(252);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				useString();
				setState(256);
				match(Separator);
				setState(257);
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
			setState(261);
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
			setState(263);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(Var);
				setState(266);
				variableMembers();
				setState(267);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				methodVisibility();
				setState(270);
				match(Var);
				setState(271);
				variableMembers();
				setState(272);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				variableMembers();
				setState(275);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				variableMultipleAssignments();
				setState(278);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(Var);
				setState(283);
				variableMembers();
				setState(284);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				methodPerm();
				setState(287);
				match(Var);
				setState(288);
				variableMembers();
				setState(289);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(Static);
				setState(292);
				match(Var);
				setState(293);
				variableMembers();
				setState(294);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				methodPerm();
				setState(297);
				match(Static);
				setState(298);
				match(Var);
				setState(299);
				variableMembers();
				setState(300);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(Final);
				setState(303);
				methodPerm();
				setState(304);
				match(Static);
				setState(305);
				match(Var);
				setState(306);
				variableMembers();
				setState(307);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(Final);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(Final);
				setState(316);
				match(Var);
				setState(317);
				variableMembers();
				setState(318);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				match(Final);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(326);
				variableMembers();
				setState(327);
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
			setState(331);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				variableDefinitionMA();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				variableDefinitionMA();
				setState(335);
				match(Attr);
				setState(336);
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
			setState(340);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				variableDefinition();
				setState(344);
				match(Separator);
				setState(345);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(Identifier);
				setState(350);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				objIdentifierA();
				setState(352);
				match(Point);
				setState(353);
				objIdentifierB();
				setState(354);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				objIdentifierA();
				setState(357);
				match(TwoTwoPoint);
				setState(358);
				objIdentifierB();
				setState(359);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				arrayAccessElements();
				setState(362);
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
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(TypeSpec);
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				match(New);
				setState(373);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				match(TypeSpec);
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
				match(New);
				setState(377);
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(OpenArIndex);
				setState(381);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(OpenArIndex);
				setState(383);
				indexArrayElements();
				setState(384);
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
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				generalValue();
				setState(390);
				match(Separator);
				setState(391);
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
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(OpenBlock);
				setState(396);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(OpenBlock);
				setState(398);
				associativeArrayElements();
				setState(399);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(Identifier);
				setState(404);
				match(TwoPoint);
				setState(405);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(Identifier);
				setState(407);
				match(TwoPoint);
				setState(408);
				generalValue();
				setState(409);
				match(Separator);
				setState(410);
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
			setState(414);
			match(OpenOp);
			setState(415);
			operationElements();
			setState(416);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				operationValue();
				setState(420);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				functionCall();
				setState(426);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				functionCall();
				setState(429);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				functionCall();
				setState(432);
				match(TypeSpec);
				setState(433);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(Identifier);
				setState(437);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				match(Identifier);
				setState(439);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(Identifier);
				setState(441);
				match(TypeSpec);
				setState(442);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
				firstIncDec();
				setState(444);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(446);
				firstIncDec();
				setState(447);
				match(Identifier);
				setState(448);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(450);
				firstIncDec();
				setState(451);
				match(Identifier);
				setState(452);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(454);
				firstIncDec();
				setState(455);
				match(Identifier);
				setState(456);
				match(TypeSpec);
				setState(457);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(459);
				match(Identifier);
				setState(460);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(461);
				match(Identifier);
				setState(462);
				lastIncDec();
				setState(463);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(465);
				match(Identifier);
				setState(466);
				lastIncDec();
				setState(467);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(469);
				match(Identifier);
				setState(470);
				lastIncDec();
				setState(471);
				match(TypeSpec);
				setState(472);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(474);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(475);
				match(Integer);
				setState(476);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(477);
				match(Integer);
				setState(478);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(479);
				match(Integer);
				setState(480);
				match(TypeSpec);
				setState(481);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(482);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(483);
				match(Float);
				setState(484);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(485);
				match(Float);
				setState(486);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(487);
				match(Float);
				setState(488);
				match(TypeSpec);
				setState(489);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(490);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(491);
				operationBlock();
				setState(492);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(494);
				operationBlock();
				setState(495);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(497);
				operationBlock();
				setState(498);
				match(TypeSpec);
				setState(499);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(501);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(502);
				arrayAccessElements();
				setState(503);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(505);
				arrayAccessElements();
				setState(506);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(508);
				arrayAccessElements();
				setState(509);
				match(TypeSpec);
				setState(510);
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
			setState(514);
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
			setState(516);
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
			setState(518);
			functionCall();
			setState(519);
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
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(Identifier);
				setState(522);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(Identifier);
				setState(524);
				match(Point);
				setState(525);
				identifierB();
				setState(526);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(Identifier);
				setState(529);
				match(TwoTwoPoint);
				setState(530);
				identifierB();
				setState(531);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				arrayAccessElements();
				setState(535);
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
			setState(539);
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
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public MethodCascadingModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCascadingModes; }
	}

	public final MethodCascadingModesContext methodCascadingModes() throws RecognitionException {
		MethodCascadingModesContext _localctx = new MethodCascadingModesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodCascadingModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(Identifier);
			setState(542);
			match(Point);
			setState(543);
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
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public FunctionCallCascadingContext functionCallCascading() {
			return getRuleContext(FunctionCallCascadingContext.class,0);
		}
		public FunctionCallCascadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallCascading; }
	}

	public final FunctionCallCascadingContext functionCallCascading() throws RecognitionException {
		FunctionCallCascadingContext _localctx = new FunctionCallCascadingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionCallCascading);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				functionCallCascadingItem();
				setState(547);
				match(Point);
				setState(548);
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
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public FunctionCallCascadingItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallCascadingItem; }
	}

	public final FunctionCallCascadingItemContext functionCallCascadingItem() throws RecognitionException {
		FunctionCallCascadingItemContext _localctx = new FunctionCallCascadingItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionCallCascadingItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(Identifier);
			setState(553);
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
			setState(555);
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
			setState(557);
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
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(OpenOp);
				setState(560);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(OpenOp);
				setState(562);
				functionCallParamElements();
				setState(563);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				generalValue();
				setState(569);
				match(Separator);
				setState(570);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				operationElements();
				setState(574);
				match(Separator);
				setState(575);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				conditionalExpressionStructBlock();
				setState(581);
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				ifElementUnique();
				setState(587);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				ifElementUnique();
				setState(590);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				ifElementUnique();
				setState(593);
				elifElements();
				setState(594);
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
			setState(598);
			match(If);
			setState(599);
			conditionalExpressionItems();
			setState(600);
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
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				elifElementUnique();
				setState(604);
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
			setState(608);
			match(Elif);
			setState(609);
			conditionalExpressionItems();
			setState(610);
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
			setState(612);
			match(Else);
			setState(613);
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
			setState(615);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(OpenBlock);
				setState(618);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(OpenBlock);
				setState(620);
				conditionalBlockElsItems();
				setState(621);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(626);
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
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				sentence();
				setState(631);
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
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				conditionExpValue();
				setState(637);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				conditionExpBlock();
				setState(641);
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
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(Not);
				setState(646);
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
				setState(647);
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
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(Not);
				setState(652);
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
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				conditionExpBlockItem();
				setState(657);
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
				setState(659);
				conditionExpBlockItem();
				setState(660);
				match(TypeSpec);
				setState(661);
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
			setState(665);
			match(OpenOp);
			setState(666);
			conditionalExpressionElements();
			setState(667);
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
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				firstIncDec();
				setState(670);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				firstIncDec();
				setState(673);
				match(Identifier);
				setState(674);
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
				setState(676);
				firstIncDec();
				setState(677);
				match(Identifier);
				setState(678);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				firstIncDec();
				setState(681);
				match(Identifier);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				match(Identifier);
				setState(686);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(687);
				match(Identifier);
				setState(688);
				lastIncDec();
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(691);
				match(Identifier);
				setState(692);
				lastIncDec();
				setState(693);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(695);
				match(Identifier);
				setState(696);
				lastIncDec();
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(700);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(701);
				match(Integer);
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(703);
				match(Integer);
				setState(704);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(705);
				match(Integer);
				setState(706);
				match(TypeSpec);
				setState(707);
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
				setState(708);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(709);
				match(Float);
				setState(710);
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
				setState(711);
				match(Float);
				setState(712);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(713);
				match(Float);
				setState(714);
				match(TypeSpec);
				setState(715);
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
				setState(716);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(717);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(718);
				functionCall();
				setState(719);
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
				setState(721);
				functionCall();
				setState(722);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(724);
				functionCall();
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
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(728);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(729);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(732);
				operationBlock();
				setState(733);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(735);
				operationBlock();
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
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(739);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(740);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(742);
				match(Identifier);
				setState(743);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(744);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(747);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(748);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(751);
				arrayAccessElements();
				setState(752);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(754);
				arrayAccessElements();
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
			}
		}
		catch (RecognitionException re) {
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
			setState(760);
			identifierAttrFn();
			setState(761);
			match(Attr);
			setState(762);
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
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
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
			setState(768);
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
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				functionCall();
				setState(775);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(777);
				functionCall();
				setState(778);
				match(TypeSpec);
				setState(779);
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
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				loopExpressionItems();
				setState(785);
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
			setState(789);
			match(For);
			setState(790);
			loopExpression();
			setState(791);
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
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
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
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(OpenOp);
				setState(799);
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
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(OpenOp);
				setState(804);
				loopOneMembers();
				setState(805);
				endOne();
				setState(806);
				loopTwoMembers();
				setState(807);
				endTwo();
				setState(808);
				loopThreeMembers();
				setState(809);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				loopOneMembers();
				setState(812);
				endOne();
				setState(813);
				loopTwoMembers();
				setState(814);
				endTwo();
				setState(815);
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
			setState(819);
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
			setState(821);
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
			setState(823);
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
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				match(Var);
				setState(827);
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
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
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
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
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
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				operationElements();
				setState(841);
				match(Separator);
				setState(842);
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
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				sentence();
				setState(848);
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
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(OpenBlock);
				setState(853);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(OpenBlock);
				setState(855);
				loopBlockElements();
				setState(856);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(861);
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
			setState(864);
			match(Ret);
			setState(865);
			retValues();
			setState(866);
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
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
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
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				functionsModes();
				setState(873);
				match(OpenBlock);
				setState(874);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				functionsModes();
				setState(877);
				match(OpenBlock);
				setState(878);
				functionCodeBlock();
				setState(879);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				functionMethodsModes();
				setState(882);
				match(OpenBlock);
				setState(883);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				functionMethodsModes();
				setState(886);
				match(OpenBlock);
				setState(887);
				functionCodeBlock();
				setState(888);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(890);
				constructClassMethod();
				setState(891);
				match(OpenBlock);
				setState(892);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(894);
				constructClassMethod();
				setState(895);
				match(OpenBlock);
				setState(896);
				functionCodeBlock();
				setState(897);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(899);
				interfaceMethod();
				setState(900);
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
			setState(904);
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
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(Function);
				setState(907);
				match(Identifier);
				setState(908);
				match(OpenOp);
				setState(909);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				match(Function);
				setState(911);
				match(Identifier);
				setState(912);
				match(OpenOp);
				setState(913);
				match(CloseOp);
				setState(914);
				match(ArrowRight);
				setState(917);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(915);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(916);
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
				setState(919);
				match(Function);
				setState(920);
				match(Identifier);
				setState(921);
				match(OpenOp);
				setState(922);
				functionParams();
				setState(923);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(Function);
				setState(926);
				match(Identifier);
				setState(927);
				match(OpenOp);
				setState(928);
				functionParams();
				setState(929);
				match(CloseOp);
				setState(930);
				match(ArrowRight);
				setState(933);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(931);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(932);
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
			setState(937);
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
			setState(939);
			methodVisibility();
			setState(940);
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
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				methodPerm();
				setState(943);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(Static);
				setState(946);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				methodPerm();
				setState(948);
				match(Static);
				setState(949);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(951);
				match(Final);
				setState(952);
				methodPerm();
				setState(953);
				match(Static);
				setState(954);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(956);
				match(Final);
				setState(957);
				methodPerm();
				setState(958);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(960);
				match(Final);
				setState(961);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(962);
				match(Final);
				setState(963);
				match(Static);
				setState(964);
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
			setState(967);
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
			setState(969);
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
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				visibilityItems();
				setState(973);
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
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(Identifier);
				setState(978);
				match(OpenOp);
				setState(979);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(Identifier);
				setState(981);
				match(OpenOp);
				setState(982);
				functionParams();
				setState(983);
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
			setState(989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
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
				setState(988);
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
			setState(991);
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
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				sentence();
				setState(995);
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
			setState(999);
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
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				functionParamElements();
				setState(1003);
				match(Separator);
				setState(1004);
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
			setState(1008);
			match(Identifier);
			setState(1009);
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
		public OopGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oopGeneral; }
	}

	public final OopGeneralContext oopGeneral() throws RecognitionException {
		OopGeneralContext _localctx = new OopGeneralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_oopGeneral);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				classDefination();
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
			setState(1016);
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
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(Interface);
				setState(1019);
				match(Identifier);
				setState(1020);
				match(OpenBlock);
				setState(1021);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(Interface);
				setState(1023);
				match(Identifier);
				setState(1024);
				match(OpenBlock);
				setState(1025);
				interfaceCodeBlock();
				setState(1026);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1028);
				match(Interface);
				setState(1029);
				match(Identifier);
				setState(1030);
				match(Extends);
				setState(1031);
				identifierB();
				setState(1032);
				match(OpenBlock);
				setState(1033);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1035);
				match(Interface);
				setState(1036);
				match(Identifier);
				setState(1037);
				match(Extends);
				setState(1038);
				identifierB();
				setState(1039);
				match(OpenBlock);
				setState(1040);
				interfaceCodeBlock();
				setState(1041);
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
			setState(1045);
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
			setState(1047);
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
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(Abstract);
				setState(1050);
				match(Identifier);
				setState(1051);
				match(OpenBlock);
				setState(1052);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(Abstract);
				setState(1054);
				match(Identifier);
				setState(1055);
				match(OpenBlock);
				setState(1056);
				abstractCodeBlock();
				setState(1057);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				match(Abstract);
				setState(1060);
				match(Identifier);
				setState(1061);
				match(Extends);
				setState(1062);
				identifierB();
				setState(1063);
				match(OpenBlock);
				setState(1064);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				match(Abstract);
				setState(1067);
				match(Identifier);
				setState(1068);
				match(Extends);
				setState(1069);
				identifierB();
				setState(1070);
				match(OpenBlock);
				setState(1071);
				abstractCodeBlock();
				setState(1072);
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
			setState(1076);
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
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				classModes();
				setState(1079);
				match(OpenBlock);
				setState(1080);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				classModes();
				setState(1083);
				match(OpenBlock);
				setState(1084);
				classCodeBlock();
				setState(1085);
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
			setState(1089);
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
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				match(Class);
				setState(1092);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				match(Class);
				setState(1094);
				match(Identifier);
				setState(1095);
				match(Extends);
				setState(1096);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(Class);
				setState(1098);
				match(Identifier);
				setState(1099);
				match(Implements);
				setState(1100);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1101);
				match(Class);
				setState(1102);
				match(Identifier);
				setState(1103);
				match(Extends);
				setState(1104);
				identifierB();
				setState(1105);
				match(Implements);
				setState(1106);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1108);
				match(Final);
				setState(1109);
				match(Class);
				setState(1110);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1111);
				match(Final);
				setState(1112);
				match(Class);
				setState(1113);
				match(Identifier);
				setState(1114);
				match(Extends);
				setState(1115);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1116);
				match(Final);
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1121);
				match(Final);
				setState(1122);
				match(Class);
				setState(1123);
				match(Identifier);
				setState(1124);
				match(Extends);
				setState(1125);
				identifierB();
				setState(1126);
				match(Implements);
				setState(1127);
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
			setState(1131);
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
		enterRule(_localctx, 198, RULE_arrayAccessElements);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				arrayAccessElementsItems();
				setState(1135);
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
		enterRule(_localctx, 200, RULE_arrayAccessElementsItems);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				match(Identifier);
				setState(1141);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1142);
				match(Identifier);
				setState(1143);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				match(Identifier);
				setState(1145);
				accessBlockAr();
				setState(1146);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1148);
				firstIncDec();
				setState(1149);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1151);
				match(Identifier);
				setState(1152);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1153);
				firstIncDec();
				setState(1154);
				match(Identifier);
				setState(1155);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1157);
				match(Identifier);
				setState(1158);
				accessBlockAr();
				setState(1159);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1161);
				match(Identifier);
				setState(1162);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1163);
				match(Identifier);
				setState(1164);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1165);
				match(Identifier);
				setState(1166);
				accessBlockAr();
				setState(1167);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1169);
				match(Identifier);
				setState(1170);
				accessBlockAr();
				setState(1171);
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
		enterRule(_localctx, 202, RULE_accessBlockAr);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(OpenArIndex);
				setState(1176);
				arrayIndexAccess();
				setState(1177);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(OpenArIndex);
				setState(1180);
				arrayIndexAccess();
				setState(1181);
				match(CloseArIndex);
				setState(1182);
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
		enterRule(_localctx, 204, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
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
		enterRule(_localctx, 206, RULE_anonymousFunction);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				match(OpenOp);
				setState(1189);
				anFnItems();
				setState(1190);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(OpenOp);
				setState(1193);
				anFnItems();
				setState(1194);
				match(CloseOp);
				setState(1195);
				match(OpenOp);
				setState(1196);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1198);
				match(OpenOp);
				setState(1199);
				anFnItems();
				setState(1200);
				match(CloseOp);
				setState(1201);
				match(OpenOp);
				setState(1202);
				operationElements();
				setState(1203);
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
		enterRule(_localctx, 208, RULE_anFnItems);
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				functionsModesFn();
				setState(1208);
				match(OpenBlock);
				setState(1209);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				functionsModesFn();
				setState(1212);
				match(OpenBlock);
				setState(1213);
				functionCodeBlock();
				setState(1214);
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
		enterRule(_localctx, 210, RULE_functionsModesFn);
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(Function);
				setState(1219);
				match(OpenOp);
				setState(1220);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(Function);
				setState(1222);
				match(OpenOp);
				setState(1223);
				match(CloseOp);
				setState(1224);
				match(ArrowRight);
				setState(1227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1225);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1226);
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
				setState(1229);
				match(Function);
				setState(1230);
				match(OpenOp);
				setState(1231);
				functionParams();
				setState(1232);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
				match(Function);
				setState(1235);
				match(OpenOp);
				setState(1236);
				functionParams();
				setState(1237);
				match(CloseOp);
				setState(1238);
				match(ArrowRight);
				setState(1241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1239);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1240);
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
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_generalValue);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				match(Identifier);
				setState(1247);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1249);
				match(Integer);
				setState(1250);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1251);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1252);
				match(Float);
				setState(1253);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1254);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1255);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1256);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1257);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1258);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1259);
				objIdentifierA();
				setState(1260);
				match(Point);
				setState(1261);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1263);
				objIdentifierA();
				setState(1264);
				match(TwoTwoPoint);
				setState(1265);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1267);
				arrayAccessElements();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1268);
				anonymousFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 214, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
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
		enterRule(_localctx, 216, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u04fe\4\2\t\2"+
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
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00e5\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f0\n\4\3\5\3\5\3\5\5\5\u00f5\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0106"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u011b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u014c\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0155\n\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u015e\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u016f\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u017d"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0185\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u018c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0194\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019f\n\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01a9\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0203\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u021c\n\36"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0229\n!\3\"\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\5%\u0238\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0244"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u024a\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u0257\n(\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0261\n*\3+\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0276\n.\3/\3/\3/\3/\5/\u027c\n/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0286\n\60\3\61\3\61\3\61"+
		"\5\61\u028b\n\61\3\62\3\62\3\62\5\62\u0290\n\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u029a\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u02f9\n\65\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u0301\n"+
		"\67\38\38\39\39\39\39\39\39\39\39\39\39\39\59\u0310\n9\3:\3:\3:\3:\5:"+
		"\u0316\n:\3;\3;\3;\3;\3<\3<\3<\5<\u031f\n<\3=\3=\3=\5=\u0324\n=\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0334\n>\3?\3?\3@\3@\3A\3A\3B"+
		"\3B\3B\3B\5B\u0340\nB\3C\3C\5C\u0344\nC\3D\3D\5D\u0348\nD\3E\3E\3E\3E"+
		"\3E\5E\u034f\nE\3F\3F\3F\3F\5F\u0355\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\5G\u0361\nG\3H\3H\3H\3H\3I\3I\5I\u0369\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0389"+
		"\nJ\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0398\nL\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03a8\nL\5L\u03aa\nL\3M\3M\3N\3N\3N\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O"+
		"\u03c8\nO\3P\3P\3Q\3Q\3R\3R\3R\3R\5R\u03d2\nR\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\5S\u03dc\nS\3T\3T\5T\u03e0\nT\3U\3U\3V\3V\3V\3V\5V\u03e8\nV\3W\3W\3X"+
		"\3X\3X\3X\3X\5X\u03f1\nX\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u03f9\nZ\3[\3[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\5\\\u0416\n\\\3]\3]\3^\3^\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0435\n_\3`\3"+
		"`\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0442\na\3b\3b\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\5c\u046c\nc\3d\3d\3e\3e\3e\3e\5e\u0474\ne\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0498\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\5"+
		"g\u04a3\ng\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5"+
		"i\u04b8\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u04c3\nj\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\5k\u04ce\nk\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u04dc\nk\5"+
		"k\u04de\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\5l\u04f8\nl\3m\3m\3n\3n\3n\2\2o\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\2\6"+
		"\4\2\32\32&&\3\2%&\3\2\13\r\3\2\13\17\2\u056d\2\u00dc\3\2\2\2\4\u00e4"+
		"\3\2\2\2\6\u00ef\3\2\2\2\b\u00f4\3\2\2\2\n\u00f6\3\2\2\2\f\u00f9\3\2\2"+
		"\2\16\u00fc\3\2\2\2\20\u0105\3\2\2\2\22\u0107\3\2\2\2\24\u0109\3\2\2\2"+
		"\26\u011a\3\2\2\2\30\u014b\3\2\2\2\32\u014d\3\2\2\2\34\u0154\3\2\2\2\36"+
		"\u0156\3\2\2\2 \u015d\3\2\2\2\"\u016e\3\2\2\2$\u017c\3\2\2\2&\u0184\3"+
		"\2\2\2(\u018b\3\2\2\2*\u0193\3\2\2\2,\u019e\3\2\2\2.\u01a0\3\2\2\2\60"+
		"\u01a8\3\2\2\2\62\u0202\3\2\2\2\64\u0204\3\2\2\2\66\u0206\3\2\2\28\u0208"+
		"\3\2\2\2:\u021b\3\2\2\2<\u021d\3\2\2\2>\u021f\3\2\2\2@\u0228\3\2\2\2B"+
		"\u022a\3\2\2\2D\u022d\3\2\2\2F\u022f\3\2\2\2H\u0237\3\2\2\2J\u0243\3\2"+
		"\2\2L\u0249\3\2\2\2N\u0256\3\2\2\2P\u0258\3\2\2\2R\u0260\3\2\2\2T\u0262"+
		"\3\2\2\2V\u0266\3\2\2\2X\u0269\3\2\2\2Z\u0275\3\2\2\2\\\u027b\3\2\2\2"+
		"^\u0285\3\2\2\2`\u028a\3\2\2\2b\u028f\3\2\2\2d\u0299\3\2\2\2f\u029b\3"+
		"\2\2\2h\u02f8\3\2\2\2j\u02fa\3\2\2\2l\u0300\3\2\2\2n\u0302\3\2\2\2p\u030f"+
		"\3\2\2\2r\u0315\3\2\2\2t\u0317\3\2\2\2v\u031e\3\2\2\2x\u0323\3\2\2\2z"+
		"\u0333\3\2\2\2|\u0335\3\2\2\2~\u0337\3\2\2\2\u0080\u0339\3\2\2\2\u0082"+
		"\u033f\3\2\2\2\u0084\u0343\3\2\2\2\u0086\u0347\3\2\2\2\u0088\u034e\3\2"+
		"\2\2\u008a\u0354\3\2\2\2\u008c\u0360\3\2\2\2\u008e\u0362\3\2\2\2\u0090"+
		"\u0368\3\2\2\2\u0092\u0388\3\2\2\2\u0094\u038a\3\2\2\2\u0096\u03a9\3\2"+
		"\2\2\u0098\u03ab\3\2\2\2\u009a\u03ad\3\2\2\2\u009c\u03c7\3\2\2\2\u009e"+
		"\u03c9\3\2\2\2\u00a0\u03cb\3\2\2\2\u00a2\u03d1\3\2\2\2\u00a4\u03db\3\2"+
		"\2\2\u00a6\u03df\3\2\2\2\u00a8\u03e1\3\2\2\2\u00aa\u03e7\3\2\2\2\u00ac"+
		"\u03e9\3\2\2\2\u00ae\u03f0\3\2\2\2\u00b0\u03f2\3\2\2\2\u00b2\u03f8\3\2"+
		"\2\2\u00b4\u03fa\3\2\2\2\u00b6\u0415\3\2\2\2\u00b8\u0417\3\2\2\2\u00ba"+
		"\u0419\3\2\2\2\u00bc\u0434\3\2\2\2\u00be\u0436\3\2\2\2\u00c0\u0441\3\2"+
		"\2\2\u00c2\u0443\3\2\2\2\u00c4\u046b\3\2\2\2\u00c6\u046d\3\2\2\2\u00c8"+
		"\u0473\3\2\2\2\u00ca\u0497\3\2\2\2\u00cc\u04a2\3\2\2\2\u00ce\u04a4\3\2"+
		"\2\2\u00d0\u04b7\3\2\2\2\u00d2\u04c2\3\2\2\2\u00d4\u04dd\3\2\2\2\u00d6"+
		"\u04f7\3\2\2\2\u00d8\u04f9\3\2\2\2\u00da\u04fb\3\2\2\2\u00dc\u00dd\5\4"+
		"\3\2\u00dd\u00de\7\2\2\3\u00de\3\3\2\2\2\u00df\u00e5\5\6\4\2\u00e0\u00e1"+
		"\5\6\4\2\u00e1\u00e2\5\4\3\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\5\3\2\2\2"+
		"\u00e6\u00f0\5\b\5\2\u00e7\u00f0\5\16\b\2\u00e8\u00f0\5\24\13\2\u00e9"+
		"\u00f0\58\35\2\u00ea\u00f0\5L\'\2\u00eb\u00f0\5r:\2\u00ec\u00f0\5\u0092"+
		"J\2\u00ed\u00f0\5\u008eH\2\u00ee\u00f0\5\u00b2Z\2\u00ef\u00e6\3\2\2\2"+
		"\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea"+
		"\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\7\3\2\2\2\u00f1\u00f5\7\60\2\2\u00f2\u00f5\5\n\6"+
		"\2\u00f3\u00f5\5\f\7\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\t\3\2\2\2\u00f6\u00f7\7\26\2\2\u00f7\u00f8\7\31\2\2\u00f8"+
		"\13\3\2\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\7\31\2\2\u00fb\r\3\2\2\2"+
		"\u00fc\u00fd\7\3\2\2\u00fd\u00fe\5\20\t\2\u00fe\u00ff\7\31\2\2\u00ff\17"+
		"\3\2\2\2\u0100\u0106\5\22\n\2\u0101\u0102\5\22\n\2\u0102\u0103\7\36\2"+
		"\2\u0103\u0104\5\20\t\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0101\3\2\2\2\u0106\21\3\2\2\2\u0107\u0108\7,\2\2\u0108\23\3\2\2\2\u0109"+
		"\u010a\5\26\f\2\u010a\25\3\2\2\2\u010b\u010c\7\4\2\2\u010c\u010d\5 \21"+
		"\2\u010d\u010e\7\31\2\2\u010e\u011b\3\2\2\2\u010f\u0110\5\u00a2R\2\u0110"+
		"\u0111\7\4\2\2\u0111\u0112\5 \21\2\u0112\u0113\7\31\2\2\u0113\u011b\3"+
		"\2\2\2\u0114\u0115\5 \21\2\u0115\u0116\7\31\2\2\u0116\u011b\3\2\2\2\u0117"+
		"\u0118\5\32\16\2\u0118\u0119\7\31\2\2\u0119\u011b\3\2\2\2\u011a\u010b"+
		"\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3\2\2\2\u011b"+
		"\27\3\2\2\2\u011c\u011d\7\4\2\2\u011d\u011e\5 \21\2\u011e\u011f\7\31\2"+
		"\2\u011f\u014c\3\2\2\2\u0120\u0121\5\u009eP\2\u0121\u0122\7\4\2\2\u0122"+
		"\u0123\5 \21\2\u0123\u0124\7\31\2\2\u0124\u014c\3\2\2\2\u0125\u0126\7"+
		"\16\2\2\u0126\u0127\7\4\2\2\u0127\u0128\5 \21\2\u0128\u0129\7\31\2\2\u0129"+
		"\u014c\3\2\2\2\u012a\u012b\5\u009eP\2\u012b\u012c\7\16\2\2\u012c\u012d"+
		"\7\4\2\2\u012d\u012e\5 \21\2\u012e\u012f\7\31\2\2\u012f\u014c\3\2\2\2"+
		"\u0130\u0131\7\17\2\2\u0131\u0132\5\u009eP\2\u0132\u0133\7\16\2\2\u0133"+
		"\u0134\7\4\2\2\u0134\u0135\5 \21\2\u0135\u0136\7\31\2\2\u0136\u014c\3"+
		"\2\2\2\u0137\u0138\7\17\2\2\u0138\u0139\5\u009eP\2\u0139\u013a\7\4\2\2"+
		"\u013a\u013b\5 \21\2\u013b\u013c\7\31\2\2\u013c\u014c\3\2\2\2\u013d\u013e"+
		"\7\17\2\2\u013e\u013f\7\4\2\2\u013f\u0140\5 \21\2\u0140\u0141\7\31\2\2"+
		"\u0141\u014c\3\2\2\2\u0142\u0143\7\17\2\2\u0143\u0144\7\16\2\2\u0144\u0145"+
		"\7\4\2\2\u0145\u0146\5 \21\2\u0146\u0147\7\31\2\2\u0147\u014c\3\2\2\2"+
		"\u0148\u0149\5 \21\2\u0149\u014a\7\31\2\2\u014a\u014c\3\2\2\2\u014b\u011c"+
		"\3\2\2\2\u014b\u0120\3\2\2\2\u014b\u0125\3\2\2\2\u014b\u012a\3\2\2\2\u014b"+
		"\u0130\3\2\2\2\u014b\u0137\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0142\3\2"+
		"\2\2\u014b\u0148\3\2\2\2\u014c\31\3\2\2\2\u014d\u014e\5\34\17\2\u014e"+
		"\33\3\2\2\2\u014f\u0155\5\36\20\2\u0150\u0151\5\36\20\2\u0151\u0152\7"+
		"\32\2\2\u0152\u0153\5\34\17\2\u0153\u0155\3\2\2\2\u0154\u014f\3\2\2\2"+
		"\u0154\u0150\3\2\2\2\u0155\35\3\2\2\2\u0156\u0157\5\"\22\2\u0157\37\3"+
		"\2\2\2\u0158\u015e\5\"\22\2\u0159\u015a\5\"\22\2\u015a\u015b\7\36\2\2"+
		"\u015b\u015c\5 \21\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159"+
		"\3\2\2\2\u015e!\3\2\2\2\u015f\u0160\7)\2\2\u0160\u016f\5$\23\2\u0161\u0162"+
		"\5\u00d8m\2\u0162\u0163\7\33\2\2\u0163\u0164\5\u00dan\2\u0164\u0165\5"+
		"$\23\2\u0165\u016f\3\2\2\2\u0166\u0167\5\u00d8m\2\u0167\u0168\7\35\2\2"+
		"\u0168\u0169\5\u00dan\2\u0169\u016a\5$\23\2\u016a\u016f\3\2\2\2\u016b"+
		"\u016c\5\u00c8e\2\u016c\u016d\5$\23\2\u016d\u016f\3\2\2\2\u016e\u015f"+
		"\3\2\2\2\u016e\u0161\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u016b\3\2\2\2\u016f"+
		"#\3\2\2\2\u0170\u0171\t\2\2\2\u0171\u017d\5\u00d6l\2\u0172\u0173\7+\2"+
		"\2\u0173\u0174\t\2\2\2\u0174\u017d\5\u00d6l\2\u0175\u0176\t\2\2\2\u0176"+
		"\u0177\7\25\2\2\u0177\u017d\5\u00d6l\2\u0178\u0179\7+\2\2\u0179\u017a"+
		"\t\2\2\2\u017a\u017b\7\25\2\2\u017b\u017d\5\u00d6l\2\u017c\u0170\3\2\2"+
		"\2\u017c\u0172\3\2\2\2\u017c\u0175\3\2\2\2\u017c\u0178\3\2\2\2\u017d%"+
		"\3\2\2\2\u017e\u017f\7\37\2\2\u017f\u0185\7 \2\2\u0180\u0181\7\37\2\2"+
		"\u0181\u0182\5(\25\2\u0182\u0183\7 \2\2\u0183\u0185\3\2\2\2\u0184\u017e"+
		"\3\2\2\2\u0184\u0180\3\2\2\2\u0185\'\3\2\2\2\u0186\u018c\5\u00d6l\2\u0187"+
		"\u0188\5\u00d6l\2\u0188\u0189\7\36\2\2\u0189\u018a\5(\25\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2\2\2\u018c)\3\2\2\2\u018d"+
		"\u018e\7!\2\2\u018e\u0194\7\"\2\2\u018f\u0190\7!\2\2\u0190\u0191\5,\27"+
		"\2\u0191\u0192\7\"\2\2\u0192\u0194\3\2\2\2\u0193\u018d\3\2\2\2\u0193\u018f"+
		"\3\2\2\2\u0194+\3\2\2\2\u0195\u0196\7)\2\2\u0196\u0197\7\34\2\2\u0197"+
		"\u019f\5\u00d6l\2\u0198\u0199\7)\2\2\u0199\u019a\7\34\2\2\u019a\u019b"+
		"\5\u00d6l\2\u019b\u019c\7\36\2\2\u019c\u019d\5,\27\2\u019d\u019f\3\2\2"+
		"\2\u019e\u0195\3\2\2\2\u019e\u0198\3\2\2\2\u019f-\3\2\2\2\u01a0\u01a1"+
		"\7#\2\2\u01a1\u01a2\5\60\31\2\u01a2\u01a3\7$\2\2\u01a3/\3\2\2\2\u01a4"+
		"\u01a9\5\62\32\2\u01a5\u01a6\5\62\32\2\u01a6\u01a7\5\60\31\2\u01a7\u01a9"+
		"\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9\61\3\2\2\2\u01aa"+
		"\u0203\5:\36\2\u01ab\u01ac\5:\36\2\u01ac\u01ad\7%\2\2\u01ad\u0203\3\2"+
		"\2\2\u01ae\u01af\5:\36\2\u01af\u01b0\7+\2\2\u01b0\u0203\3\2\2\2\u01b1"+
		"\u01b2\5:\36\2\u01b2\u01b3\7+\2\2\u01b3\u01b4\7%\2\2\u01b4\u0203\3\2\2"+
		"\2\u01b5\u0203\7)\2\2\u01b6\u01b7\7)\2\2\u01b7\u0203\7%\2\2\u01b8\u01b9"+
		"\7)\2\2\u01b9\u0203\7+\2\2\u01ba\u01bb\7)\2\2\u01bb\u01bc\7+\2\2\u01bc"+
		"\u0203\7%\2\2\u01bd\u01be\5\64\33\2\u01be\u01bf\7)\2\2\u01bf\u0203\3\2"+
		"\2\2\u01c0\u01c1\5\64\33\2\u01c1\u01c2\7)\2\2\u01c2\u01c3\7%\2\2\u01c3"+
		"\u0203\3\2\2\2\u01c4\u01c5\5\64\33\2\u01c5\u01c6\7)\2\2\u01c6\u01c7\7"+
		"+\2\2\u01c7\u0203\3\2\2\2\u01c8\u01c9\5\64\33\2\u01c9\u01ca\7)\2\2\u01ca"+
		"\u01cb\7+\2\2\u01cb\u01cc\7%\2\2\u01cc\u0203\3\2\2\2\u01cd\u01ce\7)\2"+
		"\2\u01ce\u0203\5\66\34\2\u01cf\u01d0\7)\2\2\u01d0\u01d1\5\66\34\2\u01d1"+
		"\u01d2\7%\2\2\u01d2\u0203\3\2\2\2\u01d3\u01d4\7)\2\2\u01d4\u01d5\5\66"+
		"\34\2\u01d5\u01d6\7+\2\2\u01d6\u0203\3\2\2\2\u01d7\u01d8\7)\2\2\u01d8"+
		"\u01d9\5\66\34\2\u01d9\u01da\7+\2\2\u01da\u01db\7%\2\2\u01db\u0203\3\2"+
		"\2\2\u01dc\u0203\7-\2\2\u01dd\u01de\7-\2\2\u01de\u0203\7%\2\2\u01df\u01e0"+
		"\7-\2\2\u01e0\u0203\7+\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\7+\2\2\u01e3"+
		"\u0203\7%\2\2\u01e4\u0203\7.\2\2\u01e5\u01e6\7.\2\2\u01e6\u0203\7%\2\2"+
		"\u01e7\u01e8\7.\2\2\u01e8\u0203\7+\2\2\u01e9\u01ea\7.\2\2\u01ea\u01eb"+
		"\7+\2\2\u01eb\u0203\7%\2\2\u01ec\u0203\5.\30\2\u01ed\u01ee\5.\30\2\u01ee"+
		"\u01ef\7%\2\2\u01ef\u0203\3\2\2\2\u01f0\u01f1\5.\30\2\u01f1\u01f2\7+\2"+
		"\2\u01f2\u0203\3\2\2\2\u01f3\u01f4\5.\30\2\u01f4\u01f5\7+\2\2\u01f5\u01f6"+
		"\7%\2\2\u01f6\u0203\3\2\2\2\u01f7\u0203\5\u00c8e\2\u01f8\u01f9\5\u00c8"+
		"e\2\u01f9\u01fa\7%\2\2\u01fa\u0203\3\2\2\2\u01fb\u01fc\5\u00c8e\2\u01fc"+
		"\u01fd\7+\2\2\u01fd\u0203\3\2\2\2\u01fe\u01ff\5\u00c8e\2\u01ff\u0200\7"+
		"+\2\2\u0200\u0201\7%\2\2\u0201\u0203\3\2\2\2\u0202\u01aa\3\2\2\2\u0202"+
		"\u01ab\3\2\2\2\u0202\u01ae\3\2\2\2\u0202\u01b1\3\2\2\2\u0202\u01b5\3\2"+
		"\2\2\u0202\u01b6\3\2\2\2\u0202\u01b8\3\2\2\2\u0202\u01ba\3\2\2\2\u0202"+
		"\u01bd\3\2\2\2\u0202\u01c0\3\2\2\2\u0202\u01c4\3\2\2\2\u0202\u01c8\3\2"+
		"\2\2\u0202\u01cd\3\2\2\2\u0202\u01cf\3\2\2\2\u0202\u01d3\3\2\2\2\u0202"+
		"\u01d7\3\2\2\2\u0202\u01dc\3\2\2\2\u0202\u01dd\3\2\2\2\u0202\u01df\3\2"+
		"\2\2\u0202\u01e1\3\2\2\2\u0202\u01e4\3\2\2\2\u0202\u01e5\3\2\2\2\u0202"+
		"\u01e7\3\2\2\2\u0202\u01e9\3\2\2\2\u0202\u01ec\3\2\2\2\u0202\u01ed\3\2"+
		"\2\2\u0202\u01f0\3\2\2\2\u0202\u01f3\3\2\2\2\u0202\u01f7\3\2\2\2\u0202"+
		"\u01f8\3\2\2\2\u0202\u01fb\3\2\2\2\u0202\u01fe\3\2\2\2\u0203\63\3\2\2"+
		"\2\u0204\u0205\7(\2\2\u0205\65\3\2\2\2\u0206\u0207\7(\2\2\u0207\67\3\2"+
		"\2\2\u0208\u0209\5:\36\2\u0209\u020a\7\31\2\2\u020a9\3\2\2\2\u020b\u020c"+
		"\7)\2\2\u020c\u021c\5H%\2\u020d\u020e\7)\2\2\u020e\u020f\7\33\2\2\u020f"+
		"\u0210\5D#\2\u0210\u0211\5H%\2\u0211\u021c\3\2\2\2\u0212\u0213\7)\2\2"+
		"\u0213\u0214\7\35\2\2\u0214\u0215\5D#\2\u0215\u0216\5H%\2\u0216\u021c"+
		"\3\2\2\2\u0217\u021c\5> \2\u0218\u0219\5\u00c8e\2\u0219\u021a\5<\37\2"+
		"\u021a\u021c\3\2\2\2\u021b\u020b\3\2\2\2\u021b\u020d\3\2\2\2\u021b\u0212"+
		"\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021c;\3\2\2\2\u021d"+
		"\u021e\5H%\2\u021e=\3\2\2\2\u021f\u0220\7)\2\2\u0220\u0221\7\33\2\2\u0221"+
		"\u0222\5@!\2\u0222?\3\2\2\2\u0223\u0229\5B\"\2\u0224\u0225\5B\"\2\u0225"+
		"\u0226\7\33\2\2\u0226\u0227\5@!\2\u0227\u0229\3\2\2\2\u0228\u0223\3\2"+
		"\2\2\u0228\u0224\3\2\2\2\u0229A\3\2\2\2\u022a\u022b\7)\2\2\u022b\u022c"+
		"\5H%\2\u022cC\3\2\2\2\u022d\u022e\7)\2\2\u022eE\3\2\2\2\u022f\u0230\7"+
		"\33\2\2\u0230G\3\2\2\2\u0231\u0232\7#\2\2\u0232\u0238\7$\2\2\u0233\u0234"+
		"\7#\2\2\u0234\u0235\5J&\2\u0235\u0236\7$\2\2\u0236\u0238\3\2\2\2\u0237"+
		"\u0231\3\2\2\2\u0237\u0233\3\2\2\2\u0238I\3\2\2\2\u0239\u0244\5\u00d6"+
		"l\2\u023a\u023b\5\u00d6l\2\u023b\u023c\7\36\2\2\u023c\u023d\5J&\2\u023d"+
		"\u0244\3\2\2\2\u023e\u0244\5\60\31\2\u023f\u0240\5\60\31\2\u0240\u0241"+
		"\7\36\2\2\u0241\u0242\5J&\2\u0242\u0244\3\2\2\2\u0243\u0239\3\2\2\2\u0243"+
		"\u023a\3\2\2\2\u0243\u023e\3\2\2\2\u0243\u023f\3\2\2\2\u0244K\3\2\2\2"+
		"\u0245\u024a\5N(\2\u0246\u0247\5N(\2\u0247\u0248\5L\'\2\u0248\u024a\3"+
		"\2\2\2\u0249\u0245\3\2\2\2\u0249\u0246\3\2\2\2\u024aM\3\2\2\2\u024b\u0257"+
		"\5P)\2\u024c\u024d\5P)\2\u024d\u024e\5R*\2\u024e\u0257\3\2\2\2\u024f\u0250"+
		"\5P)\2\u0250\u0251\5V,\2\u0251\u0257\3\2\2\2\u0252\u0253\5P)\2\u0253\u0254"+
		"\5R*\2\u0254\u0255\5V,\2\u0255\u0257\3\2\2\2\u0256\u024b\3\2\2\2\u0256"+
		"\u024c\3\2\2\2\u0256\u024f\3\2\2\2\u0256\u0252\3\2\2\2\u0257O\3\2\2\2"+
		"\u0258\u0259\7\5\2\2\u0259\u025a\5X-\2\u025a\u025b\5Z.\2\u025bQ\3\2\2"+
		"\2\u025c\u0261\5T+\2\u025d\u025e\5T+\2\u025e\u025f\5R*\2\u025f\u0261\3"+
		"\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2\2\2\u0261S\3\2\2\2\u0262\u0263"+
		"\7\6\2\2\u0263\u0264\5X-\2\u0264\u0265\5Z.\2\u0265U\3\2\2\2\u0266\u0267"+
		"\7\7\2\2\u0267\u0268\5Z.\2\u0268W\3\2\2\2\u0269\u026a\5^\60\2\u026aY\3"+
		"\2\2\2\u026b\u026c\7!\2\2\u026c\u0276\7\"\2\2\u026d\u026e\7!\2\2\u026e"+
		"\u026f\5\\/\2\u026f\u0270\7\"\2\2\u0270\u0276\3\2\2\2\u0271\u0276\5L\'"+
		"\2\u0272\u0276\58\35\2\u0273\u0276\5r:\2\u0274\u0276\5\u008eH\2\u0275"+
		"\u026b\3\2\2\2\u0275\u026d\3\2\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276[\3\2\2\2\u0277\u027c"+
		"\5\6\4\2\u0278\u0279\5\6\4\2\u0279\u027a\5\\/\2\u027a\u027c\3\2\2\2\u027b"+
		"\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027c]\3\2\2\2\u027d\u0286\5`\61\2"+
		"\u027e\u027f\5`\61\2\u027f\u0280\5^\60\2\u0280\u0286\3\2\2\2\u0281\u0286"+
		"\5b\62\2\u0282\u0283\5b\62\2\u0283\u0284\5^\60\2\u0284\u0286\3\2\2\2\u0285"+
		"\u027d\3\2\2\2\u0285\u027e\3\2\2\2\u0285\u0281\3\2\2\2\u0285\u0282\3\2"+
		"\2\2\u0286_\3\2\2\2\u0287\u0288\7\'\2\2\u0288\u028b\5h\65\2\u0289\u028b"+
		"\5h\65\2\u028a\u0287\3\2\2\2\u028a\u0289\3\2\2\2\u028ba\3\2\2\2\u028c"+
		"\u0290\5d\63\2\u028d\u028e\7\'\2\2\u028e\u0290\5d\63\2\u028f\u028c\3\2"+
		"\2\2\u028f\u028d\3\2\2\2\u0290c\3\2\2\2\u0291\u029a\5f\64\2\u0292\u0293"+
		"\5f\64\2\u0293\u0294\t\3\2\2\u0294\u029a\3\2\2\2\u0295\u0296\5f\64\2\u0296"+
		"\u0297\7+\2\2\u0297\u0298\t\3\2\2\u0298\u029a\3\2\2\2\u0299\u0291\3\2"+
		"\2\2\u0299\u0292\3\2\2\2\u0299\u0295\3\2\2\2\u029ae\3\2\2\2\u029b\u029c"+
		"\7#\2\2\u029c\u029d\5^\60\2\u029d\u029e\7$\2\2\u029eg\3\2\2\2\u029f\u02a0"+
		"\5\64\33\2\u02a0\u02a1\7)\2\2\u02a1\u02f9\3\2\2\2\u02a2\u02a3\5\64\33"+
		"\2\u02a3\u02a4\7)\2\2\u02a4\u02a5\t\3\2\2\u02a5\u02f9\3\2\2\2\u02a6\u02a7"+
		"\5\64\33\2\u02a7\u02a8\7)\2\2\u02a8\u02a9\7+\2\2\u02a9\u02f9\3\2\2\2\u02aa"+
		"\u02ab\5\64\33\2\u02ab\u02ac\7)\2\2\u02ac\u02ad\7+\2\2\u02ad\u02ae\t\3"+
		"\2\2\u02ae\u02f9\3\2\2\2\u02af\u02b0\7)\2\2\u02b0\u02f9\5\66\34\2\u02b1"+
		"\u02b2\7)\2\2\u02b2\u02b3\5\66\34\2\u02b3\u02b4\t\3\2\2\u02b4\u02f9\3"+
		"\2\2\2\u02b5\u02b6\7)\2\2\u02b6\u02b7\5\66\34\2\u02b7\u02b8\7+\2\2\u02b8"+
		"\u02f9\3\2\2\2\u02b9\u02ba\7)\2\2\u02ba\u02bb\5\66\34\2\u02bb\u02bc\7"+
		"+\2\2\u02bc\u02bd\t\3\2\2\u02bd\u02f9\3\2\2\2\u02be\u02f9\7-\2\2\u02bf"+
		"\u02c0\7-\2\2\u02c0\u02f9\t\3\2\2\u02c1\u02c2\7-\2\2\u02c2\u02f9\7+\2"+
		"\2\u02c3\u02c4\7-\2\2\u02c4\u02c5\7+\2\2\u02c5\u02f9\t\3\2\2\u02c6\u02f9"+
		"\7.\2\2\u02c7\u02c8\7.\2\2\u02c8\u02f9\t\3\2\2\u02c9\u02ca\7.\2\2\u02ca"+
		"\u02f9\7+\2\2\u02cb\u02cc\7.\2\2\u02cc\u02cd\7+\2\2\u02cd\u02f9\t\3\2"+
		"\2\u02ce\u02f9\5j\66\2\u02cf\u02f9\5:\36\2\u02d0\u02d1\5:\36\2\u02d1\u02d2"+
		"\t\3\2\2\u02d2\u02f9\3\2\2\2\u02d3\u02d4\5:\36\2\u02d4\u02d5\7+\2\2\u02d5"+
		"\u02f9\3\2\2\2\u02d6\u02d7\5:\36\2\u02d7\u02d8\7+\2\2\u02d8\u02d9\t\3"+
		"\2\2\u02d9\u02f9\3\2\2\2\u02da\u02f9\5.\30\2\u02db\u02dc\5.\30\2\u02dc"+
		"\u02dd\t\3\2\2\u02dd\u02f9\3\2\2\2\u02de\u02df\5.\30\2\u02df\u02e0\7+"+
		"\2\2\u02e0\u02f9\3\2\2\2\u02e1\u02e2\5.\30\2\u02e2\u02e3\7+\2\2\u02e3"+
		"\u02e4\t\3\2\2\u02e4\u02f9\3\2\2\2\u02e5\u02f9\7)\2\2\u02e6\u02e7\7)\2"+
		"\2\u02e7\u02f9\t\3\2\2\u02e8\u02e9\7)\2\2\u02e9\u02f9\7+\2\2\u02ea\u02eb"+
		"\7)\2\2\u02eb\u02ec\7+\2\2\u02ec\u02f9\t\3\2\2\u02ed\u02f9\5\u00c8e\2"+
		"\u02ee\u02ef\5\u00c8e\2\u02ef\u02f0\t\3\2\2\u02f0\u02f9\3\2\2\2\u02f1"+
		"\u02f2\5\u00c8e\2\u02f2\u02f3\7+\2\2\u02f3\u02f9\3\2\2\2\u02f4\u02f5\5"+
		"\u00c8e\2\u02f5\u02f6\7+\2\2\u02f6\u02f7\t\3\2\2\u02f7\u02f9\3\2\2\2\u02f8"+
		"\u029f\3\2\2\2\u02f8\u02a2\3\2\2\2\u02f8\u02a6\3\2\2\2\u02f8\u02aa\3\2"+
		"\2\2\u02f8\u02af\3\2\2\2\u02f8\u02b1\3\2\2\2\u02f8\u02b5\3\2\2\2\u02f8"+
		"\u02b9\3\2\2\2\u02f8\u02be\3\2\2\2\u02f8\u02bf\3\2\2\2\u02f8\u02c1\3\2"+
		"\2\2\u02f8\u02c3\3\2\2\2\u02f8\u02c6\3\2\2\2\u02f8\u02c7\3\2\2\2\u02f8"+
		"\u02c9\3\2\2\2\u02f8\u02cb\3\2\2\2\u02f8\u02ce\3\2\2\2\u02f8\u02cf\3\2"+
		"\2\2\u02f8\u02d0\3\2\2\2\u02f8\u02d3\3\2\2\2\u02f8\u02d6\3\2\2\2\u02f8"+
		"\u02da\3\2\2\2\u02f8\u02db\3\2\2\2\u02f8\u02de\3\2\2\2\u02f8\u02e1\3\2"+
		"\2\2\u02f8\u02e5\3\2\2\2\u02f8\u02e6\3\2\2\2\u02f8\u02e8\3\2\2\2\u02f8"+
		"\u02ea\3\2\2\2\u02f8\u02ed\3\2\2\2\u02f8\u02ee\3\2\2\2\u02f8\u02f1\3\2"+
		"\2\2\u02f8\u02f4\3\2\2\2\u02f9i\3\2\2\2\u02fa\u02fb\5l\67\2\u02fb\u02fc"+
		"\7\32\2\2\u02fc\u02fd\5n8\2\u02fdk\3\2\2\2\u02fe\u0301\5\u00c8e\2\u02ff"+
		"\u0301\7)\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301m\3\2\2\2\u0302"+
		"\u0303\5p9\2\u0303o\3\2\2\2\u0304\u0310\5:\36\2\u0305\u0306\5:\36\2\u0306"+
		"\u0307\t\3\2\2\u0307\u0310\3\2\2\2\u0308\u0309\5:\36\2\u0309\u030a\7+"+
		"\2\2\u030a\u0310\3\2\2\2\u030b\u030c\5:\36\2\u030c\u030d\7+\2\2\u030d"+
		"\u030e\t\3\2\2\u030e\u0310\3\2\2\2\u030f\u0304\3\2\2\2\u030f\u0305\3\2"+
		"\2\2\u030f\u0308\3\2\2\2\u030f\u030b\3\2\2\2\u0310q\3\2\2\2\u0311\u0316"+
		"\5t;\2\u0312\u0313\5t;\2\u0313\u0314\5r:\2\u0314\u0316\3\2\2\2\u0315\u0311"+
		"\3\2\2\2\u0315\u0312\3\2\2\2\u0316s\3\2\2\2\u0317\u0318\7\b\2\2\u0318"+
		"\u0319\5v<\2\u0319\u031a\5\u008cG\2\u031au\3\2\2\2\u031b\u031f\5x=\2\u031c"+
		"\u031f\5z>\2\u031d\u031f\5|?\2\u031e\u031b\3\2\2\2\u031e\u031c\3\2\2\2"+
		"\u031e\u031d\3\2\2\2\u031fw\3\2\2\2\u0320\u0321\7#\2\2\u0321\u0324\7$"+
		"\2\2\u0322\u0324\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0322\3\2\2\2\u0324"+
		"y\3\2\2\2\u0325\u0326\7#\2\2\u0326\u0327\5\u0082B\2\u0327\u0328\5~@\2"+
		"\u0328\u0329\5\u0084C\2\u0329\u032a\5\u0080A\2\u032a\u032b\5\u0086D\2"+
		"\u032b\u032c\7$\2\2\u032c\u0334\3\2\2\2\u032d\u032e\5\u0082B\2\u032e\u032f"+
		"\5~@\2\u032f\u0330\5\u0084C\2\u0330\u0331\5\u0080A\2\u0331\u0332\5\u0086"+
		"D\2\u0332\u0334\3\2\2\2\u0333\u0325\3\2\2\2\u0333\u032d\3\2\2\2\u0334"+
		"{\3\2\2\2\u0335\u0336\5\u0084C\2\u0336}\3\2\2\2\u0337\u0338\7\31\2\2\u0338"+
		"\177\3\2\2\2\u0339\u033a\7\31\2\2\u033a\u0081\3\2\2\2\u033b\u0340\5 \21"+
		"\2\u033c\u033d\7\4\2\2\u033d\u0340\5 \21\2\u033e\u0340\3\2\2\2\u033f\u033b"+
		"\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0083\3\2\2\2\u0341"+
		"\u0344\5^\60\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2"+
		"\2\2\u0344\u0085\3\2\2\2\u0345\u0348\5\u0088E\2\u0346\u0348\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u0087\3\2\2\2\u0349\u034f\5\60"+
		"\31\2\u034a\u034b\5\60\31\2\u034b\u034c\7\36\2\2\u034c\u034d\5\u0088E"+
		"\2\u034d\u034f\3\2\2\2\u034e\u0349\3\2\2\2\u034e\u034a\3\2\2\2\u034f\u0089"+
		"\3\2\2\2\u0350\u0355\5\6\4\2\u0351\u0352\5\6\4\2\u0352\u0353\5\u008aF"+
		"\2\u0353\u0355\3\2\2\2\u0354\u0350\3\2\2\2\u0354\u0351\3\2\2\2\u0355\u008b"+
		"\3\2\2\2\u0356\u0357\7!\2\2\u0357\u0361\7\"\2\2\u0358\u0359\7!\2\2\u0359"+
		"\u035a\5\u008aF\2\u035a\u035b\7\"\2\2\u035b\u0361\3\2\2\2\u035c\u0361"+
		"\5L\'\2\u035d\u0361\58\35\2\u035e\u0361\5r:\2\u035f\u0361\5\u008eH\2\u0360"+
		"\u0356\3\2\2\2\u0360\u0358\3\2\2\2\u0360\u035c\3\2\2\2\u0360\u035d\3\2"+
		"\2\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u008d\3\2\2\2\u0362"+
		"\u0363\7\t\2\2\u0363\u0364\5\u0090I\2\u0364\u0365\7\31\2\2\u0365\u008f"+
		"\3\2\2\2\u0366\u0369\5\u00d6l\2\u0367\u0369\5\60\31\2\u0368\u0366\3\2"+
		"\2\2\u0368\u0367\3\2\2\2\u0369\u0091\3\2\2\2\u036a\u036b\5\u0094K\2\u036b"+
		"\u036c\7!\2\2\u036c\u036d\7\"\2\2\u036d\u0389\3\2\2\2\u036e\u036f\5\u0094"+
		"K\2\u036f\u0370\7!\2\2\u0370\u0371\5\u00a8U\2\u0371\u0372\7\"\2\2\u0372"+
		"\u0389\3\2\2\2\u0373\u0374\5\u009aN\2\u0374\u0375\7!\2\2\u0375\u0376\7"+
		"\"\2\2\u0376\u0389\3\2\2\2\u0377\u0378\5\u009aN\2\u0378\u0379\7!\2\2\u0379"+
		"\u037a\5\u00a8U\2\u037a\u037b\7\"\2\2\u037b\u0389\3\2\2\2\u037c\u037d"+
		"\5\u00a4S\2\u037d\u037e\7!\2\2\u037e\u037f\7\"\2\2\u037f\u0389\3\2\2\2"+
		"\u0380\u0381\5\u00a4S\2\u0381\u0382\7!\2\2\u0382\u0383\5\u00a8U\2\u0383"+
		"\u0384\7\"\2\2\u0384\u0389\3\2\2\2\u0385\u0386\5\u00a6T\2\u0386\u0387"+
		"\7\31\2\2\u0387\u0389\3\2\2\2\u0388\u036a\3\2\2\2\u0388\u036e\3\2\2\2"+
		"\u0388\u0373\3\2\2\2\u0388\u0377\3\2\2\2\u0388\u037c\3\2\2\2\u0388\u0380"+
		"\3\2\2\2\u0388\u0385\3\2\2\2\u0389\u0093\3\2\2\2\u038a\u038b\5\u0096L"+
		"\2\u038b\u0095\3\2\2\2\u038c\u038d\7\n\2\2\u038d\u038e\7)\2\2\u038e\u038f"+
		"\7#\2\2\u038f\u03aa\7$\2\2\u0390\u0391\7\n\2\2\u0391\u0392\7)\2\2\u0392"+
		"\u0393\7#\2\2\u0393\u0394\7$\2\2\u0394\u0397\7\30\2\2\u0395\u0398\5\u0098"+
		"M\2\u0396\u0398\7+\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398\u03aa"+
		"\3\2\2\2\u0399\u039a\7\n\2\2\u039a\u039b\7)\2\2\u039b\u039c\7#\2\2\u039c"+
		"\u039d\5\u00acW\2\u039d\u039e\7$\2\2\u039e\u03aa\3\2\2\2\u039f\u03a0\7"+
		"\n\2\2\u03a0\u03a1\7)\2\2\u03a1\u03a2\7#\2\2\u03a2\u03a3\5\u00acW\2\u03a3"+
		"\u03a4\7$\2\2\u03a4\u03a7\7\30\2\2\u03a5\u03a8\5\u0098M\2\u03a6\u03a8"+
		"\7+\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9"+
		"\u038c\3\2\2\2\u03a9\u0390\3\2\2\2\u03a9\u0399\3\2\2\2\u03a9\u039f\3\2"+
		"\2\2\u03aa\u0097\3\2\2\2\u03ab\u03ac\7)\2\2\u03ac\u0099\3\2\2\2\u03ad"+
		"\u03ae\5\u00a2R\2\u03ae\u03af\5\u0096L\2\u03af\u009b\3\2\2\2\u03b0\u03b1"+
		"\5\u009eP\2\u03b1\u03b2\5\u0096L\2\u03b2\u03c8\3\2\2\2\u03b3\u03b4\7\16"+
		"\2\2\u03b4\u03c8\5\u0096L\2\u03b5\u03b6\5\u009eP\2\u03b6\u03b7\7\16\2"+
		"\2\u03b7\u03b8\5\u0096L\2\u03b8\u03c8\3\2\2\2\u03b9\u03ba\7\17\2\2\u03ba"+
		"\u03bb\5\u009eP\2\u03bb\u03bc\7\16\2\2\u03bc\u03bd\5\u0096L\2\u03bd\u03c8"+
		"\3\2\2\2\u03be\u03bf\7\17\2\2\u03bf\u03c0\5\u009eP\2\u03c0\u03c1\5\u0096"+
		"L\2\u03c1\u03c8\3\2\2\2\u03c2\u03c3\7\17\2\2\u03c3\u03c8\5\u0096L\2\u03c4"+
		"\u03c5\7\17\2\2\u03c5\u03c6\7\16\2\2\u03c6\u03c8\5\u0096L\2\u03c7\u03b0"+
		"\3\2\2\2\u03c7\u03b3\3\2\2\2\u03c7\u03b5\3\2\2\2\u03c7\u03b9\3\2\2\2\u03c7"+
		"\u03be\3\2\2\2\u03c7\u03c2\3\2\2\2\u03c7\u03c4\3\2\2\2\u03c8\u009d\3\2"+
		"\2\2\u03c9\u03ca\t\4\2\2\u03ca\u009f\3\2\2\2\u03cb\u03cc\t\5\2\2\u03cc"+
		"\u00a1\3\2\2\2\u03cd\u03d2\5\u00a0Q\2\u03ce\u03cf\5\u00a0Q\2\u03cf\u03d0"+
		"\5\u00a2R\2\u03d0\u03d2\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d1\u03ce\3\2\2"+
		"\2\u03d2\u00a3\3\2\2\2\u03d3\u03d4\7)\2\2\u03d4\u03d5\7#\2\2\u03d5\u03dc"+
		"\7$\2\2\u03d6\u03d7\7)\2\2\u03d7\u03d8\7#\2\2\u03d8\u03d9\5\u00acW\2\u03d9"+
		"\u03da\7$\2\2\u03da\u03dc\3\2\2\2\u03db\u03d3\3\2\2\2\u03db\u03d6\3\2"+
		"\2\2\u03dc\u00a5\3\2\2\2\u03dd\u03e0\5\u0094K\2\u03de\u03e0\5\u009aN\2"+
		"\u03df\u03dd\3\2\2\2\u03df\u03de\3\2\2\2\u03e0\u00a7\3\2\2\2\u03e1\u03e2"+
		"\5\u00aaV\2\u03e2\u00a9\3\2\2\2\u03e3\u03e8\5\6\4\2\u03e4\u03e5\5\6\4"+
		"\2\u03e5\u03e6\5\u00aaV\2\u03e6\u03e8\3\2\2\2\u03e7\u03e3\3\2\2\2\u03e7"+
		"\u03e4\3\2\2\2\u03e8\u00ab\3\2\2\2\u03e9\u03ea\5\u00aeX\2\u03ea\u00ad"+
		"\3\2\2\2\u03eb\u03f1\5\u00b0Y\2\u03ec\u03ed\5\u00b0Y\2\u03ed\u03ee\7\36"+
		"\2\2\u03ee\u03ef\5\u00aeX\2\u03ef\u03f1\3\2\2\2\u03f0\u03eb\3\2\2\2\u03f0"+
		"\u03ec\3\2\2\2\u03f1\u00af\3\2\2\2\u03f2\u03f3\7)\2\2\u03f3\u03f4\7+\2"+
		"\2\u03f4\u00b1\3\2\2\2\u03f5\u03f9\5\u00b4[\2\u03f6\u03f9\5\u00ba^\2\u03f7"+
		"\u03f9\5\u00c0a\2\u03f8\u03f5\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f7"+
		"\3\2\2\2\u03f9\u00b3\3\2\2\2\u03fa\u03fb\5\u00b6\\\2\u03fb\u00b5\3\2\2"+
		"\2\u03fc\u03fd\7\20\2\2\u03fd\u03fe\7)\2\2\u03fe\u03ff\7!\2\2\u03ff\u0416"+
		"\7\"\2\2\u0400\u0401\7\20\2\2\u0401\u0402\7)\2\2\u0402\u0403\7!\2\2\u0403"+
		"\u0404\5\u00b8]\2\u0404\u0405\7\"\2\2\u0405\u0416\3\2\2\2\u0406\u0407"+
		"\7\20\2\2\u0407\u0408\7)\2\2\u0408\u0409\7\22\2\2\u0409\u040a\5D#\2\u040a"+
		"\u040b\7!\2\2\u040b\u040c\7\"\2\2\u040c\u0416\3\2\2\2\u040d\u040e\7\20"+
		"\2\2\u040e\u040f\7)\2\2\u040f\u0410\7\22\2\2\u0410\u0411\5D#\2\u0411\u0412"+
		"\7!\2\2\u0412\u0413\5\u00b8]\2\u0413\u0414\7\"\2\2\u0414\u0416\3\2\2\2"+
		"\u0415\u03fc\3\2\2\2\u0415\u0400\3\2\2\2\u0415\u0406\3\2\2\2\u0415\u040d"+
		"\3\2\2\2\u0416\u00b7\3\2\2\2\u0417\u0418\5\u00aaV\2\u0418\u00b9\3\2\2"+
		"\2\u0419\u041a\5\u00bc_\2\u041a\u00bb\3\2\2\2\u041b\u041c\7\21\2\2\u041c"+
		"\u041d\7)\2\2\u041d\u041e\7!\2\2\u041e\u0435\7\"\2\2\u041f\u0420\7\21"+
		"\2\2\u0420\u0421\7)\2\2\u0421\u0422\7!\2\2\u0422\u0423\5\u00be`\2\u0423"+
		"\u0424\7\"\2\2\u0424\u0435\3\2\2\2\u0425\u0426\7\21\2\2\u0426\u0427\7"+
		")\2\2\u0427\u0428\7\22\2\2\u0428\u0429\5D#\2\u0429\u042a\7!\2\2\u042a"+
		"\u042b\7\"\2\2\u042b\u0435\3\2\2\2\u042c\u042d\7\21\2\2\u042d\u042e\7"+
		")\2\2\u042e\u042f\7\22\2\2\u042f\u0430\5D#\2\u0430\u0431\7!\2\2\u0431"+
		"\u0432\5\u00be`\2\u0432\u0433\7\"\2\2\u0433\u0435\3\2\2\2\u0434\u041b"+
		"\3\2\2\2\u0434\u041f\3\2\2\2\u0434\u0425\3\2\2\2\u0434\u042c\3\2\2\2\u0435"+
		"\u00bd\3\2\2\2\u0436\u0437\5\u00aaV\2\u0437\u00bf\3\2\2\2\u0438\u0439"+
		"\5\u00c4c\2\u0439\u043a\7!\2\2\u043a\u043b\7\"\2\2\u043b\u0442\3\2\2\2"+
		"\u043c\u043d\5\u00c4c\2\u043d\u043e\7!\2\2\u043e\u043f\5\u00c2b\2\u043f"+
		"\u0440\7\"\2\2\u0440\u0442\3\2\2\2\u0441\u0438\3\2\2\2\u0441\u043c\3\2"+
		"\2\2\u0442\u00c1\3\2\2\2\u0443\u0444\5\u00aaV\2\u0444\u00c3\3\2\2\2\u0445"+
		"\u0446\7\23\2\2\u0446\u046c\7)\2\2\u0447\u0448\7\23\2\2\u0448\u0449\7"+
		")\2\2\u0449\u044a\7\22\2\2\u044a\u046c\5D#\2\u044b\u044c\7\23\2\2\u044c"+
		"\u044d\7)\2\2\u044d\u044e\7\24\2\2\u044e\u046c\5D#\2\u044f\u0450\7\23"+
		"\2\2\u0450\u0451\7)\2\2\u0451\u0452\7\22\2\2\u0452\u0453\5D#\2\u0453\u0454"+
		"\7\24\2\2\u0454\u0455\5\u00c6d\2\u0455\u046c\3\2\2\2\u0456\u0457\7\17"+
		"\2\2\u0457\u0458\7\23\2\2\u0458\u046c\7)\2\2\u0459\u045a\7\17\2\2\u045a"+
		"\u045b\7\23\2\2\u045b\u045c\7)\2\2\u045c\u045d\7\22\2\2\u045d\u046c\5"+
		"D#\2\u045e\u045f\7\17\2\2\u045f\u0460\7\23\2\2\u0460\u0461\7)\2\2\u0461"+
		"\u0462\7\24\2\2\u0462\u046c\5D#\2\u0463\u0464\7\17\2\2\u0464\u0465\7\23"+
		"\2\2\u0465\u0466\7)\2\2\u0466\u0467\7\22\2\2\u0467\u0468\5D#\2\u0468\u0469"+
		"\7\24\2\2\u0469\u046a\5\u00c6d\2\u046a\u046c\3\2\2\2\u046b\u0445\3\2\2"+
		"\2\u046b\u0447\3\2\2\2\u046b\u044b\3\2\2\2\u046b\u044f\3\2\2\2\u046b\u0456"+
		"\3\2\2\2\u046b\u0459\3\2\2\2\u046b\u045e\3\2\2\2\u046b\u0463\3\2\2\2\u046c"+
		"\u00c5\3\2\2\2\u046d\u046e\7)\2\2\u046e\u00c7\3\2\2\2\u046f\u0474\5\u00ca"+
		"f\2\u0470\u0471\5\u00caf\2\u0471\u0472\5\u00c8e\2\u0472\u0474\3\2\2\2"+
		"\u0473\u046f\3\2\2\2\u0473\u0470\3\2\2\2\u0474\u00c9\3\2\2\2\u0475\u0498"+
		"\7)\2\2\u0476\u0477\7)\2\2\u0477\u0498\7\33\2\2\u0478\u0479\7)\2\2\u0479"+
		"\u0498\5\u00ccg\2\u047a\u047b\7)\2\2\u047b\u047c\5\u00ccg\2\u047c\u047d"+
		"\7\33\2\2\u047d\u0498\3\2\2\2\u047e\u047f\5\64\33\2\u047f\u0480\7)\2\2"+
		"\u0480\u0498\3\2\2\2\u0481\u0482\7)\2\2\u0482\u0498\7\33\2\2\u0483\u0484"+
		"\5\64\33\2\u0484\u0485\7)\2\2\u0485\u0486\5\u00ccg\2\u0486\u0498\3\2\2"+
		"\2\u0487\u0488\7)\2\2\u0488\u0489\5\u00ccg\2\u0489\u048a\7\33\2\2\u048a"+
		"\u0498\3\2\2\2\u048b\u048c\7)\2\2\u048c\u0498\5\66\34\2\u048d\u048e\7"+
		")\2\2\u048e\u0498\7\33\2\2\u048f\u0490\7)\2\2\u0490\u0491\5\u00ccg\2\u0491"+
		"\u0492\5\66\34\2\u0492\u0498\3\2\2\2\u0493\u0494\7)\2\2\u0494\u0495\5"+
		"\u00ccg\2\u0495\u0496\7\33\2\2\u0496\u0498\3\2\2\2\u0497\u0475\3\2\2\2"+
		"\u0497\u0476\3\2\2\2\u0497\u0478\3\2\2\2\u0497\u047a\3\2\2\2\u0497\u047e"+
		"\3\2\2\2\u0497\u0481\3\2\2\2\u0497\u0483\3\2\2\2\u0497\u0487\3\2\2\2\u0497"+
		"\u048b\3\2\2\2\u0497\u048d\3\2\2\2\u0497\u048f\3\2\2\2\u0497\u0493\3\2"+
		"\2\2\u0498\u00cb\3\2\2\2\u0499\u049a\7\37\2\2\u049a\u049b\5\u00ceh\2\u049b"+
		"\u049c\7 \2\2\u049c\u04a3\3\2\2\2\u049d\u049e\7\37\2\2\u049e\u049f\5\u00ce"+
		"h\2\u049f\u04a0\7 \2\2\u04a0\u04a1\5\u00ccg\2\u04a1\u04a3\3\2\2\2\u04a2"+
		"\u0499\3\2\2\2\u04a2\u049d\3\2\2\2\u04a3\u00cd\3\2\2\2\u04a4\u04a5\5\60"+
		"\31\2\u04a5\u00cf\3\2\2\2\u04a6\u04a7\7#\2\2\u04a7\u04a8\5\u00d2j\2\u04a8"+
		"\u04a9\7$\2\2\u04a9\u04b8\3\2\2\2\u04aa\u04ab\7#\2\2\u04ab\u04ac\5\u00d2"+
		"j\2\u04ac\u04ad\7$\2\2\u04ad\u04ae\7#\2\2\u04ae\u04af\7$\2\2\u04af\u04b8"+
		"\3\2\2\2\u04b0\u04b1\7#\2\2\u04b1\u04b2\5\u00d2j\2\u04b2\u04b3\7$\2\2"+
		"\u04b3\u04b4\7#\2\2\u04b4\u04b5\5\60\31\2\u04b5\u04b6\7$\2\2\u04b6\u04b8"+
		"\3\2\2\2\u04b7\u04a6\3\2\2\2\u04b7\u04aa\3\2\2\2\u04b7\u04b0\3\2\2\2\u04b8"+
		"\u00d1\3\2\2\2\u04b9\u04ba\5\u00d4k\2\u04ba\u04bb\7!\2\2\u04bb\u04bc\7"+
		"\"\2\2\u04bc\u04c3\3\2\2\2\u04bd\u04be\5\u00d4k\2\u04be\u04bf\7!\2\2\u04bf"+
		"\u04c0\5\u00a8U\2\u04c0\u04c1\7\"\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04b9"+
		"\3\2\2\2\u04c2\u04bd\3\2\2\2\u04c3\u00d3\3\2\2\2\u04c4\u04c5\7\n\2\2\u04c5"+
		"\u04c6\7#\2\2\u04c6\u04de\7$\2\2\u04c7\u04c8\7\n\2\2\u04c8\u04c9\7#\2"+
		"\2\u04c9\u04ca\7$\2\2\u04ca\u04cd\7\30\2\2\u04cb\u04ce\5\u0098M\2\u04cc"+
		"\u04ce\7+\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04de\3\2"+
		"\2\2\u04cf\u04d0\7\n\2\2\u04d0\u04d1\7#\2\2\u04d1\u04d2\5\u00acW\2\u04d2"+
		"\u04d3\7$\2\2\u04d3\u04de\3\2\2\2\u04d4\u04d5\7\n\2\2\u04d5\u04d6\7#\2"+
		"\2\u04d6\u04d7\5\u00acW\2\u04d7\u04d8\7$\2\2\u04d8\u04db\7\30\2\2\u04d9"+
		"\u04dc\5\u0098M\2\u04da\u04dc\7+\2\2\u04db\u04d9\3\2\2\2\u04db\u04da\3"+
		"\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04c4\3\2\2\2\u04dd\u04c7\3\2\2\2\u04dd"+
		"\u04cf\3\2\2\2\u04dd\u04d4\3\2\2\2\u04de\u00d5\3\2\2\2\u04df\u04f8\7)"+
		"\2\2\u04e0\u04e1\7)\2\2\u04e1\u04f8\7+\2\2\u04e2\u04f8\7-\2\2\u04e3\u04e4"+
		"\7-\2\2\u04e4\u04f8\7+\2\2\u04e5\u04f8\7.\2\2\u04e6\u04e7\7.\2\2\u04e7"+
		"\u04f8\7+\2\2\u04e8\u04f8\7,\2\2\u04e9\u04f8\5&\24\2\u04ea\u04f8\5*\26"+
		"\2\u04eb\u04f8\5\60\31\2\u04ec\u04f8\5:\36\2\u04ed\u04ee\5\u00d8m\2\u04ee"+
		"\u04ef\7\33\2\2\u04ef\u04f0\5\u00dan\2\u04f0\u04f8\3\2\2\2\u04f1\u04f2"+
		"\5\u00d8m\2\u04f2\u04f3\7\35\2\2\u04f3\u04f4\5\u00dan\2\u04f4\u04f8\3"+
		"\2\2\2\u04f5\u04f8\5\u00c8e\2\u04f6\u04f8\5\u00d0i\2\u04f7\u04df\3\2\2"+
		"\2\u04f7\u04e0\3\2\2\2\u04f7\u04e2\3\2\2\2\u04f7\u04e3\3\2\2\2\u04f7\u04e5"+
		"\3\2\2\2\u04f7\u04e6\3\2\2\2\u04f7\u04e8\3\2\2\2\u04f7\u04e9\3\2\2\2\u04f7"+
		"\u04ea\3\2\2\2\u04f7\u04eb\3\2\2\2\u04f7\u04ec\3\2\2\2\u04f7\u04ed\3\2"+
		"\2\2\u04f7\u04f1\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f6\3\2\2\2\u04f8"+
		"\u00d7\3\2\2\2\u04f9\u04fa\7)\2\2\u04fa\u00d9\3\2\2\2\u04fb\u04fc\7)\2"+
		"\2\u04fc\u00db\3\2\2\2E\u00e4\u00ef\u00f4\u0105\u011a\u014b\u0154\u015d"+
		"\u016e\u017c\u0184\u018b\u0193\u019e\u01a8\u0202\u021b\u0228\u0237\u0243"+
		"\u0249\u0256\u0260\u0275\u027b\u0285\u028a\u028f\u0299\u02f8\u0300\u030f"+
		"\u0315\u031e\u0323\u0333\u033f\u0343\u0347\u034e\u0354\u0360\u0368\u0388"+
		"\u0397\u03a7\u03a9\u03c7\u03d1\u03db\u03df\u03e7\u03f0\u03f8\u0415\u0434"+
		"\u0441\u046b\u0473\u0497\u04a2\u04b7\u04c2\u04cd\u04db\u04dd\u04f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}