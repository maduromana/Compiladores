// Generated from GramaticaGYH.g4 by ANTLR 4.4

    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaGYHLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		PC=17, OpArit=18, OpRel=19, OpBoolE=20, OpBoolOu=21, Delim=22, Atrib=23, 
		AbrePar=24, FechaPar=25, Var=26, NumInt=27, NumReal=28, Cadeia=29, Espaco=30, 
		Coment=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PC", 
		"OpArit", "OpRel", "OpBoolE", "OpBoolOu", "Delim", "Atrib", "AbrePar", 
		"FechaPar", "Var", "NumInt", "NumReal", "Cadeia", "Espaco", "Coment"
	};


	    private int qtdDecl = 0;
	    private int qtdCmd = 0;
	    private int qtdAtrib = 0;
	    private int qtdEntrada = 0;
	    private int qtdSaida = 0;
	    private int qtdCond = 0;
	    private int qtdRept = 0;
	    private int qtdSubAlg = 0;
	    
	    private TabelaSimbolos tabela = new TabelaSimbolos ();
	    
	    private String _writeVar;
	    private ArrayList<Command> listCmd= new ArrayList<Command>();
	    private GyhProgram programa = new GyhProgram();
	    
	      public void generateCommand(){
	          programa.generateTarget();
	          System.out.println("\n\n Gerando codigo");
	          }
	    


	public GramaticaGYHLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaGYH.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c4\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\7\33\u00d6\n\33\f\33\16\33\u00d9\13\33\3\34\6\34\u00dc\n\34\r\34\16\34"+
		"\u00dd\3\35\6\35\u00e1\n\35\r\35\16\35\u00e2\3\35\3\35\6\35\u00e7\n\35"+
		"\r\35\16\35\u00e8\3\36\3\36\7\36\u00ed\n\36\f\36\16\36\u00f0\13\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \7 \u00fa\n \f \16 \u00fd\13 \3 \3 \2\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!\3\2\t\5\2,-//\61\61\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\f\f\17\17$$\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3"+
		"\2\2\2\5C\3\2\2\2\7F\3\2\2\2\tJ\3\2\2\2\13O\3\2\2\2\rX\3\2\2\2\17\\\3"+
		"\2\2\2\21b\3\2\2\2\23g\3\2\2\2\25k\3\2\2\2\27q\3\2\2\2\31u\3\2\2\2\33"+
		"w\3\2\2\2\35y\3\2\2\2\37}\3\2\2\2!\u0083\3\2\2\2#\u00b5\3\2\2\2%\u00b7"+
		"\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00ca\3\2\2\2"+
		"/\u00cc\3\2\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67"+
		"\u00db\3\2\2\29\u00e0\3\2\2\2;\u00ea\3\2\2\2=\u00f3\3\2\2\2?\u00f7\3\2"+
		"\2\2AB\7\61\2\2B\4\3\2\2\2CD\7U\2\2DE\7G\2\2E\6\3\2\2\2FG\7N\2\2GH\7G"+
		"\2\2HI\7T\2\2I\b\3\2\2\2JK\7R\2\2KL\7T\2\2LM\7Q\2\2MN\7I\2\2N\n\3\2\2"+
		"\2OP\7K\2\2PQ\7O\2\2QR\7R\2\2RS\7T\2\2ST\7K\2\2TU\7O\2\2UV\7K\2\2VW\7"+
		"T\2\2W\f\3\2\2\2XY\7K\2\2YZ\7P\2\2Z[\7V\2\2[\16\3\2\2\2\\]\7G\2\2]^\7"+
		"P\2\2^_\7V\2\2_`\7C\2\2`a\7Q\2\2a\20\3\2\2\2bc\7T\2\2cd\7G\2\2de\7C\2"+
		"\2ef\7N\2\2f\22\3\2\2\2gh\7K\2\2hi\7P\2\2ij\7K\2\2j\24\3\2\2\2kl\7G\2"+
		"\2lm\7P\2\2mn\7S\2\2no\7V\2\2op\7Q\2\2p\26\3\2\2\2qr\7F\2\2rs\7G\2\2s"+
		"t\7E\2\2t\30\3\2\2\2uv\7,\2\2v\32\3\2\2\2wx\7-\2\2x\34\3\2\2\2yz\7H\2"+
		"\2z{\7K\2\2{|\7O\2\2|\36\3\2\2\2}~\7U\2\2~\177\7G\2\2\177\u0080\7P\2\2"+
		"\u0080\u0081\7C\2\2\u0081\u0082\7Q\2\2\u0082 \3\2\2\2\u0083\u0084\7/\2"+
		"\2\u0084\"\3\2\2\2\u0085\u0086\7F\2\2\u0086\u0087\7G\2\2\u0087\u00b6\7"+
		"E\2\2\u0088\u0089\7R\2\2\u0089\u008a\7T\2\2\u008a\u008b\7Q\2\2\u008b\u00b6"+
		"\7I\2\2\u008c\u008d\7K\2\2\u008d\u008e\7P\2\2\u008e\u00b6\7V\2\2\u008f"+
		"\u0090\7T\2\2\u0090\u0091\7G\2\2\u0091\u0092\7C\2\2\u0092\u00b6\7N\2\2"+
		"\u0093\u0094\7N\2\2\u0094\u0095\7G\2\2\u0095\u00b6\7T\2\2\u0096\u0097"+
		"\7K\2\2\u0097\u0098\7O\2\2\u0098\u0099\7R\2\2\u0099\u009a\7T\2\2\u009a"+
		"\u009b\7K\2\2\u009b\u009c\7O\2\2\u009c\u009d\7K\2\2\u009d\u00b6\7T\2\2"+
		"\u009e\u009f\7U\2\2\u009f\u00b6\7G\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a3\7P\2\2\u00a3\u00a4\7C\2\2\u00a4\u00b6\7Q\2\2\u00a5"+
		"\u00a6\7G\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7C\2\2"+
		"\u00a9\u00b6\7Q\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7P\2\2\u00ac\u00ad"+
		"\7S\2\2\u00ad\u00ae\7V\2\2\u00ae\u00b6\7Q\2\2\u00af\u00b0\7K\2\2\u00b0"+
		"\u00b1\7P\2\2\u00b1\u00b6\7K\2\2\u00b2\u00b3\7H\2\2\u00b3\u00b4\7K\2\2"+
		"\u00b4\u00b6\7O\2\2\u00b5\u0085\3\2\2\2\u00b5\u0088\3\2\2\2\u00b5\u008c"+
		"\3\2\2\2\u00b5\u008f\3\2\2\2\u00b5\u0093\3\2\2\2\u00b5\u0096\3\2\2\2\u00b5"+
		"\u009e\3\2\2\2\u00b5\u00a0\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00aa\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6$\3\2\2\2\u00b7\u00b8"+
		"\t\2\2\2\u00b8&\3\2\2\2\u00b9\u00c4\7>\2\2\u00ba\u00bb\7>\2\2\u00bb\u00c4"+
		"\7?\2\2\u00bc\u00c4\7@\2\2\u00bd\u00be\7@\2\2\u00be\u00c4\7?\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0\u00c4\7?\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c4\7?\2\2"+
		"\u00c3\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4(\3\2\2\2\u00c5"+
		"\u00c6\7G\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7W\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0\62\3\2\2\2\u00d1\u00d2"+
		"\7+\2\2\u00d2\64\3\2\2\2\u00d3\u00d7\t\3\2\2\u00d4\u00d6\t\4\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\66\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\t\5\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"8\3\2\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\7\60\2\2\u00e5\u00e7\t\5\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9:\3\2\2\2\u00ea\u00ee\7"+
		"$\2\2\u00eb\u00ed\n\6\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7$\2\2\u00f2<\3\2\2\2\u00f3\u00f4\t\7\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\b\37\2\2\u00f6>\3\2\2\2\u00f7\u00fb\7%\2\2\u00f8"+
		"\u00fa\n\b\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\b \2\2\u00ff@\3\2\2\2\f\2\u00b5\u00c3\u00d5\u00d7\u00dd\u00e2\u00e8"+
		"\u00ee\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}