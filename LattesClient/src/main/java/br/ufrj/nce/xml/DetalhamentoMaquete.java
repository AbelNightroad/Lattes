package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DA-MAQUETE")
public class DetalhamentoMaquete {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("OBJETO-REPRESENTADO")
	@XStreamAsAttribute
	private String objetoRepresentada;
	
	@XStreamAlias("MATERIAL-UTILIZADO")
	@XStreamAsAttribute
	private String materialUtilizado;
	
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

	public String getObjetoRepresentada() {
		return objetoRepresentada;
	}

	public void setObjetoRepresentada(String objetoRepresentada) {
		this.objetoRepresentada = objetoRepresentada;
	}

	public String getMaterialUtilizado() {
		return materialUtilizado;
	}

	public void setMaterialUtilizado(String materialUtilizado) {
		this.materialUtilizado = materialUtilizado;
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
