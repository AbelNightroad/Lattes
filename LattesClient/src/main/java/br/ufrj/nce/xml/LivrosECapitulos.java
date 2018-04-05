package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embedded
@XStreamAlias("LIVROS-E-CAPITULOS")
public class LivrosECapitulos {
	
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
