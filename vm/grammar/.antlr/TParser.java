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
		RULE_functionCall = 11, RULE_functionCallPrefix = 12, RULE_functionCallParam = 13, 
		RULE_functionCallParamElements = 14, RULE_blockRet = 15, RULE_blockConditional = 16, 
		RULE_ifElementUnique = 17, RULE_elifElements = 18, RULE_elifElementUnique = 19, 
		RULE_elseElementUnique = 20, RULE_conditionalBlockExpression = 21, RULE_conditionalBlockElements = 22, 
		RULE_blockLoop = 23, RULE_loopBlockElements = 24, RULE_loopComplete = 25, 
		RULE_loopConditional = 26, RULE_loopInfinite = 27, RULE_endOne = 28, RULE_endTwo = 29, 
		RULE_loopOneMembers = 30, RULE_loopTwoMembers = 31, RULE_loopThreeMembers = 32, 
		RULE_loopThreeMembersValues = 33, RULE_blockTryCatch = 34, RULE_tryUniqueElement = 35, 
		RULE_catchUniqueElement = 36, RULE_tryCatchElements = 37, RULE_blockFunction = 38, 
		RULE_functionParam = 39, RULE_functionCodeBlock = 40, RULE_blockInterface = 41, 
		RULE_interfaceCodeBlock = 42, RULE_blockAbstraction = 43, RULE_abstractionCodeBlock = 44, 
		RULE_blockClass = 45, RULE_classCodeBlock = 46, RULE_codeBlockFlowControl = 47, 
		RULE_codeBlockFlowControlElements = 48, RULE_codeBlockControl = 49, RULE_generalValue = 50, 
		RULE_generalValueBlock = 51, RULE_generalValueItems = 52, RULE_generalValueElements = 53, 
		RULE_identifier = 54, RULE_identifierB = 55, RULE_identifierC = 56, RULE_incDecOperatorsA = 57, 
		RULE_incDecOperatorsB = 58, RULE_blockLiveTokens = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockComments", "blockUse", 
			"useValue", "useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"functionCall", "functionCallPrefix", "functionCallParam", "functionCallParamElements", 
			"blockRet", "blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
			"elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
			"blockLoop", "loopBlockElements", "loopComplete", "loopConditional", 
			"loopInfinite", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "blockTryCatch", "tryUniqueElement", 
			"catchUniqueElement", "tryCatchElements", "blockFunction", "functionParam", 
			"functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
			"abstractionCodeBlock", "blockClass", "classCodeBlock", "codeBlockFlowControl", 
			"codeBlockFlowControlElements", "codeBlockControl", "generalValue", "generalValueBlock", 
			"generalValueItems", "generalValueElements", "identifier", "identifierB", 
			"identifierC", "incDecOperatorsA", "incDecOperatorsB", "blockLiveTokens"
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
			setState(120);
			sentences();
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				statements();
				setState(125);
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
		public BlockFunctionContext blockFunction() {
			return getRuleContext(BlockFunctionContext.class,0);
		}
		public BlockInterfaceContext blockInterface() {
			return getRuleContext(BlockInterfaceContext.class,0);
		}
		public BlockAbstractionContext blockAbstraction() {
			return getRuleContext(BlockAbstractionContext.class,0);
		}
		public BlockClassContext blockClass() {
			return getRuleContext(BlockClassContext.class,0);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				blockComments();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				blockUse();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				blockVariable();
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				blockTryCatch();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				blockFunction();
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				blockInterface();
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				blockAbstraction();
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				blockClass();
				}
				break;
			case OpenBlock:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				blockCode();
				}
				break;
			case Pub:
			case Pro:
			case Priv:
			case Static:
			case Final:
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
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(145);
				match(OpenBlock);
				setState(146);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(147);
				match(OpenBlock);
				setState(148);
				sentences();
				setState(149);
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
			setState(153);
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
			setState(155);
			match(Use);
			setState(156);
			useValue();
			setState(157);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				useString();
				setState(161);
				match(Separator);
				setState(162);
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
			setState(166);
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
			setState(168);
			match(Var);
			setState(169);
			variableItem();
			setState(170);
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
			setState(172);
			variablePrefixModes();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(173);
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

			setState(176);
			generalValueElements();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(Separator);
					setState(178);
					variableItem();
					}
					} 
				}
				setState(183);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(184);
				identifier();
				}
				break;
			case 2:
				{
				setState(185);
				identifier();
				setState(186);
				match(TypeSpec);
				}
				break;
			}
			setState(190);
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
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			functionCallPrefix();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(193);
				identifier();
				}
			}

			setState(196);
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
		enterRule(_localctx, 24, RULE_functionCallPrefix);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				identifier();
				setState(200);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				identifier();
				setState(203);
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
		enterRule(_localctx, 26, RULE_functionCallParam);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(OpenOp);
				setState(208);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(OpenOp);
				setState(210);
				functionCallParamElements();
				setState(211);
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
		enterRule(_localctx, 28, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			generalValue();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(Separator);
					setState(217);
					functionCallParamElements();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 30, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Ret);
			setState(224);
			generalValueElements();
			setState(225);
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
		enterRule(_localctx, 32, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			ifElementUnique();
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(228);
				elifElements();
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(231);
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
		enterRule(_localctx, 34, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(If);
			setState(235);
			conditionalBlockExpression();
			setState(236);
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
		enterRule(_localctx, 36, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			elifElementUnique();
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					elifElements();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 38, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Elif);
			setState(246);
			conditionalBlockExpression();
			setState(247);
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
		enterRule(_localctx, 40, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Else);
			setState(250);
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
		enterRule(_localctx, 42, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 44, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 46, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(For);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(257);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(258);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(259);
				loopComplete();
				}
				break;
			}
			setState(262);
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
		enterRule(_localctx, 48, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 50, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(266);
				match(OpenOp);
				}
			}

			setState(269);
			loopOneMembers();
			setState(270);
			endOne();
			setState(271);
			loopTwoMembers();
			setState(272);
			endTwo();
			setState(273);
			loopThreeMembers();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(274);
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
		enterRule(_localctx, 52, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 54, RULE_loopInfinite);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(OpenOp);
				setState(280);
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
		enterRule(_localctx, 56, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 58, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 60, RULE_loopOneMembers);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(Var);
				setState(289);
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
		enterRule(_localctx, 62, RULE_loopTwoMembers);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
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
		enterRule(_localctx, 64, RULE_loopThreeMembers);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
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
		enterRule(_localctx, 66, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			generalValueElements();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(302);
				match(Separator);
				setState(303);
				generalValueElements();
				}
				}
				setState(308);
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
		enterRule(_localctx, 68, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			tryUniqueElement();
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(310);
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
		enterRule(_localctx, 70, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Try);
			setState(314);
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
		enterRule(_localctx, 72, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(Catch);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(317);
				match(OpenOp);
				}
			}

			setState(320);
			identifier();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(321);
				match(CloseOp);
				}
			}

			setState(324);
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
		enterRule(_localctx, 74, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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

	public static class BlockFunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunction; }
	}

	public final BlockFunctionContext blockFunction() throws RecognitionException {
		BlockFunctionContext _localctx = new BlockFunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Function);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(329);
				identifier();
				}
			}

			setState(332);
			match(OpenOp);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(333);
				functionParam();
				}
			}

			setState(336);
			match(CloseOp);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(337);
				match(ArrowRight);
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(338);
					identifierB();
					}
					break;
				case TypeSpec:
					{
					setState(339);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBlock:
				{
				setState(344);
				functionCodeBlock();
				}
				break;
			case End:
				{
				setState(345);
				match(End);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(Identifier);
			setState(349);
			match(TypeSpec);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(350);
				match(Separator);
				setState(351);
				functionParam();
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

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockInterfaceContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(TParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceCodeBlockContext interfaceCodeBlock() {
			return getRuleContext(InterfaceCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public BlockInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockInterface; }
	}

	public final BlockInterfaceContext blockInterface() throws RecognitionException {
		BlockInterfaceContext _localctx = new BlockInterfaceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(Interface);
			setState(357);
			identifier();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(358);
				match(Extends);
				setState(359);
				identifierB();
				}
			}

			setState(362);
			interfaceCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public InterfaceCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCodeBlock; }
	}

	public final InterfaceCodeBlockContext interfaceCodeBlock() throws RecognitionException {
		InterfaceCodeBlockContext _localctx = new InterfaceCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockAbstractionContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(TParser.Abstract, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AbstractionCodeBlockContext abstractionCodeBlock() {
			return getRuleContext(AbstractionCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public BlockAbstractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAbstraction; }
	}

	public final BlockAbstractionContext blockAbstraction() throws RecognitionException {
		BlockAbstractionContext _localctx = new BlockAbstractionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Abstract);
			setState(367);
			identifier();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(368);
				match(Extends);
				setState(369);
				identifierB();
				}
			}

			setState(372);
			abstractionCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractionCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public AbstractionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractionCodeBlock; }
	}

	public final AbstractionCodeBlockContext abstractionCodeBlock() throws RecognitionException {
		AbstractionCodeBlockContext _localctx = new AbstractionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public IdentifierCContext identifierC() {
			return getRuleContext(IdentifierCContext.class,0);
		}
		public BlockClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClass; }
	}

	public final BlockClassContext blockClass() throws RecognitionException {
		BlockClassContext _localctx = new BlockClassContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(Class);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(377);
				identifier();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(380);
				match(Extends);
				setState(381);
				identifierB();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(384);
				match(Implements);
				setState(385);
				identifierC();
				}
			}

			setState(388);
			classCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public ClassCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCodeBlock; }
	}

	public final ClassCodeBlockContext classCodeBlock() throws RecognitionException {
		ClassCodeBlockContext _localctx = new ClassCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_codeBlockFlowControl);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(OpenBlock);
				setState(393);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(OpenBlock);
				setState(395);
				sentences();
				setState(396);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
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
		enterRule(_localctx, 96, RULE_codeBlockFlowControlElements);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				functionCall();
				setState(402);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
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

	public static class CodeBlockControlContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public CodeBlockControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockControl; }
	}

	public final CodeBlockControlContext codeBlockControl() throws RecognitionException {
		CodeBlockControlContext _localctx = new CodeBlockControlContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_codeBlockControl);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(OpenBlock);
				setState(411);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(OpenBlock);
				setState(413);
				sentences();
				setState(414);
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
		enterRule(_localctx, 100, RULE_generalValue);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(418);
						match(Not);
						}
					}

					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(421);
						incDecOperatorsA();
						}
					}

					setState(424);
					identifier();
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(425);
						incDecOperatorsB();
						}
						break;
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(428);
						match(TypeSpec);
						}
					}

					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(431);
						match(ArithmeticOperator);
						}
					}

					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(434);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 2:
					{
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(437);
						match(Not);
						}
					}

					setState(440);
					match(Integer);
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(441);
						match(TypeSpec);
						}
					}

					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(444);
						match(ArithmeticOperator);
						}
					}

					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(447);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 3:
					{
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(450);
						match(Not);
						}
					}

					setState(453);
					match(Float);
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(454);
						match(TypeSpec);
						}
					}

					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(457);
						match(ArithmeticOperator);
						}
					}

					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(460);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 4:
					{
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(463);
						match(Not);
						}
					}

					setState(466);
					match(String);
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(467);
						match(ArithmeticOperator);
						}
					}

					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(470);
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
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(475);
					match(Not);
					}
				}

				setState(478);
				functionCall();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(479);
					match(TypeSpec);
					}
				}

				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(482);
					match(ArithmeticOperator);
					}
				}

				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(485);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(488);
					match(Not);
					}
				}

				setState(491);
				generalValueBlock();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(492);
					match(TypeSpec);
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(495);
					match(ArithmeticOperator);
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(498);
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
		enterRule(_localctx, 102, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(OpenOp);
			setState(504);
			generalValueItems();
			setState(505);
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
		enterRule(_localctx, 104, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			generalValue();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508);
					generalValueItems();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 106, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			generalValue();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					generalValueElements();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 108, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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

	public static class IdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierB; }
	}

	public final IdentifierBContext identifierB() throws RecognitionException {
		IdentifierBContext _localctx = new IdentifierBContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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

	public static class IdentifierCContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierC; }
	}

	public final IdentifierCContext identifierC() throws RecognitionException {
		IdentifierCContext _localctx = new IdentifierCContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		enterRule(_localctx, 114, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		enterRule(_localctx, 116, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
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
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode Next() { return getToken(TParser.Next, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
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
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
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
		enterRule(_localctx, 118, RULE_blockLiveTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << New) | (1L << Break) | (1L << Next) | (1L << Async) | (1L << ArrowRight) | (1L << ARightLB) | (1L << End) | (1L << Attr) | (1L << Point) | (1L << TwoPoint) | (1L << TwoTwoPoint) | (1L << Separator) | (1L << OpenArIndex) | (1L << CloseArIndex) | (1L << OpenOp) | (1L << CloseOp) | (1L << ArithmeticOperator) | (1L << AssignmentOperator) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << IDPrefix) | (1L << TypeSpec) | (1L << Words) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0218\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0083\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u009a\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\7\13\u00b6"+
		"\n\13\f\13\16\13\u00b9\13\13\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\f\3\f\3\r"+
		"\3\r\5\r\u00c5\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d0"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d8\n\17\3\20\3\20\3\20\7\20"+
		"\u00dd\n\20\f\20\16\20\u00e0\13\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22"+
		"\u00e8\n\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00f3"+
		"\n\24\f\24\16\24\u00f6\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0107\n\31\3\31\3\31\3\32\3\32"+
		"\3\33\5\33\u010e\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u011d\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \5"+
		" \u0126\n \3!\3!\5!\u012a\n!\3\"\3\"\5\"\u012e\n\"\3#\3#\3#\7#\u0133\n"+
		"#\f#\16#\u0136\13#\3$\3$\5$\u013a\n$\3%\3%\3%\3&\3&\5&\u0141\n&\3&\3&"+
		"\5&\u0145\n&\3&\3&\3\'\3\'\3(\3(\5(\u014d\n(\3(\3(\5(\u0151\n(\3(\3(\3"+
		"(\3(\5(\u0157\n(\5(\u0159\n(\3(\3(\5(\u015d\n(\3)\3)\3)\3)\5)\u0163\n"+
		")\3*\3*\3+\3+\3+\3+\5+\u016b\n+\3+\3+\3,\3,\3-\3-\3-\3-\5-\u0175\n-\3"+
		"-\3-\3.\3.\3/\3/\5/\u017d\n/\3/\3/\5/\u0181\n/\3/\3/\5/\u0185\n/\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0192\n\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u019b\n\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u01a3\n\63\3\64\5\64\u01a6\n\64\3\64\5\64\u01a9\n\64\3\64\3"+
		"\64\5\64\u01ad\n\64\3\64\5\64\u01b0\n\64\3\64\5\64\u01b3\n\64\3\64\5\64"+
		"\u01b6\n\64\3\64\5\64\u01b9\n\64\3\64\3\64\5\64\u01bd\n\64\3\64\5\64\u01c0"+
		"\n\64\3\64\5\64\u01c3\n\64\3\64\5\64\u01c6\n\64\3\64\3\64\5\64\u01ca\n"+
		"\64\3\64\5\64\u01cd\n\64\3\64\5\64\u01d0\n\64\3\64\5\64\u01d3\n\64\3\64"+
		"\3\64\5\64\u01d7\n\64\3\64\5\64\u01da\n\64\5\64\u01dc\n\64\3\64\5\64\u01df"+
		"\n\64\3\64\3\64\5\64\u01e3\n\64\3\64\5\64\u01e6\n\64\3\64\5\64\u01e9\n"+
		"\64\3\64\5\64\u01ec\n\64\3\64\3\64\5\64\u01f0\n\64\3\64\5\64\u01f3\n\64"+
		"\3\64\5\64\u01f6\n\64\5\64\u01f8\n\64\3\65\3\65\3\65\3\65\3\66\3\66\7"+
		"\66\u0200\n\66\f\66\16\66\u0203\13\66\3\67\3\67\7\67\u0207\n\67\f\67\16"+
		"\67\u020a\13\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\2\2>\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvx\2\6\3\2\65\66\4\2\25\25\31\31\4\2\37\37++\6\2\13\17\25"+
		"\30\34%(\64\2\u0234\2z\3\2\2\2\4\u0082\3\2\2\2\6\u0091\3\2\2\2\b\u0099"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8\3\2"+
		"\2\2\22\u00aa\3\2\2\2\24\u00ae\3\2\2\2\26\u00be\3\2\2\2\30\u00c2\3\2\2"+
		"\2\32\u00cf\3\2\2\2\34\u00d7\3\2\2\2\36\u00d9\3\2\2\2 \u00e1\3\2\2\2\""+
		"\u00e5\3\2\2\2$\u00ec\3\2\2\2&\u00f0\3\2\2\2(\u00f7\3\2\2\2*\u00fb\3\2"+
		"\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60\u0102\3\2\2\2\62\u010a\3\2\2\2\64"+
		"\u010d\3\2\2\2\66\u0117\3\2\2\28\u011c\3\2\2\2:\u011e\3\2\2\2<\u0120\3"+
		"\2\2\2>\u0125\3\2\2\2@\u0129\3\2\2\2B\u012d\3\2\2\2D\u012f\3\2\2\2F\u0137"+
		"\3\2\2\2H\u013b\3\2\2\2J\u013e\3\2\2\2L\u0148\3\2\2\2N\u014a\3\2\2\2P"+
		"\u015e\3\2\2\2R\u0164\3\2\2\2T\u0166\3\2\2\2V\u016e\3\2\2\2X\u0170\3\2"+
		"\2\2Z\u0178\3\2\2\2\\\u017a\3\2\2\2^\u0188\3\2\2\2`\u0191\3\2\2\2b\u019a"+
		"\3\2\2\2d\u01a2\3\2\2\2f\u01f7\3\2\2\2h\u01f9\3\2\2\2j\u01fd\3\2\2\2l"+
		"\u0204\3\2\2\2n\u020b\3\2\2\2p\u020d\3\2\2\2r\u020f\3\2\2\2t\u0211\3\2"+
		"\2\2v\u0213\3\2\2\2x\u0215\3\2\2\2z{\5\4\3\2{|\7\2\2\3|\3\3\2\2\2}\u0083"+
		"\5\6\4\2~\177\5\6\4\2\177\u0080\5\4\3\2\u0080\u0083\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083\5\3\2"+
		"\2\2\u0084\u0092\5\n\6\2\u0085\u0092\5\f\7\2\u0086\u0092\5\22\n\2\u0087"+
		"\u0092\5 \21\2\u0088\u0092\5\"\22\2\u0089\u0092\5\60\31\2\u008a\u0092"+
		"\5F$\2\u008b\u0092\5N(\2\u008c\u0092\5T+\2\u008d\u0092\5X-\2\u008e\u0092"+
		"\5\\/\2\u008f\u0092\5\b\5\2\u0090\u0092\5x=\2\u0091\u0084\3\2\2\2\u0091"+
		"\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u0088\3\2"+
		"\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\7\3\2\2\2\u0093\u0094\7&\2\2\u0094\u009a"+
		"\7\'\2\2\u0095\u0096\7&\2\2\u0096\u0097\5\4\3\2\u0097\u0098\7\'\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u009a\t\3\2\2\2"+
		"\u009b\u009c\t\2\2\2\u009c\13\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f"+
		"\5\16\b\2\u009f\u00a0\7\36\2\2\u00a0\r\3\2\2\2\u00a1\u00a7\5\20\t\2\u00a2"+
		"\u00a3\5\20\t\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\17\3\2\2\2\u00a8"+
		"\u00a9\7\64\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\24"+
		"\13\2\u00ac\u00ad\7\36\2\2\u00ad\23\3\2\2\2\u00ae\u00b0\5\26\f\2\u00af"+
		"\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b7\5l\67\2\u00b3\u00b4\7#\2\2\u00b4\u00b6\5\24\13\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\25\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bf\5n8\2\u00bb\u00bc"+
		"\5n8\2\u00bc\u00bd\7\60\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1\27\3\2\2"+
		"\2\u00c2\u00c4\5\32\16\2\u00c3\u00c5\5n8\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5\34\17\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00d0\5n8\2\u00c9\u00ca\5n8\2\u00ca\u00cb\7 \2\2\u00cb\u00d0\3\2\2\2"+
		"\u00cc\u00cd\5n8\2\u00cd\u00ce\7\"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c8"+
		"\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\33\3\2\2\2\u00d1"+
		"\u00d2\7(\2\2\u00d2\u00d8\7)\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\5\36\20"+
		"\2\u00d5\u00d6\7)\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d3"+
		"\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00de\5f\64\2\u00da\u00db\7#\2\2\u00db"+
		"\u00dd\5\36\20\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\t\2\2\u00e2\u00e3\5l\67\2\u00e3\u00e4\7\36\2\2\u00e4!\3\2\2\2"+
		"\u00e5\u00e7\5$\23\2\u00e6\u00e8\5&\24\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5*\26\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5,\27\2"+
		"\u00ee\u00ef\5.\30\2\u00ef%\3\2\2\2\u00f0\u00f4\5(\25\2\u00f1\u00f3\5"+
		"&\24\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\6\2\2"+
		"\u00f8\u00f9\5,\27\2\u00f9\u00fa\5.\30\2\u00fa)\3\2\2\2\u00fb\u00fc\7"+
		"\7\2\2\u00fc\u00fd\5.\30\2\u00fd+\3\2\2\2\u00fe\u00ff\5l\67\2\u00ff-\3"+
		"\2\2\2\u0100\u0101\5`\61\2\u0101/\3\2\2\2\u0102\u0106\7\b\2\2\u0103\u0107"+
		"\58\35\2\u0104\u0107\5\66\34\2\u0105\u0107\5\64\33\2\u0106\u0103\3\2\2"+
		"\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\5\62\32\2\u0109\61\3\2\2\2\u010a\u010b\5`\61\2\u010b\63\3\2\2\2\u010c"+
		"\u010e\7(\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\5> \2\u0110\u0111\5:\36\2\u0111\u0112\5@!\2\u0112\u0113"+
		"\5<\37\2\u0113\u0115\5B\"\2\u0114\u0116\7)\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\65\3\2\2\2\u0117\u0118\5@!\2\u0118\67\3\2\2\2\u0119"+
		"\u011a\7(\2\2\u011a\u011d\7)\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2"+
		"\2\u011c\u011b\3\2\2\2\u011d9\3\2\2\2\u011e\u011f\7\36\2\2\u011f;\3\2"+
		"\2\2\u0120\u0121\7\36\2\2\u0121=\3\2\2\2\u0122\u0123\7\4\2\2\u0123\u0126"+
		"\5\24\13\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2"+
		"\u0126?\3\2\2\2\u0127\u012a\5l\67\2\u0128\u012a\3\2\2\2\u0129\u0127\3"+
		"\2\2\2\u0129\u0128\3\2\2\2\u012aA\3\2\2\2\u012b\u012e\5D#\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012eC\3\2\2\2\u012f"+
		"\u0134\5l\67\2\u0130\u0131\7#\2\2\u0131\u0133\5l\67\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"E\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\5H%\2\u0138\u013a\5J&\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013aG\3\2\2\2\u013b\u013c\7\32\2\2"+
		"\u013c\u013d\5L\'\2\u013dI\3\2\2\2\u013e\u0140\7\33\2\2\u013f\u0141\7"+
		"(\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\5n8\2\u0143\u0145\7)\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\u0147\5L\'\2\u0147K\3\2\2\2\u0148\u0149\5"+
		"`\61\2\u0149M\3\2\2\2\u014a\u014c\7\n\2\2\u014b\u014d\5n8\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7(\2\2\u014f"+
		"\u0151\5P)\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152\u0158\7)\2\2\u0153\u0156\7\34\2\2\u0154\u0157\5p9\2\u0155\u0157"+
		"\7\60\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0159\3\2\2\2"+
		"\u0158\u0153\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015d"+
		"\5R*\2\u015b\u015d\7\36\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"O\3\2\2\2\u015e\u015f\7.\2\2\u015f\u0162\7\60\2\2\u0160\u0161\7#\2\2\u0161"+
		"\u0163\5P)\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163Q\3\2\2\2\u0164"+
		"\u0165\5d\63\2\u0165S\3\2\2\2\u0166\u0167\7\20\2\2\u0167\u016a\5n8\2\u0168"+
		"\u0169\7\22\2\2\u0169\u016b\5p9\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5V,\2\u016dU\3\2\2\2\u016e\u016f"+
		"\5d\63\2\u016fW\3\2\2\2\u0170\u0171\7\21\2\2\u0171\u0174\5n8\2\u0172\u0173"+
		"\7\22\2\2\u0173\u0175\5p9\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\5Z.\2\u0177Y\3\2\2\2\u0178\u0179\5d\63\2\u0179"+
		"[\3\2\2\2\u017a\u017c\7\23\2\2\u017b\u017d\5n8\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\7\22\2\2\u017f\u0181\5"+
		"p9\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0183\7\24\2\2\u0183\u0185\5r:\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5^\60\2\u0187]\3\2\2\2\u0188\u0189"+
		"\5d\63\2\u0189_\3\2\2\2\u018a\u018b\7&\2\2\u018b\u0192\7\'\2\2\u018c\u018d"+
		"\7&\2\2\u018d\u018e\5\4\3\2\u018e\u018f\7\'\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u0192\5b\62\2\u0191\u018a\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u0190\3\2"+
		"\2\2\u0192a\3\2\2\2\u0193\u0194\5\30\r\2\u0194\u0195\7\36\2\2\u0195\u019b"+
		"\3\2\2\2\u0196\u019b\5 \21\2\u0197\u019b\5\"\22\2\u0198\u019b\5\60\31"+
		"\2\u0199\u019b\5F$\2\u019a\u0193\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bc\3\2\2\2\u019c"+
		"\u019d\7&\2\2\u019d\u01a3\7\'\2\2\u019e\u019f\7&\2\2\u019f\u01a0\5\4\3"+
		"\2\u01a0\u01a1\7\'\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u019e"+
		"\3\2\2\2\u01a3e\3\2\2\2\u01a4\u01a6\7,\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5t;\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\5n8\2\u01ab\u01ad\5v<\2"+
		"\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0"+
		"\7\60\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2"+
		"\u01b1\u01b3\7*\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01b6\7+\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01dc\3\2\2\2\u01b7\u01b9\7,\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\7\62\2\2\u01bb\u01bd\7\60\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0\7*"+
		"\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1"+
		"\u01c3\7+\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01dc\3\2"+
		"\2\2\u01c4\u01c6\7,\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\7\63\2\2\u01c8\u01ca\7\60\2\2\u01c9\u01c8\3"+
		"\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01cd\7*\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\7+"+
		"\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01dc\3\2\2\2\u01d1"+
		"\u01d3\7,\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\7\64\2\2\u01d5\u01d7\7*\2\2\u01d6\u01d5\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\7+\2\2\u01d9\u01d8\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01a5\3\2\2\2\u01db"+
		"\u01b8\3\2\2\2\u01db\u01c5\3\2\2\2\u01db\u01d2\3\2\2\2\u01dc\u01f8\3\2"+
		"\2\2\u01dd\u01df\7,\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\5\30\r\2\u01e1\u01e3\7\60\2\2\u01e2\u01e1\3"+
		"\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\7*\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\7+"+
		"\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f8\3\2\2\2\u01ea"+
		"\u01ec\7,\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ef\5h\65\2\u01ee\u01f0\7\60\2\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\7*\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6\7+\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01db\3\2"+
		"\2\2\u01f7\u01de\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f8g\3\2\2\2\u01f9\u01fa"+
		"\7(\2\2\u01fa\u01fb\5j\66\2\u01fb\u01fc\7)\2\2\u01fci\3\2\2\2\u01fd\u0201"+
		"\5f\64\2\u01fe\u0200\5j\66\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202k\3\2\2\2\u0203\u0201\3\2\2\2"+
		"\u0204\u0208\5f\64\2\u0205\u0207\5l\67\2\u0206\u0205\3\2\2\2\u0207\u020a"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209m\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020c\7.\2\2\u020co\3\2\2\2\u020d\u020e\7.\2\2\u020e"+
		"q\3\2\2\2\u020f\u0210\7.\2\2\u0210s\3\2\2\2\u0211\u0212\7-\2\2\u0212u"+
		"\3\2\2\2\u0213\u0214\7-\2\2\u0214w\3\2\2\2\u0215\u0216\t\5\2\2\u0216y"+
		"\3\2\2\2F\u0082\u0091\u0099\u00a6\u00b0\u00b7\u00be\u00c4\u00cf\u00d7"+
		"\u00de\u00e7\u00ea\u00f4\u0106\u010d\u0115\u011c\u0125\u0129\u012d\u0134"+
		"\u0139\u0140\u0144\u014c\u0150\u0156\u0158\u015c\u0162\u016a\u0174\u017c"+
		"\u0180\u0184\u0191\u019a\u01a2\u01a5\u01a8\u01ac\u01af\u01b2\u01b5\u01b8"+
		"\u01bc\u01bf\u01c2\u01c5\u01c9\u01cc\u01cf\u01d2\u01d6\u01d9\u01db\u01de"+
		"\u01e2\u01e5\u01e8\u01eb\u01ef\u01f2\u01f5\u01f7\u0201\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}