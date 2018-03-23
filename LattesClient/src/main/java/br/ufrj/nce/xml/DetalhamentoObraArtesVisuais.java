package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-OBRA-DE-ARTES-VISUAIS")
public class DetalhamentoObraArtesVisuais {

	@XStreamAlias("MATERIAL-EMPREGADO")
	@XStreamAsAttribute
	private String materialEmpregado;
	
	@XStreamAlias("TIPO-DE-EVENTO")
	@XStreamAsAttribute
	private String tipoEvento;
	
	@XStreamAlias("EVENTO")
	@XStreamAsAttribute
	private String evento;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;
	
	@XStreamAlias("ACERVO")
	@XStreamAsAttribute
	private String acervo;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA")
	@XStreamAsAttribute
	private String instituicaoPromotora;

	public String getMaterialEmpregado() {
		return materialEmpregado;
	}

	public void setMaterialEmpregado(String materialEmpregado) {
		this.materialEmpregado = materialEmpregado;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getAcervo() {
		return acervo;
	}

	public void setAcervo(String acervo) {
		this.acervo = acervo;
	}

	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}
}
