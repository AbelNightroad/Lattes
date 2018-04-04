package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
public class DetalhamentoOrientacaoConcluidaParaPosDoutorado {

	@XStreamAlias("TIPO-DE-ORIENTACAO")
	@XStreamAsAttribute
	private String tipoOrientacao;
	
	@XStreamAlias("NOME-DO-ORIENTADO")
	@XStreamAsAttribute
	private String nomeOrientado;
	
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
	
	@XStreamAlias("FLAG-BOLSA")
	@XStreamAsAttribute
	private String flagBolsa;
	
	@XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
	@XStreamAsAttribute
	private String codigoAgenciaFinanciadora;
	
	@XStreamAlias("NOME-AGENCIA")
	@XStreamAsAttribute
	private String nomeAgencia;
	
	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("NUMERO-ID-ORIENTADO")
	@XStreamAsAttribute
	private String numeroIdOrientado;
	
	@XStreamAlias("NOME-DO-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;

	public String getTipoOrientacao() {
		return tipoOrientacao;
	}

	public void setTipoOrientacao(String tipoOrientacao) {
		this.tipoOrientacao = tipoOrientacao;
	}

	public String getNomeOrientado() {
		return nomeOrientado;
	}

	public void setNomeOrientado(String nomeOrientado) {
		this.nomeOrientado = nomeOrientado;
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

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getNumeroIdOrientado() {
		return numeroIdOrientado;
	}

	public void setNumeroIdOrientado(String numeroIdOrientado) {
		this.numeroIdOrientado = numeroIdOrientado;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
}

