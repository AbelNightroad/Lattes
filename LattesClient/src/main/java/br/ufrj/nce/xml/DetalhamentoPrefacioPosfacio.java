package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DO-PREFACIO-POSFACIO")
public class DetalhamentoPrefacioPosfacio {

	@XStreamAlias("NOME-DO-AUTOR-DA-PUBLCACAO")
	@XStreamAsAttribute
	private String nomeAutorPublicacao;
	
	@XStreamAlias("TITULO-DA-PUBLICACAO")
	@XStreamAsAttribute
	private String tituloPublicacao;
	
	@XStreamAlias("ISSN-ISBN")
	@XStreamAsAttribute
	private String issnIsbn;
	
	@XStreamAlias("NUMERO-DA-EDICAO-REVISAO")
	@XStreamAsAttribute
	private String numeroEdicaoRevisao;
	
	@XStreamAlias("VOLUME")
	@XStreamAsAttribute
	private String volume;
	
	@XStreamAlias("SERIE")
	@XStreamAsAttribute
	private String serie;
	
	@XStreamAlias("FASCICULO")
	@XStreamAsAttribute
	private String fasciculo;
	
	@XStreamAlias("EDITORA-DO-PREFACIO-POSFACIO")
	@XStreamAsAttribute
	private String editoraPrefacioPosfacio;
	
	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeEditora;

	public String getNomeAutorPublicacao() {
		return nomeAutorPublicacao;
	}

	public void setNomeAutorPublicacao(String nomeAutorPublicacao) {
		this.nomeAutorPublicacao = nomeAutorPublicacao;
	}

	public String getTituloPublicacao() {
		return tituloPublicacao;
	}

	public void setTituloPublicacao(String tituloPublicacao) {
		this.tituloPublicacao = tituloPublicacao;
	}

	public String getIssnIsbn() {
		return issnIsbn;
	}

	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getFasciculo() {
		return fasciculo;
	}

	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}

	public String getEditoraPrefacioPosfacio() {
		return editoraPrefacioPosfacio;
	}

	public void setEditoraPrefacioPosfacio(String editoraPrefacioPosfacio) {
		this.editoraPrefacioPosfacio = editoraPrefacioPosfacio;
	}

	public String getCidadeEditora() {
		return cidadeEditora;
	}

	public void setCidadeEditora(String cidadeEditora) {
		this.cidadeEditora = cidadeEditora;
	}
}
