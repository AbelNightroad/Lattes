package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("GRADUACAO")
public class Graduacao {

	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequenciaFormacao;

	@XStreamAlias("NIVEL")
	@XStreamAsAttribute
	private String nivel;

	@XStreamAlias("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO")
	@XStreamAsAttribute
	private String tituloTrabalhoConclusaoCurso;

	@XStreamAlias("NOME-DO-ORIENTADOR")
	@XStreamAsAttribute
	private String nomeOrientador;

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
	
	@XStreamAlias("NUMERO-ID-ORIENTADOR")
	@XStreamAsAttribute
	private String numeroIdOrientador;
	
	@XStreamAlias("CODIGO-CURSO-CAPES")
	@XStreamAsAttribute
	private String codigoCursoCapes;
	
	@XStreamAlias("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO-INGLES")
	@XStreamAsAttribute
	private String tituloTrabalhoConclusaoCursoIngles;
	
	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;
	
	@XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
	@XStreamAsAttribute
	private String formacaoAcademicaTitulacao;

	@XStreamAlias("TIPO-GRADUACAO")
	@XStreamAsAttribute
	private String tipoGraduacao;

	@XStreamAlias("CODIGO-INSTITUICAO-GRAD")
	@XStreamAsAttribute
	private String codigoInstituicaoGrad;

	@XStreamAlias("NOME-INSTITUICAO-GRAD")
	@XStreamAsAttribute
	private String nomeInstituicaoGrad;

	@XStreamAlias("CODIGO-INSTITUICAO-OUTRA-GRAD")
	@XStreamAsAttribute
	private String codigoInstituicaoOutraGrad;

	@XStreamAlias("NOME-INSTITUICAO-OUTRA-GRAD")
	@XStreamAsAttribute
	private String nomeInstituicaoOutraGrad;

	@XStreamAlias("NOME-ORIENTADOR-GRAD")
	@XStreamAsAttribute
	private String nomeOrientadorGrad;

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

	public String getTituloTrabalhoConclusaoCurso() {
		return tituloTrabalhoConclusaoCurso;
	}

	public void setTituloTrabalhoConclusaoCurso(String tituloTrabalhoConclusaoCurso) {
		this.tituloTrabalhoConclusaoCurso = tituloTrabalhoConclusaoCurso;
	}

	public String getNomeOrientador() {
		return nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
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

	public String getTituloTrabalhoConclusaoCursoIngles() {
		return tituloTrabalhoConclusaoCursoIngles;
	}

	public void setTituloTrabalhoConclusaoCursoIngles(String tituloTrabalhoConclusaoCursoIngles) {
		this.tituloTrabalhoConclusaoCursoIngles = tituloTrabalhoConclusaoCursoIngles;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}

	public String getFormacaoAcademicaTitulacao() {
		return formacaoAcademicaTitulacao;
	}

	public void setFormacaoAcademicaTitulacao(String formacaoAcademicaTitulacao) {
		this.formacaoAcademicaTitulacao = formacaoAcademicaTitulacao;
	}

	public String getTipoGraduacao() {
		return tipoGraduacao;
	}

	public void setTipoGraduacao(String tipoGraduacao) {
		this.tipoGraduacao = tipoGraduacao;
	}

	public String getCodigoInstituicaoGrad() {
		return codigoInstituicaoGrad;
	}

	public void setCodigoInstituicaoGrad(String codigoInstituicaoGrad) {
		this.codigoInstituicaoGrad = codigoInstituicaoGrad;
	}

	public String getNomeInstituicaoGrad() {
		return nomeInstituicaoGrad;
	}

	public void setNomeInstituicaoGrad(String nomeInstituicaoGrad) {
		this.nomeInstituicaoGrad = nomeInstituicaoGrad;
	}

	public String getCodigoInstituicaoOutraGrad() {
		return codigoInstituicaoOutraGrad;
	}

	public void setCodigoInstituicaoOutraGrad(String codigoInstituicaoOutraGrad) {
		this.codigoInstituicaoOutraGrad = codigoInstituicaoOutraGrad;
	}

	public String getNomeInstituicaoOutraGrad() {
		return nomeInstituicaoOutraGrad;
	}

	public void setNomeInstituicaoOutraGrad(String nomeInstituicaoOutraGrad) {
		this.nomeInstituicaoOutraGrad = nomeInstituicaoOutraGrad;
	}

	public String getNomeOrientadorGrad() {
		return nomeOrientadorGrad;
	}

	public void setNomeOrientadorGrad(String nomeOrientadorGrad) {
		this.nomeOrientadorGrad = nomeOrientadorGrad;
	}
}
