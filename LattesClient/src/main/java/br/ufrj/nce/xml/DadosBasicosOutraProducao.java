package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-BASICOS-DE-OUTRA-PRODUCAO")
public class DadosBasicosOutraProducao {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;
	
	@XStreamAlias("TITULO")
	@XStreamAsAttribute
	private String titulo;
	
	@XStreamAlias("ANO")
	@XStreamAsAttribute
	private String ano;
	
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
	
	@XStreamAlias("TITULO-INGLES")
	@XStreamAsAttribute
	private String tituloIngles;
	
	@XStreamAlias("NATUREZA-INGLES")
	@XStreamAsAttribute
	private String naturezaIngles;
	
	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientificao;

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

	public String getTituloIngles() {
		return tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getNaturezaIngles() {
		return naturezaIngles;
	}

	public void setNaturezaIngles(String naturezaIngles) {
		this.naturezaIngles = naturezaIngles;
	}

	public String getFlagDivulgacaoCientificao() {
		return flagDivulgacaoCientificao;
	}

	public void setFlagDivulgacaoCientificao(String flagDivulgacaoCientificao) {
		this.flagDivulgacaoCientificao = flagDivulgacaoCientificao;
	}
}