package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("DETALHAMENTO-DO-PRODUTO-TECNOLOGICO")
public class DetalhamentoProdutoTecnologico {
	
	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("DISPONIBILIDADE")
	@XStreamAsAttribute
	private String disponibilidade;
	
	@XStreamAlias("CIDADE-DO-PRODUTO")
	@XStreamAsAttribute
	private String cidadeProduto;
	
	@XStreamAlias("INSTITUICAO-FINANCIADORA")
	@XStreamAsAttribute
	private String instituicaoFinanciadora;
	
	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "REGISTRO-OU-PATENTE")
	private List<RegistroOuPatente> registroOuPatente;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getCidadeProduto() {
		return cidadeProduto;
	}

	public void setCidadeProduto(String cidadeProduto) {
		this.cidadeProduto = cidadeProduto;
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

	public List<RegistroOuPatente> getRegistroOuPatente() {
		return registroOuPatente;
	}

	public void setRegistroOuPatente(List<RegistroOuPatente> registroOuPatente) {
		this.registroOuPatente = registroOuPatente;
	}
}
