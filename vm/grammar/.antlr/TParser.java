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
		RULE_conditionExpBlockItem = 40, RULE_conditionalExpValue = 41, RULE_identifierAttrFn = 42, 
		RULE_loop = 43, RULE_loopExpression = 44, RULE_loopOneMembers = 45, RULE_loopTwoMembers = 46, 
		RULE_loopThreeMembers = 47, RULE_loopThreeMembersValues = 48, RULE_loopBlockElements = 49, 
		RULE_loopBlockElementsLimited = 50, RULE_ret = 51, RULE_retValues = 52, 
		RULE_functions = 53, RULE_functionGeneralModes = 54, RULE_functionsModes = 55, 
		RULE_functionMethodsModes = 56, RULE_methodPerm = 57, RULE_constructClassMethod = 58, 
		RULE_interfaceMethod = 59, RULE_functionCodeBlock = 60, RULE_functionParams = 61, 
		RULE_functionParamElements = 62, RULE_oopGeneral = 63, RULE_interfaceClass = 64, 
		RULE_interfaceClassDefinition = 65, RULE_abstractClass = 66, RULE_abstractClassDefinition = 67, 
		RULE_classDefination = 68, RULE_classModesGeneral = 69, RULE_classModes = 70, 
		RULE_arrayAccessElements = 71, RULE_arrayAccessElementsItems = 72, RULE_accessBlockAr = 73, 
		RULE_arrayIndexAccess = 74, RULE_generalValue = 75, RULE_objIdentifierA = 76, 
		RULE_objIdentifierB = 77;
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
			"conditionExpBlockItem", "conditionalExpValue", "identifierAttrFn", "loop", 
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
			setState(156);
			fileContent(0);
			setState(157);
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
			setState(164);
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
					setState(160);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(161);
					sentence();
					}
					} 
				}
				setState(166);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
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
			setState(178);
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
			setState(180);
			match(Use);
			setState(181);
			useValue();
			setState(182);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				useString();
				setState(186);
				match(Separator);
				setState(187);
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
			setState(191);
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
			setState(193);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(Var);
				setState(196);
				variableMembers();
				setState(197);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				methodPerm();
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(Final);
				setState(216);
				methodPerm();
				setState(217);
				match(Static);
				setState(218);
				match(Var);
				setState(219);
				variableMembers();
				setState(220);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(Final);
				setState(223);
				methodPerm();
				setState(224);
				match(Var);
				setState(225);
				variableMembers();
				setState(226);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(Final);
				setState(229);
				match(Var);
				setState(230);
				variableMembers();
				setState(231);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				match(Final);
				setState(234);
				match(Static);
				setState(235);
				match(Var);
				setState(236);
				variableMembers();
				setState(237);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				variableMembers();
				setState(240);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				variableDefinition();
				setState(246);
				match(Separator);
				setState(247);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(Identifier);
				setState(252);
				variableDefinitionGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				objIdentifierA();
				setState(254);
				match(Point);
				setState(255);
				objIdentifierB();
				setState(256);
				variableDefinitionGeneral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				objIdentifierA();
				setState(259);
				match(TwoTwoPoint);
				setState(260);
				objIdentifierB();
				setState(261);
				variableDefinitionGeneral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				arrayAccessElements();
				setState(264);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				generalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
				match(New);
				setState(275);
				generalValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(New);
				setState(279);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(OpenArIndex);
				setState(283);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(OpenArIndex);
				setState(285);
				indexArrayElements();
				setState(286);
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
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				generalValue();
				setState(292);
				match(Separator);
				setState(293);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(OpenBlock);
				setState(298);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(OpenBlock);
				setState(300);
				associativeArrayElements();
				setState(301);
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(Identifier);
				setState(306);
				match(TwoPoint);
				setState(307);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(Identifier);
				setState(309);
				match(TwoPoint);
				setState(310);
				generalValue();
				setState(311);
				match(Separator);
				setState(312);
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
			setState(316);
			match(OpenOp);
			setState(317);
			operationElements();
			setState(318);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				operationValue();
				setState(322);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				functionCall();
				setState(328);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				functionCall();
				setState(331);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				functionCall();
				setState(334);
				match(TypeSpec);
				setState(335);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(Identifier);
				setState(339);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				match(Identifier);
				setState(341);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(342);
				match(Identifier);
				setState(343);
				match(TypeSpec);
				setState(344);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(345);
				firstIncDec();
				setState(346);
				match(Identifier);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				firstIncDec();
				setState(349);
				match(Identifier);
				setState(350);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(352);
				firstIncDec();
				setState(353);
				match(Identifier);
				setState(354);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(356);
				firstIncDec();
				setState(357);
				match(Identifier);
				setState(358);
				match(TypeSpec);
				setState(359);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(361);
				match(Identifier);
				setState(362);
				lastIncDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(363);
				match(Identifier);
				setState(364);
				lastIncDec();
				setState(365);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(367);
				match(Identifier);
				setState(368);
				lastIncDec();
				setState(369);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(371);
				match(Identifier);
				setState(372);
				lastIncDec();
				setState(373);
				match(TypeSpec);
				setState(374);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(376);
				match(Integer);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(377);
				match(Integer);
				setState(378);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(379);
				match(Integer);
				setState(380);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(381);
				match(Integer);
				setState(382);
				match(TypeSpec);
				setState(383);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(384);
				match(Float);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(385);
				match(Float);
				setState(386);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(387);
				match(Float);
				setState(388);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(389);
				match(Float);
				setState(390);
				match(TypeSpec);
				setState(391);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(392);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(393);
				operationBlock();
				setState(394);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(396);
				operationBlock();
				setState(397);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(399);
				operationBlock();
				setState(400);
				match(TypeSpec);
				setState(401);
				match(ArithmeticOperator);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(403);
				arrayAccessElements();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(404);
				arrayAccessElements();
				setState(405);
				match(ArithmeticOperator);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(407);
				arrayAccessElements();
				setState(408);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(410);
				arrayAccessElements();
				setState(411);
				match(TypeSpec);
				setState(412);
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
			setState(416);
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
			setState(420);
			functionCall();
			setState(421);
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
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(Identifier);
				setState(424);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(Identifier);
				setState(426);
				match(Point);
				setState(427);
				identifierB();
				setState(428);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(Identifier);
				setState(431);
				match(TwoTwoPoint);
				setState(432);
				identifierB();
				setState(433);
				functionCallParam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(Identifier);
				setState(436);
				match(Point);
				setState(437);
				identifierB();
				setState(438);
				functionCallParam();
				setState(439);
				pointSeparator();
				setState(440);
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
			setState(444);
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
			setState(446);
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(OpenOp);
				setState(449);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(OpenOp);
				setState(451);
				functionCallParamElements();
				setState(452);
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				generalValue();
				setState(458);
				match(Separator);
				setState(459);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				operationElements();
				setState(463);
				match(Separator);
				setState(464);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				conditionalExpressionStructBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				conditionalExpressionStructBlock();
				setState(470);
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
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				ifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				ifElementUnique();
				setState(476);
				elifElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				ifElementUnique();
				setState(479);
				elseElementUnique();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				ifElementUnique();
				setState(482);
				elifElements();
				setState(483);
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
			setState(487);
			match(If);
			setState(488);
			conditionalExpressionItems();
			setState(489);
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				elifElementUnique();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				elifElementUnique();
				setState(493);
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
			setState(497);
			match(Elif);
			setState(498);
			conditionalExpressionItems();
			setState(499);
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
			setState(501);
			match(Else);
			setState(502);
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
			setState(504);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(OpenBlock);
				setState(507);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(OpenBlock);
				setState(509);
				conditionalBlockElsItems();
				setState(510);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(515);
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
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				sentence();
				setState(520);
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				conditionExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				conditionExpValue();
				setState(526);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				conditionExpBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				conditionExpBlock();
				setState(530);
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
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(Not);
				setState(535);
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
				setState(536);
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
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				conditionExpBlockItemValue();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(Not);
				setState(541);
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
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				conditionExpBlockItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				conditionExpBlockItem();
				setState(546);
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
				setState(548);
				conditionExpBlockItem();
				setState(549);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(554);
			match(OpenOp);
			setState(555);
			conditionalExpressionElements();
			setState(556);
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
		enterRule(_localctx, 82, RULE_conditionalExpValue);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				firstIncDec();
				setState(559);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				firstIncDec();
				setState(562);
				match(Identifier);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				firstIncDec();
				setState(566);
				match(Identifier);
				setState(567);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				firstIncDec();
				setState(570);
				match(Identifier);
				setState(571);
				match(TypeSpec);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(Identifier);
				setState(575);
				lastIncDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(576);
				match(Identifier);
				setState(577);
				lastIncDec();
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580);
				match(Identifier);
				setState(581);
				lastIncDec();
				setState(582);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(584);
				match(Identifier);
				setState(585);
				lastIncDec();
				setState(586);
				match(TypeSpec);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(589);
				match(Integer);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(590);
				match(Integer);
				setState(591);
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
				setState(592);
				match(Integer);
				setState(593);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(594);
				match(Integer);
				setState(595);
				match(TypeSpec);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(597);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(598);
				match(Float);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(600);
				match(Float);
				setState(601);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(602);
				match(Float);
				setState(603);
				match(TypeSpec);
				setState(604);
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
				setState(605);
				functionCall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(606);
				functionCall();
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
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(609);
				functionCall();
				setState(610);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(612);
				functionCall();
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
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(616);
				identifierAttrFn();
				setState(617);
				match(Attr);
				setState(618);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(620);
				identifierAttrFn();
				setState(621);
				match(Attr);
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
				identifierAttrFn();
				setState(626);
				match(Attr);
				setState(627);
				functionCall();
				setState(628);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(630);
				identifierAttrFn();
				setState(631);
				match(Attr);
				setState(632);
				functionCall();
				setState(633);
				match(TypeSpec);
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(636);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(637);
				operationBlock();
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
				operationBlock();
				setState(641);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(643);
				operationBlock();
				setState(644);
				match(TypeSpec);
				setState(645);
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
				setState(647);
				match(Identifier);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(648);
				match(Identifier);
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(650);
				match(Identifier);
				setState(651);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(652);
				match(Identifier);
				setState(653);
				match(TypeSpec);
				setState(654);
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
				setState(655);
				arrayAccessElements();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(656);
				arrayAccessElements();
				setState(657);
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
				setState(659);
				arrayAccessElements();
				setState(660);
				match(TypeSpec);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(662);
				arrayAccessElements();
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_identifierAttrFn);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				arrayAccessElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				arrayAccessElements();
				setState(670);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(Identifier);
				setState(674);
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
		enterRule(_localctx, 86, RULE_loop);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(For);
				setState(678);
				loopExpression();
				setState(679);
				match(OpenBlock);
				setState(680);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(For);
				setState(683);
				loopExpression();
				setState(684);
				match(OpenBlock);
				setState(685);
				loopBlockElements();
				setState(686);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(For);
				setState(689);
				loopExpression();
				setState(690);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				match(For);
				setState(693);
				loopExpression();
				setState(694);
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
		enterRule(_localctx, 88, RULE_loopExpression);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(OpenOp);
				setState(699);
				loopOneMembers();
				setState(700);
				match(End);
				setState(701);
				loopTwoMembers();
				setState(702);
				match(End);
				setState(703);
				loopThreeMembers();
				setState(704);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				loopOneMembers();
				setState(707);
				match(End);
				setState(708);
				loopTwoMembers();
				setState(709);
				match(End);
				setState(710);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				match(OpenOp);
				setState(714);
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
		enterRule(_localctx, 90, RULE_loopOneMembers);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
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
		enterRule(_localctx, 92, RULE_loopTwoMembers);
		try {
			setState(724);
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
				setState(722);
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
		enterRule(_localctx, 94, RULE_loopThreeMembers);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
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
		enterRule(_localctx, 96, RULE_loopThreeMembersValues);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				operationElements();
				setState(733);
				match(Separator);
				setState(734);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				operationBlock();
				setState(737);
				match(Separator);
				setState(738);
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
		enterRule(_localctx, 98, RULE_loopBlockElements);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				sentence();
				setState(744);
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
		enterRule(_localctx, 100, RULE_loopBlockElementsLimited);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				loop();
				setState(750);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				conditionalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(753);
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
		enterRule(_localctx, 102, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(Ret);
			setState(757);
			retValues();
			setState(758);
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
		enterRule(_localctx, 104, RULE_retValues);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
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
		enterRule(_localctx, 106, RULE_functions);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				functionsModes();
				setState(766);
				match(OpenBlock);
				setState(767);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				functionsModes();
				setState(770);
				match(OpenBlock);
				setState(771);
				functionCodeBlock();
				setState(772);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				functionMethodsModes();
				setState(775);
				match(OpenBlock);
				setState(776);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				functionMethodsModes();
				setState(779);
				match(OpenBlock);
				setState(780);
				functionCodeBlock();
				setState(781);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				constructClassMethod();
				setState(784);
				match(OpenBlock);
				setState(785);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(787);
				constructClassMethod();
				setState(788);
				match(OpenBlock);
				setState(789);
				functionCodeBlock();
				setState(790);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(792);
				interfaceMethod();
				setState(793);
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
		enterRule(_localctx, 108, RULE_functionGeneralModes);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(Function);
				setState(798);
				match(Identifier);
				setState(799);
				match(OpenOp);
				setState(800);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(Function);
				setState(802);
				match(Identifier);
				setState(803);
				match(OpenOp);
				setState(804);
				match(CloseOp);
				setState(805);
				match(ArrowRight);
				setState(806);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(Function);
				setState(808);
				match(Identifier);
				setState(809);
				match(OpenOp);
				setState(810);
				functionParams();
				setState(811);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(813);
				match(Function);
				setState(814);
				match(Identifier);
				setState(815);
				match(OpenOp);
				setState(816);
				functionParams();
				setState(817);
				match(CloseOp);
				setState(818);
				match(ArrowRight);
				setState(819);
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
		enterRule(_localctx, 110, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
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
		enterRule(_localctx, 112, RULE_functionMethodsModes);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				methodPerm();
				setState(826);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(Static);
				setState(829);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				methodPerm();
				setState(831);
				match(Static);
				setState(832);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				match(Final);
				setState(835);
				methodPerm();
				setState(836);
				match(Static);
				setState(837);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(839);
				match(Final);
				setState(840);
				methodPerm();
				setState(841);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(843);
				match(Final);
				setState(844);
				functionGeneralModes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(845);
				match(Final);
				setState(846);
				match(Static);
				setState(847);
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
		enterRule(_localctx, 114, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		enterRule(_localctx, 116, RULE_constructClassMethod);
		try {
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(Identifier);
				setState(853);
				match(OpenOp);
				setState(854);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(Identifier);
				setState(856);
				match(OpenOp);
				setState(857);
				functionParams();
				setState(858);
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
		enterRule(_localctx, 118, RULE_interfaceMethod);
		try {
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
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
				setState(863);
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
		enterRule(_localctx, 120, RULE_functionCodeBlock);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				sentence();
				setState(868);
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
		enterRule(_localctx, 122, RULE_functionParams);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				functionParamElements();
				setState(874);
				match(Separator);
				setState(875);
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
		enterRule(_localctx, 124, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(Identifier);
			setState(880);
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
		enterRule(_localctx, 126, RULE_oopGeneral);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
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
		enterRule(_localctx, 128, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
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
		enterRule(_localctx, 130, RULE_interfaceClassDefinition);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(Interface);
				setState(890);
				match(Identifier);
				setState(891);
				match(OpenBlock);
				setState(892);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(Interface);
				setState(894);
				match(Identifier);
				setState(895);
				match(OpenBlock);
				setState(896);
				functionCodeBlock();
				setState(897);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				match(Interface);
				setState(900);
				match(Identifier);
				setState(901);
				match(Extends);
				setState(902);
				match(Identifier);
				setState(903);
				match(OpenBlock);
				setState(904);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				match(Interface);
				setState(906);
				match(Identifier);
				setState(907);
				match(Extends);
				setState(908);
				match(Identifier);
				setState(909);
				match(OpenBlock);
				setState(910);
				functionCodeBlock();
				setState(911);
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
		enterRule(_localctx, 132, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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
		enterRule(_localctx, 134, RULE_abstractClassDefinition);
		try {
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(Abstract);
				setState(918);
				match(Identifier);
				setState(919);
				match(OpenBlock);
				setState(920);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(Abstract);
				setState(922);
				match(Identifier);
				setState(923);
				match(OpenBlock);
				setState(924);
				functionCodeBlock();
				setState(925);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				match(Abstract);
				setState(928);
				match(Identifier);
				setState(929);
				match(Extends);
				setState(930);
				match(Identifier);
				setState(931);
				match(OpenBlock);
				setState(932);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(933);
				match(Abstract);
				setState(934);
				match(Identifier);
				setState(935);
				match(Extends);
				setState(936);
				match(Identifier);
				setState(937);
				match(OpenBlock);
				setState(938);
				functionCodeBlock();
				setState(939);
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
		enterRule(_localctx, 136, RULE_classDefination);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				classModesGeneral();
				setState(944);
				match(OpenBlock);
				setState(945);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				classModesGeneral();
				setState(948);
				match(OpenBlock);
				setState(949);
				functionCodeBlock();
				setState(950);
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
		enterRule(_localctx, 138, RULE_classModesGeneral);
		try {
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(Final);
				setState(956);
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
		enterRule(_localctx, 140, RULE_classModes);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(Class);
				setState(960);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				match(Class);
				setState(962);
				match(Identifier);
				setState(963);
				match(Extends);
				setState(964);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				match(Class);
				setState(966);
				match(Identifier);
				setState(967);
				match(Implements);
				setState(968);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				match(Class);
				setState(970);
				match(Identifier);
				setState(971);
				match(Extends);
				setState(972);
				match(Identifier);
				setState(973);
				match(Implements);
				setState(974);
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
		enterRule(_localctx, 142, RULE_arrayAccessElements);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				arrayAccessElementsItems();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				arrayAccessElementsItems();
				setState(979);
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
		enterRule(_localctx, 144, RULE_arrayAccessElementsItems);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				match(Identifier);
				setState(985);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				match(Identifier);
				setState(987);
				accessBlockAr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(988);
				match(Identifier);
				setState(989);
				accessBlockAr();
				setState(990);
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
		enterRule(_localctx, 146, RULE_accessBlockAr);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(OpenArIndex);
				setState(995);
				arrayIndexAccess();
				setState(996);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(OpenArIndex);
				setState(999);
				arrayIndexAccess();
				setState(1000);
				match(CloseArIndex);
				setState(1001);
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
		enterRule(_localctx, 148, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
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
		enterRule(_localctx, 150, RULE_generalValue);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(Identifier);
				setState(1009);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1011);
				match(Integer);
				setState(1012);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1013);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1014);
				match(Float);
				setState(1015);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1016);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1017);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1018);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1019);
				operationElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1020);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1021);
				objIdentifierA();
				setState(1022);
				match(Point);
				setState(1023);
				objIdentifierB();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1025);
				objIdentifierA();
				setState(1026);
				match(TwoTwoPoint);
				setState(1027);
				objIdentifierB();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1029);
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
		enterRule(_localctx, 152, RULE_objIdentifierA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 154, RULE_objIdentifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u040f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u00a5"+
		"\n\3\f\3\16\3\u00a8\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b3"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c0\n\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f5\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00fc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0123\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u012a\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0132\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u013d\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0147"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01a1\n\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01bd\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01c9\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01d5\n\34\3\35\3\35\3\35\3\35\5\35\u01db\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01e8"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01f2\n \3!\3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0207\n$\3%\3%\3%\3%\5%\u020d"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0217\n&\3\'\3\'\3\'\5\'\u021c\n\'\3(\3"+
		"(\3(\5(\u0221\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u022b\n)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u029d\n+\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u02a6\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u02bb\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\5.\u02cf\n.\3/\3/\5/\u02d3\n/\3\60\3\60\5\60\u02d7\n\60\3\61\3\61"+
		"\5\61\u02db\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u02e7\n\62\3\63\3\63\3\63\3\63\5\63\u02ed\n\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u02f5\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u02fe"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u031e\n\67\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\58\u0338\n8\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0353\n:\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\5<\u035f\n<\3=\3=\5=\u0363\n=\3>\3>\3>\3>\5"+
		">\u0369\n>\3?\3?\3?\3?\3?\5?\u0370\n?\3@\3@\3@\3A\3A\3A\5A\u0378\nA\3"+
		"B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u0394\nC\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u03b0\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\5"+
		"F\u03bb\nF\3G\3G\3G\5G\u03c0\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\5H\u03d2\nH\3I\3I\3I\3I\5I\u03d8\nI\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\5J\u03e3\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03ee\nK\3L\3L\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0409"+
		"\nM\3N\3N\3O\3O\3O\2\3\4P\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\2\5\4\2\30\30$$\3\2#$\3\2\13\r\2\u0481\2\u009e\3\2\2\2\4\u00a1\3\2\2"+
		"\2\6\u00b2\3\2\2\2\b\u00b4\3\2\2\2\n\u00b6\3\2\2\2\f\u00bf\3\2\2\2\16"+
		"\u00c1\3\2\2\2\20\u00c3\3\2\2\2\22\u00f4\3\2\2\2\24\u00fb\3\2\2\2\26\u010c"+
		"\3\2\2\2\30\u011a\3\2\2\2\32\u0122\3\2\2\2\34\u0129\3\2\2\2\36\u0131\3"+
		"\2\2\2 \u013c\3\2\2\2\"\u013e\3\2\2\2$\u0146\3\2\2\2&\u01a0\3\2\2\2(\u01a2"+
		"\3\2\2\2*\u01a4\3\2\2\2,\u01a6\3\2\2\2.\u01bc\3\2\2\2\60\u01be\3\2\2\2"+
		"\62\u01c0\3\2\2\2\64\u01c8\3\2\2\2\66\u01d4\3\2\2\28\u01da\3\2\2\2:\u01e7"+
		"\3\2\2\2<\u01e9\3\2\2\2>\u01f1\3\2\2\2@\u01f3\3\2\2\2B\u01f7\3\2\2\2D"+
		"\u01fa\3\2\2\2F\u0206\3\2\2\2H\u020c\3\2\2\2J\u0216\3\2\2\2L\u021b\3\2"+
		"\2\2N\u0220\3\2\2\2P\u022a\3\2\2\2R\u022c\3\2\2\2T\u029c\3\2\2\2V\u02a5"+
		"\3\2\2\2X\u02ba\3\2\2\2Z\u02ce\3\2\2\2\\\u02d2\3\2\2\2^\u02d6\3\2\2\2"+
		"`\u02da\3\2\2\2b\u02e6\3\2\2\2d\u02ec\3\2\2\2f\u02f4\3\2\2\2h\u02f6\3"+
		"\2\2\2j\u02fd\3\2\2\2l\u031d\3\2\2\2n\u0337\3\2\2\2p\u0339\3\2\2\2r\u0352"+
		"\3\2\2\2t\u0354\3\2\2\2v\u035e\3\2\2\2x\u0362\3\2\2\2z\u0368\3\2\2\2|"+
		"\u036f\3\2\2\2~\u0371\3\2\2\2\u0080\u0377\3\2\2\2\u0082\u0379\3\2\2\2"+
		"\u0084\u0393\3\2\2\2\u0086\u0395\3\2\2\2\u0088\u03af\3\2\2\2\u008a\u03ba"+
		"\3\2\2\2\u008c\u03bf\3\2\2\2\u008e\u03d1\3\2\2\2\u0090\u03d7\3\2\2\2\u0092"+
		"\u03e2\3\2\2\2\u0094\u03ed\3\2\2\2\u0096\u03ef\3\2\2\2\u0098\u0408\3\2"+
		"\2\2\u009a\u040a\3\2\2\2\u009c\u040c\3\2\2\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a0\7\2\2\3\u00a0\3\3\2\2\2\u00a1\u00a6\b\3\1\2\u00a2\u00a3\f\4\2\2"+
		"\u00a3\u00a5\5\6\4\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b3\5\b\5\2\u00aa\u00b3\5\n\6\2\u00ab\u00b3\5\20\t\2\u00ac\u00b3\5"+
		",\27\2\u00ad\u00b3\58\35\2\u00ae\u00b3\5X-\2\u00af\u00b3\5l\67\2\u00b0"+
		"\u00b3\5h\65\2\u00b1\u00b3\5\u0080A\2\u00b2\u00a9\3\2\2\2\u00b2\u00aa"+
		"\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\7\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5\t\3\2\2\2\u00b6\u00b7\7"+
		"\3\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\27\2\2\u00b9\13\3\2\2\2\u00ba"+
		"\u00c0\5\16\b\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\7\34\2\2\u00bd\u00be"+
		"\5\f\7\2\u00be\u00c0\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"\r\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\5\22\n\2\u00c4"+
		"\21\3\2\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\27"+
		"\2\2\u00c8\u00f5\3\2\2\2\u00c9\u00ca\5t;\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc"+
		"\5\24\13\2\u00cc\u00cd\7\27\2\2\u00cd\u00f5\3\2\2\2\u00ce\u00cf\7\16\2"+
		"\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\27\2\2\u00d2"+
		"\u00f5\3\2\2\2\u00d3\u00d4\5t;\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7\4"+
		"\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\7\27\2\2\u00d8\u00f5\3\2\2\2\u00d9"+
		"\u00da\7\17\2\2\u00da\u00db\5t;\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\7\4"+
		"\2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7\27\2\2\u00df\u00f5\3\2\2\2\u00e0"+
		"\u00e1\7\17\2\2\u00e1\u00e2\5t;\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\24"+
		"\13\2\u00e4\u00e5\7\27\2\2\u00e5\u00f5\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7"+
		"\u00e8\7\4\2\2\u00e8\u00e9\5\24\13\2\u00e9\u00ea\7\27\2\2\u00ea\u00f5"+
		"\3\2\2\2\u00eb\u00ec\7\17\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7\4\2\2"+
		"\u00ee\u00ef\5\24\13\2\u00ef\u00f0\7\27\2\2\u00f0\u00f5\3\2\2\2\u00f1"+
		"\u00f2\5\24\13\2\u00f2\u00f3\7\27\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00c5"+
		"\3\2\2\2\u00f4\u00c9\3\2\2\2\u00f4\u00ce\3\2\2\2\u00f4\u00d3\3\2\2\2\u00f4"+
		"\u00d9\3\2\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00eb\3\2"+
		"\2\2\u00f4\u00f1\3\2\2\2\u00f5\23\3\2\2\2\u00f6\u00fc\5\26\f\2\u00f7\u00f8"+
		"\5\26\f\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\25\3\2\2\2\u00fd\u00fe"+
		"\7\'\2\2\u00fe\u010d\5\30\r\2\u00ff\u0100\5\u009aN\2\u0100\u0101\7\31"+
		"\2\2\u0101\u0102\5\u009cO\2\u0102\u0103\5\30\r\2\u0103\u010d\3\2\2\2\u0104"+
		"\u0105\5\u009aN\2\u0105\u0106\7\33\2\2\u0106\u0107\5\u009cO\2\u0107\u0108"+
		"\5\30\r\2\u0108\u010d\3\2\2\2\u0109\u010a\5\u0090I\2\u010a\u010b\5\30"+
		"\r\2\u010b\u010d\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u00ff\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0109\3\2\2\2\u010d\27\3\2\2\2\u010e\u010f\t\2\2"+
		"\2\u010f\u011b\5\u0098M\2\u0110\u0111\7)\2\2\u0111\u0112\t\2\2\2\u0112"+
		"\u011b\5\u0098M\2\u0113\u0114\t\2\2\2\u0114\u0115\7\25\2\2\u0115\u011b"+
		"\5\u0098M\2\u0116\u0117\7)\2\2\u0117\u0118\t\2\2\2\u0118\u0119\7\25\2"+
		"\2\u0119\u011b\5\u0098M\2\u011a\u010e\3\2\2\2\u011a\u0110\3\2\2\2\u011a"+
		"\u0113\3\2\2\2\u011a\u0116\3\2\2\2\u011b\31\3\2\2\2\u011c\u011d\7\35\2"+
		"\2\u011d\u0123\7\36\2\2\u011e\u011f\7\35\2\2\u011f\u0120\5\34\17\2\u0120"+
		"\u0121\7\36\2\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3"+
		"\2\2\2\u0123\33\3\2\2\2\u0124\u012a\5\u0098M\2\u0125\u0126\5\u0098M\2"+
		"\u0126\u0127\7\34\2\2\u0127\u0128\5\34\17\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u012a\35\3\2\2\2\u012b\u012c\7\37\2"+
		"\2\u012c\u0132\7 \2\2\u012d\u012e\7\37\2\2\u012e\u012f\5 \21\2\u012f\u0130"+
		"\7 \2\2\u0130\u0132\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012d\3\2\2\2\u0132"+
		"\37\3\2\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7\32\2\2\u0135\u013d\5\u0098"+
		"M\2\u0136\u0137\7\'\2\2\u0137\u0138\7\32\2\2\u0138\u0139\5\u0098M\2\u0139"+
		"\u013a\7\34\2\2\u013a\u013b\5 \21\2\u013b\u013d\3\2\2\2\u013c\u0133\3"+
		"\2\2\2\u013c\u0136\3\2\2\2\u013d!\3\2\2\2\u013e\u013f\7!\2\2\u013f\u0140"+
		"\5$\23\2\u0140\u0141\7\"\2\2\u0141#\3\2\2\2\u0142\u0147\5&\24\2\u0143"+
		"\u0144\5&\24\2\u0144\u0145\5$\23\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2"+
		"\2\2\u0146\u0143\3\2\2\2\u0147%\3\2\2\2\u0148\u01a1\5.\30\2\u0149\u014a"+
		"\5.\30\2\u014a\u014b\7#\2\2\u014b\u01a1\3\2\2\2\u014c\u014d\5.\30\2\u014d"+
		"\u014e\7)\2\2\u014e\u01a1\3\2\2\2\u014f\u0150\5.\30\2\u0150\u0151\7)\2"+
		"\2\u0151\u0152\7#\2\2\u0152\u01a1\3\2\2\2\u0153\u01a1\7\'\2\2\u0154\u0155"+
		"\7\'\2\2\u0155\u01a1\7#\2\2\u0156\u0157\7\'\2\2\u0157\u01a1\7)\2\2\u0158"+
		"\u0159\7\'\2\2\u0159\u015a\7)\2\2\u015a\u01a1\7#\2\2\u015b\u015c\5(\25"+
		"\2\u015c\u015d\7\'\2\2\u015d\u01a1\3\2\2\2\u015e\u015f\5(\25\2\u015f\u0160"+
		"\7\'\2\2\u0160\u0161\7#\2\2\u0161\u01a1\3\2\2\2\u0162\u0163\5(\25\2\u0163"+
		"\u0164\7\'\2\2\u0164\u0165\7)\2\2\u0165\u01a1\3\2\2\2\u0166\u0167\5(\25"+
		"\2\u0167\u0168\7\'\2\2\u0168\u0169\7)\2\2\u0169\u016a\7#\2\2\u016a\u01a1"+
		"\3\2\2\2\u016b\u016c\7\'\2\2\u016c\u01a1\5*\26\2\u016d\u016e\7\'\2\2\u016e"+
		"\u016f\5*\26\2\u016f\u0170\7#\2\2\u0170\u01a1\3\2\2\2\u0171\u0172\7\'"+
		"\2\2\u0172\u0173\5*\26\2\u0173\u0174\7)\2\2\u0174\u01a1\3\2\2\2\u0175"+
		"\u0176\7\'\2\2\u0176\u0177\5*\26\2\u0177\u0178\7)\2\2\u0178\u0179\7#\2"+
		"\2\u0179\u01a1\3\2\2\2\u017a\u01a1\7+\2\2\u017b\u017c\7+\2\2\u017c\u01a1"+
		"\7#\2\2\u017d\u017e\7+\2\2\u017e\u01a1\7)\2\2\u017f\u0180\7+\2\2\u0180"+
		"\u0181\7)\2\2\u0181\u01a1\7#\2\2\u0182\u01a1\7,\2\2\u0183\u0184\7,\2\2"+
		"\u0184\u01a1\7#\2\2\u0185\u0186\7,\2\2\u0186\u01a1\7)\2\2\u0187\u0188"+
		"\7,\2\2\u0188\u0189\7)\2\2\u0189\u01a1\7#\2\2\u018a\u01a1\5\"\22\2\u018b"+
		"\u018c\5\"\22\2\u018c\u018d\7#\2\2\u018d\u01a1\3\2\2\2\u018e\u018f\5\""+
		"\22\2\u018f\u0190\7)\2\2\u0190\u01a1\3\2\2\2\u0191\u0192\5\"\22\2\u0192"+
		"\u0193\7)\2\2\u0193\u0194\7#\2\2\u0194\u01a1\3\2\2\2\u0195\u01a1\5\u0090"+
		"I\2\u0196\u0197\5\u0090I\2\u0197\u0198\7#\2\2\u0198\u01a1\3\2\2\2\u0199"+
		"\u019a\5\u0090I\2\u019a\u019b\7)\2\2\u019b\u01a1\3\2\2\2\u019c\u019d\5"+
		"\u0090I\2\u019d\u019e\7)\2\2\u019e\u019f\7#\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u0148\3\2\2\2\u01a0\u0149\3\2\2\2\u01a0\u014c\3\2\2\2\u01a0\u014f\3\2"+
		"\2\2\u01a0\u0153\3\2\2\2\u01a0\u0154\3\2\2\2\u01a0\u0156\3\2\2\2\u01a0"+
		"\u0158\3\2\2\2\u01a0\u015b\3\2\2\2\u01a0\u015e\3\2\2\2\u01a0\u0162\3\2"+
		"\2\2\u01a0\u0166\3\2\2\2\u01a0\u016b\3\2\2\2\u01a0\u016d\3\2\2\2\u01a0"+
		"\u0171\3\2\2\2\u01a0\u0175\3\2\2\2\u01a0\u017a\3\2\2\2\u01a0\u017b\3\2"+
		"\2\2\u01a0\u017d\3\2\2\2\u01a0\u017f\3\2\2\2\u01a0\u0182\3\2\2\2\u01a0"+
		"\u0183\3\2\2\2\u01a0\u0185\3\2\2\2\u01a0\u0187\3\2\2\2\u01a0\u018a\3\2"+
		"\2\2\u01a0\u018b\3\2\2\2\u01a0\u018e\3\2\2\2\u01a0\u0191\3\2\2\2\u01a0"+
		"\u0195\3\2\2\2\u01a0\u0196\3\2\2\2\u01a0\u0199\3\2\2\2\u01a0\u019c\3\2"+
		"\2\2\u01a1\'\3\2\2\2\u01a2\u01a3\7&\2\2\u01a3)\3\2\2\2\u01a4\u01a5\7&"+
		"\2\2\u01a5+\3\2\2\2\u01a6\u01a7\5.\30\2\u01a7\u01a8\7\27\2\2\u01a8-\3"+
		"\2\2\2\u01a9\u01aa\7\'\2\2\u01aa\u01bd\5\64\33\2\u01ab\u01ac\7\'\2\2\u01ac"+
		"\u01ad\7\31\2\2\u01ad\u01ae\5\60\31\2\u01ae\u01af\5\64\33\2\u01af\u01bd"+
		"\3\2\2\2\u01b0\u01b1\7\'\2\2\u01b1\u01b2\7\33\2\2\u01b2\u01b3\5\60\31"+
		"\2\u01b3\u01b4\5\64\33\2\u01b4\u01bd\3\2\2\2\u01b5\u01b6\7\'\2\2\u01b6"+
		"\u01b7\7\31\2\2\u01b7\u01b8\5\60\31\2\u01b8\u01b9\5\64\33\2\u01b9\u01ba"+
		"\5\62\32\2\u01ba\u01bb\5.\30\2\u01bb\u01bd\3\2\2\2\u01bc\u01a9\3\2\2\2"+
		"\u01bc\u01ab\3\2\2\2\u01bc\u01b0\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bd/\3"+
		"\2\2\2\u01be\u01bf\7\'\2\2\u01bf\61\3\2\2\2\u01c0\u01c1\7\31\2\2\u01c1"+
		"\63\3\2\2\2\u01c2\u01c3\7!\2\2\u01c3\u01c9\7\"\2\2\u01c4\u01c5\7!\2\2"+
		"\u01c5\u01c6\5\66\34\2\u01c6\u01c7\7\"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c2"+
		"\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9\65\3\2\2\2\u01ca\u01d5\5\u0098M\2\u01cb"+
		"\u01cc\5\u0098M\2\u01cc\u01cd\7\34\2\2\u01cd\u01ce\5\66\34\2\u01ce\u01d5"+
		"\3\2\2\2\u01cf\u01d5\5$\23\2\u01d0\u01d1\5$\23\2\u01d1\u01d2\7\34\2\2"+
		"\u01d2\u01d3\5\66\34\2\u01d3\u01d5\3\2\2\2\u01d4\u01ca\3\2\2\2\u01d4\u01cb"+
		"\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5\67\3\2\2\2\u01d6"+
		"\u01db\5:\36\2\u01d7\u01d8\5:\36\2\u01d8\u01d9\58\35\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01db9\3\2\2\2\u01dc\u01e8"+
		"\5<\37\2\u01dd\u01de\5<\37\2\u01de\u01df\5> \2\u01df\u01e8\3\2\2\2\u01e0"+
		"\u01e1\5<\37\2\u01e1\u01e2\5B\"\2\u01e2\u01e8\3\2\2\2\u01e3\u01e4\5<\37"+
		"\2\u01e4\u01e5\5> \2\u01e5\u01e6\5B\"\2\u01e6\u01e8\3\2\2\2\u01e7\u01dc"+
		"\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e8"+
		";\3\2\2\2\u01e9\u01ea\7\5\2\2\u01ea\u01eb\5D#\2\u01eb\u01ec\5F$\2\u01ec"+
		"=\3\2\2\2\u01ed\u01f2\5@!\2\u01ee\u01ef\5@!\2\u01ef\u01f0\5> \2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2?\3\2\2\2"+
		"\u01f3\u01f4\7\6\2\2\u01f4\u01f5\5D#\2\u01f5\u01f6\5F$\2\u01f6A\3\2\2"+
		"\2\u01f7\u01f8\7\7\2\2\u01f8\u01f9\5F$\2\u01f9C\3\2\2\2\u01fa\u01fb\5"+
		"J&\2\u01fbE\3\2\2\2\u01fc\u01fd\7\37\2\2\u01fd\u0207\7 \2\2\u01fe\u01ff"+
		"\7\37\2\2\u01ff\u0200\5H%\2\u0200\u0201\7 \2\2\u0201\u0207\3\2\2\2\u0202"+
		"\u0207\58\35\2\u0203\u0207\5,\27\2\u0204\u0207\5X-\2\u0205\u0207\5h\65"+
		"\2\u0206\u01fc\3\2\2\2\u0206\u01fe\3\2\2\2\u0206\u0202\3\2\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207G\3\2\2\2\u0208"+
		"\u020d\5\6\4\2\u0209\u020a\5\6\4\2\u020a\u020b\5H%\2\u020b\u020d\3\2\2"+
		"\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020dI\3\2\2\2\u020e\u0217"+
		"\5L\'\2\u020f\u0210\5L\'\2\u0210\u0211\5J&\2\u0211\u0217\3\2\2\2\u0212"+
		"\u0217\5N(\2\u0213\u0214\5N(\2\u0214\u0215\5J&\2\u0215\u0217\3\2\2\2\u0216"+
		"\u020e\3\2\2\2\u0216\u020f\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0213\3\2"+
		"\2\2\u0217K\3\2\2\2\u0218\u0219\7%\2\2\u0219\u021c\5T+\2\u021a\u021c\5"+
		"T+\2\u021b\u0218\3\2\2\2\u021b\u021a\3\2\2\2\u021cM\3\2\2\2\u021d\u0221"+
		"\5P)\2\u021e\u021f\7%\2\2\u021f\u0221\5P)\2\u0220\u021d\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221O\3\2\2\2\u0222\u022b\5R*\2\u0223\u0224\5R*\2\u0224"+
		"\u0225\t\3\2\2\u0225\u022b\3\2\2\2\u0226\u0227\5R*\2\u0227\u0228\7)\2"+
		"\2\u0228\u0229\t\3\2\2\u0229\u022b\3\2\2\2\u022a\u0222\3\2\2\2\u022a\u0223"+
		"\3\2\2\2\u022a\u0226\3\2\2\2\u022bQ\3\2\2\2\u022c\u022d\7!\2\2\u022d\u022e"+
		"\5J&\2\u022e\u022f\7\"\2\2\u022fS\3\2\2\2\u0230\u0231\5(\25\2\u0231\u0232"+
		"\7\'\2\2\u0232\u029d\3\2\2\2\u0233\u0234\5(\25\2\u0234\u0235\7\'\2\2\u0235"+
		"\u0236\t\3\2\2\u0236\u029d\3\2\2\2\u0237\u0238\5(\25\2\u0238\u0239\7\'"+
		"\2\2\u0239\u023a\7)\2\2\u023a\u029d\3\2\2\2\u023b\u023c\5(\25\2\u023c"+
		"\u023d\7\'\2\2\u023d\u023e\7)\2\2\u023e\u023f\t\3\2\2\u023f\u029d\3\2"+
		"\2\2\u0240\u0241\7\'\2\2\u0241\u029d\5*\26\2\u0242\u0243\7\'\2\2\u0243"+
		"\u0244\5*\26\2\u0244\u0245\t\3\2\2\u0245\u029d\3\2\2\2\u0246\u0247\7\'"+
		"\2\2\u0247\u0248\5*\26\2\u0248\u0249\7)\2\2\u0249\u029d\3\2\2\2\u024a"+
		"\u024b\7\'\2\2\u024b\u024c\5*\26\2\u024c\u024d\7)\2\2\u024d\u024e\t\3"+
		"\2\2\u024e\u029d\3\2\2\2\u024f\u029d\7+\2\2\u0250\u0251\7+\2\2\u0251\u029d"+
		"\t\3\2\2\u0252\u0253\7+\2\2\u0253\u029d\7)\2\2\u0254\u0255\7+\2\2\u0255"+
		"\u0256\7)\2\2\u0256\u029d\t\3\2\2\u0257\u029d\7,\2\2\u0258\u0259\7,\2"+
		"\2\u0259\u029d\t\3\2\2\u025a\u025b\7,\2\2\u025b\u029d\7)\2\2\u025c\u025d"+
		"\7,\2\2\u025d\u025e\7)\2\2\u025e\u029d\t\3\2\2\u025f\u029d\5.\30\2\u0260"+
		"\u0261\5.\30\2\u0261\u0262\t\3\2\2\u0262\u029d\3\2\2\2\u0263\u0264\5."+
		"\30\2\u0264\u0265\7)\2\2\u0265\u029d\3\2\2\2\u0266\u0267\5.\30\2\u0267"+
		"\u0268\7)\2\2\u0268\u0269\t\3\2\2\u0269\u029d\3\2\2\2\u026a\u026b\5V,"+
		"\2\u026b\u026c\7\30\2\2\u026c\u026d\5.\30\2\u026d\u029d\3\2\2\2\u026e"+
		"\u026f\5V,\2\u026f\u0270\7\30\2\2\u0270\u0271\5.\30\2\u0271\u0272\t\3"+
		"\2\2\u0272\u029d\3\2\2\2\u0273\u0274\5V,\2\u0274\u0275\7\30\2\2\u0275"+
		"\u0276\5.\30\2\u0276\u0277\7)\2\2\u0277\u029d\3\2\2\2\u0278\u0279\5V,"+
		"\2\u0279\u027a\7\30\2\2\u027a\u027b\5.\30\2\u027b\u027c\7)\2\2\u027c\u027d"+
		"\t\3\2\2\u027d\u029d\3\2\2\2\u027e\u029d\5\"\22\2\u027f\u0280\5\"\22\2"+
		"\u0280\u0281\t\3\2\2\u0281\u029d\3\2\2\2\u0282\u0283\5\"\22\2\u0283\u0284"+
		"\7)\2\2\u0284\u029d\3\2\2\2\u0285\u0286\5\"\22\2\u0286\u0287\7)\2\2\u0287"+
		"\u0288\t\3\2\2\u0288\u029d\3\2\2\2\u0289\u029d\7\'\2\2\u028a\u028b\7\'"+
		"\2\2\u028b\u029d\t\3\2\2\u028c\u028d\7\'\2\2\u028d\u029d\7)\2\2\u028e"+
		"\u028f\7\'\2\2\u028f\u0290\7)\2\2\u0290\u029d\t\3\2\2\u0291\u029d\5\u0090"+
		"I\2\u0292\u0293\5\u0090I\2\u0293\u0294\t\3\2\2\u0294\u029d\3\2\2\2\u0295"+
		"\u0296\5\u0090I\2\u0296\u0297\7)\2\2\u0297\u029d\3\2\2\2\u0298\u0299\5"+
		"\u0090I\2\u0299\u029a\7)\2\2\u029a\u029b\t\3\2\2\u029b\u029d\3\2\2\2\u029c"+
		"\u0230\3\2\2\2\u029c\u0233\3\2\2\2\u029c\u0237\3\2\2\2\u029c\u023b\3\2"+
		"\2\2\u029c\u0240\3\2\2\2\u029c\u0242\3\2\2\2\u029c\u0246\3\2\2\2\u029c"+
		"\u024a\3\2\2\2\u029c\u024f\3\2\2\2\u029c\u0250\3\2\2\2\u029c\u0252\3\2"+
		"\2\2\u029c\u0254\3\2\2\2\u029c\u0257\3\2\2\2\u029c\u0258\3\2\2\2\u029c"+
		"\u025a\3\2\2\2\u029c\u025c\3\2\2\2\u029c\u025f\3\2\2\2\u029c\u0260\3\2"+
		"\2\2\u029c\u0263\3\2\2\2\u029c\u0266\3\2\2\2\u029c\u026a\3\2\2\2\u029c"+
		"\u026e\3\2\2\2\u029c\u0273\3\2\2\2\u029c\u0278\3\2\2\2\u029c\u027e\3\2"+
		"\2\2\u029c\u027f\3\2\2\2\u029c\u0282\3\2\2\2\u029c\u0285\3\2\2\2\u029c"+
		"\u0289\3\2\2\2\u029c\u028a\3\2\2\2\u029c\u028c\3\2\2\2\u029c\u028e\3\2"+
		"\2\2\u029c\u0291\3\2\2\2\u029c\u0292\3\2\2\2\u029c\u0295\3\2\2\2\u029c"+
		"\u0298\3\2\2\2\u029dU\3\2\2\2\u029e\u02a6\5\u0090I\2\u029f\u02a0\5\u0090"+
		"I\2\u02a0\u02a1\7)\2\2\u02a1\u02a6\3\2\2\2\u02a2\u02a6\7\'\2\2\u02a3\u02a4"+
		"\7\'\2\2\u02a4\u02a6\7)\2\2\u02a5\u029e\3\2\2\2\u02a5\u029f\3\2\2\2\u02a5"+
		"\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6W\3\2\2\2\u02a7\u02a8\7\b\2\2"+
		"\u02a8\u02a9\5Z.\2\u02a9\u02aa\7\37\2\2\u02aa\u02ab\7 \2\2\u02ab\u02bb"+
		"\3\2\2\2\u02ac\u02ad\7\b\2\2\u02ad\u02ae\5Z.\2\u02ae\u02af\7\37\2\2\u02af"+
		"\u02b0\5d\63\2\u02b0\u02b1\7 \2\2\u02b1\u02bb\3\2\2\2\u02b2\u02b3\7\b"+
		"\2\2\u02b3\u02b4\5Z.\2\u02b4\u02b5\5,\27\2\u02b5\u02bb\3\2\2\2\u02b6\u02b7"+
		"\7\b\2\2\u02b7\u02b8\5Z.\2\u02b8\u02b9\5f\64\2\u02b9\u02bb\3\2\2\2\u02ba"+
		"\u02a7\3\2\2\2\u02ba\u02ac\3\2\2\2\u02ba\u02b2\3\2\2\2\u02ba\u02b6\3\2"+
		"\2\2\u02bbY\3\2\2\2\u02bc\u02bd\7!\2\2\u02bd\u02be\5\\/\2\u02be\u02bf"+
		"\7\27\2\2\u02bf\u02c0\5^\60\2\u02c0\u02c1\7\27\2\2\u02c1\u02c2\5`\61\2"+
		"\u02c2\u02c3\7\"\2\2\u02c3\u02cf\3\2\2\2\u02c4\u02c5\5\\/\2\u02c5\u02c6"+
		"\7\27\2\2\u02c6\u02c7\5^\60\2\u02c7\u02c8\7\27\2\2\u02c8\u02c9\5`\61\2"+
		"\u02c9\u02cf\3\2\2\2\u02ca\u02cf\5J&\2\u02cb\u02cc\7!\2\2\u02cc\u02cf"+
		"\7\"\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02bc\3\2\2\2\u02ce\u02c4\3\2\2\2\u02ce"+
		"\u02ca\3\2\2\2\u02ce\u02cb\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf[\3\2\2\2"+
		"\u02d0\u02d3\5\24\13\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d3]\3\2\2\2\u02d4\u02d7\5J&\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7_\3\2\2\2\u02d8\u02db\5b\62\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02dba\3\2\2\2"+
		"\u02dc\u02e7\5$\23\2\u02dd\u02e7\5\"\22\2\u02de\u02df\5$\23\2\u02df\u02e0"+
		"\7\34\2\2\u02e0\u02e1\5b\62\2\u02e1\u02e7\3\2\2\2\u02e2\u02e3\5\"\22\2"+
		"\u02e3\u02e4\7\34\2\2\u02e4\u02e5\5b\62\2\u02e5\u02e7\3\2\2\2\u02e6\u02dc"+
		"\3\2\2\2\u02e6\u02dd\3\2\2\2\u02e6\u02de\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7"+
		"c\3\2\2\2\u02e8\u02ed\5\6\4\2\u02e9\u02ea\5\6\4\2\u02ea\u02eb\5d\63\2"+
		"\u02eb\u02ed\3\2\2\2\u02ec\u02e8\3\2\2\2\u02ec\u02e9\3\2\2\2\u02ede\3"+
		"\2\2\2\u02ee\u02f5\5X-\2\u02ef\u02f0\5X-\2\u02f0\u02f1\5f\64\2\u02f1\u02f5"+
		"\3\2\2\2\u02f2\u02f5\58\35\2\u02f3\u02f5\5h\65\2\u02f4\u02ee\3\2\2\2\u02f4"+
		"\u02ef\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5g\3\2\2\2"+
		"\u02f6\u02f7\7\t\2\2\u02f7\u02f8\5j\66\2\u02f8\u02f9\7\27\2\2\u02f9i\3"+
		"\2\2\2\u02fa\u02fe\5\u0098M\2\u02fb\u02fe\5$\23\2\u02fc\u02fe\5\"\22\2"+
		"\u02fd\u02fa\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fek\3"+
		"\2\2\2\u02ff\u0300\5p9\2\u0300\u0301\7\37\2\2\u0301\u0302\7 \2\2\u0302"+
		"\u031e\3\2\2\2\u0303\u0304\5p9\2\u0304\u0305\7\37\2\2\u0305\u0306\5z>"+
		"\2\u0306\u0307\7 \2\2\u0307\u031e\3\2\2\2\u0308\u0309\5r:\2\u0309\u030a"+
		"\7\37\2\2\u030a\u030b\7 \2\2\u030b\u031e\3\2\2\2\u030c\u030d\5r:\2\u030d"+
		"\u030e\7\37\2\2\u030e\u030f\5z>\2\u030f\u0310\7 \2\2\u0310\u031e\3\2\2"+
		"\2\u0311\u0312\5v<\2\u0312\u0313\7\37\2\2\u0313\u0314\7 \2\2\u0314\u031e"+
		"\3\2\2\2\u0315\u0316\5v<\2\u0316\u0317\7\37\2\2\u0317\u0318\5z>\2\u0318"+
		"\u0319\7 \2\2\u0319\u031e\3\2\2\2\u031a\u031b\5x=\2\u031b\u031c\7\27\2"+
		"\2\u031c\u031e\3\2\2\2\u031d\u02ff\3\2\2\2\u031d\u0303\3\2\2\2\u031d\u0308"+
		"\3\2\2\2\u031d\u030c\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0315\3\2\2\2\u031d"+
		"\u031a\3\2\2\2\u031em\3\2\2\2\u031f\u0320\7\n\2\2\u0320\u0321\7\'\2\2"+
		"\u0321\u0322\7!\2\2\u0322\u0338\7\"\2\2\u0323\u0324\7\n\2\2\u0324\u0325"+
		"\7\'\2\2\u0325\u0326\7!\2\2\u0326\u0327\7\"\2\2\u0327\u0328\7\26\2\2\u0328"+
		"\u0338\7\'\2\2\u0329\u032a\7\n\2\2\u032a\u032b\7\'\2\2\u032b\u032c\7!"+
		"\2\2\u032c\u032d\5|?\2\u032d\u032e\7\"\2\2\u032e\u0338\3\2\2\2\u032f\u0330"+
		"\7\n\2\2\u0330\u0331\7\'\2\2\u0331\u0332\7!\2\2\u0332\u0333\5|?\2\u0333"+
		"\u0334\7\"\2\2\u0334\u0335\7\26\2\2\u0335\u0336\7\'\2\2\u0336\u0338\3"+
		"\2\2\2\u0337\u031f\3\2\2\2\u0337\u0323\3\2\2\2\u0337\u0329\3\2\2\2\u0337"+
		"\u032f\3\2\2\2\u0338o\3\2\2\2\u0339\u033a\5n8\2\u033aq\3\2\2\2\u033b\u033c"+
		"\5t;\2\u033c\u033d\5n8\2\u033d\u0353\3\2\2\2\u033e\u033f\7\16\2\2\u033f"+
		"\u0353\5n8\2\u0340\u0341\5t;\2\u0341\u0342\7\16\2\2\u0342\u0343\5n8\2"+
		"\u0343\u0353\3\2\2\2\u0344\u0345\7\17\2\2\u0345\u0346\5t;\2\u0346\u0347"+
		"\7\16\2\2\u0347\u0348\5n8\2\u0348\u0353\3\2\2\2\u0349\u034a\7\17\2\2\u034a"+
		"\u034b\5t;\2\u034b\u034c\5n8\2\u034c\u0353\3\2\2\2\u034d\u034e\7\17\2"+
		"\2\u034e\u0353\5n8\2\u034f\u0350\7\17\2\2\u0350\u0351\7\16\2\2\u0351\u0353"+
		"\5n8\2\u0352\u033b\3\2\2\2\u0352\u033e\3\2\2\2\u0352\u0340\3\2\2\2\u0352"+
		"\u0344\3\2\2\2\u0352\u0349\3\2\2\2\u0352\u034d\3\2\2\2\u0352\u034f\3\2"+
		"\2\2\u0353s\3\2\2\2\u0354\u0355\t\4\2\2\u0355u\3\2\2\2\u0356\u0357\7\'"+
		"\2\2\u0357\u0358\7!\2\2\u0358\u035f\7\"\2\2\u0359\u035a\7\'\2\2\u035a"+
		"\u035b\7!\2\2\u035b\u035c\5|?\2\u035c\u035d\7\"\2\2\u035d\u035f\3\2\2"+
		"\2\u035e\u0356\3\2\2\2\u035e\u0359\3\2\2\2\u035fw\3\2\2\2\u0360\u0363"+
		"\5p9\2\u0361\u0363\5r:\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2\2\2\u0363"+
		"y\3\2\2\2\u0364\u0369\5\6\4\2\u0365\u0366\5\6\4\2\u0366\u0367\5z>\2\u0367"+
		"\u0369\3\2\2\2\u0368\u0364\3\2\2\2\u0368\u0365\3\2\2\2\u0369{\3\2\2\2"+
		"\u036a\u0370\5~@\2\u036b\u036c\5~@\2\u036c\u036d\7\34\2\2\u036d\u036e"+
		"\5|?\2\u036e\u0370\3\2\2\2\u036f\u036a\3\2\2\2\u036f\u036b\3\2\2\2\u0370"+
		"}\3\2\2\2\u0371\u0372\7\'\2\2\u0372\u0373\7)\2\2\u0373\177\3\2\2\2\u0374"+
		"\u0378\5\u0082B\2\u0375\u0378\5\u0086D\2\u0376\u0378\5\u008aF\2\u0377"+
		"\u0374\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u0081\3\2"+
		"\2\2\u0379\u037a\5\u0084C\2\u037a\u0083\3\2\2\2\u037b\u037c\7\20\2\2\u037c"+
		"\u037d\7\'\2\2\u037d\u037e\7\37\2\2\u037e\u0394\7 \2\2\u037f\u0380\7\20"+
		"\2\2\u0380\u0381\7\'\2\2\u0381\u0382\7\37\2\2\u0382\u0383\5z>\2\u0383"+
		"\u0384\7 \2\2\u0384\u0394\3\2\2\2\u0385\u0386\7\20\2\2\u0386\u0387\7\'"+
		"\2\2\u0387\u0388\7\22\2\2\u0388\u0389\7\'\2\2\u0389\u038a\7\37\2\2\u038a"+
		"\u0394\7 \2\2\u038b\u038c\7\20\2\2\u038c\u038d\7\'\2\2\u038d\u038e\7\22"+
		"\2\2\u038e\u038f\7\'\2\2\u038f\u0390\7\37\2\2\u0390\u0391\5z>\2\u0391"+
		"\u0392\7 \2\2\u0392\u0394\3\2\2\2\u0393\u037b\3\2\2\2\u0393\u037f\3\2"+
		"\2\2\u0393\u0385\3\2\2\2\u0393\u038b\3\2\2\2\u0394\u0085\3\2\2\2\u0395"+
		"\u0396\5\u0088E\2\u0396\u0087\3\2\2\2\u0397\u0398\7\21\2\2\u0398\u0399"+
		"\7\'\2\2\u0399\u039a\7\37\2\2\u039a\u03b0\7 \2\2\u039b\u039c\7\21\2\2"+
		"\u039c\u039d\7\'\2\2\u039d\u039e\7\37\2\2\u039e\u039f\5z>\2\u039f\u03a0"+
		"\7 \2\2\u03a0\u03b0\3\2\2\2\u03a1\u03a2\7\21\2\2\u03a2\u03a3\7\'\2\2\u03a3"+
		"\u03a4\7\22\2\2\u03a4\u03a5\7\'\2\2\u03a5\u03a6\7\37\2\2\u03a6\u03b0\7"+
		" \2\2\u03a7\u03a8\7\21\2\2\u03a8\u03a9\7\'\2\2\u03a9\u03aa\7\22\2\2\u03aa"+
		"\u03ab\7\'\2\2\u03ab\u03ac\7\37\2\2\u03ac\u03ad\5z>\2\u03ad\u03ae\7 \2"+
		"\2\u03ae\u03b0\3\2\2\2\u03af\u0397\3\2\2\2\u03af\u039b\3\2\2\2\u03af\u03a1"+
		"\3\2\2\2\u03af\u03a7\3\2\2\2\u03b0\u0089\3\2\2\2\u03b1\u03b2\5\u008cG"+
		"\2\u03b2\u03b3\7\37\2\2\u03b3\u03b4\7 \2\2\u03b4\u03bb\3\2\2\2\u03b5\u03b6"+
		"\5\u008cG\2\u03b6\u03b7\7\37\2\2\u03b7\u03b8\5z>\2\u03b8\u03b9\7 \2\2"+
		"\u03b9\u03bb\3\2\2\2\u03ba\u03b1\3\2\2\2\u03ba\u03b5\3\2\2\2\u03bb\u008b"+
		"\3\2\2\2\u03bc\u03c0\5\u008eH\2\u03bd\u03be\7\17\2\2\u03be\u03c0\5\u008e"+
		"H\2\u03bf\u03bc\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u008d\3\2\2\2\u03c1"+
		"\u03c2\7\23\2\2\u03c2\u03d2\7\'\2\2\u03c3\u03c4\7\23\2\2\u03c4\u03c5\7"+
		"\'\2\2\u03c5\u03c6\7\22\2\2\u03c6\u03d2\7\'\2\2\u03c7\u03c8\7\23\2\2\u03c8"+
		"\u03c9\7\'\2\2\u03c9\u03ca\7\24\2\2\u03ca\u03d2\7\'\2\2\u03cb\u03cc\7"+
		"\23\2\2\u03cc\u03cd\7\'\2\2\u03cd\u03ce\7\22\2\2\u03ce\u03cf\7\'\2\2\u03cf"+
		"\u03d0\7\24\2\2\u03d0\u03d2\7\'\2\2\u03d1\u03c1\3\2\2\2\u03d1\u03c3\3"+
		"\2\2\2\u03d1\u03c7\3\2\2\2\u03d1\u03cb\3\2\2\2\u03d2\u008f\3\2\2\2\u03d3"+
		"\u03d8\5\u0092J\2\u03d4\u03d5\5\u0092J\2\u03d5\u03d6\5\u0090I\2\u03d6"+
		"\u03d8\3\2\2\2\u03d7\u03d3\3\2\2\2\u03d7\u03d4\3\2\2\2\u03d8\u0091\3\2"+
		"\2\2\u03d9\u03e3\7\'\2\2\u03da\u03db\7\'\2\2\u03db\u03e3\7\31\2\2\u03dc"+
		"\u03dd\7\'\2\2\u03dd\u03e3\5\u0094K\2\u03de\u03df\7\'\2\2\u03df\u03e0"+
		"\5\u0094K\2\u03e0\u03e1\7\31\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03d9\3\2\2"+
		"\2\u03e2\u03da\3\2\2\2\u03e2\u03dc\3\2\2\2\u03e2\u03de\3\2\2\2\u03e3\u0093"+
		"\3\2\2\2\u03e4\u03e5\7\35\2\2\u03e5\u03e6\5\u0096L\2\u03e6\u03e7\7\36"+
		"\2\2\u03e7\u03ee\3\2\2\2\u03e8\u03e9\7\35\2\2\u03e9\u03ea\5\u0096L\2\u03ea"+
		"\u03eb\7\36\2\2\u03eb\u03ec\5\u0094K\2\u03ec\u03ee\3\2\2\2\u03ed\u03e4"+
		"\3\2\2\2\u03ed\u03e8\3\2\2\2\u03ee\u0095\3\2\2\2\u03ef\u03f0\5$\23\2\u03f0"+
		"\u0097\3\2\2\2\u03f1\u0409\7\'\2\2\u03f2\u03f3\7\'\2\2\u03f3\u0409\7)"+
		"\2\2\u03f4\u0409\7+\2\2\u03f5\u03f6\7+\2\2\u03f6\u0409\7)\2\2\u03f7\u0409"+
		"\7,\2\2\u03f8\u03f9\7,\2\2\u03f9\u0409\7)\2\2\u03fa\u0409\7*\2\2\u03fb"+
		"\u0409\5\32\16\2\u03fc\u0409\5\36\20\2\u03fd\u0409\5$\23\2\u03fe\u0409"+
		"\5.\30\2\u03ff\u0400\5\u009aN\2\u0400\u0401\7\31\2\2\u0401\u0402\5\u009c"+
		"O\2\u0402\u0409\3\2\2\2\u0403\u0404\5\u009aN\2\u0404\u0405\7\33\2\2\u0405"+
		"\u0406\5\u009cO\2\u0406\u0409\3\2\2\2\u0407\u0409\5\u0090I\2\u0408\u03f1"+
		"\3\2\2\2\u0408\u03f2\3\2\2\2\u0408\u03f4\3\2\2\2\u0408\u03f5\3\2\2\2\u0408"+
		"\u03f7\3\2\2\2\u0408\u03f8\3\2\2\2\u0408\u03fa\3\2\2\2\u0408\u03fb\3\2"+
		"\2\2\u0408\u03fc\3\2\2\2\u0408\u03fd\3\2\2\2\u0408\u03fe\3\2\2\2\u0408"+
		"\u03ff\3\2\2\2\u0408\u0403\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u0099\3\2"+
		"\2\2\u040a\u040b\7\'\2\2\u040b\u009b\3\2\2\2\u040c\u040d\7\'\2\2\u040d"+
		"\u009d\3\2\2\2\67\u00a6\u00b2\u00bf\u00f4\u00fb\u010c\u011a\u0122\u0129"+
		"\u0131\u013c\u0146\u01a0\u01bc\u01c8\u01d4\u01da\u01e7\u01f1\u0206\u020c"+
		"\u0216\u021b\u0220\u022a\u029c\u02a5\u02ba\u02ce\u02d2\u02d6\u02da\u02e6"+
		"\u02ec\u02f4\u02fd\u031d\u0337\u0352\u035e\u0362\u0368\u036f\u0377\u0393"+
		"\u03af\u03ba\u03bf\u03d1\u03d7\u03e2\u03ed\u0408";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}