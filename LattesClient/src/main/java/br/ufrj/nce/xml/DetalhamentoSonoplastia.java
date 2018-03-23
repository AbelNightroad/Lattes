package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DE-SONOPLASTIA")
public class DetalhamentoSonoplastia {

	@XStreamAlias("FINALIDADE")
	@XStreamAsAttribute
	private String finalidade;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}
}
