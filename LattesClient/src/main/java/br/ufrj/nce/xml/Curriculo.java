package br.ufrj.nce.xml;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Entity
@XStreamAlias("CURRICULO-VITAE")
public class Curriculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "curriculoIdGen")
	@SequenceGenerator(
			name = "curriculoIdGen",
			sequenceName = "curriculo_id",
			initialValue = 1,
			allocationSize = 1)
	private Long id;

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
	private String dataAtualizacao;
	
	@XStreamAlias("FORMATO-HORA-ATUALIZACAO")
	@XStreamAsAttribute
	private String formatoHora;

	@XStreamAlias("HORA-ATUALIZACAO")
	@XStreamAsAttribute
	private String horaAtualizacao;

	@Embedded
	@XStreamAlias("DADOS-GERAIS")
	private DadosGerais dadosGerais;

	@Embedded
	@XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
	private ProducaoBibliografica producaoBibliografica;

	@Embedded
	@XStreamAlias("PRODUCAO-TECNICA")
	private ProducaoTecnica producaoTecnica;

	@Embedded
	@XStreamAlias("OUTRA-PRODUCAO")
	private OutraProducao outraProducao;

	@Embedded
	@XStreamAlias("DADOS-COMPLEMENTARES")
	private DadosComplementares dadosComplementares;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getFormatoHora() {
		return formatoHora;
	}

	public void setFormatoHora(String formatoHora) {
		this.formatoHora = formatoHora;
	}

	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}

	public void setHoraAtualizacao(String horaAtualizacao) {
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
