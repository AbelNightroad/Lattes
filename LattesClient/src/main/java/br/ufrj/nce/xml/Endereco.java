package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("ENDERECO")
public class Endereco {

	@XStreamAlias("FLAG-DE-PREFERENCIA")
	@XStreamAsAttribute
	private String flagPreferencia;

	@Embedded
	@XStreamAlias("ENDERECO-PROFISSIONAL")
	private EnderecoProfissional enderecoProfissional;
	
	@Embedded
	@XStreamAlias("ENDERECO-RESIDENCIAL")
	private EnderecoResidencial enderecoResidencial;

	public String getFlagPreferencia() {
		return flagPreferencia;
	}

	public void setFlagPreferencia(String flagPreferencia) {
		this.flagPreferencia = flagPreferencia;
	}

	public EnderecoProfissional getEnderecoProfissional() {
		return enderecoProfissional;
	}

	public void setEnderecoProfissional(EnderecoProfissional enderecoProfissional) {
		this.enderecoProfissional = enderecoProfissional;
	}

	public EnderecoResidencial getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(EnderecoResidencial enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

}
