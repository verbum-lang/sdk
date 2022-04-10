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
		RULE_conditionalBlockElsItems = 35, RULE_conditionalExpressionElements2 = 36, 
		RULE_defaultExpValues = 37, RULE_defaultExpValuesUnique = 38, RULE_conditionalExpressionElements = 39, 
		RULE_conditionExpBlock = 40, RULE_conditionExpBlockItem = 41, RULE_conditionalExpValue = 42, 
		RULE_identifierAttrFn = 43, RULE_loop = 44, RULE_loopExpression = 45, 
		RULE_loopOneMembers = 46, RULE_loopTwoMembers = 47, RULE_loopThreeMembers = 48, 
		RULE_loopThreeMembersValues = 49, RULE_loopBlockElements = 50, RULE_loopBlockElementsLimited = 51, 
		RULE_ret = 52, RULE_retValues = 53, RULE_functions = 54, RULE_functionGeneralModes = 55, 
		RULE_functionsModes = 56, RULE_functionMethodsModes = 57, RULE_methodPerm = 58, 
		RULE_constructClassMethod = 59, RULE_interfaceMethod = 60, RULE_functionCodeBlock = 61, 
		RULE_functionParams = 62, RULE_functionParamElements = 63, RULE_oopGeneral = 64, 
		RULE_interfaceClass = 65, RULE_interfaceClassDefinition = 66, RULE_abstractClass = 67, 
		RULE_abstractClassDefinition = 68, RULE_classDefination = 69, RULE_classModesGeneral = 70, 
		RULE_classModes = 71, RULE_arrayAccessElements = 72, RULE_arrayAccessElementsItems = 73, 
		RULE_accessBlockAr = 74, RULE_arrayIndexAccess = 75, RULE_generalValue = 76, 
		RULE_objIdentifierA = 77, RULE_objIdentifierB = 78;
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
			"conditionalBlockElements", "conditionalBlockElsItems", "conditionalExpressionElements2", 
			"defaultExpValues", "defaultExpValuesUnique", "conditionalExpressionElements", 
			"conditionExpBlock", "conditionExpBlockItem", "conditionalExpValue", 
			"identifierAttrFn", "loop", "loopExpression", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
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
			setState(158);
			fileContent(0);
			setState(159);
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
			setState(166);
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
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					sentence();
					}
					} 
				}
				setState(168);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
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
			setState(180);
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
			setState(182);
			match(Use);
			setState(183);
			useValue();
			setState(184);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				useString();
				setState(188);
				match(Separator);
				setState(189);
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
			setState(193);
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
			setState(195);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(Var);
				setState(198);
				variableMembers();
				setState(199);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				methodPerm();
				setState(202);
				match(Var);
				setState(203);
				variableMembers();
				setState(204);
				match(End);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				methodPerm();
				setState(212);
				match(Static);
				setState(213);
				match(Var);
				setState(214);
				variableMembers();
				setState(215);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(Final);
				setState(218);
				methodPerm();
				setState(219);
				match(Static);
				setState(220);
				match(Var);
				setState(221);
				variableMembers();
				setState(222);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(Final);
				setState(225);
				methodPerm();
				setState(226);
				match(Var);
				setState(227);
				variableMembers();
				setState(228);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(Final);
				setState(231);
				match(Var);
				setState(232);
				variableMembers();
				setState(233);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				match(Final);
				setState(236);
				match(Static);
				setState(237);
				match(Var);
				setState(238);
				variableMembers();
				setState(239);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				variableMembers();
				setState(242);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				variableDefinition();
				setState(248);
				match(Separator);
				setState(249);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(Identifier);
				setState(254);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				objIdentifierA();
				setState(256);
				match(Point);
				setState(257);
				objIdentifierB();
				setState(258);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				objIdentifierA();
				setState(261);
				match(TwoTwoPoint);
				setState(262);
				objIdentifierB();
				setState(263);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				arrayAccessElements();
				setState(266);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(TypeSpec);
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				match(New);
				setState(277);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(OpenArIndex);
				setState(285);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(OpenArIndex);
				setState(287);
				indexArrayElements();
				setState(288);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				generalValue();
				setState(294);
				match(Separator);
				setState(295);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(OpenBlock);
				setState(300);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(OpenBlock);
				setState(302);
				associativeArrayElements();
				setState(303);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Identifier);
				setState(308);
				match(TwoPoint);
				setState(309);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(Identifier);
				setState(311);
				match(TwoPoint);
				setState(312);
				generalValue();
				setState(313);
				match(Separator);
				setState(314);
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
			setState(318);
			match(OpenOp);
			setState(319);
			operationElements();
			setState(320);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				operationValue();
				setState(324);
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
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				functionCall();
				setState(330);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				functionCall();
				setState(333);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				functionCall();
				setState(336);
				match(TypeSpec);
				setState(337);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(Identifier);
				setState(341);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(Identifier);
				setState(343);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				match(Identifier);
				setState(345);
				match(TypeSpec);
				setState(346);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				firstIncDec();
				setState(348);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(350);
				firstIncDec();
				setState(351);
				match(Identifier);
				setState(352);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(354);
				firstIncDec();
				setState(355);
				match(Identifier);
				setState(356);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(358);
				firstIncDec();
				setState(359);
				match(Identifier);
				setState(360);
				match(TypeSpec);
				setState(361);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(363);
				match(Identifier);
				setState(364);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(365);
				match(Identifier);
				setState(366);
				lastIncDec();
				setState(367);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(369);
				match(Identifier);
				setState(370);
				lastIncDec();
				setState(371);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(373);
				match(Identifier);
				setState(374);
				lastIncDec();
				setState(375);
				match(TypeSpec);
				setState(376);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(378);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(379);
				match(Integer);
				setState(380);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(381);
				match(Integer);
				setState(382);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(383);
				match(Integer);
				setState(384);
				match(TypeSpec);
				setState(385);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(386);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(387);
				match(Float);
				setState(388);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(389);
				match(Float);
				setState(390);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(391);
				match(Float);
				setState(392);
				match(TypeSpec);
				setState(393);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(394);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(395);
				operationBlock();
				setState(396);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(398);
				operationBlock();
				setState(399);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(401);
				operationBlock();
				setState(402);
				match(TypeSpec);
				setState(403);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(405);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(406);
				arrayAccessElements();
				setState(407);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(409);
				arrayAccessElements();
				setState(410);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(412);
				arrayAccessElements();
				setState(413);
				match(TypeSpec);
				setState(414);
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
			setState(418);
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
			setState(420);
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
			setState(422);
			functionCall();
			setState(423);
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
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(Identifier);
				setState(426);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(Identifier);
				setState(428);
				match(Point);
				setState(429);
				identifierB();
				setState(430);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(Identifier);
				setState(433);
				match(TwoTwoPoint);
				setState(434);
				identifierB();
				setState(435);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(Identifier);
				setState(438);
				match(Point);
				setState(439);
				identifierB();
				setState(440);
				functionCallParam();
				setState(441);
				pointSeparator();
				setState(442);
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
			setState(446);
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
			setState(448);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(OpenOp);
				setState(451);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(OpenOp);
				setState(453);
				functionCallParamElements();
				setState(454);
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
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				generalValue();
				setState(460);
				match(Separator);
				setState(461);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				operationElements();
				setState(465);
				match(Separator);
				setState(466);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				conditionalExpressionStructBlock();
				setState(472);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				ifElementUnique();
				setState(478);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				ifElementUnique();
				setState(481);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				ifElementUnique();
				setState(484);
				elifElements();
				setState(485);
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
			setState(489);
			match(If);
			setState(490);
			conditionalExpressionItems();
			setState(491);
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
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				elifElementUnique();
				setState(495);
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
			setState(499);
			match(Elif);
			setState(500);
			conditionalExpressionItems();
			setState(501);
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
			setState(503);
			match(Else);
			setState(504);
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
			setState(506);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(OpenBlock);
				setState(509);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(OpenBlock);
				setState(511);
				conditionalBlockElsItems();
				setState(512);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
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
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				sentence();
				setState(522);
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

	public static class ConditionalExpressionElements2Context extends ParserRuleContext {
		public DefaultExpValuesContext defaultExpValues() {
			return getRuleContext(DefaultExpValuesContext.class,0);
		}
		public ConditionalExpressionElements2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionElements2; }
	}

	public final ConditionalExpressionElements2Context conditionalExpressionElements2() throws RecognitionException {
		ConditionalExpressionElements2Context _localctx = new ConditionalExpressionElements2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditionalExpressionElements2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			defaultExpValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExpValuesContext extends ParserRuleContext {
		public DefaultExpValuesUniqueContext defaultExpValuesUnique() {
			return getRuleContext(DefaultExpValuesUniqueContext.class,0);
		}
		public DefaultExpValuesContext defaultExpValues() {
			return getRuleContext(DefaultExpValuesContext.class,0);
		}
		public DefaultExpValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpValues; }
	}

	public final DefaultExpValuesContext defaultExpValues() throws RecognitionException {
		DefaultExpValuesContext _localctx = new DefaultExpValuesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_defaultExpValues);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				defaultExpValuesUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				defaultExpValuesUnique();
				setState(530);
				defaultExpValues();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExpValuesUniqueContext extends ParserRuleContext {
		public ConditionalExpValueContext conditionalExpValue() {
			return getRuleContext(ConditionalExpValueContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public DefaultExpValuesUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpValuesUnique; }
	}

	public final DefaultExpValuesUniqueContext defaultExpValuesUnique() throws RecognitionException {
		DefaultExpValuesUniqueContext _localctx = new DefaultExpValuesUniqueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_defaultExpValuesUnique);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(OpenOp);
				setState(536);
				conditionalExpValue();
				setState(537);
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

	public static class ConditionalExpressionElementsContext extends ParserRuleContext {
		public ConditionalExpValueContext conditionalExpValue() {
			return getRuleContext(ConditionalExpValueContext.class,0);
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
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				conditionalExpValue();
				setState(543);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				conditionExpBlock();
				setState(547);
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

	public static class ConditionExpBlockContext extends ParserRuleContext {
		public ConditionExpBlockItemContext conditionExpBlockItem() {
			return getRuleContext(ConditionExpBlockItemContext.class,0);
		}
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public ConditionExpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpBlock; }
	}

	public final ConditionExpBlockContext conditionExpBlock() throws RecognitionException {
		ConditionExpBlockContext _localctx = new ConditionExpBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionExpBlock);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				conditionExpBlockItem();
				setState(553);
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
				setState(555);
				conditionExpBlockItem();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				match(Not);
				setState(560);
				conditionExpBlockItem();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				match(Not);
				setState(562);
				conditionExpBlockItem();
				setState(563);
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(565);
				match(Not);
				setState(566);
				conditionExpBlockItem();
				setState(567);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_conditionExpBlockItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(OpenOp);
			setState(573);
			conditionalExpressionElements();
			setState(574);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierAttrFnContext identifierAttrFn() {
			return getRuleContext(IdentifierAttrFnContext.class,0);
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
		enterRule(_localctx, 84, RULE_conditionalExpValue);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				firstIncDec();
				setState(577);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				firstIncDec();
				setState(580);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				firstIncDec();
				setState(584);
				match(Identifier);
				setState(585);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				firstIncDec();
				setState(588);
				match(Identifier);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(Identifier);
				setState(593);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(594);
				match(Identifier);
				setState(595);
				lastIncDec();
				setState(596);
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
				setState(598);
				match(Identifier);
				setState(599);
				lastIncDec();
				setState(600);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(602);
				match(Identifier);
				setState(603);
				lastIncDec();
				setState(604);
				match(TypeSpec);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(608);
				match(Integer);
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(610);
				match(Integer);
				setState(611);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(612);
				match(Integer);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(615);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(616);
				match(Float);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(618);
				match(Float);
				setState(619);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(620);
				match(Float);
				setState(621);
				match(TypeSpec);
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
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(623);
				functionCall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(627);
				functionCall();
				setState(628);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(630);
				functionCall();
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(634);
				identifierAttrFn();
				setState(635);
				match(Attr);
				setState(636);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(638);
				identifierAttrFn();
				setState(639);
				match(Attr);
				setState(640);
				functionCall();
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
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(643);
				identifierAttrFn();
				setState(644);
				match(Attr);
				setState(645);
				functionCall();
				setState(646);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(648);
				identifierAttrFn();
				setState(649);
				match(Attr);
				setState(650);
				functionCall();
				setState(651);
				match(TypeSpec);
				setState(652);
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
				setState(654);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(655);
				operationBlock();
				setState(656);
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
				setState(658);
				operationBlock();
				setState(659);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(661);
				operationBlock();
				setState(662);
				match(TypeSpec);
				setState(663);
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
				setState(665);
				match(Identifier);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(666);
				match(Identifier);
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(668);
				match(Identifier);
				setState(669);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(670);
				match(Identifier);
				setState(671);
				match(TypeSpec);
				setState(672);
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
				setState(673);
				arrayAccessElements();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(674);
				arrayAccessElements();
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
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(677);
				arrayAccessElements();
				setState(678);
				match(TypeSpec);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(680);
				arrayAccessElements();
				setState(681);
				match(TypeSpec);
				setState(682);
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

	public static class IdentifierAttrFnContext extends ParserRuleContext {
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
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
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				arrayAccessElements();
				setState(688);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				match(Identifier);
				setState(692);
				match(TypeSpec);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_loop);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(For);
				setState(696);
				loopExpression();
				setState(697);
				match(OpenBlock);
				setState(698);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(For);
				setState(701);
				loopExpression();
				setState(702);
				match(OpenBlock);
				setState(703);
				loopBlockElements();
				setState(704);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(For);
				setState(707);
				loopExpression();
				setState(708);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				match(For);
				setState(711);
				loopExpression();
				setState(712);
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
		enterRule(_localctx, 90, RULE_loopExpression);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(OpenOp);
				setState(717);
				loopOneMembers();
				setState(718);
				match(End);
				setState(719);
				loopTwoMembers();
				setState(720);
				match(End);
				setState(721);
				loopThreeMembers();
				setState(722);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				loopOneMembers();
				setState(725);
				match(End);
				setState(726);
				loopTwoMembers();
				setState(727);
				match(End);
				setState(728);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(OpenOp);
				setState(732);
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
		enterRule(_localctx, 92, RULE_loopOneMembers);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
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
		enterRule(_localctx, 94, RULE_loopTwoMembers);
		try {
			setState(742);
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
				setState(740);
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
		enterRule(_localctx, 96, RULE_loopThreeMembers);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
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
		enterRule(_localctx, 98, RULE_loopThreeMembersValues);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				operationElements();
				setState(751);
				match(Separator);
				setState(752);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				operationBlock();
				setState(755);
				match(Separator);
				setState(756);
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
		enterRule(_localctx, 100, RULE_loopBlockElements);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				sentence();
				setState(762);
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
		enterRule(_localctx, 102, RULE_loopBlockElementsLimited);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				loop();
				setState(768);
				loopBlockElementsLimited();
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
		enterRule(_localctx, 104, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Ret);
			setState(775);
			retValues();
			setState(776);
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
		enterRule(_localctx, 106, RULE_retValues);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
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
		enterRule(_localctx, 108, RULE_functions);
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				functionsModes();
				setState(784);
				match(OpenBlock);
				setState(785);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				functionsModes();
				setState(788);
				match(OpenBlock);
				setState(789);
				functionCodeBlock();
				setState(790);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				functionMethodsModes();
				setState(793);
				match(OpenBlock);
				setState(794);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				functionMethodsModes();
				setState(797);
				match(OpenBlock);
				setState(798);
				functionCodeBlock();
				setState(799);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(801);
				constructClassMethod();
				setState(802);
				match(OpenBlock);
				setState(803);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(805);
				constructClassMethod();
				setState(806);
				match(OpenBlock);
				setState(807);
				functionCodeBlock();
				setState(808);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(810);
				interfaceMethod();
				setState(811);
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
		enterRule(_localctx, 110, RULE_functionGeneralModes);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(Function);
				setState(816);
				match(Identifier);
				setState(817);
				match(OpenOp);
				setState(818);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(Function);
				setState(820);
				match(Identifier);
				setState(821);
				match(OpenOp);
				setState(822);
				match(CloseOp);
				setState(823);
				match(ArrowRight);
				setState(824);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(Function);
				setState(826);
				match(Identifier);
				setState(827);
				match(OpenOp);
				setState(828);
				functionParams();
				setState(829);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				setState(836);
				match(ArrowRight);
				setState(837);
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
		enterRule(_localctx, 112, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
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
		enterRule(_localctx, 114, RULE_functionMethodsModes);
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				methodPerm();
				setState(844);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(Static);
				setState(847);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				methodPerm();
				setState(849);
				match(Static);
				setState(850);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				match(Final);
				setState(853);
				methodPerm();
				setState(854);
				match(Static);
				setState(855);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(857);
				match(Final);
				setState(858);
				methodPerm();
				setState(859);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(861);
				match(Final);
				setState(862);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(863);
				match(Final);
				setState(864);
				match(Static);
				setState(865);
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
		enterRule(_localctx, 116, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		enterRule(_localctx, 118, RULE_constructClassMethod);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(Identifier);
				setState(871);
				match(OpenOp);
				setState(872);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(Identifier);
				setState(874);
				match(OpenOp);
				setState(875);
				functionParams();
				setState(876);
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
		enterRule(_localctx, 120, RULE_interfaceMethod);
		try {
			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
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
				setState(881);
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
		enterRule(_localctx, 122, RULE_functionCodeBlock);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				sentence();
				setState(886);
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
		enterRule(_localctx, 124, RULE_functionParams);
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				functionParamElements();
				setState(892);
				match(Separator);
				setState(893);
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
		enterRule(_localctx, 126, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(Identifier);
			setState(898);
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
		enterRule(_localctx, 128, RULE_oopGeneral);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
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
		enterRule(_localctx, 130, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
		enterRule(_localctx, 132, RULE_interfaceClassDefinition);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(Interface);
				setState(908);
				match(Identifier);
				setState(909);
				match(OpenBlock);
				setState(910);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(Interface);
				setState(912);
				match(Identifier);
				setState(913);
				match(OpenBlock);
				setState(914);
				functionCodeBlock();
				setState(915);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(Interface);
				setState(918);
				match(Identifier);
				setState(919);
				match(Extends);
				setState(920);
				match(Identifier);
				setState(921);
				match(OpenBlock);
				setState(922);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(923);
				match(Interface);
				setState(924);
				match(Identifier);
				setState(925);
				match(Extends);
				setState(926);
				match(Identifier);
				setState(927);
				match(OpenBlock);
				setState(928);
				functionCodeBlock();
				setState(929);
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
		enterRule(_localctx, 134, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
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
		enterRule(_localctx, 136, RULE_abstractClassDefinition);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(Abstract);
				setState(936);
				match(Identifier);
				setState(937);
				match(OpenBlock);
				setState(938);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(Abstract);
				setState(940);
				match(Identifier);
				setState(941);
				match(OpenBlock);
				setState(942);
				functionCodeBlock();
				setState(943);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				match(Abstract);
				setState(946);
				match(Identifier);
				setState(947);
				match(Extends);
				setState(948);
				match(Identifier);
				setState(949);
				match(OpenBlock);
				setState(950);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(951);
				match(Abstract);
				setState(952);
				match(Identifier);
				setState(953);
				match(Extends);
				setState(954);
				match(Identifier);
				setState(955);
				match(OpenBlock);
				setState(956);
				functionCodeBlock();
				setState(957);
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
		enterRule(_localctx, 138, RULE_classDefination);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				classModesGeneral();
				setState(962);
				match(OpenBlock);
				setState(963);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				classModesGeneral();
				setState(966);
				match(OpenBlock);
				setState(967);
				functionCodeBlock();
				setState(968);
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
		enterRule(_localctx, 140, RULE_classModesGeneral);
		try {
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				match(Final);
				setState(974);
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
		enterRule(_localctx, 142, RULE_classModes);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(Class);
				setState(978);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(Class);
				setState(980);
				match(Identifier);
				setState(981);
				match(Extends);
				setState(982);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				match(Class);
				setState(984);
				match(Identifier);
				setState(985);
				match(Implements);
				setState(986);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(987);
				match(Class);
				setState(988);
				match(Identifier);
				setState(989);
				match(Extends);
				setState(990);
				match(Identifier);
				setState(991);
				match(Implements);
				setState(992);
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
		enterRule(_localctx, 144, RULE_arrayAccessElements);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				arrayAccessElementsItems();
				setState(997);
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
		enterRule(_localctx, 146, RULE_arrayAccessElementsItems);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(Identifier);
				setState(1003);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				match(Identifier);
				setState(1005);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1006);
				match(Identifier);
				setState(1007);
				accessBlockAr();
				setState(1008);
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
		enterRule(_localctx, 148, RULE_accessBlockAr);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				match(OpenArIndex);
				setState(1013);
				arrayIndexAccess();
				setState(1014);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(OpenArIndex);
				setState(1017);
				arrayIndexAccess();
				setState(1018);
				match(CloseArIndex);
				setState(1019);
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
		enterRule(_localctx, 150, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
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
		enterRule(_localctx, 152, RULE_generalValue);
		try {
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(Identifier);
				setState(1027);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1028);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
				match(Integer);
				setState(1030);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				match(Float);
				setState(1033);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1034);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1035);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1036);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1037);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1038);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1039);
				objIdentifierA();
				setState(1040);
				match(Point);
				setState(1041);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1043);
				objIdentifierA();
				setState(1044);
				match(TwoTwoPoint);
				setState(1045);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1047);
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
		enterRule(_localctx, 154, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
		enterRule(_localctx, 156, RULE_objIdentifierB);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0421\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\u00a7\n\3\f\3\16\3\u00aa\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u00b5\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c2\n"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00f7\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00fe\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010f\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011d\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0125\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u012c\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0134\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u013f\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\5\23\u0149\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a3\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01bf\n\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01cb\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01d7\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u01dd\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01ea\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01f4\n \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0209\n$\3%\3%\3%\3"+
		"%\5%\u020f\n%\3&\3&\3\'\3\'\3\'\3\'\5\'\u0217\n\'\3(\3(\3(\3(\3(\5(\u021e"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0228\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u023d\n*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02af\n,\3-\3-\3-\3-\3-\3-\3-\5-\u02b8"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02cd"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02e1\n/"+
		"\3\60\3\60\5\60\u02e5\n\60\3\61\3\61\5\61\u02e9\n\61\3\62\3\62\5\62\u02ed"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02f9\n\63"+
		"\3\64\3\64\3\64\3\64\5\64\u02ff\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0307\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u0310\n\67\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u0330\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\59\u034a\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0365\n;\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\5=\u0371\n=\3>\3>\5>\u0375\n>\3?\3?\3?\3?\5?\u037b"+
		"\n?\3@\3@\3@\3@\3@\5@\u0382\n@\3A\3A\3A\3B\3B\3B\5B\u038a\nB\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u03a6\nD\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\5F\u03c2\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03cd"+
		"\nG\3H\3H\3H\5H\u03d2\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\5I\u03e4\nI\3J\3J\3J\3J\5J\u03ea\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K"+
		"\u03f5\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0400\nL\3M\3M\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u041b\nN\3O"+
		"\3O\3P\3P\3P\2\3\4Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\2\5\4\2\30\30$$\3\2#$\3\2\13\r\2\u0495\2\u00a0\3\2\2\2\4\u00a3\3\2\2"+
		"\2\6\u00b4\3\2\2\2\b\u00b6\3\2\2\2\n\u00b8\3\2\2\2\f\u00c1\3\2\2\2\16"+
		"\u00c3\3\2\2\2\20\u00c5\3\2\2\2\22\u00f6\3\2\2\2\24\u00fd\3\2\2\2\26\u010e"+
		"\3\2\2\2\30\u011c\3\2\2\2\32\u0124\3\2\2\2\34\u012b\3\2\2\2\36\u0133\3"+
		"\2\2\2 \u013e\3\2\2\2\"\u0140\3\2\2\2$\u0148\3\2\2\2&\u01a2\3\2\2\2(\u01a4"+
		"\3\2\2\2*\u01a6\3\2\2\2,\u01a8\3\2\2\2.\u01be\3\2\2\2\60\u01c0\3\2\2\2"+
		"\62\u01c2\3\2\2\2\64\u01ca\3\2\2\2\66\u01d6\3\2\2\28\u01dc\3\2\2\2:\u01e9"+
		"\3\2\2\2<\u01eb\3\2\2\2>\u01f3\3\2\2\2@\u01f5\3\2\2\2B\u01f9\3\2\2\2D"+
		"\u01fc\3\2\2\2F\u0208\3\2\2\2H\u020e\3\2\2\2J\u0210\3\2\2\2L\u0216\3\2"+
		"\2\2N\u021d\3\2\2\2P\u0227\3\2\2\2R\u023c\3\2\2\2T\u023e\3\2\2\2V\u02ae"+
		"\3\2\2\2X\u02b7\3\2\2\2Z\u02cc\3\2\2\2\\\u02e0\3\2\2\2^\u02e4\3\2\2\2"+
		"`\u02e8\3\2\2\2b\u02ec\3\2\2\2d\u02f8\3\2\2\2f\u02fe\3\2\2\2h\u0306\3"+
		"\2\2\2j\u0308\3\2\2\2l\u030f\3\2\2\2n\u032f\3\2\2\2p\u0349\3\2\2\2r\u034b"+
		"\3\2\2\2t\u0364\3\2\2\2v\u0366\3\2\2\2x\u0370\3\2\2\2z\u0374\3\2\2\2|"+
		"\u037a\3\2\2\2~\u0381\3\2\2\2\u0080\u0383\3\2\2\2\u0082\u0389\3\2\2\2"+
		"\u0084\u038b\3\2\2\2\u0086\u03a5\3\2\2\2\u0088\u03a7\3\2\2\2\u008a\u03c1"+
		"\3\2\2\2\u008c\u03cc\3\2\2\2\u008e\u03d1\3\2\2\2\u0090\u03e3\3\2\2\2\u0092"+
		"\u03e9\3\2\2\2\u0094\u03f4\3\2\2\2\u0096\u03ff\3\2\2\2\u0098\u0401\3\2"+
		"\2\2\u009a\u041a\3\2\2\2\u009c\u041c\3\2\2\2\u009e\u041e\3\2\2\2\u00a0"+
		"\u00a1\5\4\3\2\u00a1\u00a2\7\2\2\3\u00a2\3\3\2\2\2\u00a3\u00a8\b\3\1\2"+
		"\u00a4\u00a5\f\4\2\2\u00a5\u00a7\5\6\4\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\5\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00b5\5\b\5\2\u00ac\u00b5\5\n\6\2\u00ad\u00b5\5\20"+
		"\t\2\u00ae\u00b5\5,\27\2\u00af\u00b5\58\35\2\u00b0\u00b5\5Z.\2\u00b1\u00b5"+
		"\5n8\2\u00b2\u00b5\5j\66\2\u00b3\u00b5\5\u0082B\2\u00b4\u00ab\3\2\2\2"+
		"\u00b4\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af"+
		"\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\7\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\t\3\2\2\2\u00b8"+
		"\u00b9\7\3\2\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\7\27\2\2\u00bb\13\3\2\2"+
		"\2\u00bc\u00c2\5\16\b\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7\34\2\2\u00bf"+
		"\u00c0\5\f\7\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c2\r\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\17\3\2\2\2\u00c5\u00c6\5"+
		"\22\n\2\u00c6\21\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\5\24\13\2\u00c9"+
		"\u00ca\7\27\2\2\u00ca\u00f7\3\2\2\2\u00cb\u00cc\5v<\2\u00cc\u00cd\7\4"+
		"\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7\27\2\2\u00cf\u00f7\3\2\2\2\u00d0"+
		"\u00d1\7\16\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4"+
		"\7\27\2\2\u00d4\u00f7\3\2\2\2\u00d5\u00d6\5v<\2\u00d6\u00d7\7\16\2\2\u00d7"+
		"\u00d8\7\4\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\7\27\2\2\u00da\u00f7"+
		"\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\5v<\2\u00dd\u00de\7\16\2\2\u00de"+
		"\u00df\7\4\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7\27\2\2\u00e1\u00f7"+
		"\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4\5v<\2\u00e4\u00e5\7\4\2\2\u00e5"+
		"\u00e6\5\24\13\2\u00e6\u00e7\7\27\2\2\u00e7\u00f7\3\2\2\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\7\4\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7\27\2"+
		"\2\u00ec\u00f7\3\2\2\2\u00ed\u00ee\7\17\2\2\u00ee\u00ef\7\16\2\2\u00ef"+
		"\u00f0\7\4\2\2\u00f0\u00f1\5\24\13\2\u00f1\u00f2\7\27\2\2\u00f2\u00f7"+
		"\3\2\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\7\27\2\2\u00f5\u00f7\3\2\2"+
		"\2\u00f6\u00c7\3\2\2\2\u00f6\u00cb\3\2\2\2\u00f6\u00d0\3\2\2\2\u00f6\u00d5"+
		"\3\2\2\2\u00f6\u00db\3\2\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6"+
		"\u00ed\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\23\3\2\2\2\u00f8\u00fe\5\26\f"+
		"\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\7\34\2\2\u00fb\u00fc\5\24\13\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\25\3\2\2"+
		"\2\u00ff\u0100\7\'\2\2\u0100\u010f\5\30\r\2\u0101\u0102\5\u009cO\2\u0102"+
		"\u0103\7\31\2\2\u0103\u0104\5\u009eP\2\u0104\u0105\5\30\r\2\u0105\u010f"+
		"\3\2\2\2\u0106\u0107\5\u009cO\2\u0107\u0108\7\33\2\2\u0108\u0109\5\u009e"+
		"P\2\u0109\u010a\5\30\r\2\u010a\u010f\3\2\2\2\u010b\u010c\5\u0092J\2\u010c"+
		"\u010d\5\30\r\2\u010d\u010f\3\2\2\2\u010e\u00ff\3\2\2\2\u010e\u0101\3"+
		"\2\2\2\u010e\u0106\3\2\2\2\u010e\u010b\3\2\2\2\u010f\27\3\2\2\2\u0110"+
		"\u0111\t\2\2\2\u0111\u011d\5\u009aN\2\u0112\u0113\7)\2\2\u0113\u0114\t"+
		"\2\2\2\u0114\u011d\5\u009aN\2\u0115\u0116\t\2\2\2\u0116\u0117\7\25\2\2"+
		"\u0117\u011d\5\u009aN\2\u0118\u0119\7)\2\2\u0119\u011a\t\2\2\2\u011a\u011b"+
		"\7\25\2\2\u011b\u011d\5\u009aN\2\u011c\u0110\3\2\2\2\u011c\u0112\3\2\2"+
		"\2\u011c\u0115\3\2\2\2\u011c\u0118\3\2\2\2\u011d\31\3\2\2\2\u011e\u011f"+
		"\7\35\2\2\u011f\u0125\7\36\2\2\u0120\u0121\7\35\2\2\u0121\u0122\5\34\17"+
		"\2\u0122\u0123\7\36\2\2\u0123\u0125\3\2\2\2\u0124\u011e\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0125\33\3\2\2\2\u0126\u012c\5\u009aN\2\u0127\u0128\5\u009a"+
		"N\2\u0128\u0129\7\34\2\2\u0129\u012a\5\34\17\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012c\35\3\2\2\2\u012d\u012e\7\37\2"+
		"\2\u012e\u0134\7 \2\2\u012f\u0130\7\37\2\2\u0130\u0131\5 \21\2\u0131\u0132"+
		"\7 \2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012f\3\2\2\2\u0134"+
		"\37\3\2\2\2\u0135\u0136\7\'\2\2\u0136\u0137\7\32\2\2\u0137\u013f\5\u009a"+
		"N\2\u0138\u0139\7\'\2\2\u0139\u013a\7\32\2\2\u013a\u013b\5\u009aN\2\u013b"+
		"\u013c\7\34\2\2\u013c\u013d\5 \21\2\u013d\u013f\3\2\2\2\u013e\u0135\3"+
		"\2\2\2\u013e\u0138\3\2\2\2\u013f!\3\2\2\2\u0140\u0141\7!\2\2\u0141\u0142"+
		"\5$\23\2\u0142\u0143\7\"\2\2\u0143#\3\2\2\2\u0144\u0149\5&\24\2\u0145"+
		"\u0146\5&\24\2\u0146\u0147\5$\23\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2"+
		"\2\2\u0148\u0145\3\2\2\2\u0149%\3\2\2\2\u014a\u01a3\5.\30\2\u014b\u014c"+
		"\5.\30\2\u014c\u014d\7#\2\2\u014d\u01a3\3\2\2\2\u014e\u014f\5.\30\2\u014f"+
		"\u0150\7)\2\2\u0150\u01a3\3\2\2\2\u0151\u0152\5.\30\2\u0152\u0153\7)\2"+
		"\2\u0153\u0154\7#\2\2\u0154\u01a3\3\2\2\2\u0155\u01a3\7\'\2\2\u0156\u0157"+
		"\7\'\2\2\u0157\u01a3\7#\2\2\u0158\u0159\7\'\2\2\u0159\u01a3\7)\2\2\u015a"+
		"\u015b\7\'\2\2\u015b\u015c\7)\2\2\u015c\u01a3\7#\2\2\u015d\u015e\5(\25"+
		"\2\u015e\u015f\7\'\2\2\u015f\u01a3\3\2\2\2\u0160\u0161\5(\25\2\u0161\u0162"+
		"\7\'\2\2\u0162\u0163\7#\2\2\u0163\u01a3\3\2\2\2\u0164\u0165\5(\25\2\u0165"+
		"\u0166\7\'\2\2\u0166\u0167\7)\2\2\u0167\u01a3\3\2\2\2\u0168\u0169\5(\25"+
		"\2\u0169\u016a\7\'\2\2\u016a\u016b\7)\2\2\u016b\u016c\7#\2\2\u016c\u01a3"+
		"\3\2\2\2\u016d\u016e\7\'\2\2\u016e\u01a3\5*\26\2\u016f\u0170\7\'\2\2\u0170"+
		"\u0171\5*\26\2\u0171\u0172\7#\2\2\u0172\u01a3\3\2\2\2\u0173\u0174\7\'"+
		"\2\2\u0174\u0175\5*\26\2\u0175\u0176\7)\2\2\u0176\u01a3\3\2\2\2\u0177"+
		"\u0178\7\'\2\2\u0178\u0179\5*\26\2\u0179\u017a\7)\2\2\u017a\u017b\7#\2"+
		"\2\u017b\u01a3\3\2\2\2\u017c\u01a3\7+\2\2\u017d\u017e\7+\2\2\u017e\u01a3"+
		"\7#\2\2\u017f\u0180\7+\2\2\u0180\u01a3\7)\2\2\u0181\u0182\7+\2\2\u0182"+
		"\u0183\7)\2\2\u0183\u01a3\7#\2\2\u0184\u01a3\7,\2\2\u0185\u0186\7,\2\2"+
		"\u0186\u01a3\7#\2\2\u0187\u0188\7,\2\2\u0188\u01a3\7)\2\2\u0189\u018a"+
		"\7,\2\2\u018a\u018b\7)\2\2\u018b\u01a3\7#\2\2\u018c\u01a3\5\"\22\2\u018d"+
		"\u018e\5\"\22\2\u018e\u018f\7#\2\2\u018f\u01a3\3\2\2\2\u0190\u0191\5\""+
		"\22\2\u0191\u0192\7)\2\2\u0192\u01a3\3\2\2\2\u0193\u0194\5\"\22\2\u0194"+
		"\u0195\7)\2\2\u0195\u0196\7#\2\2\u0196\u01a3\3\2\2\2\u0197\u01a3\5\u0092"+
		"J\2\u0198\u0199\5\u0092J\2\u0199\u019a\7#\2\2\u019a\u01a3\3\2\2\2\u019b"+
		"\u019c\5\u0092J\2\u019c\u019d\7)\2\2\u019d\u01a3\3\2\2\2\u019e\u019f\5"+
		"\u0092J\2\u019f\u01a0\7)\2\2\u01a0\u01a1\7#\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u014a\3\2\2\2\u01a2\u014b\3\2\2\2\u01a2\u014e\3\2\2\2\u01a2\u0151\3\2"+
		"\2\2\u01a2\u0155\3\2\2\2\u01a2\u0156\3\2\2\2\u01a2\u0158\3\2\2\2\u01a2"+
		"\u015a\3\2\2\2\u01a2\u015d\3\2\2\2\u01a2\u0160\3\2\2\2\u01a2\u0164\3\2"+
		"\2\2\u01a2\u0168\3\2\2\2\u01a2\u016d\3\2\2\2\u01a2\u016f\3\2\2\2\u01a2"+
		"\u0173\3\2\2\2\u01a2\u0177\3\2\2\2\u01a2\u017c\3\2\2\2\u01a2\u017d\3\2"+
		"\2\2\u01a2\u017f\3\2\2\2\u01a2\u0181\3\2\2\2\u01a2\u0184\3\2\2\2\u01a2"+
		"\u0185\3\2\2\2\u01a2\u0187\3\2\2\2\u01a2\u0189\3\2\2\2\u01a2\u018c\3\2"+
		"\2\2\u01a2\u018d\3\2\2\2\u01a2\u0190\3\2\2\2\u01a2\u0193\3\2\2\2\u01a2"+
		"\u0197\3\2\2\2\u01a2\u0198\3\2\2\2\u01a2\u019b\3\2\2\2\u01a2\u019e\3\2"+
		"\2\2\u01a3\'\3\2\2\2\u01a4\u01a5\7&\2\2\u01a5)\3\2\2\2\u01a6\u01a7\7&"+
		"\2\2\u01a7+\3\2\2\2\u01a8\u01a9\5.\30\2\u01a9\u01aa\7\27\2\2\u01aa-\3"+
		"\2\2\2\u01ab\u01ac\7\'\2\2\u01ac\u01bf\5\64\33\2\u01ad\u01ae\7\'\2\2\u01ae"+
		"\u01af\7\31\2\2\u01af\u01b0\5\60\31\2\u01b0\u01b1\5\64\33\2\u01b1\u01bf"+
		"\3\2\2\2\u01b2\u01b3\7\'\2\2\u01b3\u01b4\7\33\2\2\u01b4\u01b5\5\60\31"+
		"\2\u01b5\u01b6\5\64\33\2\u01b6\u01bf\3\2\2\2\u01b7\u01b8\7\'\2\2\u01b8"+
		"\u01b9\7\31\2\2\u01b9\u01ba\5\60\31\2\u01ba\u01bb\5\64\33\2\u01bb\u01bc"+
		"\5\62\32\2\u01bc\u01bd\5.\30\2\u01bd\u01bf\3\2\2\2\u01be\u01ab\3\2\2\2"+
		"\u01be\u01ad\3\2\2\2\u01be\u01b2\3\2\2\2\u01be\u01b7\3\2\2\2\u01bf/\3"+
		"\2\2\2\u01c0\u01c1\7\'\2\2\u01c1\61\3\2\2\2\u01c2\u01c3\7\31\2\2\u01c3"+
		"\63\3\2\2\2\u01c4\u01c5\7!\2\2\u01c5\u01cb\7\"\2\2\u01c6\u01c7\7!\2\2"+
		"\u01c7\u01c8\5\66\34\2\u01c8\u01c9\7\"\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c4"+
		"\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\65\3\2\2\2\u01cc\u01d7\5\u009aN\2\u01cd"+
		"\u01ce\5\u009aN\2\u01ce\u01cf\7\34\2\2\u01cf\u01d0\5\66\34\2\u01d0\u01d7"+
		"\3\2\2\2\u01d1\u01d7\5$\23\2\u01d2\u01d3\5$\23\2\u01d3\u01d4\7\34\2\2"+
		"\u01d4\u01d5\5\66\34\2\u01d5\u01d7\3\2\2\2\u01d6\u01cc\3\2\2\2\u01d6\u01cd"+
		"\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7\67\3\2\2\2\u01d8"+
		"\u01dd\5:\36\2\u01d9\u01da\5:\36\2\u01da\u01db\58\35\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd9\3\2\2\2\u01de\u01ea"+
		"\5<\37\2\u01df\u01e0\5<\37\2\u01e0\u01e1\5> \2\u01e1\u01ea\3\2\2\2\u01e2"+
		"\u01e3\5<\37\2\u01e3\u01e4\5B\"\2\u01e4\u01ea\3\2\2\2\u01e5\u01e6\5<\37"+
		"\2\u01e6\u01e7\5> \2\u01e7\u01e8\5B\"\2\u01e8\u01ea\3\2\2\2\u01e9\u01de"+
		"\3\2\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e2\3\2\2\2\u01e9\u01e5\3\2\2\2\u01ea"+
		";\3\2\2\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed\5D#\2\u01ed\u01ee\5F$\2\u01ee"+
		"=\3\2\2\2\u01ef\u01f4\5@!\2\u01f0\u01f1\5@!\2\u01f1\u01f2\5> \2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4?\3\2\2\2"+
		"\u01f5\u01f6\7\6\2\2\u01f6\u01f7\5D#\2\u01f7\u01f8\5F$\2\u01f8A\3\2\2"+
		"\2\u01f9\u01fa\7\7\2\2\u01fa\u01fb\5F$\2\u01fbC\3\2\2\2\u01fc\u01fd\5"+
		"P)\2\u01fdE\3\2\2\2\u01fe\u01ff\7\37\2\2\u01ff\u0209\7 \2\2\u0200\u0201"+
		"\7\37\2\2\u0201\u0202\5H%\2\u0202\u0203\7 \2\2\u0203\u0209\3\2\2\2\u0204"+
		"\u0209\58\35\2\u0205\u0209\5,\27\2\u0206\u0209\5Z.\2\u0207\u0209\5j\66"+
		"\2\u0208\u01fe\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0204\3\2\2\2\u0208\u0205"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209G\3\2\2\2\u020a"+
		"\u020f\5\6\4\2\u020b\u020c\5\6\4\2\u020c\u020d\5H%\2\u020d\u020f\3\2\2"+
		"\2\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2\2\u020fI\3\2\2\2\u0210\u0211"+
		"\5L\'\2\u0211K\3\2\2\2\u0212\u0217\5N(\2\u0213\u0214\5N(\2\u0214\u0215"+
		"\5L\'\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0213\3\2\2\2\u0217"+
		"M\3\2\2\2\u0218\u021e\5V,\2\u0219\u021a\7!\2\2\u021a\u021b\5V,\2\u021b"+
		"\u021c\7\"\2\2\u021c\u021e\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2"+
		"\2\2\u021eO\3\2\2\2\u021f\u0228\5V,\2\u0220\u0221\5V,\2\u0221\u0222\5"+
		"P)\2\u0222\u0228\3\2\2\2\u0223\u0228\5R*\2\u0224\u0225\5R*\2\u0225\u0226"+
		"\5P)\2\u0226\u0228\3\2\2\2\u0227\u021f\3\2\2\2\u0227\u0220\3\2\2\2\u0227"+
		"\u0223\3\2\2\2\u0227\u0224\3\2\2\2\u0228Q\3\2\2\2\u0229\u023d\5T+\2\u022a"+
		"\u022b\5T+\2\u022b\u022c\t\3\2\2\u022c\u023d\3\2\2\2\u022d\u022e\5T+\2"+
		"\u022e\u022f\7)\2\2\u022f\u0230\t\3\2\2\u0230\u023d\3\2\2\2\u0231\u0232"+
		"\7%\2\2\u0232\u023d\5T+\2\u0233\u0234\7%\2\2\u0234\u0235\5T+\2\u0235\u0236"+
		"\t\3\2\2\u0236\u023d\3\2\2\2\u0237\u0238\7%\2\2\u0238\u0239\5T+\2\u0239"+
		"\u023a\7)\2\2\u023a\u023b\t\3\2\2\u023b\u023d\3\2\2\2\u023c\u0229\3\2"+
		"\2\2\u023c\u022a\3\2\2\2\u023c\u022d\3\2\2\2\u023c\u0231\3\2\2\2\u023c"+
		"\u0233\3\2\2\2\u023c\u0237\3\2\2\2\u023dS\3\2\2\2\u023e\u023f\7!\2\2\u023f"+
		"\u0240\5P)\2\u0240\u0241\7\"\2\2\u0241U\3\2\2\2\u0242\u0243\5(\25\2\u0243"+
		"\u0244\7\'\2\2\u0244\u02af\3\2\2\2\u0245\u0246\5(\25\2\u0246\u0247\7\'"+
		"\2\2\u0247\u0248\t\3\2\2\u0248\u02af\3\2\2\2\u0249\u024a\5(\25\2\u024a"+
		"\u024b\7\'\2\2\u024b\u024c\7)\2\2\u024c\u02af\3\2\2\2\u024d\u024e\5(\25"+
		"\2\u024e\u024f\7\'\2\2\u024f\u0250\7)\2\2\u0250\u0251\t\3\2\2\u0251\u02af"+
		"\3\2\2\2\u0252\u0253\7\'\2\2\u0253\u02af\5*\26\2\u0254\u0255\7\'\2\2\u0255"+
		"\u0256\5*\26\2\u0256\u0257\t\3\2\2\u0257\u02af\3\2\2\2\u0258\u0259\7\'"+
		"\2\2\u0259\u025a\5*\26\2\u025a\u025b\7)\2\2\u025b\u02af\3\2\2\2\u025c"+
		"\u025d\7\'\2\2\u025d\u025e\5*\26\2\u025e\u025f\7)\2\2\u025f\u0260\t\3"+
		"\2\2\u0260\u02af\3\2\2\2\u0261\u02af\7+\2\2\u0262\u0263\7+\2\2\u0263\u02af"+
		"\t\3\2\2\u0264\u0265\7+\2\2\u0265\u02af\7)\2\2\u0266\u0267\7+\2\2\u0267"+
		"\u0268\7)\2\2\u0268\u02af\t\3\2\2\u0269\u02af\7,\2\2\u026a\u026b\7,\2"+
		"\2\u026b\u02af\t\3\2\2\u026c\u026d\7,\2\2\u026d\u02af\7)\2\2\u026e\u026f"+
		"\7,\2\2\u026f\u0270\7)\2\2\u0270\u02af\t\3\2\2\u0271\u02af\5.\30\2\u0272"+
		"\u0273\5.\30\2\u0273\u0274\t\3\2\2\u0274\u02af\3\2\2\2\u0275\u0276\5."+
		"\30\2\u0276\u0277\7)\2\2\u0277\u02af\3\2\2\2\u0278\u0279\5.\30\2\u0279"+
		"\u027a\7)\2\2\u027a\u027b\t\3\2\2\u027b\u02af\3\2\2\2\u027c\u027d\5X-"+
		"\2\u027d\u027e\7\30\2\2\u027e\u027f\5.\30\2\u027f\u02af\3\2\2\2\u0280"+
		"\u0281\5X-\2\u0281\u0282\7\30\2\2\u0282\u0283\5.\30\2\u0283\u0284\t\3"+
		"\2\2\u0284\u02af\3\2\2\2\u0285\u0286\5X-\2\u0286\u0287\7\30\2\2\u0287"+
		"\u0288\5.\30\2\u0288\u0289\7)\2\2\u0289\u02af\3\2\2\2\u028a\u028b\5X-"+
		"\2\u028b\u028c\7\30\2\2\u028c\u028d\5.\30\2\u028d\u028e\7)\2\2\u028e\u028f"+
		"\t\3\2\2\u028f\u02af\3\2\2\2\u0290\u02af\5\"\22\2\u0291\u0292\5\"\22\2"+
		"\u0292\u0293\t\3\2\2\u0293\u02af\3\2\2\2\u0294\u0295\5\"\22\2\u0295\u0296"+
		"\7)\2\2\u0296\u02af\3\2\2\2\u0297\u0298\5\"\22\2\u0298\u0299\7)\2\2\u0299"+
		"\u029a\t\3\2\2\u029a\u02af\3\2\2\2\u029b\u02af\7\'\2\2\u029c\u029d\7\'"+
		"\2\2\u029d\u02af\t\3\2\2\u029e\u029f\7\'\2\2\u029f\u02af\7)\2\2\u02a0"+
		"\u02a1\7\'\2\2\u02a1\u02a2\7)\2\2\u02a2\u02af\t\3\2\2\u02a3\u02af\5\u0092"+
		"J\2\u02a4\u02a5\5\u0092J\2\u02a5\u02a6\t\3\2\2\u02a6\u02af\3\2\2\2\u02a7"+
		"\u02a8\5\u0092J\2\u02a8\u02a9\7)\2\2\u02a9\u02af\3\2\2\2\u02aa\u02ab\5"+
		"\u0092J\2\u02ab\u02ac\7)\2\2\u02ac\u02ad\t\3\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u0242\3\2\2\2\u02ae\u0245\3\2\2\2\u02ae\u0249\3\2\2\2\u02ae\u024d\3\2"+
		"\2\2\u02ae\u0252\3\2\2\2\u02ae\u0254\3\2\2\2\u02ae\u0258\3\2\2\2\u02ae"+
		"\u025c\3\2\2\2\u02ae\u0261\3\2\2\2\u02ae\u0262\3\2\2\2\u02ae\u0264\3\2"+
		"\2\2\u02ae\u0266\3\2\2\2\u02ae\u0269\3\2\2\2\u02ae\u026a\3\2\2\2\u02ae"+
		"\u026c\3\2\2\2\u02ae\u026e\3\2\2\2\u02ae\u0271\3\2\2\2\u02ae\u0272\3\2"+
		"\2\2\u02ae\u0275\3\2\2\2\u02ae\u0278\3\2\2\2\u02ae\u027c\3\2\2\2\u02ae"+
		"\u0280\3\2\2\2\u02ae\u0285\3\2\2\2\u02ae\u028a\3\2\2\2\u02ae\u0290\3\2"+
		"\2\2\u02ae\u0291\3\2\2\2\u02ae\u0294\3\2\2\2\u02ae\u0297\3\2\2\2\u02ae"+
		"\u029b\3\2\2\2\u02ae\u029c\3\2\2\2\u02ae\u029e\3\2\2\2\u02ae\u02a0\3\2"+
		"\2\2\u02ae\u02a3\3\2\2\2\u02ae\u02a4\3\2\2\2\u02ae\u02a7\3\2\2\2\u02ae"+
		"\u02aa\3\2\2\2\u02afW\3\2\2\2\u02b0\u02b8\5\u0092J\2\u02b1\u02b2\5\u0092"+
		"J\2\u02b2\u02b3\7)\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b8\7\'\2\2\u02b5\u02b6"+
		"\7\'\2\2\u02b6\u02b8\7)\2\2\u02b7\u02b0\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b7"+
		"\u02b4\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8Y\3\2\2\2\u02b9\u02ba\7\b\2\2"+
		"\u02ba\u02bb\5\\/\2\u02bb\u02bc\7\37\2\2\u02bc\u02bd\7 \2\2\u02bd\u02cd"+
		"\3\2\2\2\u02be\u02bf\7\b\2\2\u02bf\u02c0\5\\/\2\u02c0\u02c1\7\37\2\2\u02c1"+
		"\u02c2\5f\64\2\u02c2\u02c3\7 \2\2\u02c3\u02cd\3\2\2\2\u02c4\u02c5\7\b"+
		"\2\2\u02c5\u02c6\5\\/\2\u02c6\u02c7\5,\27\2\u02c7\u02cd\3\2\2\2\u02c8"+
		"\u02c9\7\b\2\2\u02c9\u02ca\5\\/\2\u02ca\u02cb\5h\65\2\u02cb\u02cd\3\2"+
		"\2\2\u02cc\u02b9\3\2\2\2\u02cc\u02be\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc"+
		"\u02c8\3\2\2\2\u02cd[\3\2\2\2\u02ce\u02cf\7!\2\2\u02cf\u02d0\5^\60\2\u02d0"+
		"\u02d1\7\27\2\2\u02d1\u02d2\5`\61\2\u02d2\u02d3\7\27\2\2\u02d3\u02d4\5"+
		"b\62\2\u02d4\u02d5\7\"\2\2\u02d5\u02e1\3\2\2\2\u02d6\u02d7\5^\60\2\u02d7"+
		"\u02d8\7\27\2\2\u02d8\u02d9\5`\61\2\u02d9\u02da\7\27\2\2\u02da\u02db\5"+
		"b\62\2\u02db\u02e1\3\2\2\2\u02dc\u02e1\5P)\2\u02dd\u02de\7!\2\2\u02de"+
		"\u02e1\7\"\2\2\u02df\u02e1\3\2\2\2\u02e0\u02ce\3\2\2\2\u02e0\u02d6\3\2"+
		"\2\2\u02e0\u02dc\3\2\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1"+
		"]\3\2\2\2\u02e2\u02e5\5\24\13\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2"+
		"\2\u02e4\u02e3\3\2\2\2\u02e5_\3\2\2\2\u02e6\u02e9\5P)\2\u02e7\u02e9\3"+
		"\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9a\3\2\2\2\u02ea\u02ed"+
		"\5d\63\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed"+
		"c\3\2\2\2\u02ee\u02f9\5$\23\2\u02ef\u02f9\5\"\22\2\u02f0\u02f1\5$\23\2"+
		"\u02f1\u02f2\7\34\2\2\u02f2\u02f3\5d\63\2\u02f3\u02f9\3\2\2\2\u02f4\u02f5"+
		"\5\"\22\2\u02f5\u02f6\7\34\2\2\u02f6\u02f7\5d\63\2\u02f7\u02f9\3\2\2\2"+
		"\u02f8\u02ee\3\2\2\2\u02f8\u02ef\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f8\u02f4"+
		"\3\2\2\2\u02f9e\3\2\2\2\u02fa\u02ff\5\6\4\2\u02fb\u02fc\5\6\4\2\u02fc"+
		"\u02fd\5f\64\2\u02fd\u02ff\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02fb\3\2"+
		"\2\2\u02ffg\3\2\2\2\u0300\u0307\5Z.\2\u0301\u0302\5Z.\2\u0302\u0303\5"+
		"h\65\2\u0303\u0307\3\2\2\2\u0304\u0307\58\35\2\u0305\u0307\5j\66\2\u0306"+
		"\u0300\3\2\2\2\u0306\u0301\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2"+
		"\2\2\u0307i\3\2\2\2\u0308\u0309\7\t\2\2\u0309\u030a\5l\67\2\u030a\u030b"+
		"\7\27\2\2\u030bk\3\2\2\2\u030c\u0310\5\u009aN\2\u030d\u0310\5$\23\2\u030e"+
		"\u0310\5\"\22\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3"+
		"\2\2\2\u0310m\3\2\2\2\u0311\u0312\5r:\2\u0312\u0313\7\37\2\2\u0313\u0314"+
		"\7 \2\2\u0314\u0330\3\2\2\2\u0315\u0316\5r:\2\u0316\u0317\7\37\2\2\u0317"+
		"\u0318\5|?\2\u0318\u0319\7 \2\2\u0319\u0330\3\2\2\2\u031a\u031b\5t;\2"+
		"\u031b\u031c\7\37\2\2\u031c\u031d\7 \2\2\u031d\u0330\3\2\2\2\u031e\u031f"+
		"\5t;\2\u031f\u0320\7\37\2\2\u0320\u0321\5|?\2\u0321\u0322\7 \2\2\u0322"+
		"\u0330\3\2\2\2\u0323\u0324\5x=\2\u0324\u0325\7\37\2\2\u0325\u0326\7 \2"+
		"\2\u0326\u0330\3\2\2\2\u0327\u0328\5x=\2\u0328\u0329\7\37\2\2\u0329\u032a"+
		"\5|?\2\u032a\u032b\7 \2\2\u032b\u0330\3\2\2\2\u032c\u032d\5z>\2\u032d"+
		"\u032e\7\27\2\2\u032e\u0330\3\2\2\2\u032f\u0311\3\2\2\2\u032f\u0315\3"+
		"\2\2\2\u032f\u031a\3\2\2\2\u032f\u031e\3\2\2\2\u032f\u0323\3\2\2\2\u032f"+
		"\u0327\3\2\2\2\u032f\u032c\3\2\2\2\u0330o\3\2\2\2\u0331\u0332\7\n\2\2"+
		"\u0332\u0333\7\'\2\2\u0333\u0334\7!\2\2\u0334\u034a\7\"\2\2\u0335\u0336"+
		"\7\n\2\2\u0336\u0337\7\'\2\2\u0337\u0338\7!\2\2\u0338\u0339\7\"\2\2\u0339"+
		"\u033a\7\26\2\2\u033a\u034a\7\'\2\2\u033b\u033c\7\n\2\2\u033c\u033d\7"+
		"\'\2\2\u033d\u033e\7!\2\2\u033e\u033f\5~@\2\u033f\u0340\7\"\2\2\u0340"+
		"\u034a\3\2\2\2\u0341\u0342\7\n\2\2\u0342\u0343\7\'\2\2\u0343\u0344\7!"+
		"\2\2\u0344\u0345\5~@\2\u0345\u0346\7\"\2\2\u0346\u0347\7\26\2\2\u0347"+
		"\u0348\7\'\2\2\u0348\u034a\3\2\2\2\u0349\u0331\3\2\2\2\u0349\u0335\3\2"+
		"\2\2\u0349\u033b\3\2\2\2\u0349\u0341\3\2\2\2\u034aq\3\2\2\2\u034b\u034c"+
		"\5p9\2\u034cs\3\2\2\2\u034d\u034e\5v<\2\u034e\u034f\5p9\2\u034f\u0365"+
		"\3\2\2\2\u0350\u0351\7\16\2\2\u0351\u0365\5p9\2\u0352\u0353\5v<\2\u0353"+
		"\u0354\7\16\2\2\u0354\u0355\5p9\2\u0355\u0365\3\2\2\2\u0356\u0357\7\17"+
		"\2\2\u0357\u0358\5v<\2\u0358\u0359\7\16\2\2\u0359\u035a\5p9\2\u035a\u0365"+
		"\3\2\2\2\u035b\u035c\7\17\2\2\u035c\u035d\5v<\2\u035d\u035e\5p9\2\u035e"+
		"\u0365\3\2\2\2\u035f\u0360\7\17\2\2\u0360\u0365\5p9\2\u0361\u0362\7\17"+
		"\2\2\u0362\u0363\7\16\2\2\u0363\u0365\5p9\2\u0364\u034d\3\2\2\2\u0364"+
		"\u0350\3\2\2\2\u0364\u0352\3\2\2\2\u0364\u0356\3\2\2\2\u0364\u035b\3\2"+
		"\2\2\u0364\u035f\3\2\2\2\u0364\u0361\3\2\2\2\u0365u\3\2\2\2\u0366\u0367"+
		"\t\4\2\2\u0367w\3\2\2\2\u0368\u0369\7\'\2\2\u0369\u036a\7!\2\2\u036a\u0371"+
		"\7\"\2\2\u036b\u036c\7\'\2\2\u036c\u036d\7!\2\2\u036d\u036e\5~@\2\u036e"+
		"\u036f\7\"\2\2\u036f\u0371\3\2\2\2\u0370\u0368\3\2\2\2\u0370\u036b\3\2"+
		"\2\2\u0371y\3\2\2\2\u0372\u0375\5r:\2\u0373\u0375\5t;\2\u0374\u0372\3"+
		"\2\2\2\u0374\u0373\3\2\2\2\u0375{\3\2\2\2\u0376\u037b\5\6\4\2\u0377\u0378"+
		"\5\6\4\2\u0378\u0379\5|?\2\u0379\u037b\3\2\2\2\u037a\u0376\3\2\2\2\u037a"+
		"\u0377\3\2\2\2\u037b}\3\2\2\2\u037c\u0382\5\u0080A\2\u037d\u037e\5\u0080"+
		"A\2\u037e\u037f\7\34\2\2\u037f\u0380\5~@\2\u0380\u0382\3\2\2\2\u0381\u037c"+
		"\3\2\2\2\u0381\u037d\3\2\2\2\u0382\177\3\2\2\2\u0383\u0384\7\'\2\2\u0384"+
		"\u0385\7)\2\2\u0385\u0081\3\2\2\2\u0386\u038a\5\u0084C\2\u0387\u038a\5"+
		"\u0088E\2\u0388\u038a\5\u008cG\2\u0389\u0386\3\2\2\2\u0389\u0387\3\2\2"+
		"\2\u0389\u0388\3\2\2\2\u038a\u0083\3\2\2\2\u038b\u038c\5\u0086D\2\u038c"+
		"\u0085\3\2\2\2\u038d\u038e\7\20\2\2\u038e\u038f\7\'\2\2\u038f\u0390\7"+
		"\37\2\2\u0390\u03a6\7 \2\2\u0391\u0392\7\20\2\2\u0392\u0393\7\'\2\2\u0393"+
		"\u0394\7\37\2\2\u0394\u0395\5|?\2\u0395\u0396\7 \2\2\u0396\u03a6\3\2\2"+
		"\2\u0397\u0398\7\20\2\2\u0398\u0399\7\'\2\2\u0399\u039a\7\22\2\2\u039a"+
		"\u039b\7\'\2\2\u039b\u039c\7\37\2\2\u039c\u03a6\7 \2\2\u039d\u039e\7\20"+
		"\2\2\u039e\u039f\7\'\2\2\u039f\u03a0\7\22\2\2\u03a0\u03a1\7\'\2\2\u03a1"+
		"\u03a2\7\37\2\2\u03a2\u03a3\5|?\2\u03a3\u03a4\7 \2\2\u03a4\u03a6\3\2\2"+
		"\2\u03a5\u038d\3\2\2\2\u03a5\u0391\3\2\2\2\u03a5\u0397\3\2\2\2\u03a5\u039d"+
		"\3\2\2\2\u03a6\u0087\3\2\2\2\u03a7\u03a8\5\u008aF\2\u03a8\u0089\3\2\2"+
		"\2\u03a9\u03aa\7\21\2\2\u03aa\u03ab\7\'\2\2\u03ab\u03ac\7\37\2\2\u03ac"+
		"\u03c2\7 \2\2\u03ad\u03ae\7\21\2\2\u03ae\u03af\7\'\2\2\u03af\u03b0\7\37"+
		"\2\2\u03b0\u03b1\5|?\2\u03b1\u03b2\7 \2\2\u03b2\u03c2\3\2\2\2\u03b3\u03b4"+
		"\7\21\2\2\u03b4\u03b5\7\'\2\2\u03b5\u03b6\7\22\2\2\u03b6\u03b7\7\'\2\2"+
		"\u03b7\u03b8\7\37\2\2\u03b8\u03c2\7 \2\2\u03b9\u03ba\7\21\2\2\u03ba\u03bb"+
		"\7\'\2\2\u03bb\u03bc\7\22\2\2\u03bc\u03bd\7\'\2\2\u03bd\u03be\7\37\2\2"+
		"\u03be\u03bf\5|?\2\u03bf\u03c0\7 \2\2\u03c0\u03c2\3\2\2\2\u03c1\u03a9"+
		"\3\2\2\2\u03c1\u03ad\3\2\2\2\u03c1\u03b3\3\2\2\2\u03c1\u03b9\3\2\2\2\u03c2"+
		"\u008b\3\2\2\2\u03c3\u03c4\5\u008eH\2\u03c4\u03c5\7\37\2\2\u03c5\u03c6"+
		"\7 \2\2\u03c6\u03cd\3\2\2\2\u03c7\u03c8\5\u008eH\2\u03c8\u03c9\7\37\2"+
		"\2\u03c9\u03ca\5|?\2\u03ca\u03cb\7 \2\2\u03cb\u03cd\3\2\2\2\u03cc\u03c3"+
		"\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cd\u008d\3\2\2\2\u03ce\u03d2\5\u0090I"+
		"\2\u03cf\u03d0\7\17\2\2\u03d0\u03d2\5\u0090I\2\u03d1\u03ce\3\2\2\2\u03d1"+
		"\u03cf\3\2\2\2\u03d2\u008f\3\2\2\2\u03d3\u03d4\7\23\2\2\u03d4\u03e4\7"+
		"\'\2\2\u03d5\u03d6\7\23\2\2\u03d6\u03d7\7\'\2\2\u03d7\u03d8\7\22\2\2\u03d8"+
		"\u03e4\7\'\2\2\u03d9\u03da\7\23\2\2\u03da\u03db\7\'\2\2\u03db\u03dc\7"+
		"\24\2\2\u03dc\u03e4\7\'\2\2\u03dd\u03de\7\23\2\2\u03de\u03df\7\'\2\2\u03df"+
		"\u03e0\7\22\2\2\u03e0\u03e1\7\'\2\2\u03e1\u03e2\7\24\2\2\u03e2\u03e4\7"+
		"\'\2\2\u03e3\u03d3\3\2\2\2\u03e3\u03d5\3\2\2\2\u03e3\u03d9\3\2\2\2\u03e3"+
		"\u03dd\3\2\2\2\u03e4\u0091\3\2\2\2\u03e5\u03ea\5\u0094K\2\u03e6\u03e7"+
		"\5\u0094K\2\u03e7\u03e8\5\u0092J\2\u03e8\u03ea\3\2\2\2\u03e9\u03e5\3\2"+
		"\2\2\u03e9\u03e6\3\2\2\2\u03ea\u0093\3\2\2\2\u03eb\u03f5\7\'\2\2\u03ec"+
		"\u03ed\7\'\2\2\u03ed\u03f5\7\31\2\2\u03ee\u03ef\7\'\2\2\u03ef\u03f5\5"+
		"\u0096L\2\u03f0\u03f1\7\'\2\2\u03f1\u03f2\5\u0096L\2\u03f2\u03f3\7\31"+
		"\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f4\u03ec\3\2\2\2\u03f4"+
		"\u03ee\3\2\2\2\u03f4\u03f0\3\2\2\2\u03f5\u0095\3\2\2\2\u03f6\u03f7\7\35"+
		"\2\2\u03f7\u03f8\5\u0098M\2\u03f8\u03f9\7\36\2\2\u03f9\u0400\3\2\2\2\u03fa"+
		"\u03fb\7\35\2\2\u03fb\u03fc\5\u0098M\2\u03fc\u03fd\7\36\2\2\u03fd\u03fe"+
		"\5\u0096L\2\u03fe\u0400\3\2\2\2\u03ff\u03f6\3\2\2\2\u03ff\u03fa\3\2\2"+
		"\2\u0400\u0097\3\2\2\2\u0401\u0402\5$\23\2\u0402\u0099\3\2\2\2\u0403\u041b"+
		"\7\'\2\2\u0404\u0405\7\'\2\2\u0405\u041b\7)\2\2\u0406\u041b\7+\2\2\u0407"+
		"\u0408\7+\2\2\u0408\u041b\7)\2\2\u0409\u041b\7,\2\2\u040a\u040b\7,\2\2"+
		"\u040b\u041b\7)\2\2\u040c\u041b\7*\2\2\u040d\u041b\5\32\16\2\u040e\u041b"+
		"\5\36\20\2\u040f\u041b\5$\23\2\u0410\u041b\5.\30\2\u0411\u0412\5\u009c"+
		"O\2\u0412\u0413\7\31\2\2\u0413\u0414\5\u009eP\2\u0414\u041b\3\2\2\2\u0415"+
		"\u0416\5\u009cO\2\u0416\u0417\7\33\2\2\u0417\u0418\5\u009eP\2\u0418\u041b"+
		"\3\2\2\2\u0419\u041b\5\u0092J\2\u041a\u0403\3\2\2\2\u041a\u0404\3\2\2"+
		"\2\u041a\u0406\3\2\2\2\u041a\u0407\3\2\2\2\u041a\u0409\3\2\2\2\u041a\u040a"+
		"\3\2\2\2\u041a\u040c\3\2\2\2\u041a\u040d\3\2\2\2\u041a\u040e\3\2\2\2\u041a"+
		"\u040f\3\2\2\2\u041a\u0410\3\2\2\2\u041a\u0411\3\2\2\2\u041a\u0415\3\2"+
		"\2\2\u041a\u0419\3\2\2\2\u041b\u009b\3\2\2\2\u041c\u041d\7\'\2\2\u041d"+
		"\u009d\3\2\2\2\u041e\u041f\7\'\2\2\u041f\u009f\3\2\2\2\67\u00a8\u00b4"+
		"\u00c1\u00f6\u00fd\u010e\u011c\u0124\u012b\u0133\u013e\u0148\u01a2\u01be"+
		"\u01ca\u01d6\u01dc\u01e9\u01f3\u0208\u020e\u0216\u021d\u0227\u023c\u02ae"+
		"\u02b7\u02cc\u02e0\u02e4\u02e8\u02ec\u02f8\u02fe\u0306\u030f\u032f\u0349"+
		"\u0364\u0370\u0374\u037a\u0381\u0389\u03a5\u03c1\u03cc\u03d1\u03e3\u03e9"+
		"\u03f4\u03ff\u041a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}