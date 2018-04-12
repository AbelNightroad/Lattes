package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("LINHA-DE-PESQUISA")
public class LinhaDePesquisa {

	@XStreamAlias("SEQUENCIA-LINHA")
	@XStreamAsAttribute
	private String sequenciaLinha;

	@XStreamAlias("TITULO-DA-LINHA-DE-PESQUISA")
	@XStreamAsAttribute
	private String tituloDaLinhaDePesquisa;

	@XStreamAlias("FLAG-LINHA-DE-PESQUISA-ATIVA")
	@XStreamAsAttribute
	private String flagLinhaDePesquisaAtiva;

	@XStreamAlias("OBJETIVOS-LINHA-DE-PESQUISA")
	@XStreamAsAttribute
	private String objetivosLinhaDePesquisa;

	@XStreamAlias("TITULO-DA-LINHA-DE-PESQUISA-INGLES")
	@XStreamAsAttribute
	private String tituloDaLinhaDePesquisaIngles;

	@XStreamAlias("OBJETIVOS-LINHA-DE-PESQUISA-INGLES")
	@XStreamAsAttribute
	private String objetivosLinhaDePesquisaIngles;

	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@Embedded
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;

	public String getSequenciaLinha() {
		return sequenciaLinha;
	}

	public void setSequenciaLinha(String sequenciaLinha) {
		this.sequenciaLinha = sequenciaLinha;
	}

	public String getTituloDaLinhaDePesquisa() {
		return tituloDaLinhaDePesquisa;
	}

	public void setTituloDaLinhaDePesquisa(String tituloDaLinhaDePesquisa) {
		this.tituloDaLinhaDePesquisa = tituloDaLinhaDePesquisa;
	}

	public String getFlagLinhaDePesquisaAtiva() {
		return flagLinhaDePesquisaAtiva;
	}

	public void setFlagLinhaDePesquisaAtiva(String flagLinhaDePesquisaAtiva) {
		this.flagLinhaDePesquisaAtiva = flagLinhaDePesquisaAtiva;
	}

	public String getObjetivosLinhaDePesquisa() {
		return objetivosLinhaDePesquisa;
	}

	public void setObjetivosLinhaDePesquisa(String objetivosLinhaDePesquisa) {
		this.objetivosLinhaDePesquisa = objetivosLinhaDePesquisa;
	}

	public String getTituloDaLinhaDePesquisaIngles() {
		return tituloDaLinhaDePesquisaIngles;
	}

	public void setTituloDaLinhaDePesquisaIngles(String tituloDaLinhaDePesquisaIngles) {
		this.tituloDaLinhaDePesquisaIngles = tituloDaLinhaDePesquisaIngles;
	}

	public String getObjetivosLinhaDePesquisaIngles() {
		return objetivosLinhaDePesquisaIngles;
	}

	public void setObjetivosLinhaDePesquisaIngles(String objetivosLinhaDePesquisaIngles) {
		this.objetivosLinhaDePesquisaIngles = objetivosLinhaDePesquisaIngles;
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
