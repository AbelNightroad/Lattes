package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
public class DadosBasicosBancaJulgadoraLivreDocencia {

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
	
	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;
	
	@XStreamAlias("HOME-PAGE")
	@XStreamAsAttribute
	private String homePage;
	
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
