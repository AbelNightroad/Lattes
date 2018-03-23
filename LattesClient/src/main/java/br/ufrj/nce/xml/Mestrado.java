package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("MESTRADO")
public class Mestrado {

	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequenciaFormacao;

	@XStreamAlias("NIVEL")
	@XStreamAsAttribute
	private String nivel;

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;
	
	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;
	
	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;

	@XStreamAlias("CODIGO-CURSO")
	@XStreamAsAttribute
	private String codigoCurso;

	@XStreamAlias("NOME-CURSO")
	@XStreamAsAttribute
	private String nomeCurso;

	@XStreamAlias("CODIGO-AREA-CURSO")
	@XStreamAsAttribute
	private String codigoAreaCurso;

	@XStreamAlias("STATUS-DO-CURSO")
	@XStreamAsAttribute
	private String statusCurso;

	@XStreamAlias("ANO-DE-INICIO")
	@XStreamAsAttribute
	private String anoInicio;

	@XStreamAlias("ANO-DE-CONCLUSAO")
	@XStreamAsAttribute
	private String anoConclusao;

	@XStreamAlias("FLAG-BOLSA")
	@XStreamAsAttribute
	private String flagBolsa;
	
	@XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
	@XStreamAsAttribute
	private String codigoAgenciaFinanciadora;
	
	@XStreamAlias("NOME-AGENCIA")
	@XStreamAsAttribute
	private String nomeAgencia;
	
	@XStreamAlias("ANO-DE-OBTENCAO-DO-TITULO")
	@XStreamAsAttribute
	private String anoObtencaoTitulo;
	
	@XStreamAlias("TITULO-DA-DISSERTACAO-TESE")
	@XStreamAsAttribute
	private String tituloDissertacaoTese;
	
	@XStreamAlias("NOME-COMPLETO-DO-ORIENTADOR")
	@XStreamAsAttribute
	private String nomeCompletoOrientador;

	@XStreamAlias("TIPO-MESTRADO")
	@XStreamAsAttribute
	private String tipoMestrado;
	
	@XStreamAlias("NUMERO-ID-ORIENTADOR")
	@XStreamAsAttribute
	private String numeroIdOrientador;
	
	@XStreamAlias("CODIGO-CURSO-CAPES")
	@XStreamAsAttribute
	private String codigoCursoCapes;
	
	@XStreamAlias("TITULO-DA-DISSERTACAO-TESE-INGLES")
	@XStreamAsAttribute
	private String tituloDissertacaoTeseIngles;
	
	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;
	
	@XStreamAlias("NOME-DO-CO-ORIENTADOR")
	@XStreamAsAttribute
	private String nomeCoOrientador;

	@XStreamAlias("CODIGO-INSTITUICAO-DOUT")
	@XStreamAsAttribute
	private String codigoInstituicaoDout;

	@XStreamAlias("NOME-INSTITUICAO-DOUT")
	@XStreamAsAttribute
	private String nomeInstituicaoDout;

	@XStreamAlias("CODIGO-INSTITUICAO-OUTRA-DOUT")
	@XStreamAsAttribute
	private String codigoInstituicaoOutraDout;

	@XStreamAlias("NOME-INSTITUICAO-OUTRA-DOUT")
	@XStreamAsAttribute
	private String nomeInstituicaoOutraDout;

	@XStreamAlias("NOME-ORIENTADOR-DOUT")
	@XStreamAsAttribute
	private String nomeOrientadorDout;

	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;

	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;

	@XStreamAsAttribute
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;

	public String getSequenciaFormacao() {
		return sequenciaFormacao;
	}

	public void setSequenciaFormacao(String sequenciaFormacao) {
		this.sequenciaFormacao = sequenciaFormacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}

	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getCodigoOrgao() {
		return codigoOrgao;
	}

	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getCodigoAreaCurso() {
		return codigoAreaCurso;
	}

	public void setCodigoAreaCurso(String codigoAreaCurso) {
		this.codigoAreaCurso = codigoAreaCurso;
	}

	public String getStatusCurso() {
		return statusCurso;
	}

