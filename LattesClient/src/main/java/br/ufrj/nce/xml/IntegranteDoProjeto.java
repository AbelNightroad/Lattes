package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("INTEGRANTES-DO-PROJETO")
public class IntegranteDoProjeto {

	@XStreamAlias("NOME-COMPLETO")
	@XStreamAsAttribute
	private String nomeCompleto;

	@XStreamAlias("NOME-PARA-CITACAO")
	@XStreamAsAttribute
	private String nomeParaCitacao;

	@XStreamAlias("ORDEM-DE-INTEGRACAO")
	@XStreamAsAttribute
	private String ordemDeIntegracao;

	@XStreamAlias("FLAG-RESPONSAVEL")
	@XStreamAsAttribute
	private String flagResponsavel;

	@XStreamAlias("NRO-ID-CNPQ")
	@XStreamAsAttribute
	private String nroIdCnpq;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeParaCitacao() {
		return nomeParaCitacao;
	}

	public void setNomeParaCitacao(String nomeParaCitacao) {
		this.nomeParaCitacao = nomeParaCitacao;
	}

	public String getOrdemDeIntegracao() {
		return ordemDeIntegracao;
	}

	public void setOrdemDeIntegracao(String ordemDeIntegracao) {
		this.ordemDeIntegracao = ordemDeIntegracao;
	}

	public String getFlagResponsavel() {
		return flagResponsavel;
	}

	public void setFlagResponsavel(String flagResponsavel) {
		this.flagResponsavel = flagResponsavel;
	}

	public String getNroIdCnpq() {
		return nroIdCnpq;
	}

	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}
}
