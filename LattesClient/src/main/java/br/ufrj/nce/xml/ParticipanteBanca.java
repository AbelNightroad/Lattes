package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("PARTICIPANTE-BANCA")
public class ParticipanteBanca {
	
	@XStreamAlias("NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA")
	@XStreamAsAttribute
	private String nomeCompletoDoParticipanteDaBanca;

	@XStreamAlias("NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA")
	@XStreamAsAttribute
	private String nomeParaCitacaoDoParticipanteDaBanca;

	@XStreamAlias("ORDEM-PARTICIPANTE")
	@XStreamAsAttribute
	private String orderParticipante;
	
	@XStreamAlias("CPF-DO-PARTICIPANTE-DA-BANCA")
	@XStreamAsAttribute
	private String cpfParticipanteBanca;

	@XStreamAlias("NRO-ID-CNPQ")
	@XStreamAsAttribute
	private String nroIdCnpq;

	public String getNomeCompletoDoParticipanteDaBanca() {
		return nomeCompletoDoParticipanteDaBanca;
	}

	public void setNomeCompletoDoParticipanteDaBanca(String nomeCompletoDoParticipanteDaBanca) {
		this.nomeCompletoDoParticipanteDaBanca = nomeCompletoDoParticipanteDaBanca;
	}

	public String getNomeParaCitacaoDoParticipanteDaBanca() {
		return nomeParaCitacaoDoParticipanteDaBanca;
	}

	public void setNomeParaCitacaoDoParticipanteDaBanca(String nomeParaCitacaoDoParticipanteDaBanca) {
		this.nomeParaCitacaoDoParticipanteDaBanca = nomeParaCitacaoDoParticipanteDaBanca;
	}

	public String getOrderParticipante() {
		return orderParticipante;
	}

	public void setOrderParticipante(String orderParticipante) {
		this.orderParticipante = orderParticipante;
	}

	public String getCpfParticipanteBanca() {
		return cpfParticipanteBanca;
	}

	public void setCpfParticipanteBanca(String cpfParticipanteBanca) {
		this.cpfParticipanteBanca = cpfParticipanteBanca;
	}

	public String getNroIdCnpq() {
		return nroIdCnpq;
	}

	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}
}
