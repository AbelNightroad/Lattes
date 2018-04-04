package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DADOS-BASICOS-DO-TEXTO")
public class DadosBasicosTexto {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;
	
	@XStreamAlias("TITULO-DO-TEXTO")
	@XStreamAsAttribute
	private String tituloTexto;
	
	@XStreamAlias("ANO-DO-TEXTO")
	@XStreamAsAttribute
	private String anoTexto;
	
	@XStreamAlias("PAIS-DE-PUBLICACAO")
	@XStreamAsAttribute
	private String paisPublicacao;
	
	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;
	
	@XStreamAlias("MEIO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String meioDivulgacao;
	
	@XStreamAlias("HOME-PAGE-DO-TRABALHO")
	@XStreamAsAttribute
	private String homePageTrabalho;
	
	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;
	
	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;
	
	@XStreamAlias("TITULO-DO-TEXTO-INGLES")
	@XStreamAsAttribute
	private String tituloTextoIngles;
	
	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientifica;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloTexto() {
		return tituloTexto;
	}

	public void setTituloTexto(String tituloTexto) {
		this.tituloTexto = tituloTexto;
	}

	public String getAnoTexto() {
		return anoTexto;
	}

	public void setAnoTexto(String anoTexto) {
		this.anoTexto = anoTexto;
	}

	public String getPaisPublicacao() {
		return paisPublicacao;
	}

	public void setPaisPublicacao(String paisPublicacao) {
		this.paisPublicacao = paisPublicacao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMeioDivulgacao() {
		return meioDivulgacao;
	}

	public void setMeioDivulgacao(String meioDivulgacao) {
		this.meioDivulgacao = meioDivulgacao;
	}

	public String getHomePageTrabalho() {
		return homePageTrabalho;
	}

	public void setHomePageTrabalho(String homePageTrabalho) {
		this.homePageTrabalho = homePageTrabalho;
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

	public String getTituloTextoIngles() {
		return tituloTextoIngles;
	}

	public void setTituloTextoIngles(String tituloTextoIngles) {
		this.tituloTextoIngles = tituloTextoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}
}
