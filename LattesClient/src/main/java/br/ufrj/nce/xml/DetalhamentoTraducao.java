package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-TRADUCAO")
public class DetalhamentoTraducao {

	@XStreamAlias("NOME-DO-AUTOR-TRADUZIDO")
	@XStreamAsAttribute
	private String nomeAutorTraduzido;
	
	@XStreamAlias("TITULO-DA-OBRA-ORIGINAL")
	@XStreamAsAttribute
	private String tituloObraOriginal;
	
	@XStreamAlias("ISSN-ISBN")
	@XStreamAsAttribute
	private String issnIsbn;
	
	@XStreamAlias("IDIOMA-DA-OBRA-ORIGINAL")
	@XStreamAsAttribute
	private String idiomaObraOriginal;
	
	@XStreamAlias("EDITORA-DA-TRADUCAO")
	@XStreamAsAttribute
	private String editoraTraducao;
	
	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeEditora;
	
	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("NUMERO-DA-EDICAO-REVISAO")
	@XStreamAsAttribute
	private String numeroEdicaoRevisao;
	
	@XStreamAlias("VOLUME")
	@XStreamAsAttribute
	private String volume;
	
	@XStreamAlias("FASCICULO")
	@XStreamAsAttribute
	private String fasciculo;
	
	@XStreamAlias("SERIE")
	@XStreamAsAttribute
	private String serie;

	public String getNomeAutorTraduzido() {
		return nomeAutorTraduzido;
	}

	public void setNomeAutorTraduzido(String nomeAutorTraduzido) {
		this.nomeAutorTraduzido = nomeAutorTraduzido;
	}

	public String getTituloObraOriginal() {
		return tituloObraOriginal;
	}

	public void setTituloObraOriginal(String tituloObraOriginal) {
		this.tituloObraOriginal = tituloObraOriginal;
	}

	public String getIssnIsbn() {
		return issnIsbn;
	}

	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
	}

	public String getIdiomaObraOriginal() {
		return idiomaObraOriginal;
	}

	public void setIdiomaObraOriginal(String idiomaObraOriginal) {
		this.idiomaObraOriginal = idiomaObraOriginal;
	}

	public String getEditoraTraducao() {
		return editoraTraducao;
	}

	public void setEditoraTraducao(String editoraTraducao) {
		this.editoraTraducao = editoraTraducao;
	}

	public String getCidadeEditora() {
		return cidadeEditora;
	}

	public void setCidadeEditora(String cidadeEditora) {
		this.cidadeEditora = cidadeEditora;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getNumeroEdicaoRevisao() {
		return numeroEdicaoRevisao;
	}

	public void setNumeroEdicaoRevisao(String numeroEdicaoRevisao) {
		this.numeroEdicaoRevisao = numeroEdicaoRevisao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getFasciculo() {
		return fasciculo;
	}

	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
}
