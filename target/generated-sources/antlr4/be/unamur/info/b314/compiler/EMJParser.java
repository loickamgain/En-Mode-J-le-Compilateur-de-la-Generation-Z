// Generated from be/unamur/info/b314/compiler/EMJParser.g4 by ANTLR 4.9.3
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EMJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, COMMENT=2, LOUD_SPEAKER=3, SPEAKER_HIGH_VOLUME=4, SPEAKER_LOW_VOLUME=5, 
		CARTE=6, POLICE=7, HOUSES=8, MOTORWAY=9, VOLCANO=10, CONSTRUCTION=11, 
		TRACTOR=12, WAVES=13, HAUTARROW=14, DROITEARROW=15, BASARROW=16, GAUCHEARROW=17, 
		VILLAIN=18, CONNECTOR=19, COMPARATOR=20, IF=21, ELSE=22, POINTDOWN=23, 
		INFINIE=24, REPEATBOUTON=25, RETURN=26, VOID=27, ALARME=28, RADIO=29, 
		HANDRAISED=30, INTEGER_EMOJI=31, CHAR_EMOJI=32, STRING_EMOJI=33, BOOL_EMOJI=34, 
		ZERO=35, UN=36, EMOJI_TUPLE_OF=37, IMPORT=38, MAIN=39, TRUE=40, FALSE=41, 
		WITH=42, LPAR=43, RPAR=44, BRACKET1=45, BRACKET2=46, LCURLBRACKET=47, 
		RCURLBRACKET=48, ENTREQUOTE=49, QUOTE=50, POINT=51, MAP=52, COMMA=53, 
		PLUS=54, MINUS=55, MULT=56, DIV=57, EQUAL=58, ENDSTATEMENT=59, NON=60, 
		INTEGER=61, NUMBER=62, CHAR=63, STRING=64, MOTS=65, ID=66, EMOJIES=67, 
		EMOJIS=68, NEWLINE=69, WS=70;
	public static final int
		RULE_root = 0, RULE_program = 1, RULE_imports = 2, RULE_main = 3, RULE_nom_fichier = 4, 
		RULE_map = 5, RULE_element_carte = 6, RULE_instruction = 7, RULE_affectInstr = 8, 
		RULE_ifInstr = 9, RULE_elseInstr = 10, RULE_loopInstr = 11, RULE_preFunc = 12, 
		RULE_tuple = 13, RULE_rightExp = 14, RULE_rightExpB = 15, RULE_bool = 16, 
		RULE_leftExp = 17, RULE_callFunc = 18, RULE_callFuncArgs = 19, RULE_callFuncArg = 20, 
		RULE_intExpr = 21, RULE_boolExp = 22, RULE_funcDecl = 23, RULE_funcType = 24, 
		RULE_funcParams = 25, RULE_funcParamsNotEmpty = 26, RULE_instructions = 27, 
		RULE_funcReturn = 28, RULE_variableExprEmoji = 29, RULE_type = 30, RULE_type_emo = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "program", "imports", "main", "nom_fichier", "map", "element_carte", 
			"instruction", "affectInstr", "ifInstr", "elseInstr", "loopInstr", "preFunc", 
			"tuple", "rightExp", "rightExpB", "bool", "leftExp", "callFunc", "callFuncArgs", 
			"callFuncArg", "intExpr", "boolExp", "funcDecl", "funcType", "funcParams", 
			"funcParamsNotEmpty", "instructions", "funcReturn", "variableExprEmoji", 
			"type", "type_emo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\uD83D\uDCE2'", "'\uD83D\uDD0A'", "'\uD83D\uDD08'", 
			null, "'\uD83D\uDE94'", null, null, "'\uD83C\uDF0B'", "'\uD83D\uDEA7'", 
			"'\uD83D\uDE9C'", "'\uD83C\uDF0A'", null, null, null, null, "'\uD83E\uDDB9'", 
			null, null, "'\uD83E\uDD14'", "'\uD83E\uDD28'", "'\uD83D\uDC47'", null, 
			"'\uD83D\uDD01'", null, "'\uD83C\uDF00'", "'\uD83D\uDEA8'", "'\uD83D\uDCFB'", 
			"'\u270B'", "'\uD83D\uDD22'", "'\uD83D\uDD23'", "'\uD83D\uDD21'", "'\uD83D\uDD1F'", 
			null, null, "'\uD83D\uDC65'", "'\uD83D\uDCE6'", "'\uD83C\uDFE0'", "'\u2705'", 
			"'\u274C'", "'with'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", 
			"'''", "'.'", "'map'", "','", "'+'", "'-'", "'*'", "'/'", "'='", "';'", 
			"'\u26D4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "COMMENT", "LOUD_SPEAKER", "SPEAKER_HIGH_VOLUME", 
			"SPEAKER_LOW_VOLUME", "CARTE", "POLICE", "HOUSES", "MOTORWAY", "VOLCANO", 
			"CONSTRUCTION", "TRACTOR", "WAVES", "HAUTARROW", "DROITEARROW", "BASARROW", 
			"GAUCHEARROW", "VILLAIN", "CONNECTOR", "COMPARATOR", "IF", "ELSE", "POINTDOWN", 
			"INFINIE", "REPEATBOUTON", "RETURN", "VOID", "ALARME", "RADIO", "HANDRAISED", 
			"INTEGER_EMOJI", "CHAR_EMOJI", "STRING_EMOJI", "BOOL_EMOJI", "ZERO", 
			"UN", "EMOJI_TUPLE_OF", "IMPORT", "MAIN", "TRUE", "FALSE", "WITH", "LPAR", 
			"RPAR", "BRACKET1", "BRACKET2", "LCURLBRACKET", "RCURLBRACKET", "ENTREQUOTE", 
			"QUOTE", "POINT", "MAP", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", 
			"ENDSTATEMENT", "NON", "INTEGER", "NUMBER", "CHAR", "STRING", "MOTS", 
			"ID", "EMOJIES", "EMOJIS", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "EMJParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EMJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EMJParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case IMPORT:
				{
				setState(64);
				program();
				}
				break;
			case LINE_COMMENT:
			case CARTE:
				{
				setState(65);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(70);
				imports();
				}
			}

			setState(73);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(EMJParser.IMPORT, 0); }
		public Nom_fichierContext nom_fichier() {
			return getRuleContext(Nom_fichierContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IMPORT);
			setState(76);
			nom_fichier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> VOID() { return getTokens(EMJParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(EMJParser.VOID, i);
		}
		public TerminalNode MAIN() { return getToken(EMJParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode LCURLBRACKET() { return getToken(EMJParser.LCURLBRACKET, 0); }
		public TerminalNode RCURLBRACKET() { return getToken(EMJParser.RCURLBRACKET, 0); }
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(EMJParser.RETURN, 0); }
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			match(VOID);
			setState(79);
			match(MAIN);
			setState(80);
			match(LPAR);
			setState(81);
			match(RPAR);
			setState(82);
			match(LCURLBRACKET);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (HAUTARROW - 14)) | (1L << (DROITEARROW - 14)) | (1L << (BASARROW - 14)) | (1L << (GAUCHEARROW - 14)) | (1L << (IF - 14)) | (1L << (INFINIE - 14)) | (1L << (REPEATBOUTON - 14)) | (1L << (ALARME - 14)) | (1L << (RADIO - 14)) | (1L << (HANDRAISED - 14)) | (1L << (INTEGER_EMOJI - 14)) | (1L << (CHAR_EMOJI - 14)) | (1L << (STRING_EMOJI - 14)) | (1L << (BOOL_EMOJI - 14)) | (1L << (EMOJI_TUPLE_OF - 14)) | (1L << (ID - 14)))) != 0)) {
				{
				{
				setState(83);
				instruction();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(89);
				match(RETURN);
				setState(90);
				match(VOID);
				setState(91);
				match(ENDSTATEMENT);
				}
			}

			setState(94);
			match(RCURLBRACKET);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INTEGER_EMOJI) | (1L << CHAR_EMOJI) | (1L << STRING_EMOJI) | (1L << BOOL_EMOJI) | (1L << EMOJI_TUPLE_OF))) != 0)) {
				{
				{
				setState(96);
				funcDecl();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nom_fichierContext extends ParserRuleContext {
		public List<TerminalNode> ENTREQUOTE() { return getTokens(EMJParser.ENTREQUOTE); }
		public TerminalNode ENTREQUOTE(int i) {
			return getToken(EMJParser.ENTREQUOTE, i);
		}
		public TerminalNode MOTS() { return getToken(EMJParser.MOTS, 0); }
		public TerminalNode POINT() { return getToken(EMJParser.POINT, 0); }
		public TerminalNode MAP() { return getToken(EMJParser.MAP, 0); }
		public Nom_fichierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nom_fichier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterNom_fichier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitNom_fichier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitNom_fichier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nom_fichierContext nom_fichier() throws RecognitionException {
		Nom_fichierContext _localctx = new Nom_fichierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nom_fichier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ENTREQUOTE);
			setState(103);
			match(MOTS);
			setState(104);
			match(POINT);
			setState(105);
			match(MAP);
			setState(106);
			match(ENTREQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode CARTE() { return getToken(EMJParser.CARTE, 0); }
		public TerminalNode WITH() { return getToken(EMJParser.WITH, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(EMJParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(EMJParser.INTEGER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EMJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EMJParser.COMMA, i);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public TerminalNode HAUTARROW() { return getToken(EMJParser.HAUTARROW, 0); }
		public TerminalNode DROITEARROW() { return getToken(EMJParser.DROITEARROW, 0); }
		public TerminalNode BASARROW() { return getToken(EMJParser.BASARROW, 0); }
		public TerminalNode GAUCHEARROW() { return getToken(EMJParser.GAUCHEARROW, 0); }
		public List<TerminalNode> LINE_COMMENT() { return getTokens(EMJParser.LINE_COMMENT); }
		public TerminalNode LINE_COMMENT(int i) {
			return getToken(EMJParser.LINE_COMMENT, i);
		}
		public List<Element_carteContext> element_carte() {
			return getRuleContexts(Element_carteContext.class);
		}
		public Element_carteContext element_carte(int i) {
			return getRuleContext(Element_carteContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(108);
				match(LINE_COMMENT);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(CARTE);
			setState(115);
			match(WITH);
			setState(116);
			match(INTEGER);
			setState(117);
			match(COMMA);
			setState(118);
			match(INTEGER);
			setState(119);
			match(COMMA);
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAUTARROW) | (1L << DROITEARROW) | (1L << BASARROW) | (1L << GAUCHEARROW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			match(ENDSTATEMENT);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				element_carte();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARTE) | (1L << POLICE) | (1L << HOUSES) | (1L << MOTORWAY) | (1L << VOLCANO) | (1L << CONSTRUCTION) | (1L << TRACTOR) | (1L << WAVES) | (1L << VILLAIN))) != 0) );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_carteContext extends ParserRuleContext {
		public TerminalNode MOTORWAY() { return getToken(EMJParser.MOTORWAY, 0); }
		public TerminalNode POLICE() { return getToken(EMJParser.POLICE, 0); }
		public TerminalNode HOUSES() { return getToken(EMJParser.HOUSES, 0); }
		public TerminalNode CARTE() { return getToken(EMJParser.CARTE, 0); }
		public TerminalNode VOLCANO() { return getToken(EMJParser.VOLCANO, 0); }
		public TerminalNode CONSTRUCTION() { return getToken(EMJParser.CONSTRUCTION, 0); }
		public TerminalNode WAVES() { return getToken(EMJParser.WAVES, 0); }
		public TerminalNode VILLAIN() { return getToken(EMJParser.VILLAIN, 0); }
		public TerminalNode TRACTOR() { return getToken(EMJParser.TRACTOR, 0); }
		public Element_carteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_carte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterElement_carte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitElement_carte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitElement_carte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_carteContext element_carte() throws RecognitionException {
		Element_carteContext _localctx = new Element_carteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element_carte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARTE) | (1L << POLICE) | (1L << HOUSES) | (1L << MOTORWAY) | (1L << VOLCANO) | (1L << CONSTRUCTION) | (1L << TRACTOR) | (1L << WAVES) | (1L << VILLAIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public IfInstrContext ifInstr() {
			return getRuleContext(IfInstrContext.class,0);
		}
		public LoopInstrContext loopInstr() {
			return getRuleContext(LoopInstrContext.class,0);
		}
		public PreFuncContext preFunc() {
			return getRuleContext(PreFuncContext.class,0);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public AffectInstrContext affectInstr() {
			return getRuleContext(AffectInstrContext.class,0);
		}
		public VariableExprEmojiContext variableExprEmoji() {
			return getRuleContext(VariableExprEmojiContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruction);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				ifInstr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				loopInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				preFunc();
				setState(132);
				match(ENDSTATEMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				affectInstr();
				setState(135);
				match(ENDSTATEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				variableExprEmoji();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				callFunc();
				setState(139);
				match(ENDSTATEMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectInstrContext extends ParserRuleContext {
		public LeftExpContext leftExp() {
			return getRuleContext(LeftExpContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(EMJParser.EQUAL, 0); }
		public RightExpContext rightExp() {
			return getRuleContext(RightExpContext.class,0);
		}
		public AffectInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitAffectInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitAffectInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectInstrContext affectInstr() throws RecognitionException {
		AffectInstrContext _localctx = new AffectInstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_affectInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			leftExp();
			setState(144);
			match(EQUAL);
			setState(145);
			rightExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfInstrContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EMJParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public List<TerminalNode> LCURLBRACKET() { return getTokens(EMJParser.LCURLBRACKET); }
		public TerminalNode LCURLBRACKET(int i) {
			return getToken(EMJParser.LCURLBRACKET, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> RCURLBRACKET() { return getTokens(EMJParser.RCURLBRACKET); }
		public TerminalNode RCURLBRACKET(int i) {
			return getToken(EMJParser.RCURLBRACKET, i);
		}
		public TerminalNode ELSE() { return getToken(EMJParser.ELSE, 0); }
		public ElseInstrContext elseInstr() {
			return getRuleContext(ElseInstrContext.class,0);
		}
		public IfInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterIfInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitIfInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitIfInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstrContext ifInstr() throws RecognitionException {
		IfInstrContext _localctx = new IfInstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			match(IF);
			setState(148);
			match(LPAR);
			setState(149);
			boolExp(0);
			setState(150);
			match(RPAR);
			setState(151);
			match(LCURLBRACKET);
			setState(152);
			instructions();
			setState(153);
			match(RCURLBRACKET);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(155);
				match(ELSE);
				setState(156);
				match(LCURLBRACKET);
				setState(157);
				elseInstr();
				setState(158);
				match(RCURLBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseInstrContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode POINTDOWN() { return getToken(EMJParser.POINTDOWN, 0); }
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public ElseInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterElseInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitElseInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitElseInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseInstrContext elseInstr() throws RecognitionException {
		ElseInstrContext _localctx = new ElseInstrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseInstr);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAUTARROW:
			case DROITEARROW:
			case BASARROW:
			case GAUCHEARROW:
			case IF:
			case INFINIE:
			case REPEATBOUTON:
			case ALARME:
			case RADIO:
			case HANDRAISED:
			case INTEGER_EMOJI:
			case CHAR_EMOJI:
			case STRING_EMOJI:
			case BOOL_EMOJI:
			case EMOJI_TUPLE_OF:
			case RCURLBRACKET:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				instructions();
				}
				break;
			case POINTDOWN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(163);
				match(POINTDOWN);
				setState(164);
				match(ENDSTATEMENT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopInstrContext extends ParserRuleContext {
		public TerminalNode INFINIE() { return getToken(EMJParser.INFINIE, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode LCURLBRACKET() { return getToken(EMJParser.LCURLBRACKET, 0); }
		public TerminalNode RCURLBRACKET() { return getToken(EMJParser.RCURLBRACKET, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode REPEATBOUTON() { return getToken(EMJParser.REPEATBOUTON, 0); }
		public TerminalNode INTEGER() { return getToken(EMJParser.INTEGER, 0); }
		public LoopInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterLoopInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitLoopInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitLoopInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopInstrContext loopInstr() throws RecognitionException {
		LoopInstrContext _localctx = new LoopInstrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopInstr);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFINIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(INFINIE);
				setState(168);
				match(LPAR);
				setState(169);
				boolExp(0);
				setState(170);
				match(RPAR);
				setState(171);
				match(LCURLBRACKET);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (HAUTARROW - 14)) | (1L << (DROITEARROW - 14)) | (1L << (BASARROW - 14)) | (1L << (GAUCHEARROW - 14)) | (1L << (IF - 14)) | (1L << (INFINIE - 14)) | (1L << (REPEATBOUTON - 14)) | (1L << (ALARME - 14)) | (1L << (RADIO - 14)) | (1L << (HANDRAISED - 14)) | (1L << (INTEGER_EMOJI - 14)) | (1L << (CHAR_EMOJI - 14)) | (1L << (STRING_EMOJI - 14)) | (1L << (BOOL_EMOJI - 14)) | (1L << (EMOJI_TUPLE_OF - 14)) | (1L << (ID - 14)))) != 0)) {
					{
					{
					setState(172);
					instruction();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(RCURLBRACKET);
				}
				break;
			case REPEATBOUTON:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(REPEATBOUTON);
				setState(181);
				match(LPAR);
				setState(182);
				match(INTEGER);
				setState(183);
				match(RPAR);
				setState(184);
				match(LCURLBRACKET);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (HAUTARROW - 14)) | (1L << (DROITEARROW - 14)) | (1L << (BASARROW - 14)) | (1L << (GAUCHEARROW - 14)) | (1L << (IF - 14)) | (1L << (INFINIE - 14)) | (1L << (REPEATBOUTON - 14)) | (1L << (ALARME - 14)) | (1L << (RADIO - 14)) | (1L << (HANDRAISED - 14)) | (1L << (INTEGER_EMOJI - 14)) | (1L << (CHAR_EMOJI - 14)) | (1L << (STRING_EMOJI - 14)) | (1L << (BOOL_EMOJI - 14)) | (1L << (EMOJI_TUPLE_OF - 14)) | (1L << (ID - 14)))) != 0)) {
					{
					{
					setState(185);
					instruction();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(RCURLBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreFuncContext extends ParserRuleContext {
		public TerminalNode HAUTARROW() { return getToken(EMJParser.HAUTARROW, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode BASARROW() { return getToken(EMJParser.BASARROW, 0); }
		public TerminalNode DROITEARROW() { return getToken(EMJParser.DROITEARROW, 0); }
		public TerminalNode GAUCHEARROW() { return getToken(EMJParser.GAUCHEARROW, 0); }
		public TerminalNode ALARME() { return getToken(EMJParser.ALARME, 0); }
		public TerminalNode RADIO() { return getToken(EMJParser.RADIO, 0); }
		public TerminalNode HANDRAISED() { return getToken(EMJParser.HANDRAISED, 0); }
		public PreFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterPreFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitPreFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitPreFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreFuncContext preFunc() throws RecognitionException {
		PreFuncContext _localctx = new PreFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_preFunc);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAUTARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(HAUTARROW);
				setState(195);
				match(LPAR);
				setState(196);
				intExpr(0);
				setState(197);
				match(RPAR);
				}
				break;
			case BASARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(BASARROW);
				setState(200);
				match(LPAR);
				setState(201);
				intExpr(0);
				setState(202);
				match(RPAR);
				}
				break;
			case DROITEARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(DROITEARROW);
				setState(205);
				match(LPAR);
				setState(206);
				intExpr(0);
				setState(207);
				match(RPAR);
				}
				break;
			case GAUCHEARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(GAUCHEARROW);
				setState(210);
				match(LPAR);
				setState(211);
				intExpr(0);
				setState(212);
				match(RPAR);
				}
				break;
			case ALARME:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(ALARME);
				setState(215);
				match(LPAR);
				setState(216);
				match(RPAR);
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(RADIO);
				setState(218);
				match(LPAR);
				setState(219);
				match(RPAR);
				}
				break;
			case HANDRAISED:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(HANDRAISED);
				setState(221);
				match(LPAR);
				setState(222);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(EMJParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(EMJParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(EMJParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public List<TerminalNode> CHAR() { return getTokens(EMJParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(EMJParser.CHAR, i);
		}
		public List<TerminalNode> STRING() { return getTokens(EMJParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EMJParser.STRING, i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(LPAR);
				setState(226);
				match(INTEGER);
				setState(227);
				match(COMMA);
				setState(228);
				match(INTEGER);
				setState(229);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(LPAR);
				setState(231);
				match(CHAR);
				setState(232);
				match(COMMA);
				setState(233);
				match(CHAR);
				setState(234);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(LPAR);
				setState(236);
				match(STRING);
				setState(237);
				match(COMMA);
				setState(238);
				match(STRING);
				setState(239);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(LPAR);
				setState(241);
				bool();
				setState(242);
				match(COMMA);
				setState(243);
				bool();
				setState(244);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightExpContext extends ParserRuleContext {
		public RightExpBContext rightExpB() {
			return getRuleContext(RightExpBContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public RightExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterRightExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitRightExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitRightExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightExpContext rightExp() throws RecognitionException {
		RightExpContext _localctx = new RightExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rightExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(248);
				rightExpB();
				}
				break;
			case 2:
				{
				setState(249);
				boolExp(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightExpBContext extends ParserRuleContext {
		public LeftExpContext leftExp() {
			return getRuleContext(LeftExpContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(EMJParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EMJParser.STRING, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public RightExpBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExpB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterRightExpB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitRightExpB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitRightExpB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightExpBContext rightExpB() throws RecognitionException {
		RightExpBContext _localctx = new RightExpBContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rightExpB);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				leftExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				intExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				callFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				tuple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(EMJParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EMJParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EMJParser.ID, 0); }
		public TerminalNode ZERO() { return getToken(EMJParser.ZERO, 0); }
		public TerminalNode UN() { return getToken(EMJParser.UN, 0); }
		public LeftExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterLeftExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitLeftExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitLeftExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftExpContext leftExp() throws RecognitionException {
		LeftExpContext _localctx = new LeftExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_leftExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(263);
				match(ZERO);
				}
				}
				break;
			case 2:
				{
				{
				setState(264);
				match(UN);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EMJParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public CallFuncArgsContext callFuncArgs() {
			return getRuleContext(CallFuncArgsContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(LPAR);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (LPAR - 40)) | (1L << (MINUS - 40)) | (1L << (NON - 40)) | (1L << (INTEGER - 40)) | (1L << (CHAR - 40)) | (1L << (STRING - 40)) | (1L << (ID - 40)))) != 0)) {
				{
				setState(269);
				callFuncArgs();
				}
			}

			setState(272);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFuncArgsContext extends ParserRuleContext {
		public List<CallFuncArgContext> callFuncArg() {
			return getRuleContexts(CallFuncArgContext.class);
		}
		public CallFuncArgContext callFuncArg(int i) {
			return getRuleContext(CallFuncArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EMJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EMJParser.COMMA, i);
		}
		public CallFuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterCallFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitCallFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitCallFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncArgsContext callFuncArgs() throws RecognitionException {
		CallFuncArgsContext _localctx = new CallFuncArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callFuncArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			callFuncArg();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				callFuncArg();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFuncArgContext extends ParserRuleContext {
		public RightExpContext rightExp() {
			return getRuleContext(RightExpContext.class,0);
		}
		public CallFuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterCallFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitCallFuncArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitCallFuncArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncArgContext callFuncArg() throws RecognitionException {
		CallFuncArgContext _localctx = new CallFuncArgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callFuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			rightExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntExprContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> LPAR() { return getTokens(EMJParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(EMJParser.LPAR, i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode MINUS() { return getToken(EMJParser.MINUS, 0); }
		public TerminalNode INTEGER() { return getToken(EMJParser.INTEGER, 0); }
		public LeftExpContext leftExp() {
			return getRuleContext(LeftExpContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(EMJParser.PLUS, 0); }
		public TerminalNode MULT() { return getToken(EMJParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(EMJParser.DIV, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_intExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(285);
				match(LPAR);
				setState(286);
				intExpr(0);
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==LPAR || _la==RPAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(289);
				match(MINUS);
				setState(290);
				intExpr(4);
				}
				break;
			case 3:
				{
				setState(291);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(292);
				leftExp();
				}
				break;
			case 5:
				{
				setState(293);
				callFunc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
					setState(296);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(297);
					((IntExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
						((IntExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(298);
					intExpr(0);
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(299);
						match(RPAR);
						}
						break;
					}
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode NON() { return getToken(EMJParser.NON, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public RightExpBContext rightExpB() {
			return getRuleContext(RightExpBContext.class,0);
		}
		public TerminalNode COMPARATOR() { return getToken(EMJParser.COMPARATOR, 0); }
		public TerminalNode CONNECTOR() { return getToken(EMJParser.CONNECTOR, 0); }
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_boolExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(308);
				match(LPAR);
				setState(309);
				boolExp(0);
				setState(310);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(312);
				match(NON);
				setState(313);
				boolExp(3);
				}
				break;
			case 3:
				{
				setState(314);
				bool();
				}
				break;
			case 4:
				{
				setState(315);
				rightExpB();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(319);
						match(COMPARATOR);
						setState(320);
						boolExp(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
						setState(321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(322);
						match(CONNECTOR);
						setState(323);
						boolExp(5);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(EMJParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TerminalNode LCURLBRACKET() { return getToken(EMJParser.LCURLBRACKET, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(EMJParser.RETURN, 0); }
		public FuncReturnContext funcReturn() {
			return getRuleContext(FuncReturnContext.class,0);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public TerminalNode RCURLBRACKET() { return getToken(EMJParser.RCURLBRACKET, 0); }
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			funcType();
			setState(330);
			match(ID);
			setState(331);
			match(LPAR);
			setState(332);
			funcParams();
			setState(333);
			match(RPAR);
			setState(334);
			match(LCURLBRACKET);
			setState(335);
			instructions();
			setState(336);
			match(RETURN);
			setState(337);
			funcReturn();
			setState(338);
			match(ENDSTATEMENT);
			setState(339);
			match(RCURLBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(EMJParser.VOID, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcType);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_EMOJI:
			case CHAR_EMOJI:
			case STRING_EMOJI:
			case BOOL_EMOJI:
			case EMOJI_TUPLE_OF:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamsContext extends ParserRuleContext {
		public FuncParamsNotEmptyContext funcParamsNotEmpty() {
			return getRuleContext(FuncParamsNotEmptyContext.class,0);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_EMOJI) | (1L << CHAR_EMOJI) | (1L << STRING_EMOJI) | (1L << BOOL_EMOJI) | (1L << EMOJI_TUPLE_OF))) != 0)) {
				{
				setState(345);
				funcParamsNotEmpty();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamsNotEmptyContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(EMJParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(EMJParser.COMMA, 0); }
		public FuncParamsNotEmptyContext funcParamsNotEmpty() {
			return getRuleContext(FuncParamsNotEmptyContext.class,0);
		}
		public FuncParamsNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamsNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterFuncParamsNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitFuncParamsNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitFuncParamsNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsNotEmptyContext funcParamsNotEmpty() throws RecognitionException {
		FuncParamsNotEmptyContext _localctx = new FuncParamsNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcParamsNotEmpty);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				type();
				setState(349);
				match(ID);
				setState(350);
				match(COMMA);
				setState(351);
				funcParamsNotEmpty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				type();
				setState(354);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (HAUTARROW - 14)) | (1L << (DROITEARROW - 14)) | (1L << (BASARROW - 14)) | (1L << (GAUCHEARROW - 14)) | (1L << (IF - 14)) | (1L << (INFINIE - 14)) | (1L << (REPEATBOUTON - 14)) | (1L << (ALARME - 14)) | (1L << (RADIO - 14)) | (1L << (HANDRAISED - 14)) | (1L << (INTEGER_EMOJI - 14)) | (1L << (CHAR_EMOJI - 14)) | (1L << (STRING_EMOJI - 14)) | (1L << (BOOL_EMOJI - 14)) | (1L << (EMOJI_TUPLE_OF - 14)) | (1L << (ID - 14)))) != 0)) {
				{
				{
				setState(358);
				instruction();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncReturnContext extends ParserRuleContext {
		public RightExpContext rightExp() {
			return getRuleContext(RightExpContext.class,0);
		}
		public TerminalNode VOID() { return getToken(EMJParser.VOID, 0); }
		public FuncReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterFuncReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitFuncReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitFuncReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncReturnContext funcReturn() throws RecognitionException {
		FuncReturnContext _localctx = new FuncReturnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcReturn);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAR:
			case MINUS:
			case NON:
			case INTEGER:
			case CHAR:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				rightExp();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableExprEmojiContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(EMJParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(EMJParser.EQUAL, 0); }
		public RightExpContext rightExp() {
			return getRuleContext(RightExpContext.class,0);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(EMJParser.ENDSTATEMENT, 0); }
		public VariableExprEmojiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExprEmoji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterVariableExprEmoji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitVariableExprEmoji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitVariableExprEmoji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExprEmojiContext variableExprEmoji() throws RecognitionException {
		VariableExprEmojiContext _localctx = new VariableExprEmojiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableExprEmoji);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				type();
				setState(369);
				match(ID);
				setState(370);
				match(EQUAL);
				setState(371);
				rightExp();
				setState(372);
				match(ENDSTATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				type();
				setState(375);
				match(ID);
				setState(376);
				match(ENDSTATEMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type_emoContext type_emo() {
			return getRuleContext(Type_emoContext.class,0);
		}
		public TerminalNode EMOJI_TUPLE_OF() { return getToken(EMJParser.EMOJI_TUPLE_OF, 0); }
		public TerminalNode LPAR() { return getToken(EMJParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EMJParser.RPAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_EMOJI:
			case CHAR_EMOJI:
			case STRING_EMOJI:
			case BOOL_EMOJI:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				type_emo();
				}
				break;
			case EMOJI_TUPLE_OF:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(381);
				match(EMOJI_TUPLE_OF);
				setState(382);
				match(LPAR);
				setState(383);
				type_emo();
				setState(384);
				match(RPAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_emoContext extends ParserRuleContext {
		public TerminalNode INTEGER_EMOJI() { return getToken(EMJParser.INTEGER_EMOJI, 0); }
		public TerminalNode STRING_EMOJI() { return getToken(EMJParser.STRING_EMOJI, 0); }
		public TerminalNode BOOL_EMOJI() { return getToken(EMJParser.BOOL_EMOJI, 0); }
		public TerminalNode CHAR_EMOJI() { return getToken(EMJParser.CHAR_EMOJI, 0); }
		public Type_emoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_emo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).enterType_emo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EMJParserListener ) ((EMJParserListener)listener).exitType_emo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EMJParserVisitor ) return ((EMJParserVisitor<? extends T>)visitor).visitType_emo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_emoContext type_emo() throws RecognitionException {
		Type_emoContext _localctx = new Type_emoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type_emo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_EMOJI) | (1L << CHAR_EMOJI) | (1L << STRING_EMOJI) | (1L << BOOL_EMOJI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		case 22:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\5\2E\n\2\3\2\3\2\3\3\5\3J\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\5\5\5_\n\5\3\5\3\5"+
		"\3\5\7\5d\n\5\f\5\16\5g\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7p\n\7\f\7"+
		"\16\7s\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7~\n\7\r\7\16\7\177"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00bd\n\r\f\r\16\r\u00c0\13\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e2"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\20\3\20\5\20"+
		"\u00fd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21\3\22\3\22\3"+
		"\23\3\23\3\23\5\23\u010c\n\23\3\24\3\24\3\24\5\24\u0111\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u0118\n\25\f\25\16\25\u011b\13\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0129\n\27\3\27\3\27"+
		"\3\27\3\27\5\27\u012f\n\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013f\n\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0147\n\30\f\30\16\30\u014a\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u015a\n\32"+
		"\3\33\5\33\u015d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0167"+
		"\n\34\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\36\3\36\5\36\u0171"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017d\n\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u0185\n \3!\3!\3!\2\4,.\"\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3\2\20\23\4\2\b\17\24\24"+
		"\3\2*+\3\2-.\3\28;\3\2!$\2\u019e\2D\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\bP\3"+
		"\2\2\2\nh\3\2\2\2\fq\3\2\2\2\16\u0081\3\2\2\2\20\u008f\3\2\2\2\22\u0091"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u00a7\3\2\2\2\30\u00c2\3\2\2\2\32\u00e1\3"+
		"\2\2\2\34\u00f8\3\2\2\2\36\u00fc\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2\2"+
		"\2$\u0108\3\2\2\2&\u010d\3\2\2\2(\u0114\3\2\2\2*\u011c\3\2\2\2,\u0128"+
		"\3\2\2\2.\u013e\3\2\2\2\60\u014b\3\2\2\2\62\u0159\3\2\2\2\64\u015c\3\2"+
		"\2\2\66\u0166\3\2\2\28\u016b\3\2\2\2:\u0170\3\2\2\2<\u017c\3\2\2\2>\u0184"+
		"\3\2\2\2@\u0186\3\2\2\2BE\5\4\3\2CE\5\f\7\2DB\3\2\2\2DC\3\2\2\2EF\3\2"+
		"\2\2FG\7\2\2\3G\3\3\2\2\2HJ\5\6\4\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5"+
		"\b\5\2L\5\3\2\2\2MN\7(\2\2NO\5\n\6\2O\7\3\2\2\2PQ\7\35\2\2QR\7)\2\2RS"+
		"\7-\2\2ST\7.\2\2TX\7\61\2\2UW\5\20\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2X"+
		"Y\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[\\\7\34\2\2\\]\7\35\2\2]_\7=\2\2^[\3\2\2"+
		"\2^_\3\2\2\2_`\3\2\2\2`a\7\62\2\2ae\3\2\2\2bd\5\60\31\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\7\63\2\2ij\7C\2\2jk"+
		"\7\65\2\2kl\7\66\2\2lm\7\63\2\2m\13\3\2\2\2np\7\3\2\2on\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\b\2\2uv\7,\2\2vw\7?\2"+
		"\2wx\7\67\2\2xy\7?\2\2yz\7\67\2\2z{\t\2\2\2{}\7=\2\2|~\5\16\b\2}|\3\2"+
		"\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081"+
		"\u0082\t\3\2\2\u0082\17\3\2\2\2\u0083\u0090\5\24\13\2\u0084\u0090\5\30"+
		"\r\2\u0085\u0086\5\32\16\2\u0086\u0087\7=\2\2\u0087\u0090\3\2\2\2\u0088"+
		"\u0089\5\22\n\2\u0089\u008a\7=\2\2\u008a\u0090\3\2\2\2\u008b\u0090\5<"+
		"\37\2\u008c\u008d\5&\24\2\u008d\u008e\7=\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0083\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u0088\3\2"+
		"\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092"+
		"\5$\23\2\u0092\u0093\7<\2\2\u0093\u0094\5\36\20\2\u0094\23\3\2\2\2\u0095"+
		"\u0096\7\27\2\2\u0096\u0097\7-\2\2\u0097\u0098\5.\30\2\u0098\u0099\7."+
		"\2\2\u0099\u009a\7\61\2\2\u009a\u009b\58\35\2\u009b\u009c\7\62\2\2\u009c"+
		"\u00a2\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\5"+
		"\26\f\2\u00a0\u00a1\7\62\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a8\58\35\2\u00a5\u00a6\7\31\2"+
		"\2\u00a6\u00a8\7=\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\27"+
		"\3\2\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\5.\30\2\u00ac"+
		"\u00ad\7.\2\2\u00ad\u00b1\7\61\2\2\u00ae\u00b0\5\20\t\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\62\2\2\u00b5\u00c3\3"+
		"\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"\u00ba\7.\2\2\u00ba\u00be\7\61\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00bb\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\7\62\2\2\u00c2\u00a9\3"+
		"\2\2\2\u00c2\u00b6\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5"+
		"\u00c6\7-\2\2\u00c6\u00c7\5,\27\2\u00c7\u00c8\7.\2\2\u00c8\u00e2\3\2\2"+
		"\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc\5,\27\2\u00cc\u00cd"+
		"\7.\2\2\u00cd\u00e2\3\2\2\2\u00ce\u00cf\7\21\2\2\u00cf\u00d0\7-\2\2\u00d0"+
		"\u00d1\5,\27\2\u00d1\u00d2\7.\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\7\23"+
		"\2\2\u00d4\u00d5\7-\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7.\2\2\u00d7\u00e2"+
		"\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\7-\2\2\u00da\u00e2\7.\2\2\u00db"+
		"\u00dc\7\37\2\2\u00dc\u00dd\7-\2\2\u00dd\u00e2\7.\2\2\u00de\u00df\7 \2"+
		"\2\u00df\u00e0\7-\2\2\u00e0\u00e2\7.\2\2\u00e1\u00c4\3\2\2\2\u00e1\u00c9"+
		"\3\2\2\2\u00e1\u00ce\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e4\7-\2\2"+
		"\u00e4\u00e5\7?\2\2\u00e5\u00e6\7\67\2\2\u00e6\u00e7\7?\2\2\u00e7\u00f9"+
		"\7.\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7A\2\2\u00ea\u00eb\7\67\2\2\u00eb"+
		"\u00ec\7A\2\2\u00ec\u00f9\7.\2\2\u00ed\u00ee\7-\2\2\u00ee\u00ef\7B\2\2"+
		"\u00ef\u00f0\7\67\2\2\u00f0\u00f1\7B\2\2\u00f1\u00f9\7.\2\2\u00f2\u00f3"+
		"\7-\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\67\2\2\u00f5\u00f6\5\"\22\2"+
		"\u00f6\u00f7\7.\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e3\3\2\2\2\u00f8\u00e8"+
		"\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9\35\3\2\2\2\u00fa"+
		"\u00fd\5 \21\2\u00fb\u00fd\5.\30\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\37\3\2\2\2\u00fe\u0105\5$\23\2\u00ff\u0105\5,\27\2\u0100\u0105"+
		"\5&\24\2\u0101\u0105\7A\2\2\u0102\u0105\7B\2\2\u0103\u0105\5\34\17\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105!\3\2\2\2\u0106\u0107"+
		"\t\4\2\2\u0107#\3\2\2\2\u0108\u010b\7D\2\2\u0109\u010c\7%\2\2\u010a\u010c"+
		"\7&\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"%\3\2\2\2\u010d\u010e\7D\2\2\u010e\u0110\7-\2\2\u010f\u0111\5(\25\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7."+
		"\2\2\u0113\'\3\2\2\2\u0114\u0119\5*\26\2\u0115\u0116\7\67\2\2\u0116\u0118"+
		"\5*\26\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a)\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\5\36\20"+
		"\2\u011d+\3\2\2\2\u011e\u011f\b\27\1\2\u011f\u0120\7-\2\2\u0120\u0121"+
		"\5,\27\2\u0121\u0122\t\5\2\2\u0122\u0129\3\2\2\2\u0123\u0124\79\2\2\u0124"+
		"\u0129\5,\27\6\u0125\u0129\7?\2\2\u0126\u0129\5$\23\2\u0127\u0129\5&\24"+
		"\2\u0128\u011e\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u0132\3\2\2\2\u012a\u012b\f\b\2\2\u012b"+
		"\u012c\t\6\2\2\u012c\u012e\5,\27\2\u012d\u012f\7.\2\2\u012e\u012d\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012a\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133-\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u0136\b\30\1\2\u0136\u0137\7-\2\2\u0137\u0138"+
		"\5.\30\2\u0138\u0139\7.\2\2\u0139\u013f\3\2\2\2\u013a\u013b\7>\2\2\u013b"+
		"\u013f\5.\30\5\u013c\u013f\5\"\22\2\u013d\u013f\5 \21\2\u013e\u0135\3"+
		"\2\2\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0148\3\2\2\2\u0140\u0141\f\7\2\2\u0141\u0142\7\26\2\2\u0142\u0147\5"+
		".\30\b\u0143\u0144\f\6\2\2\u0144\u0145\7\25\2\2\u0145\u0147\5.\30\7\u0146"+
		"\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149/\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\5\62\32\2\u014c\u014d\7D\2\2\u014d\u014e\7-\2\2\u014e\u014f\5\64\33\2"+
		"\u014f\u0150\7.\2\2\u0150\u0151\7\61\2\2\u0151\u0152\58\35\2\u0152\u0153"+
		"\7\34\2\2\u0153\u0154\5:\36\2\u0154\u0155\7=\2\2\u0155\u0156\7\62\2\2"+
		"\u0156\61\3\2\2\2\u0157\u015a\5> \2\u0158\u015a\7\35\2\2\u0159\u0157\3"+
		"\2\2\2\u0159\u0158\3\2\2\2\u015a\63\3\2\2\2\u015b\u015d\5\66\34\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\65\3\2\2\2\u015e\u015f\5> \2"+
		"\u015f\u0160\7D\2\2\u0160\u0161\7\67\2\2\u0161\u0162\5\66\34\2\u0162\u0167"+
		"\3\2\2\2\u0163\u0164\5> \2\u0164\u0165\7D\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u015e\3\2\2\2\u0166\u0163\3\2\2\2\u0167\67\3\2\2\2\u0168\u016a\5\20\t"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c9\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0171\5\36\20\2\u016f"+
		"\u0171\7\35\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171;\3\2\2\2"+
		"\u0172\u0173\5> \2\u0173\u0174\7D\2\2\u0174\u0175\7<\2\2\u0175\u0176\5"+
		"\36\20\2\u0176\u0177\7=\2\2\u0177\u017d\3\2\2\2\u0178\u0179\5> \2\u0179"+
		"\u017a\7D\2\2\u017a\u017b\7=\2\2\u017b\u017d\3\2\2\2\u017c\u0172\3\2\2"+
		"\2\u017c\u0178\3\2\2\2\u017d=\3\2\2\2\u017e\u0185\5@!\2\u017f\u0180\7"+
		"\'\2\2\u0180\u0181\7-\2\2\u0181\u0182\5@!\2\u0182\u0183\7.\2\2\u0183\u0185"+
		"\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0185?\3\2\2\2\u0186"+
		"\u0187\t\7\2\2\u0187A\3\2\2\2#DIX^eq\177\u008f\u00a2\u00a7\u00b1\u00be"+
		"\u00c2\u00e1\u00f8\u00fc\u0104\u010b\u0110\u0119\u0128\u012e\u0132\u013e"+
		"\u0146\u0148\u0159\u015c\u0166\u016b\u0170\u017c\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}