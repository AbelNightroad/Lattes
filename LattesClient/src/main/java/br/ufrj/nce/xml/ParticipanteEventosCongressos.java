package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
public class ParticipanteEventosCongressos {

	@XStreamAlias("NOME-COMPLETO-DO-PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	@XStreamAsAttribute
	private String nomeCompletoParticipanteEventosCongressos;
	
	@XStreamAlias("NOME-PARA-CITACAO-DO-PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	@XStreamAsAttribute
	private String nomeCitacaoParticipanteEventosCongressos;
	
	@XStreamAlias("ORDEM-PARTICIPANTE")
	@XStreamAsAttribute
	private String ordemParticipante;
	
	@XStreamAlias("CPF-PARTICIPANTE-PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	@XStreamAsAttribute
	private String cpfParticipante;
	
	@XStreamAlias("NRO-ID-CNPQ")
	@XStreamAsAttribute
	private String nroIdCnpq;

	public String getNomeCompletoParticipanteEventosCongressos() {
		return nomeCompletoParticipanteEventosCongressos;
	}

	public void setNomeCompletoParticipanteEventosCongressos(String nomeCompletoParticipanteEventosCongressos) {
		this.nomeCompletoParticipanteEventosCongressos = nomeCompletoParticipanteEventosCongressos;
	}

	public String getNomeCitacaoParticipanteEventosCongressos() {
		return nomeCitacaoParticipanteEventosCongressos;
	}

	public void setNomeCitacaoParticipanteEventosCongressos(String nomeCitacaoParticipanteEventosCongressos) {
		this.nomeCitacaoParticipanteEventosCongressos = nomeCitacaoParticipanteEventosCongressos;
	}

	public String getOrdemParticipante() {
		return ordemParticipante;
	}

	public void setOrdemParticipante(String ordemParticipante) {
		this.ordemParticipante = ordemParticipante;
	}

	public String getCpfParticipante() {
		return cpfParticipante;
	}

	public void setCpfParticipante(String cpfParticipante) {
		this.cpfParticipante = cpfParticipante;
	}

	public String getNroIdCnpq() {
		return nroIdCnpq;
	}

	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}

}
