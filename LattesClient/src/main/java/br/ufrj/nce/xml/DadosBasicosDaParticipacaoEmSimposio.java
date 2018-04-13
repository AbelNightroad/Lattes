package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-SIMPOSIO")
public class DadosBasicosDaParticipacaoEmSimposio {
	
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

	@XStreamAlias("MEIO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String meiodeDivulgacao;

	@XStreamAlias("HOME-PAGE-DO-TRABALHO")
	@XStreamAsAttribute
	private String homePageDoTrabalho;

	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;

	@XStreamAlias("TIPO-PARTICIPACAO")
	@XStreamAsAttribute
	private String tipoParticipacao;

	@XStreamAlias("FORMA-PARTICIPACAO")
	@XStreamAsAttribute
	private String formaParticipacao;

	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;

	@XStreamAlias("TITULO-INGLES")
	@XStreamAsAttribute
	private String tituloIngles;

	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientifica;

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

	public String getMeiodeDivulgacao() {
		return meiodeDivulgacao;
	}

	public void setMeiodeDivulgacao(String meiodeDivulgacao) {
		this.meiodeDivulgacao = meiodeDivulgacao;
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

	public String getTipoParticipacao() {
		return tipoParticipacao;
	}

	public void setTipoParticipacao(String tipoParticipacao) {
		this.tipoParticipacao = tipoParticipacao;
	}

	public String getFormaParticipacao() {
		return formaParticipacao;
	}

	public void setFormaParticipacao(String formaParticipacao) {
		this.formaParticipacao = formaParticipacao;
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

	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}
}
