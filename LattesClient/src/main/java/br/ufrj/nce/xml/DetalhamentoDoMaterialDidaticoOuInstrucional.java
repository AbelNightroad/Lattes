package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
public class DetalhamentoDoMaterialDidaticoOuInstrucional {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;

	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getFinalidadeIngles() {
		return finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}

}
