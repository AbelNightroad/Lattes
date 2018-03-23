package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-SOFTWARE")
public class DetalhamentoDoSoftware {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;

	@XStreamAlias("PLATAFORMA")
	@XStreamAsAttribute
	private String plataforma;

	@XStreamAlias("AMBIENTE")
	@XStreamAsAttribute
	private String ambiente;

	@XStreamAlias("DISPONIBILIDADE")
	@XStreamAsAttribute
	private String disponibilidade;

	@XStreamAlias("INSTITUICAO-FINANCIADORA")
	@XStreamAsAttribute
	private String instituicaoFinanciadora;

	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getInstituicaoFinanciadora() {
		return instituicaoFinanciadora;
	}

	public void setInstituicaoFinanciadora(String instituicaoFinanciadora) {
		this.instituicaoFinanciadora = instituicaoFinanciadora;
	}

	public String getFinalidadeIngles() {
		return finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}

}
