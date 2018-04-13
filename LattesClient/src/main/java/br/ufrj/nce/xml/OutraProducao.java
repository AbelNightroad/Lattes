package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("OUTRA-PRODUCAO")
public class OutraProducao {
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "PRODUCAO-ARTISTICA-CULTURAL")
	private List<ProducaoArtisticaCultural> producaoArtisticaCultural;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS")
	private List<OrientacoesConcluidas> orientacoesConcluidas;

	@OneToMany(cascade = CascadeType.PERSIST)
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
