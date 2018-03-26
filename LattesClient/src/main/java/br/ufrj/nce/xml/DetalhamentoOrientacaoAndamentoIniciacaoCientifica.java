package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
public class DetalhamentoOrientacaoAndamentoIniciacaoCientifica {

	@XStreamAlias("NOME-DO-ORIENTANDO")
	@XStreamAsAttribute
	private String nomeOrientando;
	
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
	
	@XStreamAlias("NUMERO-ID-ORIENTANDO")
	@XStreamAsAttribute
	private String numeroIdOrientando;
	
	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;

	public String getNomeOrientando() {
		return nomeOrientando;
	}

	public void setNomeOrientando(String nomeOrientando) {
		this.nomeOrientando = nomeOrientando;
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

	public String getNumeroIdOrientando() {
		return numeroIdOrientando;
	}

	public void setNumeroIdOrientando(String numeroIdOrientando) {
		this.numeroIdOrientando = numeroIdOrientando;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
}
