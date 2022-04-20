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
		TwoTwoPoint=32, PointPoint=33, Separator=34, OpenArIndex=35, CloseArIndex=36, 
		OpenBlock=37, CloseBlock=38, OpenOp=39, CloseOp=40, ArithmeticOperator=41, 
		AssignmentOperator=42, Not=43, IncDecOperators=44, Identifier=45, IDPrefix=46, 
		TypeSpec=47, Words=48, Integer=49, Float=50, String=51, BlockComment=52, 
		LineComment=53, Whitespace=54, Newline=55;
	public static final int
		RULE_main = 0, RULE_sentences = 1, RULE_statements = 2, RULE_blockCode = 3, 
		RULE_blockUse = 4, RULE_useValue = 5, RULE_useString = 6, RULE_blockVariable = 7, 
		RULE_variableItem = 8, RULE_variablePrefixModes = 9, RULE_blockAttribution = 10, 
		RULE_attributionElements = 11, RULE_blockMultipleAssignments = 12, RULE_variableMultipleAssignmentsModes = 13, 
		RULE_functionCall = 14, RULE_functionCallFlowControl = 15, RULE_functionCallParam = 16, 
		RULE_functionCallParamElements = 17, RULE_blockRet = 18, RULE_blockConditional = 19, 
		RULE_ifElementUnique = 20, RULE_elifElements = 21, RULE_elifElementUnique = 22, 
		RULE_elseElementUnique = 23, RULE_conditionalBlockExpression = 24, RULE_conditionalBlockElements = 25, 
		RULE_blockLoop = 26, RULE_loopBlockElements = 27, RULE_loopComplete = 28, 
		RULE_loopConditional = 29, RULE_loopInfinite = 30, RULE_endOne = 31, RULE_endTwo = 32, 
		RULE_loopOneMembers = 33, RULE_loopTwoMembers = 34, RULE_loopThreeMembers = 35, 
		RULE_loopThreeMembersValues = 36, RULE_blockBreak = 37, RULE_blockNext = 38, 
		RULE_blockTryCatch = 39, RULE_tryUniqueElement = 40, RULE_catchUniqueElement = 41, 
		RULE_tryCatchElements = 42, RULE_blockFunction = 43, RULE_blockFunctionDeclarationAttr = 44, 
		RULE_functionParam = 45, RULE_functionAnonymousParamElements = 46, RULE_functionAnonymousParam = 47, 
		RULE_functionCodeBlock = 48, RULE_blockInterface = 49, RULE_interfaceCodeBlock = 50, 
		RULE_blockAbstraction = 51, RULE_abstractionCodeBlock = 52, RULE_blockClass = 53, 
		RULE_blockClassDeclarationAttr = 54, RULE_classCommonDef = 55, RULE_classAnonymousParam = 56, 
		RULE_classCodeBlock = 57, RULE_blockArray = 58, RULE_indexArray = 59, 
		RULE_indexArrayElements = 60, RULE_associativeArray = 61, RULE_associativeArrayElements = 62, 
		RULE_blockLambdaFunctions = 63, RULE_lambdaFnParams = 64, RULE_lambdaFnCodeBlock = 65, 
		RULE_blockClassConstructor = 66, RULE_blockFunctionCall = 67, RULE_functionCallElements = 68, 
		RULE_blockCascadingMethod = 69, RULE_blockCascadingMethodAttr = 70, RULE_blockAnonymousObject = 71, 
		RULE_blockAccessArrayElements = 72, RULE_arrayAccessElements = 73, RULE_arrayAccessElementsItems = 74, 
		RULE_accessBlockAr = 75, RULE_arrayIndexAccess = 76, RULE_firstIncDec = 77, 
		RULE_lastIncDec = 78, RULE_blockPermissionTokens = 79, RULE_codeBlockFlowControl = 80, 
		RULE_codeBlockFlowControlElements = 81, RULE_codeBlockControl = 82, RULE_generalValue = 83, 
		RULE_generalValueBlock = 84, RULE_generalValueItems = 85, RULE_generalValueElements = 86, 
		RULE_identifier = 87, RULE_identifierB = 88, RULE_identifierC = 89, RULE_identifierD = 90, 
		RULE_incDecOperatorsA = 91, RULE_incDecOperatorsB = 92, RULE_openOpA = 93, 
		RULE_closeOpA = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"blockAttribution", "attributionElements", "blockMultipleAssignments", 
			"variableMultipleAssignmentsModes", "functionCall", "functionCallFlowControl", 
			"functionCallParam", "functionCallParamElements", "blockRet", "blockConditional", 
			"ifElementUnique", "elifElements", "elifElementUnique", "elseElementUnique", 
			"conditionalBlockExpression", "conditionalBlockElements", "blockLoop", 
			"loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
			"endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
			"loopThreeMembersValues", "blockBreak", "blockNext", "blockTryCatch", 
			"tryUniqueElement", "catchUniqueElement", "tryCatchElements", "blockFunction", 
			"blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParamElements", 
			"functionAnonymousParam", "functionCodeBlock", "blockInterface", "interfaceCodeBlock", 
			"blockAbstraction", "abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", 
			"classCommonDef", "classAnonymousParam", "classCodeBlock", "blockArray", 
			"indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
			"blockLambdaFunctions", "lambdaFnParams", "lambdaFnCodeBlock", "blockClassConstructor", 
			"blockFunctionCall", "functionCallElements", "blockCascadingMethod", 
			"blockCascadingMethodAttr", "blockAnonymousObject", "blockAccessArrayElements", 
			"arrayAccessElements", "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", 
			"firstIncDec", "lastIncDec", "blockPermissionTokens", "codeBlockFlowControl", 
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
			"'='", "'.'", "':'", "'::'", "'..'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
			"Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "PointPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "Words", "Integer", "Float", "String", "BlockComment", "LineComment", 
			"Whitespace", "Newline"
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
			setState(190);
			sentences();
			setState(191);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				statements();
				setState(195);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				blockFunctionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				blockClassConstructor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				blockAttribution();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				blockMultipleAssignments();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(219);
				match(OpenBlock);
				setState(220);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(221);
				match(OpenBlock);
				setState(222);
				sentences();
				setState(223);
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
			setState(227);
			match(Use);
			setState(228);
			useValue();
			setState(229);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				useString();
				setState(233);
				match(Separator);
				setState(234);
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
			setState(238);
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
			setState(240);
			match(Var);
			setState(241);
			variableItem();
			setState(242);
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
			setState(244);
			variablePrefixModes();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(245);
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

			setState(248);
			generalValueElements();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(Separator);
					setState(250);
					variableItem();
					}
					} 
				}
				setState(255);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(256);
				identifier();
				}
				break;
			case 2:
				{
				setState(257);
				identifier();
				setState(258);
				match(TypeSpec);
				}
				break;
			}
			setState(262);
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
		enterRule(_localctx, 20, RULE_blockAttribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			attributionElements();
			setState(265);
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
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
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
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public AttributionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionElements; }
	}

	public final AttributionElementsContext attributionElements() throws RecognitionException {
		AttributionElementsContext _localctx = new AttributionElementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributionElements);
		int _la;
		try {
			int _alt;
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				identifier();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(268);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(269);
					identifierB();
					}
				}

				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(272);
					match(TypeSpec);
					}
				}

				setState(275);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(276);
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

				setState(279);
				generalValueElements();
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						match(Separator);
						setState(281);
						attributionElements();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				generalValue();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(288);
					match(TypeSpec);
					}
				}

				setState(291);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(292);
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

				setState(295);
				generalValueElements();
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(296);
						match(Separator);
						setState(297);
						attributionElements();
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_blockMultipleAssignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			variableMultipleAssignmentsModes();
			setState(306);
			match(Attr);
			setState(307);
			generalValueElements();
			setState(308);
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
		enterRule(_localctx, 26, RULE_variableMultipleAssignmentsModes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			generalValue();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					match(Attr);
					setState(312);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(317);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				identifier();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(319);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(320);
					identifierB();
					}
				}

				setState(323);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				blockAccessArrayElements();
				setState(326);
				match(OpenOp);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(327);
					functionCallElements();
					}
				}

				setState(330);
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

	public static class FunctionCallFlowControlContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallFlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallFlowControl; }
	}

	public final FunctionCallFlowControlContext functionCallFlowControl() throws RecognitionException {
		FunctionCallFlowControlContext _localctx = new FunctionCallFlowControlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCallFlowControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			identifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				identifierB();
				}
			}

			setState(339);
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
		enterRule(_localctx, 32, RULE_functionCallParam);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(OpenOp);
				setState(342);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(OpenOp);
				setState(344);
				functionCallParamElements();
				setState(345);
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
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
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
		enterRule(_localctx, 34, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			generalValueElements();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					match(Separator);
					setState(351);
					functionCallParamElements();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 36, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Ret);
			setState(358);
			generalValueElements();
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
		enterRule(_localctx, 38, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			ifElementUnique();
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(362);
				elifElements();
				}
				break;
			}
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(365);
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
		enterRule(_localctx, 40, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(If);
			setState(369);
			conditionalBlockExpression();
			setState(370);
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
		enterRule(_localctx, 42, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			elifElementUnique();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					elifElements();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 44, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(Elif);
			setState(380);
			conditionalBlockExpression();
			setState(381);
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
		enterRule(_localctx, 46, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Else);
			setState(384);
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
		enterRule(_localctx, 48, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 50, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 52, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(For);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(391);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(392);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(393);
				loopComplete();
				}
				break;
			}
			setState(396);
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
		enterRule(_localctx, 54, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 56, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(400);
				match(OpenOp);
				}
			}

			setState(403);
			loopOneMembers();
			setState(404);
			endOne();
			setState(405);
			loopTwoMembers();
			setState(406);
			endTwo();
			setState(407);
			loopThreeMembers();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(408);
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
		enterRule(_localctx, 58, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		enterRule(_localctx, 60, RULE_loopInfinite);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(OpenOp);
				setState(414);
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
		enterRule(_localctx, 62, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		enterRule(_localctx, 64, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 66, RULE_loopOneMembers);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(Var);
				setState(423);
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
		enterRule(_localctx, 68, RULE_loopTwoMembers);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
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
		enterRule(_localctx, 70, RULE_loopThreeMembers);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
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
		enterRule(_localctx, 72, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			generalValueElements();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(436);
				match(Separator);
				setState(437);
				generalValueElements();
				}
				}
				setState(442);
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
		enterRule(_localctx, 74, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(Break);
			setState(444);
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
		enterRule(_localctx, 76, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(Next);
			setState(447);
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
		enterRule(_localctx, 78, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			tryUniqueElement();
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(450);
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
		enterRule(_localctx, 80, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(Try);
			setState(454);
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
		enterRule(_localctx, 82, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Catch);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(457);
				match(OpenOp);
				}
			}

			setState(460);
			identifier();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(461);
				match(CloseOp);
				}
			}

			setState(464);
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
		enterRule(_localctx, 84, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		public FunctionAnonymousParamElementsContext functionAnonymousParamElements() {
			return getRuleContext(FunctionAnonymousParamElementsContext.class,0);
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
		enterRule(_localctx, 86, RULE_blockFunction);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(OpenOp);
				setState(469);
				match(Function);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(470);
					identifier();
					}
				}

				setState(473);
				match(OpenOp);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(474);
					functionParam();
					}
				}

				setState(477);
				match(CloseOp);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(478);
					match(ArrowRight);
					setState(481);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(479);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(480);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(485);
				functionCodeBlock();
				setState(486);
				match(CloseOp);
				setState(487);
				match(OpenOp);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(488);
					functionAnonymousParamElements();
					}
				}

				setState(491);
				match(CloseOp);
				setState(492);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(Function);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(495);
					identifier();
					}
				}

				setState(498);
				match(OpenOp);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(499);
					functionParam();
					}
				}

				setState(502);
				match(CloseOp);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(503);
					match(ArrowRight);
					setState(506);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(504);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(505);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(510);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(511);
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
		public FunctionAnonymousParamElementsContext functionAnonymousParamElements() {
			return getRuleContext(FunctionAnonymousParamElementsContext.class,0);
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
		enterRule(_localctx, 88, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(OpenOp);
				setState(517);
				match(Function);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(518);
					identifier();
					}
				}

				setState(521);
				match(OpenOp);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(522);
					functionParam();
					}
				}

				setState(525);
				match(CloseOp);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(526);
					match(ArrowRight);
					setState(529);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(527);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(528);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(533);
				functionCodeBlock();
				setState(534);
				match(CloseOp);
				setState(535);
				match(OpenOp);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(536);
					functionAnonymousParamElements();
					}
				}

				setState(539);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(Function);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(542);
					identifier();
					}
				}

				setState(545);
				match(OpenOp);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(546);
					functionParam();
					}
				}

				setState(549);
				match(CloseOp);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(550);
					match(ArrowRight);
					setState(553);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(551);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(552);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(557);
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
		enterRule(_localctx, 90, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(Identifier);
			setState(561);
			match(TypeSpec);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(562);
				match(Separator);
				setState(563);
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

	public static class FunctionAnonymousParamElementsContext extends ParserRuleContext {
		public List<FunctionAnonymousParamContext> functionAnonymousParam() {
			return getRuleContexts(FunctionAnonymousParamContext.class);
		}
		public FunctionAnonymousParamContext functionAnonymousParam(int i) {
			return getRuleContext(FunctionAnonymousParamContext.class,i);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public FunctionAnonymousParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonymousParamElements; }
	}

	public final FunctionAnonymousParamElementsContext functionAnonymousParamElements() throws RecognitionException {
		FunctionAnonymousParamElementsContext _localctx = new FunctionAnonymousParamElementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionAnonymousParamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			functionAnonymousParam();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(567);
				match(Separator);
				setState(568);
				functionAnonymousParam();
				}
				}
				setState(573);
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
		enterRule(_localctx, 94, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		enterRule(_localctx, 96, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 98, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(Interface);
			setState(579);
			identifier();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(580);
				match(Extends);
				setState(581);
				identifierB();
				}
			}

			setState(584);
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
		enterRule(_localctx, 100, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 102, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(Abstract);
			setState(589);
			identifier();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(590);
				match(Extends);
				setState(591);
				identifierB();
				}
			}

			setState(594);
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
		enterRule(_localctx, 104, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
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
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ClassCommonDefContext classCommonDef() {
			return getRuleContext(ClassCommonDefContext.class,0);
		}
		public BlockClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClass; }
	}

	public final BlockClassContext blockClass() throws RecognitionException {
		BlockClassContext _localctx = new BlockClassContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_blockClass);
		int _la;
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				openOpA();
				setState(599);
				match(New);
				setState(600);
				match(Class);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(601);
					identifier();
					}
				}

				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(604);
					match(Extends);
					setState(605);
					identifierB();
					}
				}

				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(608);
					match(Implements);
					setState(609);
					identifierC();
					}
				}

				setState(612);
				classCodeBlock();
				setState(613);
				closeOpA();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(614);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(615);
					identifierD();
					setState(616);
					match(OpenOp);
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(617);
						generalValueElements();
						}
					}

					setState(620);
					match(CloseOp);
					}
				}

				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==End) {
					{
					setState(624);
					match(End);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				classCommonDef();
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
		public ClassCommonDefContext classCommonDef() {
			return getRuleContext(ClassCommonDefContext.class,0);
		}
		public BlockClassDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassDeclarationAttr; }
	}

	public final BlockClassDeclarationAttrContext blockClassDeclarationAttr() throws RecognitionException {
		BlockClassDeclarationAttrContext _localctx = new BlockClassDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				openOpA();
				setState(631);
				match(New);
				setState(632);
				match(Class);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(633);
					identifier();
					}
				}

				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(636);
					match(Extends);
					setState(637);
					identifierB();
					}
				}

				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(640);
					match(Implements);
					setState(641);
					identifierC();
					}
				}

				setState(644);
				classCodeBlock();
				setState(645);
				closeOpA();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(647);
					identifierD();
					setState(648);
					match(OpenOp);
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(649);
						generalValueElements();
						}
					}

					setState(652);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				classCommonDef();
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

	public static class ClassCommonDefContext extends ParserRuleContext {
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
		public ClassCommonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCommonDef; }
	}

	public final ClassCommonDefContext classCommonDef() throws RecognitionException {
		ClassCommonDefContext _localctx = new ClassCommonDefContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classCommonDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(Class);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(660);
				identifier();
				}
			}

			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(663);
				match(Extends);
				setState(664);
				identifierB();
				}
			}

			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(667);
				match(Implements);
				setState(668);
				identifierC();
				}
			}

			setState(671);
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
		enterRule(_localctx, 112, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		enterRule(_localctx, 114, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 116, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(677);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(678);
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
		enterRule(_localctx, 118, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(OpenArIndex);
			setState(682);
			indexArrayElements();
			setState(683);
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
		enterRule(_localctx, 120, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			generalValueElements();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686);
					match(Separator);
					setState(687);
					indexArrayElements();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 122, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(OpenBlock);
			setState(694);
			associativeArrayElements();
			setState(695);
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
		enterRule(_localctx, 124, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			identifier();
			setState(698);
			match(TwoPoint);
			setState(699);
			generalValueElements();
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					match(Separator);
					setState(701);
					associativeArrayElements();
					}
					} 
				}
				setState(706);
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
		enterRule(_localctx, 126, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(OpenOp);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(708);
				lambdaFnParams();
				}
			}

			setState(711);
			match(CloseOp);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(712);
				match(ArrowRight);
				setState(715);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(713);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(714);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(719);
			match(ARightLB);
			setState(720);
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
		enterRule(_localctx, 128, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			identifier();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(723);
				match(TypeSpec);
				}
			}

			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(726);
					match(Separator);
					setState(727);
					lambdaFnParams();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 130, RULE_lambdaFnCodeBlock);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
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
		enterRule(_localctx, 132, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			identifier();
			setState(738);
			match(OpenOp);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(739);
				functionParam();
				}
			}

			setState(742);
			match(CloseOp);
			setState(743);
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
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public BlockFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionCall; }
	}

	public final BlockFunctionCallContext blockFunctionCall() throws RecognitionException {
		BlockFunctionCallContext _localctx = new BlockFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockFunctionCall);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				identifier();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(746);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(747);
					identifierB();
					}
				}

				setState(750);
				match(OpenOp);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(751);
					functionCallElements();
					}
				}

				setState(754);
				match(CloseOp);
				setState(755);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				blockAccessArrayElements();
				setState(758);
				match(OpenOp);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(759);
					functionCallElements();
					}
				}

				setState(762);
				match(CloseOp);
				setState(763);
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
		enterRule(_localctx, 136, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			generalValueElements();
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					match(Separator);
					setState(769);
					functionCallElements();
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class BlockCascadingMethodContext extends ParserRuleContext {
		public BlockCascadingMethodAttrContext blockCascadingMethodAttr() {
			return getRuleContext(BlockCascadingMethodAttrContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockCascadingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCascadingMethod; }
	}

	public final BlockCascadingMethodContext blockCascadingMethod() throws RecognitionException {
		BlockCascadingMethodContext _localctx = new BlockCascadingMethodContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blockCascadingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			blockCascadingMethodAttr();
			setState(776);
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

	public static class BlockCascadingMethodAttrContext extends ParserRuleContext {
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public List<TerminalNode> PointPoint() { return getTokens(TParser.PointPoint); }
		public TerminalNode PointPoint(int i) {
			return getToken(TParser.PointPoint, i);
		}
		public List<BlockCascadingMethodAttrContext> blockCascadingMethodAttr() {
			return getRuleContexts(BlockCascadingMethodAttrContext.class);
		}
		public BlockCascadingMethodAttrContext blockCascadingMethodAttr(int i) {
			return getRuleContext(BlockCascadingMethodAttrContext.class,i);
		}
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public BlockCascadingMethodAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCascadingMethodAttr; }
	}

	public final BlockCascadingMethodAttrContext blockCascadingMethodAttr() throws RecognitionException {
		BlockCascadingMethodAttrContext _localctx = new BlockCascadingMethodAttrContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_blockCascadingMethodAttr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			blockAccessArrayElements();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(779);
				match(OpenOp);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(780);
					functionCallElements();
					}
				}

				setState(783);
				match(CloseOp);
				}
			}

			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(786);
					match(PointPoint);
					setState(787);
					blockCascadingMethodAttr();
					}
					} 
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class BlockAnonymousObjectContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAnonymousObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAnonymousObject; }
	}

	public final BlockAnonymousObjectContext blockAnonymousObject() throws RecognitionException {
		BlockAnonymousObjectContext _localctx = new BlockAnonymousObjectContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_blockAnonymousObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(OpenOp);
			setState(794);
			match(New);
			setState(795);
			identifier();
			setState(796);
			match(OpenOp);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(797);
				generalValueElements();
				}
			}

			setState(800);
			match(CloseOp);
			setState(801);
			match(CloseOp);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(802);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(803);
				identifierB();
				setState(804);
				match(OpenOp);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(805);
					generalValueElements();
					}
				}

				setState(808);
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

	public static class BlockAccessArrayElementsContext extends ParserRuleContext {
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public BlockAccessArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAccessArrayElements; }
	}

	public final BlockAccessArrayElementsContext blockAccessArrayElements() throws RecognitionException {
		BlockAccessArrayElementsContext _localctx = new BlockAccessArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_blockAccessArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			arrayAccessElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessElementsContext extends ParserRuleContext {
		public ArrayAccessElementsItemsContext arrayAccessElementsItems() {
			return getRuleContext(ArrayAccessElementsItemsContext.class,0);
		}
		public List<ArrayAccessElementsContext> arrayAccessElements() {
			return getRuleContexts(ArrayAccessElementsContext.class);
		}
		public ArrayAccessElementsContext arrayAccessElements(int i) {
			return getRuleContext(ArrayAccessElementsContext.class,i);
		}
		public ArrayAccessElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElements; }
	}

	public final ArrayAccessElementsContext arrayAccessElements() throws RecognitionException {
		ArrayAccessElementsContext _localctx = new ArrayAccessElementsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arrayAccessElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			arrayAccessElementsItems();
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(815);
					arrayAccessElements();
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class ArrayAccessElementsItemsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arrayAccessElementsItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IncDecOperators) {
				{
				setState(821);
				firstIncDec();
				}
			}

			setState(824);
			identifier();
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(825);
				accessBlockAr();
				}
				break;
			}
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(828);
				lastIncDec();
				}
				break;
			}
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class AccessBlockArContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public ArrayIndexAccessContext arrayIndexAccess() {
			return getRuleContext(ArrayIndexAccessContext.class,0);
		}
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public List<AccessBlockArContext> accessBlockAr() {
			return getRuleContexts(AccessBlockArContext.class);
		}
		public AccessBlockArContext accessBlockAr(int i) {
			return getRuleContext(AccessBlockArContext.class,i);
		}
		public AccessBlockArContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessBlockAr; }
	}

	public final AccessBlockArContext accessBlockAr() throws RecognitionException {
		AccessBlockArContext _localctx = new AccessBlockArContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_accessBlockAr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(OpenArIndex);
			setState(835);
			arrayIndexAccess();
			setState(836);
			match(CloseArIndex);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					accessBlockAr();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	public static class ArrayIndexAccessContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ArrayIndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexAccess; }
	}

	public final ArrayIndexAccessContext arrayIndexAccess() throws RecognitionException {
		ArrayIndexAccessContext _localctx = new ArrayIndexAccessContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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

	public static class FirstIncDecContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public FirstIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstIncDec; }
	}

	public final FirstIncDecContext firstIncDec() throws RecognitionException {
		FirstIncDecContext _localctx = new FirstIncDecContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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
		enterRule(_localctx, 156, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
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
		enterRule(_localctx, 158, RULE_blockPermissionTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
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
		enterRule(_localctx, 160, RULE_codeBlockFlowControl);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(OpenBlock);
				setState(852);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(OpenBlock);
				setState(854);
				sentences();
				setState(855);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
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
		public FunctionCallFlowControlContext functionCallFlowControl() {
			return getRuleContext(FunctionCallFlowControlContext.class,0);
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
		enterRule(_localctx, 162, RULE_codeBlockFlowControlElements);
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				functionCallFlowControl();
				setState(861);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(866);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(867);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(868);
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
		enterRule(_localctx, 164, RULE_codeBlockControl);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(OpenBlock);
				setState(872);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(OpenBlock);
				setState(874);
				sentences();
				setState(875);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
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
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public BlockAnonymousObjectContext blockAnonymousObject() {
			return getRuleContext(BlockAnonymousObjectContext.class,0);
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
		enterRule(_localctx, 166, RULE_generalValue);
		int _la;
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(879);
					match(Not);
					}
				}

				setState(882);
				functionCall();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(883);
					match(TypeSpec);
					}
					break;
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(886);
					match(ArithmeticOperator);
					}
				}

				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(889);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(892);
					match(Not);
					}
				}

				setState(895);
				identifier();
				setState(896);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(897);
				identifierB();
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(898);
					match(TypeSpec);
					}
					break;
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(901);
					match(ArithmeticOperator);
					}
				}

				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(904);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(907);
						match(Not);
						}
					}

					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(910);
						incDecOperatorsA();
						}
					}

					setState(913);
					identifier();
					setState(915);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(914);
						incDecOperatorsB();
						}
						break;
					}
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(917);
						match(TypeSpec);
						}
						break;
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(920);
						match(ArithmeticOperator);
						}
					}

					setState(924);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(923);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(926);
						match(Not);
						}
					}

					setState(929);
					match(Integer);
					setState(931);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(930);
						match(TypeSpec);
						}
						break;
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(933);
						match(ArithmeticOperator);
						}
					}

					setState(937);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(936);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(940);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(939);
						match(Not);
						}
					}

					setState(942);
					match(Float);
					setState(944);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(943);
						match(TypeSpec);
						}
						break;
					}
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(946);
						match(ArithmeticOperator);
						}
					}

					setState(950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(949);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(952);
						match(Not);
						}
					}

					setState(955);
					match(String);
					setState(957);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(956);
						match(TypeSpec);
						}
						break;
					}
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(959);
						match(ArithmeticOperator);
						}
					}

					setState(963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(962);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(967);
					match(Not);
					}
				}

				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(970);
					incDecOperatorsA();
					}
				}

				setState(973);
				blockArray();
				setState(975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(974);
					incDecOperatorsB();
					}
					break;
				}
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(977);
					match(TypeSpec);
					}
					break;
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(980);
					match(ArithmeticOperator);
					}
				}

				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(983);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				blockFunctionDeclarationAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(987);
				blockClassDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(988);
				blockLambdaFunctions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(989);
				blockAccessArrayElements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(990);
				blockAnonymousObject();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(995);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(991);
					match(OpenBlock);
					setState(992);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(993);
					match(OpenArIndex);
					setState(994);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(997);
					match(Not);
					}
				}

				setState(1000);
				generalValueBlock();
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1001);
					match(TypeSpec);
					}
					break;
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(1004);
					match(ArithmeticOperator);
					}
				}

				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1007);
					match(AssignmentOperator);
					}
					break;
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
		enterRule(_localctx, 168, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(OpenOp);
			setState(1013);
			generalValueItems();
			setState(1014);
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
		enterRule(_localctx, 170, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			generalValue();
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					generalValueItems();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		enterRule(_localctx, 172, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			generalValue();
			setState(1027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1024);
					generalValueElements();
					}
					} 
				}
				setState(1029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		enterRule(_localctx, 174, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		enterRule(_localctx, 176, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 178, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 180, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 182, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 184, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 186, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
		enterRule(_localctx, 188, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0419\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c9\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00e4\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00ef\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00f9\n\n\3\n\3\n\3\n\7"+
		"\n\u00fe\n\n\f\n\16\n\u0101\13\n\3\13\3\13\3\13\3\13\5\13\u0107\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0111\n\r\3\r\5\r\u0114\n\r\3\r\3"+
		"\r\5\r\u0118\n\r\3\r\3\r\3\r\7\r\u011d\n\r\f\r\16\r\u0120\13\r\3\r\3\r"+
		"\5\r\u0124\n\r\3\r\3\r\5\r\u0128\n\r\3\r\3\r\3\r\7\r\u012d\n\r\f\r\16"+
		"\r\u0130\13\r\5\r\u0132\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7"+
		"\17\u013c\n\17\f\17\16\17\u013f\13\17\3\20\3\20\3\20\5\20\u0144\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u014b\n\20\3\20\3\20\5\20\u014f\n\20\3\21"+
		"\3\21\3\21\5\21\u0154\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u015e\n\22\3\23\3\23\3\23\7\23\u0163\n\23\f\23\16\23\u0166\13\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u016e\n\25\3\25\5\25\u0171\n\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\7\27\u0179\n\27\f\27\16\27\u017c\13\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5"+
		"\34\u018d\n\34\3\34\3\34\3\35\3\35\3\36\5\36\u0194\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u019c\n\36\3\37\3\37\3 \3 \3 \5 \u01a3\n \3!\3!\3"+
		"\"\3\"\3#\3#\3#\5#\u01ac\n#\3$\3$\5$\u01b0\n$\3%\3%\5%\u01b4\n%\3&\3&"+
		"\3&\7&\u01b9\n&\f&\16&\u01bc\13&\3\'\3\'\3\'\3(\3(\3(\3)\3)\5)\u01c6\n"+
		")\3*\3*\3*\3+\3+\5+\u01cd\n+\3+\3+\5+\u01d1\n+\3+\3+\3,\3,\3-\3-\3-\5"+
		"-\u01da\n-\3-\3-\5-\u01de\n-\3-\3-\3-\3-\5-\u01e4\n-\5-\u01e6\n-\3-\3"+
		"-\3-\3-\5-\u01ec\n-\3-\3-\3-\3-\3-\5-\u01f3\n-\3-\3-\5-\u01f7\n-\3-\3"+
		"-\3-\3-\5-\u01fd\n-\5-\u01ff\n-\3-\3-\5-\u0203\n-\5-\u0205\n-\3.\3.\3"+
		".\5.\u020a\n.\3.\3.\5.\u020e\n.\3.\3.\3.\3.\5.\u0214\n.\5.\u0216\n.\3"+
		".\3.\3.\3.\5.\u021c\n.\3.\3.\3.\3.\5.\u0222\n.\3.\3.\5.\u0226\n.\3.\3"+
		".\3.\3.\5.\u022c\n.\5.\u022e\n.\3.\5.\u0231\n.\3/\3/\3/\3/\5/\u0237\n"+
		"/\3\60\3\60\3\60\7\60\u023c\n\60\f\60\16\60\u023f\13\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\5\63\u0249\n\63\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\5\65\u0253\n\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\5\67"+
		"\u025d\n\67\3\67\3\67\5\67\u0261\n\67\3\67\3\67\5\67\u0265\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u026d\n\67\3\67\3\67\5\67\u0271\n\67\3\67"+
		"\5\67\u0274\n\67\3\67\5\67\u0277\n\67\38\38\38\38\58\u027d\n8\38\38\5"+
		"8\u0281\n8\38\38\58\u0285\n8\38\38\38\38\38\38\58\u028d\n8\38\38\58\u0291"+
		"\n8\38\58\u0294\n8\39\39\59\u0298\n9\39\39\59\u029c\n9\39\39\59\u02a0"+
		"\n9\39\39\3:\3:\3;\3;\3<\3<\5<\u02aa\n<\3=\3=\3=\3=\3>\3>\3>\7>\u02b3"+
		"\n>\f>\16>\u02b6\13>\3?\3?\3?\3?\3@\3@\3@\3@\3@\7@\u02c1\n@\f@\16@\u02c4"+
		"\13@\3A\3A\5A\u02c8\nA\3A\3A\3A\3A\5A\u02ce\nA\5A\u02d0\nA\3A\3A\3A\3"+
		"B\3B\5B\u02d7\nB\3B\3B\7B\u02db\nB\fB\16B\u02de\13B\3C\3C\5C\u02e2\nC"+
		"\3D\3D\3D\5D\u02e7\nD\3D\3D\3D\3E\3E\3E\5E\u02ef\nE\3E\3E\5E\u02f3\nE"+
		"\3E\3E\3E\3E\3E\3E\5E\u02fb\nE\3E\3E\3E\5E\u0300\nE\3F\3F\3F\7F\u0305"+
		"\nF\fF\16F\u0308\13F\3G\3G\3G\3H\3H\3H\5H\u0310\nH\3H\5H\u0313\nH\3H\3"+
		"H\7H\u0317\nH\fH\16H\u031a\13H\3I\3I\3I\3I\3I\5I\u0321\nI\3I\3I\3I\3I"+
		"\3I\3I\5I\u0329\nI\3I\3I\5I\u032d\nI\3J\3J\3K\3K\7K\u0333\nK\fK\16K\u0336"+
		"\13K\3L\5L\u0339\nL\3L\3L\5L\u033d\nL\3L\5L\u0340\nL\3L\5L\u0343\nL\3"+
		"M\3M\3M\3M\7M\u0349\nM\fM\16M\u034c\13M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R"+
		"\3R\3R\3R\3R\3R\5R\u035d\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0368\nS\3T"+
		"\3T\3T\3T\3T\3T\5T\u0370\nT\3U\5U\u0373\nU\3U\3U\5U\u0377\nU\3U\5U\u037a"+
		"\nU\3U\5U\u037d\nU\3U\5U\u0380\nU\3U\3U\3U\3U\5U\u0386\nU\3U\5U\u0389"+
		"\nU\3U\5U\u038c\nU\3U\5U\u038f\nU\3U\5U\u0392\nU\3U\3U\5U\u0396\nU\3U"+
		"\5U\u0399\nU\3U\5U\u039c\nU\3U\5U\u039f\nU\3U\5U\u03a2\nU\3U\3U\5U\u03a6"+
		"\nU\3U\5U\u03a9\nU\3U\5U\u03ac\nU\3U\5U\u03af\nU\3U\3U\5U\u03b3\nU\3U"+
		"\5U\u03b6\nU\3U\5U\u03b9\nU\3U\5U\u03bc\nU\3U\3U\5U\u03c0\nU\3U\5U\u03c3"+
		"\nU\3U\5U\u03c6\nU\5U\u03c8\nU\3U\5U\u03cb\nU\3U\5U\u03ce\nU\3U\3U\5U"+
		"\u03d2\nU\3U\5U\u03d5\nU\3U\5U\u03d8\nU\3U\5U\u03db\nU\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\5U\u03e6\nU\3U\5U\u03e9\nU\3U\3U\5U\u03ed\nU\3U\5U\u03f0"+
		"\nU\3U\5U\u03f3\nU\5U\u03f5\nU\3V\3V\3V\3V\3W\3W\7W\u03fd\nW\fW\16W\u0400"+
		"\13W\3X\3X\7X\u0404\nX\fX\16X\u0407\13X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3"+
		"]\3^\3^\3_\3_\3`\3`\3`\2\2a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\2\6\4\2\25\25\31\31\4\2\37\37,,\4\2  \""+
		"\"\4\2\13\17\30\30\2\u046f\2\u00c0\3\2\2\2\4\u00c8\3\2\2\2\6\u00db\3\2"+
		"\2\2\b\u00e3\3\2\2\2\n\u00e5\3\2\2\2\f\u00ee\3\2\2\2\16\u00f0\3\2\2\2"+
		"\20\u00f2\3\2\2\2\22\u00f6\3\2\2\2\24\u0106\3\2\2\2\26\u010a\3\2\2\2\30"+
		"\u0131\3\2\2\2\32\u0133\3\2\2\2\34\u0138\3\2\2\2\36\u014e\3\2\2\2 \u0150"+
		"\3\2\2\2\"\u015d\3\2\2\2$\u015f\3\2\2\2&\u0167\3\2\2\2(\u016b\3\2\2\2"+
		"*\u0172\3\2\2\2,\u0176\3\2\2\2.\u017d\3\2\2\2\60\u0181\3\2\2\2\62\u0184"+
		"\3\2\2\2\64\u0186\3\2\2\2\66\u0188\3\2\2\28\u0190\3\2\2\2:\u0193\3\2\2"+
		"\2<\u019d\3\2\2\2>\u01a2\3\2\2\2@\u01a4\3\2\2\2B\u01a6\3\2\2\2D\u01ab"+
		"\3\2\2\2F\u01af\3\2\2\2H\u01b3\3\2\2\2J\u01b5\3\2\2\2L\u01bd\3\2\2\2N"+
		"\u01c0\3\2\2\2P\u01c3\3\2\2\2R\u01c7\3\2\2\2T\u01ca\3\2\2\2V\u01d4\3\2"+
		"\2\2X\u0204\3\2\2\2Z\u0230\3\2\2\2\\\u0232\3\2\2\2^\u0238\3\2\2\2`\u0240"+
		"\3\2\2\2b\u0242\3\2\2\2d\u0244\3\2\2\2f\u024c\3\2\2\2h\u024e\3\2\2\2j"+
		"\u0256\3\2\2\2l\u0276\3\2\2\2n\u0293\3\2\2\2p\u0295\3\2\2\2r\u02a3\3\2"+
		"\2\2t\u02a5\3\2\2\2v\u02a9\3\2\2\2x\u02ab\3\2\2\2z\u02af\3\2\2\2|\u02b7"+
		"\3\2\2\2~\u02bb\3\2\2\2\u0080\u02c5\3\2\2\2\u0082\u02d4\3\2\2\2\u0084"+
		"\u02e1\3\2\2\2\u0086\u02e3\3\2\2\2\u0088\u02ff\3\2\2\2\u008a\u0301\3\2"+
		"\2\2\u008c\u0309\3\2\2\2\u008e\u030c\3\2\2\2\u0090\u031b\3\2\2\2\u0092"+
		"\u032e\3\2\2\2\u0094\u0330\3\2\2\2\u0096\u0338\3\2\2\2\u0098\u0344\3\2"+
		"\2\2\u009a\u034d\3\2\2\2\u009c\u034f\3\2\2\2\u009e\u0351\3\2\2\2\u00a0"+
		"\u0353\3\2\2\2\u00a2\u035c\3\2\2\2\u00a4\u0367\3\2\2\2\u00a6\u036f\3\2"+
		"\2\2\u00a8\u03f4\3\2\2\2\u00aa\u03f6\3\2\2\2\u00ac\u03fa\3\2\2\2\u00ae"+
		"\u0401\3\2\2\2\u00b0\u0408\3\2\2\2\u00b2\u040a\3\2\2\2\u00b4\u040c\3\2"+
		"\2\2\u00b6\u040e\3\2\2\2\u00b8\u0410\3\2\2\2\u00ba\u0412\3\2\2\2\u00bc"+
		"\u0414\3\2\2\2\u00be\u0416\3\2\2\2\u00c0\u00c1\5\4\3\2\u00c1\u00c2\7\2"+
		"\2\3\u00c2\3\3\2\2\2\u00c3\u00c9\5\6\4\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6"+
		"\5\4\3\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\5\3\2\2\2\u00ca\u00dc\5\n\6\2"+
		"\u00cb\u00dc\5\20\t\2\u00cc\u00dc\5&\24\2\u00cd\u00dc\5(\25\2\u00ce\u00dc"+
		"\5\66\34\2\u00cf\u00dc\5L\'\2\u00d0\u00dc\5N(\2\u00d1\u00dc\5P)\2\u00d2"+
		"\u00dc\5X-\2\u00d3\u00dc\5d\63\2\u00d4\u00dc\5h\65\2\u00d5\u00dc\5l\67"+
		"\2\u00d6\u00dc\5\u0088E\2\u00d7\u00dc\5\u0086D\2\u00d8\u00dc\5\26\f\2"+
		"\u00d9\u00dc\5\32\16\2\u00da\u00dc\5\u00a0Q\2\u00db\u00ca\3\2\2\2\u00db"+
		"\u00cb\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00ce\3\2"+
		"\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d1\3\2\2\2\u00db"+
		"\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d5\3\2"+
		"\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\7\3\2\2\2\u00dd\u00de\7\'\2\2"+
		"\u00de\u00e4\7(\2\2\u00df\u00e0\7\'\2\2\u00e0\u00e1\5\4\3\2\u00e1\u00e2"+
		"\7(\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"\t\3\2\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\7\36\2"+
		"\2\u00e8\13\3\2\2\2\u00e9\u00ef\5\16\b\2\u00ea\u00eb\5\16\b\2\u00eb\u00ec"+
		"\7$\2\2\u00ec\u00ed\5\f\7\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ef\r\3\2\2\2\u00f0\u00f1\7\65\2\2\u00f1\17\3\2\2\2\u00f2"+
		"\u00f3\7\4\2\2\u00f3\u00f4\5\22\n\2\u00f4\u00f5\7\36\2\2\u00f5\21\3\2"+
		"\2\2\u00f6\u00f8\5\24\13\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00ff\5\u00aeX\2\u00fb\u00fc"+
		"\7$\2\2\u00fc\u00fe\5\22\n\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\23\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0107\5\u00b0Y\2\u0103\u0104\5\u00b0Y\2\u0104\u0105\7\61\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\t\3\2\2\u0109\25\3\2\2\2\u010a\u010b\5\30\r\2\u010b"+
		"\u010c\7\36\2\2\u010c\27\3\2\2\2\u010d\u0110\5\u00b0Y\2\u010e\u010f\t"+
		"\4\2\2\u010f\u0111\5\u00b2Z\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u0113\3\2\2\2\u0112\u0114\7\61\2\2\u0113\u0112\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\t\3\2\2\u0116\u0118\t\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011e\5\u00ae"+
		"X\2\u011a\u011b\7$\2\2\u011b\u011d\5\30\r\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0132\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5\u00a8U\2\u0122\u0124\7\61\2\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\t\3"+
		"\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012e\5\u00aeX\2\u012a\u012b\7$\2\2\u012b\u012d\5"+
		"\30\r\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u010d\3\2"+
		"\2\2\u0131\u0121\3\2\2\2\u0132\31\3\2\2\2\u0133\u0134\5\34\17\2\u0134"+
		"\u0135\7\37\2\2\u0135\u0136\5\u00aeX\2\u0136\u0137\7\36\2\2\u0137\33\3"+
		"\2\2\2\u0138\u013d\5\u00a8U\2\u0139\u013a\7\37\2\2\u013a\u013c\5\34\17"+
		"\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\35\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143\5\u00b0Y\2\u0141"+
		"\u0142\t\4\2\2\u0142\u0144\5\u00b2Z\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5\"\22\2\u0146\u014f\3\2\2\2"+
		"\u0147\u0148\5\u0092J\2\u0148\u014a\7)\2\2\u0149\u014b\5\u008aF\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7*"+
		"\2\2\u014d\u014f\3\2\2\2\u014e\u0140\3\2\2\2\u014e\u0147\3\2\2\2\u014f"+
		"\37\3\2\2\2\u0150\u0153\5\u00b0Y\2\u0151\u0152\t\4\2\2\u0152\u0154\5\u00b2"+
		"Z\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\5\"\22\2\u0156!\3\2\2\2\u0157\u0158\7)\2\2\u0158\u015e\7*\2\2\u0159"+
		"\u015a\7)\2\2\u015a\u015b\5$\23\2\u015b\u015c\7*\2\2\u015c\u015e\3\2\2"+
		"\2\u015d\u0157\3\2\2\2\u015d\u0159\3\2\2\2\u015e#\3\2\2\2\u015f\u0164"+
		"\5\u00aeX\2\u0160\u0161\7$\2\2\u0161\u0163\5$\23\2\u0162\u0160\3\2\2\2"+
		"\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165%\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\t\2\2\u0168\u0169\5\u00aeX\2"+
		"\u0169\u016a\7\36\2\2\u016a\'\3\2\2\2\u016b\u016d\5*\26\2\u016c\u016e"+
		"\5,\27\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0171\5\60\31\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171)\3\2\2"+
		"\2\u0172\u0173\7\5\2\2\u0173\u0174\5\62\32\2\u0174\u0175\5\64\33\2\u0175"+
		"+\3\2\2\2\u0176\u017a\5.\30\2\u0177\u0179\5,\27\2\u0178\u0177\3\2\2\2"+
		"\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b-\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\6\2\2\u017e\u017f\5\62\32\2\u017f"+
		"\u0180\5\64\33\2\u0180/\3\2\2\2\u0181\u0182\7\7\2\2\u0182\u0183\5\64\33"+
		"\2\u0183\61\3\2\2\2\u0184\u0185\5\u00aeX\2\u0185\63\3\2\2\2\u0186\u0187"+
		"\5\u00a2R\2\u0187\65\3\2\2\2\u0188\u018c\7\b\2\2\u0189\u018d\5> \2\u018a"+
		"\u018d\5<\37\2\u018b\u018d\5:\36\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\58\35\2\u018f"+
		"\67\3\2\2\2\u0190\u0191\5\u00a2R\2\u01919\3\2\2\2\u0192\u0194\7)\2\2\u0193"+
		"\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5D"+
		"#\2\u0196\u0197\5@!\2\u0197\u0198\5F$\2\u0198\u0199\5B\"\2\u0199\u019b"+
		"\5H%\2\u019a\u019c\7*\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		";\3\2\2\2\u019d\u019e\5F$\2\u019e=\3\2\2\2\u019f\u01a0\7)\2\2\u01a0\u01a3"+
		"\7*\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"?\3\2\2\2\u01a4\u01a5\7\36\2\2\u01a5A\3\2\2\2\u01a6\u01a7\7\36\2\2\u01a7"+
		"C\3\2\2\2\u01a8\u01a9\7\4\2\2\u01a9\u01ac\5\22\n\2\u01aa\u01ac\3\2\2\2"+
		"\u01ab\u01a8\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acE\3\2\2\2\u01ad\u01b0\5"+
		"\u00aeX\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2"+
		"\u01b0G\3\2\2\2\u01b1\u01b4\5J&\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4I\3\2\2\2\u01b5\u01ba\5\u00aeX\2\u01b6\u01b7"+
		"\7$\2\2\u01b7\u01b9\5\u00aeX\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbK\3\2\2\2\u01bc\u01ba\3"+
		"\2\2\2\u01bd\u01be\7\26\2\2\u01be\u01bf\7\36\2\2\u01bfM\3\2\2\2\u01c0"+
		"\u01c1\7\27\2\2\u01c1\u01c2\7\36\2\2\u01c2O\3\2\2\2\u01c3\u01c5\5R*\2"+
		"\u01c4\u01c6\5T+\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6Q\3\2"+
		"\2\2\u01c7\u01c8\7\32\2\2\u01c8\u01c9\5V,\2\u01c9S\3\2\2\2\u01ca\u01cc"+
		"\7\33\2\2\u01cb\u01cd\7)\2\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\5\u00b0Y\2\u01cf\u01d1\7*\2\2\u01d0\u01cf\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5V,\2\u01d3"+
		"U\3\2\2\2\u01d4\u01d5\5\u00a2R\2\u01d5W\3\2\2\2\u01d6\u01d7\7)\2\2\u01d7"+
		"\u01d9\7\n\2\2\u01d8\u01da\5\u00b0Y\2\u01d9\u01d8\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\7)\2\2\u01dc\u01de\5\\/\2\u01dd"+
		"\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e5\7*"+
		"\2\2\u01e0\u01e3\7\34\2\2\u01e1\u01e4\5\u00b2Z\2\u01e2\u01e4\7\61\2\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5b\62\2\u01e8"+
		"\u01e9\7*\2\2\u01e9\u01eb\7)\2\2\u01ea\u01ec\5^\60\2\u01eb\u01ea\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7*\2\2\u01ee\u01ef"+
		"\7\36\2\2\u01ef\u0205\3\2\2\2\u01f0\u01f2\7\n\2\2\u01f1\u01f3\5\u00b0"+
		"Y\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\7)\2\2\u01f5\u01f7\5\\/\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2"+
		"\2\u01f7\u01f8\3\2\2\2\u01f8\u01fe\7*\2\2\u01f9\u01fc\7\34\2\2\u01fa\u01fd"+
		"\5\u00b2Z\2\u01fb\u01fd\7\61\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2"+
		"\2\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202"+
		"\3\2\2\2\u0200\u0203\5b\62\2\u0201\u0203\7\36\2\2\u0202\u0200\3\2\2\2"+
		"\u0202\u0201\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u01d6\3\2\2\2\u0204\u01f0"+
		"\3\2\2\2\u0205Y\3\2\2\2\u0206\u0207\7)\2\2\u0207\u0209\7\n\2\2\u0208\u020a"+
		"\5\u00b0Y\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2"+
		"\2\u020b\u020d\7)\2\2\u020c\u020e\5\\/\2\u020d\u020c\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0215\7*\2\2\u0210\u0213\7\34\2\2\u0211"+
		"\u0214\5\u00b2Z\2\u0212\u0214\7\61\2\2\u0213\u0211\3\2\2\2\u0213\u0212"+
		"\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0210\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\5b\62\2\u0218\u0219\7*\2\2\u0219\u021b\7)\2"+
		"\2\u021a\u021c\5^\60\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\7*\2\2\u021e\u0231\3\2\2\2\u021f\u0221\7\n\2\2\u0220"+
		"\u0222\5\u00b0Y\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0225\7)\2\2\u0224\u0226\5\\/\2\u0225\u0224\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022d\7*\2\2\u0228\u022b\7\34"+
		"\2\2\u0229\u022c\5\u00b2Z\2\u022a\u022c\7\61\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022a\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0231\5b\62\2\u0230\u0206\3\2\2\2\u0230"+
		"\u021f\3\2\2\2\u0231[\3\2\2\2\u0232\u0233\7/\2\2\u0233\u0236\7\61\2\2"+
		"\u0234\u0235\7$\2\2\u0235\u0237\5\\/\2\u0236\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237]\3\2\2\2\u0238\u023d\5`\61\2\u0239\u023a\7$\2\2\u023a\u023c"+
		"\5`\61\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e_\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\5\u00ae"+
		"X\2\u0241a\3\2\2\2\u0242\u0243\5\u00a6T\2\u0243c\3\2\2\2\u0244\u0245\7"+
		"\20\2\2\u0245\u0248\5\u00b0Y\2\u0246\u0247\7\22\2\2\u0247\u0249\5\u00b2"+
		"Z\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\5f\64\2\u024be\3\2\2\2\u024c\u024d\5\u00a6T\2\u024dg\3\2\2\2\u024e"+
		"\u024f\7\21\2\2\u024f\u0252\5\u00b0Y\2\u0250\u0251\7\22\2\2\u0251\u0253"+
		"\5\u00b2Z\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2"+
		"\2\u0254\u0255\5j\66\2\u0255i\3\2\2\2\u0256\u0257\5\u00a6T\2\u0257k\3"+
		"\2\2\2\u0258\u0259\5\u00bc_\2\u0259\u025a\7\25\2\2\u025a\u025c\7\23\2"+
		"\2\u025b\u025d\5\u00b0Y\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u0260\3\2\2\2\u025e\u025f\7\22\2\2\u025f\u0261\5\u00b2Z\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0263\7\24\2\2"+
		"\u0263\u0265\5\u00b4[\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\5t;\2\u0267\u0270\5\u00be`\2\u0268\u0269\t"+
		"\4\2\2\u0269\u026a\5\u00b6\\\2\u026a\u026c\7)\2\2\u026b\u026d\5\u00ae"+
		"X\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\7*\2\2\u026f\u0271\3\2\2\2\u0270\u0268\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0273\3\2\2\2\u0272\u0274\7\36\2\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0277\5p9\2\u0276\u0258\3\2\2"+
		"\2\u0276\u0275\3\2\2\2\u0277m\3\2\2\2\u0278\u0279\5\u00bc_\2\u0279\u027a"+
		"\7\25\2\2\u027a\u027c\7\23\2\2\u027b\u027d\5\u00b0Y\2\u027c\u027b\3\2"+
		"\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027f\7\22\2\2\u027f"+
		"\u0281\5\u00b2Z\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284"+
		"\3\2\2\2\u0282\u0283\7\24\2\2\u0283\u0285\5\u00b4[\2\u0284\u0282\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5t;\2\u0287\u0290"+
		"\5\u00be`\2\u0288\u0289\t\4\2\2\u0289\u028a\5\u00b6\\\2\u028a\u028c\7"+
		")\2\2\u028b\u028d\5\u00aeX\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\7*\2\2\u028f\u0291\3\2\2\2\u0290\u0288\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0294\5p9\2\u0293\u0278"+
		"\3\2\2\2\u0293\u0292\3\2\2\2\u0294o\3\2\2\2\u0295\u0297\7\23\2\2\u0296"+
		"\u0298\5\u00b0Y\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029b"+
		"\3\2\2\2\u0299\u029a\7\22\2\2\u029a\u029c\5\u00b2Z\2\u029b\u0299\3\2\2"+
		"\2\u029b\u029c\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029e\7\24\2\2\u029e"+
		"\u02a0\5\u00b4[\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\5t;\2\u02a2q\3\2\2\2\u02a3\u02a4\5\u00aeX\2\u02a4"+
		"s\3\2\2\2\u02a5\u02a6\5\u00a6T\2\u02a6u\3\2\2\2\u02a7\u02aa\5x=\2\u02a8"+
		"\u02aa\5|?\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aaw\3\2\2\2\u02ab"+
		"\u02ac\7%\2\2\u02ac\u02ad\5z>\2\u02ad\u02ae\7&\2\2\u02aey\3\2\2\2\u02af"+
		"\u02b4\5\u00aeX\2\u02b0\u02b1\7$\2\2\u02b1\u02b3\5z>\2\u02b2\u02b0\3\2"+
		"\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"{\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7\'\2\2\u02b8\u02b9\5~@\2\u02b9"+
		"\u02ba\7(\2\2\u02ba}\3\2\2\2\u02bb\u02bc\5\u00b0Y\2\u02bc\u02bd\7!\2\2"+
		"\u02bd\u02c2\5\u00aeX\2\u02be\u02bf\7$\2\2\u02bf\u02c1\5~@\2\u02c0\u02be"+
		"\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\177\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c7\7)\2\2\u02c6\u02c8\5\u0082"+
		"B\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02cf\7*\2\2\u02ca\u02cd\7\34\2\2\u02cb\u02ce\5\u00b0Y\2\u02cc\u02ce"+
		"\7\61\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d0\3\2\2\2"+
		"\u02cf\u02ca\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2"+
		"\7\35\2\2\u02d2\u02d3\5\u0084C\2\u02d3\u0081\3\2\2\2\u02d4\u02d6\5\u00b0"+
		"Y\2\u02d5\u02d7\7\61\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02dc\3\2\2\2\u02d8\u02d9\7$\2\2\u02d9\u02db\5\u0082B\2\u02da\u02d8\3"+
		"\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u0083\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e2\5\u00a6T\2\u02e0\u02e2"+
		"\5\u00aeX\2\u02e1\u02df\3\2\2\2\u02e1\u02e0\3\2\2\2\u02e2\u0085\3\2\2"+
		"\2\u02e3\u02e4\5\u00b0Y\2\u02e4\u02e6\7)\2\2\u02e5\u02e7\5\\/\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7*"+
		"\2\2\u02e9\u02ea\5\u00a6T\2\u02ea\u0087\3\2\2\2\u02eb\u02ee\5\u00b0Y\2"+
		"\u02ec\u02ed\t\4\2\2\u02ed\u02ef\5\u00b2Z\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\7)\2\2\u02f1\u02f3\5\u008a"+
		"F\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\7*\2\2\u02f5\u02f6\7\36\2\2\u02f6\u0300\3\2\2\2\u02f7\u02f8\5\u0092"+
		"J\2\u02f8\u02fa\7)\2\2\u02f9\u02fb\5\u008aF\2\u02fa\u02f9\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7*\2\2\u02fd\u02fe\7\36"+
		"\2\2\u02fe\u0300\3\2\2\2\u02ff\u02eb\3\2\2\2\u02ff\u02f7\3\2\2\2\u0300"+
		"\u0089\3\2\2\2\u0301\u0306\5\u00aeX\2\u0302\u0303\7$\2\2\u0303\u0305\5"+
		"\u008aF\2\u0304\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2"+
		"\u0306\u0307\3\2\2\2\u0307\u008b\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a"+
		"\5\u008eH\2\u030a\u030b\7\36\2\2\u030b\u008d\3\2\2\2\u030c\u0312\5\u0092"+
		"J\2\u030d\u030f\7)\2\2\u030e\u0310\5\u008aF\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\7*\2\2\u0312\u030d\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0318\3\2\2\2\u0314\u0315\7#\2\2\u0315"+
		"\u0317\5\u008eH\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u008f\3\2\2\2\u031a\u0318\3\2\2\2\u031b"+
		"\u031c\7)\2\2\u031c\u031d\7\25\2\2\u031d\u031e\5\u00b0Y\2\u031e\u0320"+
		"\7)\2\2\u031f\u0321\5\u00aeX\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2"+
		"\u0321\u0322\3\2\2\2\u0322\u0323\7*\2\2\u0323\u032c\7*\2\2\u0324\u0325"+
		"\t\4\2\2\u0325\u0326\5\u00b2Z\2\u0326\u0328\7)\2\2\u0327\u0329\5\u00ae"+
		"X\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a"+
		"\u032b\7*\2\2\u032b\u032d\3\2\2\2\u032c\u0324\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u0091\3\2\2\2\u032e\u032f\5\u0094K\2\u032f\u0093\3\2\2\2\u0330"+
		"\u0334\5\u0096L\2\u0331\u0333\5\u0094K\2\u0332\u0331\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0095\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u0339\5\u009cO\2\u0338\u0337\3\2\2\2\u0338\u0339"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\5\u00b0Y\2\u033b\u033d\5\u0098"+
		"M\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e"+
		"\u0340\5\u009eP\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342"+
		"\3\2\2\2\u0341\u0343\t\4\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0097\3\2\2\2\u0344\u0345\7%\2\2\u0345\u0346\5\u009aN\2\u0346\u034a\7"+
		"&\2\2\u0347\u0349\5\u0098M\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0099\3\2\2\2\u034c\u034a\3\2"+
		"\2\2\u034d\u034e\5\u00aeX\2\u034e\u009b\3\2\2\2\u034f\u0350\7.\2\2\u0350"+
		"\u009d\3\2\2\2\u0351\u0352\7.\2\2\u0352\u009f\3\2\2\2\u0353\u0354\t\5"+
		"\2\2\u0354\u00a1\3\2\2\2\u0355\u0356\7\'\2\2\u0356\u035d\7(\2\2\u0357"+
		"\u0358\7\'\2\2\u0358\u0359\5\4\3\2\u0359\u035a\7(\2\2\u035a\u035d\3\2"+
		"\2\2\u035b\u035d\5\u00a4S\2\u035c\u0355\3\2\2\2\u035c\u0357\3\2\2\2\u035c"+
		"\u035b\3\2\2\2\u035d\u00a3\3\2\2\2\u035e\u035f\5 \21\2\u035f\u0360\7\36"+
		"\2\2\u0360\u0368\3\2\2\2\u0361\u0368\5&\24\2\u0362\u0368\5(\25\2\u0363"+
		"\u0368\5\66\34\2\u0364\u0368\5P)\2\u0365\u0368\5L\'\2\u0366\u0368\5N("+
		"\2\u0367\u035e\3\2\2\2\u0367\u0361\3\2\2\2\u0367\u0362\3\2\2\2\u0367\u0363"+
		"\3\2\2\2\u0367\u0364\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368"+
		"\u00a5\3\2\2\2\u0369\u036a\7\'\2\2\u036a\u0370\7(\2\2\u036b\u036c\7\'"+
		"\2\2\u036c\u036d\5\4\3\2\u036d\u036e\7(\2\2\u036e\u0370\3\2\2\2\u036f"+
		"\u0369\3\2\2\2\u036f\u036b\3\2\2\2\u0370\u00a7\3\2\2\2\u0371\u0373\7-"+
		"\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\5\36\20\2\u0375\u0377\7\61\2\2\u0376\u0375\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u037a\7+\2\2\u0379\u0378\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u037d\7,\2\2\u037c\u037b\3\2"+
		"\2\2\u037c\u037d\3\2\2\2\u037d\u03f5\3\2\2\2\u037e\u0380\7-\2\2\u037f"+
		"\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\5\u00b0"+
		"Y\2\u0382\u0383\t\4\2\2\u0383\u0385\5\u00b2Z\2\u0384\u0386\7\61\2\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389\7+"+
		"\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u038c\7,\2\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03f5\3\2"+
		"\2\2\u038d\u038f\7-\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u0392\5\u00b8]\2\u0391\u0390\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\5\u00b0Y\2\u0394\u0396\5\u00ba"+
		"^\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397"+
		"\u0399\7\61\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3"+
		"\2\2\2\u039a\u039c\7+\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039f\7,\2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2"+
		"\2\2\u039f\u03c8\3\2\2\2\u03a0\u03a2\7-\2\2\u03a1\u03a0\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\7\63\2\2\u03a4\u03a6\7"+
		"\61\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7"+
		"\u03a9\7+\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2"+
		"\2\2\u03aa\u03ac\7,\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03c8\3\2\2\2\u03ad\u03af\7-\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\7\64\2\2\u03b1\u03b3\7\61\2\2\u03b2"+
		"\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b6\7+"+
		"\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7"+
		"\u03b9\7,\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03c8\3\2"+
		"\2\2\u03ba\u03bc\7-\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03bf\7\65\2\2\u03be\u03c0\7\61\2\2\u03bf\u03be\3"+
		"\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03c3\7+\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c6\7,"+
		"\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u038e\3\2\2\2\u03c7\u03a1\3\2\2\2\u03c7\u03ae\3\2\2\2\u03c7\u03bb\3\2"+
		"\2\2\u03c8\u03f5\3\2\2\2\u03c9\u03cb\7-\2\2\u03ca\u03c9\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ce\5\u00b8]\2\u03cd\u03cc"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\5v<\2\u03d0"+
		"\u03d2\5\u00ba^\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4"+
		"\3\2\2\2\u03d3\u03d5\7\61\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2"+
		"\u03d5\u03d7\3\2\2\2\u03d6\u03d8\7+\2\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8"+
		"\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03db\7,\2\2\u03da\u03d9\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03f5\3\2\2\2\u03dc\u03f5\5Z.\2\u03dd\u03f5\5n8\2"+
		"\u03de\u03f5\5\u0080A\2\u03df\u03f5\5\u0092J\2\u03e0\u03f5\5\u0090I\2"+
		"\u03e1\u03e2\7\'\2\2\u03e2\u03e6\7(\2\2\u03e3\u03e4\7%\2\2\u03e4\u03e6"+
		"\7&\2\2\u03e5\u03e1\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03f5\3\2\2\2\u03e7"+
		"\u03e9\7-\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2"+
		"\2\2\u03ea\u03ec\5\u00aaV\2\u03eb\u03ed\7\61\2\2\u03ec\u03eb\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03f0\7+\2\2\u03ef\u03ee\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03f3\7,\2\2\u03f2"+
		"\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u0372\3\2"+
		"\2\2\u03f4\u037f\3\2\2\2\u03f4\u03c7\3\2\2\2\u03f4\u03ca\3\2\2\2\u03f4"+
		"\u03dc\3\2\2\2\u03f4\u03dd\3\2\2\2\u03f4\u03de\3\2\2\2\u03f4\u03df\3\2"+
		"\2\2\u03f4\u03e0\3\2\2\2\u03f4\u03e5\3\2\2\2\u03f4\u03e8\3\2\2\2\u03f5"+
		"\u00a9\3\2\2\2\u03f6\u03f7\7)\2\2\u03f7\u03f8\5\u00acW\2\u03f8\u03f9\7"+
		"*\2\2\u03f9\u00ab\3\2\2\2\u03fa\u03fe\5\u00a8U\2\u03fb\u03fd\5\u00acW"+
		"\2\u03fc\u03fb\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u00ad\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0405\5\u00a8U"+
		"\2\u0402\u0404\5\u00aeX\2\u0403\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405"+
		"\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u00af\3\2\2\2\u0407\u0405\3\2"+
		"\2\2\u0408\u0409\7/\2\2\u0409\u00b1\3\2\2\2\u040a\u040b\7/\2\2\u040b\u00b3"+
		"\3\2\2\2\u040c\u040d\7/\2\2\u040d\u00b5\3\2\2\2\u040e\u040f\7/\2\2\u040f"+
		"\u00b7\3\2\2\2\u0410\u0411\7.\2\2\u0411\u00b9\3\2\2\2\u0412\u0413\7.\2"+
		"\2\u0413\u00bb\3\2\2\2\u0414\u0415\7)\2\2\u0415\u00bd\3\2\2\2\u0416\u0417"+
		"\7*\2\2\u0417\u00bf\3\2\2\2\u0096\u00c8\u00db\u00e3\u00ee\u00f8\u00ff"+
		"\u0106\u0110\u0113\u0117\u011e\u0123\u0127\u012e\u0131\u013d\u0143\u014a"+
		"\u014e\u0153\u015d\u0164\u016d\u0170\u017a\u018c\u0193\u019b\u01a2\u01ab"+
		"\u01af\u01b3\u01ba\u01c5\u01cc\u01d0\u01d9\u01dd\u01e3\u01e5\u01eb\u01f2"+
		"\u01f6\u01fc\u01fe\u0202\u0204\u0209\u020d\u0213\u0215\u021b\u0221\u0225"+
		"\u022b\u022d\u0230\u0236\u023d\u0248\u0252\u025c\u0260\u0264\u026c\u0270"+
		"\u0273\u0276\u027c\u0280\u0284\u028c\u0290\u0293\u0297\u029b\u029f\u02a9"+
		"\u02b4\u02c2\u02c7\u02cd\u02cf\u02d6\u02dc\u02e1\u02e6\u02ee\u02f2\u02fa"+
		"\u02ff\u0306\u030f\u0312\u0318\u0320\u0328\u032c\u0334\u0338\u033c\u033f"+
		"\u0342\u034a\u035c\u0367\u036f\u0372\u0376\u0379\u037c\u037f\u0385\u0388"+
		"\u038b\u038e\u0391\u0395\u0398\u039b\u039e\u03a1\u03a5\u03a8\u03ab\u03ae"+
		"\u03b2\u03b5\u03b8\u03bb\u03bf\u03c2\u03c5\u03c7\u03ca\u03cd\u03d1\u03d4"+
		"\u03d7\u03da\u03e5\u03e8\u03ec\u03ef\u03f2\u03f4\u03fe\u0405";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}