package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@Embeddable
@XStreamAlias("AREA-DE-ATUACAO")
public class AreaDeAtuacao {

	@XStreamAlias("SEQUENCIA-AREA-DE-ATUACAO")
	@XStreamAsAttribute
	private String sequenciaAreaDeAtuacao;

	@XStreamAlias("NOME-GRANDE-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeGrandeAreaDoConhecimento;

	@XStreamAlias("NOME-DA-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeDaAreaDoConhecimento;

	@XStreamAlias("NOME-DA-SUB-AREA-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private String nomeDaSubAreaDoConhecimento;

	@XStreamAlias("NOME-DA-ESPECIALIDADE")
	@XStreamAsAttribute
	private String nomeDaEspecialidade;

	public String getSequenciaAreaDeAtuacao() {
		return sequenciaAreaDeAtuacao;
	}

	public void setSequenciaAreaDeAtuacao(String sequenciaAreaDeAtuacao) {
		this.sequenciaAreaDeAtuacao = sequenciaAreaDeAtuacao;
	}

	public String getNomeGrandeAreaDoConhecimento() {
		return nomeGrandeAreaDoConhecimento;
	}

	public void setNomeGrandeAreaDoConhecimento(String nomeGrandeAreaDoConhecimento) {
		this.nomeGrandeAreaDoConhecimento = nomeGrandeAreaDoConhecimento;
	}

	public String getNomeDaAreaDoConhecimento() {
		return nomeDaAreaDoConhecimento;
	}

	public void setNomeDaAreaDoConhecimento(String nomeDaAreaDoConhecimento) {
		this.nomeDaAreaDoConhecimento = nomeDaAreaDoConhecimento;
	}

	public String getNomeDaSubAreaDoConhecimento() {
		return nomeDaSubAreaDoConhecimento;
	}

	public void setNomeDaSubAreaDoConhecimento(String nomeDaSubAreaDoConhecimento) {
		this.nomeDaSubAreaDoConhecimento = nomeDaSubAreaDoConhecimento;
	}

	public String getNomeDaEspecialidade() {
		return nomeDaEspecialidade;
	}

	public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
		this.nomeDaEspecialidade = nomeDaEspecialidade;
	}
	
	
}
