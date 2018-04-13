package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("INFORMACAO-ADICIONAL-INSTITUICAO")
public class InformacaoAdicionalInstituicao {

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;
	
	@XStreamAlias("SIGLA-INSTITUICAO")
	@XStreamAsAttribute
	private String siglaInstituicao;
	
	@XStreamAlias("SIGLA-UF-INSTITUICAO")
	@XStreamAsAttribute
	private String siglaUfInstituicao;
	
	@XStreamAlias("SIGLA-PAIS-INSTITUICAO")
	@XStreamAsAttribute
	private String siglaPaisInstituicao;
	
	@XStreamAlias("NOME-PAIS-INSTITUICAO")
	@XStreamAsAttribute
	private String nomePaisInstituicao;
	
	@XStreamAlias("FLAG-AGENCIA-FOMENTO")
	@XStreamAsAttribute
	private String flagAgenciaFomento;
	
	@XStreamAlias("FALG-INSTITUICAO-DE-ENSINO")
	@XStreamAsAttribute
	private String flagInstituicaoEnsino;

	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}

	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}

	public String getSiglaInstituicao() {
		return siglaInstituicao;
	}

	public void setSiglaInstituicao(String siglaInstituicao) {
		this.siglaInstituicao = siglaInstituicao;
	}

	public String getSiglaUfInstituicao() {
		return siglaUfInstituicao;
	}

	public void setSiglaUfInstituicao(String siglaUfInstituicao) {
		this.siglaUfInstituicao = siglaUfInstituicao;
	}

	public String getSiglaPaisInstituicao() {
		return siglaPaisInstituicao;
	}

	public void setSiglaPaisInstituicao(String siglaPaisInstituicao) {
		this.siglaPaisInstituicao = siglaPaisInstituicao;
	}

	public String getNomePaisInstituicao() {
		return nomePaisInstituicao;
	}

	public void setNomePaisInstituicao(String nomePaisInstituicao) {
		this.nomePaisInstituicao = nomePaisInstituicao;
	}

	public String getFlagAgenciaFomento() {
		return flagAgenciaFomento;
	}

	public void setFlagAgenciaFomento(String flagAgenciaFomento) {
		this.flagAgenciaFomento = flagAgenciaFomento;
	}

	public String getFlagInstituicaoEnsino() {
		return flagInstituicaoEnsino;
	}

	public void setFlagInstituicaoEnsino(String flagInstituicaoEnsino) {
		this.flagInstituicaoEnsino = flagInstituicaoEnsino;
	}
}
