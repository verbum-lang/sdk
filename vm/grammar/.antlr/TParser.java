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
		RULE_functionCall = 14, RULE_functionCallParam = 15, RULE_functionCallParamElements = 16, 
		RULE_blockRet = 17, RULE_blockConditional = 18, RULE_ifElementUnique = 19, 
		RULE_elifElements = 20, RULE_elifElementUnique = 21, RULE_elseElementUnique = 22, 
		RULE_conditionalBlockExpression = 23, RULE_conditionalBlockElements = 24, 
		RULE_blockLoop = 25, RULE_loopBlockElements = 26, RULE_loopComplete = 27, 
		RULE_loopConditional = 28, RULE_loopInfinite = 29, RULE_endOne = 30, RULE_endTwo = 31, 
		RULE_loopOneMembers = 32, RULE_loopTwoMembers = 33, RULE_loopThreeMembers = 34, 
		RULE_loopThreeMembersValues = 35, RULE_blockBreak = 36, RULE_blockNext = 37, 
		RULE_blockTryCatch = 38, RULE_tryUniqueElement = 39, RULE_catchUniqueElement = 40, 
		RULE_tryCatchElements = 41, RULE_blockFunction = 42, RULE_blockFunctionDeclarationAttr = 43, 
		RULE_functionParam = 44, RULE_functionAnonymousParam = 45, RULE_functionCodeBlock = 46, 
		RULE_blockInterface = 47, RULE_interfaceCodeBlock = 48, RULE_blockAbstraction = 49, 
		RULE_abstractionCodeBlock = 50, RULE_blockClass = 51, RULE_blockClassDeclarationAttr = 52, 
		RULE_classCommonDef = 53, RULE_classAnonymousParam = 54, RULE_classCodeBlock = 55, 
		RULE_blockArray = 56, RULE_indexArray = 57, RULE_indexArrayElements = 58, 
		RULE_associativeArray = 59, RULE_associativeArrayElements = 60, RULE_blockLambdaFunctions = 61, 
		RULE_lambdaFnParams = 62, RULE_lambdaFnCodeBlock = 63, RULE_blockClassConstructor = 64, 
		RULE_blockFunctionCall = 65, RULE_functionCallElements = 66, RULE_blockCascadingMethod = 67, 
		RULE_blockCascadingMethodAttr = 68, RULE_blockAnonymousObject = 69, RULE_blockAccessArrayElements = 70, 
		RULE_arrayAccessElements = 71, RULE_arrayAccessElementsItems = 72, RULE_accessBlockAr = 73, 
		RULE_arrayIndexAccess = 74, RULE_firstIncDec = 75, RULE_lastIncDec = 76, 
		RULE_blockPermissionTokens = 77, RULE_codeBlockFlowControl = 78, RULE_codeBlockFlowControlElements = 79, 
		RULE_codeBlockControl = 80, RULE_generalValue = 81, RULE_generalValueBlock = 82, 
		RULE_generalValueItems = 83, RULE_generalValueElements = 84, RULE_identifier = 85, 
		RULE_identifierB = 86, RULE_identifierC = 87, RULE_identifierD = 88, RULE_incDecOperatorsA = 89, 
		RULE_incDecOperatorsB = 90, RULE_openOpA = 91, RULE_closeOpA = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"blockAttribution", "attributionElements", "blockMultipleAssignments", 
			"variableMultipleAssignmentsModes", "functionCall", "functionCallParam", 
			"functionCallParamElements", "blockRet", "blockConditional", "ifElementUnique", 
			"elifElements", "elifElementUnique", "elseElementUnique", "conditionalBlockExpression", 
			"conditionalBlockElements", "blockLoop", "loopBlockElements", "loopComplete", 
			"loopConditional", "loopInfinite", "endOne", "endTwo", "loopOneMembers", 
			"loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", "blockBreak", 
			"blockNext", "blockTryCatch", "tryUniqueElement", "catchUniqueElement", 
			"tryCatchElements", "blockFunction", "blockFunctionDeclarationAttr", 
			"functionParam", "functionAnonymousParam", "functionCodeBlock", "blockInterface", 
			"interfaceCodeBlock", "blockAbstraction", "abstractionCodeBlock", "blockClass", 
			"blockClassDeclarationAttr", "classCommonDef", "classAnonymousParam", 
			"classCodeBlock", "blockArray", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "blockLambdaFunctions", "lambdaFnParams", 
			"lambdaFnCodeBlock", "blockClassConstructor", "blockFunctionCall", "functionCallElements", 
			"blockCascadingMethod", "blockCascadingMethodAttr", "blockAnonymousObject", 
			"blockAccessArrayElements", "arrayAccessElements", "arrayAccessElementsItems", 
			"accessBlockAr", "arrayIndexAccess", "firstIncDec", "lastIncDec", "blockPermissionTokens", 
			"codeBlockFlowControl", "codeBlockFlowControlElements", "codeBlockControl", 
			"generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
			"identifier", "identifierB", "identifierC", "identifierD", "incDecOperatorsA", 
			"incDecOperatorsB", "openOpA", "closeOpA"
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
			setState(186);
			sentences();
			setState(187);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				statements();
				setState(191);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(207);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(208);
				blockFunctionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(209);
				blockClassConstructor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(210);
				blockAttribution();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(211);
				blockMultipleAssignments();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(212);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(215);
				match(OpenBlock);
				setState(216);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(217);
				match(OpenBlock);
				setState(218);
				sentences();
				setState(219);
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
			setState(223);
			match(Use);
			setState(224);
			useValue();
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				useString();
				setState(229);
				match(Separator);
				setState(230);
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
			setState(234);
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
			setState(236);
			match(Var);
			setState(237);
			variableItem();
			setState(238);
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
			setState(240);
			variablePrefixModes();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(241);
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

			setState(244);
			generalValueElements();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(Separator);
					setState(246);
					variableItem();
					}
					} 
				}
				setState(251);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(252);
				identifier();
				}
				break;
			case 2:
				{
				setState(253);
				identifier();
				setState(254);
				match(TypeSpec);
				}
				break;
			}
			setState(258);
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
			setState(260);
			attributionElements();
			setState(261);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			identifier();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				identifierB();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(268);
				match(TypeSpec);
				}
			}

			setState(271);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(272);
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

			setState(275);
			generalValueElements();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(Separator);
					setState(277);
					attributionElements();
					}
					} 
				}
				setState(282);
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

	public static class BlockMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public BlockMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockMultipleAssignments; }
	}

	public final BlockMultipleAssignmentsContext blockMultipleAssignments() throws RecognitionException {
		BlockMultipleAssignmentsContext _localctx = new BlockMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockMultipleAssignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			variableMultipleAssignmentsModes();
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(285);
			generalValueElements();
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

	public static class VariableMultipleAssignmentsModesContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<VariableMultipleAssignmentsModesContext> variableMultipleAssignmentsModes() {
			return getRuleContexts(VariableMultipleAssignmentsModesContext.class);
		}
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes(int i) {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,i);
		}
		public List<TerminalNode> Attr() { return getTokens(TParser.Attr); }
		public TerminalNode Attr(int i) {
			return getToken(TParser.Attr, i);
		}
		public List<TerminalNode> AssignmentOperator() { return getTokens(TParser.AssignmentOperator); }
		public TerminalNode AssignmentOperator(int i) {
			return getToken(TParser.AssignmentOperator, i);
		}
		public VariableMultipleAssignmentsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsModes; }
	}

	public final VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() throws RecognitionException {
		VariableMultipleAssignmentsModesContext _localctx = new VariableMultipleAssignmentsModesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableMultipleAssignmentsModes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			generalValue();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					_la = _input.LA(1);
					if ( !(_la==Attr || _la==AssignmentOperator) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(290);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			identifier();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				identifierB();
				}
			}

			setState(301);
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
		enterRule(_localctx, 30, RULE_functionCallParam);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(OpenOp);
				setState(304);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(OpenOp);
				setState(306);
				functionCallParamElements();
				setState(307);
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
			setState(311);
			generalValue();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(Separator);
					setState(313);
					functionCallParamElements();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(319);
			match(Ret);
			setState(320);
			generalValueElements();
			setState(321);
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
			setState(323);
			ifElementUnique();
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(324);
				elifElements();
				}
				break;
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(327);
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
			setState(330);
			match(If);
			setState(331);
			conditionalBlockExpression();
			setState(332);
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
			setState(334);
			elifElementUnique();
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					elifElements();
					}
					} 
				}
				setState(340);
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
			setState(341);
			match(Elif);
			setState(342);
			conditionalBlockExpression();
			setState(343);
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
			setState(345);
			match(Else);
			setState(346);
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
			setState(348);
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
			setState(350);
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
			setState(352);
			match(For);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(353);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(354);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(355);
				loopComplete();
				}
				break;
			}
			setState(358);
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
			setState(360);
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
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(362);
				match(OpenOp);
				}
			}

			setState(365);
			loopOneMembers();
			setState(366);
			endOne();
			setState(367);
			loopTwoMembers();
			setState(368);
			endTwo();
			setState(369);
			loopThreeMembers();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(370);
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
			setState(373);
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
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(OpenOp);
				setState(376);
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
		enterRule(_localctx, 60, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
			setState(382);
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
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(Var);
				setState(385);
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
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
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
			setState(397);
			generalValueElements();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(398);
				match(Separator);
				setState(399);
				generalValueElements();
				}
				}
				setState(404);
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
		enterRule(_localctx, 72, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(Break);
			setState(406);
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
		enterRule(_localctx, 74, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Next);
			setState(409);
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
		enterRule(_localctx, 76, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			tryUniqueElement();
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(412);
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
		enterRule(_localctx, 78, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(Try);
			setState(416);
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
		enterRule(_localctx, 80, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Catch);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(419);
				match(OpenOp);
				}
			}

			setState(422);
			identifier();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(423);
				match(CloseOp);
				}
			}

			setState(426);
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
		enterRule(_localctx, 82, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		enterRule(_localctx, 84, RULE_blockFunction);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(OpenOp);
				setState(431);
				match(Function);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(432);
					identifier();
					}
				}

				setState(435);
				match(OpenOp);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(436);
					functionParam();
					}
				}

				setState(439);
				match(CloseOp);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(440);
					match(ArrowRight);
					setState(443);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(441);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(442);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(447);
				functionCodeBlock();
				setState(448);
				match(CloseOp);
				setState(449);
				match(OpenOp);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(450);
					functionAnonymousParam();
					}
				}

				setState(453);
				match(CloseOp);
				setState(454);
				match(End);
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

				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(472);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(473);
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
		enterRule(_localctx, 86, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(OpenOp);
				setState(479);
				match(Function);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(480);
					identifier();
					}
				}

				setState(483);
				match(OpenOp);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(484);
					functionParam();
					}
				}

				setState(487);
				match(CloseOp);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(488);
					match(ArrowRight);
					setState(491);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(489);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(490);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(495);
				functionCodeBlock();
				setState(496);
				match(CloseOp);
				setState(497);
				match(OpenOp);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(498);
					functionAnonymousParam();
					}
				}

				setState(501);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(Function);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(504);
					identifier();
					}
				}

				setState(507);
				match(OpenOp);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(508);
					functionParam();
					}
				}

				setState(511);
				match(CloseOp);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(512);
					match(ArrowRight);
					setState(515);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(513);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(514);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(519);
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
		enterRule(_localctx, 88, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Identifier);
			setState(523);
			match(TypeSpec);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(524);
				match(Separator);
				setState(525);
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
		enterRule(_localctx, 90, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 92, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 94, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Interface);
			setState(533);
			identifier();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(534);
				match(Extends);
				setState(535);
				identifierB();
				}
			}

			setState(538);
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
		enterRule(_localctx, 96, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		enterRule(_localctx, 98, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Abstract);
			setState(543);
			identifier();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(544);
				match(Extends);
				setState(545);
				identifierB();
				}
			}

			setState(548);
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
		enterRule(_localctx, 100, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		enterRule(_localctx, 102, RULE_blockClass);
		int _la;
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				openOpA();
				setState(553);
				match(New);
				setState(554);
				match(Class);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(555);
					identifier();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(558);
					match(Extends);
					setState(559);
					identifierB();
					}
				}

				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(562);
					match(Implements);
					setState(563);
					identifierC();
					}
				}

				setState(566);
				classCodeBlock();
				setState(567);
				closeOpA();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(568);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(569);
					identifierD();
					setState(570);
					match(OpenOp);
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(571);
						generalValueElements();
						}
					}

					setState(574);
					match(CloseOp);
					}
				}

				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==End) {
					{
					setState(578);
					match(End);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
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
		enterRule(_localctx, 104, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				openOpA();
				setState(585);
				match(New);
				setState(586);
				match(Class);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(587);
					identifier();
					}
				}

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

				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(594);
					match(Implements);
					setState(595);
					identifierC();
					}
				}

				setState(598);
				classCodeBlock();
				setState(599);
				closeOpA();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(600);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(601);
					identifierD();
					setState(602);
					match(OpenOp);
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(603);
						generalValueElements();
						}
					}

					setState(606);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
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
		enterRule(_localctx, 106, RULE_classCommonDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(Class);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(614);
				identifier();
				}
			}

			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(617);
				match(Extends);
				setState(618);
				identifierB();
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(621);
				match(Implements);
				setState(622);
				identifierC();
				}
			}

			setState(625);
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
		enterRule(_localctx, 108, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		enterRule(_localctx, 110, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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
		enterRule(_localctx, 112, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(631);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(632);
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
		enterRule(_localctx, 114, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(OpenArIndex);
			setState(636);
			indexArrayElements();
			setState(637);
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
		enterRule(_localctx, 116, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			generalValueElements();
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					match(Separator);
					setState(641);
					indexArrayElements();
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		enterRule(_localctx, 118, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(OpenBlock);
			setState(648);
			associativeArrayElements();
			setState(649);
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
		enterRule(_localctx, 120, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			identifier();
			setState(652);
			match(TwoPoint);
			setState(653);
			generalValueElements();
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654);
					match(Separator);
					setState(655);
					associativeArrayElements();
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 122, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(OpenOp);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(662);
				lambdaFnParams();
				}
			}

			setState(665);
			match(CloseOp);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(666);
				match(ArrowRight);
				setState(669);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(667);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(668);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(673);
			match(ARightLB);
			setState(674);
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
		enterRule(_localctx, 124, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			identifier();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(677);
				match(TypeSpec);
				}
			}

			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					match(Separator);
					setState(681);
					lambdaFnParams();
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		enterRule(_localctx, 126, RULE_lambdaFnCodeBlock);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
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
		enterRule(_localctx, 128, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			identifier();
			setState(692);
			match(OpenOp);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(693);
				functionParam();
				}
			}

			setState(696);
			match(CloseOp);
			setState(697);
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
		enterRule(_localctx, 130, RULE_blockFunctionCall);
		int _la;
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				identifier();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(700);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(701);
					identifierB();
					}
				}

				setState(704);
				match(OpenOp);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(705);
					functionCallElements();
					}
				}

				setState(708);
				match(CloseOp);
				setState(709);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				blockAccessArrayElements();
				setState(712);
				match(OpenOp);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(713);
					functionCallElements();
					}
				}

				setState(716);
				match(CloseOp);
				setState(717);
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
		enterRule(_localctx, 132, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			generalValueElements();
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					match(Separator);
					setState(723);
					functionCallElements();
					}
					} 
				}
				setState(728);
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
		enterRule(_localctx, 134, RULE_blockCascadingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			blockCascadingMethodAttr();
			setState(730);
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
		enterRule(_localctx, 136, RULE_blockCascadingMethodAttr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			blockAccessArrayElements();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(733);
				match(OpenOp);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(734);
					functionCallElements();
					}
				}

				setState(737);
				match(CloseOp);
				}
			}

			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					match(PointPoint);
					setState(741);
					blockCascadingMethodAttr();
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		enterRule(_localctx, 138, RULE_blockAnonymousObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(OpenOp);
			setState(748);
			match(New);
			setState(749);
			identifier();
			setState(750);
			match(OpenOp);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(751);
				generalValueElements();
				}
			}

			setState(754);
			match(CloseOp);
			setState(755);
			match(CloseOp);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(757);
				identifierB();
				setState(758);
				match(OpenOp);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(759);
					generalValueElements();
					}
				}

				setState(762);
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
		enterRule(_localctx, 140, RULE_blockAccessArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
		enterRule(_localctx, 142, RULE_arrayAccessElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			arrayAccessElementsItems();
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					arrayAccessElements();
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arrayAccessElementsItems);
		int _la;
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				identifier();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(776);
					accessBlockAr();
					}
					break;
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(779);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(782);
					firstIncDec();
					}
				}

				setState(785);
				identifier();
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(786);
					accessBlockAr();
					}
					break;
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(789);
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				identifier();
				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(793);
					accessBlockAr();
					}
					break;
				}
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(796);
					lastIncDec();
					}
					break;
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(799);
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
		enterRule(_localctx, 146, RULE_accessBlockAr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(OpenArIndex);
			setState(805);
			arrayIndexAccess();
			setState(806);
			match(CloseArIndex);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					accessBlockAr();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 148, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
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
		enterRule(_localctx, 150, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
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
		enterRule(_localctx, 152, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
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
		enterRule(_localctx, 154, RULE_blockPermissionTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
		enterRule(_localctx, 156, RULE_codeBlockFlowControl);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(OpenBlock);
				setState(822);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(OpenBlock);
				setState(824);
				sentences();
				setState(825);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
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
		enterRule(_localctx, 158, RULE_codeBlockFlowControlElements);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				functionCall();
				setState(831);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
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
		enterRule(_localctx, 160, RULE_codeBlockControl);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				match(OpenBlock);
				setState(842);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(OpenBlock);
				setState(844);
				sentences();
				setState(845);
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
		enterRule(_localctx, 162, RULE_generalValue);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(849);
					match(Not);
					}
				}

				setState(852);
				identifier();
				setState(853);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(854);
				identifierB();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(855);
					match(TypeSpec);
					}
				}

				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(858);
					match(ArithmeticOperator);
					}
				}

				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(861);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(864);
						match(Not);
						}
					}

					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(867);
						incDecOperatorsA();
						}
					}

					setState(870);
					identifier();
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(871);
						incDecOperatorsB();
						}
						break;
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(874);
						match(TypeSpec);
						}
					}

					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(877);
						match(ArithmeticOperator);
						}
					}

					setState(881);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(880);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(883);
						match(Not);
						}
					}

					setState(886);
					match(Integer);
					setState(888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(887);
						match(TypeSpec);
						}
					}

					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(890);
						match(ArithmeticOperator);
						}
					}

					setState(894);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(893);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(896);
						match(Not);
						}
					}

					setState(899);
					match(Float);
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(900);
						match(TypeSpec);
						}
					}

					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(903);
						match(ArithmeticOperator);
						}
					}

					setState(907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(906);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(909);
						match(Not);
						}
					}

					setState(912);
					match(String);
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(913);
						match(TypeSpec);
						}
					}

					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(916);
						match(ArithmeticOperator);
						}
					}

					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(919);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(924);
					match(Not);
					}
				}

				setState(927);
				functionCall();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(928);
					match(TypeSpec);
					}
				}

				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(931);
					match(ArithmeticOperator);
					}
				}

				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(934);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(937);
					match(Not);
					}
				}

				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(940);
					incDecOperatorsA();
					}
				}

				setState(943);
				blockArray();
				setState(945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(944);
					incDecOperatorsB();
					}
					break;
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(947);
					match(TypeSpec);
					}
				}

				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(950);
					match(ArithmeticOperator);
					}
				}

				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(953);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(956);
				blockFunctionDeclarationAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(957);
				blockClassDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(958);
				blockLambdaFunctions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(959);
				blockAccessArrayElements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(960);
				blockAnonymousObject();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(965);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(961);
					match(OpenBlock);
					setState(962);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(963);
					match(OpenArIndex);
					setState(964);
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
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(967);
					match(Not);
					}
				}

				setState(970);
				generalValueBlock();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(971);
					match(TypeSpec);
					}
				}

				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(974);
					match(ArithmeticOperator);
					}
				}

				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(977);
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
		enterRule(_localctx, 164, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(OpenOp);
			setState(983);
			generalValueItems();
			setState(984);
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
		enterRule(_localctx, 166, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			generalValue();
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(987);
					generalValueItems();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 168, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			generalValue();
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					generalValueElements();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 170, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
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
		enterRule(_localctx, 172, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
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
		enterRule(_localctx, 174, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
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
		enterRule(_localctx, 176, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
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
		enterRule(_localctx, 178, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
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
		enterRule(_localctx, 180, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
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
		enterRule(_localctx, 182, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
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
		enterRule(_localctx, 184, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u03fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c5\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d8\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00e0\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00eb\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00f5\n\n\3\n\3\n\3\n\7\n\u00fa\n\n"+
		"\f\n\16\n\u00fd\13\n\3\13\3\13\3\13\3\13\5\13\u0103\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u010d\n\r\3\r\5\r\u0110\n\r\3\r\3\r\5\r\u0114"+
		"\n\r\3\r\3\r\3\r\7\r\u0119\n\r\f\r\16\r\u011c\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u0126\n\17\f\17\16\17\u0129\13\17\3\20\3\20"+
		"\3\20\5\20\u012e\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138"+
		"\n\21\3\22\3\22\3\22\7\22\u013d\n\22\f\22\16\22\u0140\13\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\5\24\u0148\n\24\3\24\5\24\u014b\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\7\26\u0153\n\26\f\26\16\26\u0156\13\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0167"+
		"\n\33\3\33\3\33\3\34\3\34\3\35\5\35\u016e\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0176\n\35\3\36\3\36\3\37\3\37\3\37\5\37\u017d\n\37\3 \3 \3"+
		"!\3!\3\"\3\"\3\"\5\"\u0186\n\"\3#\3#\5#\u018a\n#\3$\3$\5$\u018e\n$\3%"+
		"\3%\3%\7%\u0193\n%\f%\16%\u0196\13%\3&\3&\3&\3\'\3\'\3\'\3(\3(\5(\u01a0"+
		"\n(\3)\3)\3)\3*\3*\5*\u01a7\n*\3*\3*\5*\u01ab\n*\3*\3*\3+\3+\3,\3,\3,"+
		"\5,\u01b4\n,\3,\3,\5,\u01b8\n,\3,\3,\3,\3,\5,\u01be\n,\5,\u01c0\n,\3,"+
		"\3,\3,\3,\5,\u01c6\n,\3,\3,\3,\3,\3,\5,\u01cd\n,\3,\3,\5,\u01d1\n,\3,"+
		"\3,\3,\3,\5,\u01d7\n,\5,\u01d9\n,\3,\3,\5,\u01dd\n,\5,\u01df\n,\3-\3-"+
		"\3-\5-\u01e4\n-\3-\3-\5-\u01e8\n-\3-\3-\3-\3-\5-\u01ee\n-\5-\u01f0\n-"+
		"\3-\3-\3-\3-\5-\u01f6\n-\3-\3-\3-\3-\5-\u01fc\n-\3-\3-\5-\u0200\n-\3-"+
		"\3-\3-\3-\5-\u0206\n-\5-\u0208\n-\3-\5-\u020b\n-\3.\3.\3.\3.\5.\u0211"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u021b\n\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\5\63\u0225\n\63\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\5\65\u022f\n\65\3\65\3\65\5\65\u0233\n\65\3\65\3\65\5\65\u0237"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u023f\n\65\3\65\3\65\5\65\u0243"+
		"\n\65\3\65\5\65\u0246\n\65\3\65\5\65\u0249\n\65\3\66\3\66\3\66\3\66\5"+
		"\66\u024f\n\66\3\66\3\66\5\66\u0253\n\66\3\66\3\66\5\66\u0257\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u025f\n\66\3\66\3\66\5\66\u0263\n\66\3"+
		"\66\5\66\u0266\n\66\3\67\3\67\5\67\u026a\n\67\3\67\3\67\5\67\u026e\n\67"+
		"\3\67\3\67\5\67\u0272\n\67\3\67\3\67\38\38\39\39\3:\3:\5:\u027c\n:\3;"+
		"\3;\3;\3;\3<\3<\3<\7<\u0285\n<\f<\16<\u0288\13<\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3>\7>\u0293\n>\f>\16>\u0296\13>\3?\3?\5?\u029a\n?\3?\3?\3?\3?\5?\u02a0"+
		"\n?\5?\u02a2\n?\3?\3?\3?\3@\3@\5@\u02a9\n@\3@\3@\7@\u02ad\n@\f@\16@\u02b0"+
		"\13@\3A\3A\5A\u02b4\nA\3B\3B\3B\5B\u02b9\nB\3B\3B\3B\3C\3C\3C\5C\u02c1"+
		"\nC\3C\3C\5C\u02c5\nC\3C\3C\3C\3C\3C\3C\5C\u02cd\nC\3C\3C\3C\5C\u02d2"+
		"\nC\3D\3D\3D\7D\u02d7\nD\fD\16D\u02da\13D\3E\3E\3E\3F\3F\3F\5F\u02e2\n"+
		"F\3F\5F\u02e5\nF\3F\3F\7F\u02e9\nF\fF\16F\u02ec\13F\3G\3G\3G\3G\3G\5G"+
		"\u02f3\nG\3G\3G\3G\3G\3G\3G\5G\u02fb\nG\3G\3G\5G\u02ff\nG\3H\3H\3I\3I"+
		"\7I\u0305\nI\fI\16I\u0308\13I\3J\3J\5J\u030c\nJ\3J\5J\u030f\nJ\3J\5J\u0312"+
		"\nJ\3J\3J\5J\u0316\nJ\3J\5J\u0319\nJ\3J\3J\5J\u031d\nJ\3J\5J\u0320\nJ"+
		"\3J\5J\u0323\nJ\5J\u0325\nJ\3K\3K\3K\3K\7K\u032b\nK\fK\16K\u032e\13K\3"+
		"L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u033f\nP\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\5Q\u034a\nQ\3R\3R\3R\3R\3R\3R\5R\u0352\nR\3S\5S\u0355\n"+
		"S\3S\3S\3S\3S\5S\u035b\nS\3S\5S\u035e\nS\3S\5S\u0361\nS\3S\5S\u0364\n"+
		"S\3S\5S\u0367\nS\3S\3S\5S\u036b\nS\3S\5S\u036e\nS\3S\5S\u0371\nS\3S\5"+
		"S\u0374\nS\3S\5S\u0377\nS\3S\3S\5S\u037b\nS\3S\5S\u037e\nS\3S\5S\u0381"+
		"\nS\3S\5S\u0384\nS\3S\3S\5S\u0388\nS\3S\5S\u038b\nS\3S\5S\u038e\nS\3S"+
		"\5S\u0391\nS\3S\3S\5S\u0395\nS\3S\5S\u0398\nS\3S\5S\u039b\nS\5S\u039d"+
		"\nS\3S\5S\u03a0\nS\3S\3S\5S\u03a4\nS\3S\5S\u03a7\nS\3S\5S\u03aa\nS\3S"+
		"\5S\u03ad\nS\3S\5S\u03b0\nS\3S\3S\5S\u03b4\nS\3S\5S\u03b7\nS\3S\5S\u03ba"+
		"\nS\3S\5S\u03bd\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u03c8\nS\3S\5S\u03cb"+
		"\nS\3S\3S\5S\u03cf\nS\3S\5S\u03d2\nS\3S\5S\u03d5\nS\5S\u03d7\nS\3T\3T"+
		"\3T\3T\3U\3U\7U\u03df\nU\fU\16U\u03e2\13U\3V\3V\7V\u03e6\nV\fV\16V\u03e9"+
		"\13V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3^\2\2_\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\2\6\4\2\25\25\31"+
		"\31\4\2\37\37,,\4\2  \"\"\4\2\13\17\30\30\2\u0451\2\u00bc\3\2\2\2\4\u00c4"+
		"\3\2\2\2\6\u00d7\3\2\2\2\b\u00df\3\2\2\2\n\u00e1\3\2\2\2\f\u00ea\3\2\2"+
		"\2\16\u00ec\3\2\2\2\20\u00ee\3\2\2\2\22\u00f2\3\2\2\2\24\u0102\3\2\2\2"+
		"\26\u0106\3\2\2\2\30\u0109\3\2\2\2\32\u011d\3\2\2\2\34\u0122\3\2\2\2\36"+
		"\u012a\3\2\2\2 \u0137\3\2\2\2\"\u0139\3\2\2\2$\u0141\3\2\2\2&\u0145\3"+
		"\2\2\2(\u014c\3\2\2\2*\u0150\3\2\2\2,\u0157\3\2\2\2.\u015b\3\2\2\2\60"+
		"\u015e\3\2\2\2\62\u0160\3\2\2\2\64\u0162\3\2\2\2\66\u016a\3\2\2\28\u016d"+
		"\3\2\2\2:\u0177\3\2\2\2<\u017c\3\2\2\2>\u017e\3\2\2\2@\u0180\3\2\2\2B"+
		"\u0185\3\2\2\2D\u0189\3\2\2\2F\u018d\3\2\2\2H\u018f\3\2\2\2J\u0197\3\2"+
		"\2\2L\u019a\3\2\2\2N\u019d\3\2\2\2P\u01a1\3\2\2\2R\u01a4\3\2\2\2T\u01ae"+
		"\3\2\2\2V\u01de\3\2\2\2X\u020a\3\2\2\2Z\u020c\3\2\2\2\\\u0212\3\2\2\2"+
		"^\u0214\3\2\2\2`\u0216\3\2\2\2b\u021e\3\2\2\2d\u0220\3\2\2\2f\u0228\3"+
		"\2\2\2h\u0248\3\2\2\2j\u0265\3\2\2\2l\u0267\3\2\2\2n\u0275\3\2\2\2p\u0277"+
		"\3\2\2\2r\u027b\3\2\2\2t\u027d\3\2\2\2v\u0281\3\2\2\2x\u0289\3\2\2\2z"+
		"\u028d\3\2\2\2|\u0297\3\2\2\2~\u02a6\3\2\2\2\u0080\u02b3\3\2\2\2\u0082"+
		"\u02b5\3\2\2\2\u0084\u02d1\3\2\2\2\u0086\u02d3\3\2\2\2\u0088\u02db\3\2"+
		"\2\2\u008a\u02de\3\2\2\2\u008c\u02ed\3\2\2\2\u008e\u0300\3\2\2\2\u0090"+
		"\u0302\3\2\2\2\u0092\u0324\3\2\2\2\u0094\u0326\3\2\2\2\u0096\u032f\3\2"+
		"\2\2\u0098\u0331\3\2\2\2\u009a\u0333\3\2\2\2\u009c\u0335\3\2\2\2\u009e"+
		"\u033e\3\2\2\2\u00a0\u0349\3\2\2\2\u00a2\u0351\3\2\2\2\u00a4\u03d6\3\2"+
		"\2\2\u00a6\u03d8\3\2\2\2\u00a8\u03dc\3\2\2\2\u00aa\u03e3\3\2\2\2\u00ac"+
		"\u03ea\3\2\2\2\u00ae\u03ec\3\2\2\2\u00b0\u03ee\3\2\2\2\u00b2\u03f0\3\2"+
		"\2\2\u00b4\u03f2\3\2\2\2\u00b6\u03f4\3\2\2\2\u00b8\u03f6\3\2\2\2\u00ba"+
		"\u03f8\3\2\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\2\2\3\u00be\3\3\2\2\2"+
		"\u00bf\u00c5\5\6\4\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\5\4\3\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\5\3\2\2\2\u00c6\u00d8\5\n\6\2\u00c7\u00d8\5\20\t"+
		"\2\u00c8\u00d8\5$\23\2\u00c9\u00d8\5&\24\2\u00ca\u00d8\5\64\33\2\u00cb"+
		"\u00d8\5J&\2\u00cc\u00d8\5L\'\2\u00cd\u00d8\5N(\2\u00ce\u00d8\5V,\2\u00cf"+
		"\u00d8\5`\61\2\u00d0\u00d8\5d\63\2\u00d1\u00d8\5h\65\2\u00d2\u00d8\5\u0084"+
		"C\2\u00d3\u00d8\5\u0082B\2\u00d4\u00d8\5\26\f\2\u00d5\u00d8\5\32\16\2"+
		"\u00d6\u00d8\5\u009cO\2\u00d7\u00c6\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7"+
		"\u00c8\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d7\u00cb\3\2"+
		"\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2"+
		"\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\7\3\2\2\2\u00d9\u00da\7\'\2\2\u00da\u00e0\7(\2\2"+
		"\u00db\u00dc\7\'\2\2\u00dc\u00dd\5\4\3\2\u00dd\u00de\7(\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\t\3\2\2\2\u00e1"+
		"\u00e2\7\3\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\7\36\2\2\u00e4\13\3\2\2"+
		"\2\u00e5\u00eb\5\16\b\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8\7$\2\2\u00e8"+
		"\u00e9\5\f\7\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\7\65\2\2\u00ed\17\3\2\2\2\u00ee\u00ef"+
		"\7\4\2\2\u00ef\u00f0\5\22\n\2\u00f0\u00f1\7\36\2\2\u00f1\21\3\2\2\2\u00f2"+
		"\u00f4\5\24\13\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\5\u00aaV\2\u00f7\u00f8\7$\2\2\u00f8"+
		"\u00fa\5\22\n\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0103\5\u00acW\2\u00ff\u0100\5\u00acW\2\u0100\u0101\7\61\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\t\3\2\2\u0105\25\3\2\2\2\u0106\u0107\5\30\r\2\u0107\u0108\7\36"+
		"\2\2\u0108\27\3\2\2\2\u0109\u010c\5\u00acW\2\u010a\u010b\t\4\2\2\u010b"+
		"\u010d\5\u00aeX\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0110\7\61\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0113\t\3\2\2\u0112\u0114\t\2\2\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011a\5\u00aaV"+
		"\2\u0116\u0117\7$\2\2\u0117\u0119\5\30\r\2\u0118\u0116\3\2\2\2\u0119\u011c"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\31\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\5\34\17\2\u011e\u011f\t\3\2\2\u011f\u0120\5"+
		"\u00aaV\2\u0120\u0121\7\36\2\2\u0121\33\3\2\2\2\u0122\u0127\5\u00a4S\2"+
		"\u0123\u0124\t\3\2\2\u0124\u0126\5\34\17\2\u0125\u0123\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\35\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012d\5\u00acW\2\u012b\u012c\t\4\2\2\u012c\u012e"+
		"\5\u00aeX\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2"+
		"\2\u012f\u0130\5 \21\2\u0130\37\3\2\2\2\u0131\u0132\7)\2\2\u0132\u0138"+
		"\7*\2\2\u0133\u0134\7)\2\2\u0134\u0135\5\"\22\2\u0135\u0136\7*\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0133\3\2\2\2\u0138!\3\2\2\2"+
		"\u0139\u013e\5\u00a4S\2\u013a\u013b\7$\2\2\u013b\u013d\5\"\22\2\u013c"+
		"\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f#\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\t\2\2\u0142\u0143"+
		"\5\u00aaV\2\u0143\u0144\7\36\2\2\u0144%\3\2\2\2\u0145\u0147\5(\25\2\u0146"+
		"\u0148\5*\26\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u014b\5.\30\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\'\3\2\2\2\u014c\u014d\7\5\2\2\u014d\u014e\5\60\31\2\u014e\u014f\5\62"+
		"\32\2\u014f)\3\2\2\2\u0150\u0154\5,\27\2\u0151\u0153\5*\26\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"+\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\6\2\2\u0158\u0159\5\60\31"+
		"\2\u0159\u015a\5\62\32\2\u015a-\3\2\2\2\u015b\u015c\7\7\2\2\u015c\u015d"+
		"\5\62\32\2\u015d/\3\2\2\2\u015e\u015f\5\u00aaV\2\u015f\61\3\2\2\2\u0160"+
		"\u0161\5\u009eP\2\u0161\63\3\2\2\2\u0162\u0166\7\b\2\2\u0163\u0167\5<"+
		"\37\2\u0164\u0167\5:\36\2\u0165\u0167\58\35\2\u0166\u0163\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5\66"+
		"\34\2\u0169\65\3\2\2\2\u016a\u016b\5\u009eP\2\u016b\67\3\2\2\2\u016c\u016e"+
		"\7)\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\5B\"\2\u0170\u0171\5> \2\u0171\u0172\5D#\2\u0172\u0173\5@!\2\u0173"+
		"\u0175\5F$\2\u0174\u0176\7*\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2"+
		"\2\u01769\3\2\2\2\u0177\u0178\5D#\2\u0178;\3\2\2\2\u0179\u017a\7)\2\2"+
		"\u017a\u017d\7*\2\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d=\3\2\2\2\u017e\u017f\7\36\2\2\u017f?\3\2\2\2\u0180\u0181"+
		"\7\36\2\2\u0181A\3\2\2\2\u0182\u0183\7\4\2\2\u0183\u0186\5\22\n\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0184\3\2\2\2\u0186C\3\2\2\2"+
		"\u0187\u018a\5\u00aaV\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018aE\3\2\2\2\u018b\u018e\5H%\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eG\3\2\2\2\u018f\u0194\5\u00aa"+
		"V\2\u0190\u0191\7$\2\2\u0191\u0193\5\u00aaV\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195I\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u0198\7\26\2\2\u0198\u0199\7\36\2\2\u0199K"+
		"\3\2\2\2\u019a\u019b\7\27\2\2\u019b\u019c\7\36\2\2\u019cM\3\2\2\2\u019d"+
		"\u019f\5P)\2\u019e\u01a0\5R*\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0O\3\2\2\2\u01a1\u01a2\7\32\2\2\u01a2\u01a3\5T+\2\u01a3Q\3\2\2\2"+
		"\u01a4\u01a6\7\33\2\2\u01a5\u01a7\7)\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\5\u00acW\2\u01a9\u01ab\7*\2\2"+
		"\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\5T+\2\u01adS\3\2\2\2\u01ae\u01af\5\u009eP\2\u01afU\3\2\2\2\u01b0\u01b1"+
		"\7)\2\2\u01b1\u01b3\7\n\2\2\u01b2\u01b4\5\u00acW\2\u01b3\u01b2\3\2\2\2"+
		"\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\7)\2\2\u01b6\u01b8"+
		"\5Z.\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bf\7*\2\2\u01ba\u01bd\7\34\2\2\u01bb\u01be\5\u00aeX\2\u01bc\u01be"+
		"\7\61\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c0\3\2\2\2"+
		"\u01bf\u01ba\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\5^\60\2\u01c2\u01c3\7*\2\2\u01c3\u01c5\7)\2\2\u01c4\u01c6\5\\/\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7*"+
		"\2\2\u01c8\u01c9\7\36\2\2\u01c9\u01df\3\2\2\2\u01ca\u01cc\7\n\2\2\u01cb"+
		"\u01cd\5\u00acW\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01d0\7)\2\2\u01cf\u01d1\5Z.\2\u01d0\u01cf\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d8\7*\2\2\u01d3\u01d6\7\34"+
		"\2\2\u01d4\u01d7\5\u00aeX\2\u01d5\u01d7\7\61\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01dc\3\2\2\2\u01da\u01dd\5^\60\2\u01db\u01dd\7\36\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01b0\3\2"+
		"\2\2\u01de\u01ca\3\2\2\2\u01dfW\3\2\2\2\u01e0\u01e1\7)\2\2\u01e1\u01e3"+
		"\7\n\2\2\u01e2\u01e4\5\u00acW\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2"+
		"\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\7)\2\2\u01e6\u01e8\5Z.\2\u01e7\u01e6"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ef\7*\2\2\u01ea"+
		"\u01ed\7\34\2\2\u01eb\u01ee\5\u00aeX\2\u01ec\u01ee\7\61\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ea\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5^\60\2\u01f2\u01f3\7*"+
		"\2\2\u01f3\u01f5\7)\2\2\u01f4\u01f6\5\\/\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7*\2\2\u01f8\u020b\3\2\2\2\u01f9"+
		"\u01fb\7\n\2\2\u01fa\u01fc\5\u00acW\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7)\2\2\u01fe\u0200\5Z.\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0207\7*"+
		"\2\2\u0202\u0205\7\34\2\2\u0203\u0206\5\u00aeX\2\u0204\u0206\7\61\2\2"+
		"\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0202"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\5^\60\2\u020a"+
		"\u01e0\3\2\2\2\u020a\u01f9\3\2\2\2\u020bY\3\2\2\2\u020c\u020d\7/\2\2\u020d"+
		"\u0210\7\61\2\2\u020e\u020f\7$\2\2\u020f\u0211\5Z.\2\u0210\u020e\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211[\3\2\2\2\u0212\u0213\5\u00aaV\2\u0213]\3"+
		"\2\2\2\u0214\u0215\5\u00a2R\2\u0215_\3\2\2\2\u0216\u0217\7\20\2\2\u0217"+
		"\u021a\5\u00acW\2\u0218\u0219\7\22\2\2\u0219\u021b\5\u00aeX\2\u021a\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\5b\62\2\u021d"+
		"a\3\2\2\2\u021e\u021f\5\u00a2R\2\u021fc\3\2\2\2\u0220\u0221\7\21\2\2\u0221"+
		"\u0224\5\u00acW\2\u0222\u0223\7\22\2\2\u0223\u0225\5\u00aeX\2\u0224\u0222"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\5f\64\2\u0227"+
		"e\3\2\2\2\u0228\u0229\5\u00a2R\2\u0229g\3\2\2\2\u022a\u022b\5\u00b8]\2"+
		"\u022b\u022c\7\25\2\2\u022c\u022e\7\23\2\2\u022d\u022f\5\u00acW\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0231\7\22"+
		"\2\2\u0231\u0233\5\u00aeX\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0235\7\24\2\2\u0235\u0237\5\u00b0Y\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\5p9\2\u0239"+
		"\u0242\5\u00ba^\2\u023a\u023b\t\4\2\2\u023b\u023c\5\u00b2Z\2\u023c\u023e"+
		"\7)\2\2\u023d\u023f\5\u00aaV\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2"+
		"\u023f\u0240\3\2\2\2\u0240\u0241\7*\2\2\u0241\u0243\3\2\2\2\u0242\u023a"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0246\7\36\2\2"+
		"\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0249"+
		"\5l\67\2\u0248\u022a\3\2\2\2\u0248\u0247\3\2\2\2\u0249i\3\2\2\2\u024a"+
		"\u024b\5\u00b8]\2\u024b\u024c\7\25\2\2\u024c\u024e\7\23\2\2\u024d\u024f"+
		"\5\u00acW\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\3\2\2"+
		"\2\u0250\u0251\7\22\2\2\u0251\u0253\5\u00aeX\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0255\7\24\2\2\u0255\u0257\5"+
		"\u00b0Y\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2"+
		"\u0258\u0259\5p9\2\u0259\u0262\5\u00ba^\2\u025a\u025b\t\4\2\2\u025b\u025c"+
		"\5\u00b2Z\2\u025c\u025e\7)\2\2\u025d\u025f\5\u00aaV\2\u025e\u025d\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\7*\2\2\u0261"+
		"\u0263\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2"+
		"\2\2\u0264\u0266\5l\67\2\u0265\u024a\3\2\2\2\u0265\u0264\3\2\2\2\u0266"+
		"k\3\2\2\2\u0267\u0269\7\23\2\2\u0268\u026a\5\u00acW\2\u0269\u0268\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u026c\7\22\2\2\u026c"+
		"\u026e\5\u00aeX\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u0270\7\24\2\2\u0270\u0272\5\u00b0Y\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5p9\2\u0274m\3"+
		"\2\2\2\u0275\u0276\5\u00aaV\2\u0276o\3\2\2\2\u0277\u0278\5\u00a2R\2\u0278"+
		"q\3\2\2\2\u0279\u027c\5t;\2\u027a\u027c\5x=\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027a\3\2\2\2\u027cs\3\2\2\2\u027d\u027e\7%\2\2\u027e\u027f\5v<\2\u027f"+
		"\u0280\7&\2\2\u0280u\3\2\2\2\u0281\u0286\5\u00aaV\2\u0282\u0283\7$\2\2"+
		"\u0283\u0285\5v<\2\u0284\u0282\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287w\3\2\2\2\u0288\u0286\3\2\2\2\u0289"+
		"\u028a\7\'\2\2\u028a\u028b\5z>\2\u028b\u028c\7(\2\2\u028cy\3\2\2\2\u028d"+
		"\u028e\5\u00acW\2\u028e\u028f\7!\2\2\u028f\u0294\5\u00aaV\2\u0290\u0291"+
		"\7$\2\2\u0291\u0293\5z>\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295{\3\2\2\2\u0296\u0294\3\2\2\2"+
		"\u0297\u0299\7)\2\2\u0298\u029a\5~@\2\u0299\u0298\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02a1\7*\2\2\u029c\u029f\7\34\2\2\u029d"+
		"\u02a0\5\u00acW\2\u029e\u02a0\7\61\2\2\u029f\u029d\3\2\2\2\u029f\u029e"+
		"\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029c\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\7\35\2\2\u02a4\u02a5\5\u0080A\2\u02a5}\3\2"+
		"\2\2\u02a6\u02a8\5\u00acW\2\u02a7\u02a9\7\61\2\2\u02a8\u02a7\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ae\3\2\2\2\u02aa\u02ab\7$\2\2\u02ab\u02ad\5~@"+
		"\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\177\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\5\u00a2R\2"+
		"\u02b2\u02b4\5\u00aaV\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u0081\3\2\2\2\u02b5\u02b6\5\u00acW\2\u02b6\u02b8\7)\2\2\u02b7\u02b9\5"+
		"Z.\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\7*\2\2\u02bb\u02bc\5\u00a2R\2\u02bc\u0083\3\2\2\2\u02bd\u02c0\5"+
		"\u00acW\2\u02be\u02bf\t\4\2\2\u02bf\u02c1\5\u00aeX\2\u02c0\u02be\3\2\2"+
		"\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\7)\2\2\u02c3\u02c5"+
		"\5\u0086D\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2"+
		"\2\u02c6\u02c7\7*\2\2\u02c7\u02c8\7\36\2\2\u02c8\u02d2\3\2\2\2\u02c9\u02ca"+
		"\5\u008eH\2\u02ca\u02cc\7)\2\2\u02cb\u02cd\5\u0086D\2\u02cc\u02cb\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7*\2\2\u02cf"+
		"\u02d0\7\36\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02bd\3\2\2\2\u02d1\u02c9\3"+
		"\2\2\2\u02d2\u0085\3\2\2\2\u02d3\u02d8\5\u00aaV\2\u02d4\u02d5\7$\2\2\u02d5"+
		"\u02d7\5\u0086D\2\u02d6\u02d4\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u0087\3\2\2\2\u02da\u02d8\3\2\2\2\u02db"+
		"\u02dc\5\u008aF\2\u02dc\u02dd\7\36\2\2\u02dd\u0089\3\2\2\2\u02de\u02e4"+
		"\5\u008eH\2\u02df\u02e1\7)\2\2\u02e0\u02e2\5\u0086D\2\u02e1\u02e0\3\2"+
		"\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\7*\2\2\u02e4"+
		"\u02df\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02ea\3\2\2\2\u02e6\u02e7\7#"+
		"\2\2\u02e7\u02e9\5\u008aF\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u008b\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ee\7)\2\2\u02ee\u02ef\7\25\2\2\u02ef\u02f0\5\u00acW\2\u02f0"+
		"\u02f2\7)\2\2\u02f1\u02f3\5\u00aaV\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3"+
		"\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\7*\2\2\u02f5\u02fe\7*\2\2\u02f6"+
		"\u02f7\t\4\2\2\u02f7\u02f8\5\u00aeX\2\u02f8\u02fa\7)\2\2\u02f9\u02fb\5"+
		"\u00aaV\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2"+
		"\u02fc\u02fd\7*\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f6\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u008d\3\2\2\2\u0300\u0301\5\u0090I\2\u0301\u008f\3\2\2"+
		"\2\u0302\u0306\5\u0092J\2\u0303\u0305\5\u0090I\2\u0304\u0303\3\2\2\2\u0305"+
		"\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0091\3\2"+
		"\2\2\u0308\u0306\3\2\2\2\u0309\u030b\5\u00acW\2\u030a\u030c\5\u0094K\2"+
		"\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f"+
		"\t\4\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0325\3\2\2\2\u0310"+
		"\u0312\5\u0098M\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313"+
		"\3\2\2\2\u0313\u0315\5\u00acW\2\u0314\u0316\5\u0094K\2\u0315\u0314\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0319\t\4\2\2\u0318"+
		"\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0325\3\2\2\2\u031a\u031c\5\u00ac"+
		"W\2\u031b\u031d\5\u0094K\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u0320\5\u009aN\2\u031f\u031e\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u0323\t\4\2\2\u0322\u0321\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0309\3\2\2\2\u0324\u0311\3\2"+
		"\2\2\u0324\u031a\3\2\2\2\u0325\u0093\3\2\2\2\u0326\u0327\7%\2\2\u0327"+
		"\u0328\5\u0096L\2\u0328\u032c\7&\2\2\u0329\u032b\5\u0094K\2\u032a\u0329"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u0095\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\5\u00aaV\2\u0330\u0097"+
		"\3\2\2\2\u0331\u0332\7.\2\2\u0332\u0099\3\2\2\2\u0333\u0334\7.\2\2\u0334"+
		"\u009b\3\2\2\2\u0335\u0336\t\5\2\2\u0336\u009d\3\2\2\2\u0337\u0338\7\'"+
		"\2\2\u0338\u033f\7(\2\2\u0339\u033a\7\'\2\2\u033a\u033b\5\4\3\2\u033b"+
		"\u033c\7(\2\2\u033c\u033f\3\2\2\2\u033d\u033f\5\u00a0Q\2\u033e\u0337\3"+
		"\2\2\2\u033e\u0339\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u009f\3\2\2\2\u0340"+
		"\u0341\5\36\20\2\u0341\u0342\7\36\2\2\u0342\u034a\3\2\2\2\u0343\u034a"+
		"\5$\23\2\u0344\u034a\5&\24\2\u0345\u034a\5\64\33\2\u0346\u034a\5N(\2\u0347"+
		"\u034a\5J&\2\u0348\u034a\5L\'\2\u0349\u0340\3\2\2\2\u0349\u0343\3\2\2"+
		"\2\u0349\u0344\3\2\2\2\u0349\u0345\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347"+
		"\3\2\2\2\u0349\u0348\3\2\2\2\u034a\u00a1\3\2\2\2\u034b\u034c\7\'\2\2\u034c"+
		"\u0352\7(\2\2\u034d\u034e\7\'\2\2\u034e\u034f\5\4\3\2\u034f\u0350\7(\2"+
		"\2\u0350\u0352\3\2\2\2\u0351\u034b\3\2\2\2\u0351\u034d\3\2\2\2\u0352\u00a3"+
		"\3\2\2\2\u0353\u0355\7-\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\5\u00acW\2\u0357\u0358\t\4\2\2\u0358\u035a"+
		"\5\u00aeX\2\u0359\u035b\7\61\2\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2"+
		"\2\u035b\u035d\3\2\2\2\u035c\u035e\7+\2\2\u035d\u035c\3\2\2\2\u035d\u035e"+
		"\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\7,\2\2\u0360\u035f\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u03d7\3\2\2\2\u0362\u0364\7-\2\2\u0363\u0362\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0367\5\u00b4[\2\u0366"+
		"\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\5\u00ac"+
		"W\2\u0369\u036b\5\u00b6\\\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036d\3\2\2\2\u036c\u036e\7\61\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3"+
		"\2\2\2\u036e\u0370\3\2\2\2\u036f\u0371\7+\2\2\u0370\u036f\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0374\7,\2\2\u0373\u0372\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u039d\3\2\2\2\u0375\u0377\7-\2\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\7\63"+
		"\2\2\u0379\u037b\7\61\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037d\3\2\2\2\u037c\u037e\7+\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u0380\3\2\2\2\u037f\u0381\7,\2\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u039d\3\2\2\2\u0382\u0384\7-\2\2\u0383\u0382\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\7\64\2\2\u0386"+
		"\u0388\7\61\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3"+
		"\2\2\2\u0389\u038b\7+\2\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038d\3\2\2\2\u038c\u038e\7,\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u039d\3\2\2\2\u038f\u0391\7-\2\2\u0390\u038f\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\7\65\2\2\u0393\u0395\7"+
		"\61\2\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396"+
		"\u0398\7+\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\3\2"+
		"\2\2\u0399\u039b\7,\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039d\3\2\2\2\u039c\u0363\3\2\2\2\u039c\u0376\3\2\2\2\u039c\u0383\3\2"+
		"\2\2\u039c\u0390\3\2\2\2\u039d\u03d7\3\2\2\2\u039e\u03a0\7-\2\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\5\36"+
		"\20\2\u03a2\u03a4\7\61\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a6\3\2\2\2\u03a5\u03a7\7+\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2"+
		"\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03aa\7,\2\2\u03a9\u03a8\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03d7\3\2\2\2\u03ab\u03ad\7-\2\2\u03ac\u03ab\3\2"+
		"\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0\5\u00b4[\2\u03af"+
		"\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\5r"+
		":\2\u03b2\u03b4\5\u00b6\\\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b6\3\2\2\2\u03b5\u03b7\7\61\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3"+
		"\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03ba\7+\2\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\7,\2\2\u03bc\u03bb\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03d7\3\2\2\2\u03be\u03d7\5X-\2\u03bf\u03d7"+
		"\5j\66\2\u03c0\u03d7\5|?\2\u03c1\u03d7\5\u008eH\2\u03c2\u03d7\5\u008c"+
		"G\2\u03c3\u03c4\7\'\2\2\u03c4\u03c8\7(\2\2\u03c5\u03c6\7%\2\2\u03c6\u03c8"+
		"\7&\2\2\u03c7\u03c3\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d7\3\2\2\2\u03c9"+
		"\u03cb\7-\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2"+
		"\2\2\u03cc\u03ce\5\u00a6T\2\u03cd\u03cf\7\61\2\2\u03ce\u03cd\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03d2\7+\2\2\u03d1\u03d0\3\2"+
		"\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d5\7,\2\2\u03d4"+
		"\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u0354\3\2"+
		"\2\2\u03d6\u039c\3\2\2\2\u03d6\u039f\3\2\2\2\u03d6\u03ac\3\2\2\2\u03d6"+
		"\u03be\3\2\2\2\u03d6\u03bf\3\2\2\2\u03d6\u03c0\3\2\2\2\u03d6\u03c1\3\2"+
		"\2\2\u03d6\u03c2\3\2\2\2\u03d6\u03c7\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d7"+
		"\u00a5\3\2\2\2\u03d8\u03d9\7)\2\2\u03d9\u03da\5\u00a8U\2\u03da\u03db\7"+
		"*\2\2\u03db\u00a7\3\2\2\2\u03dc\u03e0\5\u00a4S\2\u03dd\u03df\5\u00a8U"+
		"\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u00a9\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e7\5\u00a4S"+
		"\2\u03e4\u03e6\5\u00aaV\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u00ab\3\2\2\2\u03e9\u03e7\3\2"+
		"\2\2\u03ea\u03eb\7/\2\2\u03eb\u00ad\3\2\2\2\u03ec\u03ed\7/\2\2\u03ed\u00af"+
		"\3\2\2\2\u03ee\u03ef\7/\2\2\u03ef\u00b1\3\2\2\2\u03f0\u03f1\7/\2\2\u03f1"+
		"\u00b3\3\2\2\2\u03f2\u03f3\7.\2\2\u03f3\u00b5\3\2\2\2\u03f4\u03f5\7.\2"+
		"\2\u03f5\u00b7\3\2\2\2\u03f6\u03f7\7)\2\2\u03f7\u00b9\3\2\2\2\u03f8\u03f9"+
		"\7*\2\2\u03f9\u00bb\3\2\2\2\u0093\u00c4\u00d7\u00df\u00ea\u00f4\u00fb"+
		"\u0102\u010c\u010f\u0113\u011a\u0127\u012d\u0137\u013e\u0147\u014a\u0154"+
		"\u0166\u016d\u0175\u017c\u0185\u0189\u018d\u0194\u019f\u01a6\u01aa\u01b3"+
		"\u01b7\u01bd\u01bf\u01c5\u01cc\u01d0\u01d6\u01d8\u01dc\u01de\u01e3\u01e7"+
		"\u01ed\u01ef\u01f5\u01fb\u01ff\u0205\u0207\u020a\u0210\u021a\u0224\u022e"+
		"\u0232\u0236\u023e\u0242\u0245\u0248\u024e\u0252\u0256\u025e\u0262\u0265"+
		"\u0269\u026d\u0271\u027b\u0286\u0294\u0299\u029f\u02a1\u02a8\u02ae\u02b3"+
		"\u02b8\u02c0\u02c4\u02cc\u02d1\u02d8\u02e1\u02e4\u02ea\u02f2\u02fa\u02fe"+
		"\u0306\u030b\u030e\u0311\u0315\u0318\u031c\u031f\u0322\u0324\u032c\u033e"+
		"\u0349\u0351\u0354\u035a\u035d\u0360\u0363\u0366\u036a\u036d\u0370\u0373"+
		"\u0376\u037a\u037d\u0380\u0383\u0387\u038a\u038d\u0390\u0394\u0397\u039a"+
		"\u039c\u039f\u03a3\u03a6\u03a9\u03ac\u03af\u03b3\u03b6\u03b9\u03bc\u03c7"+
		"\u03ca\u03ce\u03d1\u03d4\u03d6\u03e0\u03e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}