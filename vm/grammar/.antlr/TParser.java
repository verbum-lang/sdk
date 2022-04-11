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
		RULE_identifierB = 23, RULE_pointSeparator = 24, RULE_functionCallParam = 25, 
		RULE_functionCallParamElements = 26, RULE_conditionalExpression = 27, 
		RULE_conditionalExpressionStructBlock = 28, RULE_ifElementUnique = 29, 
		RULE_elifElements = 30, RULE_elifElementUnique = 31, RULE_elseElementUnique = 32, 
		RULE_conditionalExpressionItems = 33, RULE_conditionalBlockElements = 34, 
		RULE_conditionalBlockElsItems = 35, RULE_conditionalExpressionElements = 36, 
		RULE_conditionExpValue = 37, RULE_conditionExpBlock = 38, RULE_conditionExpBlockItemValue = 39, 
		RULE_conditionExpBlockItem = 40, RULE_conditionalExpValue = 41, RULE_functionCallAndAttr = 42, 
		RULE_identifierAttrFn = 43, RULE_functionCallAttrFn = 44, RULE_functionCallAttrFnItem = 45, 
		RULE_loop = 46, RULE_loopExpressionItems = 47, RULE_loopExpression = 48, 
		RULE_loopInfinite = 49, RULE_loopComplete = 50, RULE_loopConditional = 51, 
		RULE_endOne = 52, RULE_endTwo = 53, RULE_loopOneMembers = 54, RULE_loopTwoMembers = 55, 
		RULE_loopThreeMembers = 56, RULE_loopThreeMembersValues = 57, RULE_loopBlockElements = 58, 
		RULE_loopBlockElementsLimited = 59, RULE_ret = 60, RULE_retValues = 61, 
		RULE_functions = 62, RULE_functionsModes = 63, RULE_functionGeneralModes = 64, 
		RULE_identifierRet = 65, RULE_functionMethodsModes = 66, RULE_methodPerm = 67, 
		RULE_constructClassMethod = 68, RULE_interfaceMethod = 69, RULE_functionCodeBlock = 70, 
		RULE_functionCodeBlockElements = 71, RULE_functionParams = 72, RULE_functionParamsControl = 73, 
		RULE_functionParamElements = 74, RULE_oopGeneral = 75, RULE_interfaceClass = 76, 
		RULE_interfaceClassDefinition = 77, RULE_interfaceCodeBlock = 78, RULE_abstractClass = 79, 
		RULE_abstractClassDefinition = 80, RULE_abstractCodeBlock = 81, RULE_classDefination = 82, 
		RULE_classCodeBlock = 83, RULE_classModes = 84, RULE_identifierC = 85, 
		RULE_arrayAccessElements = 86, RULE_arrayAccessElementsItems = 87, RULE_accessBlockAr = 88, 
		RULE_arrayIndexAccess = 89, RULE_generalValue = 90, RULE_objIdentifierA = 91, 
		RULE_objIdentifierB = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableModes", "variableMembers", "variableDefinition", 
			"variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
			"firstIncDec", "lastIncDec", "callingFunction", "functionCall", "identifierB", 
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
			"identifierRet", "functionMethodsModes", "methodPerm", "constructClassMethod", 
			"interfaceMethod", "functionCodeBlock", "functionCodeBlockElements", 
			"functionParams", "functionParamsControl", "functionParamElements", "oopGeneral", 
			"interfaceClass", "interfaceClassDefinition", "interfaceCodeBlock", "abstractClass", 
			"abstractClassDefinition", "abstractCodeBlock", "classDefination", "classCodeBlock", 
			"classModes", "identifierC", "arrayAccessElements", "arrayAccessElementsItems", 
			"accessBlockAr", "arrayIndexAccess", "generalValue", "objIdentifierA", 
			"objIdentifierB"
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
			setState(186);
			fileContent();
			setState(187);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				sentence();
				setState(191);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
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
			setState(207);
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
			setState(209);
			match(Use);
			setState(210);
			useValue();
			setState(211);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				useString();
				setState(215);
				match(Separator);
				setState(216);
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
			setState(220);
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
			setState(222);
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
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(Var);
				setState(225);
				variableMembers();
				setState(226);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				methodPerm();
				setState(229);
				match(Var);
				setState(230);
				variableMembers();
				setState(231);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(Static);
				setState(234);
				match(Var);
				setState(235);
				variableMembers();
				setState(236);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				methodPerm();
				setState(239);
				match(Static);
				setState(240);
				match(Var);
				setState(241);
				variableMembers();
				setState(242);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(Final);
				setState(245);
				methodPerm();
				setState(246);
				match(Static);
				setState(247);
				match(Var);
				setState(248);
				variableMembers();
				setState(249);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(Final);
				setState(252);
				methodPerm();
				setState(253);
				match(Var);
				setState(254);
				variableMembers();
				setState(255);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(Final);
				setState(258);
				match(Var);
				setState(259);
				variableMembers();
				setState(260);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(Final);
				setState(263);
				match(Static);
				setState(264);
				match(Var);
				setState(265);
				variableMembers();
				setState(266);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				variableMembers();
				setState(269);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				variableDefinition();
				setState(275);
				match(Separator);
				setState(276);
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
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(Identifier);
				setState(281);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				objIdentifierA();
				setState(283);
				match(Point);
				setState(284);
				objIdentifierB();
				setState(285);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				objIdentifierA();
				setState(288);
				match(TwoTwoPoint);
				setState(289);
				objIdentifierB();
				setState(290);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				arrayAccessElements();
				setState(293);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(TypeSpec);
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				match(New);
				setState(304);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(TypeSpec);
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				match(New);
				setState(308);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(OpenArIndex);
				setState(312);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(OpenArIndex);
				setState(314);
				indexArrayElements();
				setState(315);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				generalValue();
				setState(321);
				match(Separator);
				setState(322);
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(OpenBlock);
				setState(327);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(OpenBlock);
				setState(329);
				associativeArrayElements();
				setState(330);
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
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(Identifier);
				setState(335);
				match(TwoPoint);
				setState(336);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(Identifier);
				setState(338);
				match(TwoPoint);
				setState(339);
				generalValue();
				setState(340);
				match(Separator);
				setState(341);
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
			setState(345);
			match(OpenOp);
			setState(346);
			operationElements();
			setState(347);
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
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				operationValue();
				setState(351);
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
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				functionCall();
				setState(357);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				functionCall();
				setState(360);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				functionCall();
				setState(363);
				match(TypeSpec);
				setState(364);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				match(Identifier);
				setState(368);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				match(Identifier);
				setState(370);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				match(Identifier);
				setState(372);
				match(TypeSpec);
				setState(373);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				firstIncDec();
				setState(375);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(377);
				firstIncDec();
				setState(378);
				match(Identifier);
				setState(379);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(381);
				firstIncDec();
				setState(382);
				match(Identifier);
				setState(383);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(385);
				firstIncDec();
				setState(386);
				match(Identifier);
				setState(387);
				match(TypeSpec);
				setState(388);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(390);
				match(Identifier);
				setState(391);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(392);
				match(Identifier);
				setState(393);
				lastIncDec();
				setState(394);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(396);
				match(Identifier);
				setState(397);
				lastIncDec();
				setState(398);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(400);
				match(Identifier);
				setState(401);
				lastIncDec();
				setState(402);
				match(TypeSpec);
				setState(403);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(405);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(406);
				match(Integer);
				setState(407);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(408);
				match(Integer);
				setState(409);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(410);
				match(Integer);
				setState(411);
				match(TypeSpec);
				setState(412);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(413);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(414);
				match(Float);
				setState(415);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(416);
				match(Float);
				setState(417);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(418);
				match(Float);
				setState(419);
				match(TypeSpec);
				setState(420);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(421);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(422);
				operationBlock();
				setState(423);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(425);
				operationBlock();
				setState(426);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(428);
				operationBlock();
				setState(429);
				match(TypeSpec);
				setState(430);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(432);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(433);
				arrayAccessElements();
				setState(434);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(436);
				arrayAccessElements();
				setState(437);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(439);
				arrayAccessElements();
				setState(440);
				match(TypeSpec);
				setState(441);
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
			setState(445);
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
			setState(447);
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
			setState(449);
			functionCall();
			setState(450);
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
		public PointSeparatorContext pointSeparator() {
			return getRuleContext(PointSeparatorContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(Identifier);
				setState(453);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(Identifier);
				setState(455);
				match(Point);
				setState(456);
				identifierB();
				setState(457);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(Identifier);
				setState(460);
				match(TwoTwoPoint);
				setState(461);
				identifierB();
				setState(462);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(Identifier);
				setState(465);
				match(Point);
				setState(466);
				identifierB();
				setState(467);
				functionCallParam();
				setState(468);
				pointSeparator();
				setState(469);
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

	public static class IdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierB; }
	}

	public final IdentifierBContext identifierB() throws RecognitionException {
		IdentifierBContext _localctx = new IdentifierBContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		enterRule(_localctx, 48, RULE_pointSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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
		enterRule(_localctx, 50, RULE_functionCallParam);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(OpenOp);
				setState(478);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(OpenOp);
				setState(480);
				functionCallParamElements();
				setState(481);
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
		enterRule(_localctx, 52, RULE_functionCallParamElements);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				generalValue();
				setState(487);
				match(Separator);
				setState(488);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				operationElements();
				setState(492);
				match(Separator);
				setState(493);
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
		enterRule(_localctx, 54, RULE_conditionalExpression);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				conditionalExpressionStructBlock();
				setState(499);
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
		enterRule(_localctx, 56, RULE_conditionalExpressionStructBlock);
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				ifElementUnique();
				setState(505);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				ifElementUnique();
				setState(508);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				ifElementUnique();
				setState(511);
				elifElements();
				setState(512);
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
		enterRule(_localctx, 58, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(If);
			setState(517);
			conditionalExpressionItems();
			setState(518);
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
		enterRule(_localctx, 60, RULE_elifElements);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				elifElementUnique();
				setState(522);
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
		enterRule(_localctx, 62, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Elif);
			setState(527);
			conditionalExpressionItems();
			setState(528);
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
		enterRule(_localctx, 64, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(Else);
			setState(531);
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
		enterRule(_localctx, 66, RULE_conditionalExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		enterRule(_localctx, 68, RULE_conditionalBlockElements);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(OpenBlock);
				setState(536);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(OpenBlock);
				setState(538);
				conditionalBlockElsItems();
				setState(539);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
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
		enterRule(_localctx, 70, RULE_conditionalBlockElsItems);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				sentence();
				setState(549);
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
		enterRule(_localctx, 72, RULE_conditionalExpressionElements);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				conditionExpValue();
				setState(555);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				conditionExpBlock();
				setState(559);
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
		enterRule(_localctx, 74, RULE_conditionExpValue);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(Not);
				setState(564);
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
				setState(565);
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
		enterRule(_localctx, 76, RULE_conditionExpBlock);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(Not);
				setState(570);
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
		enterRule(_localctx, 78, RULE_conditionExpBlockItemValue);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				conditionExpBlockItem();
				setState(575);
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
				setState(577);
				conditionExpBlockItem();
				setState(578);
				match(TypeSpec);
				setState(579);
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
		enterRule(_localctx, 80, RULE_conditionExpBlockItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(OpenOp);
			setState(584);
			conditionalExpressionElements();
			setState(585);
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
		enterRule(_localctx, 82, RULE_conditionalExpValue);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				firstIncDec();
				setState(588);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				firstIncDec();
				setState(591);
				match(Identifier);
				setState(592);
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
				setState(594);
				firstIncDec();
				setState(595);
				match(Identifier);
				setState(596);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(598);
				firstIncDec();
				setState(599);
				match(Identifier);
				setState(600);
				match(TypeSpec);
				setState(601);
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
				setState(603);
				match(Identifier);
				setState(604);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(605);
				match(Identifier);
				setState(606);
				lastIncDec();
				setState(607);
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
				setState(609);
				match(Identifier);
				setState(610);
				lastIncDec();
				setState(611);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				match(Identifier);
				setState(614);
				lastIncDec();
				setState(615);
				match(TypeSpec);
				setState(616);
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
				setState(618);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(619);
				match(Integer);
				setState(620);
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
				setState(621);
				match(Integer);
				setState(622);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(623);
				match(Integer);
				setState(624);
				match(TypeSpec);
				setState(625);
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
				setState(626);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(627);
				match(Float);
				setState(628);
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
				setState(629);
				match(Float);
				setState(630);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(631);
				match(Float);
				setState(632);
				match(TypeSpec);
				setState(633);
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
				setState(634);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(635);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(636);
				functionCall();
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(639);
				functionCall();
				setState(640);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(642);
				functionCall();
				setState(643);
				match(TypeSpec);
				setState(644);
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
				setState(646);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(647);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(650);
				operationBlock();
				setState(651);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(653);
				operationBlock();
				setState(654);
				match(TypeSpec);
				setState(655);
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
				setState(657);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(658);
				match(Identifier);
				setState(659);
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
				setState(660);
				match(Identifier);
				setState(661);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(662);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(665);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(666);
				arrayAccessElements();
				setState(667);
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
				setState(669);
				arrayAccessElements();
				setState(670);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(672);
				arrayAccessElements();
				setState(673);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_functionCallAndAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			identifierAttrFn();
			setState(679);
			match(Attr);
			setState(680);
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
		enterRule(_localctx, 86, RULE_identifierAttrFn);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
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
		enterRule(_localctx, 88, RULE_functionCallAttrFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 90, RULE_functionCallAttrFnItem);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				functionCall();
				setState(693);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				functionCall();
				setState(696);
				match(TypeSpec);
				setState(697);
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
		enterRule(_localctx, 92, RULE_loop);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				loopExpressionItems();
				setState(703);
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
		enterRule(_localctx, 94, RULE_loopExpressionItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(For);
			setState(708);
			loopExpression();
			setState(709);
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
		enterRule(_localctx, 96, RULE_loopExpression);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
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
		enterRule(_localctx, 98, RULE_loopInfinite);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(OpenOp);
				setState(717);
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
		enterRule(_localctx, 100, RULE_loopComplete);
		try {
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(OpenOp);
				setState(722);
				loopOneMembers();
				setState(723);
				endOne();
				setState(724);
				loopTwoMembers();
				setState(725);
				endTwo();
				setState(726);
				loopThreeMembers();
				setState(727);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				loopOneMembers();
				setState(730);
				endOne();
				setState(731);
				loopTwoMembers();
				setState(732);
				endTwo();
				setState(733);
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
		enterRule(_localctx, 102, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
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
		enterRule(_localctx, 104, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		enterRule(_localctx, 106, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		enterRule(_localctx, 108, RULE_loopOneMembers);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(Var);
				setState(745);
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
		enterRule(_localctx, 110, RULE_loopTwoMembers);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
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
		enterRule(_localctx, 112, RULE_loopThreeMembers);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
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
		enterRule(_localctx, 114, RULE_loopThreeMembersValues);
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				operationElements();
				setState(759);
				match(Separator);
				setState(760);
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
		enterRule(_localctx, 116, RULE_loopBlockElements);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				sentence();
				setState(766);
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
		enterRule(_localctx, 118, RULE_loopBlockElementsLimited);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(OpenBlock);
				setState(771);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(OpenBlock);
				setState(773);
				loopBlockElements();
				setState(774);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(777);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(778);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(779);
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
		enterRule(_localctx, 120, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(Ret);
			setState(783);
			retValues();
			setState(784);
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
		enterRule(_localctx, 122, RULE_retValues);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
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
		enterRule(_localctx, 124, RULE_functions);
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				functionsModes();
				setState(791);
				match(OpenBlock);
				setState(792);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				functionsModes();
				setState(795);
				match(OpenBlock);
				setState(796);
				functionCodeBlock();
				setState(797);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				functionMethodsModes();
				setState(800);
				match(OpenBlock);
				setState(801);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				functionMethodsModes();
				setState(804);
				match(OpenBlock);
				setState(805);
				functionCodeBlock();
				setState(806);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				constructClassMethod();
				setState(809);
				match(OpenBlock);
				setState(810);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				constructClassMethod();
				setState(813);
				match(OpenBlock);
				setState(814);
				functionCodeBlock();
				setState(815);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(817);
				interfaceMethod();
				setState(818);
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
		enterRule(_localctx, 126, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
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
		enterRule(_localctx, 128, RULE_functionGeneralModes);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(Function);
				setState(825);
				match(Identifier);
				setState(826);
				match(OpenOp);
				setState(827);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(Function);
				setState(829);
				match(Identifier);
				setState(830);
				match(OpenOp);
				setState(831);
				match(CloseOp);
				setState(832);
				match(ArrowRight);
				setState(835);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(833);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(834);
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
				setState(837);
				match(Function);
				setState(838);
				match(Identifier);
				setState(839);
				match(OpenOp);
				setState(840);
				functionParams();
				setState(841);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(Function);
				setState(844);
				match(Identifier);
				setState(845);
				match(OpenOp);
				setState(846);
				functionParams();
				setState(847);
				match(CloseOp);
				setState(848);
				match(ArrowRight);
				setState(851);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(849);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(850);
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
		enterRule(_localctx, 130, RULE_identifierRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
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
		enterRule(_localctx, 132, RULE_functionMethodsModes);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				methodPerm();
				setState(858);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(Static);
				setState(861);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				methodPerm();
				setState(863);
				match(Static);
				setState(864);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(866);
				match(Final);
				setState(867);
				methodPerm();
				setState(868);
				match(Static);
				setState(869);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(871);
				match(Final);
				setState(872);
				methodPerm();
				setState(873);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
				match(Final);
				setState(876);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(877);
				match(Final);
				setState(878);
				match(Static);
				setState(879);
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
		enterRule(_localctx, 134, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
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
		enterRule(_localctx, 136, RULE_constructClassMethod);
		try {
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(Identifier);
				setState(885);
				match(OpenOp);
				setState(886);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(Identifier);
				setState(888);
				match(OpenOp);
				setState(889);
				functionParams();
				setState(890);
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
		enterRule(_localctx, 138, RULE_interfaceMethod);
		try {
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
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
				setState(895);
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
		enterRule(_localctx, 140, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
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
		enterRule(_localctx, 142, RULE_functionCodeBlockElements);
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				sentence();
				setState(902);
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
		enterRule(_localctx, 144, RULE_functionParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
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
		enterRule(_localctx, 146, RULE_functionParamsControl);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				functionParamElements();
				setState(910);
				match(Separator);
				setState(911);
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
		enterRule(_localctx, 148, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(Identifier);
			setState(916);
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
		enterRule(_localctx, 150, RULE_oopGeneral);
		try {
			setState(921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
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
		enterRule(_localctx, 152, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
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
		enterRule(_localctx, 154, RULE_interfaceClassDefinition);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(Interface);
				setState(926);
				match(Identifier);
				setState(927);
				match(OpenBlock);
				setState(928);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(Interface);
				setState(930);
				match(Identifier);
				setState(931);
				match(OpenBlock);
				setState(932);
				interfaceCodeBlock();
				setState(933);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				match(Interface);
				setState(936);
				match(Identifier);
				setState(937);
				match(Extends);
				setState(938);
				identifierB();
				setState(939);
				match(OpenBlock);
				setState(940);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(942);
				match(Interface);
				setState(943);
				match(Identifier);
				setState(944);
				match(Extends);
				setState(945);
				identifierB();
				setState(946);
				match(OpenBlock);
				setState(947);
				interfaceCodeBlock();
				setState(948);
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
		enterRule(_localctx, 156, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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
		enterRule(_localctx, 158, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
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
		enterRule(_localctx, 160, RULE_abstractClassDefinition);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(Abstract);
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
				match(Abstract);
				setState(961);
				match(Identifier);
				setState(962);
				match(OpenBlock);
				setState(963);
				abstractCodeBlock();
				setState(964);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Abstract);
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
				match(Abstract);
				setState(974);
				match(Identifier);
				setState(975);
				match(Extends);
				setState(976);
				identifierB();
				setState(977);
				match(OpenBlock);
				setState(978);
				abstractCodeBlock();
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
		enterRule(_localctx, 162, RULE_abstractCodeBlock);
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
		enterRule(_localctx, 164, RULE_classDefination);
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				classModes();
				setState(986);
				match(OpenBlock);
				setState(987);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				classModes();
				setState(990);
				match(OpenBlock);
				setState(991);
				classCodeBlock();
				setState(992);
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
		enterRule(_localctx, 166, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
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
		enterRule(_localctx, 168, RULE_classModes);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				match(Class);
				setState(999);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(Class);
				setState(1001);
				match(Identifier);
				setState(1002);
				match(Extends);
				setState(1003);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				match(Class);
				setState(1005);
				match(Identifier);
				setState(1006);
				match(Implements);
				setState(1007);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(Class);
				setState(1009);
				match(Identifier);
				setState(1010);
				match(Extends);
				setState(1011);
				identifierB();
				setState(1012);
				match(Implements);
				setState(1013);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1015);
				match(Final);
				setState(1016);
				match(Class);
				setState(1017);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1018);
				match(Final);
				setState(1019);
				match(Class);
				setState(1020);
				match(Identifier);
				setState(1021);
				match(Extends);
				setState(1022);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1023);
				match(Final);
				setState(1024);
				match(Class);
				setState(1025);
				match(Identifier);
				setState(1026);
				match(Implements);
				setState(1027);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1028);
				match(Final);
				setState(1029);
				match(Class);
				setState(1030);
				match(Identifier);
				setState(1031);
				match(Extends);
				setState(1032);
				identifierB();
				setState(1033);
				match(Implements);
				setState(1034);
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
		enterRule(_localctx, 170, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 172, RULE_arrayAccessElements);
		try {
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				arrayAccessElementsItems();
				setState(1042);
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
		enterRule(_localctx, 174, RULE_arrayAccessElementsItems);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				match(Identifier);
				setState(1048);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				match(Identifier);
				setState(1050);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				match(Identifier);
				setState(1052);
				accessBlockAr();
				setState(1053);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				firstIncDec();
				setState(1056);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1058);
				match(Identifier);
				setState(1059);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1060);
				firstIncDec();
				setState(1061);
				match(Identifier);
				setState(1062);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1064);
				match(Identifier);
				setState(1065);
				accessBlockAr();
				setState(1066);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1068);
				match(Identifier);
				setState(1069);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1070);
				match(Identifier);
				setState(1071);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1072);
				match(Identifier);
				setState(1073);
				accessBlockAr();
				setState(1074);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1076);
				match(Identifier);
				setState(1077);
				accessBlockAr();
				setState(1078);
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
		enterRule(_localctx, 176, RULE_accessBlockAr);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				match(OpenArIndex);
				setState(1083);
				arrayIndexAccess();
				setState(1084);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(OpenArIndex);
				setState(1087);
				arrayIndexAccess();
				setState(1088);
				match(CloseArIndex);
				setState(1089);
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
		enterRule(_localctx, 178, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
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
		enterRule(_localctx, 180, RULE_generalValue);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(Identifier);
				setState(1097);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1099);
				match(Integer);
				setState(1100);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1101);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1102);
				match(Float);
				setState(1103);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1104);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1105);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1106);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1107);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1108);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1109);
				objIdentifierA();
				setState(1110);
				match(Point);
				setState(1111);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1113);
				objIdentifierA();
				setState(1114);
				match(TwoTwoPoint);
				setState(1115);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1117);
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
		enterRule(_localctx, 182, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
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
		enterRule(_localctx, 184, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0467\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c5\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00d0\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00dd"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0112\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0119\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u012a\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0138\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0140\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0147\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u014f\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u015a\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u0164\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01be\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01da\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01e6\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01f2\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u01f8\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0205\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u020f\n \3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0224\n$\3%\3%"+
		"\3%\3%\5%\u022a\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0234\n&\3\'\3\'\3\'\5\'"+
		"\u0239\n\'\3(\3(\3(\5(\u023e\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0248\n)\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u02a7\n+\3,\3,\3,\3,\3-\3-\5-\u02af\n-\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u02be\n/\3\60\3\60\3\60\3\60\5\60\u02c4\n\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\5\62\u02cd\n\62\3\63\3\63\3\63\5\63\u02d2\n"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u02e2\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\58\u02ee"+
		"\n8\39\39\59\u02f2\n9\3:\3:\5:\u02f6\n:\3;\3;\3;\3;\3;\5;\u02fd\n;\3<"+
		"\3<\3<\3<\5<\u0303\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u030f\n=\3>\3>"+
		"\3>\3>\3?\3?\5?\u0317\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0337\n@\3A\3A\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0346\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\5B\u0356\nB\5B\u0358\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0373\nD\3E\3E\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\5F\u037f\nF\3G\3G\5G\u0383\nG\3H\3H\3I\3I\3I\3I\5I\u038b"+
		"\nI\3J\3J\3K\3K\3K\3K\3K\5K\u0394\nK\3L\3L\3L\3M\3M\3M\5M\u039c\nM\3N"+
		"\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u03b9\nO\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u03d8\nR\3S\3S\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\5T\u03e5\nT\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\5V\u040f\nV\3W\3W\3X\3X\3X\3X\5X\u0417\nX\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\5Y\u043b\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0446\nZ\3["+
		"\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0461\n\\\3]\3]\3^\3^\3^\2\2_\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\2\5\4\2\30\30$"+
		"$\3\2#$\3\2\13\r\2\u04d4\2\u00bc\3\2\2\2\4\u00c4\3\2\2\2\6\u00cf\3\2\2"+
		"\2\b\u00d1\3\2\2\2\n\u00d3\3\2\2\2\f\u00dc\3\2\2\2\16\u00de\3\2\2\2\20"+
		"\u00e0\3\2\2\2\22\u0111\3\2\2\2\24\u0118\3\2\2\2\26\u0129\3\2\2\2\30\u0137"+
		"\3\2\2\2\32\u013f\3\2\2\2\34\u0146\3\2\2\2\36\u014e\3\2\2\2 \u0159\3\2"+
		"\2\2\"\u015b\3\2\2\2$\u0163\3\2\2\2&\u01bd\3\2\2\2(\u01bf\3\2\2\2*\u01c1"+
		"\3\2\2\2,\u01c3\3\2\2\2.\u01d9\3\2\2\2\60\u01db\3\2\2\2\62\u01dd\3\2\2"+
		"\2\64\u01e5\3\2\2\2\66\u01f1\3\2\2\28\u01f7\3\2\2\2:\u0204\3\2\2\2<\u0206"+
		"\3\2\2\2>\u020e\3\2\2\2@\u0210\3\2\2\2B\u0214\3\2\2\2D\u0217\3\2\2\2F"+
		"\u0223\3\2\2\2H\u0229\3\2\2\2J\u0233\3\2\2\2L\u0238\3\2\2\2N\u023d\3\2"+
		"\2\2P\u0247\3\2\2\2R\u0249\3\2\2\2T\u02a6\3\2\2\2V\u02a8\3\2\2\2X\u02ae"+
		"\3\2\2\2Z\u02b0\3\2\2\2\\\u02bd\3\2\2\2^\u02c3\3\2\2\2`\u02c5\3\2\2\2"+
		"b\u02cc\3\2\2\2d\u02d1\3\2\2\2f\u02e1\3\2\2\2h\u02e3\3\2\2\2j\u02e5\3"+
		"\2\2\2l\u02e7\3\2\2\2n\u02ed\3\2\2\2p\u02f1\3\2\2\2r\u02f5\3\2\2\2t\u02fc"+
		"\3\2\2\2v\u0302\3\2\2\2x\u030e\3\2\2\2z\u0310\3\2\2\2|\u0316\3\2\2\2~"+
		"\u0336\3\2\2\2\u0080\u0338\3\2\2\2\u0082\u0357\3\2\2\2\u0084\u0359\3\2"+
		"\2\2\u0086\u0372\3\2\2\2\u0088\u0374\3\2\2\2\u008a\u037e\3\2\2\2\u008c"+
		"\u0382\3\2\2\2\u008e\u0384\3\2\2\2\u0090\u038a\3\2\2\2\u0092\u038c\3\2"+
		"\2\2\u0094\u0393\3\2\2\2\u0096\u0395\3\2\2\2\u0098\u039b\3\2\2\2\u009a"+
		"\u039d\3\2\2\2\u009c\u03b8\3\2\2\2\u009e\u03ba\3\2\2\2\u00a0\u03bc\3\2"+
		"\2\2\u00a2\u03d7\3\2\2\2\u00a4\u03d9\3\2\2\2\u00a6\u03e4\3\2\2\2\u00a8"+
		"\u03e6\3\2\2\2\u00aa\u040e\3\2\2\2\u00ac\u0410\3\2\2\2\u00ae\u0416\3\2"+
		"\2\2\u00b0\u043a\3\2\2\2\u00b2\u0445\3\2\2\2\u00b4\u0447\3\2\2\2\u00b6"+
		"\u0460\3\2\2\2\u00b8\u0462\3\2\2\2\u00ba\u0464\3\2\2\2\u00bc\u00bd\5\4"+
		"\3\2\u00bd\u00be\7\2\2\3\u00be\3\3\2\2\2\u00bf\u00c5\5\6\4\2\u00c0\u00c1"+
		"\5\6\4\2\u00c1\u00c2\5\4\3\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\5\3\2\2\2"+
		"\u00c6\u00d0\5\b\5\2\u00c7\u00d0\5\n\6\2\u00c8\u00d0\5\20\t\2\u00c9\u00d0"+
		"\5,\27\2\u00ca\u00d0\58\35\2\u00cb\u00d0\5^\60\2\u00cc\u00d0\5~@\2\u00cd"+
		"\u00d0\5z>\2\u00ce\u00d0\5\u0098M\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3"+
		"\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\7\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\t\3\2\2\2\u00d3\u00d4\7"+
		"\3\2\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\7\27\2\2\u00d6\13\3\2\2\2\u00d7"+
		"\u00dd\5\16\b\2\u00d8\u00d9\5\16\b\2\u00d9\u00da\7\34\2\2\u00da\u00db"+
		"\5\f\7\2\u00db\u00dd\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\r\3\2\2\2\u00de\u00df\7*\2\2\u00df\17\3\2\2\2\u00e0\u00e1\5\22\n\2\u00e1"+
		"\21\3\2\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\7\27"+
		"\2\2\u00e5\u0112\3\2\2\2\u00e6\u00e7\5\u0088E\2\u00e7\u00e8\7\4\2\2\u00e8"+
		"\u00e9\5\24\13\2\u00e9\u00ea\7\27\2\2\u00ea\u0112\3\2\2\2\u00eb\u00ec"+
		"\7\16\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\7\27\2"+
		"\2\u00ef\u0112\3\2\2\2\u00f0\u00f1\5\u0088E\2\u00f1\u00f2\7\16\2\2\u00f2"+
		"\u00f3\7\4\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\7\27\2\2\u00f5\u0112"+
		"\3\2\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\5\u0088E\2\u00f8\u00f9\7\16"+
		"\2\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\5\24\13\2\u00fb\u00fc\7\27\2\2\u00fc"+
		"\u0112\3\2\2\2\u00fd\u00fe\7\17\2\2\u00fe\u00ff\5\u0088E\2\u00ff\u0100"+
		"\7\4\2\2\u0100\u0101\5\24\13\2\u0101\u0102\7\27\2\2\u0102\u0112\3\2\2"+
		"\2\u0103\u0104\7\17\2\2\u0104\u0105\7\4\2\2\u0105\u0106\5\24\13\2\u0106"+
		"\u0107\7\27\2\2\u0107\u0112\3\2\2\2\u0108\u0109\7\17\2\2\u0109\u010a\7"+
		"\16\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5\24\13\2\u010c\u010d\7\27\2\2"+
		"\u010d\u0112\3\2\2\2\u010e\u010f\5\24\13\2\u010f\u0110\7\27\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u00e2\3\2\2\2\u0111\u00e6\3\2\2\2\u0111\u00eb\3\2"+
		"\2\2\u0111\u00f0\3\2\2\2\u0111\u00f6\3\2\2\2\u0111\u00fd\3\2\2\2\u0111"+
		"\u0103\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010e\3\2\2\2\u0112\23\3\2\2"+
		"\2\u0113\u0119\5\26\f\2\u0114\u0115\5\26\f\2\u0115\u0116\7\34\2\2\u0116"+
		"\u0117\5\24\13\2\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3"+
		"\2\2\2\u0119\25\3\2\2\2\u011a\u011b\7\'\2\2\u011b\u012a\5\30\r\2\u011c"+
		"\u011d\5\u00b8]\2\u011d\u011e\7\31\2\2\u011e\u011f\5\u00ba^\2\u011f\u0120"+
		"\5\30\r\2\u0120\u012a\3\2\2\2\u0121\u0122\5\u00b8]\2\u0122\u0123\7\33"+
		"\2\2\u0123\u0124\5\u00ba^\2\u0124\u0125\5\30\r\2\u0125\u012a\3\2\2\2\u0126"+
		"\u0127\5\u00aeX\2\u0127\u0128\5\30\r\2\u0128\u012a\3\2\2\2\u0129\u011a"+
		"\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0126\3\2\2\2\u012a"+
		"\27\3\2\2\2\u012b\u012c\t\2\2\2\u012c\u0138\5\u00b6\\\2\u012d\u012e\7"+
		")\2\2\u012e\u012f\t\2\2\2\u012f\u0138\5\u00b6\\\2\u0130\u0131\t\2\2\2"+
		"\u0131\u0132\7\25\2\2\u0132\u0138\5\u00b6\\\2\u0133\u0134\7)\2\2\u0134"+
		"\u0135\t\2\2\2\u0135\u0136\7\25\2\2\u0136\u0138\5\u00b6\\\2\u0137\u012b"+
		"\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0133\3\2\2\2\u0138"+
		"\31\3\2\2\2\u0139\u013a\7\35\2\2\u013a\u0140\7\36\2\2\u013b\u013c\7\35"+
		"\2\2\u013c\u013d\5\34\17\2\u013d\u013e\7\36\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u013b\3\2\2\2\u0140\33\3\2\2\2\u0141\u0147\5\u00b6"+
		"\\\2\u0142\u0143\5\u00b6\\\2\u0143\u0144\7\34\2\2\u0144\u0145\5\34\17"+
		"\2\u0145\u0147\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0147\35"+
		"\3\2\2\2\u0148\u0149\7\37\2\2\u0149\u014f\7 \2\2\u014a\u014b\7\37\2\2"+
		"\u014b\u014c\5 \21\2\u014c\u014d\7 \2\2\u014d\u014f\3\2\2\2\u014e\u0148"+
		"\3\2\2\2\u014e\u014a\3\2\2\2\u014f\37\3\2\2\2\u0150\u0151\7\'\2\2\u0151"+
		"\u0152\7\32\2\2\u0152\u015a\5\u00b6\\\2\u0153\u0154\7\'\2\2\u0154\u0155"+
		"\7\32\2\2\u0155\u0156\5\u00b6\\\2\u0156\u0157\7\34\2\2\u0157\u0158\5 "+
		"\21\2\u0158\u015a\3\2\2\2\u0159\u0150\3\2\2\2\u0159\u0153\3\2\2\2\u015a"+
		"!\3\2\2\2\u015b\u015c\7!\2\2\u015c\u015d\5$\23\2\u015d\u015e\7\"\2\2\u015e"+
		"#\3\2\2\2\u015f\u0164\5&\24\2\u0160\u0161\5&\24\2\u0161\u0162\5$\23\2"+
		"\u0162\u0164\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0164%\3"+
		"\2\2\2\u0165\u01be\5.\30\2\u0166\u0167\5.\30\2\u0167\u0168\7#\2\2\u0168"+
		"\u01be\3\2\2\2\u0169\u016a\5.\30\2\u016a\u016b\7)\2\2\u016b\u01be\3\2"+
		"\2\2\u016c\u016d\5.\30\2\u016d\u016e\7)\2\2\u016e\u016f\7#\2\2\u016f\u01be"+
		"\3\2\2\2\u0170\u01be\7\'\2\2\u0171\u0172\7\'\2\2\u0172\u01be\7#\2\2\u0173"+
		"\u0174\7\'\2\2\u0174\u01be\7)\2\2\u0175\u0176\7\'\2\2\u0176\u0177\7)\2"+
		"\2\u0177\u01be\7#\2\2\u0178\u0179\5(\25\2\u0179\u017a\7\'\2\2\u017a\u01be"+
		"\3\2\2\2\u017b\u017c\5(\25\2\u017c\u017d\7\'\2\2\u017d\u017e\7#\2\2\u017e"+
		"\u01be\3\2\2\2\u017f\u0180\5(\25\2\u0180\u0181\7\'\2\2\u0181\u0182\7)"+
		"\2\2\u0182\u01be\3\2\2\2\u0183\u0184\5(\25\2\u0184\u0185\7\'\2\2\u0185"+
		"\u0186\7)\2\2\u0186\u0187\7#\2\2\u0187\u01be\3\2\2\2\u0188\u0189\7\'\2"+
		"\2\u0189\u01be\5*\26\2\u018a\u018b\7\'\2\2\u018b\u018c\5*\26\2\u018c\u018d"+
		"\7#\2\2\u018d\u01be\3\2\2\2\u018e\u018f\7\'\2\2\u018f\u0190\5*\26\2\u0190"+
		"\u0191\7)\2\2\u0191\u01be\3\2\2\2\u0192\u0193\7\'\2\2\u0193\u0194\5*\26"+
		"\2\u0194\u0195\7)\2\2\u0195\u0196\7#\2\2\u0196\u01be\3\2\2\2\u0197\u01be"+
		"\7+\2\2\u0198\u0199\7+\2\2\u0199\u01be\7#\2\2\u019a\u019b\7+\2\2\u019b"+
		"\u01be\7)\2\2\u019c\u019d\7+\2\2\u019d\u019e\7)\2\2\u019e\u01be\7#\2\2"+
		"\u019f\u01be\7,\2\2\u01a0\u01a1\7,\2\2\u01a1\u01be\7#\2\2\u01a2\u01a3"+
		"\7,\2\2\u01a3\u01be\7)\2\2\u01a4\u01a5\7,\2\2\u01a5\u01a6\7)\2\2\u01a6"+
		"\u01be\7#\2\2\u01a7\u01be\5\"\22\2\u01a8\u01a9\5\"\22\2\u01a9\u01aa\7"+
		"#\2\2\u01aa\u01be\3\2\2\2\u01ab\u01ac\5\"\22\2\u01ac\u01ad\7)\2\2\u01ad"+
		"\u01be\3\2\2\2\u01ae\u01af\5\"\22\2\u01af\u01b0\7)\2\2\u01b0\u01b1\7#"+
		"\2\2\u01b1\u01be\3\2\2\2\u01b2\u01be\5\u00aeX\2\u01b3\u01b4\5\u00aeX\2"+
		"\u01b4\u01b5\7#\2\2\u01b5\u01be\3\2\2\2\u01b6\u01b7\5\u00aeX\2\u01b7\u01b8"+
		"\7)\2\2\u01b8\u01be\3\2\2\2\u01b9\u01ba\5\u00aeX\2\u01ba\u01bb\7)\2\2"+
		"\u01bb\u01bc\7#\2\2\u01bc\u01be\3\2\2\2\u01bd\u0165\3\2\2\2\u01bd\u0166"+
		"\3\2\2\2\u01bd\u0169\3\2\2\2\u01bd\u016c\3\2\2\2\u01bd\u0170\3\2\2\2\u01bd"+
		"\u0171\3\2\2\2\u01bd\u0173\3\2\2\2\u01bd\u0175\3\2\2\2\u01bd\u0178\3\2"+
		"\2\2\u01bd\u017b\3\2\2\2\u01bd\u017f\3\2\2\2\u01bd\u0183\3\2\2\2\u01bd"+
		"\u0188\3\2\2\2\u01bd\u018a\3\2\2\2\u01bd\u018e\3\2\2\2\u01bd\u0192\3\2"+
		"\2\2\u01bd\u0197\3\2\2\2\u01bd\u0198\3\2\2\2\u01bd\u019a\3\2\2\2\u01bd"+
		"\u019c\3\2\2\2\u01bd\u019f\3\2\2\2\u01bd\u01a0\3\2\2\2\u01bd\u01a2\3\2"+
		"\2\2\u01bd\u01a4\3\2\2\2\u01bd\u01a7\3\2\2\2\u01bd\u01a8\3\2\2\2\u01bd"+
		"\u01ab\3\2\2\2\u01bd\u01ae\3\2\2\2\u01bd\u01b2\3\2\2\2\u01bd\u01b3\3\2"+
		"\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\'\3\2\2\2\u01bf\u01c0"+
		"\7&\2\2\u01c0)\3\2\2\2\u01c1\u01c2\7&\2\2\u01c2+\3\2\2\2\u01c3\u01c4\5"+
		".\30\2\u01c4\u01c5\7\27\2\2\u01c5-\3\2\2\2\u01c6\u01c7\7\'\2\2\u01c7\u01da"+
		"\5\64\33\2\u01c8\u01c9\7\'\2\2\u01c9\u01ca\7\31\2\2\u01ca\u01cb\5\60\31"+
		"\2\u01cb\u01cc\5\64\33\2\u01cc\u01da\3\2\2\2\u01cd\u01ce\7\'\2\2\u01ce"+
		"\u01cf\7\33\2\2\u01cf\u01d0\5\60\31\2\u01d0\u01d1\5\64\33\2\u01d1\u01da"+
		"\3\2\2\2\u01d2\u01d3\7\'\2\2\u01d3\u01d4\7\31\2\2\u01d4\u01d5\5\60\31"+
		"\2\u01d5\u01d6\5\64\33\2\u01d6\u01d7\5\62\32\2\u01d7\u01d8\5.\30\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01c6\3\2\2\2\u01d9\u01c8\3\2\2\2\u01d9\u01cd\3\2"+
		"\2\2\u01d9\u01d2\3\2\2\2\u01da/\3\2\2\2\u01db\u01dc\7\'\2\2\u01dc\61\3"+
		"\2\2\2\u01dd\u01de\7\31\2\2\u01de\63\3\2\2\2\u01df\u01e0\7!\2\2\u01e0"+
		"\u01e6\7\"\2\2\u01e1\u01e2\7!\2\2\u01e2\u01e3\5\66\34\2\u01e3\u01e4\7"+
		"\"\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01df\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6"+
		"\65\3\2\2\2\u01e7\u01f2\5\u00b6\\\2\u01e8\u01e9\5\u00b6\\\2\u01e9\u01ea"+
		"\7\34\2\2\u01ea\u01eb\5\66\34\2\u01eb\u01f2\3\2\2\2\u01ec\u01f2\5$\23"+
		"\2\u01ed\u01ee\5$\23\2\u01ee\u01ef\7\34\2\2\u01ef\u01f0\5\66\34\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01e7\3\2\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01ec\3\2"+
		"\2\2\u01f1\u01ed\3\2\2\2\u01f2\67\3\2\2\2\u01f3\u01f8\5:\36\2\u01f4\u01f5"+
		"\5:\36\2\u01f5\u01f6\58\35\2\u01f6\u01f8\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f7"+
		"\u01f4\3\2\2\2\u01f89\3\2\2\2\u01f9\u0205\5<\37\2\u01fa\u01fb\5<\37\2"+
		"\u01fb\u01fc\5> \2\u01fc\u0205\3\2\2\2\u01fd\u01fe\5<\37\2\u01fe\u01ff"+
		"\5B\"\2\u01ff\u0205\3\2\2\2\u0200\u0201\5<\37\2\u0201\u0202\5> \2\u0202"+
		"\u0203\5B\"\2\u0203\u0205\3\2\2\2\u0204\u01f9\3\2\2\2\u0204\u01fa\3\2"+
		"\2\2\u0204\u01fd\3\2\2\2\u0204\u0200\3\2\2\2\u0205;\3\2\2\2\u0206\u0207"+
		"\7\5\2\2\u0207\u0208\5D#\2\u0208\u0209\5F$\2\u0209=\3\2\2\2\u020a\u020f"+
		"\5@!\2\u020b\u020c\5@!\2\u020c\u020d\5> \2\u020d\u020f\3\2\2\2\u020e\u020a"+
		"\3\2\2\2\u020e\u020b\3\2\2\2\u020f?\3\2\2\2\u0210\u0211\7\6\2\2\u0211"+
		"\u0212\5D#\2\u0212\u0213\5F$\2\u0213A\3\2\2\2\u0214\u0215\7\7\2\2\u0215"+
		"\u0216\5F$\2\u0216C\3\2\2\2\u0217\u0218\5J&\2\u0218E\3\2\2\2\u0219\u021a"+
		"\7\37\2\2\u021a\u0224\7 \2\2\u021b\u021c\7\37\2\2\u021c\u021d\5H%\2\u021d"+
		"\u021e\7 \2\2\u021e\u0224\3\2\2\2\u021f\u0224\58\35\2\u0220\u0224\5,\27"+
		"\2\u0221\u0224\5^\60\2\u0222\u0224\5z>\2\u0223\u0219\3\2\2\2\u0223\u021b"+
		"\3\2\2\2\u0223\u021f\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0222\3\2\2\2\u0224G\3\2\2\2\u0225\u022a\5\6\4\2\u0226\u0227\5\6\4\2"+
		"\u0227\u0228\5H%\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u0226"+
		"\3\2\2\2\u022aI\3\2\2\2\u022b\u0234\5L\'\2\u022c\u022d\5L\'\2\u022d\u022e"+
		"\5J&\2\u022e\u0234\3\2\2\2\u022f\u0234\5N(\2\u0230\u0231\5N(\2\u0231\u0232"+
		"\5J&\2\u0232\u0234\3\2\2\2\u0233\u022b\3\2\2\2\u0233\u022c\3\2\2\2\u0233"+
		"\u022f\3\2\2\2\u0233\u0230\3\2\2\2\u0234K\3\2\2\2\u0235\u0236\7%\2\2\u0236"+
		"\u0239\5T+\2\u0237\u0239\5T+\2\u0238\u0235\3\2\2\2\u0238\u0237\3\2\2\2"+
		"\u0239M\3\2\2\2\u023a\u023e\5P)\2\u023b\u023c\7%\2\2\u023c\u023e\5P)\2"+
		"\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023eO\3\2\2\2\u023f\u0248\5"+
		"R*\2\u0240\u0241\5R*\2\u0241\u0242\t\3\2\2\u0242\u0248\3\2\2\2\u0243\u0244"+
		"\5R*\2\u0244\u0245\7)\2\2\u0245\u0246\t\3\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u023f\3\2\2\2\u0247\u0240\3\2\2\2\u0247\u0243\3\2\2\2\u0248Q\3\2\2\2"+
		"\u0249\u024a\7!\2\2\u024a\u024b\5J&\2\u024b\u024c\7\"\2\2\u024cS\3\2\2"+
		"\2\u024d\u024e\5(\25\2\u024e\u024f\7\'\2\2\u024f\u02a7\3\2\2\2\u0250\u0251"+
		"\5(\25\2\u0251\u0252\7\'\2\2\u0252\u0253\t\3\2\2\u0253\u02a7\3\2\2\2\u0254"+
		"\u0255\5(\25\2\u0255\u0256\7\'\2\2\u0256\u0257\7)\2\2\u0257\u02a7\3\2"+
		"\2\2\u0258\u0259\5(\25\2\u0259\u025a\7\'\2\2\u025a\u025b\7)\2\2\u025b"+
		"\u025c\t\3\2\2\u025c\u02a7\3\2\2\2\u025d\u025e\7\'\2\2\u025e\u02a7\5*"+
		"\26\2\u025f\u0260\7\'\2\2\u0260\u0261\5*\26\2\u0261\u0262\t\3\2\2\u0262"+
		"\u02a7\3\2\2\2\u0263\u0264\7\'\2\2\u0264\u0265\5*\26\2\u0265\u0266\7)"+
		"\2\2\u0266\u02a7\3\2\2\2\u0267\u0268\7\'\2\2\u0268\u0269\5*\26\2\u0269"+
		"\u026a\7)\2\2\u026a\u026b\t\3\2\2\u026b\u02a7\3\2\2\2\u026c\u02a7\7+\2"+
		"\2\u026d\u026e\7+\2\2\u026e\u02a7\t\3\2\2\u026f\u0270\7+\2\2\u0270\u02a7"+
		"\7)\2\2\u0271\u0272\7+\2\2\u0272\u0273\7)\2\2\u0273\u02a7\t\3\2\2\u0274"+
		"\u02a7\7,\2\2\u0275\u0276\7,\2\2\u0276\u02a7\t\3\2\2\u0277\u0278\7,\2"+
		"\2\u0278\u02a7\7)\2\2\u0279\u027a\7,\2\2\u027a\u027b\7)\2\2\u027b\u02a7"+
		"\t\3\2\2\u027c\u02a7\5V,\2\u027d\u02a7\5.\30\2\u027e\u027f\5.\30\2\u027f"+
		"\u0280\t\3\2\2\u0280\u02a7\3\2\2\2\u0281\u0282\5.\30\2\u0282\u0283\7)"+
		"\2\2\u0283\u02a7\3\2\2\2\u0284\u0285\5.\30\2\u0285\u0286\7)\2\2\u0286"+
		"\u0287\t\3\2\2\u0287\u02a7\3\2\2\2\u0288\u02a7\5\"\22\2\u0289\u028a\5"+
		"\"\22\2\u028a\u028b\t\3\2\2\u028b\u02a7\3\2\2\2\u028c\u028d\5\"\22\2\u028d"+
		"\u028e\7)\2\2\u028e\u02a7\3\2\2\2\u028f\u0290\5\"\22\2\u0290\u0291\7)"+
		"\2\2\u0291\u0292\t\3\2\2\u0292\u02a7\3\2\2\2\u0293\u02a7\7\'\2\2\u0294"+
		"\u0295\7\'\2\2\u0295\u02a7\t\3\2\2\u0296\u0297\7\'\2\2\u0297\u02a7\7)"+
		"\2\2\u0298\u0299\7\'\2\2\u0299\u029a\7)\2\2\u029a\u02a7\t\3\2\2\u029b"+
		"\u02a7\5\u00aeX\2\u029c\u029d\5\u00aeX\2\u029d\u029e\t\3\2\2\u029e\u02a7"+
		"\3\2\2\2\u029f\u02a0\5\u00aeX\2\u02a0\u02a1\7)\2\2\u02a1\u02a7\3\2\2\2"+
		"\u02a2\u02a3\5\u00aeX\2\u02a3\u02a4\7)\2\2\u02a4\u02a5\t\3\2\2\u02a5\u02a7"+
		"\3\2\2\2\u02a6\u024d\3\2\2\2\u02a6\u0250\3\2\2\2\u02a6\u0254\3\2\2\2\u02a6"+
		"\u0258\3\2\2\2\u02a6\u025d\3\2\2\2\u02a6\u025f\3\2\2\2\u02a6\u0263\3\2"+
		"\2\2\u02a6\u0267\3\2\2\2\u02a6\u026c\3\2\2\2\u02a6\u026d\3\2\2\2\u02a6"+
		"\u026f\3\2\2\2\u02a6\u0271\3\2\2\2\u02a6\u0274\3\2\2\2\u02a6\u0275\3\2"+
		"\2\2\u02a6\u0277\3\2\2\2\u02a6\u0279\3\2\2\2\u02a6\u027c\3\2\2\2\u02a6"+
		"\u027d\3\2\2\2\u02a6\u027e\3\2\2\2\u02a6\u0281\3\2\2\2\u02a6\u0284\3\2"+
		"\2\2\u02a6\u0288\3\2\2\2\u02a6\u0289\3\2\2\2\u02a6\u028c\3\2\2\2\u02a6"+
		"\u028f\3\2\2\2\u02a6\u0293\3\2\2\2\u02a6\u0294\3\2\2\2\u02a6\u0296\3\2"+
		"\2\2\u02a6\u0298\3\2\2\2\u02a6\u029b\3\2\2\2\u02a6\u029c\3\2\2\2\u02a6"+
		"\u029f\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7U\3\2\2\2\u02a8\u02a9\5X-\2\u02a9"+
		"\u02aa\7\30\2\2\u02aa\u02ab\5Z.\2\u02abW\3\2\2\2\u02ac\u02af\5\u00aeX"+
		"\2\u02ad\u02af\7\'\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02afY"+
		"\3\2\2\2\u02b0\u02b1\5\\/\2\u02b1[\3\2\2\2\u02b2\u02be\5.\30\2\u02b3\u02b4"+
		"\5.\30\2\u02b4\u02b5\t\3\2\2\u02b5\u02be\3\2\2\2\u02b6\u02b7\5.\30\2\u02b7"+
		"\u02b8\7)\2\2\u02b8\u02be\3\2\2\2\u02b9\u02ba\5.\30\2\u02ba\u02bb\7)\2"+
		"\2\u02bb\u02bc\t\3\2\2\u02bc\u02be\3\2\2\2\u02bd\u02b2\3\2\2\2\u02bd\u02b3"+
		"\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd\u02b9\3\2\2\2\u02be]\3\2\2\2\u02bf"+
		"\u02c4\5`\61\2\u02c0\u02c1\5`\61\2\u02c1\u02c2\5^\60\2\u02c2\u02c4\3\2"+
		"\2\2\u02c3\u02bf\3\2\2\2\u02c3\u02c0\3\2\2\2\u02c4_\3\2\2\2\u02c5\u02c6"+
		"\7\b\2\2\u02c6\u02c7\5b\62\2\u02c7\u02c8\5x=\2\u02c8a\3\2\2\2\u02c9\u02cd"+
		"\5d\63\2\u02ca\u02cd\5f\64\2\u02cb\u02cd\5h\65\2\u02cc\u02c9\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cdc\3\2\2\2\u02ce\u02cf\7!\2\2\u02cf"+
		"\u02d2\7\"\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1\u02d0\3\2"+
		"\2\2\u02d2e\3\2\2\2\u02d3\u02d4\7!\2\2\u02d4\u02d5\5n8\2\u02d5\u02d6\5"+
		"j\66\2\u02d6\u02d7\5p9\2\u02d7\u02d8\5l\67\2\u02d8\u02d9\5r:\2\u02d9\u02da"+
		"\7\"\2\2\u02da\u02e2\3\2\2\2\u02db\u02dc\5n8\2\u02dc\u02dd\5j\66\2\u02dd"+
		"\u02de\5p9\2\u02de\u02df\5l\67\2\u02df\u02e0\5r:\2\u02e0\u02e2\3\2\2\2"+
		"\u02e1\u02d3\3\2\2\2\u02e1\u02db\3\2\2\2\u02e2g\3\2\2\2\u02e3\u02e4\5"+
		"p9\2\u02e4i\3\2\2\2\u02e5\u02e6\7\27\2\2\u02e6k\3\2\2\2\u02e7\u02e8\7"+
		"\27\2\2\u02e8m\3\2\2\2\u02e9\u02ee\5\24\13\2\u02ea\u02eb\7\4\2\2\u02eb"+
		"\u02ee\5\24\13\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed\u02ea\3"+
		"\2\2\2\u02ed\u02ec\3\2\2\2\u02eeo\3\2\2\2\u02ef\u02f2\5J&\2\u02f0\u02f2"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2q\3\2\2\2\u02f3"+
		"\u02f6\5t;\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2"+
		"\2\u02f6s\3\2\2\2\u02f7\u02fd\5$\23\2\u02f8\u02f9\5$\23\2\u02f9\u02fa"+
		"\7\34\2\2\u02fa\u02fb\5t;\2\u02fb\u02fd\3\2\2\2\u02fc\u02f7\3\2\2\2\u02fc"+
		"\u02f8\3\2\2\2\u02fdu\3\2\2\2\u02fe\u0303\5\6\4\2\u02ff\u0300\5\6\4\2"+
		"\u0300\u0301\5v<\2\u0301\u0303\3\2\2\2\u0302\u02fe\3\2\2\2\u0302\u02ff"+
		"\3\2\2\2\u0303w\3\2\2\2\u0304\u0305\7\37\2\2\u0305\u030f\7 \2\2\u0306"+
		"\u0307\7\37\2\2\u0307\u0308\5v<\2\u0308\u0309\7 \2\2\u0309\u030f\3\2\2"+
		"\2\u030a\u030f\58\35\2\u030b\u030f\5,\27\2\u030c\u030f\5^\60\2\u030d\u030f"+
		"\5z>\2\u030e\u0304\3\2\2\2\u030e\u0306\3\2\2\2\u030e\u030a\3\2\2\2\u030e"+
		"\u030b\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030fy\3\2\2\2"+
		"\u0310\u0311\7\t\2\2\u0311\u0312\5|?\2\u0312\u0313\7\27\2\2\u0313{\3\2"+
		"\2\2\u0314\u0317\5\u00b6\\\2\u0315\u0317\5$\23\2\u0316\u0314\3\2\2\2\u0316"+
		"\u0315\3\2\2\2\u0317}\3\2\2\2\u0318\u0319\5\u0080A\2\u0319\u031a\7\37"+
		"\2\2\u031a\u031b\7 \2\2\u031b\u0337\3\2\2\2\u031c\u031d\5\u0080A\2\u031d"+
		"\u031e\7\37\2\2\u031e\u031f\5\u008eH\2\u031f\u0320\7 \2\2\u0320\u0337"+
		"\3\2\2\2\u0321\u0322\5\u0086D\2\u0322\u0323\7\37\2\2\u0323\u0324\7 \2"+
		"\2\u0324\u0337\3\2\2\2\u0325\u0326\5\u0086D\2\u0326\u0327\7\37\2\2\u0327"+
		"\u0328\5\u008eH\2\u0328\u0329\7 \2\2\u0329\u0337\3\2\2\2\u032a\u032b\5"+
		"\u008aF\2\u032b\u032c\7\37\2\2\u032c\u032d\7 \2\2\u032d\u0337\3\2\2\2"+
		"\u032e\u032f\5\u008aF\2\u032f\u0330\7\37\2\2\u0330\u0331\5\u008eH\2\u0331"+
		"\u0332\7 \2\2\u0332\u0337\3\2\2\2\u0333\u0334\5\u008cG\2\u0334\u0335\7"+
		"\27\2\2\u0335\u0337\3\2\2\2\u0336\u0318\3\2\2\2\u0336\u031c\3\2\2\2\u0336"+
		"\u0321\3\2\2\2\u0336\u0325\3\2\2\2\u0336\u032a\3\2\2\2\u0336\u032e\3\2"+
		"\2\2\u0336\u0333\3\2\2\2\u0337\177\3\2\2\2\u0338\u0339\5\u0082B\2\u0339"+
		"\u0081\3\2\2\2\u033a\u033b\7\n\2\2\u033b\u033c\7\'\2\2\u033c\u033d\7!"+
		"\2\2\u033d\u0358\7\"\2\2\u033e\u033f\7\n\2\2\u033f\u0340\7\'\2\2\u0340"+
		"\u0341\7!\2\2\u0341\u0342\7\"\2\2\u0342\u0345\7\26\2\2\u0343\u0346\5\u0084"+
		"C\2\u0344\u0346\7)\2\2\u0345\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346\u0358"+
		"\3\2\2\2\u0347\u0348\7\n\2\2\u0348\u0349\7\'\2\2\u0349\u034a\7!\2\2\u034a"+
		"\u034b\5\u0092J\2\u034b\u034c\7\"\2\2\u034c\u0358\3\2\2\2\u034d\u034e"+
		"\7\n\2\2\u034e\u034f\7\'\2\2\u034f\u0350\7!\2\2\u0350\u0351\5\u0092J\2"+
		"\u0351\u0352\7\"\2\2\u0352\u0355\7\26\2\2\u0353\u0356\5\u0084C\2\u0354"+
		"\u0356\7)\2\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u0358\3\2"+
		"\2\2\u0357\u033a\3\2\2\2\u0357\u033e\3\2\2\2\u0357\u0347\3\2\2\2\u0357"+
		"\u034d\3\2\2\2\u0358\u0083\3\2\2\2\u0359\u035a\7\'\2\2\u035a\u0085\3\2"+
		"\2\2\u035b\u035c\5\u0088E\2\u035c\u035d\5\u0082B\2\u035d\u0373\3\2\2\2"+
		"\u035e\u035f\7\16\2\2\u035f\u0373\5\u0082B\2\u0360\u0361\5\u0088E\2\u0361"+
		"\u0362\7\16\2\2\u0362\u0363\5\u0082B\2\u0363\u0373\3\2\2\2\u0364\u0365"+
		"\7\17\2\2\u0365\u0366\5\u0088E\2\u0366\u0367\7\16\2\2\u0367\u0368\5\u0082"+
		"B\2\u0368\u0373\3\2\2\2\u0369\u036a\7\17\2\2\u036a\u036b\5\u0088E\2\u036b"+
		"\u036c\5\u0082B\2\u036c\u0373\3\2\2\2\u036d\u036e\7\17\2\2\u036e\u0373"+
		"\5\u0082B\2\u036f\u0370\7\17\2\2\u0370\u0371\7\16\2\2\u0371\u0373\5\u0082"+
		"B\2\u0372\u035b\3\2\2\2\u0372\u035e\3\2\2\2\u0372\u0360\3\2\2\2\u0372"+
		"\u0364\3\2\2\2\u0372\u0369\3\2\2\2\u0372\u036d\3\2\2\2\u0372\u036f\3\2"+
		"\2\2\u0373\u0087\3\2\2\2\u0374\u0375\t\4\2\2\u0375\u0089\3\2\2\2\u0376"+
		"\u0377\7\'\2\2\u0377\u0378\7!\2\2\u0378\u037f\7\"\2\2\u0379\u037a\7\'"+
		"\2\2\u037a\u037b\7!\2\2\u037b\u037c\5\u0092J\2\u037c\u037d\7\"\2\2\u037d"+
		"\u037f\3\2\2\2\u037e\u0376\3\2\2\2\u037e\u0379\3\2\2\2\u037f\u008b\3\2"+
		"\2\2\u0380\u0383\5\u0080A\2\u0381\u0383\5\u0086D\2\u0382\u0380\3\2\2\2"+
		"\u0382\u0381\3\2\2\2\u0383\u008d\3\2\2\2\u0384\u0385\5\u0090I\2\u0385"+
		"\u008f\3\2\2\2\u0386\u038b\5\6\4\2\u0387\u0388\5\6\4\2\u0388\u0389\5\u0090"+
		"I\2\u0389\u038b\3\2\2\2\u038a\u0386\3\2\2\2\u038a\u0387\3\2\2\2\u038b"+
		"\u0091\3\2\2\2\u038c\u038d\5\u0094K\2\u038d\u0093\3\2\2\2\u038e\u0394"+
		"\5\u0096L\2\u038f\u0390\5\u0096L\2\u0390\u0391\7\34\2\2\u0391\u0392\5"+
		"\u0094K\2\u0392\u0394\3\2\2\2\u0393\u038e\3\2\2\2\u0393\u038f\3\2\2\2"+
		"\u0394\u0095\3\2\2\2\u0395\u0396\7\'\2\2\u0396\u0397\7)\2\2\u0397\u0097"+
		"\3\2\2\2\u0398\u039c\5\u009aN\2\u0399\u039c\5\u00a0Q\2\u039a\u039c\5\u00a6"+
		"T\2\u039b\u0398\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c"+
		"\u0099\3\2\2\2\u039d\u039e\5\u009cO\2\u039e\u009b\3\2\2\2\u039f\u03a0"+
		"\7\20\2\2\u03a0\u03a1\7\'\2\2\u03a1\u03a2\7\37\2\2\u03a2\u03b9\7 \2\2"+
		"\u03a3\u03a4\7\20\2\2\u03a4\u03a5\7\'\2\2\u03a5\u03a6\7\37\2\2\u03a6\u03a7"+
		"\5\u009eP\2\u03a7\u03a8\7 \2\2\u03a8\u03b9\3\2\2\2\u03a9\u03aa\7\20\2"+
		"\2\u03aa\u03ab\7\'\2\2\u03ab\u03ac\7\22\2\2\u03ac\u03ad\5\60\31\2\u03ad"+
		"\u03ae\7\37\2\2\u03ae\u03af\7 \2\2\u03af\u03b9\3\2\2\2\u03b0\u03b1\7\20"+
		"\2\2\u03b1\u03b2\7\'\2\2\u03b2\u03b3\7\22\2\2\u03b3\u03b4\5\60\31\2\u03b4"+
		"\u03b5\7\37\2\2\u03b5\u03b6\5\u009eP\2\u03b6\u03b7\7 \2\2\u03b7\u03b9"+
		"\3\2\2\2\u03b8\u039f\3\2\2\2\u03b8\u03a3\3\2\2\2\u03b8\u03a9\3\2\2\2\u03b8"+
		"\u03b0\3\2\2\2\u03b9\u009d\3\2\2\2\u03ba\u03bb\5\u0090I\2\u03bb\u009f"+
		"\3\2\2\2\u03bc\u03bd\5\u00a2R\2\u03bd\u00a1\3\2\2\2\u03be\u03bf\7\21\2"+
		"\2\u03bf\u03c0\7\'\2\2\u03c0\u03c1\7\37\2\2\u03c1\u03d8\7 \2\2\u03c2\u03c3"+
		"\7\21\2\2\u03c3\u03c4\7\'\2\2\u03c4\u03c5\7\37\2\2\u03c5\u03c6\5\u00a4"+
		"S\2\u03c6\u03c7\7 \2\2\u03c7\u03d8\3\2\2\2\u03c8\u03c9\7\21\2\2\u03c9"+
		"\u03ca\7\'\2\2\u03ca\u03cb\7\22\2\2\u03cb\u03cc\5\60\31\2\u03cc\u03cd"+
		"\7\37\2\2\u03cd\u03ce\7 \2\2\u03ce\u03d8\3\2\2\2\u03cf\u03d0\7\21\2\2"+
		"\u03d0\u03d1\7\'\2\2\u03d1\u03d2\7\22\2\2\u03d2\u03d3\5\60\31\2\u03d3"+
		"\u03d4\7\37\2\2\u03d4\u03d5\5\u00a4S\2\u03d5\u03d6\7 \2\2\u03d6\u03d8"+
		"\3\2\2\2\u03d7\u03be\3\2\2\2\u03d7\u03c2\3\2\2\2\u03d7\u03c8\3\2\2\2\u03d7"+
		"\u03cf\3\2\2\2\u03d8\u00a3\3\2\2\2\u03d9\u03da\5\u0090I\2\u03da\u00a5"+
		"\3\2\2\2\u03db\u03dc\5\u00aaV\2\u03dc\u03dd\7\37\2\2\u03dd\u03de\7 \2"+
		"\2\u03de\u03e5\3\2\2\2\u03df\u03e0\5\u00aaV\2\u03e0\u03e1\7\37\2\2\u03e1"+
		"\u03e2\5\u00a8U\2\u03e2\u03e3\7 \2\2\u03e3\u03e5\3\2\2\2\u03e4\u03db\3"+
		"\2\2\2\u03e4\u03df\3\2\2\2\u03e5\u00a7\3\2\2\2\u03e6\u03e7\5\u0090I\2"+
		"\u03e7\u00a9\3\2\2\2\u03e8\u03e9\7\23\2\2\u03e9\u040f\7\'\2\2\u03ea\u03eb"+
		"\7\23\2\2\u03eb\u03ec\7\'\2\2\u03ec\u03ed\7\22\2\2\u03ed\u040f\5\60\31"+
		"\2\u03ee\u03ef\7\23\2\2\u03ef\u03f0\7\'\2\2\u03f0\u03f1\7\24\2\2\u03f1"+
		"\u040f\5\60\31\2\u03f2\u03f3\7\23\2\2\u03f3\u03f4\7\'\2\2\u03f4\u03f5"+
		"\7\22\2\2\u03f5\u03f6\5\60\31\2\u03f6\u03f7\7\24\2\2\u03f7\u03f8\5\u00ac"+
		"W\2\u03f8\u040f\3\2\2\2\u03f9\u03fa\7\17\2\2\u03fa\u03fb\7\23\2\2\u03fb"+
		"\u040f\7\'\2\2\u03fc\u03fd\7\17\2\2\u03fd\u03fe\7\23\2\2\u03fe\u03ff\7"+
		"\'\2\2\u03ff\u0400\7\22\2\2\u0400\u040f\5\60\31\2\u0401\u0402\7\17\2\2"+
		"\u0402\u0403\7\23\2\2\u0403\u0404\7\'\2\2\u0404\u0405\7\24\2\2\u0405\u040f"+
		"\5\60\31\2\u0406\u0407\7\17\2\2\u0407\u0408\7\23\2\2\u0408\u0409\7\'\2"+
		"\2\u0409\u040a\7\22\2\2\u040a\u040b\5\60\31\2\u040b\u040c\7\24\2\2\u040c"+
		"\u040d\5\u00acW\2\u040d\u040f\3\2\2\2\u040e\u03e8\3\2\2\2\u040e\u03ea"+
		"\3\2\2\2\u040e\u03ee\3\2\2\2\u040e\u03f2\3\2\2\2\u040e\u03f9\3\2\2\2\u040e"+
		"\u03fc\3\2\2\2\u040e\u0401\3\2\2\2\u040e\u0406\3\2\2\2\u040f\u00ab\3\2"+
		"\2\2\u0410\u0411\7\'\2\2\u0411\u00ad\3\2\2\2\u0412\u0417\5\u00b0Y\2\u0413"+
		"\u0414\5\u00b0Y\2\u0414\u0415\5\u00aeX\2\u0415\u0417\3\2\2\2\u0416\u0412"+
		"\3\2\2\2\u0416\u0413\3\2\2\2\u0417\u00af\3\2\2\2\u0418\u043b\7\'\2\2\u0419"+
		"\u041a\7\'\2\2\u041a\u043b\7\31\2\2\u041b\u041c\7\'\2\2\u041c\u043b\5"+
		"\u00b2Z\2\u041d\u041e\7\'\2\2\u041e\u041f\5\u00b2Z\2\u041f\u0420\7\31"+
		"\2\2\u0420\u043b\3\2\2\2\u0421\u0422\5(\25\2\u0422\u0423\7\'\2\2\u0423"+
		"\u043b\3\2\2\2\u0424\u0425\7\'\2\2\u0425\u043b\7\31\2\2\u0426\u0427\5"+
		"(\25\2\u0427\u0428\7\'\2\2\u0428\u0429\5\u00b2Z\2\u0429\u043b\3\2\2\2"+
		"\u042a\u042b\7\'\2\2\u042b\u042c\5\u00b2Z\2\u042c\u042d\7\31\2\2\u042d"+
		"\u043b\3\2\2\2\u042e\u042f\7\'\2\2\u042f\u043b\5*\26\2\u0430\u0431\7\'"+
		"\2\2\u0431\u043b\7\31\2\2\u0432\u0433\7\'\2\2\u0433\u0434\5\u00b2Z\2\u0434"+
		"\u0435\5*\26\2\u0435\u043b\3\2\2\2\u0436\u0437\7\'\2\2\u0437\u0438\5\u00b2"+
		"Z\2\u0438\u0439\7\31\2\2\u0439\u043b\3\2\2\2\u043a\u0418\3\2\2\2\u043a"+
		"\u0419\3\2\2\2\u043a\u041b\3\2\2\2\u043a\u041d\3\2\2\2\u043a\u0421\3\2"+
		"\2\2\u043a\u0424\3\2\2\2\u043a\u0426\3\2\2\2\u043a\u042a\3\2\2\2\u043a"+
		"\u042e\3\2\2\2\u043a\u0430\3\2\2\2\u043a\u0432\3\2\2\2\u043a\u0436\3\2"+
		"\2\2\u043b\u00b1\3\2\2\2\u043c\u043d\7\35\2\2\u043d\u043e\5\u00b4[\2\u043e"+
		"\u043f\7\36\2\2\u043f\u0446\3\2\2\2\u0440\u0441\7\35\2\2\u0441\u0442\5"+
		"\u00b4[\2\u0442\u0443\7\36\2\2\u0443\u0444\5\u00b2Z\2\u0444\u0446\3\2"+
		"\2\2\u0445\u043c\3\2\2\2\u0445\u0440\3\2\2\2\u0446\u00b3\3\2\2\2\u0447"+
		"\u0448\5$\23\2\u0448\u00b5\3\2\2\2\u0449\u0461\7\'\2\2\u044a\u044b\7\'"+
		"\2\2\u044b\u0461\7)\2\2\u044c\u0461\7+\2\2\u044d\u044e\7+\2\2\u044e\u0461"+
		"\7)\2\2\u044f\u0461\7,\2\2\u0450\u0451\7,\2\2\u0451\u0461\7)\2\2\u0452"+
		"\u0461\7*\2\2\u0453\u0461\5\32\16\2\u0454\u0461\5\36\20\2\u0455\u0461"+
		"\5$\23\2\u0456\u0461\5.\30\2\u0457\u0458\5\u00b8]\2\u0458\u0459\7\31\2"+
		"\2\u0459\u045a\5\u00ba^\2\u045a\u0461\3\2\2\2\u045b\u045c\5\u00b8]\2\u045c"+
		"\u045d\7\33\2\2\u045d\u045e\5\u00ba^\2\u045e\u0461\3\2\2\2\u045f\u0461"+
		"\5\u00aeX\2\u0460\u0449\3\2\2\2\u0460\u044a\3\2\2\2\u0460\u044c\3\2\2"+
		"\2\u0460\u044d\3\2\2\2\u0460\u044f\3\2\2\2\u0460\u0450\3\2\2\2\u0460\u0452"+
		"\3\2\2\2\u0460\u0453\3\2\2\2\u0460\u0454\3\2\2\2\u0460\u0455\3\2\2\2\u0460"+
		"\u0456\3\2\2\2\u0460\u0457\3\2\2\2\u0460\u045b\3\2\2\2\u0460\u045f\3\2"+
		"\2\2\u0461\u00b7\3\2\2\2\u0462\u0463\7\'\2\2\u0463\u00b9\3\2\2\2\u0464"+
		"\u0465\7\'\2\2\u0465\u00bb\3\2\2\2;\u00c4\u00cf\u00dc\u0111\u0118\u0129"+
		"\u0137\u013f\u0146\u014e\u0159\u0163\u01bd\u01d9\u01e5\u01f1\u01f7\u0204"+
		"\u020e\u0223\u0229\u0233\u0238\u023d\u0247\u02a6\u02ae\u02bd\u02c3\u02cc"+
		"\u02d1\u02e1\u02ed\u02f1\u02f5\u02fc\u0302\u030e\u0316\u0336\u0345\u0355"+
		"\u0357\u0372\u037e\u0382\u038a\u0393\u039b\u03b8\u03d7\u03e4\u040e\u0416"+
		"\u043a\u0445\u0460";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}