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
		Implements=18, New=19, ArrowRight=20, End=21, Attr=22, Point=23, TwoPoint=24, 
		TwoTwoPoint=25, Separator=26, OpenArIndex=27, CloseArIndex=28, OpenBlock=29, 
		CloseBlock=30, OpenOp=31, CloseOp=32, ArithmeticOperator=33, AssignmentOperator=34, 
		Not=35, IncDecOperators=36, Identifier=37, IDPrefix=38, TypeSpec=39, String=40, 
		Integer=41, Float=42, Whitespace=43, Newline=44, Words=45, BlockComment=46, 
		LineComment=47;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableModes = 8, RULE_variableMembers = 9, RULE_variableDefinition = 10, 
		RULE_variableDefinitionGeneral = 11, RULE_indexArray = 12, RULE_indexArrayElements = 13, 
		RULE_associativeArray = 14, RULE_associativeArrayElements = 15, RULE_operationBlock = 16, 
		RULE_operationElements = 17, RULE_operationValue = 18, RULE_firstIncDec = 19, 
		RULE_lastIncDec = 20, RULE_callingFunction = 21, RULE_functionCall = 22, 
		RULE_methodCascadingModes = 23, RULE_functionCallCascading = 24, RULE_functionCallCascadingItem = 25, 
		RULE_identifierB = 26, RULE_pointSeparator = 27, RULE_functionCallParam = 28, 
		RULE_functionCallParamElements = 29, RULE_conditionalExpression = 30, 
		RULE_conditionalExpressionStructBlock = 31, RULE_ifElementUnique = 32, 
		RULE_elifElements = 33, RULE_elifElementUnique = 34, RULE_elseElementUnique = 35, 
		RULE_conditionalExpressionItems = 36, RULE_conditionalBlockElements = 37, 
		RULE_conditionalBlockElsItems = 38, RULE_conditionalExpressionElements = 39, 
		RULE_conditionExpValue = 40, RULE_conditionExpBlock = 41, RULE_conditionExpBlockItemValue = 42, 
		RULE_conditionExpBlockItem = 43, RULE_conditionalExpValue = 44, RULE_functionCallAndAttr = 45, 
		RULE_identifierAttrFn = 46, RULE_functionCallAttrFn = 47, RULE_functionCallAttrFnItem = 48, 
		RULE_loop = 49, RULE_loopExpressionItems = 50, RULE_loopExpression = 51, 
		RULE_loopInfinite = 52, RULE_loopComplete = 53, RULE_loopConditional = 54, 
		RULE_endOne = 55, RULE_endTwo = 56, RULE_loopOneMembers = 57, RULE_loopTwoMembers = 58, 
		RULE_loopThreeMembers = 59, RULE_loopThreeMembersValues = 60, RULE_loopBlockElements = 61, 
		RULE_loopBlockElementsLimited = 62, RULE_ret = 63, RULE_retValues = 64, 
		RULE_functions = 65, RULE_functionsModes = 66, RULE_functionGeneralModes = 67, 
		RULE_identifierRet = 68, RULE_functionMethodsModes = 69, RULE_functionMethodsModesBkp = 70, 
		RULE_methodPerm = 71, RULE_visibilityItems = 72, RULE_methodVisibility = 73, 
		RULE_constructClassMethod = 74, RULE_interfaceMethod = 75, RULE_functionCodeBlock = 76, 
		RULE_functionCodeBlockElements = 77, RULE_functionParams = 78, RULE_functionParamsControl = 79, 
		RULE_functionParamElements = 80, RULE_oopGeneral = 81, RULE_interfaceClass = 82, 
		RULE_interfaceClassDefinition = 83, RULE_interfaceCodeBlock = 84, RULE_abstractClass = 85, 
		RULE_abstractClassDefinition = 86, RULE_abstractCodeBlock = 87, RULE_classDefination = 88, 
		RULE_classCodeBlock = 89, RULE_classModes = 90, RULE_identifierC = 91, 
		RULE_arrayAccessElements = 92, RULE_arrayAccessElementsItems = 93, RULE_accessBlockAr = 94, 
		RULE_arrayIndexAccess = 95, RULE_generalValue = 96, RULE_objIdentifierA = 97, 
		RULE_objIdentifierB = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableModes", "variableMembers", "variableDefinition", 
			"variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
			"firstIncDec", "lastIncDec", "callingFunction", "functionCall", "methodCascadingModes", 
			"functionCallCascading", "functionCallCascadingItem", "identifierB", 
			"pointSeparator", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalExpressionStructBlock", "ifElementUnique", "elifElements", 
			"elifElementUnique", "elseElementUnique", "conditionalExpressionItems", 
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
			"arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "generalValue", 
			"objIdentifierA", "objIdentifierB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'->'", 
			"';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
			"Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
			"LineComment"
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
			setState(198);
			fileContent();
			setState(199);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				sentence();
				setState(203);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
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
			setState(219);
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
			setState(221);
			match(Use);
			setState(222);
			useValue();
			setState(223);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				useString();
				setState(227);
				match(Separator);
				setState(228);
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
			setState(232);
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public MethodPermContext methodPerm() {
			return getRuleContext(MethodPermContext.class,0);
		}
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public VariableModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModes; }
	}

	public final VariableModesContext variableModes() throws RecognitionException {
		VariableModesContext _localctx = new VariableModesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableModes);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(Var);
				setState(237);
				variableMembers();
				setState(238);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				methodPerm();
				setState(241);
				match(Var);
				setState(242);
				variableMembers();
				setState(243);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(Static);
				setState(246);
				match(Var);
				setState(247);
				variableMembers();
				setState(248);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				methodPerm();
				setState(251);
				match(Static);
				setState(252);
				match(Var);
				setState(253);
				variableMembers();
				setState(254);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(Final);
				setState(257);
				methodPerm();
				setState(258);
				match(Static);
				setState(259);
				match(Var);
				setState(260);
				variableMembers();
				setState(261);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(Final);
				setState(264);
				methodPerm();
				setState(265);
				match(Var);
				setState(266);
				variableMembers();
				setState(267);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				match(Final);
				setState(270);
				match(Var);
				setState(271);
				variableMembers();
				setState(272);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				match(Final);
				setState(275);
				match(Static);
				setState(276);
				match(Var);
				setState(277);
				variableMembers();
				setState(278);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				variableMembers();
				setState(281);
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
		enterRule(_localctx, 18, RULE_variableMembers);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				variableDefinition();
				setState(287);
				match(Separator);
				setState(288);
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
		enterRule(_localctx, 20, RULE_variableDefinition);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(Identifier);
				setState(293);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				objIdentifierA();
				setState(295);
				match(Point);
				setState(296);
				objIdentifierB();
				setState(297);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				objIdentifierA();
				setState(300);
				match(TwoTwoPoint);
				setState(301);
				objIdentifierB();
				setState(302);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				arrayAccessElements();
				setState(305);
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
		enterRule(_localctx, 22, RULE_variableDefinitionGeneral);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(TypeSpec);
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				match(New);
				setState(316);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(TypeSpec);
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
				match(New);
				setState(320);
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
		enterRule(_localctx, 24, RULE_indexArray);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(OpenArIndex);
				setState(324);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(OpenArIndex);
				setState(326);
				indexArrayElements();
				setState(327);
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
		enterRule(_localctx, 26, RULE_indexArrayElements);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				generalValue();
				setState(333);
				match(Separator);
				setState(334);
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
		enterRule(_localctx, 28, RULE_associativeArray);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(OpenBlock);
				setState(339);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(OpenBlock);
				setState(341);
				associativeArrayElements();
				setState(342);
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
		enterRule(_localctx, 30, RULE_associativeArrayElements);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Identifier);
				setState(347);
				match(TwoPoint);
				setState(348);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(Identifier);
				setState(350);
				match(TwoPoint);
				setState(351);
				generalValue();
				setState(352);
				match(Separator);
				setState(353);
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
		enterRule(_localctx, 32, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(OpenOp);
			setState(358);
			operationElements();
			setState(359);
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
		enterRule(_localctx, 34, RULE_operationElements);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				operationValue();
				setState(363);
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
		enterRule(_localctx, 36, RULE_operationValue);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				functionCall();
				setState(369);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				functionCall();
				setState(372);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				functionCall();
				setState(375);
				match(TypeSpec);
				setState(376);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				match(Identifier);
				setState(380);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				match(Identifier);
				setState(382);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				match(Identifier);
				setState(384);
				match(TypeSpec);
				setState(385);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				firstIncDec();
				setState(387);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(389);
				firstIncDec();
				setState(390);
				match(Identifier);
				setState(391);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(393);
				firstIncDec();
				setState(394);
				match(Identifier);
				setState(395);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(397);
				firstIncDec();
				setState(398);
				match(Identifier);
				setState(399);
				match(TypeSpec);
				setState(400);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(402);
				match(Identifier);
				setState(403);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(404);
				match(Identifier);
				setState(405);
				lastIncDec();
				setState(406);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(408);
				match(Identifier);
				setState(409);
				lastIncDec();
				setState(410);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(412);
				match(Identifier);
				setState(413);
				lastIncDec();
				setState(414);
				match(TypeSpec);
				setState(415);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(417);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(418);
				match(Integer);
				setState(419);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(420);
				match(Integer);
				setState(421);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(422);
				match(Integer);
				setState(423);
				match(TypeSpec);
				setState(424);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(425);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(426);
				match(Float);
				setState(427);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(428);
				match(Float);
				setState(429);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(430);
				match(Float);
				setState(431);
				match(TypeSpec);
				setState(432);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(433);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(434);
				operationBlock();
				setState(435);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(437);
				operationBlock();
				setState(438);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(440);
				operationBlock();
				setState(441);
				match(TypeSpec);
				setState(442);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(444);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(445);
				arrayAccessElements();
				setState(446);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(448);
				arrayAccessElements();
				setState(449);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(451);
				arrayAccessElements();
				setState(452);
				match(TypeSpec);
				setState(453);
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
		enterRule(_localctx, 38, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 40, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 42, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			functionCall();
			setState(462);
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(Identifier);
				setState(465);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(Identifier);
				setState(467);
				match(Point);
				setState(468);
				identifierB();
				setState(469);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(Identifier);
				setState(472);
				match(TwoTwoPoint);
				setState(473);
				identifierB();
				setState(474);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				methodCascadingModes();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_methodCascadingModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Identifier);
			setState(480);
			match(Point);
			setState(481);
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
		enterRule(_localctx, 48, RULE_functionCallCascading);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				functionCallCascadingItem();
				setState(485);
				match(Point);
				setState(486);
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
		enterRule(_localctx, 50, RULE_functionCallCascadingItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(Identifier);
			setState(491);
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
		enterRule(_localctx, 52, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		enterRule(_localctx, 54, RULE_pointSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		enterRule(_localctx, 56, RULE_functionCallParam);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(OpenOp);
				setState(498);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(OpenOp);
				setState(500);
				functionCallParamElements();
				setState(501);
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
		enterRule(_localctx, 58, RULE_functionCallParamElements);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				generalValue();
				setState(507);
				match(Separator);
				setState(508);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				operationElements();
				setState(512);
				match(Separator);
				setState(513);
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
		enterRule(_localctx, 60, RULE_conditionalExpression);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				conditionalExpressionStructBlock();
				setState(519);
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
		enterRule(_localctx, 62, RULE_conditionalExpressionStructBlock);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				ifElementUnique();
				setState(525);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				ifElementUnique();
				setState(528);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				ifElementUnique();
				setState(531);
				elifElements();
				setState(532);
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
		enterRule(_localctx, 64, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(If);
			setState(537);
			conditionalExpressionItems();
			setState(538);
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
		enterRule(_localctx, 66, RULE_elifElements);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				elifElementUnique();
				setState(542);
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
		enterRule(_localctx, 68, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(Elif);
			setState(547);
			conditionalExpressionItems();
			setState(548);
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
		enterRule(_localctx, 70, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Else);
			setState(551);
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
		enterRule(_localctx, 72, RULE_conditionalExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 74, RULE_conditionalBlockElements);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(OpenBlock);
				setState(556);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(OpenBlock);
				setState(558);
				conditionalBlockElsItems();
				setState(559);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
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
		enterRule(_localctx, 76, RULE_conditionalBlockElsItems);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				sentence();
				setState(569);
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
		enterRule(_localctx, 78, RULE_conditionalExpressionElements);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				conditionExpValue();
				setState(575);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				conditionExpBlock();
				setState(579);
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
		enterRule(_localctx, 80, RULE_conditionExpValue);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(Not);
				setState(584);
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
				setState(585);
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
		enterRule(_localctx, 82, RULE_conditionExpBlock);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(Not);
				setState(590);
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
		enterRule(_localctx, 84, RULE_conditionExpBlockItemValue);
		int _la;
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				conditionExpBlockItem();
				setState(595);
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
				setState(597);
				conditionExpBlockItem();
				setState(598);
				match(TypeSpec);
				setState(599);
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
		enterRule(_localctx, 86, RULE_conditionExpBlockItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(OpenOp);
			setState(604);
			conditionalExpressionElements();
			setState(605);
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
		enterRule(_localctx, 88, RULE_conditionalExpValue);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				firstIncDec();
				setState(608);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				firstIncDec();
				setState(611);
				match(Identifier);
				setState(612);
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
				setState(614);
				firstIncDec();
				setState(615);
				match(Identifier);
				setState(616);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				firstIncDec();
				setState(619);
				match(Identifier);
				setState(620);
				match(TypeSpec);
				setState(621);
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
				setState(623);
				match(Identifier);
				setState(624);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(625);
				match(Identifier);
				setState(626);
				lastIncDec();
				setState(627);
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
				setState(629);
				match(Identifier);
				setState(630);
				lastIncDec();
				setState(631);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(633);
				match(Identifier);
				setState(634);
				lastIncDec();
				setState(635);
				match(TypeSpec);
				setState(636);
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
				setState(638);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(639);
				match(Integer);
				setState(640);
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
				setState(641);
				match(Integer);
				setState(642);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(643);
				match(Integer);
				setState(644);
				match(TypeSpec);
				setState(645);
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
				setState(646);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(647);
				match(Float);
				setState(648);
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
				setState(649);
				match(Float);
				setState(650);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(651);
				match(Float);
				setState(652);
				match(TypeSpec);
				setState(653);
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
				setState(654);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(655);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(656);
				functionCall();
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(659);
				functionCall();
				setState(660);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(662);
				functionCall();
				setState(663);
				match(TypeSpec);
				setState(664);
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
				setState(666);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(667);
				operationBlock();
				setState(668);
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
				setState(670);
				operationBlock();
				setState(671);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(673);
				operationBlock();
				setState(674);
				match(TypeSpec);
				setState(675);
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
				setState(677);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(678);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(680);
				match(Identifier);
				setState(681);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(682);
				match(Identifier);
				setState(683);
				match(TypeSpec);
				setState(684);
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
				setState(685);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(686);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(689);
				arrayAccessElements();
				setState(690);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(692);
				arrayAccessElements();
				setState(693);
				match(TypeSpec);
				setState(694);
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
		enterRule(_localctx, 90, RULE_functionCallAndAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			identifierAttrFn();
			setState(699);
			match(Attr);
			setState(700);
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
		enterRule(_localctx, 92, RULE_identifierAttrFn);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
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
		enterRule(_localctx, 94, RULE_functionCallAttrFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		enterRule(_localctx, 96, RULE_functionCallAttrFnItem);
		int _la;
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				functionCall();
				setState(713);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				functionCall();
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_loop);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				loopExpressionItems();
				setState(723);
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
		enterRule(_localctx, 100, RULE_loopExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(For);
			setState(728);
			loopExpression();
			setState(729);
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
		enterRule(_localctx, 102, RULE_loopExpression);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
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
		enterRule(_localctx, 104, RULE_loopInfinite);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(OpenOp);
				setState(737);
				match(CloseOp);
				}
				break;
			case If:
			case For:
			case Ret:
			case OpenBlock:
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
		enterRule(_localctx, 106, RULE_loopComplete);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(OpenOp);
				setState(742);
				loopOneMembers();
				setState(743);
				endOne();
				setState(744);
				loopTwoMembers();
				setState(745);
				endTwo();
				setState(746);
				loopThreeMembers();
				setState(747);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				loopOneMembers();
				setState(750);
				endOne();
				setState(751);
				loopTwoMembers();
				setState(752);
				endTwo();
				setState(753);
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
		enterRule(_localctx, 108, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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
		enterRule(_localctx, 110, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
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
		enterRule(_localctx, 112, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 114, RULE_loopOneMembers);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(Var);
				setState(765);
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
		enterRule(_localctx, 116, RULE_loopTwoMembers);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
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
		enterRule(_localctx, 118, RULE_loopThreeMembers);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
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
		enterRule(_localctx, 120, RULE_loopThreeMembersValues);
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				operationElements();
				setState(779);
				match(Separator);
				setState(780);
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
		enterRule(_localctx, 122, RULE_loopBlockElements);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				sentence();
				setState(786);
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
		enterRule(_localctx, 124, RULE_loopBlockElementsLimited);
		try {
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(OpenBlock);
				setState(791);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(OpenBlock);
				setState(793);
				loopBlockElements();
				setState(794);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(799);
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
		enterRule(_localctx, 126, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(Ret);
			setState(803);
			retValues();
			setState(804);
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
		enterRule(_localctx, 128, RULE_retValues);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
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
		enterRule(_localctx, 130, RULE_functions);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				functionsModes();
				setState(811);
				match(OpenBlock);
				setState(812);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				functionsModes();
				setState(815);
				match(OpenBlock);
				setState(816);
				functionCodeBlock();
				setState(817);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				functionMethodsModes();
				setState(820);
				match(OpenBlock);
				setState(821);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				functionMethodsModes();
				setState(824);
				match(OpenBlock);
				setState(825);
				functionCodeBlock();
				setState(826);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
				constructClassMethod();
				setState(829);
				match(OpenBlock);
				setState(830);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				constructClassMethod();
				setState(833);
				match(OpenBlock);
				setState(834);
				functionCodeBlock();
				setState(835);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				interfaceMethod();
				setState(838);
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
		enterRule(_localctx, 132, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 134, RULE_functionGeneralModes);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(Function);
				setState(845);
				match(Identifier);
				setState(846);
				match(OpenOp);
				setState(847);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(Function);
				setState(849);
				match(Identifier);
				setState(850);
				match(OpenOp);
				setState(851);
				match(CloseOp);
				setState(852);
				match(ArrowRight);
				setState(855);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(853);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(854);
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
				setState(857);
				match(Function);
				setState(858);
				match(Identifier);
				setState(859);
				match(OpenOp);
				setState(860);
				functionParams();
				setState(861);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(Function);
				setState(864);
				match(Identifier);
				setState(865);
				match(OpenOp);
				setState(866);
				functionParams();
				setState(867);
				match(CloseOp);
				setState(868);
				match(ArrowRight);
				setState(871);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(869);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(870);
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
		enterRule(_localctx, 136, RULE_identifierRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
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
		enterRule(_localctx, 138, RULE_functionMethodsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			methodVisibility();
			setState(878);
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
		enterRule(_localctx, 140, RULE_functionMethodsModesBkp);
		try {
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				methodPerm();
				setState(881);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(Static);
				setState(884);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				methodPerm();
				setState(886);
				match(Static);
				setState(887);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				match(Final);
				setState(890);
				methodPerm();
				setState(891);
				match(Static);
				setState(892);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(894);
				match(Final);
				setState(895);
				methodPerm();
				setState(896);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(898);
				match(Final);
				setState(899);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(900);
				match(Final);
				setState(901);
				match(Static);
				setState(902);
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
		enterRule(_localctx, 142, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
		enterRule(_localctx, 144, RULE_visibilityItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
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
		enterRule(_localctx, 146, RULE_methodVisibility);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				visibilityItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				visibilityItems();
				setState(911);
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
		enterRule(_localctx, 148, RULE_constructClassMethod);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				match(Identifier);
				setState(916);
				match(OpenOp);
				setState(917);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				match(Identifier);
				setState(919);
				match(OpenOp);
				setState(920);
				functionParams();
				setState(921);
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
		enterRule(_localctx, 150, RULE_interfaceMethod);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
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
				setState(926);
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
		enterRule(_localctx, 152, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
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
		enterRule(_localctx, 154, RULE_functionCodeBlockElements);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				sentence();
				setState(933);
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
		enterRule(_localctx, 156, RULE_functionParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
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
		enterRule(_localctx, 158, RULE_functionParamsControl);
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				functionParamElements();
				setState(941);
				match(Separator);
				setState(942);
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
		enterRule(_localctx, 160, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(Identifier);
			setState(947);
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
		enterRule(_localctx, 162, RULE_oopGeneral);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
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
		enterRule(_localctx, 164, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
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
		enterRule(_localctx, 166, RULE_interfaceClassDefinition);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(Interface);
				setState(957);
				match(Identifier);
				setState(958);
				match(OpenBlock);
				setState(959);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(Interface);
				setState(961);
				match(Identifier);
				setState(962);
				match(OpenBlock);
				setState(963);
				interfaceCodeBlock();
				setState(964);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Interface);
				setState(967);
				match(Identifier);
				setState(968);
				match(Extends);
				setState(969);
				identifierB();
				setState(970);
				match(OpenBlock);
				setState(971);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				match(Interface);
				setState(974);
				match(Identifier);
				setState(975);
				match(Extends);
				setState(976);
				identifierB();
				setState(977);
				match(OpenBlock);
				setState(978);
				interfaceCodeBlock();
				setState(979);
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
		enterRule(_localctx, 168, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
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
		enterRule(_localctx, 170, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
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
		enterRule(_localctx, 172, RULE_abstractClassDefinition);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(Abstract);
				setState(988);
				match(Identifier);
				setState(989);
				match(OpenBlock);
				setState(990);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(Abstract);
				setState(992);
				match(Identifier);
				setState(993);
				match(OpenBlock);
				setState(994);
				abstractCodeBlock();
				setState(995);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				match(Abstract);
				setState(998);
				match(Identifier);
				setState(999);
				match(Extends);
				setState(1000);
				identifierB();
				setState(1001);
				match(OpenBlock);
				setState(1002);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				match(Abstract);
				setState(1005);
				match(Identifier);
				setState(1006);
				match(Extends);
				setState(1007);
				identifierB();
				setState(1008);
				match(OpenBlock);
				setState(1009);
				abstractCodeBlock();
				setState(1010);
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
		enterRule(_localctx, 174, RULE_abstractCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		enterRule(_localctx, 176, RULE_classDefination);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				classModes();
				setState(1017);
				match(OpenBlock);
				setState(1018);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				classModes();
				setState(1021);
				match(OpenBlock);
				setState(1022);
				classCodeBlock();
				setState(1023);
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
		enterRule(_localctx, 178, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
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
		enterRule(_localctx, 180, RULE_classModes);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				match(Class);
				setState(1030);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				match(Class);
				setState(1032);
				match(Identifier);
				setState(1033);
				match(Extends);
				setState(1034);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				match(Class);
				setState(1036);
				match(Identifier);
				setState(1037);
				match(Implements);
				setState(1038);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039);
				match(Class);
				setState(1040);
				match(Identifier);
				setState(1041);
				match(Extends);
				setState(1042);
				identifierB();
				setState(1043);
				match(Implements);
				setState(1044);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1046);
				match(Final);
				setState(1047);
				match(Class);
				setState(1048);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1049);
				match(Final);
				setState(1050);
				match(Class);
				setState(1051);
				match(Identifier);
				setState(1052);
				match(Extends);
				setState(1053);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
				match(Final);
				setState(1055);
				match(Class);
				setState(1056);
				match(Identifier);
				setState(1057);
				match(Implements);
				setState(1058);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1059);
				match(Final);
				setState(1060);
				match(Class);
				setState(1061);
				match(Identifier);
				setState(1062);
				match(Extends);
				setState(1063);
				identifierB();
				setState(1064);
				match(Implements);
				setState(1065);
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
		enterRule(_localctx, 182, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
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
		enterRule(_localctx, 184, RULE_arrayAccessElements);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				arrayAccessElementsItems();
				setState(1073);
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
		enterRule(_localctx, 186, RULE_arrayAccessElementsItems);
		try {
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(Identifier);
				setState(1079);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				match(Identifier);
				setState(1081);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1082);
				match(Identifier);
				setState(1083);
				accessBlockAr();
				setState(1084);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1086);
				firstIncDec();
				setState(1087);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1089);
				match(Identifier);
				setState(1090);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1091);
				firstIncDec();
				setState(1092);
				match(Identifier);
				setState(1093);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1095);
				match(Identifier);
				setState(1096);
				accessBlockAr();
				setState(1097);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1099);
				match(Identifier);
				setState(1100);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1101);
				match(Identifier);
				setState(1102);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1103);
				match(Identifier);
				setState(1104);
				accessBlockAr();
				setState(1105);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1107);
				match(Identifier);
				setState(1108);
				accessBlockAr();
				setState(1109);
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
		enterRule(_localctx, 188, RULE_accessBlockAr);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(OpenArIndex);
				setState(1114);
				arrayIndexAccess();
				setState(1115);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				match(OpenArIndex);
				setState(1118);
				arrayIndexAccess();
				setState(1119);
				match(CloseArIndex);
				setState(1120);
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
		enterRule(_localctx, 190, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
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
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_generalValue);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(Identifier);
				setState(1128);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				match(Integer);
				setState(1131);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1132);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1133);
				match(Float);
				setState(1134);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1135);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1136);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1137);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1138);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1139);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1140);
				objIdentifierA();
				setState(1141);
				match(Point);
				setState(1142);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1144);
				objIdentifierA();
				setState(1145);
				match(TwoTwoPoint);
				setState(1146);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1148);
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

	public static class ObjIdentifierAContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public ObjIdentifierAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdentifierA; }
	}

	public final ObjIdentifierAContext objIdentifierA() throws RecognitionException {
		ObjIdentifierAContext _localctx = new ObjIdentifierAContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_objIdentifierA);
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

	public static class ObjIdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public ObjIdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdentifierB; }
	}

	public final ObjIdentifierBContext objIdentifierB() throws RecognitionException {
		ObjIdentifierBContext _localctx = new ObjIdentifierBContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0486\4\2\t\2"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00d1"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00e9\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011e\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0125\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0136\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0144\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u014c\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0153\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u015b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0166\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0170\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01ca\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01e0\n\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u01eb\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01fa\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0206\n\37\3 "+
		"\3 \3 \3 \5 \u020c\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0219\n!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0223\n#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0238\n\'\3(\3(\3(\3(\5(\u023e"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0248\n)\3*\3*\3*\5*\u024d\n*\3+\3+\3+"+
		"\5+\u0252\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u025c\n,\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02bb\n.\3/\3/"+
		"\3/\3/\3\60\3\60\5\60\u02c3\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u02d2\n\62\3\63\3\63\3\63\3\63\5\63"+
		"\u02d8\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u02e1\n\65\3\66\3"+
		"\66\3\66\5\66\u02e6\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u02f6\n\67\38\38\39\39\3:\3:\3;\3;\3;\3"+
		";\5;\u0302\n;\3<\3<\5<\u0306\n<\3=\3=\5=\u030a\n=\3>\3>\3>\3>\3>\5>\u0311"+
		"\n>\3?\3?\3?\3?\5?\u0317\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0323\n@"+
		"\3A\3A\3A\3A\3B\3B\5B\u032b\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u034b\nC\3D\3D"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u035a\nE\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\5E\u036a\nE\5E\u036c\nE\3F\3F\3G\3G\3G\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u038a\nH"+
		"\3I\3I\3J\3J\3K\3K\3K\3K\5K\u0394\nK\3L\3L\3L\3L\3L\3L\3L\3L\5L\u039e"+
		"\nL\3M\3M\5M\u03a2\nM\3N\3N\3O\3O\3O\3O\5O\u03aa\nO\3P\3P\3Q\3Q\3Q\3Q"+
		"\3Q\5Q\u03b3\nQ\3R\3R\3R\3S\3S\3S\5S\u03bb\nS\3T\3T\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u03d8\nU"+
		"\3V\3V\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\5X\u03f7\nX\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0404"+
		"\nZ\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u042e\n\\\3]\3]\3^\3^\3^\3^\5^\u0436\n^\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u045a\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\5`\u0465\n`\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\5b\u0480\nb\3c\3c\3d\3d\3d\2\2e\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\2\6\4\2\30\30$$\3\2#$\3\2\13\r\3\2\13\17\2\u04ef\2\u00c8\3\2\2"+
		"\2\4\u00d0\3\2\2\2\6\u00db\3\2\2\2\b\u00dd\3\2\2\2\n\u00df\3\2\2\2\f\u00e8"+
		"\3\2\2\2\16\u00ea\3\2\2\2\20\u00ec\3\2\2\2\22\u011d\3\2\2\2\24\u0124\3"+
		"\2\2\2\26\u0135\3\2\2\2\30\u0143\3\2\2\2\32\u014b\3\2\2\2\34\u0152\3\2"+
		"\2\2\36\u015a\3\2\2\2 \u0165\3\2\2\2\"\u0167\3\2\2\2$\u016f\3\2\2\2&\u01c9"+
		"\3\2\2\2(\u01cb\3\2\2\2*\u01cd\3\2\2\2,\u01cf\3\2\2\2.\u01df\3\2\2\2\60"+
		"\u01e1\3\2\2\2\62\u01ea\3\2\2\2\64\u01ec\3\2\2\2\66\u01ef\3\2\2\28\u01f1"+
		"\3\2\2\2:\u01f9\3\2\2\2<\u0205\3\2\2\2>\u020b\3\2\2\2@\u0218\3\2\2\2B"+
		"\u021a\3\2\2\2D\u0222\3\2\2\2F\u0224\3\2\2\2H\u0228\3\2\2\2J\u022b\3\2"+
		"\2\2L\u0237\3\2\2\2N\u023d\3\2\2\2P\u0247\3\2\2\2R\u024c\3\2\2\2T\u0251"+
		"\3\2\2\2V\u025b\3\2\2\2X\u025d\3\2\2\2Z\u02ba\3\2\2\2\\\u02bc\3\2\2\2"+
		"^\u02c2\3\2\2\2`\u02c4\3\2\2\2b\u02d1\3\2\2\2d\u02d7\3\2\2\2f\u02d9\3"+
		"\2\2\2h\u02e0\3\2\2\2j\u02e5\3\2\2\2l\u02f5\3\2\2\2n\u02f7\3\2\2\2p\u02f9"+
		"\3\2\2\2r\u02fb\3\2\2\2t\u0301\3\2\2\2v\u0305\3\2\2\2x\u0309\3\2\2\2z"+
		"\u0310\3\2\2\2|\u0316\3\2\2\2~\u0322\3\2\2\2\u0080\u0324\3\2\2\2\u0082"+
		"\u032a\3\2\2\2\u0084\u034a\3\2\2\2\u0086\u034c\3\2\2\2\u0088\u036b\3\2"+
		"\2\2\u008a\u036d\3\2\2\2\u008c\u036f\3\2\2\2\u008e\u0389\3\2\2\2\u0090"+
		"\u038b\3\2\2\2\u0092\u038d\3\2\2\2\u0094\u0393\3\2\2\2\u0096\u039d\3\2"+
		"\2\2\u0098\u03a1\3\2\2\2\u009a\u03a3\3\2\2\2\u009c\u03a9\3\2\2\2\u009e"+
		"\u03ab\3\2\2\2\u00a0\u03b2\3\2\2\2\u00a2\u03b4\3\2\2\2\u00a4\u03ba\3\2"+
		"\2\2\u00a6\u03bc\3\2\2\2\u00a8\u03d7\3\2\2\2\u00aa\u03d9\3\2\2\2\u00ac"+
		"\u03db\3\2\2\2\u00ae\u03f6\3\2\2\2\u00b0\u03f8\3\2\2\2\u00b2\u0403\3\2"+
		"\2\2\u00b4\u0405\3\2\2\2\u00b6\u042d\3\2\2\2\u00b8\u042f\3\2\2\2\u00ba"+
		"\u0435\3\2\2\2\u00bc\u0459\3\2\2\2\u00be\u0464\3\2\2\2\u00c0\u0466\3\2"+
		"\2\2\u00c2\u047f\3\2\2\2\u00c4\u0481\3\2\2\2\u00c6\u0483\3\2\2\2\u00c8"+
		"\u00c9\5\4\3\2\u00c9\u00ca\7\2\2\3\u00ca\3\3\2\2\2\u00cb\u00d1\5\6\4\2"+
		"\u00cc\u00cd\5\6\4\2\u00cd\u00ce\5\4\3\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\5\3\2\2\2\u00d2\u00dc\5\b\5\2\u00d3\u00dc\5\n\6\2\u00d4\u00dc\5\20\t"+
		"\2\u00d5\u00dc\5,\27\2\u00d6\u00dc\5> \2\u00d7\u00dc\5d\63\2\u00d8\u00dc"+
		"\5\u0084C\2\u00d9\u00dc\5\u0080A\2\u00da\u00dc\5\u00a4S\2\u00db\u00d2"+
		"\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d5\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc\7\3\2\2\2\u00dd\u00de\7.\2\2\u00de\t\3"+
		"\2\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\7\27\2\2\u00e2"+
		"\13\3\2\2\2\u00e3\u00e9\5\16\b\2\u00e4\u00e5\5\16\b\2\u00e5\u00e6\7\34"+
		"\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e9\r\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\17\3\2\2\2\u00ec"+
		"\u00ed\5\22\n\2\u00ed\21\3\2\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\5\24"+
		"\13\2\u00f0\u00f1\7\27\2\2\u00f1\u011e\3\2\2\2\u00f2\u00f3\5\u0090I\2"+
		"\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5\24\13\2\u00f5\u00f6\7\27\2\2\u00f6"+
		"\u011e\3\2\2\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fa\5"+
		"\24\13\2\u00fa\u00fb\7\27\2\2\u00fb\u011e\3\2\2\2\u00fc\u00fd\5\u0090"+
		"I\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5\24\13\2\u0100"+
		"\u0101\7\27\2\2\u0101\u011e\3\2\2\2\u0102\u0103\7\17\2\2\u0103\u0104\5"+
		"\u0090I\2\u0104\u0105\7\16\2\2\u0105\u0106\7\4\2\2\u0106\u0107\5\24\13"+
		"\2\u0107\u0108\7\27\2\2\u0108\u011e\3\2\2\2\u0109\u010a\7\17\2\2\u010a"+
		"\u010b\5\u0090I\2\u010b\u010c\7\4\2\2\u010c\u010d\5\24\13\2\u010d\u010e"+
		"\7\27\2\2\u010e\u011e\3\2\2\2\u010f\u0110\7\17\2\2\u0110\u0111\7\4\2\2"+
		"\u0111\u0112\5\24\13\2\u0112\u0113\7\27\2\2\u0113\u011e\3\2\2\2\u0114"+
		"\u0115\7\17\2\2\u0115\u0116\7\16\2\2\u0116\u0117\7\4\2\2\u0117\u0118\5"+
		"\24\13\2\u0118\u0119\7\27\2\2\u0119\u011e\3\2\2\2\u011a\u011b\5\24\13"+
		"\2\u011b\u011c\7\27\2\2\u011c\u011e\3\2\2\2\u011d\u00ee\3\2\2\2\u011d"+
		"\u00f2\3\2\2\2\u011d\u00f7\3\2\2\2\u011d\u00fc\3\2\2\2\u011d\u0102\3\2"+
		"\2\2\u011d\u0109\3\2\2\2\u011d\u010f\3\2\2\2\u011d\u0114\3\2\2\2\u011d"+
		"\u011a\3\2\2\2\u011e\23\3\2\2\2\u011f\u0125\5\26\f\2\u0120\u0121\5\26"+
		"\f\2\u0121\u0122\7\34\2\2\u0122\u0123\5\24\13\2\u0123\u0125\3\2\2\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0125\25\3\2\2\2\u0126\u0127\7\'\2"+
		"\2\u0127\u0136\5\30\r\2\u0128\u0129\5\u00c4c\2\u0129\u012a\7\31\2\2\u012a"+
		"\u012b\5\u00c6d\2\u012b\u012c\5\30\r\2\u012c\u0136\3\2\2\2\u012d\u012e"+
		"\5\u00c4c\2\u012e\u012f\7\33\2\2\u012f\u0130\5\u00c6d\2\u0130\u0131\5"+
		"\30\r\2\u0131\u0136\3\2\2\2\u0132\u0133\5\u00ba^\2\u0133\u0134\5\30\r"+
		"\2\u0134\u0136\3\2\2\2\u0135\u0126\3\2\2\2\u0135\u0128\3\2\2\2\u0135\u012d"+
		"\3\2\2\2\u0135\u0132\3\2\2\2\u0136\27\3\2\2\2\u0137\u0138\t\2\2\2\u0138"+
		"\u0144\5\u00c2b\2\u0139\u013a\7)\2\2\u013a\u013b\t\2\2\2\u013b\u0144\5"+
		"\u00c2b\2\u013c\u013d\t\2\2\2\u013d\u013e\7\25\2\2\u013e\u0144\5\u00c2"+
		"b\2\u013f\u0140\7)\2\2\u0140\u0141\t\2\2\2\u0141\u0142\7\25\2\2\u0142"+
		"\u0144\5\u00c2b\2\u0143\u0137\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013c"+
		"\3\2\2\2\u0143\u013f\3\2\2\2\u0144\31\3\2\2\2\u0145\u0146\7\35\2\2\u0146"+
		"\u014c\7\36\2\2\u0147\u0148\7\35\2\2\u0148\u0149\5\34\17\2\u0149\u014a"+
		"\7\36\2\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2"+
		"\u014c\33\3\2\2\2\u014d\u0153\5\u00c2b\2\u014e\u014f\5\u00c2b\2\u014f"+
		"\u0150\7\34\2\2\u0150\u0151\5\34\17\2\u0151\u0153\3\2\2\2\u0152\u014d"+
		"\3\2\2\2\u0152\u014e\3\2\2\2\u0153\35\3\2\2\2\u0154\u0155\7\37\2\2\u0155"+
		"\u015b\7 \2\2\u0156\u0157\7\37\2\2\u0157\u0158\5 \21\2\u0158\u0159\7 "+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0156\3\2\2\2\u015b"+
		"\37\3\2\2\2\u015c\u015d\7\'\2\2\u015d\u015e\7\32\2\2\u015e\u0166\5\u00c2"+
		"b\2\u015f\u0160\7\'\2\2\u0160\u0161\7\32\2\2\u0161\u0162\5\u00c2b\2\u0162"+
		"\u0163\7\34\2\2\u0163\u0164\5 \21\2\u0164\u0166\3\2\2\2\u0165\u015c\3"+
		"\2\2\2\u0165\u015f\3\2\2\2\u0166!\3\2\2\2\u0167\u0168\7!\2\2\u0168\u0169"+
		"\5$\23\2\u0169\u016a\7\"\2\2\u016a#\3\2\2\2\u016b\u0170\5&\24\2\u016c"+
		"\u016d\5&\24\2\u016d\u016e\5$\23\2\u016e\u0170\3\2\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u016c\3\2\2\2\u0170%\3\2\2\2\u0171\u01ca\5.\30\2\u0172\u0173"+
		"\5.\30\2\u0173\u0174\7#\2\2\u0174\u01ca\3\2\2\2\u0175\u0176\5.\30\2\u0176"+
		"\u0177\7)\2\2\u0177\u01ca\3\2\2\2\u0178\u0179\5.\30\2\u0179\u017a\7)\2"+
		"\2\u017a\u017b\7#\2\2\u017b\u01ca\3\2\2\2\u017c\u01ca\7\'\2\2\u017d\u017e"+
		"\7\'\2\2\u017e\u01ca\7#\2\2\u017f\u0180\7\'\2\2\u0180\u01ca\7)\2\2\u0181"+
		"\u0182\7\'\2\2\u0182\u0183\7)\2\2\u0183\u01ca\7#\2\2\u0184\u0185\5(\25"+
		"\2\u0185\u0186\7\'\2\2\u0186\u01ca\3\2\2\2\u0187\u0188\5(\25\2\u0188\u0189"+
		"\7\'\2\2\u0189\u018a\7#\2\2\u018a\u01ca\3\2\2\2\u018b\u018c\5(\25\2\u018c"+
		"\u018d\7\'\2\2\u018d\u018e\7)\2\2\u018e\u01ca\3\2\2\2\u018f\u0190\5(\25"+
		"\2\u0190\u0191\7\'\2\2\u0191\u0192\7)\2\2\u0192\u0193\7#\2\2\u0193\u01ca"+
		"\3\2\2\2\u0194\u0195\7\'\2\2\u0195\u01ca\5*\26\2\u0196\u0197\7\'\2\2\u0197"+
		"\u0198\5*\26\2\u0198\u0199\7#\2\2\u0199\u01ca\3\2\2\2\u019a\u019b\7\'"+
		"\2\2\u019b\u019c\5*\26\2\u019c\u019d\7)\2\2\u019d\u01ca\3\2\2\2\u019e"+
		"\u019f\7\'\2\2\u019f\u01a0\5*\26\2\u01a0\u01a1\7)\2\2\u01a1\u01a2\7#\2"+
		"\2\u01a2\u01ca\3\2\2\2\u01a3\u01ca\7+\2\2\u01a4\u01a5\7+\2\2\u01a5\u01ca"+
		"\7#\2\2\u01a6\u01a7\7+\2\2\u01a7\u01ca\7)\2\2\u01a8\u01a9\7+\2\2\u01a9"+
		"\u01aa\7)\2\2\u01aa\u01ca\7#\2\2\u01ab\u01ca\7,\2\2\u01ac\u01ad\7,\2\2"+
		"\u01ad\u01ca\7#\2\2\u01ae\u01af\7,\2\2\u01af\u01ca\7)\2\2\u01b0\u01b1"+
		"\7,\2\2\u01b1\u01b2\7)\2\2\u01b2\u01ca\7#\2\2\u01b3\u01ca\5\"\22\2\u01b4"+
		"\u01b5\5\"\22\2\u01b5\u01b6\7#\2\2\u01b6\u01ca\3\2\2\2\u01b7\u01b8\5\""+
		"\22\2\u01b8\u01b9\7)\2\2\u01b9\u01ca\3\2\2\2\u01ba\u01bb\5\"\22\2\u01bb"+
		"\u01bc\7)\2\2\u01bc\u01bd\7#\2\2\u01bd\u01ca\3\2\2\2\u01be\u01ca\5\u00ba"+
		"^\2\u01bf\u01c0\5\u00ba^\2\u01c0\u01c1\7#\2\2\u01c1\u01ca\3\2\2\2\u01c2"+
		"\u01c3\5\u00ba^\2\u01c3\u01c4\7)\2\2\u01c4\u01ca\3\2\2\2\u01c5\u01c6\5"+
		"\u00ba^\2\u01c6\u01c7\7)\2\2\u01c7\u01c8\7#\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u0171\3\2\2\2\u01c9\u0172\3\2\2\2\u01c9\u0175\3\2\2\2\u01c9\u0178\3\2"+
		"\2\2\u01c9\u017c\3\2\2\2\u01c9\u017d\3\2\2\2\u01c9\u017f\3\2\2\2\u01c9"+
		"\u0181\3\2\2\2\u01c9\u0184\3\2\2\2\u01c9\u0187\3\2\2\2\u01c9\u018b\3\2"+
		"\2\2\u01c9\u018f\3\2\2\2\u01c9\u0194\3\2\2\2\u01c9\u0196\3\2\2\2\u01c9"+
		"\u019a\3\2\2\2\u01c9\u019e\3\2\2\2\u01c9\u01a3\3\2\2\2\u01c9\u01a4\3\2"+
		"\2\2\u01c9\u01a6\3\2\2\2\u01c9\u01a8\3\2\2\2\u01c9\u01ab\3\2\2\2\u01c9"+
		"\u01ac\3\2\2\2\u01c9\u01ae\3\2\2\2\u01c9\u01b0\3\2\2\2\u01c9\u01b3\3\2"+
		"\2\2\u01c9\u01b4\3\2\2\2\u01c9\u01b7\3\2\2\2\u01c9\u01ba\3\2\2\2\u01c9"+
		"\u01be\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01c5\3\2"+
		"\2\2\u01ca\'\3\2\2\2\u01cb\u01cc\7&\2\2\u01cc)\3\2\2\2\u01cd\u01ce\7&"+
		"\2\2\u01ce+\3\2\2\2\u01cf\u01d0\5.\30\2\u01d0\u01d1\7\27\2\2\u01d1-\3"+
		"\2\2\2\u01d2\u01d3\7\'\2\2\u01d3\u01e0\5:\36\2\u01d4\u01d5\7\'\2\2\u01d5"+
		"\u01d6\7\31\2\2\u01d6\u01d7\5\66\34\2\u01d7\u01d8\5:\36\2\u01d8\u01e0"+
		"\3\2\2\2\u01d9\u01da\7\'\2\2\u01da\u01db\7\33\2\2\u01db\u01dc\5\66\34"+
		"\2\u01dc\u01dd\5:\36\2\u01dd\u01e0\3\2\2\2\u01de\u01e0\5\60\31\2\u01df"+
		"\u01d2\3\2\2\2\u01df\u01d4\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01de\3\2"+
		"\2\2\u01e0/\3\2\2\2\u01e1\u01e2\7\'\2\2\u01e2\u01e3\7\31\2\2\u01e3\u01e4"+
		"\5\62\32\2\u01e4\61\3\2\2\2\u01e5\u01eb\5\64\33\2\u01e6\u01e7\5\64\33"+
		"\2\u01e7\u01e8\7\31\2\2\u01e8\u01e9\5\62\32\2\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\63\3\2\2\2\u01ec\u01ed\7\'\2"+
		"\2\u01ed\u01ee\5:\36\2\u01ee\65\3\2\2\2\u01ef\u01f0\7\'\2\2\u01f0\67\3"+
		"\2\2\2\u01f1\u01f2\7\31\2\2\u01f29\3\2\2\2\u01f3\u01f4\7!\2\2\u01f4\u01fa"+
		"\7\"\2\2\u01f5\u01f6\7!\2\2\u01f6\u01f7\5<\37\2\u01f7\u01f8\7\"\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f3\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa;\3\2\2\2"+
		"\u01fb\u0206\5\u00c2b\2\u01fc\u01fd\5\u00c2b\2\u01fd\u01fe\7\34\2\2\u01fe"+
		"\u01ff\5<\37\2\u01ff\u0206\3\2\2\2\u0200\u0206\5$\23\2\u0201\u0202\5$"+
		"\23\2\u0202\u0203\7\34\2\2\u0203\u0204\5<\37\2\u0204\u0206\3\2\2\2\u0205"+
		"\u01fb\3\2\2\2\u0205\u01fc\3\2\2\2\u0205\u0200\3\2\2\2\u0205\u0201\3\2"+
		"\2\2\u0206=\3\2\2\2\u0207\u020c\5@!\2\u0208\u0209\5@!\2\u0209\u020a\5"+
		"> \2\u020a\u020c\3\2\2\2\u020b\u0207\3\2\2\2\u020b\u0208\3\2\2\2\u020c"+
		"?\3\2\2\2\u020d\u0219\5B\"\2\u020e\u020f\5B\"\2\u020f\u0210\5D#\2\u0210"+
		"\u0219\3\2\2\2\u0211\u0212\5B\"\2\u0212\u0213\5H%\2\u0213\u0219\3\2\2"+
		"\2\u0214\u0215\5B\"\2\u0215\u0216\5D#\2\u0216\u0217\5H%\2\u0217\u0219"+
		"\3\2\2\2\u0218\u020d\3\2\2\2\u0218\u020e\3\2\2\2\u0218\u0211\3\2\2\2\u0218"+
		"\u0214\3\2\2\2\u0219A\3\2\2\2\u021a\u021b\7\5\2\2\u021b\u021c\5J&\2\u021c"+
		"\u021d\5L\'\2\u021dC\3\2\2\2\u021e\u0223\5F$\2\u021f\u0220\5F$\2\u0220"+
		"\u0221\5D#\2\u0221\u0223\3\2\2\2\u0222\u021e\3\2\2\2\u0222\u021f\3\2\2"+
		"\2\u0223E\3\2\2\2\u0224\u0225\7\6\2\2\u0225\u0226\5J&\2\u0226\u0227\5"+
		"L\'\2\u0227G\3\2\2\2\u0228\u0229\7\7\2\2\u0229\u022a\5L\'\2\u022aI\3\2"+
		"\2\2\u022b\u022c\5P)\2\u022cK\3\2\2\2\u022d\u022e\7\37\2\2\u022e\u0238"+
		"\7 \2\2\u022f\u0230\7\37\2\2\u0230\u0231\5N(\2\u0231\u0232\7 \2\2\u0232"+
		"\u0238\3\2\2\2\u0233\u0238\5> \2\u0234\u0238\5,\27\2\u0235\u0238\5d\63"+
		"\2\u0236\u0238\5\u0080A\2\u0237\u022d\3\2\2\2\u0237\u022f\3\2\2\2\u0237"+
		"\u0233\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2"+
		"\2\2\u0238M\3\2\2\2\u0239\u023e\5\6\4\2\u023a\u023b\5\6\4\2\u023b\u023c"+
		"\5N(\2\u023c\u023e\3\2\2\2\u023d\u0239\3\2\2\2\u023d\u023a\3\2\2\2\u023e"+
		"O\3\2\2\2\u023f\u0248\5R*\2\u0240\u0241\5R*\2\u0241\u0242\5P)\2\u0242"+
		"\u0248\3\2\2\2\u0243\u0248\5T+\2\u0244\u0245\5T+\2\u0245\u0246\5P)\2\u0246"+
		"\u0248\3\2\2\2\u0247\u023f\3\2\2\2\u0247\u0240\3\2\2\2\u0247\u0243\3\2"+
		"\2\2\u0247\u0244\3\2\2\2\u0248Q\3\2\2\2\u0249\u024a\7%\2\2\u024a\u024d"+
		"\5Z.\2\u024b\u024d\5Z.\2\u024c\u0249\3\2\2\2\u024c\u024b\3\2\2\2\u024d"+
		"S\3\2\2\2\u024e\u0252\5V,\2\u024f\u0250\7%\2\2\u0250\u0252\5V,\2\u0251"+
		"\u024e\3\2\2\2\u0251\u024f\3\2\2\2\u0252U\3\2\2\2\u0253\u025c\5X-\2\u0254"+
		"\u0255\5X-\2\u0255\u0256\t\3\2\2\u0256\u025c\3\2\2\2\u0257\u0258\5X-\2"+
		"\u0258\u0259\7)\2\2\u0259\u025a\t\3\2\2\u025a\u025c\3\2\2\2\u025b\u0253"+
		"\3\2\2\2\u025b\u0254\3\2\2\2\u025b\u0257\3\2\2\2\u025cW\3\2\2\2\u025d"+
		"\u025e\7!\2\2\u025e\u025f\5P)\2\u025f\u0260\7\"\2\2\u0260Y\3\2\2\2\u0261"+
		"\u0262\5(\25\2\u0262\u0263\7\'\2\2\u0263\u02bb\3\2\2\2\u0264\u0265\5("+
		"\25\2\u0265\u0266\7\'\2\2\u0266\u0267\t\3\2\2\u0267\u02bb\3\2\2\2\u0268"+
		"\u0269\5(\25\2\u0269\u026a\7\'\2\2\u026a\u026b\7)\2\2\u026b\u02bb\3\2"+
		"\2\2\u026c\u026d\5(\25\2\u026d\u026e\7\'\2\2\u026e\u026f\7)\2\2\u026f"+
		"\u0270\t\3\2\2\u0270\u02bb\3\2\2\2\u0271\u0272\7\'\2\2\u0272\u02bb\5*"+
		"\26\2\u0273\u0274\7\'\2\2\u0274\u0275\5*\26\2\u0275\u0276\t\3\2\2\u0276"+
		"\u02bb\3\2\2\2\u0277\u0278\7\'\2\2\u0278\u0279\5*\26\2\u0279\u027a\7)"+
		"\2\2\u027a\u02bb\3\2\2\2\u027b\u027c\7\'\2\2\u027c\u027d\5*\26\2\u027d"+
		"\u027e\7)\2\2\u027e\u027f\t\3\2\2\u027f\u02bb\3\2\2\2\u0280\u02bb\7+\2"+
		"\2\u0281\u0282\7+\2\2\u0282\u02bb\t\3\2\2\u0283\u0284\7+\2\2\u0284\u02bb"+
		"\7)\2\2\u0285\u0286\7+\2\2\u0286\u0287\7)\2\2\u0287\u02bb\t\3\2\2\u0288"+
		"\u02bb\7,\2\2\u0289\u028a\7,\2\2\u028a\u02bb\t\3\2\2\u028b\u028c\7,\2"+
		"\2\u028c\u02bb\7)\2\2\u028d\u028e\7,\2\2\u028e\u028f\7)\2\2\u028f\u02bb"+
		"\t\3\2\2\u0290\u02bb\5\\/\2\u0291\u02bb\5.\30\2\u0292\u0293\5.\30\2\u0293"+
		"\u0294\t\3\2\2\u0294\u02bb\3\2\2\2\u0295\u0296\5.\30\2\u0296\u0297\7)"+
		"\2\2\u0297\u02bb\3\2\2\2\u0298\u0299\5.\30\2\u0299\u029a\7)\2\2\u029a"+
		"\u029b\t\3\2\2\u029b\u02bb\3\2\2\2\u029c\u02bb\5\"\22\2\u029d\u029e\5"+
		"\"\22\2\u029e\u029f\t\3\2\2\u029f\u02bb\3\2\2\2\u02a0\u02a1\5\"\22\2\u02a1"+
		"\u02a2\7)\2\2\u02a2\u02bb\3\2\2\2\u02a3\u02a4\5\"\22\2\u02a4\u02a5\7)"+
		"\2\2\u02a5\u02a6\t\3\2\2\u02a6\u02bb\3\2\2\2\u02a7\u02bb\7\'\2\2\u02a8"+
		"\u02a9\7\'\2\2\u02a9\u02bb\t\3\2\2\u02aa\u02ab\7\'\2\2\u02ab\u02bb\7)"+
		"\2\2\u02ac\u02ad\7\'\2\2\u02ad\u02ae\7)\2\2\u02ae\u02bb\t\3\2\2\u02af"+
		"\u02bb\5\u00ba^\2\u02b0\u02b1\5\u00ba^\2\u02b1\u02b2\t\3\2\2\u02b2\u02bb"+
		"\3\2\2\2\u02b3\u02b4\5\u00ba^\2\u02b4\u02b5\7)\2\2\u02b5\u02bb\3\2\2\2"+
		"\u02b6\u02b7\5\u00ba^\2\u02b7\u02b8\7)\2\2\u02b8\u02b9\t\3\2\2\u02b9\u02bb"+
		"\3\2\2\2\u02ba\u0261\3\2\2\2\u02ba\u0264\3\2\2\2\u02ba\u0268\3\2\2\2\u02ba"+
		"\u026c\3\2\2\2\u02ba\u0271\3\2\2\2\u02ba\u0273\3\2\2\2\u02ba\u0277\3\2"+
		"\2\2\u02ba\u027b\3\2\2\2\u02ba\u0280\3\2\2\2\u02ba\u0281\3\2\2\2\u02ba"+
		"\u0283\3\2\2\2\u02ba\u0285\3\2\2\2\u02ba\u0288\3\2\2\2\u02ba\u0289\3\2"+
		"\2\2\u02ba\u028b\3\2\2\2\u02ba\u028d\3\2\2\2\u02ba\u0290\3\2\2\2\u02ba"+
		"\u0291\3\2\2\2\u02ba\u0292\3\2\2\2\u02ba\u0295\3\2\2\2\u02ba\u0298\3\2"+
		"\2\2\u02ba\u029c\3\2\2\2\u02ba\u029d\3\2\2\2\u02ba\u02a0\3\2\2\2\u02ba"+
		"\u02a3\3\2\2\2\u02ba\u02a7\3\2\2\2\u02ba\u02a8\3\2\2\2\u02ba\u02aa\3\2"+
		"\2\2\u02ba\u02ac\3\2\2\2\u02ba\u02af\3\2\2\2\u02ba\u02b0\3\2\2\2\u02ba"+
		"\u02b3\3\2\2\2\u02ba\u02b6\3\2\2\2\u02bb[\3\2\2\2\u02bc\u02bd\5^\60\2"+
		"\u02bd\u02be\7\30\2\2\u02be\u02bf\5`\61\2\u02bf]\3\2\2\2\u02c0\u02c3\5"+
		"\u00ba^\2\u02c1\u02c3\7\'\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2"+
		"\u02c3_\3\2\2\2\u02c4\u02c5\5b\62\2\u02c5a\3\2\2\2\u02c6\u02d2\5.\30\2"+
		"\u02c7\u02c8\5.\30\2\u02c8\u02c9\t\3\2\2\u02c9\u02d2\3\2\2\2\u02ca\u02cb"+
		"\5.\30\2\u02cb\u02cc\7)\2\2\u02cc\u02d2\3\2\2\2\u02cd\u02ce\5.\30\2\u02ce"+
		"\u02cf\7)\2\2\u02cf\u02d0\t\3\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02c6\3\2"+
		"\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02ca\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d2"+
		"c\3\2\2\2\u02d3\u02d8\5f\64\2\u02d4\u02d5\5f\64\2\u02d5\u02d6\5d\63\2"+
		"\u02d6\u02d8\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d7\u02d4\3\2\2\2\u02d8e\3"+
		"\2\2\2\u02d9\u02da\7\b\2\2\u02da\u02db\5h\65\2\u02db\u02dc\5~@\2\u02dc"+
		"g\3\2\2\2\u02dd\u02e1\5j\66\2\u02de\u02e1\5l\67\2\u02df\u02e1\5n8\2\u02e0"+
		"\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1i\3\2\2\2"+
		"\u02e2\u02e3\7!\2\2\u02e3\u02e6\7\"\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e2"+
		"\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6k\3\2\2\2\u02e7\u02e8\7!\2\2\u02e8\u02e9"+
		"\5t;\2\u02e9\u02ea\5p9\2\u02ea\u02eb\5v<\2\u02eb\u02ec\5r:\2\u02ec\u02ed"+
		"\5x=\2\u02ed\u02ee\7\"\2\2\u02ee\u02f6\3\2\2\2\u02ef\u02f0\5t;\2\u02f0"+
		"\u02f1\5p9\2\u02f1\u02f2\5v<\2\u02f2\u02f3\5r:\2\u02f3\u02f4\5x=\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02e7\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f6m\3\2\2\2"+
		"\u02f7\u02f8\5v<\2\u02f8o\3\2\2\2\u02f9\u02fa\7\27\2\2\u02faq\3\2\2\2"+
		"\u02fb\u02fc\7\27\2\2\u02fcs\3\2\2\2\u02fd\u0302\5\24\13\2\u02fe\u02ff"+
		"\7\4\2\2\u02ff\u0302\5\24\13\2\u0300\u0302\3\2\2\2\u0301\u02fd\3\2\2\2"+
		"\u0301\u02fe\3\2\2\2\u0301\u0300\3\2\2\2\u0302u\3\2\2\2\u0303\u0306\5"+
		"P)\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306"+
		"w\3\2\2\2\u0307\u030a\5z>\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u0308\3\2\2\2\u030ay\3\2\2\2\u030b\u0311\5$\23\2\u030c\u030d\5$\23\2"+
		"\u030d\u030e\7\34\2\2\u030e\u030f\5z>\2\u030f\u0311\3\2\2\2\u0310\u030b"+
		"\3\2\2\2\u0310\u030c\3\2\2\2\u0311{\3\2\2\2\u0312\u0317\5\6\4\2\u0313"+
		"\u0314\5\6\4\2\u0314\u0315\5|?\2\u0315\u0317\3\2\2\2\u0316\u0312\3\2\2"+
		"\2\u0316\u0313\3\2\2\2\u0317}\3\2\2\2\u0318\u0319\7\37\2\2\u0319\u0323"+
		"\7 \2\2\u031a\u031b\7\37\2\2\u031b\u031c\5|?\2\u031c\u031d\7 \2\2\u031d"+
		"\u0323\3\2\2\2\u031e\u0323\5> \2\u031f\u0323\5,\27\2\u0320\u0323\5d\63"+
		"\2\u0321\u0323\5\u0080A\2\u0322\u0318\3\2\2\2\u0322\u031a\3\2\2\2\u0322"+
		"\u031e\3\2\2\2\u0322\u031f\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2"+
		"\2\2\u0323\177\3\2\2\2\u0324\u0325\7\t\2\2\u0325\u0326\5\u0082B\2\u0326"+
		"\u0327\7\27\2\2\u0327\u0081\3\2\2\2\u0328\u032b\5\u00c2b\2\u0329\u032b"+
		"\5$\23\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b\u0083\3\2\2\2\u032c"+
		"\u032d\5\u0086D\2\u032d\u032e\7\37\2\2\u032e\u032f\7 \2\2\u032f\u034b"+
		"\3\2\2\2\u0330\u0331\5\u0086D\2\u0331\u0332\7\37\2\2\u0332\u0333\5\u009a"+
		"N\2\u0333\u0334\7 \2\2\u0334\u034b\3\2\2\2\u0335\u0336\5\u008cG\2\u0336"+
		"\u0337\7\37\2\2\u0337\u0338\7 \2\2\u0338\u034b\3\2\2\2\u0339\u033a\5\u008c"+
		"G\2\u033a\u033b\7\37\2\2\u033b\u033c\5\u009aN\2\u033c\u033d\7 \2\2\u033d"+
		"\u034b\3\2\2\2\u033e\u033f\5\u0096L\2\u033f\u0340\7\37\2\2\u0340\u0341"+
		"\7 \2\2\u0341\u034b\3\2\2\2\u0342\u0343\5\u0096L\2\u0343\u0344\7\37\2"+
		"\2\u0344\u0345\5\u009aN\2\u0345\u0346\7 \2\2\u0346\u034b\3\2\2\2\u0347"+
		"\u0348\5\u0098M\2\u0348\u0349\7\27\2\2\u0349\u034b\3\2\2\2\u034a\u032c"+
		"\3\2\2\2\u034a\u0330\3\2\2\2\u034a\u0335\3\2\2\2\u034a\u0339\3\2\2\2\u034a"+
		"\u033e\3\2\2\2\u034a\u0342\3\2\2\2\u034a\u0347\3\2\2\2\u034b\u0085\3\2"+
		"\2\2\u034c\u034d\5\u0088E\2\u034d\u0087\3\2\2\2\u034e\u034f\7\n\2\2\u034f"+
		"\u0350\7\'\2\2\u0350\u0351\7!\2\2\u0351\u036c\7\"\2\2\u0352\u0353\7\n"+
		"\2\2\u0353\u0354\7\'\2\2\u0354\u0355\7!\2\2\u0355\u0356\7\"\2\2\u0356"+
		"\u0359\7\26\2\2\u0357\u035a\5\u008aF\2\u0358\u035a\7)\2\2\u0359\u0357"+
		"\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u036c\3\2\2\2\u035b\u035c\7\n\2\2\u035c"+
		"\u035d\7\'\2\2\u035d\u035e\7!\2\2\u035e\u035f\5\u009eP\2\u035f\u0360\7"+
		"\"\2\2\u0360\u036c\3\2\2\2\u0361\u0362\7\n\2\2\u0362\u0363\7\'\2\2\u0363"+
		"\u0364\7!\2\2\u0364\u0365\5\u009eP\2\u0365\u0366\7\"\2\2\u0366\u0369\7"+
		"\26\2\2\u0367\u036a\5\u008aF\2\u0368\u036a\7)\2\2\u0369\u0367\3\2\2\2"+
		"\u0369\u0368\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u034e\3\2\2\2\u036b\u0352"+
		"\3\2\2\2\u036b\u035b\3\2\2\2\u036b\u0361\3\2\2\2\u036c\u0089\3\2\2\2\u036d"+
		"\u036e\7\'\2\2\u036e\u008b\3\2\2\2\u036f\u0370\5\u0094K\2\u0370\u0371"+
		"\5\u0088E\2\u0371\u008d\3\2\2\2\u0372\u0373\5\u0090I\2\u0373\u0374\5\u0088"+
		"E\2\u0374\u038a\3\2\2\2\u0375\u0376\7\16\2\2\u0376\u038a\5\u0088E\2\u0377"+
		"\u0378\5\u0090I\2\u0378\u0379\7\16\2\2\u0379\u037a\5\u0088E\2\u037a\u038a"+
		"\3\2\2\2\u037b\u037c\7\17\2\2\u037c\u037d\5\u0090I\2\u037d\u037e\7\16"+
		"\2\2\u037e\u037f\5\u0088E\2\u037f\u038a\3\2\2\2\u0380\u0381\7\17\2\2\u0381"+
		"\u0382\5\u0090I\2\u0382\u0383\5\u0088E\2\u0383\u038a\3\2\2\2\u0384\u0385"+
		"\7\17\2\2\u0385\u038a\5\u0088E\2\u0386\u0387\7\17\2\2\u0387\u0388\7\16"+
		"\2\2\u0388\u038a\5\u0088E\2\u0389\u0372\3\2\2\2\u0389\u0375\3\2\2\2\u0389"+
		"\u0377\3\2\2\2\u0389\u037b\3\2\2\2\u0389\u0380\3\2\2\2\u0389\u0384\3\2"+
		"\2\2\u0389\u0386\3\2\2\2\u038a\u008f\3\2\2\2\u038b\u038c\t\4\2\2\u038c"+
		"\u0091\3\2\2\2\u038d\u038e\t\5\2\2\u038e\u0093\3\2\2\2\u038f\u0394\5\u0092"+
		"J\2\u0390\u0391\5\u0092J\2\u0391\u0392\5\u0094K\2\u0392\u0394\3\2\2\2"+
		"\u0393\u038f\3\2\2\2\u0393\u0390\3\2\2\2\u0394\u0095\3\2\2\2\u0395\u0396"+
		"\7\'\2\2\u0396\u0397\7!\2\2\u0397\u039e\7\"\2\2\u0398\u0399\7\'\2\2\u0399"+
		"\u039a\7!\2\2\u039a\u039b\5\u009eP\2\u039b\u039c\7\"\2\2\u039c\u039e\3"+
		"\2\2\2\u039d\u0395\3\2\2\2\u039d\u0398\3\2\2\2\u039e\u0097\3\2\2\2\u039f"+
		"\u03a2\5\u0086D\2\u03a0\u03a2\5\u008cG\2\u03a1\u039f\3\2\2\2\u03a1\u03a0"+
		"\3\2\2\2\u03a2\u0099\3\2\2\2\u03a3\u03a4\5\u009cO\2\u03a4\u009b\3\2\2"+
		"\2\u03a5\u03aa\5\6\4\2\u03a6\u03a7\5\6\4\2\u03a7\u03a8\5\u009cO\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03a5\3\2\2\2\u03a9\u03a6\3\2\2\2\u03aa\u009d\3\2"+
		"\2\2\u03ab\u03ac\5\u00a0Q\2\u03ac\u009f\3\2\2\2\u03ad\u03b3\5\u00a2R\2"+
		"\u03ae\u03af\5\u00a2R\2\u03af\u03b0\7\34\2\2\u03b0\u03b1\5\u00a0Q\2\u03b1"+
		"\u03b3\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b2\u03ae\3\2\2\2\u03b3\u00a1\3\2"+
		"\2\2\u03b4\u03b5\7\'\2\2\u03b5\u03b6\7)\2\2\u03b6\u00a3\3\2\2\2\u03b7"+
		"\u03bb\5\u00a6T\2\u03b8\u03bb\5\u00acW\2\u03b9\u03bb\5\u00b2Z\2\u03ba"+
		"\u03b7\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u00a5\3\2"+
		"\2\2\u03bc\u03bd\5\u00a8U\2\u03bd\u00a7\3\2\2\2\u03be\u03bf\7\20\2\2\u03bf"+
		"\u03c0\7\'\2\2\u03c0\u03c1\7\37\2\2\u03c1\u03d8\7 \2\2\u03c2\u03c3\7\20"+
		"\2\2\u03c3\u03c4\7\'\2\2\u03c4\u03c5\7\37\2\2\u03c5\u03c6\5\u00aaV\2\u03c6"+
		"\u03c7\7 \2\2\u03c7\u03d8\3\2\2\2\u03c8\u03c9\7\20\2\2\u03c9\u03ca\7\'"+
		"\2\2\u03ca\u03cb\7\22\2\2\u03cb\u03cc\5\66\34\2\u03cc\u03cd\7\37\2\2\u03cd"+
		"\u03ce\7 \2\2\u03ce\u03d8\3\2\2\2\u03cf\u03d0\7\20\2\2\u03d0\u03d1\7\'"+
		"\2\2\u03d1\u03d2\7\22\2\2\u03d2\u03d3\5\66\34\2\u03d3\u03d4\7\37\2\2\u03d4"+
		"\u03d5\5\u00aaV\2\u03d5\u03d6\7 \2\2\u03d6\u03d8\3\2\2\2\u03d7\u03be\3"+
		"\2\2\2\u03d7\u03c2\3\2\2\2\u03d7\u03c8\3\2\2\2\u03d7\u03cf\3\2\2\2\u03d8"+
		"\u00a9\3\2\2\2\u03d9\u03da\5\u009cO\2\u03da\u00ab\3\2\2\2\u03db\u03dc"+
		"\5\u00aeX\2\u03dc\u00ad\3\2\2\2\u03dd\u03de\7\21\2\2\u03de\u03df\7\'\2"+
		"\2\u03df\u03e0\7\37\2\2\u03e0\u03f7\7 \2\2\u03e1\u03e2\7\21\2\2\u03e2"+
		"\u03e3\7\'\2\2\u03e3\u03e4\7\37\2\2\u03e4\u03e5\5\u00b0Y\2\u03e5\u03e6"+
		"\7 \2\2\u03e6\u03f7\3\2\2\2\u03e7\u03e8\7\21\2\2\u03e8\u03e9\7\'\2\2\u03e9"+
		"\u03ea\7\22\2\2\u03ea\u03eb\5\66\34\2\u03eb\u03ec\7\37\2\2\u03ec\u03ed"+
		"\7 \2\2\u03ed\u03f7\3\2\2\2\u03ee\u03ef\7\21\2\2\u03ef\u03f0\7\'\2\2\u03f0"+
		"\u03f1\7\22\2\2\u03f1\u03f2\5\66\34\2\u03f2\u03f3\7\37\2\2\u03f3\u03f4"+
		"\5\u00b0Y\2\u03f4\u03f5\7 \2\2\u03f5\u03f7\3\2\2\2\u03f6\u03dd\3\2\2\2"+
		"\u03f6\u03e1\3\2\2\2\u03f6\u03e7\3\2\2\2\u03f6\u03ee\3\2\2\2\u03f7\u00af"+
		"\3\2\2\2\u03f8\u03f9\5\u009cO\2\u03f9\u00b1\3\2\2\2\u03fa\u03fb\5\u00b6"+
		"\\\2\u03fb\u03fc\7\37\2\2\u03fc\u03fd\7 \2\2\u03fd\u0404\3\2\2\2\u03fe"+
		"\u03ff\5\u00b6\\\2\u03ff\u0400\7\37\2\2\u0400\u0401\5\u00b4[\2\u0401\u0402"+
		"\7 \2\2\u0402\u0404\3\2\2\2\u0403\u03fa\3\2\2\2\u0403\u03fe\3\2\2\2\u0404"+
		"\u00b3\3\2\2\2\u0405\u0406\5\u009cO\2\u0406\u00b5\3\2\2\2\u0407\u0408"+
		"\7\23\2\2\u0408\u042e\7\'\2\2\u0409\u040a\7\23\2\2\u040a\u040b\7\'\2\2"+
		"\u040b\u040c\7\22\2\2\u040c\u042e\5\66\34\2\u040d\u040e\7\23\2\2\u040e"+
		"\u040f\7\'\2\2\u040f\u0410\7\24\2\2\u0410\u042e\5\66\34\2\u0411\u0412"+
		"\7\23\2\2\u0412\u0413\7\'\2\2\u0413\u0414\7\22\2\2\u0414\u0415\5\66\34"+
		"\2\u0415\u0416\7\24\2\2\u0416\u0417\5\u00b8]\2\u0417\u042e\3\2\2\2\u0418"+
		"\u0419\7\17\2\2\u0419\u041a\7\23\2\2\u041a\u042e\7\'\2\2\u041b\u041c\7"+
		"\17\2\2\u041c\u041d\7\23\2\2\u041d\u041e\7\'\2\2\u041e\u041f\7\22\2\2"+
		"\u041f\u042e\5\66\34\2\u0420\u0421\7\17\2\2\u0421\u0422\7\23\2\2\u0422"+
		"\u0423\7\'\2\2\u0423\u0424\7\24\2\2\u0424\u042e\5\66\34\2\u0425\u0426"+
		"\7\17\2\2\u0426\u0427\7\23\2\2\u0427\u0428\7\'\2\2\u0428\u0429\7\22\2"+
		"\2\u0429\u042a\5\66\34\2\u042a\u042b\7\24\2\2\u042b\u042c\5\u00b8]\2\u042c"+
		"\u042e\3\2\2\2\u042d\u0407\3\2\2\2\u042d\u0409\3\2\2\2\u042d\u040d\3\2"+
		"\2\2\u042d\u0411\3\2\2\2\u042d\u0418\3\2\2\2\u042d\u041b\3\2\2\2\u042d"+
		"\u0420\3\2\2\2\u042d\u0425\3\2\2\2\u042e\u00b7\3\2\2\2\u042f\u0430\7\'"+
		"\2\2\u0430\u00b9\3\2\2\2\u0431\u0436\5\u00bc_\2\u0432\u0433\5\u00bc_\2"+
		"\u0433\u0434\5\u00ba^\2\u0434\u0436\3\2\2\2\u0435\u0431\3\2\2\2\u0435"+
		"\u0432\3\2\2\2\u0436\u00bb\3\2\2\2\u0437\u045a\7\'\2\2\u0438\u0439\7\'"+
		"\2\2\u0439\u045a\7\31\2\2\u043a\u043b\7\'\2\2\u043b\u045a\5\u00be`\2\u043c"+
		"\u043d\7\'\2\2\u043d\u043e\5\u00be`\2\u043e\u043f\7\31\2\2\u043f\u045a"+
		"\3\2\2\2\u0440\u0441\5(\25\2\u0441\u0442\7\'\2\2\u0442\u045a\3\2\2\2\u0443"+
		"\u0444\7\'\2\2\u0444\u045a\7\31\2\2\u0445\u0446\5(\25\2\u0446\u0447\7"+
		"\'\2\2\u0447\u0448\5\u00be`\2\u0448\u045a\3\2\2\2\u0449\u044a\7\'\2\2"+
		"\u044a\u044b\5\u00be`\2\u044b\u044c\7\31\2\2\u044c\u045a\3\2\2\2\u044d"+
		"\u044e\7\'\2\2\u044e\u045a\5*\26\2\u044f\u0450\7\'\2\2\u0450\u045a\7\31"+
		"\2\2\u0451\u0452\7\'\2\2\u0452\u0453\5\u00be`\2\u0453\u0454\5*\26\2\u0454"+
		"\u045a\3\2\2\2\u0455\u0456\7\'\2\2\u0456\u0457\5\u00be`\2\u0457\u0458"+
		"\7\31\2\2\u0458\u045a\3\2\2\2\u0459\u0437\3\2\2\2\u0459\u0438\3\2\2\2"+
		"\u0459\u043a\3\2\2\2\u0459\u043c\3\2\2\2\u0459\u0440\3\2\2\2\u0459\u0443"+
		"\3\2\2\2\u0459\u0445\3\2\2\2\u0459\u0449\3\2\2\2\u0459\u044d\3\2\2\2\u0459"+
		"\u044f\3\2\2\2\u0459\u0451\3\2\2\2\u0459\u0455\3\2\2\2\u045a\u00bd\3\2"+
		"\2\2\u045b\u045c\7\35\2\2\u045c\u045d\5\u00c0a\2\u045d\u045e\7\36\2\2"+
		"\u045e\u0465\3\2\2\2\u045f\u0460\7\35\2\2\u0460\u0461\5\u00c0a\2\u0461"+
		"\u0462\7\36\2\2\u0462\u0463\5\u00be`\2\u0463\u0465\3\2\2\2\u0464\u045b"+
		"\3\2\2\2\u0464\u045f\3\2\2\2\u0465\u00bf\3\2\2\2\u0466\u0467\5$\23\2\u0467"+
		"\u00c1\3\2\2\2\u0468\u0480\7\'\2\2\u0469\u046a\7\'\2\2\u046a\u0480\7)"+
		"\2\2\u046b\u0480\7+\2\2\u046c\u046d\7+\2\2\u046d\u0480\7)\2\2\u046e\u0480"+
		"\7,\2\2\u046f\u0470\7,\2\2\u0470\u0480\7)\2\2\u0471\u0480\7*\2\2\u0472"+
		"\u0480\5\32\16\2\u0473\u0480\5\36\20\2\u0474\u0480\5$\23\2\u0475\u0480"+
		"\5.\30\2\u0476\u0477\5\u00c4c\2\u0477\u0478\7\31\2\2\u0478\u0479\5\u00c6"+
		"d\2\u0479\u0480\3\2\2\2\u047a\u047b\5\u00c4c\2\u047b\u047c\7\33\2\2\u047c"+
		"\u047d\5\u00c6d\2\u047d\u0480\3\2\2\2\u047e\u0480\5\u00ba^\2\u047f\u0468"+
		"\3\2\2\2\u047f\u0469\3\2\2\2\u047f\u046b\3\2\2\2\u047f\u046c\3\2\2\2\u047f"+
		"\u046e\3\2\2\2\u047f\u046f\3\2\2\2\u047f\u0471\3\2\2\2\u047f\u0472\3\2"+
		"\2\2\u047f\u0473\3\2\2\2\u047f\u0474\3\2\2\2\u047f\u0475\3\2\2\2\u047f"+
		"\u0476\3\2\2\2\u047f\u047a\3\2\2\2\u047f\u047e\3\2\2\2\u0480\u00c3\3\2"+
		"\2\2\u0481\u0482\7\'\2\2\u0482\u00c5\3\2\2\2\u0483\u0484\7\'\2\2\u0484"+
		"\u00c7\3\2\2\2=\u00d0\u00db\u00e8\u011d\u0124\u0135\u0143\u014b\u0152"+
		"\u015a\u0165\u016f\u01c9\u01df\u01ea\u01f9\u0205\u020b\u0218\u0222\u0237"+
		"\u023d\u0247\u024c\u0251\u025b\u02ba\u02c2\u02d1\u02d7\u02e0\u02e5\u02f5"+
		"\u0301\u0305\u0309\u0310\u0316\u0322\u032a\u034a\u0359\u0369\u036b\u0389"+
		"\u0393\u039d\u03a1\u03a9\u03b2\u03ba\u03d7\u03f6\u0403\u042d\u0435\u0459"+
		"\u0464\u047f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}