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
		Not=35, IncDecOperators=36, Identifier=37, IDPrefix=38, TypeSpec=39, UseAll=40, 
		UseUnique=41, String=42, Integer=43, Float=44, Whitespace=45, Newline=46, 
		Words=47, BlockComment=48, LineComment=49;
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
		RULE_arrayAccessElements = 65, RULE_accessBlockAr = 66, RULE_arrayIndexAccess = 67, 
		RULE_generalValue = 68, RULE_objIdentifierA = 69, RULE_objIdentifierB = 70;
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
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "UseAll", 
			"UseUnique", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
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
			setState(142);
			fileContent(0);
			setState(143);
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
			setState(150);
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
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					sentence();
					}
					} 
				}
				setState(152);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
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
			setState(164);
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
			setState(166);
			match(Use);
			setState(167);
			useValue();
			setState(168);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				useString();
				setState(172);
				match(Separator);
				setState(173);
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
		public TerminalNode UseAll() { return getToken(TParser.UseAll, 0); }
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
			setState(177);
			match(UseAll);
			}
		}
		catch (RecognitionException re) {
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
			setState(179);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Var);
				setState(182);
				variableMembers();
				setState(183);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				methodPerm();
				setState(186);
				match(Var);
				setState(187);
				variableMembers();
				setState(188);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(Static);
				setState(191);
				match(Var);
				setState(192);
				variableMembers();
				setState(193);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				methodPerm();
				setState(196);
				match(Static);
				setState(197);
				match(Var);
				setState(198);
				variableMembers();
				setState(199);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(Final);
				setState(202);
				methodPerm();
				setState(203);
				match(Static);
				setState(204);
				match(Var);
				setState(205);
				variableMembers();
				setState(206);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(Final);
				setState(209);
				methodPerm();
				setState(210);
				match(Var);
				setState(211);
				variableMembers();
				setState(212);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(Final);
				setState(215);
				match(Var);
				setState(216);
				variableMembers();
				setState(217);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				match(Final);
				setState(220);
				match(Static);
				setState(221);
				match(Var);
				setState(222);
				variableMembers();
				setState(223);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				variableMembers();
				setState(226);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				variableDefinition();
				setState(232);
				match(Separator);
				setState(233);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(Identifier);
				setState(238);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				objIdentifierA();
				setState(240);
				match(Point);
				setState(241);
				objIdentifierB();
				setState(242);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				objIdentifierA();
				setState(245);
				match(TwoTwoPoint);
				setState(246);
				objIdentifierB();
				setState(247);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				arrayAccessElements();
				setState(250);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(TypeSpec);
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
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				match(New);
				setState(261);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(TypeSpec);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				match(New);
				setState(265);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(OpenArIndex);
				setState(269);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(OpenArIndex);
				setState(271);
				indexArrayElements();
				setState(272);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				generalValue();
				setState(278);
				match(Separator);
				setState(279);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(OpenBlock);
				setState(284);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(OpenBlock);
				setState(286);
				associativeArrayElements();
				setState(287);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(Identifier);
				setState(292);
				match(TwoPoint);
				setState(293);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(Identifier);
				setState(295);
				match(TwoPoint);
				setState(296);
				generalValue();
				setState(297);
				match(Separator);
				setState(298);
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
			setState(302);
			match(OpenOp);
			setState(303);
			operationElements();
			setState(304);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				operationValue();
				setState(308);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(Identifier);
				setState(314);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(Identifier);
				setState(316);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(Identifier);
				setState(318);
				match(TypeSpec);
				setState(319);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				firstIncDec();
				setState(321);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				firstIncDec();
				setState(324);
				match(Identifier);
				setState(325);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				firstIncDec();
				setState(328);
				match(Identifier);
				setState(329);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(331);
				firstIncDec();
				setState(332);
				match(Identifier);
				setState(333);
				match(TypeSpec);
				setState(334);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(336);
				match(Identifier);
				setState(337);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(338);
				match(Identifier);
				setState(339);
				lastIncDec();
				setState(340);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(342);
				match(Identifier);
				setState(343);
				lastIncDec();
				setState(344);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(346);
				match(Identifier);
				setState(347);
				lastIncDec();
				setState(348);
				match(TypeSpec);
				setState(349);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(351);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(352);
				match(Integer);
				setState(353);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(354);
				match(Integer);
				setState(355);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(356);
				match(Integer);
				setState(357);
				match(TypeSpec);
				setState(358);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(359);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(360);
				match(Float);
				setState(361);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(362);
				match(Float);
				setState(363);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(364);
				match(Float);
				setState(365);
				match(TypeSpec);
				setState(366);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(367);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(368);
				functionCall();
				setState(369);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(371);
				functionCall();
				setState(372);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(374);
				functionCall();
				setState(375);
				match(TypeSpec);
				setState(376);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(378);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(379);
				operationBlock();
				setState(380);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(382);
				operationBlock();
				setState(383);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(385);
				operationBlock();
				setState(386);
				match(TypeSpec);
				setState(387);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(389);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(390);
				arrayAccessElements();
				setState(391);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(393);
				arrayAccessElements();
				setState(394);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(396);
				arrayAccessElements();
				setState(397);
				match(TypeSpec);
				setState(398);
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
			setState(402);
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
			setState(404);
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
			setState(406);
			functionCall();
			setState(407);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(Identifier);
				setState(410);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(Identifier);
				setState(412);
				match(Point);
				setState(413);
				identifierB();
				setState(414);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(Identifier);
				setState(417);
				match(TwoTwoPoint);
				setState(418);
				identifierB();
				setState(419);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(Identifier);
				setState(422);
				match(Point);
				setState(423);
				identifierB();
				setState(424);
				functionCallParam();
				setState(425);
				pointSeparator();
				setState(426);
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
			setState(430);
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
			setState(432);
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
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(OpenOp);
				setState(435);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(OpenOp);
				setState(437);
				functionCallParamElements();
				setState(438);
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
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				generalValue();
				setState(444);
				match(Separator);
				setState(445);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				operationElements();
				setState(449);
				match(Separator);
				setState(450);
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
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
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
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				conditionalExpression();
				setState(461);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				sentence();
				setState(465);
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(If);
				setState(470);
				conditionalExpressionElements();
				setState(471);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(If);
				setState(474);
				conditionalExpressionElements();
				setState(475);
				match(OpenBlock);
				setState(476);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(If);
				setState(479);
				conditionalExpressionElements();
				setState(480);
				match(OpenBlock);
				setState(481);
				conditionalBlockElements();
				setState(482);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(If);
				setState(485);
				conditionalExpressionElements();
				setState(486);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(Elif);
				setState(491);
				conditionalExpressionElements();
				setState(492);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(Elif);
				setState(495);
				conditionalExpressionElements();
				setState(496);
				match(OpenBlock);
				setState(497);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(Elif);
				setState(500);
				conditionalExpressionElements();
				setState(501);
				match(OpenBlock);
				setState(502);
				conditionalBlockElements();
				setState(503);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(Elif);
				setState(506);
				conditionalExpressionElements();
				setState(507);
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
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(Else);
				setState(512);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(Else);
				setState(514);
				match(OpenBlock);
				setState(515);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(Else);
				setState(517);
				match(OpenBlock);
				setState(518);
				conditionalBlockElements();
				setState(519);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(Else);
				setState(522);
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
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				ifConditions();
				setState(527);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				loop();
				setState(531);
				condBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
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
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				conditionalExpElementsValue();
				setState(538);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				conditionExpBlock(0);
				setState(542);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				match(Not);
				setState(545);
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
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				conditionalExpValue();
				setState(550);
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
			setState(555);
			match(OpenOp);
			setState(556);
			conditionalExpressionElements();
			setState(557);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(563);
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
					setState(559);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(560);
					match(AssignmentOperator);
					}
					} 
				}
				setState(565);
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
		enterRule(_localctx, 72, RULE_conditionalExpValue);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(Identifier);
				setState(568);
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
				setState(569);
				match(Identifier);
				setState(570);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				match(Identifier);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				firstIncDec();
				setState(575);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				firstIncDec();
				setState(578);
				match(Identifier);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				firstIncDec();
				setState(582);
				match(Identifier);
				setState(583);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(585);
				firstIncDec();
				setState(586);
				match(Identifier);
				setState(587);
				match(TypeSpec);
				setState(588);
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
				setState(590);
				match(Identifier);
				setState(591);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(592);
				match(Identifier);
				setState(593);
				lastIncDec();
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(596);
				match(Identifier);
				setState(597);
				lastIncDec();
				setState(598);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(600);
				match(Identifier);
				setState(601);
				lastIncDec();
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(605);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(606);
				match(Integer);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(608);
				match(Integer);
				setState(609);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(610);
				match(Integer);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(613);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(614);
				match(Float);
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(616);
				match(Float);
				setState(617);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(618);
				match(Float);
				setState(619);
				match(TypeSpec);
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(621);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(622);
				functionCall();
				setState(623);
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
				setState(625);
				functionCall();
				setState(626);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(628);
				functionCall();
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(632);
				match(Identifier);
				setState(633);
				match(Attr);
				setState(634);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(635);
				match(Identifier);
				setState(636);
				match(Attr);
				setState(637);
				functionCall();
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
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(640);
				match(Identifier);
				setState(641);
				match(Attr);
				setState(642);
				functionCall();
				setState(643);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(645);
				match(Identifier);
				setState(646);
				match(Attr);
				setState(647);
				functionCall();
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
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(651);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(652);
				operationBlock();
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(655);
				operationBlock();
				setState(656);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(658);
				operationBlock();
				setState(659);
				match(TypeSpec);
				setState(660);
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
				setState(662);
				arrayAccessElements();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(663);
				arrayAccessElements();
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
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(666);
				arrayAccessElements();
				setState(667);
				match(TypeSpec);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(669);
				arrayAccessElements();
				setState(670);
				match(TypeSpec);
				setState(671);
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
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(For);
				setState(676);
				loopExpression();
				setState(677);
				match(OpenBlock);
				setState(678);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(For);
				setState(681);
				loopExpression();
				setState(682);
				match(OpenBlock);
				setState(683);
				loopBlockElements();
				setState(684);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				match(For);
				setState(687);
				loopExpression();
				setState(688);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				match(For);
				setState(691);
				loopExpression();
				setState(692);
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
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(OpenOp);
				setState(697);
				loopOneMembers();
				setState(698);
				match(End);
				setState(699);
				loopTwoMembers();
				setState(700);
				match(End);
				setState(701);
				loopThreeMembers();
				setState(702);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				loopOneMembers();
				setState(705);
				match(End);
				setState(706);
				loopTwoMembers();
				setState(707);
				match(End);
				setState(708);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				match(OpenOp);
				setState(712);
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
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
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
			setState(722);
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
				setState(720);
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
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
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
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				operationElements();
				setState(731);
				match(Separator);
				setState(732);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				operationBlock();
				setState(735);
				match(Separator);
				setState(736);
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
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				sentence();
				setState(742);
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
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				ifConditions();
				setState(748);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				loop();
				setState(752);
				loopBlockElementsLimited();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
		enterRule(_localctx, 90, RULE_ret);
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
		enterRule(_localctx, 92, RULE_retValues);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
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
		enterRule(_localctx, 94, RULE_functions);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
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
		enterRule(_localctx, 96, RULE_functionGeneralModes);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
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
		enterRule(_localctx, 98, RULE_functionsModes);
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
		enterRule(_localctx, 100, RULE_functionMethodsModes);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
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
		enterRule(_localctx, 102, RULE_methodPerm);
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
		enterRule(_localctx, 104, RULE_constructClassMethod);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
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
		enterRule(_localctx, 106, RULE_interfaceMethod);
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
		enterRule(_localctx, 108, RULE_functionCodeBlock);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
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
		enterRule(_localctx, 110, RULE_functionParams);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
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
		enterRule(_localctx, 112, RULE_functionParamElements);
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
		enterRule(_localctx, 114, RULE_oopGeneral);
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
		enterRule(_localctx, 116, RULE_interfaceClass);
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
		enterRule(_localctx, 118, RULE_interfaceClassDefinition);
		try {
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
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
		enterRule(_localctx, 120, RULE_abstractClass);
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
		enterRule(_localctx, 122, RULE_abstractClassDefinition);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
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
		enterRule(_localctx, 124, RULE_classDefination);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
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
		enterRule(_localctx, 126, RULE_classModesGeneral);
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
		enterRule(_localctx, 128, RULE_classModes);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
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
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
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
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(Identifier);
				setState(980);
				match(Point);
				setState(981);
				arrayAccessElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(982);
				match(Identifier);
				setState(983);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(984);
				match(Identifier);
				setState(985);
				accessBlockAr();
				setState(986);
				match(Point);
				setState(987);
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
		enterRule(_localctx, 132, RULE_accessBlockAr);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(OpenArIndex);
				setState(992);
				arrayIndexAccess();
				setState(993);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(OpenArIndex);
				setState(996);
				arrayIndexAccess();
				setState(997);
				match(CloseArIndex);
				setState(998);
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
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
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
		enterRule(_localctx, 134, RULE_arrayIndexAccess);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==Integer) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
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
		enterRule(_localctx, 136, RULE_generalValue);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				match(Identifier);
				setState(1008);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(Integer);
				setState(1011);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1013);
				match(Float);
				setState(1014);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1015);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1016);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1017);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1018);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1019);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1020);
				objIdentifierA();
				setState(1021);
				match(Point);
				setState(1022);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1024);
				objIdentifierA();
				setState(1025);
				match(TwoTwoPoint);
				setState(1026);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1028);
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
		enterRule(_localctx, 138, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
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
		enterRule(_localctx, 140, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u040e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00a5\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00e7\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00ee\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ff"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010d\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0115\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u011c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0124\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012f\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0139\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0193\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01af"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01bb\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c7\n\34\3\35"+
		"\3\35\3\35\5\35\u01cc\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01d6\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01eb\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0200\n \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\5!\u020e\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0219\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0225\n#\3$\3$\3$\3$\5$\u022b"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\7%\u0234\n%\f%\16%\u0237\13%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02a4\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02b9\n\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02cd\n(\3)\3)\5)\u02d1"+
		"\n)\3*\3*\5*\u02d5\n*\3+\3+\5+\u02d9\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u02e5\n,\3-\3-\3-\3-\5-\u02eb\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02f6"+
		"\n.\3/\3/\3/\3/\3\60\3\60\3\60\5\60\u02ff\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u031f\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0339\n\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0354\n\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0360\n\66\3\67\3\67"+
		"\5\67\u0364\n\67\38\38\38\38\58\u036a\n8\39\39\39\39\39\59\u0371\n9\3"+
		":\3:\3:\3;\3;\3;\5;\u0379\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0395\n=\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03b1\n"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03bc\n@\3A\3A\3A\5A\u03c1\nA\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03d3\nB\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\5C\u03e0\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03eb\nD\3"+
		"E\3E\5E\u03ef\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\5F\u0408\nF\3G\3G\3H\3H\3H\2\4\4HI\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\2\6\4\2\30"+
		"\30$$\3\2#$\3\2\13\r\4\2\'\'--\2\u048b\2\u0090\3\2\2\2\4\u0093\3\2\2\2"+
		"\6\u00a4\3\2\2\2\b\u00a6\3\2\2\2\n\u00a8\3\2\2\2\f\u00b1\3\2\2\2\16\u00b3"+
		"\3\2\2\2\20\u00b5\3\2\2\2\22\u00e6\3\2\2\2\24\u00ed\3\2\2\2\26\u00fe\3"+
		"\2\2\2\30\u010c\3\2\2\2\32\u0114\3\2\2\2\34\u011b\3\2\2\2\36\u0123\3\2"+
		"\2\2 \u012e\3\2\2\2\"\u0130\3\2\2\2$\u0138\3\2\2\2&\u0192\3\2\2\2(\u0194"+
		"\3\2\2\2*\u0196\3\2\2\2,\u0198\3\2\2\2.\u01ae\3\2\2\2\60\u01b0\3\2\2\2"+
		"\62\u01b2\3\2\2\2\64\u01ba\3\2\2\2\66\u01c6\3\2\2\28\u01cb\3\2\2\2:\u01d5"+
		"\3\2\2\2<\u01ea\3\2\2\2>\u01ff\3\2\2\2@\u020d\3\2\2\2B\u0218\3\2\2\2D"+
		"\u0224\3\2\2\2F\u022a\3\2\2\2H\u022c\3\2\2\2J\u02a3\3\2\2\2L\u02b8\3\2"+
		"\2\2N\u02cc\3\2\2\2P\u02d0\3\2\2\2R\u02d4\3\2\2\2T\u02d8\3\2\2\2V\u02e4"+
		"\3\2\2\2X\u02ea\3\2\2\2Z\u02f5\3\2\2\2\\\u02f7\3\2\2\2^\u02fe\3\2\2\2"+
		"`\u031e\3\2\2\2b\u0338\3\2\2\2d\u033a\3\2\2\2f\u0353\3\2\2\2h\u0355\3"+
		"\2\2\2j\u035f\3\2\2\2l\u0363\3\2\2\2n\u0369\3\2\2\2p\u0370\3\2\2\2r\u0372"+
		"\3\2\2\2t\u0378\3\2\2\2v\u037a\3\2\2\2x\u0394\3\2\2\2z\u0396\3\2\2\2|"+
		"\u03b0\3\2\2\2~\u03bb\3\2\2\2\u0080\u03c0\3\2\2\2\u0082\u03d2\3\2\2\2"+
		"\u0084\u03df\3\2\2\2\u0086\u03ea\3\2\2\2\u0088\u03ee\3\2\2\2\u008a\u0407"+
		"\3\2\2\2\u008c\u0409\3\2\2\2\u008e\u040b\3\2\2\2\u0090\u0091\5\4\3\2\u0091"+
		"\u0092\7\2\2\3\u0092\3\3\2\2\2\u0093\u0098\b\3\1\2\u0094\u0095\f\4\2\2"+
		"\u0095\u0097\5\6\4\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\5\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u00a5\5\b\5\2\u009c\u00a5\5\n\6\2\u009d\u00a5\5\20\t\2\u009e\u00a5\5"+
		",\27\2\u009f\u00a5\58\35\2\u00a0\u00a5\5L\'\2\u00a1\u00a5\5`\61\2\u00a2"+
		"\u00a5\5\\/\2\u00a3\u00a5\5t;\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2\2"+
		"\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\7\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\7\3\2\2\u00a9"+
		"\u00aa\5\f\7\2\u00aa\u00ab\7\27\2\2\u00ab\13\3\2\2\2\u00ac\u00b2\5\16"+
		"\b\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5\f\7\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\r\3\2\2\2"+
		"\u00b3\u00b4\7*\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\5\22\n\2\u00b6\21\3\2"+
		"\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\27\2\2\u00ba"+
		"\u00e7\3\2\2\2\u00bb\u00bc\5h\65\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\24"+
		"\13\2\u00be\u00bf\7\27\2\2\u00bf\u00e7\3\2\2\2\u00c0\u00c1\7\16\2\2\u00c1"+
		"\u00c2\7\4\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7\27\2\2\u00c4\u00e7"+
		"\3\2\2\2\u00c5\u00c6\5h\65\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\7\4\2\2"+
		"\u00c8\u00c9\5\24\13\2\u00c9\u00ca\7\27\2\2\u00ca\u00e7\3\2\2\2\u00cb"+
		"\u00cc\7\17\2\2\u00cc\u00cd\5h\65\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\7"+
		"\4\2\2\u00cf\u00d0\5\24\13\2\u00d0\u00d1\7\27\2\2\u00d1\u00e7\3\2\2\2"+
		"\u00d2\u00d3\7\17\2\2\u00d3\u00d4\5h\65\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6"+
		"\5\24\13\2\u00d6\u00d7\7\27\2\2\u00d7\u00e7\3\2\2\2\u00d8\u00d9\7\17\2"+
		"\2\u00d9\u00da\7\4\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\7\27\2\2\u00dc"+
		"\u00e7\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\u00df\7\16\2\2\u00df\u00e0\7"+
		"\4\2\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7\27\2\2\u00e2\u00e7\3\2\2\2"+
		"\u00e3\u00e4\5\24\13\2\u00e4\u00e5\7\27\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00b7\3\2\2\2\u00e6\u00bb\3\2\2\2\u00e6\u00c0\3\2\2\2\u00e6\u00c5\3\2"+
		"\2\2\u00e6\u00cb\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00ee\5\26\f"+
		"\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\7\34\2\2\u00eb\u00ec\5\24\13\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\25\3\2\2"+
		"\2\u00ef\u00f0\7\'\2\2\u00f0\u00ff\5\30\r\2\u00f1\u00f2\5\u008cG\2\u00f2"+
		"\u00f3\7\31\2\2\u00f3\u00f4\5\u008eH\2\u00f4\u00f5\5\30\r\2\u00f5\u00ff"+
		"\3\2\2\2\u00f6\u00f7\5\u008cG\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5\u008e"+
		"H\2\u00f9\u00fa\5\30\r\2\u00fa\u00ff\3\2\2\2\u00fb\u00fc\5\u0084C\2\u00fc"+
		"\u00fd\5\30\r\2\u00fd\u00ff\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f1\3"+
		"\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\27\3\2\2\2\u0100"+
		"\u0101\t\2\2\2\u0101\u010d\5\u008aF\2\u0102\u0103\7)\2\2\u0103\u0104\t"+
		"\2\2\2\u0104\u010d\5\u008aF\2\u0105\u0106\t\2\2\2\u0106\u0107\7\25\2\2"+
		"\u0107\u010d\5\u008aF\2\u0108\u0109\7)\2\2\u0109\u010a\t\2\2\2\u010a\u010b"+
		"\7\25\2\2\u010b\u010d\5\u008aF\2\u010c\u0100\3\2\2\2\u010c\u0102\3\2\2"+
		"\2\u010c\u0105\3\2\2\2\u010c\u0108\3\2\2\2\u010d\31\3\2\2\2\u010e\u010f"+
		"\7\35\2\2\u010f\u0115\7\36\2\2\u0110\u0111\7\35\2\2\u0111\u0112\5\34\17"+
		"\2\u0112\u0113\7\36\2\2\u0113\u0115\3\2\2\2\u0114\u010e\3\2\2\2\u0114"+
		"\u0110\3\2\2\2\u0115\33\3\2\2\2\u0116\u011c\5\u008aF\2\u0117\u0118\5\u008a"+
		"F\2\u0118\u0119\7\34\2\2\u0119\u011a\5\34\17\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011c\35\3\2\2\2\u011d\u011e\7\37\2"+
		"\2\u011e\u0124\7 \2\2\u011f\u0120\7\37\2\2\u0120\u0121\5 \21\2\u0121\u0122"+
		"\7 \2\2\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0124"+
		"\37\3\2\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7\32\2\2\u0127\u012f\5\u008a"+
		"F\2\u0128\u0129\7\'\2\2\u0129\u012a\7\32\2\2\u012a\u012b\5\u008aF\2\u012b"+
		"\u012c\7\34\2\2\u012c\u012d\5 \21\2\u012d\u012f\3\2\2\2\u012e\u0125\3"+
		"\2\2\2\u012e\u0128\3\2\2\2\u012f!\3\2\2\2\u0130\u0131\7!\2\2\u0131\u0132"+
		"\5$\23\2\u0132\u0133\7\"\2\2\u0133#\3\2\2\2\u0134\u0139\5&\24\2\u0135"+
		"\u0136\5&\24\2\u0136\u0137\5$\23\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0138\u0135\3\2\2\2\u0139%\3\2\2\2\u013a\u0193\7\'\2\2\u013b\u013c"+
		"\7\'\2\2\u013c\u0193\7#\2\2\u013d\u013e\7\'\2\2\u013e\u0193\7)\2\2\u013f"+
		"\u0140\7\'\2\2\u0140\u0141\7)\2\2\u0141\u0193\7#\2\2\u0142\u0143\5(\25"+
		"\2\u0143\u0144\7\'\2\2\u0144\u0193\3\2\2\2\u0145\u0146\5(\25\2\u0146\u0147"+
		"\7\'\2\2\u0147\u0148\7#\2\2\u0148\u0193\3\2\2\2\u0149\u014a\5(\25\2\u014a"+
		"\u014b\7\'\2\2\u014b\u014c\7)\2\2\u014c\u0193\3\2\2\2\u014d\u014e\5(\25"+
		"\2\u014e\u014f\7\'\2\2\u014f\u0150\7)\2\2\u0150\u0151\7#\2\2\u0151\u0193"+
		"\3\2\2\2\u0152\u0153\7\'\2\2\u0153\u0193\5*\26\2\u0154\u0155\7\'\2\2\u0155"+
		"\u0156\5*\26\2\u0156\u0157\7#\2\2\u0157\u0193\3\2\2\2\u0158\u0159\7\'"+
		"\2\2\u0159\u015a\5*\26\2\u015a\u015b\7)\2\2\u015b\u0193\3\2\2\2\u015c"+
		"\u015d\7\'\2\2\u015d\u015e\5*\26\2\u015e\u015f\7)\2\2\u015f\u0160\7#\2"+
		"\2\u0160\u0193\3\2\2\2\u0161\u0193\7-\2\2\u0162\u0163\7-\2\2\u0163\u0193"+
		"\7#\2\2\u0164\u0165\7-\2\2\u0165\u0193\7)\2\2\u0166\u0167\7-\2\2\u0167"+
		"\u0168\7)\2\2\u0168\u0193\7#\2\2\u0169\u0193\7.\2\2\u016a\u016b\7.\2\2"+
		"\u016b\u0193\7#\2\2\u016c\u016d\7.\2\2\u016d\u0193\7)\2\2\u016e\u016f"+
		"\7.\2\2\u016f\u0170\7)\2\2\u0170\u0193\7#\2\2\u0171\u0193\5.\30\2\u0172"+
		"\u0173\5.\30\2\u0173\u0174\7#\2\2\u0174\u0193\3\2\2\2\u0175\u0176\5.\30"+
		"\2\u0176\u0177\7)\2\2\u0177\u0193\3\2\2\2\u0178\u0179\5.\30\2\u0179\u017a"+
		"\7)\2\2\u017a\u017b\7#\2\2\u017b\u0193\3\2\2\2\u017c\u0193\5\"\22\2\u017d"+
		"\u017e\5\"\22\2\u017e\u017f\7#\2\2\u017f\u0193\3\2\2\2\u0180\u0181\5\""+
		"\22\2\u0181\u0182\7)\2\2\u0182\u0193\3\2\2\2\u0183\u0184\5\"\22\2\u0184"+
		"\u0185\7)\2\2\u0185\u0186\7#\2\2\u0186\u0193\3\2\2\2\u0187\u0193\5\u0084"+
		"C\2\u0188\u0189\5\u0084C\2\u0189\u018a\7#\2\2\u018a\u0193\3\2\2\2\u018b"+
		"\u018c\5\u0084C\2\u018c\u018d\7)\2\2\u018d\u0193\3\2\2\2\u018e\u018f\5"+
		"\u0084C\2\u018f\u0190\7)\2\2\u0190\u0191\7#\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u013a\3\2\2\2\u0192\u013b\3\2\2\2\u0192\u013d\3\2\2\2\u0192\u013f\3\2"+
		"\2\2\u0192\u0142\3\2\2\2\u0192\u0145\3\2\2\2\u0192\u0149\3\2\2\2\u0192"+
		"\u014d\3\2\2\2\u0192\u0152\3\2\2\2\u0192\u0154\3\2\2\2\u0192\u0158\3\2"+
		"\2\2\u0192\u015c\3\2\2\2\u0192\u0161\3\2\2\2\u0192\u0162\3\2\2\2\u0192"+
		"\u0164\3\2\2\2\u0192\u0166\3\2\2\2\u0192\u0169\3\2\2\2\u0192\u016a\3\2"+
		"\2\2\u0192\u016c\3\2\2\2\u0192\u016e\3\2\2\2\u0192\u0171\3\2\2\2\u0192"+
		"\u0172\3\2\2\2\u0192\u0175\3\2\2\2\u0192\u0178\3\2\2\2\u0192\u017c\3\2"+
		"\2\2\u0192\u017d\3\2\2\2\u0192\u0180\3\2\2\2\u0192\u0183\3\2\2\2\u0192"+
		"\u0187\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u018b\3\2\2\2\u0192\u018e\3\2"+
		"\2\2\u0193\'\3\2\2\2\u0194\u0195\7&\2\2\u0195)\3\2\2\2\u0196\u0197\7&"+
		"\2\2\u0197+\3\2\2\2\u0198\u0199\5.\30\2\u0199\u019a\7\27\2\2\u019a-\3"+
		"\2\2\2\u019b\u019c\7\'\2\2\u019c\u01af\5\64\33\2\u019d\u019e\7\'\2\2\u019e"+
		"\u019f\7\31\2\2\u019f\u01a0\5\60\31\2\u01a0\u01a1\5\64\33\2\u01a1\u01af"+
		"\3\2\2\2\u01a2\u01a3\7\'\2\2\u01a3\u01a4\7\33\2\2\u01a4\u01a5\5\60\31"+
		"\2\u01a5\u01a6\5\64\33\2\u01a6\u01af\3\2\2\2\u01a7\u01a8\7\'\2\2\u01a8"+
		"\u01a9\7\31\2\2\u01a9\u01aa\5\60\31\2\u01aa\u01ab\5\64\33\2\u01ab\u01ac"+
		"\5\62\32\2\u01ac\u01ad\5.\30\2\u01ad\u01af\3\2\2\2\u01ae\u019b\3\2\2\2"+
		"\u01ae\u019d\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a7\3\2\2\2\u01af/\3"+
		"\2\2\2\u01b0\u01b1\7\'\2\2\u01b1\61\3\2\2\2\u01b2\u01b3\7\31\2\2\u01b3"+
		"\63\3\2\2\2\u01b4\u01b5\7!\2\2\u01b5\u01bb\7\"\2\2\u01b6\u01b7\7!\2\2"+
		"\u01b7\u01b8\5\66\34\2\u01b8\u01b9\7\"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b4"+
		"\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb\65\3\2\2\2\u01bc\u01c7\5\u008aF\2\u01bd"+
		"\u01be\5\u008aF\2\u01be\u01bf\7\34\2\2\u01bf\u01c0\5\66\34\2\u01c0\u01c7"+
		"\3\2\2\2\u01c1\u01c7\5$\23\2\u01c2\u01c3\5$\23\2\u01c3\u01c4\7\34\2\2"+
		"\u01c4\u01c5\5\66\34\2\u01c5\u01c7\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c6\u01bd"+
		"\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\67\3\2\2\2\u01c8"+
		"\u01cc\5<\37\2\u01c9\u01cc\5> \2\u01ca\u01cc\5@!\2\u01cb\u01c8\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc9\3\2\2\2\u01cd\u01d6\5"+
		"8\35\2\u01ce\u01cf\58\35\2\u01cf\u01d0\5:\36\2\u01d0\u01d6\3\2\2\2\u01d1"+
		"\u01d6\5\6\4\2\u01d2\u01d3\5\6\4\2\u01d3\u01d4\5:\36\2\u01d4\u01d6\3\2"+
		"\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01ce\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5"+
		"\u01d2\3\2\2\2\u01d6;\3\2\2\2\u01d7\u01d8\7\5\2\2\u01d8\u01d9\5D#\2\u01d9"+
		"\u01da\5,\27\2\u01da\u01eb\3\2\2\2\u01db\u01dc\7\5\2\2\u01dc\u01dd\5D"+
		"#\2\u01dd\u01de\7\37\2\2\u01de\u01df\7 \2\2\u01df\u01eb\3\2\2\2\u01e0"+
		"\u01e1\7\5\2\2\u01e1\u01e2\5D#\2\u01e2\u01e3\7\37\2\2\u01e3\u01e4\5:\36"+
		"\2\u01e4\u01e5\7 \2\2\u01e5\u01eb\3\2\2\2\u01e6\u01e7\7\5\2\2\u01e7\u01e8"+
		"\5D#\2\u01e8\u01e9\5B\"\2\u01e9\u01eb\3\2\2\2\u01ea\u01d7\3\2\2\2\u01ea"+
		"\u01db\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb=\3\2\2\2"+
		"\u01ec\u01ed\7\6\2\2\u01ed\u01ee\5D#\2\u01ee\u01ef\5,\27\2\u01ef\u0200"+
		"\3\2\2\2\u01f0\u01f1\7\6\2\2\u01f1\u01f2\5D#\2\u01f2\u01f3\7\37\2\2\u01f3"+
		"\u01f4\7 \2\2\u01f4\u0200\3\2\2\2\u01f5\u01f6\7\6\2\2\u01f6\u01f7\5D#"+
		"\2\u01f7\u01f8\7\37\2\2\u01f8\u01f9\5:\36\2\u01f9\u01fa\7 \2\2\u01fa\u0200"+
		"\3\2\2\2\u01fb\u01fc\7\6\2\2\u01fc\u01fd\5D#\2\u01fd\u01fe\5B\"\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01ec\3\2\2\2\u01ff\u01f0\3\2\2\2\u01ff\u01f5\3\2"+
		"\2\2\u01ff\u01fb\3\2\2\2\u0200?\3\2\2\2\u0201\u0202\7\7\2\2\u0202\u020e"+
		"\5,\27\2\u0203\u0204\7\7\2\2\u0204\u0205\7\37\2\2\u0205\u020e\7 \2\2\u0206"+
		"\u0207\7\7\2\2\u0207\u0208\7\37\2\2\u0208\u0209\5:\36\2\u0209\u020a\7"+
		" \2\2\u020a\u020e\3\2\2\2\u020b\u020c\7\7\2\2\u020c\u020e\5B\"\2\u020d"+
		"\u0201\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0206\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020eA\3\2\2\2\u020f\u0219\5<\37\2\u0210\u0211\5<\37\2\u0211\u0212"+
		"\5:\36\2\u0212\u0219\3\2\2\2\u0213\u0219\5L\'\2\u0214\u0215\5L\'\2\u0215"+
		"\u0216\5B\"\2\u0216\u0219\3\2\2\2\u0217\u0219\5\\/\2\u0218\u020f\3\2\2"+
		"\2\u0218\u0210\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0217"+
		"\3\2\2\2\u0219C\3\2\2\2\u021a\u0225\5F$\2\u021b\u021c\5F$\2\u021c\u021d"+
		"\5D#\2\u021d\u0225\3\2\2\2\u021e\u0225\5H%\2\u021f\u0220\5H%\2\u0220\u0221"+
		"\5D#\2\u0221\u0225\3\2\2\2\u0222\u0223\7%\2\2\u0223\u0225\5D#\2\u0224"+
		"\u021a\3\2\2\2\u0224\u021b\3\2\2\2\u0224\u021e\3\2\2\2\u0224\u021f\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0225E\3\2\2\2\u0226\u022b\5J&\2\u0227\u0228"+
		"\5J&\2\u0228\u0229\5F$\2\u0229\u022b\3\2\2\2\u022a\u0226\3\2\2\2\u022a"+
		"\u0227\3\2\2\2\u022bG\3\2\2\2\u022c\u022d\b%\1\2\u022d\u022e\7!\2\2\u022e"+
		"\u022f\5D#\2\u022f\u0230\7\"\2\2\u0230\u0235\3\2\2\2\u0231\u0232\f\3\2"+
		"\2\u0232\u0234\7$\2\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236I\3\2\2\2\u0237\u0235\3\2\2\2\u0238"+
		"\u02a4\7\'\2\2\u0239\u023a\7\'\2\2\u023a\u02a4\t\3\2\2\u023b\u023c\7\'"+
		"\2\2\u023c\u02a4\7)\2\2\u023d\u023e\7\'\2\2\u023e\u023f\7)\2\2\u023f\u02a4"+
		"\t\3\2\2\u0240\u0241\5(\25\2\u0241\u0242\7\'\2\2\u0242\u02a4\3\2\2\2\u0243"+
		"\u0244\5(\25\2\u0244\u0245\7\'\2\2\u0245\u0246\t\3\2\2\u0246\u02a4\3\2"+
		"\2\2\u0247\u0248\5(\25\2\u0248\u0249\7\'\2\2\u0249\u024a\7)\2\2\u024a"+
		"\u02a4\3\2\2\2\u024b\u024c\5(\25\2\u024c\u024d\7\'\2\2\u024d\u024e\7)"+
		"\2\2\u024e\u024f\t\3\2\2\u024f\u02a4\3\2\2\2\u0250\u0251\7\'\2\2\u0251"+
		"\u02a4\5*\26\2\u0252\u0253\7\'\2\2\u0253\u0254\5*\26\2\u0254\u0255\t\3"+
		"\2\2\u0255\u02a4\3\2\2\2\u0256\u0257\7\'\2\2\u0257\u0258\5*\26\2\u0258"+
		"\u0259\7)\2\2\u0259\u02a4\3\2\2\2\u025a\u025b\7\'\2\2\u025b\u025c\5*\26"+
		"\2\u025c\u025d\7)\2\2\u025d\u025e\t\3\2\2\u025e\u02a4\3\2\2\2\u025f\u02a4"+
		"\7-\2\2\u0260\u0261\7-\2\2\u0261\u02a4\t\3\2\2\u0262\u0263\7-\2\2\u0263"+
		"\u02a4\7)\2\2\u0264\u0265\7-\2\2\u0265\u0266\7)\2\2\u0266\u02a4\t\3\2"+
		"\2\u0267\u02a4\7.\2\2\u0268\u0269\7.\2\2\u0269\u02a4\t\3\2\2\u026a\u026b"+
		"\7.\2\2\u026b\u02a4\7)\2\2\u026c\u026d\7.\2\2\u026d\u026e\7)\2\2\u026e"+
		"\u02a4\t\3\2\2\u026f\u02a4\5.\30\2\u0270\u0271\5.\30\2\u0271\u0272\t\3"+
		"\2\2\u0272\u02a4\3\2\2\2\u0273\u0274\5.\30\2\u0274\u0275\7)\2\2\u0275"+
		"\u02a4\3\2\2\2\u0276\u0277\5.\30\2\u0277\u0278\7)\2\2\u0278\u0279\t\3"+
		"\2\2\u0279\u02a4\3\2\2\2\u027a\u027b\7\'\2\2\u027b\u027c\7\30\2\2\u027c"+
		"\u02a4\5.\30\2\u027d\u027e\7\'\2\2\u027e\u027f\7\30\2\2\u027f\u0280\5"+
		".\30\2\u0280\u0281\t\3\2\2\u0281\u02a4\3\2\2\2\u0282\u0283\7\'\2\2\u0283"+
		"\u0284\7\30\2\2\u0284\u0285\5.\30\2\u0285\u0286\7)\2\2\u0286\u02a4\3\2"+
		"\2\2\u0287\u0288\7\'\2\2\u0288\u0289\7\30\2\2\u0289\u028a\5.\30\2\u028a"+
		"\u028b\7)\2\2\u028b\u028c\t\3\2\2\u028c\u02a4\3\2\2\2\u028d\u02a4\5\""+
		"\22\2\u028e\u028f\5\"\22\2\u028f\u0290\t\3\2\2\u0290\u02a4\3\2\2\2\u0291"+
		"\u0292\5\"\22\2\u0292\u0293\7)\2\2\u0293\u02a4\3\2\2\2\u0294\u0295\5\""+
		"\22\2\u0295\u0296\7)\2\2\u0296\u0297\t\3\2\2\u0297\u02a4\3\2\2\2\u0298"+
		"\u02a4\5\u0084C\2\u0299\u029a\5\u0084C\2\u029a\u029b\t\3\2\2\u029b\u02a4"+
		"\3\2\2\2\u029c\u029d\5\u0084C\2\u029d\u029e\7)\2\2\u029e\u02a4\3\2\2\2"+
		"\u029f\u02a0\5\u0084C\2\u02a0\u02a1\7)\2\2\u02a1\u02a2\t\3\2\2\u02a2\u02a4"+
		"\3\2\2\2\u02a3\u0238\3\2\2\2\u02a3\u0239\3\2\2\2\u02a3\u023b\3\2\2\2\u02a3"+
		"\u023d\3\2\2\2\u02a3\u0240\3\2\2\2\u02a3\u0243\3\2\2\2\u02a3\u0247\3\2"+
		"\2\2\u02a3\u024b\3\2\2\2\u02a3\u0250\3\2\2\2\u02a3\u0252\3\2\2\2\u02a3"+
		"\u0256\3\2\2\2\u02a3\u025a\3\2\2\2\u02a3\u025f\3\2\2\2\u02a3\u0260\3\2"+
		"\2\2\u02a3\u0262\3\2\2\2\u02a3\u0264\3\2\2\2\u02a3\u0267\3\2\2\2\u02a3"+
		"\u0268\3\2\2\2\u02a3\u026a\3\2\2\2\u02a3\u026c\3\2\2\2\u02a3\u026f\3\2"+
		"\2\2\u02a3\u0270\3\2\2\2\u02a3\u0273\3\2\2\2\u02a3\u0276\3\2\2\2\u02a3"+
		"\u027a\3\2\2\2\u02a3\u027d\3\2\2\2\u02a3\u0282\3\2\2\2\u02a3\u0287\3\2"+
		"\2\2\u02a3\u028d\3\2\2\2\u02a3\u028e\3\2\2\2\u02a3\u0291\3\2\2\2\u02a3"+
		"\u0294\3\2\2\2\u02a3\u0298\3\2\2\2\u02a3\u0299\3\2\2\2\u02a3\u029c\3\2"+
		"\2\2\u02a3\u029f\3\2\2\2\u02a4K\3\2\2\2\u02a5\u02a6\7\b\2\2\u02a6\u02a7"+
		"\5N(\2\u02a7\u02a8\7\37\2\2\u02a8\u02a9\7 \2\2\u02a9\u02b9\3\2\2\2\u02aa"+
		"\u02ab\7\b\2\2\u02ab\u02ac\5N(\2\u02ac\u02ad\7\37\2\2\u02ad\u02ae\5X-"+
		"\2\u02ae\u02af\7 \2\2\u02af\u02b9\3\2\2\2\u02b0\u02b1\7\b\2\2\u02b1\u02b2"+
		"\5N(\2\u02b2\u02b3\5,\27\2\u02b3\u02b9\3\2\2\2\u02b4\u02b5\7\b\2\2\u02b5"+
		"\u02b6\5N(\2\u02b6\u02b7\5Z.\2\u02b7\u02b9\3\2\2\2\u02b8\u02a5\3\2\2\2"+
		"\u02b8\u02aa\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9M\3"+
		"\2\2\2\u02ba\u02bb\7!\2\2\u02bb\u02bc\5P)\2\u02bc\u02bd\7\27\2\2\u02bd"+
		"\u02be\5R*\2\u02be\u02bf\7\27\2\2\u02bf\u02c0\5T+\2\u02c0\u02c1\7\"\2"+
		"\2\u02c1\u02cd\3\2\2\2\u02c2\u02c3\5P)\2\u02c3\u02c4\7\27\2\2\u02c4\u02c5"+
		"\5R*\2\u02c5\u02c6\7\27\2\2\u02c6\u02c7\5T+\2\u02c7\u02cd\3\2\2\2\u02c8"+
		"\u02cd\5D#\2\u02c9\u02ca\7!\2\2\u02ca\u02cd\7\"\2\2\u02cb\u02cd\3\2\2"+
		"\2\u02cc\u02ba\3\2\2\2\u02cc\u02c2\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cc\u02c9"+
		"\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cdO\3\2\2\2\u02ce\u02d1\5\24\13\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1Q\3\2\2\2"+
		"\u02d2\u02d5\5D#\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5S\3\2\2\2\u02d6\u02d9\5V,\2\u02d7\u02d9\3\2\2\2\u02d8\u02d6"+
		"\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9U\3\2\2\2\u02da\u02e5\5$\23\2\u02db"+
		"\u02e5\5\"\22\2\u02dc\u02dd\5$\23\2\u02dd\u02de\7\34\2\2\u02de\u02df\5"+
		"V,\2\u02df\u02e5\3\2\2\2\u02e0\u02e1\5\"\22\2\u02e1\u02e2\7\34\2\2\u02e2"+
		"\u02e3\5V,\2\u02e3\u02e5\3\2\2\2\u02e4\u02da\3\2\2\2\u02e4\u02db\3\2\2"+
		"\2\u02e4\u02dc\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5W\3\2\2\2\u02e6\u02eb"+
		"\5\6\4\2\u02e7\u02e8\5\6\4\2\u02e8\u02e9\5X-\2\u02e9\u02eb\3\2\2\2\u02ea"+
		"\u02e6\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ebY\3\2\2\2\u02ec\u02f6\5<\37\2"+
		"\u02ed\u02ee\5<\37\2\u02ee\u02ef\5Z.\2\u02ef\u02f6\3\2\2\2\u02f0\u02f6"+
		"\5L\'\2\u02f1\u02f2\5L\'\2\u02f2\u02f3\5Z.\2\u02f3\u02f6\3\2\2\2\u02f4"+
		"\u02f6\5\\/\2\u02f5\u02ec\3\2\2\2\u02f5\u02ed\3\2\2\2\u02f5\u02f0\3\2"+
		"\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6[\3\2\2\2\u02f7\u02f8"+
		"\7\t\2\2\u02f8\u02f9\5^\60\2\u02f9\u02fa\7\27\2\2\u02fa]\3\2\2\2\u02fb"+
		"\u02ff\5\u008aF\2\u02fc\u02ff\5$\23\2\u02fd\u02ff\5\"\22\2\u02fe\u02fb"+
		"\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff_\3\2\2\2\u0300"+
		"\u0301\5d\63\2\u0301\u0302\7\37\2\2\u0302\u0303\7 \2\2\u0303\u031f\3\2"+
		"\2\2\u0304\u0305\5d\63\2\u0305\u0306\7\37\2\2\u0306\u0307\5n8\2\u0307"+
		"\u0308\7 \2\2\u0308\u031f\3\2\2\2\u0309\u030a\5f\64\2\u030a\u030b\7\37"+
		"\2\2\u030b\u030c\7 \2\2\u030c\u031f\3\2\2\2\u030d\u030e\5f\64\2\u030e"+
		"\u030f\7\37\2\2\u030f\u0310\5n8\2\u0310\u0311\7 \2\2\u0311\u031f\3\2\2"+
		"\2\u0312\u0313\5j\66\2\u0313\u0314\7\37\2\2\u0314\u0315\7 \2\2\u0315\u031f"+
		"\3\2\2\2\u0316\u0317\5j\66\2\u0317\u0318\7\37\2\2\u0318\u0319\5n8\2\u0319"+
		"\u031a\7 \2\2\u031a\u031f\3\2\2\2\u031b\u031c\5l\67\2\u031c\u031d\7\27"+
		"\2\2\u031d\u031f\3\2\2\2\u031e\u0300\3\2\2\2\u031e\u0304\3\2\2\2\u031e"+
		"\u0309\3\2\2\2\u031e\u030d\3\2\2\2\u031e\u0312\3\2\2\2\u031e\u0316\3\2"+
		"\2\2\u031e\u031b\3\2\2\2\u031fa\3\2\2\2\u0320\u0321\7\n\2\2\u0321\u0322"+
		"\7\'\2\2\u0322\u0323\7!\2\2\u0323\u0339\7\"\2\2\u0324\u0325\7\n\2\2\u0325"+
		"\u0326\7\'\2\2\u0326\u0327\7!\2\2\u0327\u0328\7\"\2\2\u0328\u0329\7\26"+
		"\2\2\u0329\u0339\7\'\2\2\u032a\u032b\7\n\2\2\u032b\u032c\7\'\2\2\u032c"+
		"\u032d\7!\2\2\u032d\u032e\5p9\2\u032e\u032f\7\"\2\2\u032f\u0339\3\2\2"+
		"\2\u0330\u0331\7\n\2\2\u0331\u0332\7\'\2\2\u0332\u0333\7!\2\2\u0333\u0334"+
		"\5p9\2\u0334\u0335\7\"\2\2\u0335\u0336\7\26\2\2\u0336\u0337\7\'\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u0320\3\2\2\2\u0338\u0324\3\2\2\2\u0338\u032a\3\2"+
		"\2\2\u0338\u0330\3\2\2\2\u0339c\3\2\2\2\u033a\u033b\5b\62\2\u033be\3\2"+
		"\2\2\u033c\u033d\5h\65\2\u033d\u033e\5b\62\2\u033e\u0354\3\2\2\2\u033f"+
		"\u0340\7\16\2\2\u0340\u0354\5b\62\2\u0341\u0342\5h\65\2\u0342\u0343\7"+
		"\16\2\2\u0343\u0344\5b\62\2\u0344\u0354\3\2\2\2\u0345\u0346\7\17\2\2\u0346"+
		"\u0347\5h\65\2\u0347\u0348\7\16\2\2\u0348\u0349\5b\62\2\u0349\u0354\3"+
		"\2\2\2\u034a\u034b\7\17\2\2\u034b\u034c\5h\65\2\u034c\u034d\5b\62\2\u034d"+
		"\u0354\3\2\2\2\u034e\u034f\7\17\2\2\u034f\u0354\5b\62\2\u0350\u0351\7"+
		"\17\2\2\u0351\u0352\7\16\2\2\u0352\u0354\5b\62\2\u0353\u033c\3\2\2\2\u0353"+
		"\u033f\3\2\2\2\u0353\u0341\3\2\2\2\u0353\u0345\3\2\2\2\u0353\u034a\3\2"+
		"\2\2\u0353\u034e\3\2\2\2\u0353\u0350\3\2\2\2\u0354g\3\2\2\2\u0355\u0356"+
		"\t\4\2\2\u0356i\3\2\2\2\u0357\u0358\7\'\2\2\u0358\u0359\7!\2\2\u0359\u0360"+
		"\7\"\2\2\u035a\u035b\7\'\2\2\u035b\u035c\7!\2\2\u035c\u035d\5p9\2\u035d"+
		"\u035e\7\"\2\2\u035e\u0360\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u035a\3\2"+
		"\2\2\u0360k\3\2\2\2\u0361\u0364\5d\63\2\u0362\u0364\5f\64\2\u0363\u0361"+
		"\3\2\2\2\u0363\u0362\3\2\2\2\u0364m\3\2\2\2\u0365\u036a\5\6\4\2\u0366"+
		"\u0367\5\6\4\2\u0367\u0368\5n8\2\u0368\u036a\3\2\2\2\u0369\u0365\3\2\2"+
		"\2\u0369\u0366\3\2\2\2\u036ao\3\2\2\2\u036b\u0371\5r:\2\u036c\u036d\5"+
		"r:\2\u036d\u036e\7\34\2\2\u036e\u036f\5p9\2\u036f\u0371\3\2\2\2\u0370"+
		"\u036b\3\2\2\2\u0370\u036c\3\2\2\2\u0371q\3\2\2\2\u0372\u0373\7\'\2\2"+
		"\u0373\u0374\7)\2\2\u0374s\3\2\2\2\u0375\u0379\5v<\2\u0376\u0379\5z>\2"+
		"\u0377\u0379\5~@\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0377"+
		"\3\2\2\2\u0379u\3\2\2\2\u037a\u037b\5x=\2\u037bw\3\2\2\2\u037c\u037d\7"+
		"\20\2\2\u037d\u037e\7\'\2\2\u037e\u037f\7\37\2\2\u037f\u0395\7 \2\2\u0380"+
		"\u0381\7\20\2\2\u0381\u0382\7\'\2\2\u0382\u0383\7\37\2\2\u0383\u0384\5"+
		"n8\2\u0384\u0385\7 \2\2\u0385\u0395\3\2\2\2\u0386\u0387\7\20\2\2\u0387"+
		"\u0388\7\'\2\2\u0388\u0389\7\22\2\2\u0389\u038a\7\'\2\2\u038a\u038b\7"+
		"\37\2\2\u038b\u0395\7 \2\2\u038c\u038d\7\20\2\2\u038d\u038e\7\'\2\2\u038e"+
		"\u038f\7\22\2\2\u038f\u0390\7\'\2\2\u0390\u0391\7\37\2\2\u0391\u0392\5"+
		"n8\2\u0392\u0393\7 \2\2\u0393\u0395\3\2\2\2\u0394\u037c\3\2\2\2\u0394"+
		"\u0380\3\2\2\2\u0394\u0386\3\2\2\2\u0394\u038c\3\2\2\2\u0395y\3\2\2\2"+
		"\u0396\u0397\5|?\2\u0397{\3\2\2\2\u0398\u0399\7\21\2\2\u0399\u039a\7\'"+
		"\2\2\u039a\u039b\7\37\2\2\u039b\u03b1\7 \2\2\u039c\u039d\7\21\2\2\u039d"+
		"\u039e\7\'\2\2\u039e\u039f\7\37\2\2\u039f\u03a0\5n8\2\u03a0\u03a1\7 \2"+
		"\2\u03a1\u03b1\3\2\2\2\u03a2\u03a3\7\21\2\2\u03a3\u03a4\7\'\2\2\u03a4"+
		"\u03a5\7\22\2\2\u03a5\u03a6\7\'\2\2\u03a6\u03a7\7\37\2\2\u03a7\u03b1\7"+
		" \2\2\u03a8\u03a9\7\21\2\2\u03a9\u03aa\7\'\2\2\u03aa\u03ab\7\22\2\2\u03ab"+
		"\u03ac\7\'\2\2\u03ac\u03ad\7\37\2\2\u03ad\u03ae\5n8\2\u03ae\u03af\7 \2"+
		"\2\u03af\u03b1\3\2\2\2\u03b0\u0398\3\2\2\2\u03b0\u039c\3\2\2\2\u03b0\u03a2"+
		"\3\2\2\2\u03b0\u03a8\3\2\2\2\u03b1}\3\2\2\2\u03b2\u03b3\5\u0080A\2\u03b3"+
		"\u03b4\7\37\2\2\u03b4\u03b5\7 \2\2\u03b5\u03bc\3\2\2\2\u03b6\u03b7\5\u0080"+
		"A\2\u03b7\u03b8\7\37\2\2\u03b8\u03b9\5n8\2\u03b9\u03ba\7 \2\2\u03ba\u03bc"+
		"\3\2\2\2\u03bb\u03b2\3\2\2\2\u03bb\u03b6\3\2\2\2\u03bc\177\3\2\2\2\u03bd"+
		"\u03c1\5\u0082B\2\u03be\u03bf\7\17\2\2\u03bf\u03c1\5\u0082B\2\u03c0\u03bd"+
		"\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u0081\3\2\2\2\u03c2\u03c3\7\23\2\2"+
		"\u03c3\u03d3\7\'\2\2\u03c4\u03c5\7\23\2\2\u03c5\u03c6\7\'\2\2\u03c6\u03c7"+
		"\7\22\2\2\u03c7\u03d3\7\'\2\2\u03c8\u03c9\7\23\2\2\u03c9\u03ca\7\'\2\2"+
		"\u03ca\u03cb\7\24\2\2\u03cb\u03d3\7\'\2\2\u03cc\u03cd\7\23\2\2\u03cd\u03ce"+
		"\7\'\2\2\u03ce\u03cf\7\22\2\2\u03cf\u03d0\7\'\2\2\u03d0\u03d1\7\24\2\2"+
		"\u03d1\u03d3\7\'\2\2\u03d2\u03c2\3\2\2\2\u03d2\u03c4\3\2\2\2\u03d2\u03c8"+
		"\3\2\2\2\u03d2\u03cc\3\2\2\2\u03d3\u0083\3\2\2\2\u03d4\u03e0\7\'\2\2\u03d5"+
		"\u03d6\7\'\2\2\u03d6\u03d7\7\31\2\2\u03d7\u03e0\5\u0084C\2\u03d8\u03d9"+
		"\7\'\2\2\u03d9\u03e0\5\u0086D\2\u03da\u03db\7\'\2\2\u03db\u03dc\5\u0086"+
		"D\2\u03dc\u03dd\7\31\2\2\u03dd\u03de\5\u0084C\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03d4\3\2\2\2\u03df\u03d5\3\2\2\2\u03df\u03d8\3\2\2\2\u03df\u03da\3\2"+
		"\2\2\u03e0\u0085\3\2\2\2\u03e1\u03e2\7\35\2\2\u03e2\u03e3\5\u0088E\2\u03e3"+
		"\u03e4\7\36\2\2\u03e4\u03eb\3\2\2\2\u03e5\u03e6\7\35\2\2\u03e6\u03e7\5"+
		"\u0088E\2\u03e7\u03e8\7\36\2\2\u03e8\u03e9\5\u0086D\2\u03e9\u03eb\3\2"+
		"\2\2\u03ea\u03e1\3\2\2\2\u03ea\u03e5\3\2\2\2\u03eb\u0087\3\2\2\2\u03ec"+
		"\u03ef\t\5\2\2\u03ed\u03ef\5$\23\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2"+
		"\2\2\u03ef\u0089\3\2\2\2\u03f0\u0408\7\'\2\2\u03f1\u03f2\7\'\2\2\u03f2"+
		"\u0408\7)\2\2\u03f3\u0408\7-\2\2\u03f4\u03f5\7-\2\2\u03f5\u0408\7)\2\2"+
		"\u03f6\u0408\7.\2\2\u03f7\u03f8\7.\2\2\u03f8\u0408\7)\2\2\u03f9\u0408"+
		"\7,\2\2\u03fa\u0408\5\32\16\2\u03fb\u0408\5\36\20\2\u03fc\u0408\5$\23"+
		"\2\u03fd\u0408\5.\30\2\u03fe\u03ff\5\u008cG\2\u03ff\u0400\7\31\2\2\u0400"+
		"\u0401\5\u008eH\2\u0401\u0408\3\2\2\2\u0402\u0403\5\u008cG\2\u0403\u0404"+
		"\7\33\2\2\u0404\u0405\5\u008eH\2\u0405\u0408\3\2\2\2\u0406\u0408\5\u0084"+
		"C\2\u0407\u03f0\3\2\2\2\u0407\u03f1\3\2\2\2\u0407\u03f3\3\2\2\2\u0407"+
		"\u03f4\3\2\2\2\u0407\u03f6\3\2\2\2\u0407\u03f7\3\2\2\2\u0407\u03f9\3\2"+
		"\2\2\u0407\u03fa\3\2\2\2\u0407\u03fb\3\2\2\2\u0407\u03fc\3\2\2\2\u0407"+
		"\u03fd\3\2\2\2\u0407\u03fe\3\2\2\2\u0407\u0402\3\2\2\2\u0407\u0406\3\2"+
		"\2\2\u0408\u008b\3\2\2\2\u0409\u040a\7\'\2\2\u040a\u008d\3\2\2\2\u040b"+
		"\u040c\7\'\2\2\u040c\u008f\3\2\2\2\66\u0098\u00a4\u00b1\u00e6\u00ed\u00fe"+
		"\u010c\u0114\u011b\u0123\u012e\u0138\u0192\u01ae\u01ba\u01c6\u01cb\u01d5"+
		"\u01ea\u01ff\u020d\u0218\u0224\u022a\u0235\u02a3\u02b8\u02cc\u02d0\u02d4"+
		"\u02d8\u02e4\u02ea\u02f5\u02fe\u031e\u0338\u0353\u035f\u0363\u0369\u0370"+
		"\u0378\u0394\u03b0\u03bb\u03c0\u03d2\u03df\u03ea\u03ee\u0407";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}