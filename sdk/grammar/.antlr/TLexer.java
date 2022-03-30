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
		OpenArIndex=9, CloseArIndex=10, Identifier=11, TypeSpec=12, Integer=13, 
		Float=14, String=15, Whitespace=16, Newline=17, Word=18, Words=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", "Separator", 
			"OpenArIndex", "CloseArIndex", "Identifier", "TypeSpec", "Integer", "Float", 
			"String", "Whitespace", "Newline", "Word", "Words", "DecimalExponent", 
			"DecimalDigits", "FloatLiteral", "IntegerLiteral", "FloatTypeSuffix", 
			"ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", "Binary", "Octal", 
			"Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", "FloatFrag", 
			"NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'use'", "'var'", null, "';'", "'='", "','", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", 
			"Separator", "OpenArIndex", "CloseArIndex", "Identifier", "TypeSpec", 
			"Integer", "Float", "String", "Whitespace", "Newline", "Word", "Words"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2"+
		"\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3"+
		"e\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\6"+
		"\f\u0087\n\f\r\f\16\f\u0088\3\f\3\f\6\f\u008d\n\f\r\f\16\f\u008e\3\f\3"+
		"\f\5\f\u0093\n\f\3\r\3\r\3\r\3\16\6\16\u0099\n\16\r\16\16\16\u009a\3\17"+
		"\3\17\3\20\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\20\3\20\3\20"+
		"\7\20\u00a9\n\20\f\20\16\20\u00ac\13\20\3\20\5\20\u00af\n\20\3\21\6\21"+
		"\u00b2\n\21\r\21\16\21\u00b3\3\21\3\21\3\22\3\22\5\22\u00ba\n\22\3\22"+
		"\5\22\u00bd\n\22\3\22\3\22\3\23\3\23\3\24\6\24\u00c4\n\24\r\24\16\24\u00c5"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25"+
		"\3\26\6\26\u00d6\n\26\r\26\16\26\u00d7\3\27\3\27\5\27\u00dc\n\27\3\30"+
		"\3\30\5\30\u00e0\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00ef\n\33\3\34\3\34\3\34\3\34\5\34\u00f5\n\34\3"+
		"\35\3\35\3\35\3\35\7\35\u00fb\n\35\f\35\16\35\u00fe\13\35\5\35\u0100\n"+
		"\35\3\36\3\36\3\36\3\36\5\36\u0106\n\36\3\36\6\36\u0109\n\36\r\36\16\36"+
		"\u010a\3\37\3\37\3\37\6\37\u0110\n\37\r\37\16\37\u0111\3 \3 \3 \3 \5 "+
		"\u0118\n \3 \3 \6 \u011c\n \r \16 \u011d\3!\3!\3\"\3\"\3#\3#\3$\3$\3$"+
		"\3$\3$\5$\u012b\n$\5$\u012d\n$\3$\3$\3$\5$\u0132\n$\5$\u0134\n$\3%\3%"+
		"\3%\5%\u0139\n%\3&\3&\7&\u013d\n&\f&\16&\u0140\13&\3\'\3\'\6\'\u0144\n"+
		"\'\r\'\16\'\u0145\3(\3(\3(\3(\6(\u014c\n(\r(\16(\u014d\5W\u00a2\u00aa"+
		"\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2"+
		"A\2C\2E\2G\2I\2K\2M\2O\2\3\2\r\4\2\f\f\17\17\3\2\62;\3\2aa\3\2<<\4\2\13"+
		"\13\"\"\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch"+
		"\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3Q\3"+
		"\2\2\2\5]\3\2\2\2\7f\3\2\2\2\tj\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2"+
		"\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0092\3\2\2\2\31\u0094"+
		"\3\2\2\2\33\u0098\3\2\2\2\35\u009c\3\2\2\2\37\u00ae\3\2\2\2!\u00b1\3\2"+
		"\2\2#\u00bc\3\2\2\2%\u00c0\3\2\2\2\'\u00c3\3\2\2\2)\u00d2\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d9\3\2\2\2/\u00dd\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2"+
		"\2\65\u00ee\3\2\2\2\67\u00f4\3\2\2\29\u00ff\3\2\2\2;\u0105\3\2\2\2=\u010c"+
		"\3\2\2\2?\u0117\3\2\2\2A\u011f\3\2\2\2C\u0121\3\2\2\2E\u0123\3\2\2\2G"+
		"\u0133\3\2\2\2I\u0138\3\2\2\2K\u013a\3\2\2\2M\u0141\3\2\2\2O\u0147\3\2"+
		"\2\2QR\7\61\2\2RS\7,\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3"+
		"\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7,\2\2[\\\7\61\2\2\\\4\3\2\2\2"+
		"]^\7\61\2\2^_\7\61\2\2_c\3\2\2\2`b\n\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\6\3\2\2\2ec\3\2\2\2fg\7w\2\2gh\7u\2\2hi\7g\2\2i\b\3\2\2"+
		"\2jk\7x\2\2kl\7c\2\2lm\7t\2\2m\n\3\2\2\2no\7v\2\2op\7t\2\2pq\7w\2\2qx"+
		"\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3\2\2\2wr\3\2\2"+
		"\2x\f\3\2\2\2yz\7=\2\2z\16\3\2\2\2{|\7?\2\2|\20\3\2\2\2}~\7.\2\2~\22\3"+
		"\2\2\2\177\u0080\7]\2\2\u0080\24\3\2\2\2\u0081\u0082\7_\2\2\u0082\26\3"+
		"\2\2\2\u0083\u0093\5\'\24\2\u0084\u0086\5\'\24\2\u0085\u0087\t\3\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0093\3\2\2\2\u008a\u008c\5\'\24\2\u008b\u008d\t\3\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\t\4\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0083\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u008a\3\2\2\2\u0093\30\3\2\2"+
		"\2\u0094\u0095\t\5\2\2\u0095\u0096\5\27\f\2\u0096\32\3\2\2\2\u0097\u0099"+
		"\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\34\3\2\2\2\u009c\u009d\5-\27\2\u009d\36\3\2\2\2\u009e"+
		"\u00a2\7$\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00af\7$\2\2\u00a6\u00aa\7)\2\2\u00a7\u00a9\13\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7)"+
		"\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a6\3\2\2\2\u00af \3\2\2\2\u00b0\u00b2"+
		"\t\6\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\21\2\2\u00b6\"\3\2\2"+
		"\2\u00b7\u00b9\7\17\2\2\u00b8\u00ba\7\f\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\7\f\2\2\u00bc\u00b7\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\22\2\2\u00bf"+
		"$\3\2\2\2\u00c0\u00c1\t\r\2\2\u00c1&\3\2\2\2\u00c2\u00c4\t\r\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6(\3\2\2\2\u00c7\u00d3\t\7\2\2\u00c8\u00c9\7g\2\2\u00c9\u00d3"+
		"\7-\2\2\u00ca\u00cb\7G\2\2\u00cb\u00d3\7-\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00d3\7/\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\3\2\2"+
		"\2\u00d1\u00d3\5+\26\2\u00d2\u00c7\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00ca"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3*\3\2\2\2\u00d4"+
		"\u00d6\t\b\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8,\3\2\2\2\u00d9\u00db\5G$\2\u00da\u00dc"+
		"\5\63\32\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc.\3\2\2\2\u00dd"+
		"\u00df\5\67\34\2\u00de\u00e0\5\65\33\2\u00df\u00de\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\t\t\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\64\3\2\2\2\u00e5\u00ef\t\n\2\2\u00e6\u00e7\7N\2\2\u00e7"+
		"\u00ef\7w\2\2\u00e8\u00e9\7N\2\2\u00e9\u00ef\7W\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ef\7N\2\2\u00ec\u00ed\7W\2\2\u00ed\u00ef\7N\2\2\u00ee\u00e5"+
		"\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\66\3\2\2\2\u00f0\u00f5\59\35\2\u00f1\u00f5\5;\36"+
		"\2\u00f2\u00f5\5=\37\2\u00f3\u00f5\5? \2\u00f4\u00f0\3\2\2\2\u00f4\u00f1"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f58\3\2\2\2\u00f6"+
		"\u0100\7\62\2\2\u00f7\u00fc\4\63;\2\u00f8\u00fb\5A!\2\u00f9\u00fb\7a\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u00f6\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100:\3\2\2\2\u0101\u0102\7\62\2\2"+
		"\u0102\u0106\7d\2\2\u0103\u0104\7\62\2\2\u0104\u0106\7D\2\2\u0105\u0101"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\t\13\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b<\3\2\2\2\u010c\u010f\7\62\2\2\u010d\u0110\5C\"\2\u010e"+
		"\u0110\7a\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112>\3\2\2\2\u0113\u0114"+
		"\7\62\2\2\u0114\u0118\7z\2\2\u0115\u0116\7\62\2\2\u0116\u0118\7Z\2\2\u0117"+
		"\u0113\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011c\5E"+
		"#\2\u011a\u011c\7a\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e@\3\2\2\2\u011f"+
		"\u0120\4\62;\2\u0120B\3\2\2\2\u0121\u0122\4\629\2\u0122D\3\2\2\2\u0123"+
		"\u0124\t\f\2\2\u0124F\3\2\2\2\u0125\u012c\5+\26\2\u0126\u012d\5\61\31"+
		"\2\u0127\u0128\7\60\2\2\u0128\u012a\5+\26\2\u0129\u012b\5)\25\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0126\3\2"+
		"\2\2\u012c\u0127\3\2\2\2\u012d\u0134\3\2\2\2\u012e\u012f\7\60\2\2\u012f"+
		"\u0131\5+\26\2\u0130\u0132\5)\25\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0125\3\2\2\2\u0133\u012e\3\2\2\2\u0134"+
		"H\3\2\2\2\u0135\u0139\5K&\2\u0136\u0139\5M\'\2\u0137\u0139\5O(\2\u0138"+
		"\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139J\3\2\2\2"+
		"\u013a\u013e\4\63;\2\u013b\u013d\4\62;\2\u013c\u013b\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fL\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0143\7\62\2\2\u0142\u0144\4\629\2\u0143\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"N\3\2\2\2\u0147\u0148\7\62\2\2\u0148\u0149\7z\2\2\u0149\u014b\3\2\2\2"+
		"\u014a\u014c\t\f\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014eP\3\2\2\2)\2Wcw\u0088\u008e\u0092\u009a"+
		"\u00a2\u00aa\u00ae\u00b3\u00b9\u00bc\u00c5\u00d2\u00d7\u00db\u00df\u00ee"+
		"\u00f4\u00fa\u00fc\u00ff\u0105\u010a\u010f\u0111\u0117\u011b\u011d\u012a"+
		"\u012c\u0131\u0133\u0138\u013e\u0145\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}