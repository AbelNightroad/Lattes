package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DE-CARTA-MAPA-OU-SILILAR")
public class DetalhamentoCartaMapaSimilar {

	@XStreamAlias("TEMA-DA-CARTA-MAPA-OU-SIMILAR")
	@XStreamAsAttribute
	private String temaCartaMapaSimilar;
	
	@XStreamAlias("TECNICA-UTILIZADA")
	@XStreamAsAttribute
	private String tecnicaUtilizada;
	
	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("AREA-REPRESENTADA")
	@XStreamAsAttribute
	private String areaRepresentada;
	
	@XStreamAlias("INSTITUICAO-FINANCIADORA")
	@XStreamAsAttribute
	private String instituicaoFinanciadora;
	
	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;

	public String getTemaCartaMapaSimilar() {
		return temaCartaMapaSimilar;
	}

	public void setTemaCartaMapaSimilar(String temaCartaMapaSimilar) {
		this.temaCartaMapaSimilar = temaCartaMapaSimilar;
	}

	public String getTecnicaUtilizada() {
		return tecnicaUtilizada;
	}

	public void setTecnicaUtilizada(String tecnicaUtilizada) {
		this.tecnicaUtilizada = tecnicaUtilizada;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getAreaRepresentada() {
		return areaRepresentada;
	}

	public void setAreaRepresentada(String areaRepresentada) {
		this.areaRepresentada = areaRepresentada;
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
