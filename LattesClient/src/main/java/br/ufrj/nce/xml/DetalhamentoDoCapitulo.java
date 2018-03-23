package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-CAPITULO")
public class DetalhamentoDoCapitulo {

	@XStreamAlias("TITULO-DO-LIVRO")
	@XStreamAsAttribute
	private String tituloDoLivro;

	@XStreamAlias("NUMERO-DE-VOLUMES")
	@XStreamAsAttribute
	private String numeroDeVolumes;

	@XStreamAlias("PAGINA-INICIAL")
	@XStreamAsAttribute
	private String paginaInicial;

	@XStreamAlias("PAGINA-FINAL")
	@XStreamAsAttribute
	private String paginaFinal;

	@XStreamAlias("ISBN")
	@XStreamAsAttribute
	private String isbn;

	@XStreamAlias("ORGANIZADORES")
	@XStreamAsAttribute
	private String organizadores;

	@XStreamAlias("NUMERO-DA-EDICAO-REVISAO")
	@XStreamAsAttribute
	private String numeroDaEdicaoRevisao;

	@XStreamAlias("NUMERO-DA-SERIE")
	@XStreamAsAttribute
	private String numeroDaSerie;

	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeDaEditora;

	@XStreamAlias("NOME-DA-EDITORA")
	@XStreamAsAttribute
	private String nomeDaEditora;

	public String getTituloDoLivro() {
		return tituloDoLivro;
	}

	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}

	public String getNumeroDeVolumes() {
		return numeroDeVolumes;
	}

	public void setNumeroDeVolumes(String numeroDeVolumes) {
		this.numeroDeVolumes = numeroDeVolumes;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getOrganizadores() {
		return organizadores;
	}

	public void setOrganizadores(String organizadores) {
		this.organizadores = organizadores;
	}

	public String getNumeroDaEdicaoRevisao() {
		return numeroDaEdicaoRevisao;
	}

	public void setNumeroDaEdicaoRevisao(String numeroDaEdicaoRevisao) {
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
	}

	public String getNumeroDaSerie() {
		return numeroDaSerie;
	}

	public void setNumeroDaSerie(String numeroDaSerie) {
		this.numeroDaSerie = numeroDaSerie;
	}

	public String getCidadeDaEditora() {
		return cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getNomeDaEditora() {
		return nomeDaEditora;
	}

	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}

}
