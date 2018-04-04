package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DO-LIVRO")
public class DetalhamentoDoLivro {

	@XStreamAlias("NUMERO-DE-VOLUMES")
	@XStreamAsAttribute
	private String numeroDeVolumes;

	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroDePaginas;

	@XStreamAlias("ISBN")
	@XStreamAsAttribute
	private String isbn;

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

	public String getNumeroDeVolumes() {
		return numeroDeVolumes;
	}

	public void setNumeroDeVolumes(String numeroDeVolumes) {
		this.numeroDeVolumes = numeroDeVolumes;
	}

	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
