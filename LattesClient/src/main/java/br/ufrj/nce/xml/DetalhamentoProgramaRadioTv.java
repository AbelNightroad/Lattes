package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-PROGRAMA-DE-RADIO-OU-TV")
public class DetalhamentoProgramaRadioTv {

	@XStreamAlias("EMISSORA")
	@XStreamAsAttribute
	private String emissora;
	
	@XStreamAlias("TEMA")
	@XStreamAsAttribute
	private String tema;
	
	@XStreamAlias("FORMATO-DATA-DA-APRESENTACAO")
	@XStreamAsAttribute
	private String formatoDataApresentacao;
	
	@XStreamAlias("DATA-DA-APRESENTACAO")
	@XStreamAsAttribute
	private String dataApresentacao;
	
	@XStreamAlias("DURACAO-EM-MINUTOS")
	@XStreamAsAttribute
	private String duracaoMinutos;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;
	
	@XStreamAlias("VEICULO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String veiculoDivulgacao;

	public String getEmissora() {
		return emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
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

	public String getVeiculoDivulgacao() {
		return veiculoDivulgacao;
	}

	public void setVeiculoDivulgacao(String veiculoDivulgacao) {
		this.veiculoDivulgacao = veiculoDivulgacao;
	}
}
