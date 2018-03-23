package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
public class OutrasInformacoesRelevantes {

	@XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
	@XStreamAsAttribute
	private String outrasInfoRelevantes;

	public String getOutrasInfoRelevantes() {
		return outrasInfoRelevantes;
	}

	public void setOutrasInfoRelevantes(String outrasInfoRelevantes) {
		this.outrasInfoRelevantes = outrasInfoRelevantes;
	}
	
	
}
