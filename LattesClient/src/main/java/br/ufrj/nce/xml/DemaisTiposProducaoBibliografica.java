package br.ufrj.nce.xml;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
public class DemaisTiposProducaoBibliografica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("OUTRA-PRODUCAO-BIBLIOGRAFICA")
	private OutraProducaoBibliografica outraProducaoBibliografica;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("PARTITURA-MUSICAL")
	private PartituraMusical partituraMusical;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("PREFACIO-POSFACIO")
	private PrefacioPosfacio prefacioPosfacio;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("TRADUCAO")
	private Traducao traducao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
