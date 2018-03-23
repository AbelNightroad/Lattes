package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
public class DetalhamentoDeOrientacoesConcluidaParaMestrado {

	@XStreamAlias("TIPO-DE-ORIENTACAO")
	@XStreamAsAttribute
	private String tipoDeOrientacao;

	@XStreamAlias("NOME-DO-ORIENTADO")
	@XStreamAsAttribute
	private String nomeDoOrientado;

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-DA-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeDaInstituicao;

	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;
	
	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;
	
	@XStreamAlias("CODIGO-CURSO")
	@XStreamAsAttribute
	private String codigoCurso;

	@XStreamAlias("NOME-DO-CURSO")
	@XStreamAsAttribute
	private String nomeDoCurso;

	@XStreamAlias("FLAG-BOLSA")
	@XStreamAsAttribute
	private String flagBolsa;

	@XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
	@XStreamAsAttribute
	private String codigoAgenciaFinanciadora;

	@XStreamAlias("NOME-DA-AGENCIA")
	@XStreamAsAttribute
	private String nomeDaAgencia;

	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroDePaginas;

	@XStreamAlias("NUMERO-ID-ORIENTADO")
	@XStreamAsAttribute
	private String numeroIdOrientado;

	@XStreamAlias("NOME-DO-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeDoCursoIngles;

	public String getTipoDeOrientacao() {
		return tipoDeOrientacao;
	}

	public void setTipoDeOrientacao(String tipoDeOrientacao) {
		this.tipoDeOrientacao = tipoDeOrientacao;
	}

	public String getNomeDoOrientado() {
		return nomeDoOrientado;
	}

	public void setNomeDoOrientado(String nomeDoOrientado) {
		this.nomeDoOrientado = nomeDoOrientado;
	}

	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}

	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}

	public String getNomeDaInstituicao() {
		return nomeDaInstituicao;
	}

	public void setNomeDaInstituicao(String nomeDaInstituicao) {
		this.nomeDaInstituicao = nomeDaInstituicao;
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

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
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

	public String getNomeDaAgencia() {
		return nomeDaAgencia;
	}

	public void setNomeDaAgencia(String nomeDaAgencia) {
		this.nomeDaAgencia = nomeDaAgencia;
	}

	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getNumeroIdOrientado() {
		return numeroIdOrientado;
	}

	public void setNumeroIdOrientado(String numeroIdOrientado) {
		this.numeroIdOrientado = numeroIdOrientado;
	}

	public String getNomeDoCursoIngles() {
		return nomeDoCursoIngles;
	}

	public void setNomeDoCursoIngles(String nomeDoCursoIngles) {
		this.nomeDoCursoIngles = nomeDoCursoIngles;
	}

}
