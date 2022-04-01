// Generated from /home/user/projects/sdk/sdk/grammar/TParser.g4 by ANTLR 4.8
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
		RULE_indexArray = 11, RULE_indexArrayElements = 12, RULE_associativeArray = 13, 
		RULE_associativeArrayElements = 14, RULE_operationBlock = 15, RULE_operationElements = 16, 
		RULE_operationValue = 17, RULE_firstIncDec = 18, RULE_lastIncDec = 19, 
		RULE_callingFunction = 20, RULE_functionCall = 21, RULE_identifierB = 22, 
		RULE_functionCallParam = 23, RULE_functionCallParamElements = 24, RULE_conditionalExpression = 25, 
		RULE_conditionalBlockElements = 26, RULE_ifConditions = 27, RULE_elifConditions = 28, 
		RULE_elseConditions = 29, RULE_condBlockElementsLimited = 30, RULE_conditionalExpressionElements = 31, 
		RULE_conditionalExpElementsValue = 32, RULE_conditionExpBlock = 33, RULE_conditionalExpValue = 34, 
		RULE_loop = 35, RULE_loopExpression = 36, RULE_loopOneMembers = 37, RULE_loopTwoMembers = 38, 
		RULE_loopThreeMembers = 39, RULE_loopThreeMembersValues = 40, RULE_loopBlockElements = 41, 
		RULE_loopBlockElementsLimited = 42, RULE_ret = 43, RULE_retValues = 44, 
		RULE_functions = 45, RULE_functionGeneralModes = 46, RULE_functionsModes = 47, 
		RULE_functionMethodsModes = 48, RULE_methodPerm = 49, RULE_constructClassMethod = 50, 
		RULE_interfaceMethod = 51, RULE_functionCodeBlock = 52, RULE_functionParams = 53, 
		RULE_functionParamElements = 54, RULE_oopGeneral = 55, RULE_interfaceClass = 56, 
		RULE_interfaceClassDefinition = 57, RULE_abstractClass = 58, RULE_abstractClassDefinition = 59, 
		RULE_classDefination = 60, RULE_classModesGeneral = 61, RULE_classModes = 62, 
		RULE_generalValue = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableModes", "variableMembers", "variableDefinition", 
			"indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
			"operationBlock", "operationElements", "operationValue", "firstIncDec", 
			"lastIncDec", "callingFunction", "functionCall", "identifierB", "functionCallParam", 
			"functionCallParamElements", "conditionalExpression", "conditionalBlockElements", 
			"ifConditions", "elifConditions", "elseConditions", "condBlockElementsLimited", 
			"conditionalExpressionElements", "conditionalExpElementsValue", "conditionExpBlock", 
			"conditionalExpValue", "loop", "loopExpression", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
			"ret", "retValues", "functions", "functionGeneralModes", "functionsModes", 
			"functionMethodsModes", "methodPerm", "constructClassMethod", "interfaceMethod", 
			"functionCodeBlock", "functionParams", "functionParamElements", "oopGeneral", 
			"interfaceClass", "interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
			"classDefination", "classModesGeneral", "classModes", "generalValue"
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
			setState(128);
			fileContent(0);
			setState(129);
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
			setState(136);
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
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					sentence();
					}
					} 
				}
				setState(138);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
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
			setState(150);
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
			setState(152);
			match(Use);
			setState(153);
			useValue();
			setState(154);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				useString();
				setState(158);
				match(Separator);
				setState(159);
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
			setState(163);
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
			setState(165);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(Var);
				setState(168);
				variableMembers();
				setState(169);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				methodPerm();
				setState(172);
				match(Var);
				setState(173);
				variableMembers();
				setState(174);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(Static);
				setState(177);
				match(Var);
				setState(178);
				variableMembers();
				setState(179);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				methodPerm();
				setState(182);
				match(Static);
				setState(183);
				match(Var);
				setState(184);
				variableMembers();
				setState(185);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(Final);
				setState(188);
				methodPerm();
				setState(189);
				match(Static);
				setState(190);
				match(Var);
				setState(191);
				variableMembers();
				setState(192);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(Final);
				setState(195);
				methodPerm();
				setState(196);
				match(Var);
				setState(197);
				variableMembers();
				setState(198);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(Final);
				setState(201);
				match(Var);
				setState(202);
				variableMembers();
				setState(203);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(Final);
				setState(206);
				match(Static);
				setState(207);
				match(Var);
				setState(208);
				variableMembers();
				setState(209);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				variableDefinition();
				setState(215);
				match(Separator);
				setState(216);
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
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDefinition);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(Identifier);
				setState(221);
				match(Attr);
				setState(222);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(Identifier);
				setState(224);
				match(TypeSpec);
				setState(225);
				match(Attr);
				setState(226);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(Identifier);
				setState(228);
				match(Attr);
				setState(229);
				match(New);
				setState(230);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(Identifier);
				setState(232);
				match(TypeSpec);
				setState(233);
				match(Attr);
				setState(234);
				match(New);
				setState(235);
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
		enterRule(_localctx, 22, RULE_indexArray);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(OpenArIndex);
				setState(239);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(OpenArIndex);
				setState(241);
				indexArrayElements();
				setState(242);
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
		enterRule(_localctx, 24, RULE_indexArrayElements);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				generalValue();
				setState(248);
				match(Separator);
				setState(249);
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
		enterRule(_localctx, 26, RULE_associativeArray);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(OpenBlock);
				setState(254);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(OpenBlock);
				setState(256);
				associativeArrayElements();
				setState(257);
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
		enterRule(_localctx, 28, RULE_associativeArrayElements);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(Identifier);
				setState(262);
				match(TwoPoint);
				setState(263);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(Identifier);
				setState(265);
				match(TwoPoint);
				setState(266);
				generalValue();
				setState(267);
				match(Separator);
				setState(268);
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
		enterRule(_localctx, 30, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OpenOp);
			setState(273);
			operationElements();
			setState(274);
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
		enterRule(_localctx, 32, RULE_operationElements);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				operationValue();
				setState(278);
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
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
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
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public OperationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationValue; }
	}

	public final OperationValueContext operationValue() throws RecognitionException {
		OperationValueContext _localctx = new OperationValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operationValue);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(Identifier);
				setState(284);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(Identifier);
				setState(286);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(Identifier);
				setState(288);
				match(TypeSpec);
				setState(289);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				firstIncDec();
				setState(291);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				firstIncDec();
				setState(294);
				match(Identifier);
				setState(295);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				firstIncDec();
				setState(298);
				match(Identifier);
				setState(299);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				firstIncDec();
				setState(302);
				match(Identifier);
				setState(303);
				match(TypeSpec);
				setState(304);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(306);
				match(Identifier);
				setState(307);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(308);
				match(Identifier);
				setState(309);
				lastIncDec();
				setState(310);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(312);
				match(Identifier);
				setState(313);
				lastIncDec();
				setState(314);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(316);
				match(Identifier);
				setState(317);
				lastIncDec();
				setState(318);
				match(TypeSpec);
				setState(319);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(321);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(322);
				match(Integer);
				setState(323);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(324);
				match(Integer);
				setState(325);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(326);
				match(Integer);
				setState(327);
				match(TypeSpec);
				setState(328);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(329);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(330);
				match(Float);
				setState(331);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(332);
				match(Float);
				setState(333);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(334);
				match(Float);
				setState(335);
				match(TypeSpec);
				setState(336);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(337);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(338);
				functionCall();
				setState(339);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(341);
				functionCall();
				setState(342);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(344);
				functionCall();
				setState(345);
				match(TypeSpec);
				setState(346);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(348);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(349);
				operationBlock();
				setState(350);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(352);
				operationBlock();
				setState(353);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(355);
				operationBlock();
				setState(356);
				match(TypeSpec);
				setState(357);
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
		enterRule(_localctx, 36, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 38, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 40, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			functionCall();
			setState(366);
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(Identifier);
				setState(369);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(Identifier);
				setState(371);
				match(Point);
				setState(372);
				identifierB();
				setState(373);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(Identifier);
				setState(376);
				match(TwoTwoPoint);
				setState(377);
				identifierB();
				setState(378);
				functionCallParam();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 46, RULE_functionCallParam);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(OpenOp);
				setState(385);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(OpenOp);
				setState(387);
				functionCallParamElements();
				setState(388);
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
		enterRule(_localctx, 48, RULE_functionCallParamElements);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				generalValue();
				setState(394);
				match(Separator);
				setState(395);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				operationElements();
				setState(399);
				match(Separator);
				setState(400);
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
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public ElifConditionsContext elifConditions() {
			return getRuleContext(ElifConditionsContext.class,0);
		}
		public ElseConditionsContext elseConditions() {
			return getRuleContext(ElseConditionsContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalExpression);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				elseConditions();
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

	public static class ConditionalBlockElementsContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ConditionalBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElements; }
	}

	public final ConditionalBlockElementsContext conditionalBlockElements() throws RecognitionException {
		ConditionalBlockElementsContext _localctx = new ConditionalBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalBlockElements);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				conditionalExpression();
				setState(411);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				sentence();
				setState(415);
				conditionalBlockElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionsContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public IfConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditions; }
	}

	public final IfConditionsContext ifConditions() throws RecognitionException {
		IfConditionsContext _localctx = new IfConditionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifConditions);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(If);
				setState(420);
				conditionalExpressionElements();
				setState(421);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(If);
				setState(424);
				conditionalExpressionElements();
				setState(425);
				match(OpenBlock);
				setState(426);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(If);
				setState(429);
				conditionalExpressionElements();
				setState(430);
				match(OpenBlock);
				setState(431);
				conditionalBlockElements();
				setState(432);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(If);
				setState(435);
				conditionalExpressionElements();
				setState(436);
				condBlockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifConditionsContext extends ParserRuleContext {
		public TerminalNode Elif() { return getToken(TParser.Elif, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public ElifConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifConditions; }
	}

	public final ElifConditionsContext elifConditions() throws RecognitionException {
		ElifConditionsContext _localctx = new ElifConditionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elifConditions);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(Elif);
				setState(441);
				conditionalExpressionElements();
				setState(442);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(Elif);
				setState(445);
				conditionalExpressionElements();
				setState(446);
				match(OpenBlock);
				setState(447);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(Elif);
				setState(450);
				conditionalExpressionElements();
				setState(451);
				match(OpenBlock);
				setState(452);
				conditionalBlockElements();
				setState(453);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(Elif);
				setState(456);
				conditionalExpressionElements();
				setState(457);
				condBlockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseConditionsContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TParser.Else, 0); }
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public ElseConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseConditions; }
	}

	public final ElseConditionsContext elseConditions() throws RecognitionException {
		ElseConditionsContext _localctx = new ElseConditionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseConditions);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(Else);
				setState(462);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(Else);
				setState(464);
				match(OpenBlock);
				setState(465);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(Else);
				setState(467);
				match(OpenBlock);
				setState(468);
				conditionalBlockElements();
				setState(469);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(Else);
				setState(472);
				condBlockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondBlockElementsLimitedContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public CondBlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBlockElementsLimited; }
	}

	public final CondBlockElementsLimitedContext condBlockElementsLimited() throws RecognitionException {
		CondBlockElementsLimitedContext _localctx = new CondBlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condBlockElementsLimited);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				ifConditions();
				setState(477);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				loop();
				setState(481);
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
		enterRule(_localctx, 62, RULE_conditionalExpressionElements);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				conditionalExpElementsValue();
				setState(487);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				conditionExpBlock(0);
				setState(491);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				match(Not);
				setState(494);
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
		enterRule(_localctx, 64, RULE_conditionalExpElementsValue);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				conditionalExpValue();
				setState(499);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			match(OpenOp);
			setState(505);
			conditionalExpressionElements();
			setState(506);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
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
					setState(508);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(509);
					match(AssignmentOperator);
					}
					} 
				}
				setState(514);
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
		public ConditionalExpValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpValue; }
	}

	public final ConditionalExpValueContext conditionalExpValue() throws RecognitionException {
		ConditionalExpValueContext _localctx = new ConditionalExpValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalExpValue);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(Identifier);
				setState(517);
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
				setState(518);
				match(Identifier);
				setState(519);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(Identifier);
				setState(521);
				match(TypeSpec);
				setState(522);
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
				setState(523);
				firstIncDec();
				setState(524);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(526);
				firstIncDec();
				setState(527);
				match(Identifier);
				setState(528);
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
				setState(530);
				firstIncDec();
				setState(531);
				match(Identifier);
				setState(532);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(534);
				firstIncDec();
				setState(535);
				match(Identifier);
				setState(536);
				match(TypeSpec);
				setState(537);
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
				setState(539);
				match(Identifier);
				setState(540);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(541);
				match(Identifier);
				setState(542);
				lastIncDec();
				setState(543);
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
				setState(545);
				match(Identifier);
				setState(546);
				lastIncDec();
				setState(547);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(549);
				match(Identifier);
				setState(550);
				lastIncDec();
				setState(551);
				match(TypeSpec);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(554);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(555);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(557);
				match(Integer);
				setState(558);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(559);
				match(Integer);
				setState(560);
				match(TypeSpec);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(562);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(563);
				match(Float);
				setState(564);
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
				setState(565);
				match(Float);
				setState(566);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(567);
				match(Float);
				setState(568);
				match(TypeSpec);
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(570);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(571);
				functionCall();
				setState(572);
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
				setState(574);
				functionCall();
				setState(575);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(577);
				functionCall();
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(581);
				match(Identifier);
				setState(582);
				match(Attr);
				setState(583);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(584);
				match(Identifier);
				setState(585);
				match(Attr);
				setState(586);
				functionCall();
				setState(587);
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
				setState(589);
				match(Identifier);
				setState(590);
				match(Attr);
				setState(591);
				functionCall();
				setState(592);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(594);
				match(Identifier);
				setState(595);
				match(Attr);
				setState(596);
				functionCall();
				setState(597);
				match(TypeSpec);
				setState(598);
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
				setState(600);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(601);
				operationBlock();
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(604);
				operationBlock();
				setState(605);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(607);
				operationBlock();
				setState(608);
				match(TypeSpec);
				setState(609);
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
		enterRule(_localctx, 70, RULE_loop);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(For);
				setState(614);
				loopExpression();
				setState(615);
				match(OpenBlock);
				setState(616);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(For);
				setState(619);
				loopExpression();
				setState(620);
				match(OpenBlock);
				setState(621);
				loopBlockElements();
				setState(622);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(For);
				setState(625);
				loopExpression();
				setState(626);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(For);
				setState(629);
				loopExpression();
				setState(630);
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
		enterRule(_localctx, 72, RULE_loopExpression);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(OpenOp);
				setState(635);
				loopOneMembers();
				setState(636);
				match(End);
				setState(637);
				loopTwoMembers();
				setState(638);
				match(End);
				setState(639);
				loopThreeMembers();
				setState(640);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				loopOneMembers();
				setState(643);
				match(End);
				setState(644);
				loopTwoMembers();
				setState(645);
				match(End);
				setState(646);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(649);
				match(OpenOp);
				setState(650);
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
		enterRule(_localctx, 74, RULE_loopOneMembers);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
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
		enterRule(_localctx, 76, RULE_loopTwoMembers);
		try {
			setState(660);
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
				setState(658);
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
		enterRule(_localctx, 78, RULE_loopThreeMembers);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
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
		enterRule(_localctx, 80, RULE_loopThreeMembersValues);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				operationElements();
				setState(669);
				match(Separator);
				setState(670);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				operationBlock();
				setState(673);
				match(Separator);
				setState(674);
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
		enterRule(_localctx, 82, RULE_loopBlockElements);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				sentence();
				setState(680);
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
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public LoopBlockElementsLimitedContext loopBlockElementsLimited() {
			return getRuleContext(LoopBlockElementsLimitedContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopBlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElementsLimited; }
	}

	public final LoopBlockElementsLimitedContext loopBlockElementsLimited() throws RecognitionException {
		LoopBlockElementsLimitedContext _localctx = new LoopBlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_loopBlockElementsLimited);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				ifConditions();
				setState(686);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				loop();
				setState(690);
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
		enterRule(_localctx, 86, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(Ret);
			setState(695);
			retValues();
			setState(696);
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
		enterRule(_localctx, 88, RULE_retValues);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
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
		enterRule(_localctx, 90, RULE_functions);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				functionsModes();
				setState(704);
				match(OpenBlock);
				setState(705);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				functionsModes();
				setState(708);
				match(OpenBlock);
				setState(709);
				functionCodeBlock();
				setState(710);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				functionMethodsModes();
				setState(713);
				match(OpenBlock);
				setState(714);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				functionMethodsModes();
				setState(717);
				match(OpenBlock);
				setState(718);
				functionCodeBlock();
				setState(719);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
				constructClassMethod();
				setState(722);
				match(OpenBlock);
				setState(723);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				constructClassMethod();
				setState(726);
				match(OpenBlock);
				setState(727);
				functionCodeBlock();
				setState(728);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
				interfaceMethod();
				setState(731);
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
		enterRule(_localctx, 92, RULE_functionGeneralModes);
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(Function);
				setState(736);
				match(Identifier);
				setState(737);
				match(OpenOp);
				setState(738);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(Function);
				setState(740);
				match(Identifier);
				setState(741);
				match(OpenOp);
				setState(742);
				match(CloseOp);
				setState(743);
				match(ArrowRight);
				setState(744);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(Function);
				setState(746);
				match(Identifier);
				setState(747);
				match(OpenOp);
				setState(748);
				functionParams();
				setState(749);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(Function);
				setState(752);
				match(Identifier);
				setState(753);
				match(OpenOp);
				setState(754);
				functionParams();
				setState(755);
				match(CloseOp);
				setState(756);
				match(ArrowRight);
				setState(757);
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
		enterRule(_localctx, 94, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 96, RULE_functionMethodsModes);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				methodPerm();
				setState(764);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(Static);
				setState(767);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				methodPerm();
				setState(769);
				match(Static);
				setState(770);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(Final);
				setState(773);
				methodPerm();
				setState(774);
				match(Static);
				setState(775);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
				match(Final);
				setState(778);
				methodPerm();
				setState(779);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				match(Final);
				setState(782);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(783);
				match(Final);
				setState(784);
				match(Static);
				setState(785);
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
		enterRule(_localctx, 98, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
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
		enterRule(_localctx, 100, RULE_constructClassMethod);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(Identifier);
				setState(791);
				match(OpenOp);
				setState(792);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(Identifier);
				setState(794);
				match(OpenOp);
				setState(795);
				functionParams();
				setState(796);
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
		enterRule(_localctx, 102, RULE_interfaceMethod);
		try {
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
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
				setState(801);
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
		enterRule(_localctx, 104, RULE_functionCodeBlock);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				sentence();
				setState(806);
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
		enterRule(_localctx, 106, RULE_functionParams);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				functionParamElements();
				setState(812);
				match(Separator);
				setState(813);
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
		enterRule(_localctx, 108, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(Identifier);
			setState(818);
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
		enterRule(_localctx, 110, RULE_oopGeneral);
		try {
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
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
		enterRule(_localctx, 112, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
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
		enterRule(_localctx, 114, RULE_interfaceClassDefinition);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(Interface);
				setState(828);
				match(Identifier);
				setState(829);
				match(OpenBlock);
				setState(830);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(Interface);
				setState(832);
				match(Identifier);
				setState(833);
				match(OpenBlock);
				setState(834);
				functionCodeBlock();
				setState(835);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				match(Interface);
				setState(838);
				match(Identifier);
				setState(839);
				match(Extends);
				setState(840);
				match(Identifier);
				setState(841);
				match(OpenBlock);
				setState(842);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(Interface);
				setState(844);
				match(Identifier);
				setState(845);
				match(Extends);
				setState(846);
				match(Identifier);
				setState(847);
				match(OpenBlock);
				setState(848);
				functionCodeBlock();
				setState(849);
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
		enterRule(_localctx, 116, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
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
		enterRule(_localctx, 118, RULE_abstractClassDefinition);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(Abstract);
				setState(856);
				match(Identifier);
				setState(857);
				match(OpenBlock);
				setState(858);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				match(Abstract);
				setState(860);
				match(Identifier);
				setState(861);
				match(OpenBlock);
				setState(862);
				functionCodeBlock();
				setState(863);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(865);
				match(Abstract);
				setState(866);
				match(Identifier);
				setState(867);
				match(Extends);
				setState(868);
				match(Identifier);
				setState(869);
				match(OpenBlock);
				setState(870);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(Abstract);
				setState(872);
				match(Identifier);
				setState(873);
				match(Extends);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_classDefination);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				classModesGeneral();
				setState(882);
				match(OpenBlock);
				setState(883);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				classModesGeneral();
				setState(886);
				match(OpenBlock);
				setState(887);
				functionCodeBlock();
				setState(888);
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
		enterRule(_localctx, 122, RULE_classModesGeneral);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(Final);
				setState(894);
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
		enterRule(_localctx, 124, RULE_classModes);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(Class);
				setState(898);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(Class);
				setState(900);
				match(Identifier);
				setState(901);
				match(Extends);
				setState(902);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
				match(Class);
				setState(904);
				match(Identifier);
				setState(905);
				match(Implements);
				setState(906);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				match(Class);
				setState(908);
				match(Identifier);
				setState(909);
				match(Extends);
				setState(910);
				match(Identifier);
				setState(911);
				match(Implements);
				setState(912);
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
		public OperationBlockContext operationBlock() {
			return getRuleContext(OperationBlockContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generalValue);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(Identifier);
				setState(917);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(919);
				match(Integer);
				setState(920);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(922);
				match(Float);
				setState(923);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(924);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(925);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(926);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(927);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(928);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return fileContent_sempred((FileContentContext)_localctx, predIndex);
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u03a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0089\n\3\f\3\16"+
		"\3\u008c\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0097\n\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a4\n\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d6\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00dd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00ef\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f7\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0106\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0111\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u011b\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u017f\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0189\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0195\n\32\3\33"+
		"\3\33\3\33\5\33\u019a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01a4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b9\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01ce\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01dc\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01e6\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u01f2\n!\3\"\3\"\3\"\3\"\5\"\u01f8\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u0201\n#\f#\16#\u0204\13#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0266\n$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u027b\n%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u028f\n&\3\'"+
		"\3\'\5\'\u0293\n\'\3(\3(\5(\u0297\n(\3)\3)\5)\u029b\n)\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\5*\u02a7\n*\3+\3+\3+\3+\5+\u02ad\n+\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\5,\u02b7\n,\3-\3-\3-\3-\3.\3.\3.\5.\u02c0\n.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u02e0\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u02fa\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0315\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0321"+
		"\n\64\3\65\3\65\5\65\u0325\n\65\3\66\3\66\3\66\3\66\5\66\u032b\n\66\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u0332\n\67\38\38\38\39\39\39\59\u033a\n9"+
		"\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\5;\u0356\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0372\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\5>\u037d\n>\3?\3?\3?\5?\u0382\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\5@\u0394\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A"+
		"\u03a4\nA\3A\2\4\4DB\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\4\3\2#$\3\2\13"+
		"\r\2\u0413\2\u0082\3\2\2\2\4\u0085\3\2\2\2\6\u0096\3\2\2\2\b\u0098\3\2"+
		"\2\2\n\u009a\3\2\2\2\f\u00a3\3\2\2\2\16\u00a5\3\2\2\2\20\u00a7\3\2\2\2"+
		"\22\u00d5\3\2\2\2\24\u00dc\3\2\2\2\26\u00ee\3\2\2\2\30\u00f6\3\2\2\2\32"+
		"\u00fd\3\2\2\2\34\u0105\3\2\2\2\36\u0110\3\2\2\2 \u0112\3\2\2\2\"\u011a"+
		"\3\2\2\2$\u0169\3\2\2\2&\u016b\3\2\2\2(\u016d\3\2\2\2*\u016f\3\2\2\2,"+
		"\u017e\3\2\2\2.\u0180\3\2\2\2\60\u0188\3\2\2\2\62\u0194\3\2\2\2\64\u0199"+
		"\3\2\2\2\66\u01a3\3\2\2\28\u01b8\3\2\2\2:\u01cd\3\2\2\2<\u01db\3\2\2\2"+
		">\u01e5\3\2\2\2@\u01f1\3\2\2\2B\u01f7\3\2\2\2D\u01f9\3\2\2\2F\u0265\3"+
		"\2\2\2H\u027a\3\2\2\2J\u028e\3\2\2\2L\u0292\3\2\2\2N\u0296\3\2\2\2P\u029a"+
		"\3\2\2\2R\u02a6\3\2\2\2T\u02ac\3\2\2\2V\u02b6\3\2\2\2X\u02b8\3\2\2\2Z"+
		"\u02bf\3\2\2\2\\\u02df\3\2\2\2^\u02f9\3\2\2\2`\u02fb\3\2\2\2b\u0314\3"+
		"\2\2\2d\u0316\3\2\2\2f\u0320\3\2\2\2h\u0324\3\2\2\2j\u032a\3\2\2\2l\u0331"+
		"\3\2\2\2n\u0333\3\2\2\2p\u0339\3\2\2\2r\u033b\3\2\2\2t\u0355\3\2\2\2v"+
		"\u0357\3\2\2\2x\u0371\3\2\2\2z\u037c\3\2\2\2|\u0381\3\2\2\2~\u0393\3\2"+
		"\2\2\u0080\u03a3\3\2\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\2\2\3\u0084"+
		"\3\3\2\2\2\u0085\u008a\b\3\1\2\u0086\u0087\f\4\2\2\u0087\u0089\5\6\4\2"+
		"\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\5\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0097\5\b\5\2\u008e"+
		"\u0097\5\n\6\2\u008f\u0097\5\20\t\2\u0090\u0097\5*\26\2\u0091\u0097\5"+
		"\64\33\2\u0092\u0097\5H%\2\u0093\u0097\5\\/\2\u0094\u0097\5X-\2\u0095"+
		"\u0097\5p9\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2"+
		"\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\7\3\2\2\2\u0098"+
		"\u0099\7.\2\2\u0099\t\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5\f\7\2"+
		"\u009c\u009d\7\27\2\2\u009d\13\3\2\2\2\u009e\u00a4\5\16\b\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\7"+
		"*\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\5\22\n\2\u00a8\21\3\2\2\2\u00a9\u00aa"+
		"\7\4\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7\27\2\2\u00ac\u00d6\3\2\2"+
		"\2\u00ad\u00ae\5d\63\2\u00ae\u00af\7\4\2\2\u00af\u00b0\5\24\13\2\u00b0"+
		"\u00b1\7\27\2\2\u00b1\u00d6\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\7"+
		"\4\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7\27\2\2\u00b6\u00d6\3\2\2\2"+
		"\u00b7\u00b8\5d\63\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb"+
		"\5\24\13\2\u00bb\u00bc\7\27\2\2\u00bc\u00d6\3\2\2\2\u00bd\u00be\7\17\2"+
		"\2\u00be\u00bf\5d\63\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\7\4\2\2\u00c1"+
		"\u00c2\5\24\13\2\u00c2\u00c3\7\27\2\2\u00c3\u00d6\3\2\2\2\u00c4\u00c5"+
		"\7\17\2\2\u00c5\u00c6\5d\63\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\24\13"+
		"\2\u00c8\u00c9\7\27\2\2\u00c9\u00d6\3\2\2\2\u00ca\u00cb\7\17\2\2\u00cb"+
		"\u00cc\7\4\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7\27\2\2\u00ce\u00d6"+
		"\3\2\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\7\4\2\2"+
		"\u00d2\u00d3\5\24\13\2\u00d3\u00d4\7\27\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00a9\3\2\2\2\u00d5\u00ad\3\2\2\2\u00d5\u00b2\3\2\2\2\u00d5\u00b7\3\2"+
		"\2\2\u00d5\u00bd\3\2\2\2\u00d5\u00c4\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00dd\5\26\f\2\u00d8\u00d9\5\26"+
		"\f\2\u00d9\u00da\7\34\2\2\u00da\u00db\5\24\13\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\7\'\2"+
		"\2\u00df\u00e0\7\30\2\2\u00e0\u00ef\5\u0080A\2\u00e1\u00e2\7\'\2\2\u00e2"+
		"\u00e3\7)\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00ef\5\u0080A\2\u00e5\u00e6"+
		"\7\'\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00ef\5\u0080"+
		"A\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7\30\2\2\u00ec"+
		"\u00ed\7\25\2\2\u00ed\u00ef\5\u0080A\2\u00ee\u00de\3\2\2\2\u00ee\u00e1"+
		"\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef\27\3\2\2\2\u00f0"+
		"\u00f1\7\35\2\2\u00f1\u00f7\7\36\2\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4"+
		"\5\32\16\2\u00f4\u00f5\7\36\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2"+
		"\2\u00f6\u00f2\3\2\2\2\u00f7\31\3\2\2\2\u00f8\u00fe\5\u0080A\2\u00f9\u00fa"+
		"\5\u0080A\2\u00fa\u00fb\7\34\2\2\u00fb\u00fc\5\32\16\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\33\3\2\2\2\u00ff\u0100"+
		"\7\37\2\2\u0100\u0106\7 \2\2\u0101\u0102\7\37\2\2\u0102\u0103\5\36\20"+
		"\2\u0103\u0104\7 \2\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0101"+
		"\3\2\2\2\u0106\35\3\2\2\2\u0107\u0108\7\'\2\2\u0108\u0109\7\32\2\2\u0109"+
		"\u0111\5\u0080A\2\u010a\u010b\7\'\2\2\u010b\u010c\7\32\2\2\u010c\u010d"+
		"\5\u0080A\2\u010d\u010e\7\34\2\2\u010e\u010f\5\36\20\2\u010f\u0111\3\2"+
		"\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0111\37\3\2\2\2\u0112\u0113"+
		"\7!\2\2\u0113\u0114\5\"\22\2\u0114\u0115\7\"\2\2\u0115!\3\2\2\2\u0116"+
		"\u011b\5$\23\2\u0117\u0118\5$\23\2\u0118\u0119\5\"\22\2\u0119\u011b\3"+
		"\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011b#\3\2\2\2\u011c\u016a"+
		"\7\'\2\2\u011d\u011e\7\'\2\2\u011e\u016a\7#\2\2\u011f\u0120\7\'\2\2\u0120"+
		"\u016a\7)\2\2\u0121\u0122\7\'\2\2\u0122\u0123\7)\2\2\u0123\u016a\7#\2"+
		"\2\u0124\u0125\5&\24\2\u0125\u0126\7\'\2\2\u0126\u016a\3\2\2\2\u0127\u0128"+
		"\5&\24\2\u0128\u0129\7\'\2\2\u0129\u012a\7#\2\2\u012a\u016a\3\2\2\2\u012b"+
		"\u012c\5&\24\2\u012c\u012d\7\'\2\2\u012d\u012e\7)\2\2\u012e\u016a\3\2"+
		"\2\2\u012f\u0130\5&\24\2\u0130\u0131\7\'\2\2\u0131\u0132\7)\2\2\u0132"+
		"\u0133\7#\2\2\u0133\u016a\3\2\2\2\u0134\u0135\7\'\2\2\u0135\u016a\5(\25"+
		"\2\u0136\u0137\7\'\2\2\u0137\u0138\5(\25\2\u0138\u0139\7#\2\2\u0139\u016a"+
		"\3\2\2\2\u013a\u013b\7\'\2\2\u013b\u013c\5(\25\2\u013c\u013d\7)\2\2\u013d"+
		"\u016a\3\2\2\2\u013e\u013f\7\'\2\2\u013f\u0140\5(\25\2\u0140\u0141\7)"+
		"\2\2\u0141\u0142\7#\2\2\u0142\u016a\3\2\2\2\u0143\u016a\7+\2\2\u0144\u0145"+
		"\7+\2\2\u0145\u016a\7#\2\2\u0146\u0147\7+\2\2\u0147\u016a\7)\2\2\u0148"+
		"\u0149\7+\2\2\u0149\u014a\7)\2\2\u014a\u016a\7#\2\2\u014b\u016a\7,\2\2"+
		"\u014c\u014d\7,\2\2\u014d\u016a\7#\2\2\u014e\u014f\7,\2\2\u014f\u016a"+
		"\7)\2\2\u0150\u0151\7,\2\2\u0151\u0152\7)\2\2\u0152\u016a\7#\2\2\u0153"+
		"\u016a\5,\27\2\u0154\u0155\5,\27\2\u0155\u0156\7#\2\2\u0156\u016a\3\2"+
		"\2\2\u0157\u0158\5,\27\2\u0158\u0159\7)\2\2\u0159\u016a\3\2\2\2\u015a"+
		"\u015b\5,\27\2\u015b\u015c\7)\2\2\u015c\u015d\7#\2\2\u015d\u016a\3\2\2"+
		"\2\u015e\u016a\5 \21\2\u015f\u0160\5 \21\2\u0160\u0161\7#\2\2\u0161\u016a"+
		"\3\2\2\2\u0162\u0163\5 \21\2\u0163\u0164\7)\2\2\u0164\u016a\3\2\2\2\u0165"+
		"\u0166\5 \21\2\u0166\u0167\7)\2\2\u0167\u0168\7#\2\2\u0168\u016a\3\2\2"+
		"\2\u0169\u011c\3\2\2\2\u0169\u011d\3\2\2\2\u0169\u011f\3\2\2\2\u0169\u0121"+
		"\3\2\2\2\u0169\u0124\3\2\2\2\u0169\u0127\3\2\2\2\u0169\u012b\3\2\2\2\u0169"+
		"\u012f\3\2\2\2\u0169\u0134\3\2\2\2\u0169\u0136\3\2\2\2\u0169\u013a\3\2"+
		"\2\2\u0169\u013e\3\2\2\2\u0169\u0143\3\2\2\2\u0169\u0144\3\2\2\2\u0169"+
		"\u0146\3\2\2\2\u0169\u0148\3\2\2\2\u0169\u014b\3\2\2\2\u0169\u014c\3\2"+
		"\2\2\u0169\u014e\3\2\2\2\u0169\u0150\3\2\2\2\u0169\u0153\3\2\2\2\u0169"+
		"\u0154\3\2\2\2\u0169\u0157\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015e\3\2"+
		"\2\2\u0169\u015f\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0165\3\2\2\2\u016a"+
		"%\3\2\2\2\u016b\u016c\7&\2\2\u016c\'\3\2\2\2\u016d\u016e\7&\2\2\u016e"+
		")\3\2\2\2\u016f\u0170\5,\27\2\u0170\u0171\7\27\2\2\u0171+\3\2\2\2\u0172"+
		"\u0173\7\'\2\2\u0173\u017f\5\60\31\2\u0174\u0175\7\'\2\2\u0175\u0176\7"+
		"\31\2\2\u0176\u0177\5.\30\2\u0177\u0178\5\60\31\2\u0178\u017f\3\2\2\2"+
		"\u0179\u017a\7\'\2\2\u017a\u017b\7\33\2\2\u017b\u017c\5.\30\2\u017c\u017d"+
		"\5\60\31\2\u017d\u017f\3\2\2\2\u017e\u0172\3\2\2\2\u017e\u0174\3\2\2\2"+
		"\u017e\u0179\3\2\2\2\u017f-\3\2\2\2\u0180\u0181\7\'\2\2\u0181/\3\2\2\2"+
		"\u0182\u0183\7!\2\2\u0183\u0189\7\"\2\2\u0184\u0185\7!\2\2\u0185\u0186"+
		"\5\62\32\2\u0186\u0187\7\"\2\2\u0187\u0189\3\2\2\2\u0188\u0182\3\2\2\2"+
		"\u0188\u0184\3\2\2\2\u0189\61\3\2\2\2\u018a\u0195\5\u0080A\2\u018b\u018c"+
		"\5\u0080A\2\u018c\u018d\7\34\2\2\u018d\u018e\5\62\32\2\u018e\u0195\3\2"+
		"\2\2\u018f\u0195\5\"\22\2\u0190\u0191\5\"\22\2\u0191\u0192\7\34\2\2\u0192"+
		"\u0193\5\62\32\2\u0193\u0195\3\2\2\2\u0194\u018a\3\2\2\2\u0194\u018b\3"+
		"\2\2\2\u0194\u018f\3\2\2\2\u0194\u0190\3\2\2\2\u0195\63\3\2\2\2\u0196"+
		"\u019a\58\35\2\u0197\u019a\5:\36\2\u0198\u019a\5<\37\2\u0199\u0196\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\65\3\2\2\2\u019b\u01a4"+
		"\5\64\33\2\u019c\u019d\5\64\33\2\u019d\u019e\5\66\34\2\u019e\u01a4\3\2"+
		"\2\2\u019f\u01a4\5\6\4\2\u01a0\u01a1\5\6\4\2\u01a1\u01a2\5\66\34\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019f\3\2"+
		"\2\2\u01a3\u01a0\3\2\2\2\u01a4\67\3\2\2\2\u01a5\u01a6\7\5\2\2\u01a6\u01a7"+
		"\5@!\2\u01a7\u01a8\5*\26\2\u01a8\u01b9\3\2\2\2\u01a9\u01aa\7\5\2\2\u01aa"+
		"\u01ab\5@!\2\u01ab\u01ac\7\37\2\2\u01ac\u01ad\7 \2\2\u01ad\u01b9\3\2\2"+
		"\2\u01ae\u01af\7\5\2\2\u01af\u01b0\5@!\2\u01b0\u01b1\7\37\2\2\u01b1\u01b2"+
		"\5\66\34\2\u01b2\u01b3\7 \2\2\u01b3\u01b9\3\2\2\2\u01b4\u01b5\7\5\2\2"+
		"\u01b5\u01b6\5@!\2\u01b6\u01b7\5> \2\u01b7\u01b9\3\2\2\2\u01b8\u01a5\3"+
		"\2\2\2\u01b8\u01a9\3\2\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b9"+
		"9\3\2\2\2\u01ba\u01bb\7\6\2\2\u01bb\u01bc\5@!\2\u01bc\u01bd\5*\26\2\u01bd"+
		"\u01ce\3\2\2\2\u01be\u01bf\7\6\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\7\37"+
		"\2\2\u01c1\u01c2\7 \2\2\u01c2\u01ce\3\2\2\2\u01c3\u01c4\7\6\2\2\u01c4"+
		"\u01c5\5@!\2\u01c5\u01c6\7\37\2\2\u01c6\u01c7\5\66\34\2\u01c7\u01c8\7"+
		" \2\2\u01c8\u01ce\3\2\2\2\u01c9\u01ca\7\6\2\2\u01ca\u01cb\5@!\2\u01cb"+
		"\u01cc\5> \2\u01cc\u01ce\3\2\2\2\u01cd\u01ba\3\2\2\2\u01cd\u01be\3\2\2"+
		"\2\u01cd\u01c3\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce;\3\2\2\2\u01cf\u01d0"+
		"\7\7\2\2\u01d0\u01dc\5*\26\2\u01d1\u01d2\7\7\2\2\u01d2\u01d3\7\37\2\2"+
		"\u01d3\u01dc\7 \2\2\u01d4\u01d5\7\7\2\2\u01d5\u01d6\7\37\2\2\u01d6\u01d7"+
		"\5\66\34\2\u01d7\u01d8\7 \2\2\u01d8\u01dc\3\2\2\2\u01d9\u01da\7\7\2\2"+
		"\u01da\u01dc\5> \2\u01db\u01cf\3\2\2\2\u01db\u01d1\3\2\2\2\u01db\u01d4"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc=\3\2\2\2\u01dd\u01e6\58\35\2\u01de"+
		"\u01df\58\35\2\u01df\u01e0\5\66\34\2\u01e0\u01e6\3\2\2\2\u01e1\u01e6\5"+
		"H%\2\u01e2\u01e3\5H%\2\u01e3\u01e4\5V,\2\u01e4\u01e6\3\2\2\2\u01e5\u01dd"+
		"\3\2\2\2\u01e5\u01de\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e6"+
		"?\3\2\2\2\u01e7\u01f2\5B\"\2\u01e8\u01e9\5B\"\2\u01e9\u01ea\5@!\2\u01ea"+
		"\u01f2\3\2\2\2\u01eb\u01f2\5D#\2\u01ec\u01ed\5D#\2\u01ed\u01ee\5@!\2\u01ee"+
		"\u01f2\3\2\2\2\u01ef\u01f0\7%\2\2\u01f0\u01f2\5@!\2\u01f1\u01e7\3\2\2"+
		"\2\u01f1\u01e8\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f2A\3\2\2\2\u01f3\u01f8\5F$\2\u01f4\u01f5\5F$\2\u01f5\u01f6"+
		"\5B\"\2\u01f6\u01f8\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8"+
		"C\3\2\2\2\u01f9\u01fa\b#\1\2\u01fa\u01fb\7!\2\2\u01fb\u01fc\5@!\2\u01fc"+
		"\u01fd\7\"\2\2\u01fd\u0202\3\2\2\2\u01fe\u01ff\f\3\2\2\u01ff\u0201\7$"+
		"\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203E\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0266\7\'\2\2"+
		"\u0206\u0207\7\'\2\2\u0207\u0266\t\2\2\2\u0208\u0209\7\'\2\2\u0209\u0266"+
		"\7)\2\2\u020a\u020b\7\'\2\2\u020b\u020c\7)\2\2\u020c\u0266\t\2\2\2\u020d"+
		"\u020e\5&\24\2\u020e\u020f\7\'\2\2\u020f\u0266\3\2\2\2\u0210\u0211\5&"+
		"\24\2\u0211\u0212\7\'\2\2\u0212\u0213\t\2\2\2\u0213\u0266\3\2\2\2\u0214"+
		"\u0215\5&\24\2\u0215\u0216\7\'\2\2\u0216\u0217\7)\2\2\u0217\u0266\3\2"+
		"\2\2\u0218\u0219\5&\24\2\u0219\u021a\7\'\2\2\u021a\u021b\7)\2\2\u021b"+
		"\u021c\t\2\2\2\u021c\u0266\3\2\2\2\u021d\u021e\7\'\2\2\u021e\u0266\5("+
		"\25\2\u021f\u0220\7\'\2\2\u0220\u0221\5(\25\2\u0221\u0222\t\2\2\2\u0222"+
		"\u0266\3\2\2\2\u0223\u0224\7\'\2\2\u0224\u0225\5(\25\2\u0225\u0226\7)"+
		"\2\2\u0226\u0266\3\2\2\2\u0227\u0228\7\'\2\2\u0228\u0229\5(\25\2\u0229"+
		"\u022a\7)\2\2\u022a\u022b\t\2\2\2\u022b\u0266\3\2\2\2\u022c\u0266\7+\2"+
		"\2\u022d\u022e\7+\2\2\u022e\u0266\t\2\2\2\u022f\u0230\7+\2\2\u0230\u0266"+
		"\7)\2\2\u0231\u0232\7+\2\2\u0232\u0233\7)\2\2\u0233\u0266\t\2\2\2\u0234"+
		"\u0266\7,\2\2\u0235\u0236\7,\2\2\u0236\u0266\t\2\2\2\u0237\u0238\7,\2"+
		"\2\u0238\u0266\7)\2\2\u0239\u023a\7,\2\2\u023a\u023b\7)\2\2\u023b\u0266"+
		"\t\2\2\2\u023c\u0266\5,\27\2\u023d\u023e\5,\27\2\u023e\u023f\t\2\2\2\u023f"+
		"\u0266\3\2\2\2\u0240\u0241\5,\27\2\u0241\u0242\7)\2\2\u0242\u0266\3\2"+
		"\2\2\u0243\u0244\5,\27\2\u0244\u0245\7)\2\2\u0245\u0246\t\2\2\2\u0246"+
		"\u0266\3\2\2\2\u0247\u0248\7\'\2\2\u0248\u0249\7\30\2\2\u0249\u0266\5"+
		",\27\2\u024a\u024b\7\'\2\2\u024b\u024c\7\30\2\2\u024c\u024d\5,\27\2\u024d"+
		"\u024e\t\2\2\2\u024e\u0266\3\2\2\2\u024f\u0250\7\'\2\2\u0250\u0251\7\30"+
		"\2\2\u0251\u0252\5,\27\2\u0252\u0253\7)\2\2\u0253\u0266\3\2\2\2\u0254"+
		"\u0255\7\'\2\2\u0255\u0256\7\30\2\2\u0256\u0257\5,\27\2\u0257\u0258\7"+
		")\2\2\u0258\u0259\t\2\2\2\u0259\u0266\3\2\2\2\u025a\u0266\5 \21\2\u025b"+
		"\u025c\5 \21\2\u025c\u025d\t\2\2\2\u025d\u0266\3\2\2\2\u025e\u025f\5 "+
		"\21\2\u025f\u0260\7)\2\2\u0260\u0266\3\2\2\2\u0261\u0262\5 \21\2\u0262"+
		"\u0263\7)\2\2\u0263\u0264\t\2\2\2\u0264\u0266\3\2\2\2\u0265\u0205\3\2"+
		"\2\2\u0265\u0206\3\2\2\2\u0265\u0208\3\2\2\2\u0265\u020a\3\2\2\2\u0265"+
		"\u020d\3\2\2\2\u0265\u0210\3\2\2\2\u0265\u0214\3\2\2\2\u0265\u0218\3\2"+
		"\2\2\u0265\u021d\3\2\2\2\u0265\u021f\3\2\2\2\u0265\u0223\3\2\2\2\u0265"+
		"\u0227\3\2\2\2\u0265\u022c\3\2\2\2\u0265\u022d\3\2\2\2\u0265\u022f\3\2"+
		"\2\2\u0265\u0231\3\2\2\2\u0265\u0234\3\2\2\2\u0265\u0235\3\2\2\2\u0265"+
		"\u0237\3\2\2\2\u0265\u0239\3\2\2\2\u0265\u023c\3\2\2\2\u0265\u023d\3\2"+
		"\2\2\u0265\u0240\3\2\2\2\u0265\u0243\3\2\2\2\u0265\u0247\3\2\2\2\u0265"+
		"\u024a\3\2\2\2\u0265\u024f\3\2\2\2\u0265\u0254\3\2\2\2\u0265\u025a\3\2"+
		"\2\2\u0265\u025b\3\2\2\2\u0265\u025e\3\2\2\2\u0265\u0261\3\2\2\2\u0266"+
		"G\3\2\2\2\u0267\u0268\7\b\2\2\u0268\u0269\5J&\2\u0269\u026a\7\37\2\2\u026a"+
		"\u026b\7 \2\2\u026b\u027b\3\2\2\2\u026c\u026d\7\b\2\2\u026d\u026e\5J&"+
		"\2\u026e\u026f\7\37\2\2\u026f\u0270\5T+\2\u0270\u0271\7 \2\2\u0271\u027b"+
		"\3\2\2\2\u0272\u0273\7\b\2\2\u0273\u0274\5J&\2\u0274\u0275\5*\26\2\u0275"+
		"\u027b\3\2\2\2\u0276\u0277\7\b\2\2\u0277\u0278\5J&\2\u0278\u0279\5V,\2"+
		"\u0279\u027b\3\2\2\2\u027a\u0267\3\2\2\2\u027a\u026c\3\2\2\2\u027a\u0272"+
		"\3\2\2\2\u027a\u0276\3\2\2\2\u027bI\3\2\2\2\u027c\u027d\7!\2\2\u027d\u027e"+
		"\5L\'\2\u027e\u027f\7\27\2\2\u027f\u0280\5N(\2\u0280\u0281\7\27\2\2\u0281"+
		"\u0282\5P)\2\u0282\u0283\7\"\2\2\u0283\u028f\3\2\2\2\u0284\u0285\5L\'"+
		"\2\u0285\u0286\7\27\2\2\u0286\u0287\5N(\2\u0287\u0288\7\27\2\2\u0288\u0289"+
		"\5P)\2\u0289\u028f\3\2\2\2\u028a\u028f\5@!\2\u028b\u028c\7!\2\2\u028c"+
		"\u028f\7\"\2\2\u028d\u028f\3\2\2\2\u028e\u027c\3\2\2\2\u028e\u0284\3\2"+
		"\2\2\u028e\u028a\3\2\2\2\u028e\u028b\3\2\2\2\u028e\u028d\3\2\2\2\u028f"+
		"K\3\2\2\2\u0290\u0293\5\24\13\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2\2"+
		"\2\u0292\u0291\3\2\2\2\u0293M\3\2\2\2\u0294\u0297\5@!\2\u0295\u0297\3"+
		"\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297O\3\2\2\2\u0298\u029b"+
		"\5R*\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029b"+
		"Q\3\2\2\2\u029c\u02a7\5\"\22\2\u029d\u02a7\5 \21\2\u029e\u029f\5\"\22"+
		"\2\u029f\u02a0\7\34\2\2\u02a0\u02a1\5R*\2\u02a1\u02a7\3\2\2\2\u02a2\u02a3"+
		"\5 \21\2\u02a3\u02a4\7\34\2\2\u02a4\u02a5\5R*\2\u02a5\u02a7\3\2\2\2\u02a6"+
		"\u029c\3\2\2\2\u02a6\u029d\3\2\2\2\u02a6\u029e\3\2\2\2\u02a6\u02a2\3\2"+
		"\2\2\u02a7S\3\2\2\2\u02a8\u02ad\5\6\4\2\u02a9\u02aa\5\6\4\2\u02aa\u02ab"+
		"\5T+\2\u02ab\u02ad\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ad"+
		"U\3\2\2\2\u02ae\u02b7\58\35\2\u02af\u02b0\58\35\2\u02b0\u02b1\5V,\2\u02b1"+
		"\u02b7\3\2\2\2\u02b2\u02b7\5H%\2\u02b3\u02b4\5H%\2\u02b4\u02b5\5V,\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02ae\3\2\2\2\u02b6\u02af\3\2\2\2\u02b6\u02b2\3\2"+
		"\2\2\u02b6\u02b3\3\2\2\2\u02b7W\3\2\2\2\u02b8\u02b9\7\t\2\2\u02b9\u02ba"+
		"\5Z.\2\u02ba\u02bb\7\27\2\2\u02bbY\3\2\2\2\u02bc\u02c0\5\u0080A\2\u02bd"+
		"\u02c0\5\"\22\2\u02be\u02c0\5 \21\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd\3"+
		"\2\2\2\u02bf\u02be\3\2\2\2\u02c0[\3\2\2\2\u02c1\u02c2\5`\61\2\u02c2\u02c3"+
		"\7\37\2\2\u02c3\u02c4\7 \2\2\u02c4\u02e0\3\2\2\2\u02c5\u02c6\5`\61\2\u02c6"+
		"\u02c7\7\37\2\2\u02c7\u02c8\5j\66\2\u02c8\u02c9\7 \2\2\u02c9\u02e0\3\2"+
		"\2\2\u02ca\u02cb\5b\62\2\u02cb\u02cc\7\37\2\2\u02cc\u02cd\7 \2\2\u02cd"+
		"\u02e0\3\2\2\2\u02ce\u02cf\5b\62\2\u02cf\u02d0\7\37\2\2\u02d0\u02d1\5"+
		"j\66\2\u02d1\u02d2\7 \2\2\u02d2\u02e0\3\2\2\2\u02d3\u02d4\5f\64\2\u02d4"+
		"\u02d5\7\37\2\2\u02d5\u02d6\7 \2\2\u02d6\u02e0\3\2\2\2\u02d7\u02d8\5f"+
		"\64\2\u02d8\u02d9\7\37\2\2\u02d9\u02da\5j\66\2\u02da\u02db\7 \2\2\u02db"+
		"\u02e0\3\2\2\2\u02dc\u02dd\5h\65\2\u02dd\u02de\7\27\2\2\u02de\u02e0\3"+
		"\2\2\2\u02df\u02c1\3\2\2\2\u02df\u02c5\3\2\2\2\u02df\u02ca\3\2\2\2\u02df"+
		"\u02ce\3\2\2\2\u02df\u02d3\3\2\2\2\u02df\u02d7\3\2\2\2\u02df\u02dc\3\2"+
		"\2\2\u02e0]\3\2\2\2\u02e1\u02e2\7\n\2\2\u02e2\u02e3\7\'\2\2\u02e3\u02e4"+
		"\7!\2\2\u02e4\u02fa\7\"\2\2\u02e5\u02e6\7\n\2\2\u02e6\u02e7\7\'\2\2\u02e7"+
		"\u02e8\7!\2\2\u02e8\u02e9\7\"\2\2\u02e9\u02ea\7\26\2\2\u02ea\u02fa\7\'"+
		"\2\2\u02eb\u02ec\7\n\2\2\u02ec\u02ed\7\'\2\2\u02ed\u02ee\7!\2\2\u02ee"+
		"\u02ef\5l\67\2\u02ef\u02f0\7\"\2\2\u02f0\u02fa\3\2\2\2\u02f1\u02f2\7\n"+
		"\2\2\u02f2\u02f3\7\'\2\2\u02f3\u02f4\7!\2\2\u02f4\u02f5\5l\67\2\u02f5"+
		"\u02f6\7\"\2\2\u02f6\u02f7\7\26\2\2\u02f7\u02f8\7\'\2\2\u02f8\u02fa\3"+
		"\2\2\2\u02f9\u02e1\3\2\2\2\u02f9\u02e5\3\2\2\2\u02f9\u02eb\3\2\2\2\u02f9"+
		"\u02f1\3\2\2\2\u02fa_\3\2\2\2\u02fb\u02fc\5^\60\2\u02fca\3\2\2\2\u02fd"+
		"\u02fe\5d\63\2\u02fe\u02ff\5^\60\2\u02ff\u0315\3\2\2\2\u0300\u0301\7\16"+
		"\2\2\u0301\u0315\5^\60\2\u0302\u0303\5d\63\2\u0303\u0304\7\16\2\2\u0304"+
		"\u0305\5^\60\2\u0305\u0315\3\2\2\2\u0306\u0307\7\17\2\2\u0307\u0308\5"+
		"d\63\2\u0308\u0309\7\16\2\2\u0309\u030a\5^\60\2\u030a\u0315\3\2\2\2\u030b"+
		"\u030c\7\17\2\2\u030c\u030d\5d\63\2\u030d\u030e\5^\60\2\u030e\u0315\3"+
		"\2\2\2\u030f\u0310\7\17\2\2\u0310\u0315\5^\60\2\u0311\u0312\7\17\2\2\u0312"+
		"\u0313\7\16\2\2\u0313\u0315\5^\60\2\u0314\u02fd\3\2\2\2\u0314\u0300\3"+
		"\2\2\2\u0314\u0302\3\2\2\2\u0314\u0306\3\2\2\2\u0314\u030b\3\2\2\2\u0314"+
		"\u030f\3\2\2\2\u0314\u0311\3\2\2\2\u0315c\3\2\2\2\u0316\u0317\t\3\2\2"+
		"\u0317e\3\2\2\2\u0318\u0319\7\'\2\2\u0319\u031a\7!\2\2\u031a\u0321\7\""+
		"\2\2\u031b\u031c\7\'\2\2\u031c\u031d\7!\2\2\u031d\u031e\5l\67\2\u031e"+
		"\u031f\7\"\2\2\u031f\u0321\3\2\2\2\u0320\u0318\3\2\2\2\u0320\u031b\3\2"+
		"\2\2\u0321g\3\2\2\2\u0322\u0325\5`\61\2\u0323\u0325\5b\62\2\u0324\u0322"+
		"\3\2\2\2\u0324\u0323\3\2\2\2\u0325i\3\2\2\2\u0326\u032b\5\6\4\2\u0327"+
		"\u0328\5\6\4\2\u0328\u0329\5j\66\2\u0329\u032b\3\2\2\2\u032a\u0326\3\2"+
		"\2\2\u032a\u0327\3\2\2\2\u032bk\3\2\2\2\u032c\u0332\5n8\2\u032d\u032e"+
		"\5n8\2\u032e\u032f\7\34\2\2\u032f\u0330\5l\67\2\u0330\u0332\3\2\2\2\u0331"+
		"\u032c\3\2\2\2\u0331\u032d\3\2\2\2\u0332m\3\2\2\2\u0333\u0334\7\'\2\2"+
		"\u0334\u0335\7)\2\2\u0335o\3\2\2\2\u0336\u033a\5r:\2\u0337\u033a\5v<\2"+
		"\u0338\u033a\5z>\2\u0339\u0336\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u0338"+
		"\3\2\2\2\u033aq\3\2\2\2\u033b\u033c\5t;\2\u033cs\3\2\2\2\u033d\u033e\7"+
		"\20\2\2\u033e\u033f\7\'\2\2\u033f\u0340\7\37\2\2\u0340\u0356\7 \2\2\u0341"+
		"\u0342\7\20\2\2\u0342\u0343\7\'\2\2\u0343\u0344\7\37\2\2\u0344\u0345\5"+
		"j\66\2\u0345\u0346\7 \2\2\u0346\u0356\3\2\2\2\u0347\u0348\7\20\2\2\u0348"+
		"\u0349\7\'\2\2\u0349\u034a\7\22\2\2\u034a\u034b\7\'\2\2\u034b\u034c\7"+
		"\37\2\2\u034c\u0356\7 \2\2\u034d\u034e\7\20\2\2\u034e\u034f\7\'\2\2\u034f"+
		"\u0350\7\22\2\2\u0350\u0351\7\'\2\2\u0351\u0352\7\37\2\2\u0352\u0353\5"+
		"j\66\2\u0353\u0354\7 \2\2\u0354\u0356\3\2\2\2\u0355\u033d\3\2\2\2\u0355"+
		"\u0341\3\2\2\2\u0355\u0347\3\2\2\2\u0355\u034d\3\2\2\2\u0356u\3\2\2\2"+
		"\u0357\u0358\5x=\2\u0358w\3\2\2\2\u0359\u035a\7\21\2\2\u035a\u035b\7\'"+
		"\2\2\u035b\u035c\7\37\2\2\u035c\u0372\7 \2\2\u035d\u035e\7\21\2\2\u035e"+
		"\u035f\7\'\2\2\u035f\u0360\7\37\2\2\u0360\u0361\5j\66\2\u0361\u0362\7"+
		" \2\2\u0362\u0372\3\2\2\2\u0363\u0364\7\21\2\2\u0364\u0365\7\'\2\2\u0365"+
		"\u0366\7\22\2\2\u0366\u0367\7\'\2\2\u0367\u0368\7\37\2\2\u0368\u0372\7"+
		" \2\2\u0369\u036a\7\21\2\2\u036a\u036b\7\'\2\2\u036b\u036c\7\22\2\2\u036c"+
		"\u036d\7\'\2\2\u036d\u036e\7\37\2\2\u036e\u036f\5j\66\2\u036f\u0370\7"+
		" \2\2\u0370\u0372\3\2\2\2\u0371\u0359\3\2\2\2\u0371\u035d\3\2\2\2\u0371"+
		"\u0363\3\2\2\2\u0371\u0369\3\2\2\2\u0372y\3\2\2\2\u0373\u0374\5|?\2\u0374"+
		"\u0375\7\37\2\2\u0375\u0376\7 \2\2\u0376\u037d\3\2\2\2\u0377\u0378\5|"+
		"?\2\u0378\u0379\7\37\2\2\u0379\u037a\5j\66\2\u037a\u037b\7 \2\2\u037b"+
		"\u037d\3\2\2\2\u037c\u0373\3\2\2\2\u037c\u0377\3\2\2\2\u037d{\3\2\2\2"+
		"\u037e\u0382\5~@\2\u037f\u0380\7\17\2\2\u0380\u0382\5~@\2\u0381\u037e"+
		"\3\2\2\2\u0381\u037f\3\2\2\2\u0382}\3\2\2\2\u0383\u0384\7\23\2\2\u0384"+
		"\u0394\7\'\2\2\u0385\u0386\7\23\2\2\u0386\u0387\7\'\2\2\u0387\u0388\7"+
		"\22\2\2\u0388\u0394\7\'\2\2\u0389\u038a\7\23\2\2\u038a\u038b\7\'\2\2\u038b"+
		"\u038c\7\24\2\2\u038c\u0394\7\'\2\2\u038d\u038e\7\23\2\2\u038e\u038f\7"+
		"\'\2\2\u038f\u0390\7\22\2\2\u0390\u0391\7\'\2\2\u0391\u0392\7\24\2\2\u0392"+
		"\u0394\7\'\2\2\u0393\u0383\3\2\2\2\u0393\u0385\3\2\2\2\u0393\u0389\3\2"+
		"\2\2\u0393\u038d\3\2\2\2\u0394\177\3\2\2\2\u0395\u03a4\7\'\2\2\u0396\u0397"+
		"\7\'\2\2\u0397\u03a4\7)\2\2\u0398\u03a4\7+\2\2\u0399\u039a\7+\2\2\u039a"+
		"\u03a4\7)\2\2\u039b\u03a4\7,\2\2\u039c\u039d\7,\2\2\u039d\u03a4\7)\2\2"+
		"\u039e\u03a4\7*\2\2\u039f\u03a4\5\30\r\2\u03a0\u03a4\5\34\17\2\u03a1\u03a4"+
		"\5 \21\2\u03a2\u03a4\5,\27\2\u03a3\u0395\3\2\2\2\u03a3\u0396\3\2\2\2\u03a3"+
		"\u0398\3\2\2\2\u03a3\u0399\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3\u039c\3\2"+
		"\2\2\u03a3\u039e\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4\u0081\3\2\2\2\62\u008a\u0096"+
		"\u00a3\u00d5\u00dc\u00ee\u00f6\u00fd\u0105\u0110\u011a\u0169\u017e\u0188"+
		"\u0194\u0199\u01a3\u01b8\u01cd\u01db\u01e5\u01f1\u01f7\u0202\u0265\u027a"+
		"\u028e\u0292\u0296\u029a\u02a6\u02ac\u02b6\u02bf\u02df\u02f9\u0314\u0320"+
		"\u0324\u032a\u0331\u0339\u0355\u0371\u037c\u0381\u0393\u03a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}