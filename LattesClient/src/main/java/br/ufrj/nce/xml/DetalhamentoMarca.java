package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("DETALHAMENTO-DA-MARCA")
public class DetalhamentoMarca {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("FINALIDADE-INGLES")
	@XStreamAsAttribute
	private String finalidadeIngles;
	
	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;
	
	@XStreamImplicit(itemFieldName = "REGISTRO-OU-PATENTE")
	private List<RegistroOuPatente> registroOuPatente;

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

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public List<RegistroOuPatente> getRegistroOuPatente() {
		return registroOuPatente;
	}

	public void setRegistroOuPatente(List<RegistroOuPatente> registroOuPatente) {
		this.registroOuPatente = registroOuPatente;
	}
}
