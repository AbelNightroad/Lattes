package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embedded
@XStreamAlias("LIVROS-E-CAPITULOS")
public class LivrosECapitulos {

	@Embedded
	@XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
	private List<LivroPublicadoOuOrganizado> livrosPublicadosOuOrganizado;

	@Embedded
	@XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
	private List<CapituloDeLivroPublicado> capitulosDeLivrosPublicados;

	public List<LivroPublicadoOuOrganizado> getLivrosPublicadosOuOrganizado() {
		return livrosPublicadosOuOrganizado;
	}

	public void setLivrosPublicadosOuOrganizado(
			List<LivroPublicadoOuOrganizado> livrosPublicadosOuOrganizado) {
		this.livrosPublicadosOuOrganizado = livrosPublicadosOuOrganizado;
	}

	public List<CapituloDeLivroPublicado> getCapitulosDeLivrosPublicados() {
		return capitulosDeLivrosPublicados;
	}

	public void setCapitulosDeLivrosPublicados(
			List<CapituloDeLivroPublicado> capitulosDeLivrosPublicados) {
		this.capitulosDeLivrosPublicados = capitulosDeLivrosPublicados;
	}

}
