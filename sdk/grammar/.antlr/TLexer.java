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
		CloseArIndex=9, OpenBlock=10, CloseBlock=11, Identifier=12, IDPrefix=13, 
		TypeSpec=14, Integer=15, Float=16, String=17, Whitespace=18, Newline=19, 
		Words=20, BlockComment=21, LineComment=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "Identifier", "IDPrefix", 
			"TypeSpec", "Integer", "Float", "String", "Whitespace", "Newline", "Words", 
			"BlockComment", "LineComment", "DecimalExponent", "DecimalDigits", "FloatLiteral", 
			"IntegerLiteral", "FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", 
			"IntegerFrag", "Decimal", "Binary", "Octal", "Hexadecimal", "DecimalDigit", 
			"OctalDigit", "HexDigit", "FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", 
			"HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", null, "';'", "'='", "':'", "','", "'['", "']'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "Identifier", "IDPrefix", 
			"TypeSpec", "Integer", "Float", "String", "Whitespace", "Newline", "Words", 
			"BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4i\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\6\r\177\n\r\r\r\16\r\u0080\3\r\7\r\u0084\n\r\f"+
		"\r\16\r\u0087\13\r\5\r\u0089\n\r\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3"+
		"\17\3\20\6\20\u0093\n\20\r\20\16\20\u0094\3\21\3\21\3\22\3\22\7\22\u009b"+
		"\n\22\f\22\16\22\u009e\13\22\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22"+
		"\u00a6\13\22\3\22\5\22\u00a9\n\22\3\23\6\23\u00ac\n\23\r\23\16\23\u00ad"+
		"\3\23\3\23\3\24\3\24\5\24\u00b4\n\24\3\24\5\24\u00b7\n\24\3\24\3\24\3"+
		"\25\6\25\u00bc\n\25\r\25\16\25\u00bd\3\26\3\26\3\26\3\26\7\26\u00c4\n"+
		"\26\f\26\16\26\u00c7\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u00d2\n\27\f\27\16\27\u00d5\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e4\n\30\3\31\6\31\u00e7\n"+
		"\31\r\31\16\31\u00e8\3\32\3\32\5\32\u00ed\n\32\3\33\3\33\5\33\u00f1\n"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0100\n\36\3\37\3\37\3\37\3\37\5\37\u0106\n\37\3 \3 \3 \3 \7 \u010c"+
		"\n \f \16 \u010f\13 \5 \u0111\n \3!\3!\3!\3!\5!\u0117\n!\3!\6!\u011a\n"+
		"!\r!\16!\u011b\3\"\3\"\3\"\6\"\u0121\n\"\r\"\16\"\u0122\3#\3#\3#\3#\5"+
		"#\u0129\n#\3#\3#\6#\u012d\n#\r#\16#\u012e\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u013c\n\'\5\'\u013e\n\'\3\'\3\'\3\'\5\'\u0143\n\'\5\'\u0145"+
		"\n\'\3(\3(\3(\5(\u014a\n(\3)\3)\7)\u014e\n)\f)\16)\u0151\13)\3*\3*\6*"+
		"\u0155\n*\r*\16*\u0156\3+\3+\3+\3+\6+\u015d\n+\r+\16+\u015e\5\u009c\u00a4"+
		"\u00c5\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2\3\2\r\3\2\62;\3\2aa\3\2<<\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62"+
		"\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u017d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3W\3\2\2\2\5[\3\2\2\2\7"+
		"h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23"+
		"t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31\u0088\3\2\2\2\33\u008c\3\2\2\2\35"+
		"\u008e\3\2\2\2\37\u0092\3\2\2\2!\u0096\3\2\2\2#\u00a8\3\2\2\2%\u00ab\3"+
		"\2\2\2\'\u00b6\3\2\2\2)\u00bb\3\2\2\2+\u00bf\3\2\2\2-\u00cd\3\2\2\2/\u00e3"+
		"\3\2\2\2\61\u00e6\3\2\2\2\63\u00ea\3\2\2\2\65\u00ee\3\2\2\2\67\u00f2\3"+
		"\2\2\29\u00f4\3\2\2\2;\u00ff\3\2\2\2=\u0105\3\2\2\2?\u0110\3\2\2\2A\u0116"+
		"\3\2\2\2C\u011d\3\2\2\2E\u0128\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0134\3\2\2\2M\u0144\3\2\2\2O\u0149\3\2\2\2Q\u014b\3\2\2\2S\u0152\3\2"+
		"\2\2U\u0158\3\2\2\2WX\7w\2\2XY\7u\2\2YZ\7g\2\2Z\4\3\2\2\2[\\\7x\2\2\\"+
		"]\7c\2\2]^\7t\2\2^\6\3\2\2\2_`\7v\2\2`a\7t\2\2ab\7w\2\2bi\7g\2\2cd\7h"+
		"\2\2de\7c\2\2ef\7n\2\2fg\7u\2\2gi\7g\2\2h_\3\2\2\2hc\3\2\2\2i\b\3\2\2"+
		"\2jk\7=\2\2k\n\3\2\2\2lm\7?\2\2m\f\3\2\2\2no\7<\2\2o\16\3\2\2\2pq\7.\2"+
		"\2q\20\3\2\2\2rs\7]\2\2s\22\3\2\2\2tu\7_\2\2u\24\3\2\2\2vw\7}\2\2w\26"+
		"\3\2\2\2xy\7\177\2\2y\30\3\2\2\2z\u0089\5\33\16\2{\u0085\5\33\16\2|\u0084"+
		"\5)\25\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0084\t\3\2\2\u0083|\3\2\2\2"+
		"\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"z\3\2\2\2\u0088{\3\2\2\2\u0089\32\3\2\2\2\u008a\u008d\t\3\2\2\u008b\u008d"+
		"\5)\25\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\t\4\2\2\u008f\u0090\5\31\r\2\u0090\36\3\2\2\2\u0091\u0093\t\2\2"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095 \3\2\2\2\u0096\u0097\5\63\32\2\u0097\"\3\2\2\2\u0098\u009c"+
		"\7$\2\2\u0099\u009b\13\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a9\7$\2\2\u00a0\u00a4\7)\2\2\u00a1\u00a3\13\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7)\2\2\u00a8"+
		"\u0098\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9$\3\2\2\2\u00aa\u00ac\t\5\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\23\2\2\u00b0&\3\2\2\2\u00b1"+
		"\u00b3\7\17\2\2\u00b2\u00b4\7\f\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\24\2\2\u00b9(\3\2\2\2"+
		"\u00ba\u00bc\t\r\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be*\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0"+
		"\u00c1\7,\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\61"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\26\2\2\u00cc,\3\2\2\2\u00cd\u00ce"+
		"\7\61\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\n\6\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\27\2\2"+
		"\u00d7.\3\2\2\2\u00d8\u00e4\t\7\2\2\u00d9\u00da\7g\2\2\u00da\u00e4\7-"+
		"\2\2\u00db\u00dc\7G\2\2\u00dc\u00e4\7-\2\2\u00dd\u00de\7g\2\2\u00de\u00e4"+
		"\7/\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\5\61\31\2\u00e3\u00d8\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00db\3"+
		"\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\60\3\2\2\2\u00e5"+
		"\u00e7\t\b\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\62\3\2\2\2\u00ea\u00ec\5M\'\2\u00eb\u00ed"+
		"\59\35\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\64\3\2\2\2\u00ee"+
		"\u00f0\5=\37\2\u00ef\u00f1\5;\36\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\t\t\2\2\u00f38\3\2\2\2\u00f4\u00f5\7"+
		"k\2\2\u00f5:\3\2\2\2\u00f6\u0100\t\n\2\2\u00f7\u00f8\7N\2\2\u00f8\u0100"+
		"\7w\2\2\u00f9\u00fa\7N\2\2\u00fa\u0100\7W\2\2\u00fb\u00fc\7w\2\2\u00fc"+
		"\u0100\7N\2\2\u00fd\u00fe\7W\2\2\u00fe\u0100\7N\2\2\u00ff\u00f6\3\2\2"+
		"\2\u00ff\u00f7\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100<\3\2\2\2\u0101\u0106\5? \2\u0102\u0106\5A!\2\u0103\u0106"+
		"\5C\"\2\u0104\u0106\5E#\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106>\3\2\2\2\u0107\u0111\7\62\2\2"+
		"\u0108\u010d\4\63;\2\u0109\u010c\5G$\2\u010a\u010c\7a\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0107\3\2"+
		"\2\2\u0110\u0108\3\2\2\2\u0111@\3\2\2\2\u0112\u0113\7\62\2\2\u0113\u0117"+
		"\7d\2\2\u0114\u0115\7\62\2\2\u0115\u0117\7D\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\t\13\2\2\u0119\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"B\3\2\2\2\u011d\u0120\7\62\2\2\u011e\u0121\5I%\2\u011f\u0121\7a\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123D\3\2\2\2\u0124\u0125\7\62\2\2\u0125\u0129"+
		"\7z\2\2\u0126\u0127\7\62\2\2\u0127\u0129\7Z\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012d\5K&\2\u012b\u012d\7a\2"+
		"\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012fF\3\2\2\2\u0130\u0131\4\62;\2\u0131"+
		"H\3\2\2\2\u0132\u0133\4\629\2\u0133J\3\2\2\2\u0134\u0135\t\f\2\2\u0135"+
		"L\3\2\2\2\u0136\u013d\5\61\31\2\u0137\u013e\5\67\34\2\u0138\u0139\7\60"+
		"\2\2\u0139\u013b\5\61\31\2\u013a\u013c\5/\30\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u0138\3\2"+
		"\2\2\u013e\u0145\3\2\2\2\u013f\u0140\7\60\2\2\u0140\u0142\5\61\31\2\u0141"+
		"\u0143\5/\30\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0136\3\2\2\2\u0144\u013f\3\2\2\2\u0145N\3\2\2\2\u0146\u014a"+
		"\5Q)\2\u0147\u014a\5S*\2\u0148\u014a\5U+\2\u0149\u0146\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u0148\3\2\2\2\u014aP\3\2\2\2\u014b\u014f\4\63;\2\u014c"+
		"\u014e\4\62;\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150R\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154"+
		"\7\62\2\2\u0153\u0155\4\629\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2"+
		"\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157T\3\2\2\2\u0158\u0159\7"+
		"\62\2\2\u0159\u015a\7z\2\2\u015a\u015c\3\2\2\2\u015b\u015d\t\f\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015fV\3\2\2\2+\2h\u0080\u0083\u0085\u0088\u008c\u0094\u009c\u00a4"+
		"\u00a8\u00ad\u00b3\u00b6\u00bd\u00c5\u00d3\u00e3\u00e8\u00ec\u00f0\u00ff"+
		"\u0105\u010b\u010d\u0110\u0116\u011b\u0120\u0122\u0128\u012c\u012e\u013b"+
		"\u013d\u0142\u0144\u0149\u014f\u0156\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}