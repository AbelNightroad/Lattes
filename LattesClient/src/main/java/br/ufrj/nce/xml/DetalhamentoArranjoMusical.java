package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DO-ARRANJO-MUSICAL")
public class DetalhamentoArranjoMusical {

	@XStreamAlias("AUTOR-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String autorObraReferencia;
	
	@XStreamAlias("ANO-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String anoObraReferencia;
	
	@XStreamAlias("FORMACAO-INSTRUMENTAL")
	@XStreamAsAttribute
	private String formacaoInstrumental;
	
	@XStreamAlias("REGISTRO-DIREITO-AUTORAL")
	@XStreamAsAttribute
	private String registroDireitoAutoral;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;

	public String getAutorObraReferencia() {
		return autorObraReferencia;
	}

	public void setAutorObraReferencia(String autorObraReferencia) {
		this.autorObraReferencia = autorObraReferencia;
	}

	public String getAnoObraReferencia() {
		return anoObraReferencia;
	}

	public void setAnoObraReferencia(String anoObraReferencia) {
		this.anoObraReferencia = anoObraReferencia;
	}

	public String getFormacaoInstrumental() {
		return formacaoInstrumental;
	}

	public void setFormacaoInstrumental(String formacaoInstrumental) {
		this.formacaoInstrumental = formacaoInstrumental;
	}

	public String getRegistroDireitoAutoral() {
		return registroDireitoAutoral;
	}

	public void setRegistroDireitoAutoral(String registroDireitoAutoral) {
		this.registroDireitoAutoral = registroDireitoAutoral;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}
}
