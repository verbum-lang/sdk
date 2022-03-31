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
		Use=1, Var=2, Bool=3, End=4, Attr=5, TwoPoint=6, Separator=7, OpenArIndex=8, 
		CloseArIndex=9, OpenBlock=10, CloseBlock=11, OpenOp=12, CloseOp=13, ArithmeticOperator=14, 
		IncDecOperators=15, Identifier=16, IDPrefix=17, TypeSpec=18, String=19, 
		Integer=20, Float=21, Whitespace=22, Newline=23, Words=24, BlockComment=25, 
		LineComment=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", "Integer", 
			"Float", "Whitespace", "Newline", "Words", "BlockComment", "LineComment", 
			"DecimalExponent", "DecimalDigits", "FloatLiteral", "IntegerLiteral", 
			"FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", 
			"Binary", "Octal", "Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", 
			"FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0178\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u008d\n\20\3\21\3\21\3\21\3\21\6\21\u0093\n\21\r\21\16\21"+
		"\u0094\3\21\7\21\u0098\n\21\f\21\16\21\u009b\13\21\5\21\u009d\n\21\3\22"+
		"\3\22\5\22\u00a1\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00aa\n"+
		"\24\f\24\16\24\u00ad\13\24\3\24\3\24\3\24\3\24\3\24\7\24\u00b4\n\24\f"+
		"\24\16\24\u00b7\13\24\3\24\5\24\u00ba\n\24\3\25\6\25\u00bd\n\25\r\25\16"+
		"\25\u00be\3\26\3\26\3\27\6\27\u00c4\n\27\r\27\16\27\u00c5\3\27\3\27\3"+
		"\30\3\30\5\30\u00cc\n\30\3\30\5\30\u00cf\n\30\3\30\3\30\3\31\6\31\u00d4"+
		"\n\31\r\31\16\31\u00d5\3\32\3\32\3\32\3\32\7\32\u00dc\n\32\f\32\16\32"+
		"\u00df\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00ea\n"+
		"\33\f\33\16\33\u00ed\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00fc\n\34\3\35\6\35\u00ff\n\35\r\35\16\35\u0100"+
		"\3\36\3\36\5\36\u0105\n\36\3\37\3\37\5\37\u0109\n\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0118\n\"\3#\3#\3#\3#\5#\u011e\n#\3"+
		"$\3$\3$\3$\7$\u0124\n$\f$\16$\u0127\13$\5$\u0129\n$\3%\3%\3%\3%\5%\u012f"+
		"\n%\3%\6%\u0132\n%\r%\16%\u0133\3&\3&\3&\6&\u0139\n&\r&\16&\u013a\3\'"+
		"\3\'\3\'\3\'\5\'\u0141\n\'\3\'\3\'\6\'\u0145\n\'\r\'\16\'\u0146\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u0154\n+\5+\u0156\n+\3+\3+\3+\5+\u015b"+
		"\n+\5+\u015d\n+\3,\3,\3,\5,\u0162\n,\3-\3-\7-\u0166\n-\f-\16-\u0169\13"+
		"-\3.\3.\6.\u016d\n.\r.\16.\u016e\3/\3/\3/\3/\6/\u0175\n/\r/\16/\u0176"+
		"\3\u00dd\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2\3\2\20"+
		"\6\2\'\',-//\61\61\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHc"+
		"h\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\3_\3\2\2\2\5c\3\2\2\2\7p\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\r"+
		"v\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080\3\2"+
		"\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u008c\3\2\2"+
		"\2!\u009c\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00b9\3\2\2\2)\u00bc"+
		"\3\2\2\2+\u00c0\3\2\2\2-\u00c3\3\2\2\2/\u00ce\3\2\2\2\61\u00d3\3\2\2\2"+
		"\63\u00d7\3\2\2\2\65\u00e5\3\2\2\2\67\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0106\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C\u0117\3\2\2\2E"+
		"\u011d\3\2\2\2G\u0128\3\2\2\2I\u012e\3\2\2\2K\u0135\3\2\2\2M\u0140\3\2"+
		"\2\2O\u0148\3\2\2\2Q\u014a\3\2\2\2S\u014c\3\2\2\2U\u015c\3\2\2\2W\u0161"+
		"\3\2\2\2Y\u0163\3\2\2\2[\u016a\3\2\2\2]\u0170\3\2\2\2_`\7w\2\2`a\7u\2"+
		"\2ab\7g\2\2b\4\3\2\2\2cd\7x\2\2de\7c\2\2ef\7t\2\2f\6\3\2\2\2gh\7v\2\2"+
		"hi\7t\2\2ij\7w\2\2jq\7g\2\2kl\7h\2\2lm\7c\2\2mn\7n\2\2no\7u\2\2oq\7g\2"+
		"\2pg\3\2\2\2pk\3\2\2\2q\b\3\2\2\2rs\7=\2\2s\n\3\2\2\2tu\7?\2\2u\f\3\2"+
		"\2\2vw\7<\2\2w\16\3\2\2\2xy\7.\2\2y\20\3\2\2\2z{\7]\2\2{\22\3\2\2\2|}"+
		"\7_\2\2}\24\3\2\2\2~\177\7}\2\2\177\26\3\2\2\2\u0080\u0081\7\177\2\2\u0081"+
		"\30\3\2\2\2\u0082\u0083\7*\2\2\u0083\32\3\2\2\2\u0084\u0085\7+\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\t\2\2\2\u0087\36\3\2\2\2\u0088\u0089\7-\2\2\u0089"+
		"\u008d\7-\2\2\u008a\u008b\7/\2\2\u008b\u008d\7/\2\2\u008c\u0088\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d \3\2\2\2\u008e\u009d\5#\22\2\u008f\u0099"+
		"\5#\22\2\u0090\u0098\5\61\31\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0090\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u008e\3\2\2\2\u009c"+
		"\u008f\3\2\2\2\u009d\"\3\2\2\2\u009e\u00a1\t\4\2\2\u009f\u00a1\5\61\31"+
		"\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a3"+
		"\t\5\2\2\u00a3\u00a4\5!\21\2\u00a4&\3\2\2\2\u00a5\u00ab\7$\2\2\u00a6\u00aa"+
		"\n\6\2\2\u00a7\u00a8\7^\2\2\u00a8\u00aa\7$\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00ba\7$\2\2\u00af"+
		"\u00b5\7)\2\2\u00b0\u00b4\n\7\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b4\7)\2"+
		"\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00ba\7)\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00af\3\2\2\2\u00ba(\3\2\2\2\u00bb"+
		"\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf*\3\2\2\2\u00c0\u00c1\5;\36\2\u00c1,\3\2"+
		"\2\2\u00c2\u00c4\t\b\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\27"+
		"\2\2\u00c8.\3\2\2\2\u00c9\u00cb\7\17\2\2\u00ca\u00cc\7\f\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\7\f\2\2\u00ce"+
		"\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\30"+
		"\2\2\u00d1\60\3\2\2\2\u00d2\u00d4\t\20\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\62\3\2\2\2\u00d7"+
		"\u00d8\7\61\2\2\u00d8\u00d9\7,\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\13"+
		"\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7,"+
		"\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\32\2\2\u00e4"+
		"\64\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00eb\3\2"+
		"\2\2\u00e8\u00ea\n\t\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\b\33\2\2\u00ef\66\3\2\2\2\u00f0\u00fc\t\n\2\2\u00f1\u00f2"+
		"\7g\2\2\u00f2\u00fc\7-\2\2\u00f3\u00f4\7G\2\2\u00f4\u00fc\7-\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u00fc\7/\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7/\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fc\59\35\2\u00fb\u00f0\3\2\2\2\u00fb\u00f1"+
		"\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc"+
		"8\3\2\2\2\u00fd\u00ff\t\13\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101:\3\2\2\2\u0102\u0104\5"+
		"U+\2\u0103\u0105\5A!\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105<"+
		"\3\2\2\2\u0106\u0108\5E#\2\u0107\u0109\5C\"\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109>\3\2\2\2\u010a\u010b\t\f\2\2\u010b@\3\2\2\2\u010c"+
		"\u010d\7k\2\2\u010dB\3\2\2\2\u010e\u0118\t\r\2\2\u010f\u0110\7N\2\2\u0110"+
		"\u0118\7w\2\2\u0111\u0112\7N\2\2\u0112\u0118\7W\2\2\u0113\u0114\7w\2\2"+
		"\u0114\u0118\7N\2\2\u0115\u0116\7W\2\2\u0116\u0118\7N\2\2\u0117\u010e"+
		"\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118D\3\2\2\2\u0119\u011e\5G$\2\u011a\u011e\5I%\2\u011b"+
		"\u011e\5K&\2\u011c\u011e\5M\'\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011eF\3\2\2\2\u011f\u0129"+
		"\7\62\2\2\u0120\u0125\4\63;\2\u0121\u0124\5O(\2\u0122\u0124\7a\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0129H\3\2\2\2\u012a\u012b\7\62\2\2"+
		"\u012b\u012f\7d\2\2\u012c\u012d\7\62\2\2\u012d\u012f\7D\2\2\u012e\u012a"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\t\16\2\2"+
		"\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134J\3\2\2\2\u0135\u0138\7\62\2\2\u0136\u0139\5Q)\2\u0137\u0139"+
		"\7a\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bL\3\2\2\2\u013c\u013d\7\62\2\2"+
		"\u013d\u0141\7z\2\2\u013e\u013f\7\62\2\2\u013f\u0141\7Z\2\2\u0140\u013c"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0145\5S*\2\u0143"+
		"\u0145\7a\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147N\3\2\2\2\u0148\u0149"+
		"\4\62;\2\u0149P\3\2\2\2\u014a\u014b\4\629\2\u014bR\3\2\2\2\u014c\u014d"+
		"\t\17\2\2\u014dT\3\2\2\2\u014e\u0155\59\35\2\u014f\u0156\5? \2\u0150\u0151"+
		"\7\60\2\2\u0151\u0153\59\35\2\u0152\u0154\5\67\34\2\u0153\u0152\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0150"+
		"\3\2\2\2\u0156\u015d\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u015a\59\35\2"+
		"\u0159\u015b\5\67\34\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u014e\3\2\2\2\u015c\u0157\3\2\2\2\u015dV\3\2\2\2\u015e"+
		"\u0162\5Y-\2\u015f\u0162\5[.\2\u0160\u0162\5]/\2\u0161\u015e\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162X\3\2\2\2\u0163\u0167\4\63;\2"+
		"\u0164\u0166\4\62;\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168Z\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016c\7\62\2\2\u016b\u016d\4\629\2\u016c\u016b\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\\\3\2\2\2\u0170\u0171"+
		"\7\62\2\2\u0171\u0172\7z\2\2\u0172\u0174\3\2\2\2\u0173\u0175\t\17\2\2"+
		"\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177^\3\2\2\2.\2p\u008c\u0094\u0097\u0099\u009c\u00a0\u00a9"+
		"\u00ab\u00b3\u00b5\u00b9\u00be\u00c5\u00cb\u00ce\u00d5\u00dd\u00eb\u00fb"+
		"\u0100\u0104\u0108\u0117\u011d\u0123\u0125\u0128\u012e\u0133\u0138\u013a"+
		"\u0140\u0144\u0146\u0153\u0155\u015a\u015c\u0161\u0167\u016e\u0176\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}