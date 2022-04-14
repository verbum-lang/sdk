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
		Implements=18, New=19, Break=20, Next=21, ArrowRight=22, ARightLB=23, 
		End=24, Attr=25, Point=26, TwoPoint=27, TwoTwoPoint=28, Separator=29, 
		OpenArIndex=30, CloseArIndex=31, OpenBlock=32, CloseBlock=33, OpenOp=34, 
		CloseOp=35, ArithmeticOperator=36, AssignmentOperator=37, Not=38, IncDecOperators=39, 
		Identifier=40, IDPrefix=41, TypeSpec=42, String=43, Integer=44, Float=45, 
		Whitespace=46, Newline=47, Words=48, BlockComment=49, LineComment=50;
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
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "ARightLB", 
			"End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
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
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'->'", "'=>'", "';'", "'='", "'.'", "':'", "'::'", "','", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "ARightLB", 
			"End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u023b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u013d\n&\3\'\3\'\3(\3(\3("+
		"\3(\5(\u0145\n(\3)\3)\3)\3)\6)\u014b\n)\r)\16)\u014c\3)\7)\u0150\n)\f"+
		")\16)\u0153\13)\5)\u0155\n)\3*\3*\5*\u0159\n*\3+\3+\3+\3,\3,\3,\3,\7,"+
		"\u0162\n,\f,\16,\u0165\13,\3,\3,\3,\3,\3,\7,\u016c\n,\f,\16,\u016f\13"+
		",\3,\5,\u0172\n,\3-\6-\u0175\n-\r-\16-\u0176\3-\3-\6-\u017b\n-\r-\16-"+
		"\u017c\5-\u017f\n-\3.\3.\3.\5.\u0184\n.\3/\6/\u0187\n/\r/\16/\u0188\3"+
		"/\3/\3\60\3\60\5\60\u018f\n\60\3\60\5\60\u0192\n\60\3\60\3\60\3\61\6\61"+
		"\u0197\n\61\r\61\16\61\u0198\3\62\3\62\3\62\3\62\7\62\u019f\n\62\f\62"+
		"\16\62\u01a2\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u01ad"+
		"\n\63\f\63\16\63\u01b0\13\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u01bf\n\64\3\65\6\65\u01c2\n\65\r\65\16\65"+
		"\u01c3\3\66\3\66\5\66\u01c8\n\66\3\67\3\67\5\67\u01cc\n\67\38\38\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01db\n:\3;\3;\3;\3;\5;\u01e1\n;\3<\3"+
		"<\3<\3<\7<\u01e7\n<\f<\16<\u01ea\13<\5<\u01ec\n<\3=\3=\3=\3=\5=\u01f2"+
		"\n=\3=\6=\u01f5\n=\r=\16=\u01f6\3>\3>\3>\6>\u01fc\n>\r>\16>\u01fd\3?\3"+
		"?\3?\3?\5?\u0204\n?\3?\3?\6?\u0208\n?\r?\16?\u0209\3@\3@\3A\3A\3B\3B\3"+
		"C\3C\3C\3C\3C\5C\u0217\nC\5C\u0219\nC\3C\3C\3C\5C\u021e\nC\5C\u0220\n"+
		"C\3D\3D\3D\5D\u0225\nD\3E\3E\7E\u0229\nE\fE\16E\u022c\13E\3F\3F\6F\u0230"+
		"\nF\rF\16F\u0231\3G\3G\3G\3G\6G\u0238\nG\rG\16G\u0239\3\u01a0\2H\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q\2s"+
		"\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\3\2\22\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3\2aa\3\2<<\3\2$$"+
		"\3\2))\3\2//\4\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5"+
		"\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u0268"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u008f\3\2\2\2\5\u0093\3\2\2\2\7\u0097\3"+
		"\2\2\2\t\u009a\3\2\2\2\13\u009f\3\2\2\2\r\u00a4\3\2\2\2\17\u00a8\3\2\2"+
		"\2\21\u00ac\3\2\2\2\23\u00af\3\2\2\2\25\u00b3\3\2\2\2\27\u00b7\3\2\2\2"+
		"\31\u00bc\3\2\2\2\33\u00c3\3\2\2\2\35\u00c9\3\2\2\2\37\u00d3\3\2\2\2!"+
		"\u00dc\3\2\2\2#\u00e4\3\2\2\2%\u00ea\3\2\2\2\'\u00f5\3\2\2\2)\u00f9\3"+
		"\2\2\2+\u00ff\3\2\2\2-\u0104\3\2\2\2/\u0107\3\2\2\2\61\u010a\3\2\2\2\63"+
		"\u010c\3\2\2\2\65\u010e\3\2\2\2\67\u0110\3\2\2\29\u0112\3\2\2\2;\u0115"+
		"\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E"+
		"\u011f\3\2\2\2G\u0121\3\2\2\2I\u0123\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2"+
		"\2\2O\u0144\3\2\2\2Q\u0154\3\2\2\2S\u0158\3\2\2\2U\u015a\3\2\2\2W\u0171"+
		"\3\2\2\2Y\u017e\3\2\2\2[\u0183\3\2\2\2]\u0186\3\2\2\2_\u0191\3\2\2\2a"+
		"\u0196\3\2\2\2c\u019a\3\2\2\2e\u01a8\3\2\2\2g\u01be\3\2\2\2i\u01c1\3\2"+
		"\2\2k\u01c5\3\2\2\2m\u01c9\3\2\2\2o\u01cd\3\2\2\2q\u01cf\3\2\2\2s\u01da"+
		"\3\2\2\2u\u01e0\3\2\2\2w\u01eb\3\2\2\2y\u01f1\3\2\2\2{\u01f8\3\2\2\2}"+
		"\u0203\3\2\2\2\177\u020b\3\2\2\2\u0081\u020d\3\2\2\2\u0083\u020f\3\2\2"+
		"\2\u0085\u021f\3\2\2\2\u0087\u0224\3\2\2\2\u0089\u0226\3\2\2\2\u008b\u022d"+
		"\3\2\2\2\u008d\u0233\3\2\2\2\u008f\u0090\7w\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7g\2\2\u0092\4\3\2\2\2\u0093\u0094\7x\2\2\u0094\u0095\7c\2\2\u0095"+
		"\u0096\7t\2\2\u0096\6\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7h\2\2\u0099"+
		"\b\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7h\2\2\u009e\n\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3\f\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7d\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7x\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1\u00c2\7e\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7"+
		"k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\34"+
		"\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7e\2\2\u00d1\u00d2\7g\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7"+
		"c\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7v\2\2\u00db"+
		" \3\2\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7z\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7u\2\2"+
		"\u00e3\"\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7c"+
		"\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7u\2\2\u00e9$\3\2\2\2\u00ea\u00eb"+
		"\7k\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7n\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3\u00f4\7u\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7p\2"+
		"\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7y\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7"+
		"d\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7m\2\2\u00fe*\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7z\2\2\u0102\u0103\7v\2\2\u0103,\3\2\2\2\u0104\u0105\7/\2\2\u0105\u0106"+
		"\7@\2\2\u0106.\3\2\2\2\u0107\u0108\7?\2\2\u0108\u0109\7@\2\2\u0109\60"+
		"\3\2\2\2\u010a\u010b\7=\2\2\u010b\62\3\2\2\2\u010c\u010d\7?\2\2\u010d"+
		"\64\3\2\2\2\u010e\u010f\7\60\2\2\u010f\66\3\2\2\2\u0110\u0111\7<\2\2\u0111"+
		"8\3\2\2\2\u0112\u0113\7<\2\2\u0113\u0114\7<\2\2\u0114:\3\2\2\2\u0115\u0116"+
		"\7.\2\2\u0116<\3\2\2\2\u0117\u0118\7]\2\2\u0118>\3\2\2\2\u0119\u011a\7"+
		"_\2\2\u011a@\3\2\2\2\u011b\u011c\7}\2\2\u011cB\3\2\2\2\u011d\u011e\7\177"+
		"\2\2\u011eD\3\2\2\2\u011f\u0120\7*\2\2\u0120F\3\2\2\2\u0121\u0122\7+\2"+
		"\2\u0122H\3\2\2\2\u0123\u0124\t\2\2\2\u0124J\3\2\2\2\u0125\u0126\7-\2"+
		"\2\u0126\u013d\7?\2\2\u0127\u0128\7/\2\2\u0128\u013d\7?\2\2\u0129\u012a"+
		"\7,\2\2\u012a\u013d\7?\2\2\u012b\u012c\7\61\2\2\u012c\u013d\7?\2\2\u012d"+
		"\u012e\7\'\2\2\u012e\u013d\7?\2\2\u012f\u013d\t\3\2\2\u0130\u0131\7@\2"+
		"\2\u0131\u013d\7?\2\2\u0132\u0133\7>\2\2\u0133\u013d\7?\2\2\u0134\u0135"+
		"\7(\2\2\u0135\u013d\7(\2\2\u0136\u0137\7~\2\2\u0137\u013d\7~\2\2\u0138"+
		"\u0139\7?\2\2\u0139\u013d\7?\2\2\u013a\u013b\7#\2\2\u013b\u013d\7?\2\2"+
		"\u013c\u0125\3\2\2\2\u013c\u0127\3\2\2\2\u013c\u0129\3\2\2\2\u013c\u012b"+
		"\3\2\2\2\u013c\u012d\3\2\2\2\u013c\u012f\3\2\2\2\u013c\u0130\3\2\2\2\u013c"+
		"\u0132\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013dL\3\2\2\2\u013e\u013f\7#\2\2\u013fN\3\2"+
		"\2\2\u0140\u0141\7-\2\2\u0141\u0145\7-\2\2\u0142\u0143\7/\2\2\u0143\u0145"+
		"\7/\2\2\u0144\u0140\3\2\2\2\u0144\u0142\3\2\2\2\u0145P\3\2\2\2\u0146\u0155"+
		"\5S*\2\u0147\u0151\5S*\2\u0148\u0150\5a\61\2\u0149\u014b\t\4\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u0150\t\5\2\2\u014f\u0148\3\2\2\2\u014f"+
		"\u014a\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0146\3\2\2\2\u0154\u0147\3\2\2\2\u0155R\3\2\2\2\u0156\u0159\t\5\2\2"+
		"\u0157\u0159\5a\61\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159T\3"+
		"\2\2\2\u015a\u015b\t\6\2\2\u015b\u015c\5Q)\2\u015cV\3\2\2\2\u015d\u0163"+
		"\7$\2\2\u015e\u0162\n\7\2\2\u015f\u0160\7^\2\2\u0160\u0162\7$\2\2\u0161"+
		"\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0172\7$\2\2\u0167\u016d\7)\2\2\u0168\u016c\n\b\2\2\u0169\u016a\7^\2"+
		"\2\u016a\u016c\7)\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0172\7)\2\2\u0171\u015d\3\2\2\2\u0171\u0167\3\2"+
		"\2\2\u0172X\3\2\2\2\u0173\u0175\t\4\2\2\u0174\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017f\3\2\2\2\u0178"+
		"\u017a\t\t\2\2\u0179\u017b\t\4\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u0174\3\2\2\2\u017e\u0178\3\2\2\2\u017fZ\3\2\2\2\u0180\u0184\5k\66\2"+
		"\u0181\u0182\t\t\2\2\u0182\u0184\5k\66\2\u0183\u0180\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\\\3\2\2\2\u0185\u0187\t\n\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\b/\2\2\u018b^\3\2\2\2\u018c\u018e\7\17\2\2\u018d\u018f"+
		"\7\f\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u0192\7\f\2\2\u0191\u018c\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\b\60\2\2\u0194`\3\2\2\2\u0195\u0197\t\22\2\2\u0196\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"b\3\2\2\2\u019a\u019b\7\61\2\2\u019b\u019c\7,\2\2\u019c\u01a0\3\2\2\2"+
		"\u019d\u019f\13\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\7,\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b\62"+
		"\2\2\u01a7d\3\2\2\2\u01a8\u01a9\7\61\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ae"+
		"\3\2\2\2\u01ab\u01ad\n\13\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b1\u01b2\b\63\2\2\u01b2f\3\2\2\2\u01b3\u01bf\t\f\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5\u01bf\7-\2\2\u01b6\u01b7\7G\2\2\u01b7\u01bf\7-\2\2"+
		"\u01b8\u01b9\7g\2\2\u01b9\u01bf\7/\2\2\u01ba\u01bb\7G\2\2\u01bb\u01bc"+
		"\7/\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5i\65\2\u01be\u01b3\3\2\2\2\u01be"+
		"\u01b4\3\2\2\2\u01be\u01b6\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01ba\3\2"+
		"\2\2\u01bfh\3\2\2\2\u01c0\u01c2\t\r\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4j\3\2\2\2\u01c5"+
		"\u01c7\5\u0085C\2\u01c6\u01c8\5q9\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3"+
		"\2\2\2\u01c8l\3\2\2\2\u01c9\u01cb\5u;\2\u01ca\u01cc\5s:\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccn\3\2\2\2\u01cd\u01ce\t\16\2\2\u01ce"+
		"p\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0r\3\2\2\2\u01d1\u01db\t\17\2\2\u01d2"+
		"\u01d3\7N\2\2\u01d3\u01db\7w\2\2\u01d4\u01d5\7N\2\2\u01d5\u01db\7W\2\2"+
		"\u01d6\u01d7\7w\2\2\u01d7\u01db\7N\2\2\u01d8\u01d9\7W\2\2\u01d9\u01db"+
		"\7N\2\2\u01da\u01d1\3\2\2\2\u01da\u01d2\3\2\2\2\u01da\u01d4\3\2\2\2\u01da"+
		"\u01d6\3\2\2\2\u01da\u01d8\3\2\2\2\u01dbt\3\2\2\2\u01dc\u01e1\5w<\2\u01dd"+
		"\u01e1\5y=\2\u01de\u01e1\5{>\2\u01df\u01e1\5}?\2\u01e0\u01dc\3\2\2\2\u01e0"+
		"\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1v\3\2\2\2"+
		"\u01e2\u01ec\7\62\2\2\u01e3\u01e8\4\63;\2\u01e4\u01e7\5\177@\2\u01e5\u01e7"+
		"\7a\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01e2\3\2\2\2\u01eb\u01e3\3\2\2\2\u01ecx\3\2\2\2\u01ed\u01ee"+
		"\7\62\2\2\u01ee\u01f2\7d\2\2\u01ef\u01f0\7\62\2\2\u01f0\u01f2\7D\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\t\20"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7z\3\2\2\2\u01f8\u01fb\7\62\2\2\u01f9\u01fc\5\u0081"+
		"A\2\u01fa\u01fc\7a\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe|\3\2\2\2\u01ff"+
		"\u0200\7\62\2\2\u0200\u0204\7z\2\2\u0201\u0202\7\62\2\2\u0202\u0204\7"+
		"Z\2\2\u0203\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0208\5\u0083B\2\u0206\u0208\7a\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3"+
		"\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"~\3\2\2\2\u020b\u020c\4\62;\2\u020c\u0080\3\2\2\2\u020d\u020e\4\629\2"+
		"\u020e\u0082\3\2\2\2\u020f\u0210\t\21\2\2\u0210\u0084\3\2\2\2\u0211\u0218"+
		"\5i\65\2\u0212\u0219\5o8\2\u0213\u0214\7\60\2\2\u0214\u0216\5i\65\2\u0215"+
		"\u0217\5g\64\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2"+
		"\2\2\u0218\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0219\u0220\3\2\2\2\u021a"+
		"\u021b\7\60\2\2\u021b\u021d\5i\65\2\u021c\u021e\5g\64\2\u021d\u021c\3"+
		"\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0211\3\2\2\2\u021f"+
		"\u021a\3\2\2\2\u0220\u0086\3\2\2\2\u0221\u0225\5\u0089E\2\u0222\u0225"+
		"\5\u008bF\2\u0223\u0225\5\u008dG\2\u0224\u0221\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0224\u0223\3\2\2\2\u0225\u0088\3\2\2\2\u0226\u022a\4\63;\2\u0227"+
		"\u0229\4\62;\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u008a\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u022f\7\62\2\2\u022e\u0230\4\629\2\u022f\u022e\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u008c\3\2\2\2\u0233"+
		"\u0234\7\62\2\2\u0234\u0235\7z\2\2\u0235\u0237\3\2\2\2\u0236\u0238\t\21"+
		"\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u008e\3\2\2\2\61\2\u013c\u0144\u014c\u014f\u0151"+
		"\u0154\u0158\u0161\u0163\u016b\u016d\u0171\u0176\u017c\u017e\u0183\u0188"+
		"\u018e\u0191\u0198\u01a0\u01ae\u01be\u01c3\u01c7\u01cb\u01da\u01e0\u01e6"+
		"\u01e8\u01eb\u01f1\u01f6\u01fb\u01fd\u0203\u0207\u0209\u0216\u0218\u021d"+
		"\u021f\u0224\u022a\u0231\u0239\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}