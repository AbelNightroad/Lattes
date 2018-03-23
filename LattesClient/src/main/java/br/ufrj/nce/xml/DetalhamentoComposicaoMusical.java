package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-COMPOSICAO-MUSICAL")
public class DetalhamentoComposicaoMusical {

	@XStreamAlias("FORMACAO-INSTRUMENTAL")
	@XStreamAsAttribute
	private String formacaoInstrumental;
	
	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("REGISTRO-DE-DIREITO-AUTORAL")
	@XStreamAsAttribute
	private String registroDireitoAutoral;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;

	public String getFormacaoInstrumental() {
		return formacaoInstrumental;
	}

	public void setFormacaoInstrumental(String formacaoInstrumental) {
		this.formacaoInstrumental = formacaoInstrumental;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
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
