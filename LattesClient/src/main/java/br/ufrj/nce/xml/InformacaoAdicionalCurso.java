package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("INFORMACAO-ADICIONAL-CURSO")
public class InformacaoAdicionalCurso {

	@XStreamAlias("CODIGO-CURSO")
	@XStreamAsAttribute
	private String codigoCurso;
	
	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;
	
	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;
	
	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;
	
	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;
	
	@XStreamAlias("NOME-GRANDE-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeGrandeAreaConhecimento;
	
	@XStreamAlias("NOME-DA-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeAreaConhecimento;
	
	@XStreamAlias("NOME-DA-SUB-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeSubAreaConhecimento;
	
	@XStreamAlias("NOME-DA-ESPECIALIDADE")
	@XStreamAsAttribute
	private String nomeEspecialidade;
	
	@XStreamAlias("NIVEL-CURSO")
	@XStreamAsAttribute
	private String nivelCurso;

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
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

	public String getNomeGrandeAreaConhecimento() {
		return nomeGrandeAreaConhecimento;
	}

	public void setNomeGrandeAreaConhecimento(String nomeGrandeAreaConhecimento) {
		this.nomeGrandeAreaConhecimento = nomeGrandeAreaConhecimento;
	}

	public String getNomeAreaConhecimento() {
		return nomeAreaConhecimento;
	}

	public void setNomeAreaConhecimento(String nomeAreaConhecimento) {
		this.nomeAreaConhecimento = nomeAreaConhecimento;
	}

	public String getNomeSubAreaConhecimento() {
		return nomeSubAreaConhecimento;
	}

	public void setNomeSubAreaConhecimento(String nomeSubAreaConhecimento) {
		this.nomeSubAreaConhecimento = nomeSubAreaConhecimento;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public String getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}
}
