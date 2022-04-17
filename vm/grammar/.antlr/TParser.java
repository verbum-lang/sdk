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
		Implements=18, New=19, Break=20, Next=21, Async=22, Await=23, Try=24, 
		Catch=25, ArrowRight=26, ARightLB=27, End=28, Attr=29, Point=30, TwoPoint=31, 
		TwoTwoPoint=32, Separator=33, OpenArIndex=34, CloseArIndex=35, OpenBlock=36, 
		CloseBlock=37, OpenOp=38, CloseOp=39, ArithmeticOperator=40, AssignmentOperator=41, 
		Not=42, IncDecOperators=43, Identifier=44, IDPrefix=45, TypeSpec=46, Words=47, 
		Integer=48, Float=49, String=50, BlockComment=51, LineComment=52, Whitespace=53, 
		Newline=54;
	public static final int
		RULE_main = 0, RULE_sentences = 1, RULE_statements = 2, RULE_blockCode = 3, 
		RULE_blockComments = 4, RULE_blockUse = 5, RULE_useValue = 6, RULE_useString = 7, 
		RULE_blockVariable = 8, RULE_variableItem = 9, RULE_variablePrefixModes = 10, 
		RULE_visibilityItems = 11, RULE_methodVisibility = 12, RULE_functionCall = 13, 
		RULE_functionCallPrefix = 14, RULE_functionCallParam = 15, RULE_functionCallParamElements = 16, 
		RULE_blockRet = 17, RULE_blockConditional = 18, RULE_ifElementUnique = 19, 
		RULE_elifElements = 20, RULE_elifElementUnique = 21, RULE_elseElementUnique = 22, 
		RULE_conditionalBlockExpression = 23, RULE_conditionalBlockElements = 24, 
		RULE_blockLoop = 25, RULE_loopBlockElements = 26, RULE_loopComplete = 27, 
		RULE_loopConditional = 28, RULE_loopInfinite = 29, RULE_endOne = 30, RULE_endTwo = 31, 
		RULE_loopOneMembers = 32, RULE_loopTwoMembers = 33, RULE_loopThreeMembers = 34, 
		RULE_loopThreeMembersValues = 35, RULE_blockTryCatch = 36, RULE_tryUniqueElement = 37, 
		RULE_catchUniqueElement = 38, RULE_tryCatchElements = 39, RULE_codeBlockFlowControl = 40, 
		RULE_codeBlockFlowControlElements = 41, RULE_generalValue = 42, RULE_generalValueBlock = 43, 
		RULE_generalValueItems = 44, RULE_generalValueElements = 45, RULE_identifier = 46, 
		RULE_incDecOperatorsA = 47, RULE_incDecOperatorsB = 48, RULE_blockLiveTokens = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockComments", "blockUse", 
			"useValue", "useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"visibilityItems", "methodVisibility", "functionCall", "functionCallPrefix", 
			"functionCallParam", "functionCallParamElements", "blockRet", "blockConditional", 
			"ifElementUnique", "elifElements", "elifElementUnique", "elseElementUnique", 
			"conditionalBlockExpression", "conditionalBlockElements", "blockLoop", 
			"loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
			"endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
			"loopThreeMembersValues", "blockTryCatch", "tryUniqueElement", "catchUniqueElement", 
			"tryCatchElements", "codeBlockFlowControl", "codeBlockFlowControlElements", 
			"generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
			"identifier", "incDecOperatorsA", "incDecOperatorsB", "blockLiveTokens"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", 
			"'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
			"Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "Words", 
			"Integer", "Float", "String", "BlockComment", "LineComment", "Whitespace", 
			"Newline"
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
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
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
			setState(100);
			sentences();
			setState(101);
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

	public static class SentencesContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentences);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				statements();
				setState(105);
				sentences();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class StatementsContext extends ParserRuleContext {
		public BlockCommentsContext blockComments() {
			return getRuleContext(BlockCommentsContext.class,0);
		}
		public BlockUseContext blockUse() {
			return getRuleContext(BlockUseContext.class,0);
		}
		public BlockVariableContext blockVariable() {
			return getRuleContext(BlockVariableContext.class,0);
		}
		public BlockRetContext blockRet() {
			return getRuleContext(BlockRetContext.class,0);
		}
		public BlockConditionalContext blockConditional() {
			return getRuleContext(BlockConditionalContext.class,0);
		}
		public BlockLoopContext blockLoop() {
			return getRuleContext(BlockLoopContext.class,0);
		}
		public BlockTryCatchContext blockTryCatch() {
			return getRuleContext(BlockTryCatchContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public BlockLiveTokensContext blockLiveTokens() {
			return getRuleContext(BlockLiveTokensContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				blockComments();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				blockUse();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				blockVariable();
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				blockTryCatch();
				}
				break;
			case OpenBlock:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				blockCode();
				}
				break;
			case Function:
			case Pub:
			case Pro:
			case Priv:
			case Static:
			case Final:
			case Interface:
			case Abstract:
			case Extends:
			case Class:
			case Implements:
			case New:
			case Break:
			case Next:
			case Async:
			case ArrowRight:
			case ARightLB:
			case End:
			case Attr:
			case Point:
			case TwoPoint:
			case TwoTwoPoint:
			case Separator:
			case OpenArIndex:
			case CloseArIndex:
			case OpenOp:
			case CloseOp:
			case ArithmeticOperator:
			case AssignmentOperator:
			case Not:
			case IncDecOperators:
			case Identifier:
			case IDPrefix:
			case TypeSpec:
			case Words:
			case Integer:
			case Float:
			case String:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				blockLiveTokens();
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

	public static class BlockCodeContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(121);
				match(OpenBlock);
				setState(122);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(123);
				match(OpenBlock);
				setState(124);
				sentences();
				setState(125);
				match(CloseBlock);
				}
				break;
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

	public static class BlockCommentsContext extends ParserRuleContext {
		public TerminalNode BlockComment() { return getToken(TParser.BlockComment, 0); }
		public TerminalNode LineComment() { return getToken(TParser.LineComment, 0); }
		public BlockCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockComments; }
	}

	public final BlockCommentsContext blockComments() throws RecognitionException {
		BlockCommentsContext _localctx = new BlockCommentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockComments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==BlockComment || _la==LineComment) ) {
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

	public static class BlockUseContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(TParser.Use, 0); }
		public UseValueContext useValue() {
			return getRuleContext(UseValueContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockUse; }
	}

	public final BlockUseContext blockUse() throws RecognitionException {
		BlockUseContext _localctx = new BlockUseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Use);
			setState(132);
			useValue();
			setState(133);
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
		enterRule(_localctx, 12, RULE_useValue);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				useString();
				setState(137);
				match(Separator);
				setState(138);
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
		enterRule(_localctx, 14, RULE_useString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static class BlockVariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableItemContext variableItem() {
			return getRuleContext(VariableItemContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockVariable; }
	}

	public final BlockVariableContext blockVariable() throws RecognitionException {
		BlockVariableContext _localctx = new BlockVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Var);
			setState(145);
			variableItem();
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

	public static class VariableItemContext extends ParserRuleContext {
		public VariablePrefixModesContext variablePrefixModes() {
			return getRuleContext(VariablePrefixModesContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<VariableItemContext> variableItem() {
			return getRuleContexts(VariableItemContext.class);
		}
		public VariableItemContext variableItem(int i) {
			return getRuleContext(VariableItemContext.class,i);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Await() { return getToken(TParser.Await, 0); }
		public VariableItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableItem; }
	}

	public final VariableItemContext variableItem() throws RecognitionException {
		VariableItemContext _localctx = new VariableItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			variablePrefixModes();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==New || _la==Await) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(152);
			generalValueElements();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(Separator);
					setState(154);
					variableItem();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class VariablePrefixModesContext extends ParserRuleContext {
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public MethodVisibilityContext methodVisibility() {
			return getRuleContext(MethodVisibilityContext.class,0);
		}
		public VariablePrefixModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePrefixModes; }
	}

	public final VariablePrefixModesContext variablePrefixModes() throws RecognitionException {
		VariablePrefixModesContext _localctx = new VariablePrefixModesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variablePrefixModes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << Async))) != 0)) {
				{
				setState(160);
				methodVisibility();
				}
			}

			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163);
				identifier();
				}
				break;
			case 2:
				{
				setState(164);
				identifier();
				setState(165);
				match(TypeSpec);
				}
				break;
			}
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
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

	public static class VisibilityItemsContext extends ParserRuleContext {
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
		public VisibilityItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityItems; }
	}

	public final VisibilityItemsContext visibilityItems() throws RecognitionException {
		VisibilityItemsContext _localctx = new VisibilityItemsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_visibilityItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << Async))) != 0)) ) {
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

	public static class MethodVisibilityContext extends ParserRuleContext {
		public VisibilityItemsContext visibilityItems() {
			return getRuleContext(VisibilityItemsContext.class,0);
		}
		public List<MethodVisibilityContext> methodVisibility() {
			return getRuleContexts(MethodVisibilityContext.class);
		}
		public MethodVisibilityContext methodVisibility(int i) {
			return getRuleContext(MethodVisibilityContext.class,i);
		}
		public MethodVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodVisibility; }
	}

	public final MethodVisibilityContext methodVisibility() throws RecognitionException {
		MethodVisibilityContext _localctx = new MethodVisibilityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodVisibility);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			visibilityItems();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					methodVisibility();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallPrefixContext functionCallPrefix() {
			return getRuleContext(FunctionCallPrefixContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			functionCallPrefix();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(181);
				identifier();
				}
			}

			setState(184);
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

	public static class FunctionCallPrefixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallPrefix; }
	}

	public final FunctionCallPrefixContext functionCallPrefix() throws RecognitionException {
		FunctionCallPrefixContext _localctx = new FunctionCallPrefixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCallPrefix);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				identifier();
				setState(188);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				identifier();
				setState(191);
				match(TwoTwoPoint);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_functionCallParam);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(OpenOp);
				setState(196);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(OpenOp);
				setState(198);
				functionCallParamElements();
				setState(199);
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
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<FunctionCallParamElementsContext> functionCallParamElements() {
			return getRuleContexts(FunctionCallParamElementsContext.class);
		}
		public FunctionCallParamElementsContext functionCallParamElements(int i) {
			return getRuleContext(FunctionCallParamElementsContext.class,i);
		}
		public FunctionCallParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParamElements; }
	}

	public final FunctionCallParamElementsContext functionCallParamElements() throws RecognitionException {
		FunctionCallParamElementsContext _localctx = new FunctionCallParamElementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			generalValue();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(Separator);
					setState(205);
					functionCallParamElements();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class BlockRetContext extends ParserRuleContext {
		public TerminalNode Ret() { return getToken(TParser.Ret, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockRet; }
	}

	public final BlockRetContext blockRet() throws RecognitionException {
		BlockRetContext _localctx = new BlockRetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Ret);
			setState(212);
			generalValueElements();
			setState(213);
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

	public static class BlockConditionalContext extends ParserRuleContext {
		public IfElementUniqueContext ifElementUnique() {
			return getRuleContext(IfElementUniqueContext.class,0);
		}
		public ElifElementsContext elifElements() {
			return getRuleContext(ElifElementsContext.class,0);
		}
		public ElseElementUniqueContext elseElementUnique() {
			return getRuleContext(ElseElementUniqueContext.class,0);
		}
		public BlockConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockConditional; }
	}

	public final BlockConditionalContext blockConditional() throws RecognitionException {
		BlockConditionalContext _localctx = new BlockConditionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			ifElementUnique();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(216);
				elifElements();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(219);
				elseElementUnique();
				}
				break;
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

	public static class IfElementUniqueContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalBlockExpressionContext conditionalBlockExpression() {
			return getRuleContext(ConditionalBlockExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(If);
			setState(223);
			conditionalBlockExpression();
			setState(224);
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
		public List<ElifElementsContext> elifElements() {
			return getRuleContexts(ElifElementsContext.class);
		}
		public ElifElementsContext elifElements(int i) {
			return getRuleContext(ElifElementsContext.class,i);
		}
		public ElifElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifElements; }
	}

	public final ElifElementsContext elifElements() throws RecognitionException {
		ElifElementsContext _localctx = new ElifElementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			elifElementUnique();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					elifElements();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ElifElementUniqueContext extends ParserRuleContext {
		public TerminalNode Elif() { return getToken(TParser.Elif, 0); }
		public ConditionalBlockExpressionContext conditionalBlockExpression() {
			return getRuleContext(ConditionalBlockExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Elif);
			setState(234);
			conditionalBlockExpression();
			setState(235);
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
		enterRule(_localctx, 44, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Else);
			setState(238);
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

	public static class ConditionalBlockExpressionContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ConditionalBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockExpression; }
	}

	public final ConditionalBlockExpressionContext conditionalBlockExpression() throws RecognitionException {
		ConditionalBlockExpressionContext _localctx = new ConditionalBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			generalValueElements();
			}
		}
		catch (RecognitionException re) {
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
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public ConditionalBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElements; }
	}

	public final ConditionalBlockElementsContext conditionalBlockElements() throws RecognitionException {
		ConditionalBlockElementsContext _localctx = new ConditionalBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public LoopInfiniteContext loopInfinite() {
			return getRuleContext(LoopInfiniteContext.class,0);
		}
		public LoopConditionalContext loopConditional() {
			return getRuleContext(LoopConditionalContext.class,0);
		}
		public LoopCompleteContext loopComplete() {
			return getRuleContext(LoopCompleteContext.class,0);
		}
		public BlockLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLoop; }
	}

	public final BlockLoopContext blockLoop() throws RecognitionException {
		BlockLoopContext _localctx = new BlockLoopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(For);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(245);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(246);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(247);
				loopComplete();
				}
				break;
			}
			setState(250);
			loopBlockElements();
			}
		}
		catch (RecognitionException re) {
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
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public LoopBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElements; }
	}

	public final LoopBlockElementsContext loopBlockElements() throws RecognitionException {
		LoopBlockElementsContext _localctx = new LoopBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopCompleteContext extends ParserRuleContext {
		public LoopOneMembersContext loopOneMembers() {
			return getRuleContext(LoopOneMembersContext.class,0);
		}
		public EndOneContext endOne() {
			return getRuleContext(EndOneContext.class,0);
		}
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public EndTwoContext endTwo() {
			return getRuleContext(EndTwoContext.class,0);
		}
		public LoopThreeMembersContext loopThreeMembers() {
			return getRuleContext(LoopThreeMembersContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopCompleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopComplete; }
	}

	public final LoopCompleteContext loopComplete() throws RecognitionException {
		LoopCompleteContext _localctx = new LoopCompleteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(254);
				match(OpenOp);
				}
			}

			setState(257);
			loopOneMembers();
			setState(258);
			endOne();
			setState(259);
			loopTwoMembers();
			setState(260);
			endTwo();
			setState(261);
			loopThreeMembers();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(262);
				match(CloseOp);
				}
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

	public static class LoopConditionalContext extends ParserRuleContext {
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public LoopConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopConditional; }
	}

	public final LoopConditionalContext loopConditional() throws RecognitionException {
		LoopConditionalContext _localctx = new LoopConditionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			loopTwoMembers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopInfiniteContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopInfiniteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInfinite; }
	}

	public final LoopInfiniteContext loopInfinite() throws RecognitionException {
		LoopInfiniteContext _localctx = new LoopInfiniteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopInfinite);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(OpenOp);
				setState(268);
				match(CloseOp);
				}
				break;
			case If:
			case For:
			case Ret:
			case Try:
			case OpenBlock:
			case Identifier:
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

	public static class EndOneContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOne; }
	}

	public final EndOneContext endOne() throws RecognitionException {
		EndOneContext _localctx = new EndOneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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

	public static class EndTwoContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndTwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTwo; }
	}

	public final EndTwoContext endTwo() throws RecognitionException {
		EndTwoContext _localctx = new EndTwoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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

	public static class LoopOneMembersContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableItemContext variableItem() {
			return getRuleContext(VariableItemContext.class,0);
		}
		public LoopOneMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOneMembers; }
	}

	public final LoopOneMembersContext loopOneMembers() throws RecognitionException {
		LoopOneMembersContext _localctx = new LoopOneMembersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loopOneMembers);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(Var);
				setState(277);
				variableItem();
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
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public LoopTwoMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopTwoMembers; }
	}

	public final LoopTwoMembersContext loopTwoMembers() throws RecognitionException {
		LoopTwoMembersContext _localctx = new LoopTwoMembersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loopTwoMembers);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				generalValueElements();
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
		enterRule(_localctx, 68, RULE_loopThreeMembers);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
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
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public LoopThreeMembersValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThreeMembersValues; }
	}

	public final LoopThreeMembersValuesContext loopThreeMembersValues() throws RecognitionException {
		LoopThreeMembersValuesContext _localctx = new LoopThreeMembersValuesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			generalValueElements();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(290);
				match(Separator);
				setState(291);
				generalValueElements();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockTryCatchContext extends ParserRuleContext {
		public TryUniqueElementContext tryUniqueElement() {
			return getRuleContext(TryUniqueElementContext.class,0);
		}
		public CatchUniqueElementContext catchUniqueElement() {
			return getRuleContext(CatchUniqueElementContext.class,0);
		}
		public BlockTryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockTryCatch; }
	}

	public final BlockTryCatchContext blockTryCatch() throws RecognitionException {
		BlockTryCatchContext _localctx = new BlockTryCatchContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			tryUniqueElement();
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(298);
				catchUniqueElement();
				}
				break;
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

	public static class TryUniqueElementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(TParser.Try, 0); }
		public TryCatchElementsContext tryCatchElements() {
			return getRuleContext(TryCatchElementsContext.class,0);
		}
		public TryUniqueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryUniqueElement; }
	}

	public final TryUniqueElementContext tryUniqueElement() throws RecognitionException {
		TryUniqueElementContext _localctx = new TryUniqueElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Try);
			setState(302);
			tryCatchElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchUniqueElementContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(TParser.Catch, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TryCatchElementsContext tryCatchElements() {
			return getRuleContext(TryCatchElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CatchUniqueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchUniqueElement; }
	}

	public final CatchUniqueElementContext catchUniqueElement() throws RecognitionException {
		CatchUniqueElementContext _localctx = new CatchUniqueElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Catch);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(305);
				match(OpenOp);
				}
			}

			setState(308);
			identifier();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(309);
				match(CloseOp);
				}
			}

			setState(312);
			tryCatchElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchElementsContext extends ParserRuleContext {
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public TryCatchElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchElements; }
	}

	public final TryCatchElementsContext tryCatchElements() throws RecognitionException {
		TryCatchElementsContext _localctx = new TryCatchElementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockFlowControlContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public CodeBlockFlowControlElementsContext codeBlockFlowControlElements() {
			return getRuleContext(CodeBlockFlowControlElementsContext.class,0);
		}
		public CodeBlockFlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockFlowControl; }
	}

	public final CodeBlockFlowControlContext codeBlockFlowControl() throws RecognitionException {
		CodeBlockFlowControlContext _localctx = new CodeBlockFlowControlContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codeBlockFlowControl);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(OpenBlock);
				setState(317);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(OpenBlock);
				setState(319);
				sentences();
				setState(320);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				codeBlockFlowControlElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockFlowControlElementsContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockRetContext blockRet() {
			return getRuleContext(BlockRetContext.class,0);
		}
		public BlockConditionalContext blockConditional() {
			return getRuleContext(BlockConditionalContext.class,0);
		}
		public BlockLoopContext blockLoop() {
			return getRuleContext(BlockLoopContext.class,0);
		}
		public BlockTryCatchContext blockTryCatch() {
			return getRuleContext(BlockTryCatchContext.class,0);
		}
		public CodeBlockFlowControlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockFlowControlElements; }
	}

	public final CodeBlockFlowControlElementsContext codeBlockFlowControlElements() throws RecognitionException {
		CodeBlockFlowControlElementsContext _localctx = new CodeBlockFlowControlElementsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codeBlockFlowControlElements);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				functionCall();
				setState(326);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				blockTryCatch();
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

	public static class GeneralValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GeneralValueBlockContext generalValueBlock() {
			return getRuleContext(GeneralValueBlockContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generalValue);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(334);
						match(Not);
						}
					}

					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(337);
						incDecOperatorsA();
						}
					}

					setState(340);
					identifier();
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(341);
						incDecOperatorsB();
						}
						break;
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(344);
						match(TypeSpec);
						}
					}

					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(347);
						match(ArithmeticOperator);
						}
					}

					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(350);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 2:
					{
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(353);
						match(Not);
						}
					}

					setState(356);
					match(Integer);
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(357);
						match(TypeSpec);
						}
					}

					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(360);
						match(ArithmeticOperator);
						}
					}

					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(363);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 3:
					{
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(366);
						match(Not);
						}
					}

					setState(369);
					match(Float);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(370);
						match(TypeSpec);
						}
					}

					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(373);
						match(ArithmeticOperator);
						}
					}

					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(376);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 4:
					{
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(379);
						match(Not);
						}
					}

					setState(382);
					match(String);
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(383);
						match(ArithmeticOperator);
						}
					}

					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(386);
						match(AssignmentOperator);
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(391);
					match(Not);
					}
				}

				setState(394);
				functionCall();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(395);
					match(TypeSpec);
					}
				}

				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(398);
					match(ArithmeticOperator);
					}
				}

				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(401);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(404);
					match(Not);
					}
				}

				setState(407);
				generalValueBlock();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(408);
					match(TypeSpec);
					}
				}

				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(411);
					match(ArithmeticOperator);
					}
				}

				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(414);
					match(AssignmentOperator);
					}
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

	public static class GeneralValueBlockContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public GeneralValueItemsContext generalValueItems() {
			return getRuleContext(GeneralValueItemsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public GeneralValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueBlock; }
	}

	public final GeneralValueBlockContext generalValueBlock() throws RecognitionException {
		GeneralValueBlockContext _localctx = new GeneralValueBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OpenOp);
			setState(420);
			generalValueItems();
			setState(421);
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

	public static class GeneralValueItemsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<GeneralValueItemsContext> generalValueItems() {
			return getRuleContexts(GeneralValueItemsContext.class);
		}
		public GeneralValueItemsContext generalValueItems(int i) {
			return getRuleContext(GeneralValueItemsContext.class,i);
		}
		public GeneralValueItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueItems; }
	}

	public final GeneralValueItemsContext generalValueItems() throws RecognitionException {
		GeneralValueItemsContext _localctx = new GeneralValueItemsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			generalValue();
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					generalValueItems();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class GeneralValueElementsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public GeneralValueElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueElements; }
	}

	public final GeneralValueElementsContext generalValueElements() throws RecognitionException {
		GeneralValueElementsContext _localctx = new GeneralValueElementsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			generalValue();
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					generalValueElements();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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

	public static class IncDecOperatorsAContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public IncDecOperatorsAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecOperatorsA; }
	}

	public final IncDecOperatorsAContext incDecOperatorsA() throws RecognitionException {
		IncDecOperatorsAContext _localctx = new IncDecOperatorsAContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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

	public static class IncDecOperatorsBContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public IncDecOperatorsBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecOperatorsB; }
	}

	public final IncDecOperatorsBContext incDecOperatorsB() throws RecognitionException {
		IncDecOperatorsBContext _localctx = new IncDecOperatorsBContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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

	public static class BlockLiveTokensContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Interface() { return getToken(TParser.Interface, 0); }
		public TerminalNode Abstract() { return getToken(TParser.Abstract, 0); }
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode Next() { return getToken(TParser.Next, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode IDPrefix() { return getToken(TParser.IDPrefix, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Words() { return getToken(TParser.Words, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public BlockLiveTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLiveTokens; }
	}

	public final BlockLiveTokensContext blockLiveTokens() throws RecognitionException {
		BlockLiveTokensContext _localctx = new BlockLiveTokensContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_blockLiveTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << Interface) | (1L << Abstract) | (1L << Extends) | (1L << Class) | (1L << Implements) | (1L << New) | (1L << Break) | (1L << Next) | (1L << Async) | (1L << ArrowRight) | (1L << ARightLB) | (1L << End) | (1L << Attr) | (1L << Point) | (1L << TwoPoint) | (1L << TwoTwoPoint) | (1L << Separator) | (1L << OpenArIndex) | (1L << CloseArIndex) | (1L << OpenOp) | (1L << CloseOp) | (1L << ArithmeticOperator) | (1L << AssignmentOperator) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << IDPrefix) | (1L << TypeSpec) | (1L << Words) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\5\13\u0099\n\13\3\13\3\13\3\13\7\13\u009e\n\13\f\13\16\13\u00a1\13\13"+
		"\3\f\5\f\u00a4\n\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\17\3\17\5\17\u00b9\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c4\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\7\22\u00d1\n\22\f"+
		"\22\16\22\u00d4\13\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00dc\n\24\3"+
		"\24\5\24\u00df\n\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00e7\n\26\f\26"+
		"\16\26\u00ea\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u00fb\n\33\3\33\3\33\3\34\3\34\3\35\5\35"+
		"\u0102\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u010a\n\35\3\36\3\36\3"+
		"\37\3\37\3\37\5\37\u0111\n\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u011a\n\"\3"+
		"#\3#\5#\u011e\n#\3$\3$\5$\u0122\n$\3%\3%\3%\7%\u0127\n%\f%\16%\u012a\13"+
		"%\3&\3&\5&\u012e\n&\3\'\3\'\3\'\3(\3(\5(\u0135\n(\3(\3(\5(\u0139\n(\3"+
		"(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u0146\n*\3+\3+\3+\3+\3+\3+\3+\5+\u014f"+
		"\n+\3,\5,\u0152\n,\3,\5,\u0155\n,\3,\3,\5,\u0159\n,\3,\5,\u015c\n,\3,"+
		"\5,\u015f\n,\3,\5,\u0162\n,\3,\5,\u0165\n,\3,\3,\5,\u0169\n,\3,\5,\u016c"+
		"\n,\3,\5,\u016f\n,\3,\5,\u0172\n,\3,\3,\5,\u0176\n,\3,\5,\u0179\n,\3,"+
		"\5,\u017c\n,\3,\5,\u017f\n,\3,\3,\5,\u0183\n,\3,\5,\u0186\n,\5,\u0188"+
		"\n,\3,\5,\u018b\n,\3,\3,\5,\u018f\n,\3,\5,\u0192\n,\3,\5,\u0195\n,\3,"+
		"\5,\u0198\n,\3,\3,\5,\u019c\n,\3,\5,\u019f\n,\3,\5,\u01a2\n,\5,\u01a4"+
		"\n,\3-\3-\3-\3-\3.\3.\7.\u01ac\n.\f.\16.\u01af\13.\3/\3/\7/\u01b3\n/\f"+
		"/\16/\u01b6\13/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bd\2\7\3\2\65\66\4\2\25\25\31\31\4\2\37\37++\4\2\13\17\30\30"+
		"\5\2\n\30\34%(\64\2\u01d8\2f\3\2\2\2\4n\3\2\2\2\6y\3\2\2\2\b\u0081\3\2"+
		"\2\2\n\u0083\3\2\2\2\f\u0085\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2"+
		"\22\u0092\3\2\2\2\24\u0096\3\2\2\2\26\u00a3\3\2\2\2\30\u00ad\3\2\2\2\32"+
		"\u00af\3\2\2\2\34\u00b6\3\2\2\2\36\u00c3\3\2\2\2 \u00cb\3\2\2\2\"\u00cd"+
		"\3\2\2\2$\u00d5\3\2\2\2&\u00d9\3\2\2\2(\u00e0\3\2\2\2*\u00e4\3\2\2\2,"+
		"\u00eb\3\2\2\2.\u00ef\3\2\2\2\60\u00f2\3\2\2\2\62\u00f4\3\2\2\2\64\u00f6"+
		"\3\2\2\2\66\u00fe\3\2\2\28\u0101\3\2\2\2:\u010b\3\2\2\2<\u0110\3\2\2\2"+
		">\u0112\3\2\2\2@\u0114\3\2\2\2B\u0119\3\2\2\2D\u011d\3\2\2\2F\u0121\3"+
		"\2\2\2H\u0123\3\2\2\2J\u012b\3\2\2\2L\u012f\3\2\2\2N\u0132\3\2\2\2P\u013c"+
		"\3\2\2\2R\u0145\3\2\2\2T\u014e\3\2\2\2V\u01a3\3\2\2\2X\u01a5\3\2\2\2Z"+
		"\u01a9\3\2\2\2\\\u01b0\3\2\2\2^\u01b7\3\2\2\2`\u01b9\3\2\2\2b\u01bb\3"+
		"\2\2\2d\u01bd\3\2\2\2fg\5\4\3\2gh\7\2\2\3h\3\3\2\2\2io\5\6\4\2jk\5\6\4"+
		"\2kl\5\4\3\2lo\3\2\2\2mo\3\2\2\2ni\3\2\2\2nj\3\2\2\2nm\3\2\2\2o\5\3\2"+
		"\2\2pz\5\n\6\2qz\5\f\7\2rz\5\22\n\2sz\5$\23\2tz\5&\24\2uz\5\64\33\2vz"+
		"\5J&\2wz\5\b\5\2xz\5d\63\2yp\3\2\2\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2yt\3"+
		"\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\7\3\2\2\2{|\7&\2\2|\u0082"+
		"\7\'\2\2}~\7&\2\2~\177\5\4\3\2\177\u0080\7\'\2\2\u0080\u0082\3\2\2\2\u0081"+
		"{\3\2\2\2\u0081}\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084\t\2\2\2\u0084\13"+
		"\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\5\16\b\2\u0087\u0088\7\36\2\2"+
		"\u0088\r\3\2\2\2\u0089\u008f\5\20\t\2\u008a\u008b\5\20\t\2\u008b\u008c"+
		"\7#\2\2\u008c\u008d\5\16\b\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008f\17\3\2\2\2\u0090\u0091\7\64\2\2\u0091\21\3\2\2\2"+
		"\u0092\u0093\7\4\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\36\2\2\u0095"+
		"\23\3\2\2\2\u0096\u0098\5\26\f\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\5\\/\2\u009b\u009c"+
		"\7#\2\2\u009c\u009e\5\24\13\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a9\3\2\2\2\u00a5\u00aa\5^\60\2\u00a6\u00a7\5^\60\2\u00a7\u00a8"+
		"\7\60\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac\27\3\2\2\2\u00ad\u00ae"+
		"\t\5\2\2\u00ae\31\3\2\2\2\u00af\u00b3\5\30\r\2\u00b0\u00b2\5\32\16\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\33\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5\36\20\2\u00b7"+
		"\u00b9\5^\60\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\5 \21\2\u00bb\35\3\2\2\2\u00bc\u00c4\5^\60\2\u00bd\u00be"+
		"\5^\60\2\u00be\u00bf\7 \2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5^\60\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2"+
		"\2\2\u00c3\u00c0\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6\u00cc"+
		"\7)\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7)\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc!\3\2\2\2"+
		"\u00cd\u00d2\5V,\2\u00ce\u00cf\7#\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"#\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\\/\2\u00d7"+
		"\u00d8\7\36\2\2\u00d8%\3\2\2\2\u00d9\u00db\5(\25\2\u00da\u00dc\5*\26\2"+
		"\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df"+
		"\5.\30\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0"+
		"\u00e1\7\5\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3\5\62\32\2\u00e3)\3\2"+
		"\2\2\u00e4\u00e8\5,\27\2\u00e5\u00e7\5*\26\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\6\2\2\u00ec\u00ed\5\60\31\2\u00ed\u00ee"+
		"\5\62\32\2\u00ee-\3\2\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\5\62\32\2\u00f1"+
		"/\3\2\2\2\u00f2\u00f3\5\\/\2\u00f3\61\3\2\2\2\u00f4\u00f5\5R*\2\u00f5"+
		"\63\3\2\2\2\u00f6\u00fa\7\b\2\2\u00f7\u00fb\5<\37\2\u00f8\u00fb\5:\36"+
		"\2\u00f9\u00fb\58\35\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5\66\34\2\u00fd\65\3\2\2\2\u00fe"+
		"\u00ff\5R*\2\u00ff\67\3\2\2\2\u0100\u0102\7(\2\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5B\"\2\u0104\u0105\5> "+
		"\2\u0105\u0106\5D#\2\u0106\u0107\5@!\2\u0107\u0109\5F$\2\u0108\u010a\7"+
		")\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a9\3\2\2\2\u010b\u010c"+
		"\5D#\2\u010c;\3\2\2\2\u010d\u010e\7(\2\2\u010e\u0111\7)\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010f\3\2\2\2\u0111=\3\2\2\2\u0112"+
		"\u0113\7\36\2\2\u0113?\3\2\2\2\u0114\u0115\7\36\2\2\u0115A\3\2\2\2\u0116"+
		"\u0117\7\4\2\2\u0117\u011a\5\24\13\2\u0118\u011a\3\2\2\2\u0119\u0116\3"+
		"\2\2\2\u0119\u0118\3\2\2\2\u011aC\3\2\2\2\u011b\u011e\5\\/\2\u011c\u011e"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011eE\3\2\2\2\u011f"+
		"\u0122\5H%\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2"+
		"\2\u0122G\3\2\2\2\u0123\u0128\5\\/\2\u0124\u0125\7#\2\2\u0125\u0127\5"+
		"\\/\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129I\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\5L\'\2\u012c"+
		"\u012e\5N(\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012eK\3\2\2\2\u012f"+
		"\u0130\7\32\2\2\u0130\u0131\5P)\2\u0131M\3\2\2\2\u0132\u0134\7\33\2\2"+
		"\u0133\u0135\7(\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\5^\60\2\u0137\u0139\7)\2\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\5P)\2\u013bO\3\2\2\2\u013c"+
		"\u013d\5R*\2\u013dQ\3\2\2\2\u013e\u013f\7&\2\2\u013f\u0146\7\'\2\2\u0140"+
		"\u0141\7&\2\2\u0141\u0142\5\4\3\2\u0142\u0143\7\'\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0146\5T+\2\u0145\u013e\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0144"+
		"\3\2\2\2\u0146S\3\2\2\2\u0147\u0148\5\34\17\2\u0148\u0149\7\36\2\2\u0149"+
		"\u014f\3\2\2\2\u014a\u014f\5$\23\2\u014b\u014f\5&\24\2\u014c\u014f\5\64"+
		"\33\2\u014d\u014f\5J&\2\u014e\u0147\3\2\2\2\u014e\u014a\3\2\2\2\u014e"+
		"\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014fU\3\2\2\2"+
		"\u0150\u0152\7,\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154"+
		"\3\2\2\2\u0153\u0155\5`\61\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\5^\60\2\u0157\u0159\5b\62\2\u0158\u0157\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\7\60\2\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\7*"+
		"\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u0162\7+\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0188\3\2"+
		"\2\2\u0163\u0165\7,\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\7\62\2\2\u0167\u0169\7\60\2\2\u0168\u0167\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\7*\2\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7+"+
		"\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0188\3\2\2\2\u0170"+
		"\u0172\7,\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0175\7\63\2\2\u0174\u0176\7\60\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\7*\2\2\u0178\u0177\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\7+\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0188\3\2\2\2\u017d\u017f\7,"+
		"\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\7\64\2\2\u0181\u0183\7*\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7+\2\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0151\3\2\2\2\u0187\u0164\3\2"+
		"\2\2\u0187\u0171\3\2\2\2\u0187\u017e\3\2\2\2\u0188\u01a4\3\2\2\2\u0189"+
		"\u018b\7,\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\5\34\17\2\u018d\u018f\7\60\2\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0192\7*\2\2\u0191\u0190\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0195\7+\2\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a4\3\2\2\2\u0196\u0198\7,"+
		"\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019b\5X-\2\u019a\u019c\7\60\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019e\3\2\2\2\u019d\u019f\7*\2\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\7+\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0187\3\2\2\2\u01a3"+
		"\u018a\3\2\2\2\u01a3\u0197\3\2\2\2\u01a4W\3\2\2\2\u01a5\u01a6\7(\2\2\u01a6"+
		"\u01a7\5Z.\2\u01a7\u01a8\7)\2\2\u01a8Y\3\2\2\2\u01a9\u01ad\5V,\2\u01aa"+
		"\u01ac\5Z.\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01ae[\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b4"+
		"\5V,\2\u01b1\u01b3\5\\/\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5]\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b7\u01b8\7.\2\2\u01b8_\3\2\2\2\u01b9\u01ba\7-\2\2\u01baa\3\2\2\2\u01bb"+
		"\u01bc\7-\2\2\u01bcc\3\2\2\2\u01bd\u01be\t\6\2\2\u01bee\3\2\2\2<ny\u0081"+
		"\u008e\u0098\u009f\u00a3\u00a9\u00b3\u00b8\u00c3\u00cb\u00d2\u00db\u00de"+
		"\u00e8\u00fa\u0101\u0109\u0110\u0119\u011d\u0121\u0128\u012d\u0134\u0138"+
		"\u0145\u014e\u0151\u0154\u0158\u015b\u015e\u0161\u0164\u0168\u016b\u016e"+
		"\u0171\u0175\u0178\u017b\u017e\u0182\u0185\u0187\u018a\u018e\u0191\u0194"+
		"\u0197\u019b\u019e\u01a1\u01a3\u01ad\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}