package br.ufrj.nce.xml;

import java.time.LocalDate;
import java.time.LocalTime;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("CURRICULO-VITAE")
public class Curriculo {

	@XStreamAlias("SISTEMA-ORIGEM-XML")
	@XStreamAsAttribute
	private String origemXml;

	@XStreamAlias("NUMERO-IDENTIFICADOR")
	@XStreamAsAttribute
	private String numeroIdentificador;

	@XStreamAlias("FORMATO-DATA-ATUALIZACAO")
	@XStreamAsAttribute
	private String formatoData;
	
	@XStreamAlias("DATA-ATUALIZACAO")
	@XStreamAsAttribute
	private LocalDate dataAtualizacao;
	
	@XStreamAlias("FORMATO-HORA-ATUALIZACAO")
	@XStreamAsAttribute
	private String formatoHora;

	@XStreamAlias("HORA-ATUALIZACAO")
	@XStreamAsAttribute
	private LocalTime horaAtualizacao;

	@XStreamAlias("DADOS-GERAIS")
	private DadosGerais dadosGerais;

	@XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
	private ProducaoBibliografica producaoBibliografica;

	@XStreamAlias("PRODUCAO-TECNICA")
	private ProducaoTecnica producaoTecnica;

	@XStreamAlias("OUTRA-PRODUCAO")
	private OutraProducao outraProducao;

	@XStreamAlias("DADOS-COMPLEMENTARES")
	private DadosComplementares dadosComplementares;

	public String getOrigemXml() {
		return origemXml;
	}

	public void setOrigemXml(String origemXml) {
		this.origemXml = origemXml;
	}

	public String getNumeroIdentificador() {
		return numeroIdentificador;
	}

	public void setNumeroIdentificador(String numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public String getFormatoData() {
		return formatoData;
	}

	public void setFormatoData(String formatoData) {
		this.formatoData = formatoData;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getFormatoHora() {
		return formatoHora;
	}

	public void setFormatoHora(String formatoHora) {
		this.formatoHora = formatoHora;
	}

	public LocalTime getHoraAtualizacao() {
		return horaAtualizacao;
	}

	public void setHoraAtualizacao(LocalTime horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}

	public DadosGerais getDadosGerais() {
		return dadosGerais;
	}

	public void setDadosGerais(DadosGerais dadosGerais) {
		this.dadosGerais = dadosGerais;
	}

	public ProducaoBibliografica getProducaoBibliografica() {
		return producaoBibliografica;
	}

	public void setProducaoBibliografica(ProducaoBibliografica producaoBibliografica) {
		this.producaoBibliografica = producaoBibliografica;
	}

	public ProducaoTecnica getProducaoTecnica() {
		return producaoTecnica;
	}

	public void setProducaoTecnica(ProducaoTecnica producaoTecnica) {
		this.producaoTecnica = producaoTecnica;
	}

	public OutraProducao getOutraProducao() {
		return outraProducao;
	}

	public void setOutraProducao(OutraProducao outraProducao) {
		this.outraProducao = outraProducao;
	}

	public DadosComplementares getDadosComplementares() {
		return dadosComplementares;
	}

	public void setDadosComplementares(DadosComplementares dadosComplementares) {
		this.dadosComplementares = dadosComplementares;
	}
	
	
}
