// Generated from Tupy.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TupyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TIPO=2, ESCRITA=3, LEITURA=4, RETORNO=5, NRETORNO=6, FUNCAO=7, 
		SE=8, ENTAO=9, SENAO=10, ENQUANTO=11, OPLOG=12, OPMAT=13, OPREL=14, OPINCDEC=15, 
		OPATRIB=16, FLINHA=17, AP=18, FP=19, AC=20, FC=21, ID=22, NUMINT=23, NUMREAL=24, 
		Str=25, WS=26, ErrorChar=27;
	public static final int
		RULE_programa = 0, RULE_instrucao = 1, RULE_declaracao = 2, RULE_declaracaoComAtribuicao = 3, 
		RULE_atribuicao = 4, RULE_incrementoOuDecremento = 5, RULE_chamadaFuncao = 6, 
		RULE_escrita = 7, RULE_leitura = 8, RULE_retorno = 9, RULE_funcao = 10, 
		RULE_condicional = 11, RULE_repeticao = 12, RULE_expressao = 13, RULE_condicao = 14, 
		RULE_termo = 15, RULE_parametros = 16, RULE_parametrosDef = 17, RULE_argumentos = 18, 
		RULE_bloco = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "declaracao", "declaracaoComAtribuicao", "atribuicao", 
			"incrementoOuDecremento", "chamadaFuncao", "escrita", "leitura", "retorno", 
			"funcao", "condicional", "repeticao", "expressao", "condicao", "termo", 
			"parametros", "parametrosDef", "argumentos", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'esc'", "'lei'", "'ret'", "'nret'", "'func'", "'se'", 
			"'entao'", "'senao'", "'enquanto'", null, null, null, null, "'='", "';'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "ESCRITA", "LEITURA", "RETORNO", "NRETORNO", "FUNCAO", 
			"SE", "ENTAO", "SENAO", "ENQUANTO", "OPLOG", "OPMAT", "OPREL", "OPINCDEC", 
			"OPATRIB", "FLINHA", "AP", "FP", "AC", "FC", "ID", "NUMINT", "NUMREAL", 
			"Str", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "Tupy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TupyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TupyParser.EOF, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				instrucao();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4196796L) != 0) );
			setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracaoComAtribuicaoContext declaracaoComAtribuicao() {
			return getRuleContext(DeclaracaoComAtribuicaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public IncrementoOuDecrementoContext incrementoOuDecremento() {
			return getRuleContext(IncrementoOuDecrementoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				declaracaoComAtribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				atribuicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				incrementoOuDecremento();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				chamadaFuncao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				escrita();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				leitura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				retorno();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				funcao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(56);
				condicional();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(57);
				repeticao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TupyParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TIPO);
			setState(61);
			match(ID);
			setState(62);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoComAtribuicaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TupyParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode OPATRIB() { return getToken(TupyParser.OPATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public DeclaracaoComAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoComAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterDeclaracaoComAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitDeclaracaoComAtribuicao(this);
		}
	}

	public final DeclaracaoComAtribuicaoContext declaracaoComAtribuicao() throws RecognitionException {
		DeclaracaoComAtribuicaoContext _localctx = new DeclaracaoComAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoComAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TIPO);
			setState(65);
			match(ID);
			setState(66);
			match(OPATRIB);
			setState(67);
			expressao(0);
			setState(68);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode OPATRIB() { return getToken(TupyParser.OPATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(OPATRIB);
			setState(72);
			expressao(0);
			setState(73);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoOuDecrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode OPINCDEC() { return getToken(TupyParser.OPINCDEC, 0); }
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public IncrementoOuDecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementoOuDecremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterIncrementoOuDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitIncrementoOuDecremento(this);
		}
	}

	public final IncrementoOuDecrementoContext incrementoOuDecremento() throws RecognitionException {
		IncrementoOuDecrementoContext _localctx = new IncrementoOuDecrementoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incrementoOuDecremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(OPINCDEC);
			setState(77);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(AP);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63176704L) != 0)) {
				{
				setState(81);
				argumentos();
				}
			}

			setState(84);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode ESCRITA() { return getToken(TupyParser.ESCRITA, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escrita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ESCRITA);
			setState(87);
			expressao(0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63176704L) != 0)) {
				{
				setState(88);
				expressao(0);
				}
			}

			setState(91);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode LEITURA() { return getToken(TupyParser.LEITURA, 0); }
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEITURA);
			setState(94);
			match(ID);
			setState(95);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(TupyParser.RETORNO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FLINHA() { return getToken(TupyParser.FLINHA, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(RETORNO);
			setState(98);
			expressao(0);
			setState(99);
			match(FLINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(TupyParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode AC() { return getToken(TupyParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(TupyParser.FC, 0); }
		public TerminalNode TIPO() { return getToken(TupyParser.TIPO, 0); }
		public ParametrosDefContext parametrosDef() {
			return getRuleContext(ParametrosDefContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FUNCAO);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(102);
				match(TIPO);
				}
			}

			setState(105);
			match(ID);
			setState(106);
			match(AP);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(107);
				parametrosDef();
				}
			}

			setState(110);
			match(FP);
			setState(111);
			match(AC);
			setState(112);
			bloco();
			setState(113);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(TupyParser.SE, 0); }
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode ENTAO() { return getToken(TupyParser.ENTAO, 0); }
		public List<TerminalNode> AC() { return getTokens(TupyParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(TupyParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(TupyParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(TupyParser.FC, i);
		}
		public TerminalNode SENAO() { return getToken(TupyParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SE);
			setState(116);
			match(AP);
			setState(117);
			condicao(0);
			setState(118);
			match(FP);
			setState(119);
			match(ENTAO);
			setState(120);
			match(AC);
			setState(121);
			bloco();
			setState(122);
			match(FC);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(123);
				match(SENAO);
				setState(124);
				match(AC);
				setState(125);
				bloco();
				setState(126);
				match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(TupyParser.ENQUANTO, 0); }
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode AC() { return getToken(TupyParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(TupyParser.FC, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ENQUANTO);
			setState(131);
			match(AP);
			setState(132);
			condicao(0);
			setState(133);
			match(FP);
			setState(134);
			match(AC);
			setState(135);
			bloco();
			setState(136);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode OPMAT() { return getToken(TupyParser.OPMAT, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(139);
				termo();
				}
				break;
			case 2:
				{
				setState(140);
				match(AP);
				setState(141);
				expressao(0);
				setState(142);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					match(OPMAT);
					setState(148);
					expressao(3);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode OPREL() { return getToken(TupyParser.OPREL, 0); }
		public TerminalNode OPLOG() { return getToken(TupyParser.OPLOG, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		return condicao(0);
	}

	private CondicaoContext condicao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicaoContext _localctx = new CondicaoContext(_ctx, _parentState);
		CondicaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condicao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(155);
				expressao(0);
				}
				break;
			case 2:
				{
				setState(156);
				match(AP);
				setState(157);
				condicao(0);
				setState(158);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(162);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(163);
						match(OPREL);
						setState(164);
						condicao(4);
						}
						break;
					case 2:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(165);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(166);
						match(OPLOG);
						setState(167);
						condicao(3);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TupyParser.ID, 0); }
		public TerminalNode NUMINT() { return getToken(TupyParser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(TupyParser.NUMREAL, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode AP() { return getToken(TupyParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(TupyParser.FP, 0); }
		public TerminalNode Str() { return getToken(TupyParser.Str, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NUMINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(NUMREAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				chamadaFuncao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(AP);
				setState(178);
				expressao(0);
				setState(179);
				match(FP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(Str);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			expressao(0);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(185);
				match(T__0);
				setState(186);
				expressao(0);
				}
				}
				setState(191);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TupyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TupyParser.ID, i);
		}
		public ParametrosDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterParametrosDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitParametrosDef(this);
		}
	}

	public final ParametrosDefContext parametrosDef() throws RecognitionException {
		ParametrosDefContext _localctx = new ParametrosDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametrosDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(193);
				match(T__0);
				setState(194);
				match(ID);
				}
				}
				setState(199);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expressao(0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(201);
				match(T__0);
				setState(202);
				expressao(0);
				}
				}
				setState(207);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupyListener ) ((TupyListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4196796L) != 0)) {
				{
				{
				setState(208);
				instrucao();
				}
				}
				setState(213);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 14:
			return condicao_sempred((CondicaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condicao_sempred(CondicaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b"+
		"\u0000\f\u0000+\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\nh\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nm\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0081\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0091"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u0096\b\r\n\r\f\r\u0099\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00a9\b\u000e\n\u000e\f\u000e\u00ac\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b7\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00bc\b\u0010\n\u0010\f\u0010\u00bf"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c4\b\u0011"+
		"\n\u0011\f\u0011\u00c7\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00cc\b\u0012\n\u0012\f\u0012\u00cf\t\u0012\u0001\u0013\u0005\u0013"+
		"\u00d2\b\u0013\n\u0013\f\u0013\u00d5\t\u0013\u0001\u0013\u0000\u0002\u001a"+
		"\u001c\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u00e0\u0000)\u0001\u0000\u0000"+
		"\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010"+
		"]\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014e\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018\u0082\u0001\u0000"+
		"\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000"+
		"\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00b8\u0001\u0000\u0000"+
		"\u0000\"\u00c0\u0001\u0000\u0000\u0000$\u00c8\u0001\u0000\u0000\u0000"+
		"&\u00d3\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001"+
		".\u0001\u0001\u0000\u0000\u0000/;\u0003\u0004\u0002\u00000;\u0003\u0006"+
		"\u0003\u00001;\u0003\b\u0004\u00002;\u0003\n\u0005\u00003;\u0003\f\u0006"+
		"\u00004;\u0003\u000e\u0007\u00005;\u0003\u0010\b\u00006;\u0003\u0012\t"+
		"\u00007;\u0003\u0014\n\u00008;\u0003\u0016\u000b\u00009;\u0003\u0018\f"+
		"\u0000:/\u0001\u0000\u0000\u0000:0\u0001\u0000\u0000\u0000:1\u0001\u0000"+
		"\u0000\u0000:2\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000:4\u0001"+
		"\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000"+
		":7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u0002\u0000\u0000=>\u0005"+
		"\u0016\u0000\u0000>?\u0005\u0011\u0000\u0000?\u0005\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0002\u0000\u0000AB\u0005\u0016\u0000\u0000BC\u0005\u0010"+
		"\u0000\u0000CD\u0003\u001a\r\u0000DE\u0005\u0011\u0000\u0000E\u0007\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0016\u0000\u0000GH\u0005\u0010\u0000\u0000"+
		"HI\u0003\u001a\r\u0000IJ\u0005\u0011\u0000\u0000J\t\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0016\u0000\u0000LM\u0005\u000f\u0000\u0000MN\u0005\u0011"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0016\u0000\u0000"+
		"PR\u0005\u0012\u0000\u0000QS\u0003$\u0012\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0013\u0000"+
		"\u0000U\r\u0001\u0000\u0000\u0000VW\u0005\u0003\u0000\u0000WY\u0003\u001a"+
		"\r\u0000XZ\u0003\u001a\r\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0011\u0000\u0000\\\u000f"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0005\u0016\u0000"+
		"\u0000_`\u0005\u0011\u0000\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0005\u0000\u0000bc\u0003\u001a\r\u0000cd\u0005\u0011\u0000\u0000d\u0013"+
		"\u0001\u0000\u0000\u0000eg\u0005\u0007\u0000\u0000fh\u0005\u0002\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0016\u0000\u0000jl\u0005\u0012\u0000\u0000km\u0003"+
		"\"\u0011\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0005\u0013\u0000\u0000op\u0005\u0014\u0000\u0000"+
		"pq\u0003&\u0013\u0000qr\u0005\u0015\u0000\u0000r\u0015\u0001\u0000\u0000"+
		"\u0000st\u0005\b\u0000\u0000tu\u0005\u0012\u0000\u0000uv\u0003\u001c\u000e"+
		"\u0000vw\u0005\u0013\u0000\u0000wx\u0005\t\u0000\u0000xy\u0005\u0014\u0000"+
		"\u0000yz\u0003&\u0013\u0000z\u0080\u0005\u0015\u0000\u0000{|\u0005\n\u0000"+
		"\u0000|}\u0005\u0014\u0000\u0000}~\u0003&\u0013\u0000~\u007f\u0005\u0015"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0017\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083\u0084\u0005\u0012\u0000"+
		"\u0000\u0084\u0085\u0003\u001c\u000e\u0000\u0085\u0086\u0005\u0013\u0000"+
		"\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0088\u0003&\u0013\u0000"+
		"\u0088\u0089\u0005\u0015\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0006\r\uffff\uffff\u0000\u008b\u0091\u0003\u001e\u000f\u0000"+
		"\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u008e\u0003\u001a\r\u0000\u008e"+
		"\u008f\u0005\u0013\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u008a\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091"+
		"\u0097\u0001\u0000\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000\u0093\u0094"+
		"\u0005\r\u0000\u0000\u0094\u0096\u0003\u001a\r\u0003\u0095\u0092\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u001b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0006"+
		"\u000e\uffff\uffff\u0000\u009b\u00a1\u0003\u001a\r\u0000\u009c\u009d\u0005"+
		"\u0012\u0000\u0000\u009d\u009e\u0003\u001c\u000e\u0000\u009e\u009f\u0005"+
		"\u0013\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009a\u0001"+
		"\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\n\u0003\u0000\u0000\u00a3\u00a4\u0005\u000e"+
		"\u0000\u0000\u00a4\u00a9\u0003\u001c\u000e\u0004\u00a5\u00a6\n\u0002\u0000"+
		"\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0003"+
		"\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u001d\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b7\u0005\u0016\u0000\u0000"+
		"\u00ae\u00b7\u0005\u0017\u0000\u0000\u00af\u00b7\u0005\u0018\u0000\u0000"+
		"\u00b0\u00b7\u0003\f\u0006\u0000\u00b1\u00b2\u0005\u0012\u0000\u0000\u00b2"+
		"\u00b3\u0003\u001a\r\u0000\u00b3\u00b4\u0005\u0013\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u0019\u0000\u0000\u00b6\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00af"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u001f"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bd\u0003\u001a\r\u0000\u00b9\u00ba\u0005"+
		"\u0001\u0000\u0000\u00ba\u00bc\u0003\u001a\r\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be!\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c5\u0005\u0016\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00c4\u0005\u0016\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6#\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cd\u0003\u001a\r\u0000\u00c9\u00ca\u0005\u0001\u0000\u0000\u00ca"+
		"\u00cc\u0003\u001a\r\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce%\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0003\u0002\u0001\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\'\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u0011+:RYgl\u0080\u0090"+
		"\u0097\u00a0\u00a8\u00aa\u00b6\u00bd\u00c5\u00cd\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}