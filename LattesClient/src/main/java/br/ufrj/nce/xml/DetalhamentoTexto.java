package br.ufrj.nce.xml;

import java.time.LocalDate;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-TEXTO")
public class DetalhamentoTexto {
	
	@XStreamAlias("TITULO-DO-JORNAL-OU-REVISTA")
	@XStreamAsAttribute
	private String tituloJornalRevista;
	
	@XStreamAlias("ISSN")
	@XStreamAsAttribute
	private String issn;
	
	@XStreamAlias("FORMATO-DATA-DE-PUBLICACAO")
	@XStreamAsAttribute
	private String formatoDataPublicacao;
	
	@XStreamAlias("DATA-DE-PUBLICACAO")
	@XStreamAsAttribute
	private LocalDate dataPublicacao;
	
	@XStreamAlias("VOLUME")
	@XStreamAsAttribute
	private String volume;
	
	@XStreamAlias("PAGINA-INICIAL")
	@XStreamAsAttribute
	private String paginaInicial;
	
	@XStreamAlias("PAGINA-FINAL")
	@XStreamAsAttribute
	private String paginaFinal;
	
	@XStreamAlias("LOCAL-DE-PUBLICACAO")
	@XStreamAsAttribute
	private String localPublicacao;

	public String getTituloJornalRevista() {
		return tituloJornalRevista;
	}

	public void setTituloJornalRevista(String tituloJornalRevista) {
		this.tituloJornalRevista = tituloJornalRevista;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getFormatoDataPublicacao() {
		return formatoDataPublicacao;
	}

	public void setFormatoDataPublicacao(String formatoDataPublicacao) {
		this.formatoDataPublicacao = formatoDataPublicacao;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
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

	public String getLocalPublicacao() {
		return localPublicacao;
	}

	public void setLocalPublicacao(String localPublicacao) {
		this.localPublicacao = localPublicacao;
	}
}
