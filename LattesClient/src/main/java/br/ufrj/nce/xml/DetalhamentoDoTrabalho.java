package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-TRABALHO")
public class DetalhamentoDoTrabalho {

	@XStreamAlias("CLASSIFICACAO-DO-EVENTO")
	@XStreamAsAttribute
	private String classificacaoDoEvento;

	@XStreamAlias("NOME-DO-EVENTO")
	@XStreamAsAttribute
	private String nomeDoEvento;

	@XStreamAlias("CIDADE-DO-EVENTO")
	@XStreamAsAttribute
	private String cidadeDoEvento;;

	@XStreamAlias("ANO-DE-REALIZACAO")
	@XStreamAsAttribute
	private String anoDeRealizacao;

	@XStreamAlias("TITULO-DOS-ANAIS-OU-PROCEEDINGS")
	@XStreamAsAttribute
	private String tituloDosAnaisOuProceedings;

	@XStreamAlias("VOLUME")
	@XStreamAsAttribute
	private String volume;

	@XStreamAlias("FASCICULO")
	@XStreamAsAttribute
	private String fasciculo;

	@XStreamAlias("SERIE")
	@XStreamAsAttribute
	private String serie;

	@XStreamAlias("PAGINA-INICIAL")
	@XStreamAsAttribute
	private String paginaInicial;

	@XStreamAlias("PAGINA-FINAL")
	@XStreamAsAttribute
	private String paginaFinal;

	@XStreamAlias("ISBN")
	@XStreamAsAttribute
	private String isbn;

	@XStreamAlias("NOME-DA-EDITORA")
	@XStreamAsAttribute
	private String nomeDaEditora;

	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeDaEditora;
	
	@XStreamAlias("NOME-DO-EVENTO-INGLES")
	@XStreamAsAttribute
	private String nomeEventoIngles;

	public String getClassificacaoDoEvento() {
		return classificacaoDoEvento;
	}

	public void setClassificacaoDoEvento(String classificacaoDoEvento) {
		this.classificacaoDoEvento = classificacaoDoEvento;
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getCidadeDoEvento() {
		return cidadeDoEvento;
	}

	public void setCidadeDoEvento(String cidadeDoEvento) {
		this.cidadeDoEvento = cidadeDoEvento;
	}

	public String getAnoDeRealizacao() {
		return anoDeRealizacao;
	}

	public void setAnoDeRealizacao(String anoDeRealizacao) {
		this.anoDeRealizacao = anoDeRealizacao;
	}

	public String getTituloDosAnaisOuProceedings() {
		return tituloDosAnaisOuProceedings;
	}

	public void setTituloDosAnaisOuProceedings(String tituloDosAnaisOuProceedings) {
		this.tituloDosAnaisOuProceedings = tituloDosAnaisOuProceedings;
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

	public String getNomeDaEditora() {
		return nomeDaEditora;
	}

	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}

	public String getCidadeDaEditora() {
		return cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getNomeEventoIngles() {
		return nomeEventoIngles;
	}

	public void setNomeEventoIngles(String nomeEventoIngles) {
		this.nomeEventoIngles = nomeEventoIngles;
	}
}
