package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DADOS-BASICOS-DO-CAPITULO")
public class DadosBasicosDoCapitulo {

	@XStreamAlias("TIPO")
	@XStreamAsAttribute
	private String tipo;

	@XStreamAlias("TITULO-DO-CAPITULO-DO-LIVRO")
	@XStreamAsAttribute
	private String tituloDoCapituloDoLivro;

	@XStreamAlias("ANO")
	@XStreamAsAttribute
	private String ano;

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

	@XStreamAlias("TITULO-DO-CAPITULO-DO-LIVRO-INGLES")
	@XStreamAsAttribute
	private String tituloDoCapituloDoLivroIngles;

	@XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
	@XStreamAsAttribute
	private String flagDivulgacaoCientifica;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTituloDoCapituloDoLivro() {
		return tituloDoCapituloDoLivro;
	}

	public void setTituloDoCapituloDoLivro(String tituloDoCapituloDoLivro) {
		this.tituloDoCapituloDoLivro = tituloDoCapituloDoLivro;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
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

	public String getTituloDoCapituloDoLivroIngles() {
		return tituloDoCapituloDoLivroIngles;
	}

	public void setTituloDoCapituloDoLivroIngles(
			String tituloDoCapituloDoLivroIngles) {
		this.tituloDoCapituloDoLivroIngles = tituloDoCapituloDoLivroIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

}
