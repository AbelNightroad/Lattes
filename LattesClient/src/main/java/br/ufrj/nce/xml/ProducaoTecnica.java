package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("PRODUCAO-TECNICA")
public class ProducaoTecnica {
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "CULTIVAR-REGISTRADA")
	private List<CultivarRegistrada> cultivarRegistradas;

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "SOFTWARE")
	private List<Software> softwares;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PATENTE")
	private List<Patente> patentes;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "CULTIVAR-PROTEGIDA")
	private List<CultivarProtegida> cultivarProtegidas;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "DESENHO-INDUSTRIAL")
	private List<DesenhoIndustrial> desenhosIndustriais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "MARCA")
	private List<Marca> marcas;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "TOPOGRAFIA-DE-CIRCUITO-INTEGRADO")
	private List<TopografiaCircuitoIntegrado> topografiasCircuitoIntegrado;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PRODUTO-TECNOLOGICO")
	private List<ProdutoTecnologico> produtosTecnologicos;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PROCESSOS-OU-TECNICAS")
	private List<ProcessosOuTecnicas> processosOuTecnicas;
	
	@OneToMany(cascade = CascadeType.ALL)
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
