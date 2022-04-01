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
		Use=1, Var=2, If=3, Elif=4, Else=5, Bool=6, End=7, Attr=8, Point=9, TwoPoint=10, 
		TwoTwoPoint=11, Separator=12, OpenArIndex=13, CloseArIndex=14, OpenBlock=15, 
		CloseBlock=16, OpenOp=17, CloseOp=18, ArithmeticOperator=19, AssignmentOperator=20, 
		Not=21, IncDecOperators=22, Identifier=23, IDPrefix=24, TypeSpec=25, String=26, 
		Integer=27, Float=28, Whitespace=29, Newline=30, Words=31, BlockComment=32, 
		LineComment=33;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveToken = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_callingFunction = 19, 
		RULE_functionCall = 20, RULE_identifierB = 21, RULE_functionCallParam = 22, 
		RULE_functionCallParamElements = 23, RULE_conditionalExpression = 24, 
		RULE_blockElements = 25, RULE_ifConditions = 26, RULE_elifConditions = 27, 
		RULE_elseConditions = 28, RULE_blockElementsLimited = 29, RULE_conditionalExpressionElements = 30, 
		RULE_conditionalExpElementsValue = 31, RULE_conditionExpBlock = 32, RULE_conditionalExpValue = 33, 
		RULE_generalValue = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"blockElements", "ifConditions", "elifConditions", "elseConditions", 
			"blockElementsLimited", "conditionalExpressionElements", "conditionalExpElementsValue", 
			"conditionExpBlock", "conditionalExpValue", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", null, "';'", "'='", 
			"'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
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
			setState(70);
			fileContent(0);
			setState(71);
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
			setState(78);
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
					setState(74);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(75);
					sentence();
					}
					} 
				}
				setState(80);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				liveToken();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				callingFunction();
				}
				break;
			case If:
			case Elif:
			case Else:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				conditionalExpression();
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
			setState(88);
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
			setState(90);
			match(Use);
			setState(91);
			useValue();
			setState(92);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				useString();
				setState(96);
				match(Separator);
				setState(97);
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
			setState(101);
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
			setState(103);
			match(Var);
			setState(104);
			variableMembers();
			setState(105);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				variableDefinition();
				setState(109);
				match(Separator);
				setState(110);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(Identifier);
				setState(115);
				match(Attr);
				setState(116);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(Identifier);
				setState(118);
				match(TypeSpec);
				setState(119);
				match(Attr);
				setState(120);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(OpenArIndex);
				setState(124);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(OpenArIndex);
				setState(126);
				indexArrayElements();
				setState(127);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				generalValue();
				setState(133);
				match(Separator);
				setState(134);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(OpenBlock);
				setState(139);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(OpenBlock);
				setState(141);
				associativeArrayElements();
				setState(142);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(TwoPoint);
				setState(148);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Identifier);
				setState(150);
				match(TwoPoint);
				setState(151);
				generalValue();
				setState(152);
				match(Separator);
				setState(153);
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
			setState(157);
			match(OpenOp);
			setState(158);
			operationElements();
			setState(159);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				operationValue();
				setState(163);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Identifier);
				setState(169);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(Identifier);
				setState(171);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(Identifier);
				setState(173);
				match(TypeSpec);
				setState(174);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				firstIncDec();
				setState(176);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				firstIncDec();
				setState(179);
				match(Identifier);
				setState(180);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				firstIncDec();
				setState(183);
				match(Identifier);
				setState(184);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				firstIncDec();
				setState(187);
				match(Identifier);
				setState(188);
				match(TypeSpec);
				setState(189);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(Identifier);
				setState(192);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				match(Identifier);
				setState(194);
				lastIncDec();
				setState(195);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(197);
				match(Identifier);
				setState(198);
				lastIncDec();
				setState(199);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
				match(Identifier);
				setState(202);
				lastIncDec();
				setState(203);
				match(TypeSpec);
				setState(204);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(206);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(207);
				match(Integer);
				setState(208);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(209);
				match(Integer);
				setState(210);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(211);
				match(Integer);
				setState(212);
				match(TypeSpec);
				setState(213);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(214);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(215);
				match(Float);
				setState(216);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(217);
				match(Float);
				setState(218);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				match(Float);
				setState(220);
				match(TypeSpec);
				setState(221);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(222);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(223);
				functionCall();
				setState(224);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(226);
				functionCall();
				setState(227);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(229);
				functionCall();
				setState(230);
				match(TypeSpec);
				setState(231);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(233);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(234);
				operationBlock();
				setState(235);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(237);
				operationBlock();
				setState(238);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(240);
				operationBlock();
				setState(241);
				match(TypeSpec);
				setState(242);
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
			setState(246);
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
			setState(248);
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
			setState(250);
			functionCall();
			setState(251);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(Identifier);
				setState(254);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(Identifier);
				setState(256);
				match(Point);
				setState(257);
				identifierB();
				setState(258);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(Identifier);
				setState(261);
				match(TwoTwoPoint);
				setState(262);
				identifierB();
				setState(263);
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
			setState(267);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(OpenOp);
				setState(270);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(OpenOp);
				setState(272);
				functionCallParamElements();
				setState(273);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				generalValue();
				setState(279);
				match(Separator);
				setState(280);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				operationElements();
				setState(284);
				match(Separator);
				setState(285);
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				ifConditions();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				elifConditions();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
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

	public static class BlockElementsContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public BlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElements; }
	}

	public final BlockElementsContext blockElements() throws RecognitionException {
		BlockElementsContext _localctx = new BlockElementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockElements);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				conditionalExpression();
				setState(296);
				blockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				sentence();
				setState(300);
				blockElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public BlockElementsLimitedContext blockElementsLimited() {
			return getRuleContext(BlockElementsLimitedContext.class,0);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(If);
				setState(305);
				conditionalExpressionElements();
				setState(306);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(If);
				setState(309);
				conditionalExpressionElements();
				setState(310);
				match(OpenBlock);
				setState(311);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(If);
				setState(314);
				conditionalExpressionElements();
				setState(315);
				match(OpenBlock);
				setState(316);
				blockElements();
				setState(317);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(If);
				setState(320);
				conditionalExpressionElements();
				setState(321);
				blockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public BlockElementsLimitedContext blockElementsLimited() {
			return getRuleContext(BlockElementsLimitedContext.class,0);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(Elif);
				setState(326);
				conditionalExpressionElements();
				setState(327);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(Elif);
				setState(330);
				conditionalExpressionElements();
				setState(331);
				match(OpenBlock);
				setState(332);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(Elif);
				setState(335);
				conditionalExpressionElements();
				setState(336);
				match(OpenBlock);
				setState(337);
				blockElements();
				setState(338);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(Elif);
				setState(341);
				conditionalExpressionElements();
				setState(342);
				blockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public BlockElementsLimitedContext blockElementsLimited() {
			return getRuleContext(BlockElementsLimitedContext.class,0);
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
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Else);
				setState(347);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(Else);
				setState(349);
				match(OpenBlock);
				setState(350);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(Else);
				setState(352);
				match(OpenBlock);
				setState(353);
				blockElements();
				setState(354);
				match(CloseBlock);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(Else);
				setState(357);
				blockElementsLimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockElementsLimitedContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public BlockElementsLimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElementsLimited; }
	}

	public final BlockElementsLimitedContext blockElementsLimited() throws RecognitionException {
		BlockElementsLimitedContext _localctx = new BlockElementsLimitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockElementsLimited);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				ifConditions();
				setState(362);
				blockElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				conditionalExpElementsValue();
				setState(368);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				conditionExpBlock(0);
				setState(372);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(Not);
				setState(375);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				conditionalExpValue();
				setState(380);
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
			setState(385);
			match(OpenOp);
			setState(386);
			conditionalExpressionElements();
			setState(387);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
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
					setState(389);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(390);
					match(AssignmentOperator);
					}
					} 
				}
				setState(395);
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
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(Identifier);
				setState(398);
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
				setState(399);
				match(Identifier);
				setState(400);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(Identifier);
				setState(402);
				match(TypeSpec);
				setState(403);
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
				setState(404);
				firstIncDec();
				setState(405);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				firstIncDec();
				setState(408);
				match(Identifier);
				setState(409);
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
				setState(411);
				firstIncDec();
				setState(412);
				match(Identifier);
				setState(413);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(415);
				firstIncDec();
				setState(416);
				match(Identifier);
				setState(417);
				match(TypeSpec);
				setState(418);
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
				setState(420);
				match(Identifier);
				setState(421);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(422);
				match(Identifier);
				setState(423);
				lastIncDec();
				setState(424);
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
				setState(426);
				match(Identifier);
				setState(427);
				lastIncDec();
				setState(428);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(430);
				match(Identifier);
				setState(431);
				lastIncDec();
				setState(432);
				match(TypeSpec);
				setState(433);
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
				setState(435);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(436);
				match(Integer);
				setState(437);
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
				setState(438);
				match(Integer);
				setState(439);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(440);
				match(Integer);
				setState(441);
				match(TypeSpec);
				setState(442);
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
				setState(443);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(444);
				match(Float);
				setState(445);
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
				setState(446);
				match(Float);
				setState(447);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(448);
				match(Float);
				setState(449);
				match(TypeSpec);
				setState(450);
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
				setState(451);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(452);
				functionCall();
				setState(453);
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
				setState(455);
				functionCall();
				setState(456);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(458);
				functionCall();
				setState(459);
				match(TypeSpec);
				setState(460);
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
				setState(462);
				match(Identifier);
				setState(463);
				match(Attr);
				setState(464);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(465);
				match(Identifier);
				setState(466);
				match(Attr);
				setState(467);
				functionCall();
				setState(468);
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
				setState(470);
				match(Identifier);
				setState(471);
				match(Attr);
				setState(472);
				functionCall();
				setState(473);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(475);
				match(Identifier);
				setState(476);
				match(Attr);
				setState(477);
				functionCall();
				setState(478);
				match(TypeSpec);
				setState(479);
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
				setState(481);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(482);
				operationBlock();
				setState(483);
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
				setState(485);
				operationBlock();
				setState(486);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(488);
				operationBlock();
				setState(489);
				match(TypeSpec);
				setState(490);
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

	public static class GeneralValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode Bool() { return getToken(TParser.Bool, 0); }
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
		enterRule(_localctx, 68, RULE_generalValue);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(Identifier);
				setState(496);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(Integer);
				setState(499);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				match(Float);
				setState(502);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(504);
				match(String);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(506);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(507);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(508);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0202\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7f\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0084\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0093\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u009e\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a8\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010c\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0116"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0122\n\31"+
		"\3\32\3\32\3\32\5\32\u0127\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0131\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0146\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u015b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0169\n\36\3\37\3\37\3\37\3\37\5\37\u016f\n\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017b\n \3!\3!\3!\3!\5!\u0181\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u018a\n\"\f\"\16\"\u018d\13\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u01ef\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0200\n$\3"+
		"$\2\4\4B%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\3\3\2\25\26\2\u024b\2H\3\2\2\2\4K\3\2\2\2\6X\3\2\2\2\bZ\3\2"+
		"\2\2\n\\\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22r\3\2\2\2\24{\3"+
		"\2\2\2\26\u0083\3\2\2\2\30\u008a\3\2\2\2\32\u0092\3\2\2\2\34\u009d\3\2"+
		"\2\2\36\u009f\3\2\2\2 \u00a7\3\2\2\2\"\u00f6\3\2\2\2$\u00f8\3\2\2\2&\u00fa"+
		"\3\2\2\2(\u00fc\3\2\2\2*\u010b\3\2\2\2,\u010d\3\2\2\2.\u0115\3\2\2\2\60"+
		"\u0121\3\2\2\2\62\u0126\3\2\2\2\64\u0130\3\2\2\2\66\u0145\3\2\2\28\u015a"+
		"\3\2\2\2:\u0168\3\2\2\2<\u016e\3\2\2\2>\u017a\3\2\2\2@\u0180\3\2\2\2B"+
		"\u0182\3\2\2\2D\u01ee\3\2\2\2F\u01ff\3\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3"+
		"\2\2\2KP\b\3\1\2LM\f\4\2\2MO\5\6\4\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\5\3\2\2\2RP\3\2\2\2SY\5\b\5\2TY\5\n\6\2UY\5\20\t\2VY\5(\25\2W"+
		"Y\5\62\32\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2"+
		"\2Z[\7 \2\2[\t\3\2\2\2\\]\7\3\2\2]^\5\f\7\2^_\7\t\2\2_\13\3\2\2\2`f\5"+
		"\16\b\2ab\5\16\b\2bc\7\16\2\2cd\5\f\7\2df\3\2\2\2e`\3\2\2\2ea\3\2\2\2"+
		"f\r\3\2\2\2gh\7\34\2\2h\17\3\2\2\2ij\7\4\2\2jk\5\22\n\2kl\7\t\2\2l\21"+
		"\3\2\2\2ms\5\24\13\2no\5\24\13\2op\7\16\2\2pq\5\22\n\2qs\3\2\2\2rm\3\2"+
		"\2\2rn\3\2\2\2s\23\3\2\2\2tu\7\31\2\2uv\7\n\2\2v|\5F$\2wx\7\31\2\2xy\7"+
		"\33\2\2yz\7\n\2\2z|\5F$\2{t\3\2\2\2{w\3\2\2\2|\25\3\2\2\2}~\7\17\2\2~"+
		"\u0084\7\20\2\2\177\u0080\7\17\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7"+
		"\20\2\2\u0082\u0084\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0084\27"+
		"\3\2\2\2\u0085\u008b\5F$\2\u0086\u0087\5F$\2\u0087\u0088\7\16\2\2\u0088"+
		"\u0089\5\30\r\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3"+
		"\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u0093\7\22\2\2\u008e"+
		"\u008f\7\21\2\2\u008f\u0090\5\34\17\2\u0090\u0091\7\22\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0093\33\3\2\2\2\u0094"+
		"\u0095\7\31\2\2\u0095\u0096\7\f\2\2\u0096\u009e\5F$\2\u0097\u0098\7\31"+
		"\2\2\u0098\u0099\7\f\2\2\u0099\u009a\5F$\2\u009a\u009b\7\16\2\2\u009b"+
		"\u009c\5\34\17\2\u009c\u009e\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3"+
		"\2\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\5 \21\2\u00a1"+
		"\u00a2\7\24\2\2\u00a2\37\3\2\2\2\u00a3\u00a8\5\"\22\2\u00a4\u00a5\5\""+
		"\22\2\u00a5\u00a6\5 \21\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8!\3\2\2\2\u00a9\u00f7\7\31\2\2\u00aa\u00ab\7\31\2"+
		"\2\u00ab\u00f7\7\25\2\2\u00ac\u00ad\7\31\2\2\u00ad\u00f7\7\33\2\2\u00ae"+
		"\u00af\7\31\2\2\u00af\u00b0\7\33\2\2\u00b0\u00f7\7\25\2\2\u00b1\u00b2"+
		"\5$\23\2\u00b2\u00b3\7\31\2\2\u00b3\u00f7\3\2\2\2\u00b4\u00b5\5$\23\2"+
		"\u00b5\u00b6\7\31\2\2\u00b6\u00b7\7\25\2\2\u00b7\u00f7\3\2\2\2\u00b8\u00b9"+
		"\5$\23\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00f7\3\2\2\2"+
		"\u00bc\u00bd\5$\23\2\u00bd\u00be\7\31\2\2\u00be\u00bf\7\33\2\2\u00bf\u00c0"+
		"\7\25\2\2\u00c0\u00f7\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00f7\5&\24\2"+
		"\u00c3\u00c4\7\31\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\7\25\2\2\u00c6\u00f7"+
		"\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\33\2\2"+
		"\u00ca\u00f7\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\5&\24\2\u00cd\u00ce"+
		"\7\33\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00f7\3\2\2\2\u00d0\u00f7\7\35\2"+
		"\2\u00d1\u00d2\7\35\2\2\u00d2\u00f7\7\25\2\2\u00d3\u00d4\7\35\2\2\u00d4"+
		"\u00f7\7\33\2\2\u00d5\u00d6\7\35\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00f7"+
		"\7\25\2\2\u00d8\u00f7\7\36\2\2\u00d9\u00da\7\36\2\2\u00da\u00f7\7\25\2"+
		"\2\u00db\u00dc\7\36\2\2\u00dc\u00f7\7\33\2\2\u00dd\u00de\7\36\2\2\u00de"+
		"\u00df\7\33\2\2\u00df\u00f7\7\25\2\2\u00e0\u00f7\5*\26\2\u00e1\u00e2\5"+
		"*\26\2\u00e2\u00e3\7\25\2\2\u00e3\u00f7\3\2\2\2\u00e4\u00e5\5*\26\2\u00e5"+
		"\u00e6\7\33\2\2\u00e6\u00f7\3\2\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7"+
		"\33\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00f7\3\2\2\2\u00eb\u00f7\5\36\20\2"+
		"\u00ec\u00ed\5\36\20\2\u00ed\u00ee\7\25\2\2\u00ee\u00f7\3\2\2\2\u00ef"+
		"\u00f0\5\36\20\2\u00f0\u00f1\7\33\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3"+
		"\5\36\20\2\u00f3\u00f4\7\33\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f7\3\2\2"+
		"\2\u00f6\u00a9\3\2\2\2\u00f6\u00aa\3\2\2\2\u00f6\u00ac\3\2\2\2\u00f6\u00ae"+
		"\3\2\2\2\u00f6\u00b1\3\2\2\2\u00f6\u00b4\3\2\2\2\u00f6\u00b8\3\2\2\2\u00f6"+
		"\u00bc\3\2\2\2\u00f6\u00c1\3\2\2\2\u00f6\u00c3\3\2\2\2\u00f6\u00c7\3\2"+
		"\2\2\u00f6\u00cb\3\2\2\2\u00f6\u00d0\3\2\2\2\u00f6\u00d1\3\2\2\2\u00f6"+
		"\u00d3\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6\u00d8\3\2\2\2\u00f6\u00d9\3\2"+
		"\2\2\u00f6\u00db\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e0\3\2\2\2\u00f6"+
		"\u00e1\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00eb\3\2"+
		"\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7"+
		"#\3\2\2\2\u00f8\u00f9\7\30\2\2\u00f9%\3\2\2\2\u00fa\u00fb\7\30\2\2\u00fb"+
		"\'\3\2\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\7\t\2\2\u00fe)\3\2\2\2\u00ff"+
		"\u0100\7\31\2\2\u0100\u010c\5.\30\2\u0101\u0102\7\31\2\2\u0102\u0103\7"+
		"\13\2\2\u0103\u0104\5,\27\2\u0104\u0105\5.\30\2\u0105\u010c\3\2\2\2\u0106"+
		"\u0107\7\31\2\2\u0107\u0108\7\r\2\2\u0108\u0109\5,\27\2\u0109\u010a\5"+
		".\30\2\u010a\u010c\3\2\2\2\u010b\u00ff\3\2\2\2\u010b\u0101\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010c+\3\2\2\2\u010d\u010e\7\31\2\2\u010e-\3\2\2\2\u010f"+
		"\u0110\7\23\2\2\u0110\u0116\7\24\2\2\u0111\u0112\7\23\2\2\u0112\u0113"+
		"\5\60\31\2\u0113\u0114\7\24\2\2\u0114\u0116\3\2\2\2\u0115\u010f\3\2\2"+
		"\2\u0115\u0111\3\2\2\2\u0116/\3\2\2\2\u0117\u0122\5F$\2\u0118\u0119\5"+
		"F$\2\u0119\u011a\7\16\2\2\u011a\u011b\5\60\31\2\u011b\u0122\3\2\2\2\u011c"+
		"\u0122\5 \21\2\u011d\u011e\5 \21\2\u011e\u011f\7\16\2\2\u011f\u0120\5"+
		"\60\31\2\u0120\u0122\3\2\2\2\u0121\u0117\3\2\2\2\u0121\u0118\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122\61\3\2\2\2\u0123\u0127\5\66\34"+
		"\2\u0124\u0127\58\35\2\u0125\u0127\5:\36\2\u0126\u0123\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127\63\3\2\2\2\u0128\u0131\5\62\32\2\u0129"+
		"\u012a\5\62\32\2\u012a\u012b\5\64\33\2\u012b\u0131\3\2\2\2\u012c\u0131"+
		"\5\6\4\2\u012d\u012e\5\6\4\2\u012e\u012f\5\64\33\2\u012f\u0131\3\2\2\2"+
		"\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d"+
		"\3\2\2\2\u0131\65\3\2\2\2\u0132\u0133\7\5\2\2\u0133\u0134\5> \2\u0134"+
		"\u0135\5(\25\2\u0135\u0146\3\2\2\2\u0136\u0137\7\5\2\2\u0137\u0138\5>"+
		" \2\u0138\u0139\7\21\2\2\u0139\u013a\7\22\2\2\u013a\u0146\3\2\2\2\u013b"+
		"\u013c\7\5\2\2\u013c\u013d\5> \2\u013d\u013e\7\21\2\2\u013e\u013f\5\64"+
		"\33\2\u013f\u0140\7\22\2\2\u0140\u0146\3\2\2\2\u0141\u0142\7\5\2\2\u0142"+
		"\u0143\5> \2\u0143\u0144\5<\37\2\u0144\u0146\3\2\2\2\u0145\u0132\3\2\2"+
		"\2\u0145\u0136\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u0141\3\2\2\2\u0146\67"+
		"\3\2\2\2\u0147\u0148\7\6\2\2\u0148\u0149\5> \2\u0149\u014a\5(\25\2\u014a"+
		"\u015b\3\2\2\2\u014b\u014c\7\6\2\2\u014c\u014d\5> \2\u014d\u014e\7\21"+
		"\2\2\u014e\u014f\7\22\2\2\u014f\u015b\3\2\2\2\u0150\u0151\7\6\2\2\u0151"+
		"\u0152\5> \2\u0152\u0153\7\21\2\2\u0153\u0154\5\64\33\2\u0154\u0155\7"+
		"\22\2\2\u0155\u015b\3\2\2\2\u0156\u0157\7\6\2\2\u0157\u0158\5> \2\u0158"+
		"\u0159\5<\37\2\u0159\u015b\3\2\2\2\u015a\u0147\3\2\2\2\u015a\u014b\3\2"+
		"\2\2\u015a\u0150\3\2\2\2\u015a\u0156\3\2\2\2\u015b9\3\2\2\2\u015c\u015d"+
		"\7\7\2\2\u015d\u0169\5(\25\2\u015e\u015f\7\7\2\2\u015f\u0160\7\21\2\2"+
		"\u0160\u0169\7\22\2\2\u0161\u0162\7\7\2\2\u0162\u0163\7\21\2\2\u0163\u0164"+
		"\5\64\33\2\u0164\u0165\7\22\2\2\u0165\u0169\3\2\2\2\u0166\u0167\7\7\2"+
		"\2\u0167\u0169\5<\37\2\u0168\u015c\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u0161"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169;\3\2\2\2\u016a\u016f\5\66\34\2\u016b"+
		"\u016c\5\66\34\2\u016c\u016d\5\64\33\2\u016d\u016f\3\2\2\2\u016e\u016a"+
		"\3\2\2\2\u016e\u016b\3\2\2\2\u016f=\3\2\2\2\u0170\u017b\5@!\2\u0171\u0172"+
		"\5@!\2\u0172\u0173\5> \2\u0173\u017b\3\2\2\2\u0174\u017b\5B\"\2\u0175"+
		"\u0176\5B\"\2\u0176\u0177\5> \2\u0177\u017b\3\2\2\2\u0178\u0179\7\27\2"+
		"\2\u0179\u017b\5> \2\u017a\u0170\3\2\2\2\u017a\u0171\3\2\2\2\u017a\u0174"+
		"\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0178\3\2\2\2\u017b?\3\2\2\2\u017c"+
		"\u0181\5D#\2\u017d\u017e\5D#\2\u017e\u017f\5@!\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0181A\3\2\2\2\u0182\u0183\b\"\1\2"+
		"\u0183\u0184\7\23\2\2\u0184\u0185\5> \2\u0185\u0186\7\24\2\2\u0186\u018b"+
		"\3\2\2\2\u0187\u0188\f\3\2\2\u0188\u018a\7\26\2\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cC\3"+
		"\2\2\2\u018d\u018b\3\2\2\2\u018e\u01ef\7\31\2\2\u018f\u0190\7\31\2\2\u0190"+
		"\u01ef\t\2\2\2\u0191\u0192\7\31\2\2\u0192\u01ef\7\33\2\2\u0193\u0194\7"+
		"\31\2\2\u0194\u0195\7\33\2\2\u0195\u01ef\t\2\2\2\u0196\u0197\5$\23\2\u0197"+
		"\u0198\7\31\2\2\u0198\u01ef\3\2\2\2\u0199\u019a\5$\23\2\u019a\u019b\7"+
		"\31\2\2\u019b\u019c\t\2\2\2\u019c\u01ef\3\2\2\2\u019d\u019e\5$\23\2\u019e"+
		"\u019f\7\31\2\2\u019f\u01a0\7\33\2\2\u01a0\u01ef\3\2\2\2\u01a1\u01a2\5"+
		"$\23\2\u01a2\u01a3\7\31\2\2\u01a3\u01a4\7\33\2\2\u01a4\u01a5\t\2\2\2\u01a5"+
		"\u01ef\3\2\2\2\u01a6\u01a7\7\31\2\2\u01a7\u01ef\5&\24\2\u01a8\u01a9\7"+
		"\31\2\2\u01a9\u01aa\5&\24\2\u01aa\u01ab\t\2\2\2\u01ab\u01ef\3\2\2\2\u01ac"+
		"\u01ad\7\31\2\2\u01ad\u01ae\5&\24\2\u01ae\u01af\7\33\2\2\u01af\u01ef\3"+
		"\2\2\2\u01b0\u01b1\7\31\2\2\u01b1\u01b2\5&\24\2\u01b2\u01b3\7\33\2\2\u01b3"+
		"\u01b4\t\2\2\2\u01b4\u01ef\3\2\2\2\u01b5\u01ef\7\35\2\2\u01b6\u01b7\7"+
		"\35\2\2\u01b7\u01ef\t\2\2\2\u01b8\u01b9\7\35\2\2\u01b9\u01ef\7\33\2\2"+
		"\u01ba\u01bb\7\35\2\2\u01bb\u01bc\7\33\2\2\u01bc\u01ef\t\2\2\2\u01bd\u01ef"+
		"\7\36\2\2\u01be\u01bf\7\36\2\2\u01bf\u01ef\t\2\2\2\u01c0\u01c1\7\36\2"+
		"\2\u01c1\u01ef\7\33\2\2\u01c2\u01c3\7\36\2\2\u01c3\u01c4\7\33\2\2\u01c4"+
		"\u01ef\t\2\2\2\u01c5\u01ef\5*\26\2\u01c6\u01c7\5*\26\2\u01c7\u01c8\t\2"+
		"\2\2\u01c8\u01ef\3\2\2\2\u01c9\u01ca\5*\26\2\u01ca\u01cb\7\33\2\2\u01cb"+
		"\u01ef\3\2\2\2\u01cc\u01cd\5*\26\2\u01cd\u01ce\7\33\2\2\u01ce\u01cf\t"+
		"\2\2\2\u01cf\u01ef\3\2\2\2\u01d0\u01d1\7\31\2\2\u01d1\u01d2\7\n\2\2\u01d2"+
		"\u01ef\5*\26\2\u01d3\u01d4\7\31\2\2\u01d4\u01d5\7\n\2\2\u01d5\u01d6\5"+
		"*\26\2\u01d6\u01d7\t\2\2\2\u01d7\u01ef\3\2\2\2\u01d8\u01d9\7\31\2\2\u01d9"+
		"\u01da\7\n\2\2\u01da\u01db\5*\26\2\u01db\u01dc\7\33\2\2\u01dc\u01ef\3"+
		"\2\2\2\u01dd\u01de\7\31\2\2\u01de\u01df\7\n\2\2\u01df\u01e0\5*\26\2\u01e0"+
		"\u01e1\7\33\2\2\u01e1\u01e2\t\2\2\2\u01e2\u01ef\3\2\2\2\u01e3\u01ef\5"+
		"\36\20\2\u01e4\u01e5\5\36\20\2\u01e5\u01e6\t\2\2\2\u01e6\u01ef\3\2\2\2"+
		"\u01e7\u01e8\5\36\20\2\u01e8\u01e9\7\33\2\2\u01e9\u01ef\3\2\2\2\u01ea"+
		"\u01eb\5\36\20\2\u01eb\u01ec\7\33\2\2\u01ec\u01ed\t\2\2\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u018e\3\2\2\2\u01ee\u018f\3\2\2\2\u01ee\u0191\3\2\2\2\u01ee"+
		"\u0193\3\2\2\2\u01ee\u0196\3\2\2\2\u01ee\u0199\3\2\2\2\u01ee\u019d\3\2"+
		"\2\2\u01ee\u01a1\3\2\2\2\u01ee\u01a6\3\2\2\2\u01ee\u01a8\3\2\2\2\u01ee"+
		"\u01ac\3\2\2\2\u01ee\u01b0\3\2\2\2\u01ee\u01b5\3\2\2\2\u01ee\u01b6\3\2"+
		"\2\2\u01ee\u01b8\3\2\2\2\u01ee\u01ba\3\2\2\2\u01ee\u01bd\3\2\2\2\u01ee"+
		"\u01be\3\2\2\2\u01ee\u01c0\3\2\2\2\u01ee\u01c2\3\2\2\2\u01ee\u01c5\3\2"+
		"\2\2\u01ee\u01c6\3\2\2\2\u01ee\u01c9\3\2\2\2\u01ee\u01cc\3\2\2\2\u01ee"+
		"\u01d0\3\2\2\2\u01ee\u01d3\3\2\2\2\u01ee\u01d8\3\2\2\2\u01ee\u01dd\3\2"+
		"\2\2\u01ee\u01e3\3\2\2\2\u01ee\u01e4\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee"+
		"\u01ea\3\2\2\2\u01efE\3\2\2\2\u01f0\u0200\7\31\2\2\u01f1\u01f2\7\31\2"+
		"\2\u01f2\u0200\7\33\2\2\u01f3\u0200\7\35\2\2\u01f4\u01f5\7\35\2\2\u01f5"+
		"\u0200\7\33\2\2\u01f6\u0200\7\36\2\2\u01f7\u01f8\7\36\2\2\u01f8\u0200"+
		"\7\33\2\2\u01f9\u0200\7\b\2\2\u01fa\u0200\7\34\2\2\u01fb\u0200\5\26\f"+
		"\2\u01fc\u0200\5\32\16\2\u01fd\u0200\5\36\20\2\u01fe\u0200\5*\26\2\u01ff"+
		"\u01f0\3\2\2\2\u01ff\u01f1\3\2\2\2\u01ff\u01f3\3\2\2\2\u01ff\u01f4\3\2"+
		"\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff"+
		"\u01fa\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u01fe\3\2\2\2\u0200G\3\2\2\2\33PXer{\u0083\u008a\u0092\u009d"+
		"\u00a7\u00f6\u010b\u0115\u0121\u0126\u0130\u0145\u015a\u0168\u016e\u017a"+
		"\u0180\u018b\u01ee\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}