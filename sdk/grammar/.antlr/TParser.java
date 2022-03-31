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
		CloseBlock=16, OpenOp=17, CloseOp=18, ArithmeticOperator=19, IncDecOperators=20, 
		Identifier=21, IDPrefix=22, TypeSpec=23, String=24, Integer=25, Float=26, 
		Whitespace=27, Newline=28, Words=29, BlockComment=30, LineComment=31;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveTokens = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_callingFunction = 19, 
		RULE_functionCall = 20, RULE_identifierB = 21, RULE_functionCallParam = 22, 
		RULE_functionCallParamElements = 23, RULE_conditionalExpression = 24, 
		RULE_conditionalExpressionElements = 25, RULE_generalValue = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
			"identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
			"conditionalExpressionElements", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", null, "';'", "'='", 
			"'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", "Integer", 
			"Float", "Whitespace", "Newline", "Words", "BlockComment", "LineComment"
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
			setState(54);
			fileContent(0);
			setState(55);
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
			setState(62);
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
					setState(58);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(59);
					sentence();
					}
					} 
				}
				setState(64);
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
		public LiveTokensContext liveTokens() {
			return getRuleContext(LiveTokensContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				liveTokens();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				variable();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				callingFunction();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
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

	public static class LiveTokensContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(TParser.Newline, 0); }
		public LiveTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liveTokens; }
	}

	public final LiveTokensContext liveTokens() throws RecognitionException {
		LiveTokensContext _localctx = new LiveTokensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liveTokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
			setState(74);
			match(Use);
			setState(75);
			useValue();
			setState(76);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				useString();
				setState(80);
				match(Separator);
				setState(81);
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
			setState(85);
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
			setState(87);
			match(Var);
			setState(88);
			variableMembers();
			setState(89);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				variableDefinition();
				setState(93);
				match(Separator);
				setState(94);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(Identifier);
				setState(99);
				match(Attr);
				setState(100);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(Identifier);
				setState(102);
				match(TypeSpec);
				setState(103);
				match(Attr);
				setState(104);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(OpenArIndex);
				setState(108);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(OpenArIndex);
				setState(110);
				indexArrayElements();
				setState(111);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				generalValue();
				setState(117);
				match(Separator);
				setState(118);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(OpenBlock);
				setState(123);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OpenBlock);
				setState(125);
				associativeArrayElements();
				setState(126);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(Identifier);
				setState(131);
				match(TwoPoint);
				setState(132);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(Identifier);
				setState(134);
				match(TwoPoint);
				setState(135);
				generalValue();
				setState(136);
				match(Separator);
				setState(137);
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
			setState(141);
			match(OpenOp);
			setState(142);
			operationElements();
			setState(143);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				operationValue();
				setState(147);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(Identifier);
				setState(153);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(Identifier);
				setState(155);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(TypeSpec);
				setState(158);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				firstIncDec();
				setState(160);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				firstIncDec();
				setState(163);
				match(Identifier);
				setState(164);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				firstIncDec();
				setState(167);
				match(Identifier);
				setState(168);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				firstIncDec();
				setState(171);
				match(Identifier);
				setState(172);
				match(TypeSpec);
				setState(173);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				match(Identifier);
				setState(176);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				match(Identifier);
				setState(178);
				lastIncDec();
				setState(179);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				match(Identifier);
				setState(182);
				lastIncDec();
				setState(183);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(185);
				match(Identifier);
				setState(186);
				lastIncDec();
				setState(187);
				match(TypeSpec);
				setState(188);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(190);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(191);
				match(Integer);
				setState(192);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				match(Integer);
				setState(194);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(195);
				match(Integer);
				setState(196);
				match(TypeSpec);
				setState(197);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(198);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(199);
				match(Float);
				setState(200);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(201);
				match(Float);
				setState(202);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(203);
				match(Float);
				setState(204);
				match(TypeSpec);
				setState(205);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(206);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(207);
				functionCall();
				setState(208);
				match(ArithmeticOperator);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(210);
				functionCall();
				setState(211);
				match(TypeSpec);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(213);
				functionCall();
				setState(214);
				match(TypeSpec);
				setState(215);
				match(ArithmeticOperator);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(217);
				operationBlock();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(218);
				operationBlock();
				setState(219);
				match(ArithmeticOperator);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(221);
				operationBlock();
				setState(222);
				match(TypeSpec);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(224);
				operationBlock();
				setState(225);
				match(TypeSpec);
				setState(226);
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
			setState(230);
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
			setState(234);
			functionCall();
			setState(235);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(Identifier);
				setState(238);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(Identifier);
				setState(240);
				match(Point);
				setState(241);
				identifierB();
				setState(242);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(Identifier);
				setState(245);
				match(TwoTwoPoint);
				setState(246);
				identifierB();
				setState(247);
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
			setState(251);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(OpenOp);
				setState(254);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(OpenOp);
				setState(256);
				functionCallParamElements();
				setState(257);
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
		public FunctionCallParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParamElements; }
	}

	public final FunctionCallParamElementsContext functionCallParamElements() throws RecognitionException {
		FunctionCallParamElementsContext _localctx = new FunctionCallParamElementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCallParamElements);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				generalValue();
				setState(263);
				match(Separator);
				setState(264);
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
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(If);
				setState(269);
				conditionalExpressionElements();
				setState(270);
				match(OpenBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(If);
				setState(273);
				conditionalExpressionElements();
				setState(274);
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

	public static class ConditionalExpressionElementsContext extends ParserRuleContext {
		public ConditionalExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionElements; }
	}

	public final ConditionalExpressionElementsContext conditionalExpressionElements() throws RecognitionException {
		ConditionalExpressionElementsContext _localctx = new ConditionalExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalExpressionElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode Bool() { return getToken(TParser.Bool, 0); }
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
		enterRule(_localctx, 52, RULE_generalValue);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(Identifier);
				setState(282);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(Integer);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(Integer);
				setState(286);
				match(TypeSpec);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(Float);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(Float);
				setState(289);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(292);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(293);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(294);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7V\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\ft\n\f\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0083\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u008e\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0098\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e7\n\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00fc\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0106"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u010d\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0117\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012a\n\34\3\34\2\3"+
		"\4\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2"+
		"\2\u0148\28\3\2\2\2\4;\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fU\3\2"+
		"\2\2\16W\3\2\2\2\20Y\3\2\2\2\22b\3\2\2\2\24k\3\2\2\2\26s\3\2\2\2\30z\3"+
		"\2\2\2\32\u0082\3\2\2\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 \u0097\3\2\2"+
		"\2\"\u00e6\3\2\2\2$\u00e8\3\2\2\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00fb"+
		"\3\2\2\2,\u00fd\3\2\2\2.\u0105\3\2\2\2\60\u010c\3\2\2\2\62\u0116\3\2\2"+
		"\2\64\u0118\3\2\2\2\66\u0129\3\2\2\289\5\4\3\29:\7\2\2\3:\3\3\2\2\2;@"+
		"\b\3\1\2<=\f\4\2\2=?\5\6\4\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"\5\3\2\2\2B@\3\2\2\2CI\5\b\5\2DI\5\n\6\2EI\5\20\t\2FI\5(\25\2GI\5\62\32"+
		"\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\7\36"+
		"\2\2K\t\3\2\2\2LM\7\3\2\2MN\5\f\7\2NO\7\t\2\2O\13\3\2\2\2PV\5\16\b\2Q"+
		"R\5\16\b\2RS\7\16\2\2ST\5\f\7\2TV\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V\r\3\2\2"+
		"\2WX\7\32\2\2X\17\3\2\2\2YZ\7\4\2\2Z[\5\22\n\2[\\\7\t\2\2\\\21\3\2\2\2"+
		"]c\5\24\13\2^_\5\24\13\2_`\7\16\2\2`a\5\22\n\2ac\3\2\2\2b]\3\2\2\2b^\3"+
		"\2\2\2c\23\3\2\2\2de\7\27\2\2ef\7\n\2\2fl\5\66\34\2gh\7\27\2\2hi\7\31"+
		"\2\2ij\7\n\2\2jl\5\66\34\2kd\3\2\2\2kg\3\2\2\2l\25\3\2\2\2mn\7\17\2\2"+
		"nt\7\20\2\2op\7\17\2\2pq\5\30\r\2qr\7\20\2\2rt\3\2\2\2sm\3\2\2\2so\3\2"+
		"\2\2t\27\3\2\2\2u{\5\66\34\2vw\5\66\34\2wx\7\16\2\2xy\5\30\r\2y{\3\2\2"+
		"\2zu\3\2\2\2zv\3\2\2\2{\31\3\2\2\2|}\7\21\2\2}\u0083\7\22\2\2~\177\7\21"+
		"\2\2\177\u0080\5\34\17\2\u0080\u0081\7\22\2\2\u0081\u0083\3\2\2\2\u0082"+
		"|\3\2\2\2\u0082~\3\2\2\2\u0083\33\3\2\2\2\u0084\u0085\7\27\2\2\u0085\u0086"+
		"\7\f\2\2\u0086\u008e\5\66\34\2\u0087\u0088\7\27\2\2\u0088\u0089\7\f\2"+
		"\2\u0089\u008a\5\66\34\2\u008a\u008b\7\16\2\2\u008b\u008c\5\34\17\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0087\3\2\2\2\u008e\35\3\2\2"+
		"\2\u008f\u0090\7\23\2\2\u0090\u0091\5 \21\2\u0091\u0092\7\24\2\2\u0092"+
		"\37\3\2\2\2\u0093\u0098\5\"\22\2\u0094\u0095\5\"\22\2\u0095\u0096\5 \21"+
		"\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0098!"+
		"\3\2\2\2\u0099\u00e7\7\27\2\2\u009a\u009b\7\27\2\2\u009b\u00e7\7\25\2"+
		"\2\u009c\u009d\7\27\2\2\u009d\u00e7\7\31\2\2\u009e\u009f\7\27\2\2\u009f"+
		"\u00a0\7\31\2\2\u00a0\u00e7\7\25\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7"+
		"\27\2\2\u00a3\u00e7\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\27\2\2\u00a6"+
		"\u00a7\7\25\2\2\u00a7\u00e7\3\2\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\7"+
		"\27\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00e7\3\2\2\2\u00ac\u00ad\5$\23\2\u00ad"+
		"\u00ae\7\27\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\7\25\2\2\u00b0\u00e7"+
		"\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00e7\5&\24\2\u00b3\u00b4\7\27\2\2"+
		"\u00b4\u00b5\5&\24\2\u00b5\u00b6\7\25\2\2\u00b6\u00e7\3\2\2\2\u00b7\u00b8"+
		"\7\27\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\7\31\2\2\u00ba\u00e7\3\2\2\2"+
		"\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\31\2\2\u00be\u00bf"+
		"\7\25\2\2\u00bf\u00e7\3\2\2\2\u00c0\u00e7\7\33\2\2\u00c1\u00c2\7\33\2"+
		"\2\u00c2\u00e7\7\25\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00e7\7\31\2\2\u00c5"+
		"\u00c6\7\33\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00e7\7\25\2\2\u00c8\u00e7"+
		"\7\34\2\2\u00c9\u00ca\7\34\2\2\u00ca\u00e7\7\25\2\2\u00cb\u00cc\7\34\2"+
		"\2\u00cc\u00e7\7\31\2\2\u00cd\u00ce\7\34\2\2\u00ce\u00cf\7\31\2\2\u00cf"+
		"\u00e7\7\25\2\2\u00d0\u00e7\5*\26\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\7"+
		"\25\2\2\u00d3\u00e7\3\2\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\7\31\2\2\u00d6"+
		"\u00e7\3\2\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7\31\2\2\u00d9\u00da\7"+
		"\25\2\2\u00da\u00e7\3\2\2\2\u00db\u00e7\5\36\20\2\u00dc\u00dd\5\36\20"+
		"\2\u00dd\u00de\7\25\2\2\u00de\u00e7\3\2\2\2\u00df\u00e0\5\36\20\2\u00e0"+
		"\u00e1\7\31\2\2\u00e1\u00e7\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4"+
		"\7\31\2\2\u00e4\u00e5\7\25\2\2\u00e5\u00e7\3\2\2\2\u00e6\u0099\3\2\2\2"+
		"\u00e6\u009a\3\2\2\2\u00e6\u009c\3\2\2\2\u00e6\u009e\3\2\2\2\u00e6\u00a1"+
		"\3\2\2\2\u00e6\u00a4\3\2\2\2\u00e6\u00a8\3\2\2\2\u00e6\u00ac\3\2\2\2\u00e6"+
		"\u00b1\3\2\2\2\u00e6\u00b3\3\2\2\2\u00e6\u00b7\3\2\2\2\u00e6\u00bb\3\2"+
		"\2\2\u00e6\u00c0\3\2\2\2\u00e6\u00c1\3\2\2\2\u00e6\u00c3\3\2\2\2\u00e6"+
		"\u00c5\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00c9\3\2\2\2\u00e6\u00cb\3\2"+
		"\2\2\u00e6\u00cd\3\2\2\2\u00e6\u00d0\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6"+
		"\u00d4\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00dc\3\2"+
		"\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00e9"+
		"\7\26\2\2\u00e9%\3\2\2\2\u00ea\u00eb\7\26\2\2\u00eb\'\3\2\2\2\u00ec\u00ed"+
		"\5*\26\2\u00ed\u00ee\7\t\2\2\u00ee)\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0"+
		"\u00fc\5.\30\2\u00f1\u00f2\7\27\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\5"+
		",\27\2\u00f4\u00f5\5.\30\2\u00f5\u00fc\3\2\2\2\u00f6\u00f7\7\27\2\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u00f9\5,\27\2\u00f9\u00fa\5.\30\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc"+
		"+\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe-\3\2\2\2\u00ff\u0100\7\23\2\2\u0100"+
		"\u0106\7\24\2\2\u0101\u0102\7\23\2\2\u0102\u0103\5\60\31\2\u0103\u0104"+
		"\7\24\2\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0101\3\2\2\2"+
		"\u0106/\3\2\2\2\u0107\u010d\5\66\34\2\u0108\u0109\5\66\34\2\u0109\u010a"+
		"\7\16\2\2\u010a\u010b\5\60\31\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2\2"+
		"\2\u010c\u0108\3\2\2\2\u010d\61\3\2\2\2\u010e\u010f\7\5\2\2\u010f\u0110"+
		"\5\64\33\2\u0110\u0111\7\21\2\2\u0111\u0117\3\2\2\2\u0112\u0113\7\5\2"+
		"\2\u0113\u0114\5\64\33\2\u0114\u0115\5*\26\2\u0115\u0117\3\2\2\2\u0116"+
		"\u010e\3\2\2\2\u0116\u0112\3\2\2\2\u0117\63\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\65\3\2\2\2\u011a\u012a\7\27\2\2\u011b\u011c\7\27\2\2\u011c\u012a"+
		"\7\31\2\2\u011d\u012a\7\32\2\2\u011e\u012a\7\33\2\2\u011f\u0120\7\33\2"+
		"\2\u0120\u012a\7\31\2\2\u0121\u012a\7\34\2\2\u0122\u0123\7\34\2\2\u0123"+
		"\u012a\7\31\2\2\u0124\u012a\7\b\2\2\u0125\u012a\5\26\f\2\u0126\u012a\5"+
		"\32\16\2\u0127\u012a\5\36\20\2\u0128\u012a\5*\26\2\u0129\u011a\3\2\2\2"+
		"\u0129\u011b\3\2\2\2\u0129\u011d\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u011f"+
		"\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0124\3\2\2\2\u0129"+
		"\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a\67\3\2\2\2\22@HUbksz\u0082\u008d\u0097\u00e6\u00fb\u0105\u010c"+
		"\u0116\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}