package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-BASICOS-DO-ARTIGO")
public class DadosBasicosDoArtigo {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;

	@XStreamAlias("TITULO-DO-ARTIGO")
	@XStreamAsAttribute
	private String tituloDoArtigo;

	@XStreamAlias("ANO-DO-ARTIGO")
	@XStreamAsAttribute
	private String anoDoArtigo;

	@XStreamAlias("PAIS-DE-PUBLICACAO")
	@XStreamAsAttribute
	private String paisDePublicacao;

	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;

	@XStreamAlias("MEIO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String meioDeDivulgacao;

	@XStreamAlias("HOME-PAGE-DO-TRABALHO")
	@XStreamAsAttribute
	private String homePageDoTrabalho;

	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;

	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;

	@XStreamAlias("TITULO-DO-ARTIGO-INGLES")
	@XStreamAsAttribute
	private String tituloDoArtigoIngles;

	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientifica;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoArtigo() {
		return tituloDoArtigo;
	}

	public void setTituloDoArtigo(String tituloDoArtigo) {
		this.tituloDoArtigo = tituloDoArtigo;
	}

	public String getAnoDoArtigo() {
		return anoDoArtigo;
	}

	public void setAnoDoArtigo(String anoDoArtigo) {
		this.anoDoArtigo = anoDoArtigo;
	}

	public String getPaisDePublicacao() {
		return paisDePublicacao;
	}

	public void setPaisDePublicacao(String paisDePublicacao) {
		this.paisDePublicacao = paisDePublicacao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMeioDeDivulgacao() {
		return meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getHomePageDoTrabalho() {
		return homePageDoTrabalho;
	}

	public void setHomePageDoTrabalho(String homePageDoTrabalho) {
		this.homePageDoTrabalho = homePageDoTrabalho;
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

	public String getTituloDoArtigoIngles() {
		return tituloDoArtigoIngles;
	}

	public void setTituloDoArtigoIngles(String tituloDoArtigoIngles) {
		this.tituloDoArtigoIngles = tituloDoArtigoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

}
