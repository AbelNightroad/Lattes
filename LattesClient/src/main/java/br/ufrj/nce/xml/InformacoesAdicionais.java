package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("INFORMACOES-ADICIONAIS")
public class InformacoesAdicionais {

	@XStreamAlias("DESCRICAO-INFORMACOES-ADICIONAIS")
	@XStreamAsAttribute
	private String descricaoInformacoesAdicionais;

	@XStreamAlias("DESCRICAO-INFORMACOES-ADICIONAIS-INGLES")
	@XStreamAsAttribute
	private String descricaoInformacoesAdicionaisIngles;

	public String getDescricaoInformacoesAdicionais() {
		return descricaoInformacoesAdicionais;
	}

	public void setDescricaoInformacoesAdicionais(
			String descricaoInformacoesAdicionais) {
		this.descricaoInformacoesAdicionais = descricaoInformacoesAdicionais;
	}

	public String getDescricaoInformacoesAdicionaisIngles() {
		return descricaoInformacoesAdicionaisIngles;
	}

	public void setDescricaoInformacoesAdicionaisIngles(
			String descricaoInformacoesAdicionaisIngles) {
		this.descricaoInformacoesAdicionaisIngles = descricaoInformacoesAdicionaisIngles;
	}

}
