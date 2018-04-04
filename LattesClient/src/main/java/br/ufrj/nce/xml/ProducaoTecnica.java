package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("PRODUCAO-TECNICA")
public class ProducaoTecnica {
	
	@Embedded
	@XStreamImplicit(itemFieldName = "CULTIVAR-REGISTRADA")
	private List<CultivarRegistrada> cultivarRegistradas;

	@Embedded
	@XStreamImplicit(itemFieldName = "SOFTWARE")
	private List<Software> softwares;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "PATENTE")
	private List<Patente> patentes;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "CULTIVAR-PROTEGIDA")
	private List<CultivarProtegida> cultivarProtegidas;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "DESENHO-INDUSTRIAL")
	private List<DesenhoIndustrial> desenhosIndustriais;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "MARCA")
	private List<Marca> marcas;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "TOPOGRAFIA-DE-CIRCUITO-INTEGRADO")
	private List<TopografiaCircuitoIntegrado> topografiasCircuitoIntegrado;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "PRODUTO-TECNOLOGICO")
	private List<ProdutoTecnologico> produtosTecnologicos;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "PROCESSOS-OU-TECNICAS")
	private List<ProcessosOuTecnicas> processosOuTecnicas;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "TRABALHO-TECNICO")
	private List<TrabalhoTecnico> trabalhosTecnicos;
	
	@Embedded
	@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
	private DemaisTiposDeProducaoTecnica demaisTiposDeProducaoTecnica;

	public List<CultivarRegistrada> getCultivarRegistradas() {
		return cultivarRegistradas;
	}

	public void setCultivarRegistradas(List<CultivarRegistrada> cultivarRegistradas) {
		this.cultivarRegistradas = cultivarRegistradas;
	}

	public List<Software> getSoftwares() {
		return softwares;
	}

	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}

	public List<Patente> getPatentes() {
		return patentes;
	}

	public void setPatentes(List<Patente> patentes) {
		this.patentes = patentes;
	}

	public List<CultivarProtegida> getCultivarProtegidas() {
		return cultivarProtegidas;
	}

	public void setCultivarProtegidas(List<CultivarProtegida> cultivarProtegidas) {
		this.cultivarProtegidas = cultivarProtegidas;
	}

	public List<DesenhoIndustrial> getDesenhosIndustriais() {
		return desenhosIndustriais;
	}

	public void setDesenhosIndustriais(List<DesenhoIndustrial> desenhosIndustriais) {
		this.desenhosIndustriais = desenhosIndustriais;
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	public List<TopografiaCircuitoIntegrado> getTopografiasCircuitoIntegrado() {
		return topografiasCircuitoIntegrado;
	}

	public void setTopografiasCircuitoIntegrado(List<TopografiaCircuitoIntegrado> topografiasCircuitoIntegrado) {
		this.topografiasCircuitoIntegrado = topografiasCircuitoIntegrado;
	}

	public List<ProdutoTecnologico> getProdutosTecnologicos() {
		return produtosTecnologicos;
	}

	public void setProdutosTecnologicos(List<ProdutoTecnologico> produtosTecnologicos) {
		this.produtosTecnologicos = produtosTecnologicos;
	}

	public List<ProcessosOuTecnicas> getProcessosOuTecnicas() {
		return processosOuTecnicas;
	}

	public void setProcessosOuTecnicas(List<ProcessosOuTecnicas> processosOuTecnicas) {
		this.processosOuTecnicas = processosOuTecnicas;
	}

	public List<TrabalhoTecnico> getTrabalhosTecnicos() {
		return trabalhosTecnicos;
	}

	public void setTrabalhosTecnicos(List<TrabalhoTecnico> trabalhosTecnicos) {
		this.trabalhosTecnicos = trabalhosTecnicos;
	}

	public DemaisTiposDeProducaoTecnica getDemaisTiposDeProducaoTecnica() {
		return demaisTiposDeProducaoTecnica;
	}

	public void setDemaisTiposDeProducaoTecnica(DemaisTiposDeProducaoTecnica demaisTiposDeProducaoTecnica) {
		this.demaisTiposDeProducaoTecnica = demaisTiposDeProducaoTecnica;
	}

}
