package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-APRESENTACAO-EM-RADIO-OU-TV")
public class DetalhamentoApresentacaoRadioTv {

	@XStreamAlias("EMISSORA")
	@XStreamAsAttribute
	private String emissora;
	
	@XStreamAlias("FORMATO-DATA-DE-APRESENTACAO")
	@XStreamAsAttribute
	private String formatoDataApresentacao;
	
	@XStreamAlias("DATA-DE-APRESENTACAO")
	@XStreamAsAttribute
	private String dataApresentacao;
	
	@XStreamAlias("DURACAO-EM-MINUTOS")
	@XStreamAsAttribute
	private String duracaoMinutos;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	public String getEmissora() {
		return emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	public String getFormatoDataApresentacao() {
		return formatoDataApresentacao;
	}

	public void setFormatoDataApresentacao(String formatoDataApresentacao) {
		this.formatoDataApresentacao = formatoDataApresentacao;
	}

	public String getDataApresentacao() {
		return dataApresentacao;
	}

	public void setDataApresentacao(String dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}

	public String getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(String duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
