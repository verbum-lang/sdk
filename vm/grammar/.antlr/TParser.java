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
		RULE_blockUse = 4, RULE_useValue = 5, RULE_useString = 6, RULE_blockVariable = 7, 
		RULE_variableItem = 8, RULE_variablePrefixModes = 9, RULE_functionCall = 10, 
		RULE_functionCallPrefix = 11, RULE_functionCallParam = 12, RULE_functionCallParamElements = 13, 
		RULE_blockRet = 14, RULE_blockConditional = 15, RULE_ifElementUnique = 16, 
		RULE_elifElements = 17, RULE_elifElementUnique = 18, RULE_elseElementUnique = 19, 
		RULE_conditionalBlockExpression = 20, RULE_conditionalBlockElements = 21, 
		RULE_blockLoop = 22, RULE_loopBlockElements = 23, RULE_loopComplete = 24, 
		RULE_loopConditional = 25, RULE_loopInfinite = 26, RULE_endOne = 27, RULE_endTwo = 28, 
		RULE_loopOneMembers = 29, RULE_loopTwoMembers = 30, RULE_loopThreeMembers = 31, 
		RULE_loopThreeMembersValues = 32, RULE_blockBreak = 33, RULE_blockNext = 34, 
		RULE_blockTryCatch = 35, RULE_tryUniqueElement = 36, RULE_catchUniqueElement = 37, 
		RULE_tryCatchElements = 38, RULE_blockFunction = 39, RULE_blockFunctionDeclarationAttr = 40, 
		RULE_functionParam = 41, RULE_functionAnonymousParam = 42, RULE_functionCodeBlock = 43, 
		RULE_blockInterface = 44, RULE_interfaceCodeBlock = 45, RULE_blockAbstraction = 46, 
		RULE_abstractionCodeBlock = 47, RULE_blockClass = 48, RULE_blockClassDeclarationAttr = 49, 
		RULE_classAnonymousParam = 50, RULE_classCodeBlock = 51, RULE_blockArray = 52, 
		RULE_indexArray = 53, RULE_indexArrayElements = 54, RULE_associativeArray = 55, 
		RULE_associativeArrayElements = 56, RULE_blockLambdaFunctions = 57, RULE_lambdaFnParams = 58, 
		RULE_lambdaFnCodeBlock = 59, RULE_blockClassConstructor = 60, RULE_blockFunctionCall = 61, 
		RULE_functionCallElements = 62, RULE_blockAttribution = 63, RULE_attributionElements = 64, 
		RULE_blockMultipleAssignments = 65, RULE_variableMultipleAssignmentsModes = 66, 
		RULE_blockPermissionTokens = 67, RULE_codeBlockFlowControl = 68, RULE_codeBlockFlowControlElements = 69, 
		RULE_codeBlockControl = 70, RULE_generalValue = 71, RULE_generalValueBlock = 72, 
		RULE_generalValueItems = 73, RULE_generalValueElements = 74, RULE_identifier = 75, 
		RULE_identifierB = 76, RULE_identifierC = 77, RULE_identifierD = 78, RULE_incDecOperatorsA = 79, 
		RULE_incDecOperatorsB = 80, RULE_openOpA = 81, RULE_closeOpA = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"functionCall", "functionCallPrefix", "functionCallParam", "functionCallParamElements", 
			"blockRet", "blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
			"elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
			"blockLoop", "loopBlockElements", "loopComplete", "loopConditional", 
			"loopInfinite", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "blockBreak", "blockNext", 
			"blockTryCatch", "tryUniqueElement", "catchUniqueElement", "tryCatchElements", 
			"blockFunction", "blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParam", 
			"functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
			"abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", "classAnonymousParam", 
			"classCodeBlock", "blockArray", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "blockLambdaFunctions", "lambdaFnParams", 
			"lambdaFnCodeBlock", "blockClassConstructor", "blockFunctionCall", "functionCallElements", 
			"blockAttribution", "attributionElements", "blockMultipleAssignments", 
			"variableMultipleAssignmentsModes", "blockPermissionTokens", "codeBlockFlowControl", 
			"codeBlockFlowControlElements", "codeBlockControl", "generalValue", "generalValueBlock", 
			"generalValueItems", "generalValueElements", "identifier", "identifierB", 
			"identifierC", "identifierD", "incDecOperatorsA", "incDecOperatorsB", 
			"openOpA", "closeOpA"
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
			setState(166);
			sentences();
			setState(167);
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				statements();
				setState(171);
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
		public BlockBreakContext blockBreak() {
			return getRuleContext(BlockBreakContext.class,0);
		}
		public BlockNextContext blockNext() {
			return getRuleContext(BlockNextContext.class,0);
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
		public BlockFunctionCallContext blockFunctionCall() {
			return getRuleContext(BlockFunctionCallContext.class,0);
		}
		public BlockClassConstructorContext blockClassConstructor() {
			return getRuleContext(BlockClassConstructorContext.class,0);
		}
		public BlockAttributionContext blockAttribution() {
			return getRuleContext(BlockAttributionContext.class,0);
		}
		public BlockMultipleAssignmentsContext blockMultipleAssignments() {
			return getRuleContext(BlockMultipleAssignmentsContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public BlockPermissionTokensContext blockPermissionTokens() {
			return getRuleContext(BlockPermissionTokensContext.class,0);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				blockFunctionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(189);
				blockClassConstructor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(190);
				blockAttribution();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(191);
				blockMultipleAssignments();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(192);
				blockCode();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(193);
				blockPermissionTokens();
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(196);
				match(OpenBlock);
				setState(197);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(198);
				match(OpenBlock);
				setState(199);
				sentences();
				setState(200);
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
		enterRule(_localctx, 8, RULE_blockUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Use);
			setState(205);
			useValue();
			setState(206);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				useString();
				setState(210);
				match(Separator);
				setState(211);
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
			setState(215);
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
		enterRule(_localctx, 14, RULE_blockVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(Var);
			setState(218);
			variableItem();
			setState(219);
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
		enterRule(_localctx, 16, RULE_variableItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			variablePrefixModes();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(222);
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

			setState(225);
			generalValueElements();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(Separator);
					setState(227);
					variableItem();
					}
					} 
				}
				setState(232);
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
		enterRule(_localctx, 18, RULE_variablePrefixModes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(233);
				identifier();
				}
				break;
			case 2:
				{
				setState(234);
				identifier();
				setState(235);
				match(TypeSpec);
				}
				break;
			}
			setState(239);
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
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			functionCallPrefix();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(242);
				identifier();
				}
			}

			setState(245);
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
		enterRule(_localctx, 22, RULE_functionCallPrefix);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				identifier();
				setState(249);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				identifier();
				setState(252);
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
		enterRule(_localctx, 24, RULE_functionCallParam);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(OpenOp);
				setState(257);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(OpenOp);
				setState(259);
				functionCallParamElements();
				setState(260);
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
		enterRule(_localctx, 26, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			generalValue();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(Separator);
					setState(266);
					functionCallParamElements();
					}
					} 
				}
				setState(271);
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
		enterRule(_localctx, 28, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Ret);
			setState(273);
			generalValueElements();
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
		enterRule(_localctx, 30, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			ifElementUnique();
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(277);
				elifElements();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(280);
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
		enterRule(_localctx, 32, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(If);
			setState(284);
			conditionalBlockExpression();
			setState(285);
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
		enterRule(_localctx, 34, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			elifElementUnique();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					elifElements();
					}
					} 
				}
				setState(293);
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
		enterRule(_localctx, 36, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Elif);
			setState(295);
			conditionalBlockExpression();
			setState(296);
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
		enterRule(_localctx, 38, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Else);
			setState(299);
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
		enterRule(_localctx, 40, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 42, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 44, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(For);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(306);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(307);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(308);
				loopComplete();
				}
				break;
			}
			setState(311);
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
		enterRule(_localctx, 46, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 48, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(315);
				match(OpenOp);
				}
			}

			setState(318);
			loopOneMembers();
			setState(319);
			endOne();
			setState(320);
			loopTwoMembers();
			setState(321);
			endTwo();
			setState(322);
			loopThreeMembers();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(323);
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
		enterRule(_localctx, 50, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		enterRule(_localctx, 52, RULE_loopInfinite);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(OpenOp);
				setState(329);
				match(CloseOp);
				}
				break;
			case If:
			case For:
			case Ret:
			case Break:
			case Next:
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
		enterRule(_localctx, 54, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 56, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 58, RULE_loopOneMembers);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(Var);
				setState(338);
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
		enterRule(_localctx, 60, RULE_loopTwoMembers);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
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
		enterRule(_localctx, 62, RULE_loopThreeMembers);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
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
		enterRule(_localctx, 64, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			generalValueElements();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(351);
				match(Separator);
				setState(352);
				generalValueElements();
				}
				}
				setState(357);
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

	public static class BlockBreakContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBreak; }
	}

	public final BlockBreakContext blockBreak() throws RecognitionException {
		BlockBreakContext _localctx = new BlockBreakContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Break);
			setState(359);
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

	public static class BlockNextContext extends ParserRuleContext {
		public TerminalNode Next() { return getToken(TParser.Next, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNext; }
	}

	public final BlockNextContext blockNext() throws RecognitionException {
		BlockNextContext _localctx = new BlockNextContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Next);
			setState(362);
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
		enterRule(_localctx, 70, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			tryUniqueElement();
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(365);
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
		enterRule(_localctx, 72, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Try);
			setState(369);
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
		enterRule(_localctx, 74, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(Catch);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(372);
				match(OpenOp);
				}
			}

			setState(375);
			identifier();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(376);
				match(CloseOp);
				}
			}

			setState(379);
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
		enterRule(_localctx, 76, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
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
		public FunctionAnonymousParamContext functionAnonymousParam() {
			return getRuleContext(FunctionAnonymousParamContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_blockFunction);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(OpenOp);
				setState(384);
				match(Function);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(385);
					identifier();
					}
				}

				setState(388);
				match(OpenOp);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(389);
					functionParam();
					}
				}

				setState(392);
				match(CloseOp);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(393);
					match(ArrowRight);
					setState(396);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(394);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(395);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(400);
				functionCodeBlock();
				setState(401);
				match(CloseOp);
				setState(402);
				match(OpenOp);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(403);
					functionAnonymousParam();
					}
				}

				setState(406);
				match(CloseOp);
				setState(407);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(Function);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(410);
					identifier();
					}
				}

				setState(413);
				match(OpenOp);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(414);
					functionParam();
					}
				}

				setState(417);
				match(CloseOp);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(418);
					match(ArrowRight);
					setState(421);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(419);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(420);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(425);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(426);
					match(End);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class BlockFunctionDeclarationAttrContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionAnonymousParamContext functionAnonymousParam() {
			return getRuleContext(FunctionAnonymousParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockFunctionDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionDeclarationAttr; }
	}

	public final BlockFunctionDeclarationAttrContext blockFunctionDeclarationAttr() throws RecognitionException {
		BlockFunctionDeclarationAttrContext _localctx = new BlockFunctionDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(OpenOp);
				setState(432);
				match(Function);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(433);
					identifier();
					}
				}

				setState(436);
				match(OpenOp);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(437);
					functionParam();
					}
				}

				setState(440);
				match(CloseOp);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(441);
					match(ArrowRight);
					setState(444);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(442);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(443);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(448);
				functionCodeBlock();
				setState(449);
				match(CloseOp);
				setState(450);
				match(OpenOp);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(451);
					functionAnonymousParam();
					}
				}

				setState(454);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(Function);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(457);
					identifier();
					}
				}

				setState(460);
				match(OpenOp);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(461);
					functionParam();
					}
				}

				setState(464);
				match(CloseOp);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(465);
					match(ArrowRight);
					setState(468);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(466);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(467);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(472);
				functionCodeBlock();
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
		enterRule(_localctx, 82, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(Identifier);
			setState(476);
			match(TypeSpec);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(477);
				match(Separator);
				setState(478);
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

	public static class FunctionAnonymousParamContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public FunctionAnonymousParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonymousParam; }
	}

	public final FunctionAnonymousParamContext functionAnonymousParam() throws RecognitionException {
		FunctionAnonymousParamContext _localctx = new FunctionAnonymousParamContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
		enterRule(_localctx, 86, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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
		enterRule(_localctx, 88, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(Interface);
			setState(486);
			identifier();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(487);
				match(Extends);
				setState(488);
				identifierB();
				}
			}

			setState(491);
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
		enterRule(_localctx, 90, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		enterRule(_localctx, 92, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(Abstract);
			setState(496);
			identifier();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(497);
				match(Extends);
				setState(498);
				identifierB();
				}
			}

			setState(501);
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
		enterRule(_localctx, 94, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
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
		public IdentifierDContext identifierD() {
			return getRuleContext(IdentifierDContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public BlockClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClass; }
	}

	public final BlockClassContext blockClass() throws RecognitionException {
		BlockClassContext _localctx = new BlockClassContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockClass);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				openOpA();
				setState(506);
				match(New);
				setState(507);
				match(Class);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(508);
					identifier();
					}
				}

				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(511);
					match(Extends);
					setState(512);
					identifierB();
					}
				}

				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(515);
					match(Implements);
					setState(516);
					identifierC();
					}
				}

				setState(519);
				classCodeBlock();
				setState(520);
				closeOpA();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(521);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(522);
					identifierD();
					setState(523);
					match(OpenOp);
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(524);
						generalValueElements();
						}
					}

					setState(527);
					match(CloseOp);
					}
				}

				setState(531);
				match(End);
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(Class);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(534);
					identifier();
					}
				}

				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(537);
					match(Extends);
					setState(538);
					identifierB();
					}
				}

				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(541);
					match(Implements);
					setState(542);
					identifierC();
					}
				}

				setState(545);
				classCodeBlock();
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

	public static class BlockClassDeclarationAttrContext extends ParserRuleContext {
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
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
		public IdentifierDContext identifierD() {
			return getRuleContext(IdentifierDContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public BlockClassDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassDeclarationAttr; }
	}

	public final BlockClassDeclarationAttrContext blockClassDeclarationAttr() throws RecognitionException {
		BlockClassDeclarationAttrContext _localctx = new BlockClassDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				openOpA();
				setState(549);
				match(New);
				setState(550);
				match(Class);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(551);
					identifier();
					}
				}

				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(554);
					match(Extends);
					setState(555);
					identifierB();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(558);
					match(Implements);
					setState(559);
					identifierC();
					}
				}

				setState(562);
				classCodeBlock();
				setState(563);
				closeOpA();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(565);
					identifierD();
					setState(566);
					match(OpenOp);
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(567);
						generalValueElements();
						}
					}

					setState(570);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(Class);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(575);
					identifier();
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(578);
					match(Extends);
					setState(579);
					identifierB();
					}
				}

				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(582);
					match(Implements);
					setState(583);
					identifierC();
					}
				}

				setState(586);
				classCodeBlock();
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

	public static class ClassAnonymousParamContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ClassAnonymousParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAnonymousParam; }
	}

	public final ClassAnonymousParamContext classAnonymousParam() throws RecognitionException {
		ClassAnonymousParamContext _localctx = new ClassAnonymousParamContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 102, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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

	public static class BlockArrayContext extends ParserRuleContext {
		public IndexArrayContext indexArray() {
			return getRuleContext(IndexArrayContext.class,0);
		}
		public AssociativeArrayContext associativeArray() {
			return getRuleContext(AssociativeArrayContext.class,0);
		}
		public BlockArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockArray; }
	}

	public final BlockArrayContext blockArray() throws RecognitionException {
		BlockArrayContext _localctx = new BlockArrayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(593);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(594);
				associativeArray();
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

	public static class IndexArrayContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public IndexArrayElementsContext indexArrayElements() {
			return getRuleContext(IndexArrayElementsContext.class,0);
		}
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public IndexArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArray; }
	}

	public final IndexArrayContext indexArray() throws RecognitionException {
		IndexArrayContext _localctx = new IndexArrayContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(OpenArIndex);
			setState(598);
			indexArrayElements();
			setState(599);
			match(CloseArIndex);
			}
		}
		catch (RecognitionException re) {
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
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<IndexArrayElementsContext> indexArrayElements() {
			return getRuleContexts(IndexArrayElementsContext.class);
		}
		public IndexArrayElementsContext indexArrayElements(int i) {
			return getRuleContext(IndexArrayElementsContext.class,i);
		}
		public IndexArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArrayElements; }
	}

	public final IndexArrayElementsContext indexArrayElements() throws RecognitionException {
		IndexArrayElementsContext _localctx = new IndexArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			generalValueElements();
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					match(Separator);
					setState(603);
					indexArrayElements();
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class AssociativeArrayContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public AssociativeArrayElementsContext associativeArrayElements() {
			return getRuleContext(AssociativeArrayElementsContext.class,0);
		}
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public AssociativeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArray; }
	}

	public final AssociativeArrayContext associativeArray() throws RecognitionException {
		AssociativeArrayContext _localctx = new AssociativeArrayContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(OpenBlock);
			setState(610);
			associativeArrayElements();
			setState(611);
			match(CloseBlock);
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<AssociativeArrayElementsContext> associativeArrayElements() {
			return getRuleContexts(AssociativeArrayElementsContext.class);
		}
		public AssociativeArrayElementsContext associativeArrayElements(int i) {
			return getRuleContext(AssociativeArrayElementsContext.class,i);
		}
		public AssociativeArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArrayElements; }
	}

	public final AssociativeArrayElementsContext associativeArrayElements() throws RecognitionException {
		AssociativeArrayElementsContext _localctx = new AssociativeArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			identifier();
			setState(614);
			match(TwoPoint);
			setState(615);
			generalValueElements();
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(616);
					match(Separator);
					setState(617);
					associativeArrayElements();
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class BlockLambdaFunctionsContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public LambdaFnCodeBlockContext lambdaFnCodeBlock() {
			return getRuleContext(LambdaFnCodeBlockContext.class,0);
		}
		public LambdaFnParamsContext lambdaFnParams() {
			return getRuleContext(LambdaFnParamsContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockLambdaFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLambdaFunctions; }
	}

	public final BlockLambdaFunctionsContext blockLambdaFunctions() throws RecognitionException {
		BlockLambdaFunctionsContext _localctx = new BlockLambdaFunctionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(OpenOp);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(624);
				lambdaFnParams();
				}
			}

			setState(627);
			match(CloseOp);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(628);
				match(ArrowRight);
				setState(631);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(629);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(630);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(635);
			match(ARightLB);
			setState(636);
			lambdaFnCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFnParamsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<LambdaFnParamsContext> lambdaFnParams() {
			return getRuleContexts(LambdaFnParamsContext.class);
		}
		public LambdaFnParamsContext lambdaFnParams(int i) {
			return getRuleContext(LambdaFnParamsContext.class,i);
		}
		public LambdaFnParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParams; }
	}

	public final LambdaFnParamsContext lambdaFnParams() throws RecognitionException {
		LambdaFnParamsContext _localctx = new LambdaFnParamsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			identifier();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(639);
				match(TypeSpec);
				}
			}

			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(Separator);
					setState(643);
					lambdaFnParams();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LambdaFnCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public LambdaFnCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlock; }
	}

	public final LambdaFnCodeBlockContext lambdaFnCodeBlock() throws RecognitionException {
		LambdaFnCodeBlockContext _localctx = new LambdaFnCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lambdaFnCodeBlock);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				generalValueElements();
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

	public static class BlockClassConstructorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public BlockClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassConstructor; }
	}

	public final BlockClassConstructorContext blockClassConstructor() throws RecognitionException {
		BlockClassConstructorContext _localctx = new BlockClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			identifier();
			setState(654);
			match(OpenOp);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(655);
				functionParam();
				}
			}

			setState(658);
			match(CloseOp);
			setState(659);
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

	public static class BlockFunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionCall; }
	}

	public final BlockFunctionCallContext blockFunctionCall() throws RecognitionException {
		BlockFunctionCallContext _localctx = new BlockFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			identifier();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(663);
				identifierB();
				}
			}

			setState(666);
			match(OpenOp);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(667);
				functionCallElements();
				}
			}

			setState(670);
			match(CloseOp);
			setState(671);
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

	public static class FunctionCallElementsContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<FunctionCallElementsContext> functionCallElements() {
			return getRuleContexts(FunctionCallElementsContext.class);
		}
		public FunctionCallElementsContext functionCallElements(int i) {
			return getRuleContext(FunctionCallElementsContext.class,i);
		}
		public FunctionCallElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallElements; }
	}

	public final FunctionCallElementsContext functionCallElements() throws RecognitionException {
		FunctionCallElementsContext _localctx = new FunctionCallElementsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			generalValueElements();
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(674);
					match(Separator);
					setState(675);
					functionCallElements();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class BlockAttributionContext extends ParserRuleContext {
		public AttributionElementsContext attributionElements() {
			return getRuleContext(AttributionElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockAttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAttribution; }
	}

	public final BlockAttributionContext blockAttribution() throws RecognitionException {
		BlockAttributionContext _localctx = new BlockAttributionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockAttribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			attributionElements();
			setState(682);
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

	public static class AttributionElementsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<AttributionElementsContext> attributionElements() {
			return getRuleContexts(AttributionElementsContext.class);
		}
		public AttributionElementsContext attributionElements(int i) {
			return getRuleContext(AttributionElementsContext.class,i);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Await() { return getToken(TParser.Await, 0); }
		public AttributionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionElements; }
	}

	public final AttributionElementsContext attributionElements() throws RecognitionException {
		AttributionElementsContext _localctx = new AttributionElementsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attributionElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			identifier();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(686);
				identifierB();
				}
			}

			setState(689);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(690);
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

			setState(693);
			generalValueElements();
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					match(Separator);
					setState(695);
					attributionElements();
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class BlockMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockMultipleAssignments; }
	}

	public final BlockMultipleAssignmentsContext blockMultipleAssignments() throws RecognitionException {
		BlockMultipleAssignmentsContext _localctx = new BlockMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockMultipleAssignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			variableMultipleAssignmentsModes();
			setState(702);
			match(Attr);
			setState(703);
			generalValueElements();
			setState(704);
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

	public static class VariableMultipleAssignmentsModesContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<TerminalNode> Attr() { return getTokens(TParser.Attr); }
		public TerminalNode Attr(int i) {
			return getToken(TParser.Attr, i);
		}
		public List<VariableMultipleAssignmentsModesContext> variableMultipleAssignmentsModes() {
			return getRuleContexts(VariableMultipleAssignmentsModesContext.class);
		}
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes(int i) {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,i);
		}
		public VariableMultipleAssignmentsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsModes; }
	}

	public final VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() throws RecognitionException {
		VariableMultipleAssignmentsModesContext _localctx = new VariableMultipleAssignmentsModesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_variableMultipleAssignmentsModes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			generalValue();
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					match(Attr);
					setState(708);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class BlockPermissionTokensContext extends ParserRuleContext {
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
		public BlockPermissionTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockPermissionTokens; }
	}

	public final BlockPermissionTokensContext blockPermissionTokens() throws RecognitionException {
		BlockPermissionTokensContext _localctx = new BlockPermissionTokensContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockPermissionTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
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
		enterRule(_localctx, 136, RULE_codeBlockFlowControl);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(OpenBlock);
				setState(717);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				match(OpenBlock);
				setState(719);
				sentences();
				setState(720);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
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
		public BlockBreakContext blockBreak() {
			return getRuleContext(BlockBreakContext.class,0);
		}
		public BlockNextContext blockNext() {
			return getRuleContext(BlockNextContext.class,0);
		}
		public CodeBlockFlowControlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockFlowControlElements; }
	}

	public final CodeBlockFlowControlElementsContext codeBlockFlowControlElements() throws RecognitionException {
		CodeBlockFlowControlElementsContext _localctx = new CodeBlockFlowControlElementsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_codeBlockFlowControlElements);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				functionCall();
				setState(726);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(730);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(731);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(732);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(733);
				blockNext();
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
		enterRule(_localctx, 140, RULE_codeBlockControl);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(OpenBlock);
				setState(737);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(OpenBlock);
				setState(739);
				sentences();
				setState(740);
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
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public BlockFunctionContext blockFunction() {
			return getRuleContext(BlockFunctionContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public BlockArrayContext blockArray() {
			return getRuleContext(BlockArrayContext.class,0);
		}
		public BlockFunctionDeclarationAttrContext blockFunctionDeclarationAttr() {
			return getRuleContext(BlockFunctionDeclarationAttrContext.class,0);
		}
		public BlockClassDeclarationAttrContext blockClassDeclarationAttr() {
			return getRuleContext(BlockClassDeclarationAttrContext.class,0);
		}
		public BlockLambdaFunctionsContext blockLambdaFunctions() {
			return getRuleContext(BlockLambdaFunctionsContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
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
		enterRule(_localctx, 142, RULE_generalValue);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(744);
					match(Not);
					}
				}

				setState(747);
				identifier();
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(749);
				identifierB();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(750);
					match(TypeSpec);
					}
				}

				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(753);
					match(ArithmeticOperator);
					}
				}

				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(756);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(759);
						match(Not);
						}
					}

					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(762);
						incDecOperatorsA();
						}
					}

					setState(765);
					identifier();
					setState(767);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(766);
						incDecOperatorsB();
						}
						break;
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(769);
						match(TypeSpec);
						}
					}

					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(772);
						match(ArithmeticOperator);
						}
					}

					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(775);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 2:
					{
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(778);
						match(Not);
						}
					}

					setState(781);
					match(Integer);
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(782);
						match(TypeSpec);
						}
					}

					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(785);
						match(ArithmeticOperator);
						}
					}

					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(788);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 3:
					{
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(791);
						match(Not);
						}
					}

					setState(794);
					match(Float);
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(795);
						match(TypeSpec);
						}
					}

					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(798);
						match(ArithmeticOperator);
						}
					}

					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(801);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 4:
					{
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(804);
						match(Not);
						}
					}

					setState(807);
					match(String);
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(808);
						match(TypeSpec);
						}
					}

					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(811);
						match(ArithmeticOperator);
						}
					}

					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(814);
						match(AssignmentOperator);
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(819);
					match(Not);
					}
				}

				setState(822);
				functionCall();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(823);
					match(TypeSpec);
					}
				}

				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(826);
					match(ArithmeticOperator);
					}
				}

				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(829);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(832);
					match(Not);
					}
				}

				setState(835);
				match(OpenOp);
				setState(836);
				blockFunction();
				setState(837);
				match(CloseOp);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(838);
					match(TypeSpec);
					}
				}

				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(841);
					match(ArithmeticOperator);
					}
				}

				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(844);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(847);
					match(Not);
					}
				}

				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(850);
					incDecOperatorsA();
					}
				}

				setState(853);
				blockArray();
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(854);
					incDecOperatorsB();
					}
					break;
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(857);
					match(TypeSpec);
					}
				}

				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(860);
					match(ArithmeticOperator);
					}
				}

				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(863);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				blockFunctionDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				blockClassDeclarationAttr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(868);
				blockLambdaFunctions();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(873);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(869);
					match(OpenBlock);
					setState(870);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(871);
					match(OpenArIndex);
					setState(872);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(875);
					match(Not);
					}
				}

				setState(878);
				generalValueBlock();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(879);
					match(TypeSpec);
					}
				}

				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(882);
					match(ArithmeticOperator);
					}
				}

				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(885);
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
		enterRule(_localctx, 144, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(OpenOp);
			setState(891);
			generalValueItems();
			setState(892);
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
		enterRule(_localctx, 146, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			generalValue();
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					generalValueItems();
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		enterRule(_localctx, 148, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			generalValue();
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(902);
					generalValueElements();
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		enterRule(_localctx, 150, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
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
		enterRule(_localctx, 152, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
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
		enterRule(_localctx, 154, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
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

	public static class IdentifierDContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierD; }
	}

	public final IdentifierDContext identifierD() throws RecognitionException {
		IdentifierDContext _localctx = new IdentifierDContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
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
		enterRule(_localctx, 158, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
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
		enterRule(_localctx, 160, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
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

	public static class OpenOpAContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public OpenOpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openOpA; }
	}

	public final OpenOpAContext openOpA() throws RecognitionException {
		OpenOpAContext _localctx = new OpenOpAContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(OpenOp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseOpAContext extends ParserRuleContext {
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CloseOpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeOpA; }
	}

	public final CloseOpAContext closeOpA() throws RecognitionException {
		CloseOpAContext _localctx = new CloseOpAContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u039f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00b1\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c5\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00cd\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00d8\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00e2\n\n\3\n\3\n\3\n\7"+
		"\n\u00e7\n\n\f\n\16\n\u00ea\13\n\3\13\3\13\3\13\3\13\5\13\u00f0\n\13\3"+
		"\13\3\13\3\f\3\f\5\f\u00f6\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0101\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0109\n\16\3\17\3\17\3\17"+
		"\7\17\u010e\n\17\f\17\16\17\u0111\13\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\5\21\u0119\n\21\3\21\5\21\u011c\n\21\3\22\3\22\3\22\3\22\3\23\3\23\7"+
		"\23\u0124\n\23\f\23\16\23\u0127\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0138\n\30\3\30\3\30"+
		"\3\31\3\31\3\32\5\32\u013f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0147"+
		"\n\32\3\33\3\33\3\34\3\34\3\34\5\34\u014e\n\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u0157\n\37\3 \3 \5 \u015b\n \3!\3!\5!\u015f\n!\3\"\3\""+
		"\3\"\7\"\u0164\n\"\f\"\16\"\u0167\13\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u0171"+
		"\n%\3&\3&\3&\3\'\3\'\5\'\u0178\n\'\3\'\3\'\5\'\u017c\n\'\3\'\3\'\3(\3"+
		"(\3)\3)\3)\5)\u0185\n)\3)\3)\5)\u0189\n)\3)\3)\3)\3)\5)\u018f\n)\5)\u0191"+
		"\n)\3)\3)\3)\3)\5)\u0197\n)\3)\3)\3)\3)\3)\5)\u019e\n)\3)\3)\5)\u01a2"+
		"\n)\3)\3)\3)\3)\5)\u01a8\n)\5)\u01aa\n)\3)\3)\5)\u01ae\n)\5)\u01b0\n)"+
		"\3*\3*\3*\5*\u01b5\n*\3*\3*\5*\u01b9\n*\3*\3*\3*\3*\5*\u01bf\n*\5*\u01c1"+
		"\n*\3*\3*\3*\3*\5*\u01c7\n*\3*\3*\3*\3*\5*\u01cd\n*\3*\3*\5*\u01d1\n*"+
		"\3*\3*\3*\3*\5*\u01d7\n*\5*\u01d9\n*\3*\5*\u01dc\n*\3+\3+\3+\3+\5+\u01e2"+
		"\n+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u01ec\n.\3.\3.\3/\3/\3\60\3\60\3\60\3\60"+
		"\5\60\u01f6\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u0200\n"+
		"\62\3\62\3\62\5\62\u0204\n\62\3\62\3\62\5\62\u0208\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0210\n\62\3\62\3\62\5\62\u0214\n\62\3\62\3\62\3"+
		"\62\3\62\5\62\u021a\n\62\3\62\3\62\5\62\u021e\n\62\3\62\3\62\5\62\u0222"+
		"\n\62\3\62\5\62\u0225\n\62\3\63\3\63\3\63\3\63\5\63\u022b\n\63\3\63\3"+
		"\63\5\63\u022f\n\63\3\63\3\63\5\63\u0233\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u023b\n\63\3\63\3\63\5\63\u023f\n\63\3\63\3\63\5\63\u0243\n"+
		"\63\3\63\3\63\5\63\u0247\n\63\3\63\3\63\5\63\u024b\n\63\3\63\5\63\u024e"+
		"\n\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0256\n\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\78\u025f\n8\f8\168\u0262\138\39\39\39\39\3:\3:\3:\3:\3:\7:\u026d"+
		"\n:\f:\16:\u0270\13:\3;\3;\5;\u0274\n;\3;\3;\3;\3;\5;\u027a\n;\5;\u027c"+
		"\n;\3;\3;\3;\3<\3<\5<\u0283\n<\3<\3<\7<\u0287\n<\f<\16<\u028a\13<\3=\3"+
		"=\5=\u028e\n=\3>\3>\3>\5>\u0293\n>\3>\3>\3>\3?\3?\3?\5?\u029b\n?\3?\3"+
		"?\5?\u029f\n?\3?\3?\3?\3@\3@\3@\7@\u02a7\n@\f@\16@\u02aa\13@\3A\3A\3A"+
		"\3B\3B\3B\5B\u02b2\nB\3B\3B\5B\u02b6\nB\3B\3B\3B\7B\u02bb\nB\fB\16B\u02be"+
		"\13B\3C\3C\3C\3C\3C\3D\3D\3D\7D\u02c8\nD\fD\16D\u02cb\13D\3E\3E\3F\3F"+
		"\3F\3F\3F\3F\3F\5F\u02d6\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u02e1\nG\3H"+
		"\3H\3H\3H\3H\3H\5H\u02e9\nH\3I\5I\u02ec\nI\3I\3I\3I\3I\5I\u02f2\nI\3I"+
		"\5I\u02f5\nI\3I\5I\u02f8\nI\3I\5I\u02fb\nI\3I\5I\u02fe\nI\3I\3I\5I\u0302"+
		"\nI\3I\5I\u0305\nI\3I\5I\u0308\nI\3I\5I\u030b\nI\3I\5I\u030e\nI\3I\3I"+
		"\5I\u0312\nI\3I\5I\u0315\nI\3I\5I\u0318\nI\3I\5I\u031b\nI\3I\3I\5I\u031f"+
		"\nI\3I\5I\u0322\nI\3I\5I\u0325\nI\3I\5I\u0328\nI\3I\3I\5I\u032c\nI\3I"+
		"\5I\u032f\nI\3I\5I\u0332\nI\5I\u0334\nI\3I\5I\u0337\nI\3I\3I\5I\u033b"+
		"\nI\3I\5I\u033e\nI\3I\5I\u0341\nI\3I\5I\u0344\nI\3I\3I\3I\3I\5I\u034a"+
		"\nI\3I\5I\u034d\nI\3I\5I\u0350\nI\3I\5I\u0353\nI\3I\5I\u0356\nI\3I\3I"+
		"\5I\u035a\nI\3I\5I\u035d\nI\3I\5I\u0360\nI\3I\5I\u0363\nI\3I\3I\3I\3I"+
		"\3I\3I\3I\5I\u036c\nI\3I\5I\u036f\nI\3I\3I\5I\u0373\nI\3I\5I\u0376\nI"+
		"\3I\5I\u0379\nI\5I\u037b\nI\3J\3J\3J\3J\3K\3K\7K\u0383\nK\fK\16K\u0386"+
		"\13K\3L\3L\7L\u038a\nL\fL\16L\u038d\13L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q"+
		"\3R\3R\3S\3S\3T\3T\3T\2\2U\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\2\6\4\2\25\25\31\31\4\2\37\37++\4\2  \""+
		"\"\4\2\13\17\30\30\2\u03f2\2\u00a8\3\2\2\2\4\u00b0\3\2\2\2\6\u00c4\3\2"+
		"\2\2\b\u00cc\3\2\2\2\n\u00ce\3\2\2\2\f\u00d7\3\2\2\2\16\u00d9\3\2\2\2"+
		"\20\u00db\3\2\2\2\22\u00df\3\2\2\2\24\u00ef\3\2\2\2\26\u00f3\3\2\2\2\30"+
		"\u0100\3\2\2\2\32\u0108\3\2\2\2\34\u010a\3\2\2\2\36\u0112\3\2\2\2 \u0116"+
		"\3\2\2\2\"\u011d\3\2\2\2$\u0121\3\2\2\2&\u0128\3\2\2\2(\u012c\3\2\2\2"+
		"*\u012f\3\2\2\2,\u0131\3\2\2\2.\u0133\3\2\2\2\60\u013b\3\2\2\2\62\u013e"+
		"\3\2\2\2\64\u0148\3\2\2\2\66\u014d\3\2\2\28\u014f\3\2\2\2:\u0151\3\2\2"+
		"\2<\u0156\3\2\2\2>\u015a\3\2\2\2@\u015e\3\2\2\2B\u0160\3\2\2\2D\u0168"+
		"\3\2\2\2F\u016b\3\2\2\2H\u016e\3\2\2\2J\u0172\3\2\2\2L\u0175\3\2\2\2N"+
		"\u017f\3\2\2\2P\u01af\3\2\2\2R\u01db\3\2\2\2T\u01dd\3\2\2\2V\u01e3\3\2"+
		"\2\2X\u01e5\3\2\2\2Z\u01e7\3\2\2\2\\\u01ef\3\2\2\2^\u01f1\3\2\2\2`\u01f9"+
		"\3\2\2\2b\u0224\3\2\2\2d\u024d\3\2\2\2f\u024f\3\2\2\2h\u0251\3\2\2\2j"+
		"\u0255\3\2\2\2l\u0257\3\2\2\2n\u025b\3\2\2\2p\u0263\3\2\2\2r\u0267\3\2"+
		"\2\2t\u0271\3\2\2\2v\u0280\3\2\2\2x\u028d\3\2\2\2z\u028f\3\2\2\2|\u0297"+
		"\3\2\2\2~\u02a3\3\2\2\2\u0080\u02ab\3\2\2\2\u0082\u02ae\3\2\2\2\u0084"+
		"\u02bf\3\2\2\2\u0086\u02c4\3\2\2\2\u0088\u02cc\3\2\2\2\u008a\u02d5\3\2"+
		"\2\2\u008c\u02e0\3\2\2\2\u008e\u02e8\3\2\2\2\u0090\u037a\3\2\2\2\u0092"+
		"\u037c\3\2\2\2\u0094\u0380\3\2\2\2\u0096\u0387\3\2\2\2\u0098\u038e\3\2"+
		"\2\2\u009a\u0390\3\2\2\2\u009c\u0392\3\2\2\2\u009e\u0394\3\2\2\2\u00a0"+
		"\u0396\3\2\2\2\u00a2\u0398\3\2\2\2\u00a4\u039a\3\2\2\2\u00a6\u039c\3\2"+
		"\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\2\2\3\u00aa\3\3\2\2\2\u00ab\u00b1"+
		"\5\6\4\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\5\4\3\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\5\3\2\2\2\u00b2\u00c5\5\n\6\2\u00b3\u00c5\5\20\t\2\u00b4\u00c5"+
		"\5\36\20\2\u00b5\u00c5\5 \21\2\u00b6\u00c5\5.\30\2\u00b7\u00c5\5D#\2\u00b8"+
		"\u00c5\5F$\2\u00b9\u00c5\5H%\2\u00ba\u00c5\5P)\2\u00bb\u00c5\5Z.\2\u00bc"+
		"\u00c5\5^\60\2\u00bd\u00c5\5b\62\2\u00be\u00c5\5|?\2\u00bf\u00c5\5z>\2"+
		"\u00c0\u00c5\5\u0080A\2\u00c1\u00c5\5\u0084C\2\u00c2\u00c5\5\b\5\2\u00c3"+
		"\u00c5\5\u0088E\2\u00c4\u00b2\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00b4"+
		"\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00b7\3\2\2\2\u00c4"+
		"\u00b8\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bb\3\2"+
		"\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\7\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\u00cd"+
		"\7\'\2\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\'\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\t\3\2\2\2"+
		"\u00ce\u00cf\7\3\2\2\u00cf\u00d0\5\f\7\2\u00d0\u00d1\7\36\2\2\u00d1\13"+
		"\3\2\2\2\u00d2\u00d8\5\16\b\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\7#\2\2"+
		"\u00d5\u00d6\5\f\7\2\u00d6\u00d8\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3"+
		"\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00da\7\64\2\2\u00da\17\3\2\2\2\u00db\u00dc"+
		"\7\4\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\7\36\2\2\u00de\21\3\2\2\2\u00df"+
		"\u00e1\5\24\13\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\5\u0096L\2\u00e4\u00e5\7#\2\2\u00e5"+
		"\u00e7\5\22\n\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\23\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00f0\5\u0098M\2\u00ec\u00ed\5\u0098M\2\u00ed\u00ee\7\60\2\2\u00ee\u00f0"+
		"\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\t\3\2\2\u00f2\25\3\2\2\2\u00f3\u00f5\5\30\r\2\u00f4\u00f6\5\u0098"+
		"M\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\5\32\16\2\u00f8\27\3\2\2\2\u00f9\u0101\5\u0098M\2\u00fa\u00fb\5"+
		"\u0098M\2\u00fb\u00fc\7 \2\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\5\u0098M"+
		"\2\u00fe\u00ff\7\"\2\2\u00ff\u0101\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fa"+
		"\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\31\3\2\2\2\u0102\u0103\7(\2\2\u0103"+
		"\u0109\7)\2\2\u0104\u0105\7(\2\2\u0105\u0106\5\34\17\2\u0106\u0107\7)"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0109"+
		"\33\3\2\2\2\u010a\u010f\5\u0090I\2\u010b\u010c\7#\2\2\u010c\u010e\5\34"+
		"\17\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\35\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\t\2"+
		"\2\u0113\u0114\5\u0096L\2\u0114\u0115\7\36\2\2\u0115\37\3\2\2\2\u0116"+
		"\u0118\5\"\22\2\u0117\u0119\5$\23\2\u0118\u0117\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5(\25\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c!\3\2\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5*\26\2"+
		"\u011f\u0120\5,\27\2\u0120#\3\2\2\2\u0121\u0125\5&\24\2\u0122\u0124\5"+
		"$\23\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126%\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\6\2\2"+
		"\u0129\u012a\5*\26\2\u012a\u012b\5,\27\2\u012b\'\3\2\2\2\u012c\u012d\7"+
		"\7\2\2\u012d\u012e\5,\27\2\u012e)\3\2\2\2\u012f\u0130\5\u0096L\2\u0130"+
		"+\3\2\2\2\u0131\u0132\5\u008aF\2\u0132-\3\2\2\2\u0133\u0137\7\b\2\2\u0134"+
		"\u0138\5\66\34\2\u0135\u0138\5\64\33\2\u0136\u0138\5\62\32\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\5\60\31\2\u013a/\3\2\2\2\u013b\u013c\5\u008aF\2\u013c\61\3\2\2"+
		"\2\u013d\u013f\7(\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\5<\37\2\u0141\u0142\58\35\2\u0142\u0143\5> \2\u0143"+
		"\u0144\5:\36\2\u0144\u0146\5@!\2\u0145\u0147\7)\2\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\63\3\2\2\2\u0148\u0149\5> \2\u0149\65\3\2"+
		"\2\2\u014a\u014b\7(\2\2\u014b\u014e\7)\2\2\u014c\u014e\3\2\2\2\u014d\u014a"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e\67\3\2\2\2\u014f\u0150\7\36\2\2\u0150"+
		"9\3\2\2\2\u0151\u0152\7\36\2\2\u0152;\3\2\2\2\u0153\u0154\7\4\2\2\u0154"+
		"\u0157\5\22\n\2\u0155\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0155\3"+
		"\2\2\2\u0157=\3\2\2\2\u0158\u015b\5\u0096L\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b?\3\2\2\2\u015c\u015f\5B\"\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fA\3\2\2\2"+
		"\u0160\u0165\5\u0096L\2\u0161\u0162\7#\2\2\u0162\u0164\5\u0096L\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166C\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\26\2\2\u0169\u016a"+
		"\7\36\2\2\u016aE\3\2\2\2\u016b\u016c\7\27\2\2\u016c\u016d\7\36\2\2\u016d"+
		"G\3\2\2\2\u016e\u0170\5J&\2\u016f\u0171\5L\'\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171I\3\2\2\2\u0172\u0173\7\32\2\2\u0173\u0174\5N(\2\u0174"+
		"K\3\2\2\2\u0175\u0177\7\33\2\2\u0176\u0178\7(\2\2\u0177\u0176\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\5\u0098M\2\u017a"+
		"\u017c\7)\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\5N(\2\u017eM\3\2\2\2\u017f\u0180\5\u008aF\2\u0180O\3"+
		"\2\2\2\u0181\u0182\7(\2\2\u0182\u0184\7\n\2\2\u0183\u0185\5\u0098M\2\u0184"+
		"\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\7("+
		"\2\2\u0187\u0189\5T+\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u0190\7)\2\2\u018b\u018e\7\34\2\2\u018c\u018f\5\u009aN"+
		"\2\u018d\u018f\7\60\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\5X-\2\u0193\u0194\7)\2\2\u0194\u0196\7(\2\2\u0195\u0197"+
		"\5V,\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\7)\2\2\u0199\u019a\7\36\2\2\u019a\u01b0\3\2\2\2\u019b\u019d\7\n"+
		"\2\2\u019c\u019e\5\u0098M\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\7(\2\2\u01a0\u01a2\5T+\2\u01a1\u01a0\3\2\2"+
		"\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a9\7)\2\2\u01a4\u01a7"+
		"\7\34\2\2\u01a5\u01a8\5\u009aN\2\u01a6\u01a8\7\60\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ae\5X-\2\u01ac\u01ae\7\36"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u0181\3\2\2\2\u01af\u019b\3\2\2\2\u01b0Q\3\2\2\2\u01b1\u01b2\7(\2\2\u01b2"+
		"\u01b4\7\n\2\2\u01b3\u01b5\5\u0098M\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\7(\2\2\u01b7\u01b9\5T+\2\u01b8"+
		"\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c0\7)"+
		"\2\2\u01bb\u01be\7\34\2\2\u01bc\u01bf\5\u009aN\2\u01bd\u01bf\7\60\2\2"+
		"\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01bb"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\5X-\2\u01c3"+
		"\u01c4\7)\2\2\u01c4\u01c6\7(\2\2\u01c5\u01c7\5V,\2\u01c6\u01c5\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7)\2\2\u01c9\u01dc"+
		"\3\2\2\2\u01ca\u01cc\7\n\2\2\u01cb\u01cd\5\u0098M\2\u01cc\u01cb\3\2\2"+
		"\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\7(\2\2\u01cf\u01d1"+
		"\5T+\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d8\7)\2\2\u01d3\u01d6\7\34\2\2\u01d4\u01d7\5\u009aN\2\u01d5\u01d7"+
		"\7\60\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d9\3\2\2\2"+
		"\u01d8\u01d3\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc"+
		"\5X-\2\u01db\u01b1\3\2\2\2\u01db\u01ca\3\2\2\2\u01dcS\3\2\2\2\u01dd\u01de"+
		"\7.\2\2\u01de\u01e1\7\60\2\2\u01df\u01e0\7#\2\2\u01e0\u01e2\5T+\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2U\3\2\2\2\u01e3\u01e4\5\u0096"+
		"L\2\u01e4W\3\2\2\2\u01e5\u01e6\5\u008eH\2\u01e6Y\3\2\2\2\u01e7\u01e8\7"+
		"\20\2\2\u01e8\u01eb\5\u0098M\2\u01e9\u01ea\7\22\2\2\u01ea\u01ec\5\u009a"+
		"N\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\5\\/\2\u01ee[\3\2\2\2\u01ef\u01f0\5\u008eH\2\u01f0]\3\2\2\2\u01f1"+
		"\u01f2\7\21\2\2\u01f2\u01f5\5\u0098M\2\u01f3\u01f4\7\22\2\2\u01f4\u01f6"+
		"\5\u009aN\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2"+
		"\2\u01f7\u01f8\5`\61\2\u01f8_\3\2\2\2\u01f9\u01fa\5\u008eH\2\u01faa\3"+
		"\2\2\2\u01fb\u01fc\5\u00a4S\2\u01fc\u01fd\7\25\2\2\u01fd\u01ff\7\23\2"+
		"\2\u01fe\u0200\5\u0098M\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u0202\7\22\2\2\u0202\u0204\5\u009aN\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0206\7\24\2\2"+
		"\u0206\u0208\5\u009cO\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\5h\65\2\u020a\u0213\5\u00a6T\2\u020b\u020c"+
		"\t\4\2\2\u020c\u020d\5\u009eP\2\u020d\u020f\7(\2\2\u020e\u0210\5\u0096"+
		"L\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\7)\2\2\u0212\u0214\3\2\2\2\u0213\u020b\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7\36\2\2\u0216\u0225\3\2\2\2\u0217"+
		"\u0219\7\23\2\2\u0218\u021a\5\u0098M\2\u0219\u0218\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021c\7\22\2\2\u021c\u021e\5\u009a"+
		"N\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221\3\2\2\2\u021f"+
		"\u0220\7\24\2\2\u0220\u0222\5\u009cO\2\u0221\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\5h\65\2\u0224\u01fb\3\2\2\2\u0224"+
		"\u0217\3\2\2\2\u0225c\3\2\2\2\u0226\u0227\5\u00a4S\2\u0227\u0228\7\25"+
		"\2\2\u0228\u022a\7\23\2\2\u0229\u022b\5\u0098M\2\u022a\u0229\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022d\7\22\2\2\u022d\u022f\5"+
		"\u009aN\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2"+
		"\u0230\u0231\7\24\2\2\u0231\u0233\5\u009cO\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5h\65\2\u0235\u023e\5\u00a6"+
		"T\2\u0236\u0237\t\4\2\2\u0237\u0238\5\u009eP\2\u0238\u023a\7(\2\2\u0239"+
		"\u023b\5\u0096L\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023d\7)\2\2\u023d\u023f\3\2\2\2\u023e\u0236\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u024e\3\2\2\2\u0240\u0242\7\23\2\2\u0241\u0243\5"+
		"\u0098M\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0246\3\2\2\2"+
		"\u0244\u0245\7\22\2\2\u0245\u0247\5\u009aN\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0249\7\24\2\2\u0249\u024b\5"+
		"\u009cO\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2"+
		"\u024c\u024e\5h\65\2\u024d\u0226\3\2\2\2\u024d\u0240\3\2\2\2\u024ee\3"+
		"\2\2\2\u024f\u0250\5\u0096L\2\u0250g\3\2\2\2\u0251\u0252\5\u008eH\2\u0252"+
		"i\3\2\2\2\u0253\u0256\5l\67\2\u0254\u0256\5p9\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0256k\3\2\2\2\u0257\u0258\7$\2\2\u0258\u0259\5n8\2\u0259"+
		"\u025a\7%\2\2\u025am\3\2\2\2\u025b\u0260\5\u0096L\2\u025c\u025d\7#\2\2"+
		"\u025d\u025f\5n8\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261o\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0264\7&\2\2\u0264\u0265\5r:\2\u0265\u0266\7\'\2\2\u0266q\3\2\2\2\u0267"+
		"\u0268\5\u0098M\2\u0268\u0269\7!\2\2\u0269\u026e\5\u0096L\2\u026a\u026b"+
		"\7#\2\2\u026b\u026d\5r:\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fs\3\2\2\2\u0270\u026e\3\2\2\2"+
		"\u0271\u0273\7(\2\2\u0272\u0274\5v<\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027b\7)\2\2\u0276\u0279\7\34\2\2\u0277"+
		"\u027a\5\u0098M\2\u0278\u027a\7\60\2\2\u0279\u0277\3\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\7\35\2\2\u027e\u027f\5x=\2\u027fu\3\2\2\2\u0280"+
		"\u0282\5\u0098M\2\u0281\u0283\7\60\2\2\u0282\u0281\3\2\2\2\u0282\u0283"+
		"\3\2\2\2\u0283\u0288\3\2\2\2\u0284\u0285\7#\2\2\u0285\u0287\5v<\2\u0286"+
		"\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289w\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e\5\u008eH\2\u028c\u028e"+
		"\5\u0096L\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028ey\3\2\2\2\u028f"+
		"\u0290\5\u0098M\2\u0290\u0292\7(\2\2\u0291\u0293\5T+\2\u0292\u0291\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7)\2\2\u0295"+
		"\u0296\5\u008eH\2\u0296{\3\2\2\2\u0297\u029a\5\u0098M\2\u0298\u0299\t"+
		"\4\2\2\u0299\u029b\5\u009aN\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2"+
		"\u029b\u029c\3\2\2\2\u029c\u029e\7(\2\2\u029d\u029f\5~@\2\u029e\u029d"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7)\2\2\u02a1"+
		"\u02a2\7\36\2\2\u02a2}\3\2\2\2\u02a3\u02a8\5\u0096L\2\u02a4\u02a5\7#\2"+
		"\2\u02a5\u02a7\5~@\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\177\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"\u02ac\5\u0082B\2\u02ac\u02ad\7\36\2\2\u02ad\u0081\3\2\2\2\u02ae\u02b1"+
		"\5\u0098M\2\u02af\u02b0\t\4\2\2\u02b0\u02b2\5\u009aN\2\u02b1\u02af\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\t\3\2\2\u02b4"+
		"\u02b6\t\2\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2"+
		"\2\2\u02b7\u02bc\5\u0096L\2\u02b8\u02b9\7#\2\2\u02b9\u02bb\5\u0082B\2"+
		"\u02ba\u02b8\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bd\u0083\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\5\u0086D"+
		"\2\u02c0\u02c1\7\37\2\2\u02c1\u02c2\5\u0096L\2\u02c2\u02c3\7\36\2\2\u02c3"+
		"\u0085\3\2\2\2\u02c4\u02c9\5\u0090I\2\u02c5\u02c6\7\37\2\2\u02c6\u02c8"+
		"\5\u0086D\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2"+
		"\2\u02c9\u02ca\3\2\2\2\u02ca\u0087\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd"+
		"\t\5\2\2\u02cd\u0089\3\2\2\2\u02ce\u02cf\7&\2\2\u02cf\u02d6\7\'\2\2\u02d0"+
		"\u02d1\7&\2\2\u02d1\u02d2\5\4\3\2\u02d2\u02d3\7\'\2\2\u02d3\u02d6\3\2"+
		"\2\2\u02d4\u02d6\5\u008cG\2\u02d5\u02ce\3\2\2\2\u02d5\u02d0\3\2\2\2\u02d5"+
		"\u02d4\3\2\2\2\u02d6\u008b\3\2\2\2\u02d7\u02d8\5\26\f\2\u02d8\u02d9\7"+
		"\36\2\2\u02d9\u02e1\3\2\2\2\u02da\u02e1\5\36\20\2\u02db\u02e1\5 \21\2"+
		"\u02dc\u02e1\5.\30\2\u02dd\u02e1\5H%\2\u02de\u02e1\5D#\2\u02df\u02e1\5"+
		"F$\2\u02e0\u02d7\3\2\2\2\u02e0\u02da\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0"+
		"\u02dc\3\2\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2"+
		"\2\2\u02e1\u008d\3\2\2\2\u02e2\u02e3\7&\2\2\u02e3\u02e9\7\'\2\2\u02e4"+
		"\u02e5\7&\2\2\u02e5\u02e6\5\4\3\2\u02e6\u02e7\7\'\2\2\u02e7\u02e9\3\2"+
		"\2\2\u02e8\u02e2\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e9\u008f\3\2\2\2\u02ea"+
		"\u02ec\7,\2\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ee\5\u0098M\2\u02ee\u02ef\t\4\2\2\u02ef\u02f1\5\u009aN\2"+
		"\u02f0\u02f2\7\60\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4"+
		"\3\2\2\2\u02f3\u02f5\7*\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f8\7+\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u037b\3\2\2\2\u02f9\u02fb\7,\2\2\u02fa\u02f9\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fe\5\u00a0Q\2\u02fd\u02fc"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\5\u0098M"+
		"\2\u0300\u0302\5\u00a2R\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0305\7\60\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3"+
		"\2\2\2\u0305\u0307\3\2\2\2\u0306\u0308\7*\2\2\u0307\u0306\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u030b\7+\2\2\u030a\u0309\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u0334\3\2\2\2\u030c\u030e\7,\2\2\u030d"+
		"\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\7\62"+
		"\2\2\u0310\u0312\7\60\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0314\3\2\2\2\u0313\u0315\7*\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u0318\7+\2\2\u0317\u0316\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0334\3\2\2\2\u0319\u031b\7,\2\2\u031a\u0319\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\7\63\2\2\u031d"+
		"\u031f\7\60\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3"+
		"\2\2\2\u0320\u0322\7*\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0325\7+\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0334\3\2\2\2\u0326\u0328\7,\2\2\u0327\u0326\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7\64\2\2\u032a\u032c\7"+
		"\60\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d"+
		"\u032f\7*\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2"+
		"\2\2\u0330\u0332\7+\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0334\3\2\2\2\u0333\u02fa\3\2\2\2\u0333\u030d\3\2\2\2\u0333\u031a\3\2"+
		"\2\2\u0333\u0327\3\2\2\2\u0334\u037b\3\2\2\2\u0335\u0337\7,\2\2\u0336"+
		"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\5\26"+
		"\f\2\u0339\u033b\7\60\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033d\3\2\2\2\u033c\u033e\7*\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u0340\3\2\2\2\u033f\u0341\7+\2\2\u0340\u033f\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u037b\3\2\2\2\u0342\u0344\7,\2\2\u0343\u0342\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\7(\2\2\u0346"+
		"\u0347\5P)\2\u0347\u0349\7)\2\2\u0348\u034a\7\60\2\2\u0349\u0348\3\2\2"+
		"\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\7*\2\2\u034c\u034b"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\7+\2\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u037b\3\2\2\2\u0351\u0353\7,"+
		"\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354"+
		"\u0356\5\u00a0Q\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357"+
		"\3\2\2\2\u0357\u0359\5j\66\2\u0358\u035a\5\u00a2R\2\u0359\u0358\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\7\60\2\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0360\7*"+
		"\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361"+
		"\u0363\7+\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u037b\3\2"+
		"\2\2\u0364\u037b\5R*\2\u0365\u037b\5d\63\2\u0366\u037b\5t;\2\u0367\u0368"+
		"\7&\2\2\u0368\u036c\7\'\2\2\u0369\u036a\7$\2\2\u036a\u036c\7%\2\2\u036b"+
		"\u0367\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u037b\3\2\2\2\u036d\u036f\7,"+
		"\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\5\u0092J\2\u0371\u0373\7\60\2\2\u0372\u0371\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0376\7*\2\2\u0375\u0374\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0379\7+\2\2\u0378\u0377\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u02eb\3\2\2\2\u037a"+
		"\u0333\3\2\2\2\u037a\u0336\3\2\2\2\u037a\u0343\3\2\2\2\u037a\u0352\3\2"+
		"\2\2\u037a\u0364\3\2\2\2\u037a\u0365\3\2\2\2\u037a\u0366\3\2\2\2\u037a"+
		"\u036b\3\2\2\2\u037a\u036e\3\2\2\2\u037b\u0091\3\2\2\2\u037c\u037d\7("+
		"\2\2\u037d\u037e\5\u0094K\2\u037e\u037f\7)\2\2\u037f\u0093\3\2\2\2\u0380"+
		"\u0384\5\u0090I\2\u0381\u0383\5\u0094K\2\u0382\u0381\3\2\2\2\u0383\u0386"+
		"\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0095\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0387\u038b\5\u0090I\2\u0388\u038a\5\u0096L\2\u0389\u0388"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u0097\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7.\2\2\u038f\u0099\3\2"+
		"\2\2\u0390\u0391\7.\2\2\u0391\u009b\3\2\2\2\u0392\u0393\7.\2\2\u0393\u009d"+
		"\3\2\2\2\u0394\u0395\7.\2\2\u0395\u009f\3\2\2\2\u0396\u0397\7-\2\2\u0397"+
		"\u00a1\3\2\2\2\u0398\u0399\7-\2\2\u0399\u00a3\3\2\2\2\u039a\u039b\7(\2"+
		"\2\u039b\u00a5\3\2\2\2\u039c\u039d\7)\2\2\u039d\u00a7\3\2\2\2\u0086\u00b0"+
		"\u00c4\u00cc\u00d7\u00e1\u00e8\u00ef\u00f5\u0100\u0108\u010f\u0118\u011b"+
		"\u0125\u0137\u013e\u0146\u014d\u0156\u015a\u015e\u0165\u0170\u0177\u017b"+
		"\u0184\u0188\u018e\u0190\u0196\u019d\u01a1\u01a7\u01a9\u01ad\u01af\u01b4"+
		"\u01b8\u01be\u01c0\u01c6\u01cc\u01d0\u01d6\u01d8\u01db\u01e1\u01eb\u01f5"+
		"\u01ff\u0203\u0207\u020f\u0213\u0219\u021d\u0221\u0224\u022a\u022e\u0232"+
		"\u023a\u023e\u0242\u0246\u024a\u024d\u0255\u0260\u026e\u0273\u0279\u027b"+
		"\u0282\u0288\u028d\u0292\u029a\u029e\u02a8\u02b1\u02b5\u02bc\u02c9\u02d5"+
		"\u02e0\u02e8\u02eb\u02f1\u02f4\u02f7\u02fa\u02fd\u0301\u0304\u0307\u030a"+
		"\u030d\u0311\u0314\u0317\u031a\u031e\u0321\u0324\u0327\u032b\u032e\u0331"+
		"\u0333\u0336\u033a\u033d\u0340\u0343\u0349\u034c\u034f\u0352\u0355\u0359"+
		"\u035c\u035f\u0362\u036b\u036e\u0372\u0375\u0378\u037a\u0384\u038b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}