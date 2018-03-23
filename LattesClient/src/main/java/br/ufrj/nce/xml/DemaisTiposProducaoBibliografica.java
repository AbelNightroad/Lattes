package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
public class DemaisTiposProducaoBibliografica {
	
	@XStreamAlias("OUTRA-PRODUCAO-BIBLIOGRAFICA")
	private OutraProducaoBibliografica outraProducaoBibliografica;
	
	@XStreamAlias("PARTITURA-MUSICAL")
	private PartituraMusical partituraMusical;
	
	@XStreamAlias("PREFACIO-POSFACIO")
	private PrefacioPosfacio prefacioPosfacio;
	
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
