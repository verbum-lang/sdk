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
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, ArrowRight=17, 
		End=18, Attr=19, Point=20, TwoPoint=21, TwoTwoPoint=22, Separator=23, 
		OpenArIndex=24, CloseArIndex=25, OpenBlock=26, CloseBlock=27, OpenOp=28, 
		CloseOp=29, ArithmeticOperator=30, AssignmentOperator=31, Not=32, IncDecOperators=33, 
		Identifier=34, IDPrefix=35, TypeSpec=36, String=37, Integer=38, Float=39, 
		Whitespace=40, Newline=41, Words=42, BlockComment=43, LineComment=44;
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
		RULE_generalValue = 59;
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
			"generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'->'", "';'", "'='", "'.'", "':'", "'::'", 
			"','", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"ArrowRight", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", 
			"OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", 
			"ArithmeticOperator", "AssignmentOperator", "Not", "IncDecOperators", 
			"Identifier", "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", 
			"Newline", "Words", "BlockComment", "LineComment"
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
			setState(120);
			fileContent(0);
			setState(121);
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
			setState(128);
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
					setState(124);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(125);
					sentence();
					}
					} 
				}
				setState(130);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				liveToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				use();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				callingFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				conditionalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				ret();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
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
			setState(142);
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
			setState(144);
			match(Use);
			setState(145);
			useValue();
			setState(146);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				useString();
				setState(150);
				match(Separator);
				setState(151);
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
			setState(155);
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
			setState(157);
			match(Var);
			setState(158);
			variableMembers();
			setState(159);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				variableDefinition();
				setState(163);
				match(Separator);
				setState(164);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Identifier);
				setState(169);
				match(Attr);
				setState(170);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(Identifier);
				setState(172);
				match(TypeSpec);
				setState(173);
				match(Attr);
				setState(174);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(OpenArIndex);
				setState(178);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(OpenArIndex);
				setState(180);
				indexArrayElements();
				setState(181);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				generalValue();
				setState(187);
				match(Separator);
				setState(188);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(OpenBlock);
				setState(193);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(OpenBlock);
				setState(195);
				associativeArrayElements();
				setState(196);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(Identifier);
				setState(201);
				match(TwoPoint);
				setState(202);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(Identifier);
				setState(204);
				match(TwoPoint);
				setState(205);
				generalValue();
				setState(206);
				match(Separator);
				setState(207);
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
			setState(211);
			match(OpenOp);
			setState(212);
			operationElements();
			setState(213);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				operationValue();
				setState(217);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Identifier);
				setState(223);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(Identifier);
				setState(225);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(Identifier);
				setState(227);
				match(TypeSpec);
				setState(228);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				firstIncDec();
				setState(230);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				firstIncDec();
				setState(233);
				match(Identifier);
				setState(234);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				firstIncDec();
				setState(237);
				match(Identifier);
				setState(238);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				firstIncDec();
				setState(241);
				match(Identifier);
				setState(242);
				match(TypeSpec);
				setState(243);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				match(Identifier);
				setState(246);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				match(Identifier);
				setState(248);
				lastIncDec();
				setState(249);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				match(Identifier);
				setState(252);
				lastIncDec();
				setState(253);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(255);
				match(Identifier);
				setState(256);
				lastIncDec();
				setState(257);
				match(TypeSpec);
				setState(258);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(260);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(261);
				match(Integer);
				setState(262);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(263);
				match(Integer);
				setState(264);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(265);
				match(Integer);
				setState(266);
				match(TypeSpec);
				setState(267);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(268);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(269);
				match(Float);
				setState(270);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(271);
				match(Float);
				setState(272);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(273);
				match(Float);
				setState(274);
				match(TypeSpec);
				setState(275);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(276);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(277);
				functionCall();
				setState(278);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(280);
				functionCall();
				setState(281);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(283);
				functionCall();
				setState(284);
				match(TypeSpec);
				setState(285);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(287);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(288);
				operationBlock();
				setState(289);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(291);
				operationBlock();
				setState(292);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(294);
				operationBlock();
				setState(295);
				match(TypeSpec);
				setState(296);
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
			setState(300);
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
			setState(302);
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
			setState(304);
			functionCall();
			setState(305);
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
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Identifier);
				setState(308);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(Identifier);
				setState(310);
				match(Point);
				setState(311);
				identifierB();
				setState(312);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(Identifier);
				setState(315);
				match(TwoTwoPoint);
				setState(316);
				identifierB();
				setState(317);
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
			setState(321);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(OpenOp);
				setState(324);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(OpenOp);
				setState(326);
				functionCallParamElements();
				setState(327);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				generalValue();
				setState(333);
				match(Separator);
				setState(334);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				operationElements();
				setState(338);
				match(Separator);
				setState(339);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				conditionalExpression();
				setState(350);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				sentence();
				setState(354);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(If);
				setState(359);
				conditionalExpressionElements();
				setState(360);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(If);
				setState(363);
				conditionalExpressionElements();
				setState(364);
				match(OpenBlock);
				setState(365);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(If);
				setState(368);
				conditionalExpressionElements();
				setState(369);
				match(OpenBlock);
				setState(370);
				conditionalBlockElements();
				setState(371);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(If);
				setState(374);
				conditionalExpressionElements();
				setState(375);
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
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(Elif);
				setState(380);
				conditionalExpressionElements();
				setState(381);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(Elif);
				setState(384);
				conditionalExpressionElements();
				setState(385);
				match(OpenBlock);
				setState(386);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(Elif);
				setState(389);
				conditionalExpressionElements();
				setState(390);
				match(OpenBlock);
				setState(391);
				conditionalBlockElements();
				setState(392);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(Elif);
				setState(395);
				conditionalExpressionElements();
				setState(396);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(Else);
				setState(401);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(Else);
				setState(403);
				match(OpenBlock);
				setState(404);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(Else);
				setState(406);
				match(OpenBlock);
				setState(407);
				conditionalBlockElements();
				setState(408);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(Else);
				setState(411);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				ifConditions();
				setState(416);
				conditionalBlockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				loop();
				setState(420);
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
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				conditionalExpElementsValue();
				setState(426);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				conditionExpBlock(0);
				setState(430);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(Not);
				setState(433);
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
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				conditionalExpValue();
				setState(438);
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
			setState(443);
			match(OpenOp);
			setState(444);
			conditionalExpressionElements();
			setState(445);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
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
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(448);
					match(AssignmentOperator);
					}
					} 
				}
				setState(453);
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
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(Identifier);
				setState(456);
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
				setState(457);
				match(Identifier);
				setState(458);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				match(Identifier);
				setState(460);
				match(TypeSpec);
				setState(461);
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
				setState(462);
				firstIncDec();
				setState(463);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				firstIncDec();
				setState(466);
				match(Identifier);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				firstIncDec();
				setState(470);
				match(Identifier);
				setState(471);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(473);
				firstIncDec();
				setState(474);
				match(Identifier);
				setState(475);
				match(TypeSpec);
				setState(476);
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
				setState(478);
				match(Identifier);
				setState(479);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(480);
				match(Identifier);
				setState(481);
				lastIncDec();
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(484);
				match(Identifier);
				setState(485);
				lastIncDec();
				setState(486);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				match(Identifier);
				setState(489);
				lastIncDec();
				setState(490);
				match(TypeSpec);
				setState(491);
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
				setState(493);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(494);
				match(Integer);
				setState(495);
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
				setState(496);
				match(Integer);
				setState(497);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(498);
				match(Integer);
				setState(499);
				match(TypeSpec);
				setState(500);
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
				setState(501);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(502);
				match(Float);
				setState(503);
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
				setState(504);
				match(Float);
				setState(505);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(506);
				match(Float);
				setState(507);
				match(TypeSpec);
				setState(508);
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
				setState(509);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(510);
				functionCall();
				setState(511);
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
				setState(513);
				functionCall();
				setState(514);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(516);
				functionCall();
				setState(517);
				match(TypeSpec);
				setState(518);
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
				setState(520);
				match(Identifier);
				setState(521);
				match(Attr);
				setState(522);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(523);
				match(Identifier);
				setState(524);
				match(Attr);
				setState(525);
				functionCall();
				setState(526);
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
				setState(528);
				match(Identifier);
				setState(529);
				match(Attr);
				setState(530);
				functionCall();
				setState(531);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(533);
				match(Identifier);
				setState(534);
				match(Attr);
				setState(535);
				functionCall();
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
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(539);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(540);
				operationBlock();
				setState(541);
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
				setState(543);
				operationBlock();
				setState(544);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(546);
				operationBlock();
				setState(547);
				match(TypeSpec);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(For);
				setState(553);
				loopExpression();
				setState(554);
				match(OpenBlock);
				setState(555);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(For);
				setState(558);
				loopExpression();
				setState(559);
				match(OpenBlock);
				setState(560);
				loopBlockElements();
				setState(561);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				match(For);
				setState(564);
				loopExpression();
				setState(565);
				callingFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(For);
				setState(568);
				loopExpression();
				setState(569);
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
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(OpenOp);
				setState(574);
				loopOneMembers();
				setState(575);
				match(End);
				setState(576);
				loopTwoMembers();
				setState(577);
				match(End);
				setState(578);
				loopThreeMembers();
				setState(579);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				loopOneMembers();
				setState(582);
				match(End);
				setState(583);
				loopTwoMembers();
				setState(584);
				match(End);
				setState(585);
				loopThreeMembers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				conditionalExpressionElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				match(OpenOp);
				setState(589);
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
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
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
			setState(599);
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
				setState(597);
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
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
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
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				operationBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				operationElements();
				setState(608);
				match(Separator);
				setState(609);
				loopThreeMembersValues();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				operationBlock();
				setState(612);
				match(Separator);
				setState(613);
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
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				sentence();
				setState(619);
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
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				ifConditions();
				setState(625);
				loopBlockElementsLimited();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				loop();
				setState(629);
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
			setState(633);
			match(Ret);
			setState(634);
			retValues();
			setState(635);
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
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				operationElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
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
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				functionsModes();
				setState(643);
				match(OpenBlock);
				setState(644);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				functionsModes();
				setState(647);
				match(OpenBlock);
				setState(648);
				functionCodeBlock();
				setState(649);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				functionMethodsModes();
				setState(652);
				match(OpenBlock);
				setState(653);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				functionMethodsModes();
				setState(656);
				match(OpenBlock);
				setState(657);
				functionCodeBlock();
				setState(658);
				match(CloseBlock);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				constructClassMethod();
				setState(661);
				match(OpenBlock);
				setState(662);
				match(CloseBlock);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				constructClassMethod();
				setState(665);
				match(OpenBlock);
				setState(666);
				functionCodeBlock();
				setState(667);
				match(CloseBlock);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(669);
				interfaceMethod();
				setState(670);
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
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(Function);
				setState(675);
				match(Identifier);
				setState(676);
				match(OpenOp);
				setState(677);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(Function);
				setState(679);
				match(Identifier);
				setState(680);
				match(OpenOp);
				setState(681);
				match(CloseOp);
				setState(682);
				match(ArrowRight);
				setState(683);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(Function);
				setState(685);
				match(Identifier);
				setState(686);
				match(OpenOp);
				setState(687);
				functionParams();
				setState(688);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				setState(695);
				match(ArrowRight);
				setState(696);
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
			setState(700);
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
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				methodPerm();
				setState(703);
				functionGeneralModes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(Static);
				setState(706);
				functionGeneralModes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				methodPerm();
				setState(708);
				match(Static);
				setState(709);
				functionGeneralModes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				match(Final);
				setState(712);
				methodPerm();
				setState(713);
				match(Static);
				setState(714);
				functionGeneralModes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				match(Final);
				setState(717);
				methodPerm();
				setState(718);
				functionGeneralModes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(720);
				match(Final);
				setState(721);
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
			setState(724);
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
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(Identifier);
				setState(727);
				match(OpenOp);
				setState(728);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(Identifier);
				setState(730);
				match(OpenOp);
				setState(731);
				functionParams();
				setState(732);
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
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
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
				setState(737);
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
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
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
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				functionParamElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				functionParamElements();
				setState(748);
				match(Separator);
				setState(749);
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
			setState(753);
			match(Identifier);
			setState(754);
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
		public OopGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oopGeneral; }
	}

	public final OopGeneralContext oopGeneral() throws RecognitionException {
		OopGeneralContext _localctx = new OopGeneralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_oopGeneral);
		try {
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				interfaceClass();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				abstractClass();
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
			setState(760);
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
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(Interface);
				setState(763);
				match(Identifier);
				setState(764);
				match(OpenBlock);
				setState(765);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(Interface);
				setState(767);
				match(Identifier);
				setState(768);
				match(OpenBlock);
				setState(769);
				functionCodeBlock();
				setState(770);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(Interface);
				setState(773);
				match(Identifier);
				setState(774);
				match(Extends);
				setState(775);
				match(Identifier);
				setState(776);
				match(OpenBlock);
				setState(777);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				match(Interface);
				setState(779);
				match(Identifier);
				setState(780);
				match(Extends);
				setState(781);
				match(Identifier);
				setState(782);
				match(OpenBlock);
				setState(783);
				functionCodeBlock();
				setState(784);
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
			setState(788);
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
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(Abstract);
				setState(791);
				match(Identifier);
				setState(792);
				match(OpenBlock);
				setState(793);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(Abstract);
				setState(795);
				match(Identifier);
				setState(796);
				match(OpenBlock);
				setState(797);
				functionCodeBlock();
				setState(798);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				match(Abstract);
				setState(801);
				match(Identifier);
				setState(802);
				match(Extends);
				setState(803);
				match(Identifier);
				setState(804);
				match(OpenBlock);
				setState(805);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				match(Abstract);
				setState(807);
				match(Identifier);
				setState(808);
				match(Extends);
				setState(809);
				match(Identifier);
				setState(810);
				match(OpenBlock);
				setState(811);
				functionCodeBlock();
				setState(812);
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
		enterRule(_localctx, 118, RULE_generalValue);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(Identifier);
				setState(818);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				match(Integer);
				setState(821);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				match(Float);
				setState(824);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				match(String);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				indexArray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(827);
				associativeArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				operationBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(829);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0343\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00a9\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00d4\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012d\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0142\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0158\n\31\3\32\3\32\3\32\5\32\u015d\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0167\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u017c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0191\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019f\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u01a9\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u01b5\n \3!\3!\3!\3!\5!\u01bb\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u01c4\n\"\f\"\16\"\u01c7\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0229\n#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u023e\n$\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0252\n%\3&\3&\5&\u0256\n&"+
		"\3\'\3\'\5\'\u025a\n\'\3(\3(\5(\u025e\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u026a\n)\3*\3*\3*\3*\5*\u0270\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u027a"+
		"\n+\3,\3,\3,\3,\3-\3-\3-\5-\u0283\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02a3\n."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u02bd\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02d5\n\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02e1\n\63\3\64"+
		"\3\64\5\64\u02e5\n\64\3\65\3\65\3\65\3\65\5\65\u02eb\n\65\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u02f2\n\66\3\67\3\67\3\67\38\38\58\u02f9\n8\39\39\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u0315\n:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\5<\u0331\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\5=\u0341\n=\3=\2\4\4B>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\4\3\2 !\3\2"+
		"\13\r\2\u03a4\2z\3\2\2\2\4}\3\2\2\2\6\u008e\3\2\2\2\b\u0090\3\2\2\2\n"+
		"\u0092\3\2\2\2\f\u009b\3\2\2\2\16\u009d\3\2\2\2\20\u009f\3\2\2\2\22\u00a8"+
		"\3\2\2\2\24\u00b1\3\2\2\2\26\u00b9\3\2\2\2\30\u00c0\3\2\2\2\32\u00c8\3"+
		"\2\2\2\34\u00d3\3\2\2\2\36\u00d5\3\2\2\2 \u00dd\3\2\2\2\"\u012c\3\2\2"+
		"\2$\u012e\3\2\2\2&\u0130\3\2\2\2(\u0132\3\2\2\2*\u0141\3\2\2\2,\u0143"+
		"\3\2\2\2.\u014b\3\2\2\2\60\u0157\3\2\2\2\62\u015c\3\2\2\2\64\u0166\3\2"+
		"\2\2\66\u017b\3\2\2\28\u0190\3\2\2\2:\u019e\3\2\2\2<\u01a8\3\2\2\2>\u01b4"+
		"\3\2\2\2@\u01ba\3\2\2\2B\u01bc\3\2\2\2D\u0228\3\2\2\2F\u023d\3\2\2\2H"+
		"\u0251\3\2\2\2J\u0255\3\2\2\2L\u0259\3\2\2\2N\u025d\3\2\2\2P\u0269\3\2"+
		"\2\2R\u026f\3\2\2\2T\u0279\3\2\2\2V\u027b\3\2\2\2X\u0282\3\2\2\2Z\u02a2"+
		"\3\2\2\2\\\u02bc\3\2\2\2^\u02be\3\2\2\2`\u02d4\3\2\2\2b\u02d6\3\2\2\2"+
		"d\u02e0\3\2\2\2f\u02e4\3\2\2\2h\u02ea\3\2\2\2j\u02f1\3\2\2\2l\u02f3\3"+
		"\2\2\2n\u02f8\3\2\2\2p\u02fa\3\2\2\2r\u0314\3\2\2\2t\u0316\3\2\2\2v\u0330"+
		"\3\2\2\2x\u0340\3\2\2\2z{\5\4\3\2{|\7\2\2\3|\3\3\2\2\2}\u0082\b\3\1\2"+
		"~\177\f\4\2\2\177\u0081\5\6\4\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\5\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u008f\5\b\5\2\u0086\u008f\5\n\6\2\u0087\u008f\5\20\t\2\u0088\u008f"+
		"\5(\25\2\u0089\u008f\5\62\32\2\u008a\u008f\5F$\2\u008b\u008f\5Z.\2\u008c"+
		"\u008f\5V,\2\u008d\u008f\5n8\2\u008e\u0085\3\2\2\2\u008e\u0086\3\2\2\2"+
		"\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\7\3\2\2\2\u0090\u0091\7+\2\2\u0091\t\3\2\2\2\u0092\u0093\7\3\2\2\u0093"+
		"\u0094\5\f\7\2\u0094\u0095\7\24\2\2\u0095\13\3\2\2\2\u0096\u009c\5\16"+
		"\b\2\u0097\u0098\5\16\b\2\u0098\u0099\7\31\2\2\u0099\u009a\5\f\7\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c\r\3\2\2\2"+
		"\u009d\u009e\7\'\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1"+
		"\5\22\n\2\u00a1\u00a2\7\24\2\2\u00a2\21\3\2\2\2\u00a3\u00a9\5\24\13\2"+
		"\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5\22\n\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\23\3\2\2"+
		"\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7\25\2\2\u00ac\u00b2\5x=\2\u00ad\u00ae"+
		"\7$\2\2\u00ae\u00af\7&\2\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\5x=\2\u00b1"+
		"\u00aa\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\32\2"+
		"\2\u00b4\u00ba\7\33\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\30\r\2\u00b7"+
		"\u00b8\7\33\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3"+
		"\2\2\2\u00ba\27\3\2\2\2\u00bb\u00c1\5x=\2\u00bc\u00bd\5x=\2\u00bd\u00be"+
		"\7\31\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2"+
		"\u00c0\u00bc\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c9"+
		"\7\35\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\7\35"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9"+
		"\33\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00d4\5x=\2"+
		"\u00cd\u00ce\7$\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\5x=\2\u00d0\u00d1"+
		"\7\31\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d4\3\2\2\2\u00d3\u00ca\3\2\2"+
		"\2\u00d3\u00cd\3\2\2\2\u00d4\35\3\2\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7"+
		"\5 \21\2\u00d7\u00d8\7\37\2\2\u00d8\37\3\2\2\2\u00d9\u00de\5\"\22\2\u00da"+
		"\u00db\5\"\22\2\u00db\u00dc\5 \21\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00de!\3\2\2\2\u00df\u012d\7$\2\2\u00e0\u00e1"+
		"\7$\2\2\u00e1\u012d\7 \2\2\u00e2\u00e3\7$\2\2\u00e3\u012d\7&\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e6\7&\2\2\u00e6\u012d\7 \2\2\u00e7\u00e8\5$\23"+
		"\2\u00e8\u00e9\7$\2\2\u00e9\u012d\3\2\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec"+
		"\7$\2\2\u00ec\u00ed\7 \2\2\u00ed\u012d\3\2\2\2\u00ee\u00ef\5$\23\2\u00ef"+
		"\u00f0\7$\2\2\u00f0\u00f1\7&\2\2\u00f1\u012d\3\2\2\2\u00f2\u00f3\5$\23"+
		"\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\7&\2\2\u00f5\u00f6\7 \2\2\u00f6\u012d"+
		"\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8\u012d\5&\24\2\u00f9\u00fa\7$\2\2\u00fa"+
		"\u00fb\5&\24\2\u00fb\u00fc\7 \2\2\u00fc\u012d\3\2\2\2\u00fd\u00fe\7$\2"+
		"\2\u00fe\u00ff\5&\24\2\u00ff\u0100\7&\2\2\u0100\u012d\3\2\2\2\u0101\u0102"+
		"\7$\2\2\u0102\u0103\5&\24\2\u0103\u0104\7&\2\2\u0104\u0105\7 \2\2\u0105"+
		"\u012d\3\2\2\2\u0106\u012d\7(\2\2\u0107\u0108\7(\2\2\u0108\u012d\7 \2"+
		"\2\u0109\u010a\7(\2\2\u010a\u012d\7&\2\2\u010b\u010c\7(\2\2\u010c\u010d"+
		"\7&\2\2\u010d\u012d\7 \2\2\u010e\u012d\7)\2\2\u010f\u0110\7)\2\2\u0110"+
		"\u012d\7 \2\2\u0111\u0112\7)\2\2\u0112\u012d\7&\2\2\u0113\u0114\7)\2\2"+
		"\u0114\u0115\7&\2\2\u0115\u012d\7 \2\2\u0116\u012d\5*\26\2\u0117\u0118"+
		"\5*\26\2\u0118\u0119\7 \2\2\u0119\u012d\3\2\2\2\u011a\u011b\5*\26\2\u011b"+
		"\u011c\7&\2\2\u011c\u012d\3\2\2\2\u011d\u011e\5*\26\2\u011e\u011f\7&\2"+
		"\2\u011f\u0120\7 \2\2\u0120\u012d\3\2\2\2\u0121\u012d\5\36\20\2\u0122"+
		"\u0123\5\36\20\2\u0123\u0124\7 \2\2\u0124\u012d\3\2\2\2\u0125\u0126\5"+
		"\36\20\2\u0126\u0127\7&\2\2\u0127\u012d\3\2\2\2\u0128\u0129\5\36\20\2"+
		"\u0129\u012a\7&\2\2\u012a\u012b\7 \2\2\u012b\u012d\3\2\2\2\u012c\u00df"+
		"\3\2\2\2\u012c\u00e0\3\2\2\2\u012c\u00e2\3\2\2\2\u012c\u00e4\3\2\2\2\u012c"+
		"\u00e7\3\2\2\2\u012c\u00ea\3\2\2\2\u012c\u00ee\3\2\2\2\u012c\u00f2\3\2"+
		"\2\2\u012c\u00f7\3\2\2\2\u012c\u00f9\3\2\2\2\u012c\u00fd\3\2\2\2\u012c"+
		"\u0101\3\2\2\2\u012c\u0106\3\2\2\2\u012c\u0107\3\2\2\2\u012c\u0109\3\2"+
		"\2\2\u012c\u010b\3\2\2\2\u012c\u010e\3\2\2\2\u012c\u010f\3\2\2\2\u012c"+
		"\u0111\3\2\2\2\u012c\u0113\3\2\2\2\u012c\u0116\3\2\2\2\u012c\u0117\3\2"+
		"\2\2\u012c\u011a\3\2\2\2\u012c\u011d\3\2\2\2\u012c\u0121\3\2\2\2\u012c"+
		"\u0122\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0128\3\2\2\2\u012d#\3\2\2\2"+
		"\u012e\u012f\7#\2\2\u012f%\3\2\2\2\u0130\u0131\7#\2\2\u0131\'\3\2\2\2"+
		"\u0132\u0133\5*\26\2\u0133\u0134\7\24\2\2\u0134)\3\2\2\2\u0135\u0136\7"+
		"$\2\2\u0136\u0142\5.\30\2\u0137\u0138\7$\2\2\u0138\u0139\7\26\2\2\u0139"+
		"\u013a\5,\27\2\u013a\u013b\5.\30\2\u013b\u0142\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013d\u013e\7\30\2\2\u013e\u013f\5,\27\2\u013f\u0140\5.\30\2\u0140"+
		"\u0142\3\2\2\2\u0141\u0135\3\2\2\2\u0141\u0137\3\2\2\2\u0141\u013c\3\2"+
		"\2\2\u0142+\3\2\2\2\u0143\u0144\7$\2\2\u0144-\3\2\2\2\u0145\u0146\7\36"+
		"\2\2\u0146\u014c\7\37\2\2\u0147\u0148\7\36\2\2\u0148\u0149\5\60\31\2\u0149"+
		"\u014a\7\37\2\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0147\3"+
		"\2\2\2\u014c/\3\2\2\2\u014d\u0158\5x=\2\u014e\u014f\5x=\2\u014f\u0150"+
		"\7\31\2\2\u0150\u0151\5\60\31\2\u0151\u0158\3\2\2\2\u0152\u0158\5 \21"+
		"\2\u0153\u0154\5 \21\2\u0154\u0155\7\31\2\2\u0155\u0156\5\60\31\2\u0156"+
		"\u0158\3\2\2\2\u0157\u014d\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0152\3\2"+
		"\2\2\u0157\u0153\3\2\2\2\u0158\61\3\2\2\2\u0159\u015d\5\66\34\2\u015a"+
		"\u015d\58\35\2\u015b\u015d\5:\36\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\63\3\2\2\2\u015e\u0167\5\62\32\2\u015f"+
		"\u0160\5\62\32\2\u0160\u0161\5\64\33\2\u0161\u0167\3\2\2\2\u0162\u0167"+
		"\5\6\4\2\u0163\u0164\5\6\4\2\u0164\u0165\5\64\33\2\u0165\u0167\3\2\2\2"+
		"\u0166\u015e\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0163"+
		"\3\2\2\2\u0167\65\3\2\2\2\u0168\u0169\7\5\2\2\u0169\u016a\5> \2\u016a"+
		"\u016b\5(\25\2\u016b\u017c\3\2\2\2\u016c\u016d\7\5\2\2\u016d\u016e\5>"+
		" \2\u016e\u016f\7\34\2\2\u016f\u0170\7\35\2\2\u0170\u017c\3\2\2\2\u0171"+
		"\u0172\7\5\2\2\u0172\u0173\5> \2\u0173\u0174\7\34\2\2\u0174\u0175\5\64"+
		"\33\2\u0175\u0176\7\35\2\2\u0176\u017c\3\2\2\2\u0177\u0178\7\5\2\2\u0178"+
		"\u0179\5> \2\u0179\u017a\5<\37\2\u017a\u017c\3\2\2\2\u017b\u0168\3\2\2"+
		"\2\u017b\u016c\3\2\2\2\u017b\u0171\3\2\2\2\u017b\u0177\3\2\2\2\u017c\67"+
		"\3\2\2\2\u017d\u017e\7\6\2\2\u017e\u017f\5> \2\u017f\u0180\5(\25\2\u0180"+
		"\u0191\3\2\2\2\u0181\u0182\7\6\2\2\u0182\u0183\5> \2\u0183\u0184\7\34"+
		"\2\2\u0184\u0185\7\35\2\2\u0185\u0191\3\2\2\2\u0186\u0187\7\6\2\2\u0187"+
		"\u0188\5> \2\u0188\u0189\7\34\2\2\u0189\u018a\5\64\33\2\u018a\u018b\7"+
		"\35\2\2\u018b\u0191\3\2\2\2\u018c\u018d\7\6\2\2\u018d\u018e\5> \2\u018e"+
		"\u018f\5<\37\2\u018f\u0191\3\2\2\2\u0190\u017d\3\2\2\2\u0190\u0181\3\2"+
		"\2\2\u0190\u0186\3\2\2\2\u0190\u018c\3\2\2\2\u01919\3\2\2\2\u0192\u0193"+
		"\7\7\2\2\u0193\u019f\5(\25\2\u0194\u0195\7\7\2\2\u0195\u0196\7\34\2\2"+
		"\u0196\u019f\7\35\2\2\u0197\u0198\7\7\2\2\u0198\u0199\7\34\2\2\u0199\u019a"+
		"\5\64\33\2\u019a\u019b\7\35\2\2\u019b\u019f\3\2\2\2\u019c\u019d\7\7\2"+
		"\2\u019d\u019f\5<\37\2\u019e\u0192\3\2\2\2\u019e\u0194\3\2\2\2\u019e\u0197"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019f;\3\2\2\2\u01a0\u01a9\5\66\34\2\u01a1"+
		"\u01a2\5\66\34\2\u01a2\u01a3\5\64\33\2\u01a3\u01a9\3\2\2\2\u01a4\u01a9"+
		"\5F$\2\u01a5\u01a6\5F$\2\u01a6\u01a7\5T+\2\u01a7\u01a9\3\2\2\2\u01a8\u01a0"+
		"\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9"+
		"=\3\2\2\2\u01aa\u01b5\5@!\2\u01ab\u01ac\5@!\2\u01ac\u01ad\5> \2\u01ad"+
		"\u01b5\3\2\2\2\u01ae\u01b5\5B\"\2\u01af\u01b0\5B\"\2\u01b0\u01b1\5> \2"+
		"\u01b1\u01b5\3\2\2\2\u01b2\u01b3\7\"\2\2\u01b3\u01b5\5> \2\u01b4\u01aa"+
		"\3\2\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5?\3\2\2\2\u01b6\u01bb\5D#\2\u01b7\u01b8\5D#\2\u01b8"+
		"\u01b9\5@!\2\u01b9\u01bb\3\2\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b7\3\2\2"+
		"\2\u01bbA\3\2\2\2\u01bc\u01bd\b\"\1\2\u01bd\u01be\7\36\2\2\u01be\u01bf"+
		"\5> \2\u01bf\u01c0\7\37\2\2\u01c0\u01c5\3\2\2\2\u01c1\u01c2\f\3\2\2\u01c2"+
		"\u01c4\7!\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6C\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u0229"+
		"\7$\2\2\u01c9\u01ca\7$\2\2\u01ca\u0229\t\2\2\2\u01cb\u01cc\7$\2\2\u01cc"+
		"\u0229\7&\2\2\u01cd\u01ce\7$\2\2\u01ce\u01cf\7&\2\2\u01cf\u0229\t\2\2"+
		"\2\u01d0\u01d1\5$\23\2\u01d1\u01d2\7$\2\2\u01d2\u0229\3\2\2\2\u01d3\u01d4"+
		"\5$\23\2\u01d4\u01d5\7$\2\2\u01d5\u01d6\t\2\2\2\u01d6\u0229\3\2\2\2\u01d7"+
		"\u01d8\5$\23\2\u01d8\u01d9\7$\2\2\u01d9\u01da\7&\2\2\u01da\u0229\3\2\2"+
		"\2\u01db\u01dc\5$\23\2\u01dc\u01dd\7$\2\2\u01dd\u01de\7&\2\2\u01de\u01df"+
		"\t\2\2\2\u01df\u0229\3\2\2\2\u01e0\u01e1\7$\2\2\u01e1\u0229\5&\24\2\u01e2"+
		"\u01e3\7$\2\2\u01e3\u01e4\5&\24\2\u01e4\u01e5\t\2\2\2\u01e5\u0229\3\2"+
		"\2\2\u01e6\u01e7\7$\2\2\u01e7\u01e8\5&\24\2\u01e8\u01e9\7&\2\2\u01e9\u0229"+
		"\3\2\2\2\u01ea\u01eb\7$\2\2\u01eb\u01ec\5&\24\2\u01ec\u01ed\7&\2\2\u01ed"+
		"\u01ee\t\2\2\2\u01ee\u0229\3\2\2\2\u01ef\u0229\7(\2\2\u01f0\u01f1\7(\2"+
		"\2\u01f1\u0229\t\2\2\2\u01f2\u01f3\7(\2\2\u01f3\u0229\7&\2\2\u01f4\u01f5"+
		"\7(\2\2\u01f5\u01f6\7&\2\2\u01f6\u0229\t\2\2\2\u01f7\u0229\7)\2\2\u01f8"+
		"\u01f9\7)\2\2\u01f9\u0229\t\2\2\2\u01fa\u01fb\7)\2\2\u01fb\u0229\7&\2"+
		"\2\u01fc\u01fd\7)\2\2\u01fd\u01fe\7&\2\2\u01fe\u0229\t\2\2\2\u01ff\u0229"+
		"\5*\26\2\u0200\u0201\5*\26\2\u0201\u0202\t\2\2\2\u0202\u0229\3\2\2\2\u0203"+
		"\u0204\5*\26\2\u0204\u0205\7&\2\2\u0205\u0229\3\2\2\2\u0206\u0207\5*\26"+
		"\2\u0207\u0208\7&\2\2\u0208\u0209\t\2\2\2\u0209\u0229\3\2\2\2\u020a\u020b"+
		"\7$\2\2\u020b\u020c\7\25\2\2\u020c\u0229\5*\26\2\u020d\u020e\7$\2\2\u020e"+
		"\u020f\7\25\2\2\u020f\u0210\5*\26\2\u0210\u0211\t\2\2\2\u0211\u0229\3"+
		"\2\2\2\u0212\u0213\7$\2\2\u0213\u0214\7\25\2\2\u0214\u0215\5*\26\2\u0215"+
		"\u0216\7&\2\2\u0216\u0229\3\2\2\2\u0217\u0218\7$\2\2\u0218\u0219\7\25"+
		"\2\2\u0219\u021a\5*\26\2\u021a\u021b\7&\2\2\u021b\u021c\t\2\2\2\u021c"+
		"\u0229\3\2\2\2\u021d\u0229\5\36\20\2\u021e\u021f\5\36\20\2\u021f\u0220"+
		"\t\2\2\2\u0220\u0229\3\2\2\2\u0221\u0222\5\36\20\2\u0222\u0223\7&\2\2"+
		"\u0223\u0229\3\2\2\2\u0224\u0225\5\36\20\2\u0225\u0226\7&\2\2\u0226\u0227"+
		"\t\2\2\2\u0227\u0229\3\2\2\2\u0228\u01c8\3\2\2\2\u0228\u01c9\3\2\2\2\u0228"+
		"\u01cb\3\2\2\2\u0228\u01cd\3\2\2\2\u0228\u01d0\3\2\2\2\u0228\u01d3\3\2"+
		"\2\2\u0228\u01d7\3\2\2\2\u0228\u01db\3\2\2\2\u0228\u01e0\3\2\2\2\u0228"+
		"\u01e2\3\2\2\2\u0228\u01e6\3\2\2\2\u0228\u01ea\3\2\2\2\u0228\u01ef\3\2"+
		"\2\2\u0228\u01f0\3\2\2\2\u0228\u01f2\3\2\2\2\u0228\u01f4\3\2\2\2\u0228"+
		"\u01f7\3\2\2\2\u0228\u01f8\3\2\2\2\u0228\u01fa\3\2\2\2\u0228\u01fc\3\2"+
		"\2\2\u0228\u01ff\3\2\2\2\u0228\u0200\3\2\2\2\u0228\u0203\3\2\2\2\u0228"+
		"\u0206\3\2\2\2\u0228\u020a\3\2\2\2\u0228\u020d\3\2\2\2\u0228\u0212\3\2"+
		"\2\2\u0228\u0217\3\2\2\2\u0228\u021d\3\2\2\2\u0228\u021e\3\2\2\2\u0228"+
		"\u0221\3\2\2\2\u0228\u0224\3\2\2\2\u0229E\3\2\2\2\u022a\u022b\7\b\2\2"+
		"\u022b\u022c\5H%\2\u022c\u022d\7\34\2\2\u022d\u022e\7\35\2\2\u022e\u023e"+
		"\3\2\2\2\u022f\u0230\7\b\2\2\u0230\u0231\5H%\2\u0231\u0232\7\34\2\2\u0232"+
		"\u0233\5R*\2\u0233\u0234\7\35\2\2\u0234\u023e\3\2\2\2\u0235\u0236\7\b"+
		"\2\2\u0236\u0237\5H%\2\u0237\u0238\5(\25\2\u0238\u023e\3\2\2\2\u0239\u023a"+
		"\7\b\2\2\u023a\u023b\5H%\2\u023b\u023c\5T+\2\u023c\u023e\3\2\2\2\u023d"+
		"\u022a\3\2\2\2\u023d\u022f\3\2\2\2\u023d\u0235\3\2\2\2\u023d\u0239\3\2"+
		"\2\2\u023eG\3\2\2\2\u023f\u0240\7\36\2\2\u0240\u0241\5J&\2\u0241\u0242"+
		"\7\24\2\2\u0242\u0243\5L\'\2\u0243\u0244\7\24\2\2\u0244\u0245\5N(\2\u0245"+
		"\u0246\7\37\2\2\u0246\u0252\3\2\2\2\u0247\u0248\5J&\2\u0248\u0249\7\24"+
		"\2\2\u0249\u024a\5L\'\2\u024a\u024b\7\24\2\2\u024b\u024c\5N(\2\u024c\u0252"+
		"\3\2\2\2\u024d\u0252\5> \2\u024e\u024f\7\36\2\2\u024f\u0252\7\37\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u023f\3\2\2\2\u0251\u0247\3\2\2\2\u0251\u024d\3\2"+
		"\2\2\u0251\u024e\3\2\2\2\u0251\u0250\3\2\2\2\u0252I\3\2\2\2\u0253\u0256"+
		"\5\22\n\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2"+
		"\u0256K\3\2\2\2\u0257\u025a\5> \2\u0258\u025a\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u0258\3\2\2\2\u025aM\3\2\2\2\u025b\u025e\5P)\2\u025c\u025e"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025eO\3\2\2\2\u025f"+
		"\u026a\5 \21\2\u0260\u026a\5\36\20\2\u0261\u0262\5 \21\2\u0262\u0263\7"+
		"\31\2\2\u0263\u0264\5P)\2\u0264\u026a\3\2\2\2\u0265\u0266\5\36\20\2\u0266"+
		"\u0267\7\31\2\2\u0267\u0268\5P)\2\u0268\u026a\3\2\2\2\u0269\u025f\3\2"+
		"\2\2\u0269\u0260\3\2\2\2\u0269\u0261\3\2\2\2\u0269\u0265\3\2\2\2\u026a"+
		"Q\3\2\2\2\u026b\u0270\5\6\4\2\u026c\u026d\5\6\4\2\u026d\u026e\5R*\2\u026e"+
		"\u0270\3\2\2\2\u026f\u026b\3\2\2\2\u026f\u026c\3\2\2\2\u0270S\3\2\2\2"+
		"\u0271\u027a\5\66\34\2\u0272\u0273\5\66\34\2\u0273\u0274\5T+\2\u0274\u027a"+
		"\3\2\2\2\u0275\u027a\5F$\2\u0276\u0277\5F$\2\u0277\u0278\5T+\2\u0278\u027a"+
		"\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0272\3\2\2\2\u0279\u0275\3\2\2\2\u0279"+
		"\u0276\3\2\2\2\u027aU\3\2\2\2\u027b\u027c\7\t\2\2\u027c\u027d\5X-\2\u027d"+
		"\u027e\7\24\2\2\u027eW\3\2\2\2\u027f\u0283\5x=\2\u0280\u0283\5 \21\2\u0281"+
		"\u0283\5\36\20\2\u0282\u027f\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3"+
		"\2\2\2\u0283Y\3\2\2\2\u0284\u0285\5^\60\2\u0285\u0286\7\34\2\2\u0286\u0287"+
		"\7\35\2\2\u0287\u02a3\3\2\2\2\u0288\u0289\5^\60\2\u0289\u028a\7\34\2\2"+
		"\u028a\u028b\5h\65\2\u028b\u028c\7\35\2\2\u028c\u02a3\3\2\2\2\u028d\u028e"+
		"\5`\61\2\u028e\u028f\7\34\2\2\u028f\u0290\7\35\2\2\u0290\u02a3\3\2\2\2"+
		"\u0291\u0292\5`\61\2\u0292\u0293\7\34\2\2\u0293\u0294\5h\65\2\u0294\u0295"+
		"\7\35\2\2\u0295\u02a3\3\2\2\2\u0296\u0297\5d\63\2\u0297\u0298\7\34\2\2"+
		"\u0298\u0299\7\35\2\2\u0299\u02a3\3\2\2\2\u029a\u029b\5d\63\2\u029b\u029c"+
		"\7\34\2\2\u029c\u029d\5h\65\2\u029d\u029e\7\35\2\2\u029e\u02a3\3\2\2\2"+
		"\u029f\u02a0\5f\64\2\u02a0\u02a1\7\24\2\2\u02a1\u02a3\3\2\2\2\u02a2\u0284"+
		"\3\2\2\2\u02a2\u0288\3\2\2\2\u02a2\u028d\3\2\2\2\u02a2\u0291\3\2\2\2\u02a2"+
		"\u0296\3\2\2\2\u02a2\u029a\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3[\3\2\2\2"+
		"\u02a4\u02a5\7\n\2\2\u02a5\u02a6\7$\2\2\u02a6\u02a7\7\36\2\2\u02a7\u02bd"+
		"\7\37\2\2\u02a8\u02a9\7\n\2\2\u02a9\u02aa\7$\2\2\u02aa\u02ab\7\36\2\2"+
		"\u02ab\u02ac\7\37\2\2\u02ac\u02ad\7\23\2\2\u02ad\u02bd\7$\2\2\u02ae\u02af"+
		"\7\n\2\2\u02af\u02b0\7$\2\2\u02b0\u02b1\7\36\2\2\u02b1\u02b2\5j\66\2\u02b2"+
		"\u02b3\7\37\2\2\u02b3\u02bd\3\2\2\2\u02b4\u02b5\7\n\2\2\u02b5\u02b6\7"+
		"$\2\2\u02b6\u02b7\7\36\2\2\u02b7\u02b8\5j\66\2\u02b8\u02b9\7\37\2\2\u02b9"+
		"\u02ba\7\23\2\2\u02ba\u02bb\7$\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02a4\3\2"+
		"\2\2\u02bc\u02a8\3\2\2\2\u02bc\u02ae\3\2\2\2\u02bc\u02b4\3\2\2\2\u02bd"+
		"]\3\2\2\2\u02be\u02bf\5\\/\2\u02bf_\3\2\2\2\u02c0\u02c1\5b\62\2\u02c1"+
		"\u02c2\5\\/\2\u02c2\u02d5\3\2\2\2\u02c3\u02c4\7\16\2\2\u02c4\u02d5\5\\"+
		"/\2\u02c5\u02c6\5b\62\2\u02c6\u02c7\7\16\2\2\u02c7\u02c8\5\\/\2\u02c8"+
		"\u02d5\3\2\2\2\u02c9\u02ca\7\17\2\2\u02ca\u02cb\5b\62\2\u02cb\u02cc\7"+
		"\16\2\2\u02cc\u02cd\5\\/\2\u02cd\u02d5\3\2\2\2\u02ce\u02cf\7\17\2\2\u02cf"+
		"\u02d0\5b\62\2\u02d0\u02d1\5\\/\2\u02d1\u02d5\3\2\2\2\u02d2\u02d3\7\17"+
		"\2\2\u02d3\u02d5\5\\/\2\u02d4\u02c0\3\2\2\2\u02d4\u02c3\3\2\2\2\u02d4"+
		"\u02c5\3\2\2\2\u02d4\u02c9\3\2\2\2\u02d4\u02ce\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d5a\3\2\2\2\u02d6\u02d7\t\3\2\2\u02d7c\3\2\2\2\u02d8\u02d9\7$"+
		"\2\2\u02d9\u02da\7\36\2\2\u02da\u02e1\7\37\2\2\u02db\u02dc\7$\2\2\u02dc"+
		"\u02dd\7\36\2\2\u02dd\u02de\5j\66\2\u02de\u02df\7\37\2\2\u02df\u02e1\3"+
		"\2\2\2\u02e0\u02d8\3\2\2\2\u02e0\u02db\3\2\2\2\u02e1e\3\2\2\2\u02e2\u02e5"+
		"\5^\60\2\u02e3\u02e5\5`\61\2\u02e4\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5"+
		"g\3\2\2\2\u02e6\u02eb\5\6\4\2\u02e7\u02e8\5\6\4\2\u02e8\u02e9\5h\65\2"+
		"\u02e9\u02eb\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ebi\3"+
		"\2\2\2\u02ec\u02f2\5l\67\2\u02ed\u02ee\5l\67\2\u02ee\u02ef\7\31\2\2\u02ef"+
		"\u02f0\5j\66\2\u02f0\u02f2\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f1\u02ed\3\2"+
		"\2\2\u02f2k\3\2\2\2\u02f3\u02f4\7$\2\2\u02f4\u02f5\7&\2\2\u02f5m\3\2\2"+
		"\2\u02f6\u02f9\5p9\2\u02f7\u02f9\5t;\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7"+
		"\3\2\2\2\u02f9o\3\2\2\2\u02fa\u02fb\5r:\2\u02fbq\3\2\2\2\u02fc\u02fd\7"+
		"\20\2\2\u02fd\u02fe\7$\2\2\u02fe\u02ff\7\34\2\2\u02ff\u0315\7\35\2\2\u0300"+
		"\u0301\7\20\2\2\u0301\u0302\7$\2\2\u0302\u0303\7\34\2\2\u0303\u0304\5"+
		"h\65\2\u0304\u0305\7\35\2\2\u0305\u0315\3\2\2\2\u0306\u0307\7\20\2\2\u0307"+
		"\u0308\7$\2\2\u0308\u0309\7\22\2\2\u0309\u030a\7$\2\2\u030a\u030b\7\34"+
		"\2\2\u030b\u0315\7\35\2\2\u030c\u030d\7\20\2\2\u030d\u030e\7$\2\2\u030e"+
		"\u030f\7\22\2\2\u030f\u0310\7$\2\2\u0310\u0311\7\34\2\2\u0311\u0312\5"+
		"h\65\2\u0312\u0313\7\35\2\2\u0313\u0315\3\2\2\2\u0314\u02fc\3\2\2\2\u0314"+
		"\u0300\3\2\2\2\u0314\u0306\3\2\2\2\u0314\u030c\3\2\2\2\u0315s\3\2\2\2"+
		"\u0316\u0317\5v<\2\u0317u\3\2\2\2\u0318\u0319\7\21\2\2\u0319\u031a\7$"+
		"\2\2\u031a\u031b\7\34\2\2\u031b\u0331\7\35\2\2\u031c\u031d\7\21\2\2\u031d"+
		"\u031e\7$\2\2\u031e\u031f\7\34\2\2\u031f\u0320\5h\65\2\u0320\u0321\7\35"+
		"\2\2\u0321\u0331\3\2\2\2\u0322\u0323\7\21\2\2\u0323\u0324\7$\2\2\u0324"+
		"\u0325\7\22\2\2\u0325\u0326\7$\2\2\u0326\u0327\7\34\2\2\u0327\u0331\7"+
		"\35\2\2\u0328\u0329\7\21\2\2\u0329\u032a\7$\2\2\u032a\u032b\7\22\2\2\u032b"+
		"\u032c\7$\2\2\u032c\u032d\7\34\2\2\u032d\u032e\5h\65\2\u032e\u032f\7\35"+
		"\2\2\u032f\u0331\3\2\2\2\u0330\u0318\3\2\2\2\u0330\u031c\3\2\2\2\u0330"+
		"\u0322\3\2\2\2\u0330\u0328\3\2\2\2\u0331w\3\2\2\2\u0332\u0341\7$\2\2\u0333"+
		"\u0334\7$\2\2\u0334\u0341\7&\2\2\u0335\u0341\7(\2\2\u0336\u0337\7(\2\2"+
		"\u0337\u0341\7&\2\2\u0338\u0341\7)\2\2\u0339\u033a\7)\2\2\u033a\u0341"+
		"\7&\2\2\u033b\u0341\7\'\2\2\u033c\u0341\5\26\f\2\u033d\u0341\5\32\16\2"+
		"\u033e\u0341\5\36\20\2\u033f\u0341\5*\26\2\u0340\u0332\3\2\2\2\u0340\u0333"+
		"\3\2\2\2\u0340\u0335\3\2\2\2\u0340\u0336\3\2\2\2\u0340\u0338\3\2\2\2\u0340"+
		"\u0339\3\2\2\2\u0340\u033b\3\2\2\2\u0340\u033c\3\2\2\2\u0340\u033d\3\2"+
		"\2\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341y\3\2\2\2.\u0082\u008e"+
		"\u009b\u00a8\u00b1\u00b9\u00c0\u00c8\u00d3\u00dd\u012c\u0141\u014b\u0157"+
		"\u015c\u0166\u017b\u0190\u019e\u01a8\u01b4\u01ba\u01c5\u0228\u023d\u0251"+
		"\u0255\u0259\u025d\u0269\u026f\u0279\u0282\u02a2\u02bc\u02d4\u02e0\u02e4"+
		"\u02ea\u02f1\u02f8\u0314\u0330\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}