// Generated from /home/user/projects/sdk/vm/grammar/TLexer.g4 by ANTLR 4.8
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
		Implements=18, New=19, Break=20, Next=21, Async=22, Await=23, ArrowRight=24, 
		ARightLB=25, End=26, Attr=27, Point=28, TwoPoint=29, TwoTwoPoint=30, Separator=31, 
		OpenArIndex=32, CloseArIndex=33, OpenBlock=34, CloseBlock=35, OpenOp=36, 
		CloseOp=37, ArithmeticOperator=38, AssignmentOperator=39, Not=40, IncDecOperators=41, 
		Identifier=42, IDPrefix=43, TypeSpec=44, String=45, Integer=46, Float=47, 
		Whitespace=48, Newline=49, Words=50, BlockComment=51, LineComment=52;
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
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "ArrowRight", 
			"ARightLB", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", 
			"OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", 
			"ArithmeticOperator", "AssignmentOperator", "Not", "IncDecOperators", 
			"Identifier", "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", 
			"Newline", "Words", "BlockComment", "LineComment", "DecimalExponent", 
			"DecimalDigits", "FloatLiteral", "IntegerLiteral", "FloatTypeSuffix", 
			"ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", "Binary", "Octal", 
			"Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", "FloatFrag", 
			"NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'async'", "'await'", "'->'", "'=>'", "';'", "'='", "'.'", 
			"':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", null, 
			null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "ArrowRight", 
			"ARightLB", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", 
			"OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", 
			"ArithmeticOperator", "AssignmentOperator", "Not", "IncDecOperators", 
			"Identifier", "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", 
			"Newline", "Words", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u024b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u014d\n(\3)\3)\3*\3*\3*\3*\5"+
		"*\u0155\n*\3+\3+\3+\3+\6+\u015b\n+\r+\16+\u015c\3+\7+\u0160\n+\f+\16+"+
		"\u0163\13+\5+\u0165\n+\3,\3,\5,\u0169\n,\3-\3-\3-\3.\3.\3.\3.\7.\u0172"+
		"\n.\f.\16.\u0175\13.\3.\3.\3.\3.\3.\7.\u017c\n.\f.\16.\u017f\13.\3.\5"+
		".\u0182\n.\3/\6/\u0185\n/\r/\16/\u0186\3/\3/\6/\u018b\n/\r/\16/\u018c"+
		"\5/\u018f\n/\3\60\3\60\3\60\5\60\u0194\n\60\3\61\6\61\u0197\n\61\r\61"+
		"\16\61\u0198\3\61\3\61\3\62\3\62\5\62\u019f\n\62\3\62\5\62\u01a2\n\62"+
		"\3\62\3\62\3\63\6\63\u01a7\n\63\r\63\16\63\u01a8\3\64\3\64\3\64\3\64\7"+
		"\64\u01af\n\64\f\64\16\64\u01b2\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\7\65\u01bd\n\65\f\65\16\65\u01c0\13\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01cf\n\66\3\67"+
		"\6\67\u01d2\n\67\r\67\16\67\u01d3\38\38\58\u01d8\n8\39\39\59\u01dc\n9"+
		"\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01eb\n<\3=\3=\3=\3=\5=\u01f1"+
		"\n=\3>\3>\3>\3>\7>\u01f7\n>\f>\16>\u01fa\13>\5>\u01fc\n>\3?\3?\3?\3?\5"+
		"?\u0202\n?\3?\6?\u0205\n?\r?\16?\u0206\3@\3@\3@\6@\u020c\n@\r@\16@\u020d"+
		"\3A\3A\3A\3A\5A\u0214\nA\3A\3A\6A\u0218\nA\rA\16A\u0219\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3E\3E\3E\5E\u0227\nE\5E\u0229\nE\3E\3E\3E\5E\u022e\nE\5E\u0230"+
		"\nE\3F\3F\3F\5F\u0235\nF\3G\3G\7G\u0239\nG\fG\16G\u023c\13G\3H\3H\6H\u0240"+
		"\nH\rH\16H\u0241\3I\3I\3I\3I\6I\u0248\nI\rI\16I\u0249\3\u01b0\2J\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2"+
		"s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\3\2\22\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3"+
		"\2aa\3\2<<\3\2$$\3\2))\3\2//\4\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62"+
		";aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082"+
		"\2\1\22\u0278\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3\u0093"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u009b\3\2\2\2\t\u009e\3\2\2\2\13\u00a3\3\2"+
		"\2\2\r\u00a8\3\2\2\2\17\u00ac\3\2\2\2\21\u00b0\3\2\2\2\23\u00b3\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00bb\3\2\2\2\31\u00c0\3\2\2\2\33\u00c7\3\2\2\2"+
		"\35\u00cd\3\2\2\2\37\u00d7\3\2\2\2!\u00e0\3\2\2\2#\u00e8\3\2\2\2%\u00ee"+
		"\3\2\2\2\'\u00f9\3\2\2\2)\u00fd\3\2\2\2+\u0103\3\2\2\2-\u0108\3\2\2\2"+
		"/\u010e\3\2\2\2\61\u0114\3\2\2\2\63\u0117\3\2\2\2\65\u011a\3\2\2\2\67"+
		"\u011c\3\2\2\29\u011e\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0125\3\2"+
		"\2\2A\u0127\3\2\2\2C\u0129\3\2\2\2E\u012b\3\2\2\2G\u012d\3\2\2\2I\u012f"+
		"\3\2\2\2K\u0131\3\2\2\2M\u0133\3\2\2\2O\u014c\3\2\2\2Q\u014e\3\2\2\2S"+
		"\u0154\3\2\2\2U\u0164\3\2\2\2W\u0168\3\2\2\2Y\u016a\3\2\2\2[\u0181\3\2"+
		"\2\2]\u018e\3\2\2\2_\u0193\3\2\2\2a\u0196\3\2\2\2c\u01a1\3\2\2\2e\u01a6"+
		"\3\2\2\2g\u01aa\3\2\2\2i\u01b8\3\2\2\2k\u01ce\3\2\2\2m\u01d1\3\2\2\2o"+
		"\u01d5\3\2\2\2q\u01d9\3\2\2\2s\u01dd\3\2\2\2u\u01df\3\2\2\2w\u01ea\3\2"+
		"\2\2y\u01f0\3\2\2\2{\u01fb\3\2\2\2}\u0201\3\2\2\2\177\u0208\3\2\2\2\u0081"+
		"\u0213\3\2\2\2\u0083\u021b\3\2\2\2\u0085\u021d\3\2\2\2\u0087\u021f\3\2"+
		"\2\2\u0089\u022f\3\2\2\2\u008b\u0234\3\2\2\2\u008d\u0236\3\2\2\2\u008f"+
		"\u023d\3\2\2\2\u0091\u0243\3\2\2\2\u0093\u0094\7w\2\2\u0094\u0095\7u\2"+
		"\2\u0095\u0096\7g\2\2\u0096\4\3\2\2\2\u0097\u0098\7x\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7t\2\2\u009a\6\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7h\2\2\u009d\b\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\f\3\2\2\2\u00a8\u00a9"+
		"\7h\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\16\3\2\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\20\3\2\2\2\u00b0\u00b1"+
		"\7h\2\2\u00b1\u00b2\7p\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7d\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7q\2\2\u00ba\26\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd"+
		"\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7x\2\2\u00bf\30\3\2\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7e\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2"+
		"\u00cc\34\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7"+
		"v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7g\2\2\u00d6\36\3\2\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7v\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7v\2\2"+
		"\u00df \3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7z\2\2\u00e2\u00e3\7v\2"+
		"\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\"\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7u\2\2\u00ed$\3\2\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2"+
		"\u00f6\u00f7\7v\2\2\u00f7\u00f8\7u\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7p\2"+
		"\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7y\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7"+
		"d\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7c\2\2\u0101\u0102"+
		"\7m\2\2\u0102*\3\2\2\2\u0103\u0104\7p\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7z\2\2\u0106\u0107\7v\2\2\u0107,\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7{\2\2\u010b\u010c\7p\2\2\u010c\u010d\7e\2\2\u010d"+
		".\3\2\2\2\u010e\u010f\7c\2\2\u010f\u0110\7y\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7v\2\2\u0113\60\3\2\2\2\u0114\u0115\7/\2\2\u0115"+
		"\u0116\7@\2\2\u0116\62\3\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7@\2\2\u0119"+
		"\64\3\2\2\2\u011a\u011b\7=\2\2\u011b\66\3\2\2\2\u011c\u011d\7?\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\7\60\2\2\u011f:\3\2\2\2\u0120\u0121\7<\2\2\u0121"+
		"<\3\2\2\2\u0122\u0123\7<\2\2\u0123\u0124\7<\2\2\u0124>\3\2\2\2\u0125\u0126"+
		"\7.\2\2\u0126@\3\2\2\2\u0127\u0128\7]\2\2\u0128B\3\2\2\2\u0129\u012a\7"+
		"_\2\2\u012aD\3\2\2\2\u012b\u012c\7}\2\2\u012cF\3\2\2\2\u012d\u012e\7\177"+
		"\2\2\u012eH\3\2\2\2\u012f\u0130\7*\2\2\u0130J\3\2\2\2\u0131\u0132\7+\2"+
		"\2\u0132L\3\2\2\2\u0133\u0134\t\2\2\2\u0134N\3\2\2\2\u0135\u0136\7-\2"+
		"\2\u0136\u014d\7?\2\2\u0137\u0138\7/\2\2\u0138\u014d\7?\2\2\u0139\u013a"+
		"\7,\2\2\u013a\u014d\7?\2\2\u013b\u013c\7\61\2\2\u013c\u014d\7?\2\2\u013d"+
		"\u013e\7\'\2\2\u013e\u014d\7?\2\2\u013f\u014d\t\3\2\2\u0140\u0141\7@\2"+
		"\2\u0141\u014d\7?\2\2\u0142\u0143\7>\2\2\u0143\u014d\7?\2\2\u0144\u0145"+
		"\7(\2\2\u0145\u014d\7(\2\2\u0146\u0147\7~\2\2\u0147\u014d\7~\2\2\u0148"+
		"\u0149\7?\2\2\u0149\u014d\7?\2\2\u014a\u014b\7#\2\2\u014b\u014d\7?\2\2"+
		"\u014c\u0135\3\2\2\2\u014c\u0137\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u013b"+
		"\3\2\2\2\u014c\u013d\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0140\3\2\2\2\u014c"+
		"\u0142\3\2\2\2\u014c\u0144\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0148\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014dP\3\2\2\2\u014e\u014f\7#\2\2\u014fR\3\2"+
		"\2\2\u0150\u0151\7-\2\2\u0151\u0155\7-\2\2\u0152\u0153\7/\2\2\u0153\u0155"+
		"\7/\2\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155T\3\2\2\2\u0156\u0165"+
		"\5W,\2\u0157\u0161\5W,\2\u0158\u0160\5e\63\2\u0159\u015b\t\4\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u0160\t\5\2\2\u015f\u0158\3\2\2\2\u015f"+
		"\u015a\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0156\3\2\2\2\u0164\u0157\3\2\2\2\u0165V\3\2\2\2\u0166\u0169\t\5\2\2"+
		"\u0167\u0169\5e\63\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169X\3"+
		"\2\2\2\u016a\u016b\t\6\2\2\u016b\u016c\5U+\2\u016cZ\3\2\2\2\u016d\u0173"+
		"\7$\2\2\u016e\u0172\n\7\2\2\u016f\u0170\7^\2\2\u0170\u0172\7$\2\2\u0171"+
		"\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0182\7$\2\2\u0177\u017d\7)\2\2\u0178\u017c\n\b\2\2\u0179\u017a\7^\2"+
		"\2\u017a\u017c\7)\2\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0182\7)\2\2\u0181\u016d\3\2\2\2\u0181\u0177\3\2"+
		"\2\2\u0182\\\3\2\2\2\u0183\u0185\t\4\2\2\u0184\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018f\3\2\2\2\u0188"+
		"\u018a\t\t\2\2\u0189\u018b\t\4\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0184\3\2\2\2\u018e\u0188\3\2\2\2\u018f^\3\2\2\2\u0190\u0194\5o8\2\u0191"+
		"\u0192\t\t\2\2\u0192\u0194\5o8\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0194`\3\2\2\2\u0195\u0197\t\n\2\2\u0196\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\b\61\2\2\u019bb\3\2\2\2\u019c\u019e\7\17\2\2\u019d\u019f\7\f\2"+
		"\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a2"+
		"\7\f\2\2\u01a1\u019c\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\b\62\2\2\u01a4d\3\2\2\2\u01a5\u01a7\t\22\2\2\u01a6\u01a5\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9f"+
		"\3\2\2\2\u01aa\u01ab\7\61\2\2\u01ab\u01ac\7,\2\2\u01ac\u01b0\3\2\2\2\u01ad"+
		"\u01af\13\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b4\7,\2\2\u01b4\u01b5\7\61\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\b\64"+
		"\2\2\u01b7h\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7\61\2\2\u01ba\u01be"+
		"\3\2\2\2\u01bb\u01bd\n\13\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2"+
		"\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c1\u01c2\b\65\2\2\u01c2j\3\2\2\2\u01c3\u01cf\t\f\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5\u01cf\7-\2\2\u01c6\u01c7\7G\2\2\u01c7\u01cf\7-\2\2"+
		"\u01c8\u01c9\7g\2\2\u01c9\u01cf\7/\2\2\u01ca\u01cb\7G\2\2\u01cb\u01cc"+
		"\7/\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\5m\67\2\u01ce\u01c3\3\2\2\2\u01ce"+
		"\u01c4\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01ca\3\2"+
		"\2\2\u01cfl\3\2\2\2\u01d0\u01d2\t\r\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4n\3\2\2\2\u01d5"+
		"\u01d7\5\u0089E\2\u01d6\u01d8\5u;\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3"+
		"\2\2\2\u01d8p\3\2\2\2\u01d9\u01db\5y=\2\u01da\u01dc\5w<\2\u01db\u01da"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcr\3\2\2\2\u01dd\u01de\t\16\2\2\u01de"+
		"t\3\2\2\2\u01df\u01e0\7k\2\2\u01e0v\3\2\2\2\u01e1\u01eb\t\17\2\2\u01e2"+
		"\u01e3\7N\2\2\u01e3\u01eb\7w\2\2\u01e4\u01e5\7N\2\2\u01e5\u01eb\7W\2\2"+
		"\u01e6\u01e7\7w\2\2\u01e7\u01eb\7N\2\2\u01e8\u01e9\7W\2\2\u01e9\u01eb"+
		"\7N\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ebx\3\2\2\2\u01ec\u01f1\5{>\2\u01ed"+
		"\u01f1\5}?\2\u01ee\u01f1\5\177@\2\u01ef\u01f1\5\u0081A\2\u01f0\u01ec\3"+
		"\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"z\3\2\2\2\u01f2\u01fc\7\62\2\2\u01f3\u01f8\4\63;\2\u01f4\u01f7\5\u0083"+
		"B\2\u01f5\u01f7\7a\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fc|\3\2\2\2"+
		"\u01fd\u01fe\7\62\2\2\u01fe\u0202\7d\2\2\u01ff\u0200\7\62\2\2\u0200\u0202"+
		"\7D\2\2\u0201\u01fd\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0205\t\20\2\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207~\3\2\2\2\u0208\u020b\7\62\2\2\u0209\u020c"+
		"\5\u0085C\2\u020a\u020c\7a\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2"+
		"\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0080"+
		"\3\2\2\2\u020f\u0210\7\62\2\2\u0210\u0214\7z\2\2\u0211\u0212\7\62\2\2"+
		"\u0212\u0214\7Z\2\2\u0213\u020f\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0218\5\u0087D\2\u0216\u0218\7a\2\2\u0217\u0215\3\2\2\2"+
		"\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u0082\3\2\2\2\u021b\u021c\4\62;\2\u021c\u0084\3\2\2\2\u021d"+
		"\u021e\4\629\2\u021e\u0086\3\2\2\2\u021f\u0220\t\21\2\2\u0220\u0088\3"+
		"\2\2\2\u0221\u0228\5m\67\2\u0222\u0229\5s:\2\u0223\u0224\7\60\2\2\u0224"+
		"\u0226\5m\67\2\u0225\u0227\5k\66\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0229\3\2\2\2\u0228\u0222\3\2\2\2\u0228\u0223\3\2\2\2\u0229"+
		"\u0230\3\2\2\2\u022a\u022b\7\60\2\2\u022b\u022d\5m\67\2\u022c\u022e\5"+
		"k\66\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u0221\3\2\2\2\u022f\u022a\3\2\2\2\u0230\u008a\3\2\2\2\u0231\u0235\5\u008d"+
		"G\2\u0232\u0235\5\u008fH\2\u0233\u0235\5\u0091I\2\u0234\u0231\3\2\2\2"+
		"\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u008c\3\2\2\2\u0236\u023a"+
		"\4\63;\2\u0237\u0239\4\62;\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u008e\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023d\u023f\7\62\2\2\u023e\u0240\4\629\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0090\3\2"+
		"\2\2\u0243\u0244\7\62\2\2\u0244\u0245\7z\2\2\u0245\u0247\3\2\2\2\u0246"+
		"\u0248\t\21\2\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3"+
		"\2\2\2\u0249\u024a\3\2\2\2\u024a\u0092\3\2\2\2\61\2\u014c\u0154\u015c"+
		"\u015f\u0161\u0164\u0168\u0171\u0173\u017b\u017d\u0181\u0186\u018c\u018e"+
		"\u0193\u0198\u019e\u01a1\u01a8\u01b0\u01be\u01ce\u01d3\u01d7\u01db\u01ea"+
		"\u01f0\u01f6\u01f8\u01fb\u0201\u0206\u020b\u020d\u0213\u0217\u0219\u0226"+
		"\u0228\u022d\u022f\u0234\u023a\u0241\u0249\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}