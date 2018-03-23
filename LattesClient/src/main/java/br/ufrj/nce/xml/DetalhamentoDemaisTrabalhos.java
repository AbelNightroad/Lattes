package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DE-DEMAIS-TRABALHOS")
public class DetalhamentoDemaisTrabalhos {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("LOCAL")
	@XStreamAsAttribute
	private String local;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
