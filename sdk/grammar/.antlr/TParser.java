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
		Use=1, Var=2, Bool=3, End=4, Attr=5, Point=6, TwoPoint=7, TwoTwoPoint=8, 
		Separator=9, OpenArIndex=10, CloseArIndex=11, OpenBlock=12, CloseBlock=13, 
		OpenOp=14, CloseOp=15, ArithmeticOperator=16, IncDecOperators=17, Identifier=18, 
		IDPrefix=19, TypeSpec=20, String=21, Integer=22, Float=23, Whitespace=24, 
		Newline=25, Words=26, BlockComment=27, LineComment=28;
	public static final int
		RULE_main = 0, RULE_fileContent = 1, RULE_sentence = 2, RULE_liveTokens = 3, 
		RULE_use = 4, RULE_useValue = 5, RULE_useString = 6, RULE_variable = 7, 
		RULE_variableMembers = 8, RULE_variableDefinition = 9, RULE_indexArray = 10, 
		RULE_indexArrayElements = 11, RULE_associativeArray = 12, RULE_associativeArrayElements = 13, 
		RULE_operationBlock = 14, RULE_operationElements = 15, RULE_operationValue = 16, 
		RULE_firstIncDec = 17, RULE_lastIncDec = 18, RULE_functionCall = 19, RULE_identifierB = 20, 
		RULE_functionCallParam = 21, RULE_functionCallParamElements = 22, RULE_generalValue = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
			"variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
			"associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
			"operationValue", "firstIncDec", "lastIncDec", "functionCall", "identifierB", 
			"functionCallParam", "functionCallParamElements", "generalValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", null, "';'", "'='", "'.'", "':'", "'::'", "','", 
			"'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "Bool", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", 
			"Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", 
			"OpenOp", "CloseOp", "ArithmeticOperator", "IncDecOperators", "Identifier", 
			"IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", 
			"Words", "BlockComment", "LineComment"
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
			setState(48);
			fileContent(0);
			setState(49);
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
			setState(56);
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
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53);
					sentence();
					}
					} 
				}
				setState(58);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				liveTokens();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				use();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
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
			setState(64);
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
			setState(66);
			match(Use);
			setState(67);
			useValue();
			setState(68);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				useString();
				setState(72);
				match(Separator);
				setState(73);
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
			setState(77);
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
			setState(79);
			match(Var);
			setState(80);
			variableMembers();
			setState(81);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				variableDefinition();
				setState(85);
				match(Separator);
				setState(86);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(Identifier);
				setState(91);
				match(Attr);
				setState(92);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(Identifier);
				setState(94);
				match(TypeSpec);
				setState(95);
				match(Attr);
				setState(96);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(OpenArIndex);
				setState(100);
				match(CloseArIndex);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(OpenArIndex);
				setState(102);
				indexArrayElements();
				setState(103);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				generalValue();
				setState(109);
				match(Separator);
				setState(110);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(OpenBlock);
				setState(115);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(OpenBlock);
				setState(117);
				associativeArrayElements();
				setState(118);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(Identifier);
				setState(123);
				match(TwoPoint);
				setState(124);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(Identifier);
				setState(126);
				match(TwoPoint);
				setState(127);
				generalValue();
				setState(128);
				match(Separator);
				setState(129);
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
			setState(133);
			match(OpenOp);
			setState(134);
			operationElements();
			setState(135);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				operationValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				operationValue();
				setState(139);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(Identifier);
				setState(145);
				match(ArithmeticOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(TypeSpec);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(Identifier);
				setState(149);
				match(TypeSpec);
				setState(150);
				match(ArithmeticOperator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				firstIncDec();
				setState(152);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				firstIncDec();
				setState(155);
				match(Identifier);
				setState(156);
				match(ArithmeticOperator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				firstIncDec();
				setState(159);
				match(Identifier);
				setState(160);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				firstIncDec();
				setState(163);
				match(Identifier);
				setState(164);
				match(TypeSpec);
				setState(165);
				match(ArithmeticOperator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				match(Identifier);
				setState(168);
				lastIncDec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				match(Identifier);
				setState(170);
				lastIncDec();
				setState(171);
				match(ArithmeticOperator);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				match(Identifier);
				setState(174);
				lastIncDec();
				setState(175);
				match(TypeSpec);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				match(Identifier);
				setState(178);
				lastIncDec();
				setState(179);
				match(TypeSpec);
				setState(180);
				match(ArithmeticOperator);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(182);
				match(Integer);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(183);
				match(Integer);
				setState(184);
				match(ArithmeticOperator);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(185);
				match(Integer);
				setState(186);
				match(TypeSpec);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(187);
				match(Integer);
				setState(188);
				match(TypeSpec);
				setState(189);
				match(ArithmeticOperator);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(190);
				match(Float);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(191);
				match(Float);
				setState(192);
				match(ArithmeticOperator);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(193);
				match(Float);
				setState(194);
				match(TypeSpec);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(195);
				match(Float);
				setState(196);
				match(TypeSpec);
				setState(197);
				match(ArithmeticOperator);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(198);
				functionCall();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(199);
				operationBlock();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(200);
				operationBlock();
				setState(201);
				match(ArithmeticOperator);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(203);
				operationBlock();
				setState(204);
				match(TypeSpec);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(206);
				operationBlock();
				setState(207);
				match(TypeSpec);
				setState(208);
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
			setState(212);
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
			setState(214);
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
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(Identifier);
				setState(217);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(Identifier);
				setState(219);
				match(Point);
				setState(220);
				identifierB();
				setState(221);
				functionCallParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(Identifier);
				setState(224);
				match(TwoTwoPoint);
				setState(225);
				identifierB();
				setState(226);
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
		enterRule(_localctx, 40, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 42, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(OpenOp);
			setState(233);
			functionCallParamElements();
			setState(234);
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
		enterRule(_localctx, 44, RULE_functionCallParamElements);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				generalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				generalValue();
				setState(238);
				match(Separator);
				setState(239);
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
		enterRule(_localctx, 46, RULE_generalValue);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(Identifier);
				setState(245);
				match(TypeSpec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(Integer);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(Integer);
				setState(249);
				match(TypeSpec);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(Float);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(Float);
				setState(252);
				match(TypeSpec);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				indexArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				associativeArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				operationBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(257);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0107\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\5\4A\n\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\rs\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\5\21\u0090\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00d5\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f4\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0105\n\31"+
		"\3\31\2\3\4\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2"+
		"\2\u011f\2\62\3\2\2\2\4\65\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\f"+
		"M\3\2\2\2\16O\3\2\2\2\20Q\3\2\2\2\22Z\3\2\2\2\24c\3\2\2\2\26k\3\2\2\2"+
		"\30r\3\2\2\2\32z\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u008f\3\2"+
		"\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00d8\3\2\2\2(\u00e6\3\2\2\2*\u00e8"+
		"\3\2\2\2,\u00ea\3\2\2\2.\u00f3\3\2\2\2\60\u0104\3\2\2\2\62\63\5\4\3\2"+
		"\63\64\7\2\2\3\64\3\3\2\2\2\65:\b\3\1\2\66\67\f\4\2\2\679\5\6\4\28\66"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3\2\2\2=A\5\b\5\2"+
		">A\5\n\6\2?A\5\20\t\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\33"+
		"\2\2C\t\3\2\2\2DE\7\3\2\2EF\5\f\7\2FG\7\6\2\2G\13\3\2\2\2HN\5\16\b\2I"+
		"J\5\16\b\2JK\7\13\2\2KL\5\f\7\2LN\3\2\2\2MH\3\2\2\2MI\3\2\2\2N\r\3\2\2"+
		"\2OP\7\27\2\2P\17\3\2\2\2QR\7\4\2\2RS\5\22\n\2ST\7\6\2\2T\21\3\2\2\2U"+
		"[\5\24\13\2VW\5\24\13\2WX\7\13\2\2XY\5\22\n\2Y[\3\2\2\2ZU\3\2\2\2ZV\3"+
		"\2\2\2[\23\3\2\2\2\\]\7\24\2\2]^\7\7\2\2^d\5\60\31\2_`\7\24\2\2`a\7\26"+
		"\2\2ab\7\7\2\2bd\5\60\31\2c\\\3\2\2\2c_\3\2\2\2d\25\3\2\2\2ef\7\f\2\2"+
		"fl\7\r\2\2gh\7\f\2\2hi\5\30\r\2ij\7\r\2\2jl\3\2\2\2ke\3\2\2\2kg\3\2\2"+
		"\2l\27\3\2\2\2ms\5\60\31\2no\5\60\31\2op\7\13\2\2pq\5\30\r\2qs\3\2\2\2"+
		"rm\3\2\2\2rn\3\2\2\2s\31\3\2\2\2tu\7\16\2\2u{\7\17\2\2vw\7\16\2\2wx\5"+
		"\34\17\2xy\7\17\2\2y{\3\2\2\2zt\3\2\2\2zv\3\2\2\2{\33\3\2\2\2|}\7\24\2"+
		"\2}~\7\t\2\2~\u0086\5\60\31\2\177\u0080\7\24\2\2\u0080\u0081\7\t\2\2\u0081"+
		"\u0082\5\60\31\2\u0082\u0083\7\13\2\2\u0083\u0084\5\34\17\2\u0084\u0086"+
		"\3\2\2\2\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0086\35\3\2\2\2\u0087\u0088"+
		"\7\20\2\2\u0088\u0089\5 \21\2\u0089\u008a\7\21\2\2\u008a\37\3\2\2\2\u008b"+
		"\u0090\5\"\22\2\u008c\u008d\5\"\22\2\u008d\u008e\5 \21\2\u008e\u0090\3"+
		"\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u0090!\3\2\2\2\u0091\u00d5"+
		"\7\24\2\2\u0092\u0093\7\24\2\2\u0093\u00d5\7\22\2\2\u0094\u0095\7\24\2"+
		"\2\u0095\u00d5\7\26\2\2\u0096\u0097\7\24\2\2\u0097\u0098\7\26\2\2\u0098"+
		"\u00d5\7\22\2\2\u0099\u009a\5$\23\2\u009a\u009b\7\24\2\2\u009b\u00d5\3"+
		"\2\2\2\u009c\u009d\5$\23\2\u009d\u009e\7\24\2\2\u009e\u009f\7\22\2\2\u009f"+
		"\u00d5\3\2\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\7"+
		"\26\2\2\u00a3\u00d5\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\24\2\2\u00a6"+
		"\u00a7\7\26\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00d5\3\2\2\2\u00a9\u00aa\7"+
		"\24\2\2\u00aa\u00d5\5&\24\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\5&\24\2\u00ad"+
		"\u00ae\7\22\2\2\u00ae\u00d5\3\2\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\5"+
		"&\24\2\u00b1\u00b2\7\26\2\2\u00b2\u00d5\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4"+
		"\u00b5\5&\24\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\7\22\2\2\u00b7\u00d5\3"+
		"\2\2\2\u00b8\u00d5\7\30\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00d5\7\22\2\2"+
		"\u00bb\u00bc\7\30\2\2\u00bc\u00d5\7\26\2\2\u00bd\u00be\7\30\2\2\u00be"+
		"\u00bf\7\26\2\2\u00bf\u00d5\7\22\2\2\u00c0\u00d5\7\31\2\2\u00c1\u00c2"+
		"\7\31\2\2\u00c2\u00d5\7\22\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00d5\7\26\2"+
		"\2\u00c5\u00c6\7\31\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00d5\7\22\2\2\u00c8"+
		"\u00d5\5(\25\2\u00c9\u00d5\5\36\20\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc"+
		"\7\22\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7\26\2"+
		"\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\26\2\2\u00d2"+
		"\u00d3\7\22\2\2\u00d3\u00d5\3\2\2\2\u00d4\u0091\3\2\2\2\u00d4\u0092\3"+
		"\2\2\2\u00d4\u0094\3\2\2\2\u00d4\u0096\3\2\2\2\u00d4\u0099\3\2\2\2\u00d4"+
		"\u009c\3\2\2\2\u00d4\u00a0\3\2\2\2\u00d4\u00a4\3\2\2\2\u00d4\u00a9\3\2"+
		"\2\2\u00d4\u00ab\3\2\2\2\u00d4\u00af\3\2\2\2\u00d4\u00b3\3\2\2\2\u00d4"+
		"\u00b8\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00bb\3\2\2\2\u00d4\u00bd\3\2"+
		"\2\2\u00d4\u00c0\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c3\3\2\2\2\u00d4"+
		"\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca\3\2"+
		"\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d7"+
		"\7\23\2\2\u00d7%\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9\'\3\2\2\2\u00da\u00db"+
		"\7\24\2\2\u00db\u00e7\5,\27\2\u00dc\u00dd\7\24\2\2\u00dd\u00de\7\b\2\2"+
		"\u00de\u00df\5*\26\2\u00df\u00e0\5,\27\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2"+
		"\7\24\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5*\26\2\u00e4\u00e5\5,\27\2"+
		"\u00e5\u00e7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e1"+
		"\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e9\7\24\2\2\u00e9+\3\2\2\2\u00ea\u00eb"+
		"\7\20\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\7\21\2\2\u00ed-\3\2\2\2\u00ee"+
		"\u00f4\5\60\31\2\u00ef\u00f0\5\60\31\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2"+
		"\5.\30\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4"+
		"/\3\2\2\2\u00f5\u0105\7\24\2\2\u00f6\u00f7\7\24\2\2\u00f7\u0105\7\26\2"+
		"\2\u00f8\u0105\7\27\2\2\u00f9\u0105\7\30\2\2\u00fa\u00fb\7\30\2\2\u00fb"+
		"\u0105\7\26\2\2\u00fc\u0105\7\31\2\2\u00fd\u00fe\7\31\2\2\u00fe\u0105"+
		"\7\26\2\2\u00ff\u0105\7\5\2\2\u0100\u0105\5\26\f\2\u0101\u0105\5\32\16"+
		"\2\u0102\u0105\5\36\20\2\u0103\u0105\5(\25\2\u0104\u00f5\3\2\2\2\u0104"+
		"\u00f6\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00f9\3\2\2\2\u0104\u00fa\3\2"+
		"\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\61\3\2\2\2\20:@MZckrz\u0085\u008f\u00d4\u00e6\u00f3\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}