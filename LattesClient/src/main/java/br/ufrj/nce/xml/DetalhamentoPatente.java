package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("DETALHAMENTO-DA-PATENTE")
public class DetalhamentoPatente {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("INSTITUICAO-FINANCIADORA")
	@XStreamAsAttribute
	private String instituicaoFinanciadora;
	
	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;
	
	@XStreamAlias("CATEGORIA")
	@XStreamAsAttribute
	private String categoria;
	
	@XStreamImplicit(itemFieldName = "REGISTRO-OU-PATENTE")
	private List<RegistroOuPatente> registroOuPatente;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<RegistroOuPatente> getRegistroOuPatente() {
		return registroOuPatente;
	}

	public void setRegistroOuPatente(List<RegistroOuPatente> registroOuPatente) {
		this.registroOuPatente = registroOuPatente;
	}
}
