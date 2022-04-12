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
		RULE_arrayAccessElements = 96, RULE_arrayAccessElementsItems = 97, RULE_accessBlockAr = 98, 
		RULE_arrayIndexAccess = 99, RULE_anonymousFunction = 100, RULE_anFnItems = 101, 
		RULE_functionsModesFn = 102, RULE_generalValue = 103, RULE_objIdentifierA = 104, 
		RULE_objIdentifierB = 105;
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
			setState(212);
			fileContent();
			setState(213);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				sentence();
				setState(217);
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Newline);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				breakFor();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
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
			setState(238);
			match(Break);
			setState(239);
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
			setState(241);
			match(Next);
			setState(242);
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
			setState(244);
			match(Use);
			setState(245);
			useValue();
			setState(246);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				useString();
				setState(250);
				match(Separator);
				setState(251);
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
			setState(255);
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
			setState(257);
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
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(Var);
				setState(260);
				variableMembers();
				setState(261);
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
				setState(263);
				methodVisibility();
				setState(264);
				match(Var);
				setState(265);
				variableMembers();
				setState(266);
				match(End);
				}
				break;
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				variableMembers();
				setState(269);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(Var);
				setState(274);
				variableMembers();
				setState(275);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				methodPerm();
				setState(278);
				match(Var);
				setState(279);
				variableMembers();
				setState(280);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(Static);
				setState(283);
				match(Var);
				setState(284);
				variableMembers();
				setState(285);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				methodPerm();
				setState(288);
				match(Static);
				setState(289);
				match(Var);
				setState(290);
				variableMembers();
				setState(291);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(Final);
				setState(294);
				methodPerm();
				setState(295);
				match(Static);
				setState(296);
				match(Var);
				setState(297);
				variableMembers();
				setState(298);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(Final);
				setState(301);
				methodPerm();
				setState(302);
				match(Var);
				setState(303);
				variableMembers();
				setState(304);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(Final);
				setState(307);
				match(Var);
				setState(308);
				variableMembers();
				setState(309);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(Final);
				setState(312);
				match(Static);
				setState(313);
				match(Var);
				setState(314);
				variableMembers();
				setState(315);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
				variableMembers();
				setState(318);
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
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				variableDefinition();
				setState(324);
				match(Separator);
				setState(325);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(Identifier);
				setState(330);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				objIdentifierA();
				setState(332);
				match(Point);
				setState(333);
				objIdentifierB();
				setState(334);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				objIdentifierA();
				setState(337);
				match(TwoTwoPoint);
				setState(338);
				objIdentifierB();
				setState(339);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				arrayAccessElements();
				setState(342);
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
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(TypeSpec);
				setState(349);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				match(New);
				setState(353);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(TypeSpec);
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				match(New);
				setState(357);
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
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(OpenArIndex);
				setState(361);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(OpenArIndex);
				setState(363);
				indexArrayElements();
				setState(364);
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
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				generalValue();
				setState(370);
				match(Separator);
				setState(371);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(OpenBlock);
				setState(376);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(OpenBlock);
				setState(378);
				associativeArrayElements();
				setState(379);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(Identifier);
				setState(384);
				match(TwoPoint);
				setState(385);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(Identifier);
				setState(387);
				match(TwoPoint);
				setState(388);
				generalValue();
				setState(389);
				match(Separator);
				setState(390);
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
			setState(394);
			match(OpenOp);
			setState(395);
			operationElements();
			setState(396);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				operationValue();
				setState(400);
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
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				functionCall();
				setState(406);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				functionCall();
				setState(409);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				functionCall();
				setState(412);
				match(TypeSpec);
				setState(413);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				match(Identifier);
				setState(417);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				match(Identifier);
				setState(419);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420);
				match(Identifier);
				setState(421);
				match(TypeSpec);
				setState(422);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				firstIncDec();
				setState(424);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(426);
				firstIncDec();
				setState(427);
				match(Identifier);
				setState(428);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(430);
				firstIncDec();
				setState(431);
				match(Identifier);
				setState(432);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(434);
				firstIncDec();
				setState(435);
				match(Identifier);
				setState(436);
				match(TypeSpec);
				setState(437);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(439);
				match(Identifier);
				setState(440);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(441);
				match(Identifier);
				setState(442);
				lastIncDec();
				setState(443);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(445);
				match(Identifier);
				setState(446);
				lastIncDec();
				setState(447);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(449);
				match(Identifier);
				setState(450);
				lastIncDec();
				setState(451);
				match(TypeSpec);
				setState(452);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(454);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(455);
				match(Integer);
				setState(456);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(457);
				match(Integer);
				setState(458);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(459);
				match(Integer);
				setState(460);
				match(TypeSpec);
				setState(461);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(462);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(463);
				match(Float);
				setState(464);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(465);
				match(Float);
				setState(466);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(467);
				match(Float);
				setState(468);
				match(TypeSpec);
				setState(469);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(470);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(471);
				operationBlock();
				setState(472);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(474);
				operationBlock();
				setState(475);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(477);
				operationBlock();
				setState(478);
				match(TypeSpec);
				setState(479);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(481);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(482);
				arrayAccessElements();
				setState(483);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(485);
				arrayAccessElements();
				setState(486);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(488);
				arrayAccessElements();
				setState(489);
				match(TypeSpec);
				setState(490);
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
			setState(494);
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
			setState(496);
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
			setState(498);
			functionCall();
			setState(499);
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
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(Identifier);
				setState(502);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(Identifier);
				setState(504);
				match(Point);
				setState(505);
				identifierB();
				setState(506);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(Identifier);
				setState(509);
				match(TwoTwoPoint);
				setState(510);
				identifierB();
				setState(511);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				methodCascadingModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				arrayAccessElements();
				setState(515);
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
			setState(519);
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
		enterRule(_localctx, 54, RULE_methodCascadingModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(Identifier);
			setState(522);
			match(Point);
			setState(523);
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
		enterRule(_localctx, 56, RULE_functionCallCascading);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				functionCallCascadingItem();
				setState(527);
				match(Point);
				setState(528);
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
		enterRule(_localctx, 58, RULE_functionCallCascadingItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Identifier);
			setState(533);
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
		enterRule(_localctx, 60, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
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
			setState(537);
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
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(OpenOp);
				setState(540);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(OpenOp);
				setState(542);
				functionCallParamElements();
				setState(543);
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
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				generalValue();
				setState(549);
				match(Separator);
				setState(550);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				operationElements();
				setState(554);
				match(Separator);
				setState(555);
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
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				conditionalExpressionStructBlock();
				setState(561);
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
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				ifElementUnique();
				setState(567);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				ifElementUnique();
				setState(570);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				ifElementUnique();
				setState(573);
				elifElements();
				setState(574);
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
			setState(578);
			match(If);
			setState(579);
			conditionalExpressionItems();
			setState(580);
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
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				elifElementUnique();
				setState(584);
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
			setState(588);
			match(Elif);
			setState(589);
			conditionalExpressionItems();
			setState(590);
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
			setState(592);
			match(Else);
			setState(593);
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
			setState(595);
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
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(OpenBlock);
				setState(598);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(OpenBlock);
				setState(600);
				conditionalBlockElsItems();
				setState(601);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
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
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				sentence();
				setState(611);
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
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				conditionExpValue();
				setState(617);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				conditionExpBlock();
				setState(621);
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
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(Not);
				setState(626);
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
				setState(627);
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
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(Not);
				setState(632);
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
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				conditionExpBlockItem();
				setState(637);
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
				setState(639);
				conditionExpBlockItem();
				setState(640);
				match(TypeSpec);
				setState(641);
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
			setState(645);
			match(OpenOp);
			setState(646);
			conditionalExpressionElements();
			setState(647);
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
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				firstIncDec();
				setState(650);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				firstIncDec();
				setState(653);
				match(Identifier);
				setState(654);
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
				setState(656);
				firstIncDec();
				setState(657);
				match(Identifier);
				setState(658);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(660);
				firstIncDec();
				setState(661);
				match(Identifier);
				setState(662);
				match(TypeSpec);
				setState(663);
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
				setState(665);
				match(Identifier);
				setState(666);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(Identifier);
				setState(668);
				lastIncDec();
				setState(669);
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
				setState(671);
				match(Identifier);
				setState(672);
				lastIncDec();
				setState(673);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				match(Identifier);
				setState(676);
				lastIncDec();
				setState(677);
				match(TypeSpec);
				setState(678);
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
				setState(680);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(681);
				match(Integer);
				setState(682);
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
				setState(683);
				match(Integer);
				setState(684);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(685);
				match(Integer);
				setState(686);
				match(TypeSpec);
				setState(687);
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
				setState(688);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(689);
				match(Float);
				setState(690);
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
				setState(691);
				match(Float);
				setState(692);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(693);
				match(Float);
				setState(694);
				match(TypeSpec);
				setState(695);
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
				setState(696);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(697);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(698);
				functionCall();
				setState(699);
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
				setState(701);
				functionCall();
				setState(702);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(704);
				functionCall();
				setState(705);
				match(TypeSpec);
				setState(706);
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
				setState(708);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(709);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(712);
				operationBlock();
				setState(713);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(715);
				operationBlock();
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
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(719);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(720);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(722);
				match(Identifier);
				setState(723);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(724);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(727);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(728);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(731);
				arrayAccessElements();
				setState(732);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(734);
				arrayAccessElements();
				setState(735);
				match(TypeSpec);
				setState(736);
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
			setState(740);
			identifierAttrFn();
			setState(741);
			match(Attr);
			setState(742);
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
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
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
			setState(748);
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
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				functionCall();
				setState(755);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				functionCall();
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
			}
		}
		catch (RecognitionException re) {
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
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				loopExpressionItems();
				setState(765);
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
			setState(769);
			match(For);
			setState(770);
			loopExpression();
			setState(771);
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
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
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(OpenOp);
				setState(779);
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
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(OpenOp);
				setState(784);
				loopOneMembers();
				setState(785);
				endOne();
				setState(786);
				loopTwoMembers();
				setState(787);
				endTwo();
				setState(788);
				loopThreeMembers();
				setState(789);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				loopOneMembers();
				setState(792);
				endOne();
				setState(793);
				loopTwoMembers();
				setState(794);
				endTwo();
				setState(795);
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
			setState(799);
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
			setState(801);
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
			setState(803);
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
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(Var);
				setState(807);
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
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
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
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				operationElements();
				setState(821);
				match(Separator);
				setState(822);
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
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				sentence();
				setState(828);
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
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(OpenBlock);
				setState(833);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				match(OpenBlock);
				setState(835);
				loopBlockElements();
				setState(836);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(840);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(841);
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
			setState(844);
			match(Ret);
			setState(845);
			retValues();
			setState(846);
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
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
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
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				functionsModes();
				setState(853);
				match(OpenBlock);
				setState(854);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				functionsModes();
				setState(857);
				match(OpenBlock);
				setState(858);
				functionCodeBlock();
				setState(859);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				functionMethodsModes();
				setState(862);
				match(OpenBlock);
				setState(863);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				functionMethodsModes();
				setState(866);
				match(OpenBlock);
				setState(867);
				functionCodeBlock();
				setState(868);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				constructClassMethod();
				setState(871);
				match(OpenBlock);
				setState(872);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(874);
				constructClassMethod();
				setState(875);
				match(OpenBlock);
				setState(876);
				functionCodeBlock();
				setState(877);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(879);
				interfaceMethod();
				setState(880);
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
			setState(884);
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
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				match(Function);
				setState(887);
				match(Identifier);
				setState(888);
				match(OpenOp);
				setState(889);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(Function);
				setState(891);
				match(Identifier);
				setState(892);
				match(OpenOp);
				setState(893);
				match(CloseOp);
				setState(894);
				match(ArrowRight);
				setState(897);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(895);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(896);
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
				setState(899);
				match(Function);
				setState(900);
				match(Identifier);
				setState(901);
				match(OpenOp);
				setState(902);
				functionParams();
				setState(903);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				match(Function);
				setState(906);
				match(Identifier);
				setState(907);
				match(OpenOp);
				setState(908);
				functionParams();
				setState(909);
				match(CloseOp);
				setState(910);
				match(ArrowRight);
				setState(913);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(911);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(912);
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
			setState(917);
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
			setState(919);
			methodVisibility();
			setState(920);
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
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				methodPerm();
				setState(923);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(Static);
				setState(926);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				methodPerm();
				setState(928);
				match(Static);
				setState(929);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
				match(Final);
				setState(932);
				methodPerm();
				setState(933);
				match(Static);
				setState(934);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(936);
				match(Final);
				setState(937);
				methodPerm();
				setState(938);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(940);
				match(Final);
				setState(941);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(942);
				match(Final);
				setState(943);
				match(Static);
				setState(944);
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
			setState(947);
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
			setState(949);
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
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				visibilityItems();
				setState(953);
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
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				match(Identifier);
				setState(958);
				match(OpenOp);
				setState(959);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(Identifier);
				setState(961);
				match(OpenOp);
				setState(962);
				functionParams();
				setState(963);
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
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
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
				setState(968);
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
			setState(971);
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
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				sentence();
				setState(975);
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
			setState(979);
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
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				functionParamElements();
				setState(983);
				match(Separator);
				setState(984);
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
			setState(988);
			match(Identifier);
			setState(989);
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
		enterRule(_localctx, 170, RULE_oopGeneral);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
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
		enterRule(_localctx, 172, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
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
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				match(Interface);
				setState(999);
				match(Identifier);
				setState(1000);
				match(OpenBlock);
				setState(1001);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(Interface);
				setState(1003);
				match(Identifier);
				setState(1004);
				match(OpenBlock);
				setState(1005);
				interfaceCodeBlock();
				setState(1006);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				match(Interface);
				setState(1009);
				match(Identifier);
				setState(1010);
				match(Extends);
				setState(1011);
				identifierB();
				setState(1012);
				match(OpenBlock);
				setState(1013);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1015);
				match(Interface);
				setState(1016);
				match(Identifier);
				setState(1017);
				match(Extends);
				setState(1018);
				identifierB();
				setState(1019);
				match(OpenBlock);
				setState(1020);
				interfaceCodeBlock();
				setState(1021);
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
			setState(1025);
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
			setState(1027);
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
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				match(Abstract);
				setState(1030);
				match(Identifier);
				setState(1031);
				match(OpenBlock);
				setState(1032);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(Abstract);
				setState(1034);
				match(Identifier);
				setState(1035);
				match(OpenBlock);
				setState(1036);
				abstractCodeBlock();
				setState(1037);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				match(Abstract);
				setState(1040);
				match(Identifier);
				setState(1041);
				match(Extends);
				setState(1042);
				identifierB();
				setState(1043);
				match(OpenBlock);
				setState(1044);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				match(Abstract);
				setState(1047);
				match(Identifier);
				setState(1048);
				match(Extends);
				setState(1049);
				identifierB();
				setState(1050);
				match(OpenBlock);
				setState(1051);
				abstractCodeBlock();
				setState(1052);
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
			setState(1056);
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
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				classModes();
				setState(1059);
				match(OpenBlock);
				setState(1060);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				classModes();
				setState(1063);
				match(OpenBlock);
				setState(1064);
				classCodeBlock();
				setState(1065);
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
			setState(1069);
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
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				match(Class);
				setState(1072);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(Class);
				setState(1074);
				match(Identifier);
				setState(1075);
				match(Extends);
				setState(1076);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				match(Class);
				setState(1078);
				match(Identifier);
				setState(1079);
				match(Implements);
				setState(1080);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				match(Class);
				setState(1082);
				match(Identifier);
				setState(1083);
				match(Extends);
				setState(1084);
				identifierB();
				setState(1085);
				match(Implements);
				setState(1086);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1088);
				match(Final);
				setState(1089);
				match(Class);
				setState(1090);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1091);
				match(Final);
				setState(1092);
				match(Class);
				setState(1093);
				match(Identifier);
				setState(1094);
				match(Extends);
				setState(1095);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1096);
				match(Final);
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1101);
				match(Final);
				setState(1102);
				match(Class);
				setState(1103);
				match(Identifier);
				setState(1104);
				match(Extends);
				setState(1105);
				identifierB();
				setState(1106);
				match(Implements);
				setState(1107);
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
			setState(1111);
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
		enterRule(_localctx, 192, RULE_arrayAccessElements);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				arrayAccessElementsItems();
				setState(1115);
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
		enterRule(_localctx, 194, RULE_arrayAccessElementsItems);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(Identifier);
				setState(1121);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				match(Identifier);
				setState(1123);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				match(Identifier);
				setState(1125);
				accessBlockAr();
				setState(1126);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1128);
				firstIncDec();
				setState(1129);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131);
				match(Identifier);
				setState(1132);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1133);
				firstIncDec();
				setState(1134);
				match(Identifier);
				setState(1135);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1137);
				match(Identifier);
				setState(1138);
				accessBlockAr();
				setState(1139);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1141);
				match(Identifier);
				setState(1142);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1143);
				match(Identifier);
				setState(1144);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1145);
				match(Identifier);
				setState(1146);
				accessBlockAr();
				setState(1147);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1149);
				match(Identifier);
				setState(1150);
				accessBlockAr();
				setState(1151);
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
		enterRule(_localctx, 196, RULE_accessBlockAr);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(OpenArIndex);
				setState(1156);
				arrayIndexAccess();
				setState(1157);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				match(OpenArIndex);
				setState(1160);
				arrayIndexAccess();
				setState(1161);
				match(CloseArIndex);
				setState(1162);
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
		enterRule(_localctx, 198, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
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
		enterRule(_localctx, 200, RULE_anonymousFunction);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				match(OpenOp);
				setState(1169);
				anFnItems();
				setState(1170);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(OpenOp);
				setState(1173);
				anFnItems();
				setState(1174);
				match(CloseOp);
				setState(1175);
				match(OpenOp);
				setState(1176);
				match(CloseOp);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				match(OpenOp);
				setState(1179);
				anFnItems();
				setState(1180);
				match(CloseOp);
				setState(1181);
				match(OpenOp);
				setState(1182);
				operationElements();
				setState(1183);
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
		enterRule(_localctx, 202, RULE_anFnItems);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				functionsModesFn();
				setState(1188);
				match(OpenBlock);
				setState(1189);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				functionsModesFn();
				setState(1192);
				match(OpenBlock);
				setState(1193);
				functionCodeBlock();
				setState(1194);
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
		enterRule(_localctx, 204, RULE_functionsModesFn);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				match(Function);
				setState(1199);
				match(OpenOp);
				setState(1200);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(Function);
				setState(1202);
				match(OpenOp);
				setState(1203);
				match(CloseOp);
				setState(1204);
				match(ArrowRight);
				setState(1207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1205);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1206);
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
				setState(1209);
				match(Function);
				setState(1210);
				match(OpenOp);
				setState(1211);
				functionParams();
				setState(1212);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				match(Function);
				setState(1215);
				match(OpenOp);
				setState(1216);
				functionParams();
				setState(1217);
				match(CloseOp);
				setState(1218);
				match(ArrowRight);
				setState(1221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1219);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(1220);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexArrayContext indexArray() {
			return getRuleContext(IndexArrayContext.class,0);
		}
		public AssociativeArrayContext associativeArray() {
			return getRuleContext(AssociativeArrayContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
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
		enterRule(_localctx, 206, RULE_generalValue);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(Identifier);
				setState(1227);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1229);
				match(Integer);
				setState(1230);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1231);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1232);
				match(Float);
				setState(1233);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1234);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1235);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1236);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1237);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1238);
				operationElements();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1239);
				objIdentifierA();
				setState(1240);
				match(Point);
				setState(1241);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1243);
				objIdentifierA();
				setState(1244);
				match(TwoTwoPoint);
				setState(1245);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1247);
				arrayAccessElements();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1248);
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
		enterRule(_localctx, 208, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
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
		enterRule(_localctx, 210, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u04ea\4\2\t\2"+
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
		"k\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00df\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00ea\n\4\3\5\3\5\3\5\5\5\u00ef\n\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0100\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0112\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0143\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u014a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u015b\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0169\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0171\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0178\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0180\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u018b\n\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\5\26\u0195\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ef\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0208\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0215\n\36\3\37\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0224\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0230\n#\3$\3$\3$\3$\5$\u0236\n$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0243\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u024d\n\'\3(\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0262\n+\3,\3,\3"+
		",\3,\5,\u0268\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0272\n-\3.\3.\3.\5.\u0277"+
		"\n.\3/\3/\3/\5/\u027c\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0286\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02e5\n\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u02ed\n\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02fc\n\66\3\67\3\67\3\67"+
		"\3\67\5\67\u0302\n\67\38\38\38\38\39\39\39\59\u030b\n9\3:\3:\3:\5:\u0310"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0320\n;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3?\3?\5?\u032c\n?\3@\3@\5@\u0330\n@\3A\3A\5A\u0334\nA\3B"+
		"\3B\3B\3B\3B\5B\u033b\nB\3C\3C\3C\3C\5C\u0341\nC\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u034d\nD\3E\3E\3E\3E\3F\3F\5F\u0355\nF\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\5G\u0375\nG\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0384\nI\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0394\nI\5I\u0396\nI\3J\3J"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u03b4\nL\3M\3M\3N\3N\3O\3O\3O\3O\5O\u03be\nO\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\5P\u03c8\nP\3Q\3Q\5Q\u03cc\nQ\3R\3R\3S\3S\3S\3S\5S\u03d4"+
		"\nS\3T\3T\3U\3U\3U\3U\3U\5U\u03dd\nU\3V\3V\3V\3W\3W\3W\5W\u03e5\nW\3X"+
		"\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\5Y\u0402\nY\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0421"+
		"\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u042e\n^\3_\3_\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0458\n`\3a\3a\3b\3b\3b\3b\5b\u0460"+
		"\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0484\nc\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\5d\u048f\nd\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\5f\u04a4\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u04af\ng\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\5h\u04ba\nh\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04c8"+
		"\nh\5h\u04ca\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\5i\u04e4\ni\3j\3j\3k\3k\3k\2\2l\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\2\6\4\2\32\32&&\3\2%"+
		"&\3\2\13\r\3\2\13\17\2\u055a\2\u00d6\3\2\2\2\4\u00de\3\2\2\2\6\u00e9\3"+
		"\2\2\2\b\u00ee\3\2\2\2\n\u00f0\3\2\2\2\f\u00f3\3\2\2\2\16\u00f6\3\2\2"+
		"\2\20\u00ff\3\2\2\2\22\u0101\3\2\2\2\24\u0103\3\2\2\2\26\u0111\3\2\2\2"+
		"\30\u0142\3\2\2\2\32\u0149\3\2\2\2\34\u015a\3\2\2\2\36\u0168\3\2\2\2 "+
		"\u0170\3\2\2\2\"\u0177\3\2\2\2$\u017f\3\2\2\2&\u018a\3\2\2\2(\u018c\3"+
		"\2\2\2*\u0194\3\2\2\2,\u01ee\3\2\2\2.\u01f0\3\2\2\2\60\u01f2\3\2\2\2\62"+
		"\u01f4\3\2\2\2\64\u0207\3\2\2\2\66\u0209\3\2\2\28\u020b\3\2\2\2:\u0214"+
		"\3\2\2\2<\u0216\3\2\2\2>\u0219\3\2\2\2@\u021b\3\2\2\2B\u0223\3\2\2\2D"+
		"\u022f\3\2\2\2F\u0235\3\2\2\2H\u0242\3\2\2\2J\u0244\3\2\2\2L\u024c\3\2"+
		"\2\2N\u024e\3\2\2\2P\u0252\3\2\2\2R\u0255\3\2\2\2T\u0261\3\2\2\2V\u0267"+
		"\3\2\2\2X\u0271\3\2\2\2Z\u0276\3\2\2\2\\\u027b\3\2\2\2^\u0285\3\2\2\2"+
		"`\u0287\3\2\2\2b\u02e4\3\2\2\2d\u02e6\3\2\2\2f\u02ec\3\2\2\2h\u02ee\3"+
		"\2\2\2j\u02fb\3\2\2\2l\u0301\3\2\2\2n\u0303\3\2\2\2p\u030a\3\2\2\2r\u030f"+
		"\3\2\2\2t\u031f\3\2\2\2v\u0321\3\2\2\2x\u0323\3\2\2\2z\u0325\3\2\2\2|"+
		"\u032b\3\2\2\2~\u032f\3\2\2\2\u0080\u0333\3\2\2\2\u0082\u033a\3\2\2\2"+
		"\u0084\u0340\3\2\2\2\u0086\u034c\3\2\2\2\u0088\u034e\3\2\2\2\u008a\u0354"+
		"\3\2\2\2\u008c\u0374\3\2\2\2\u008e\u0376\3\2\2\2\u0090\u0395\3\2\2\2\u0092"+
		"\u0397\3\2\2\2\u0094\u0399\3\2\2\2\u0096\u03b3\3\2\2\2\u0098\u03b5\3\2"+
		"\2\2\u009a\u03b7\3\2\2\2\u009c\u03bd\3\2\2\2\u009e\u03c7\3\2\2\2\u00a0"+
		"\u03cb\3\2\2\2\u00a2\u03cd\3\2\2\2\u00a4\u03d3\3\2\2\2\u00a6\u03d5\3\2"+
		"\2\2\u00a8\u03dc\3\2\2\2\u00aa\u03de\3\2\2\2\u00ac\u03e4\3\2\2\2\u00ae"+
		"\u03e6\3\2\2\2\u00b0\u0401\3\2\2\2\u00b2\u0403\3\2\2\2\u00b4\u0405\3\2"+
		"\2\2\u00b6\u0420\3\2\2\2\u00b8\u0422\3\2\2\2\u00ba\u042d\3\2\2\2\u00bc"+
		"\u042f\3\2\2\2\u00be\u0457\3\2\2\2\u00c0\u0459\3\2\2\2\u00c2\u045f\3\2"+
		"\2\2\u00c4\u0483\3\2\2\2\u00c6\u048e\3\2\2\2\u00c8\u0490\3\2\2\2\u00ca"+
		"\u04a3\3\2\2\2\u00cc\u04ae\3\2\2\2\u00ce\u04c9\3\2\2\2\u00d0\u04e3\3\2"+
		"\2\2\u00d2\u04e5\3\2\2\2\u00d4\u04e7\3\2\2\2\u00d6\u00d7\5\4\3\2\u00d7"+
		"\u00d8\7\2\2\3\u00d8\3\3\2\2\2\u00d9\u00df\5\6\4\2\u00da\u00db\5\6\4\2"+
		"\u00db\u00dc\5\4\3\2\u00dc\u00df\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d9"+
		"\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\5\3\2\2\2\u00e0"+
		"\u00ea\5\b\5\2\u00e1\u00ea\5\16\b\2\u00e2\u00ea\5\24\13\2\u00e3\u00ea"+
		"\5\62\32\2\u00e4\u00ea\5F$\2\u00e5\u00ea\5l\67\2\u00e6\u00ea\5\u008cG"+
		"\2\u00e7\u00ea\5\u0088E\2\u00e8\u00ea\5\u00acW\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2"+
		"\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\7\3\2\2\2\u00eb\u00ef\7\60\2\2\u00ec\u00ef\5\n\6"+
		"\2\u00ed\u00ef\5\f\7\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\t\3\2\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\7\31\2\2\u00f2"+
		"\13\3\2\2\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5\7\31\2\2\u00f5\r\3\2\2\2"+
		"\u00f6\u00f7\7\3\2\2\u00f7\u00f8\5\20\t\2\u00f8\u00f9\7\31\2\2\u00f9\17"+
		"\3\2\2\2\u00fa\u0100\5\22\n\2\u00fb\u00fc\5\22\n\2\u00fc\u00fd\7\36\2"+
		"\2\u00fd\u00fe\5\20\t\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff"+
		"\u00fb\3\2\2\2\u0100\21\3\2\2\2\u0101\u0102\7,\2\2\u0102\23\3\2\2\2\u0103"+
		"\u0104\5\26\f\2\u0104\25\3\2\2\2\u0105\u0106\7\4\2\2\u0106\u0107\5\32"+
		"\16\2\u0107\u0108\7\31\2\2\u0108\u0112\3\2\2\2\u0109\u010a\5\u009cO\2"+
		"\u010a\u010b\7\4\2\2\u010b\u010c\5\32\16\2\u010c\u010d\7\31\2\2\u010d"+
		"\u0112\3\2\2\2\u010e\u010f\5\32\16\2\u010f\u0110\7\31\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u010e\3\2\2\2\u0112"+
		"\27\3\2\2\2\u0113\u0114\7\4\2\2\u0114\u0115\5\32\16\2\u0115\u0116\7\31"+
		"\2\2\u0116\u0143\3\2\2\2\u0117\u0118\5\u0098M\2\u0118\u0119\7\4\2\2\u0119"+
		"\u011a\5\32\16\2\u011a\u011b\7\31\2\2\u011b\u0143\3\2\2\2\u011c\u011d"+
		"\7\16\2\2\u011d\u011e\7\4\2\2\u011e\u011f\5\32\16\2\u011f\u0120\7\31\2"+
		"\2\u0120\u0143\3\2\2\2\u0121\u0122\5\u0098M\2\u0122\u0123\7\16\2\2\u0123"+
		"\u0124\7\4\2\2\u0124\u0125\5\32\16\2\u0125\u0126\7\31\2\2\u0126\u0143"+
		"\3\2\2\2\u0127\u0128\7\17\2\2\u0128\u0129\5\u0098M\2\u0129\u012a\7\16"+
		"\2\2\u012a\u012b\7\4\2\2\u012b\u012c\5\32\16\2\u012c\u012d\7\31\2\2\u012d"+
		"\u0143\3\2\2\2\u012e\u012f\7\17\2\2\u012f\u0130\5\u0098M\2\u0130\u0131"+
		"\7\4\2\2\u0131\u0132\5\32\16\2\u0132\u0133\7\31\2\2\u0133\u0143\3\2\2"+
		"\2\u0134\u0135\7\17\2\2\u0135\u0136\7\4\2\2\u0136\u0137\5\32\16\2\u0137"+
		"\u0138\7\31\2\2\u0138\u0143\3\2\2\2\u0139\u013a\7\17\2\2\u013a\u013b\7"+
		"\16\2\2\u013b\u013c\7\4\2\2\u013c\u013d\5\32\16\2\u013d\u013e\7\31\2\2"+
		"\u013e\u0143\3\2\2\2\u013f\u0140\5\32\16\2\u0140\u0141\7\31\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0113\3\2\2\2\u0142\u0117\3\2\2\2\u0142\u011c\3\2"+
		"\2\2\u0142\u0121\3\2\2\2\u0142\u0127\3\2\2\2\u0142\u012e\3\2\2\2\u0142"+
		"\u0134\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013f\3\2\2\2\u0143\31\3\2\2"+
		"\2\u0144\u014a\5\34\17\2\u0145\u0146\5\34\17\2\u0146\u0147\7\36\2\2\u0147"+
		"\u0148\5\32\16\2\u0148\u014a\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3"+
		"\2\2\2\u014a\33\3\2\2\2\u014b\u014c\7)\2\2\u014c\u015b\5\36\20\2\u014d"+
		"\u014e\5\u00d2j\2\u014e\u014f\7\33\2\2\u014f\u0150\5\u00d4k\2\u0150\u0151"+
		"\5\36\20\2\u0151\u015b\3\2\2\2\u0152\u0153\5\u00d2j\2\u0153\u0154\7\35"+
		"\2\2\u0154\u0155\5\u00d4k\2\u0155\u0156\5\36\20\2\u0156\u015b\3\2\2\2"+
		"\u0157\u0158\5\u00c2b\2\u0158\u0159\5\36\20\2\u0159\u015b\3\2\2\2\u015a"+
		"\u014b\3\2\2\2\u015a\u014d\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0157\3\2"+
		"\2\2\u015b\35\3\2\2\2\u015c\u015d\t\2\2\2\u015d\u0169\5\u00d0i\2\u015e"+
		"\u015f\7+\2\2\u015f\u0160\t\2\2\2\u0160\u0169\5\u00d0i\2\u0161\u0162\t"+
		"\2\2\2\u0162\u0163\7\25\2\2\u0163\u0169\5\u00d0i\2\u0164\u0165\7+\2\2"+
		"\u0165\u0166\t\2\2\2\u0166\u0167\7\25\2\2\u0167\u0169\5\u00d0i\2\u0168"+
		"\u015c\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0164\3\2"+
		"\2\2\u0169\37\3\2\2\2\u016a\u016b\7\37\2\2\u016b\u0171\7 \2\2\u016c\u016d"+
		"\7\37\2\2\u016d\u016e\5\"\22\2\u016e\u016f\7 \2\2\u016f\u0171\3\2\2\2"+
		"\u0170\u016a\3\2\2\2\u0170\u016c\3\2\2\2\u0171!\3\2\2\2\u0172\u0178\5"+
		"\u00d0i\2\u0173\u0174\5\u00d0i\2\u0174\u0175\7\36\2\2\u0175\u0176\5\""+
		"\22\2\u0176\u0178\3\2\2\2\u0177\u0172\3\2\2\2\u0177\u0173\3\2\2\2\u0178"+
		"#\3\2\2\2\u0179\u017a\7!\2\2\u017a\u0180\7\"\2\2\u017b\u017c\7!\2\2\u017c"+
		"\u017d\5&\24\2\u017d\u017e\7\"\2\2\u017e\u0180\3\2\2\2\u017f\u0179\3\2"+
		"\2\2\u017f\u017b\3\2\2\2\u0180%\3\2\2\2\u0181\u0182\7)\2\2\u0182\u0183"+
		"\7\34\2\2\u0183\u018b\5\u00d0i\2\u0184\u0185\7)\2\2\u0185\u0186\7\34\2"+
		"\2\u0186\u0187\5\u00d0i\2\u0187\u0188\7\36\2\2\u0188\u0189\5&\24\2\u0189"+
		"\u018b\3\2\2\2\u018a\u0181\3\2\2\2\u018a\u0184\3\2\2\2\u018b\'\3\2\2\2"+
		"\u018c\u018d\7#\2\2\u018d\u018e\5*\26\2\u018e\u018f\7$\2\2\u018f)\3\2"+
		"\2\2\u0190\u0195\5,\27\2\u0191\u0192\5,\27\2\u0192\u0193\5*\26\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0190\3\2\2\2\u0194\u0191\3\2\2\2\u0195+\3\2\2\2"+
		"\u0196\u01ef\5\64\33\2\u0197\u0198\5\64\33\2\u0198\u0199\7%\2\2\u0199"+
		"\u01ef\3\2\2\2\u019a\u019b\5\64\33\2\u019b\u019c\7+\2\2\u019c\u01ef\3"+
		"\2\2\2\u019d\u019e\5\64\33\2\u019e\u019f\7+\2\2\u019f\u01a0\7%\2\2\u01a0"+
		"\u01ef\3\2\2\2\u01a1\u01ef\7)\2\2\u01a2\u01a3\7)\2\2\u01a3\u01ef\7%\2"+
		"\2\u01a4\u01a5\7)\2\2\u01a5\u01ef\7+\2\2\u01a6\u01a7\7)\2\2\u01a7\u01a8"+
		"\7+\2\2\u01a8\u01ef\7%\2\2\u01a9\u01aa\5.\30\2\u01aa\u01ab\7)\2\2\u01ab"+
		"\u01ef\3\2\2\2\u01ac\u01ad\5.\30\2\u01ad\u01ae\7)\2\2\u01ae\u01af\7%\2"+
		"\2\u01af\u01ef\3\2\2\2\u01b0\u01b1\5.\30\2\u01b1\u01b2\7)\2\2\u01b2\u01b3"+
		"\7+\2\2\u01b3\u01ef\3\2\2\2\u01b4\u01b5\5.\30\2\u01b5\u01b6\7)\2\2\u01b6"+
		"\u01b7\7+\2\2\u01b7\u01b8\7%\2\2\u01b8\u01ef\3\2\2\2\u01b9\u01ba\7)\2"+
		"\2\u01ba\u01ef\5\60\31\2\u01bb\u01bc\7)\2\2\u01bc\u01bd\5\60\31\2\u01bd"+
		"\u01be\7%\2\2\u01be\u01ef\3\2\2\2\u01bf\u01c0\7)\2\2\u01c0\u01c1\5\60"+
		"\31\2\u01c1\u01c2\7+\2\2\u01c2\u01ef\3\2\2\2\u01c3\u01c4\7)\2\2\u01c4"+
		"\u01c5\5\60\31\2\u01c5\u01c6\7+\2\2\u01c6\u01c7\7%\2\2\u01c7\u01ef\3\2"+
		"\2\2\u01c8\u01ef\7-\2\2\u01c9\u01ca\7-\2\2\u01ca\u01ef\7%\2\2\u01cb\u01cc"+
		"\7-\2\2\u01cc\u01ef\7+\2\2\u01cd\u01ce\7-\2\2\u01ce\u01cf\7+\2\2\u01cf"+
		"\u01ef\7%\2\2\u01d0\u01ef\7.\2\2\u01d1\u01d2\7.\2\2\u01d2\u01ef\7%\2\2"+
		"\u01d3\u01d4\7.\2\2\u01d4\u01ef\7+\2\2\u01d5\u01d6\7.\2\2\u01d6\u01d7"+
		"\7+\2\2\u01d7\u01ef\7%\2\2\u01d8\u01ef\5(\25\2\u01d9\u01da\5(\25\2\u01da"+
		"\u01db\7%\2\2\u01db\u01ef\3\2\2\2\u01dc\u01dd\5(\25\2\u01dd\u01de\7+\2"+
		"\2\u01de\u01ef\3\2\2\2\u01df\u01e0\5(\25\2\u01e0\u01e1\7+\2\2\u01e1\u01e2"+
		"\7%\2\2\u01e2\u01ef\3\2\2\2\u01e3\u01ef\5\u00c2b\2\u01e4\u01e5\5\u00c2"+
		"b\2\u01e5\u01e6\7%\2\2\u01e6\u01ef\3\2\2\2\u01e7\u01e8\5\u00c2b\2\u01e8"+
		"\u01e9\7+\2\2\u01e9\u01ef\3\2\2\2\u01ea\u01eb\5\u00c2b\2\u01eb\u01ec\7"+
		"+\2\2\u01ec\u01ed\7%\2\2\u01ed\u01ef\3\2\2\2\u01ee\u0196\3\2\2\2\u01ee"+
		"\u0197\3\2\2\2\u01ee\u019a\3\2\2\2\u01ee\u019d\3\2\2\2\u01ee\u01a1\3\2"+
		"\2\2\u01ee\u01a2\3\2\2\2\u01ee\u01a4\3\2\2\2\u01ee\u01a6\3\2\2\2\u01ee"+
		"\u01a9\3\2\2\2\u01ee\u01ac\3\2\2\2\u01ee\u01b0\3\2\2\2\u01ee\u01b4\3\2"+
		"\2\2\u01ee\u01b9\3\2\2\2\u01ee\u01bb\3\2\2\2\u01ee\u01bf\3\2\2\2\u01ee"+
		"\u01c3\3\2\2\2\u01ee\u01c8\3\2\2\2\u01ee\u01c9\3\2\2\2\u01ee\u01cb\3\2"+
		"\2\2\u01ee\u01cd\3\2\2\2\u01ee\u01d0\3\2\2\2\u01ee\u01d1\3\2\2\2\u01ee"+
		"\u01d3\3\2\2\2\u01ee\u01d5\3\2\2\2\u01ee\u01d8\3\2\2\2\u01ee\u01d9\3\2"+
		"\2\2\u01ee\u01dc\3\2\2\2\u01ee\u01df\3\2\2\2\u01ee\u01e3\3\2\2\2\u01ee"+
		"\u01e4\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef-\3\2\2\2"+
		"\u01f0\u01f1\7(\2\2\u01f1/\3\2\2\2\u01f2\u01f3\7(\2\2\u01f3\61\3\2\2\2"+
		"\u01f4\u01f5\5\64\33\2\u01f5\u01f6\7\31\2\2\u01f6\63\3\2\2\2\u01f7\u01f8"+
		"\7)\2\2\u01f8\u0208\5B\"\2\u01f9\u01fa\7)\2\2\u01fa\u01fb\7\33\2\2\u01fb"+
		"\u01fc\5> \2\u01fc\u01fd\5B\"\2\u01fd\u0208\3\2\2\2\u01fe\u01ff\7)\2\2"+
		"\u01ff\u0200\7\35\2\2\u0200\u0201\5> \2\u0201\u0202\5B\"\2\u0202\u0208"+
		"\3\2\2\2\u0203\u0208\58\35\2\u0204\u0205\5\u00c2b\2\u0205\u0206\5\66\34"+
		"\2\u0206\u0208\3\2\2\2\u0207\u01f7\3\2\2\2\u0207\u01f9\3\2\2\2\u0207\u01fe"+
		"\3\2\2\2\u0207\u0203\3\2\2\2\u0207\u0204\3\2\2\2\u0208\65\3\2\2\2\u0209"+
		"\u020a\5B\"\2\u020a\67\3\2\2\2\u020b\u020c\7)\2\2\u020c\u020d\7\33\2\2"+
		"\u020d\u020e\5:\36\2\u020e9\3\2\2\2\u020f\u0215\5<\37\2\u0210\u0211\5"+
		"<\37\2\u0211\u0212\7\33\2\2\u0212\u0213\5:\36\2\u0213\u0215\3\2\2\2\u0214"+
		"\u020f\3\2\2\2\u0214\u0210\3\2\2\2\u0215;\3\2\2\2\u0216\u0217\7)\2\2\u0217"+
		"\u0218\5B\"\2\u0218=\3\2\2\2\u0219\u021a\7)\2\2\u021a?\3\2\2\2\u021b\u021c"+
		"\7\33\2\2\u021cA\3\2\2\2\u021d\u021e\7#\2\2\u021e\u0224\7$\2\2\u021f\u0220"+
		"\7#\2\2\u0220\u0221\5D#\2\u0221\u0222\7$\2\2\u0222\u0224\3\2\2\2\u0223"+
		"\u021d\3\2\2\2\u0223\u021f\3\2\2\2\u0224C\3\2\2\2\u0225\u0230\5\u00d0"+
		"i\2\u0226\u0227\5\u00d0i\2\u0227\u0228\7\36\2\2\u0228\u0229\5D#\2\u0229"+
		"\u0230\3\2\2\2\u022a\u0230\5*\26\2\u022b\u022c\5*\26\2\u022c\u022d\7\36"+
		"\2\2\u022d\u022e\5D#\2\u022e\u0230\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u0226"+
		"\3\2\2\2\u022f\u022a\3\2\2\2\u022f\u022b\3\2\2\2\u0230E\3\2\2\2\u0231"+
		"\u0236\5H%\2\u0232\u0233\5H%\2\u0233\u0234\5F$\2\u0234\u0236\3\2\2\2\u0235"+
		"\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0236G\3\2\2\2\u0237\u0243\5J&\2\u0238"+
		"\u0239\5J&\2\u0239\u023a\5L\'\2\u023a\u0243\3\2\2\2\u023b\u023c\5J&\2"+
		"\u023c\u023d\5P)\2\u023d\u0243\3\2\2\2\u023e\u023f\5J&\2\u023f\u0240\5"+
		"L\'\2\u0240\u0241\5P)\2\u0241\u0243\3\2\2\2\u0242\u0237\3\2\2\2\u0242"+
		"\u0238\3\2\2\2\u0242\u023b\3\2\2\2\u0242\u023e\3\2\2\2\u0243I\3\2\2\2"+
		"\u0244\u0245\7\5\2\2\u0245\u0246\5R*\2\u0246\u0247\5T+\2\u0247K\3\2\2"+
		"\2\u0248\u024d\5N(\2\u0249\u024a\5N(\2\u024a\u024b\5L\'\2\u024b\u024d"+
		"\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u0249\3\2\2\2\u024dM\3\2\2\2\u024e"+
		"\u024f\7\6\2\2\u024f\u0250\5R*\2\u0250\u0251\5T+\2\u0251O\3\2\2\2\u0252"+
		"\u0253\7\7\2\2\u0253\u0254\5T+\2\u0254Q\3\2\2\2\u0255\u0256\5X-\2\u0256"+
		"S\3\2\2\2\u0257\u0258\7!\2\2\u0258\u0262\7\"\2\2\u0259\u025a\7!\2\2\u025a"+
		"\u025b\5V,\2\u025b\u025c\7\"\2\2\u025c\u0262\3\2\2\2\u025d\u0262\5F$\2"+
		"\u025e\u0262\5\62\32\2\u025f\u0262\5l\67\2\u0260\u0262\5\u0088E\2\u0261"+
		"\u0257\3\2\2\2\u0261\u0259\3\2\2\2\u0261\u025d\3\2\2\2\u0261\u025e\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262U\3\2\2\2\u0263\u0268"+
		"\5\6\4\2\u0264\u0265\5\6\4\2\u0265\u0266\5V,\2\u0266\u0268\3\2\2\2\u0267"+
		"\u0263\3\2\2\2\u0267\u0264\3\2\2\2\u0268W\3\2\2\2\u0269\u0272\5Z.\2\u026a"+
		"\u026b\5Z.\2\u026b\u026c\5X-\2\u026c\u0272\3\2\2\2\u026d\u0272\5\\/\2"+
		"\u026e\u026f\5\\/\2\u026f\u0270\5X-\2\u0270\u0272\3\2\2\2\u0271\u0269"+
		"\3\2\2\2\u0271\u026a\3\2\2\2\u0271\u026d\3\2\2\2\u0271\u026e\3\2\2\2\u0272"+
		"Y\3\2\2\2\u0273\u0274\7\'\2\2\u0274\u0277\5b\62\2\u0275\u0277\5b\62\2"+
		"\u0276\u0273\3\2\2\2\u0276\u0275\3\2\2\2\u0277[\3\2\2\2\u0278\u027c\5"+
		"^\60\2\u0279\u027a\7\'\2\2\u027a\u027c\5^\60\2\u027b\u0278\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027c]\3\2\2\2\u027d\u0286\5`\61\2\u027e\u027f\5`\61\2"+
		"\u027f\u0280\t\3\2\2\u0280\u0286\3\2\2\2\u0281\u0282\5`\61\2\u0282\u0283"+
		"\7+\2\2\u0283\u0284\t\3\2\2\u0284\u0286\3\2\2\2\u0285\u027d\3\2\2\2\u0285"+
		"\u027e\3\2\2\2\u0285\u0281\3\2\2\2\u0286_\3\2\2\2\u0287\u0288\7#\2\2\u0288"+
		"\u0289\5X-\2\u0289\u028a\7$\2\2\u028aa\3\2\2\2\u028b\u028c\5.\30\2\u028c"+
		"\u028d\7)\2\2\u028d\u02e5\3\2\2\2\u028e\u028f\5.\30\2\u028f\u0290\7)\2"+
		"\2\u0290\u0291\t\3\2\2\u0291\u02e5\3\2\2\2\u0292\u0293\5.\30\2\u0293\u0294"+
		"\7)\2\2\u0294\u0295\7+\2\2\u0295\u02e5\3\2\2\2\u0296\u0297\5.\30\2\u0297"+
		"\u0298\7)\2\2\u0298\u0299\7+\2\2\u0299\u029a\t\3\2\2\u029a\u02e5\3\2\2"+
		"\2\u029b\u029c\7)\2\2\u029c\u02e5\5\60\31\2\u029d\u029e\7)\2\2\u029e\u029f"+
		"\5\60\31\2\u029f\u02a0\t\3\2\2\u02a0\u02e5\3\2\2\2\u02a1\u02a2\7)\2\2"+
		"\u02a2\u02a3\5\60\31\2\u02a3\u02a4\7+\2\2\u02a4\u02e5\3\2\2\2\u02a5\u02a6"+
		"\7)\2\2\u02a6\u02a7\5\60\31\2\u02a7\u02a8\7+\2\2\u02a8\u02a9\t\3\2\2\u02a9"+
		"\u02e5\3\2\2\2\u02aa\u02e5\7-\2\2\u02ab\u02ac\7-\2\2\u02ac\u02e5\t\3\2"+
		"\2\u02ad\u02ae\7-\2\2\u02ae\u02e5\7+\2\2\u02af\u02b0\7-\2\2\u02b0\u02b1"+
		"\7+\2\2\u02b1\u02e5\t\3\2\2\u02b2\u02e5\7.\2\2\u02b3\u02b4\7.\2\2\u02b4"+
		"\u02e5\t\3\2\2\u02b5\u02b6\7.\2\2\u02b6\u02e5\7+\2\2\u02b7\u02b8\7.\2"+
		"\2\u02b8\u02b9\7+\2\2\u02b9\u02e5\t\3\2\2\u02ba\u02e5\5d\63\2\u02bb\u02e5"+
		"\5\64\33\2\u02bc\u02bd\5\64\33\2\u02bd\u02be\t\3\2\2\u02be\u02e5\3\2\2"+
		"\2\u02bf\u02c0\5\64\33\2\u02c0\u02c1\7+\2\2\u02c1\u02e5\3\2\2\2\u02c2"+
		"\u02c3\5\64\33\2\u02c3\u02c4\7+\2\2\u02c4\u02c5\t\3\2\2\u02c5\u02e5\3"+
		"\2\2\2\u02c6\u02e5\5(\25\2\u02c7\u02c8\5(\25\2\u02c8\u02c9\t\3\2\2\u02c9"+
		"\u02e5\3\2\2\2\u02ca\u02cb\5(\25\2\u02cb\u02cc\7+\2\2\u02cc\u02e5\3\2"+
		"\2\2\u02cd\u02ce\5(\25\2\u02ce\u02cf\7+\2\2\u02cf\u02d0\t\3\2\2\u02d0"+
		"\u02e5\3\2\2\2\u02d1\u02e5\7)\2\2\u02d2\u02d3\7)\2\2\u02d3\u02e5\t\3\2"+
		"\2\u02d4\u02d5\7)\2\2\u02d5\u02e5\7+\2\2\u02d6\u02d7\7)\2\2\u02d7\u02d8"+
		"\7+\2\2\u02d8\u02e5\t\3\2\2\u02d9\u02e5\5\u00c2b\2\u02da\u02db\5\u00c2"+
		"b\2\u02db\u02dc\t\3\2\2\u02dc\u02e5\3\2\2\2\u02dd\u02de\5\u00c2b\2\u02de"+
		"\u02df\7+\2\2\u02df\u02e5\3\2\2\2\u02e0\u02e1\5\u00c2b\2\u02e1\u02e2\7"+
		"+\2\2\u02e2\u02e3\t\3\2\2\u02e3\u02e5\3\2\2\2\u02e4\u028b\3\2\2\2\u02e4"+
		"\u028e\3\2\2\2\u02e4\u0292\3\2\2\2\u02e4\u0296\3\2\2\2\u02e4\u029b\3\2"+
		"\2\2\u02e4\u029d\3\2\2\2\u02e4\u02a1\3\2\2\2\u02e4\u02a5\3\2\2\2\u02e4"+
		"\u02aa\3\2\2\2\u02e4\u02ab\3\2\2\2\u02e4\u02ad\3\2\2\2\u02e4\u02af\3\2"+
		"\2\2\u02e4\u02b2\3\2\2\2\u02e4\u02b3\3\2\2\2\u02e4\u02b5\3\2\2\2\u02e4"+
		"\u02b7\3\2\2\2\u02e4\u02ba\3\2\2\2\u02e4\u02bb\3\2\2\2\u02e4\u02bc\3\2"+
		"\2\2\u02e4\u02bf\3\2\2\2\u02e4\u02c2\3\2\2\2\u02e4\u02c6\3\2\2\2\u02e4"+
		"\u02c7\3\2\2\2\u02e4\u02ca\3\2\2\2\u02e4\u02cd\3\2\2\2\u02e4\u02d1\3\2"+
		"\2\2\u02e4\u02d2\3\2\2\2\u02e4\u02d4\3\2\2\2\u02e4\u02d6\3\2\2\2\u02e4"+
		"\u02d9\3\2\2\2\u02e4\u02da\3\2\2\2\u02e4\u02dd\3\2\2\2\u02e4\u02e0\3\2"+
		"\2\2\u02e5c\3\2\2\2\u02e6\u02e7\5f\64\2\u02e7\u02e8\7\32\2\2\u02e8\u02e9"+
		"\5h\65\2\u02e9e\3\2\2\2\u02ea\u02ed\5\u00c2b\2\u02eb\u02ed\7)\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02edg\3\2\2\2\u02ee\u02ef\5j\66\2"+
		"\u02efi\3\2\2\2\u02f0\u02fc\5\64\33\2\u02f1\u02f2\5\64\33\2\u02f2\u02f3"+
		"\t\3\2\2\u02f3\u02fc\3\2\2\2\u02f4\u02f5\5\64\33\2\u02f5\u02f6\7+\2\2"+
		"\u02f6\u02fc\3\2\2\2\u02f7\u02f8\5\64\33\2\u02f8\u02f9\7+\2\2\u02f9\u02fa"+
		"\t\3\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f0\3\2\2\2\u02fb\u02f1\3\2\2\2\u02fb"+
		"\u02f4\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fck\3\2\2\2\u02fd\u0302\5n8\2\u02fe"+
		"\u02ff\5n8\2\u02ff\u0300\5l\67\2\u0300\u0302\3\2\2\2\u0301\u02fd\3\2\2"+
		"\2\u0301\u02fe\3\2\2\2\u0302m\3\2\2\2\u0303\u0304\7\b\2\2\u0304\u0305"+
		"\5p9\2\u0305\u0306\5\u0086D\2\u0306o\3\2\2\2\u0307\u030b\5r:\2\u0308\u030b"+
		"\5t;\2\u0309\u030b\5v<\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2\2\u030a"+
		"\u0309\3\2\2\2\u030bq\3\2\2\2\u030c\u030d\7#\2\2\u030d\u0310\7$\2\2\u030e"+
		"\u0310\3\2\2\2\u030f\u030c\3\2\2\2\u030f\u030e\3\2\2\2\u0310s\3\2\2\2"+
		"\u0311\u0312\7#\2\2\u0312\u0313\5|?\2\u0313\u0314\5x=\2\u0314\u0315\5"+
		"~@\2\u0315\u0316\5z>\2\u0316\u0317\5\u0080A\2\u0317\u0318\7$\2\2\u0318"+
		"\u0320\3\2\2\2\u0319\u031a\5|?\2\u031a\u031b\5x=\2\u031b\u031c\5~@\2\u031c"+
		"\u031d\5z>\2\u031d\u031e\5\u0080A\2\u031e\u0320\3\2\2\2\u031f\u0311\3"+
		"\2\2\2\u031f\u0319\3\2\2\2\u0320u\3\2\2\2\u0321\u0322\5~@\2\u0322w\3\2"+
		"\2\2\u0323\u0324\7\31\2\2\u0324y\3\2\2\2\u0325\u0326\7\31\2\2\u0326{\3"+
		"\2\2\2\u0327\u032c\5\32\16\2\u0328\u0329\7\4\2\2\u0329\u032c\5\32\16\2"+
		"\u032a\u032c\3\2\2\2\u032b\u0327\3\2\2\2\u032b\u0328\3\2\2\2\u032b\u032a"+
		"\3\2\2\2\u032c}\3\2\2\2\u032d\u0330\5X-\2\u032e\u0330\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u032f\u032e\3\2\2\2\u0330\177\3\2\2\2\u0331\u0334\5\u0082B\2"+
		"\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0081"+
		"\3\2\2\2\u0335\u033b\5*\26\2\u0336\u0337\5*\26\2\u0337\u0338\7\36\2\2"+
		"\u0338\u0339\5\u0082B\2\u0339\u033b\3\2\2\2\u033a\u0335\3\2\2\2\u033a"+
		"\u0336\3\2\2\2\u033b\u0083\3\2\2\2\u033c\u0341\5\6\4\2\u033d\u033e\5\6"+
		"\4\2\u033e\u033f\5\u0084C\2\u033f\u0341\3\2\2\2\u0340\u033c\3\2\2\2\u0340"+
		"\u033d\3\2\2\2\u0341\u0085\3\2\2\2\u0342\u0343\7!\2\2\u0343\u034d\7\""+
		"\2\2\u0344\u0345\7!\2\2\u0345\u0346\5\u0084C\2\u0346\u0347\7\"\2\2\u0347"+
		"\u034d\3\2\2\2\u0348\u034d\5F$\2\u0349\u034d\5\62\32\2\u034a\u034d\5l"+
		"\67\2\u034b\u034d\5\u0088E\2\u034c\u0342\3\2\2\2\u034c\u0344\3\2\2\2\u034c"+
		"\u0348\3\2\2\2\u034c\u0349\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034b\3\2"+
		"\2\2\u034d\u0087\3\2\2\2\u034e\u034f\7\t\2\2\u034f\u0350\5\u008aF\2\u0350"+
		"\u0351\7\31\2\2\u0351\u0089\3\2\2\2\u0352\u0355\5\u00d0i\2\u0353\u0355"+
		"\5*\26\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u008b\3\2\2\2\u0356"+
		"\u0357\5\u008eH\2\u0357\u0358\7!\2\2\u0358\u0359\7\"\2\2\u0359\u0375\3"+
		"\2\2\2\u035a\u035b\5\u008eH\2\u035b\u035c\7!\2\2\u035c\u035d\5\u00a2R"+
		"\2\u035d\u035e\7\"\2\2\u035e\u0375\3\2\2\2\u035f\u0360\5\u0094K\2\u0360"+
		"\u0361\7!\2\2\u0361\u0362\7\"\2\2\u0362\u0375\3\2\2\2\u0363\u0364\5\u0094"+
		"K\2\u0364\u0365\7!\2\2\u0365\u0366\5\u00a2R\2\u0366\u0367\7\"\2\2\u0367"+
		"\u0375\3\2\2\2\u0368\u0369\5\u009eP\2\u0369\u036a\7!\2\2\u036a\u036b\7"+
		"\"\2\2\u036b\u0375\3\2\2\2\u036c\u036d\5\u009eP\2\u036d\u036e\7!\2\2\u036e"+
		"\u036f\5\u00a2R\2\u036f\u0370\7\"\2\2\u0370\u0375\3\2\2\2\u0371\u0372"+
		"\5\u00a0Q\2\u0372\u0373\7\31\2\2\u0373\u0375\3\2\2\2\u0374\u0356\3\2\2"+
		"\2\u0374\u035a\3\2\2\2\u0374\u035f\3\2\2\2\u0374\u0363\3\2\2\2\u0374\u0368"+
		"\3\2\2\2\u0374\u036c\3\2\2\2\u0374\u0371\3\2\2\2\u0375\u008d\3\2\2\2\u0376"+
		"\u0377\5\u0090I\2\u0377\u008f\3\2\2\2\u0378\u0379\7\n\2\2\u0379\u037a"+
		"\7)\2\2\u037a\u037b\7#\2\2\u037b\u0396\7$\2\2\u037c\u037d\7\n\2\2\u037d"+
		"\u037e\7)\2\2\u037e\u037f\7#\2\2\u037f\u0380\7$\2\2\u0380\u0383\7\30\2"+
		"\2\u0381\u0384\5\u0092J\2\u0382\u0384\7+\2\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0382\3\2\2\2\u0384\u0396\3\2\2\2\u0385\u0386\7\n\2\2\u0386\u0387\7)"+
		"\2\2\u0387\u0388\7#\2\2\u0388\u0389\5\u00a6T\2\u0389\u038a\7$\2\2\u038a"+
		"\u0396\3\2\2\2\u038b\u038c\7\n\2\2\u038c\u038d\7)\2\2\u038d\u038e\7#\2"+
		"\2\u038e\u038f\5\u00a6T\2\u038f\u0390\7$\2\2\u0390\u0393\7\30\2\2\u0391"+
		"\u0394\5\u0092J\2\u0392\u0394\7+\2\2\u0393\u0391\3\2\2\2\u0393\u0392\3"+
		"\2\2\2\u0394\u0396\3\2\2\2\u0395\u0378\3\2\2\2\u0395\u037c\3\2\2\2\u0395"+
		"\u0385\3\2\2\2\u0395\u038b\3\2\2\2\u0396\u0091\3\2\2\2\u0397\u0398\7)"+
		"\2\2\u0398\u0093\3\2\2\2\u0399\u039a\5\u009cO\2\u039a\u039b\5\u0090I\2"+
		"\u039b\u0095\3\2\2\2\u039c\u039d\5\u0098M\2\u039d\u039e\5\u0090I\2\u039e"+
		"\u03b4\3\2\2\2\u039f\u03a0\7\16\2\2\u03a0\u03b4\5\u0090I\2\u03a1\u03a2"+
		"\5\u0098M\2\u03a2\u03a3\7\16\2\2\u03a3\u03a4\5\u0090I\2\u03a4\u03b4\3"+
		"\2\2\2\u03a5\u03a6\7\17\2\2\u03a6\u03a7\5\u0098M\2\u03a7\u03a8\7\16\2"+
		"\2\u03a8\u03a9\5\u0090I\2\u03a9\u03b4\3\2\2\2\u03aa\u03ab\7\17\2\2\u03ab"+
		"\u03ac\5\u0098M\2\u03ac\u03ad\5\u0090I\2\u03ad\u03b4\3\2\2\2\u03ae\u03af"+
		"\7\17\2\2\u03af\u03b4\5\u0090I\2\u03b0\u03b1\7\17\2\2\u03b1\u03b2\7\16"+
		"\2\2\u03b2\u03b4\5\u0090I\2\u03b3\u039c\3\2\2\2\u03b3\u039f\3\2\2\2\u03b3"+
		"\u03a1\3\2\2\2\u03b3\u03a5\3\2\2\2\u03b3\u03aa\3\2\2\2\u03b3\u03ae\3\2"+
		"\2\2\u03b3\u03b0\3\2\2\2\u03b4\u0097\3\2\2\2\u03b5\u03b6\t\4\2\2\u03b6"+
		"\u0099\3\2\2\2\u03b7\u03b8\t\5\2\2\u03b8\u009b\3\2\2\2\u03b9\u03be\5\u009a"+
		"N\2\u03ba\u03bb\5\u009aN\2\u03bb\u03bc\5\u009cO\2\u03bc\u03be\3\2\2\2"+
		"\u03bd\u03b9\3\2\2\2\u03bd\u03ba\3\2\2\2\u03be\u009d\3\2\2\2\u03bf\u03c0"+
		"\7)\2\2\u03c0\u03c1\7#\2\2\u03c1\u03c8\7$\2\2\u03c2\u03c3\7)\2\2\u03c3"+
		"\u03c4\7#\2\2\u03c4\u03c5\5\u00a6T\2\u03c5\u03c6\7$\2\2\u03c6\u03c8\3"+
		"\2\2\2\u03c7\u03bf\3\2\2\2\u03c7\u03c2\3\2\2\2\u03c8\u009f\3\2\2\2\u03c9"+
		"\u03cc\5\u008eH\2\u03ca\u03cc\5\u0094K\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca"+
		"\3\2\2\2\u03cc\u00a1\3\2\2\2\u03cd\u03ce\5\u00a4S\2\u03ce\u00a3\3\2\2"+
		"\2\u03cf\u03d4\5\6\4\2\u03d0\u03d1\5\6\4\2\u03d1\u03d2\5\u00a4S\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03cf\3\2\2\2\u03d3\u03d0\3\2\2\2\u03d4\u00a5\3\2"+
		"\2\2\u03d5\u03d6\5\u00a8U\2\u03d6\u00a7\3\2\2\2\u03d7\u03dd\5\u00aaV\2"+
		"\u03d8\u03d9\5\u00aaV\2\u03d9\u03da\7\36\2\2\u03da\u03db\5\u00a8U\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03d7\3\2\2\2\u03dc\u03d8\3\2\2\2\u03dd\u00a9\3\2"+
		"\2\2\u03de\u03df\7)\2\2\u03df\u03e0\7+\2\2\u03e0\u00ab\3\2\2\2\u03e1\u03e5"+
		"\5\u00aeX\2\u03e2\u03e5\5\u00b4[\2\u03e3\u03e5\5\u00ba^\2\u03e4\u03e1"+
		"\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u00ad\3\2\2\2\u03e6"+
		"\u03e7\5\u00b0Y\2\u03e7\u00af\3\2\2\2\u03e8\u03e9\7\20\2\2\u03e9\u03ea"+
		"\7)\2\2\u03ea\u03eb\7!\2\2\u03eb\u0402\7\"\2\2\u03ec\u03ed\7\20\2\2\u03ed"+
		"\u03ee\7)\2\2\u03ee\u03ef\7!\2\2\u03ef\u03f0\5\u00b2Z\2\u03f0\u03f1\7"+
		"\"\2\2\u03f1\u0402\3\2\2\2\u03f2\u03f3\7\20\2\2\u03f3\u03f4\7)\2\2\u03f4"+
		"\u03f5\7\22\2\2\u03f5\u03f6\5> \2\u03f6\u03f7\7!\2\2\u03f7\u03f8\7\"\2"+
		"\2\u03f8\u0402\3\2\2\2\u03f9\u03fa\7\20\2\2\u03fa\u03fb\7)\2\2\u03fb\u03fc"+
		"\7\22\2\2\u03fc\u03fd\5> \2\u03fd\u03fe\7!\2\2\u03fe\u03ff\5\u00b2Z\2"+
		"\u03ff\u0400\7\"\2\2\u0400\u0402\3\2\2\2\u0401\u03e8\3\2\2\2\u0401\u03ec"+
		"\3\2\2\2\u0401\u03f2\3\2\2\2\u0401\u03f9\3\2\2\2\u0402\u00b1\3\2\2\2\u0403"+
		"\u0404\5\u00a4S\2\u0404\u00b3\3\2\2\2\u0405\u0406\5\u00b6\\\2\u0406\u00b5"+
		"\3\2\2\2\u0407\u0408\7\21\2\2\u0408\u0409\7)\2\2\u0409\u040a\7!\2\2\u040a"+
		"\u0421\7\"\2\2\u040b\u040c\7\21\2\2\u040c\u040d\7)\2\2\u040d\u040e\7!"+
		"\2\2\u040e\u040f\5\u00b8]\2\u040f\u0410\7\"\2\2\u0410\u0421\3\2\2\2\u0411"+
		"\u0412\7\21\2\2\u0412\u0413\7)\2\2\u0413\u0414\7\22\2\2\u0414\u0415\5"+
		"> \2\u0415\u0416\7!\2\2\u0416\u0417\7\"\2\2\u0417\u0421\3\2\2\2\u0418"+
		"\u0419\7\21\2\2\u0419\u041a\7)\2\2\u041a\u041b\7\22\2\2\u041b\u041c\5"+
		"> \2\u041c\u041d\7!\2\2\u041d\u041e\5\u00b8]\2\u041e\u041f\7\"\2\2\u041f"+
		"\u0421\3\2\2\2\u0420\u0407\3\2\2\2\u0420\u040b\3\2\2\2\u0420\u0411\3\2"+
		"\2\2\u0420\u0418\3\2\2\2\u0421\u00b7\3\2\2\2\u0422\u0423\5\u00a4S\2\u0423"+
		"\u00b9\3\2\2\2\u0424\u0425\5\u00be`\2\u0425\u0426\7!\2\2\u0426\u0427\7"+
		"\"\2\2\u0427\u042e\3\2\2\2\u0428\u0429\5\u00be`\2\u0429\u042a\7!\2\2\u042a"+
		"\u042b\5\u00bc_\2\u042b\u042c\7\"\2\2\u042c\u042e\3\2\2\2\u042d\u0424"+
		"\3\2\2\2\u042d\u0428\3\2\2\2\u042e\u00bb\3\2\2\2\u042f\u0430\5\u00a4S"+
		"\2\u0430\u00bd\3\2\2\2\u0431\u0432\7\23\2\2\u0432\u0458\7)\2\2\u0433\u0434"+
		"\7\23\2\2\u0434\u0435\7)\2\2\u0435\u0436\7\22\2\2\u0436\u0458\5> \2\u0437"+
		"\u0438\7\23\2\2\u0438\u0439\7)\2\2\u0439\u043a\7\24\2\2\u043a\u0458\5"+
		"> \2\u043b\u043c\7\23\2\2\u043c\u043d\7)\2\2\u043d\u043e\7\22\2\2\u043e"+
		"\u043f\5> \2\u043f\u0440\7\24\2\2\u0440\u0441\5\u00c0a\2\u0441\u0458\3"+
		"\2\2\2\u0442\u0443\7\17\2\2\u0443\u0444\7\23\2\2\u0444\u0458\7)\2\2\u0445"+
		"\u0446\7\17\2\2\u0446\u0447\7\23\2\2\u0447\u0448\7)\2\2\u0448\u0449\7"+
		"\22\2\2\u0449\u0458\5> \2\u044a\u044b\7\17\2\2\u044b\u044c\7\23\2\2\u044c"+
		"\u044d\7)\2\2\u044d\u044e\7\24\2\2\u044e\u0458\5> \2\u044f\u0450\7\17"+
		"\2\2\u0450\u0451\7\23\2\2\u0451\u0452\7)\2\2\u0452\u0453\7\22\2\2\u0453"+
		"\u0454\5> \2\u0454\u0455\7\24\2\2\u0455\u0456\5\u00c0a\2\u0456\u0458\3"+
		"\2\2\2\u0457\u0431\3\2\2\2\u0457\u0433\3\2\2\2\u0457\u0437\3\2\2\2\u0457"+
		"\u043b\3\2\2\2\u0457\u0442\3\2\2\2\u0457\u0445\3\2\2\2\u0457\u044a\3\2"+
		"\2\2\u0457\u044f\3\2\2\2\u0458\u00bf\3\2\2\2\u0459\u045a\7)\2\2\u045a"+
		"\u00c1\3\2\2\2\u045b\u0460\5\u00c4c\2\u045c\u045d\5\u00c4c\2\u045d\u045e"+
		"\5\u00c2b\2\u045e\u0460\3\2\2\2\u045f\u045b\3\2\2\2\u045f\u045c\3\2\2"+
		"\2\u0460\u00c3\3\2\2\2\u0461\u0484\7)\2\2\u0462\u0463\7)\2\2\u0463\u0484"+
		"\7\33\2\2\u0464\u0465\7)\2\2\u0465\u0484\5\u00c6d\2\u0466\u0467\7)\2\2"+
		"\u0467\u0468\5\u00c6d\2\u0468\u0469\7\33\2\2\u0469\u0484\3\2\2\2\u046a"+
		"\u046b\5.\30\2\u046b\u046c\7)\2\2\u046c\u0484\3\2\2\2\u046d\u046e\7)\2"+
		"\2\u046e\u0484\7\33\2\2\u046f\u0470\5.\30\2\u0470\u0471\7)\2\2\u0471\u0472"+
		"\5\u00c6d\2\u0472\u0484\3\2\2\2\u0473\u0474\7)\2\2\u0474\u0475\5\u00c6"+
		"d\2\u0475\u0476\7\33\2\2\u0476\u0484\3\2\2\2\u0477\u0478\7)\2\2\u0478"+
		"\u0484\5\60\31\2\u0479\u047a\7)\2\2\u047a\u0484\7\33\2\2\u047b\u047c\7"+
		")\2\2\u047c\u047d\5\u00c6d\2\u047d\u047e\5\60\31\2\u047e\u0484\3\2\2\2"+
		"\u047f\u0480\7)\2\2\u0480\u0481\5\u00c6d\2\u0481\u0482\7\33\2\2\u0482"+
		"\u0484\3\2\2\2\u0483\u0461\3\2\2\2\u0483\u0462\3\2\2\2\u0483\u0464\3\2"+
		"\2\2\u0483\u0466\3\2\2\2\u0483\u046a\3\2\2\2\u0483\u046d\3\2\2\2\u0483"+
		"\u046f\3\2\2\2\u0483\u0473\3\2\2\2\u0483\u0477\3\2\2\2\u0483\u0479\3\2"+
		"\2\2\u0483\u047b\3\2\2\2\u0483\u047f\3\2\2\2\u0484\u00c5\3\2\2\2\u0485"+
		"\u0486\7\37\2\2\u0486\u0487\5\u00c8e\2\u0487\u0488\7 \2\2\u0488\u048f"+
		"\3\2\2\2\u0489\u048a\7\37\2\2\u048a\u048b\5\u00c8e\2\u048b\u048c\7 \2"+
		"\2\u048c\u048d\5\u00c6d\2\u048d\u048f\3\2\2\2\u048e\u0485\3\2\2\2\u048e"+
		"\u0489\3\2\2\2\u048f\u00c7\3\2\2\2\u0490\u0491\5*\26\2\u0491\u00c9\3\2"+
		"\2\2\u0492\u0493\7#\2\2\u0493\u0494\5\u00ccg\2\u0494\u0495\7$\2\2\u0495"+
		"\u04a4\3\2\2\2\u0496\u0497\7#\2\2\u0497\u0498\5\u00ccg\2\u0498\u0499\7"+
		"$\2\2\u0499\u049a\7#\2\2\u049a\u049b\7$\2\2\u049b\u04a4\3\2\2\2\u049c"+
		"\u049d\7#\2\2\u049d\u049e\5\u00ccg\2\u049e\u049f\7$\2\2\u049f\u04a0\7"+
		"#\2\2\u04a0\u04a1\5*\26\2\u04a1\u04a2\7$\2\2\u04a2\u04a4\3\2\2\2\u04a3"+
		"\u0492\3\2\2\2\u04a3\u0496\3\2\2\2\u04a3\u049c\3\2\2\2\u04a4\u00cb\3\2"+
		"\2\2\u04a5\u04a6\5\u00ceh\2\u04a6\u04a7\7!\2\2\u04a7\u04a8\7\"\2\2\u04a8"+
		"\u04af\3\2\2\2\u04a9\u04aa\5\u00ceh\2\u04aa\u04ab\7!\2\2\u04ab\u04ac\5"+
		"\u00a2R\2\u04ac\u04ad\7\"\2\2\u04ad\u04af\3\2\2\2\u04ae\u04a5\3\2\2\2"+
		"\u04ae\u04a9\3\2\2\2\u04af\u00cd\3\2\2\2\u04b0\u04b1\7\n\2\2\u04b1\u04b2"+
		"\7#\2\2\u04b2\u04ca\7$\2\2\u04b3\u04b4\7\n\2\2\u04b4\u04b5\7#\2\2\u04b5"+
		"\u04b6\7$\2\2\u04b6\u04b9\7\30\2\2\u04b7\u04ba\5\u0092J\2\u04b8\u04ba"+
		"\7+\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04b8\3\2\2\2\u04ba\u04ca\3\2\2\2\u04bb"+
		"\u04bc\7\n\2\2\u04bc\u04bd\7#\2\2\u04bd\u04be\5\u00a6T\2\u04be\u04bf\7"+
		"$\2\2\u04bf\u04ca\3\2\2\2\u04c0\u04c1\7\n\2\2\u04c1\u04c2\7#\2\2\u04c2"+
		"\u04c3\5\u00a6T\2\u04c3\u04c4\7$\2\2\u04c4\u04c7\7\30\2\2\u04c5\u04c8"+
		"\5\u0092J\2\u04c6\u04c8\7+\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c6\3\2\2\2"+
		"\u04c8\u04ca\3\2\2\2\u04c9\u04b0\3\2\2\2\u04c9\u04b3\3\2\2\2\u04c9\u04bb"+
		"\3\2\2\2\u04c9\u04c0\3\2\2\2\u04ca\u00cf\3\2\2\2\u04cb\u04e4\7)\2\2\u04cc"+
		"\u04cd\7)\2\2\u04cd\u04e4\7+\2\2\u04ce\u04e4\7-\2\2\u04cf\u04d0\7-\2\2"+
		"\u04d0\u04e4\7+\2\2\u04d1\u04e4\7.\2\2\u04d2\u04d3\7.\2\2\u04d3\u04e4"+
		"\7+\2\2\u04d4\u04e4\7,\2\2\u04d5\u04e4\5\64\33\2\u04d6\u04e4\5 \21\2\u04d7"+
		"\u04e4\5$\23\2\u04d8\u04e4\5*\26\2\u04d9\u04da\5\u00d2j\2\u04da\u04db"+
		"\7\33\2\2\u04db\u04dc\5\u00d4k\2\u04dc\u04e4\3\2\2\2\u04dd\u04de\5\u00d2"+
		"j\2\u04de\u04df\7\35\2\2\u04df\u04e0\5\u00d4k\2\u04e0\u04e4\3\2\2\2\u04e1"+
		"\u04e4\5\u00c2b\2\u04e2\u04e4\5\u00caf\2\u04e3\u04cb\3\2\2\2\u04e3\u04cc"+
		"\3\2\2\2\u04e3\u04ce\3\2\2\2\u04e3\u04cf\3\2\2\2\u04e3\u04d1\3\2\2\2\u04e3"+
		"\u04d2\3\2\2\2\u04e3\u04d4\3\2\2\2\u04e3\u04d5\3\2\2\2\u04e3\u04d6\3\2"+
		"\2\2\u04e3\u04d7\3\2\2\2\u04e3\u04d8\3\2\2\2\u04e3\u04d9\3\2\2\2\u04e3"+
		"\u04dd\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u00d1\3\2"+
		"\2\2\u04e5\u04e6\7)\2\2\u04e6\u00d3\3\2\2\2\u04e7\u04e8\7)\2\2\u04e8\u00d5"+
		"\3\2\2\2D\u00de\u00e9\u00ee\u00ff\u0111\u0142\u0149\u015a\u0168\u0170"+
		"\u0177\u017f\u018a\u0194\u01ee\u0207\u0214\u0223\u022f\u0235\u0242\u024c"+
		"\u0261\u0267\u0271\u0276\u027b\u0285\u02e4\u02ec\u02fb\u0301\u030a\u030f"+
		"\u031f\u032b\u032f\u0333\u033a\u0340\u034c\u0354\u0374\u0383\u0393\u0395"+
		"\u03b3\u03bd\u03c7\u03cb\u03d3\u03dc\u03e4\u0401\u0420\u042d\u0457\u045f"+
		"\u0483\u048e\u04a3\u04ae\u04b9\u04c7\u04c9\u04e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}