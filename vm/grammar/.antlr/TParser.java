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
		RULE_identifierRet = 68, RULE_functionMethodsModes = 69, RULE_methodPerm = 70, 
		RULE_constructClassMethod = 71, RULE_interfaceMethod = 72, RULE_functionCodeBlock = 73, 
		RULE_functionCodeBlockElements = 74, RULE_functionParams = 75, RULE_functionParamsControl = 76, 
		RULE_functionParamElements = 77, RULE_oopGeneral = 78, RULE_interfaceClass = 79, 
		RULE_interfaceClassDefinition = 80, RULE_interfaceCodeBlock = 81, RULE_abstractClass = 82, 
		RULE_abstractClassDefinition = 83, RULE_abstractCodeBlock = 84, RULE_classDefination = 85, 
		RULE_classCodeBlock = 86, RULE_classModes = 87, RULE_identifierC = 88, 
		RULE_arrayAccessElements = 89, RULE_arrayAccessElementsItems = 90, RULE_accessBlockAr = 91, 
		RULE_arrayIndexAccess = 92, RULE_generalValue = 93, RULE_objIdentifierA = 94, 
		RULE_objIdentifierB = 95;
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
			setState(192);
			fileContent();
			setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				sentence();
				setState(197);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
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
			setState(213);
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
			setState(215);
			match(Use);
			setState(216);
			useValue();
			setState(217);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				useString();
				setState(221);
				match(Separator);
				setState(222);
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
			setState(226);
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
			setState(228);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(Var);
				setState(231);
				variableMembers();
				setState(232);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				methodPerm();
				setState(235);
				match(Var);
				setState(236);
				variableMembers();
				setState(237);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				methodPerm();
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(Final);
				setState(251);
				methodPerm();
				setState(252);
				match(Static);
				setState(253);
				match(Var);
				setState(254);
				variableMembers();
				setState(255);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(Final);
				setState(258);
				methodPerm();
				setState(259);
				match(Var);
				setState(260);
				variableMembers();
				setState(261);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				match(Final);
				setState(264);
				match(Var);
				setState(265);
				variableMembers();
				setState(266);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(Final);
				setState(269);
				match(Static);
				setState(270);
				match(Var);
				setState(271);
				variableMembers();
				setState(272);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				variableMembers();
				setState(275);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				variableDefinition();
				setState(281);
				match(Separator);
				setState(282);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(Identifier);
				setState(287);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				objIdentifierA();
				setState(289);
				match(Point);
				setState(290);
				objIdentifierB();
				setState(291);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				objIdentifierA();
				setState(294);
				match(TwoTwoPoint);
				setState(295);
				objIdentifierB();
				setState(296);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				arrayAccessElements();
				setState(299);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				match(New);
				setState(310);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(New);
				setState(314);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(OpenArIndex);
				setState(318);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(OpenArIndex);
				setState(320);
				indexArrayElements();
				setState(321);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(OpenBlock);
				setState(333);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(OpenBlock);
				setState(335);
				associativeArrayElements();
				setState(336);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(Identifier);
				setState(341);
				match(TwoPoint);
				setState(342);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(Identifier);
				setState(344);
				match(TwoPoint);
				setState(345);
				generalValue();
				setState(346);
				match(Separator);
				setState(347);
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
			setState(351);
			match(OpenOp);
			setState(352);
			operationElements();
			setState(353);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				operationValue();
				setState(357);
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
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				functionCall();
				setState(363);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				functionCall();
				setState(366);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				functionCall();
				setState(369);
				match(TypeSpec);
				setState(370);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(373);
				match(Identifier);
				setState(374);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(Identifier);
				setState(376);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				match(Identifier);
				setState(378);
				match(TypeSpec);
				setState(379);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				firstIncDec();
				setState(381);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				firstIncDec();
				setState(384);
				match(Identifier);
				setState(385);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(387);
				firstIncDec();
				setState(388);
				match(Identifier);
				setState(389);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(391);
				firstIncDec();
				setState(392);
				match(Identifier);
				setState(393);
				match(TypeSpec);
				setState(394);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(396);
				match(Identifier);
				setState(397);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(398);
				match(Identifier);
				setState(399);
				lastIncDec();
				setState(400);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(402);
				match(Identifier);
				setState(403);
				lastIncDec();
				setState(404);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(406);
				match(Identifier);
				setState(407);
				lastIncDec();
				setState(408);
				match(TypeSpec);
				setState(409);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(411);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(412);
				match(Integer);
				setState(413);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(414);
				match(Integer);
				setState(415);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(416);
				match(Integer);
				setState(417);
				match(TypeSpec);
				setState(418);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(419);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(420);
				match(Float);
				setState(421);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(422);
				match(Float);
				setState(423);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(424);
				match(Float);
				setState(425);
				match(TypeSpec);
				setState(426);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(427);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(428);
				operationBlock();
				setState(429);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(431);
				operationBlock();
				setState(432);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(434);
				operationBlock();
				setState(435);
				match(TypeSpec);
				setState(436);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(438);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(439);
				arrayAccessElements();
				setState(440);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(442);
				arrayAccessElements();
				setState(443);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(445);
				arrayAccessElements();
				setState(446);
				match(TypeSpec);
				setState(447);
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
			setState(451);
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
			setState(453);
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
			setState(455);
			functionCall();
			setState(456);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(Identifier);
				setState(459);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(Identifier);
				setState(461);
				match(Point);
				setState(462);
				identifierB();
				setState(463);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(Identifier);
				setState(466);
				match(TwoTwoPoint);
				setState(467);
				identifierB();
				setState(468);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
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
			setState(473);
			match(Identifier);
			setState(474);
			match(Point);
			setState(475);
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
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				functionCallCascadingItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				functionCallCascadingItem();
				setState(479);
				match(Point);
				setState(480);
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
			setState(484);
			match(Identifier);
			setState(485);
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
			setState(487);
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
			setState(489);
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
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(OpenOp);
				setState(492);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(OpenOp);
				setState(494);
				functionCallParamElements();
				setState(495);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				generalValue();
				setState(501);
				match(Separator);
				setState(502);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				operationElements();
				setState(506);
				match(Separator);
				setState(507);
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
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				conditionalExpressionStructBlock();
				setState(513);
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
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				ifElementUnique();
				setState(519);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				ifElementUnique();
				setState(522);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				ifElementUnique();
				setState(525);
				elifElements();
				setState(526);
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
			setState(530);
			match(If);
			setState(531);
			conditionalExpressionItems();
			setState(532);
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
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				elifElementUnique();
				setState(536);
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
			setState(540);
			match(Elif);
			setState(541);
			conditionalExpressionItems();
			setState(542);
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
			setState(544);
			match(Else);
			setState(545);
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
			setState(547);
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
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(OpenBlock);
				setState(550);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(OpenBlock);
				setState(552);
				conditionalBlockElsItems();
				setState(553);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
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
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				sentence();
				setState(563);
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
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				conditionExpValue();
				setState(569);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				conditionExpBlock();
				setState(573);
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
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(Not);
				setState(578);
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
				setState(579);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(Not);
				setState(584);
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
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				conditionExpBlockItem();
				setState(589);
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
				setState(591);
				conditionExpBlockItem();
				setState(592);
				match(TypeSpec);
				setState(593);
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
			setState(597);
			match(OpenOp);
			setState(598);
			conditionalExpressionElements();
			setState(599);
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
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				firstIncDec();
				setState(602);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				firstIncDec();
				setState(605);
				match(Identifier);
				setState(606);
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
				setState(608);
				firstIncDec();
				setState(609);
				match(Identifier);
				setState(610);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				firstIncDec();
				setState(613);
				match(Identifier);
				setState(614);
				match(TypeSpec);
				setState(615);
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
				setState(617);
				match(Identifier);
				setState(618);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(619);
				match(Identifier);
				setState(620);
				lastIncDec();
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(623);
				match(Identifier);
				setState(624);
				lastIncDec();
				setState(625);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(627);
				match(Identifier);
				setState(628);
				lastIncDec();
				setState(629);
				match(TypeSpec);
				setState(630);
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
				setState(632);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(633);
				match(Integer);
				setState(634);
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
				setState(635);
				match(Integer);
				setState(636);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(637);
				match(Integer);
				setState(638);
				match(TypeSpec);
				setState(639);
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
				setState(640);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(641);
				match(Float);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(643);
				match(Float);
				setState(644);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(645);
				match(Float);
				setState(646);
				match(TypeSpec);
				setState(647);
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
				setState(648);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(649);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(650);
				functionCall();
				setState(651);
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
				setState(653);
				functionCall();
				setState(654);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(656);
				functionCall();
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
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(660);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(661);
				operationBlock();
				setState(662);
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
				setState(664);
				operationBlock();
				setState(665);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(667);
				operationBlock();
				setState(668);
				match(TypeSpec);
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
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(671);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(672);
				match(Identifier);
				setState(673);
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
				setState(674);
				match(Identifier);
				setState(675);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(676);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(679);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(680);
				arrayAccessElements();
				setState(681);
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
				setState(683);
				arrayAccessElements();
				setState(684);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(686);
				arrayAccessElements();
				setState(687);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(692);
			identifierAttrFn();
			setState(693);
			match(Attr);
			setState(694);
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
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
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
			setState(700);
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
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				functionCall();
				setState(707);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(709);
				functionCall();
				setState(710);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				loopExpressionItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				loopExpressionItems();
				setState(717);
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
			setState(721);
			match(For);
			setState(722);
			loopExpression();
			setState(723);
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
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				loopInfinite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				loopComplete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
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
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(OpenOp);
				setState(731);
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
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(OpenOp);
				setState(736);
				loopOneMembers();
				setState(737);
				endOne();
				setState(738);
				loopTwoMembers();
				setState(739);
				endTwo();
				setState(740);
				loopThreeMembers();
				setState(741);
				match(CloseOp);
				}
				break;
			case Var:
			case End:
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				loopOneMembers();
				setState(744);
				endOne();
				setState(745);
				loopTwoMembers();
				setState(746);
				endTwo();
				setState(747);
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
			setState(751);
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
			setState(753);
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
			setState(755);
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
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				variableMembers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(Var);
				setState(759);
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
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
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
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				operationElements();
				setState(773);
				match(Separator);
				setState(774);
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
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				sentence();
				setState(780);
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
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				match(OpenBlock);
				setState(785);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(OpenBlock);
				setState(787);
				loopBlockElements();
				setState(788);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(792);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(793);
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
			setState(796);
			match(Ret);
			setState(797);
			retValues();
			setState(798);
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
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
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
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				functionsModes();
				setState(805);
				match(OpenBlock);
				setState(806);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				functionsModes();
				setState(809);
				match(OpenBlock);
				setState(810);
				functionCodeBlock();
				setState(811);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				functionMethodsModes();
				setState(814);
				match(OpenBlock);
				setState(815);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				functionMethodsModes();
				setState(818);
				match(OpenBlock);
				setState(819);
				functionCodeBlock();
				setState(820);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				constructClassMethod();
				setState(823);
				match(OpenBlock);
				setState(824);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(826);
				constructClassMethod();
				setState(827);
				match(OpenBlock);
				setState(828);
				functionCodeBlock();
				setState(829);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(831);
				interfaceMethod();
				setState(832);
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
			setState(836);
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
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(Function);
				setState(839);
				match(Identifier);
				setState(840);
				match(OpenOp);
				setState(841);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(Function);
				setState(843);
				match(Identifier);
				setState(844);
				match(OpenOp);
				setState(845);
				match(CloseOp);
				setState(846);
				match(ArrowRight);
				setState(849);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(847);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(848);
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
				setState(851);
				match(Function);
				setState(852);
				match(Identifier);
				setState(853);
				match(OpenOp);
				setState(854);
				functionParams();
				setState(855);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				setState(862);
				match(ArrowRight);
				setState(865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(863);
					identifierRet();
					}
					break;
				case TypeSpec:
					{
					setState(864);
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
			setState(869);
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
		enterRule(_localctx, 138, RULE_functionMethodsModes);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				methodPerm();
				setState(872);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(Static);
				setState(875);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				methodPerm();
				setState(877);
				match(Static);
				setState(878);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				match(Final);
				setState(881);
				methodPerm();
				setState(882);
				match(Static);
				setState(883);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(885);
				match(Final);
				setState(886);
				methodPerm();
				setState(887);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				match(Final);
				setState(890);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(891);
				match(Final);
				setState(892);
				match(Static);
				setState(893);
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
		enterRule(_localctx, 140, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
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
		enterRule(_localctx, 142, RULE_constructClassMethod);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(Identifier);
				setState(899);
				match(OpenOp);
				setState(900);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(Identifier);
				setState(902);
				match(OpenOp);
				setState(903);
				functionParams();
				setState(904);
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
		enterRule(_localctx, 144, RULE_interfaceMethod);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
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
				setState(909);
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
		enterRule(_localctx, 146, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
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
		enterRule(_localctx, 148, RULE_functionCodeBlockElements);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				sentence();
				setState(916);
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
		enterRule(_localctx, 150, RULE_functionParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
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
		enterRule(_localctx, 152, RULE_functionParamsControl);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				functionParamElements();
				setState(924);
				match(Separator);
				setState(925);
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
		enterRule(_localctx, 154, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(Identifier);
			setState(930);
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
		enterRule(_localctx, 156, RULE_oopGeneral);
		try {
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
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
		enterRule(_localctx, 158, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
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
		enterRule(_localctx, 160, RULE_interfaceClassDefinition);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(Interface);
				setState(940);
				match(Identifier);
				setState(941);
				match(OpenBlock);
				setState(942);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(Interface);
				setState(944);
				match(Identifier);
				setState(945);
				match(OpenBlock);
				setState(946);
				interfaceCodeBlock();
				setState(947);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				match(Interface);
				setState(950);
				match(Identifier);
				setState(951);
				match(Extends);
				setState(952);
				identifierB();
				setState(953);
				match(OpenBlock);
				setState(954);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(956);
				match(Interface);
				setState(957);
				match(Identifier);
				setState(958);
				match(Extends);
				setState(959);
				identifierB();
				setState(960);
				match(OpenBlock);
				setState(961);
				interfaceCodeBlock();
				setState(962);
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
		enterRule(_localctx, 162, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
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
		enterRule(_localctx, 164, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
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
		enterRule(_localctx, 166, RULE_abstractClassDefinition);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(Abstract);
				setState(971);
				match(Identifier);
				setState(972);
				match(OpenBlock);
				setState(973);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				match(Abstract);
				setState(975);
				match(Identifier);
				setState(976);
				match(OpenBlock);
				setState(977);
				abstractCodeBlock();
				setState(978);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				match(Abstract);
				setState(981);
				match(Identifier);
				setState(982);
				match(Extends);
				setState(983);
				identifierB();
				setState(984);
				match(OpenBlock);
				setState(985);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(987);
				match(Abstract);
				setState(988);
				match(Identifier);
				setState(989);
				match(Extends);
				setState(990);
				identifierB();
				setState(991);
				match(OpenBlock);
				setState(992);
				abstractCodeBlock();
				setState(993);
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
		enterRule(_localctx, 168, RULE_abstractCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
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
		enterRule(_localctx, 170, RULE_classDefination);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				classModes();
				setState(1000);
				match(OpenBlock);
				setState(1001);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				classModes();
				setState(1004);
				match(OpenBlock);
				setState(1005);
				classCodeBlock();
				setState(1006);
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
		enterRule(_localctx, 172, RULE_classCodeBlock);
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
		enterRule(_localctx, 174, RULE_classModes);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				match(Class);
				setState(1013);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(Class);
				setState(1015);
				match(Identifier);
				setState(1016);
				match(Extends);
				setState(1017);
				identifierB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1018);
				match(Class);
				setState(1019);
				match(Identifier);
				setState(1020);
				match(Implements);
				setState(1021);
				identifierB();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1022);
				match(Class);
				setState(1023);
				match(Identifier);
				setState(1024);
				match(Extends);
				setState(1025);
				identifierB();
				setState(1026);
				match(Implements);
				setState(1027);
				identifierC();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1029);
				match(Final);
				setState(1030);
				match(Class);
				setState(1031);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				match(Final);
				setState(1033);
				match(Class);
				setState(1034);
				match(Identifier);
				setState(1035);
				match(Extends);
				setState(1036);
				identifierB();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1037);
				match(Final);
				setState(1038);
				match(Class);
				setState(1039);
				match(Identifier);
				setState(1040);
				match(Implements);
				setState(1041);
				identifierB();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1042);
				match(Final);
				setState(1043);
				match(Class);
				setState(1044);
				match(Identifier);
				setState(1045);
				match(Extends);
				setState(1046);
				identifierB();
				setState(1047);
				match(Implements);
				setState(1048);
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
		enterRule(_localctx, 176, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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
		enterRule(_localctx, 178, RULE_arrayAccessElements);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				arrayAccessElementsItems();
				setState(1056);
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
		enterRule(_localctx, 180, RULE_arrayAccessElementsItems);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(Identifier);
				setState(1062);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				match(Identifier);
				setState(1064);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				match(Identifier);
				setState(1066);
				accessBlockAr();
				setState(1067);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1069);
				firstIncDec();
				setState(1070);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1072);
				match(Identifier);
				setState(1073);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1074);
				firstIncDec();
				setState(1075);
				match(Identifier);
				setState(1076);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1078);
				match(Identifier);
				setState(1079);
				accessBlockAr();
				setState(1080);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1082);
				match(Identifier);
				setState(1083);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1084);
				match(Identifier);
				setState(1085);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1086);
				match(Identifier);
				setState(1087);
				accessBlockAr();
				setState(1088);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1090);
				match(Identifier);
				setState(1091);
				accessBlockAr();
				setState(1092);
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
		enterRule(_localctx, 182, RULE_accessBlockAr);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(OpenArIndex);
				setState(1097);
				arrayIndexAccess();
				setState(1098);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(OpenArIndex);
				setState(1101);
				arrayIndexAccess();
				setState(1102);
				match(CloseArIndex);
				setState(1103);
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
		enterRule(_localctx, 184, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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
		enterRule(_localctx, 186, RULE_generalValue);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				match(Identifier);
				setState(1111);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(Integer);
				setState(1114);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1115);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1116);
				match(Float);
				setState(1117);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1118);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1119);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1120);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1121);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1122);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1123);
				objIdentifierA();
				setState(1124);
				match(Point);
				setState(1125);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1127);
				objIdentifierA();
				setState(1128);
				match(TwoTwoPoint);
				setState(1129);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1131);
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
		enterRule(_localctx, 188, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
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
		enterRule(_localctx, 190, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0475\4\2\t\2"+
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
		"`\t`\4a\ta\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00cb\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d6\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00e3\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0118\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u011f\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0130"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013e\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0146\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u014d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0155\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0160\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01c4\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01da\n\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01e5\n\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01f4\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0200\n\37\3 \3 \3 \3 \5 \u0206\n \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0213\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5"+
		"#\u021d\n#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0232\n\'\3(\3(\3(\3(\5(\u0238\n(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u0242\n)\3*\3*\3*\5*\u0247\n*\3+\3+\3+\5+\u024c\n+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0256\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02b5\n.\3/\3/\3/\3/\3\60\3\60\5\60\u02bd"+
		"\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u02cc\n\62\3\63\3\63\3\63\3\63\5\63\u02d2\n\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\5\65\u02db\n\65\3\66\3\66\3\66\5\66\u02e0\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u02f0\n\67\38\38\39\39\3:\3:\3;\3;\3;\3;\5;\u02fc\n;\3<\3<\5<\u0300\n"+
		"<\3=\3=\5=\u0304\n=\3>\3>\3>\3>\3>\5>\u030b\n>\3?\3?\3?\3?\5?\u0311\n"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u031d\n@\3A\3A\3A\3A\3B\3B\5B\u0325"+
		"\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0345\nC\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\5E\u0354\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0364"+
		"\nE\5E\u0366\nE\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\5G\u0381\nG\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\5I\u038d"+
		"\nI\3J\3J\5J\u0391\nJ\3K\3K\3L\3L\3L\3L\5L\u0399\nL\3M\3M\3N\3N\3N\3N"+
		"\3N\5N\u03a2\nN\3O\3O\3O\3P\3P\3P\5P\u03aa\nP\3Q\3Q\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u03c7\nR"+
		"\3S\3S\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\5U\u03e6\nU\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03f3"+
		"\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u041d\nY\3Z"+
		"\3Z\3[\3[\3[\3[\5[\u0425\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0449\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0454"+
		"\n]\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\5_\u046f\n_\3`\3`\3a\3a\3a\2\2b\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\2\5\4\2\30\30$$\3\2#"+
		"$\3\2\13\r\2\u04e0\2\u00c2\3\2\2\2\4\u00ca\3\2\2\2\6\u00d5\3\2\2\2\b\u00d7"+
		"\3\2\2\2\n\u00d9\3\2\2\2\f\u00e2\3\2\2\2\16\u00e4\3\2\2\2\20\u00e6\3\2"+
		"\2\2\22\u0117\3\2\2\2\24\u011e\3\2\2\2\26\u012f\3\2\2\2\30\u013d\3\2\2"+
		"\2\32\u0145\3\2\2\2\34\u014c\3\2\2\2\36\u0154\3\2\2\2 \u015f\3\2\2\2\""+
		"\u0161\3\2\2\2$\u0169\3\2\2\2&\u01c3\3\2\2\2(\u01c5\3\2\2\2*\u01c7\3\2"+
		"\2\2,\u01c9\3\2\2\2.\u01d9\3\2\2\2\60\u01db\3\2\2\2\62\u01e4\3\2\2\2\64"+
		"\u01e6\3\2\2\2\66\u01e9\3\2\2\28\u01eb\3\2\2\2:\u01f3\3\2\2\2<\u01ff\3"+
		"\2\2\2>\u0205\3\2\2\2@\u0212\3\2\2\2B\u0214\3\2\2\2D\u021c\3\2\2\2F\u021e"+
		"\3\2\2\2H\u0222\3\2\2\2J\u0225\3\2\2\2L\u0231\3\2\2\2N\u0237\3\2\2\2P"+
		"\u0241\3\2\2\2R\u0246\3\2\2\2T\u024b\3\2\2\2V\u0255\3\2\2\2X\u0257\3\2"+
		"\2\2Z\u02b4\3\2\2\2\\\u02b6\3\2\2\2^\u02bc\3\2\2\2`\u02be\3\2\2\2b\u02cb"+
		"\3\2\2\2d\u02d1\3\2\2\2f\u02d3\3\2\2\2h\u02da\3\2\2\2j\u02df\3\2\2\2l"+
		"\u02ef\3\2\2\2n\u02f1\3\2\2\2p\u02f3\3\2\2\2r\u02f5\3\2\2\2t\u02fb\3\2"+
		"\2\2v\u02ff\3\2\2\2x\u0303\3\2\2\2z\u030a\3\2\2\2|\u0310\3\2\2\2~\u031c"+
		"\3\2\2\2\u0080\u031e\3\2\2\2\u0082\u0324\3\2\2\2\u0084\u0344\3\2\2\2\u0086"+
		"\u0346\3\2\2\2\u0088\u0365\3\2\2\2\u008a\u0367\3\2\2\2\u008c\u0380\3\2"+
		"\2\2\u008e\u0382\3\2\2\2\u0090\u038c\3\2\2\2\u0092\u0390\3\2\2\2\u0094"+
		"\u0392\3\2\2\2\u0096\u0398\3\2\2\2\u0098\u039a\3\2\2\2\u009a\u03a1\3\2"+
		"\2\2\u009c\u03a3\3\2\2\2\u009e\u03a9\3\2\2\2\u00a0\u03ab\3\2\2\2\u00a2"+
		"\u03c6\3\2\2\2\u00a4\u03c8\3\2\2\2\u00a6\u03ca\3\2\2\2\u00a8\u03e5\3\2"+
		"\2\2\u00aa\u03e7\3\2\2\2\u00ac\u03f2\3\2\2\2\u00ae\u03f4\3\2\2\2\u00b0"+
		"\u041c\3\2\2\2\u00b2\u041e\3\2\2\2\u00b4\u0424\3\2\2\2\u00b6\u0448\3\2"+
		"\2\2\u00b8\u0453\3\2\2\2\u00ba\u0455\3\2\2\2\u00bc\u046e\3\2\2\2\u00be"+
		"\u0470\3\2\2\2\u00c0\u0472\3\2\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7\2"+
		"\2\3\u00c4\3\3\2\2\2\u00c5\u00cb\5\6\4\2\u00c6\u00c7\5\6\4\2\u00c7\u00c8"+
		"\5\4\3\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\5\3\2\2\2\u00cc\u00d6\5\b\5\2"+
		"\u00cd\u00d6\5\n\6\2\u00ce\u00d6\5\20\t\2\u00cf\u00d6\5,\27\2\u00d0\u00d6"+
		"\5> \2\u00d1\u00d6\5d\63\2\u00d2\u00d6\5\u0084C\2\u00d3\u00d6\5\u0080"+
		"A\2\u00d4\u00d6\5\u009eP\2\u00d5\u00cc\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5"+
		"\u00ce\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\7\3\2\2\2\u00d7\u00d8\7.\2\2\u00d8\t\3\2\2\2\u00d9\u00da\7\3\2\2\u00da"+
		"\u00db\5\f\7\2\u00db\u00dc\7\27\2\2\u00dc\13\3\2\2\2\u00dd\u00e3\5\16"+
		"\b\2\u00de\u00df\5\16\b\2\u00df\u00e0\7\34\2\2\u00e0\u00e1\5\f\7\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\r\3\2\2\2"+
		"\u00e4\u00e5\7*\2\2\u00e5\17\3\2\2\2\u00e6\u00e7\5\22\n\2\u00e7\21\3\2"+
		"\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\7\27\2\2\u00eb"+
		"\u0118\3\2\2\2\u00ec\u00ed\5\u008eH\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef"+
		"\5\24\13\2\u00ef\u00f0\7\27\2\2\u00f0\u0118\3\2\2\2\u00f1\u00f2\7\16\2"+
		"\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\7\27\2\2\u00f5"+
		"\u0118\3\2\2\2\u00f6\u00f7\5\u008eH\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9"+
		"\7\4\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fb\7\27\2\2\u00fb\u0118\3\2\2"+
		"\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\5\u008eH\2\u00fe\u00ff\7\16\2\2\u00ff"+
		"\u0100\7\4\2\2\u0100\u0101\5\24\13\2\u0101\u0102\7\27\2\2\u0102\u0118"+
		"\3\2\2\2\u0103\u0104\7\17\2\2\u0104\u0105\5\u008eH\2\u0105\u0106\7\4\2"+
		"\2\u0106\u0107\5\24\13\2\u0107\u0108\7\27\2\2\u0108\u0118\3\2\2\2\u0109"+
		"\u010a\7\17\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5\24\13\2\u010c\u010d"+
		"\7\27\2\2\u010d\u0118\3\2\2\2\u010e\u010f\7\17\2\2\u010f\u0110\7\16\2"+
		"\2\u0110\u0111\7\4\2\2\u0111\u0112\5\24\13\2\u0112\u0113\7\27\2\2\u0113"+
		"\u0118\3\2\2\2\u0114\u0115\5\24\13\2\u0115\u0116\7\27\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u00e8\3\2\2\2\u0117\u00ec\3\2\2\2\u0117\u00f1\3\2\2\2\u0117"+
		"\u00f6\3\2\2\2\u0117\u00fc\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0109\3\2"+
		"\2\2\u0117\u010e\3\2\2\2\u0117\u0114\3\2\2\2\u0118\23\3\2\2\2\u0119\u011f"+
		"\5\26\f\2\u011a\u011b\5\26\f\2\u011b\u011c\7\34\2\2\u011c\u011d\5\24\13"+
		"\2\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011f\25"+
		"\3\2\2\2\u0120\u0121\7\'\2\2\u0121\u0130\5\30\r\2\u0122\u0123\5\u00be"+
		"`\2\u0123\u0124\7\31\2\2\u0124\u0125\5\u00c0a\2\u0125\u0126\5\30\r\2\u0126"+
		"\u0130\3\2\2\2\u0127\u0128\5\u00be`\2\u0128\u0129\7\33\2\2\u0129\u012a"+
		"\5\u00c0a\2\u012a\u012b\5\30\r\2\u012b\u0130\3\2\2\2\u012c\u012d\5\u00b4"+
		"[\2\u012d\u012e\5\30\r\2\u012e\u0130\3\2\2\2\u012f\u0120\3\2\2\2\u012f"+
		"\u0122\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012c\3\2\2\2\u0130\27\3\2\2"+
		"\2\u0131\u0132\t\2\2\2\u0132\u013e\5\u00bc_\2\u0133\u0134\7)\2\2\u0134"+
		"\u0135\t\2\2\2\u0135\u013e\5\u00bc_\2\u0136\u0137\t\2\2\2\u0137\u0138"+
		"\7\25\2\2\u0138\u013e\5\u00bc_\2\u0139\u013a\7)\2\2\u013a\u013b\t\2\2"+
		"\2\u013b\u013c\7\25\2\2\u013c\u013e\5\u00bc_\2\u013d\u0131\3\2\2\2\u013d"+
		"\u0133\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0139\3\2\2\2\u013e\31\3\2\2"+
		"\2\u013f\u0140\7\35\2\2\u0140\u0146\7\36\2\2\u0141\u0142\7\35\2\2\u0142"+
		"\u0143\5\34\17\2\u0143\u0144\7\36\2\2\u0144\u0146\3\2\2\2\u0145\u013f"+
		"\3\2\2\2\u0145\u0141\3\2\2\2\u0146\33\3\2\2\2\u0147\u014d\5\u00bc_\2\u0148"+
		"\u0149\5\u00bc_\2\u0149\u014a\7\34\2\2\u014a\u014b\5\34\17\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014d\35\3\2\2\2\u014e"+
		"\u014f\7\37\2\2\u014f\u0155\7 \2\2\u0150\u0151\7\37\2\2\u0151\u0152\5"+
		" \21\2\u0152\u0153\7 \2\2\u0153\u0155\3\2\2\2\u0154\u014e\3\2\2\2\u0154"+
		"\u0150\3\2\2\2\u0155\37\3\2\2\2\u0156\u0157\7\'\2\2\u0157\u0158\7\32\2"+
		"\2\u0158\u0160\5\u00bc_\2\u0159\u015a\7\'\2\2\u015a\u015b\7\32\2\2\u015b"+
		"\u015c\5\u00bc_\2\u015c\u015d\7\34\2\2\u015d\u015e\5 \21\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2\u0160!\3\2\2\2\u0161"+
		"\u0162\7!\2\2\u0162\u0163\5$\23\2\u0163\u0164\7\"\2\2\u0164#\3\2\2\2\u0165"+
		"\u016a\5&\24\2\u0166\u0167\5&\24\2\u0167\u0168\5$\23\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u016a%\3\2\2\2\u016b\u01c4"+
		"\5.\30\2\u016c\u016d\5.\30\2\u016d\u016e\7#\2\2\u016e\u01c4\3\2\2\2\u016f"+
		"\u0170\5.\30\2\u0170\u0171\7)\2\2\u0171\u01c4\3\2\2\2\u0172\u0173\5.\30"+
		"\2\u0173\u0174\7)\2\2\u0174\u0175\7#\2\2\u0175\u01c4\3\2\2\2\u0176\u01c4"+
		"\7\'\2\2\u0177\u0178\7\'\2\2\u0178\u01c4\7#\2\2\u0179\u017a\7\'\2\2\u017a"+
		"\u01c4\7)\2\2\u017b\u017c\7\'\2\2\u017c\u017d\7)\2\2\u017d\u01c4\7#\2"+
		"\2\u017e\u017f\5(\25\2\u017f\u0180\7\'\2\2\u0180\u01c4\3\2\2\2\u0181\u0182"+
		"\5(\25\2\u0182\u0183\7\'\2\2\u0183\u0184\7#\2\2\u0184\u01c4\3\2\2\2\u0185"+
		"\u0186\5(\25\2\u0186\u0187\7\'\2\2\u0187\u0188\7)\2\2\u0188\u01c4\3\2"+
		"\2\2\u0189\u018a\5(\25\2\u018a\u018b\7\'\2\2\u018b\u018c\7)\2\2\u018c"+
		"\u018d\7#\2\2\u018d\u01c4\3\2\2\2\u018e\u018f\7\'\2\2\u018f\u01c4\5*\26"+
		"\2\u0190\u0191\7\'\2\2\u0191\u0192\5*\26\2\u0192\u0193\7#\2\2\u0193\u01c4"+
		"\3\2\2\2\u0194\u0195\7\'\2\2\u0195\u0196\5*\26\2\u0196\u0197\7)\2\2\u0197"+
		"\u01c4\3\2\2\2\u0198\u0199\7\'\2\2\u0199\u019a\5*\26\2\u019a\u019b\7)"+
		"\2\2\u019b\u019c\7#\2\2\u019c\u01c4\3\2\2\2\u019d\u01c4\7+\2\2\u019e\u019f"+
		"\7+\2\2\u019f\u01c4\7#\2\2\u01a0\u01a1\7+\2\2\u01a1\u01c4\7)\2\2\u01a2"+
		"\u01a3\7+\2\2\u01a3\u01a4\7)\2\2\u01a4\u01c4\7#\2\2\u01a5\u01c4\7,\2\2"+
		"\u01a6\u01a7\7,\2\2\u01a7\u01c4\7#\2\2\u01a8\u01a9\7,\2\2\u01a9\u01c4"+
		"\7)\2\2\u01aa\u01ab\7,\2\2\u01ab\u01ac\7)\2\2\u01ac\u01c4\7#\2\2\u01ad"+
		"\u01c4\5\"\22\2\u01ae\u01af\5\"\22\2\u01af\u01b0\7#\2\2\u01b0\u01c4\3"+
		"\2\2\2\u01b1\u01b2\5\"\22\2\u01b2\u01b3\7)\2\2\u01b3\u01c4\3\2\2\2\u01b4"+
		"\u01b5\5\"\22\2\u01b5\u01b6\7)\2\2\u01b6\u01b7\7#\2\2\u01b7\u01c4\3\2"+
		"\2\2\u01b8\u01c4\5\u00b4[\2\u01b9\u01ba\5\u00b4[\2\u01ba\u01bb\7#\2\2"+
		"\u01bb\u01c4\3\2\2\2\u01bc\u01bd\5\u00b4[\2\u01bd\u01be\7)\2\2\u01be\u01c4"+
		"\3\2\2\2\u01bf\u01c0\5\u00b4[\2\u01c0\u01c1\7)\2\2\u01c1\u01c2\7#\2\2"+
		"\u01c2\u01c4\3\2\2\2\u01c3\u016b\3\2\2\2\u01c3\u016c\3\2\2\2\u01c3\u016f"+
		"\3\2\2\2\u01c3\u0172\3\2\2\2\u01c3\u0176\3\2\2\2\u01c3\u0177\3\2\2\2\u01c3"+
		"\u0179\3\2\2\2\u01c3\u017b\3\2\2\2\u01c3\u017e\3\2\2\2\u01c3\u0181\3\2"+
		"\2\2\u01c3\u0185\3\2\2\2\u01c3\u0189\3\2\2\2\u01c3\u018e\3\2\2\2\u01c3"+
		"\u0190\3\2\2\2\u01c3\u0194\3\2\2\2\u01c3\u0198\3\2\2\2\u01c3\u019d\3\2"+
		"\2\2\u01c3\u019e\3\2\2\2\u01c3\u01a0\3\2\2\2\u01c3\u01a2\3\2\2\2\u01c3"+
		"\u01a5\3\2\2\2\u01c3\u01a6\3\2\2\2\u01c3\u01a8\3\2\2\2\u01c3\u01aa\3\2"+
		"\2\2\u01c3\u01ad\3\2\2\2\u01c3\u01ae\3\2\2\2\u01c3\u01b1\3\2\2\2\u01c3"+
		"\u01b4\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3\u01bc\3\2"+
		"\2\2\u01c3\u01bf\3\2\2\2\u01c4\'\3\2\2\2\u01c5\u01c6\7&\2\2\u01c6)\3\2"+
		"\2\2\u01c7\u01c8\7&\2\2\u01c8+\3\2\2\2\u01c9\u01ca\5.\30\2\u01ca\u01cb"+
		"\7\27\2\2\u01cb-\3\2\2\2\u01cc\u01cd\7\'\2\2\u01cd\u01da\5:\36\2\u01ce"+
		"\u01cf\7\'\2\2\u01cf\u01d0\7\31\2\2\u01d0\u01d1\5\66\34\2\u01d1\u01d2"+
		"\5:\36\2\u01d2\u01da\3\2\2\2\u01d3\u01d4\7\'\2\2\u01d4\u01d5\7\33\2\2"+
		"\u01d5\u01d6\5\66\34\2\u01d6\u01d7\5:\36\2\u01d7\u01da\3\2\2\2\u01d8\u01da"+
		"\5\60\31\2\u01d9\u01cc\3\2\2\2\u01d9\u01ce\3\2\2\2\u01d9\u01d3\3\2\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01da/\3\2\2\2\u01db\u01dc\7\'\2\2\u01dc\u01dd\7"+
		"\31\2\2\u01dd\u01de\5\62\32\2\u01de\61\3\2\2\2\u01df\u01e5\5\64\33\2\u01e0"+
		"\u01e1\5\64\33\2\u01e1\u01e2\7\31\2\2\u01e2\u01e3\5\62\32\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\63\3\2\2\2\u01e6"+
		"\u01e7\7\'\2\2\u01e7\u01e8\5:\36\2\u01e8\65\3\2\2\2\u01e9\u01ea\7\'\2"+
		"\2\u01ea\67\3\2\2\2\u01eb\u01ec\7\31\2\2\u01ec9\3\2\2\2\u01ed\u01ee\7"+
		"!\2\2\u01ee\u01f4\7\"\2\2\u01ef\u01f0\7!\2\2\u01f0\u01f1\5<\37\2\u01f1"+
		"\u01f2\7\"\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01ef\3\2"+
		"\2\2\u01f4;\3\2\2\2\u01f5\u0200\5\u00bc_\2\u01f6\u01f7\5\u00bc_\2\u01f7"+
		"\u01f8\7\34\2\2\u01f8\u01f9\5<\37\2\u01f9\u0200\3\2\2\2\u01fa\u0200\5"+
		"$\23\2\u01fb\u01fc\5$\23\2\u01fc\u01fd\7\34\2\2\u01fd\u01fe\5<\37\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01f5\3\2\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01fa\3\2"+
		"\2\2\u01ff\u01fb\3\2\2\2\u0200=\3\2\2\2\u0201\u0206\5@!\2\u0202\u0203"+
		"\5@!\2\u0203\u0204\5> \2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0205"+
		"\u0202\3\2\2\2\u0206?\3\2\2\2\u0207\u0213\5B\"\2\u0208\u0209\5B\"\2\u0209"+
		"\u020a\5D#\2\u020a\u0213\3\2\2\2\u020b\u020c\5B\"\2\u020c\u020d\5H%\2"+
		"\u020d\u0213\3\2\2\2\u020e\u020f\5B\"\2\u020f\u0210\5D#\2\u0210\u0211"+
		"\5H%\2\u0211\u0213\3\2\2\2\u0212\u0207\3\2\2\2\u0212\u0208\3\2\2\2\u0212"+
		"\u020b\3\2\2\2\u0212\u020e\3\2\2\2\u0213A\3\2\2\2\u0214\u0215\7\5\2\2"+
		"\u0215\u0216\5J&\2\u0216\u0217\5L\'\2\u0217C\3\2\2\2\u0218\u021d\5F$\2"+
		"\u0219\u021a\5F$\2\u021a\u021b\5D#\2\u021b\u021d\3\2\2\2\u021c\u0218\3"+
		"\2\2\2\u021c\u0219\3\2\2\2\u021dE\3\2\2\2\u021e\u021f\7\6\2\2\u021f\u0220"+
		"\5J&\2\u0220\u0221\5L\'\2\u0221G\3\2\2\2\u0222\u0223\7\7\2\2\u0223\u0224"+
		"\5L\'\2\u0224I\3\2\2\2\u0225\u0226\5P)\2\u0226K\3\2\2\2\u0227\u0228\7"+
		"\37\2\2\u0228\u0232\7 \2\2\u0229\u022a\7\37\2\2\u022a\u022b\5N(\2\u022b"+
		"\u022c\7 \2\2\u022c\u0232\3\2\2\2\u022d\u0232\5> \2\u022e\u0232\5,\27"+
		"\2\u022f\u0232\5d\63\2\u0230\u0232\5\u0080A\2\u0231\u0227\3\2\2\2\u0231"+
		"\u0229\3\2\2\2\u0231\u022d\3\2\2\2\u0231\u022e\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0231\u0230\3\2\2\2\u0232M\3\2\2\2\u0233\u0238\5\6\4\2\u0234\u0235"+
		"\5\6\4\2\u0235\u0236\5N(\2\u0236\u0238\3\2\2\2\u0237\u0233\3\2\2\2\u0237"+
		"\u0234\3\2\2\2\u0238O\3\2\2\2\u0239\u0242\5R*\2\u023a\u023b\5R*\2\u023b"+
		"\u023c\5P)\2\u023c\u0242\3\2\2\2\u023d\u0242\5T+\2\u023e\u023f\5T+\2\u023f"+
		"\u0240\5P)\2\u0240\u0242\3\2\2\2\u0241\u0239\3\2\2\2\u0241\u023a\3\2\2"+
		"\2\u0241\u023d\3\2\2\2\u0241\u023e\3\2\2\2\u0242Q\3\2\2\2\u0243\u0244"+
		"\7%\2\2\u0244\u0247\5Z.\2\u0245\u0247\5Z.\2\u0246\u0243\3\2\2\2\u0246"+
		"\u0245\3\2\2\2\u0247S\3\2\2\2\u0248\u024c\5V,\2\u0249\u024a\7%\2\2\u024a"+
		"\u024c\5V,\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024cU\3\2\2\2\u024d"+
		"\u0256\5X-\2\u024e\u024f\5X-\2\u024f\u0250\t\3\2\2\u0250\u0256\3\2\2\2"+
		"\u0251\u0252\5X-\2\u0252\u0253\7)\2\2\u0253\u0254\t\3\2\2\u0254\u0256"+
		"\3\2\2\2\u0255\u024d\3\2\2\2\u0255\u024e\3\2\2\2\u0255\u0251\3\2\2\2\u0256"+
		"W\3\2\2\2\u0257\u0258\7!\2\2\u0258\u0259\5P)\2\u0259\u025a\7\"\2\2\u025a"+
		"Y\3\2\2\2\u025b\u025c\5(\25\2\u025c\u025d\7\'\2\2\u025d\u02b5\3\2\2\2"+
		"\u025e\u025f\5(\25\2\u025f\u0260\7\'\2\2\u0260\u0261\t\3\2\2\u0261\u02b5"+
		"\3\2\2\2\u0262\u0263\5(\25\2\u0263\u0264\7\'\2\2\u0264\u0265\7)\2\2\u0265"+
		"\u02b5\3\2\2\2\u0266\u0267\5(\25\2\u0267\u0268\7\'\2\2\u0268\u0269\7)"+
		"\2\2\u0269\u026a\t\3\2\2\u026a\u02b5\3\2\2\2\u026b\u026c\7\'\2\2\u026c"+
		"\u02b5\5*\26\2\u026d\u026e\7\'\2\2\u026e\u026f\5*\26\2\u026f\u0270\t\3"+
		"\2\2\u0270\u02b5\3\2\2\2\u0271\u0272\7\'\2\2\u0272\u0273\5*\26\2\u0273"+
		"\u0274\7)\2\2\u0274\u02b5\3\2\2\2\u0275\u0276\7\'\2\2\u0276\u0277\5*\26"+
		"\2\u0277\u0278\7)\2\2\u0278\u0279\t\3\2\2\u0279\u02b5\3\2\2\2\u027a\u02b5"+
		"\7+\2\2\u027b\u027c\7+\2\2\u027c\u02b5\t\3\2\2\u027d\u027e\7+\2\2\u027e"+
		"\u02b5\7)\2\2\u027f\u0280\7+\2\2\u0280\u0281\7)\2\2\u0281\u02b5\t\3\2"+
		"\2\u0282\u02b5\7,\2\2\u0283\u0284\7,\2\2\u0284\u02b5\t\3\2\2\u0285\u0286"+
		"\7,\2\2\u0286\u02b5\7)\2\2\u0287\u0288\7,\2\2\u0288\u0289\7)\2\2\u0289"+
		"\u02b5\t\3\2\2\u028a\u02b5\5\\/\2\u028b\u02b5\5.\30\2\u028c\u028d\5.\30"+
		"\2\u028d\u028e\t\3\2\2\u028e\u02b5\3\2\2\2\u028f\u0290\5.\30\2\u0290\u0291"+
		"\7)\2\2\u0291\u02b5\3\2\2\2\u0292\u0293\5.\30\2\u0293\u0294\7)\2\2\u0294"+
		"\u0295\t\3\2\2\u0295\u02b5\3\2\2\2\u0296\u02b5\5\"\22\2\u0297\u0298\5"+
		"\"\22\2\u0298\u0299\t\3\2\2\u0299\u02b5\3\2\2\2\u029a\u029b\5\"\22\2\u029b"+
		"\u029c\7)\2\2\u029c\u02b5\3\2\2\2\u029d\u029e\5\"\22\2\u029e\u029f\7)"+
		"\2\2\u029f\u02a0\t\3\2\2\u02a0\u02b5\3\2\2\2\u02a1\u02b5\7\'\2\2\u02a2"+
		"\u02a3\7\'\2\2\u02a3\u02b5\t\3\2\2\u02a4\u02a5\7\'\2\2\u02a5\u02b5\7)"+
		"\2\2\u02a6\u02a7\7\'\2\2\u02a7\u02a8\7)\2\2\u02a8\u02b5\t\3\2\2\u02a9"+
		"\u02b5\5\u00b4[\2\u02aa\u02ab\5\u00b4[\2\u02ab\u02ac\t\3\2\2\u02ac\u02b5"+
		"\3\2\2\2\u02ad\u02ae\5\u00b4[\2\u02ae\u02af\7)\2\2\u02af\u02b5\3\2\2\2"+
		"\u02b0\u02b1\5\u00b4[\2\u02b1\u02b2\7)\2\2\u02b2\u02b3\t\3\2\2\u02b3\u02b5"+
		"\3\2\2\2\u02b4\u025b\3\2\2\2\u02b4\u025e\3\2\2\2\u02b4\u0262\3\2\2\2\u02b4"+
		"\u0266\3\2\2\2\u02b4\u026b\3\2\2\2\u02b4\u026d\3\2\2\2\u02b4\u0271\3\2"+
		"\2\2\u02b4\u0275\3\2\2\2\u02b4\u027a\3\2\2\2\u02b4\u027b\3\2\2\2\u02b4"+
		"\u027d\3\2\2\2\u02b4\u027f\3\2\2\2\u02b4\u0282\3\2\2\2\u02b4\u0283\3\2"+
		"\2\2\u02b4\u0285\3\2\2\2\u02b4\u0287\3\2\2\2\u02b4\u028a\3\2\2\2\u02b4"+
		"\u028b\3\2\2\2\u02b4\u028c\3\2\2\2\u02b4\u028f\3\2\2\2\u02b4\u0292\3\2"+
		"\2\2\u02b4\u0296\3\2\2\2\u02b4\u0297\3\2\2\2\u02b4\u029a\3\2\2\2\u02b4"+
		"\u029d\3\2\2\2\u02b4\u02a1\3\2\2\2\u02b4\u02a2\3\2\2\2\u02b4\u02a4\3\2"+
		"\2\2\u02b4\u02a6\3\2\2\2\u02b4\u02a9\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b4"+
		"\u02ad\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b5[\3\2\2\2\u02b6\u02b7\5^\60\2"+
		"\u02b7\u02b8\7\30\2\2\u02b8\u02b9\5`\61\2\u02b9]\3\2\2\2\u02ba\u02bd\5"+
		"\u00b4[\2\u02bb\u02bd\7\'\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2"+
		"\u02bd_\3\2\2\2\u02be\u02bf\5b\62\2\u02bfa\3\2\2\2\u02c0\u02cc\5.\30\2"+
		"\u02c1\u02c2\5.\30\2\u02c2\u02c3\t\3\2\2\u02c3\u02cc\3\2\2\2\u02c4\u02c5"+
		"\5.\30\2\u02c5\u02c6\7)\2\2\u02c6\u02cc\3\2\2\2\u02c7\u02c8\5.\30\2\u02c8"+
		"\u02c9\7)\2\2\u02c9\u02ca\t\3\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c0\3\2"+
		"\2\2\u02cb\u02c1\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cc"+
		"c\3\2\2\2\u02cd\u02d2\5f\64\2\u02ce\u02cf\5f\64\2\u02cf\u02d0\5d\63\2"+
		"\u02d0\u02d2\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d2e\3"+
		"\2\2\2\u02d3\u02d4\7\b\2\2\u02d4\u02d5\5h\65\2\u02d5\u02d6\5~@\2\u02d6"+
		"g\3\2\2\2\u02d7\u02db\5j\66\2\u02d8\u02db\5l\67\2\u02d9\u02db\5n8\2\u02da"+
		"\u02d7\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02dbi\3\2\2\2"+
		"\u02dc\u02dd\7!\2\2\u02dd\u02e0\7\"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dc"+
		"\3\2\2\2\u02df\u02de\3\2\2\2\u02e0k\3\2\2\2\u02e1\u02e2\7!\2\2\u02e2\u02e3"+
		"\5t;\2\u02e3\u02e4\5p9\2\u02e4\u02e5\5v<\2\u02e5\u02e6\5r:\2\u02e6\u02e7"+
		"\5x=\2\u02e7\u02e8\7\"\2\2\u02e8\u02f0\3\2\2\2\u02e9\u02ea\5t;\2\u02ea"+
		"\u02eb\5p9\2\u02eb\u02ec\5v<\2\u02ec\u02ed\5r:\2\u02ed\u02ee\5x=\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02e1\3\2\2\2\u02ef\u02e9\3\2\2\2\u02f0m\3\2\2\2"+
		"\u02f1\u02f2\5v<\2\u02f2o\3\2\2\2\u02f3\u02f4\7\27\2\2\u02f4q\3\2\2\2"+
		"\u02f5\u02f6\7\27\2\2\u02f6s\3\2\2\2\u02f7\u02fc\5\24\13\2\u02f8\u02f9"+
		"\7\4\2\2\u02f9\u02fc\5\24\13\2\u02fa\u02fc\3\2\2\2\u02fb\u02f7\3\2\2\2"+
		"\u02fb\u02f8\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fcu\3\2\2\2\u02fd\u0300\5"+
		"P)\2\u02fe\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300"+
		"w\3\2\2\2\u0301\u0304\5z>\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0302\3\2\2\2\u0304y\3\2\2\2\u0305\u030b\5$\23\2\u0306\u0307\5$\23\2"+
		"\u0307\u0308\7\34\2\2\u0308\u0309\5z>\2\u0309\u030b\3\2\2\2\u030a\u0305"+
		"\3\2\2\2\u030a\u0306\3\2\2\2\u030b{\3\2\2\2\u030c\u0311\5\6\4\2\u030d"+
		"\u030e\5\6\4\2\u030e\u030f\5|?\2\u030f\u0311\3\2\2\2\u0310\u030c\3\2\2"+
		"\2\u0310\u030d\3\2\2\2\u0311}\3\2\2\2\u0312\u0313\7\37\2\2\u0313\u031d"+
		"\7 \2\2\u0314\u0315\7\37\2\2\u0315\u0316\5|?\2\u0316\u0317\7 \2\2\u0317"+
		"\u031d\3\2\2\2\u0318\u031d\5> \2\u0319\u031d\5,\27\2\u031a\u031d\5d\63"+
		"\2\u031b\u031d\5\u0080A\2\u031c\u0312\3\2\2\2\u031c\u0314\3\2\2\2\u031c"+
		"\u0318\3\2\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2"+
		"\2\2\u031d\177\3\2\2\2\u031e\u031f\7\t\2\2\u031f\u0320\5\u0082B\2\u0320"+
		"\u0321\7\27\2\2\u0321\u0081\3\2\2\2\u0322\u0325\5\u00bc_\2\u0323\u0325"+
		"\5$\23\2\u0324\u0322\3\2\2\2\u0324\u0323\3\2\2\2\u0325\u0083\3\2\2\2\u0326"+
		"\u0327\5\u0086D\2\u0327\u0328\7\37\2\2\u0328\u0329\7 \2\2\u0329\u0345"+
		"\3\2\2\2\u032a\u032b\5\u0086D\2\u032b\u032c\7\37\2\2\u032c\u032d\5\u0094"+
		"K\2\u032d\u032e\7 \2\2\u032e\u0345\3\2\2\2\u032f\u0330\5\u008cG\2\u0330"+
		"\u0331\7\37\2\2\u0331\u0332\7 \2\2\u0332\u0345\3\2\2\2\u0333\u0334\5\u008c"+
		"G\2\u0334\u0335\7\37\2\2\u0335\u0336\5\u0094K\2\u0336\u0337\7 \2\2\u0337"+
		"\u0345\3\2\2\2\u0338\u0339\5\u0090I\2\u0339\u033a\7\37\2\2\u033a\u033b"+
		"\7 \2\2\u033b\u0345\3\2\2\2\u033c\u033d\5\u0090I\2\u033d\u033e\7\37\2"+
		"\2\u033e\u033f\5\u0094K\2\u033f\u0340\7 \2\2\u0340\u0345\3\2\2\2\u0341"+
		"\u0342\5\u0092J\2\u0342\u0343\7\27\2\2\u0343\u0345\3\2\2\2\u0344\u0326"+
		"\3\2\2\2\u0344\u032a\3\2\2\2\u0344\u032f\3\2\2\2\u0344\u0333\3\2\2\2\u0344"+
		"\u0338\3\2\2\2\u0344\u033c\3\2\2\2\u0344\u0341\3\2\2\2\u0345\u0085\3\2"+
		"\2\2\u0346\u0347\5\u0088E\2\u0347\u0087\3\2\2\2\u0348\u0349\7\n\2\2\u0349"+
		"\u034a\7\'\2\2\u034a\u034b\7!\2\2\u034b\u0366\7\"\2\2\u034c\u034d\7\n"+
		"\2\2\u034d\u034e\7\'\2\2\u034e\u034f\7!\2\2\u034f\u0350\7\"\2\2\u0350"+
		"\u0353\7\26\2\2\u0351\u0354\5\u008aF\2\u0352\u0354\7)\2\2\u0353\u0351"+
		"\3\2\2\2\u0353\u0352\3\2\2\2\u0354\u0366\3\2\2\2\u0355\u0356\7\n\2\2\u0356"+
		"\u0357\7\'\2\2\u0357\u0358\7!\2\2\u0358\u0359\5\u0098M\2\u0359\u035a\7"+
		"\"\2\2\u035a\u0366\3\2\2\2\u035b\u035c\7\n\2\2\u035c\u035d\7\'\2\2\u035d"+
		"\u035e\7!\2\2\u035e\u035f\5\u0098M\2\u035f\u0360\7\"\2\2\u0360\u0363\7"+
		"\26\2\2\u0361\u0364\5\u008aF\2\u0362\u0364\7)\2\2\u0363\u0361\3\2\2\2"+
		"\u0363\u0362\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0348\3\2\2\2\u0365\u034c"+
		"\3\2\2\2\u0365\u0355\3\2\2\2\u0365\u035b\3\2\2\2\u0366\u0089\3\2\2\2\u0367"+
		"\u0368\7\'\2\2\u0368\u008b\3\2\2\2\u0369\u036a\5\u008eH\2\u036a\u036b"+
		"\5\u0088E\2\u036b\u0381\3\2\2\2\u036c\u036d\7\16\2\2\u036d\u0381\5\u0088"+
		"E\2\u036e\u036f\5\u008eH\2\u036f\u0370\7\16\2\2\u0370\u0371\5\u0088E\2"+
		"\u0371\u0381\3\2\2\2\u0372\u0373\7\17\2\2\u0373\u0374\5\u008eH\2\u0374"+
		"\u0375\7\16\2\2\u0375\u0376\5\u0088E\2\u0376\u0381\3\2\2\2\u0377\u0378"+
		"\7\17\2\2\u0378\u0379\5\u008eH\2\u0379\u037a\5\u0088E\2\u037a\u0381\3"+
		"\2\2\2\u037b\u037c\7\17\2\2\u037c\u0381\5\u0088E\2\u037d\u037e\7\17\2"+
		"\2\u037e\u037f\7\16\2\2\u037f\u0381\5\u0088E\2\u0380\u0369\3\2\2\2\u0380"+
		"\u036c\3\2\2\2\u0380\u036e\3\2\2\2\u0380\u0372\3\2\2\2\u0380\u0377\3\2"+
		"\2\2\u0380\u037b\3\2\2\2\u0380\u037d\3\2\2\2\u0381\u008d\3\2\2\2\u0382"+
		"\u0383\t\4\2\2\u0383\u008f\3\2\2\2\u0384\u0385\7\'\2\2\u0385\u0386\7!"+
		"\2\2\u0386\u038d\7\"\2\2\u0387\u0388\7\'\2\2\u0388\u0389\7!\2\2\u0389"+
		"\u038a\5\u0098M\2\u038a\u038b\7\"\2\2\u038b\u038d\3\2\2\2\u038c\u0384"+
		"\3\2\2\2\u038c\u0387\3\2\2\2\u038d\u0091\3\2\2\2\u038e\u0391\5\u0086D"+
		"\2\u038f\u0391\5\u008cG\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391"+
		"\u0093\3\2\2\2\u0392\u0393\5\u0096L\2\u0393\u0095\3\2\2\2\u0394\u0399"+
		"\5\6\4\2\u0395\u0396\5\6\4\2\u0396\u0397\5\u0096L\2\u0397\u0399\3\2\2"+
		"\2\u0398\u0394\3\2\2\2\u0398\u0395\3\2\2\2\u0399\u0097\3\2\2\2\u039a\u039b"+
		"\5\u009aN\2\u039b\u0099\3\2\2\2\u039c\u03a2\5\u009cO\2\u039d\u039e\5\u009c"+
		"O\2\u039e\u039f\7\34\2\2\u039f\u03a0\5\u009aN\2\u03a0\u03a2\3\2\2\2\u03a1"+
		"\u039c\3\2\2\2\u03a1\u039d\3\2\2\2\u03a2\u009b\3\2\2\2\u03a3\u03a4\7\'"+
		"\2\2\u03a4\u03a5\7)\2\2\u03a5\u009d\3\2\2\2\u03a6\u03aa\5\u00a0Q\2\u03a7"+
		"\u03aa\5\u00a6T\2\u03a8\u03aa\5\u00acW\2\u03a9\u03a6\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u009f\3\2\2\2\u03ab\u03ac\5\u00a2R"+
		"\2\u03ac\u00a1\3\2\2\2\u03ad\u03ae\7\20\2\2\u03ae\u03af\7\'\2\2\u03af"+
		"\u03b0\7\37\2\2\u03b0\u03c7\7 \2\2\u03b1\u03b2\7\20\2\2\u03b2\u03b3\7"+
		"\'\2\2\u03b3\u03b4\7\37\2\2\u03b4\u03b5\5\u00a4S\2\u03b5\u03b6\7 \2\2"+
		"\u03b6\u03c7\3\2\2\2\u03b7\u03b8\7\20\2\2\u03b8\u03b9\7\'\2\2\u03b9\u03ba"+
		"\7\22\2\2\u03ba\u03bb\5\66\34\2\u03bb\u03bc\7\37\2\2\u03bc\u03bd\7 \2"+
		"\2\u03bd\u03c7\3\2\2\2\u03be\u03bf\7\20\2\2\u03bf\u03c0\7\'\2\2\u03c0"+
		"\u03c1\7\22\2\2\u03c1\u03c2\5\66\34\2\u03c2\u03c3\7\37\2\2\u03c3\u03c4"+
		"\5\u00a4S\2\u03c4\u03c5\7 \2\2\u03c5\u03c7\3\2\2\2\u03c6\u03ad\3\2\2\2"+
		"\u03c6\u03b1\3\2\2\2\u03c6\u03b7\3\2\2\2\u03c6\u03be\3\2\2\2\u03c7\u00a3"+
		"\3\2\2\2\u03c8\u03c9\5\u0096L\2\u03c9\u00a5\3\2\2\2\u03ca\u03cb\5\u00a8"+
		"U\2\u03cb\u00a7\3\2\2\2\u03cc\u03cd\7\21\2\2\u03cd\u03ce\7\'\2\2\u03ce"+
		"\u03cf\7\37\2\2\u03cf\u03e6\7 \2\2\u03d0\u03d1\7\21\2\2\u03d1\u03d2\7"+
		"\'\2\2\u03d2\u03d3\7\37\2\2\u03d3\u03d4\5\u00aaV\2\u03d4\u03d5\7 \2\2"+
		"\u03d5\u03e6\3\2\2\2\u03d6\u03d7\7\21\2\2\u03d7\u03d8\7\'\2\2\u03d8\u03d9"+
		"\7\22\2\2\u03d9\u03da\5\66\34\2\u03da\u03db\7\37\2\2\u03db\u03dc\7 \2"+
		"\2\u03dc\u03e6\3\2\2\2\u03dd\u03de\7\21\2\2\u03de\u03df\7\'\2\2\u03df"+
		"\u03e0\7\22\2\2\u03e0\u03e1\5\66\34\2\u03e1\u03e2\7\37\2\2\u03e2\u03e3"+
		"\5\u00aaV\2\u03e3\u03e4\7 \2\2\u03e4\u03e6\3\2\2\2\u03e5\u03cc\3\2\2\2"+
		"\u03e5\u03d0\3\2\2\2\u03e5\u03d6\3\2\2\2\u03e5\u03dd\3\2\2\2\u03e6\u00a9"+
		"\3\2\2\2\u03e7\u03e8\5\u0096L\2\u03e8\u00ab\3\2\2\2\u03e9\u03ea\5\u00b0"+
		"Y\2\u03ea\u03eb\7\37\2\2\u03eb\u03ec\7 \2\2\u03ec\u03f3\3\2\2\2\u03ed"+
		"\u03ee\5\u00b0Y\2\u03ee\u03ef\7\37\2\2\u03ef\u03f0\5\u00aeX\2\u03f0\u03f1"+
		"\7 \2\2\u03f1\u03f3\3\2\2\2\u03f2\u03e9\3\2\2\2\u03f2\u03ed\3\2\2\2\u03f3"+
		"\u00ad\3\2\2\2\u03f4\u03f5\5\u0096L\2\u03f5\u00af\3\2\2\2\u03f6\u03f7"+
		"\7\23\2\2\u03f7\u041d\7\'\2\2\u03f8\u03f9\7\23\2\2\u03f9\u03fa\7\'\2\2"+
		"\u03fa\u03fb\7\22\2\2\u03fb\u041d\5\66\34\2\u03fc\u03fd\7\23\2\2\u03fd"+
		"\u03fe\7\'\2\2\u03fe\u03ff\7\24\2\2\u03ff\u041d\5\66\34\2\u0400\u0401"+
		"\7\23\2\2\u0401\u0402\7\'\2\2\u0402\u0403\7\22\2\2\u0403\u0404\5\66\34"+
		"\2\u0404\u0405\7\24\2\2\u0405\u0406\5\u00b2Z\2\u0406\u041d\3\2\2\2\u0407"+
		"\u0408\7\17\2\2\u0408\u0409\7\23\2\2\u0409\u041d\7\'\2\2\u040a\u040b\7"+
		"\17\2\2\u040b\u040c\7\23\2\2\u040c\u040d\7\'\2\2\u040d\u040e\7\22\2\2"+
		"\u040e\u041d\5\66\34\2\u040f\u0410\7\17\2\2\u0410\u0411\7\23\2\2\u0411"+
		"\u0412\7\'\2\2\u0412\u0413\7\24\2\2\u0413\u041d\5\66\34\2\u0414\u0415"+
		"\7\17\2\2\u0415\u0416\7\23\2\2\u0416\u0417\7\'\2\2\u0417\u0418\7\22\2"+
		"\2\u0418\u0419\5\66\34\2\u0419\u041a\7\24\2\2\u041a\u041b\5\u00b2Z\2\u041b"+
		"\u041d\3\2\2\2\u041c\u03f6\3\2\2\2\u041c\u03f8\3\2\2\2\u041c\u03fc\3\2"+
		"\2\2\u041c\u0400\3\2\2\2\u041c\u0407\3\2\2\2\u041c\u040a\3\2\2\2\u041c"+
		"\u040f\3\2\2\2\u041c\u0414\3\2\2\2\u041d\u00b1\3\2\2\2\u041e\u041f\7\'"+
		"\2\2\u041f\u00b3\3\2\2\2\u0420\u0425\5\u00b6\\\2\u0421\u0422\5\u00b6\\"+
		"\2\u0422\u0423\5\u00b4[\2\u0423\u0425\3\2\2\2\u0424\u0420\3\2\2\2\u0424"+
		"\u0421\3\2\2\2\u0425\u00b5\3\2\2\2\u0426\u0449\7\'\2\2\u0427\u0428\7\'"+
		"\2\2\u0428\u0449\7\31\2\2\u0429\u042a\7\'\2\2\u042a\u0449\5\u00b8]\2\u042b"+
		"\u042c\7\'\2\2\u042c\u042d\5\u00b8]\2\u042d\u042e\7\31\2\2\u042e\u0449"+
		"\3\2\2\2\u042f\u0430\5(\25\2\u0430\u0431\7\'\2\2\u0431\u0449\3\2\2\2\u0432"+
		"\u0433\7\'\2\2\u0433\u0449\7\31\2\2\u0434\u0435\5(\25\2\u0435\u0436\7"+
		"\'\2\2\u0436\u0437\5\u00b8]\2\u0437\u0449\3\2\2\2\u0438\u0439\7\'\2\2"+
		"\u0439\u043a\5\u00b8]\2\u043a\u043b\7\31\2\2\u043b\u0449\3\2\2\2\u043c"+
		"\u043d\7\'\2\2\u043d\u0449\5*\26\2\u043e\u043f\7\'\2\2\u043f\u0449\7\31"+
		"\2\2\u0440\u0441\7\'\2\2\u0441\u0442\5\u00b8]\2\u0442\u0443\5*\26\2\u0443"+
		"\u0449\3\2\2\2\u0444\u0445\7\'\2\2\u0445\u0446\5\u00b8]\2\u0446\u0447"+
		"\7\31\2\2\u0447\u0449\3\2\2\2\u0448\u0426\3\2\2\2\u0448\u0427\3\2\2\2"+
		"\u0448\u0429\3\2\2\2\u0448\u042b\3\2\2\2\u0448\u042f\3\2\2\2\u0448\u0432"+
		"\3\2\2\2\u0448\u0434\3\2\2\2\u0448\u0438\3\2\2\2\u0448\u043c\3\2\2\2\u0448"+
		"\u043e\3\2\2\2\u0448\u0440\3\2\2\2\u0448\u0444\3\2\2\2\u0449\u00b7\3\2"+
		"\2\2\u044a\u044b\7\35\2\2\u044b\u044c\5\u00ba^\2\u044c\u044d\7\36\2\2"+
		"\u044d\u0454\3\2\2\2\u044e\u044f\7\35\2\2\u044f\u0450\5\u00ba^\2\u0450"+
		"\u0451\7\36\2\2\u0451\u0452\5\u00b8]\2\u0452\u0454\3\2\2\2\u0453\u044a"+
		"\3\2\2\2\u0453\u044e\3\2\2\2\u0454\u00b9\3\2\2\2\u0455\u0456\5$\23\2\u0456"+
		"\u00bb\3\2\2\2\u0457\u046f\7\'\2\2\u0458\u0459\7\'\2\2\u0459\u046f\7)"+
		"\2\2\u045a\u046f\7+\2\2\u045b\u045c\7+\2\2\u045c\u046f\7)\2\2\u045d\u046f"+
		"\7,\2\2\u045e\u045f\7,\2\2\u045f\u046f\7)\2\2\u0460\u046f\7*\2\2\u0461"+
		"\u046f\5\32\16\2\u0462\u046f\5\36\20\2\u0463\u046f\5$\23\2\u0464\u046f"+
		"\5.\30\2\u0465\u0466\5\u00be`\2\u0466\u0467\7\31\2\2\u0467\u0468\5\u00c0"+
		"a\2\u0468\u046f\3\2\2\2\u0469\u046a\5\u00be`\2\u046a\u046b\7\33\2\2\u046b"+
		"\u046c\5\u00c0a\2\u046c\u046f\3\2\2\2\u046d\u046f\5\u00b4[\2\u046e\u0457"+
		"\3\2\2\2\u046e\u0458\3\2\2\2\u046e\u045a\3\2\2\2\u046e\u045b\3\2\2\2\u046e"+
		"\u045d\3\2\2\2\u046e\u045e\3\2\2\2\u046e\u0460\3\2\2\2\u046e\u0461\3\2"+
		"\2\2\u046e\u0462\3\2\2\2\u046e\u0463\3\2\2\2\u046e\u0464\3\2\2\2\u046e"+
		"\u0465\3\2\2\2\u046e\u0469\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u00bd\3\2"+
		"\2\2\u0470\u0471\7\'\2\2\u0471\u00bf\3\2\2\2\u0472\u0473\7\'\2\2\u0473"+
		"\u00c1\3\2\2\2<\u00ca\u00d5\u00e2\u0117\u011e\u012f\u013d\u0145\u014c"+
		"\u0154\u015f\u0169\u01c3\u01d9\u01e4\u01f3\u01ff\u0205\u0212\u021c\u0231"+
		"\u0237\u0241\u0246\u024b\u0255\u02b4\u02bc\u02cb\u02d1\u02da\u02df\u02ef"+
		"\u02fb\u02ff\u0303\u030a\u0310\u031c\u0324\u0344\u0353\u0363\u0365\u0380"+
		"\u038c\u0390\u0398\u03a1\u03a9\u03c6\u03e5\u03f2\u041c\u0424\u0448\u0453"+
		"\u046e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}