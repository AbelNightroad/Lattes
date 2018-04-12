package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("AUTORES")
public class Autor {

	@XStreamAlias("NOME-COMPLETO-DO-AUTOR")
	@XStreamAsAttribute
	private String nomeCompletoDoAutor;

	@XStreamAlias("NOME-PARA-CITACAO")
	@XStreamAsAttribute
	private String nomeParaCitacao;

	@XStreamAlias("ORDEM-DE-AUTORIA")
	@XStreamAsAttribute
	private String ordemDeAutoria;

	@XStreamAlias("CPF")
	@XStreamAsAttribute
	private String cpf;
	
	@XStreamAlias("NRO-ID-CNPQ")
	@XStreamAsAttribute
	private String nroIdCnpq;

	public String getNomeCompletoDoAutor() {
		return nomeCompletoDoAutor;
	}

	public void setNomeCompletoDoAutor(String nomeCompletoDoAutor) {
		this.nomeCompletoDoAutor = nomeCompletoDoAutor;
	}

	public String getNomeParaCitacao() {
		return nomeParaCitacao;
	}

	public void setNomeParaCitacao(String nomeParaCitacao) {
		this.nomeParaCitacao = nomeParaCitacao;
	}

	public String getOrdemDeAutoria() {
		return ordemDeAutoria;
	}

	public void setOrdemDeAutoria(String ordemDeAutoria) {
		this.ordemDeAutoria = ordemDeAutoria;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNroIdCnpq() {
		return nroIdCnpq;
	}

	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}

}
