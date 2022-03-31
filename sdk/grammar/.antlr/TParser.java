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
		Use=1, Var=2, Bool=3, End=4, Attr=5, TwoPoint=6, Separator=7, OpenArIndex=8, 
		CloseArIndex=9, OpenBlock=10, CloseBlock=11, OpenOp=12, CloseOp=13, ArithmeticOperator=14, 
		IncDecOperators=15, Identifier=16, IDPrefix=17, TypeSpec=18, String=19, 
		Integer=20, Float=21, Whitespace=22, Newline=23, Words=24, BlockComment=25, 
		LineComment=26;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveTokens = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_functionCall = 19, RULE_functionCallParam = 20, 
		RULE_functionCallParamElements = 21, RULE_generalValue = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "functionCall", "functionCallParam", 
			"functionCallParamElements", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", null, "';'", "'='", "':'", "','", "'['", "']'", 
			"'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
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
			setState(46);
			fileContent(0);
			setState(47);
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
			setState(54);
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
					setState(50);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(51);
					sentence();
					}
					} 
				}
				setState(56);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				liveTokens();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				variable();
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
			setState(62);
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
			setState(64);
			match(Use);
			setState(65);
			useValue();
			setState(66);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				useString();
				setState(70);
				match(Separator);
				setState(71);
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
			setState(75);
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
			setState(77);
			match(Var);
			setState(78);
			variableMembers();
			setState(79);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				variableDefinition();
				setState(83);
				match(Separator);
				setState(84);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(Identifier);
				setState(89);
				match(Attr);
				setState(90);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(Identifier);
				setState(92);
				match(TypeSpec);
				setState(93);
				match(Attr);
				setState(94);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(OpenArIndex);
				setState(98);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(OpenArIndex);
				setState(100);
				indexArrayElements();
				setState(101);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				generalValue();
				setState(107);
				match(Separator);
				setState(108);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(OpenBlock);
				setState(113);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(OpenBlock);
				setState(115);
				associativeArrayElements();
				setState(116);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(Identifier);
				setState(121);
				match(TwoPoint);
				setState(122);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(Identifier);
				setState(124);
				match(TwoPoint);
				setState(125);
				generalValue();
				setState(126);
				match(Separator);
				setState(127);
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
			setState(131);
			match(OpenOp);
			setState(132);
			operationElements();
			setState(133);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				operationValue();
				setState(137);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(Identifier);
				setState(143);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(Identifier);
				setState(145);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(TypeSpec);
				setState(148);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				firstIncDec();
				setState(150);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				firstIncDec();
				setState(153);
				match(Identifier);
				setState(154);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				firstIncDec();
				setState(157);
				match(Identifier);
				setState(158);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				firstIncDec();
				setState(161);
				match(Identifier);
				setState(162);
				match(TypeSpec);
				setState(163);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				match(Identifier);
				setState(166);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				match(Identifier);
				setState(168);
				match(ArithmeticOperator);
				setState(169);
				lastIncDec();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
				match(Identifier);
				setState(171);
				match(TypeSpec);
				setState(172);
				lastIncDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(173);
				match(Identifier);
				setState(174);
				match(TypeSpec);
				setState(175);
				match(ArithmeticOperator);
				setState(176);
				lastIncDec();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(177);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(178);
				match(Integer);
				setState(179);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(180);
				match(Integer);
				setState(181);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(182);
				match(Integer);
				setState(183);
				match(TypeSpec);
				setState(184);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(185);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(186);
				match(Float);
				setState(187);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(188);
				match(Float);
				setState(189);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(190);
				match(Float);
				setState(191);
				match(TypeSpec);
				setState(192);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(193);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(194);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(195);
				operationBlock();
				setState(196);
				match(ArithmeticOperator);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(198);
				operationBlock();
				setState(199);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(201);
				operationBlock();
				setState(202);
				match(TypeSpec);
				setState(203);
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
			setState(207);
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
			setState(209);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Identifier);
			setState(212);
			functionCallParam();
			}
		}
		catch (RecognitionException re) {
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
		public FunctionCallParamElementsContext functionCallParamElements() {
			return getRuleContext(FunctionCallParamElementsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(OpenOp);
			setState(215);
			functionCallParamElements();
			setState(216);
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
		enterRule(_localctx, 42, RULE_functionCallParamElements);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				generalValue();
				setState(220);
				match(Separator);
				setState(221);
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
		enterRule(_localctx, 44, RULE_generalValue);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(Identifier);
				setState(227);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(Integer);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(Integer);
				setState(231);
				match(TypeSpec);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(Float);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(Float);
				setState(234);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(238);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(239);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\5\4?\n\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\5\rq\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16y\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0084\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\5\21\u008e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00e2\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f3\n\30\3\30\2\3\4\31\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u010c\2\60\3\2\2\2\4\63\3"+
		"\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20O\3\2"+
		"\2\2\22X\3\2\2\2\24a\3\2\2\2\26i\3\2\2\2\30p\3\2\2\2\32x\3\2\2\2\34\u0083"+
		"\3\2\2\2\36\u0085\3\2\2\2 \u008d\3\2\2\2\"\u00cf\3\2\2\2$\u00d1\3\2\2"+
		"\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00d8\3\2\2\2,\u00e1\3\2\2\2.\u00f2"+
		"\3\2\2\2\60\61\5\4\3\2\61\62\7\2\2\3\62\3\3\2\2\2\638\b\3\1\2\64\65\f"+
		"\4\2\2\65\67\5\6\4\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		"\5\3\2\2\2:8\3\2\2\2;?\5\b\5\2<?\5\n\6\2=?\5\20\t\2>;\3\2\2\2><\3\2\2"+
		"\2>=\3\2\2\2?\7\3\2\2\2@A\7\31\2\2A\t\3\2\2\2BC\7\3\2\2CD\5\f\7\2DE\7"+
		"\6\2\2E\13\3\2\2\2FL\5\16\b\2GH\5\16\b\2HI\7\t\2\2IJ\5\f\7\2JL\3\2\2\2"+
		"KF\3\2\2\2KG\3\2\2\2L\r\3\2\2\2MN\7\25\2\2N\17\3\2\2\2OP\7\4\2\2PQ\5\22"+
		"\n\2QR\7\6\2\2R\21\3\2\2\2SY\5\24\13\2TU\5\24\13\2UV\7\t\2\2VW\5\22\n"+
		"\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2\2Y\23\3\2\2\2Z[\7\22\2\2[\\\7\7\2\2\\b"+
		"\5.\30\2]^\7\22\2\2^_\7\24\2\2_`\7\7\2\2`b\5.\30\2aZ\3\2\2\2a]\3\2\2\2"+
		"b\25\3\2\2\2cd\7\n\2\2dj\7\13\2\2ef\7\n\2\2fg\5\30\r\2gh\7\13\2\2hj\3"+
		"\2\2\2ic\3\2\2\2ie\3\2\2\2j\27\3\2\2\2kq\5.\30\2lm\5.\30\2mn\7\t\2\2n"+
		"o\5\30\r\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\31\3\2\2\2rs\7\f\2\2sy\7\r\2"+
		"\2tu\7\f\2\2uv\5\34\17\2vw\7\r\2\2wy\3\2\2\2xr\3\2\2\2xt\3\2\2\2y\33\3"+
		"\2\2\2z{\7\22\2\2{|\7\b\2\2|\u0084\5.\30\2}~\7\22\2\2~\177\7\b\2\2\177"+
		"\u0080\5.\30\2\u0080\u0081\7\t\2\2\u0081\u0082\5\34\17\2\u0082\u0084\3"+
		"\2\2\2\u0083z\3\2\2\2\u0083}\3\2\2\2\u0084\35\3\2\2\2\u0085\u0086\7\16"+
		"\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\17\2\2\u0088\37\3\2\2\2\u0089\u008e"+
		"\5\"\22\2\u008a\u008b\5\"\22\2\u008b\u008c\5 \21\2\u008c\u008e\3\2\2\2"+
		"\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008e!\3\2\2\2\u008f\u00d0\7"+
		"\22\2\2\u0090\u0091\7\22\2\2\u0091\u00d0\7\20\2\2\u0092\u0093\7\22\2\2"+
		"\u0093\u00d0\7\24\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7\24\2\2\u0096"+
		"\u00d0\7\20\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\22\2\2\u0099\u00d0\3"+
		"\2\2\2\u009a\u009b\5$\23\2\u009b\u009c\7\22\2\2\u009c\u009d\7\20\2\2\u009d"+
		"\u00d0\3\2\2\2\u009e\u009f\5$\23\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\7"+
		"\24\2\2\u00a1\u00d0\3\2\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\22\2\2\u00a4"+
		"\u00a5\7\24\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00d0\3\2\2\2\u00a7\u00a8\7"+
		"\22\2\2\u00a8\u00d0\5&\24\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7\20\2\2"+
		"\u00ab\u00d0\5&\24\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00d0"+
		"\5&\24\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\7\20\2"+
		"\2\u00b2\u00d0\5&\24\2\u00b3\u00d0\7\26\2\2\u00b4\u00b5\7\26\2\2\u00b5"+
		"\u00d0\7\20\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00d0\7\24\2\2\u00b8\u00b9"+
		"\7\26\2\2\u00b9\u00ba\7\24\2\2\u00ba\u00d0\7\20\2\2\u00bb\u00d0\7\27\2"+
		"\2\u00bc\u00bd\7\27\2\2\u00bd\u00d0\7\20\2\2\u00be\u00bf\7\27\2\2\u00bf"+
		"\u00d0\7\24\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\7\24\2\2\u00c2\u00d0"+
		"\7\20\2\2\u00c3\u00d0\5(\25\2\u00c4\u00d0\5\36\20\2\u00c5\u00c6\5\36\20"+
		"\2\u00c6\u00c7\7\20\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00c9\5\36\20\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd"+
		"\7\24\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00d0\3\2\2\2\u00cf\u008f\3\2\2\2"+
		"\u00cf\u0090\3\2\2\2\u00cf\u0092\3\2\2\2\u00cf\u0094\3\2\2\2\u00cf\u0097"+
		"\3\2\2\2\u00cf\u009a\3\2\2\2\u00cf\u009e\3\2\2\2\u00cf\u00a2\3\2\2\2\u00cf"+
		"\u00a7\3\2\2\2\u00cf\u00a9\3\2\2\2\u00cf\u00ac\3\2\2\2\u00cf\u00af\3\2"+
		"\2\2\u00cf\u00b3\3\2\2\2\u00cf\u00b4\3\2\2\2\u00cf\u00b6\3\2\2\2\u00cf"+
		"\u00b8\3\2\2\2\u00cf\u00bb\3\2\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00be\3\2"+
		"\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf"+
		"\u00c5\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0#\3\2\2\2"+
		"\u00d1\u00d2\7\21\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\'\3\2"+
		"\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5*\26\2\u00d7)\3\2\2\2\u00d8\u00d9"+
		"\7\16\2\2\u00d9\u00da\5,\27\2\u00da\u00db\7\17\2\2\u00db+\3\2\2\2\u00dc"+
		"\u00e2\5.\30\2\u00dd\u00de\5.\30\2\u00de\u00df\7\t\2\2\u00df\u00e0\5,"+
		"\27\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"-\3\2\2\2\u00e3\u00f3\7\22\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00f3\7\24\2"+
		"\2\u00e6\u00f3\7\25\2\2\u00e7\u00f3\7\26\2\2\u00e8\u00e9\7\26\2\2\u00e9"+
		"\u00f3\7\24\2\2\u00ea\u00f3\7\27\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00f3"+
		"\7\24\2\2\u00ed\u00f3\7\5\2\2\u00ee\u00f3\5\26\f\2\u00ef\u00f3\5\32\16"+
		"\2\u00f0\u00f3\5\36\20\2\u00f1\u00f3\5(\25\2\u00f2\u00e3\3\2\2\2\u00f2"+
		"\u00e4\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00e8\3\2"+
		"\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3/\3\2\2\2\178>KXaipx\u0083\u008d\u00cf\u00e1\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}