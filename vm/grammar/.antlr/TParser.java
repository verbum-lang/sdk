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
		RULE_loop = 46, RULE_loopExpression = 47, RULE_loopOneMembers = 48, RULE_loopTwoMembers = 49, 
		RULE_loopThreeMembers = 50, RULE_loopThreeMembersValues = 51, RULE_loopBlockElements = 52, 
		RULE_loopBlockElementsLimited = 53, RULE_ret = 54, RULE_retValues = 55, 
		RULE_functions = 56, RULE_functionGeneralModes = 57, RULE_functionsModes = 58, 
		RULE_functionMethodsModes = 59, RULE_methodPerm = 60, RULE_constructClassMethod = 61, 
		RULE_interfaceMethod = 62, RULE_functionCodeBlock = 63, RULE_functionParams = 64, 
		RULE_functionParamElements = 65, RULE_oopGeneral = 66, RULE_interfaceClass = 67, 
		RULE_interfaceClassDefinition = 68, RULE_abstractClass = 69, RULE_abstractClassDefinition = 70, 
		RULE_classDefination = 71, RULE_classModesGeneral = 72, RULE_classModes = 73, 
		RULE_arrayAccessElements = 74, RULE_arrayAccessElementsItems = 75, RULE_accessBlockAr = 76, 
		RULE_arrayIndexAccess = 77, RULE_generalValue = 78, RULE_objIdentifierA = 79, 
		RULE_objIdentifierB = 80;
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
			"loopExpression", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
			"loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
			"ret", "retValues", "functions", "functionGeneralModes", "functionsModes", 
			"functionMethodsModes", "methodPerm", "constructClassMethod", "interfaceMethod", 
			"functionCodeBlock", "functionParams", "functionParamElements", "oopGeneral", 
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
			setState(162);
			fileContent(0);
			setState(163);
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
		public FileContentContext fileContent() {
			return getRuleContext(FileContentContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileContent; }
	}

	public final FileContentContext fileContent() throws RecognitionException {
		return fileContent(0);
	}

	private FileContentContext fileContent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FileContentContext _localctx = new FileContentContext(_ctx, _parentState);
		FileContentContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_fileContent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FileContentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fileContent);
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					sentence();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
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
			setState(184);
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
			setState(186);
			match(Use);
			setState(187);
			useValue();
			setState(188);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				useString();
				setState(192);
				match(Separator);
				setState(193);
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
			setState(197);
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
			setState(199);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(Var);
				setState(202);
				variableMembers();
				setState(203);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				methodPerm();
				setState(206);
				match(Var);
				setState(207);
				variableMembers();
				setState(208);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(Static);
				setState(211);
				match(Var);
				setState(212);
				variableMembers();
				setState(213);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				methodPerm();
				setState(216);
				match(Static);
				setState(217);
				match(Var);
				setState(218);
				variableMembers();
				setState(219);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(Final);
				setState(222);
				methodPerm();
				setState(223);
				match(Static);
				setState(224);
				match(Var);
				setState(225);
				variableMembers();
				setState(226);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(Final);
				setState(229);
				methodPerm();
				setState(230);
				match(Var);
				setState(231);
				variableMembers();
				setState(232);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				match(Final);
				setState(235);
				match(Var);
				setState(236);
				variableMembers();
				setState(237);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(Final);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				variableMembers();
				setState(246);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				variableDefinition();
				setState(252);
				match(Separator);
				setState(253);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(Identifier);
				setState(258);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				objIdentifierA();
				setState(260);
				match(Point);
				setState(261);
				objIdentifierB();
				setState(262);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				objIdentifierA();
				setState(265);
				match(TwoTwoPoint);
				setState(266);
				objIdentifierB();
				setState(267);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				arrayAccessElements();
				setState(270);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(TypeSpec);
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				match(New);
				setState(281);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(TypeSpec);
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				match(New);
				setState(285);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(OpenArIndex);
				setState(289);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(OpenArIndex);
				setState(291);
				indexArrayElements();
				setState(292);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				generalValue();
				setState(298);
				match(Separator);
				setState(299);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(OpenBlock);
				setState(304);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(OpenBlock);
				setState(306);
				associativeArrayElements();
				setState(307);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(Identifier);
				setState(312);
				match(TwoPoint);
				setState(313);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(Identifier);
				setState(315);
				match(TwoPoint);
				setState(316);
				generalValue();
				setState(317);
				match(Separator);
				setState(318);
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
			setState(322);
			match(OpenOp);
			setState(323);
			operationElements();
			setState(324);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				operationValue();
				setState(328);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				functionCall();
				setState(334);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				functionCall();
				setState(337);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				functionCall();
				setState(340);
				match(TypeSpec);
				setState(341);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(Identifier);
				setState(345);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(Identifier);
				setState(347);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(348);
				match(Identifier);
				setState(349);
				match(TypeSpec);
				setState(350);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(351);
				firstIncDec();
				setState(352);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				firstIncDec();
				setState(355);
				match(Identifier);
				setState(356);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(358);
				firstIncDec();
				setState(359);
				match(Identifier);
				setState(360);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(362);
				firstIncDec();
				setState(363);
				match(Identifier);
				setState(364);
				match(TypeSpec);
				setState(365);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(367);
				match(Identifier);
				setState(368);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(369);
				match(Identifier);
				setState(370);
				lastIncDec();
				setState(371);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(373);
				match(Identifier);
				setState(374);
				lastIncDec();
				setState(375);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(377);
				match(Identifier);
				setState(378);
				lastIncDec();
				setState(379);
				match(TypeSpec);
				setState(380);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(382);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(383);
				match(Integer);
				setState(384);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(385);
				match(Integer);
				setState(386);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(387);
				match(Integer);
				setState(388);
				match(TypeSpec);
				setState(389);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(390);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(391);
				match(Float);
				setState(392);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(393);
				match(Float);
				setState(394);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(395);
				match(Float);
				setState(396);
				match(TypeSpec);
				setState(397);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(398);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(399);
				operationBlock();
				setState(400);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(402);
				operationBlock();
				setState(403);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(405);
				operationBlock();
				setState(406);
				match(TypeSpec);
				setState(407);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(409);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(410);
				arrayAccessElements();
				setState(411);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(413);
				arrayAccessElements();
				setState(414);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(416);
				arrayAccessElements();
				setState(417);
				match(TypeSpec);
				setState(418);
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
			setState(422);
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
			setState(424);
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
			setState(426);
			functionCall();
			setState(427);
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
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(Identifier);
				setState(430);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(Identifier);
				setState(432);
				match(Point);
				setState(433);
				identifierB();
				setState(434);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(Identifier);
				setState(437);
				match(TwoTwoPoint);
				setState(438);
				identifierB();
				setState(439);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				match(Identifier);
				setState(442);
				match(Point);
				setState(443);
				identifierB();
				setState(444);
				functionCallParam();
				setState(445);
				pointSeparator();
				setState(446);
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
			setState(450);
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
			setState(452);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(OpenOp);
				setState(455);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(OpenOp);
				setState(457);
				functionCallParamElements();
				setState(458);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				generalValue();
				setState(464);
				match(Separator);
				setState(465);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				operationElements();
				setState(469);
				match(Separator);
				setState(470);
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
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				conditionalExpressionStructBlock();
				setState(476);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				ifElementUnique();
				setState(482);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				ifElementUnique();
				setState(485);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				ifElementUnique();
				setState(488);
				elifElements();
				setState(489);
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
			setState(493);
			match(If);
			setState(494);
			conditionalExpressionItems();
			setState(495);
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
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				elifElementUnique();
				setState(499);
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
			setState(503);
			match(Elif);
			setState(504);
			conditionalExpressionItems();
			setState(505);
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
			setState(507);
			match(Else);
			setState(508);
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
			setState(510);
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
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(OpenBlock);
				setState(513);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(OpenBlock);
				setState(515);
				conditionalBlockElsItems();
				setState(516);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
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
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				sentence();
				setState(526);
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
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				conditionExpValue();
				setState(532);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				conditionExpBlock();
				setState(536);
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
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(Not);
				setState(541);
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
				setState(542);
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
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(Not);
				setState(547);
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
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				conditionExpBlockItem();
				setState(552);
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
				setState(554);
				conditionExpBlockItem();
				setState(555);
				match(TypeSpec);
				setState(556);
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
			setState(560);
			match(OpenOp);
			setState(561);
			conditionalExpressionElements();
			setState(562);
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
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				firstIncDec();
				setState(565);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				firstIncDec();
				setState(568);
				match(Identifier);
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
				firstIncDec();
				setState(572);
				match(Identifier);
				setState(573);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				firstIncDec();
				setState(576);
				match(Identifier);
				setState(577);
				match(TypeSpec);
				setState(578);
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
				setState(580);
				match(Identifier);
				setState(581);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(Identifier);
				setState(583);
				lastIncDec();
				setState(584);
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
				setState(586);
				match(Identifier);
				setState(587);
				lastIncDec();
				setState(588);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(590);
				match(Identifier);
				setState(591);
				lastIncDec();
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(595);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(596);
				match(Integer);
				setState(597);
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
				setState(598);
				match(Integer);
				setState(599);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(600);
				match(Integer);
				setState(601);
				match(TypeSpec);
				setState(602);
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
				setState(603);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(604);
				match(Float);
				setState(605);
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
				setState(606);
				match(Float);
				setState(607);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(608);
				match(Float);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(611);
				functionCallAndAttr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(612);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(613);
				functionCall();
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
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(616);
				functionCall();
				setState(617);
				match(TypeSpec);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(619);
				functionCall();
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
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(623);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(624);
				operationBlock();
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
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(627);
				operationBlock();
				setState(628);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(630);
				operationBlock();
				setState(631);
				match(TypeSpec);
				setState(632);
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
				setState(634);
				match(Identifier);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(635);
				match(Identifier);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(637);
				match(Identifier);
				setState(638);
				match(TypeSpec);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(639);
				match(Identifier);
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
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(642);
				arrayAccessElements();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(643);
				arrayAccessElements();
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(646);
				arrayAccessElements();
				setState(647);
				match(TypeSpec);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(649);
				arrayAccessElements();
				setState(650);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(655);
			identifierAttrFn();
			setState(656);
			match(Attr);
			setState(657);
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
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
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
			setState(663);
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
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				functionCall();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				functionCall();
				setState(670);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				functionCall();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
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
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(For);
				setState(679);
				loopExpression();
				setState(680);
				match(OpenBlock);
				setState(681);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(For);
				setState(684);
				loopExpression();
				setState(685);
				match(OpenBlock);
				setState(686);
				loopBlockElements();
				setState(687);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				match(For);
				setState(690);
				loopExpression();
				setState(691);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(For);
				setState(694);
				loopExpression();
				setState(695);
				loopBlockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public LoopOneMembersContext loopOneMembers() {
			return getRuleContext(LoopOneMembersContext.class,0);
		}
		public List<TerminalNode> End() { return getTokens(TParser.End); }
		public TerminalNode End(int i) {
			return getToken(TParser.End, i);
		}
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public LoopThreeMembersContext loopThreeMembers() {
			return getRuleContext(LoopThreeMembersContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_loopExpression);
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(OpenOp);
				setState(700);
				loopOneMembers();
				setState(701);
				match(End);
				setState(702);
				loopTwoMembers();
				setState(703);
				match(End);
				setState(704);
				loopThreeMembers();
				setState(705);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				loopOneMembers();
				setState(708);
				match(End);
				setState(709);
				loopTwoMembers();
				setState(710);
				match(End);
				setState(711);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				match(OpenOp);
				setState(715);
				match(CloseOp);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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

	public static class LoopOneMembersContext extends ParserRuleContext {
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public LoopOneMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOneMembers; }
	}

	public final LoopOneMembersContext loopOneMembers() throws RecognitionException {
		LoopOneMembersContext _localctx = new LoopOneMembersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_loopOneMembers);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				variableMembers();
				}
				break;
			case End:
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
		enterRule(_localctx, 98, RULE_loopTwoMembers);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
			case Not:
			case IncDecOperators:
			case Identifier:
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				conditionalExpressionElements();
				}
				break;
			case End:
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
		enterRule(_localctx, 100, RULE_loopThreeMembers);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
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
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
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
		enterRule(_localctx, 102, RULE_loopThreeMembersValues);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				operationElements();
				setState(734);
				match(Separator);
				setState(735);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				operationBlock();
				setState(738);
				match(Separator);
				setState(739);
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
		enterRule(_localctx, 104, RULE_loopBlockElements);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				sentence();
				setState(745);
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
		enterRule(_localctx, 106, RULE_loopBlockElementsLimited);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				loop();
				setState(751);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
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
		enterRule(_localctx, 108, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(Ret);
			setState(758);
			retValues();
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

	public static class RetValuesContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public RetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retValues; }
	}

	public final RetValuesContext retValues() throws RecognitionException {
		RetValuesContext _localctx = new RetValuesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_retValues);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				operationBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_functions);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				functionsModes();
				setState(767);
				match(OpenBlock);
				setState(768);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				functionsModes();
				setState(771);
				match(OpenBlock);
				setState(772);
				functionCodeBlock();
				setState(773);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				functionMethodsModes();
				setState(776);
				match(OpenBlock);
				setState(777);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				functionMethodsModes();
				setState(780);
				match(OpenBlock);
				setState(781);
				functionCodeBlock();
				setState(782);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				constructClassMethod();
				setState(785);
				match(OpenBlock);
				setState(786);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				constructClassMethod();
				setState(789);
				match(OpenBlock);
				setState(790);
				functionCodeBlock();
				setState(791);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(793);
				interfaceMethod();
				setState(794);
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

	public static class FunctionGeneralModesContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TParser.Identifier, i);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
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
		enterRule(_localctx, 114, RULE_functionGeneralModes);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(Function);
				setState(799);
				match(Identifier);
				setState(800);
				match(OpenOp);
				setState(801);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(Function);
				setState(803);
				match(Identifier);
				setState(804);
				match(OpenOp);
				setState(805);
				match(CloseOp);
				setState(806);
				match(ArrowRight);
				setState(807);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(Function);
				setState(809);
				match(Identifier);
				setState(810);
				match(OpenOp);
				setState(811);
				functionParams();
				setState(812);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				match(Function);
				setState(815);
				match(Identifier);
				setState(816);
				match(OpenOp);
				setState(817);
				functionParams();
				setState(818);
				match(CloseOp);
				setState(819);
				match(ArrowRight);
				setState(820);
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
		enterRule(_localctx, 116, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
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
		enterRule(_localctx, 118, RULE_functionMethodsModes);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				methodPerm();
				setState(827);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(Static);
				setState(830);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				methodPerm();
				setState(832);
				match(Static);
				setState(833);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				match(Final);
				setState(836);
				methodPerm();
				setState(837);
				match(Static);
				setState(838);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(840);
				match(Final);
				setState(841);
				methodPerm();
				setState(842);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				match(Final);
				setState(845);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(846);
				match(Final);
				setState(847);
				match(Static);
				setState(848);
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
		enterRule(_localctx, 120, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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
		enterRule(_localctx, 122, RULE_constructClassMethod);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(Identifier);
				setState(854);
				match(OpenOp);
				setState(855);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				match(Identifier);
				setState(857);
				match(OpenOp);
				setState(858);
				functionParams();
				setState(859);
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
		enterRule(_localctx, 124, RULE_interfaceMethod);
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
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
				setState(864);
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
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionCodeBlock);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				sentence();
				setState(869);
				functionCodeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public FunctionParamElementsContext functionParamElements() {
			return getRuleContext(FunctionParamElementsContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionParams);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				functionParamElements();
				setState(875);
				match(Separator);
				setState(876);
				functionParams();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(Identifier);
			setState(881);
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
		enterRule(_localctx, 132, RULE_oopGeneral);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
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
		enterRule(_localctx, 134, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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
		enterRule(_localctx, 136, RULE_interfaceClassDefinition);
		try {
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(Interface);
				setState(891);
				match(Identifier);
				setState(892);
				match(OpenBlock);
				setState(893);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(Interface);
				setState(895);
				match(Identifier);
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
				match(Interface);
				setState(901);
				match(Identifier);
				setState(902);
				match(Extends);
				setState(903);
				match(Identifier);
				setState(904);
				match(OpenBlock);
				setState(905);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(906);
				match(Interface);
				setState(907);
				match(Identifier);
				setState(908);
				match(Extends);
				setState(909);
				match(Identifier);
				setState(910);
				match(OpenBlock);
				setState(911);
				functionCodeBlock();
				setState(912);
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
		enterRule(_localctx, 138, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
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
		enterRule(_localctx, 140, RULE_abstractClassDefinition);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(Abstract);
				setState(919);
				match(Identifier);
				setState(920);
				match(OpenBlock);
				setState(921);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(Abstract);
				setState(923);
				match(Identifier);
				setState(924);
				match(OpenBlock);
				setState(925);
				functionCodeBlock();
				setState(926);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				match(Abstract);
				setState(929);
				match(Identifier);
				setState(930);
				match(Extends);
				setState(931);
				match(Identifier);
				setState(932);
				match(OpenBlock);
				setState(933);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				match(Abstract);
				setState(935);
				match(Identifier);
				setState(936);
				match(Extends);
				setState(937);
				match(Identifier);
				setState(938);
				match(OpenBlock);
				setState(939);
				functionCodeBlock();
				setState(940);
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
		enterRule(_localctx, 142, RULE_classDefination);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				classModesGeneral();
				setState(945);
				match(OpenBlock);
				setState(946);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				classModesGeneral();
				setState(949);
				match(OpenBlock);
				setState(950);
				functionCodeBlock();
				setState(951);
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
		enterRule(_localctx, 144, RULE_classModesGeneral);
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(Final);
				setState(957);
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
		enterRule(_localctx, 146, RULE_classModes);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(Class);
				setState(961);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				match(Class);
				setState(963);
				match(Identifier);
				setState(964);
				match(Extends);
				setState(965);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Class);
				setState(967);
				match(Identifier);
				setState(968);
				match(Implements);
				setState(969);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(970);
				match(Class);
				setState(971);
				match(Identifier);
				setState(972);
				match(Extends);
				setState(973);
				match(Identifier);
				setState(974);
				match(Implements);
				setState(975);
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
		enterRule(_localctx, 148, RULE_arrayAccessElements);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				arrayAccessElementsItems();
				setState(980);
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
		enterRule(_localctx, 150, RULE_arrayAccessElementsItems);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(Identifier);
				setState(986);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				match(Identifier);
				setState(988);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				match(Identifier);
				setState(990);
				accessBlockAr();
				setState(991);
				match(Point);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(993);
				firstIncDec();
				setState(994);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				match(Identifier);
				setState(997);
				match(Point);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(998);
				firstIncDec();
				setState(999);
				match(Identifier);
				setState(1000);
				accessBlockAr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1002);
				match(Identifier);
				setState(1003);
				accessBlockAr();
				setState(1004);
				match(Point);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1006);
				match(Identifier);
				setState(1007);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1008);
				match(Identifier);
				setState(1009);
				match(Point);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1010);
				match(Identifier);
				setState(1011);
				accessBlockAr();
				setState(1012);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1014);
				match(Identifier);
				setState(1015);
				accessBlockAr();
				setState(1016);
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
		enterRule(_localctx, 152, RULE_accessBlockAr);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				match(OpenArIndex);
				setState(1021);
				arrayIndexAccess();
				setState(1022);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				match(OpenArIndex);
				setState(1025);
				arrayIndexAccess();
				setState(1026);
				match(CloseArIndex);
				setState(1027);
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
		enterRule(_localctx, 154, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
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
		enterRule(_localctx, 156, RULE_generalValue);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				match(Identifier);
				setState(1035);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				match(Integer);
				setState(1038);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				match(Float);
				setState(1041);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1043);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1044);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1045);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1046);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1047);
				objIdentifierA();
				setState(1048);
				match(Point);
				setState(1049);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1051);
				objIdentifierA();
				setState(1052);
				match(TwoTwoPoint);
				setState(1053);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1055);
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
		enterRule(_localctx, 158, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		enterRule(_localctx, 160, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return fileContent_sempred((FileContentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fileContent_sempred(FileContentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0429\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\u00ab\n\3\f\3\16\3\u00ae\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00b9\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00c6\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00fb\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0102\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0113\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0121\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0129\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0130"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0138\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0143\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u014d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a7\n\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c3\n\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01cf\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01db\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u01e1\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01ee\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01f8\n \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u020d\n$\3"+
		"%\3%\3%\3%\5%\u0213\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u021d\n&\3\'\3\'\3\'"+
		"\5\'\u0222\n\'\3(\3(\3(\5(\u0227\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0231\n"+
		")\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u0290\n+\3,\3,\3,\3,\3-\3-\5-\u0298\n-\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u02a7\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02bc\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u02d0\n\61\3\62\3\62\5\62\u02d4\n\62\3\63\3"+
		"\63\5\63\u02d8\n\63\3\64\3\64\5\64\u02dc\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u02e8\n\65\3\66\3\66\3\66\3\66\5\66\u02ee"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02f6\n\67\38\38\38\38\39\39"+
		"\39\59\u02ff\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u031f\n:\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0339\n;\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\5=\u0354\n=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0360\n?\3@\3@\5@\u0364"+
		"\n@\3A\3A\3A\3A\5A\u036a\nA\3B\3B\3B\3B\3B\5B\u0371\nB\3C\3C\3C\3D\3D"+
		"\3D\5D\u0379\nD\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0395\nF\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03b1\nH\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\5I\u03bc\nI\3J\3J\3J\5J\u03c1\nJ\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03d3\nK\3L\3L\3L\3L\5L\u03d9\nL\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u03fd\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N"+
		"\u0408\nN\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u0423\nP\3Q\3Q\3R\3R\3R\2\3\4S\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\2\5\4\2\30\30$$\3\2#$\3\2\13"+
		"\r\2\u049e\2\u00a4\3\2\2\2\4\u00a7\3\2\2\2\6\u00b8\3\2\2\2\b\u00ba\3\2"+
		"\2\2\n\u00bc\3\2\2\2\f\u00c5\3\2\2\2\16\u00c7\3\2\2\2\20\u00c9\3\2\2\2"+
		"\22\u00fa\3\2\2\2\24\u0101\3\2\2\2\26\u0112\3\2\2\2\30\u0120\3\2\2\2\32"+
		"\u0128\3\2\2\2\34\u012f\3\2\2\2\36\u0137\3\2\2\2 \u0142\3\2\2\2\"\u0144"+
		"\3\2\2\2$\u014c\3\2\2\2&\u01a6\3\2\2\2(\u01a8\3\2\2\2*\u01aa\3\2\2\2,"+
		"\u01ac\3\2\2\2.\u01c2\3\2\2\2\60\u01c4\3\2\2\2\62\u01c6\3\2\2\2\64\u01ce"+
		"\3\2\2\2\66\u01da\3\2\2\28\u01e0\3\2\2\2:\u01ed\3\2\2\2<\u01ef\3\2\2\2"+
		">\u01f7\3\2\2\2@\u01f9\3\2\2\2B\u01fd\3\2\2\2D\u0200\3\2\2\2F\u020c\3"+
		"\2\2\2H\u0212\3\2\2\2J\u021c\3\2\2\2L\u0221\3\2\2\2N\u0226\3\2\2\2P\u0230"+
		"\3\2\2\2R\u0232\3\2\2\2T\u028f\3\2\2\2V\u0291\3\2\2\2X\u0297\3\2\2\2Z"+
		"\u0299\3\2\2\2\\\u02a6\3\2\2\2^\u02bb\3\2\2\2`\u02cf\3\2\2\2b\u02d3\3"+
		"\2\2\2d\u02d7\3\2\2\2f\u02db\3\2\2\2h\u02e7\3\2\2\2j\u02ed\3\2\2\2l\u02f5"+
		"\3\2\2\2n\u02f7\3\2\2\2p\u02fe\3\2\2\2r\u031e\3\2\2\2t\u0338\3\2\2\2v"+
		"\u033a\3\2\2\2x\u0353\3\2\2\2z\u0355\3\2\2\2|\u035f\3\2\2\2~\u0363\3\2"+
		"\2\2\u0080\u0369\3\2\2\2\u0082\u0370\3\2\2\2\u0084\u0372\3\2\2\2\u0086"+
		"\u0378\3\2\2\2\u0088\u037a\3\2\2\2\u008a\u0394\3\2\2\2\u008c\u0396\3\2"+
		"\2\2\u008e\u03b0\3\2\2\2\u0090\u03bb\3\2\2\2\u0092\u03c0\3\2\2\2\u0094"+
		"\u03d2\3\2\2\2\u0096\u03d8\3\2\2\2\u0098\u03fc\3\2\2\2\u009a\u0407\3\2"+
		"\2\2\u009c\u0409\3\2\2\2\u009e\u0422\3\2\2\2\u00a0\u0424\3\2\2\2\u00a2"+
		"\u0426\3\2\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\7\2\2\3\u00a6\3\3\2\2\2"+
		"\u00a7\u00ac\b\3\1\2\u00a8\u00a9\f\4\2\2\u00a9\u00ab\5\6\4\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\5\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b9\5\b\5\2\u00b0\u00b9\5\n\6\2"+
		"\u00b1\u00b9\5\20\t\2\u00b2\u00b9\5,\27\2\u00b3\u00b9\58\35\2\u00b4\u00b9"+
		"\5^\60\2\u00b5\u00b9\5r:\2\u00b6\u00b9\5n8\2\u00b7\u00b9\5\u0086D\2\u00b8"+
		"\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\7\3\2\2\2\u00ba\u00bb\7.\2\2"+
		"\u00bb\t\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf\7"+
		"\27\2\2\u00bf\13\3\2\2\2\u00c0\u00c6\5\16\b\2\u00c1\u00c2\5\16\b\2\u00c2"+
		"\u00c3\7\34\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3"+
		"\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\r\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\17"+
		"\3\2\2\2\u00c9\u00ca\5\22\n\2\u00ca\21\3\2\2\2\u00cb\u00cc\7\4\2\2\u00cc"+
		"\u00cd\5\24\13\2\u00cd\u00ce\7\27\2\2\u00ce\u00fb\3\2\2\2\u00cf\u00d0"+
		"\5z>\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7\27\2\2"+
		"\u00d3\u00fb\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7\4\2\2\u00d6\u00d7"+
		"\5\24\13\2\u00d7\u00d8\7\27\2\2\u00d8\u00fb\3\2\2\2\u00d9\u00da\5z>\2"+
		"\u00da\u00db\7\16\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5\24\13\2\u00dd"+
		"\u00de\7\27\2\2\u00de\u00fb\3\2\2\2\u00df\u00e0\7\17\2\2\u00e0\u00e1\5"+
		"z>\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\24\13\2\u00e4"+
		"\u00e5\7\27\2\2\u00e5\u00fb\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\5"+
		"z>\2\u00e8\u00e9\7\4\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\7\27\2\2\u00eb"+
		"\u00fb\3\2\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5"+
		"\24\13\2\u00ef\u00f0\7\27\2\2\u00f0\u00fb\3\2\2\2\u00f1\u00f2\7\17\2\2"+
		"\u00f2\u00f3\7\16\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5\24\13\2\u00f5"+
		"\u00f6\7\27\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9"+
		"\7\27\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00cb\3\2\2\2\u00fa\u00cf\3\2\2\2"+
		"\u00fa\u00d4\3\2\2\2\u00fa\u00d9\3\2\2\2\u00fa\u00df\3\2\2\2\u00fa\u00e6"+
		"\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb"+
		"\23\3\2\2\2\u00fc\u0102\5\26\f\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\7\34"+
		"\2\2\u00ff\u0100\5\24\13\2\u0100\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102\25\3\2\2\2\u0103\u0104\7\'\2\2\u0104\u0113\5\30\r"+
		"\2\u0105\u0106\5\u00a0Q\2\u0106\u0107\7\31\2\2\u0107\u0108\5\u00a2R\2"+
		"\u0108\u0109\5\30\r\2\u0109\u0113\3\2\2\2\u010a\u010b\5\u00a0Q\2\u010b"+
		"\u010c\7\33\2\2\u010c\u010d\5\u00a2R\2\u010d\u010e\5\30\r\2\u010e\u0113"+
		"\3\2\2\2\u010f\u0110\5\u0096L\2\u0110\u0111\5\30\r\2\u0111\u0113\3\2\2"+
		"\2\u0112\u0103\3\2\2\2\u0112\u0105\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010f"+
		"\3\2\2\2\u0113\27\3\2\2\2\u0114\u0115\t\2\2\2\u0115\u0121\5\u009eP\2\u0116"+
		"\u0117\7)\2\2\u0117\u0118\t\2\2\2\u0118\u0121\5\u009eP\2\u0119\u011a\t"+
		"\2\2\2\u011a\u011b\7\25\2\2\u011b\u0121\5\u009eP\2\u011c\u011d\7)\2\2"+
		"\u011d\u011e\t\2\2\2\u011e\u011f\7\25\2\2\u011f\u0121\5\u009eP\2\u0120"+
		"\u0114\3\2\2\2\u0120\u0116\3\2\2\2\u0120\u0119\3\2\2\2\u0120\u011c\3\2"+
		"\2\2\u0121\31\3\2\2\2\u0122\u0123\7\35\2\2\u0123\u0129\7\36\2\2\u0124"+
		"\u0125\7\35\2\2\u0125\u0126\5\34\17\2\u0126\u0127\7\36\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0124\3\2\2\2\u0129\33\3\2\2\2\u012a"+
		"\u0130\5\u009eP\2\u012b\u012c\5\u009eP\2\u012c\u012d\7\34\2\2\u012d\u012e"+
		"\5\34\17\2\u012e\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2"+
		"\u0130\35\3\2\2\2\u0131\u0132\7\37\2\2\u0132\u0138\7 \2\2\u0133\u0134"+
		"\7\37\2\2\u0134\u0135\5 \21\2\u0135\u0136\7 \2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0131\3\2\2\2\u0137\u0133\3\2\2\2\u0138\37\3\2\2\2\u0139\u013a\7\'\2"+
		"\2\u013a\u013b\7\32\2\2\u013b\u0143\5\u009eP\2\u013c\u013d\7\'\2\2\u013d"+
		"\u013e\7\32\2\2\u013e\u013f\5\u009eP\2\u013f\u0140\7\34\2\2\u0140\u0141"+
		"\5 \21\2\u0141\u0143\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013c\3\2\2\2\u0143"+
		"!\3\2\2\2\u0144\u0145\7!\2\2\u0145\u0146\5$\23\2\u0146\u0147\7\"\2\2\u0147"+
		"#\3\2\2\2\u0148\u014d\5&\24\2\u0149\u014a\5&\24\2\u014a\u014b\5$\23\2"+
		"\u014b\u014d\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014d%\3"+
		"\2\2\2\u014e\u01a7\5.\30\2\u014f\u0150\5.\30\2\u0150\u0151\7#\2\2\u0151"+
		"\u01a7\3\2\2\2\u0152\u0153\5.\30\2\u0153\u0154\7)\2\2\u0154\u01a7\3\2"+
		"\2\2\u0155\u0156\5.\30\2\u0156\u0157\7)\2\2\u0157\u0158\7#\2\2\u0158\u01a7"+
		"\3\2\2\2\u0159\u01a7\7\'\2\2\u015a\u015b\7\'\2\2\u015b\u01a7\7#\2\2\u015c"+
		"\u015d\7\'\2\2\u015d\u01a7\7)\2\2\u015e\u015f\7\'\2\2\u015f\u0160\7)\2"+
		"\2\u0160\u01a7\7#\2\2\u0161\u0162\5(\25\2\u0162\u0163\7\'\2\2\u0163\u01a7"+
		"\3\2\2\2\u0164\u0165\5(\25\2\u0165\u0166\7\'\2\2\u0166\u0167\7#\2\2\u0167"+
		"\u01a7\3\2\2\2\u0168\u0169\5(\25\2\u0169\u016a\7\'\2\2\u016a\u016b\7)"+
		"\2\2\u016b\u01a7\3\2\2\2\u016c\u016d\5(\25\2\u016d\u016e\7\'\2\2\u016e"+
		"\u016f\7)\2\2\u016f\u0170\7#\2\2\u0170\u01a7\3\2\2\2\u0171\u0172\7\'\2"+
		"\2\u0172\u01a7\5*\26\2\u0173\u0174\7\'\2\2\u0174\u0175\5*\26\2\u0175\u0176"+
		"\7#\2\2\u0176\u01a7\3\2\2\2\u0177\u0178\7\'\2\2\u0178\u0179\5*\26\2\u0179"+
		"\u017a\7)\2\2\u017a\u01a7\3\2\2\2\u017b\u017c\7\'\2\2\u017c\u017d\5*\26"+
		"\2\u017d\u017e\7)\2\2\u017e\u017f\7#\2\2\u017f\u01a7\3\2\2\2\u0180\u01a7"+
		"\7+\2\2\u0181\u0182\7+\2\2\u0182\u01a7\7#\2\2\u0183\u0184\7+\2\2\u0184"+
		"\u01a7\7)\2\2\u0185\u0186\7+\2\2\u0186\u0187\7)\2\2\u0187\u01a7\7#\2\2"+
		"\u0188\u01a7\7,\2\2\u0189\u018a\7,\2\2\u018a\u01a7\7#\2\2\u018b\u018c"+
		"\7,\2\2\u018c\u01a7\7)\2\2\u018d\u018e\7,\2\2\u018e\u018f\7)\2\2\u018f"+
		"\u01a7\7#\2\2\u0190\u01a7\5\"\22\2\u0191\u0192\5\"\22\2\u0192\u0193\7"+
		"#\2\2\u0193\u01a7\3\2\2\2\u0194\u0195\5\"\22\2\u0195\u0196\7)\2\2\u0196"+
		"\u01a7\3\2\2\2\u0197\u0198\5\"\22\2\u0198\u0199\7)\2\2\u0199\u019a\7#"+
		"\2\2\u019a\u01a7\3\2\2\2\u019b\u01a7\5\u0096L\2\u019c\u019d\5\u0096L\2"+
		"\u019d\u019e\7#\2\2\u019e\u01a7\3\2\2\2\u019f\u01a0\5\u0096L\2\u01a0\u01a1"+
		"\7)\2\2\u01a1\u01a7\3\2\2\2\u01a2\u01a3\5\u0096L\2\u01a3\u01a4\7)\2\2"+
		"\u01a4\u01a5\7#\2\2\u01a5\u01a7\3\2\2\2\u01a6\u014e\3\2\2\2\u01a6\u014f"+
		"\3\2\2\2\u01a6\u0152\3\2\2\2\u01a6\u0155\3\2\2\2\u01a6\u0159\3\2\2\2\u01a6"+
		"\u015a\3\2\2\2\u01a6\u015c\3\2\2\2\u01a6\u015e\3\2\2\2\u01a6\u0161\3\2"+
		"\2\2\u01a6\u0164\3\2\2\2\u01a6\u0168\3\2\2\2\u01a6\u016c\3\2\2\2\u01a6"+
		"\u0171\3\2\2\2\u01a6\u0173\3\2\2\2\u01a6\u0177\3\2\2\2\u01a6\u017b\3\2"+
		"\2\2\u01a6\u0180\3\2\2\2\u01a6\u0181\3\2\2\2\u01a6\u0183\3\2\2\2\u01a6"+
		"\u0185\3\2\2\2\u01a6\u0188\3\2\2\2\u01a6\u0189\3\2\2\2\u01a6\u018b\3\2"+
		"\2\2\u01a6\u018d\3\2\2\2\u01a6\u0190\3\2\2\2\u01a6\u0191\3\2\2\2\u01a6"+
		"\u0194\3\2\2\2\u01a6\u0197\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u019c\3\2"+
		"\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\'\3\2\2\2\u01a8\u01a9"+
		"\7&\2\2\u01a9)\3\2\2\2\u01aa\u01ab\7&\2\2\u01ab+\3\2\2\2\u01ac\u01ad\5"+
		".\30\2\u01ad\u01ae\7\27\2\2\u01ae-\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0\u01c3"+
		"\5\64\33\2\u01b1\u01b2\7\'\2\2\u01b2\u01b3\7\31\2\2\u01b3\u01b4\5\60\31"+
		"\2\u01b4\u01b5\5\64\33\2\u01b5\u01c3\3\2\2\2\u01b6\u01b7\7\'\2\2\u01b7"+
		"\u01b8\7\33\2\2\u01b8\u01b9\5\60\31\2\u01b9\u01ba\5\64\33\2\u01ba\u01c3"+
		"\3\2\2\2\u01bb\u01bc\7\'\2\2\u01bc\u01bd\7\31\2\2\u01bd\u01be\5\60\31"+
		"\2\u01be\u01bf\5\64\33\2\u01bf\u01c0\5\62\32\2\u01c0\u01c1\5.\30\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01af\3\2\2\2\u01c2\u01b1\3\2\2\2\u01c2\u01b6\3\2"+
		"\2\2\u01c2\u01bb\3\2\2\2\u01c3/\3\2\2\2\u01c4\u01c5\7\'\2\2\u01c5\61\3"+
		"\2\2\2\u01c6\u01c7\7\31\2\2\u01c7\63\3\2\2\2\u01c8\u01c9\7!\2\2\u01c9"+
		"\u01cf\7\"\2\2\u01ca\u01cb\7!\2\2\u01cb\u01cc\5\66\34\2\u01cc\u01cd\7"+
		"\"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf"+
		"\65\3\2\2\2\u01d0\u01db\5\u009eP\2\u01d1\u01d2\5\u009eP\2\u01d2\u01d3"+
		"\7\34\2\2\u01d3\u01d4\5\66\34\2\u01d4\u01db\3\2\2\2\u01d5\u01db\5$\23"+
		"\2\u01d6\u01d7\5$\23\2\u01d7\u01d8\7\34\2\2\u01d8\u01d9\5\66\34\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d0\3\2\2\2\u01da\u01d1\3\2\2\2\u01da\u01d5\3\2"+
		"\2\2\u01da\u01d6\3\2\2\2\u01db\67\3\2\2\2\u01dc\u01e1\5:\36\2\u01dd\u01de"+
		"\5:\36\2\u01de\u01df\58\35\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0"+
		"\u01dd\3\2\2\2\u01e19\3\2\2\2\u01e2\u01ee\5<\37\2\u01e3\u01e4\5<\37\2"+
		"\u01e4\u01e5\5> \2\u01e5\u01ee\3\2\2\2\u01e6\u01e7\5<\37\2\u01e7\u01e8"+
		"\5B\"\2\u01e8\u01ee\3\2\2\2\u01e9\u01ea\5<\37\2\u01ea\u01eb\5> \2\u01eb"+
		"\u01ec\5B\"\2\u01ec\u01ee\3\2\2\2\u01ed\u01e2\3\2\2\2\u01ed\u01e3\3\2"+
		"\2\2\u01ed\u01e6\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ee;\3\2\2\2\u01ef\u01f0"+
		"\7\5\2\2\u01f0\u01f1\5D#\2\u01f1\u01f2\5F$\2\u01f2=\3\2\2\2\u01f3\u01f8"+
		"\5@!\2\u01f4\u01f5\5@!\2\u01f5\u01f6\5> \2\u01f6\u01f8\3\2\2\2\u01f7\u01f3"+
		"\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8?\3\2\2\2\u01f9\u01fa\7\6\2\2\u01fa"+
		"\u01fb\5D#\2\u01fb\u01fc\5F$\2\u01fcA\3\2\2\2\u01fd\u01fe\7\7\2\2\u01fe"+
		"\u01ff\5F$\2\u01ffC\3\2\2\2\u0200\u0201\5J&\2\u0201E\3\2\2\2\u0202\u0203"+
		"\7\37\2\2\u0203\u020d\7 \2\2\u0204\u0205\7\37\2\2\u0205\u0206\5H%\2\u0206"+
		"\u0207\7 \2\2\u0207\u020d\3\2\2\2\u0208\u020d\58\35\2\u0209\u020d\5,\27"+
		"\2\u020a\u020d\5^\60\2\u020b\u020d\5n8\2\u020c\u0202\3\2\2\2\u020c\u0204"+
		"\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020b\3\2\2\2\u020dG\3\2\2\2\u020e\u0213\5\6\4\2\u020f\u0210\5\6\4\2"+
		"\u0210\u0211\5H%\2\u0211\u0213\3\2\2\2\u0212\u020e\3\2\2\2\u0212\u020f"+
		"\3\2\2\2\u0213I\3\2\2\2\u0214\u021d\5L\'\2\u0215\u0216\5L\'\2\u0216\u0217"+
		"\5J&\2\u0217\u021d\3\2\2\2\u0218\u021d\5N(\2\u0219\u021a\5N(\2\u021a\u021b"+
		"\5J&\2\u021b\u021d\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0215\3\2\2\2\u021c"+
		"\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021dK\3\2\2\2\u021e\u021f\7%\2\2\u021f"+
		"\u0222\5T+\2\u0220\u0222\5T+\2\u0221\u021e\3\2\2\2\u0221\u0220\3\2\2\2"+
		"\u0222M\3\2\2\2\u0223\u0227\5P)\2\u0224\u0225\7%\2\2\u0225\u0227\5P)\2"+
		"\u0226\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0227O\3\2\2\2\u0228\u0231\5"+
		"R*\2\u0229\u022a\5R*\2\u022a\u022b\t\3\2\2\u022b\u0231\3\2\2\2\u022c\u022d"+
		"\5R*\2\u022d\u022e\7)\2\2\u022e\u022f\t\3\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u0228\3\2\2\2\u0230\u0229\3\2\2\2\u0230\u022c\3\2\2\2\u0231Q\3\2\2\2"+
		"\u0232\u0233\7!\2\2\u0233\u0234\5J&\2\u0234\u0235\7\"\2\2\u0235S\3\2\2"+
		"\2\u0236\u0237\5(\25\2\u0237\u0238\7\'\2\2\u0238\u0290\3\2\2\2\u0239\u023a"+
		"\5(\25\2\u023a\u023b\7\'\2\2\u023b\u023c\t\3\2\2\u023c\u0290\3\2\2\2\u023d"+
		"\u023e\5(\25\2\u023e\u023f\7\'\2\2\u023f\u0240\7)\2\2\u0240\u0290\3\2"+
		"\2\2\u0241\u0242\5(\25\2\u0242\u0243\7\'\2\2\u0243\u0244\7)\2\2\u0244"+
		"\u0245\t\3\2\2\u0245\u0290\3\2\2\2\u0246\u0247\7\'\2\2\u0247\u0290\5*"+
		"\26\2\u0248\u0249\7\'\2\2\u0249\u024a\5*\26\2\u024a\u024b\t\3\2\2\u024b"+
		"\u0290\3\2\2\2\u024c\u024d\7\'\2\2\u024d\u024e\5*\26\2\u024e\u024f\7)"+
		"\2\2\u024f\u0290\3\2\2\2\u0250\u0251\7\'\2\2\u0251\u0252\5*\26\2\u0252"+
		"\u0253\7)\2\2\u0253\u0254\t\3\2\2\u0254\u0290\3\2\2\2\u0255\u0290\7+\2"+
		"\2\u0256\u0257\7+\2\2\u0257\u0290\t\3\2\2\u0258\u0259\7+\2\2\u0259\u0290"+
		"\7)\2\2\u025a\u025b\7+\2\2\u025b\u025c\7)\2\2\u025c\u0290\t\3\2\2\u025d"+
		"\u0290\7,\2\2\u025e\u025f\7,\2\2\u025f\u0290\t\3\2\2\u0260\u0261\7,\2"+
		"\2\u0261\u0290\7)\2\2\u0262\u0263\7,\2\2\u0263\u0264\7)\2\2\u0264\u0290"+
		"\t\3\2\2\u0265\u0290\5V,\2\u0266\u0290\5.\30\2\u0267\u0268\5.\30\2\u0268"+
		"\u0269\t\3\2\2\u0269\u0290\3\2\2\2\u026a\u026b\5.\30\2\u026b\u026c\7)"+
		"\2\2\u026c\u0290\3\2\2\2\u026d\u026e\5.\30\2\u026e\u026f\7)\2\2\u026f"+
		"\u0270\t\3\2\2\u0270\u0290\3\2\2\2\u0271\u0290\5\"\22\2\u0272\u0273\5"+
		"\"\22\2\u0273\u0274\t\3\2\2\u0274\u0290\3\2\2\2\u0275\u0276\5\"\22\2\u0276"+
		"\u0277\7)\2\2\u0277\u0290\3\2\2\2\u0278\u0279\5\"\22\2\u0279\u027a\7)"+
		"\2\2\u027a\u027b\t\3\2\2\u027b\u0290\3\2\2\2\u027c\u0290\7\'\2\2\u027d"+
		"\u027e\7\'\2\2\u027e\u0290\t\3\2\2\u027f\u0280\7\'\2\2\u0280\u0290\7)"+
		"\2\2\u0281\u0282\7\'\2\2\u0282\u0283\7)\2\2\u0283\u0290\t\3\2\2\u0284"+
		"\u0290\5\u0096L\2\u0285\u0286\5\u0096L\2\u0286\u0287\t\3\2\2\u0287\u0290"+
		"\3\2\2\2\u0288\u0289\5\u0096L\2\u0289\u028a\7)\2\2\u028a\u0290\3\2\2\2"+
		"\u028b\u028c\5\u0096L\2\u028c\u028d\7)\2\2\u028d\u028e\t\3\2\2\u028e\u0290"+
		"\3\2\2\2\u028f\u0236\3\2\2\2\u028f\u0239\3\2\2\2\u028f\u023d\3\2\2\2\u028f"+
		"\u0241\3\2\2\2\u028f\u0246\3\2\2\2\u028f\u0248\3\2\2\2\u028f\u024c\3\2"+
		"\2\2\u028f\u0250\3\2\2\2\u028f\u0255\3\2\2\2\u028f\u0256\3\2\2\2\u028f"+
		"\u0258\3\2\2\2\u028f\u025a\3\2\2\2\u028f\u025d\3\2\2\2\u028f\u025e\3\2"+
		"\2\2\u028f\u0260\3\2\2\2\u028f\u0262\3\2\2\2\u028f\u0265\3\2\2\2\u028f"+
		"\u0266\3\2\2\2\u028f\u0267\3\2\2\2\u028f\u026a\3\2\2\2\u028f\u026d\3\2"+
		"\2\2\u028f\u0271\3\2\2\2\u028f\u0272\3\2\2\2\u028f\u0275\3\2\2\2\u028f"+
		"\u0278\3\2\2\2\u028f\u027c\3\2\2\2\u028f\u027d\3\2\2\2\u028f\u027f\3\2"+
		"\2\2\u028f\u0281\3\2\2\2\u028f\u0284\3\2\2\2\u028f\u0285\3\2\2\2\u028f"+
		"\u0288\3\2\2\2\u028f\u028b\3\2\2\2\u0290U\3\2\2\2\u0291\u0292\5X-\2\u0292"+
		"\u0293\7\30\2\2\u0293\u0294\5Z.\2\u0294W\3\2\2\2\u0295\u0298\5\u0096L"+
		"\2\u0296\u0298\7\'\2\2\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298Y"+
		"\3\2\2\2\u0299\u029a\5\\/\2\u029a[\3\2\2\2\u029b\u02a7\5.\30\2\u029c\u029d"+
		"\5.\30\2\u029d\u029e\t\3\2\2\u029e\u02a7\3\2\2\2\u029f\u02a0\5.\30\2\u02a0"+
		"\u02a1\7)\2\2\u02a1\u02a7\3\2\2\2\u02a2\u02a3\5.\30\2\u02a3\u02a4\7)\2"+
		"\2\u02a4\u02a5\t\3\2\2\u02a5\u02a7\3\2\2\2\u02a6\u029b\3\2\2\2\u02a6\u029c"+
		"\3\2\2\2\u02a6\u029f\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7]\3\2\2\2\u02a8"+
		"\u02a9\7\b\2\2\u02a9\u02aa\5`\61\2\u02aa\u02ab\7\37\2\2\u02ab\u02ac\7"+
		" \2\2\u02ac\u02bc\3\2\2\2\u02ad\u02ae\7\b\2\2\u02ae\u02af\5`\61\2\u02af"+
		"\u02b0\7\37\2\2\u02b0\u02b1\5j\66\2\u02b1\u02b2\7 \2\2\u02b2\u02bc\3\2"+
		"\2\2\u02b3\u02b4\7\b\2\2\u02b4\u02b5\5`\61\2\u02b5\u02b6\5,\27\2\u02b6"+
		"\u02bc\3\2\2\2\u02b7\u02b8\7\b\2\2\u02b8\u02b9\5`\61\2\u02b9\u02ba\5l"+
		"\67\2\u02ba\u02bc\3\2\2\2\u02bb\u02a8\3\2\2\2\u02bb\u02ad\3\2\2\2\u02bb"+
		"\u02b3\3\2\2\2\u02bb\u02b7\3\2\2\2\u02bc_\3\2\2\2\u02bd\u02be\7!\2\2\u02be"+
		"\u02bf\5b\62\2\u02bf\u02c0\7\27\2\2\u02c0\u02c1\5d\63\2\u02c1\u02c2\7"+
		"\27\2\2\u02c2\u02c3\5f\64\2\u02c3\u02c4\7\"\2\2\u02c4\u02d0\3\2\2\2\u02c5"+
		"\u02c6\5b\62\2\u02c6\u02c7\7\27\2\2\u02c7\u02c8\5d\63\2\u02c8\u02c9\7"+
		"\27\2\2\u02c9\u02ca\5f\64\2\u02ca\u02d0\3\2\2\2\u02cb\u02d0\5J&\2\u02cc"+
		"\u02cd\7!\2\2\u02cd\u02d0\7\"\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02bd\3\2"+
		"\2\2\u02cf\u02c5\3\2\2\2\u02cf\u02cb\3\2\2\2\u02cf\u02cc\3\2\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02d0a\3\2\2\2\u02d1\u02d4\5\24\13\2\u02d2\u02d4\3\2\2"+
		"\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4c\3\2\2\2\u02d5\u02d8"+
		"\5J&\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"e\3\2\2\2\u02d9\u02dc\5h\65\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2"+
		"\u02db\u02da\3\2\2\2\u02dcg\3\2\2\2\u02dd\u02e8\5$\23\2\u02de\u02e8\5"+
		"\"\22\2\u02df\u02e0\5$\23\2\u02e0\u02e1\7\34\2\2\u02e1\u02e2\5h\65\2\u02e2"+
		"\u02e8\3\2\2\2\u02e3\u02e4\5\"\22\2\u02e4\u02e5\7\34\2\2\u02e5\u02e6\5"+
		"h\65\2\u02e6\u02e8\3\2\2\2\u02e7\u02dd\3\2\2\2\u02e7\u02de\3\2\2\2\u02e7"+
		"\u02df\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e8i\3\2\2\2\u02e9\u02ee\5\6\4\2"+
		"\u02ea\u02eb\5\6\4\2\u02eb\u02ec\5j\66\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9"+
		"\3\2\2\2\u02ed\u02ea\3\2\2\2\u02eek\3\2\2\2\u02ef\u02f6\5^\60\2\u02f0"+
		"\u02f1\5^\60\2\u02f1\u02f2\5l\67\2\u02f2\u02f6\3\2\2\2\u02f3\u02f6\58"+
		"\35\2\u02f4\u02f6\5n8\2\u02f5\u02ef\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6m\3\2\2\2\u02f7\u02f8\7\t\2\2"+
		"\u02f8\u02f9\5p9\2\u02f9\u02fa\7\27\2\2\u02fao\3\2\2\2\u02fb\u02ff\5\u009e"+
		"P\2\u02fc\u02ff\5$\23\2\u02fd\u02ff\5\"\22\2\u02fe\u02fb\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ffq\3\2\2\2\u0300\u0301\5v<\2\u0301"+
		"\u0302\7\37\2\2\u0302\u0303\7 \2\2\u0303\u031f\3\2\2\2\u0304\u0305\5v"+
		"<\2\u0305\u0306\7\37\2\2\u0306\u0307\5\u0080A\2\u0307\u0308\7 \2\2\u0308"+
		"\u031f\3\2\2\2\u0309\u030a\5x=\2\u030a\u030b\7\37\2\2\u030b\u030c\7 \2"+
		"\2\u030c\u031f\3\2\2\2\u030d\u030e\5x=\2\u030e\u030f\7\37\2\2\u030f\u0310"+
		"\5\u0080A\2\u0310\u0311\7 \2\2\u0311\u031f\3\2\2\2\u0312\u0313\5|?\2\u0313"+
		"\u0314\7\37\2\2\u0314\u0315\7 \2\2\u0315\u031f\3\2\2\2\u0316\u0317\5|"+
		"?\2\u0317\u0318\7\37\2\2\u0318\u0319\5\u0080A\2\u0319\u031a\7 \2\2\u031a"+
		"\u031f\3\2\2\2\u031b\u031c\5~@\2\u031c\u031d\7\27\2\2\u031d\u031f\3\2"+
		"\2\2\u031e\u0300\3\2\2\2\u031e\u0304\3\2\2\2\u031e\u0309\3\2\2\2\u031e"+
		"\u030d\3\2\2\2\u031e\u0312\3\2\2\2\u031e\u0316\3\2\2\2\u031e\u031b\3\2"+
		"\2\2\u031fs\3\2\2\2\u0320\u0321\7\n\2\2\u0321\u0322\7\'\2\2\u0322\u0323"+
		"\7!\2\2\u0323\u0339\7\"\2\2\u0324\u0325\7\n\2\2\u0325\u0326\7\'\2\2\u0326"+
		"\u0327\7!\2\2\u0327\u0328\7\"\2\2\u0328\u0329\7\26\2\2\u0329\u0339\7\'"+
		"\2\2\u032a\u032b\7\n\2\2\u032b\u032c\7\'\2\2\u032c\u032d\7!\2\2\u032d"+
		"\u032e\5\u0082B\2\u032e\u032f\7\"\2\2\u032f\u0339\3\2\2\2\u0330\u0331"+
		"\7\n\2\2\u0331\u0332\7\'\2\2\u0332\u0333\7!\2\2\u0333\u0334\5\u0082B\2"+
		"\u0334\u0335\7\"\2\2\u0335\u0336\7\26\2\2\u0336\u0337\7\'\2\2\u0337\u0339"+
		"\3\2\2\2\u0338\u0320\3\2\2\2\u0338\u0324\3\2\2\2\u0338\u032a\3\2\2\2\u0338"+
		"\u0330\3\2\2\2\u0339u\3\2\2\2\u033a\u033b\5t;\2\u033bw\3\2\2\2\u033c\u033d"+
		"\5z>\2\u033d\u033e\5t;\2\u033e\u0354\3\2\2\2\u033f\u0340\7\16\2\2\u0340"+
		"\u0354\5t;\2\u0341\u0342\5z>\2\u0342\u0343\7\16\2\2\u0343\u0344\5t;\2"+
		"\u0344\u0354\3\2\2\2\u0345\u0346\7\17\2\2\u0346\u0347\5z>\2\u0347\u0348"+
		"\7\16\2\2\u0348\u0349\5t;\2\u0349\u0354\3\2\2\2\u034a\u034b\7\17\2\2\u034b"+
		"\u034c\5z>\2\u034c\u034d\5t;\2\u034d\u0354\3\2\2\2\u034e\u034f\7\17\2"+
		"\2\u034f\u0354\5t;\2\u0350\u0351\7\17\2\2\u0351\u0352\7\16\2\2\u0352\u0354"+
		"\5t;\2\u0353\u033c\3\2\2\2\u0353\u033f\3\2\2\2\u0353\u0341\3\2\2\2\u0353"+
		"\u0345\3\2\2\2\u0353\u034a\3\2\2\2\u0353\u034e\3\2\2\2\u0353\u0350\3\2"+
		"\2\2\u0354y\3\2\2\2\u0355\u0356\t\4\2\2\u0356{\3\2\2\2\u0357\u0358\7\'"+
		"\2\2\u0358\u0359\7!\2\2\u0359\u0360\7\"\2\2\u035a\u035b\7\'\2\2\u035b"+
		"\u035c\7!\2\2\u035c\u035d\5\u0082B\2\u035d\u035e\7\"\2\2\u035e\u0360\3"+
		"\2\2\2\u035f\u0357\3\2\2\2\u035f\u035a\3\2\2\2\u0360}\3\2\2\2\u0361\u0364"+
		"\5v<\2\u0362\u0364\5x=\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2\2\2\u0364"+
		"\177\3\2\2\2\u0365\u036a\5\6\4\2\u0366\u0367\5\6\4\2\u0367\u0368\5\u0080"+
		"A\2\u0368\u036a\3\2\2\2\u0369\u0365\3\2\2\2\u0369\u0366\3\2\2\2\u036a"+
		"\u0081\3\2\2\2\u036b\u0371\5\u0084C\2\u036c\u036d\5\u0084C\2\u036d\u036e"+
		"\7\34\2\2\u036e\u036f\5\u0082B\2\u036f\u0371\3\2\2\2\u0370\u036b\3\2\2"+
		"\2\u0370\u036c\3\2\2\2\u0371\u0083\3\2\2\2\u0372\u0373\7\'\2\2\u0373\u0374"+
		"\7)\2\2\u0374\u0085\3\2\2\2\u0375\u0379\5\u0088E\2\u0376\u0379\5\u008c"+
		"G\2\u0377\u0379\5\u0090I\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0377\3\2\2\2\u0379\u0087\3\2\2\2\u037a\u037b\5\u008aF\2\u037b\u0089"+
		"\3\2\2\2\u037c\u037d\7\20\2\2\u037d\u037e\7\'\2\2\u037e\u037f\7\37\2\2"+
		"\u037f\u0395\7 \2\2\u0380\u0381\7\20\2\2\u0381\u0382\7\'\2\2\u0382\u0383"+
		"\7\37\2\2\u0383\u0384\5\u0080A\2\u0384\u0385\7 \2\2\u0385\u0395\3\2\2"+
		"\2\u0386\u0387\7\20\2\2\u0387\u0388\7\'\2\2\u0388\u0389\7\22\2\2\u0389"+
		"\u038a\7\'\2\2\u038a\u038b\7\37\2\2\u038b\u0395\7 \2\2\u038c\u038d\7\20"+
		"\2\2\u038d\u038e\7\'\2\2\u038e\u038f\7\22\2\2\u038f\u0390\7\'\2\2\u0390"+
		"\u0391\7\37\2\2\u0391\u0392\5\u0080A\2\u0392\u0393\7 \2\2\u0393\u0395"+
		"\3\2\2\2\u0394\u037c\3\2\2\2\u0394\u0380\3\2\2\2\u0394\u0386\3\2\2\2\u0394"+
		"\u038c\3\2\2\2\u0395\u008b\3\2\2\2\u0396\u0397\5\u008eH\2\u0397\u008d"+
		"\3\2\2\2\u0398\u0399\7\21\2\2\u0399\u039a\7\'\2\2\u039a\u039b\7\37\2\2"+
		"\u039b\u03b1\7 \2\2\u039c\u039d\7\21\2\2\u039d\u039e\7\'\2\2\u039e\u039f"+
		"\7\37\2\2\u039f\u03a0\5\u0080A\2\u03a0\u03a1\7 \2\2\u03a1\u03b1\3\2\2"+
		"\2\u03a2\u03a3\7\21\2\2\u03a3\u03a4\7\'\2\2\u03a4\u03a5\7\22\2\2\u03a5"+
		"\u03a6\7\'\2\2\u03a6\u03a7\7\37\2\2\u03a7\u03b1\7 \2\2\u03a8\u03a9\7\21"+
		"\2\2\u03a9\u03aa\7\'\2\2\u03aa\u03ab\7\22\2\2\u03ab\u03ac\7\'\2\2\u03ac"+
		"\u03ad\7\37\2\2\u03ad\u03ae\5\u0080A\2\u03ae\u03af\7 \2\2\u03af\u03b1"+
		"\3\2\2\2\u03b0\u0398\3\2\2\2\u03b0\u039c\3\2\2\2\u03b0\u03a2\3\2\2\2\u03b0"+
		"\u03a8\3\2\2\2\u03b1\u008f\3\2\2\2\u03b2\u03b3\5\u0092J\2\u03b3\u03b4"+
		"\7\37\2\2\u03b4\u03b5\7 \2\2\u03b5\u03bc\3\2\2\2\u03b6\u03b7\5\u0092J"+
		"\2\u03b7\u03b8\7\37\2\2\u03b8\u03b9\5\u0080A\2\u03b9\u03ba\7 \2\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03b2\3\2\2\2\u03bb\u03b6\3\2\2\2\u03bc\u0091\3\2"+
		"\2\2\u03bd\u03c1\5\u0094K\2\u03be\u03bf\7\17\2\2\u03bf\u03c1\5\u0094K"+
		"\2\u03c0\u03bd\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u0093\3\2\2\2\u03c2\u03c3"+
		"\7\23\2\2\u03c3\u03d3\7\'\2\2\u03c4\u03c5\7\23\2\2\u03c5\u03c6\7\'\2\2"+
		"\u03c6\u03c7\7\22\2\2\u03c7\u03d3\7\'\2\2\u03c8\u03c9\7\23\2\2\u03c9\u03ca"+
		"\7\'\2\2\u03ca\u03cb\7\24\2\2\u03cb\u03d3\7\'\2\2\u03cc\u03cd\7\23\2\2"+
		"\u03cd\u03ce\7\'\2\2\u03ce\u03cf\7\22\2\2\u03cf\u03d0\7\'\2\2\u03d0\u03d1"+
		"\7\24\2\2\u03d1\u03d3\7\'\2\2\u03d2\u03c2\3\2\2\2\u03d2\u03c4\3\2\2\2"+
		"\u03d2\u03c8\3\2\2\2\u03d2\u03cc\3\2\2\2\u03d3\u0095\3\2\2\2\u03d4\u03d9"+
		"\5\u0098M\2\u03d5\u03d6\5\u0098M\2\u03d6\u03d7\5\u0096L\2\u03d7\u03d9"+
		"\3\2\2\2\u03d8\u03d4\3\2\2\2\u03d8\u03d5\3\2\2\2\u03d9\u0097\3\2\2\2\u03da"+
		"\u03fd\7\'\2\2\u03db\u03dc\7\'\2\2\u03dc\u03fd\7\31\2\2\u03dd\u03de\7"+
		"\'\2\2\u03de\u03fd\5\u009aN\2\u03df\u03e0\7\'\2\2\u03e0\u03e1\5\u009a"+
		"N\2\u03e1\u03e2\7\31\2\2\u03e2\u03fd\3\2\2\2\u03e3\u03e4\5(\25\2\u03e4"+
		"\u03e5\7\'\2\2\u03e5\u03fd\3\2\2\2\u03e6\u03e7\7\'\2\2\u03e7\u03fd\7\31"+
		"\2\2\u03e8\u03e9\5(\25\2\u03e9\u03ea\7\'\2\2\u03ea\u03eb\5\u009aN\2\u03eb"+
		"\u03fd\3\2\2\2\u03ec\u03ed\7\'\2\2\u03ed\u03ee\5\u009aN\2\u03ee\u03ef"+
		"\7\31\2\2\u03ef\u03fd\3\2\2\2\u03f0\u03f1\7\'\2\2\u03f1\u03fd\5*\26\2"+
		"\u03f2\u03f3\7\'\2\2\u03f3\u03fd\7\31\2\2\u03f4\u03f5\7\'\2\2\u03f5\u03f6"+
		"\5\u009aN\2\u03f6\u03f7\5*\26\2\u03f7\u03fd\3\2\2\2\u03f8\u03f9\7\'\2"+
		"\2\u03f9\u03fa\5\u009aN\2\u03fa\u03fb\7\31\2\2\u03fb\u03fd\3\2\2\2\u03fc"+
		"\u03da\3\2\2\2\u03fc\u03db\3\2\2\2\u03fc\u03dd\3\2\2\2\u03fc\u03df\3\2"+
		"\2\2\u03fc\u03e3\3\2\2\2\u03fc\u03e6\3\2\2\2\u03fc\u03e8\3\2\2\2\u03fc"+
		"\u03ec\3\2\2\2\u03fc\u03f0\3\2\2\2\u03fc\u03f2\3\2\2\2\u03fc\u03f4\3\2"+
		"\2\2\u03fc\u03f8\3\2\2\2\u03fd\u0099\3\2\2\2\u03fe\u03ff\7\35\2\2\u03ff"+
		"\u0400\5\u009cO\2\u0400\u0401\7\36\2\2\u0401\u0408\3\2\2\2\u0402\u0403"+
		"\7\35\2\2\u0403\u0404\5\u009cO\2\u0404\u0405\7\36\2\2\u0405\u0406\5\u009a"+
		"N\2\u0406\u0408\3\2\2\2\u0407\u03fe\3\2\2\2\u0407\u0402\3\2\2\2\u0408"+
		"\u009b\3\2\2\2\u0409\u040a\5$\23\2\u040a\u009d\3\2\2\2\u040b\u0423\7\'"+
		"\2\2\u040c\u040d\7\'\2\2\u040d\u0423\7)\2\2\u040e\u0423\7+\2\2\u040f\u0410"+
		"\7+\2\2\u0410\u0423\7)\2\2\u0411\u0423\7,\2\2\u0412\u0413\7,\2\2\u0413"+
		"\u0423\7)\2\2\u0414\u0423\7*\2\2\u0415\u0423\5\32\16\2\u0416\u0423\5\36"+
		"\20\2\u0417\u0423\5$\23\2\u0418\u0423\5.\30\2\u0419\u041a\5\u00a0Q\2\u041a"+
		"\u041b\7\31\2\2\u041b\u041c\5\u00a2R\2\u041c\u0423\3\2\2\2\u041d\u041e"+
		"\5\u00a0Q\2\u041e\u041f\7\33\2\2\u041f\u0420\5\u00a2R\2\u0420\u0423\3"+
		"\2\2\2\u0421\u0423\5\u0096L\2\u0422\u040b\3\2\2\2\u0422\u040c\3\2\2\2"+
		"\u0422\u040e\3\2\2\2\u0422\u040f\3\2\2\2\u0422\u0411\3\2\2\2\u0422\u0412"+
		"\3\2\2\2\u0422\u0414\3\2\2\2\u0422\u0415\3\2\2\2\u0422\u0416\3\2\2\2\u0422"+
		"\u0417\3\2\2\2\u0422\u0418\3\2\2\2\u0422\u0419\3\2\2\2\u0422\u041d\3\2"+
		"\2\2\u0422\u0421\3\2\2\2\u0423\u009f\3\2\2\2\u0424\u0425\7\'\2\2\u0425"+
		"\u00a1\3\2\2\2\u0426\u0427\7\'\2\2\u0427\u00a3\3\2\2\28\u00ac\u00b8\u00c5"+
		"\u00fa\u0101\u0112\u0120\u0128\u012f\u0137\u0142\u014c\u01a6\u01c2\u01ce"+
		"\u01da\u01e0\u01ed\u01f7\u020c\u0212\u021c\u0221\u0226\u0230\u028f\u0297"+
		"\u02a6\u02bb\u02cf\u02d3\u02d7\u02db\u02e7\u02ed\u02f5\u02fe\u031e\u0338"+
		"\u0353\u035f\u0363\u0369\u0370\u0378\u0394\u03b0\u03bb\u03c0\u03d2\u03d8"+
		"\u03fc\u0407\u0422";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}