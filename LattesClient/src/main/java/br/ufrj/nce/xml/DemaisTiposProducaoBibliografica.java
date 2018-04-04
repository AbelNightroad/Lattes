package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embedded
@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
public class DemaisTiposProducaoBibliografica {
	
	@Embedded
	@XStreamAlias("OUTRA-PRODUCAO-BIBLIOGRAFICA")
	private OutraProducaoBibliografica outraProducaoBibliografica;
	
	@Embedded
	@XStreamAlias("PARTITURA-MUSICAL")
	private PartituraMusical partituraMusical;
	
	@Embedded
	@XStreamAlias("PREFACIO-POSFACIO")
	private PrefacioPosfacio prefacioPosfacio;
	
	@Embedded
	@XStreamAlias("TRADUCAO")
	private Traducao traducao;

	public OutraProducaoBibliografica getOutraProducaoBibliografica() {
		return outraProducaoBibliografica;
	}

	public void setOutraProducaoBibliografica(OutraProducaoBibliografica outraProducaoBibliografica) {
		this.outraProducaoBibliografica = outraProducaoBibliografica;
	}

	public PartituraMusical getPartituraMusical() {
		return partituraMusical;
	}

	public void setPartituraMusical(PartituraMusical partituraMusical) {
		this.partituraMusical = partituraMusical;
	}

	public PrefacioPosfacio getPrefacioPosfacio() {
		return prefacioPosfacio;
	}

	public void setPrefacioPosfacio(PrefacioPosfacio prefacioPosfacio) {
		this.prefacioPosfacio = prefacioPosfacio;
	}

	public Traducao getTraducao() {
		return traducao;
	}

	public void setTraducao(Traducao traducao) {
		this.traducao = traducao;
	}
	
}
