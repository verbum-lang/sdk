// Generated from /home/user/projects/sdk/sdk/grammar/TLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, Function=8, Pub=9, Pro=10, 
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, Class=17, 
		Implements=18, ArrowRight=19, End=20, Attr=21, Point=22, TwoPoint=23, 
		TwoTwoPoint=24, Separator=25, OpenArIndex=26, CloseArIndex=27, OpenBlock=28, 
		CloseBlock=29, OpenOp=30, CloseOp=31, ArithmeticOperator=32, AssignmentOperator=33, 
		Not=34, IncDecOperators=35, Identifier=36, IDPrefix=37, TypeSpec=38, String=39, 
		Integer=40, Float=41, Whitespace=42, Newline=43, Words=44, BlockComment=45, 
		LineComment=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
			"Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
			"LineComment", "DecimalExponent", "DecimalDigits", "FloatLiteral", "IntegerLiteral", 
			"FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", 
			"Binary", "Octal", "Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", 
			"FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'->'", "';'", 
			"'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
			"Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
			"LineComment"
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


	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0216\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0123\n\"\3#\3#\3$\3$\3$\3$\5$"+
		"\u012b\n$\3%\3%\3%\3%\6%\u0131\n%\r%\16%\u0132\3%\7%\u0136\n%\f%\16%\u0139"+
		"\13%\5%\u013b\n%\3&\3&\5&\u013f\n&\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0148\n"+
		"(\f(\16(\u014b\13(\3(\3(\3(\3(\3(\7(\u0152\n(\f(\16(\u0155\13(\3(\5(\u0158"+
		"\n(\3)\6)\u015b\n)\r)\16)\u015c\3*\3*\3+\6+\u0162\n+\r+\16+\u0163\3+\3"+
		"+\3,\3,\5,\u016a\n,\3,\5,\u016d\n,\3,\3,\3-\6-\u0172\n-\r-\16-\u0173\3"+
		".\3.\3.\3.\7.\u017a\n.\f.\16.\u017d\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/"+
		"\u0188\n/\f/\16/\u018b\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u019a\n\60\3\61\6\61\u019d\n\61\r\61\16\61\u019e"+
		"\3\62\3\62\5\62\u01a3\n\62\3\63\3\63\5\63\u01a7\n\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01b6\n\66\3\67"+
		"\3\67\3\67\3\67\5\67\u01bc\n\67\38\38\38\38\78\u01c2\n8\f8\168\u01c5\13"+
		"8\58\u01c7\n8\39\39\39\39\59\u01cd\n9\39\69\u01d0\n9\r9\169\u01d1\3:\3"+
		":\3:\6:\u01d7\n:\r:\16:\u01d8\3;\3;\3;\3;\5;\u01df\n;\3;\3;\6;\u01e3\n"+
		";\r;\16;\u01e4\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\5?\u01f2\n?\5?\u01f4\n"+
		"?\3?\3?\3?\5?\u01f9\n?\5?\u01fb\n?\3@\3@\3@\5@\u0200\n@\3A\3A\7A\u0204"+
		"\nA\fA\16A\u0207\13A\3B\3B\6B\u020b\nB\rB\16B\u020c\3C\3C\3C\3C\6C\u0213"+
		"\nC\rC\16C\u0214\3\u017b\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2"+
		"c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\3\2\21\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62"+
		"\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u0240\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3\u0087\3\2\2\2\5\u008b\3\2\2"+
		"\2\7\u008f\3\2\2\2\t\u0092\3\2\2\2\13\u0097\3\2\2\2\r\u009c\3\2\2\2\17"+
		"\u00a0\3\2\2\2\21\u00a4\3\2\2\2\23\u00a7\3\2\2\2\25\u00ab\3\2\2\2\27\u00af"+
		"\3\2\2\2\31\u00b4\3\2\2\2\33\u00bb\3\2\2\2\35\u00c1\3\2\2\2\37\u00cb\3"+
		"\2\2\2!\u00d4\3\2\2\2#\u00dc\3\2\2\2%\u00e2\3\2\2\2\'\u00ed\3\2\2\2)\u00f0"+
		"\3\2\2\2+\u00f2\3\2\2\2-\u00f4\3\2\2\2/\u00f6\3\2\2\2\61\u00f8\3\2\2\2"+
		"\63\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0103"+
		"\3\2\2\2=\u0105\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C\u0122\3\2\2\2E"+
		"\u0124\3\2\2\2G\u012a\3\2\2\2I\u013a\3\2\2\2K\u013e\3\2\2\2M\u0140\3\2"+
		"\2\2O\u0157\3\2\2\2Q\u015a\3\2\2\2S\u015e\3\2\2\2U\u0161\3\2\2\2W\u016c"+
		"\3\2\2\2Y\u0171\3\2\2\2[\u0175\3\2\2\2]\u0183\3\2\2\2_\u0199\3\2\2\2a"+
		"\u019c\3\2\2\2c\u01a0\3\2\2\2e\u01a4\3\2\2\2g\u01a8\3\2\2\2i\u01aa\3\2"+
		"\2\2k\u01b5\3\2\2\2m\u01bb\3\2\2\2o\u01c6\3\2\2\2q\u01cc\3\2\2\2s\u01d3"+
		"\3\2\2\2u\u01de\3\2\2\2w\u01e6\3\2\2\2y\u01e8\3\2\2\2{\u01ea\3\2\2\2}"+
		"\u01fa\3\2\2\2\177\u01ff\3\2\2\2\u0081\u0201\3\2\2\2\u0083\u0208\3\2\2"+
		"\2\u0085\u020e\3\2\2\2\u0087\u0088\7w\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
		"\7g\2\2\u008a\4\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7t\2\2\u008e\6\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091\b"+
		"\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7h\2\2\u0096\n\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\f\3\2\2\2\u009c\u009d\7h\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\16\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7x\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2"+
		"\u00b9\u00ba\7e\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7"+
		"k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\34"+
		"\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7e\2\2\u00c9\u00ca\7g\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7"+
		"c\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		" \3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7z\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7u\2\2"+
		"\u00db\"\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7c"+
		"\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7u\2\2\u00e1$\3\2\2\2\u00e2\u00e3"+
		"\7k\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2"+
		"\u00ea\u00eb\7v\2\2\u00eb\u00ec\7u\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7/\2"+
		"\2\u00ee\u00ef\7@\2\2\u00ef(\3\2\2\2\u00f0\u00f1\7=\2\2\u00f1*\3\2\2\2"+
		"\u00f2\u00f3\7?\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5.\3\2\2\2"+
		"\u00f6\u00f7\7<\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7<\2\2\u00f9\u00fa\7"+
		"<\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc\64\3\2\2\2\u00fd\u00fe"+
		"\7]\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7_\2\2\u01008\3\2\2\2\u0101\u0102"+
		"\7}\2\2\u0102:\3\2\2\2\u0103\u0104\7\177\2\2\u0104<\3\2\2\2\u0105\u0106"+
		"\7*\2\2\u0106>\3\2\2\2\u0107\u0108\7+\2\2\u0108@\3\2\2\2\u0109\u010a\t"+
		"\2\2\2\u010aB\3\2\2\2\u010b\u010c\7-\2\2\u010c\u0123\7?\2\2\u010d\u010e"+
		"\7/\2\2\u010e\u0123\7?\2\2\u010f\u0110\7,\2\2\u0110\u0123\7?\2\2\u0111"+
		"\u0112\7\61\2\2\u0112\u0123\7?\2\2\u0113\u0114\7\'\2\2\u0114\u0123\7?"+
		"\2\2\u0115\u0123\t\3\2\2\u0116\u0117\7@\2\2\u0117\u0123\7?\2\2\u0118\u0119"+
		"\7>\2\2\u0119\u0123\7?\2\2\u011a\u011b\7(\2\2\u011b\u0123\7(\2\2\u011c"+
		"\u011d\7~\2\2\u011d\u0123\7~\2\2\u011e\u011f\7?\2\2\u011f\u0123\7?\2\2"+
		"\u0120\u0121\7#\2\2\u0121\u0123\7?\2\2\u0122\u010b\3\2\2\2\u0122\u010d"+
		"\3\2\2\2\u0122\u010f\3\2\2\2\u0122\u0111\3\2\2\2\u0122\u0113\3\2\2\2\u0122"+
		"\u0115\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"D\3\2\2\2\u0124\u0125\7#\2\2\u0125F\3\2\2\2\u0126\u0127\7-\2\2\u0127\u012b"+
		"\7-\2\2\u0128\u0129\7/\2\2\u0129\u012b\7/\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012bH\3\2\2\2\u012c\u013b\5K&\2\u012d\u0137\5K&\2\u012e"+
		"\u0136\5Y-\2\u012f\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136"+
		"\t\5\2\2\u0135\u012e\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u012c\3\2\2\2\u013a\u012d\3\2\2\2\u013b"+
		"J\3\2\2\2\u013c\u013f\t\5\2\2\u013d\u013f\5Y-\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013fL\3\2\2\2\u0140\u0141\t\6\2\2\u0141\u0142\5I%\2\u0142"+
		"N\3\2\2\2\u0143\u0149\7$\2\2\u0144\u0148\n\7\2\2\u0145\u0146\7^\2\2\u0146"+
		"\u0148\7$\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u0158\7$\2\2\u014d\u0153\7)\2\2\u014e\u0152\n\b\2"+
		"\2\u014f\u0150\7^\2\2\u0150\u0152\7)\2\2\u0151\u014e\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\7)\2\2\u0157\u0143\3\2"+
		"\2\2\u0157\u014d\3\2\2\2\u0158P\3\2\2\2\u0159\u015b\t\4\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"R\3\2\2\2\u015e\u015f\5c\62\2\u015fT\3\2\2\2\u0160\u0162\t\t\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b+\2\2\u0166V\3\2\2\2\u0167\u0169"+
		"\7\17\2\2\u0168\u016a\7\f\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\u016d\3\2\2\2\u016b\u016d\7\f\2\2\u016c\u0167\3\2\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b,\2\2\u016fX\3\2\2\2\u0170\u0172"+
		"\t\21\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174Z\3\2\2\2\u0175\u0176\7\61\2\2\u0176\u0177\7"+
		",\2\2\u0177\u017b\3\2\2\2\u0178\u017a\13\2\2\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\61\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\b.\2\2\u0182\\\3\2\2\2\u0183\u0184\7\61\2\2"+
		"\u0184\u0185\7\61\2\2\u0185\u0189\3\2\2\2\u0186\u0188\n\n\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\b/\2\2\u018d^\3\2\2\2\u018e"+
		"\u019a\t\13\2\2\u018f\u0190\7g\2\2\u0190\u019a\7-\2\2\u0191\u0192\7G\2"+
		"\2\u0192\u019a\7-\2\2\u0193\u0194\7g\2\2\u0194\u019a\7/\2\2\u0195\u0196"+
		"\7G\2\2\u0196\u0197\7/\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5a\61\2\u0199"+
		"\u018e\3\2\2\2\u0199\u018f\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0193\3\2"+
		"\2\2\u0199\u0195\3\2\2\2\u019a`\3\2\2\2\u019b\u019d\t\f\2\2\u019c\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"b\3\2\2\2\u01a0\u01a2\5}?\2\u01a1\u01a3\5i\65\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3d\3\2\2\2\u01a4\u01a6\5m\67\2\u01a5\u01a7\5k\66\2"+
		"\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7f\3\2\2\2\u01a8\u01a9\t"+
		"\r\2\2\u01a9h\3\2\2\2\u01aa\u01ab\7k\2\2\u01abj\3\2\2\2\u01ac\u01b6\t"+
		"\16\2\2\u01ad\u01ae\7N\2\2\u01ae\u01b6\7w\2\2\u01af\u01b0\7N\2\2\u01b0"+
		"\u01b6\7W\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b6\7N\2\2\u01b3\u01b4\7W\2\2"+
		"\u01b4\u01b6\7N\2\2\u01b5\u01ac\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b5\u01af"+
		"\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6l\3\2\2\2\u01b7"+
		"\u01bc\5o8\2\u01b8\u01bc\5q9\2\u01b9\u01bc\5s:\2\u01ba\u01bc\5u;\2\u01bb"+
		"\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bcn\3\2\2\2\u01bd\u01c7\7\62\2\2\u01be\u01c3\4\63;\2\u01bf\u01c2"+
		"\5w<\2\u01c0\u01c2\7a\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c7"+
		"p\3\2\2\2\u01c8\u01c9\7\62\2\2\u01c9\u01cd\7d\2\2\u01ca\u01cb\7\62\2\2"+
		"\u01cb\u01cd\7D\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01d0\t\17\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2r\3\2\2\2\u01d3\u01d6\7"+
		"\62\2\2\u01d4\u01d7\5y=\2\u01d5\u01d7\7a\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9t\3\2\2\2\u01da\u01db\7\62\2\2\u01db\u01df\7z\2\2\u01dc\u01dd"+
		"\7\62\2\2\u01dd\u01df\7Z\2\2\u01de\u01da\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01e3\5{>\2\u01e1\u01e3\7a\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5v\3\2\2\2\u01e6\u01e7\4\62;\2\u01e7x\3\2\2\2\u01e8\u01e9"+
		"\4\629\2\u01e9z\3\2\2\2\u01ea\u01eb\t\20\2\2\u01eb|\3\2\2\2\u01ec\u01f3"+
		"\5a\61\2\u01ed\u01f4\5g\64\2\u01ee\u01ef\7\60\2\2\u01ef\u01f1\5a\61\2"+
		"\u01f0\u01f2\5_\60\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4"+
		"\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f4\u01fb\3\2\2\2\u01f5"+
		"\u01f6\7\60\2\2\u01f6\u01f8\5a\61\2\u01f7\u01f9\5_\60\2\u01f8\u01f7\3"+
		"\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa"+
		"\u01f5\3\2\2\2\u01fb~\3\2\2\2\u01fc\u0200\5\u0081A\2\u01fd\u0200\5\u0083"+
		"B\2\u01fe\u0200\5\u0085C\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0080\3\2\2\2\u0201\u0205\4\63;\2\u0202\u0204\4\62"+
		";\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0082\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\7\62"+
		"\2\2\u0209\u020b\4\629\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0084\3\2\2\2\u020e\u020f\7\62"+
		"\2\2\u020f\u0210\7z\2\2\u0210\u0212\3\2\2\2\u0211\u0213\t\20\2\2\u0212"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0086\3\2\2\2.\2\u0122\u012a\u0132\u0135\u0137\u013a\u013e"+
		"\u0147\u0149\u0151\u0153\u0157\u015c\u0163\u0169\u016c\u0173\u017b\u0189"+
		"\u0199\u019e\u01a2\u01a6\u01b5\u01bb\u01c1\u01c3\u01c6\u01cc\u01d1\u01d6"+
		"\u01d8\u01de\u01e2\u01e4\u01f1\u01f3\u01f8\u01fa\u01ff\u0205\u020c\u0214"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}