package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DA-MIDIA-SOCIAL-WEBSITE-BLOG")
public class DetalhamentoMidiaSocialWebsiteBlog {

	@XStreamAlias("TEMA")
	@XStreamAsAttribute
	private String tema;

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
}
