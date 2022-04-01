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
		RULE_variableDefinitionGeneral = 11, RULE_indexArray = 12, RULE_indexArrayElements = 13, 
		RULE_associativeArray = 14, RULE_associativeArrayElements = 15, RULE_operationBlock = 16, 
		RULE_operationElements = 17, RULE_operationValue = 18, RULE_firstIncDec = 19, 
		RULE_lastIncDec = 20, RULE_callingFunction = 21, RULE_functionCall = 22, 
		RULE_identifierB = 23, RULE_pointSeparator = 24, RULE_functionCallParam = 25, 
		RULE_functionCallParamElements = 26, RULE_conditionalExpression = 27, 
		RULE_conditionalBlockElements = 28, RULE_ifConditions = 29, RULE_elifConditions = 30, 
		RULE_elseConditions = 31, RULE_condBlockElementsLimited = 32, RULE_conditionalExpressionElements = 33, 
		RULE_conditionalExpElementsValue = 34, RULE_conditionExpBlock = 35, RULE_conditionalExpValue = 36, 
		RULE_loop = 37, RULE_loopExpression = 38, RULE_loopOneMembers = 39, RULE_loopTwoMembers = 40, 
		RULE_loopThreeMembers = 41, RULE_loopThreeMembersValues = 42, RULE_loopBlockElements = 43, 
		RULE_loopBlockElementsLimited = 44, RULE_ret = 45, RULE_retValues = 46, 
		RULE_functions = 47, RULE_functionGeneralModes = 48, RULE_functionsModes = 49, 
		RULE_functionMethodsModes = 50, RULE_methodPerm = 51, RULE_constructClassMethod = 52, 
		RULE_interfaceMethod = 53, RULE_functionCodeBlock = 54, RULE_functionParams = 55, 
		RULE_functionParamElements = 56, RULE_oopGeneral = 57, RULE_interfaceClass = 58, 
		RULE_interfaceClassDefinition = 59, RULE_abstractClass = 60, RULE_abstractClassDefinition = 61, 
		RULE_classDefination = 62, RULE_classModesGeneral = 63, RULE_classModes = 64, 
		RULE_arrayAccessElements = 65, RULE_accessBlock = 66, RULE_generalValue = 67, 
		RULE_objIdentifierA = 68, RULE_objIdentifierB = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableModes", "variableMembers", "variableDefinition", 
			"variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
			"firstIncDec", "lastIncDec", "callingFunction", "functionCall", "identifierB", 
			"pointSeparator", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalBlockElements", "ifConditions", "elifConditions", "elseConditions", 
			"condBlockElementsLimited", "conditionalExpressionElements", "conditionalExpElementsValue", 
			"conditionExpBlock", "conditionalExpValue", "loop", "loopExpression", 
			"loopOneMembers", "loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", 
			"loopBlockElements", "loopBlockElementsLimited", "ret", "retValues", 
			"functions", "functionGeneralModes", "functionsModes", "functionMethodsModes", 
			"methodPerm", "constructClassMethod", "interfaceMethod", "functionCodeBlock", 
			"functionParams", "functionParamElements", "oopGeneral", "interfaceClass", 
			"interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
			"classDefination", "classModesGeneral", "classModes", "arrayAccessElements", 
			"accessBlock", "generalValue", "objIdentifierA", "objIdentifierB"
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
			setState(140);
			fileContent(0);
			setState(141);
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
			setState(148);
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
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					sentence();
					}
					} 
				}
				setState(150);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
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
			setState(162);
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
			setState(164);
			match(Use);
			setState(165);
			useValue();
			setState(166);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				useString();
				setState(170);
				match(Separator);
				setState(171);
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
			setState(175);
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
			setState(177);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(Var);
				setState(180);
				variableMembers();
				setState(181);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				methodPerm();
				setState(184);
				match(Var);
				setState(185);
				variableMembers();
				setState(186);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(Static);
				setState(189);
				match(Var);
				setState(190);
				variableMembers();
				setState(191);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				methodPerm();
				setState(194);
				match(Static);
				setState(195);
				match(Var);
				setState(196);
				variableMembers();
				setState(197);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(Final);
				setState(200);
				methodPerm();
				setState(201);
				match(Static);
				setState(202);
				match(Var);
				setState(203);
				variableMembers();
				setState(204);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				match(Final);
				setState(207);
				methodPerm();
				setState(208);
				match(Var);
				setState(209);
				variableMembers();
				setState(210);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(Final);
				setState(213);
				match(Var);
				setState(214);
				variableMembers();
				setState(215);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(Final);
				setState(218);
				match(Static);
				setState(219);
				match(Var);
				setState(220);
				variableMembers();
				setState(221);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				variableMembers();
				setState(224);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				variableDefinition();
				setState(230);
				match(Separator);
				setState(231);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(Identifier);
				setState(236);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				objIdentifierA();
				setState(238);
				match(Point);
				setState(239);
				objIdentifierB();
				setState(240);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				objIdentifierA();
				setState(243);
				match(TwoTwoPoint);
				setState(244);
				objIdentifierB();
				setState(245);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				arrayAccessElements();
				setState(248);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(TypeSpec);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				match(New);
				setState(259);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(TypeSpec);
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				match(New);
				setState(263);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(OpenArIndex);
				setState(267);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(OpenArIndex);
				setState(269);
				indexArrayElements();
				setState(270);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				generalValue();
				setState(276);
				match(Separator);
				setState(277);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(OpenBlock);
				setState(282);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(OpenBlock);
				setState(284);
				associativeArrayElements();
				setState(285);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(Identifier);
				setState(290);
				match(TwoPoint);
				setState(291);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(Identifier);
				setState(293);
				match(TwoPoint);
				setState(294);
				generalValue();
				setState(295);
				match(Separator);
				setState(296);
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
			setState(300);
			match(OpenOp);
			setState(301);
			operationElements();
			setState(302);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				operationValue();
				setState(306);
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
		enterRule(_localctx, 36, RULE_operationValue);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(Identifier);
				setState(312);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(Identifier);
				setState(314);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(Identifier);
				setState(316);
				match(TypeSpec);
				setState(317);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				firstIncDec();
				setState(319);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				firstIncDec();
				setState(322);
				match(Identifier);
				setState(323);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				firstIncDec();
				setState(326);
				match(Identifier);
				setState(327);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				firstIncDec();
				setState(330);
				match(Identifier);
				setState(331);
				match(TypeSpec);
				setState(332);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(334);
				match(Identifier);
				setState(335);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(336);
				match(Identifier);
				setState(337);
				lastIncDec();
				setState(338);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(340);
				match(Identifier);
				setState(341);
				lastIncDec();
				setState(342);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(344);
				match(Identifier);
				setState(345);
				lastIncDec();
				setState(346);
				match(TypeSpec);
				setState(347);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(349);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(350);
				match(Integer);
				setState(351);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(352);
				match(Integer);
				setState(353);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(354);
				match(Integer);
				setState(355);
				match(TypeSpec);
				setState(356);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(357);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(358);
				match(Float);
				setState(359);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(360);
				match(Float);
				setState(361);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(362);
				match(Float);
				setState(363);
				match(TypeSpec);
				setState(364);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(365);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(366);
				functionCall();
				setState(367);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(369);
				functionCall();
				setState(370);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(372);
				functionCall();
				setState(373);
				match(TypeSpec);
				setState(374);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(376);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(377);
				operationBlock();
				setState(378);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(380);
				operationBlock();
				setState(381);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(383);
				operationBlock();
				setState(384);
				match(TypeSpec);
				setState(385);
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
			setState(389);
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
			setState(391);
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
			setState(393);
			functionCall();
			setState(394);
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
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(Identifier);
				setState(397);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(Identifier);
				setState(399);
				match(Point);
				setState(400);
				identifierB();
				setState(401);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(Identifier);
				setState(404);
				match(TwoTwoPoint);
				setState(405);
				identifierB();
				setState(406);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(Identifier);
				setState(409);
				match(Point);
				setState(410);
				identifierB();
				setState(411);
				functionCallParam();
				setState(412);
				pointSeparator();
				setState(413);
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
			setState(417);
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
			setState(419);
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
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(OpenOp);
				setState(422);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(OpenOp);
				setState(424);
				functionCallParamElements();
				setState(425);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				generalValue();
				setState(431);
				match(Separator);
				setState(432);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				operationElements();
				setState(436);
				match(Separator);
				setState(437);
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
		enterRule(_localctx, 54, RULE_conditionalExpression);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
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
		enterRule(_localctx, 56, RULE_conditionalBlockElements);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				conditionalExpression();
				setState(448);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				sentence();
				setState(452);
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
		enterRule(_localctx, 58, RULE_ifConditions);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(If);
				setState(457);
				conditionalExpressionElements();
				setState(458);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(If);
				setState(461);
				conditionalExpressionElements();
				setState(462);
				match(OpenBlock);
				setState(463);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(If);
				setState(466);
				conditionalExpressionElements();
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
				match(If);
				setState(472);
				conditionalExpressionElements();
				setState(473);
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
		enterRule(_localctx, 60, RULE_elifConditions);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(Elif);
				setState(478);
				conditionalExpressionElements();
				setState(479);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(Elif);
				setState(482);
				conditionalExpressionElements();
				setState(483);
				match(OpenBlock);
				setState(484);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(Elif);
				setState(487);
				conditionalExpressionElements();
				setState(488);
				match(OpenBlock);
				setState(489);
				conditionalBlockElements();
				setState(490);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(Elif);
				setState(493);
				conditionalExpressionElements();
				setState(494);
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
		enterRule(_localctx, 62, RULE_elseConditions);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(Else);
				setState(499);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(Else);
				setState(501);
				match(OpenBlock);
				setState(502);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				match(Else);
				setState(504);
				match(OpenBlock);
				setState(505);
				conditionalBlockElements();
				setState(506);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				match(Else);
				setState(509);
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
		enterRule(_localctx, 64, RULE_condBlockElementsLimited);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				ifConditions();
				setState(514);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				loop();
				setState(518);
				condBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
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
		enterRule(_localctx, 66, RULE_conditionalExpressionElements);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				conditionalExpElementsValue();
				setState(525);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				conditionExpBlock(0);
				setState(529);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				match(Not);
				setState(532);
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
		enterRule(_localctx, 68, RULE_conditionalExpElementsValue);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				conditionalExpValue();
				setState(537);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(542);
			match(OpenOp);
			setState(543);
			conditionalExpressionElements();
			setState(544);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpBlock);
					setState(546);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(547);
					match(AssignmentOperator);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 72, RULE_conditionalExpValue);
		int _la;
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(Identifier);
				setState(557);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(Identifier);
				setState(559);
				match(TypeSpec);
				setState(560);
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
				setState(561);
				firstIncDec();
				setState(562);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				firstIncDec();
				setState(565);
				match(Identifier);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(568);
				firstIncDec();
				setState(569);
				match(Identifier);
				setState(570);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(572);
				firstIncDec();
				setState(573);
				match(Identifier);
				setState(574);
				match(TypeSpec);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(577);
				match(Identifier);
				setState(578);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(579);
				match(Identifier);
				setState(580);
				lastIncDec();
				setState(581);
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
				setState(583);
				match(Identifier);
				setState(584);
				lastIncDec();
				setState(585);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(587);
				match(Identifier);
				setState(588);
				lastIncDec();
				setState(589);
				match(TypeSpec);
				setState(590);
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
				setState(592);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(593);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(595);
				match(Integer);
				setState(596);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(597);
				match(Integer);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(600);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(601);
				match(Float);
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(603);
				match(Float);
				setState(604);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(605);
				match(Float);
				setState(606);
				match(TypeSpec);
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(608);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(609);
				functionCall();
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
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(612);
				functionCall();
				setState(613);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(615);
				functionCall();
				setState(616);
				match(TypeSpec);
				setState(617);
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
				setState(619);
				match(Identifier);
				setState(620);
				match(Attr);
				setState(621);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(622);
				match(Identifier);
				setState(623);
				match(Attr);
				setState(624);
				functionCall();
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
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(627);
				match(Identifier);
				setState(628);
				match(Attr);
				setState(629);
				functionCall();
				setState(630);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(632);
				match(Identifier);
				setState(633);
				match(Attr);
				setState(634);
				functionCall();
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
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(638);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(639);
				operationBlock();
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(642);
				operationBlock();
				setState(643);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(645);
				operationBlock();
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_loop);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(For);
				setState(652);
				loopExpression();
				setState(653);
				match(OpenBlock);
				setState(654);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(For);
				setState(657);
				loopExpression();
				setState(658);
				match(OpenBlock);
				setState(659);
				loopBlockElements();
				setState(660);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				match(For);
				setState(663);
				loopExpression();
				setState(664);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				match(For);
				setState(667);
				loopExpression();
				setState(668);
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
		enterRule(_localctx, 76, RULE_loopExpression);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(OpenOp);
				setState(673);
				loopOneMembers();
				setState(674);
				match(End);
				setState(675);
				loopTwoMembers();
				setState(676);
				match(End);
				setState(677);
				loopThreeMembers();
				setState(678);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				loopOneMembers();
				setState(681);
				match(End);
				setState(682);
				loopTwoMembers();
				setState(683);
				match(End);
				setState(684);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				match(OpenOp);
				setState(688);
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
		enterRule(_localctx, 78, RULE_loopOneMembers);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
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
		enterRule(_localctx, 80, RULE_loopTwoMembers);
		try {
			setState(698);
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
				setState(696);
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
		enterRule(_localctx, 82, RULE_loopThreeMembers);
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
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
		enterRule(_localctx, 84, RULE_loopThreeMembersValues);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				operationElements();
				setState(707);
				match(Separator);
				setState(708);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				operationBlock();
				setState(711);
				match(Separator);
				setState(712);
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
		enterRule(_localctx, 86, RULE_loopBlockElements);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				sentence();
				setState(718);
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
		enterRule(_localctx, 88, RULE_loopBlockElementsLimited);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				ifConditions();
				setState(724);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				loop();
				setState(728);
				loopBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
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
		enterRule(_localctx, 90, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(Ret);
			setState(734);
			retValues();
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
		enterRule(_localctx, 92, RULE_retValues);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
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
		enterRule(_localctx, 94, RULE_functions);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				functionsModes();
				setState(743);
				match(OpenBlock);
				setState(744);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				functionsModes();
				setState(747);
				match(OpenBlock);
				setState(748);
				functionCodeBlock();
				setState(749);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				functionMethodsModes();
				setState(752);
				match(OpenBlock);
				setState(753);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				functionMethodsModes();
				setState(756);
				match(OpenBlock);
				setState(757);
				functionCodeBlock();
				setState(758);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				constructClassMethod();
				setState(761);
				match(OpenBlock);
				setState(762);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(764);
				constructClassMethod();
				setState(765);
				match(OpenBlock);
				setState(766);
				functionCodeBlock();
				setState(767);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(769);
				interfaceMethod();
				setState(770);
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
		enterRule(_localctx, 96, RULE_functionGeneralModes);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(Function);
				setState(775);
				match(Identifier);
				setState(776);
				match(OpenOp);
				setState(777);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(Function);
				setState(779);
				match(Identifier);
				setState(780);
				match(OpenOp);
				setState(781);
				match(CloseOp);
				setState(782);
				match(ArrowRight);
				setState(783);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				match(Function);
				setState(785);
				match(Identifier);
				setState(786);
				match(OpenOp);
				setState(787);
				functionParams();
				setState(788);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				match(Function);
				setState(791);
				match(Identifier);
				setState(792);
				match(OpenOp);
				setState(793);
				functionParams();
				setState(794);
				match(CloseOp);
				setState(795);
				match(ArrowRight);
				setState(796);
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
		enterRule(_localctx, 98, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
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
		enterRule(_localctx, 100, RULE_functionMethodsModes);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				methodPerm();
				setState(803);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(Static);
				setState(806);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				methodPerm();
				setState(808);
				match(Static);
				setState(809);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				match(Final);
				setState(812);
				methodPerm();
				setState(813);
				match(Static);
				setState(814);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(816);
				match(Final);
				setState(817);
				methodPerm();
				setState(818);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(820);
				match(Final);
				setState(821);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(822);
				match(Final);
				setState(823);
				match(Static);
				setState(824);
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
		enterRule(_localctx, 102, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
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
		enterRule(_localctx, 104, RULE_constructClassMethod);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(Identifier);
				setState(830);
				match(OpenOp);
				setState(831);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_interfaceMethod);
		try {
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
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
				setState(840);
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
		enterRule(_localctx, 108, RULE_functionCodeBlock);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				sentence();
				setState(845);
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
		enterRule(_localctx, 110, RULE_functionParams);
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				functionParamElements();
				setState(851);
				match(Separator);
				setState(852);
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
		enterRule(_localctx, 112, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(Identifier);
			setState(857);
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
		enterRule(_localctx, 114, RULE_oopGeneral);
		try {
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
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
		enterRule(_localctx, 116, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		enterRule(_localctx, 118, RULE_interfaceClassDefinition);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(Interface);
				setState(867);
				match(Identifier);
				setState(868);
				match(OpenBlock);
				setState(869);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(Interface);
				setState(871);
				match(Identifier);
				setState(872);
				match(OpenBlock);
				setState(873);
				functionCodeBlock();
				setState(874);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				match(Interface);
				setState(877);
				match(Identifier);
				setState(878);
				match(Extends);
				setState(879);
				match(Identifier);
				setState(880);
				match(OpenBlock);
				setState(881);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				match(Interface);
				setState(883);
				match(Identifier);
				setState(884);
				match(Extends);
				setState(885);
				match(Identifier);
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
		enterRule(_localctx, 120, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
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
		enterRule(_localctx, 122, RULE_abstractClassDefinition);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				match(Abstract);
				setState(895);
				match(Identifier);
				setState(896);
				match(OpenBlock);
				setState(897);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(Abstract);
				setState(899);
				match(Identifier);
				setState(900);
				match(OpenBlock);
				setState(901);
				functionCodeBlock();
				setState(902);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				match(Abstract);
				setState(905);
				match(Identifier);
				setState(906);
				match(Extends);
				setState(907);
				match(Identifier);
				setState(908);
				match(OpenBlock);
				setState(909);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				match(Abstract);
				setState(911);
				match(Identifier);
				setState(912);
				match(Extends);
				setState(913);
				match(Identifier);
				setState(914);
				match(OpenBlock);
				setState(915);
				functionCodeBlock();
				setState(916);
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
		enterRule(_localctx, 124, RULE_classDefination);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				classModesGeneral();
				setState(921);
				match(OpenBlock);
				setState(922);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				classModesGeneral();
				setState(925);
				match(OpenBlock);
				setState(926);
				functionCodeBlock();
				setState(927);
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
		enterRule(_localctx, 126, RULE_classModesGeneral);
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				match(Final);
				setState(933);
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
		enterRule(_localctx, 128, RULE_classModes);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				match(Class);
				setState(937);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(Class);
				setState(939);
				match(Identifier);
				setState(940);
				match(Extends);
				setState(941);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				match(Class);
				setState(943);
				match(Identifier);
				setState(944);
				match(Implements);
				setState(945);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(946);
				match(Class);
				setState(947);
				match(Identifier);
				setState(948);
				match(Extends);
				setState(949);
				match(Identifier);
				setState(950);
				match(Implements);
				setState(951);
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
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public AccessBlockContext accessBlock() {
			return getRuleContext(AccessBlockContext.class,0);
		}
		public ArrayAccessElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElements; }
	}

	public final ArrayAccessElementsContext arrayAccessElements() throws RecognitionException {
		ArrayAccessElementsContext _localctx = new ArrayAccessElementsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayAccessElements);
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(Identifier);
				setState(956);
				match(Point);
				setState(957);
				arrayAccessElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(Identifier);
				setState(959);
				accessBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				match(Identifier);
				setState(961);
				accessBlock();
				setState(962);
				match(Point);
				setState(963);
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

	public static class AccessBlockContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public AccessBlockContext accessBlock() {
			return getRuleContext(AccessBlockContext.class,0);
		}
		public AccessBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessBlock; }
	}

	public final AccessBlockContext accessBlock() throws RecognitionException {
		AccessBlockContext _localctx = new AccessBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_accessBlock);
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				match(OpenArIndex);
				setState(968);
				match(Integer);
				setState(969);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(OpenArIndex);
				setState(971);
				match(Integer);
				setState(972);
				match(CloseArIndex);
				setState(973);
				accessBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 134, RULE_generalValue);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				match(Identifier);
				setState(978);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(980);
				match(Integer);
				setState(981);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(982);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(983);
				match(Float);
				setState(984);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(986);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(987);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(988);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(989);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(990);
				objIdentifierA();
				setState(991);
				match(Point);
				setState(992);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(994);
				objIdentifierA();
				setState(995);
				match(TwoTwoPoint);
				setState(996);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(998);
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
		enterRule(_localctx, 136, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
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
		enterRule(_localctx, 138, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
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
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u03f0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00a3\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00b0\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00e5\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00ec\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0113\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u011a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0122\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012d\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0137\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0186\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01a2\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01ae\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01ba\n\34\3\35\3\35\3\35\5\35\u01bf\n\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u01c9\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01de\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01f3\n "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0201\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u020c\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0218\n"+
		"#\3$\3$\3$\3$\5$\u021e\n$\3%\3%\3%\3%\3%\3%\3%\7%\u0227\n%\f%\16%\u022a"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u028c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02a1\n\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02b5\n(\3)\3)\5)\u02b9\n)\3*\3*"+
		"\5*\u02bd\n*\3+\3+\5+\u02c1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02cd"+
		"\n,\3-\3-\3-\3-\5-\u02d3\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02de\n.\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\5\60\u02e7\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0307\n\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0321\n\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u033c\n\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0348\n\66\3\67\3\67\5\67"+
		"\u034c\n\67\38\38\38\38\58\u0352\n8\39\39\39\39\39\59\u0359\n9\3:\3:\3"+
		":\3;\3;\3;\5;\u0361\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u037d\n=\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0399\n?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\5@\u03a4\n@\3A\3A\3A\5A\u03a9\nA\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03bb\nB\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\5C\u03c8\nC\3D\3D\3D\3D\3D\3D\3D\5D\u03d1\nD\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u03ea\nE\3"+
		"F\3F\3G\3G\3G\2\4\4HH\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\2\5\4\2\30\30$$\3\2#$\3\2\13\r\2\u0465\2\u008e\3\2"+
		"\2\2\4\u0091\3\2\2\2\6\u00a2\3\2\2\2\b\u00a4\3\2\2\2\n\u00a6\3\2\2\2\f"+
		"\u00af\3\2\2\2\16\u00b1\3\2\2\2\20\u00b3\3\2\2\2\22\u00e4\3\2\2\2\24\u00eb"+
		"\3\2\2\2\26\u00fc\3\2\2\2\30\u010a\3\2\2\2\32\u0112\3\2\2\2\34\u0119\3"+
		"\2\2\2\36\u0121\3\2\2\2 \u012c\3\2\2\2\"\u012e\3\2\2\2$\u0136\3\2\2\2"+
		"&\u0185\3\2\2\2(\u0187\3\2\2\2*\u0189\3\2\2\2,\u018b\3\2\2\2.\u01a1\3"+
		"\2\2\2\60\u01a3\3\2\2\2\62\u01a5\3\2\2\2\64\u01ad\3\2\2\2\66\u01b9\3\2"+
		"\2\28\u01be\3\2\2\2:\u01c8\3\2\2\2<\u01dd\3\2\2\2>\u01f2\3\2\2\2@\u0200"+
		"\3\2\2\2B\u020b\3\2\2\2D\u0217\3\2\2\2F\u021d\3\2\2\2H\u021f\3\2\2\2J"+
		"\u028b\3\2\2\2L\u02a0\3\2\2\2N\u02b4\3\2\2\2P\u02b8\3\2\2\2R\u02bc\3\2"+
		"\2\2T\u02c0\3\2\2\2V\u02cc\3\2\2\2X\u02d2\3\2\2\2Z\u02dd\3\2\2\2\\\u02df"+
		"\3\2\2\2^\u02e6\3\2\2\2`\u0306\3\2\2\2b\u0320\3\2\2\2d\u0322\3\2\2\2f"+
		"\u033b\3\2\2\2h\u033d\3\2\2\2j\u0347\3\2\2\2l\u034b\3\2\2\2n\u0351\3\2"+
		"\2\2p\u0358\3\2\2\2r\u035a\3\2\2\2t\u0360\3\2\2\2v\u0362\3\2\2\2x\u037c"+
		"\3\2\2\2z\u037e\3\2\2\2|\u0398\3\2\2\2~\u03a3\3\2\2\2\u0080\u03a8\3\2"+
		"\2\2\u0082\u03ba\3\2\2\2\u0084\u03c7\3\2\2\2\u0086\u03d0\3\2\2\2\u0088"+
		"\u03e9\3\2\2\2\u008a\u03eb\3\2\2\2\u008c\u03ed\3\2\2\2\u008e\u008f\5\4"+
		"\3\2\u008f\u0090\7\2\2\3\u0090\3\3\2\2\2\u0091\u0096\b\3\1\2\u0092\u0093"+
		"\f\4\2\2\u0093\u0095\5\6\4\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\5\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0099\u00a3\5\b\5\2\u009a\u00a3\5\n\6\2\u009b\u00a3\5\20\t\2\u009c\u00a3"+
		"\5,\27\2\u009d\u00a3\58\35\2\u009e\u00a3\5L\'\2\u009f\u00a3\5`\61\2\u00a0"+
		"\u00a3\5\\/\2\u00a1\u00a3\5t;\2\u00a2\u0099\3\2\2\2\u00a2\u009a\3\2\2"+
		"\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\7\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\t\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7"+
		"\u00a8\5\f\7\2\u00a8\u00a9\7\27\2\2\u00a9\13\3\2\2\2\u00aa\u00b0\5\16"+
		"\b\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\5\f\7\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\r\3\2\2\2"+
		"\u00b1\u00b2\7*\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\5\22\n\2\u00b4\21\3\2"+
		"\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7\27\2\2\u00b8"+
		"\u00e5\3\2\2\2\u00b9\u00ba\5h\65\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\5\24"+
		"\13\2\u00bc\u00bd\7\27\2\2\u00bd\u00e5\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\27\2\2\u00c2\u00e5"+
		"\3\2\2\2\u00c3\u00c4\5h\65\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\4\2\2"+
		"\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\27\2\2\u00c8\u00e5\3\2\2\2\u00c9"+
		"\u00ca\7\17\2\2\u00ca\u00cb\5h\65\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\7"+
		"\4\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7\27\2\2\u00cf\u00e5\3\2\2\2"+
		"\u00d0\u00d1\7\17\2\2\u00d1\u00d2\5h\65\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4"+
		"\5\24\13\2\u00d4\u00d5\7\27\2\2\u00d5\u00e5\3\2\2\2\u00d6\u00d7\7\17\2"+
		"\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\7\27\2\2\u00da"+
		"\u00e5\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\7"+
		"\4\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\7\27\2\2\u00e0\u00e5\3\2\2\2"+
		"\u00e1\u00e2\5\24\13\2\u00e2\u00e3\7\27\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00b5\3\2\2\2\u00e4\u00b9\3\2\2\2\u00e4\u00be\3\2\2\2\u00e4\u00c3\3\2"+
		"\2\2\u00e4\u00c9\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4"+
		"\u00db\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\23\3\2\2\2\u00e6\u00ec\5\26\f"+
		"\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5\24\13\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\25\3\2\2"+
		"\2\u00ed\u00ee\7\'\2\2\u00ee\u00fd\5\30\r\2\u00ef\u00f0\5\u008aF\2\u00f0"+
		"\u00f1\7\31\2\2\u00f1\u00f2\5\u008cG\2\u00f2\u00f3\5\30\r\2\u00f3\u00fd"+
		"\3\2\2\2\u00f4\u00f5\5\u008aF\2\u00f5\u00f6\7\33\2\2\u00f6\u00f7\5\u008c"+
		"G\2\u00f7\u00f8\5\30\r\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\5\u0084C\2\u00fa"+
		"\u00fb\5\30\r\2\u00fb\u00fd\3\2\2\2\u00fc\u00ed\3\2\2\2\u00fc\u00ef\3"+
		"\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\27\3\2\2\2\u00fe"+
		"\u00ff\t\2\2\2\u00ff\u010b\5\u0088E\2\u0100\u0101\7)\2\2\u0101\u0102\t"+
		"\2\2\2\u0102\u010b\5\u0088E\2\u0103\u0104\t\2\2\2\u0104\u0105\7\25\2\2"+
		"\u0105\u010b\5\u0088E\2\u0106\u0107\7)\2\2\u0107\u0108\t\2\2\2\u0108\u0109"+
		"\7\25\2\2\u0109\u010b\5\u0088E\2\u010a\u00fe\3\2\2\2\u010a\u0100\3\2\2"+
		"\2\u010a\u0103\3\2\2\2\u010a\u0106\3\2\2\2\u010b\31\3\2\2\2\u010c\u010d"+
		"\7\35\2\2\u010d\u0113\7\36\2\2\u010e\u010f\7\35\2\2\u010f\u0110\5\34\17"+
		"\2\u0110\u0111\7\36\2\2\u0111\u0113\3\2\2\2\u0112\u010c\3\2\2\2\u0112"+
		"\u010e\3\2\2\2\u0113\33\3\2\2\2\u0114\u011a\5\u0088E\2\u0115\u0116\5\u0088"+
		"E\2\u0116\u0117\7\34\2\2\u0117\u0118\5\34\17\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u011a\35\3\2\2\2\u011b\u011c\7\37\2"+
		"\2\u011c\u0122\7 \2\2\u011d\u011e\7\37\2\2\u011e\u011f\5 \21\2\u011f\u0120"+
		"\7 \2\2\u0120\u0122\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		"\37\3\2\2\2\u0123\u0124\7\'\2\2\u0124\u0125\7\32\2\2\u0125\u012d\5\u0088"+
		"E\2\u0126\u0127\7\'\2\2\u0127\u0128\7\32\2\2\u0128\u0129\5\u0088E\2\u0129"+
		"\u012a\7\34\2\2\u012a\u012b\5 \21\2\u012b\u012d\3\2\2\2\u012c\u0123\3"+
		"\2\2\2\u012c\u0126\3\2\2\2\u012d!\3\2\2\2\u012e\u012f\7!\2\2\u012f\u0130"+
		"\5$\23\2\u0130\u0131\7\"\2\2\u0131#\3\2\2\2\u0132\u0137\5&\24\2\u0133"+
		"\u0134\5&\24\2\u0134\u0135\5$\23\2\u0135\u0137\3\2\2\2\u0136\u0132\3\2"+
		"\2\2\u0136\u0133\3\2\2\2\u0137%\3\2\2\2\u0138\u0186\7\'\2\2\u0139\u013a"+
		"\7\'\2\2\u013a\u0186\7#\2\2\u013b\u013c\7\'\2\2\u013c\u0186\7)\2\2\u013d"+
		"\u013e\7\'\2\2\u013e\u013f\7)\2\2\u013f\u0186\7#\2\2\u0140\u0141\5(\25"+
		"\2\u0141\u0142\7\'\2\2\u0142\u0186\3\2\2\2\u0143\u0144\5(\25\2\u0144\u0145"+
		"\7\'\2\2\u0145\u0146\7#\2\2\u0146\u0186\3\2\2\2\u0147\u0148\5(\25\2\u0148"+
		"\u0149\7\'\2\2\u0149\u014a\7)\2\2\u014a\u0186\3\2\2\2\u014b\u014c\5(\25"+
		"\2\u014c\u014d\7\'\2\2\u014d\u014e\7)\2\2\u014e\u014f\7#\2\2\u014f\u0186"+
		"\3\2\2\2\u0150\u0151\7\'\2\2\u0151\u0186\5*\26\2\u0152\u0153\7\'\2\2\u0153"+
		"\u0154\5*\26\2\u0154\u0155\7#\2\2\u0155\u0186\3\2\2\2\u0156\u0157\7\'"+
		"\2\2\u0157\u0158\5*\26\2\u0158\u0159\7)\2\2\u0159\u0186\3\2\2\2\u015a"+
		"\u015b\7\'\2\2\u015b\u015c\5*\26\2\u015c\u015d\7)\2\2\u015d\u015e\7#\2"+
		"\2\u015e\u0186\3\2\2\2\u015f\u0186\7+\2\2\u0160\u0161\7+\2\2\u0161\u0186"+
		"\7#\2\2\u0162\u0163\7+\2\2\u0163\u0186\7)\2\2\u0164\u0165\7+\2\2\u0165"+
		"\u0166\7)\2\2\u0166\u0186\7#\2\2\u0167\u0186\7,\2\2\u0168\u0169\7,\2\2"+
		"\u0169\u0186\7#\2\2\u016a\u016b\7,\2\2\u016b\u0186\7)\2\2\u016c\u016d"+
		"\7,\2\2\u016d\u016e\7)\2\2\u016e\u0186\7#\2\2\u016f\u0186\5.\30\2\u0170"+
		"\u0171\5.\30\2\u0171\u0172\7#\2\2\u0172\u0186\3\2\2\2\u0173\u0174\5.\30"+
		"\2\u0174\u0175\7)\2\2\u0175\u0186\3\2\2\2\u0176\u0177\5.\30\2\u0177\u0178"+
		"\7)\2\2\u0178\u0179\7#\2\2\u0179\u0186\3\2\2\2\u017a\u0186\5\"\22\2\u017b"+
		"\u017c\5\"\22\2\u017c\u017d\7#\2\2\u017d\u0186\3\2\2\2\u017e\u017f\5\""+
		"\22\2\u017f\u0180\7)\2\2\u0180\u0186\3\2\2\2\u0181\u0182\5\"\22\2\u0182"+
		"\u0183\7)\2\2\u0183\u0184\7#\2\2\u0184\u0186\3\2\2\2\u0185\u0138\3\2\2"+
		"\2\u0185\u0139\3\2\2\2\u0185\u013b\3\2\2\2\u0185\u013d\3\2\2\2\u0185\u0140"+
		"\3\2\2\2\u0185\u0143\3\2\2\2\u0185\u0147\3\2\2\2\u0185\u014b\3\2\2\2\u0185"+
		"\u0150\3\2\2\2\u0185\u0152\3\2\2\2\u0185\u0156\3\2\2\2\u0185\u015a\3\2"+
		"\2\2\u0185\u015f\3\2\2\2\u0185\u0160\3\2\2\2\u0185\u0162\3\2\2\2\u0185"+
		"\u0164\3\2\2\2\u0185\u0167\3\2\2\2\u0185\u0168\3\2\2\2\u0185\u016a\3\2"+
		"\2\2\u0185\u016c\3\2\2\2\u0185\u016f\3\2\2\2\u0185\u0170\3\2\2\2\u0185"+
		"\u0173\3\2\2\2\u0185\u0176\3\2\2\2\u0185\u017a\3\2\2\2\u0185\u017b\3\2"+
		"\2\2\u0185\u017e\3\2\2\2\u0185\u0181\3\2\2\2\u0186\'\3\2\2\2\u0187\u0188"+
		"\7&\2\2\u0188)\3\2\2\2\u0189\u018a\7&\2\2\u018a+\3\2\2\2\u018b\u018c\5"+
		".\30\2\u018c\u018d\7\27\2\2\u018d-\3\2\2\2\u018e\u018f\7\'\2\2\u018f\u01a2"+
		"\5\64\33\2\u0190\u0191\7\'\2\2\u0191\u0192\7\31\2\2\u0192\u0193\5\60\31"+
		"\2\u0193\u0194\5\64\33\2\u0194\u01a2\3\2\2\2\u0195\u0196\7\'\2\2\u0196"+
		"\u0197\7\33\2\2\u0197\u0198\5\60\31\2\u0198\u0199\5\64\33\2\u0199\u01a2"+
		"\3\2\2\2\u019a\u019b\7\'\2\2\u019b\u019c\7\31\2\2\u019c\u019d\5\60\31"+
		"\2\u019d\u019e\5\64\33\2\u019e\u019f\5\62\32\2\u019f\u01a0\5.\30\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u018e\3\2\2\2\u01a1\u0190\3\2\2\2\u01a1\u0195\3\2"+
		"\2\2\u01a1\u019a\3\2\2\2\u01a2/\3\2\2\2\u01a3\u01a4\7\'\2\2\u01a4\61\3"+
		"\2\2\2\u01a5\u01a6\7\31\2\2\u01a6\63\3\2\2\2\u01a7\u01a8\7!\2\2\u01a8"+
		"\u01ae\7\"\2\2\u01a9\u01aa\7!\2\2\u01aa\u01ab\5\66\34\2\u01ab\u01ac\7"+
		"\"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae"+
		"\65\3\2\2\2\u01af\u01ba\5\u0088E\2\u01b0\u01b1\5\u0088E\2\u01b1\u01b2"+
		"\7\34\2\2\u01b2\u01b3\5\66\34\2\u01b3\u01ba\3\2\2\2\u01b4\u01ba\5$\23"+
		"\2\u01b5\u01b6\5$\23\2\u01b6\u01b7\7\34\2\2\u01b7\u01b8\5\66\34\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01af\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b4\3\2"+
		"\2\2\u01b9\u01b5\3\2\2\2\u01ba\67\3\2\2\2\u01bb\u01bf\5<\37\2\u01bc\u01bf"+
		"\5> \2\u01bd\u01bf\5@!\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bd\3\2\2\2\u01bf9\3\2\2\2\u01c0\u01c9\58\35\2\u01c1\u01c2\58\35\2"+
		"\u01c2\u01c3\5:\36\2\u01c3\u01c9\3\2\2\2\u01c4\u01c9\5\6\4\2\u01c5\u01c6"+
		"\5\6\4\2\u01c6\u01c7\5:\36\2\u01c7\u01c9\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8"+
		"\u01c1\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9;\3\2\2\2"+
		"\u01ca\u01cb\7\5\2\2\u01cb\u01cc\5D#\2\u01cc\u01cd\5,\27\2\u01cd\u01de"+
		"\3\2\2\2\u01ce\u01cf\7\5\2\2\u01cf\u01d0\5D#\2\u01d0\u01d1\7\37\2\2\u01d1"+
		"\u01d2\7 \2\2\u01d2\u01de\3\2\2\2\u01d3\u01d4\7\5\2\2\u01d4\u01d5\5D#"+
		"\2\u01d5\u01d6\7\37\2\2\u01d6\u01d7\5:\36\2\u01d7\u01d8\7 \2\2\u01d8\u01de"+
		"\3\2\2\2\u01d9\u01da\7\5\2\2\u01da\u01db\5D#\2\u01db\u01dc\5B\"\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01ca\3\2\2\2\u01dd\u01ce\3\2\2\2\u01dd\u01d3\3\2"+
		"\2\2\u01dd\u01d9\3\2\2\2\u01de=\3\2\2\2\u01df\u01e0\7\6\2\2\u01e0\u01e1"+
		"\5D#\2\u01e1\u01e2\5,\27\2\u01e2\u01f3\3\2\2\2\u01e3\u01e4\7\6\2\2\u01e4"+
		"\u01e5\5D#\2\u01e5\u01e6\7\37\2\2\u01e6\u01e7\7 \2\2\u01e7\u01f3\3\2\2"+
		"\2\u01e8\u01e9\7\6\2\2\u01e9\u01ea\5D#\2\u01ea\u01eb\7\37\2\2\u01eb\u01ec"+
		"\5:\36\2\u01ec\u01ed\7 \2\2\u01ed\u01f3\3\2\2\2\u01ee\u01ef\7\6\2\2\u01ef"+
		"\u01f0\5D#\2\u01f0\u01f1\5B\"\2\u01f1\u01f3\3\2\2\2\u01f2\u01df\3\2\2"+
		"\2\u01f2\u01e3\3\2\2\2\u01f2\u01e8\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3?"+
		"\3\2\2\2\u01f4\u01f5\7\7\2\2\u01f5\u0201\5,\27\2\u01f6\u01f7\7\7\2\2\u01f7"+
		"\u01f8\7\37\2\2\u01f8\u0201\7 \2\2\u01f9\u01fa\7\7\2\2\u01fa\u01fb\7\37"+
		"\2\2\u01fb\u01fc\5:\36\2\u01fc\u01fd\7 \2\2\u01fd\u0201\3\2\2\2\u01fe"+
		"\u01ff\7\7\2\2\u01ff\u0201\5B\"\2\u0200\u01f4\3\2\2\2\u0200\u01f6\3\2"+
		"\2\2\u0200\u01f9\3\2\2\2\u0200\u01fe\3\2\2\2\u0201A\3\2\2\2\u0202\u020c"+
		"\5<\37\2\u0203\u0204\5<\37\2\u0204\u0205\5:\36\2\u0205\u020c\3\2\2\2\u0206"+
		"\u020c\5L\'\2\u0207\u0208\5L\'\2\u0208\u0209\5B\"\2\u0209\u020c\3\2\2"+
		"\2\u020a\u020c\5\\/\2\u020b\u0202\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0206"+
		"\3\2\2\2\u020b\u0207\3\2\2\2\u020b\u020a\3\2\2\2\u020cC\3\2\2\2\u020d"+
		"\u0218\5F$\2\u020e\u020f\5F$\2\u020f\u0210\5D#\2\u0210\u0218\3\2\2\2\u0211"+
		"\u0218\5H%\2\u0212\u0213\5H%\2\u0213\u0214\5D#\2\u0214\u0218\3\2\2\2\u0215"+
		"\u0216\7%\2\2\u0216\u0218\5D#\2\u0217\u020d\3\2\2\2\u0217\u020e\3\2\2"+
		"\2\u0217\u0211\3\2\2\2\u0217\u0212\3\2\2\2\u0217\u0215\3\2\2\2\u0218E"+
		"\3\2\2\2\u0219\u021e\5J&\2\u021a\u021b\5J&\2\u021b\u021c\5F$\2\u021c\u021e"+
		"\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021a\3\2\2\2\u021eG\3\2\2\2\u021f"+
		"\u0220\b%\1\2\u0220\u0221\7!\2\2\u0221\u0222\5D#\2\u0222\u0223\7\"\2\2"+
		"\u0223\u0228\3\2\2\2\u0224\u0225\f\3\2\2\u0225\u0227\7$\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"I\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u028c\7\'\2\2\u022c\u022d\7\'\2\2"+
		"\u022d\u028c\t\3\2\2\u022e\u022f\7\'\2\2\u022f\u028c\7)\2\2\u0230\u0231"+
		"\7\'\2\2\u0231\u0232\7)\2\2\u0232\u028c\t\3\2\2\u0233\u0234\5(\25\2\u0234"+
		"\u0235\7\'\2\2\u0235\u028c\3\2\2\2\u0236\u0237\5(\25\2\u0237\u0238\7\'"+
		"\2\2\u0238\u0239\t\3\2\2\u0239\u028c\3\2\2\2\u023a\u023b\5(\25\2\u023b"+
		"\u023c\7\'\2\2\u023c\u023d\7)\2\2\u023d\u028c\3\2\2\2\u023e\u023f\5(\25"+
		"\2\u023f\u0240\7\'\2\2\u0240\u0241\7)\2\2\u0241\u0242\t\3\2\2\u0242\u028c"+
		"\3\2\2\2\u0243\u0244\7\'\2\2\u0244\u028c\5*\26\2\u0245\u0246\7\'\2\2\u0246"+
		"\u0247\5*\26\2\u0247\u0248\t\3\2\2\u0248\u028c\3\2\2\2\u0249\u024a\7\'"+
		"\2\2\u024a\u024b\5*\26\2\u024b\u024c\7)\2\2\u024c\u028c\3\2\2\2\u024d"+
		"\u024e\7\'\2\2\u024e\u024f\5*\26\2\u024f\u0250\7)\2\2\u0250\u0251\t\3"+
		"\2\2\u0251\u028c\3\2\2\2\u0252\u028c\7+\2\2\u0253\u0254\7+\2\2\u0254\u028c"+
		"\t\3\2\2\u0255\u0256\7+\2\2\u0256\u028c\7)\2\2\u0257\u0258\7+\2\2\u0258"+
		"\u0259\7)\2\2\u0259\u028c\t\3\2\2\u025a\u028c\7,\2\2\u025b\u025c\7,\2"+
		"\2\u025c\u028c\t\3\2\2\u025d\u025e\7,\2\2\u025e\u028c\7)\2\2\u025f\u0260"+
		"\7,\2\2\u0260\u0261\7)\2\2\u0261\u028c\t\3\2\2\u0262\u028c\5.\30\2\u0263"+
		"\u0264\5.\30\2\u0264\u0265\t\3\2\2\u0265\u028c\3\2\2\2\u0266\u0267\5."+
		"\30\2\u0267\u0268\7)\2\2\u0268\u028c\3\2\2\2\u0269\u026a\5.\30\2\u026a"+
		"\u026b\7)\2\2\u026b\u026c\t\3\2\2\u026c\u028c\3\2\2\2\u026d\u026e\7\'"+
		"\2\2\u026e\u026f\7\30\2\2\u026f\u028c\5.\30\2\u0270\u0271\7\'\2\2\u0271"+
		"\u0272\7\30\2\2\u0272\u0273\5.\30\2\u0273\u0274\t\3\2\2\u0274\u028c\3"+
		"\2\2\2\u0275\u0276\7\'\2\2\u0276\u0277\7\30\2\2\u0277\u0278\5.\30\2\u0278"+
		"\u0279\7)\2\2\u0279\u028c\3\2\2\2\u027a\u027b\7\'\2\2\u027b\u027c\7\30"+
		"\2\2\u027c\u027d\5.\30\2\u027d\u027e\7)\2\2\u027e\u027f\t\3\2\2\u027f"+
		"\u028c\3\2\2\2\u0280\u028c\5\"\22\2\u0281\u0282\5\"\22\2\u0282\u0283\t"+
		"\3\2\2\u0283\u028c\3\2\2\2\u0284\u0285\5\"\22\2\u0285\u0286\7)\2\2\u0286"+
		"\u028c\3\2\2\2\u0287\u0288\5\"\22\2\u0288\u0289\7)\2\2\u0289\u028a\t\3"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u022b\3\2\2\2\u028b\u022c\3\2\2\2\u028b"+
		"\u022e\3\2\2\2\u028b\u0230\3\2\2\2\u028b\u0233\3\2\2\2\u028b\u0236\3\2"+
		"\2\2\u028b\u023a\3\2\2\2\u028b\u023e\3\2\2\2\u028b\u0243\3\2\2\2\u028b"+
		"\u0245\3\2\2\2\u028b\u0249\3\2\2\2\u028b\u024d\3\2\2\2\u028b\u0252\3\2"+
		"\2\2\u028b\u0253\3\2\2\2\u028b\u0255\3\2\2\2\u028b\u0257\3\2\2\2\u028b"+
		"\u025a\3\2\2\2\u028b\u025b\3\2\2\2\u028b\u025d\3\2\2\2\u028b\u025f\3\2"+
		"\2\2\u028b\u0262\3\2\2\2\u028b\u0263\3\2\2\2\u028b\u0266\3\2\2\2\u028b"+
		"\u0269\3\2\2\2\u028b\u026d\3\2\2\2\u028b\u0270\3\2\2\2\u028b\u0275\3\2"+
		"\2\2\u028b\u027a\3\2\2\2\u028b\u0280\3\2\2\2\u028b\u0281\3\2\2\2\u028b"+
		"\u0284\3\2\2\2\u028b\u0287\3\2\2\2\u028cK\3\2\2\2\u028d\u028e\7\b\2\2"+
		"\u028e\u028f\5N(\2\u028f\u0290\7\37\2\2\u0290\u0291\7 \2\2\u0291\u02a1"+
		"\3\2\2\2\u0292\u0293\7\b\2\2\u0293\u0294\5N(\2\u0294\u0295\7\37\2\2\u0295"+
		"\u0296\5X-\2\u0296\u0297\7 \2\2\u0297\u02a1\3\2\2\2\u0298\u0299\7\b\2"+
		"\2\u0299\u029a\5N(\2\u029a\u029b\5,\27\2\u029b\u02a1\3\2\2\2\u029c\u029d"+
		"\7\b\2\2\u029d\u029e\5N(\2\u029e\u029f\5Z.\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u028d\3\2\2\2\u02a0\u0292\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0\u029c\3\2"+
		"\2\2\u02a1M\3\2\2\2\u02a2\u02a3\7!\2\2\u02a3\u02a4\5P)\2\u02a4\u02a5\7"+
		"\27\2\2\u02a5\u02a6\5R*\2\u02a6\u02a7\7\27\2\2\u02a7\u02a8\5T+\2\u02a8"+
		"\u02a9\7\"\2\2\u02a9\u02b5\3\2\2\2\u02aa\u02ab\5P)\2\u02ab\u02ac\7\27"+
		"\2\2\u02ac\u02ad\5R*\2\u02ad\u02ae\7\27\2\2\u02ae\u02af\5T+\2\u02af\u02b5"+
		"\3\2\2\2\u02b0\u02b5\5D#\2\u02b1\u02b2\7!\2\2\u02b2\u02b5\7\"\2\2\u02b3"+
		"\u02b5\3\2\2\2\u02b4\u02a2\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b4\u02b0\3\2"+
		"\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5O\3\2\2\2\u02b6\u02b9"+
		"\5\24\13\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2"+
		"\u02b9Q\3\2\2\2\u02ba\u02bd\5D#\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2"+
		"\2\2\u02bc\u02bb\3\2\2\2\u02bdS\3\2\2\2\u02be\u02c1\5V,\2\u02bf\u02c1"+
		"\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1U\3\2\2\2\u02c2"+
		"\u02cd\5$\23\2\u02c3\u02cd\5\"\22\2\u02c4\u02c5\5$\23\2\u02c5\u02c6\7"+
		"\34\2\2\u02c6\u02c7\5V,\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\5\"\22\2\u02c9"+
		"\u02ca\7\34\2\2\u02ca\u02cb\5V,\2\u02cb\u02cd\3\2\2\2\u02cc\u02c2\3\2"+
		"\2\2\u02cc\u02c3\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd"+
		"W\3\2\2\2\u02ce\u02d3\5\6\4\2\u02cf\u02d0\5\6\4\2\u02d0\u02d1\5X-\2\u02d1"+
		"\u02d3\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d3Y\3\2\2\2"+
		"\u02d4\u02de\5<\37\2\u02d5\u02d6\5<\37\2\u02d6\u02d7\5Z.\2\u02d7\u02de"+
		"\3\2\2\2\u02d8\u02de\5L\'\2\u02d9\u02da\5L\'\2\u02da\u02db\5Z.\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02de\5\\/\2\u02dd\u02d4\3\2\2\2\u02dd\u02d5\3\2"+
		"\2\2\u02dd\u02d8\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de"+
		"[\3\2\2\2\u02df\u02e0\7\t\2\2\u02e0\u02e1\5^\60\2\u02e1\u02e2\7\27\2\2"+
		"\u02e2]\3\2\2\2\u02e3\u02e7\5\u0088E\2\u02e4\u02e7\5$\23\2\u02e5\u02e7"+
		"\5\"\22\2\u02e6\u02e3\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2"+
		"\u02e7_\3\2\2\2\u02e8\u02e9\5d\63\2\u02e9\u02ea\7\37\2\2\u02ea\u02eb\7"+
		" \2\2\u02eb\u0307\3\2\2\2\u02ec\u02ed\5d\63\2\u02ed\u02ee\7\37\2\2\u02ee"+
		"\u02ef\5n8\2\u02ef\u02f0\7 \2\2\u02f0\u0307\3\2\2\2\u02f1\u02f2\5f\64"+
		"\2\u02f2\u02f3\7\37\2\2\u02f3\u02f4\7 \2\2\u02f4\u0307\3\2\2\2\u02f5\u02f6"+
		"\5f\64\2\u02f6\u02f7\7\37\2\2\u02f7\u02f8\5n8\2\u02f8\u02f9\7 \2\2\u02f9"+
		"\u0307\3\2\2\2\u02fa\u02fb\5j\66\2\u02fb\u02fc\7\37\2\2\u02fc\u02fd\7"+
		" \2\2\u02fd\u0307\3\2\2\2\u02fe\u02ff\5j\66\2\u02ff\u0300\7\37\2\2\u0300"+
		"\u0301\5n8\2\u0301\u0302\7 \2\2\u0302\u0307\3\2\2\2\u0303\u0304\5l\67"+
		"\2\u0304\u0305\7\27\2\2\u0305\u0307\3\2\2\2\u0306\u02e8\3\2\2\2\u0306"+
		"\u02ec\3\2\2\2\u0306\u02f1\3\2\2\2\u0306\u02f5\3\2\2\2\u0306\u02fa\3\2"+
		"\2\2\u0306\u02fe\3\2\2\2\u0306\u0303\3\2\2\2\u0307a\3\2\2\2\u0308\u0309"+
		"\7\n\2\2\u0309\u030a\7\'\2\2\u030a\u030b\7!\2\2\u030b\u0321\7\"\2\2\u030c"+
		"\u030d\7\n\2\2\u030d\u030e\7\'\2\2\u030e\u030f\7!\2\2\u030f\u0310\7\""+
		"\2\2\u0310\u0311\7\26\2\2\u0311\u0321\7\'\2\2\u0312\u0313\7\n\2\2\u0313"+
		"\u0314\7\'\2\2\u0314\u0315\7!\2\2\u0315\u0316\5p9\2\u0316\u0317\7\"\2"+
		"\2\u0317\u0321\3\2\2\2\u0318\u0319\7\n\2\2\u0319\u031a\7\'\2\2\u031a\u031b"+
		"\7!\2\2\u031b\u031c\5p9\2\u031c\u031d\7\"\2\2\u031d\u031e\7\26\2\2\u031e"+
		"\u031f\7\'\2\2\u031f\u0321\3\2\2\2\u0320\u0308\3\2\2\2\u0320\u030c\3\2"+
		"\2\2\u0320\u0312\3\2\2\2\u0320\u0318\3\2\2\2\u0321c\3\2\2\2\u0322\u0323"+
		"\5b\62\2\u0323e\3\2\2\2\u0324\u0325\5h\65\2\u0325\u0326\5b\62\2\u0326"+
		"\u033c\3\2\2\2\u0327\u0328\7\16\2\2\u0328\u033c\5b\62\2\u0329\u032a\5"+
		"h\65\2\u032a\u032b\7\16\2\2\u032b\u032c\5b\62\2\u032c\u033c\3\2\2\2\u032d"+
		"\u032e\7\17\2\2\u032e\u032f\5h\65\2\u032f\u0330\7\16\2\2\u0330\u0331\5"+
		"b\62\2\u0331\u033c\3\2\2\2\u0332\u0333\7\17\2\2\u0333\u0334\5h\65\2\u0334"+
		"\u0335\5b\62\2\u0335\u033c\3\2\2\2\u0336\u0337\7\17\2\2\u0337\u033c\5"+
		"b\62\2\u0338\u0339\7\17\2\2\u0339\u033a\7\16\2\2\u033a\u033c\5b\62\2\u033b"+
		"\u0324\3\2\2\2\u033b\u0327\3\2\2\2\u033b\u0329\3\2\2\2\u033b\u032d\3\2"+
		"\2\2\u033b\u0332\3\2\2\2\u033b\u0336\3\2\2\2\u033b\u0338\3\2\2\2\u033c"+
		"g\3\2\2\2\u033d\u033e\t\4\2\2\u033ei\3\2\2\2\u033f\u0340\7\'\2\2\u0340"+
		"\u0341\7!\2\2\u0341\u0348\7\"\2\2\u0342\u0343\7\'\2\2\u0343\u0344\7!\2"+
		"\2\u0344\u0345\5p9\2\u0345\u0346\7\"\2\2\u0346\u0348\3\2\2\2\u0347\u033f"+
		"\3\2\2\2\u0347\u0342\3\2\2\2\u0348k\3\2\2\2\u0349\u034c\5d\63\2\u034a"+
		"\u034c\5f\64\2\u034b\u0349\3\2\2\2\u034b\u034a\3\2\2\2\u034cm\3\2\2\2"+
		"\u034d\u0352\5\6\4\2\u034e\u034f\5\6\4\2\u034f\u0350\5n8\2\u0350\u0352"+
		"\3\2\2\2\u0351\u034d\3\2\2\2\u0351\u034e\3\2\2\2\u0352o\3\2\2\2\u0353"+
		"\u0359\5r:\2\u0354\u0355\5r:\2\u0355\u0356\7\34\2\2\u0356\u0357\5p9\2"+
		"\u0357\u0359\3\2\2\2\u0358\u0353\3\2\2\2\u0358\u0354\3\2\2\2\u0359q\3"+
		"\2\2\2\u035a\u035b\7\'\2\2\u035b\u035c\7)\2\2\u035cs\3\2\2\2\u035d\u0361"+
		"\5v<\2\u035e\u0361\5z>\2\u035f\u0361\5~@\2\u0360\u035d\3\2\2\2\u0360\u035e"+
		"\3\2\2\2\u0360\u035f\3\2\2\2\u0361u\3\2\2\2\u0362\u0363\5x=\2\u0363w\3"+
		"\2\2\2\u0364\u0365\7\20\2\2\u0365\u0366\7\'\2\2\u0366\u0367\7\37\2\2\u0367"+
		"\u037d\7 \2\2\u0368\u0369\7\20\2\2\u0369\u036a\7\'\2\2\u036a\u036b\7\37"+
		"\2\2\u036b\u036c\5n8\2\u036c\u036d\7 \2\2\u036d\u037d\3\2\2\2\u036e\u036f"+
		"\7\20\2\2\u036f\u0370\7\'\2\2\u0370\u0371\7\22\2\2\u0371\u0372\7\'\2\2"+
		"\u0372\u0373\7\37\2\2\u0373\u037d\7 \2\2\u0374\u0375\7\20\2\2\u0375\u0376"+
		"\7\'\2\2\u0376\u0377\7\22\2\2\u0377\u0378\7\'\2\2\u0378\u0379\7\37\2\2"+
		"\u0379\u037a\5n8\2\u037a\u037b\7 \2\2\u037b\u037d\3\2\2\2\u037c\u0364"+
		"\3\2\2\2\u037c\u0368\3\2\2\2\u037c\u036e\3\2\2\2\u037c\u0374\3\2\2\2\u037d"+
		"y\3\2\2\2\u037e\u037f\5|?\2\u037f{\3\2\2\2\u0380\u0381\7\21\2\2\u0381"+
		"\u0382\7\'\2\2\u0382\u0383\7\37\2\2\u0383\u0399\7 \2\2\u0384\u0385\7\21"+
		"\2\2\u0385\u0386\7\'\2\2\u0386\u0387\7\37\2\2\u0387\u0388\5n8\2\u0388"+
		"\u0389\7 \2\2\u0389\u0399\3\2\2\2\u038a\u038b\7\21\2\2\u038b\u038c\7\'"+
		"\2\2\u038c\u038d\7\22\2\2\u038d\u038e\7\'\2\2\u038e\u038f\7\37\2\2\u038f"+
		"\u0399\7 \2\2\u0390\u0391\7\21\2\2\u0391\u0392\7\'\2\2\u0392\u0393\7\22"+
		"\2\2\u0393\u0394\7\'\2\2\u0394\u0395\7\37\2\2\u0395\u0396\5n8\2\u0396"+
		"\u0397\7 \2\2\u0397\u0399\3\2\2\2\u0398\u0380\3\2\2\2\u0398\u0384\3\2"+
		"\2\2\u0398\u038a\3\2\2\2\u0398\u0390\3\2\2\2\u0399}\3\2\2\2\u039a\u039b"+
		"\5\u0080A\2\u039b\u039c\7\37\2\2\u039c\u039d\7 \2\2\u039d\u03a4\3\2\2"+
		"\2\u039e\u039f\5\u0080A\2\u039f\u03a0\7\37\2\2\u03a0\u03a1\5n8\2\u03a1"+
		"\u03a2\7 \2\2\u03a2\u03a4\3\2\2\2\u03a3\u039a\3\2\2\2\u03a3\u039e\3\2"+
		"\2\2\u03a4\177\3\2\2\2\u03a5\u03a9\5\u0082B\2\u03a6\u03a7\7\17\2\2\u03a7"+
		"\u03a9\5\u0082B\2\u03a8\u03a5\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u0081"+
		"\3\2\2\2\u03aa\u03ab\7\23\2\2\u03ab\u03bb\7\'\2\2\u03ac\u03ad\7\23\2\2"+
		"\u03ad\u03ae\7\'\2\2\u03ae\u03af\7\22\2\2\u03af\u03bb\7\'\2\2\u03b0\u03b1"+
		"\7\23\2\2\u03b1\u03b2\7\'\2\2\u03b2\u03b3\7\24\2\2\u03b3\u03bb\7\'\2\2"+
		"\u03b4\u03b5\7\23\2\2\u03b5\u03b6\7\'\2\2\u03b6\u03b7\7\22\2\2\u03b7\u03b8"+
		"\7\'\2\2\u03b8\u03b9\7\24\2\2\u03b9\u03bb\7\'\2\2\u03ba\u03aa\3\2\2\2"+
		"\u03ba\u03ac\3\2\2\2\u03ba\u03b0\3\2\2\2\u03ba\u03b4\3\2\2\2\u03bb\u0083"+
		"\3\2\2\2\u03bc\u03c8\7\'\2\2\u03bd\u03be\7\'\2\2\u03be\u03bf\7\31\2\2"+
		"\u03bf\u03c8\5\u0084C\2\u03c0\u03c1\7\'\2\2\u03c1\u03c8\5\u0086D\2\u03c2"+
		"\u03c3\7\'\2\2\u03c3\u03c4\5\u0086D\2\u03c4\u03c5\7\31\2\2\u03c5\u03c6"+
		"\5\u0084C\2\u03c6\u03c8\3\2\2\2\u03c7\u03bc\3\2\2\2\u03c7\u03bd\3\2\2"+
		"\2\u03c7\u03c0\3\2\2\2\u03c7\u03c2\3\2\2\2\u03c8\u0085\3\2\2\2\u03c9\u03ca"+
		"\7\35\2\2\u03ca\u03cb\7+\2\2\u03cb\u03d1\7\36\2\2\u03cc\u03cd\7\35\2\2"+
		"\u03cd\u03ce\7+\2\2\u03ce\u03cf\7\36\2\2\u03cf\u03d1\5\u0086D\2\u03d0"+
		"\u03c9\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d1\u0087\3\2\2\2\u03d2\u03ea\7\'"+
		"\2\2\u03d3\u03d4\7\'\2\2\u03d4\u03ea\7)\2\2\u03d5\u03ea\7+\2\2\u03d6\u03d7"+
		"\7+\2\2\u03d7\u03ea\7)\2\2\u03d8\u03ea\7,\2\2\u03d9\u03da\7,\2\2\u03da"+
		"\u03ea\7)\2\2\u03db\u03ea\7*\2\2\u03dc\u03ea\5\32\16\2\u03dd\u03ea\5\36"+
		"\20\2\u03de\u03ea\5\"\22\2\u03df\u03ea\5.\30\2\u03e0\u03e1\5\u008aF\2"+
		"\u03e1\u03e2\7\31\2\2\u03e2\u03e3\5\u008cG\2\u03e3\u03ea\3\2\2\2\u03e4"+
		"\u03e5\5\u008aF\2\u03e5\u03e6\7\33\2\2\u03e6\u03e7\5\u008cG\2\u03e7\u03ea"+
		"\3\2\2\2\u03e8\u03ea\5\u0084C\2\u03e9\u03d2\3\2\2\2\u03e9\u03d3\3\2\2"+
		"\2\u03e9\u03d5\3\2\2\2\u03e9\u03d6\3\2\2\2\u03e9\u03d8\3\2\2\2\u03e9\u03d9"+
		"\3\2\2\2\u03e9\u03db\3\2\2\2\u03e9\u03dc\3\2\2\2\u03e9\u03dd\3\2\2\2\u03e9"+
		"\u03de\3\2\2\2\u03e9\u03df\3\2\2\2\u03e9\u03e0\3\2\2\2\u03e9\u03e4\3\2"+
		"\2\2\u03e9\u03e8\3\2\2\2\u03ea\u0089\3\2\2\2\u03eb\u03ec\7\'\2\2\u03ec"+
		"\u008b\3\2\2\2\u03ed\u03ee\7\'\2\2\u03ee\u008d\3\2\2\2\65\u0096\u00a2"+
		"\u00af\u00e4\u00eb\u00fc\u010a\u0112\u0119\u0121\u012c\u0136\u0185\u01a1"+
		"\u01ad\u01b9\u01be\u01c8\u01dd\u01f2\u0200\u020b\u0217\u021d\u0228\u028b"+
		"\u02a0\u02b4\u02b8\u02bc\u02c0\u02cc\u02d2\u02dd\u02e6\u0306\u0320\u033b"+
		"\u0347\u034b\u0351\u0358\u0360\u037c\u0398\u03a3\u03a8\u03ba\u03c7\u03d0"+
		"\u03e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}