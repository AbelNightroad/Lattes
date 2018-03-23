package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DIRECAO-E-ADMINISTRACAO")
public class AtividadeDeDirecaoEAdministracao {

	@XStreamAlias("SEQUENCIA-FUNCAO-ATIVIDADE")
	@XStreamAsAttribute
	private String sequenciaFuncaoAtividade;

	@XStreamAlias("FLAG-PERIODO")
	@XStreamAsAttribute
	private String flagPeriodo;

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

	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;

	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;

	@XStreamAlias("CODIGO-UNIDADE")
	@XStreamAsAttribute
	private String codigoUnidade;
	
	@XStreamAlias("FORMATO-CARGO-OU-FUNCAO")
	@XStreamAsAttribute
	private String formatoCargoOuFuncao;
	
	@XStreamAlias("CARGO-OU-FUNCAO")
	@XStreamAsAttribute
	private String cagoOuFuncao;
	
	@XStreamAlias("NOME-UNIDADE")
	@XStreamAsAttribute
	private String nomeUnidade;

	@XStreamAlias("CARGO-OU-FUNCAO-INGLES")
	@XStreamAsAttribute
	private String cargoOuFuncaoIngles;

	public String getSequenciaFuncaoAtividade() {
		return sequenciaFuncaoAtividade;
	}

	public void setSequenciaFuncaoAtividade(String sequenciaFuncaoAtividade) {
		this.sequenciaFuncaoAtividade = sequenciaFuncaoAtividade;
	}

	public String getFlagPeriodo() {
		return flagPeriodo;
	}

	public void setFlagPeriodo(String flagPeriodo) {
		this.flagPeriodo = flagPeriodo;
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

	public String getCodigoOrgao() {
		return codigoOrgao;
	}

	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getCodigoUnidade() {
		return codigoUnidade;
	}

	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}

	public String getFormatoCargoOuFuncao() {
		return formatoCargoOuFuncao;
	}

	public void setFormatoCargoOuFuncao(String formatoCargoOuFuncao) {
		this.formatoCargoOuFuncao = formatoCargoOuFuncao;
	}

	public String getCagoOuFuncao() {
		return cagoOuFuncao;
	}

	public void setCagoOuFuncao(String cagoOuFuncao) {
		this.cagoOuFuncao = cagoOuFuncao;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public String getCargoOuFuncaoIngles() {
		return cargoOuFuncaoIngles;
	}

	public void setCargoOuFuncaoIngles(String cargoOuFuncaoIngles) {
		this.cargoOuFuncaoIngles = cargoOuFuncaoIngles;
	}
	
}
