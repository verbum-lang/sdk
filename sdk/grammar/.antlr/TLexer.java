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
		BlockComment=1, LineComment=2, Use=3, Var=4, Bool=5, End=6, Attr=7, Separator=8, 
		Identifier=9, TypeSpec=10, Integer=11, Float=12, String=13, Whitespace=14, 
		Newline=15, Word=16, Words=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", "Separator", 
			"Identifier", "TypeSpec", "Integer", "Float", "String", "Whitespace", 
			"Newline", "Word", "Words", "DecimalExponent", "DecimalDigits", "FloatLiteral", 
			"IntegerLiteral", "FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", 
			"IntegerFrag", "Decimal", "Binary", "Octal", "Hexadecimal", "DecimalDigit", 
			"OctalDigit", "HexDigit", "FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", 
			"HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'use'", "'var'", null, "';'", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", 
			"Separator", "Identifier", "TypeSpec", "Integer", "Float", "String", 
			"Whitespace", "Newline", "Word", "Words"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\6\f\u0082\n\f\r\f\16"+
		"\f\u0083\3\r\3\r\3\16\3\16\7\16\u008a\n\16\f\16\16\16\u008d\13\16\3\16"+
		"\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\16\5\16\u0098\n\16"+
		"\3\17\6\17\u009b\n\17\r\17\16\17\u009c\3\17\3\17\3\20\3\20\5\20\u00a3"+
		"\n\20\3\20\5\20\u00a6\n\20\3\20\3\20\3\21\3\21\3\22\6\22\u00ad\n\22\r"+
		"\22\16\22\u00ae\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00bc\n\23\3\24\6\24\u00bf\n\24\r\24\16\24\u00c0\3\25\3\25\5\25"+
		"\u00c5\n\25\3\26\3\26\5\26\u00c9\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d8\n\31\3\32\3\32\3\32\3\32"+
		"\5\32\u00de\n\32\3\33\3\33\3\33\3\33\7\33\u00e4\n\33\f\33\16\33\u00e7"+
		"\13\33\5\33\u00e9\n\33\3\34\3\34\3\34\3\34\5\34\u00ef\n\34\3\34\6\34\u00f2"+
		"\n\34\r\34\16\34\u00f3\3\35\3\35\3\35\6\35\u00f9\n\35\r\35\16\35\u00fa"+
		"\3\36\3\36\3\36\3\36\5\36\u0101\n\36\3\36\3\36\6\36\u0105\n\36\r\36\16"+
		"\36\u0106\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0114\n\"\5\""+
		"\u0116\n\"\3\"\3\"\3\"\5\"\u011b\n\"\5\"\u011d\n\"\3#\3#\3#\5#\u0122\n"+
		"#\3$\3$\7$\u0126\n$\f$\16$\u0129\13$\3%\3%\6%\u012d\n%\r%\16%\u012e\3"+
		"&\3&\3&\3&\6&\u0135\n&\r&\16&\u0136\5S\u008b\u0093\2\'\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2"+
		"\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2\3\2"+
		"\f\4\2\f\f\17\17\3\2<<\3\2\62;\4\2\13\13\"\"\4\2GGgg\4\2\62;aa\5\2HHN"+
		"Nhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22"+
		"\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\3M\3\2\2\2\5Y\3\2\2\2\7b\3\2\2\2\tf\3\2\2\2\13s\3\2\2\2\r"+
		"u\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u0081\3\2"+
		"\2\2\31\u0085\3\2\2\2\33\u0097\3\2\2\2\35\u009a\3\2\2\2\37\u00a5\3\2\2"+
		"\2!\u00a9\3\2\2\2#\u00ac\3\2\2\2%\u00bb\3\2\2\2\'\u00be\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00c6\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00d7\3\2\2\2"+
		"\63\u00dd\3\2\2\2\65\u00e8\3\2\2\2\67\u00ee\3\2\2\29\u00f5\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0108\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C\u011c\3\2\2\2E"+
		"\u0121\3\2\2\2G\u0123\3\2\2\2I\u012a\3\2\2\2K\u0130\3\2\2\2MN\7\61\2\2"+
		"NO\7,\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7,\2\2WX\7\61\2\2X\4\3\2\2\2YZ\7\61\2\2Z[\7\61"+
		"\2\2[_\3\2\2\2\\^\n\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\6"+
		"\3\2\2\2a_\3\2\2\2bc\7w\2\2cd\7u\2\2de\7g\2\2e\b\3\2\2\2fg\7x\2\2gh\7"+
		"c\2\2hi\7t\2\2i\n\3\2\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mt\7g\2\2no\7h\2\2"+
		"op\7c\2\2pq\7n\2\2qr\7u\2\2rt\7g\2\2sj\3\2\2\2sn\3\2\2\2t\f\3\2\2\2uv"+
		"\7=\2\2v\16\3\2\2\2wx\7?\2\2x\20\3\2\2\2yz\7.\2\2z\22\3\2\2\2{|\5#\22"+
		"\2|\24\3\2\2\2}~\t\3\2\2~\177\5#\22\2\177\26\3\2\2\2\u0080\u0082\t\4\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\30\3\2\2\2\u0085\u0086\5)\25\2\u0086\32\3\2\2\2\u0087\u008b"+
		"\7$\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0098\7$\2\2\u008f\u0093\7)\2\2\u0090\u0092\13\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7)\2\2\u0097"+
		"\u0087\3\2\2\2\u0097\u008f\3\2\2\2\u0098\34\3\2\2\2\u0099\u009b\t\5\2"+
		"\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\17\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a2\7\17\2\2\u00a1\u00a3\7\f\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\7\f\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\20\2\2\u00a8 \3\2\2\2"+
		"\u00a9\u00aa\t\f\2\2\u00aa\"\3\2\2\2\u00ab\u00ad\t\f\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"$\3\2\2\2\u00b0\u00bc\t\6\2\2\u00b1\u00b2\7g\2\2\u00b2\u00bc\7-\2\2\u00b3"+
		"\u00b4\7G\2\2\u00b4\u00bc\7-\2\2\u00b5\u00b6\7g\2\2\u00b6\u00bc\7/\2\2"+
		"\u00b7\u00b8\7G\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\5\'\24\2\u00bb\u00b0\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b3\3\2\2\2"+
		"\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00bf\t"+
		"\7\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1(\3\2\2\2\u00c2\u00c4\5C\"\2\u00c3\u00c5\5/\30\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5*\3\2\2\2\u00c6\u00c8\5\63\32"+
		"\2\u00c7\u00c9\5\61\31\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00cb\t\b\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\60\3\2\2\2\u00ce\u00d8\t\t\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d8\7w\2\2"+
		"\u00d1\u00d2\7N\2\2\u00d2\u00d8\7W\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d8"+
		"\7N\2\2\u00d5\u00d6\7W\2\2\u00d6\u00d8\7N\2\2\u00d7\u00ce\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\62\3\2\2\2\u00d9\u00de\5\65\33\2\u00da\u00de\5\67\34\2\u00db"+
		"\u00de\59\35\2\u00dc\u00de\5;\36\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\64\3\2\2\2\u00df\u00e9"+
		"\7\62\2\2\u00e0\u00e5\4\63;\2\u00e1\u00e4\5=\37\2\u00e2\u00e4\7a\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7\62\2"+
		"\2\u00eb\u00ef\7d\2\2\u00ec\u00ed\7\62\2\2\u00ed\u00ef\7D\2\2\u00ee\u00ea"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\t\n\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f48\3\2\2\2\u00f5\u00f8\7\62\2\2\u00f6\u00f9\5? \2\u00f7\u00f9"+
		"\7a\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7\62\2\2"+
		"\u00fd\u0101\7z\2\2\u00fe\u00ff\7\62\2\2\u00ff\u0101\7Z\2\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0105\5A!\2\u0103"+
		"\u0105\7a\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107<\3\2\2\2\u0108\u0109"+
		"\4\62;\2\u0109>\3\2\2\2\u010a\u010b\4\629\2\u010b@\3\2\2\2\u010c\u010d"+
		"\t\13\2\2\u010dB\3\2\2\2\u010e\u0115\5\'\24\2\u010f\u0116\5-\27\2\u0110"+
		"\u0111\7\60\2\2\u0111\u0113\5\'\24\2\u0112\u0114\5%\23\2\u0113\u0112\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0116\u011d\3\2\2\2\u0117\u0118\7\60\2\2\u0118\u011a\5"+
		"\'\24\2\u0119\u011b\5%\23\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u010e\3\2\2\2\u011c\u0117\3\2\2\2\u011dD\3\2\2\2"+
		"\u011e\u0122\5G$\2\u011f\u0122\5I%\2\u0120\u0122\5K&\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122F\3\2\2\2\u0123\u0127"+
		"\4\63;\2\u0124\u0126\4\62;\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128H\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012c\7\62\2\2\u012b\u012d\4\629\2\u012c\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fJ\3\2\2\2\u0130"+
		"\u0131\7\62\2\2\u0131\u0132\7z\2\2\u0132\u0134\3\2\2\2\u0133\u0135\t\13"+
		"\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137L\3\2\2\2&\2S_s\u0083\u008b\u0093\u0097\u009c\u00a2"+
		"\u00a5\u00ae\u00bb\u00c0\u00c4\u00c8\u00d7\u00dd\u00e3\u00e5\u00e8\u00ee"+
		"\u00f3\u00f8\u00fa\u0100\u0104\u0106\u0113\u0115\u011a\u011c\u0121\u0127"+
		"\u012e\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}