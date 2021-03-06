package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
public class DadosBasicosOrientacaoAndamentoIniciacaoCientifica {

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;
	
	@XStreamAlias("TITULO-DO-TRABALHO")
	@XStreamAsAttribute
	private String tituloTrabalho;
	
	@XStreamAlias("ANO")
	@XStreamAsAttribute
	private String ano;
	
	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;
	
	@XStreamAlias("HOME-PAGE")
	@XStreamAsAttribute
	private String homePage;
	
	@XStreamAlias("DOI")
	@XStreamAsAttribute
	private String doi;
	
	@XStreamAlias("TITULO-DO-TRABALHO-INGLES")
	@XStreamAsAttribute
	private String tituloTrabalhoIngles;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloTrabalho() {
		return tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
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

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTituloTrabalhoIngles() {
		return tituloTrabalhoIngles;
	}

	public void setTituloTrabalhoIngles(String tituloTrabalhoIngles) {
		this.tituloTrabalhoIngles = tituloTrabalhoIngles;
	}
}
