package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-BASICOS-DE-SONOPLASTIA")
public class DadosBasicosSonoplastia {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;
	
	@XStreamAlias("TITULO")
	@XStreamAsAttribute
	private String titulo;
	
	@XStreamAlias("ANO")
	@XStreamAsAttribute
	private String ano;
	
	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;
	
	@XStreamAlias("MEIO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String meioDivulgacao;
	
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

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
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

	public String getMeioDivulgacao() {
		return meioDivulgacao;
	}

	public void setMeioDivulgacao(String meioDivulgacao) {
		this.meioDivulgacao = meioDivulgacao;
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
}
