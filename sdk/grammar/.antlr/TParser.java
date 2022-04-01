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
		Implements=18, ArrowRight=19, End=20, Attr=21, Point=22, TwoPoint=23, 
		TwoTwoPoint=24, Separator=25, OpenArIndex=26, CloseArIndex=27, OpenBlock=28, 
		CloseBlock=29, OpenOp=30, CloseOp=31, ArithmeticOperator=32, AssignmentOperator=33, 
		Not=34, IncDecOperators=35, Identifier=36, IDPrefix=37, TypeSpec=38, String=39, 
		Integer=40, Float=41, Whitespace=42, Newline=43, Words=44, BlockComment=45, 
		LineComment=46;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_callingFunction = 19, 
		RULE_functionCall = 20, RULE_identifierB = 21, RULE_functionCallParam = 22, 
		RULE_functionCallParamElements = 23, RULE_conditionalExpression = 24, 
		RULE_conditionalBlockElements = 25, RULE_ifConditions = 26, RULE_elifConditions = 27, 
		RULE_elseConditions = 28, RULE_condBlockElementsLimited = 29, RULE_conditionalExpressionElements = 30, 
		RULE_conditionalExpElementsValue = 31, RULE_conditionExpBlock = 32, RULE_conditionalExpValue = 33, 
		RULE_loop = 34, RULE_loopExpression = 35, RULE_loopOneMembers = 36, RULE_loopTwoMembers = 37, 
		RULE_loopThreeMembers = 38, RULE_loopThreeMembersValues = 39, RULE_loopBlockElements = 40, 
		RULE_loopBlockElementsLimited = 41, RULE_ret = 42, RULE_retValues = 43, 
		RULE_functions = 44, RULE_functionGeneralModes = 45, RULE_functionsModes = 46, 
		RULE_functionMethodsModes = 47, RULE_methodPerm = 48, RULE_constructClassMethod = 49, 
		RULE_interfaceMethod = 50, RULE_functionCodeBlock = 51, RULE_functionParams = 52, 
		RULE_functionParamElements = 53, RULE_oopGeneral = 54, RULE_interfaceClass = 55, 
		RULE_interfaceClassDefinition = 56, RULE_abstractClass = 57, RULE_abstractClassDefinition = 58, 
		RULE_classDefination = 59, RULE_classModesGeneral = 60, RULE_classModes = 61, 
		RULE_generalValue = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalBlockElements", "ifConditions", "elifConditions", "elseConditions", 
			"condBlockElementsLimited", "conditionalExpressionElements", "conditionalExpElementsValue", 
			"conditionExpBlock", "conditionalExpValue", "loop", "loopExpression", 
			"loopOneMembers", "loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", 
			"loopBlockElements", "loopBlockElementsLimited", "ret", "retValues", 
			"functions", "functionGeneralModes", "functionsModes", "functionMethodsModes", 
			"methodPerm", "constructClassMethod", "interfaceMethod", "functionCodeBlock", 
			"functionParams", "functionParamElements", "oopGeneral", "interfaceClass", 
			"interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
			"classDefination", "classModesGeneral", "classModes", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'->'", "';'", 
			"'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
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
			setState(126);
			fileContent(0);
			setState(127);
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
			setState(134);
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
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					sentence();
					}
					} 
				}
				setState(136);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
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
			setState(148);
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
			setState(150);
			match(Use);
			setState(151);
			useValue();
			setState(152);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				useString();
				setState(156);
				match(Separator);
				setState(157);
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
			setState(161);
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
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableMembersContext variableMembers() {
			return getRuleContext(VariableMembersContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
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
			setState(163);
			match(Var);
			setState(164);
			variableMembers();
			setState(165);
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
		enterRule(_localctx, 16, RULE_variableMembers);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				variableDefinition();
				setState(169);
				match(Separator);
				setState(170);
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
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDefinition);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Identifier);
				setState(175);
				match(Attr);
				setState(176);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Identifier);
				setState(178);
				match(TypeSpec);
				setState(179);
				match(Attr);
				setState(180);
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
		enterRule(_localctx, 20, RULE_indexArray);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(OpenArIndex);
				setState(184);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(OpenArIndex);
				setState(186);
				indexArrayElements();
				setState(187);
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
		enterRule(_localctx, 22, RULE_indexArrayElements);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				generalValue();
				setState(193);
				match(Separator);
				setState(194);
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
		enterRule(_localctx, 24, RULE_associativeArray);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(OpenBlock);
				setState(199);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(OpenBlock);
				setState(201);
				associativeArrayElements();
				setState(202);
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
		enterRule(_localctx, 26, RULE_associativeArrayElements);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(Identifier);
				setState(207);
				match(TwoPoint);
				setState(208);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(Identifier);
				setState(210);
				match(TwoPoint);
				setState(211);
				generalValue();
				setState(212);
				match(Separator);
				setState(213);
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
		enterRule(_localctx, 28, RULE_operationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(OpenOp);
			setState(218);
			operationElements();
			setState(219);
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
		enterRule(_localctx, 30, RULE_operationElements);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				operationValue();
				setState(223);
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
		enterRule(_localctx, 32, RULE_operationValue);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(Identifier);
				setState(229);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(Identifier);
				setState(231);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(Identifier);
				setState(233);
				match(TypeSpec);
				setState(234);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				firstIncDec();
				setState(236);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				firstIncDec();
				setState(239);
				match(Identifier);
				setState(240);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				firstIncDec();
				setState(243);
				match(Identifier);
				setState(244);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				firstIncDec();
				setState(247);
				match(Identifier);
				setState(248);
				match(TypeSpec);
				setState(249);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				match(Identifier);
				setState(252);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(253);
				match(Identifier);
				setState(254);
				lastIncDec();
				setState(255);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				match(Identifier);
				setState(258);
				lastIncDec();
				setState(259);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(261);
				match(Identifier);
				setState(262);
				lastIncDec();
				setState(263);
				match(TypeSpec);
				setState(264);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(266);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(267);
				match(Integer);
				setState(268);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(269);
				match(Integer);
				setState(270);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(271);
				match(Integer);
				setState(272);
				match(TypeSpec);
				setState(273);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(274);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(275);
				match(Float);
				setState(276);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(277);
				match(Float);
				setState(278);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(279);
				match(Float);
				setState(280);
				match(TypeSpec);
				setState(281);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(282);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(283);
				functionCall();
				setState(284);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(286);
				functionCall();
				setState(287);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(289);
				functionCall();
				setState(290);
				match(TypeSpec);
				setState(291);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(293);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(294);
				operationBlock();
				setState(295);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(297);
				operationBlock();
				setState(298);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(300);
				operationBlock();
				setState(301);
				match(TypeSpec);
				setState(302);
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
		enterRule(_localctx, 34, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 36, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 38, RULE_callingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			functionCall();
			setState(311);
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
		enterRule(_localctx, 40, RULE_functionCall);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(Identifier);
				setState(314);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(Identifier);
				setState(316);
				match(Point);
				setState(317);
				identifierB();
				setState(318);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(Identifier);
				setState(321);
				match(TwoTwoPoint);
				setState(322);
				identifierB();
				setState(323);
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
		enterRule(_localctx, 42, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 44, RULE_functionCallParam);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(OpenOp);
				setState(330);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(OpenOp);
				setState(332);
				functionCallParamElements();
				setState(333);
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
		enterRule(_localctx, 46, RULE_functionCallParamElements);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				generalValue();
				setState(339);
				match(Separator);
				setState(340);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				operationElements();
				setState(344);
				match(Separator);
				setState(345);
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
		enterRule(_localctx, 48, RULE_conditionalExpression);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
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
		enterRule(_localctx, 50, RULE_conditionalBlockElements);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				conditionalExpression();
				setState(356);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				sentence();
				setState(360);
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
		enterRule(_localctx, 52, RULE_ifConditions);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(If);
				setState(365);
				conditionalExpressionElements();
				setState(366);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(If);
				setState(369);
				conditionalExpressionElements();
				setState(370);
				match(OpenBlock);
				setState(371);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(If);
				setState(374);
				conditionalExpressionElements();
				setState(375);
				match(OpenBlock);
				setState(376);
				conditionalBlockElements();
				setState(377);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(If);
				setState(380);
				conditionalExpressionElements();
				setState(381);
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
		enterRule(_localctx, 54, RULE_elifConditions);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(Elif);
				setState(386);
				conditionalExpressionElements();
				setState(387);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(Elif);
				setState(390);
				conditionalExpressionElements();
				setState(391);
				match(OpenBlock);
				setState(392);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(Elif);
				setState(395);
				conditionalExpressionElements();
				setState(396);
				match(OpenBlock);
				setState(397);
				conditionalBlockElements();
				setState(398);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(Elif);
				setState(401);
				conditionalExpressionElements();
				setState(402);
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
		enterRule(_localctx, 56, RULE_elseConditions);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(Else);
				setState(407);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(Else);
				setState(409);
				match(OpenBlock);
				setState(410);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(Else);
				setState(412);
				match(OpenBlock);
				setState(413);
				conditionalBlockElements();
				setState(414);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(Else);
				setState(417);
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
		enterRule(_localctx, 58, RULE_condBlockElementsLimited);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				ifConditions();
				setState(422);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				loop();
				setState(426);
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
		enterRule(_localctx, 60, RULE_conditionalExpressionElements);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				conditionalExpElementsValue();
				setState(432);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				conditionExpBlock(0);
				setState(436);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				match(Not);
				setState(439);
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
		enterRule(_localctx, 62, RULE_conditionalExpElementsValue);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				conditionalExpValue();
				setState(444);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(449);
			match(OpenOp);
			setState(450);
			conditionalExpressionElements();
			setState(451);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpBlock);
					setState(453);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(454);
					match(AssignmentOperator);
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 66, RULE_conditionalExpValue);
		int _la;
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(Identifier);
				setState(462);
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
				setState(463);
				match(Identifier);
				setState(464);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(Identifier);
				setState(466);
				match(TypeSpec);
				setState(467);
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
				setState(468);
				firstIncDec();
				setState(469);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				firstIncDec();
				setState(472);
				match(Identifier);
				setState(473);
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
				setState(475);
				firstIncDec();
				setState(476);
				match(Identifier);
				setState(477);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(479);
				firstIncDec();
				setState(480);
				match(Identifier);
				setState(481);
				match(TypeSpec);
				setState(482);
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
				setState(484);
				match(Identifier);
				setState(485);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(486);
				match(Identifier);
				setState(487);
				lastIncDec();
				setState(488);
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
				setState(490);
				match(Identifier);
				setState(491);
				lastIncDec();
				setState(492);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(494);
				match(Identifier);
				setState(495);
				lastIncDec();
				setState(496);
				match(TypeSpec);
				setState(497);
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
				setState(499);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
				match(Integer);
				setState(501);
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
				setState(502);
				match(Integer);
				setState(503);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(504);
				match(Integer);
				setState(505);
				match(TypeSpec);
				setState(506);
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
				setState(507);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(508);
				match(Float);
				setState(509);
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
				setState(510);
				match(Float);
				setState(511);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(512);
				match(Float);
				setState(513);
				match(TypeSpec);
				setState(514);
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
				setState(515);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(516);
				functionCall();
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
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(519);
				functionCall();
				setState(520);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(522);
				functionCall();
				setState(523);
				match(TypeSpec);
				setState(524);
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
				setState(526);
				match(Identifier);
				setState(527);
				match(Attr);
				setState(528);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(529);
				match(Identifier);
				setState(530);
				match(Attr);
				setState(531);
				functionCall();
				setState(532);
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
				setState(534);
				match(Identifier);
				setState(535);
				match(Attr);
				setState(536);
				functionCall();
				setState(537);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(539);
				match(Identifier);
				setState(540);
				match(Attr);
				setState(541);
				functionCall();
				setState(542);
				match(TypeSpec);
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
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(545);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(546);
				operationBlock();
				setState(547);
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
				setState(549);
				operationBlock();
				setState(550);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(552);
				operationBlock();
				setState(553);
				match(TypeSpec);
				setState(554);
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
		enterRule(_localctx, 68, RULE_loop);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(For);
				setState(559);
				loopExpression();
				setState(560);
				match(OpenBlock);
				setState(561);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(For);
				setState(564);
				loopExpression();
				setState(565);
				match(OpenBlock);
				setState(566);
				loopBlockElements();
				setState(567);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(For);
				setState(570);
				loopExpression();
				setState(571);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(For);
				setState(574);
				loopExpression();
				setState(575);
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
		enterRule(_localctx, 70, RULE_loopExpression);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(OpenOp);
				setState(580);
				loopOneMembers();
				setState(581);
				match(End);
				setState(582);
				loopTwoMembers();
				setState(583);
				match(End);
				setState(584);
				loopThreeMembers();
				setState(585);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				loopOneMembers();
				setState(588);
				match(End);
				setState(589);
				loopTwoMembers();
				setState(590);
				match(End);
				setState(591);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(OpenOp);
				setState(595);
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
		enterRule(_localctx, 72, RULE_loopOneMembers);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
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
		enterRule(_localctx, 74, RULE_loopTwoMembers);
		try {
			setState(605);
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
				setState(603);
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
		enterRule(_localctx, 76, RULE_loopThreeMembers);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
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
		enterRule(_localctx, 78, RULE_loopThreeMembersValues);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				operationElements();
				setState(614);
				match(Separator);
				setState(615);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				operationBlock();
				setState(618);
				match(Separator);
				setState(619);
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
		enterRule(_localctx, 80, RULE_loopBlockElements);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				sentence();
				setState(625);
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
		enterRule(_localctx, 82, RULE_loopBlockElementsLimited);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				ifConditions();
				setState(631);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				loop();
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
		enterRule(_localctx, 84, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(Ret);
			setState(640);
			retValues();
			setState(641);
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
		enterRule(_localctx, 86, RULE_retValues);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
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
		enterRule(_localctx, 88, RULE_functions);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				functionsModes();
				setState(649);
				match(OpenBlock);
				setState(650);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				functionsModes();
				setState(653);
				match(OpenBlock);
				setState(654);
				functionCodeBlock();
				setState(655);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				functionMethodsModes();
				setState(658);
				match(OpenBlock);
				setState(659);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				functionMethodsModes();
				setState(662);
				match(OpenBlock);
				setState(663);
				functionCodeBlock();
				setState(664);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				constructClassMethod();
				setState(667);
				match(OpenBlock);
				setState(668);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
				constructClassMethod();
				setState(671);
				match(OpenBlock);
				setState(672);
				functionCodeBlock();
				setState(673);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(675);
				interfaceMethod();
				setState(676);
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
		enterRule(_localctx, 90, RULE_functionGeneralModes);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(Function);
				setState(681);
				match(Identifier);
				setState(682);
				match(OpenOp);
				setState(683);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(Function);
				setState(685);
				match(Identifier);
				setState(686);
				match(OpenOp);
				setState(687);
				match(CloseOp);
				setState(688);
				match(ArrowRight);
				setState(689);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				match(Function);
				setState(691);
				match(Identifier);
				setState(692);
				match(OpenOp);
				setState(693);
				functionParams();
				setState(694);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				match(Function);
				setState(697);
				match(Identifier);
				setState(698);
				match(OpenOp);
				setState(699);
				functionParams();
				setState(700);
				match(CloseOp);
				setState(701);
				match(ArrowRight);
				setState(702);
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
		enterRule(_localctx, 92, RULE_functionsModes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		enterRule(_localctx, 94, RULE_functionMethodsModes);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				methodPerm();
				setState(709);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(Static);
				setState(712);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				methodPerm();
				setState(714);
				match(Static);
				setState(715);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(Final);
				setState(718);
				methodPerm();
				setState(719);
				match(Static);
				setState(720);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				match(Final);
				setState(723);
				methodPerm();
				setState(724);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(726);
				match(Final);
				setState(727);
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
		enterRule(_localctx, 96, RULE_methodPerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
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
		enterRule(_localctx, 98, RULE_constructClassMethod);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				match(Identifier);
				setState(733);
				match(OpenOp);
				setState(734);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(Identifier);
				setState(736);
				match(OpenOp);
				setState(737);
				functionParams();
				setState(738);
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
		enterRule(_localctx, 100, RULE_interfaceMethod);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
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
				setState(743);
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
		enterRule(_localctx, 102, RULE_functionCodeBlock);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				sentence();
				setState(748);
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
		enterRule(_localctx, 104, RULE_functionParams);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				functionParamElements();
				setState(754);
				match(Separator);
				setState(755);
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
		enterRule(_localctx, 106, RULE_functionParamElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(Identifier);
			setState(760);
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
		enterRule(_localctx, 108, RULE_oopGeneral);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				abstractClass();
				}
				break;
			case Final:
			case Class:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
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
		enterRule(_localctx, 110, RULE_interfaceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		enterRule(_localctx, 112, RULE_interfaceClassDefinition);
		try {
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(Interface);
				setState(770);
				match(Identifier);
				setState(771);
				match(OpenBlock);
				setState(772);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				match(Interface);
				setState(774);
				match(Identifier);
				setState(775);
				match(OpenBlock);
				setState(776);
				functionCodeBlock();
				setState(777);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				match(Interface);
				setState(780);
				match(Identifier);
				setState(781);
				match(Extends);
				setState(782);
				match(Identifier);
				setState(783);
				match(OpenBlock);
				setState(784);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(785);
				match(Interface);
				setState(786);
				match(Identifier);
				setState(787);
				match(Extends);
				setState(788);
				match(Identifier);
				setState(789);
				match(OpenBlock);
				setState(790);
				functionCodeBlock();
				setState(791);
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
		enterRule(_localctx, 114, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
		enterRule(_localctx, 116, RULE_abstractClassDefinition);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(Abstract);
				setState(798);
				match(Identifier);
				setState(799);
				match(OpenBlock);
				setState(800);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(Abstract);
				setState(802);
				match(Identifier);
				setState(803);
				match(OpenBlock);
				setState(804);
				functionCodeBlock();
				setState(805);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(Abstract);
				setState(808);
				match(Identifier);
				setState(809);
				match(Extends);
				setState(810);
				match(Identifier);
				setState(811);
				match(OpenBlock);
				setState(812);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(813);
				match(Abstract);
				setState(814);
				match(Identifier);
				setState(815);
				match(Extends);
				setState(816);
				match(Identifier);
				setState(817);
				match(OpenBlock);
				setState(818);
				functionCodeBlock();
				setState(819);
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
		enterRule(_localctx, 118, RULE_classDefination);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				classModesGeneral();
				setState(824);
				match(OpenBlock);
				setState(825);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				classModesGeneral();
				setState(828);
				match(OpenBlock);
				setState(829);
				functionCodeBlock();
				setState(830);
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
		enterRule(_localctx, 120, RULE_classModesGeneral);
		try {
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				classModes();
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(Final);
				setState(836);
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
		enterRule(_localctx, 122, RULE_classModes);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(Class);
				setState(840);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(Class);
				setState(842);
				match(Identifier);
				setState(843);
				match(Extends);
				setState(844);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(845);
				match(Class);
				setState(846);
				match(Identifier);
				setState(847);
				match(Implements);
				setState(848);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(Class);
				setState(850);
				match(Identifier);
				setState(851);
				match(Extends);
				setState(852);
				match(Identifier);
				setState(853);
				match(Implements);
				setState(854);
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
		enterRule(_localctx, 124, RULE_generalValue);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(Identifier);
				setState(859);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(Integer);
				setState(862);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				match(Float);
				setState(865);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(866);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(867);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(868);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(869);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(870);
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
		case 32:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u036c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0087\n\3\f\3\16\3\u008a"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0095\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a2\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00af\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00b8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cf\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u00e4\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0133\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0148\n\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0152\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u015e\n\31\3\32\3\32\3\32\5\32\u0163\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016d\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0182\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0197\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a5"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01af\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u01bb\n \3!\3!\3!\3!\5!\u01c1\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\7\"\u01ca\n\"\f\"\16\"\u01cd\13\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u022f"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0244"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0258\n%"+
		"\3&\3&\5&\u025c\n&\3\'\3\'\5\'\u0260\n\'\3(\3(\5(\u0264\n(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0270\n)\3*\3*\3*\3*\5*\u0276\n*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u0280\n+\3,\3,\3,\3,\3-\3-\3-\5-\u0289\n-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u02a9\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u02c3\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u02db\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u02e7\n\63\3\64\3\64\5\64\u02eb\n\64\3\65\3\65\3\65\3\65\5\65\u02f1"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u02f8\n\66\3\67\3\67\3\67\38\38\3"+
		"8\58\u0300\n8\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\5:\u031c\n:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0338\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\5=\u0343\n=\3>\3>\3>\5>\u0348\n>\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u035a\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\5@\u036a\n@\3@\2\4\4BA\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\4\3\2"+
		"\"#\3\2\13\r\2\u03d0\2\u0080\3\2\2\2\4\u0083\3\2\2\2\6\u0094\3\2\2\2\b"+
		"\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u00a1\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5"+
		"\3\2\2\2\22\u00ae\3\2\2\2\24\u00b7\3\2\2\2\26\u00bf\3\2\2\2\30\u00c6\3"+
		"\2\2\2\32\u00ce\3\2\2\2\34\u00d9\3\2\2\2\36\u00db\3\2\2\2 \u00e3\3\2\2"+
		"\2\"\u0132\3\2\2\2$\u0134\3\2\2\2&\u0136\3\2\2\2(\u0138\3\2\2\2*\u0147"+
		"\3\2\2\2,\u0149\3\2\2\2.\u0151\3\2\2\2\60\u015d\3\2\2\2\62\u0162\3\2\2"+
		"\2\64\u016c\3\2\2\2\66\u0181\3\2\2\28\u0196\3\2\2\2:\u01a4\3\2\2\2<\u01ae"+
		"\3\2\2\2>\u01ba\3\2\2\2@\u01c0\3\2\2\2B\u01c2\3\2\2\2D\u022e\3\2\2\2F"+
		"\u0243\3\2\2\2H\u0257\3\2\2\2J\u025b\3\2\2\2L\u025f\3\2\2\2N\u0263\3\2"+
		"\2\2P\u026f\3\2\2\2R\u0275\3\2\2\2T\u027f\3\2\2\2V\u0281\3\2\2\2X\u0288"+
		"\3\2\2\2Z\u02a8\3\2\2\2\\\u02c2\3\2\2\2^\u02c4\3\2\2\2`\u02da\3\2\2\2"+
		"b\u02dc\3\2\2\2d\u02e6\3\2\2\2f\u02ea\3\2\2\2h\u02f0\3\2\2\2j\u02f7\3"+
		"\2\2\2l\u02f9\3\2\2\2n\u02ff\3\2\2\2p\u0301\3\2\2\2r\u031b\3\2\2\2t\u031d"+
		"\3\2\2\2v\u0337\3\2\2\2x\u0342\3\2\2\2z\u0347\3\2\2\2|\u0359\3\2\2\2~"+
		"\u0369\3\2\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2"+
		"\u0083\u0088\b\3\1\2\u0084\u0085\f\4\2\2\u0085\u0087\5\6\4\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\5\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0095\5\b\5\2\u008c\u0095\5\n\6\2"+
		"\u008d\u0095\5\20\t\2\u008e\u0095\5(\25\2\u008f\u0095\5\62\32\2\u0090"+
		"\u0095\5F$\2\u0091\u0095\5Z.\2\u0092\u0095\5V,\2\u0093\u0095\5n8\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\7\3\2\2\2\u0096\u0097\7-\2\2"+
		"\u0097\t\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7"+
		"\26\2\2\u009b\13\3\2\2\2\u009c\u00a2\5\16\b\2\u009d\u009e\5\16\b\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3"+
		"\2\2\2\u00a1\u009d\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4\17"+
		"\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\26\2\2"+
		"\u00a8\21\3\2\2\2\u00a9\u00af\5\24\13\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac"+
		"\7\33\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2"+
		"\u00ae\u00aa\3\2\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7&\2\2\u00b1\u00b2\7"+
		"\27\2\2\u00b2\u00b8\5~@\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7(\2\2\u00b5"+
		"\u00b6\7\27\2\2\u00b6\u00b8\5~@\2\u00b7\u00b0\3\2\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\7\34\2\2\u00ba\u00c0\7\35\2\2\u00bb"+
		"\u00bc\7\34\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7\35\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\27\3\2\2\2\u00c1"+
		"\u00c7\5~@\2\u00c2\u00c3\5~@\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5\30\r"+
		"\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\31"+
		"\3\2\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00cf\7\37\2\2\u00ca\u00cb\7\36\2"+
		"\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00c8\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\7&\2\2"+
		"\u00d1\u00d2\7\31\2\2\u00d2\u00da\5~@\2\u00d3\u00d4\7&\2\2\u00d4\u00d5"+
		"\7\31\2\2\u00d5\u00d6\5~@\2\u00d6\u00d7\7\33\2\2\u00d7\u00d8\5\34\17\2"+
		"\u00d8\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da\35"+
		"\3\2\2\2\u00db\u00dc\7 \2\2\u00dc\u00dd\5 \21\2\u00dd\u00de\7!\2\2\u00de"+
		"\37\3\2\2\2\u00df\u00e4\5\"\22\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\5 \21"+
		"\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4!"+
		"\3\2\2\2\u00e5\u0133\7&\2\2\u00e6\u00e7\7&\2\2\u00e7\u0133\7\"\2\2\u00e8"+
		"\u00e9\7&\2\2\u00e9\u0133\7(\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\7(\2\2"+
		"\u00ec\u0133\7\"\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\7&\2\2\u00ef\u0133"+
		"\3\2\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\7&\2\2\u00f2\u00f3\7\"\2\2\u00f3"+
		"\u0133\3\2\2\2\u00f4\u00f5\5$\23\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7(\2"+
		"\2\u00f7\u0133\3\2\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7&\2\2\u00fa\u00fb"+
		"\7(\2\2\u00fb\u00fc\7\"\2\2\u00fc\u0133\3\2\2\2\u00fd\u00fe\7&\2\2\u00fe"+
		"\u0133\5&\24\2\u00ff\u0100\7&\2\2\u0100\u0101\5&\24\2\u0101\u0102\7\""+
		"\2\2\u0102\u0133\3\2\2\2\u0103\u0104\7&\2\2\u0104\u0105\5&\24\2\u0105"+
		"\u0106\7(\2\2\u0106\u0133\3\2\2\2\u0107\u0108\7&\2\2\u0108\u0109\5&\24"+
		"\2\u0109\u010a\7(\2\2\u010a\u010b\7\"\2\2\u010b\u0133\3\2\2\2\u010c\u0133"+
		"\7*\2\2\u010d\u010e\7*\2\2\u010e\u0133\7\"\2\2\u010f\u0110\7*\2\2\u0110"+
		"\u0133\7(\2\2\u0111\u0112\7*\2\2\u0112\u0113\7(\2\2\u0113\u0133\7\"\2"+
		"\2\u0114\u0133\7+\2\2\u0115\u0116\7+\2\2\u0116\u0133\7\"\2\2\u0117\u0118"+
		"\7+\2\2\u0118\u0133\7(\2\2\u0119\u011a\7+\2\2\u011a\u011b\7(\2\2\u011b"+
		"\u0133\7\"\2\2\u011c\u0133\5*\26\2\u011d\u011e\5*\26\2\u011e\u011f\7\""+
		"\2\2\u011f\u0133\3\2\2\2\u0120\u0121\5*\26\2\u0121\u0122\7(\2\2\u0122"+
		"\u0133\3\2\2\2\u0123\u0124\5*\26\2\u0124\u0125\7(\2\2\u0125\u0126\7\""+
		"\2\2\u0126\u0133\3\2\2\2\u0127\u0133\5\36\20\2\u0128\u0129\5\36\20\2\u0129"+
		"\u012a\7\"\2\2\u012a\u0133\3\2\2\2\u012b\u012c\5\36\20\2\u012c\u012d\7"+
		"(\2\2\u012d\u0133\3\2\2\2\u012e\u012f\5\36\20\2\u012f\u0130\7(\2\2\u0130"+
		"\u0131\7\"\2\2\u0131\u0133\3\2\2\2\u0132\u00e5\3\2\2\2\u0132\u00e6\3\2"+
		"\2\2\u0132\u00e8\3\2\2\2\u0132\u00ea\3\2\2\2\u0132\u00ed\3\2\2\2\u0132"+
		"\u00f0\3\2\2\2\u0132\u00f4\3\2\2\2\u0132\u00f8\3\2\2\2\u0132\u00fd\3\2"+
		"\2\2\u0132\u00ff\3\2\2\2\u0132\u0103\3\2\2\2\u0132\u0107\3\2\2\2\u0132"+
		"\u010c\3\2\2\2\u0132\u010d\3\2\2\2\u0132\u010f\3\2\2\2\u0132\u0111\3\2"+
		"\2\2\u0132\u0114\3\2\2\2\u0132\u0115\3\2\2\2\u0132\u0117\3\2\2\2\u0132"+
		"\u0119\3\2\2\2\u0132\u011c\3\2\2\2\u0132\u011d\3\2\2\2\u0132\u0120\3\2"+
		"\2\2\u0132\u0123\3\2\2\2\u0132\u0127\3\2\2\2\u0132\u0128\3\2\2\2\u0132"+
		"\u012b\3\2\2\2\u0132\u012e\3\2\2\2\u0133#\3\2\2\2\u0134\u0135\7%\2\2\u0135"+
		"%\3\2\2\2\u0136\u0137\7%\2\2\u0137\'\3\2\2\2\u0138\u0139\5*\26\2\u0139"+
		"\u013a\7\26\2\2\u013a)\3\2\2\2\u013b\u013c\7&\2\2\u013c\u0148\5.\30\2"+
		"\u013d\u013e\7&\2\2\u013e\u013f\7\30\2\2\u013f\u0140\5,\27\2\u0140\u0141"+
		"\5.\30\2\u0141\u0148\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144\7\32\2\2\u0144"+
		"\u0145\5,\27\2\u0145\u0146\5.\30\2\u0146\u0148\3\2\2\2\u0147\u013b\3\2"+
		"\2\2\u0147\u013d\3\2\2\2\u0147\u0142\3\2\2\2\u0148+\3\2\2\2\u0149\u014a"+
		"\7&\2\2\u014a-\3\2\2\2\u014b\u014c\7 \2\2\u014c\u0152\7!\2\2\u014d\u014e"+
		"\7 \2\2\u014e\u014f\5\60\31\2\u014f\u0150\7!\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014b\3\2\2\2\u0151\u014d\3\2\2\2\u0152/\3\2\2\2\u0153\u015e\5~@\2\u0154"+
		"\u0155\5~@\2\u0155\u0156\7\33\2\2\u0156\u0157\5\60\31\2\u0157\u015e\3"+
		"\2\2\2\u0158\u015e\5 \21\2\u0159\u015a\5 \21\2\u015a\u015b\7\33\2\2\u015b"+
		"\u015c\5\60\31\2\u015c\u015e\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0154\3"+
		"\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015e\61\3\2\2\2\u015f"+
		"\u0163\5\66\34\2\u0160\u0163\58\35\2\u0161\u0163\5:\36\2\u0162\u015f\3"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\63\3\2\2\2\u0164"+
		"\u016d\5\62\32\2\u0165\u0166\5\62\32\2\u0166\u0167\5\64\33\2\u0167\u016d"+
		"\3\2\2\2\u0168\u016d\5\6\4\2\u0169\u016a\5\6\4\2\u016a\u016b\5\64\33\2"+
		"\u016b\u016d\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u0168"+
		"\3\2\2\2\u016c\u0169\3\2\2\2\u016d\65\3\2\2\2\u016e\u016f\7\5\2\2\u016f"+
		"\u0170\5> \2\u0170\u0171\5(\25\2\u0171\u0182\3\2\2\2\u0172\u0173\7\5\2"+
		"\2\u0173\u0174\5> \2\u0174\u0175\7\36\2\2\u0175\u0176\7\37\2\2\u0176\u0182"+
		"\3\2\2\2\u0177\u0178\7\5\2\2\u0178\u0179\5> \2\u0179\u017a\7\36\2\2\u017a"+
		"\u017b\5\64\33\2\u017b\u017c\7\37\2\2\u017c\u0182\3\2\2\2\u017d\u017e"+
		"\7\5\2\2\u017e\u017f\5> \2\u017f\u0180\5<\37\2\u0180\u0182\3\2\2\2\u0181"+
		"\u016e\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0177\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0182\67\3\2\2\2\u0183\u0184\7\6\2\2\u0184\u0185\5> \2\u0185\u0186"+
		"\5(\25\2\u0186\u0197\3\2\2\2\u0187\u0188\7\6\2\2\u0188\u0189\5> \2\u0189"+
		"\u018a\7\36\2\2\u018a\u018b\7\37\2\2\u018b\u0197\3\2\2\2\u018c\u018d\7"+
		"\6\2\2\u018d\u018e\5> \2\u018e\u018f\7\36\2\2\u018f\u0190\5\64\33\2\u0190"+
		"\u0191\7\37\2\2\u0191\u0197\3\2\2\2\u0192\u0193\7\6\2\2\u0193\u0194\5"+
		"> \2\u0194\u0195\5<\37\2\u0195\u0197\3\2\2\2\u0196\u0183\3\2\2\2\u0196"+
		"\u0187\3\2\2\2\u0196\u018c\3\2\2\2\u0196\u0192\3\2\2\2\u01979\3\2\2\2"+
		"\u0198\u0199\7\7\2\2\u0199\u01a5\5(\25\2\u019a\u019b\7\7\2\2\u019b\u019c"+
		"\7\36\2\2\u019c\u01a5\7\37\2\2\u019d\u019e\7\7\2\2\u019e\u019f\7\36\2"+
		"\2\u019f\u01a0\5\64\33\2\u01a0\u01a1\7\37\2\2\u01a1\u01a5\3\2\2\2\u01a2"+
		"\u01a3\7\7\2\2\u01a3\u01a5\5<\37\2\u01a4\u0198\3\2\2\2\u01a4\u019a\3\2"+
		"\2\2\u01a4\u019d\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5;\3\2\2\2\u01a6\u01af"+
		"\5\66\34\2\u01a7\u01a8\5\66\34\2\u01a8\u01a9\5\64\33\2\u01a9\u01af\3\2"+
		"\2\2\u01aa\u01af\5F$\2\u01ab\u01ac\5F$\2\u01ac\u01ad\5T+\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01af=\3\2\2\2\u01b0\u01bb\5@!\2\u01b1\u01b2\5@!\2\u01b2"+
		"\u01b3\5> \2\u01b3\u01bb\3\2\2\2\u01b4\u01bb\5B\"\2\u01b5\u01b6\5B\"\2"+
		"\u01b6\u01b7\5> \2\u01b7\u01bb\3\2\2\2\u01b8\u01b9\7$\2\2\u01b9\u01bb"+
		"\5> \2\u01ba\u01b0\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba"+
		"\u01b5\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb?\3\2\2\2\u01bc\u01c1\5D#\2\u01bd"+
		"\u01be\5D#\2\u01be\u01bf\5@!\2\u01bf\u01c1\3\2\2\2\u01c0\u01bc\3\2\2\2"+
		"\u01c0\u01bd\3\2\2\2\u01c1A\3\2\2\2\u01c2\u01c3\b\"\1\2\u01c3\u01c4\7"+
		" \2\2\u01c4\u01c5\5> \2\u01c5\u01c6\7!\2\2\u01c6\u01cb\3\2\2\2\u01c7\u01c8"+
		"\f\3\2\2\u01c8\u01ca\7#\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccC\3\2\2\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u022f\7&\2\2\u01cf\u01d0\7&\2\2\u01d0\u022f\t\2\2\2\u01d1\u01d2"+
		"\7&\2\2\u01d2\u022f\7(\2\2\u01d3\u01d4\7&\2\2\u01d4\u01d5\7(\2\2\u01d5"+
		"\u022f\t\2\2\2\u01d6\u01d7\5$\23\2\u01d7\u01d8\7&\2\2\u01d8\u022f\3\2"+
		"\2\2\u01d9\u01da\5$\23\2\u01da\u01db\7&\2\2\u01db\u01dc\t\2\2\2\u01dc"+
		"\u022f\3\2\2\2\u01dd\u01de\5$\23\2\u01de\u01df\7&\2\2\u01df\u01e0\7(\2"+
		"\2\u01e0\u022f\3\2\2\2\u01e1\u01e2\5$\23\2\u01e2\u01e3\7&\2\2\u01e3\u01e4"+
		"\7(\2\2\u01e4\u01e5\t\2\2\2\u01e5\u022f\3\2\2\2\u01e6\u01e7\7&\2\2\u01e7"+
		"\u022f\5&\24\2\u01e8\u01e9\7&\2\2\u01e9\u01ea\5&\24\2\u01ea\u01eb\t\2"+
		"\2\2\u01eb\u022f\3\2\2\2\u01ec\u01ed\7&\2\2\u01ed\u01ee\5&\24\2\u01ee"+
		"\u01ef\7(\2\2\u01ef\u022f\3\2\2\2\u01f0\u01f1\7&\2\2\u01f1\u01f2\5&\24"+
		"\2\u01f2\u01f3\7(\2\2\u01f3\u01f4\t\2\2\2\u01f4\u022f\3\2\2\2\u01f5\u022f"+
		"\7*\2\2\u01f6\u01f7\7*\2\2\u01f7\u022f\t\2\2\2\u01f8\u01f9\7*\2\2\u01f9"+
		"\u022f\7(\2\2\u01fa\u01fb\7*\2\2\u01fb\u01fc\7(\2\2\u01fc\u022f\t\2\2"+
		"\2\u01fd\u022f\7+\2\2\u01fe\u01ff\7+\2\2\u01ff\u022f\t\2\2\2\u0200\u0201"+
		"\7+\2\2\u0201\u022f\7(\2\2\u0202\u0203\7+\2\2\u0203\u0204\7(\2\2\u0204"+
		"\u022f\t\2\2\2\u0205\u022f\5*\26\2\u0206\u0207\5*\26\2\u0207\u0208\t\2"+
		"\2\2\u0208\u022f\3\2\2\2\u0209\u020a\5*\26\2\u020a\u020b\7(\2\2\u020b"+
		"\u022f\3\2\2\2\u020c\u020d\5*\26\2\u020d\u020e\7(\2\2\u020e\u020f\t\2"+
		"\2\2\u020f\u022f\3\2\2\2\u0210\u0211\7&\2\2\u0211\u0212\7\27\2\2\u0212"+
		"\u022f\5*\26\2\u0213\u0214\7&\2\2\u0214\u0215\7\27\2\2\u0215\u0216\5*"+
		"\26\2\u0216\u0217\t\2\2\2\u0217\u022f\3\2\2\2\u0218\u0219\7&\2\2\u0219"+
		"\u021a\7\27\2\2\u021a\u021b\5*\26\2\u021b\u021c\7(\2\2\u021c\u022f\3\2"+
		"\2\2\u021d\u021e\7&\2\2\u021e\u021f\7\27\2\2\u021f\u0220\5*\26\2\u0220"+
		"\u0221\7(\2\2\u0221\u0222\t\2\2\2\u0222\u022f\3\2\2\2\u0223\u022f\5\36"+
		"\20\2\u0224\u0225\5\36\20\2\u0225\u0226\t\2\2\2\u0226\u022f\3\2\2\2\u0227"+
		"\u0228\5\36\20\2\u0228\u0229\7(\2\2\u0229\u022f\3\2\2\2\u022a\u022b\5"+
		"\36\20\2\u022b\u022c\7(\2\2\u022c\u022d\t\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u01ce\3\2\2\2\u022e\u01cf\3\2\2\2\u022e\u01d1\3\2\2\2\u022e\u01d3\3\2"+
		"\2\2\u022e\u01d6\3\2\2\2\u022e\u01d9\3\2\2\2\u022e\u01dd\3\2\2\2\u022e"+
		"\u01e1\3\2\2\2\u022e\u01e6\3\2\2\2\u022e\u01e8\3\2\2\2\u022e\u01ec\3\2"+
		"\2\2\u022e\u01f0\3\2\2\2\u022e\u01f5\3\2\2\2\u022e\u01f6\3\2\2\2\u022e"+
		"\u01f8\3\2\2\2\u022e\u01fa\3\2\2\2\u022e\u01fd\3\2\2\2\u022e\u01fe\3\2"+
		"\2\2\u022e\u0200\3\2\2\2\u022e\u0202\3\2\2\2\u022e\u0205\3\2\2\2\u022e"+
		"\u0206\3\2\2\2\u022e\u0209\3\2\2\2\u022e\u020c\3\2\2\2\u022e\u0210\3\2"+
		"\2\2\u022e\u0213\3\2\2\2\u022e\u0218\3\2\2\2\u022e\u021d\3\2\2\2\u022e"+
		"\u0223\3\2\2\2\u022e\u0224\3\2\2\2\u022e\u0227\3\2\2\2\u022e\u022a\3\2"+
		"\2\2\u022fE\3\2\2\2\u0230\u0231\7\b\2\2\u0231\u0232\5H%\2\u0232\u0233"+
		"\7\36\2\2\u0233\u0234\7\37\2\2\u0234\u0244\3\2\2\2\u0235\u0236\7\b\2\2"+
		"\u0236\u0237\5H%\2\u0237\u0238\7\36\2\2\u0238\u0239\5R*\2\u0239\u023a"+
		"\7\37\2\2\u023a\u0244\3\2\2\2\u023b\u023c\7\b\2\2\u023c\u023d\5H%\2\u023d"+
		"\u023e\5(\25\2\u023e\u0244\3\2\2\2\u023f\u0240\7\b\2\2\u0240\u0241\5H"+
		"%\2\u0241\u0242\5T+\2\u0242\u0244\3\2\2\2\u0243\u0230\3\2\2\2\u0243\u0235"+
		"\3\2\2\2\u0243\u023b\3\2\2\2\u0243\u023f\3\2\2\2\u0244G\3\2\2\2\u0245"+
		"\u0246\7 \2\2\u0246\u0247\5J&\2\u0247\u0248\7\26\2\2\u0248\u0249\5L\'"+
		"\2\u0249\u024a\7\26\2\2\u024a\u024b\5N(\2\u024b\u024c\7!\2\2\u024c\u0258"+
		"\3\2\2\2\u024d\u024e\5J&\2\u024e\u024f\7\26\2\2\u024f\u0250\5L\'\2\u0250"+
		"\u0251\7\26\2\2\u0251\u0252\5N(\2\u0252\u0258\3\2\2\2\u0253\u0258\5> "+
		"\2\u0254\u0255\7 \2\2\u0255\u0258\7!\2\2\u0256\u0258\3\2\2\2\u0257\u0245"+
		"\3\2\2\2\u0257\u024d\3\2\2\2\u0257\u0253\3\2\2\2\u0257\u0254\3\2\2\2\u0257"+
		"\u0256\3\2\2\2\u0258I\3\2\2\2\u0259\u025c\5\22\n\2\u025a\u025c\3\2\2\2"+
		"\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025cK\3\2\2\2\u025d\u0260\5"+
		"> \2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260"+
		"M\3\2\2\2\u0261\u0264\5P)\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264O\3\2\2\2\u0265\u0270\5 \21\2\u0266\u0270\5\36\20"+
		"\2\u0267\u0268\5 \21\2\u0268\u0269\7\33\2\2\u0269\u026a\5P)\2\u026a\u0270"+
		"\3\2\2\2\u026b\u026c\5\36\20\2\u026c\u026d\7\33\2\2\u026d\u026e\5P)\2"+
		"\u026e\u0270\3\2\2\2\u026f\u0265\3\2\2\2\u026f\u0266\3\2\2\2\u026f\u0267"+
		"\3\2\2\2\u026f\u026b\3\2\2\2\u0270Q\3\2\2\2\u0271\u0276\5\6\4\2\u0272"+
		"\u0273\5\6\4\2\u0273\u0274\5R*\2\u0274\u0276\3\2\2\2\u0275\u0271\3\2\2"+
		"\2\u0275\u0272\3\2\2\2\u0276S\3\2\2\2\u0277\u0280\5\66\34\2\u0278\u0279"+
		"\5\66\34\2\u0279\u027a\5T+\2\u027a\u0280\3\2\2\2\u027b\u0280\5F$\2\u027c"+
		"\u027d\5F$\2\u027d\u027e\5T+\2\u027e\u0280\3\2\2\2\u027f\u0277\3\2\2\2"+
		"\u027f\u0278\3\2\2\2\u027f\u027b\3\2\2\2\u027f\u027c\3\2\2\2\u0280U\3"+
		"\2\2\2\u0281\u0282\7\t\2\2\u0282\u0283\5X-\2\u0283\u0284\7\26\2\2\u0284"+
		"W\3\2\2\2\u0285\u0289\5~@\2\u0286\u0289\5 \21\2\u0287\u0289\5\36\20\2"+
		"\u0288\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289Y\3"+
		"\2\2\2\u028a\u028b\5^\60\2\u028b\u028c\7\36\2\2\u028c\u028d\7\37\2\2\u028d"+
		"\u02a9\3\2\2\2\u028e\u028f\5^\60\2\u028f\u0290\7\36\2\2\u0290\u0291\5"+
		"h\65\2\u0291\u0292\7\37\2\2\u0292\u02a9\3\2\2\2\u0293\u0294\5`\61\2\u0294"+
		"\u0295\7\36\2\2\u0295\u0296\7\37\2\2\u0296\u02a9\3\2\2\2\u0297\u0298\5"+
		"`\61\2\u0298\u0299\7\36\2\2\u0299\u029a\5h\65\2\u029a\u029b\7\37\2\2\u029b"+
		"\u02a9\3\2\2\2\u029c\u029d\5d\63\2\u029d\u029e\7\36\2\2\u029e\u029f\7"+
		"\37\2\2\u029f\u02a9\3\2\2\2\u02a0\u02a1\5d\63\2\u02a1\u02a2\7\36\2\2\u02a2"+
		"\u02a3\5h\65\2\u02a3\u02a4\7\37\2\2\u02a4\u02a9\3\2\2\2\u02a5\u02a6\5"+
		"f\64\2\u02a6\u02a7\7\26\2\2\u02a7\u02a9\3\2\2\2\u02a8\u028a\3\2\2\2\u02a8"+
		"\u028e\3\2\2\2\u02a8\u0293\3\2\2\2\u02a8\u0297\3\2\2\2\u02a8\u029c\3\2"+
		"\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a9[\3\2\2\2\u02aa\u02ab"+
		"\7\n\2\2\u02ab\u02ac\7&\2\2\u02ac\u02ad\7 \2\2\u02ad\u02c3\7!\2\2\u02ae"+
		"\u02af\7\n\2\2\u02af\u02b0\7&\2\2\u02b0\u02b1\7 \2\2\u02b1\u02b2\7!\2"+
		"\2\u02b2\u02b3\7\25\2\2\u02b3\u02c3\7&\2\2\u02b4\u02b5\7\n\2\2\u02b5\u02b6"+
		"\7&\2\2\u02b6\u02b7\7 \2\2\u02b7\u02b8\5j\66\2\u02b8\u02b9\7!\2\2\u02b9"+
		"\u02c3\3\2\2\2\u02ba\u02bb\7\n\2\2\u02bb\u02bc\7&\2\2\u02bc\u02bd\7 \2"+
		"\2\u02bd\u02be\5j\66\2\u02be\u02bf\7!\2\2\u02bf\u02c0\7\25\2\2\u02c0\u02c1"+
		"\7&\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02aa\3\2\2\2\u02c2\u02ae\3\2\2\2\u02c2"+
		"\u02b4\3\2\2\2\u02c2\u02ba\3\2\2\2\u02c3]\3\2\2\2\u02c4\u02c5\5\\/\2\u02c5"+
		"_\3\2\2\2\u02c6\u02c7\5b\62\2\u02c7\u02c8\5\\/\2\u02c8\u02db\3\2\2\2\u02c9"+
		"\u02ca\7\16\2\2\u02ca\u02db\5\\/\2\u02cb\u02cc\5b\62\2\u02cc\u02cd\7\16"+
		"\2\2\u02cd\u02ce\5\\/\2\u02ce\u02db\3\2\2\2\u02cf\u02d0\7\17\2\2\u02d0"+
		"\u02d1\5b\62\2\u02d1\u02d2\7\16\2\2\u02d2\u02d3\5\\/\2\u02d3\u02db\3\2"+
		"\2\2\u02d4\u02d5\7\17\2\2\u02d5\u02d6\5b\62\2\u02d6\u02d7\5\\/\2\u02d7"+
		"\u02db\3\2\2\2\u02d8\u02d9\7\17\2\2\u02d9\u02db\5\\/\2\u02da\u02c6\3\2"+
		"\2\2\u02da\u02c9\3\2\2\2\u02da\u02cb\3\2\2\2\u02da\u02cf\3\2\2\2\u02da"+
		"\u02d4\3\2\2\2\u02da\u02d8\3\2\2\2\u02dba\3\2\2\2\u02dc\u02dd\t\3\2\2"+
		"\u02ddc\3\2\2\2\u02de\u02df\7&\2\2\u02df\u02e0\7 \2\2\u02e0\u02e7\7!\2"+
		"\2\u02e1\u02e2\7&\2\2\u02e2\u02e3\7 \2\2\u02e3\u02e4\5j\66\2\u02e4\u02e5"+
		"\7!\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02de\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e7"+
		"e\3\2\2\2\u02e8\u02eb\5^\60\2\u02e9\u02eb\5`\61\2\u02ea\u02e8\3\2\2\2"+
		"\u02ea\u02e9\3\2\2\2\u02ebg\3\2\2\2\u02ec\u02f1\5\6\4\2\u02ed\u02ee\5"+
		"\6\4\2\u02ee\u02ef\5h\65\2\u02ef\u02f1\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0"+
		"\u02ed\3\2\2\2\u02f1i\3\2\2\2\u02f2\u02f8\5l\67\2\u02f3\u02f4\5l\67\2"+
		"\u02f4\u02f5\7\33\2\2\u02f5\u02f6\5j\66\2\u02f6\u02f8\3\2\2\2\u02f7\u02f2"+
		"\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f8k\3\2\2\2\u02f9\u02fa\7&\2\2\u02fa\u02fb"+
		"\7(\2\2\u02fbm\3\2\2\2\u02fc\u0300\5p9\2\u02fd\u0300\5t;\2\u02fe\u0300"+
		"\5x=\2\u02ff\u02fc\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300"+
		"o\3\2\2\2\u0301\u0302\5r:\2\u0302q\3\2\2\2\u0303\u0304\7\20\2\2\u0304"+
		"\u0305\7&\2\2\u0305\u0306\7\36\2\2\u0306\u031c\7\37\2\2\u0307\u0308\7"+
		"\20\2\2\u0308\u0309\7&\2\2\u0309\u030a\7\36\2\2\u030a\u030b\5h\65\2\u030b"+
		"\u030c\7\37\2\2\u030c\u031c\3\2\2\2\u030d\u030e\7\20\2\2\u030e\u030f\7"+
		"&\2\2\u030f\u0310\7\22\2\2\u0310\u0311\7&\2\2\u0311\u0312\7\36\2\2\u0312"+
		"\u031c\7\37\2\2\u0313\u0314\7\20\2\2\u0314\u0315\7&\2\2\u0315\u0316\7"+
		"\22\2\2\u0316\u0317\7&\2\2\u0317\u0318\7\36\2\2\u0318\u0319\5h\65\2\u0319"+
		"\u031a\7\37\2\2\u031a\u031c\3\2\2\2\u031b\u0303\3\2\2\2\u031b\u0307\3"+
		"\2\2\2\u031b\u030d\3\2\2\2\u031b\u0313\3\2\2\2\u031cs\3\2\2\2\u031d\u031e"+
		"\5v<\2\u031eu\3\2\2\2\u031f\u0320\7\21\2\2\u0320\u0321\7&\2\2\u0321\u0322"+
		"\7\36\2\2\u0322\u0338\7\37\2\2\u0323\u0324\7\21\2\2\u0324\u0325\7&\2\2"+
		"\u0325\u0326\7\36\2\2\u0326\u0327\5h\65\2\u0327\u0328\7\37\2\2\u0328\u0338"+
		"\3\2\2\2\u0329\u032a\7\21\2\2\u032a\u032b\7&\2\2\u032b\u032c\7\22\2\2"+
		"\u032c\u032d\7&\2\2\u032d\u032e\7\36\2\2\u032e\u0338\7\37\2\2\u032f\u0330"+
		"\7\21\2\2\u0330\u0331\7&\2\2\u0331\u0332\7\22\2\2\u0332\u0333\7&\2\2\u0333"+
		"\u0334\7\36\2\2\u0334\u0335\5h\65\2\u0335\u0336\7\37\2\2\u0336\u0338\3"+
		"\2\2\2\u0337\u031f\3\2\2\2\u0337\u0323\3\2\2\2\u0337\u0329\3\2\2\2\u0337"+
		"\u032f\3\2\2\2\u0338w\3\2\2\2\u0339\u033a\5z>\2\u033a\u033b\7\36\2\2\u033b"+
		"\u033c\7\37\2\2\u033c\u0343\3\2\2\2\u033d\u033e\5z>\2\u033e\u033f\7\36"+
		"\2\2\u033f\u0340\5h\65\2\u0340\u0341\7\37\2\2\u0341\u0343\3\2\2\2\u0342"+
		"\u0339\3\2\2\2\u0342\u033d\3\2\2\2\u0343y\3\2\2\2\u0344\u0348\5|?\2\u0345"+
		"\u0346\7\17\2\2\u0346\u0348\5|?\2\u0347\u0344\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348{\3\2\2\2\u0349\u034a\7\23\2\2\u034a\u035a\7&\2\2\u034b\u034c"+
		"\7\23\2\2\u034c\u034d\7&\2\2\u034d\u034e\7\22\2\2\u034e\u035a\7&\2\2\u034f"+
		"\u0350\7\23\2\2\u0350\u0351\7&\2\2\u0351\u0352\7\24\2\2\u0352\u035a\7"+
		"&\2\2\u0353\u0354\7\23\2\2\u0354\u0355\7&\2\2\u0355\u0356\7\22\2\2\u0356"+
		"\u0357\7&\2\2\u0357\u0358\7\24\2\2\u0358\u035a\7&\2\2\u0359\u0349\3\2"+
		"\2\2\u0359\u034b\3\2\2\2\u0359\u034f\3\2\2\2\u0359\u0353\3\2\2\2\u035a"+
		"}\3\2\2\2\u035b\u036a\7&\2\2\u035c\u035d\7&\2\2\u035d\u036a\7(\2\2\u035e"+
		"\u036a\7*\2\2\u035f\u0360\7*\2\2\u0360\u036a\7(\2\2\u0361\u036a\7+\2\2"+
		"\u0362\u0363\7+\2\2\u0363\u036a\7(\2\2\u0364\u036a\7)\2\2\u0365\u036a"+
		"\5\26\f\2\u0366\u036a\5\32\16\2\u0367\u036a\5\36\20\2\u0368\u036a\5*\26"+
		"\2\u0369\u035b\3\2\2\2\u0369\u035c\3\2\2\2\u0369\u035e\3\2\2\2\u0369\u035f"+
		"\3\2\2\2\u0369\u0361\3\2\2\2\u0369\u0362\3\2\2\2\u0369\u0364\3\2\2\2\u0369"+
		"\u0365\3\2\2\2\u0369\u0366\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2"+
		"\2\2\u036a\177\3\2\2\2\61\u0088\u0094\u00a1\u00ae\u00b7\u00bf\u00c6\u00ce"+
		"\u00d9\u00e3\u0132\u0147\u0151\u015d\u0162\u016c\u0181\u0196\u01a4\u01ae"+
		"\u01ba\u01c0\u01cb\u022e\u0243\u0257\u025b\u025f\u0263\u026f\u0275\u027f"+
		"\u0288\u02a8\u02c2\u02da\u02e6\u02ea\u02f0\u02f7\u02ff\u031b\u0337\u0342"+
		"\u0347\u0359\u0369";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}