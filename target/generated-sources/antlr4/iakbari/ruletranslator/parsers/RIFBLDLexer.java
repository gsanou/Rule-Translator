// Generated from RIFBLD.g4 by ANTLR 4.4

	package iakbari.ruletranslator.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIFBLDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		Var=25, IRICONST=26, UNICODE=27, UNICODESTRING=28, ANGLEBRACKIRI=29, NCName=30, 
		CURIE=31, NumericLiteral=32, WS=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Var", 
		"IRICONST", "UNICODE", "UNICODESTRING", "UCHAR", "ECHAR", "HEX", "ANGLEBRACKIRI", 
		"NCName", "CURIE", "PN_CHARS_BASE", "NumericLiteral", "DECIMAL", "DOUBLE", 
		"INTEGER", "UNSIGNEDINT", "WS"
	};


	public RIFBLDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RIFBLD.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u018b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u00be\n\32\f\32"+
		"\16\32\u00c1\13\32\5\32\u00c3\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d6\n\33\3\33"+
		"\3\33\7\33\u00da\n\33\f\33\16\33\u00dd\13\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\6\34\u00f2\n\34\r\34\16\34\u00f3\7\34\u00f6\n\34\f\34\16\34\u00f9\13"+
		"\34\3\35\3\35\3\35\3\35\7\35\u00ff\n\35\f\35\16\35\u0102\13\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011a\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \5 \u0126\n \3!\3!\7!\u012a\n!\f!\16!\u012d"+
		"\13!\3!\3!\3\"\3\"\5\"\u0133\n\"\3\"\3\"\7\"\u0137\n\"\f\"\16\"\u013a"+
		"\13\"\3#\3#\3#\7#\u013f\n#\f#\16#\u0142\13#\3#\3#\5#\u0146\n#\5#\u0148"+
		"\n#\5#\u014a\n#\3#\3#\3#\5#\u014f\n#\3#\3#\7#\u0153\n#\f#\16#\u0156\13"+
		"#\3#\3#\5#\u015a\n#\5#\u015c\n#\5#\u015e\n#\3$\5$\u0161\n$\3%\3%\3%\5"+
		"%\u0166\n%\3&\3&\3&\7&\u016b\n&\f&\16&\u016e\13&\3\'\3\'\3\'\5\'\u0173"+
		"\n\'\3\'\3\'\5\'\u0177\n\'\3\'\3\'\3(\5(\u017c\n(\3(\3(\3)\6)\u0181\n"+
		")\r)\16)\u0182\3*\6*\u0186\n*\r*\16*\u0187\3*\3*\2\2+\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\37C E!G\2"+
		"I\"K\2M\2O\2Q\2S#\3\2\21\f\2##%%\'(-=??A\\aac|~~\u0080\u0080\r\2%%\'("+
		"--//\61;??B\\aac|~~\u0080\u0080\3\2c|\4\2\62;c|\6\2\f\f\17\17$$^^\5\2"+
		"\62;CHch\13\2\2\"$$>>@@^^``bb}}\177\177\t\2%%//\62;DDHHaazz\t\2%%/\60"+
		"\62;DDHHaazz\4\2\62;aa\7\2%%\62\658;C\\c|\3\2\62;\4\2GGgg\4\2--//\5\2"+
		"\13\f\17\17\"\"\u01a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\2S\3\2\2"+
		"\2\3U\3\2\2\2\5X\3\2\2\2\7[\3\2\2\2\tb\3\2\2\2\13h\3\2\2\2\rq\3\2\2\2"+
		"\17t\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25}\3\2\2\2\27\u0082\3\2\2\2\31\u0084"+
		"\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u0090\3\2"+
		"\2\2#\u0093\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u009f\3\2\2\2+\u00a6"+
		"\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00ba\3\2\2"+
		"\2\65\u00c4\3\2\2\2\67\u00eb\3\2\2\29\u00fa\3\2\2\2;\u0119\3\2\2\2=\u011b"+
		"\3\2\2\2?\u0125\3\2\2\2A\u0127\3\2\2\2C\u0132\3\2\2\2E\u0149\3\2\2\2G"+
		"\u0160\3\2\2\2I\u0165\3\2\2\2K\u0167\3\2\2\2M\u016f\3\2\2\2O\u017b\3\2"+
		"\2\2Q\u0180\3\2\2\2S\u0185\3\2\2\2UV\7<\2\2VW\7/\2\2W\4\3\2\2\2XY\7/\2"+
		"\2YZ\7@\2\2Z\6\3\2\2\2[\\\7G\2\2\\]\7z\2\2]^\7k\2\2^_\7u\2\2_`\7v\2\2"+
		"`a\7u\2\2a\b\3\2\2\2bc\7I\2\2cd\7t\2\2de\7q\2\2ef\7w\2\2fg\7r\2\2g\n\3"+
		"\2\2\2hi\7F\2\2ij\7q\2\2jk\7e\2\2kl\7w\2\2lm\7o\2\2mn\7g\2\2no\7p\2\2"+
		"op\7v\2\2p\f\3\2\2\2qr\7`\2\2rs\7`\2\2s\16\3\2\2\2tu\7]\2\2u\20\3\2\2"+
		"\2vw\7,\2\2wx\7+\2\2x\22\3\2\2\2yz\7C\2\2z{\7p\2\2{|\7f\2\2|\24\3\2\2"+
		"\2}~\7D\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\26\3"+
		"\2\2\2\u0082\u0083\7~\2\2\u0083\30\3\2\2\2\u0084\u0085\7%\2\2\u0085\u0086"+
		"\7%\2\2\u0086\32\3\2\2\2\u0087\u0088\7_\2\2\u0088\34\3\2\2\2\u0089\u008a"+
		"\7?\2\2\u008a\36\3\2\2\2\u008b\u008c\7N\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7v\2\2\u008f \3\2\2\2\u0090\u0091\7Q\2\2\u0091\u0092"+
		"\7t\2\2\u0092\"\3\2\2\2\u0093\u0094\7*\2\2\u0094\u0095\7,\2\2\u0095$\3"+
		"\2\2\2\u0096\u0097\7%\2\2\u0097&\3\2\2\2\u0098\u0099\7H\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7n\2\2\u009e(\3\2\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7o\2\2\u00a1"+
		"\u00a2\7r\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5*\3\2\2\2\u00a6\u00a7\7R\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2"+
		"\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7z\2\2\u00ac,\3\2"+
		"\2\2\u00ad\u00ae\7*\2\2\u00ae.\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\60\3\2"+
		"\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\62\3\2\2\2\u00ba\u00c2\7A\2\2\u00bb\u00c3\5C\"\2\u00bc"+
		"\u00be\5G$\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00bb"+
		"\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\64\3\2\2\2\u00c4\u00d5\7$\2\2\u00c5"+
		"\u00c6\7j\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7v\2\2\u00c8\u00d6\7r\2\2"+
		"\u00c9\u00ca\7j\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7r\2\2\u00cd\u00d6\7u\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d6\7r\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\u00d6\7g\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00ce"+
		"\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00db\7<\2\2\u00d8"+
		"\u00da\t\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\t\3\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7`\2\2\u00e1\u00e2\7`\2"+
		"\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7h\2\2\u00e6\u00e7\7<\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7k\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\59\35\2\u00ec\u00ed\7B\2\2"+
		"\u00ed\u00ee\t\4\2\2\u00ee\u00f7\t\4\2\2\u00ef\u00f1\7/\2\2\u00f0\u00f2"+
		"\t\5\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f88\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u0100\7$\2\2\u00fb\u00ff\n\6\2\2\u00fc\u00ff\5=\37\2\u00fd"+
		"\u00ff\5;\36\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104:\3\2\2\2\u0105"+
		"\u0106\7^\2\2\u0106\u0107\7w\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5? \2"+
		"\u0109\u010a\5? \2\u010a\u010b\5? \2\u010b\u010c\5? \2\u010c\u011a\3\2"+
		"\2\2\u010d\u010e\7^\2\2\u010e\u010f\7W\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\5? \2\u0111\u0112\5? \2\u0112\u0113\5? \2\u0113\u0114\5? \2\u0114\u0115"+
		"\5? \2\u0115\u0116\5? \2\u0116\u0117\5? \2\u0117\u0118\5? \2\u0118\u011a"+
		"\3\2\2\2\u0119\u0105\3\2\2\2\u0119\u010d\3\2\2\2\u011a<\3\2\2\2\u011b"+
		"\u011c\7)\2\2\u011c\u011d\7]\2\2\u011d\u011e\7v\2\2\u011e\u011f\7d\2\2"+
		"\u011f\u0120\7p\2\2\u0120\u0121\7t\2\2\u0121\u0122\7h\2\2\u0122\u0123"+
		"\7_\2\2\u0123>\3\2\2\2\u0124\u0126\t\7\2\2\u0125\u0124\3\2\2\2\u0126@"+
		"\3\2\2\2\u0127\u012b\7>\2\2\u0128\u012a\n\b\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7@\2\2\u012fB\3\2\2\2\u0130\u0133"+
		"\5G$\2\u0131\u0133\7a\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0138\3\2\2\2\u0134\u0137\5G$\2\u0135\u0137\t\t\2\2\u0136\u0134\3\2\2"+
		"\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139D\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0147\5G$\2\u013c\u013f"+
		"\5G$\2\u013d\u013f\t\n\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0146\5G$\2\u0144\u0146\t\t\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0140\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u013b\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u015d\7<\2\2\u014c\u014f\5G$\2\u014d\u014f"+
		"\t\13\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u015b\3\2\2\2"+
		"\u0150\u0153\5G$\2\u0151\u0153\t\n\2\2\u0152\u0150\3\2\2\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0159\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015a\5G$\2\u0158\u015a\t\t\2"+
		"\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0154"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u014e\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015eF\3\2\2\2\u015f\u0161\t\f\2\2\u0160\u015f\3\2\2\2"+
		"\u0161H\3\2\2\2\u0162\u0166\5K&\2\u0163\u0166\5M\'\2\u0164\u0166\5O(\2"+
		"\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166J\3"+
		"\2\2\2\u0167\u0168\5O(\2\u0168\u016c\7\60\2\2\u0169\u016b\t\r\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016dL\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0172\5O(\2\u0170\u0171"+
		"\7\60\2\2\u0171\u0173\5Q)\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\t\16\2\2\u0175\u0177\t\17\2\2\u0176\u0175\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5O(\2\u0179"+
		"N\3\2\2\2\u017a\u017c\t\17\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017e\5Q)\2\u017eP\3\2\2\2\u017f\u0181\t\r"+
		"\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183R\3\2\2\2\u0184\u0186\t\20\2\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\b*\2\2\u018aT\3\2\2\2$\2\u00bf\u00c2\u00d5\u00db"+
		"\u00f3\u00f7\u00fe\u0100\u0119\u0125\u012b\u0132\u0136\u0138\u013e\u0140"+
		"\u0145\u0147\u0149\u014e\u0152\u0154\u0159\u015b\u015d\u0160\u0165\u016c"+
		"\u0172\u0176\u017b\u0182\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}