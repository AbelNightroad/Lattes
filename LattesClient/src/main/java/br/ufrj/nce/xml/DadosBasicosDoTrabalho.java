package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DADOS-BASICO-DO-TRABALHO")
public class DadosBasicosDoTrabalho {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;

	@XStreamAlias("TITULO-DO-TRABALHO")
	@XStreamAsAttribute
	private String tituloDoTrabalho;

	@XStreamAlias("ANO-DO-TRABALHO")
	@XStreamAsAttribute
	private String anoDoTrabalho;

	@XStreamAlias("PAIS-DO-EVENTO")
	@XStreamAsAttribute
	private String paisDoEvento;

	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;

	@XStreamAlias("MEIO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String meioDeDilvulgacao;

	@XStreamAlias("HOME-PAGE-DO-TRABALHO")
	@XStreamAsAttribute
	private String homePageDoTrabalho;

	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;

	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;

	@XStreamAlias("TITULO-DO-TRABALHO-INGLES")
	@XStreamAsAttribute
	private String tituloDoTrabalhoIngles;

	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientifica;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoTrabalho() {
		return tituloDoTrabalho;
	}

	public void setTituloDoTrabalho(String tituloDoTrabalho) {
		this.tituloDoTrabalho = tituloDoTrabalho;
	}

	public String getAnoDoTrabalho() {
		return anoDoTrabalho;
	}

	public void setAnoDoTrabalho(String anoDoTrabalho) {
		this.anoDoTrabalho = anoDoTrabalho;
	}

	public String getPaisDoEvento() {
		return paisDoEvento;
	}

	public void setPaisDoEvento(String paisDoEvento) {
		this.paisDoEvento = paisDoEvento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMeioDeDilvulgacao() {
		return meioDeDilvulgacao;
	}

	public void setMeioDeDilvulgacao(String meioDeDilvulgacao) {
		this.meioDeDilvulgacao = meioDeDilvulgacao;
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

	public String getTituloDoTrabalhoIngles() {
		return tituloDoTrabalhoIngles;
	}

	public void setTituloDoTrabalhoIngles(String tituloDoTrabalhoIngles) {
		this.tituloDoTrabalhoIngles = tituloDoTrabalhoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

}
