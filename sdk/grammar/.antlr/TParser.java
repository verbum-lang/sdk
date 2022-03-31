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
		RULE_conditionalExpressionElements = 25, RULE_conditionalExpElementsValue = 26, 
		RULE_conditionExpBlock = 27, RULE_conditionalExpValue = 28, RULE_blockElements = 29, 
		RULE_generalValue = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalExpressionElements", "conditionalExpElementsValue", "conditionExpBlock", 
			"conditionalExpValue", "blockElements", "generalValue"
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
			setState(62);
			fileContent(0);
			setState(63);
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
			setState(70);
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
					setState(66);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(67);
					sentence();
					}
					} 
				}
				setState(72);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				liveToken();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				callingFunction();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
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
			setState(80);
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
			setState(82);
			match(Use);
			setState(83);
			useValue();
			setState(84);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				useString();
				setState(88);
				match(Separator);
				setState(89);
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
			setState(93);
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
			setState(95);
			match(Var);
			setState(96);
			variableMembers();
			setState(97);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				variableDefinition();
				setState(101);
				match(Separator);
				setState(102);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(Identifier);
				setState(107);
				match(Attr);
				setState(108);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(Identifier);
				setState(110);
				match(TypeSpec);
				setState(111);
				match(Attr);
				setState(112);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(OpenArIndex);
				setState(116);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(OpenArIndex);
				setState(118);
				indexArrayElements();
				setState(119);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				generalValue();
				setState(125);
				match(Separator);
				setState(126);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(OpenBlock);
				setState(131);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(OpenBlock);
				setState(133);
				associativeArrayElements();
				setState(134);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(Identifier);
				setState(139);
				match(TwoPoint);
				setState(140);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Identifier);
				setState(142);
				match(TwoPoint);
				setState(143);
				generalValue();
				setState(144);
				match(Separator);
				setState(145);
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
			setState(149);
			match(OpenOp);
			setState(150);
			operationElements();
			setState(151);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				operationValue();
				setState(155);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(Identifier);
				setState(161);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(Identifier);
				setState(163);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(Identifier);
				setState(165);
				match(TypeSpec);
				setState(166);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				firstIncDec();
				setState(168);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				firstIncDec();
				setState(171);
				match(Identifier);
				setState(172);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				firstIncDec();
				setState(175);
				match(Identifier);
				setState(176);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				firstIncDec();
				setState(179);
				match(Identifier);
				setState(180);
				match(TypeSpec);
				setState(181);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				match(Identifier);
				setState(184);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				match(Identifier);
				setState(186);
				lastIncDec();
				setState(187);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				match(Identifier);
				setState(190);
				lastIncDec();
				setState(191);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(193);
				match(Identifier);
				setState(194);
				lastIncDec();
				setState(195);
				match(TypeSpec);
				setState(196);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(198);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(199);
				match(Integer);
				setState(200);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(201);
				match(Integer);
				setState(202);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(203);
				match(Integer);
				setState(204);
				match(TypeSpec);
				setState(205);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(206);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(207);
				match(Float);
				setState(208);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(209);
				match(Float);
				setState(210);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(211);
				match(Float);
				setState(212);
				match(TypeSpec);
				setState(213);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(214);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(215);
				functionCall();
				setState(216);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(218);
				functionCall();
				setState(219);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(221);
				functionCall();
				setState(222);
				match(TypeSpec);
				setState(223);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(225);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(226);
				operationBlock();
				setState(227);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(229);
				operationBlock();
				setState(230);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(232);
				operationBlock();
				setState(233);
				match(TypeSpec);
				setState(234);
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
			setState(238);
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
			setState(240);
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
			setState(242);
			functionCall();
			setState(243);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(Identifier);
				setState(246);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Identifier);
				setState(248);
				match(Point);
				setState(249);
				identifierB();
				setState(250);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(Identifier);
				setState(253);
				match(TwoTwoPoint);
				setState(254);
				identifierB();
				setState(255);
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
			setState(259);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(OpenOp);
				setState(262);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(OpenOp);
				setState(264);
				functionCallParamElements();
				setState(265);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				generalValue();
				setState(271);
				match(Separator);
				setState(272);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				operationElements();
				setState(276);
				match(Separator);
				setState(277);
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
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalExpressionElementsContext conditionalExpressionElements() {
			return getRuleContext(ConditionalExpressionElementsContext.class,0);
		}
		public CallingFunctionContext callingFunction() {
			return getRuleContext(CallingFunctionContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public BlockElementsContext blockElements() {
			return getRuleContext(BlockElementsContext.class,0);
		}
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalExpression);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(If);
				setState(282);
				conditionalExpressionElements();
				setState(283);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(If);
				setState(286);
				conditionalExpressionElements();
				setState(287);
				match(OpenBlock);
				setState(288);
				blockElements();
				setState(289);
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
		enterRule(_localctx, 50, RULE_conditionalExpressionElements);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				conditionalExpElementsValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				conditionalExpElementsValue();
				setState(295);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				conditionExpBlock(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				conditionExpBlock(0);
				setState(299);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				match(Not);
				setState(302);
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
		enterRule(_localctx, 52, RULE_conditionalExpElementsValue);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				conditionalExpValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				conditionalExpValue();
				setState(307);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_conditionExpBlock, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(312);
			match(OpenOp);
			setState(313);
			conditionalExpressionElements();
			setState(314);
			match(CloseOp);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpBlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpBlock);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					match(AssignmentOperator);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 56, RULE_conditionalExpValue);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(Identifier);
				setState(325);
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
				setState(326);
				match(Identifier);
				setState(327);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(Identifier);
				setState(329);
				match(TypeSpec);
				setState(330);
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
				setState(331);
				firstIncDec();
				setState(332);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				firstIncDec();
				setState(335);
				match(Identifier);
				setState(336);
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
				setState(338);
				firstIncDec();
				setState(339);
				match(Identifier);
				setState(340);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(342);
				firstIncDec();
				setState(343);
				match(Identifier);
				setState(344);
				match(TypeSpec);
				setState(345);
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
				setState(347);
				match(Identifier);
				setState(348);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				match(Identifier);
				setState(350);
				lastIncDec();
				setState(351);
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
				setState(353);
				match(Identifier);
				setState(354);
				lastIncDec();
				setState(355);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(357);
				match(Identifier);
				setState(358);
				lastIncDec();
				setState(359);
				match(TypeSpec);
				setState(360);
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
				setState(362);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(363);
				match(Integer);
				setState(364);
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
				setState(365);
				match(Integer);
				setState(366);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(367);
				match(Integer);
				setState(368);
				match(TypeSpec);
				setState(369);
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
				setState(370);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(371);
				match(Float);
				setState(372);
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
				setState(373);
				match(Float);
				setState(374);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(375);
				match(Float);
				setState(376);
				match(TypeSpec);
				setState(377);
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
				setState(378);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(379);
				functionCall();
				setState(380);
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
				setState(382);
				functionCall();
				setState(383);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(385);
				functionCall();
				setState(386);
				match(TypeSpec);
				setState(387);
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
				setState(389);
				match(Identifier);
				setState(390);
				match(Attr);
				setState(391);
				functionCall();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(392);
				match(Identifier);
				setState(393);
				match(Attr);
				setState(394);
				functionCall();
				setState(395);
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
				setState(397);
				match(Identifier);
				setState(398);
				match(Attr);
				setState(399);
				functionCall();
				setState(400);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(402);
				match(Identifier);
				setState(403);
				match(Attr);
				setState(404);
				functionCall();
				setState(405);
				match(TypeSpec);
				setState(406);
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
				setState(408);
				operationBlock();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(409);
				operationBlock();
				setState(410);
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
				setState(412);
				operationBlock();
				setState(413);
				match(TypeSpec);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(415);
				operationBlock();
				setState(416);
				match(TypeSpec);
				setState(417);
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
		enterRule(_localctx, 58, RULE_blockElements);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				conditionalExpression();
				setState(423);
				blockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				sentence();
				setState(427);
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
		enterRule(_localctx, 60, RULE_generalValue);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(Identifier);
				setState(433);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(Integer);
				setState(436);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				match(Float);
				setState(439);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441);
				match(String);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(442);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(443);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(444);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(445);
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
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\3\4\5\4Q"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0083\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00ef\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0104\n\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u011a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0126\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0132\n\33\3\34\3\34\3\34\3\34\5\34\u0138\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\7\35\u0141\n\35\f\35\16\35\u0144\13\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a6"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b0\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01c1\n \3 \2\4\48!\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3\3\2\25\26\2"+
		"\u0205\2@\3\2\2\2\4C\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f]\3\2\2"+
		"\2\16_\3\2\2\2\20a\3\2\2\2\22j\3\2\2\2\24s\3\2\2\2\26{\3\2\2\2\30\u0082"+
		"\3\2\2\2\32\u008a\3\2\2\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2 \u009f\3\2"+
		"\2\2\"\u00ee\3\2\2\2$\u00f0\3\2\2\2&\u00f2\3\2\2\2(\u00f4\3\2\2\2*\u0103"+
		"\3\2\2\2,\u0105\3\2\2\2.\u010d\3\2\2\2\60\u0119\3\2\2\2\62\u0125\3\2\2"+
		"\2\64\u0131\3\2\2\2\66\u0137\3\2\2\28\u0139\3\2\2\2:\u01a5\3\2\2\2<\u01af"+
		"\3\2\2\2>\u01c0\3\2\2\2@A\5\4\3\2AB\7\2\2\3B\3\3\2\2\2CH\b\3\1\2DE\f\4"+
		"\2\2EG\5\6\4\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3"+
		"\2\2\2KQ\5\b\5\2LQ\5\n\6\2MQ\5\20\t\2NQ\5(\25\2OQ\5\62\32\2PK\3\2\2\2"+
		"PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RS\7 \2\2S\t\3\2\2"+
		"\2TU\7\3\2\2UV\5\f\7\2VW\7\t\2\2W\13\3\2\2\2X^\5\16\b\2YZ\5\16\b\2Z[\7"+
		"\16\2\2[\\\5\f\7\2\\^\3\2\2\2]X\3\2\2\2]Y\3\2\2\2^\r\3\2\2\2_`\7\34\2"+
		"\2`\17\3\2\2\2ab\7\4\2\2bc\5\22\n\2cd\7\t\2\2d\21\3\2\2\2ek\5\24\13\2"+
		"fg\5\24\13\2gh\7\16\2\2hi\5\22\n\2ik\3\2\2\2je\3\2\2\2jf\3\2\2\2k\23\3"+
		"\2\2\2lm\7\31\2\2mn\7\n\2\2nt\5> \2op\7\31\2\2pq\7\33\2\2qr\7\n\2\2rt"+
		"\5> \2sl\3\2\2\2so\3\2\2\2t\25\3\2\2\2uv\7\17\2\2v|\7\20\2\2wx\7\17\2"+
		"\2xy\5\30\r\2yz\7\20\2\2z|\3\2\2\2{u\3\2\2\2{w\3\2\2\2|\27\3\2\2\2}\u0083"+
		"\5> \2~\177\5> \2\177\u0080\7\16\2\2\u0080\u0081\5\30\r\2\u0081\u0083"+
		"\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\7"+
		"\21\2\2\u0085\u008b\7\22\2\2\u0086\u0087\7\21\2\2\u0087\u0088\5\34\17"+
		"\2\u0088\u0089\7\22\2\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e\7\f\2"+
		"\2\u008e\u0096\5> \2\u008f\u0090\7\31\2\2\u0090\u0091\7\f\2\2\u0091\u0092"+
		"\5> \2\u0092\u0093\7\16\2\2\u0093\u0094\5\34\17\2\u0094\u0096\3\2\2\2"+
		"\u0095\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0096\35\3\2\2\2\u0097\u0098"+
		"\7\23\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\24\2\2\u009a\37\3\2\2\2\u009b"+
		"\u00a0\5\"\22\2\u009c\u009d\5\"\22\2\u009d\u009e\5 \21\2\u009e\u00a0\3"+
		"\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00ef"+
		"\7\31\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00ef\7\25\2\2\u00a4\u00a5\7\31\2"+
		"\2\u00a5\u00ef\7\33\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\7\33\2\2\u00a8"+
		"\u00ef\7\25\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\7\31\2\2\u00ab\u00ef\3"+
		"\2\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\7\25\2\2\u00af"+
		"\u00ef\3\2\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\7"+
		"\33\2\2\u00b3\u00ef\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\31\2\2\u00b6"+
		"\u00b7\7\33\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00ef\3\2\2\2\u00b9\u00ba\7"+
		"\31\2\2\u00ba\u00ef\5&\24\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\5&\24\2\u00bd"+
		"\u00be\7\25\2\2\u00be\u00ef\3\2\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1\5"+
		"&\24\2\u00c1\u00c2\7\33\2\2\u00c2\u00ef\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4"+
		"\u00c5\5&\24\2\u00c5\u00c6\7\33\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00ef\3"+
		"\2\2\2\u00c8\u00ef\7\35\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00ef\7\25\2\2"+
		"\u00cb\u00cc\7\35\2\2\u00cc\u00ef\7\33\2\2\u00cd\u00ce\7\35\2\2\u00ce"+
		"\u00cf\7\33\2\2\u00cf\u00ef\7\25\2\2\u00d0\u00ef\7\36\2\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00ef\7\25\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00ef\7\33\2"+
		"\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00ef\7\25\2\2\u00d8"+
		"\u00ef\5*\26\2\u00d9\u00da\5*\26\2\u00da\u00db\7\25\2\2\u00db\u00ef\3"+
		"\2\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7\33\2\2\u00de\u00ef\3\2\2\2\u00df"+
		"\u00e0\5*\26\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00ef\3"+
		"\2\2\2\u00e3\u00ef\5\36\20\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\25\2"+
		"\2\u00e6\u00ef\3\2\2\2\u00e7\u00e8\5\36\20\2\u00e8\u00e9\7\33\2\2\u00e9"+
		"\u00ef\3\2\2\2\u00ea\u00eb\5\36\20\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed"+
		"\7\25\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00a1\3\2\2\2\u00ee\u00a2\3\2\2\2"+
		"\u00ee\u00a4\3\2\2\2\u00ee\u00a6\3\2\2\2\u00ee\u00a9\3\2\2\2\u00ee\u00ac"+
		"\3\2\2\2\u00ee\u00b0\3\2\2\2\u00ee\u00b4\3\2\2\2\u00ee\u00b9\3\2\2\2\u00ee"+
		"\u00bb\3\2\2\2\u00ee\u00bf\3\2\2\2\u00ee\u00c3\3\2\2\2\u00ee\u00c8\3\2"+
		"\2\2\u00ee\u00c9\3\2\2\2\u00ee\u00cb\3\2\2\2\u00ee\u00cd\3\2\2\2\u00ee"+
		"\u00d0\3\2\2\2\u00ee\u00d1\3\2\2\2\u00ee\u00d3\3\2\2\2\u00ee\u00d5\3\2"+
		"\2\2\u00ee\u00d8\3\2\2\2\u00ee\u00d9\3\2\2\2\u00ee\u00dc\3\2\2\2\u00ee"+
		"\u00df\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e7\3\2"+
		"\2\2\u00ee\u00ea\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f1\7\30\2\2\u00f1%\3"+
		"\2\2\2\u00f2\u00f3\7\30\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\5*\26\2\u00f5"+
		"\u00f6\7\t\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7\31\2\2\u00f8\u0104\5.\30\2"+
		"\u00f9\u00fa\7\31\2\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd"+
		"\5.\30\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\7\r\2\2"+
		"\u0100\u0101\5,\27\2\u0101\u0102\5.\30\2\u0102\u0104\3\2\2\2\u0103\u00f7"+
		"\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u0104+\3\2\2\2\u0105"+
		"\u0106\7\31\2\2\u0106-\3\2\2\2\u0107\u0108\7\23\2\2\u0108\u010e\7\24\2"+
		"\2\u0109\u010a\7\23\2\2\u010a\u010b\5\60\31\2\u010b\u010c\7\24\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010e/\3\2\2\2"+
		"\u010f\u011a\5> \2\u0110\u0111\5> \2\u0111\u0112\7\16\2\2\u0112\u0113"+
		"\5\60\31\2\u0113\u011a\3\2\2\2\u0114\u011a\5 \21\2\u0115\u0116\5 \21\2"+
		"\u0116\u0117\7\16\2\2\u0117\u0118\5\60\31\2\u0118\u011a\3\2\2\2\u0119"+
		"\u010f\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2"+
		"\2\2\u011a\61\3\2\2\2\u011b\u011c\7\5\2\2\u011c\u011d\5\64\33\2\u011d"+
		"\u011e\5(\25\2\u011e\u0126\3\2\2\2\u011f\u0120\7\5\2\2\u0120\u0121\5\64"+
		"\33\2\u0121\u0122\7\21\2\2\u0122\u0123\5<\37\2\u0123\u0124\7\22\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011f\3\2\2\2\u0126\63\3\2\2"+
		"\2\u0127\u0132\5\66\34\2\u0128\u0129\5\66\34\2\u0129\u012a\5\64\33\2\u012a"+
		"\u0132\3\2\2\2\u012b\u0132\58\35\2\u012c\u012d\58\35\2\u012d\u012e\5\64"+
		"\33\2\u012e\u0132\3\2\2\2\u012f\u0130\7\27\2\2\u0130\u0132\5\64\33\2\u0131"+
		"\u0127\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\65\3\2\2\2\u0133\u0138\5:\36\2\u0134\u0135"+
		"\5:\36\2\u0135\u0136\5\66\34\2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2"+
		"\u0137\u0134\3\2\2\2\u0138\67\3\2\2\2\u0139\u013a\b\35\1\2\u013a\u013b"+
		"\7\23\2\2\u013b\u013c\5\64\33\2\u013c\u013d\7\24\2\2\u013d\u0142\3\2\2"+
		"\2\u013e\u013f\f\3\2\2\u013f\u0141\7\26\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0145\u01a6\7\31\2\2\u0146\u0147\7\31\2\2\u0147\u01a6"+
		"\t\2\2\2\u0148\u0149\7\31\2\2\u0149\u01a6\7\33\2\2\u014a\u014b\7\31\2"+
		"\2\u014b\u014c\7\33\2\2\u014c\u01a6\t\2\2\2\u014d\u014e\5$\23\2\u014e"+
		"\u014f\7\31\2\2\u014f\u01a6\3\2\2\2\u0150\u0151\5$\23\2\u0151\u0152\7"+
		"\31\2\2\u0152\u0153\t\2\2\2\u0153\u01a6\3\2\2\2\u0154\u0155\5$\23\2\u0155"+
		"\u0156\7\31\2\2\u0156\u0157\7\33\2\2\u0157\u01a6\3\2\2\2\u0158\u0159\5"+
		"$\23\2\u0159\u015a\7\31\2\2\u015a\u015b\7\33\2\2\u015b\u015c\t\2\2\2\u015c"+
		"\u01a6\3\2\2\2\u015d\u015e\7\31\2\2\u015e\u01a6\5&\24\2\u015f\u0160\7"+
		"\31\2\2\u0160\u0161\5&\24\2\u0161\u0162\t\2\2\2\u0162\u01a6\3\2\2\2\u0163"+
		"\u0164\7\31\2\2\u0164\u0165\5&\24\2\u0165\u0166\7\33\2\2\u0166\u01a6\3"+
		"\2\2\2\u0167\u0168\7\31\2\2\u0168\u0169\5&\24\2\u0169\u016a\7\33\2\2\u016a"+
		"\u016b\t\2\2\2\u016b\u01a6\3\2\2\2\u016c\u01a6\7\35\2\2\u016d\u016e\7"+
		"\35\2\2\u016e\u01a6\t\2\2\2\u016f\u0170\7\35\2\2\u0170\u01a6\7\33\2\2"+
		"\u0171\u0172\7\35\2\2\u0172\u0173\7\33\2\2\u0173\u01a6\t\2\2\2\u0174\u01a6"+
		"\7\36\2\2\u0175\u0176\7\36\2\2\u0176\u01a6\t\2\2\2\u0177\u0178\7\36\2"+
		"\2\u0178\u01a6\7\33\2\2\u0179\u017a\7\36\2\2\u017a\u017b\7\33\2\2\u017b"+
		"\u01a6\t\2\2\2\u017c\u01a6\5*\26\2\u017d\u017e\5*\26\2\u017e\u017f\t\2"+
		"\2\2\u017f\u01a6\3\2\2\2\u0180\u0181\5*\26\2\u0181\u0182\7\33\2\2\u0182"+
		"\u01a6\3\2\2\2\u0183\u0184\5*\26\2\u0184\u0185\7\33\2\2\u0185\u0186\t"+
		"\2\2\2\u0186\u01a6\3\2\2\2\u0187\u0188\7\31\2\2\u0188\u0189\7\n\2\2\u0189"+
		"\u01a6\5*\26\2\u018a\u018b\7\31\2\2\u018b\u018c\7\n\2\2\u018c\u018d\5"+
		"*\26\2\u018d\u018e\t\2\2\2\u018e\u01a6\3\2\2\2\u018f\u0190\7\31\2\2\u0190"+
		"\u0191\7\n\2\2\u0191\u0192\5*\26\2\u0192\u0193\7\33\2\2\u0193\u01a6\3"+
		"\2\2\2\u0194\u0195\7\31\2\2\u0195\u0196\7\n\2\2\u0196\u0197\5*\26\2\u0197"+
		"\u0198\7\33\2\2\u0198\u0199\t\2\2\2\u0199\u01a6\3\2\2\2\u019a\u01a6\5"+
		"\36\20\2\u019b\u019c\5\36\20\2\u019c\u019d\t\2\2\2\u019d\u01a6\3\2\2\2"+
		"\u019e\u019f\5\36\20\2\u019f\u01a0\7\33\2\2\u01a0\u01a6\3\2\2\2\u01a1"+
		"\u01a2\5\36\20\2\u01a2\u01a3\7\33\2\2\u01a3\u01a4\t\2\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u0145\3\2\2\2\u01a5\u0146\3\2\2\2\u01a5\u0148\3\2\2\2\u01a5"+
		"\u014a\3\2\2\2\u01a5\u014d\3\2\2\2\u01a5\u0150\3\2\2\2\u01a5\u0154\3\2"+
		"\2\2\u01a5\u0158\3\2\2\2\u01a5\u015d\3\2\2\2\u01a5\u015f\3\2\2\2\u01a5"+
		"\u0163\3\2\2\2\u01a5\u0167\3\2\2\2\u01a5\u016c\3\2\2\2\u01a5\u016d\3\2"+
		"\2\2\u01a5\u016f\3\2\2\2\u01a5\u0171\3\2\2\2\u01a5\u0174\3\2\2\2\u01a5"+
		"\u0175\3\2\2\2\u01a5\u0177\3\2\2\2\u01a5\u0179\3\2\2\2\u01a5\u017c\3\2"+
		"\2\2\u01a5\u017d\3\2\2\2\u01a5\u0180\3\2\2\2\u01a5\u0183\3\2\2\2\u01a5"+
		"\u0187\3\2\2\2\u01a5\u018a\3\2\2\2\u01a5\u018f\3\2\2\2\u01a5\u0194\3\2"+
		"\2\2\u01a5\u019a\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5"+
		"\u01a1\3\2\2\2\u01a6;\3\2\2\2\u01a7\u01b0\5\62\32\2\u01a8\u01a9\5\62\32"+
		"\2\u01a9\u01aa\5<\37\2\u01aa\u01b0\3\2\2\2\u01ab\u01b0\5\6\4\2\u01ac\u01ad"+
		"\5\6\4\2\u01ad\u01ae\5<\37\2\u01ae\u01b0\3\2\2\2\u01af\u01a7\3\2\2\2\u01af"+
		"\u01a8\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0=\3\2\2\2"+
		"\u01b1\u01c1\7\31\2\2\u01b2\u01b3\7\31\2\2\u01b3\u01c1\7\33\2\2\u01b4"+
		"\u01c1\7\35\2\2\u01b5\u01b6\7\35\2\2\u01b6\u01c1\7\33\2\2\u01b7\u01c1"+
		"\7\36\2\2\u01b8\u01b9\7\36\2\2\u01b9\u01c1\7\33\2\2\u01ba\u01c1\7\b\2"+
		"\2\u01bb\u01c1\7\34\2\2\u01bc\u01c1\5\26\f\2\u01bd\u01c1\5\32\16\2\u01be"+
		"\u01c1\5\36\20\2\u01bf\u01c1\5*\26\2\u01c0\u01b1\3\2\2\2\u01c0\u01b2\3"+
		"\2\2\2\u01c0\u01b4\3\2\2\2\u01c0\u01b5\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0"+
		"\u01b8\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2"+
		"\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"?\3\2\2\2\27HP]js{\u0082\u008a\u0095\u009f\u00ee\u0103\u010d\u0119\u0125"+
		"\u0131\u0137\u0142\u01a5\u01af\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}