	public void setStatusCurso(String statusCurso) {
		this.statusCurso = statusCurso;
	}

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(String anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

	public String getFlagBolsa() {
		return flagBolsa;
	}

	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}

	public String getCodigoAgenciaFinanciadora() {
		return codigoAgenciaFinanciadora;
	}

	public void setCodigoAgenciaFinanciadora(String codigoAgenciaFinanciadora) {
		this.codigoAgenciaFinanciadora = codigoAgenciaFinanciadora;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getAnoObtencaoTitulo() {
		return anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public String getTituloDissertacaoTese() {
		return tituloDissertacaoTese;
	}

	public void setTituloDissertacaoTese(String tituloDissertacaoTese) {
		this.tituloDissertacaoTese = tituloDissertacaoTese;
	}

	public String getNomeCompletoOrientador() {
		return nomeCompletoOrientador;
	}

	public void setNomeCompletoOrientador(String nomeCompletoOrientador) {
		this.nomeCompletoOrientador = nomeCompletoOrientador;
	}

	public String getTipoMestrado() {
		return tipoMestrado;
	}

	public void setTipoMestrado(String tipoMestrado) {
		this.tipoMestrado = tipoMestrado;
	}

	public String getNumeroIdOrientador() {
		return numeroIdOrientador;
	}

	public void setNumeroIdOrientador(String numeroIdOrientador) {
		this.numeroIdOrientador = numeroIdOrientador;
	}

	public String getCodigoCursoCapes() {
		return codigoCursoCapes;
	}

	public void setCodigoCursoCapes(String codigoCursoCapes) {
		this.codigoCursoCapes = codigoCursoCapes;
	}

	public String getTituloDissertacaoTeseIngles() {
		return tituloDissertacaoTeseIngles;
	}

	public void setTituloDissertacaoTeseIngles(String tituloDissertacaoTeseIngles) {
		this.tituloDissertacaoTeseIngles = tituloDissertacaoTeseIngles;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}

	public String getNomeCoOrientador() {
		return nomeCoOrientador;
	}

	public void setNomeCoOrientador(String nomeCoOrientador) {
		this.nomeCoOrientador = nomeCoOrientador;
	}

	public String getCodigoInstituicaoDout() {
		return codigoInstituicaoDout;
	}

	public void setCodigoInstituicaoDout(String codigoInstituicaoDout) {
		this.codigoInstituicaoDout = codigoInstituicaoDout;
	}

	public String getNomeInstituicaoDout() {
		return nomeInstituicaoDout;
	}

	public void setNomeInstituicaoDout(String nomeInstituicaoDout) {
		this.nomeInstituicaoDout = nomeInstituicaoDout;
	}

	public String getCodigoInstituicaoOutraDout() {
		return codigoInstituicaoOutraDout;
	}

	public void setCodigoInstituicaoOutraDout(String codigoInstituicaoOutraDout) {
		this.codigoInstituicaoOutraDout = codigoInstituicaoOutraDout;
	}

	public String getNomeInstituicaoOutraDout() {
		return nomeInstituicaoOutraDout;
	}

	public void setNomeInstituicaoOutraDout(String nomeInstituicaoOutraDout) {
		this.nomeInstituicaoOutraDout = nomeInstituicaoOutraDout;
	}

	public String getNomeOrientadorDout() {
		return nomeOrientadorDout;
	}

	public void setNomeOrientadorDout(String nomeOrientadorDout) {
		this.nomeOrientadorDout = nomeOrientadorDout;
	}

	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public AreasDoConhecimento getAreasDoConhecimento() {
		return areasDoConhecimento;
	}

	public void setAreasDoConhecimento(AreasDoConhecimento areasDoConhecimento) {
		this.areasDoConhecimento = areasDoConhecimento;
	}

	public SetoresDeAtividade getSetoresDeAtividade() {
		return setoresDeAtividade;
	}

	public void setSetoresDeAtividade(SetoresDeAtividade setoresDeAtividade) {
		this.setoresDeAtividade = setoresDeAtividade;
	}
}
