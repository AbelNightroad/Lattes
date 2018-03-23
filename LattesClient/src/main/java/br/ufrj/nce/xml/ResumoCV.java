package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RESUMO-CV")
public class ResumoCV {

	@XStreamAlias("TEXTO-RESUMO-CV-RH")
	@XStreamAsAttribute
	private String textoResumoCvRh;

	@XStreamAlias("TEXTO-RESUMO-CV-RH-EN")
	@XStreamAsAttribute
	private String textoResumoCvRhEn;

	public String getTextoResumoCvRh() {
		return textoResumoCvRh;
	}

	public void setTextoResumoCvRh(String textoResumoCvRh) {
		this.textoResumoCvRh = textoResumoCvRh;
	}

	public String getTextoResumoCvRhEn() {
		return textoResumoCvRhEn;
	}

	public void setTextoResumoCvRhEn(String textoResumoCvRhEn) {
		this.textoResumoCvRhEn = textoResumoCvRhEn;
	}

}
