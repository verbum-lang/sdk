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
		RULE_conditionalExpElementsValue = 37, RULE_conditionExpBlock = 38, RULE_conditionalExpValue = 39, 
		RULE_loop = 40, RULE_loopExpression = 41, RULE_loopOneMembers = 42, RULE_loopTwoMembers = 43, 
		RULE_loopThreeMembers = 44, RULE_loopThreeMembersValues = 45, RULE_loopBlockElements = 46, 
		RULE_loopBlockElementsLimited = 47, RULE_ret = 48, RULE_retValues = 49, 
		RULE_functions = 50, RULE_functionGeneralModes = 51, RULE_functionsModes = 52, 
		RULE_functionMethodsModes = 53, RULE_methodPerm = 54, RULE_constructClassMethod = 55, 
		RULE_interfaceMethod = 56, RULE_functionCodeBlock = 57, RULE_functionParams = 58, 
		RULE_functionParamElements = 59, RULE_oopGeneral = 60, RULE_interfaceClass = 61, 
		RULE_interfaceClassDefinition = 62, RULE_abstractClass = 63, RULE_abstractClassDefinition = 64, 
		RULE_classDefination = 65, RULE_classModesGeneral = 66, RULE_classModes = 67, 
		RULE_arrayAccessElements = 68, RULE_arrayAccessElementsItems = 69, RULE_accessBlockAr = 70, 
		RULE_arrayIndexAccess = 71, RULE_generalValue = 72, RULE_objIdentifierA = 73, 
		RULE_objIdentifierB = 74;
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
			"conditionalExpElementsValue", "conditionExpBlock", "conditionalExpValue", 
			"loop", "loopExpression", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
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
			setState(150);
			fileContent(0);
			setState(151);
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
			setState(158);
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
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					sentence();
					}
					} 
				}
				setState(160);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
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
			setState(172);
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
			setState(174);
			match(Use);
			setState(175);
			useValue();
			setState(176);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				useString();
				setState(180);
				match(Separator);
				setState(181);
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
			setState(185);
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
			setState(187);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(Var);
				setState(190);
				variableMembers();
				setState(191);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				methodPerm();
				setState(194);
				match(Var);
				setState(195);
				variableMembers();
				setState(196);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(Static);
				setState(199);
				match(Var);
				setState(200);
				variableMembers();
				setState(201);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				methodPerm();
				setState(204);
				match(Static);
				setState(205);
				match(Var);
				setState(206);
				variableMembers();
				setState(207);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(Final);
				setState(210);
				methodPerm();
				setState(211);
				match(Static);
				setState(212);
				match(Var);
				setState(213);
				variableMembers();
				setState(214);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(Final);
				setState(217);
				methodPerm();
				setState(218);
				match(Var);
				setState(219);
				variableMembers();
				setState(220);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				match(Final);
				setState(223);
				match(Var);
				setState(224);
				variableMembers();
				setState(225);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				match(Final);
				setState(228);
				match(Static);
				setState(229);
				match(Var);
				setState(230);
				variableMembers();
				setState(231);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				variableMembers();
				setState(234);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				variableDefinition();
				setState(240);
				match(Separator);
				setState(241);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(Identifier);
				setState(246);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				objIdentifierA();
				setState(248);
				match(Point);
				setState(249);
				objIdentifierB();
				setState(250);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				objIdentifierA();
				setState(253);
				match(TwoTwoPoint);
				setState(254);
				objIdentifierB();
				setState(255);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				arrayAccessElements();
				setState(258);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(TypeSpec);
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(New);
				setState(269);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(TypeSpec);
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				match(New);
				setState(273);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(OpenArIndex);
				setState(277);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(OpenArIndex);
				setState(279);
				indexArrayElements();
				setState(280);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				generalValue();
				setState(286);
				match(Separator);
				setState(287);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(OpenBlock);
				setState(292);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(OpenBlock);
				setState(294);
				associativeArrayElements();
				setState(295);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(Identifier);
				setState(300);
				match(TwoPoint);
				setState(301);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(Identifier);
				setState(303);
				match(TwoPoint);
				setState(304);
				generalValue();
				setState(305);
				match(Separator);
				setState(306);
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
			setState(310);
			match(OpenOp);
			setState(311);
			operationElements();
			setState(312);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				operationValue();
				setState(316);
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				functionCall();
				setState(322);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				functionCall();
				setState(325);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				functionCall();
				setState(328);
				match(TypeSpec);
				setState(329);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(Identifier);
				setState(333);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				match(Identifier);
				setState(335);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				match(Identifier);
				setState(337);
				match(TypeSpec);
				setState(338);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(339);
				firstIncDec();
				setState(340);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
				firstIncDec();
				setState(343);
				match(Identifier);
				setState(344);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(346);
				firstIncDec();
				setState(347);
				match(Identifier);
				setState(348);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(350);
				firstIncDec();
				setState(351);
				match(Identifier);
				setState(352);
				match(TypeSpec);
				setState(353);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(355);
				match(Identifier);
				setState(356);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(357);
				match(Identifier);
				setState(358);
				lastIncDec();
				setState(359);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(361);
				match(Identifier);
				setState(362);
				lastIncDec();
				setState(363);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(365);
				match(Identifier);
				setState(366);
				lastIncDec();
				setState(367);
				match(TypeSpec);
				setState(368);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(370);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(371);
				match(Integer);
				setState(372);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(373);
				match(Integer);
				setState(374);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(375);
				match(Integer);
				setState(376);
				match(TypeSpec);
				setState(377);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(378);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(379);
				match(Float);
				setState(380);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(381);
				match(Float);
				setState(382);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(383);
				match(Float);
				setState(384);
				match(TypeSpec);
				setState(385);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(386);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(387);
				operationBlock();
				setState(388);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(390);
				operationBlock();
				setState(391);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(393);
				operationBlock();
				setState(394);
				match(TypeSpec);
				setState(395);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(397);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(398);
				arrayAccessElements();
				setState(399);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(401);
				arrayAccessElements();
				setState(402);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(404);
				arrayAccessElements();
				setState(405);
				match(TypeSpec);
				setState(406);
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
			setState(410);
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
			setState(412);
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
			setState(414);
			functionCall();
			setState(415);
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
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(Identifier);
				setState(418);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(Identifier);
				setState(420);
				match(Point);
				setState(421);
				identifierB();
				setState(422);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(Identifier);
				setState(425);
				match(TwoTwoPoint);
				setState(426);
				identifierB();
				setState(427);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				match(Identifier);
				setState(430);
				match(Point);
				setState(431);
				identifierB();
				setState(432);
				functionCallParam();
				setState(433);
				pointSeparator();
				setState(434);
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
			setState(438);
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
			setState(440);
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
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(OpenOp);
				setState(443);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(OpenOp);
				setState(445);
				functionCallParamElements();
				setState(446);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				generalValue();
				setState(452);
				match(Separator);
				setState(453);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				operationElements();
				setState(457);
				match(Separator);
				setState(458);
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				conditionalExpressionStructBlock();
				setState(464);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				ifElementUnique();
				setState(470);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				ifElementUnique();
				setState(473);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				ifElementUnique();
				setState(476);
				elifElements();
				setState(477);
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
			setState(481);
			match(If);
			setState(482);
			conditionalExpressionItems();
			setState(483);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				elifElementUnique();
				setState(487);
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
			setState(491);
			match(Elif);
			setState(492);
			conditionalExpressionItems();
			setState(493);
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
			setState(495);
			match(Else);
			setState(496);
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
			setState(498);
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
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(OpenBlock);
				setState(501);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(OpenBlock);
				setState(503);
				conditionalBlockElsItems();
				setState(504);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				sentence();
				setState(514);
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
		public ConditionalExpElementsValueContext conditionalExpElementsValue() {
			return getRuleContext(ConditionalExpElementsValueContext.class,0);
		}
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public ConditionExpBlockContext conditionExpBlock() {
			return getRuleContext(ConditionExpBlockContext.class,0);
		}
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public ConditionalExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionElements; }
	}

	public final ConditionalExpressionElementsContext conditionalExpressionElements() throws RecognitionException {
		ConditionalExpressionElementsContext _localctx = new ConditionalExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditionalExpressionElements);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				conditionalExpElementsValue();
				setState(520);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				conditionExpBlock(0);
				setState(524);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				match(Not);
				setState(527);
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

	public static class ConditionalExpElementsValueContext extends ParserRuleContext {
		public ConditionalExpValueContext conditionalExpValue() {
			return getRuleContext(ConditionalExpValueContext.class,0);
		}
		public ConditionalExpElementsValueContext conditionalExpElementsValue() {
			return getRuleContext(ConditionalExpElementsValueContext.class,0);
		}
		public ConditionalExpElementsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpElementsValue; }
	}

	public final ConditionalExpElementsValueContext conditionalExpElementsValue() throws RecognitionException {
		ConditionalExpElementsValueContext _localctx = new ConditionalExpElementsValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionalExpElementsValue);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				conditionalExpValue();
				setState(532);
				conditionalExpElementsValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public ConditionExpBlockContext conditionExpBlock() {
			return getRuleContext(ConditionExpBlockContext.class,0);
		}
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public ConditionExpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlock; }
	}

	public final ConditionExpBlockContext conditionExpBlock() throws RecognitionException {
		return conditionExpBlock(0);
	}

	private ConditionExpBlockContext conditionExpBlock(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionExpBlockContext _localctx = new ConditionExpBlockContext(_ctx, _parentState);
		ConditionExpBlockContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(537);
			match(OpenOp);
			setState(538);
			conditionalExpressionElements();
			setState(539);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpBlock);
					setState(541);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(542);
					match(AssignmentOperator);
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ConditionalExpValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
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
		enterRule(_localctx, 78, RULE_conditionalExpValue);
		int _la;
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(Identifier);
				setState(550);
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
				setState(551);
				match(Identifier);
				setState(552);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				match(Identifier);
				setState(554);
				match(TypeSpec);
				setState(555);
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
				setState(556);
				firstIncDec();
				setState(557);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				firstIncDec();
				setState(560);
				match(Identifier);
				setState(561);
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
				setState(563);
				firstIncDec();
				setState(564);
				match(Identifier);
				setState(565);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(567);
				firstIncDec();
				setState(568);
				match(Identifier);
				setState(569);
				match(TypeSpec);
				setState(570);
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
				setState(572);
				match(Identifier);
				setState(573);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(574);
				match(Identifier);
				setState(575);
				lastIncDec();
				setState(576);
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
				setState(578);
				match(Identifier);
				setState(579);
				lastIncDec();
				setState(580);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(582);
				match(Identifier);
				setState(583);
				lastIncDec();
				setState(584);
				match(TypeSpec);
				setState(585);
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
				setState(587);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(588);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(590);
				match(Integer);
				setState(591);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(592);
				match(Integer);
				setState(593);
				match(TypeSpec);
				setState(594);
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
				setState(595);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(596);
				match(Float);
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(598);
				match(Float);
				setState(599);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(600);
				match(Float);
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(603);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(604);
				functionCall();
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
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(607);
				functionCall();
				setState(608);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(610);
				functionCall();
				setState(611);
				match(TypeSpec);
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(614);
				match(Identifier);
				setState(615);
				match(Attr);
				setState(616);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(617);
				match(Identifier);
				setState(618);
				match(Attr);
				setState(619);
				functionCall();
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
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(622);
				match(Identifier);
				setState(623);
				match(Attr);
				setState(624);
				functionCall();
				setState(625);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(627);
				match(Identifier);
				setState(628);
				match(Attr);
				setState(629);
				functionCall();
				setState(630);
				match(TypeSpec);
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
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(633);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(634);
				operationBlock();
				setState(635);
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(637);
				operationBlock();
				setState(638);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(640);
				operationBlock();
				setState(641);
				match(TypeSpec);
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
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(644);
				arrayAccessElements();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(645);
				arrayAccessElements();
				setState(646);
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
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(648);
				arrayAccessElements();
				setState(649);
				match(TypeSpec);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(651);
				arrayAccessElements();
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_loop);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(For);
				setState(658);
				loopExpression();
				setState(659);
				match(OpenBlock);
				setState(660);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(For);
				setState(663);
				loopExpression();
				setState(664);
				match(OpenBlock);
				setState(665);
				loopBlockElements();
				setState(666);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(For);
				setState(669);
				loopExpression();
				setState(670);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				match(For);
				setState(673);
				loopExpression();
				setState(674);
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
		enterRule(_localctx, 82, RULE_loopExpression);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(OpenOp);
				setState(679);
				loopOneMembers();
				setState(680);
				match(End);
				setState(681);
				loopTwoMembers();
				setState(682);
				match(End);
				setState(683);
				loopThreeMembers();
				setState(684);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				loopOneMembers();
				setState(687);
				match(End);
				setState(688);
				loopTwoMembers();
				setState(689);
				match(End);
				setState(690);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(OpenOp);
				setState(694);
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
		enterRule(_localctx, 84, RULE_loopOneMembers);
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
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
		enterRule(_localctx, 86, RULE_loopTwoMembers);
		try {
			setState(704);
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
				setState(702);
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
		enterRule(_localctx, 88, RULE_loopThreeMembers);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
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
		enterRule(_localctx, 90, RULE_loopThreeMembersValues);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				operationElements();
				setState(713);
				match(Separator);
				setState(714);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				operationBlock();
				setState(717);
				match(Separator);
				setState(718);
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
		enterRule(_localctx, 92, RULE_loopBlockElements);
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				sentence();
				setState(724);
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
		enterRule(_localctx, 94, RULE_loopBlockElementsLimited);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				loop();
				setState(730);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
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
		enterRule(_localctx, 96, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(Ret);
			setState(737);
			retValues();
			setState(738);
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
		enterRule(_localctx, 98, RULE_retValues);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
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
		enterRule(_localctx, 100, RULE_functions);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				functionsModes();
				setState(746);
				match(OpenBlock);
				setState(747);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				functionsModes();
				setState(750);
				match(OpenBlock);
				setState(751);
				functionCodeBlock();
				setState(752);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				functionMethodsModes();
				setState(755);
				match(OpenBlock);
				setState(756);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				functionMethodsModes();
				setState(759);
				match(OpenBlock);
				setState(760);
				functionCodeBlock();
				setState(761);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(763);
				constructClassMethod();
				setState(764);
				match(OpenBlock);
				setState(765);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(767);
				constructClassMethod();
				setState(768);
				match(OpenBlock);
				setState(769);
				functionCodeBlock();
				setState(770);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(772);
				interfaceMethod();
				setState(773);
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
		enterRule(_localctx, 102, RULE_functionGeneralModes);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(Function);
				setState(778);
				match(Identifier);
				setState(779);
				match(OpenOp);
				setState(780);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(Function);
				setState(782);
				match(Identifier);
				setState(783);
				match(OpenOp);
				setState(784);
				match(CloseOp);
				setState(785);
				match(ArrowRight);
				setState(786);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				match(Function);
				setState(788);
				match(Identifier);
				setState(789);
				match(OpenOp);
				setState(790);
				functionParams();
				setState(791);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				match(Function);
				setState(794);
				match(Identifier);
				setState(795);
				match(OpenOp);
				setState(796);
				functionParams();
				setState(797);
				match(CloseOp);
				setState(798);
				match(ArrowRight);
				setState(799);
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
		enterRule(_localctx, 104, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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
		enterRule(_localctx, 106, RULE_functionMethodsModes);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				methodPerm();
				setState(806);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(Static);
				setState(809);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				methodPerm();
				setState(811);
				match(Static);
				setState(812);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				match(Final);
				setState(815);
				methodPerm();
				setState(816);
				match(Static);
				setState(817);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(819);
				match(Final);
				setState(820);
				methodPerm();
				setState(821);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				match(Final);
				setState(824);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				match(Final);
				setState(826);
				match(Static);
				setState(827);
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
		enterRule(_localctx, 108, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
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
		enterRule(_localctx, 110, RULE_constructClassMethod);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(Identifier);
				setState(833);
				match(OpenOp);
				setState(834);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(Identifier);
				setState(836);
				match(OpenOp);
				setState(837);
				functionParams();
				setState(838);
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
		enterRule(_localctx, 112, RULE_interfaceMethod);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
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
				setState(843);
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
		enterRule(_localctx, 114, RULE_functionCodeBlock);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
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
		enterRule(_localctx, 116, RULE_functionParams);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				functionParamElements();
				setState(854);
				match(Separator);
				setState(855);
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
		enterRule(_localctx, 118, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(Identifier);
			setState(860);
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
		enterRule(_localctx, 120, RULE_oopGeneral);
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
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
		enterRule(_localctx, 122, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
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
		enterRule(_localctx, 124, RULE_interfaceClassDefinition);
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(Interface);
				setState(870);
				match(Identifier);
				setState(871);
				match(OpenBlock);
				setState(872);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(Interface);
				setState(874);
				match(Identifier);
				setState(875);
				match(OpenBlock);
				setState(876);
				functionCodeBlock();
				setState(877);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(Interface);
				setState(880);
				match(Identifier);
				setState(881);
				match(Extends);
				setState(882);
				match(Identifier);
				setState(883);
				match(OpenBlock);
				setState(884);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(Interface);
				setState(886);
				match(Identifier);
				setState(887);
				match(Extends);
				setState(888);
				match(Identifier);
				setState(889);
				match(OpenBlock);
				setState(890);
				functionCodeBlock();
				setState(891);
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
		enterRule(_localctx, 126, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
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
		enterRule(_localctx, 128, RULE_abstractClassDefinition);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(Abstract);
				setState(898);
				match(Identifier);
				setState(899);
				match(OpenBlock);
				setState(900);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(Abstract);
				setState(902);
				match(Identifier);
				setState(903);
				match(OpenBlock);
				setState(904);
				functionCodeBlock();
				setState(905);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				match(Abstract);
				setState(908);
				match(Identifier);
				setState(909);
				match(Extends);
				setState(910);
				match(Identifier);
				setState(911);
				match(OpenBlock);
				setState(912);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(913);
				match(Abstract);
				setState(914);
				match(Identifier);
				setState(915);
				match(Extends);
				setState(916);
				match(Identifier);
				setState(917);
				match(OpenBlock);
				setState(918);
				functionCodeBlock();
				setState(919);
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
		enterRule(_localctx, 130, RULE_classDefination);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				classModesGeneral();
				setState(924);
				match(OpenBlock);
				setState(925);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				classModesGeneral();
				setState(928);
				match(OpenBlock);
				setState(929);
				functionCodeBlock();
				setState(930);
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
		enterRule(_localctx, 132, RULE_classModesGeneral);
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(Final);
				setState(936);
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
		enterRule(_localctx, 134, RULE_classModes);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(Class);
				setState(940);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(Class);
				setState(942);
				match(Identifier);
				setState(943);
				match(Extends);
				setState(944);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				match(Class);
				setState(946);
				match(Identifier);
				setState(947);
				match(Implements);
				setState(948);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(949);
				match(Class);
				setState(950);
				match(Identifier);
				setState(951);
				match(Extends);
				setState(952);
				match(Identifier);
				setState(953);
				match(Implements);
				setState(954);
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
		enterRule(_localctx, 136, RULE_arrayAccessElements);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				arrayAccessElementsItems();
				setState(959);
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
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arrayAccessElementsItems);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(Identifier);
				setState(965);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Identifier);
				setState(967);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(968);
				match(Identifier);
				setState(969);
				accessBlockAr();
				setState(970);
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
		enterRule(_localctx, 140, RULE_accessBlockAr);
		try {
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				match(OpenArIndex);
				setState(975);
				arrayIndexAccess();
				setState(976);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(OpenArIndex);
				setState(979);
				arrayIndexAccess();
				setState(980);
				match(CloseArIndex);
				setState(981);
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
		enterRule(_localctx, 142, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
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
		enterRule(_localctx, 144, RULE_generalValue);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				match(Identifier);
				setState(989);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				match(Integer);
				setState(992);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(993);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(994);
				match(Float);
				setState(995);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(996);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(997);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(998);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(999);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1000);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1001);
				objIdentifierA();
				setState(1002);
				match(Point);
				setState(1003);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1005);
				objIdentifierA();
				setState(1006);
				match(TwoTwoPoint);
				setState(1007);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
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

	public static class ObjIdentifierAContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public ObjIdentifierAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdentifierA; }
	}

	public final ObjIdentifierAContext objIdentifierA() throws RecognitionException {
		ObjIdentifierAContext _localctx = new ObjIdentifierAContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
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
		enterRule(_localctx, 148, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		case 38:
			return conditionExpBlock_sempred((ConditionExpBlockContext)_localctx, predIndex);
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
	private boolean conditionExpBlock_sempred(ConditionExpBlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u03fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u009f\n\3\f\3\16\3\u00a2"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ad\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00ba\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00f6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0107\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0115\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011d\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0124\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u012c\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0137\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0141\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u019b\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u01b7\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u01c3\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01cf\n\34\3\35\3\35\3\35\3\35\5\35\u01d5\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01e2\n\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \5 \u01ec\n \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0201\n$\3%\3%\3%\3%\5%\u0207\n%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u0213\n&\3\'\3\'\3\'\3\'\5\'\u0219\n\'\3(\3"+
		"(\3(\3(\3(\3(\3(\7(\u0222\n(\f(\16(\u0225\13(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\5)\u0292\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u02a7\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u02bb\n+\3,\3,\5,\u02bf\n,\3-\3-\5-\u02c3\n-\3."+
		"\3.\5.\u02c7\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02d3\n/\3\60\3\60\3"+
		"\60\3\60\5\60\u02d9\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02e1\n\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u02ea\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u030a"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0324\n\65"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u033f\n\67"+
		"\38\38\39\39\39\39\39\39\39\39\59\u034b\n9\3:\3:\5:\u034f\n:\3;\3;\3;"+
		"\3;\5;\u0355\n;\3<\3<\3<\3<\3<\5<\u035c\n<\3=\3=\3=\3>\3>\3>\5>\u0364"+
		"\n>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\5@\u0380\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u039c\nB\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\5C\u03a7\nC\3D\3D\3D\5D\u03ac\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\5E\u03be\nE\3F\3F\3F\3F\5F\u03c4\nF\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\5G\u03cf\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03da\nH\3I\3I\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J"+
		"\u03f5\nJ\3K\3K\3L\3L\3L\2\4\4NM\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\2\5\4\2\30"+
		"\30$$\3\2#$\3\2\13\r\2\u046c\2\u0098\3\2\2\2\4\u009b\3\2\2\2\6\u00ac\3"+
		"\2\2\2\b\u00ae\3\2\2\2\n\u00b0\3\2\2\2\f\u00b9\3\2\2\2\16\u00bb\3\2\2"+
		"\2\20\u00bd\3\2\2\2\22\u00ee\3\2\2\2\24\u00f5\3\2\2\2\26\u0106\3\2\2\2"+
		"\30\u0114\3\2\2\2\32\u011c\3\2\2\2\34\u0123\3\2\2\2\36\u012b\3\2\2\2 "+
		"\u0136\3\2\2\2\"\u0138\3\2\2\2$\u0140\3\2\2\2&\u019a\3\2\2\2(\u019c\3"+
		"\2\2\2*\u019e\3\2\2\2,\u01a0\3\2\2\2.\u01b6\3\2\2\2\60\u01b8\3\2\2\2\62"+
		"\u01ba\3\2\2\2\64\u01c2\3\2\2\2\66\u01ce\3\2\2\28\u01d4\3\2\2\2:\u01e1"+
		"\3\2\2\2<\u01e3\3\2\2\2>\u01eb\3\2\2\2@\u01ed\3\2\2\2B\u01f1\3\2\2\2D"+
		"\u01f4\3\2\2\2F\u0200\3\2\2\2H\u0206\3\2\2\2J\u0212\3\2\2\2L\u0218\3\2"+
		"\2\2N\u021a\3\2\2\2P\u0291\3\2\2\2R\u02a6\3\2\2\2T\u02ba\3\2\2\2V\u02be"+
		"\3\2\2\2X\u02c2\3\2\2\2Z\u02c6\3\2\2\2\\\u02d2\3\2\2\2^\u02d8\3\2\2\2"+
		"`\u02e0\3\2\2\2b\u02e2\3\2\2\2d\u02e9\3\2\2\2f\u0309\3\2\2\2h\u0323\3"+
		"\2\2\2j\u0325\3\2\2\2l\u033e\3\2\2\2n\u0340\3\2\2\2p\u034a\3\2\2\2r\u034e"+
		"\3\2\2\2t\u0354\3\2\2\2v\u035b\3\2\2\2x\u035d\3\2\2\2z\u0363\3\2\2\2|"+
		"\u0365\3\2\2\2~\u037f\3\2\2\2\u0080\u0381\3\2\2\2\u0082\u039b\3\2\2\2"+
		"\u0084\u03a6\3\2\2\2\u0086\u03ab\3\2\2\2\u0088\u03bd\3\2\2\2\u008a\u03c3"+
		"\3\2\2\2\u008c\u03ce\3\2\2\2\u008e\u03d9\3\2\2\2\u0090\u03db\3\2\2\2\u0092"+
		"\u03f4\3\2\2\2\u0094\u03f6\3\2\2\2\u0096\u03f8\3\2\2\2\u0098\u0099\5\4"+
		"\3\2\u0099\u009a\7\2\2\3\u009a\3\3\2\2\2\u009b\u00a0\b\3\1\2\u009c\u009d"+
		"\f\4\2\2\u009d\u009f\5\6\4\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\5\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00ad\5\b\5\2\u00a4\u00ad\5\n\6\2\u00a5\u00ad\5\20\t\2\u00a6\u00ad"+
		"\5,\27\2\u00a7\u00ad\58\35\2\u00a8\u00ad\5R*\2\u00a9\u00ad\5f\64\2\u00aa"+
		"\u00ad\5b\62\2\u00ab\u00ad\5z>\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4\3\2\2"+
		"\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00a8"+
		"\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\7\3\2\2\2\u00ae\u00af\7.\2\2\u00af\t\3\2\2\2\u00b0\u00b1\7\3\2\2\u00b1"+
		"\u00b2\5\f\7\2\u00b2\u00b3\7\27\2\2\u00b3\13\3\2\2\2\u00b4\u00ba\5\16"+
		"\b\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5\f\7\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\r\3\2\2\2"+
		"\u00bb\u00bc\7*\2\2\u00bc\17\3\2\2\2\u00bd\u00be\5\22\n\2\u00be\21\3\2"+
		"\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\27\2\2\u00c2"+
		"\u00ef\3\2\2\2\u00c3\u00c4\5n8\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\5\24"+
		"\13\2\u00c6\u00c7\7\27\2\2\u00c7\u00ef\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\7\27\2\2\u00cc\u00ef"+
		"\3\2\2\2\u00cd\u00ce\5n8\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\7\4\2\2\u00d0"+
		"\u00d1\5\24\13\2\u00d1\u00d2\7\27\2\2\u00d2\u00ef\3\2\2\2\u00d3\u00d4"+
		"\7\17\2\2\u00d4\u00d5\5n8\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\7\4\2\2\u00d7"+
		"\u00d8\5\24\13\2\u00d8\u00d9\7\27\2\2\u00d9\u00ef\3\2\2\2\u00da\u00db"+
		"\7\17\2\2\u00db\u00dc\5n8\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5\24\13\2"+
		"\u00de\u00df\7\27\2\2\u00df\u00ef\3\2\2\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2"+
		"\7\4\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00e4\7\27\2\2\u00e4\u00ef\3\2\2"+
		"\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\7\4\2\2\u00e8"+
		"\u00e9\5\24\13\2\u00e9\u00ea\7\27\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00ec"+
		"\5\24\13\2\u00ec\u00ed\7\27\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00bf\3\2\2"+
		"\2\u00ee\u00c3\3\2\2\2\u00ee\u00c8\3\2\2\2\u00ee\u00cd\3\2\2\2\u00ee\u00d3"+
		"\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00e0\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00f6\5\26\f\2\u00f1\u00f2\5\26"+
		"\f\2\u00f2\u00f3\7\34\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\25\3\2\2\2\u00f7\u00f8\7\'\2"+
		"\2\u00f8\u0107\5\30\r\2\u00f9\u00fa\5\u0094K\2\u00fa\u00fb\7\31\2\2\u00fb"+
		"\u00fc\5\u0096L\2\u00fc\u00fd\5\30\r\2\u00fd\u0107\3\2\2\2\u00fe\u00ff"+
		"\5\u0094K\2\u00ff\u0100\7\33\2\2\u0100\u0101\5\u0096L\2\u0101\u0102\5"+
		"\30\r\2\u0102\u0107\3\2\2\2\u0103\u0104\5\u008aF\2\u0104\u0105\5\30\r"+
		"\2\u0105\u0107\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00f9\3\2\2\2\u0106\u00fe"+
		"\3\2\2\2\u0106\u0103\3\2\2\2\u0107\27\3\2\2\2\u0108\u0109\t\2\2\2\u0109"+
		"\u0115\5\u0092J\2\u010a\u010b\7)\2\2\u010b\u010c\t\2\2\2\u010c\u0115\5"+
		"\u0092J\2\u010d\u010e\t\2\2\2\u010e\u010f\7\25\2\2\u010f\u0115\5\u0092"+
		"J\2\u0110\u0111\7)\2\2\u0111\u0112\t\2\2\2\u0112\u0113\7\25\2\2\u0113"+
		"\u0115\5\u0092J\2\u0114\u0108\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010d"+
		"\3\2\2\2\u0114\u0110\3\2\2\2\u0115\31\3\2\2\2\u0116\u0117\7\35\2\2\u0117"+
		"\u011d\7\36\2\2\u0118\u0119\7\35\2\2\u0119\u011a\5\34\17\2\u011a\u011b"+
		"\7\36\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0118\3\2\2\2"+
		"\u011d\33\3\2\2\2\u011e\u0124\5\u0092J\2\u011f\u0120\5\u0092J\2\u0120"+
		"\u0121\7\34\2\2\u0121\u0122\5\34\17\2\u0122\u0124\3\2\2\2\u0123\u011e"+
		"\3\2\2\2\u0123\u011f\3\2\2\2\u0124\35\3\2\2\2\u0125\u0126\7\37\2\2\u0126"+
		"\u012c\7 \2\2\u0127\u0128\7\37\2\2\u0128\u0129\5 \21\2\u0129\u012a\7 "+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012c"+
		"\37\3\2\2\2\u012d\u012e\7\'\2\2\u012e\u012f\7\32\2\2\u012f\u0137\5\u0092"+
		"J\2\u0130\u0131\7\'\2\2\u0131\u0132\7\32\2\2\u0132\u0133\5\u0092J\2\u0133"+
		"\u0134\7\34\2\2\u0134\u0135\5 \21\2\u0135\u0137\3\2\2\2\u0136\u012d\3"+
		"\2\2\2\u0136\u0130\3\2\2\2\u0137!\3\2\2\2\u0138\u0139\7!\2\2\u0139\u013a"+
		"\5$\23\2\u013a\u013b\7\"\2\2\u013b#\3\2\2\2\u013c\u0141\5&\24\2\u013d"+
		"\u013e\5&\24\2\u013e\u013f\5$\23\2\u013f\u0141\3\2\2\2\u0140\u013c\3\2"+
		"\2\2\u0140\u013d\3\2\2\2\u0141%\3\2\2\2\u0142\u019b\5.\30\2\u0143\u0144"+
		"\5.\30\2\u0144\u0145\7#\2\2\u0145\u019b\3\2\2\2\u0146\u0147\5.\30\2\u0147"+
		"\u0148\7)\2\2\u0148\u019b\3\2\2\2\u0149\u014a\5.\30\2\u014a\u014b\7)\2"+
		"\2\u014b\u014c\7#\2\2\u014c\u019b\3\2\2\2\u014d\u019b\7\'\2\2\u014e\u014f"+
		"\7\'\2\2\u014f\u019b\7#\2\2\u0150\u0151\7\'\2\2\u0151\u019b\7)\2\2\u0152"+
		"\u0153\7\'\2\2\u0153\u0154\7)\2\2\u0154\u019b\7#\2\2\u0155\u0156\5(\25"+
		"\2\u0156\u0157\7\'\2\2\u0157\u019b\3\2\2\2\u0158\u0159\5(\25\2\u0159\u015a"+
		"\7\'\2\2\u015a\u015b\7#\2\2\u015b\u019b\3\2\2\2\u015c\u015d\5(\25\2\u015d"+
		"\u015e\7\'\2\2\u015e\u015f\7)\2\2\u015f\u019b\3\2\2\2\u0160\u0161\5(\25"+
		"\2\u0161\u0162\7\'\2\2\u0162\u0163\7)\2\2\u0163\u0164\7#\2\2\u0164\u019b"+
		"\3\2\2\2\u0165\u0166\7\'\2\2\u0166\u019b\5*\26\2\u0167\u0168\7\'\2\2\u0168"+
		"\u0169\5*\26\2\u0169\u016a\7#\2\2\u016a\u019b\3\2\2\2\u016b\u016c\7\'"+
		"\2\2\u016c\u016d\5*\26\2\u016d\u016e\7)\2\2\u016e\u019b\3\2\2\2\u016f"+
		"\u0170\7\'\2\2\u0170\u0171\5*\26\2\u0171\u0172\7)\2\2\u0172\u0173\7#\2"+
		"\2\u0173\u019b\3\2\2\2\u0174\u019b\7+\2\2\u0175\u0176\7+\2\2\u0176\u019b"+
		"\7#\2\2\u0177\u0178\7+\2\2\u0178\u019b\7)\2\2\u0179\u017a\7+\2\2\u017a"+
		"\u017b\7)\2\2\u017b\u019b\7#\2\2\u017c\u019b\7,\2\2\u017d\u017e\7,\2\2"+
		"\u017e\u019b\7#\2\2\u017f\u0180\7,\2\2\u0180\u019b\7)\2\2\u0181\u0182"+
		"\7,\2\2\u0182\u0183\7)\2\2\u0183\u019b\7#\2\2\u0184\u019b\5\"\22\2\u0185"+
		"\u0186\5\"\22\2\u0186\u0187\7#\2\2\u0187\u019b\3\2\2\2\u0188\u0189\5\""+
		"\22\2\u0189\u018a\7)\2\2\u018a\u019b\3\2\2\2\u018b\u018c\5\"\22\2\u018c"+
		"\u018d\7)\2\2\u018d\u018e\7#\2\2\u018e\u019b\3\2\2\2\u018f\u019b\5\u008a"+
		"F\2\u0190\u0191\5\u008aF\2\u0191\u0192\7#\2\2\u0192\u019b\3\2\2\2\u0193"+
		"\u0194\5\u008aF\2\u0194\u0195\7)\2\2\u0195\u019b\3\2\2\2\u0196\u0197\5"+
		"\u008aF\2\u0197\u0198\7)\2\2\u0198\u0199\7#\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0142\3\2\2\2\u019a\u0143\3\2\2\2\u019a\u0146\3\2\2\2\u019a\u0149\3\2"+
		"\2\2\u019a\u014d\3\2\2\2\u019a\u014e\3\2\2\2\u019a\u0150\3\2\2\2\u019a"+
		"\u0152\3\2\2\2\u019a\u0155\3\2\2\2\u019a\u0158\3\2\2\2\u019a\u015c\3\2"+
		"\2\2\u019a\u0160\3\2\2\2\u019a\u0165\3\2\2\2\u019a\u0167\3\2\2\2\u019a"+
		"\u016b\3\2\2\2\u019a\u016f\3\2\2\2\u019a\u0174\3\2\2\2\u019a\u0175\3\2"+
		"\2\2\u019a\u0177\3\2\2\2\u019a\u0179\3\2\2\2\u019a\u017c\3\2\2\2\u019a"+
		"\u017d\3\2\2\2\u019a\u017f\3\2\2\2\u019a\u0181\3\2\2\2\u019a\u0184\3\2"+
		"\2\2\u019a\u0185\3\2\2\2\u019a\u0188\3\2\2\2\u019a\u018b\3\2\2\2\u019a"+
		"\u018f\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0193\3\2\2\2\u019a\u0196\3\2"+
		"\2\2\u019b\'\3\2\2\2\u019c\u019d\7&\2\2\u019d)\3\2\2\2\u019e\u019f\7&"+
		"\2\2\u019f+\3\2\2\2\u01a0\u01a1\5.\30\2\u01a1\u01a2\7\27\2\2\u01a2-\3"+
		"\2\2\2\u01a3\u01a4\7\'\2\2\u01a4\u01b7\5\64\33\2\u01a5\u01a6\7\'\2\2\u01a6"+
		"\u01a7\7\31\2\2\u01a7\u01a8\5\60\31\2\u01a8\u01a9\5\64\33\2\u01a9\u01b7"+
		"\3\2\2\2\u01aa\u01ab\7\'\2\2\u01ab\u01ac\7\33\2\2\u01ac\u01ad\5\60\31"+
		"\2\u01ad\u01ae\5\64\33\2\u01ae\u01b7\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0"+
		"\u01b1\7\31\2\2\u01b1\u01b2\5\60\31\2\u01b2\u01b3\5\64\33\2\u01b3\u01b4"+
		"\5\62\32\2\u01b4\u01b5\5.\30\2\u01b5\u01b7\3\2\2\2\u01b6\u01a3\3\2\2\2"+
		"\u01b6\u01a5\3\2\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01af\3\2\2\2\u01b7/\3"+
		"\2\2\2\u01b8\u01b9\7\'\2\2\u01b9\61\3\2\2\2\u01ba\u01bb\7\31\2\2\u01bb"+
		"\63\3\2\2\2\u01bc\u01bd\7!\2\2\u01bd\u01c3\7\"\2\2\u01be\u01bf\7!\2\2"+
		"\u01bf\u01c0\5\66\34\2\u01c0\u01c1\7\"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bc"+
		"\3\2\2\2\u01c2\u01be\3\2\2\2\u01c3\65\3\2\2\2\u01c4\u01cf\5\u0092J\2\u01c5"+
		"\u01c6\5\u0092J\2\u01c6\u01c7\7\34\2\2\u01c7\u01c8\5\66\34\2\u01c8\u01cf"+
		"\3\2\2\2\u01c9\u01cf\5$\23\2\u01ca\u01cb\5$\23\2\u01cb\u01cc\7\34\2\2"+
		"\u01cc\u01cd\5\66\34\2\u01cd\u01cf\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c5"+
		"\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\67\3\2\2\2\u01d0"+
		"\u01d5\5:\36\2\u01d1\u01d2\5:\36\2\u01d2\u01d3\58\35\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d59\3\2\2\2\u01d6\u01e2"+
		"\5<\37\2\u01d7\u01d8\5<\37\2\u01d8\u01d9\5> \2\u01d9\u01e2\3\2\2\2\u01da"+
		"\u01db\5<\37\2\u01db\u01dc\5B\"\2\u01dc\u01e2\3\2\2\2\u01dd\u01de\5<\37"+
		"\2\u01de\u01df\5> \2\u01df\u01e0\5B\"\2\u01e0\u01e2\3\2\2\2\u01e1\u01d6"+
		"\3\2\2\2\u01e1\u01d7\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e2"+
		";\3\2\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e5\5D#\2\u01e5\u01e6\5F$\2\u01e6"+
		"=\3\2\2\2\u01e7\u01ec\5@!\2\u01e8\u01e9\5@!\2\u01e9\u01ea\5> \2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01ec?\3\2\2\2"+
		"\u01ed\u01ee\7\6\2\2\u01ee\u01ef\5D#\2\u01ef\u01f0\5F$\2\u01f0A\3\2\2"+
		"\2\u01f1\u01f2\7\7\2\2\u01f2\u01f3\5F$\2\u01f3C\3\2\2\2\u01f4\u01f5\5"+
		"J&\2\u01f5E\3\2\2\2\u01f6\u01f7\7\37\2\2\u01f7\u0201\7 \2\2\u01f8\u01f9"+
		"\7\37\2\2\u01f9\u01fa\5H%\2\u01fa\u01fb\7 \2\2\u01fb\u0201\3\2\2\2\u01fc"+
		"\u0201\58\35\2\u01fd\u0201\5,\27\2\u01fe\u0201\5R*\2\u01ff\u0201\5b\62"+
		"\2\u0200\u01f6\3\2\2\2\u0200\u01f8\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201G\3\2\2\2\u0202"+
		"\u0207\5\6\4\2\u0203\u0204\5\6\4\2\u0204\u0205\5H%\2\u0205\u0207\3\2\2"+
		"\2\u0206\u0202\3\2\2\2\u0206\u0203\3\2\2\2\u0207I\3\2\2\2\u0208\u0213"+
		"\5L\'\2\u0209\u020a\5L\'\2\u020a\u020b\5J&\2\u020b\u0213\3\2\2\2\u020c"+
		"\u0213\5N(\2\u020d\u020e\5N(\2\u020e\u020f\5J&\2\u020f\u0213\3\2\2\2\u0210"+
		"\u0211\7%\2\2\u0211\u0213\5J&\2\u0212\u0208\3\2\2\2\u0212\u0209\3\2\2"+
		"\2\u0212\u020c\3\2\2\2\u0212\u020d\3\2\2\2\u0212\u0210\3\2\2\2\u0213K"+
		"\3\2\2\2\u0214\u0219\5P)\2\u0215\u0216\5P)\2\u0216\u0217\5L\'\2\u0217"+
		"\u0219\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0215\3\2\2\2\u0219M\3\2\2\2"+
		"\u021a\u021b\b(\1\2\u021b\u021c\7!\2\2\u021c\u021d\5J&\2\u021d\u021e\7"+
		"\"\2\2\u021e\u0223\3\2\2\2\u021f\u0220\f\3\2\2\u0220\u0222\7$\2\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224O\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0292\7\'\2\2\u0227\u0228"+
		"\7\'\2\2\u0228\u0292\t\3\2\2\u0229\u022a\7\'\2\2\u022a\u0292\7)\2\2\u022b"+
		"\u022c\7\'\2\2\u022c\u022d\7)\2\2\u022d\u0292\t\3\2\2\u022e\u022f\5(\25"+
		"\2\u022f\u0230\7\'\2\2\u0230\u0292\3\2\2\2\u0231\u0232\5(\25\2\u0232\u0233"+
		"\7\'\2\2\u0233\u0234\t\3\2\2\u0234\u0292\3\2\2\2\u0235\u0236\5(\25\2\u0236"+
		"\u0237\7\'\2\2\u0237\u0238\7)\2\2\u0238\u0292\3\2\2\2\u0239\u023a\5(\25"+
		"\2\u023a\u023b\7\'\2\2\u023b\u023c\7)\2\2\u023c\u023d\t\3\2\2\u023d\u0292"+
		"\3\2\2\2\u023e\u023f\7\'\2\2\u023f\u0292\5*\26\2\u0240\u0241\7\'\2\2\u0241"+
		"\u0242\5*\26\2\u0242\u0243\t\3\2\2\u0243\u0292\3\2\2\2\u0244\u0245\7\'"+
		"\2\2\u0245\u0246\5*\26\2\u0246\u0247\7)\2\2\u0247\u0292\3\2\2\2\u0248"+
		"\u0249\7\'\2\2\u0249\u024a\5*\26\2\u024a\u024b\7)\2\2\u024b\u024c\t\3"+
		"\2\2\u024c\u0292\3\2\2\2\u024d\u0292\7+\2\2\u024e\u024f\7+\2\2\u024f\u0292"+
		"\t\3\2\2\u0250\u0251\7+\2\2\u0251\u0292\7)\2\2\u0252\u0253\7+\2\2\u0253"+
		"\u0254\7)\2\2\u0254\u0292\t\3\2\2\u0255\u0292\7,\2\2\u0256\u0257\7,\2"+
		"\2\u0257\u0292\t\3\2\2\u0258\u0259\7,\2\2\u0259\u0292\7)\2\2\u025a\u025b"+
		"\7,\2\2\u025b\u025c\7)\2\2\u025c\u0292\t\3\2\2\u025d\u0292\5.\30\2\u025e"+
		"\u025f\5.\30\2\u025f\u0260\t\3\2\2\u0260\u0292\3\2\2\2\u0261\u0262\5."+
		"\30\2\u0262\u0263\7)\2\2\u0263\u0292\3\2\2\2\u0264\u0265\5.\30\2\u0265"+
		"\u0266\7)\2\2\u0266\u0267\t\3\2\2\u0267\u0292\3\2\2\2\u0268\u0269\7\'"+
		"\2\2\u0269\u026a\7\30\2\2\u026a\u0292\5.\30\2\u026b\u026c\7\'\2\2\u026c"+
		"\u026d\7\30\2\2\u026d\u026e\5.\30\2\u026e\u026f\t\3\2\2\u026f\u0292\3"+
		"\2\2\2\u0270\u0271\7\'\2\2\u0271\u0272\7\30\2\2\u0272\u0273\5.\30\2\u0273"+
		"\u0274\7)\2\2\u0274\u0292\3\2\2\2\u0275\u0276\7\'\2\2\u0276\u0277\7\30"+
		"\2\2\u0277\u0278\5.\30\2\u0278\u0279\7)\2\2\u0279\u027a\t\3\2\2\u027a"+
		"\u0292\3\2\2\2\u027b\u0292\5\"\22\2\u027c\u027d\5\"\22\2\u027d\u027e\t"+
		"\3\2\2\u027e\u0292\3\2\2\2\u027f\u0280\5\"\22\2\u0280\u0281\7)\2\2\u0281"+
		"\u0292\3\2\2\2\u0282\u0283\5\"\22\2\u0283\u0284\7)\2\2\u0284\u0285\t\3"+
		"\2\2\u0285\u0292\3\2\2\2\u0286\u0292\5\u008aF\2\u0287\u0288\5\u008aF\2"+
		"\u0288\u0289\t\3\2\2\u0289\u0292\3\2\2\2\u028a\u028b\5\u008aF\2\u028b"+
		"\u028c\7)\2\2\u028c\u0292\3\2\2\2\u028d\u028e\5\u008aF\2\u028e\u028f\7"+
		")\2\2\u028f\u0290\t\3\2\2\u0290\u0292\3\2\2\2\u0291\u0226\3\2\2\2\u0291"+
		"\u0227\3\2\2\2\u0291\u0229\3\2\2\2\u0291\u022b\3\2\2\2\u0291\u022e\3\2"+
		"\2\2\u0291\u0231\3\2\2\2\u0291\u0235\3\2\2\2\u0291\u0239\3\2\2\2\u0291"+
		"\u023e\3\2\2\2\u0291\u0240\3\2\2\2\u0291\u0244\3\2\2\2\u0291\u0248\3\2"+
		"\2\2\u0291\u024d\3\2\2\2\u0291\u024e\3\2\2\2\u0291\u0250\3\2\2\2\u0291"+
		"\u0252\3\2\2\2\u0291\u0255\3\2\2\2\u0291\u0256\3\2\2\2\u0291\u0258\3\2"+
		"\2\2\u0291\u025a\3\2\2\2\u0291\u025d\3\2\2\2\u0291\u025e\3\2\2\2\u0291"+
		"\u0261\3\2\2\2\u0291\u0264\3\2\2\2\u0291\u0268\3\2\2\2\u0291\u026b\3\2"+
		"\2\2\u0291\u0270\3\2\2\2\u0291\u0275\3\2\2\2\u0291\u027b\3\2\2\2\u0291"+
		"\u027c\3\2\2\2\u0291\u027f\3\2\2\2\u0291\u0282\3\2\2\2\u0291\u0286\3\2"+
		"\2\2\u0291\u0287\3\2\2\2\u0291\u028a\3\2\2\2\u0291\u028d\3\2\2\2\u0292"+
		"Q\3\2\2\2\u0293\u0294\7\b\2\2\u0294\u0295\5T+\2\u0295\u0296\7\37\2\2\u0296"+
		"\u0297\7 \2\2\u0297\u02a7\3\2\2\2\u0298\u0299\7\b\2\2\u0299\u029a\5T+"+
		"\2\u029a\u029b\7\37\2\2\u029b\u029c\5^\60\2\u029c\u029d\7 \2\2\u029d\u02a7"+
		"\3\2\2\2\u029e\u029f\7\b\2\2\u029f\u02a0\5T+\2\u02a0\u02a1\5,\27\2\u02a1"+
		"\u02a7\3\2\2\2\u02a2\u02a3\7\b\2\2\u02a3\u02a4\5T+\2\u02a4\u02a5\5`\61"+
		"\2\u02a5\u02a7\3\2\2\2\u02a6\u0293\3\2\2\2\u02a6\u0298\3\2\2\2\u02a6\u029e"+
		"\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7S\3\2\2\2\u02a8\u02a9\7!\2\2\u02a9\u02aa"+
		"\5V,\2\u02aa\u02ab\7\27\2\2\u02ab\u02ac\5X-\2\u02ac\u02ad\7\27\2\2\u02ad"+
		"\u02ae\5Z.\2\u02ae\u02af\7\"\2\2\u02af\u02bb\3\2\2\2\u02b0\u02b1\5V,\2"+
		"\u02b1\u02b2\7\27\2\2\u02b2\u02b3\5X-\2\u02b3\u02b4\7\27\2\2\u02b4\u02b5"+
		"\5Z.\2\u02b5\u02bb\3\2\2\2\u02b6\u02bb\5J&\2\u02b7\u02b8\7!\2\2\u02b8"+
		"\u02bb\7\"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02a8\3\2\2\2\u02ba\u02b0\3\2"+
		"\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02b7\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb"+
		"U\3\2\2\2\u02bc\u02bf\5\24\13\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2\2"+
		"\2\u02be\u02bd\3\2\2\2\u02bfW\3\2\2\2\u02c0\u02c3\5J&\2\u02c1\u02c3\3"+
		"\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3Y\3\2\2\2\u02c4\u02c7"+
		"\5\\/\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7"+
		"[\3\2\2\2\u02c8\u02d3\5$\23\2\u02c9\u02d3\5\"\22\2\u02ca\u02cb\5$\23\2"+
		"\u02cb\u02cc\7\34\2\2\u02cc\u02cd\5\\/\2\u02cd\u02d3\3\2\2\2\u02ce\u02cf"+
		"\5\"\22\2\u02cf\u02d0\7\34\2\2\u02d0\u02d1\5\\/\2\u02d1\u02d3\3\2\2\2"+
		"\u02d2\u02c8\3\2\2\2\u02d2\u02c9\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d2\u02ce"+
		"\3\2\2\2\u02d3]\3\2\2\2\u02d4\u02d9\5\6\4\2\u02d5\u02d6\5\6\4\2\u02d6"+
		"\u02d7\5^\60\2\u02d7\u02d9\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d8\u02d5\3\2"+
		"\2\2\u02d9_\3\2\2\2\u02da\u02e1\5R*\2\u02db\u02dc\5R*\2\u02dc\u02dd\5"+
		"`\61\2\u02dd\u02e1\3\2\2\2\u02de\u02e1\58\35\2\u02df\u02e1\5b\62\2\u02e0"+
		"\u02da\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2"+
		"\2\2\u02e1a\3\2\2\2\u02e2\u02e3\7\t\2\2\u02e3\u02e4\5d\63\2\u02e4\u02e5"+
		"\7\27\2\2\u02e5c\3\2\2\2\u02e6\u02ea\5\u0092J\2\u02e7\u02ea\5$\23\2\u02e8"+
		"\u02ea\5\"\22\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3"+
		"\2\2\2\u02eae\3\2\2\2\u02eb\u02ec\5j\66\2\u02ec\u02ed\7\37\2\2\u02ed\u02ee"+
		"\7 \2\2\u02ee\u030a\3\2\2\2\u02ef\u02f0\5j\66\2\u02f0\u02f1\7\37\2\2\u02f1"+
		"\u02f2\5t;\2\u02f2\u02f3\7 \2\2\u02f3\u030a\3\2\2\2\u02f4\u02f5\5l\67"+
		"\2\u02f5\u02f6\7\37\2\2\u02f6\u02f7\7 \2\2\u02f7\u030a\3\2\2\2\u02f8\u02f9"+
		"\5l\67\2\u02f9\u02fa\7\37\2\2\u02fa\u02fb\5t;\2\u02fb\u02fc\7 \2\2\u02fc"+
		"\u030a\3\2\2\2\u02fd\u02fe\5p9\2\u02fe\u02ff\7\37\2\2\u02ff\u0300\7 \2"+
		"\2\u0300\u030a\3\2\2\2\u0301\u0302\5p9\2\u0302\u0303\7\37\2\2\u0303\u0304"+
		"\5t;\2\u0304\u0305\7 \2\2\u0305\u030a\3\2\2\2\u0306\u0307\5r:\2\u0307"+
		"\u0308\7\27\2\2\u0308\u030a\3\2\2\2\u0309\u02eb\3\2\2\2\u0309\u02ef\3"+
		"\2\2\2\u0309\u02f4\3\2\2\2\u0309\u02f8\3\2\2\2\u0309\u02fd\3\2\2\2\u0309"+
		"\u0301\3\2\2\2\u0309\u0306\3\2\2\2\u030ag\3\2\2\2\u030b\u030c\7\n\2\2"+
		"\u030c\u030d\7\'\2\2\u030d\u030e\7!\2\2\u030e\u0324\7\"\2\2\u030f\u0310"+
		"\7\n\2\2\u0310\u0311\7\'\2\2\u0311\u0312\7!\2\2\u0312\u0313\7\"\2\2\u0313"+
		"\u0314\7\26\2\2\u0314\u0324\7\'\2\2\u0315\u0316\7\n\2\2\u0316\u0317\7"+
		"\'\2\2\u0317\u0318\7!\2\2\u0318\u0319\5v<\2\u0319\u031a\7\"\2\2\u031a"+
		"\u0324\3\2\2\2\u031b\u031c\7\n\2\2\u031c\u031d\7\'\2\2\u031d\u031e\7!"+
		"\2\2\u031e\u031f\5v<\2\u031f\u0320\7\"\2\2\u0320\u0321\7\26\2\2\u0321"+
		"\u0322\7\'\2\2\u0322\u0324\3\2\2\2\u0323\u030b\3\2\2\2\u0323\u030f\3\2"+
		"\2\2\u0323\u0315\3\2\2\2\u0323\u031b\3\2\2\2\u0324i\3\2\2\2\u0325\u0326"+
		"\5h\65\2\u0326k\3\2\2\2\u0327\u0328\5n8\2\u0328\u0329\5h\65\2\u0329\u033f"+
		"\3\2\2\2\u032a\u032b\7\16\2\2\u032b\u033f\5h\65\2\u032c\u032d\5n8\2\u032d"+
		"\u032e\7\16\2\2\u032e\u032f\5h\65\2\u032f\u033f\3\2\2\2\u0330\u0331\7"+
		"\17\2\2\u0331\u0332\5n8\2\u0332\u0333\7\16\2\2\u0333\u0334\5h\65\2\u0334"+
		"\u033f\3\2\2\2\u0335\u0336\7\17\2\2\u0336\u0337\5n8\2\u0337\u0338\5h\65"+
		"\2\u0338\u033f\3\2\2\2\u0339\u033a\7\17\2\2\u033a\u033f\5h\65\2\u033b"+
		"\u033c\7\17\2\2\u033c\u033d\7\16\2\2\u033d\u033f\5h\65\2\u033e\u0327\3"+
		"\2\2\2\u033e\u032a\3\2\2\2\u033e\u032c\3\2\2\2\u033e\u0330\3\2\2\2\u033e"+
		"\u0335\3\2\2\2\u033e\u0339\3\2\2\2\u033e\u033b\3\2\2\2\u033fm\3\2\2\2"+
		"\u0340\u0341\t\4\2\2\u0341o\3\2\2\2\u0342\u0343\7\'\2\2\u0343\u0344\7"+
		"!\2\2\u0344\u034b\7\"\2\2\u0345\u0346\7\'\2\2\u0346\u0347\7!\2\2\u0347"+
		"\u0348\5v<\2\u0348\u0349\7\"\2\2\u0349\u034b\3\2\2\2\u034a\u0342\3\2\2"+
		"\2\u034a\u0345\3\2\2\2\u034bq\3\2\2\2\u034c\u034f\5j\66\2\u034d\u034f"+
		"\5l\67\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034fs\3\2\2\2\u0350"+
		"\u0355\5\6\4\2\u0351\u0352\5\6\4\2\u0352\u0353\5t;\2\u0353\u0355\3\2\2"+
		"\2\u0354\u0350\3\2\2\2\u0354\u0351\3\2\2\2\u0355u\3\2\2\2\u0356\u035c"+
		"\5x=\2\u0357\u0358\5x=\2\u0358\u0359\7\34\2\2\u0359\u035a\5v<\2\u035a"+
		"\u035c\3\2\2\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035cw\3\2\2\2"+
		"\u035d\u035e\7\'\2\2\u035e\u035f\7)\2\2\u035fy\3\2\2\2\u0360\u0364\5|"+
		"?\2\u0361\u0364\5\u0080A\2\u0362\u0364\5\u0084C\2\u0363\u0360\3\2\2\2"+
		"\u0363\u0361\3\2\2\2\u0363\u0362\3\2\2\2\u0364{\3\2\2\2\u0365\u0366\5"+
		"~@\2\u0366}\3\2\2\2\u0367\u0368\7\20\2\2\u0368\u0369\7\'\2\2\u0369\u036a"+
		"\7\37\2\2\u036a\u0380\7 \2\2\u036b\u036c\7\20\2\2\u036c\u036d\7\'\2\2"+
		"\u036d\u036e\7\37\2\2\u036e\u036f\5t;\2\u036f\u0370\7 \2\2\u0370\u0380"+
		"\3\2\2\2\u0371\u0372\7\20\2\2\u0372\u0373\7\'\2\2\u0373\u0374\7\22\2\2"+
		"\u0374\u0375\7\'\2\2\u0375\u0376\7\37\2\2\u0376\u0380\7 \2\2\u0377\u0378"+
		"\7\20\2\2\u0378\u0379\7\'\2\2\u0379\u037a\7\22\2\2\u037a\u037b\7\'\2\2"+
		"\u037b\u037c\7\37\2\2\u037c\u037d\5t;\2\u037d\u037e\7 \2\2\u037e\u0380"+
		"\3\2\2\2\u037f\u0367\3\2\2\2\u037f\u036b\3\2\2\2\u037f\u0371\3\2\2\2\u037f"+
		"\u0377\3\2\2\2\u0380\177\3\2\2\2\u0381\u0382\5\u0082B\2\u0382\u0081\3"+
		"\2\2\2\u0383\u0384\7\21\2\2\u0384\u0385\7\'\2\2\u0385\u0386\7\37\2\2\u0386"+
		"\u039c\7 \2\2\u0387\u0388\7\21\2\2\u0388\u0389\7\'\2\2\u0389\u038a\7\37"+
		"\2\2\u038a\u038b\5t;\2\u038b\u038c\7 \2\2\u038c\u039c\3\2\2\2\u038d\u038e"+
		"\7\21\2\2\u038e\u038f\7\'\2\2\u038f\u0390\7\22\2\2\u0390\u0391\7\'\2\2"+
		"\u0391\u0392\7\37\2\2\u0392\u039c\7 \2\2\u0393\u0394\7\21\2\2\u0394\u0395"+
		"\7\'\2\2\u0395\u0396\7\22\2\2\u0396\u0397\7\'\2\2\u0397\u0398\7\37\2\2"+
		"\u0398\u0399\5t;\2\u0399\u039a\7 \2\2\u039a\u039c\3\2\2\2\u039b\u0383"+
		"\3\2\2\2\u039b\u0387\3\2\2\2\u039b\u038d\3\2\2\2\u039b\u0393\3\2\2\2\u039c"+
		"\u0083\3\2\2\2\u039d\u039e\5\u0086D\2\u039e\u039f\7\37\2\2\u039f\u03a0"+
		"\7 \2\2\u03a0\u03a7\3\2\2\2\u03a1\u03a2\5\u0086D\2\u03a2\u03a3\7\37\2"+
		"\2\u03a3\u03a4\5t;\2\u03a4\u03a5\7 \2\2\u03a5\u03a7\3\2\2\2\u03a6\u039d"+
		"\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a7\u0085\3\2\2\2\u03a8\u03ac\5\u0088E"+
		"\2\u03a9\u03aa\7\17\2\2\u03aa\u03ac\5\u0088E\2\u03ab\u03a8\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ac\u0087\3\2\2\2\u03ad\u03ae\7\23\2\2\u03ae\u03be\7"+
		"\'\2\2\u03af\u03b0\7\23\2\2\u03b0\u03b1\7\'\2\2\u03b1\u03b2\7\22\2\2\u03b2"+
		"\u03be\7\'\2\2\u03b3\u03b4\7\23\2\2\u03b4\u03b5\7\'\2\2\u03b5\u03b6\7"+
		"\24\2\2\u03b6\u03be\7\'\2\2\u03b7\u03b8\7\23\2\2\u03b8\u03b9\7\'\2\2\u03b9"+
		"\u03ba\7\22\2\2\u03ba\u03bb\7\'\2\2\u03bb\u03bc\7\24\2\2\u03bc\u03be\7"+
		"\'\2\2\u03bd\u03ad\3\2\2\2\u03bd\u03af\3\2\2\2\u03bd\u03b3\3\2\2\2\u03bd"+
		"\u03b7\3\2\2\2\u03be\u0089\3\2\2\2\u03bf\u03c4\5\u008cG\2\u03c0\u03c1"+
		"\5\u008cG\2\u03c1\u03c2\5\u008aF\2\u03c2\u03c4\3\2\2\2\u03c3\u03bf\3\2"+
		"\2\2\u03c3\u03c0\3\2\2\2\u03c4\u008b\3\2\2\2\u03c5\u03cf\7\'\2\2\u03c6"+
		"\u03c7\7\'\2\2\u03c7\u03cf\7\31\2\2\u03c8\u03c9\7\'\2\2\u03c9\u03cf\5"+
		"\u008eH\2\u03ca\u03cb\7\'\2\2\u03cb\u03cc\5\u008eH\2\u03cc\u03cd\7\31"+
		"\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03c5\3\2\2\2\u03ce\u03c6\3\2\2\2\u03ce"+
		"\u03c8\3\2\2\2\u03ce\u03ca\3\2\2\2\u03cf\u008d\3\2\2\2\u03d0\u03d1\7\35"+
		"\2\2\u03d1\u03d2\5\u0090I\2\u03d2\u03d3\7\36\2\2\u03d3\u03da\3\2\2\2\u03d4"+
		"\u03d5\7\35\2\2\u03d5\u03d6\5\u0090I\2\u03d6\u03d7\7\36\2\2\u03d7\u03d8"+
		"\5\u008eH\2\u03d8\u03da\3\2\2\2\u03d9\u03d0\3\2\2\2\u03d9\u03d4\3\2\2"+
		"\2\u03da\u008f\3\2\2\2\u03db\u03dc\5$\23\2\u03dc\u0091\3\2\2\2\u03dd\u03f5"+
		"\7\'\2\2\u03de\u03df\7\'\2\2\u03df\u03f5\7)\2\2\u03e0\u03f5\7+\2\2\u03e1"+
		"\u03e2\7+\2\2\u03e2\u03f5\7)\2\2\u03e3\u03f5\7,\2\2\u03e4\u03e5\7,\2\2"+
		"\u03e5\u03f5\7)\2\2\u03e6\u03f5\7*\2\2\u03e7\u03f5\5\32\16\2\u03e8\u03f5"+
		"\5\36\20\2\u03e9\u03f5\5$\23\2\u03ea\u03f5\5.\30\2\u03eb\u03ec\5\u0094"+
		"K\2\u03ec\u03ed\7\31\2\2\u03ed\u03ee\5\u0096L\2\u03ee\u03f5\3\2\2\2\u03ef"+
		"\u03f0\5\u0094K\2\u03f0\u03f1\7\33\2\2\u03f1\u03f2\5\u0096L\2\u03f2\u03f5"+
		"\3\2\2\2\u03f3\u03f5\5\u008aF\2\u03f4\u03dd\3\2\2\2\u03f4\u03de\3\2\2"+
		"\2\u03f4\u03e0\3\2\2\2\u03f4\u03e1\3\2\2\2\u03f4\u03e3\3\2\2\2\u03f4\u03e4"+
		"\3\2\2\2\u03f4\u03e6\3\2\2\2\u03f4\u03e7\3\2\2\2\u03f4\u03e8\3\2\2\2\u03f4"+
		"\u03e9\3\2\2\2\u03f4\u03ea\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f4\u03ef\3\2"+
		"\2\2\u03f4\u03f3\3\2\2\2\u03f5\u0093\3\2\2\2\u03f6\u03f7\7\'\2\2\u03f7"+
		"\u0095\3\2\2\2\u03f8\u03f9\7\'\2\2\u03f9\u0097\3\2\2\2\65\u00a0\u00ac"+
		"\u00b9\u00ee\u00f5\u0106\u0114\u011c\u0123\u012b\u0136\u0140\u019a\u01b6"+
		"\u01c2\u01ce\u01d4\u01e1\u01eb\u0200\u0206\u0212\u0218\u0223\u0291\u02a6"+
		"\u02ba\u02be\u02c2\u02c6\u02d2\u02d8\u02e0\u02e9\u0309\u0323\u033e\u034a"+
		"\u034e\u0354\u035b\u0363\u037f\u039b\u03a6\u03ab\u03bd\u03c3\u03ce\u03d9"+
		"\u03f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}