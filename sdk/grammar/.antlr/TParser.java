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
		RULE_generalValue = 63, RULE_objIdentifierA = 64, RULE_objIdentifierB = 65;
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
			"classDefination", "classModesGeneral", "classModes", "generalValue", 
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
			setState(132);
			fileContent(0);
			setState(133);
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
			setState(140);
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
					setState(136);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(137);
					sentence();
					}
					} 
				}
				setState(142);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
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
			setState(154);
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
			setState(156);
			match(Use);
			setState(157);
			useValue();
			setState(158);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				useString();
				setState(162);
				match(Separator);
				setState(163);
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
			setState(167);
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
			setState(169);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Var);
				setState(172);
				variableMembers();
				setState(173);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				methodPerm();
				setState(176);
				match(Var);
				setState(177);
				variableMembers();
				setState(178);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(Static);
				setState(181);
				match(Var);
				setState(182);
				variableMembers();
				setState(183);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				methodPerm();
				setState(186);
				match(Static);
				setState(187);
				match(Var);
				setState(188);
				variableMembers();
				setState(189);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(Final);
				setState(192);
				methodPerm();
				setState(193);
				match(Static);
				setState(194);
				match(Var);
				setState(195);
				variableMembers();
				setState(196);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(Final);
				setState(199);
				methodPerm();
				setState(200);
				match(Var);
				setState(201);
				variableMembers();
				setState(202);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(Final);
				setState(205);
				match(Var);
				setState(206);
				variableMembers();
				setState(207);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(Final);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				variableDefinition();
				setState(219);
				match(Separator);
				setState(220);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(Identifier);
				setState(225);
				match(Attr);
				setState(226);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(Identifier);
				setState(228);
				match(TypeSpec);
				setState(229);
				match(Attr);
				setState(230);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(Identifier);
				setState(232);
				match(Attr);
				setState(233);
				match(New);
				setState(234);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(Identifier);
				setState(236);
				match(TypeSpec);
				setState(237);
				match(Attr);
				setState(238);
				match(New);
				setState(239);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(OpenArIndex);
				setState(243);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(OpenArIndex);
				setState(245);
				indexArrayElements();
				setState(246);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				generalValue();
				setState(252);
				match(Separator);
				setState(253);
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(OpenBlock);
				setState(258);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(OpenBlock);
				setState(260);
				associativeArrayElements();
				setState(261);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(Identifier);
				setState(266);
				match(TwoPoint);
				setState(267);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(Identifier);
				setState(269);
				match(TwoPoint);
				setState(270);
				generalValue();
				setState(271);
				match(Separator);
				setState(272);
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
			setState(276);
			match(OpenOp);
			setState(277);
			operationElements();
			setState(278);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				operationValue();
				setState(282);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(Identifier);
				setState(288);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(Identifier);
				setState(290);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(Identifier);
				setState(292);
				match(TypeSpec);
				setState(293);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				firstIncDec();
				setState(295);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				firstIncDec();
				setState(298);
				match(Identifier);
				setState(299);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				firstIncDec();
				setState(302);
				match(Identifier);
				setState(303);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				firstIncDec();
				setState(306);
				match(Identifier);
				setState(307);
				match(TypeSpec);
				setState(308);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(310);
				match(Identifier);
				setState(311);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(312);
				match(Identifier);
				setState(313);
				lastIncDec();
				setState(314);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(316);
				match(Identifier);
				setState(317);
				lastIncDec();
				setState(318);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(320);
				match(Identifier);
				setState(321);
				lastIncDec();
				setState(322);
				match(TypeSpec);
				setState(323);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(325);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(326);
				match(Integer);
				setState(327);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(328);
				match(Integer);
				setState(329);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(330);
				match(Integer);
				setState(331);
				match(TypeSpec);
				setState(332);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(333);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(334);
				match(Float);
				setState(335);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(336);
				match(Float);
				setState(337);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(338);
				match(Float);
				setState(339);
				match(TypeSpec);
				setState(340);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(341);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(342);
				functionCall();
				setState(343);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(345);
				functionCall();
				setState(346);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(348);
				functionCall();
				setState(349);
				match(TypeSpec);
				setState(350);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(352);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(353);
				operationBlock();
				setState(354);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(356);
				operationBlock();
				setState(357);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(359);
				operationBlock();
				setState(360);
				match(TypeSpec);
				setState(361);
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
			setState(365);
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
			setState(367);
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
			setState(369);
			functionCall();
			setState(370);
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
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(Identifier);
				setState(373);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(Identifier);
				setState(375);
				match(Point);
				setState(376);
				identifierB();
				setState(377);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(Identifier);
				setState(380);
				match(TwoTwoPoint);
				setState(381);
				identifierB();
				setState(382);
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
			setState(386);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(OpenOp);
				setState(389);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(OpenOp);
				setState(391);
				functionCallParamElements();
				setState(392);
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
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				generalValue();
				setState(398);
				match(Separator);
				setState(399);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				operationElements();
				setState(403);
				match(Separator);
				setState(404);
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
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
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
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				conditionalExpression();
				setState(415);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				sentence();
				setState(419);
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
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(If);
				setState(424);
				conditionalExpressionElements();
				setState(425);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(If);
				setState(428);
				conditionalExpressionElements();
				setState(429);
				match(OpenBlock);
				setState(430);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(If);
				setState(433);
				conditionalExpressionElements();
				setState(434);
				match(OpenBlock);
				setState(435);
				conditionalBlockElements();
				setState(436);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(If);
				setState(439);
				conditionalExpressionElements();
				setState(440);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(Elif);
				setState(445);
				conditionalExpressionElements();
				setState(446);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(Elif);
				setState(449);
				conditionalExpressionElements();
				setState(450);
				match(OpenBlock);
				setState(451);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(Elif);
				setState(454);
				conditionalExpressionElements();
				setState(455);
				match(OpenBlock);
				setState(456);
				conditionalBlockElements();
				setState(457);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				match(Elif);
				setState(460);
				conditionalExpressionElements();
				setState(461);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(Else);
				setState(466);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(Else);
				setState(468);
				match(OpenBlock);
				setState(469);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(Else);
				setState(471);
				match(OpenBlock);
				setState(472);
				conditionalBlockElements();
				setState(473);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(Else);
				setState(476);
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
		public CondBlockElementsLimitedContext condBlockElementsLimited() {
			return getRuleContext(CondBlockElementsLimitedContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				ifConditions();
				setState(481);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				loop();
				setState(485);
				condBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
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
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				conditionalExpElementsValue();
				setState(492);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				conditionExpBlock(0);
				setState(496);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(Not);
				setState(499);
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
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				conditionalExpValue();
				setState(504);
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
			setState(509);
			match(OpenOp);
			setState(510);
			conditionalExpressionElements();
			setState(511);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
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
					setState(513);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(514);
					match(AssignmentOperator);
					}
					} 
				}
				setState(519);
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
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				match(Identifier);
				setState(524);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				match(Identifier);
				setState(526);
				match(TypeSpec);
				setState(527);
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
				setState(528);
				firstIncDec();
				setState(529);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				firstIncDec();
				setState(532);
				match(Identifier);
				setState(533);
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
				setState(535);
				firstIncDec();
				setState(536);
				match(Identifier);
				setState(537);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(539);
				firstIncDec();
				setState(540);
				match(Identifier);
				setState(541);
				match(TypeSpec);
				setState(542);
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
				setState(544);
				match(Identifier);
				setState(545);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(546);
				match(Identifier);
				setState(547);
				lastIncDec();
				setState(548);
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
				setState(550);
				match(Identifier);
				setState(551);
				lastIncDec();
				setState(552);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(554);
				match(Identifier);
				setState(555);
				lastIncDec();
				setState(556);
				match(TypeSpec);
				setState(557);
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
				setState(559);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(560);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(562);
				match(Integer);
				setState(563);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(564);
				match(Integer);
				setState(565);
				match(TypeSpec);
				setState(566);
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
				setState(567);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(568);
				match(Float);
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(570);
				match(Float);
				setState(571);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(572);
				match(Float);
				setState(573);
				match(TypeSpec);
				setState(574);
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
				setState(575);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(576);
				functionCall();
				setState(577);
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
				setState(579);
				functionCall();
				setState(580);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(582);
				functionCall();
				setState(583);
				match(TypeSpec);
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(586);
				match(Identifier);
				setState(587);
				match(Attr);
				setState(588);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(589);
				match(Identifier);
				setState(590);
				match(Attr);
				setState(591);
				functionCall();
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
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(594);
				match(Identifier);
				setState(595);
				match(Attr);
				setState(596);
				functionCall();
				setState(597);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(599);
				match(Identifier);
				setState(600);
				match(Attr);
				setState(601);
				functionCall();
				setState(602);
				match(TypeSpec);
				setState(603);
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
				setState(605);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(606);
				operationBlock();
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(609);
				operationBlock();
				setState(610);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(612);
				operationBlock();
				setState(613);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(For);
				setState(619);
				loopExpression();
				setState(620);
				match(OpenBlock);
				setState(621);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(For);
				setState(624);
				loopExpression();
				setState(625);
				match(OpenBlock);
				setState(626);
				loopBlockElements();
				setState(627);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				match(For);
				setState(630);
				loopExpression();
				setState(631);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(For);
				setState(634);
				loopExpression();
				setState(635);
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
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(OpenOp);
				setState(640);
				loopOneMembers();
				setState(641);
				match(End);
				setState(642);
				loopTwoMembers();
				setState(643);
				match(End);
				setState(644);
				loopThreeMembers();
				setState(645);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				loopOneMembers();
				setState(648);
				match(End);
				setState(649);
				loopTwoMembers();
				setState(650);
				match(End);
				setState(651);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				match(OpenOp);
				setState(655);
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
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
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
			setState(665);
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
				setState(663);
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
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
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
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				operationElements();
				setState(674);
				match(Separator);
				setState(675);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				operationBlock();
				setState(678);
				match(Separator);
				setState(679);
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
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				sentence();
				setState(685);
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
		enterRule(_localctx, 84, RULE_loopBlockElementsLimited);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				ifConditions();
				setState(691);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				loop();
				setState(695);
				loopBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(697);
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
		enterRule(_localctx, 86, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(Ret);
			setState(701);
			retValues();
			setState(702);
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
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
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
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				functionsModes();
				setState(710);
				match(OpenBlock);
				setState(711);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				functionsModes();
				setState(714);
				match(OpenBlock);
				setState(715);
				functionCodeBlock();
				setState(716);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				functionMethodsModes();
				setState(719);
				match(OpenBlock);
				setState(720);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(722);
				functionMethodsModes();
				setState(723);
				match(OpenBlock);
				setState(724);
				functionCodeBlock();
				setState(725);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				constructClassMethod();
				setState(728);
				match(OpenBlock);
				setState(729);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(731);
				constructClassMethod();
				setState(732);
				match(OpenBlock);
				setState(733);
				functionCodeBlock();
				setState(734);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				interfaceMethod();
				setState(737);
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
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(Function);
				setState(742);
				match(Identifier);
				setState(743);
				match(OpenOp);
				setState(744);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(Function);
				setState(746);
				match(Identifier);
				setState(747);
				match(OpenOp);
				setState(748);
				match(CloseOp);
				setState(749);
				match(ArrowRight);
				setState(750);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				match(Function);
				setState(758);
				match(Identifier);
				setState(759);
				match(OpenOp);
				setState(760);
				functionParams();
				setState(761);
				match(CloseOp);
				setState(762);
				match(ArrowRight);
				setState(763);
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
			setState(767);
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
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				methodPerm();
				setState(770);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(Static);
				setState(773);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				methodPerm();
				setState(775);
				match(Static);
				setState(776);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				match(Final);
				setState(779);
				methodPerm();
				setState(780);
				match(Static);
				setState(781);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				match(Final);
				setState(784);
				methodPerm();
				setState(785);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(787);
				match(Final);
				setState(788);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(789);
				match(Final);
				setState(790);
				match(Static);
				setState(791);
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
			setState(794);
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
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(Identifier);
				setState(797);
				match(OpenOp);
				setState(798);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(Identifier);
				setState(800);
				match(OpenOp);
				setState(801);
				functionParams();
				setState(802);
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
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
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
				setState(807);
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
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				sentence();
				setState(812);
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
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				functionParamElements();
				setState(818);
				match(Separator);
				setState(819);
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
			setState(823);
			match(Identifier);
			setState(824);
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
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
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
			setState(831);
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
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				match(Interface);
				setState(834);
				match(Identifier);
				setState(835);
				match(OpenBlock);
				setState(836);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				match(Interface);
				setState(838);
				match(Identifier);
				setState(839);
				match(OpenBlock);
				setState(840);
				functionCodeBlock();
				setState(841);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(Interface);
				setState(850);
				match(Identifier);
				setState(851);
				match(Extends);
				setState(852);
				match(Identifier);
				setState(853);
				match(OpenBlock);
				setState(854);
				functionCodeBlock();
				setState(855);
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
			setState(859);
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
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				match(Abstract);
				setState(862);
				match(Identifier);
				setState(863);
				match(OpenBlock);
				setState(864);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(Abstract);
				setState(866);
				match(Identifier);
				setState(867);
				match(OpenBlock);
				setState(868);
				functionCodeBlock();
				setState(869);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				match(Abstract);
				setState(878);
				match(Identifier);
				setState(879);
				match(Extends);
				setState(880);
				match(Identifier);
				setState(881);
				match(OpenBlock);
				setState(882);
				functionCodeBlock();
				setState(883);
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
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				classModesGeneral();
				setState(888);
				match(OpenBlock);
				setState(889);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				classModesGeneral();
				setState(892);
				match(OpenBlock);
				setState(893);
				functionCodeBlock();
				setState(894);
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
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(Final);
				setState(900);
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
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(Class);
				setState(904);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(Class);
				setState(906);
				match(Identifier);
				setState(907);
				match(Extends);
				setState(908);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				match(Class);
				setState(910);
				match(Identifier);
				setState(911);
				match(Implements);
				setState(912);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(913);
				match(Class);
				setState(914);
				match(Identifier);
				setState(915);
				match(Extends);
				setState(916);
				match(Identifier);
				setState(917);
				match(Implements);
				setState(918);
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
		public ObjIdentifierAContext objIdentifierA() {
			return getRuleContext(ObjIdentifierAContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public ObjIdentifierBContext objIdentifierB() {
			return getRuleContext(ObjIdentifierBContext.class,0);
		}
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generalValue);
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(Identifier);
				setState(923);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(Integer);
				setState(926);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(928);
				match(Float);
				setState(929);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(930);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(931);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(932);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(933);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(934);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(935);
				objIdentifierA();
				setState(936);
				match(Point);
				setState(937);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(939);
				objIdentifierA();
				setState(940);
				match(TwoTwoPoint);
				setState(941);
				objIdentifierB();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
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
		enterRule(_localctx, 130, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u03b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u008d"+
		"\n\3\f\3\16\3\u0090\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009b"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a8\n\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fb"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0102\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u010a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0115\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u011f\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016e\n\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0183\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018d"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0199\n\32"+
		"\3\33\3\33\3\33\5\33\u019e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01a8\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01bd\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u01d2\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01e0\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01eb\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01f7\n!\3\"\3\"\3\"\3\"\5\"\u01fd"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\7#\u0206\n#\f#\16#\u0209\13#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$"+
		"\u026b\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u0280\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0294"+
		"\n&\3\'\3\'\5\'\u0298\n\'\3(\3(\5(\u029c\n(\3)\3)\5)\u02a0\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u02ac\n*\3+\3+\3+\3+\5+\u02b2\n+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u02bd\n,\3-\3-\3-\3-\3.\3.\3.\5.\u02c6\n.\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u02e6\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0300\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u031b\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0327\n\64\3\65\3\65\5\65\u032b\n\65\3\66\3\66\3\66\3\66\5\66\u0331"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0338\n\67\38\38\38\39\39\39\59\u0340"+
		"\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\5;\u035c\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0378\n=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\5>\u0383\n>\3?\3?\3?\5?\u0388\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\5@\u039a\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03b2\nA\3B\3B\3C\3C\3C\2\4\4DD\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\2\4\3\2#$\3\2\13\r\2\u0427\2\u0086"+
		"\3\2\2\2\4\u0089\3\2\2\2\6\u009a\3\2\2\2\b\u009c\3\2\2\2\n\u009e\3\2\2"+
		"\2\f\u00a7\3\2\2\2\16\u00a9\3\2\2\2\20\u00ab\3\2\2\2\22\u00d9\3\2\2\2"+
		"\24\u00e0\3\2\2\2\26\u00f2\3\2\2\2\30\u00fa\3\2\2\2\32\u0101\3\2\2\2\34"+
		"\u0109\3\2\2\2\36\u0114\3\2\2\2 \u0116\3\2\2\2\"\u011e\3\2\2\2$\u016d"+
		"\3\2\2\2&\u016f\3\2\2\2(\u0171\3\2\2\2*\u0173\3\2\2\2,\u0182\3\2\2\2."+
		"\u0184\3\2\2\2\60\u018c\3\2\2\2\62\u0198\3\2\2\2\64\u019d\3\2\2\2\66\u01a7"+
		"\3\2\2\28\u01bc\3\2\2\2:\u01d1\3\2\2\2<\u01df\3\2\2\2>\u01ea\3\2\2\2@"+
		"\u01f6\3\2\2\2B\u01fc\3\2\2\2D\u01fe\3\2\2\2F\u026a\3\2\2\2H\u027f\3\2"+
		"\2\2J\u0293\3\2\2\2L\u0297\3\2\2\2N\u029b\3\2\2\2P\u029f\3\2\2\2R\u02ab"+
		"\3\2\2\2T\u02b1\3\2\2\2V\u02bc\3\2\2\2X\u02be\3\2\2\2Z\u02c5\3\2\2\2\\"+
		"\u02e5\3\2\2\2^\u02ff\3\2\2\2`\u0301\3\2\2\2b\u031a\3\2\2\2d\u031c\3\2"+
		"\2\2f\u0326\3\2\2\2h\u032a\3\2\2\2j\u0330\3\2\2\2l\u0337\3\2\2\2n\u0339"+
		"\3\2\2\2p\u033f\3\2\2\2r\u0341\3\2\2\2t\u035b\3\2\2\2v\u035d\3\2\2\2x"+
		"\u0377\3\2\2\2z\u0382\3\2\2\2|\u0387\3\2\2\2~\u0399\3\2\2\2\u0080\u03b1"+
		"\3\2\2\2\u0082\u03b3\3\2\2\2\u0084\u03b5\3\2\2\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008e\b\3\1\2\u008a\u008b\f\4\2\2"+
		"\u008b\u008d\5\6\4\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\5\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u009b\5\b\5\2\u0092\u009b\5\n\6\2\u0093\u009b\5\20\t\2\u0094\u009b\5"+
		"*\26\2\u0095\u009b\5\64\33\2\u0096\u009b\5H%\2\u0097\u009b\5\\/\2\u0098"+
		"\u009b\5X-\2\u0099\u009b\5p9\2\u009a\u0091\3\2\2\2\u009a\u0092\3\2\2\2"+
		"\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\7\3\2\2\2\u009c\u009d\7.\2\2\u009d\t\3\2\2\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a0\5\f\7\2\u00a0\u00a1\7\27\2\2\u00a1\13\3\2\2\2\u00a2\u00a8\5\16"+
		"\b\2\u00a3\u00a4\5\16\b\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\5\f\7\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\r\3\2\2\2"+
		"\u00a9\u00aa\7*\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\5\22\n\2\u00ac\21\3\2"+
		"\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7\27\2\2\u00b0"+
		"\u00da\3\2\2\2\u00b1\u00b2\5d\63\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\24"+
		"\13\2\u00b4\u00b5\7\27\2\2\u00b5\u00da\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7"+
		"\u00b8\7\4\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\27\2\2\u00ba\u00da"+
		"\3\2\2\2\u00bb\u00bc\5d\63\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\7\4\2\2"+
		"\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\27\2\2\u00c0\u00da\3\2\2\2\u00c1"+
		"\u00c2\7\17\2\2\u00c2\u00c3\5d\63\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\7"+
		"\4\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7\27\2\2\u00c7\u00da\3\2\2\2"+
		"\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5d\63\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc"+
		"\5\24\13\2\u00cc\u00cd\7\27\2\2\u00cd\u00da\3\2\2\2\u00ce\u00cf\7\17\2"+
		"\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\27\2\2\u00d2"+
		"\u00da\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7"+
		"\4\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\7\27\2\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u00ad\3\2\2\2\u00d9\u00b1\3\2\2\2\u00d9\u00b6\3\2\2\2\u00d9\u00bb"+
		"\3\2\2\2\u00d9\u00c1\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00da\23\3\2\2\2\u00db\u00e1\5\26\f\2\u00dc\u00dd\5\26"+
		"\f\2\u00dd\u00de\7\34\2\2\u00de\u00df\5\24\13\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e3\7\'\2"+
		"\2\u00e3\u00e4\7\30\2\2\u00e4\u00f3\5\u0080A\2\u00e5\u00e6\7\'\2\2\u00e6"+
		"\u00e7\7)\2\2\u00e7\u00e8\7\30\2\2\u00e8\u00f3\5\u0080A\2\u00e9\u00ea"+
		"\7\'\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00f3\5\u0080"+
		"A\2\u00ed\u00ee\7\'\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\7\30\2\2\u00f0"+
		"\u00f1\7\25\2\2\u00f1\u00f3\5\u0080A\2\u00f2\u00e2\3\2\2\2\u00f2\u00e5"+
		"\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f3\27\3\2\2\2\u00f4"+
		"\u00f5\7\35\2\2\u00f5\u00fb\7\36\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8"+
		"\5\32\16\2\u00f8\u00f9\7\36\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2\2"+
		"\2\u00fa\u00f6\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u0102\5\u0080A\2\u00fd\u00fe"+
		"\5\u0080A\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\5\32\16\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\33\3\2\2\2\u0103\u0104"+
		"\7\37\2\2\u0104\u010a\7 \2\2\u0105\u0106\7\37\2\2\u0106\u0107\5\36\20"+
		"\2\u0107\u0108\7 \2\2\u0108\u010a\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0105"+
		"\3\2\2\2\u010a\35\3\2\2\2\u010b\u010c\7\'\2\2\u010c\u010d\7\32\2\2\u010d"+
		"\u0115\5\u0080A\2\u010e\u010f\7\'\2\2\u010f\u0110\7\32\2\2\u0110\u0111"+
		"\5\u0080A\2\u0111\u0112\7\34\2\2\u0112\u0113\5\36\20\2\u0113\u0115\3\2"+
		"\2\2\u0114\u010b\3\2\2\2\u0114\u010e\3\2\2\2\u0115\37\3\2\2\2\u0116\u0117"+
		"\7!\2\2\u0117\u0118\5\"\22\2\u0118\u0119\7\"\2\2\u0119!\3\2\2\2\u011a"+
		"\u011f\5$\23\2\u011b\u011c\5$\23\2\u011c\u011d\5\"\22\2\u011d\u011f\3"+
		"\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011f#\3\2\2\2\u0120\u016e"+
		"\7\'\2\2\u0121\u0122\7\'\2\2\u0122\u016e\7#\2\2\u0123\u0124\7\'\2\2\u0124"+
		"\u016e\7)\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7)\2\2\u0127\u016e\7#\2"+
		"\2\u0128\u0129\5&\24\2\u0129\u012a\7\'\2\2\u012a\u016e\3\2\2\2\u012b\u012c"+
		"\5&\24\2\u012c\u012d\7\'\2\2\u012d\u012e\7#\2\2\u012e\u016e\3\2\2\2\u012f"+
		"\u0130\5&\24\2\u0130\u0131\7\'\2\2\u0131\u0132\7)\2\2\u0132\u016e\3\2"+
		"\2\2\u0133\u0134\5&\24\2\u0134\u0135\7\'\2\2\u0135\u0136\7)\2\2\u0136"+
		"\u0137\7#\2\2\u0137\u016e\3\2\2\2\u0138\u0139\7\'\2\2\u0139\u016e\5(\25"+
		"\2\u013a\u013b\7\'\2\2\u013b\u013c\5(\25\2\u013c\u013d\7#\2\2\u013d\u016e"+
		"\3\2\2\2\u013e\u013f\7\'\2\2\u013f\u0140\5(\25\2\u0140\u0141\7)\2\2\u0141"+
		"\u016e\3\2\2\2\u0142\u0143\7\'\2\2\u0143\u0144\5(\25\2\u0144\u0145\7)"+
		"\2\2\u0145\u0146\7#\2\2\u0146\u016e\3\2\2\2\u0147\u016e\7+\2\2\u0148\u0149"+
		"\7+\2\2\u0149\u016e\7#\2\2\u014a\u014b\7+\2\2\u014b\u016e\7)\2\2\u014c"+
		"\u014d\7+\2\2\u014d\u014e\7)\2\2\u014e\u016e\7#\2\2\u014f\u016e\7,\2\2"+
		"\u0150\u0151\7,\2\2\u0151\u016e\7#\2\2\u0152\u0153\7,\2\2\u0153\u016e"+
		"\7)\2\2\u0154\u0155\7,\2\2\u0155\u0156\7)\2\2\u0156\u016e\7#\2\2\u0157"+
		"\u016e\5,\27\2\u0158\u0159\5,\27\2\u0159\u015a\7#\2\2\u015a\u016e\3\2"+
		"\2\2\u015b\u015c\5,\27\2\u015c\u015d\7)\2\2\u015d\u016e\3\2\2\2\u015e"+
		"\u015f\5,\27\2\u015f\u0160\7)\2\2\u0160\u0161\7#\2\2\u0161\u016e\3\2\2"+
		"\2\u0162\u016e\5 \21\2\u0163\u0164\5 \21\2\u0164\u0165\7#\2\2\u0165\u016e"+
		"\3\2\2\2\u0166\u0167\5 \21\2\u0167\u0168\7)\2\2\u0168\u016e\3\2\2\2\u0169"+
		"\u016a\5 \21\2\u016a\u016b\7)\2\2\u016b\u016c\7#\2\2\u016c\u016e\3\2\2"+
		"\2\u016d\u0120\3\2\2\2\u016d\u0121\3\2\2\2\u016d\u0123\3\2\2\2\u016d\u0125"+
		"\3\2\2\2\u016d\u0128\3\2\2\2\u016d\u012b\3\2\2\2\u016d\u012f\3\2\2\2\u016d"+
		"\u0133\3\2\2\2\u016d\u0138\3\2\2\2\u016d\u013a\3\2\2\2\u016d\u013e\3\2"+
		"\2\2\u016d\u0142\3\2\2\2\u016d\u0147\3\2\2\2\u016d\u0148\3\2\2\2\u016d"+
		"\u014a\3\2\2\2\u016d\u014c\3\2\2\2\u016d\u014f\3\2\2\2\u016d\u0150\3\2"+
		"\2\2\u016d\u0152\3\2\2\2\u016d\u0154\3\2\2\2\u016d\u0157\3\2\2\2\u016d"+
		"\u0158\3\2\2\2\u016d\u015b\3\2\2\2\u016d\u015e\3\2\2\2\u016d\u0162\3\2"+
		"\2\2\u016d\u0163\3\2\2\2\u016d\u0166\3\2\2\2\u016d\u0169\3\2\2\2\u016e"+
		"%\3\2\2\2\u016f\u0170\7&\2\2\u0170\'\3\2\2\2\u0171\u0172\7&\2\2\u0172"+
		")\3\2\2\2\u0173\u0174\5,\27\2\u0174\u0175\7\27\2\2\u0175+\3\2\2\2\u0176"+
		"\u0177\7\'\2\2\u0177\u0183\5\60\31\2\u0178\u0179\7\'\2\2\u0179\u017a\7"+
		"\31\2\2\u017a\u017b\5.\30\2\u017b\u017c\5\60\31\2\u017c\u0183\3\2\2\2"+
		"\u017d\u017e\7\'\2\2\u017e\u017f\7\33\2\2\u017f\u0180\5.\30\2\u0180\u0181"+
		"\5\60\31\2\u0181\u0183\3\2\2\2\u0182\u0176\3\2\2\2\u0182\u0178\3\2\2\2"+
		"\u0182\u017d\3\2\2\2\u0183-\3\2\2\2\u0184\u0185\7\'\2\2\u0185/\3\2\2\2"+
		"\u0186\u0187\7!\2\2\u0187\u018d\7\"\2\2\u0188\u0189\7!\2\2\u0189\u018a"+
		"\5\62\32\2\u018a\u018b\7\"\2\2\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2"+
		"\u018c\u0188\3\2\2\2\u018d\61\3\2\2\2\u018e\u0199\5\u0080A\2\u018f\u0190"+
		"\5\u0080A\2\u0190\u0191\7\34\2\2\u0191\u0192\5\62\32\2\u0192\u0199\3\2"+
		"\2\2\u0193\u0199\5\"\22\2\u0194\u0195\5\"\22\2\u0195\u0196\7\34\2\2\u0196"+
		"\u0197\5\62\32\2\u0197\u0199\3\2\2\2\u0198\u018e\3\2\2\2\u0198\u018f\3"+
		"\2\2\2\u0198\u0193\3\2\2\2\u0198\u0194\3\2\2\2\u0199\63\3\2\2\2\u019a"+
		"\u019e\58\35\2\u019b\u019e\5:\36\2\u019c\u019e\5<\37\2\u019d\u019a\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a8"+
		"\5\64\33\2\u01a0\u01a1\5\64\33\2\u01a1\u01a2\5\66\34\2\u01a2\u01a8\3\2"+
		"\2\2\u01a3\u01a8\5\6\4\2\u01a4\u01a5\5\6\4\2\u01a5\u01a6\5\66\34\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a3\3\2"+
		"\2\2\u01a7\u01a4\3\2\2\2\u01a8\67\3\2\2\2\u01a9\u01aa\7\5\2\2\u01aa\u01ab"+
		"\5@!\2\u01ab\u01ac\5*\26\2\u01ac\u01bd\3\2\2\2\u01ad\u01ae\7\5\2\2\u01ae"+
		"\u01af\5@!\2\u01af\u01b0\7\37\2\2\u01b0\u01b1\7 \2\2\u01b1\u01bd\3\2\2"+
		"\2\u01b2\u01b3\7\5\2\2\u01b3\u01b4\5@!\2\u01b4\u01b5\7\37\2\2\u01b5\u01b6"+
		"\5\66\34\2\u01b6\u01b7\7 \2\2\u01b7\u01bd\3\2\2\2\u01b8\u01b9\7\5\2\2"+
		"\u01b9\u01ba\5@!\2\u01ba\u01bb\5> \2\u01bb\u01bd\3\2\2\2\u01bc\u01a9\3"+
		"\2\2\2\u01bc\u01ad\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bd"+
		"9\3\2\2\2\u01be\u01bf\7\6\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\5*\26\2\u01c1"+
		"\u01d2\3\2\2\2\u01c2\u01c3\7\6\2\2\u01c3\u01c4\5@!\2\u01c4\u01c5\7\37"+
		"\2\2\u01c5\u01c6\7 \2\2\u01c6\u01d2\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8"+
		"\u01c9\5@!\2\u01c9\u01ca\7\37\2\2\u01ca\u01cb\5\66\34\2\u01cb\u01cc\7"+
		" \2\2\u01cc\u01d2\3\2\2\2\u01cd\u01ce\7\6\2\2\u01ce\u01cf\5@!\2\u01cf"+
		"\u01d0\5> \2\u01d0\u01d2\3\2\2\2\u01d1\u01be\3\2\2\2\u01d1\u01c2\3\2\2"+
		"\2\u01d1\u01c7\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2;\3\2\2\2\u01d3\u01d4"+
		"\7\7\2\2\u01d4\u01e0\5*\26\2\u01d5\u01d6\7\7\2\2\u01d6\u01d7\7\37\2\2"+
		"\u01d7\u01e0\7 \2\2\u01d8\u01d9\7\7\2\2\u01d9\u01da\7\37\2\2\u01da\u01db"+
		"\5\66\34\2\u01db\u01dc\7 \2\2\u01dc\u01e0\3\2\2\2\u01dd\u01de\7\7\2\2"+
		"\u01de\u01e0\5> \2\u01df\u01d3\3\2\2\2\u01df\u01d5\3\2\2\2\u01df\u01d8"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0=\3\2\2\2\u01e1\u01eb\58\35\2\u01e2"+
		"\u01e3\58\35\2\u01e3\u01e4\5\66\34\2\u01e4\u01eb\3\2\2\2\u01e5\u01eb\5"+
		"H%\2\u01e6\u01e7\5H%\2\u01e7\u01e8\5> \2\u01e8\u01eb\3\2\2\2\u01e9\u01eb"+
		"\5X-\2\u01ea\u01e1\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e5\3\2\2\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb?\3\2\2\2\u01ec\u01f7\5B\"\2\u01ed"+
		"\u01ee\5B\"\2\u01ee\u01ef\5@!\2\u01ef\u01f7\3\2\2\2\u01f0\u01f7\5D#\2"+
		"\u01f1\u01f2\5D#\2\u01f2\u01f3\5@!\2\u01f3\u01f7\3\2\2\2\u01f4\u01f5\7"+
		"%\2\2\u01f5\u01f7\5@!\2\u01f6\u01ec\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f6"+
		"\u01f0\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7A\3\2\2\2"+
		"\u01f8\u01fd\5F$\2\u01f9\u01fa\5F$\2\u01fa\u01fb\5B\"\2\u01fb\u01fd\3"+
		"\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fdC\3\2\2\2\u01fe\u01ff"+
		"\b#\1\2\u01ff\u0200\7!\2\2\u0200\u0201\5@!\2\u0201\u0202\7\"\2\2\u0202"+
		"\u0207\3\2\2\2\u0203\u0204\f\3\2\2\u0204\u0206\7$\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"E\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u026b\7\'\2\2\u020b\u020c\7\'\2\2"+
		"\u020c\u026b\t\2\2\2\u020d\u020e\7\'\2\2\u020e\u026b\7)\2\2\u020f\u0210"+
		"\7\'\2\2\u0210\u0211\7)\2\2\u0211\u026b\t\2\2\2\u0212\u0213\5&\24\2\u0213"+
		"\u0214\7\'\2\2\u0214\u026b\3\2\2\2\u0215\u0216\5&\24\2\u0216\u0217\7\'"+
		"\2\2\u0217\u0218\t\2\2\2\u0218\u026b\3\2\2\2\u0219\u021a\5&\24\2\u021a"+
		"\u021b\7\'\2\2\u021b\u021c\7)\2\2\u021c\u026b\3\2\2\2\u021d\u021e\5&\24"+
		"\2\u021e\u021f\7\'\2\2\u021f\u0220\7)\2\2\u0220\u0221\t\2\2\2\u0221\u026b"+
		"\3\2\2\2\u0222\u0223\7\'\2\2\u0223\u026b\5(\25\2\u0224\u0225\7\'\2\2\u0225"+
		"\u0226\5(\25\2\u0226\u0227\t\2\2\2\u0227\u026b\3\2\2\2\u0228\u0229\7\'"+
		"\2\2\u0229\u022a\5(\25\2\u022a\u022b\7)\2\2\u022b\u026b\3\2\2\2\u022c"+
		"\u022d\7\'\2\2\u022d\u022e\5(\25\2\u022e\u022f\7)\2\2\u022f\u0230\t\2"+
		"\2\2\u0230\u026b\3\2\2\2\u0231\u026b\7+\2\2\u0232\u0233\7+\2\2\u0233\u026b"+
		"\t\2\2\2\u0234\u0235\7+\2\2\u0235\u026b\7)\2\2\u0236\u0237\7+\2\2\u0237"+
		"\u0238\7)\2\2\u0238\u026b\t\2\2\2\u0239\u026b\7,\2\2\u023a\u023b\7,\2"+
		"\2\u023b\u026b\t\2\2\2\u023c\u023d\7,\2\2\u023d\u026b\7)\2\2\u023e\u023f"+
		"\7,\2\2\u023f\u0240\7)\2\2\u0240\u026b\t\2\2\2\u0241\u026b\5,\27\2\u0242"+
		"\u0243\5,\27\2\u0243\u0244\t\2\2\2\u0244\u026b\3\2\2\2\u0245\u0246\5,"+
		"\27\2\u0246\u0247\7)\2\2\u0247\u026b\3\2\2\2\u0248\u0249\5,\27\2\u0249"+
		"\u024a\7)\2\2\u024a\u024b\t\2\2\2\u024b\u026b\3\2\2\2\u024c\u024d\7\'"+
		"\2\2\u024d\u024e\7\30\2\2\u024e\u026b\5,\27\2\u024f\u0250\7\'\2\2\u0250"+
		"\u0251\7\30\2\2\u0251\u0252\5,\27\2\u0252\u0253\t\2\2\2\u0253\u026b\3"+
		"\2\2\2\u0254\u0255\7\'\2\2\u0255\u0256\7\30\2\2\u0256\u0257\5,\27\2\u0257"+
		"\u0258\7)\2\2\u0258\u026b\3\2\2\2\u0259\u025a\7\'\2\2\u025a\u025b\7\30"+
		"\2\2\u025b\u025c\5,\27\2\u025c\u025d\7)\2\2\u025d\u025e\t\2\2\2\u025e"+
		"\u026b\3\2\2\2\u025f\u026b\5 \21\2\u0260\u0261\5 \21\2\u0261\u0262\t\2"+
		"\2\2\u0262\u026b\3\2\2\2\u0263\u0264\5 \21\2\u0264\u0265\7)\2\2\u0265"+
		"\u026b\3\2\2\2\u0266\u0267\5 \21\2\u0267\u0268\7)\2\2\u0268\u0269\t\2"+
		"\2\2\u0269\u026b\3\2\2\2\u026a\u020a\3\2\2\2\u026a\u020b\3\2\2\2\u026a"+
		"\u020d\3\2\2\2\u026a\u020f\3\2\2\2\u026a\u0212\3\2\2\2\u026a\u0215\3\2"+
		"\2\2\u026a\u0219\3\2\2\2\u026a\u021d\3\2\2\2\u026a\u0222\3\2\2\2\u026a"+
		"\u0224\3\2\2\2\u026a\u0228\3\2\2\2\u026a\u022c\3\2\2\2\u026a\u0231\3\2"+
		"\2\2\u026a\u0232\3\2\2\2\u026a\u0234\3\2\2\2\u026a\u0236\3\2\2\2\u026a"+
		"\u0239\3\2\2\2\u026a\u023a\3\2\2\2\u026a\u023c\3\2\2\2\u026a\u023e\3\2"+
		"\2\2\u026a\u0241\3\2\2\2\u026a\u0242\3\2\2\2\u026a\u0245\3\2\2\2\u026a"+
		"\u0248\3\2\2\2\u026a\u024c\3\2\2\2\u026a\u024f\3\2\2\2\u026a\u0254\3\2"+
		"\2\2\u026a\u0259\3\2\2\2\u026a\u025f\3\2\2\2\u026a\u0260\3\2\2\2\u026a"+
		"\u0263\3\2\2\2\u026a\u0266\3\2\2\2\u026bG\3\2\2\2\u026c\u026d\7\b\2\2"+
		"\u026d\u026e\5J&\2\u026e\u026f\7\37\2\2\u026f\u0270\7 \2\2\u0270\u0280"+
		"\3\2\2\2\u0271\u0272\7\b\2\2\u0272\u0273\5J&\2\u0273\u0274\7\37\2\2\u0274"+
		"\u0275\5T+\2\u0275\u0276\7 \2\2\u0276\u0280\3\2\2\2\u0277\u0278\7\b\2"+
		"\2\u0278\u0279\5J&\2\u0279\u027a\5*\26\2\u027a\u0280\3\2\2\2\u027b\u027c"+
		"\7\b\2\2\u027c\u027d\5J&\2\u027d\u027e\5V,\2\u027e\u0280\3\2\2\2\u027f"+
		"\u026c\3\2\2\2\u027f\u0271\3\2\2\2\u027f\u0277\3\2\2\2\u027f\u027b\3\2"+
		"\2\2\u0280I\3\2\2\2\u0281\u0282\7!\2\2\u0282\u0283\5L\'\2\u0283\u0284"+
		"\7\27\2\2\u0284\u0285\5N(\2\u0285\u0286\7\27\2\2\u0286\u0287\5P)\2\u0287"+
		"\u0288\7\"\2\2\u0288\u0294\3\2\2\2\u0289\u028a\5L\'\2\u028a\u028b\7\27"+
		"\2\2\u028b\u028c\5N(\2\u028c\u028d\7\27\2\2\u028d\u028e\5P)\2\u028e\u0294"+
		"\3\2\2\2\u028f\u0294\5@!\2\u0290\u0291\7!\2\2\u0291\u0294\7\"\2\2\u0292"+
		"\u0294\3\2\2\2\u0293\u0281\3\2\2\2\u0293\u0289\3\2\2\2\u0293\u028f\3\2"+
		"\2\2\u0293\u0290\3\2\2\2\u0293\u0292\3\2\2\2\u0294K\3\2\2\2\u0295\u0298"+
		"\5\24\13\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2"+
		"\u0298M\3\2\2\2\u0299\u029c\5@!\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029b\u029a\3\2\2\2\u029cO\3\2\2\2\u029d\u02a0\5R*\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0Q\3\2\2\2\u02a1"+
		"\u02ac\5\"\22\2\u02a2\u02ac\5 \21\2\u02a3\u02a4\5\"\22\2\u02a4\u02a5\7"+
		"\34\2\2\u02a5\u02a6\5R*\2\u02a6\u02ac\3\2\2\2\u02a7\u02a8\5 \21\2\u02a8"+
		"\u02a9\7\34\2\2\u02a9\u02aa\5R*\2\u02aa\u02ac\3\2\2\2\u02ab\u02a1\3\2"+
		"\2\2\u02ab\u02a2\3\2\2\2\u02ab\u02a3\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ac"+
		"S\3\2\2\2\u02ad\u02b2\5\6\4\2\u02ae\u02af\5\6\4\2\u02af\u02b0\5T+\2\u02b0"+
		"\u02b2\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2U\3\2\2\2"+
		"\u02b3\u02bd\58\35\2\u02b4\u02b5\58\35\2\u02b5\u02b6\5V,\2\u02b6\u02bd"+
		"\3\2\2\2\u02b7\u02bd\5H%\2\u02b8\u02b9\5H%\2\u02b9\u02ba\5V,\2\u02ba\u02bd"+
		"\3\2\2\2\u02bb\u02bd\5X-\2\u02bc\u02b3\3\2\2\2\u02bc\u02b4\3\2\2\2\u02bc"+
		"\u02b7\3\2\2\2\u02bc\u02b8\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bdW\3\2\2\2"+
		"\u02be\u02bf\7\t\2\2\u02bf\u02c0\5Z.\2\u02c0\u02c1\7\27\2\2\u02c1Y\3\2"+
		"\2\2\u02c2\u02c6\5\u0080A\2\u02c3\u02c6\5\"\22\2\u02c4\u02c6\5 \21\2\u02c5"+
		"\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6[\3\2\2\2"+
		"\u02c7\u02c8\5`\61\2\u02c8\u02c9\7\37\2\2\u02c9\u02ca\7 \2\2\u02ca\u02e6"+
		"\3\2\2\2\u02cb\u02cc\5`\61\2\u02cc\u02cd\7\37\2\2\u02cd\u02ce\5j\66\2"+
		"\u02ce\u02cf\7 \2\2\u02cf\u02e6\3\2\2\2\u02d0\u02d1\5b\62\2\u02d1\u02d2"+
		"\7\37\2\2\u02d2\u02d3\7 \2\2\u02d3\u02e6\3\2\2\2\u02d4\u02d5\5b\62\2\u02d5"+
		"\u02d6\7\37\2\2\u02d6\u02d7\5j\66\2\u02d7\u02d8\7 \2\2\u02d8\u02e6\3\2"+
		"\2\2\u02d9\u02da\5f\64\2\u02da\u02db\7\37\2\2\u02db\u02dc\7 \2\2\u02dc"+
		"\u02e6\3\2\2\2\u02dd\u02de\5f\64\2\u02de\u02df\7\37\2\2\u02df\u02e0\5"+
		"j\66\2\u02e0\u02e1\7 \2\2\u02e1\u02e6\3\2\2\2\u02e2\u02e3\5h\65\2\u02e3"+
		"\u02e4\7\27\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02c7\3\2\2\2\u02e5\u02cb\3"+
		"\2\2\2\u02e5\u02d0\3\2\2\2\u02e5\u02d4\3\2\2\2\u02e5\u02d9\3\2\2\2\u02e5"+
		"\u02dd\3\2\2\2\u02e5\u02e2\3\2\2\2\u02e6]\3\2\2\2\u02e7\u02e8\7\n\2\2"+
		"\u02e8\u02e9\7\'\2\2\u02e9\u02ea\7!\2\2\u02ea\u0300\7\"\2\2\u02eb\u02ec"+
		"\7\n\2\2\u02ec\u02ed\7\'\2\2\u02ed\u02ee\7!\2\2\u02ee\u02ef\7\"\2\2\u02ef"+
		"\u02f0\7\26\2\2\u02f0\u0300\7\'\2\2\u02f1\u02f2\7\n\2\2\u02f2\u02f3\7"+
		"\'\2\2\u02f3\u02f4\7!\2\2\u02f4\u02f5\5l\67\2\u02f5\u02f6\7\"\2\2\u02f6"+
		"\u0300\3\2\2\2\u02f7\u02f8\7\n\2\2\u02f8\u02f9\7\'\2\2\u02f9\u02fa\7!"+
		"\2\2\u02fa\u02fb\5l\67\2\u02fb\u02fc\7\"\2\2\u02fc\u02fd\7\26\2\2\u02fd"+
		"\u02fe\7\'\2\2\u02fe\u0300\3\2\2\2\u02ff\u02e7\3\2\2\2\u02ff\u02eb\3\2"+
		"\2\2\u02ff\u02f1\3\2\2\2\u02ff\u02f7\3\2\2\2\u0300_\3\2\2\2\u0301\u0302"+
		"\5^\60\2\u0302a\3\2\2\2\u0303\u0304\5d\63\2\u0304\u0305\5^\60\2\u0305"+
		"\u031b\3\2\2\2\u0306\u0307\7\16\2\2\u0307\u031b\5^\60\2\u0308\u0309\5"+
		"d\63\2\u0309\u030a\7\16\2\2\u030a\u030b\5^\60\2\u030b\u031b\3\2\2\2\u030c"+
		"\u030d\7\17\2\2\u030d\u030e\5d\63\2\u030e\u030f\7\16\2\2\u030f\u0310\5"+
		"^\60\2\u0310\u031b\3\2\2\2\u0311\u0312\7\17\2\2\u0312\u0313\5d\63\2\u0313"+
		"\u0314\5^\60\2\u0314\u031b\3\2\2\2\u0315\u0316\7\17\2\2\u0316\u031b\5"+
		"^\60\2\u0317\u0318\7\17\2\2\u0318\u0319\7\16\2\2\u0319\u031b\5^\60\2\u031a"+
		"\u0303\3\2\2\2\u031a\u0306\3\2\2\2\u031a\u0308\3\2\2\2\u031a\u030c\3\2"+
		"\2\2\u031a\u0311\3\2\2\2\u031a\u0315\3\2\2\2\u031a\u0317\3\2\2\2\u031b"+
		"c\3\2\2\2\u031c\u031d\t\3\2\2\u031de\3\2\2\2\u031e\u031f\7\'\2\2\u031f"+
		"\u0320\7!\2\2\u0320\u0327\7\"\2\2\u0321\u0322\7\'\2\2\u0322\u0323\7!\2"+
		"\2\u0323\u0324\5l\67\2\u0324\u0325\7\"\2\2\u0325\u0327\3\2\2\2\u0326\u031e"+
		"\3\2\2\2\u0326\u0321\3\2\2\2\u0327g\3\2\2\2\u0328\u032b\5`\61\2\u0329"+
		"\u032b\5b\62\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032bi\3\2\2\2"+
		"\u032c\u0331\5\6\4\2\u032d\u032e\5\6\4\2\u032e\u032f\5j\66\2\u032f\u0331"+
		"\3\2\2\2\u0330\u032c\3\2\2\2\u0330\u032d\3\2\2\2\u0331k\3\2\2\2\u0332"+
		"\u0338\5n8\2\u0333\u0334\5n8\2\u0334\u0335\7\34\2\2\u0335\u0336\5l\67"+
		"\2\u0336\u0338\3\2\2\2\u0337\u0332\3\2\2\2\u0337\u0333\3\2\2\2\u0338m"+
		"\3\2\2\2\u0339\u033a\7\'\2\2\u033a\u033b\7)\2\2\u033bo\3\2\2\2\u033c\u0340"+
		"\5r:\2\u033d\u0340\5v<\2\u033e\u0340\5z>\2\u033f\u033c\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u033f\u033e\3\2\2\2\u0340q\3\2\2\2\u0341\u0342\5t;\2\u0342s\3"+
		"\2\2\2\u0343\u0344\7\20\2\2\u0344\u0345\7\'\2\2\u0345\u0346\7\37\2\2\u0346"+
		"\u035c\7 \2\2\u0347\u0348\7\20\2\2\u0348\u0349\7\'\2\2\u0349\u034a\7\37"+
		"\2\2\u034a\u034b\5j\66\2\u034b\u034c\7 \2\2\u034c\u035c\3\2\2\2\u034d"+
		"\u034e\7\20\2\2\u034e\u034f\7\'\2\2\u034f\u0350\7\22\2\2\u0350\u0351\7"+
		"\'\2\2\u0351\u0352\7\37\2\2\u0352\u035c\7 \2\2\u0353\u0354\7\20\2\2\u0354"+
		"\u0355\7\'\2\2\u0355\u0356\7\22\2\2\u0356\u0357\7\'\2\2\u0357\u0358\7"+
		"\37\2\2\u0358\u0359\5j\66\2\u0359\u035a\7 \2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0343\3\2\2\2\u035b\u0347\3\2\2\2\u035b\u034d\3\2\2\2\u035b\u0353\3\2"+
		"\2\2\u035cu\3\2\2\2\u035d\u035e\5x=\2\u035ew\3\2\2\2\u035f\u0360\7\21"+
		"\2\2\u0360\u0361\7\'\2\2\u0361\u0362\7\37\2\2\u0362\u0378\7 \2\2\u0363"+
		"\u0364\7\21\2\2\u0364\u0365\7\'\2\2\u0365\u0366\7\37\2\2\u0366\u0367\5"+
		"j\66\2\u0367\u0368\7 \2\2\u0368\u0378\3\2\2\2\u0369\u036a\7\21\2\2\u036a"+
		"\u036b\7\'\2\2\u036b\u036c\7\22\2\2\u036c\u036d\7\'\2\2\u036d\u036e\7"+
		"\37\2\2\u036e\u0378\7 \2\2\u036f\u0370\7\21\2\2\u0370\u0371\7\'\2\2\u0371"+
		"\u0372\7\22\2\2\u0372\u0373\7\'\2\2\u0373\u0374\7\37\2\2\u0374\u0375\5"+
		"j\66\2\u0375\u0376\7 \2\2\u0376\u0378\3\2\2\2\u0377\u035f\3\2\2\2\u0377"+
		"\u0363\3\2\2\2\u0377\u0369\3\2\2\2\u0377\u036f\3\2\2\2\u0378y\3\2\2\2"+
		"\u0379\u037a\5|?\2\u037a\u037b\7\37\2\2\u037b\u037c\7 \2\2\u037c\u0383"+
		"\3\2\2\2\u037d\u037e\5|?\2\u037e\u037f\7\37\2\2\u037f\u0380\5j\66\2\u0380"+
		"\u0381\7 \2\2\u0381\u0383\3\2\2\2\u0382\u0379\3\2\2\2\u0382\u037d\3\2"+
		"\2\2\u0383{\3\2\2\2\u0384\u0388\5~@\2\u0385\u0386\7\17\2\2\u0386\u0388"+
		"\5~@\2\u0387\u0384\3\2\2\2\u0387\u0385\3\2\2\2\u0388}\3\2\2\2\u0389\u038a"+
		"\7\23\2\2\u038a\u039a\7\'\2\2\u038b\u038c\7\23\2\2\u038c\u038d\7\'\2\2"+
		"\u038d\u038e\7\22\2\2\u038e\u039a\7\'\2\2\u038f\u0390\7\23\2\2\u0390\u0391"+
		"\7\'\2\2\u0391\u0392\7\24\2\2\u0392\u039a\7\'\2\2\u0393\u0394\7\23\2\2"+
		"\u0394\u0395\7\'\2\2\u0395\u0396\7\22\2\2\u0396\u0397\7\'\2\2\u0397\u0398"+
		"\7\24\2\2\u0398\u039a\7\'\2\2\u0399\u0389\3\2\2\2\u0399\u038b\3\2\2\2"+
		"\u0399\u038f\3\2\2\2\u0399\u0393\3\2\2\2\u039a\177\3\2\2\2\u039b\u03b2"+
		"\7\'\2\2\u039c\u039d\7\'\2\2\u039d\u03b2\7)\2\2\u039e\u03b2\7+\2\2\u039f"+
		"\u03a0\7+\2\2\u03a0\u03b2\7)\2\2\u03a1\u03b2\7,\2\2\u03a2\u03a3\7,\2\2"+
		"\u03a3\u03b2\7)\2\2\u03a4\u03b2\7*\2\2\u03a5\u03b2\5\30\r\2\u03a6\u03b2"+
		"\5\34\17\2\u03a7\u03b2\5 \21\2\u03a8\u03b2\5,\27\2\u03a9\u03aa\5\u0082"+
		"B\2\u03aa\u03ab\7\31\2\2\u03ab\u03ac\5\u0084C\2\u03ac\u03b2\3\2\2\2\u03ad"+
		"\u03ae\5\u0082B\2\u03ae\u03af\7\33\2\2\u03af\u03b0\5\u0084C\2\u03b0\u03b2"+
		"\3\2\2\2\u03b1\u039b\3\2\2\2\u03b1\u039c\3\2\2\2\u03b1\u039e\3\2\2\2\u03b1"+
		"\u039f\3\2\2\2\u03b1\u03a1\3\2\2\2\u03b1\u03a2\3\2\2\2\u03b1\u03a4\3\2"+
		"\2\2\u03b1\u03a5\3\2\2\2\u03b1\u03a6\3\2\2\2\u03b1\u03a7\3\2\2\2\u03b1"+
		"\u03a8\3\2\2\2\u03b1\u03a9\3\2\2\2\u03b1\u03ad\3\2\2\2\u03b2\u0081\3\2"+
		"\2\2\u03b3\u03b4\7\'\2\2\u03b4\u0083\3\2\2\2\u03b5\u03b6\7\'\2\2\u03b6"+
		"\u0085\3\2\2\2\62\u008e\u009a\u00a7\u00d9\u00e0\u00f2\u00fa\u0101\u0109"+
		"\u0114\u011e\u016d\u0182\u018c\u0198\u019d\u01a7\u01bc\u01d1\u01df\u01ea"+
		"\u01f6\u01fc\u0207\u026a\u027f\u0293\u0297\u029b\u029f\u02ab\u02b1\u02bc"+
		"\u02c5\u02e5\u02ff\u031a\u0326\u032a\u0330\u0337\u033f\u035b\u0377\u0382"+
		"\u0387\u0399\u03b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}