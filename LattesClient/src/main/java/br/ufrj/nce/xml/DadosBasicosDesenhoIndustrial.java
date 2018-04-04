package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DADOS-BASICOS-DO-DESENHO-INDUSTRIAL")
public class DadosBasicosDesenhoIndustrial {

	@XStreamAlias("TITULO")
	@XStreamAsAttribute
	private String titulo;
	
	@XStreamAlias("ANO-DESENVOLVIMENTO")
	@XStreamAsAttribute
	private String anoDesenvolvimento;
	
	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;
	
	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;
	
	@XStreamAlias("TITULO-INGLES")
	@XStreamAsAttribute
	private String tituloIngles;
	
	@XStreamAlias("FLAG-POTENCIAL-INOVACAO")
	@XStreamAsAttribute
	private String flagPotencialInovacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoDesenvolvimento() {
		return anoDesenvolvimento;
	}

	public void setAnoDesenvolvimento(String anoDesenvolvimento) {
		this.anoDesenvolvimento = anoDesenvolvimento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFlagRelevancia() {
		return flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getTituloIngles() {
		return tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getFlagPotencialInovacao() {
		return flagPotencialInovacao;
	}

	public void setFlagPotencialInovacao(String flagPotencialInovacao) {
		this.flagPotencialInovacao = flagPotencialInovacao;
	}
}
