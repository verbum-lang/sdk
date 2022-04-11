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
		RULE_interfaceClassDefinition = 77, RULE_abstractClass = 78, RULE_abstractClassDefinition = 79, 
		RULE_classDefination = 80, RULE_classModesGeneral = 81, RULE_classModes = 82, 
		RULE_arrayAccessElements = 83, RULE_arrayAccessElementsItems = 84, RULE_accessBlockAr = 85, 
		RULE_arrayIndexAccess = 86, RULE_generalValue = 87, RULE_objIdentifierA = 88, 
		RULE_objIdentifierB = 89;
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
			"interfaceClass", "interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
			"classDefination", "classModesGeneral", "classModes", "arrayAccessElements", 
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
			setState(180);
			fileContent();
			setState(181);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				sentence();
				setState(185);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
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
			setState(201);
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
			setState(203);
			match(Use);
			setState(204);
			useValue();
			setState(205);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				useString();
				setState(209);
				match(Separator);
				setState(210);
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
			setState(214);
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
			setState(216);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(Var);
				setState(219);
				variableMembers();
				setState(220);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				methodPerm();
				setState(223);
				match(Var);
				setState(224);
				variableMembers();
				setState(225);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(Static);
				setState(228);
				match(Var);
				setState(229);
				variableMembers();
				setState(230);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				methodPerm();
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(Final);
				setState(239);
				methodPerm();
				setState(240);
				match(Static);
				setState(241);
				match(Var);
				setState(242);
				variableMembers();
				setState(243);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(Final);
				setState(246);
				methodPerm();
				setState(247);
				match(Var);
				setState(248);
				variableMembers();
				setState(249);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(Final);
				setState(252);
				match(Var);
				setState(253);
				variableMembers();
				setState(254);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(Final);
				setState(257);
				match(Static);
				setState(258);
				match(Var);
				setState(259);
				variableMembers();
				setState(260);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				variableMembers();
				setState(263);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				variableDefinition();
				setState(269);
				match(Separator);
				setState(270);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Identifier);
				setState(275);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				objIdentifierA();
				setState(277);
				match(Point);
				setState(278);
				objIdentifierB();
				setState(279);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				objIdentifierA();
				setState(282);
				match(TwoTwoPoint);
				setState(283);
				objIdentifierB();
				setState(284);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				arrayAccessElements();
				setState(287);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(TypeSpec);
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				match(New);
				setState(298);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(New);
				setState(302);
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
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(OpenArIndex);
				setState(306);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(OpenArIndex);
				setState(308);
				indexArrayElements();
				setState(309);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				generalValue();
				setState(315);
				match(Separator);
				setState(316);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(OpenBlock);
				setState(321);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(OpenBlock);
				setState(323);
				associativeArrayElements();
				setState(324);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(Identifier);
				setState(329);
				match(TwoPoint);
				setState(330);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(Identifier);
				setState(332);
				match(TwoPoint);
				setState(333);
				generalValue();
				setState(334);
				match(Separator);
				setState(335);
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
			setState(339);
			match(OpenOp);
			setState(340);
			operationElements();
			setState(341);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				operationValue();
				setState(345);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				functionCall();
				setState(351);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				functionCall();
				setState(354);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				functionCall();
				setState(357);
				match(TypeSpec);
				setState(358);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(361);
				match(Identifier);
				setState(362);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(Identifier);
				setState(364);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(365);
				match(Identifier);
				setState(366);
				match(TypeSpec);
				setState(367);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(368);
				firstIncDec();
				setState(369);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(371);
				firstIncDec();
				setState(372);
				match(Identifier);
				setState(373);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(375);
				firstIncDec();
				setState(376);
				match(Identifier);
				setState(377);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(379);
				firstIncDec();
				setState(380);
				match(Identifier);
				setState(381);
				match(TypeSpec);
				setState(382);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(384);
				match(Identifier);
				setState(385);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(386);
				match(Identifier);
				setState(387);
				lastIncDec();
				setState(388);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(390);
				match(Identifier);
				setState(391);
				lastIncDec();
				setState(392);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(394);
				match(Identifier);
				setState(395);
				lastIncDec();
				setState(396);
				match(TypeSpec);
				setState(397);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(399);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(400);
				match(Integer);
				setState(401);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(402);
				match(Integer);
				setState(403);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(404);
				match(Integer);
				setState(405);
				match(TypeSpec);
				setState(406);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(407);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(408);
				match(Float);
				setState(409);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(410);
				match(Float);
				setState(411);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(412);
				match(Float);
				setState(413);
				match(TypeSpec);
				setState(414);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(415);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(416);
				operationBlock();
				setState(417);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(419);
				operationBlock();
				setState(420);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(422);
				operationBlock();
				setState(423);
				match(TypeSpec);
				setState(424);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(426);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(427);
				arrayAccessElements();
				setState(428);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(430);
				arrayAccessElements();
				setState(431);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(433);
				arrayAccessElements();
				setState(434);
				match(TypeSpec);
				setState(435);
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
			setState(439);
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
			setState(441);
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
			setState(443);
			functionCall();
			setState(444);
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
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(Identifier);
				setState(447);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(Identifier);
				setState(449);
				match(Point);
				setState(450);
				identifierB();
				setState(451);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(Identifier);
				setState(454);
				match(TwoTwoPoint);
				setState(455);
				identifierB();
				setState(456);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(Identifier);
				setState(459);
				match(Point);
				setState(460);
				identifierB();
				setState(461);
				functionCallParam();
				setState(462);
				pointSeparator();
				setState(463);
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
			setState(467);
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
			setState(469);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(OpenOp);
				setState(472);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(OpenOp);
				setState(474);
				functionCallParamElements();
				setState(475);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				generalValue();
				setState(481);
				match(Separator);
				setState(482);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				operationElements();
				setState(486);
				match(Separator);
				setState(487);
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				conditionalExpressionStructBlock();
				setState(493);
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
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				ifElementUnique();
				setState(499);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				ifElementUnique();
				setState(502);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				ifElementUnique();
				setState(505);
				elifElements();
				setState(506);
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
			setState(510);
			match(If);
			setState(511);
			conditionalExpressionItems();
			setState(512);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				elifElementUnique();
				setState(516);
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
			setState(520);
			match(Elif);
			setState(521);
			conditionalExpressionItems();
			setState(522);
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
			setState(524);
			match(Else);
			setState(525);
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
			setState(527);
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
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(OpenBlock);
				setState(530);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(OpenBlock);
				setState(532);
				conditionalBlockElsItems();
				setState(533);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
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
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				sentence();
				setState(543);
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
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				conditionExpValue();
				setState(549);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				conditionExpBlock();
				setState(553);
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
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(Not);
				setState(558);
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
				setState(559);
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
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(Not);
				setState(564);
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
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				conditionExpBlockItem();
				setState(569);
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
				setState(571);
				conditionExpBlockItem();
				setState(572);
				match(TypeSpec);
				setState(573);
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
			setState(577);
			match(OpenOp);
			setState(578);
			conditionalExpressionElements();
			setState(579);
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
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				firstIncDec();
				setState(582);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				firstIncDec();
				setState(585);
				match(Identifier);
				setState(586);
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
				setState(588);
				firstIncDec();
				setState(589);
				match(Identifier);
				setState(590);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				firstIncDec();
				setState(593);
				match(Identifier);
				setState(594);
				match(TypeSpec);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				match(Identifier);
				setState(598);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				match(Identifier);
				setState(600);
				lastIncDec();
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(603);
				match(Identifier);
				setState(604);
				lastIncDec();
				setState(605);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(607);
				match(Identifier);
				setState(608);
				lastIncDec();
				setState(609);
				match(TypeSpec);
				setState(610);
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
				setState(612);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(613);
				match(Integer);
				setState(614);
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
				setState(615);
				match(Integer);
				setState(616);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(617);
				match(Integer);
				setState(618);
				match(TypeSpec);
				setState(619);
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
				setState(620);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(621);
				match(Float);
				setState(622);
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
				setState(623);
				match(Float);
				setState(624);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(625);
				match(Float);
				setState(626);
				match(TypeSpec);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(628);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(629);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(630);
				functionCall();
				setState(631);
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
				setState(633);
				functionCall();
				setState(634);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(636);
				functionCall();
				setState(637);
				match(TypeSpec);
				setState(638);
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
				setState(640);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(641);
				operationBlock();
				setState(642);
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
				setState(644);
				operationBlock();
				setState(645);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(647);
				operationBlock();
				setState(648);
				match(TypeSpec);
				setState(649);
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
				setState(651);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(652);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(654);
				match(Identifier);
				setState(655);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(656);
				match(Identifier);
				setState(657);
				match(TypeSpec);
				setState(658);
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
				setState(659);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(660);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(663);
				arrayAccessElements();
				setState(664);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(666);
				arrayAccessElements();
				setState(667);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(672);
			identifierAttrFn();
			setState(673);
			match(Attr);
			setState(674);
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
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
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
			setState(680);
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
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				functionCall();
				setState(687);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				functionCall();
				setState(690);
				match(TypeSpec);
				setState(691);
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
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				loopExpressionItems();
				setState(697);
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
			setState(701);
			match(For);
			setState(702);
			loopExpression();
			setState(703);
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
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
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
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(OpenOp);
				setState(711);
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
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(OpenOp);
				setState(716);
				loopOneMembers();
				setState(717);
				endOne();
				setState(718);
				loopTwoMembers();
				setState(719);
				endTwo();
				setState(720);
				loopThreeMembers();
				setState(721);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				loopOneMembers();
				setState(724);
				endOne();
				setState(725);
				loopTwoMembers();
				setState(726);
				endTwo();
				setState(727);
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
			setState(731);
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
			setState(733);
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
			setState(735);
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
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(Var);
				setState(739);
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
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
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
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
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
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				operationElements();
				setState(753);
				match(Separator);
				setState(754);
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
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				sentence();
				setState(760);
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
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(OpenBlock);
				setState(765);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(OpenBlock);
				setState(767);
				loopBlockElements();
				setState(768);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(772);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(773);
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
			setState(776);
			match(Ret);
			setState(777);
			retValues();
			setState(778);
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
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
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
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				functionsModes();
				setState(785);
				match(OpenBlock);
				setState(786);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				functionsModes();
				setState(789);
				match(OpenBlock);
				setState(790);
				functionCodeBlock();
				setState(791);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				functionMethodsModes();
				setState(794);
				match(OpenBlock);
				setState(795);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				functionMethodsModes();
				setState(798);
				match(OpenBlock);
				setState(799);
				functionCodeBlock();
				setState(800);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				constructClassMethod();
				setState(803);
				match(OpenBlock);
				setState(804);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				constructClassMethod();
				setState(807);
				match(OpenBlock);
				setState(808);
				functionCodeBlock();
				setState(809);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(811);
				interfaceMethod();
				setState(812);
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
			setState(816);
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
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(Function);
				setState(819);
				match(Identifier);
				setState(820);
				match(OpenOp);
				setState(821);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(Function);
				setState(823);
				match(Identifier);
				setState(824);
				match(OpenOp);
				setState(825);
				match(CloseOp);
				setState(826);
				match(ArrowRight);
				setState(829);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(827);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(828);
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
				setState(831);
				match(Function);
				setState(832);
				match(Identifier);
				setState(833);
				match(OpenOp);
				setState(834);
				functionParams();
				setState(835);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				setState(842);
				match(ArrowRight);
				setState(845);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(843);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(844);
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
			setState(849);
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
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				methodPerm();
				setState(852);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(Static);
				setState(855);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				methodPerm();
				setState(857);
				match(Static);
				setState(858);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				match(Final);
				setState(861);
				methodPerm();
				setState(862);
				match(Static);
				setState(863);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(865);
				match(Final);
				setState(866);
				methodPerm();
				setState(867);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(869);
				match(Final);
				setState(870);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(871);
				match(Final);
				setState(872);
				match(Static);
				setState(873);
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
			setState(876);
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
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				match(Identifier);
				setState(879);
				match(OpenOp);
				setState(880);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(Identifier);
				setState(882);
				match(OpenOp);
				setState(883);
				functionParams();
				setState(884);
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
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
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
				setState(889);
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
			setState(892);
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
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				sentence();
				setState(896);
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
			setState(900);
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
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				functionParamElements();
				setState(904);
				match(Separator);
				setState(905);
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
			setState(909);
			match(Identifier);
			setState(910);
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
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
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
			setState(917);
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
		public InterfaceClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceClassDefinition; }
	}

	public final InterfaceClassDefinitionContext interfaceClassDefinition() throws RecognitionException {
		InterfaceClassDefinitionContext _localctx = new InterfaceClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_interfaceClassDefinition);
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				match(Interface);
				setState(920);
				match(Identifier);
				setState(921);
				match(OpenBlock);
				setState(922);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(Interface);
				setState(924);
				match(Identifier);
				setState(925);
				match(OpenBlock);
				setState(926);
				functionCodeBlock();
				setState(927);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				match(Interface);
				setState(930);
				match(Identifier);
				setState(931);
				match(Extends);
				setState(932);
				match(Identifier);
				setState(933);
				match(OpenBlock);
				setState(934);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				match(Interface);
				setState(936);
				match(Identifier);
				setState(937);
				match(Extends);
				setState(938);
				match(Identifier);
				setState(939);
				match(OpenBlock);
				setState(940);
				functionCodeBlock();
				setState(941);
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
		enterRule(_localctx, 156, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
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
		public AbstractClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractClassDefinition; }
	}

	public final AbstractClassDefinitionContext abstractClassDefinition() throws RecognitionException {
		AbstractClassDefinitionContext _localctx = new AbstractClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_abstractClassDefinition);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(Abstract);
				setState(948);
				match(Identifier);
				setState(949);
				match(OpenBlock);
				setState(950);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(Abstract);
				setState(952);
				match(Identifier);
				setState(953);
				match(OpenBlock);
				setState(954);
				functionCodeBlock();
				setState(955);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(Abstract);
				setState(958);
				match(Identifier);
				setState(959);
				match(Extends);
				setState(960);
				match(Identifier);
				setState(961);
				match(OpenBlock);
				setState(962);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				match(Abstract);
				setState(964);
				match(Identifier);
				setState(965);
				match(Extends);
				setState(966);
				match(Identifier);
				setState(967);
				match(OpenBlock);
				setState(968);
				functionCodeBlock();
				setState(969);
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

	public static class ClassDefinationContext extends ParserRuleContext {
		public ClassModesGeneralContext classModesGeneral() {
			return getRuleContext(ClassModesGeneralContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public ClassDefinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefination; }
	}

	public final ClassDefinationContext classDefination() throws RecognitionException {
		ClassDefinationContext _localctx = new ClassDefinationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_classDefination);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				classModesGeneral();
				setState(974);
				match(OpenBlock);
				setState(975);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				classModesGeneral();
				setState(978);
				match(OpenBlock);
				setState(979);
				functionCodeBlock();
				setState(980);
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

	public static class ClassModesGeneralContext extends ParserRuleContext {
		public ClassModesContext classModes() {
			return getRuleContext(ClassModesContext.class,0);
		}
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public ClassModesGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModesGeneral; }
	}

	public final ClassModesGeneralContext classModesGeneral() throws RecognitionException {
		ClassModesGeneralContext _localctx = new ClassModesGeneralContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_classModesGeneral);
		try {
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(Final);
				setState(986);
				classModes();
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

	public static class ClassModesContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TParser.Identifier, i);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public ClassModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModes; }
	}

	public final ClassModesContext classModes() throws RecognitionException {
		ClassModesContext _localctx = new ClassModesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_classModes);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(Class);
				setState(990);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(Class);
				setState(992);
				match(Identifier);
				setState(993);
				match(Extends);
				setState(994);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(Class);
				setState(996);
				match(Identifier);
				setState(997);
				match(Implements);
				setState(998);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
				match(Class);
				setState(1000);
				match(Identifier);
				setState(1001);
				match(Extends);
				setState(1002);
				match(Identifier);
				setState(1003);
				match(Implements);
				setState(1004);
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
		enterRule(_localctx, 166, RULE_arrayAccessElements);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				arrayAccessElementsItems();
				setState(1009);
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
		enterRule(_localctx, 168, RULE_arrayAccessElementsItems);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(Identifier);
				setState(1015);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1016);
				match(Identifier);
				setState(1017);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1018);
				match(Identifier);
				setState(1019);
				accessBlockAr();
				setState(1020);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1022);
				firstIncDec();
				setState(1023);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1025);
				match(Identifier);
				setState(1026);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1027);
				firstIncDec();
				setState(1028);
				match(Identifier);
				setState(1029);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1031);
				match(Identifier);
				setState(1032);
				accessBlockAr();
				setState(1033);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1035);
				match(Identifier);
				setState(1036);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1037);
				match(Identifier);
				setState(1038);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1039);
				match(Identifier);
				setState(1040);
				accessBlockAr();
				setState(1041);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1043);
				match(Identifier);
				setState(1044);
				accessBlockAr();
				setState(1045);
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
		enterRule(_localctx, 170, RULE_accessBlockAr);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(OpenArIndex);
				setState(1050);
				arrayIndexAccess();
				setState(1051);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(OpenArIndex);
				setState(1054);
				arrayIndexAccess();
				setState(1055);
				match(CloseArIndex);
				setState(1056);
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
		enterRule(_localctx, 172, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 174, RULE_generalValue);
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(Identifier);
				setState(1064);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				match(Integer);
				setState(1067);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1068);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1069);
				match(Float);
				setState(1070);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1071);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1072);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1073);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1074);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1075);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1076);
				objIdentifierA();
				setState(1077);
				match(Point);
				setState(1078);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1080);
				objIdentifierA();
				setState(1081);
				match(TwoTwoPoint);
				setState(1082);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1084);
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
		enterRule(_localctx, 176, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
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
		enterRule(_localctx, 178, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0446\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u00bf\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ca\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00d7\n\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010c\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0113\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0124\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0132\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u013a"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0141\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0149\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0154\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u015e\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u01b8\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01d4\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01e0\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01ec\n\34\3\35\3\35\3\35\3\35\5\35\u01f2\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ff\n\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0209\n \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u021e\n$\3%\3%\3%\3%\5%\u0224\n"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u022e\n&\3\'\3\'\3\'\5\'\u0233\n\'\3(\3("+
		"\3(\5(\u0238\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0242\n)\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02a1\n+\3,"+
		"\3,\3,\3,\3-\3-\5-\u02a9\n-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/"+
		"\u02b8\n/\3\60\3\60\3\60\3\60\5\60\u02be\n\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\5\62\u02c7\n\62\3\63\3\63\3\63\5\63\u02cc\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02dc"+
		"\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\58\u02e8\n8\39\39\59\u02ec"+
		"\n9\3:\3:\5:\u02f0\n:\3;\3;\3;\3;\3;\5;\u02f7\n;\3<\3<\3<\3<\5<\u02fd"+
		"\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0309\n=\3>\3>\3>\3>\3?\3?\5?\u0311"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0331\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\5B\u0340\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0350"+
		"\nB\5B\u0352\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\5D\u036d\nD\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0379"+
		"\nF\3G\3G\5G\u037d\nG\3H\3H\3I\3I\3I\3I\5I\u0385\nI\3J\3J\3K\3K\3K\3K"+
		"\3K\5K\u038e\nK\3L\3L\3L\3M\3M\3M\5M\u0396\nM\3N\3N\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03b2\nO\3P"+
		"\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\5Q\u03ce\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u03d9\nR\3S\3S\3S\5S"+
		"\u03de\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u03f0\nT"+
		"\3U\3U\3U\3U\5U\u03f6\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u041a\nV"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0425\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0440\nY\3Z\3Z\3[\3["+
		"\3[\2\2\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\5\4\2\30\30$"+
		"$\3\2#$\3\2\13\r\2\u04b3\2\u00b6\3\2\2\2\4\u00be\3\2\2\2\6\u00c9\3\2\2"+
		"\2\b\u00cb\3\2\2\2\n\u00cd\3\2\2\2\f\u00d6\3\2\2\2\16\u00d8\3\2\2\2\20"+
		"\u00da\3\2\2\2\22\u010b\3\2\2\2\24\u0112\3\2\2\2\26\u0123\3\2\2\2\30\u0131"+
		"\3\2\2\2\32\u0139\3\2\2\2\34\u0140\3\2\2\2\36\u0148\3\2\2\2 \u0153\3\2"+
		"\2\2\"\u0155\3\2\2\2$\u015d\3\2\2\2&\u01b7\3\2\2\2(\u01b9\3\2\2\2*\u01bb"+
		"\3\2\2\2,\u01bd\3\2\2\2.\u01d3\3\2\2\2\60\u01d5\3\2\2\2\62\u01d7\3\2\2"+
		"\2\64\u01df\3\2\2\2\66\u01eb\3\2\2\28\u01f1\3\2\2\2:\u01fe\3\2\2\2<\u0200"+
		"\3\2\2\2>\u0208\3\2\2\2@\u020a\3\2\2\2B\u020e\3\2\2\2D\u0211\3\2\2\2F"+
		"\u021d\3\2\2\2H\u0223\3\2\2\2J\u022d\3\2\2\2L\u0232\3\2\2\2N\u0237\3\2"+
		"\2\2P\u0241\3\2\2\2R\u0243\3\2\2\2T\u02a0\3\2\2\2V\u02a2\3\2\2\2X\u02a8"+
		"\3\2\2\2Z\u02aa\3\2\2\2\\\u02b7\3\2\2\2^\u02bd\3\2\2\2`\u02bf\3\2\2\2"+
		"b\u02c6\3\2\2\2d\u02cb\3\2\2\2f\u02db\3\2\2\2h\u02dd\3\2\2\2j\u02df\3"+
		"\2\2\2l\u02e1\3\2\2\2n\u02e7\3\2\2\2p\u02eb\3\2\2\2r\u02ef\3\2\2\2t\u02f6"+
		"\3\2\2\2v\u02fc\3\2\2\2x\u0308\3\2\2\2z\u030a\3\2\2\2|\u0310\3\2\2\2~"+
		"\u0330\3\2\2\2\u0080\u0332\3\2\2\2\u0082\u0351\3\2\2\2\u0084\u0353\3\2"+
		"\2\2\u0086\u036c\3\2\2\2\u0088\u036e\3\2\2\2\u008a\u0378\3\2\2\2\u008c"+
		"\u037c\3\2\2\2\u008e\u037e\3\2\2\2\u0090\u0384\3\2\2\2\u0092\u0386\3\2"+
		"\2\2\u0094\u038d\3\2\2\2\u0096\u038f\3\2\2\2\u0098\u0395\3\2\2\2\u009a"+
		"\u0397\3\2\2\2\u009c\u03b1\3\2\2\2\u009e\u03b3\3\2\2\2\u00a0\u03cd\3\2"+
		"\2\2\u00a2\u03d8\3\2\2\2\u00a4\u03dd\3\2\2\2\u00a6\u03ef\3\2\2\2\u00a8"+
		"\u03f5\3\2\2\2\u00aa\u0419\3\2\2\2\u00ac\u0424\3\2\2\2\u00ae\u0426\3\2"+
		"\2\2\u00b0\u043f\3\2\2\2\u00b2\u0441\3\2\2\2\u00b4\u0443\3\2\2\2\u00b6"+
		"\u00b7\5\4\3\2\u00b7\u00b8\7\2\2\3\u00b8\3\3\2\2\2\u00b9\u00bf\5\6\4\2"+
		"\u00ba\u00bb\5\6\4\2\u00bb\u00bc\5\4\3\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\5\3\2\2\2\u00c0\u00ca\5\b\5\2\u00c1\u00ca\5\n\6\2\u00c2\u00ca\5\20\t"+
		"\2\u00c3\u00ca\5,\27\2\u00c4\u00ca\58\35\2\u00c5\u00ca\5^\60\2\u00c6\u00ca"+
		"\5~@\2\u00c7\u00ca\5z>\2\u00c8\u00ca\5\u0098M\2\u00c9\u00c0\3\2\2\2\u00c9"+
		"\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2"+
		"\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\7\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc\t\3\2\2\2\u00cd"+
		"\u00ce\7\3\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\7\27\2\2\u00d0\13\3\2\2"+
		"\2\u00d1\u00d7\5\16\b\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7\34\2\2\u00d4"+
		"\u00d5\5\f\7\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2"+
		"\2\2\u00d7\r\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\17\3\2\2\2\u00da\u00db\5"+
		"\22\n\2\u00db\21\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5\24\13\2\u00de"+
		"\u00df\7\27\2\2\u00df\u010c\3\2\2\2\u00e0\u00e1\5\u0088E\2\u00e1\u00e2"+
		"\7\4\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00e4\7\27\2\2\u00e4\u010c\3\2\2"+
		"\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5\24\13\2\u00e8"+
		"\u00e9\7\27\2\2\u00e9\u010c\3\2\2\2\u00ea\u00eb\5\u0088E\2\u00eb\u00ec"+
		"\7\16\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\7\27\2"+
		"\2\u00ef\u010c\3\2\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\5\u0088E\2\u00f2"+
		"\u00f3\7\16\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5\24\13\2\u00f5\u00f6"+
		"\7\27\2\2\u00f6\u010c\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5\u0088"+
		"E\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\5\24\13\2\u00fb\u00fc\7\27\2\2\u00fc"+
		"\u010c\3\2\2\2\u00fd\u00fe\7\17\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5"+
		"\24\13\2\u0100\u0101\7\27\2\2\u0101\u010c\3\2\2\2\u0102\u0103\7\17\2\2"+
		"\u0103\u0104\7\16\2\2\u0104\u0105\7\4\2\2\u0105\u0106\5\24\13\2\u0106"+
		"\u0107\7\27\2\2\u0107\u010c\3\2\2\2\u0108\u0109\5\24\13\2\u0109\u010a"+
		"\7\27\2\2\u010a\u010c\3\2\2\2\u010b\u00dc\3\2\2\2\u010b\u00e0\3\2\2\2"+
		"\u010b\u00e5\3\2\2\2\u010b\u00ea\3\2\2\2\u010b\u00f0\3\2\2\2\u010b\u00f7"+
		"\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0108\3\2\2\2\u010c"+
		"\23\3\2\2\2\u010d\u0113\5\26\f\2\u010e\u010f\5\26\f\2\u010f\u0110\7\34"+
		"\2\2\u0110\u0111\5\24\13\2\u0111\u0113\3\2\2\2\u0112\u010d\3\2\2\2\u0112"+
		"\u010e\3\2\2\2\u0113\25\3\2\2\2\u0114\u0115\7\'\2\2\u0115\u0124\5\30\r"+
		"\2\u0116\u0117\5\u00b2Z\2\u0117\u0118\7\31\2\2\u0118\u0119\5\u00b4[\2"+
		"\u0119\u011a\5\30\r\2\u011a\u0124\3\2\2\2\u011b\u011c\5\u00b2Z\2\u011c"+
		"\u011d\7\33\2\2\u011d\u011e\5\u00b4[\2\u011e\u011f\5\30\r\2\u011f\u0124"+
		"\3\2\2\2\u0120\u0121\5\u00a8U\2\u0121\u0122\5\30\r\2\u0122\u0124\3\2\2"+
		"\2\u0123\u0114\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u0120"+
		"\3\2\2\2\u0124\27\3\2\2\2\u0125\u0126\t\2\2\2\u0126\u0132\5\u00b0Y\2\u0127"+
		"\u0128\7)\2\2\u0128\u0129\t\2\2\2\u0129\u0132\5\u00b0Y\2\u012a\u012b\t"+
		"\2\2\2\u012b\u012c\7\25\2\2\u012c\u0132\5\u00b0Y\2\u012d\u012e\7)\2\2"+
		"\u012e\u012f\t\2\2\2\u012f\u0130\7\25\2\2\u0130\u0132\5\u00b0Y\2\u0131"+
		"\u0125\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u012d\3\2"+
		"\2\2\u0132\31\3\2\2\2\u0133\u0134\7\35\2\2\u0134\u013a\7\36\2\2\u0135"+
		"\u0136\7\35\2\2\u0136\u0137\5\34\17\2\u0137\u0138\7\36\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0135\3\2\2\2\u013a\33\3\2\2\2\u013b"+
		"\u0141\5\u00b0Y\2\u013c\u013d\5\u00b0Y\2\u013d\u013e\7\34\2\2\u013e\u013f"+
		"\5\34\17\2\u013f\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2"+
		"\u0141\35\3\2\2\2\u0142\u0143\7\37\2\2\u0143\u0149\7 \2\2\u0144\u0145"+
		"\7\37\2\2\u0145\u0146\5 \21\2\u0146\u0147\7 \2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0142\3\2\2\2\u0148\u0144\3\2\2\2\u0149\37\3\2\2\2\u014a\u014b\7\'\2"+
		"\2\u014b\u014c\7\32\2\2\u014c\u0154\5\u00b0Y\2\u014d\u014e\7\'\2\2\u014e"+
		"\u014f\7\32\2\2\u014f\u0150\5\u00b0Y\2\u0150\u0151\7\34\2\2\u0151\u0152"+
		"\5 \21\2\u0152\u0154\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0154"+
		"!\3\2\2\2\u0155\u0156\7!\2\2\u0156\u0157\5$\23\2\u0157\u0158\7\"\2\2\u0158"+
		"#\3\2\2\2\u0159\u015e\5&\24\2\u015a\u015b\5&\24\2\u015b\u015c\5$\23\2"+
		"\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015e%\3"+
		"\2\2\2\u015f\u01b8\5.\30\2\u0160\u0161\5.\30\2\u0161\u0162\7#\2\2\u0162"+
		"\u01b8\3\2\2\2\u0163\u0164\5.\30\2\u0164\u0165\7)\2\2\u0165\u01b8\3\2"+
		"\2\2\u0166\u0167\5.\30\2\u0167\u0168\7)\2\2\u0168\u0169\7#\2\2\u0169\u01b8"+
		"\3\2\2\2\u016a\u01b8\7\'\2\2\u016b\u016c\7\'\2\2\u016c\u01b8\7#\2\2\u016d"+
		"\u016e\7\'\2\2\u016e\u01b8\7)\2\2\u016f\u0170\7\'\2\2\u0170\u0171\7)\2"+
		"\2\u0171\u01b8\7#\2\2\u0172\u0173\5(\25\2\u0173\u0174\7\'\2\2\u0174\u01b8"+
		"\3\2\2\2\u0175\u0176\5(\25\2\u0176\u0177\7\'\2\2\u0177\u0178\7#\2\2\u0178"+
		"\u01b8\3\2\2\2\u0179\u017a\5(\25\2\u017a\u017b\7\'\2\2\u017b\u017c\7)"+
		"\2\2\u017c\u01b8\3\2\2\2\u017d\u017e\5(\25\2\u017e\u017f\7\'\2\2\u017f"+
		"\u0180\7)\2\2\u0180\u0181\7#\2\2\u0181\u01b8\3\2\2\2\u0182\u0183\7\'\2"+
		"\2\u0183\u01b8\5*\26\2\u0184\u0185\7\'\2\2\u0185\u0186\5*\26\2\u0186\u0187"+
		"\7#\2\2\u0187\u01b8\3\2\2\2\u0188\u0189\7\'\2\2\u0189\u018a\5*\26\2\u018a"+
		"\u018b\7)\2\2\u018b\u01b8\3\2\2\2\u018c\u018d\7\'\2\2\u018d\u018e\5*\26"+
		"\2\u018e\u018f\7)\2\2\u018f\u0190\7#\2\2\u0190\u01b8\3\2\2\2\u0191\u01b8"+
		"\7+\2\2\u0192\u0193\7+\2\2\u0193\u01b8\7#\2\2\u0194\u0195\7+\2\2\u0195"+
		"\u01b8\7)\2\2\u0196\u0197\7+\2\2\u0197\u0198\7)\2\2\u0198\u01b8\7#\2\2"+
		"\u0199\u01b8\7,\2\2\u019a\u019b\7,\2\2\u019b\u01b8\7#\2\2\u019c\u019d"+
		"\7,\2\2\u019d\u01b8\7)\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7)\2\2\u01a0"+
		"\u01b8\7#\2\2\u01a1\u01b8\5\"\22\2\u01a2\u01a3\5\"\22\2\u01a3\u01a4\7"+
		"#\2\2\u01a4\u01b8\3\2\2\2\u01a5\u01a6\5\"\22\2\u01a6\u01a7\7)\2\2\u01a7"+
		"\u01b8\3\2\2\2\u01a8\u01a9\5\"\22\2\u01a9\u01aa\7)\2\2\u01aa\u01ab\7#"+
		"\2\2\u01ab\u01b8\3\2\2\2\u01ac\u01b8\5\u00a8U\2\u01ad\u01ae\5\u00a8U\2"+
		"\u01ae\u01af\7#\2\2\u01af\u01b8\3\2\2\2\u01b0\u01b1\5\u00a8U\2\u01b1\u01b2"+
		"\7)\2\2\u01b2\u01b8\3\2\2\2\u01b3\u01b4\5\u00a8U\2\u01b4\u01b5\7)\2\2"+
		"\u01b5\u01b6\7#\2\2\u01b6\u01b8\3\2\2\2\u01b7\u015f\3\2\2\2\u01b7\u0160"+
		"\3\2\2\2\u01b7\u0163\3\2\2\2\u01b7\u0166\3\2\2\2\u01b7\u016a\3\2\2\2\u01b7"+
		"\u016b\3\2\2\2\u01b7\u016d\3\2\2\2\u01b7\u016f\3\2\2\2\u01b7\u0172\3\2"+
		"\2\2\u01b7\u0175\3\2\2\2\u01b7\u0179\3\2\2\2\u01b7\u017d\3\2\2\2\u01b7"+
		"\u0182\3\2\2\2\u01b7\u0184\3\2\2\2\u01b7\u0188\3\2\2\2\u01b7\u018c\3\2"+
		"\2\2\u01b7\u0191\3\2\2\2\u01b7\u0192\3\2\2\2\u01b7\u0194\3\2\2\2\u01b7"+
		"\u0196\3\2\2\2\u01b7\u0199\3\2\2\2\u01b7\u019a\3\2\2\2\u01b7\u019c\3\2"+
		"\2\2\u01b7\u019e\3\2\2\2\u01b7\u01a1\3\2\2\2\u01b7\u01a2\3\2\2\2\u01b7"+
		"\u01a5\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01ac\3\2\2\2\u01b7\u01ad\3\2"+
		"\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8\'\3\2\2\2\u01b9\u01ba"+
		"\7&\2\2\u01ba)\3\2\2\2\u01bb\u01bc\7&\2\2\u01bc+\3\2\2\2\u01bd\u01be\5"+
		".\30\2\u01be\u01bf\7\27\2\2\u01bf-\3\2\2\2\u01c0\u01c1\7\'\2\2\u01c1\u01d4"+
		"\5\64\33\2\u01c2\u01c3\7\'\2\2\u01c3\u01c4\7\31\2\2\u01c4\u01c5\5\60\31"+
		"\2\u01c5\u01c6\5\64\33\2\u01c6\u01d4\3\2\2\2\u01c7\u01c8\7\'\2\2\u01c8"+
		"\u01c9\7\33\2\2\u01c9\u01ca\5\60\31\2\u01ca\u01cb\5\64\33\2\u01cb\u01d4"+
		"\3\2\2\2\u01cc\u01cd\7\'\2\2\u01cd\u01ce\7\31\2\2\u01ce\u01cf\5\60\31"+
		"\2\u01cf\u01d0\5\64\33\2\u01d0\u01d1\5\62\32\2\u01d1\u01d2\5.\30\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01c0\3\2\2\2\u01d3\u01c2\3\2\2\2\u01d3\u01c7\3\2"+
		"\2\2\u01d3\u01cc\3\2\2\2\u01d4/\3\2\2\2\u01d5\u01d6\7\'\2\2\u01d6\61\3"+
		"\2\2\2\u01d7\u01d8\7\31\2\2\u01d8\63\3\2\2\2\u01d9\u01da\7!\2\2\u01da"+
		"\u01e0\7\"\2\2\u01db\u01dc\7!\2\2\u01dc\u01dd\5\66\34\2\u01dd\u01de\7"+
		"\"\2\2\u01de\u01e0\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01db\3\2\2\2\u01e0"+
		"\65\3\2\2\2\u01e1\u01ec\5\u00b0Y\2\u01e2\u01e3\5\u00b0Y\2\u01e3\u01e4"+
		"\7\34\2\2\u01e4\u01e5\5\66\34\2\u01e5\u01ec\3\2\2\2\u01e6\u01ec\5$\23"+
		"\2\u01e7\u01e8\5$\23\2\u01e8\u01e9\7\34\2\2\u01e9\u01ea\5\66\34\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e1\3\2\2\2\u01eb\u01e2\3\2\2\2\u01eb\u01e6\3\2"+
		"\2\2\u01eb\u01e7\3\2\2\2\u01ec\67\3\2\2\2\u01ed\u01f2\5:\36\2\u01ee\u01ef"+
		"\5:\36\2\u01ef\u01f0\58\35\2\u01f0\u01f2\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f29\3\2\2\2\u01f3\u01ff\5<\37\2\u01f4\u01f5\5<\37\2"+
		"\u01f5\u01f6\5> \2\u01f6\u01ff\3\2\2\2\u01f7\u01f8\5<\37\2\u01f8\u01f9"+
		"\5B\"\2\u01f9\u01ff\3\2\2\2\u01fa\u01fb\5<\37\2\u01fb\u01fc\5> \2\u01fc"+
		"\u01fd\5B\"\2\u01fd\u01ff\3\2\2\2\u01fe\u01f3\3\2\2\2\u01fe\u01f4\3\2"+
		"\2\2\u01fe\u01f7\3\2\2\2\u01fe\u01fa\3\2\2\2\u01ff;\3\2\2\2\u0200\u0201"+
		"\7\5\2\2\u0201\u0202\5D#\2\u0202\u0203\5F$\2\u0203=\3\2\2\2\u0204\u0209"+
		"\5@!\2\u0205\u0206\5@!\2\u0206\u0207\5> \2\u0207\u0209\3\2\2\2\u0208\u0204"+
		"\3\2\2\2\u0208\u0205\3\2\2\2\u0209?\3\2\2\2\u020a\u020b\7\6\2\2\u020b"+
		"\u020c\5D#\2\u020c\u020d\5F$\2\u020dA\3\2\2\2\u020e\u020f\7\7\2\2\u020f"+
		"\u0210\5F$\2\u0210C\3\2\2\2\u0211\u0212\5J&\2\u0212E\3\2\2\2\u0213\u0214"+
		"\7\37\2\2\u0214\u021e\7 \2\2\u0215\u0216\7\37\2\2\u0216\u0217\5H%\2\u0217"+
		"\u0218\7 \2\2\u0218\u021e\3\2\2\2\u0219\u021e\58\35\2\u021a\u021e\5,\27"+
		"\2\u021b\u021e\5^\60\2\u021c\u021e\5z>\2\u021d\u0213\3\2\2\2\u021d\u0215"+
		"\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021a\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021c\3\2\2\2\u021eG\3\2\2\2\u021f\u0224\5\6\4\2\u0220\u0221\5\6\4\2"+
		"\u0221\u0222\5H%\2\u0222\u0224\3\2\2\2\u0223\u021f\3\2\2\2\u0223\u0220"+
		"\3\2\2\2\u0224I\3\2\2\2\u0225\u022e\5L\'\2\u0226\u0227\5L\'\2\u0227\u0228"+
		"\5J&\2\u0228\u022e\3\2\2\2\u0229\u022e\5N(\2\u022a\u022b\5N(\2\u022b\u022c"+
		"\5J&\2\u022c\u022e\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u0226\3\2\2\2\u022d"+
		"\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022eK\3\2\2\2\u022f\u0230\7%\2\2\u0230"+
		"\u0233\5T+\2\u0231\u0233\5T+\2\u0232\u022f\3\2\2\2\u0232\u0231\3\2\2\2"+
		"\u0233M\3\2\2\2\u0234\u0238\5P)\2\u0235\u0236\7%\2\2\u0236\u0238\5P)\2"+
		"\u0237\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0238O\3\2\2\2\u0239\u0242\5"+
		"R*\2\u023a\u023b\5R*\2\u023b\u023c\t\3\2\2\u023c\u0242\3\2\2\2\u023d\u023e"+
		"\5R*\2\u023e\u023f\7)\2\2\u023f\u0240\t\3\2\2\u0240\u0242\3\2\2\2\u0241"+
		"\u0239\3\2\2\2\u0241\u023a\3\2\2\2\u0241\u023d\3\2\2\2\u0242Q\3\2\2\2"+
		"\u0243\u0244\7!\2\2\u0244\u0245\5J&\2\u0245\u0246\7\"\2\2\u0246S\3\2\2"+
		"\2\u0247\u0248\5(\25\2\u0248\u0249\7\'\2\2\u0249\u02a1\3\2\2\2\u024a\u024b"+
		"\5(\25\2\u024b\u024c\7\'\2\2\u024c\u024d\t\3\2\2\u024d\u02a1\3\2\2\2\u024e"+
		"\u024f\5(\25\2\u024f\u0250\7\'\2\2\u0250\u0251\7)\2\2\u0251\u02a1\3\2"+
		"\2\2\u0252\u0253\5(\25\2\u0253\u0254\7\'\2\2\u0254\u0255\7)\2\2\u0255"+
		"\u0256\t\3\2\2\u0256\u02a1\3\2\2\2\u0257\u0258\7\'\2\2\u0258\u02a1\5*"+
		"\26\2\u0259\u025a\7\'\2\2\u025a\u025b\5*\26\2\u025b\u025c\t\3\2\2\u025c"+
		"\u02a1\3\2\2\2\u025d\u025e\7\'\2\2\u025e\u025f\5*\26\2\u025f\u0260\7)"+
		"\2\2\u0260\u02a1\3\2\2\2\u0261\u0262\7\'\2\2\u0262\u0263\5*\26\2\u0263"+
		"\u0264\7)\2\2\u0264\u0265\t\3\2\2\u0265\u02a1\3\2\2\2\u0266\u02a1\7+\2"+
		"\2\u0267\u0268\7+\2\2\u0268\u02a1\t\3\2\2\u0269\u026a\7+\2\2\u026a\u02a1"+
		"\7)\2\2\u026b\u026c\7+\2\2\u026c\u026d\7)\2\2\u026d\u02a1\t\3\2\2\u026e"+
		"\u02a1\7,\2\2\u026f\u0270\7,\2\2\u0270\u02a1\t\3\2\2\u0271\u0272\7,\2"+
		"\2\u0272\u02a1\7)\2\2\u0273\u0274\7,\2\2\u0274\u0275\7)\2\2\u0275\u02a1"+
		"\t\3\2\2\u0276\u02a1\5V,\2\u0277\u02a1\5.\30\2\u0278\u0279\5.\30\2\u0279"+
		"\u027a\t\3\2\2\u027a\u02a1\3\2\2\2\u027b\u027c\5.\30\2\u027c\u027d\7)"+
		"\2\2\u027d\u02a1\3\2\2\2\u027e\u027f\5.\30\2\u027f\u0280\7)\2\2\u0280"+
		"\u0281\t\3\2\2\u0281\u02a1\3\2\2\2\u0282\u02a1\5\"\22\2\u0283\u0284\5"+
		"\"\22\2\u0284\u0285\t\3\2\2\u0285\u02a1\3\2\2\2\u0286\u0287\5\"\22\2\u0287"+
		"\u0288\7)\2\2\u0288\u02a1\3\2\2\2\u0289\u028a\5\"\22\2\u028a\u028b\7)"+
		"\2\2\u028b\u028c\t\3\2\2\u028c\u02a1\3\2\2\2\u028d\u02a1\7\'\2\2\u028e"+
		"\u028f\7\'\2\2\u028f\u02a1\t\3\2\2\u0290\u0291\7\'\2\2\u0291\u02a1\7)"+
		"\2\2\u0292\u0293\7\'\2\2\u0293\u0294\7)\2\2\u0294\u02a1\t\3\2\2\u0295"+
		"\u02a1\5\u00a8U\2\u0296\u0297\5\u00a8U\2\u0297\u0298\t\3\2\2\u0298\u02a1"+
		"\3\2\2\2\u0299\u029a\5\u00a8U\2\u029a\u029b\7)\2\2\u029b\u02a1\3\2\2\2"+
		"\u029c\u029d\5\u00a8U\2\u029d\u029e\7)\2\2\u029e\u029f\t\3\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u0247\3\2\2\2\u02a0\u024a\3\2\2\2\u02a0\u024e\3\2\2\2\u02a0"+
		"\u0252\3\2\2\2\u02a0\u0257\3\2\2\2\u02a0\u0259\3\2\2\2\u02a0\u025d\3\2"+
		"\2\2\u02a0\u0261\3\2\2\2\u02a0\u0266\3\2\2\2\u02a0\u0267\3\2\2\2\u02a0"+
		"\u0269\3\2\2\2\u02a0\u026b\3\2\2\2\u02a0\u026e\3\2\2\2\u02a0\u026f\3\2"+
		"\2\2\u02a0\u0271\3\2\2\2\u02a0\u0273\3\2\2\2\u02a0\u0276\3\2\2\2\u02a0"+
		"\u0277\3\2\2\2\u02a0\u0278\3\2\2\2\u02a0\u027b\3\2\2\2\u02a0\u027e\3\2"+
		"\2\2\u02a0\u0282\3\2\2\2\u02a0\u0283\3\2\2\2\u02a0\u0286\3\2\2\2\u02a0"+
		"\u0289\3\2\2\2\u02a0\u028d\3\2\2\2\u02a0\u028e\3\2\2\2\u02a0\u0290\3\2"+
		"\2\2\u02a0\u0292\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0\u0296\3\2\2\2\u02a0"+
		"\u0299\3\2\2\2\u02a0\u029c\3\2\2\2\u02a1U\3\2\2\2\u02a2\u02a3\5X-\2\u02a3"+
		"\u02a4\7\30\2\2\u02a4\u02a5\5Z.\2\u02a5W\3\2\2\2\u02a6\u02a9\5\u00a8U"+
		"\2\u02a7\u02a9\7\'\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9Y"+
		"\3\2\2\2\u02aa\u02ab\5\\/\2\u02ab[\3\2\2\2\u02ac\u02b8\5.\30\2\u02ad\u02ae"+
		"\5.\30\2\u02ae\u02af\t\3\2\2\u02af\u02b8\3\2\2\2\u02b0\u02b1\5.\30\2\u02b1"+
		"\u02b2\7)\2\2\u02b2\u02b8\3\2\2\2\u02b3\u02b4\5.\30\2\u02b4\u02b5\7)\2"+
		"\2\u02b5\u02b6\t\3\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ac\3\2\2\2\u02b7\u02ad"+
		"\3\2\2\2\u02b7\u02b0\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b8]\3\2\2\2\u02b9"+
		"\u02be\5`\61\2\u02ba\u02bb\5`\61\2\u02bb\u02bc\5^\60\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02ba\3\2\2\2\u02be_\3\2\2\2\u02bf\u02c0"+
		"\7\b\2\2\u02c0\u02c1\5b\62\2\u02c1\u02c2\5x=\2\u02c2a\3\2\2\2\u02c3\u02c7"+
		"\5d\63\2\u02c4\u02c7\5f\64\2\u02c5\u02c7\5h\65\2\u02c6\u02c3\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7c\3\2\2\2\u02c8\u02c9\7!\2\2\u02c9"+
		"\u02cc\7\"\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cb\u02ca\3\2"+
		"\2\2\u02cce\3\2\2\2\u02cd\u02ce\7!\2\2\u02ce\u02cf\5n8\2\u02cf\u02d0\5"+
		"j\66\2\u02d0\u02d1\5p9\2\u02d1\u02d2\5l\67\2\u02d2\u02d3\5r:\2\u02d3\u02d4"+
		"\7\"\2\2\u02d4\u02dc\3\2\2\2\u02d5\u02d6\5n8\2\u02d6\u02d7\5j\66\2\u02d7"+
		"\u02d8\5p9\2\u02d8\u02d9\5l\67\2\u02d9\u02da\5r:\2\u02da\u02dc\3\2\2\2"+
		"\u02db\u02cd\3\2\2\2\u02db\u02d5\3\2\2\2\u02dcg\3\2\2\2\u02dd\u02de\5"+
		"p9\2\u02dei\3\2\2\2\u02df\u02e0\7\27\2\2\u02e0k\3\2\2\2\u02e1\u02e2\7"+
		"\27\2\2\u02e2m\3\2\2\2\u02e3\u02e8\5\24\13\2\u02e4\u02e5\7\4\2\2\u02e5"+
		"\u02e8\5\24\13\2\u02e6\u02e8\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e7\u02e4\3"+
		"\2\2\2\u02e7\u02e6\3\2\2\2\u02e8o\3\2\2\2\u02e9\u02ec\5J&\2\u02ea\u02ec"+
		"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ecq\3\2\2\2\u02ed"+
		"\u02f0\5t;\2\u02ee\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02ee\3\2\2"+
		"\2\u02f0s\3\2\2\2\u02f1\u02f7\5$\23\2\u02f2\u02f3\5$\23\2\u02f3\u02f4"+
		"\7\34\2\2\u02f4\u02f5\5t;\2\u02f5\u02f7\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f6"+
		"\u02f2\3\2\2\2\u02f7u\3\2\2\2\u02f8\u02fd\5\6\4\2\u02f9\u02fa\5\6\4\2"+
		"\u02fa\u02fb\5v<\2\u02fb\u02fd\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fc\u02f9"+
		"\3\2\2\2\u02fdw\3\2\2\2\u02fe\u02ff\7\37\2\2\u02ff\u0309\7 \2\2\u0300"+
		"\u0301\7\37\2\2\u0301\u0302\5v<\2\u0302\u0303\7 \2\2\u0303\u0309\3\2\2"+
		"\2\u0304\u0309\58\35\2\u0305\u0309\5,\27\2\u0306\u0309\5^\60\2\u0307\u0309"+
		"\5z>\2\u0308\u02fe\3\2\2\2\u0308\u0300\3\2\2\2\u0308\u0304\3\2\2\2\u0308"+
		"\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309y\3\2\2\2"+
		"\u030a\u030b\7\t\2\2\u030b\u030c\5|?\2\u030c\u030d\7\27\2\2\u030d{\3\2"+
		"\2\2\u030e\u0311\5\u00b0Y\2\u030f\u0311\5$\23\2\u0310\u030e\3\2\2\2\u0310"+
		"\u030f\3\2\2\2\u0311}\3\2\2\2\u0312\u0313\5\u0080A\2\u0313\u0314\7\37"+
		"\2\2\u0314\u0315\7 \2\2\u0315\u0331\3\2\2\2\u0316\u0317\5\u0080A\2\u0317"+
		"\u0318\7\37\2\2\u0318\u0319\5\u008eH\2\u0319\u031a\7 \2\2\u031a\u0331"+
		"\3\2\2\2\u031b\u031c\5\u0086D\2\u031c\u031d\7\37\2\2\u031d\u031e\7 \2"+
		"\2\u031e\u0331\3\2\2\2\u031f\u0320\5\u0086D\2\u0320\u0321\7\37\2\2\u0321"+
		"\u0322\5\u008eH\2\u0322\u0323\7 \2\2\u0323\u0331\3\2\2\2\u0324\u0325\5"+
		"\u008aF\2\u0325\u0326\7\37\2\2\u0326\u0327\7 \2\2\u0327\u0331\3\2\2\2"+
		"\u0328\u0329\5\u008aF\2\u0329\u032a\7\37\2\2\u032a\u032b\5\u008eH\2\u032b"+
		"\u032c\7 \2\2\u032c\u0331\3\2\2\2\u032d\u032e\5\u008cG\2\u032e\u032f\7"+
		"\27\2\2\u032f\u0331\3\2\2\2\u0330\u0312\3\2\2\2\u0330\u0316\3\2\2\2\u0330"+
		"\u031b\3\2\2\2\u0330\u031f\3\2\2\2\u0330\u0324\3\2\2\2\u0330\u0328\3\2"+
		"\2\2\u0330\u032d\3\2\2\2\u0331\177\3\2\2\2\u0332\u0333\5\u0082B\2\u0333"+
		"\u0081\3\2\2\2\u0334\u0335\7\n\2\2\u0335\u0336\7\'\2\2\u0336\u0337\7!"+
		"\2\2\u0337\u0352\7\"\2\2\u0338\u0339\7\n\2\2\u0339\u033a\7\'\2\2\u033a"+
		"\u033b\7!\2\2\u033b\u033c\7\"\2\2\u033c\u033f\7\26\2\2\u033d\u0340\5\u0084"+
		"C\2\u033e\u0340\7)\2\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0352"+
		"\3\2\2\2\u0341\u0342\7\n\2\2\u0342\u0343\7\'\2\2\u0343\u0344\7!\2\2\u0344"+
		"\u0345\5\u0092J\2\u0345\u0346\7\"\2\2\u0346\u0352\3\2\2\2\u0347\u0348"+
		"\7\n\2\2\u0348\u0349\7\'\2\2\u0349\u034a\7!\2\2\u034a\u034b\5\u0092J\2"+
		"\u034b\u034c\7\"\2\2\u034c\u034f\7\26\2\2\u034d\u0350\5\u0084C\2\u034e"+
		"\u0350\7)\2\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350\u0352\3\2"+
		"\2\2\u0351\u0334\3\2\2\2\u0351\u0338\3\2\2\2\u0351\u0341\3\2\2\2\u0351"+
		"\u0347\3\2\2\2\u0352\u0083\3\2\2\2\u0353\u0354\7\'\2\2\u0354\u0085\3\2"+
		"\2\2\u0355\u0356\5\u0088E\2\u0356\u0357\5\u0082B\2\u0357\u036d\3\2\2\2"+
		"\u0358\u0359\7\16\2\2\u0359\u036d\5\u0082B\2\u035a\u035b\5\u0088E\2\u035b"+
		"\u035c\7\16\2\2\u035c\u035d\5\u0082B\2\u035d\u036d\3\2\2\2\u035e\u035f"+
		"\7\17\2\2\u035f\u0360\5\u0088E\2\u0360\u0361\7\16\2\2\u0361\u0362\5\u0082"+
		"B\2\u0362\u036d\3\2\2\2\u0363\u0364\7\17\2\2\u0364\u0365\5\u0088E\2\u0365"+
		"\u0366\5\u0082B\2\u0366\u036d\3\2\2\2\u0367\u0368\7\17\2\2\u0368\u036d"+
		"\5\u0082B\2\u0369\u036a\7\17\2\2\u036a\u036b\7\16\2\2\u036b\u036d\5\u0082"+
		"B\2\u036c\u0355\3\2\2\2\u036c\u0358\3\2\2\2\u036c\u035a\3\2\2\2\u036c"+
		"\u035e\3\2\2\2\u036c\u0363\3\2\2\2\u036c\u0367\3\2\2\2\u036c\u0369\3\2"+
		"\2\2\u036d\u0087\3\2\2\2\u036e\u036f\t\4\2\2\u036f\u0089\3\2\2\2\u0370"+
		"\u0371\7\'\2\2\u0371\u0372\7!\2\2\u0372\u0379\7\"\2\2\u0373\u0374\7\'"+
		"\2\2\u0374\u0375\7!\2\2\u0375\u0376\5\u0092J\2\u0376\u0377\7\"\2\2\u0377"+
		"\u0379\3\2\2\2\u0378\u0370\3\2\2\2\u0378\u0373\3\2\2\2\u0379\u008b\3\2"+
		"\2\2\u037a\u037d\5\u0080A\2\u037b\u037d\5\u0086D\2\u037c\u037a\3\2\2\2"+
		"\u037c\u037b\3\2\2\2\u037d\u008d\3\2\2\2\u037e\u037f\5\u0090I\2\u037f"+
		"\u008f\3\2\2\2\u0380\u0385\5\6\4\2\u0381\u0382\5\6\4\2\u0382\u0383\5\u0090"+
		"I\2\u0383\u0385\3\2\2\2\u0384\u0380\3\2\2\2\u0384\u0381\3\2\2\2\u0385"+
		"\u0091\3\2\2\2\u0386\u0387\5\u0094K\2\u0387\u0093\3\2\2\2\u0388\u038e"+
		"\5\u0096L\2\u0389\u038a\5\u0096L\2\u038a\u038b\7\34\2\2\u038b\u038c\5"+
		"\u0094K\2\u038c\u038e\3\2\2\2\u038d\u0388\3\2\2\2\u038d\u0389\3\2\2\2"+
		"\u038e\u0095\3\2\2\2\u038f\u0390\7\'\2\2\u0390\u0391\7)\2\2\u0391\u0097"+
		"\3\2\2\2\u0392\u0396\5\u009aN\2\u0393\u0396\5\u009eP\2\u0394\u0396\5\u00a2"+
		"R\2\u0395\u0392\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2\2\2\u0396"+
		"\u0099\3\2\2\2\u0397\u0398\5\u009cO\2\u0398\u009b\3\2\2\2\u0399\u039a"+
		"\7\20\2\2\u039a\u039b\7\'\2\2\u039b\u039c\7\37\2\2\u039c\u03b2\7 \2\2"+
		"\u039d\u039e\7\20\2\2\u039e\u039f\7\'\2\2\u039f\u03a0\7\37\2\2\u03a0\u03a1"+
		"\5\u008eH\2\u03a1\u03a2\7 \2\2\u03a2\u03b2\3\2\2\2\u03a3\u03a4\7\20\2"+
		"\2\u03a4\u03a5\7\'\2\2\u03a5\u03a6\7\22\2\2\u03a6\u03a7\7\'\2\2\u03a7"+
		"\u03a8\7\37\2\2\u03a8\u03b2\7 \2\2\u03a9\u03aa\7\20\2\2\u03aa\u03ab\7"+
		"\'\2\2\u03ab\u03ac\7\22\2\2\u03ac\u03ad\7\'\2\2\u03ad\u03ae\7\37\2\2\u03ae"+
		"\u03af\5\u008eH\2\u03af\u03b0\7 \2\2\u03b0\u03b2\3\2\2\2\u03b1\u0399\3"+
		"\2\2\2\u03b1\u039d\3\2\2\2\u03b1\u03a3\3\2\2\2\u03b1\u03a9\3\2\2\2\u03b2"+
		"\u009d\3\2\2\2\u03b3\u03b4\5\u00a0Q\2\u03b4\u009f\3\2\2\2\u03b5\u03b6"+
		"\7\21\2\2\u03b6\u03b7\7\'\2\2\u03b7\u03b8\7\37\2\2\u03b8\u03ce\7 \2\2"+
		"\u03b9\u03ba\7\21\2\2\u03ba\u03bb\7\'\2\2\u03bb\u03bc\7\37\2\2\u03bc\u03bd"+
		"\5\u008eH\2\u03bd\u03be\7 \2\2\u03be\u03ce\3\2\2\2\u03bf\u03c0\7\21\2"+
		"\2\u03c0\u03c1\7\'\2\2\u03c1\u03c2\7\22\2\2\u03c2\u03c3\7\'\2\2\u03c3"+
		"\u03c4\7\37\2\2\u03c4\u03ce\7 \2\2\u03c5\u03c6\7\21\2\2\u03c6\u03c7\7"+
		"\'\2\2\u03c7\u03c8\7\22\2\2\u03c8\u03c9\7\'\2\2\u03c9\u03ca\7\37\2\2\u03ca"+
		"\u03cb\5\u008eH\2\u03cb\u03cc\7 \2\2\u03cc\u03ce\3\2\2\2\u03cd\u03b5\3"+
		"\2\2\2\u03cd\u03b9\3\2\2\2\u03cd\u03bf\3\2\2\2\u03cd\u03c5\3\2\2\2\u03ce"+
		"\u00a1\3\2\2\2\u03cf\u03d0\5\u00a4S\2\u03d0\u03d1\7\37\2\2\u03d1\u03d2"+
		"\7 \2\2\u03d2\u03d9\3\2\2\2\u03d3\u03d4\5\u00a4S\2\u03d4\u03d5\7\37\2"+
		"\2\u03d5\u03d6\5\u008eH\2\u03d6\u03d7\7 \2\2\u03d7\u03d9\3\2\2\2\u03d8"+
		"\u03cf\3\2\2\2\u03d8\u03d3\3\2\2\2\u03d9\u00a3\3\2\2\2\u03da\u03de\5\u00a6"+
		"T\2\u03db\u03dc\7\17\2\2\u03dc\u03de\5\u00a6T\2\u03dd\u03da\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u00a5\3\2\2\2\u03df\u03e0\7\23\2\2\u03e0\u03f0\7"+
		"\'\2\2\u03e1\u03e2\7\23\2\2\u03e2\u03e3\7\'\2\2\u03e3\u03e4\7\22\2\2\u03e4"+
		"\u03f0\7\'\2\2\u03e5\u03e6\7\23\2\2\u03e6\u03e7\7\'\2\2\u03e7\u03e8\7"+
		"\24\2\2\u03e8\u03f0\7\'\2\2\u03e9\u03ea\7\23\2\2\u03ea\u03eb\7\'\2\2\u03eb"+
		"\u03ec\7\22\2\2\u03ec\u03ed\7\'\2\2\u03ed\u03ee\7\24\2\2\u03ee\u03f0\7"+
		"\'\2\2\u03ef\u03df\3\2\2\2\u03ef\u03e1\3\2\2\2\u03ef\u03e5\3\2\2\2\u03ef"+
		"\u03e9\3\2\2\2\u03f0\u00a7\3\2\2\2\u03f1\u03f6\5\u00aaV\2\u03f2\u03f3"+
		"\5\u00aaV\2\u03f3\u03f4\5\u00a8U\2\u03f4\u03f6\3\2\2\2\u03f5\u03f1\3\2"+
		"\2\2\u03f5\u03f2\3\2\2\2\u03f6\u00a9\3\2\2\2\u03f7\u041a\7\'\2\2\u03f8"+
		"\u03f9\7\'\2\2\u03f9\u041a\7\31\2\2\u03fa\u03fb\7\'\2\2\u03fb\u041a\5"+
		"\u00acW\2\u03fc\u03fd\7\'\2\2\u03fd\u03fe\5\u00acW\2\u03fe\u03ff\7\31"+
		"\2\2\u03ff\u041a\3\2\2\2\u0400\u0401\5(\25\2\u0401\u0402\7\'\2\2\u0402"+
		"\u041a\3\2\2\2\u0403\u0404\7\'\2\2\u0404\u041a\7\31\2\2\u0405\u0406\5"+
		"(\25\2\u0406\u0407\7\'\2\2\u0407\u0408\5\u00acW\2\u0408\u041a\3\2\2\2"+
		"\u0409\u040a\7\'\2\2\u040a\u040b\5\u00acW\2\u040b\u040c\7\31\2\2\u040c"+
		"\u041a\3\2\2\2\u040d\u040e\7\'\2\2\u040e\u041a\5*\26\2\u040f\u0410\7\'"+
		"\2\2\u0410\u041a\7\31\2\2\u0411\u0412\7\'\2\2\u0412\u0413\5\u00acW\2\u0413"+
		"\u0414\5*\26\2\u0414\u041a\3\2\2\2\u0415\u0416\7\'\2\2\u0416\u0417\5\u00ac"+
		"W\2\u0417\u0418\7\31\2\2\u0418\u041a\3\2\2\2\u0419\u03f7\3\2\2\2\u0419"+
		"\u03f8\3\2\2\2\u0419\u03fa\3\2\2\2\u0419\u03fc\3\2\2\2\u0419\u0400\3\2"+
		"\2\2\u0419\u0403\3\2\2\2\u0419\u0405\3\2\2\2\u0419\u0409\3\2\2\2\u0419"+
		"\u040d\3\2\2\2\u0419\u040f\3\2\2\2\u0419\u0411\3\2\2\2\u0419\u0415\3\2"+
		"\2\2\u041a\u00ab\3\2\2\2\u041b\u041c\7\35\2\2\u041c\u041d\5\u00aeX\2\u041d"+
		"\u041e\7\36\2\2\u041e\u0425\3\2\2\2\u041f\u0420\7\35\2\2\u0420\u0421\5"+
		"\u00aeX\2\u0421\u0422\7\36\2\2\u0422\u0423\5\u00acW\2\u0423\u0425\3\2"+
		"\2\2\u0424\u041b\3\2\2\2\u0424\u041f\3\2\2\2\u0425\u00ad\3\2\2\2\u0426"+
		"\u0427\5$\23\2\u0427\u00af\3\2\2\2\u0428\u0440\7\'\2\2\u0429\u042a\7\'"+
		"\2\2\u042a\u0440\7)\2\2\u042b\u0440\7+\2\2\u042c\u042d\7+\2\2\u042d\u0440"+
		"\7)\2\2\u042e\u0440\7,\2\2\u042f\u0430\7,\2\2\u0430\u0440\7)\2\2\u0431"+
		"\u0440\7*\2\2\u0432\u0440\5\32\16\2\u0433\u0440\5\36\20\2\u0434\u0440"+
		"\5$\23\2\u0435\u0440\5.\30\2\u0436\u0437\5\u00b2Z\2\u0437\u0438\7\31\2"+
		"\2\u0438\u0439\5\u00b4[\2\u0439\u0440\3\2\2\2\u043a\u043b\5\u00b2Z\2\u043b"+
		"\u043c\7\33\2\2\u043c\u043d\5\u00b4[\2\u043d\u0440\3\2\2\2\u043e\u0440"+
		"\5\u00a8U\2\u043f\u0428\3\2\2\2\u043f\u0429\3\2\2\2\u043f\u042b\3\2\2"+
		"\2\u043f\u042c\3\2\2\2\u043f\u042e\3\2\2\2\u043f\u042f\3\2\2\2\u043f\u0431"+
		"\3\2\2\2\u043f\u0432\3\2\2\2\u043f\u0433\3\2\2\2\u043f\u0434\3\2\2\2\u043f"+
		"\u0435\3\2\2\2\u043f\u0436\3\2\2\2\u043f\u043a\3\2\2\2\u043f\u043e\3\2"+
		"\2\2\u0440\u00b1\3\2\2\2\u0441\u0442\7\'\2\2\u0442\u00b3\3\2\2\2\u0443"+
		"\u0444\7\'\2\2\u0444\u00b5\3\2\2\2<\u00be\u00c9\u00d6\u010b\u0112\u0123"+
		"\u0131\u0139\u0140\u0148\u0153\u015d\u01b7\u01d3\u01df\u01eb\u01f1\u01fe"+
		"\u0208\u021d\u0223\u022d\u0232\u0237\u0241\u02a0\u02a8\u02b7\u02bd\u02c6"+
		"\u02cb\u02db\u02e7\u02eb\u02ef\u02f6\u02fc\u0308\u0310\u0330\u033f\u034f"+
		"\u0351\u036c\u0378\u037c\u0384\u038d\u0395\u03b1\u03cd\u03d8\u03dd\u03ef"+
		"\u03f5\u0419\u0424\u043f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}