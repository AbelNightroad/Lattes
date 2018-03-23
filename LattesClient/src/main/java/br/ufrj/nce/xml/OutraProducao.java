package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("OUTRA-PRODUCAO")
public class OutraProducao {
	
	@XStreamImplicit(itemFieldName = "PRODUCAO-ARTISTICA-CULTURAL")
	private List<ProducaoArtisticaCultural> producaoArtisticaCultural;
	
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS")
	private List<OrientacoesConcluidas> orientacoesConcluidas;

	@XStreamImplicit(itemFieldName = "DEMAIS-TRABALHOS")
	private List<DemaisTrabalhos> demaisTrabalhos;

	public List<ProducaoArtisticaCultural> getProducaoArtisticaCultural() {
		return producaoArtisticaCultural;
	}

	public void setProducaoArtisticaCultural(List<ProducaoArtisticaCultural> producaoArtisticaCultural) {
		this.producaoArtisticaCultural = producaoArtisticaCultural;
	}

	public List<OrientacoesConcluidas> getOrientacoesConcluidas() {
		return orientacoesConcluidas;
	}

	public void setOrientacoesConcluidas(List<OrientacoesConcluidas> orientacoesConcluidas) {
		this.orientacoesConcluidas = orientacoesConcluidas;
	}

	public List<DemaisTrabalhos> getDemaisTrabalhos() {
		return demaisTrabalhos;
	}

	public void setDemaisTrabalhos(List<DemaisTrabalhos> demaisTrabalhos) {
		this.demaisTrabalhos = demaisTrabalhos;
	}
}
