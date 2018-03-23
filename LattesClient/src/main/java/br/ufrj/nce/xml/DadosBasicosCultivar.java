package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-BASICOS-DA-CULTIVAR")
public class DadosBasicosCultivar {

	@XStreamAlias("DENOMINACAO")
	@XStreamAsAttribute
	private String denomminacao;
	
	@XStreamAlias("ANO-SOLICITACAO")
	@XStreamAsAttribute
	private String anoSolicitacao;
	
	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;
	
	@XStreamAlias("FLAG-RELEVANCIA")
	@XStreamAsAttribute
	private String flagRelevancia;
	
	@XStreamAlias("DENOMINACAO-INGLES")
	@XStreamAsAttribute
	private String denominacaoIngles;
	
	@XStreamAlias("FLAG-POTENCIAL-INOVACAO")
	@XStreamAsAttribute
	private String flagPotencialInovacao;

	public String getDenomminacao() {
		return denomminacao;
	}

	public void setDenomminacao(String denomminacao) {
		this.denomminacao = denomminacao;
	}

	public String getAnoSolicitacao() {
		return anoSolicitacao;
	}

	public void setAnoSolicitacao(String anoSolicitacao) {
		this.anoSolicitacao = anoSolicitacao;
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

	public String getDenominacaoIngles() {
		return denominacaoIngles;
	}

	public void setDenominacaoIngles(String denominacaoIngles) {
		this.denominacaoIngles = denominacaoIngles;
	}

	public String getFlagPotencialInovacao() {
		return flagPotencialInovacao;
	}

	public void setFlagPotencialInovacao(String flagPotencialInovacao) {
		this.flagPotencialInovacao = flagPotencialInovacao;
	}
}
