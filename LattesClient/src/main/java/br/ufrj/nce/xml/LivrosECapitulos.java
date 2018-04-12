package br.ufrj.nce.xml;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@XStreamAlias("LIVROS-E-CAPITULOS")
public class LivrosECapitulos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Embedded
	@XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
	private LivrosPublicadosOuOrganizados livrosPublicadosOuOrganizados;
	
	@Embedded
	@XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
	private CapitulosDeLivrosPublicados capitulosDeLivrosPublicados;

	public LivrosPublicadosOuOrganizados getLivrosPublicadosOuOrganizados() {
		return livrosPublicadosOuOrganizados;
	}

	public void setLivrosPublicadosOuOrganizados(LivrosPublicadosOuOrganizados livrosPublicadosOuOrganizados) {
		this.livrosPublicadosOuOrganizados = livrosPublicadosOuOrganizados;
	}

	public CapitulosDeLivrosPublicados getCapitulosDeLivrosPublicados() {
		return capitulosDeLivrosPublicados;
	}

	public void setCapitulosDeLivrosPublicados(CapitulosDeLivrosPublicados capitulosDeLivrosPublicados) {
		this.capitulosDeLivrosPublicados = capitulosDeLivrosPublicados;
	}
}
