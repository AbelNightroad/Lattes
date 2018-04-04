package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DO-ARTIGO")
public class DetalhamentoDoArtigo {

	@XStreamAlias("TITULO-DO-PERIODICO-OU-REVISTA")
	@XStreamAsAttribute
	private String tituloDoPeriodicoOuRevista;

	@XStreamAlias("ISSN")
	@XStreamAsAttribute
	private String issn;

	@XStreamAlias("VOLUME")
	@XStreamAsAttribute
	private String volume;

	@XStreamAlias("FASCICULO")
	@XStreamAsAttribute
	private String fasciculo;

	@XStreamAlias("SERIE")
	@XStreamAsAttribute
	private String serie;

	@XStreamAlias("PAGINA-INICIAL")
	@XStreamAsAttribute
	private String paginaInicial;

	@XStreamAlias("PAGINA-FINAL")
	@XStreamAsAttribute
	private String paginaFinal;

	@XStreamAlias("LOCAL-DE-PUBLICACAO")
	@XStreamAsAttribute
	private String localDePublicacao;

	public String getTituloDoPeriodicoOuRevista() {
		return tituloDoPeriodicoOuRevista;
	}

	public void setTituloDoPeriodicoOuRevista(String tituloDoPeriodicoOuRevista) {
		this.tituloDoPeriodicoOuRevista = tituloDoPeriodicoOuRevista;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getFasciculo() {
		return fasciculo;
	}

	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPaginaInicial() {
		return paginaInicial;
	}

	public void setPaginaInicial(String paginaInicial) {
		this.paginaInicial = paginaInicial;
	}

	public String getPaginaFinal() {
		return paginaFinal;
	}

	public void setPaginaFinal(String paginaFinal) {
		this.paginaFinal = paginaFinal;
	}

	public String getLocalDePublicacao() {
		return localDePublicacao;
	}

	public void setLocalDePublicacao(String localDePublicacao) {
		this.localDePublicacao = localDePublicacao;
	}

}
