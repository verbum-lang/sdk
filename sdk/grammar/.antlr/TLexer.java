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
		Use=1, Var=2, If=3, Elif=4, Else=5, Bool=6, End=7, Attr=8, Point=9, TwoPoint=10, 
		TwoTwoPoint=11, Separator=12, OpenArIndex=13, CloseArIndex=14, OpenBlock=15, 
		CloseBlock=16, OpenOp=17, CloseOp=18, ArithmeticOperator=19, AssignmentOperator=20, 
		Not=21, IncDecOperators=22, Identifier=23, IDPrefix=24, TypeSpec=25, String=26, 
		Integer=27, Float=28, Whitespace=29, Newline=30, Words=31, BlockComment=32, 
		LineComment=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", "TwoPoint", 
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
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", null, "';'", "'='", 
			"'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u01b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u008c\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c0\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u00c8\n\27\3\30\3\30\3\30\3\30\6\30\u00ce"+
		"\n\30\r\30\16\30\u00cf\3\30\7\30\u00d3\n\30\f\30\16\30\u00d6\13\30\5\30"+
		"\u00d8\n\30\3\31\3\31\5\31\u00dc\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\7\33\u00e5\n\33\f\33\16\33\u00e8\13\33\3\33\3\33\3\33\3\33\3\33\7"+
		"\33\u00ef\n\33\f\33\16\33\u00f2\13\33\3\33\5\33\u00f5\n\33\3\34\6\34\u00f8"+
		"\n\34\r\34\16\34\u00f9\3\35\3\35\3\36\6\36\u00ff\n\36\r\36\16\36\u0100"+
		"\3\36\3\36\3\37\3\37\5\37\u0107\n\37\3\37\5\37\u010a\n\37\3\37\3\37\3"+
		" \6 \u010f\n \r \16 \u0110\3!\3!\3!\3!\7!\u0117\n!\f!\16!\u011a\13!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0125\n\"\f\"\16\"\u0128\13\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0137\n#\3$\6$\u013a\n$\r$\16$"+
		"\u013b\3%\3%\5%\u0140\n%\3&\3&\5&\u0144\n&\3\'\3\'\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u0153\n)\3*\3*\3*\3*\5*\u0159\n*\3+\3+\3+\3+\7+\u015f"+
		"\n+\f+\16+\u0162\13+\5+\u0164\n+\3,\3,\3,\3,\5,\u016a\n,\3,\6,\u016d\n"+
		",\r,\16,\u016e\3-\3-\3-\6-\u0174\n-\r-\16-\u0175\3.\3.\3.\3.\5.\u017c"+
		"\n.\3.\3.\6.\u0180\n.\r.\16.\u0181\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u018f\n\62\5\62\u0191\n\62\3\62\3\62\3\62\5\62\u0196"+
		"\n\62\5\62\u0198\n\62\3\63\3\63\3\63\5\63\u019d\n\63\3\64\3\64\7\64\u01a1"+
		"\n\64\f\64\16\64\u01a4\13\64\3\65\3\65\6\65\u01a8\n\65\r\65\16\65\u01a9"+
		"\3\66\3\66\3\66\3\66\6\66\u01b0\n\66\r\66\16\66\u01b1\3\u0118\2\67\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2\3\2"+
		"\21\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5"+
		"\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u01de\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3m\3\2\2\2\5q\3\2\2\2\7u\3\2\2\2\tx\3\2\2"+
		"\2\13}\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3"+
		"\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2"+
		"%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c7\3"+
		"\2\2\2/\u00d7\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2\2\65\u00f4\3\2\2"+
		"\2\67\u00f7\3\2\2\29\u00fb\3\2\2\2;\u00fe\3\2\2\2=\u0109\3\2\2\2?\u010e"+
		"\3\2\2\2A\u0112\3\2\2\2C\u0120\3\2\2\2E\u0136\3\2\2\2G\u0139\3\2\2\2I"+
		"\u013d\3\2\2\2K\u0141\3\2\2\2M\u0145\3\2\2\2O\u0147\3\2\2\2Q\u0152\3\2"+
		"\2\2S\u0158\3\2\2\2U\u0163\3\2\2\2W\u0169\3\2\2\2Y\u0170\3\2\2\2[\u017b"+
		"\3\2\2\2]\u0183\3\2\2\2_\u0185\3\2\2\2a\u0187\3\2\2\2c\u0197\3\2\2\2e"+
		"\u019c\3\2\2\2g\u019e\3\2\2\2i\u01a5\3\2\2\2k\u01ab\3\2\2\2mn\7w\2\2n"+
		"o\7u\2\2op\7g\2\2p\4\3\2\2\2qr\7x\2\2rs\7c\2\2st\7t\2\2t\6\3\2\2\2uv\7"+
		"k\2\2vw\7h\2\2w\b\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7k\2\2{|\7h\2\2|\n\3\2\2"+
		"\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\f\3"+
		"\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u008c\7g\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2"+
		"\u0089\u008a\7u\2\2\u008a\u008c\7g\2\2\u008b\u0082\3\2\2\2\u008b\u0086"+
		"\3\2\2\2\u008c\16\3\2\2\2\u008d\u008e\7=\2\2\u008e\20\3\2\2\2\u008f\u0090"+
		"\7?\2\2\u0090\22\3\2\2\2\u0091\u0092\7\60\2\2\u0092\24\3\2\2\2\u0093\u0094"+
		"\7<\2\2\u0094\26\3\2\2\2\u0095\u0096\7<\2\2\u0096\u0097\7<\2\2\u0097\30"+
		"\3\2\2\2\u0098\u0099\7.\2\2\u0099\32\3\2\2\2\u009a\u009b\7]\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\7_\2\2\u009d\36\3\2\2\2\u009e\u009f\7}\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5&\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00c0\7?\2\2\u00aa\u00ab\7/\2\2\u00ab"+
		"\u00c0\7?\2\2\u00ac\u00ad\7,\2\2\u00ad\u00c0\7?\2\2\u00ae\u00af\7\61\2"+
		"\2\u00af\u00c0\7?\2\2\u00b0\u00b1\7\'\2\2\u00b1\u00c0\7?\2\2\u00b2\u00c0"+
		"\t\3\2\2\u00b3\u00b4\7@\2\2\u00b4\u00c0\7?\2\2\u00b5\u00b6\7>\2\2\u00b6"+
		"\u00c0\7?\2\2\u00b7\u00b8\7(\2\2\u00b8\u00c0\7(\2\2\u00b9\u00ba\7~\2\2"+
		"\u00ba\u00c0\7~\2\2\u00bb\u00bc\7?\2\2\u00bc\u00c0\7?\2\2\u00bd\u00be"+
		"\7#\2\2\u00be\u00c0\7?\2\2\u00bf\u00a8\3\2\2\2\u00bf\u00aa\3\2\2\2\u00bf"+
		"\u00ac\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b2\3\2"+
		"\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0*\3\2\2\2"+
		"\u00c1\u00c2\7#\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\u00c8\7-\2"+
		"\2\u00c5\u00c6\7/\2\2\u00c6\u00c8\7/\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8.\3\2\2\2\u00c9\u00d8\5\61\31\2\u00ca\u00d4\5\61\31\2\u00cb"+
		"\u00d3\5? \2\u00cc\u00ce\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3"+
		"\t\5\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d8"+
		"\60\3\2\2\2\u00d9\u00dc\t\5\2\2\u00da\u00dc\5? \2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\62\3\2\2\2\u00dd\u00de\t\6\2\2\u00de\u00df"+
		"\5/\30\2\u00df\64\3\2\2\2\u00e0\u00e6\7$\2\2\u00e1\u00e5\n\7\2\2\u00e2"+
		"\u00e3\7^\2\2\u00e3\u00e5\7$\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f5\7$\2\2\u00ea\u00f0\7)\2\2\u00eb"+
		"\u00ef\n\b\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ef\7)\2\2\u00ee\u00eb\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7)\2\2\u00f4"+
		"\u00e0\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f8\t\4\2"+
		"\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa8\3\2\2\2\u00fb\u00fc\5I%\2\u00fc:\3\2\2\2\u00fd\u00ff\t"+
		"\t\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b\36\2\2\u0103<\3\2\2\2"+
		"\u0104\u0106\7\17\2\2\u0105\u0107\7\f\2\2\u0106\u0105\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u010a\7\f\2\2\u0109\u0104\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\37\2\2\u010c>\3\2\2\2"+
		"\u010d\u010f\t\21\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111@\3\2\2\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0114\7,\2\2\u0114\u0118\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d\7\61"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b!\2\2\u011fB\3\2\2\2\u0120\u0121"+
		"\7\61\2\2\u0121\u0122\7\61\2\2\u0122\u0126\3\2\2\2\u0123\u0125\n\n\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b\"\2\2\u012a"+
		"D\3\2\2\2\u012b\u0137\t\13\2\2\u012c\u012d\7g\2\2\u012d\u0137\7-\2\2\u012e"+
		"\u012f\7G\2\2\u012f\u0137\7-\2\2\u0130\u0131\7g\2\2\u0131\u0137\7/\2\2"+
		"\u0132\u0133\7G\2\2\u0133\u0134\7/\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\5G$\2\u0136\u012b\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u012e\3\2\2\2\u0136"+
		"\u0130\3\2\2\2\u0136\u0132\3\2\2\2\u0137F\3\2\2\2\u0138\u013a\t\f\2\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013cH\3\2\2\2\u013d\u013f\5c\62\2\u013e\u0140\5O(\2\u013f\u013e"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140J\3\2\2\2\u0141\u0143\5S*\2\u0142\u0144"+
		"\5Q)\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144L\3\2\2\2\u0145\u0146"+
		"\t\r\2\2\u0146N\3\2\2\2\u0147\u0148\7k\2\2\u0148P\3\2\2\2\u0149\u0153"+
		"\t\16\2\2\u014a\u014b\7N\2\2\u014b\u0153\7w\2\2\u014c\u014d\7N\2\2\u014d"+
		"\u0153\7W\2\2\u014e\u014f\7w\2\2\u014f\u0153\7N\2\2\u0150\u0151\7W\2\2"+
		"\u0151\u0153\7N\2\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014c"+
		"\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u0150\3\2\2\2\u0153R\3\2\2\2\u0154"+
		"\u0159\5U+\2\u0155\u0159\5W,\2\u0156\u0159\5Y-\2\u0157\u0159\5[.\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2"+
		"\2\2\u0159T\3\2\2\2\u015a\u0164\7\62\2\2\u015b\u0160\4\63;\2\u015c\u015f"+
		"\5]/\2\u015d\u015f\7a\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u015a\3\2\2\2\u0163\u015b\3\2\2\2\u0164"+
		"V\3\2\2\2\u0165\u0166\7\62\2\2\u0166\u016a\7d\2\2\u0167\u0168\7\62\2\2"+
		"\u0168\u016a\7D\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c"+
		"\3\2\2\2\u016b\u016d\t\17\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2"+
		"\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fX\3\2\2\2\u0170\u0173\7"+
		"\62\2\2\u0171\u0174\5_\60\2\u0172\u0174\7a\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176Z\3\2\2\2\u0177\u0178\7\62\2\2\u0178\u017c\7z\2\2\u0179\u017a"+
		"\7\62\2\2\u017a\u017c\7Z\2\2\u017b\u0177\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u0180\5a\61\2\u017e\u0180\7a\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\\\3\2\2\2\u0183\u0184\4\62;\2\u0184^\3\2\2\2\u0185"+
		"\u0186\4\629\2\u0186`\3\2\2\2\u0187\u0188\t\20\2\2\u0188b\3\2\2\2\u0189"+
		"\u0190\5G$\2\u018a\u0191\5M\'\2\u018b\u018c\7\60\2\2\u018c\u018e\5G$\2"+
		"\u018d\u018f\5E#\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191"+
		"\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018b\3\2\2\2\u0191\u0198\3\2\2\2\u0192"+
		"\u0193\7\60\2\2\u0193\u0195\5G$\2\u0194\u0196\5E#\2\u0195\u0194\3\2\2"+
		"\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u0192"+
		"\3\2\2\2\u0198d\3\2\2\2\u0199\u019d\5g\64\2\u019a\u019d\5i\65\2\u019b"+
		"\u019d\5k\66\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2"+
		"\2\2\u019df\3\2\2\2\u019e\u01a2\4\63;\2\u019f\u01a1\4\62;\2\u01a0\u019f"+
		"\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"h\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\7\62\2\2\u01a6\u01a8\4\629\2"+
		"\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aaj\3\2\2\2\u01ab\u01ac\7\62\2\2\u01ac\u01ad\7z\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01b0\t\20\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2l\3\2\2\2/\2\u008b"+
		"\u00bf\u00c7\u00cf\u00d2\u00d4\u00d7\u00db\u00e4\u00e6\u00ee\u00f0\u00f4"+
		"\u00f9\u0100\u0106\u0109\u0110\u0118\u0126\u0136\u013b\u013f\u0143\u0152"+
		"\u0158\u015e\u0160\u0163\u0169\u016e\u0173\u0175\u017b\u017f\u0181\u018e"+
		"\u0190\u0195\u0197\u019c\u01a2\u01a9\u01b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}