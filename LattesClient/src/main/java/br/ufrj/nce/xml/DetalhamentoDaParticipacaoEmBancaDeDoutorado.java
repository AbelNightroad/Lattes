package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
public class DetalhamentoDaParticipacaoEmBancaDeDoutorado {

	@XStreamAlias("NOME-DO-CANDIDATO")
	@XStreamAsAttribute
	private String nomeDoCandidato;

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

	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;

	public String getNomeDoCandidato() {
		return nomeDoCandidato;
	}

	public void setNomeDoCandidato(String nomeDoCandidato) {
		this.nomeDoCandidato = nomeDoCandidato;
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

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
}
