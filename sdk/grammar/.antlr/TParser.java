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
		RULE_conditionalExpressionElements = 25, RULE_blockElements = 26, RULE_generalValue = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalExpressionElements", "blockElements", "generalValue"
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
			setState(56);
			fileContent(0);
			setState(57);
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
			setState(64);
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
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61);
					sentence();
					}
					} 
				}
				setState(66);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				liveToken();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				callingFunction();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
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
			setState(74);
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
			setState(76);
			match(Use);
			setState(77);
			useValue();
			setState(78);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				useString();
				setState(82);
				match(Separator);
				setState(83);
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
			setState(87);
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
			setState(89);
			match(Var);
			setState(90);
			variableMembers();
			setState(91);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				variableDefinition();
				setState(95);
				match(Separator);
				setState(96);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(Identifier);
				setState(101);
				match(Attr);
				setState(102);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(Identifier);
				setState(104);
				match(TypeSpec);
				setState(105);
				match(Attr);
				setState(106);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(OpenArIndex);
				setState(110);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(OpenArIndex);
				setState(112);
				indexArrayElements();
				setState(113);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				generalValue();
				setState(119);
				match(Separator);
				setState(120);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(OpenBlock);
				setState(125);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(OpenBlock);
				setState(127);
				associativeArrayElements();
				setState(128);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Identifier);
				setState(133);
				match(TwoPoint);
				setState(134);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(Identifier);
				setState(136);
				match(TwoPoint);
				setState(137);
				generalValue();
				setState(138);
				match(Separator);
				setState(139);
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
			setState(143);
			match(OpenOp);
			setState(144);
			operationElements();
			setState(145);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				operationValue();
				setState(149);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(Identifier);
				setState(155);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(Identifier);
				setState(159);
				match(TypeSpec);
				setState(160);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				firstIncDec();
				setState(162);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				firstIncDec();
				setState(165);
				match(Identifier);
				setState(166);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				firstIncDec();
				setState(169);
				match(Identifier);
				setState(170);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				firstIncDec();
				setState(173);
				match(Identifier);
				setState(174);
				match(TypeSpec);
				setState(175);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				match(Identifier);
				setState(178);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				match(Identifier);
				setState(180);
				lastIncDec();
				setState(181);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				match(Identifier);
				setState(184);
				lastIncDec();
				setState(185);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				match(Identifier);
				setState(188);
				lastIncDec();
				setState(189);
				match(TypeSpec);
				setState(190);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(192);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(193);
				match(Integer);
				setState(194);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(195);
				match(Integer);
				setState(196);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(197);
				match(Integer);
				setState(198);
				match(TypeSpec);
				setState(199);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(200);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(201);
				match(Float);
				setState(202);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(203);
				match(Float);
				setState(204);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(205);
				match(Float);
				setState(206);
				match(TypeSpec);
				setState(207);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(208);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(209);
				functionCall();
				setState(210);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(212);
				functionCall();
				setState(213);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(215);
				functionCall();
				setState(216);
				match(TypeSpec);
				setState(217);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(219);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(220);
				operationBlock();
				setState(221);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(223);
				operationBlock();
				setState(224);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(226);
				operationBlock();
				setState(227);
				match(TypeSpec);
				setState(228);
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
			setState(232);
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
			setState(234);
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
			setState(236);
			functionCall();
			setState(237);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(Identifier);
				setState(240);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(Identifier);
				setState(242);
				match(Point);
				setState(243);
				identifierB();
				setState(244);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(Identifier);
				setState(247);
				match(TwoTwoPoint);
				setState(248);
				identifierB();
				setState(249);
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
			setState(253);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(OpenOp);
				setState(256);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(OpenOp);
				setState(258);
				functionCallParamElements();
				setState(259);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				generalValue();
				setState(265);
				match(Separator);
				setState(266);
				functionCallParamElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				operationElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				operationElements();
				setState(270);
				match(Separator);
				setState(271);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(If);
				setState(276);
				conditionalExpressionElements();
				setState(277);
				callingFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(If);
				setState(280);
				conditionalExpressionElements();
				setState(281);
				match(OpenBlock);
				setState(282);
				blockElements();
				setState(283);
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
		public OperationElementsContext operationElements() {
			return getRuleContext(OperationElementsContext.class,0);
		}
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public List<ConditionalExpressionElementsContext> conditionalExpressionElements() {
			return getRuleContexts(ConditionalExpressionElementsContext.class);
		}
		public ConditionalExpressionElementsContext conditionalExpressionElements(int i) {
			return getRuleContext(ConditionalExpressionElementsContext.class,i);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				operationElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				operationElements();
				setState(289);
				match(AssignmentOperator);
				setState(290);
				conditionalExpressionElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(OpenOp);
				setState(293);
				conditionalExpressionElements();
				setState(294);
				match(CloseOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(OpenOp);
				setState(297);
				conditionalExpressionElements();
				setState(298);
				match(CloseOp);
				setState(299);
				match(AssignmentOperator);
				setState(300);
				conditionalExpressionElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(OpenOp);
				setState(303);
				match(Identifier);
				setState(304);
				match(Attr);
				setState(305);
				functionCall();
				setState(306);
				match(CloseOp);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				match(OpenOp);
				setState(309);
				match(Identifier);
				setState(310);
				match(Attr);
				setState(311);
				functionCall();
				setState(312);
				match(CloseOp);
				setState(313);
				match(AssignmentOperator);
				setState(314);
				conditionalExpressionElements();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				match(Not);
				setState(317);
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
		enterRule(_localctx, 52, RULE_blockElements);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				conditionalExpression();
				setState(322);
				blockElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				sentence();
				setState(326);
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
		enterRule(_localctx, 54, RULE_generalValue);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(Identifier);
				setState(332);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(Integer);
				setState(335);
				match(TypeSpec);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(Float);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				match(Float);
				setState(338);
				match(TypeSpec);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(340);
				match(String);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(343);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(344);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\ne\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0090\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u009a"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00fe\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0108\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0114"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0120\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0141\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u014b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u015c\n\35\3\35\2\3\4\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\2\u0184\2:\3\2\2\2\4=\3\2"+
		"\2\2\6J\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20[\3\2\2"+
		"\2\22d\3\2\2\2\24m\3\2\2\2\26u\3\2\2\2\30|\3\2\2\2\32\u0084\3\2\2\2\34"+
		"\u008f\3\2\2\2\36\u0091\3\2\2\2 \u0099\3\2\2\2\"\u00e8\3\2\2\2$\u00ea"+
		"\3\2\2\2&\u00ec\3\2\2\2(\u00ee\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2."+
		"\u0107\3\2\2\2\60\u0113\3\2\2\2\62\u011f\3\2\2\2\64\u0140\3\2\2\2\66\u014a"+
		"\3\2\2\28\u015b\3\2\2\2:;\5\4\3\2;<\7\2\2\3<\3\3\2\2\2=B\b\3\1\2>?\f\4"+
		"\2\2?A\5\6\4\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3"+
		"\2\2\2EK\5\b\5\2FK\5\n\6\2GK\5\20\t\2HK\5(\25\2IK\5\62\32\2JE\3\2\2\2"+
		"JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7 \2\2M\t\3\2\2"+
		"\2NO\7\3\2\2OP\5\f\7\2PQ\7\t\2\2Q\13\3\2\2\2RX\5\16\b\2ST\5\16\b\2TU\7"+
		"\16\2\2UV\5\f\7\2VX\3\2\2\2WR\3\2\2\2WS\3\2\2\2X\r\3\2\2\2YZ\7\34\2\2"+
		"Z\17\3\2\2\2[\\\7\4\2\2\\]\5\22\n\2]^\7\t\2\2^\21\3\2\2\2_e\5\24\13\2"+
		"`a\5\24\13\2ab\7\16\2\2bc\5\22\n\2ce\3\2\2\2d_\3\2\2\2d`\3\2\2\2e\23\3"+
		"\2\2\2fg\7\31\2\2gh\7\n\2\2hn\58\35\2ij\7\31\2\2jk\7\33\2\2kl\7\n\2\2"+
		"ln\58\35\2mf\3\2\2\2mi\3\2\2\2n\25\3\2\2\2op\7\17\2\2pv\7\20\2\2qr\7\17"+
		"\2\2rs\5\30\r\2st\7\20\2\2tv\3\2\2\2uo\3\2\2\2uq\3\2\2\2v\27\3\2\2\2w"+
		"}\58\35\2xy\58\35\2yz\7\16\2\2z{\5\30\r\2{}\3\2\2\2|w\3\2\2\2|x\3\2\2"+
		"\2}\31\3\2\2\2~\177\7\21\2\2\177\u0085\7\22\2\2\u0080\u0081\7\21\2\2\u0081"+
		"\u0082\5\34\17\2\u0082\u0083\7\22\2\2\u0083\u0085\3\2\2\2\u0084~\3\2\2"+
		"\2\u0084\u0080\3\2\2\2\u0085\33\3\2\2\2\u0086\u0087\7\31\2\2\u0087\u0088"+
		"\7\f\2\2\u0088\u0090\58\35\2\u0089\u008a\7\31\2\2\u008a\u008b\7\f\2\2"+
		"\u008b\u008c\58\35\2\u008c\u008d\7\16\2\2\u008d\u008e\5\34\17\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u0090\35\3\2\2"+
		"\2\u0091\u0092\7\23\2\2\u0092\u0093\5 \21\2\u0093\u0094\7\24\2\2\u0094"+
		"\37\3\2\2\2\u0095\u009a\5\"\22\2\u0096\u0097\5\"\22\2\u0097\u0098\5 \21"+
		"\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u009a!"+
		"\3\2\2\2\u009b\u00e9\7\31\2\2\u009c\u009d\7\31\2\2\u009d\u00e9\7\25\2"+
		"\2\u009e\u009f\7\31\2\2\u009f\u00e9\7\33\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a2\7\33\2\2\u00a2\u00e9\7\25\2\2\u00a3\u00a4\5$\23\2\u00a4\u00a5\7"+
		"\31\2\2\u00a5\u00e9\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\31\2\2\u00a8"+
		"\u00a9\7\25\2\2\u00a9\u00e9\3\2\2\2\u00aa\u00ab\5$\23\2\u00ab\u00ac\7"+
		"\31\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00e9\3\2\2\2\u00ae\u00af\5$\23\2\u00af"+
		"\u00b0\7\31\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00e9"+
		"\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00e9\5&\24\2\u00b5\u00b6\7\31\2\2"+
		"\u00b6\u00b7\5&\24\2\u00b7\u00b8\7\25\2\2\u00b8\u00e9\3\2\2\2\u00b9\u00ba"+
		"\7\31\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\7\33\2\2\u00bc\u00e9\3\2\2\2"+
		"\u00bd\u00be\7\31\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\7\33\2\2\u00c0\u00c1"+
		"\7\25\2\2\u00c1\u00e9\3\2\2\2\u00c2\u00e9\7\35\2\2\u00c3\u00c4\7\35\2"+
		"\2\u00c4\u00e9\7\25\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00e9\7\33\2\2\u00c7"+
		"\u00c8\7\35\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00e9\7\25\2\2\u00ca\u00e9"+
		"\7\36\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00e9\7\25\2\2\u00cd\u00ce\7\36\2"+
		"\2\u00ce\u00e9\7\33\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7\33\2\2\u00d1"+
		"\u00e9\7\25\2\2\u00d2\u00e9\5*\26\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\7"+
		"\25\2\2\u00d5\u00e9\3\2\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7\33\2\2\u00d8"+
		"\u00e9\3\2\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7\33\2\2\u00db\u00dc\7"+
		"\25\2\2\u00dc\u00e9\3\2\2\2\u00dd\u00e9\5\36\20\2\u00de\u00df\5\36\20"+
		"\2\u00df\u00e0\7\25\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00e2\5\36\20\2\u00e2"+
		"\u00e3\7\33\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6"+
		"\7\33\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e9\3\2\2\2\u00e8\u009b\3\2\2\2"+
		"\u00e8\u009c\3\2\2\2\u00e8\u009e\3\2\2\2\u00e8\u00a0\3\2\2\2\u00e8\u00a3"+
		"\3\2\2\2\u00e8\u00a6\3\2\2\2\u00e8\u00aa\3\2\2\2\u00e8\u00ae\3\2\2\2\u00e8"+
		"\u00b3\3\2\2\2\u00e8\u00b5\3\2\2\2\u00e8\u00b9\3\2\2\2\u00e8\u00bd\3\2"+
		"\2\2\u00e8\u00c2\3\2\2\2\u00e8\u00c3\3\2\2\2\u00e8\u00c5\3\2\2\2\u00e8"+
		"\u00c7\3\2\2\2\u00e8\u00ca\3\2\2\2\u00e8\u00cb\3\2\2\2\u00e8\u00cd\3\2"+
		"\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e8\u00d3\3\2\2\2\u00e8"+
		"\u00d6\3\2\2\2\u00e8\u00d9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00eb"+
		"\7\30\2\2\u00eb%\3\2\2\2\u00ec\u00ed\7\30\2\2\u00ed\'\3\2\2\2\u00ee\u00ef"+
		"\5*\26\2\u00ef\u00f0\7\t\2\2\u00f0)\3\2\2\2\u00f1\u00f2\7\31\2\2\u00f2"+
		"\u00fe\5.\30\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\5"+
		",\27\2\u00f6\u00f7\5.\30\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\7\31\2\2\u00f9"+
		"\u00fa\7\r\2\2\u00fa\u00fb\5,\27\2\u00fb\u00fc\5.\30\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe"+
		"+\3\2\2\2\u00ff\u0100\7\31\2\2\u0100-\3\2\2\2\u0101\u0102\7\23\2\2\u0102"+
		"\u0108\7\24\2\2\u0103\u0104\7\23\2\2\u0104\u0105\5\60\31\2\u0105\u0106"+
		"\7\24\2\2\u0106\u0108\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0103\3\2\2\2"+
		"\u0108/\3\2\2\2\u0109\u0114\58\35\2\u010a\u010b\58\35\2\u010b\u010c\7"+
		"\16\2\2\u010c\u010d\5\60\31\2\u010d\u0114\3\2\2\2\u010e\u0114\5 \21\2"+
		"\u010f\u0110\5 \21\2\u0110\u0111\7\16\2\2\u0111\u0112\5\60\31\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010e\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0114\61\3\2\2\2\u0115\u0116\7\5\2\2\u0116\u0117"+
		"\5\64\33\2\u0117\u0118\5(\25\2\u0118\u0120\3\2\2\2\u0119\u011a\7\5\2\2"+
		"\u011a\u011b\5\64\33\2\u011b\u011c\7\21\2\2\u011c\u011d\5\66\34\2\u011d"+
		"\u011e\7\22\2\2\u011e\u0120\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u0119\3"+
		"\2\2\2\u0120\63\3\2\2\2\u0121\u0141\5 \21\2\u0122\u0123\5 \21\2\u0123"+
		"\u0124\7\26\2\2\u0124\u0125\5\64\33\2\u0125\u0141\3\2\2\2\u0126\u0127"+
		"\7\23\2\2\u0127\u0128\5\64\33\2\u0128\u0129\7\24\2\2\u0129\u0141\3\2\2"+
		"\2\u012a\u012b\7\23\2\2\u012b\u012c\5\64\33\2\u012c\u012d\7\24\2\2\u012d"+
		"\u012e\7\26\2\2\u012e\u012f\5\64\33\2\u012f\u0141\3\2\2\2\u0130\u0131"+
		"\7\23\2\2\u0131\u0132\7\31\2\2\u0132\u0133\7\n\2\2\u0133\u0134\5*\26\2"+
		"\u0134\u0135\7\24\2\2\u0135\u0141\3\2\2\2\u0136\u0137\7\23\2\2\u0137\u0138"+
		"\7\31\2\2\u0138\u0139\7\n\2\2\u0139\u013a\5*\26\2\u013a\u013b\7\24\2\2"+
		"\u013b\u013c\7\26\2\2\u013c\u013d\5\64\33\2\u013d\u0141\3\2\2\2\u013e"+
		"\u013f\7\27\2\2\u013f\u0141\5\64\33\2\u0140\u0121\3\2\2\2\u0140\u0122"+
		"\3\2\2\2\u0140\u0126\3\2\2\2\u0140\u012a\3\2\2\2\u0140\u0130\3\2\2\2\u0140"+
		"\u0136\3\2\2\2\u0140\u013e\3\2\2\2\u0141\65\3\2\2\2\u0142\u014b\5\62\32"+
		"\2\u0143\u0144\5\62\32\2\u0144\u0145\5\66\34\2\u0145\u014b\3\2\2\2\u0146"+
		"\u014b\5\6\4\2\u0147\u0148\5\6\4\2\u0148\u0149\5\66\34\2\u0149\u014b\3"+
		"\2\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014b\67\3\2\2\2\u014c\u015c\7\31\2\2\u014d\u014e\7\31"+
		"\2\2\u014e\u015c\7\33\2\2\u014f\u015c\7\35\2\2\u0150\u0151\7\35\2\2\u0151"+
		"\u015c\7\33\2\2\u0152\u015c\7\36\2\2\u0153\u0154\7\36\2\2\u0154\u015c"+
		"\7\33\2\2\u0155\u015c\7\b\2\2\u0156\u015c\7\34\2\2\u0157\u015c\5\26\f"+
		"\2\u0158\u015c\5\32\16\2\u0159\u015c\5\36\20\2\u015a\u015c\5*\26\2\u015b"+
		"\u014c\3\2\2\2\u015b\u014d\3\2\2\2\u015b\u014f\3\2\2\2\u015b\u0150\3\2"+
		"\2\2\u015b\u0152\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0155\3\2\2\2\u015b"+
		"\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015a\3\2\2\2\u015c9\3\2\2\2\24BJWdmu|\u0084\u008f\u0099\u00e8"+
		"\u00fd\u0107\u0113\u011f\u0140\u014a\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}