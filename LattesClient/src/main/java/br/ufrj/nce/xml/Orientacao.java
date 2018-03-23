package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ORIENTACAO")
public class Orientacao {

	@XStreamAlias("SEQUENCIA-ORIENTACAO")
	@XStreamAsAttribute
	private String sequenciaOrientacao;

	@XStreamAlias("TITULO-ORIENTACAO")
	@XStreamAsAttribute
	private String tituloOrientacao;

	@XStreamAlias("TIPO-ORIENTACAO")
	@XStreamAsAttribute
	private String tipoOrientacao;

	@XStreamAlias("TITULO-ORIENTACAO-INGLES")
	@XStreamAsAttribute
	private String tituloOrientacaoIngles;

	public String getSequenciaOrientacao() {
		return sequenciaOrientacao;
	}

	public void setSequenciaOrientacao(String sequenciaOrientacao) {
		this.sequenciaOrientacao = sequenciaOrientacao;
	}

	public String getTituloOrientacao() {
		return tituloOrientacao;
	}

	public void setTituloOrientacao(String tituloOrientacao) {
		this.tituloOrientacao = tituloOrientacao;
	}

	public String getTipoOrientacao() {
		return tipoOrientacao;
	}

	public void setTipoOrientacao(String tipoOrientacao) {
		this.tipoOrientacao = tipoOrientacao;
	}

	public String getTituloOrientacaoIngles() {
		return tituloOrientacaoIngles;
	}

	public void setTituloOrientacaoIngles(String tituloOrientacaoIngles) {
		this.tituloOrientacaoIngles = tituloOrientacaoIngles;
	}
}
