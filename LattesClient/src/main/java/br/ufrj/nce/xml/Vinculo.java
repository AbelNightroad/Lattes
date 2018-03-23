package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("VINCULOS")
public class Vinculo {

	@XStreamAlias("SEQUENCIA-HISTORICO")
	@XStreamAsAttribute
	private String sequenciaHistorico;

	@XStreamAlias("TIPO-DE-VINCULO")
	@XStreamAsAttribute
	private String tipoDeVinculo;

	@XStreamAlias("ENQUADRAMENTO-FUNCIONAL")
	@XStreamAsAttribute
	private String enquadramentoFuncional;

	@XStreamAlias("CARGA-HORARIA-SEMANAL")
	@XStreamAsAttribute
	private String cargaHorariaSemanal;

	@XStreamAlias("FLAG-DEDICACAO-EXCLUSIVA")
	@XStreamAsAttribute
	private String flagDedicacaoExclusiva;

	@XStreamAlias("MES-INICIO")
	@XStreamAsAttribute
	private String mesInicio;

	@XStreamAlias("ANO-INICIO")
	@XStreamAsAttribute
	private String anoInicio;

	@XStreamAlias("MES-FIM")
	@XStreamAsAttribute
	private String mesFim;

	@XStreamAlias("ANO-FIM")
	@XStreamAsAttribute
	private String anoFim;

	@XStreamAlias("OUTRAS-INFORMACOES")
	@XStreamAsAttribute
	private String outrasInformacoes;

	@XStreamAlias("FLAG-VINCULO-EMPREGATICIO")
	@XStreamAsAttribute
	private String flagVinculoEmpregaticio;

	@XStreamAlias("OUTRO-VINCULO-INFORMADO")
	@XStreamAsAttribute
	private String outroVinculoInformado;

	@XStreamAlias("OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO")
	@XStreamAsAttribute
	private String outroEnquadramentoFuncionalInformado;

	@XStreamAlias("OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO-INGLES")
	@XStreamAsAttribute
	private String outroEnquadramentoFuncionalInformadoIngles;

	@XStreamAlias("OUTRAS-INFORMACOES-INGLES")
	@XStreamAsAttribute
	private String outrasInformacoesIngles;

	public String getSequenciaHistorico() {
		return sequenciaHistorico;
	}

	public void setSequenciaHistorico(String sequenciaHistorico) {
		this.sequenciaHistorico = sequenciaHistorico;
	}

	public String getTipoDeVinculo() {
		return tipoDeVinculo;
	}

	public void setTipoDeVinculo(String tipoDeVinculo) {
		this.tipoDeVinculo = tipoDeVinculo;
	}

	public String getEnquadramentoFuncional() {
		return enquadramentoFuncional;
	}

	public void setEnquadramentoFuncional(String enquadramentoFuncional) {
		this.enquadramentoFuncional = enquadramentoFuncional;
	}

	public String getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	public void setCargaHorariaSemanal(String cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public String getFlagDedicacaoExclusiva() {
		return flagDedicacaoExclusiva;
	}

	public void setFlagDedicacaoExclusiva(String flagDedicacaoExclusiva) {
		this.flagDedicacaoExclusiva = flagDedicacaoExclusiva;
	}

	public String getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getMesFim() {
		return mesFim;
	}

	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}

	public String getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public String getFlagVinculoEmpregaticio() {
		return flagVinculoEmpregaticio;
	}

	public void setFlagVinculoEmpregaticio(String flagVinculoEmpregaticio) {
		this.flagVinculoEmpregaticio = flagVinculoEmpregaticio;
	}

	public String getOutroVinculoInformado() {
		return outroVinculoInformado;
	}

	public void setOutroVinculoInformado(String outroVinculoInformado) {
		this.outroVinculoInformado = outroVinculoInformado;
	}

	public String getOutroEnquadramentoFuncionalInformado() {
		return outroEnquadramentoFuncionalInformado;
	}

	public void setOutroEnquadramentoFuncionalInformado(String outroEnquadramentoFuncionalInformado) {
		this.outroEnquadramentoFuncionalInformado = outroEnquadramentoFuncionalInformado;
	}

	public String getOutroEnquadramentoFuncionalInformadoIngles() {
		return outroEnquadramentoFuncionalInformadoIngles;
	}

	public void setOutroEnquadramentoFuncionalInformadoIngles(String outroEnquadramentoFuncionalInformadoIngles) {
		this.outroEnquadramentoFuncionalInformadoIngles = outroEnquadramentoFuncionalInformadoIngles;
	}

	public String getOutrasInformacoesIngles() {
		return outrasInformacoesIngles;
	}

	public void setOutrasInformacoesIngles(String outrasInformacoesIngles) {
		this.outrasInformacoesIngles = outrasInformacoesIngles;
	}
}
