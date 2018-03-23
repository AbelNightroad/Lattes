package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
public class DadosBasicosDeOutrasOrientacoesConcluidas {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;

	@XStreamAlias("TIPO")
	@XStreamAsAttribute
	private String tipo;

	@XStreamAlias("TITULO")
	@XStreamAsAttribute
	private String titulo;

	@XStreamAlias("ANO")
	@XStreamAsAttribute
	private String ano;

	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;

	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;

	@XStreamAlias("HOME-PAGE")
	@XStreamAsAttribute
	private String homePage;

	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;

	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;

	@XStreamAlias("TITULO-INGLES")
	@XStreamAsAttribute
	private String tituloIngles;

	@XStreamAlias("TIPO-INGLES")
	@XStreamAsAttribute
	private String tipoIngles;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getFlagRelevancia() {
		return flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTituloIngles() {
		return tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getTipoIngles() {
		return tipoIngles;
	}

	public void setTipoIngles(String tipoIngles) {
		this.tipoIngles = tipoIngles;
	}
}
