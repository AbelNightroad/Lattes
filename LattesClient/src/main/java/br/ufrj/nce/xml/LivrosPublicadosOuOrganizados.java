package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
public class LivrosPublicadosOuOrganizados {

	@Embedded
	@XStreamImplicit(itemFieldName = "LIVRO-PUBLICADO-OU-ORGANIZADO")
	private List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado;

	public List<LivroPublicadoOuOrganizado> getLivroPublicadoOuOrganizado() {
		return livroPublicadoOuOrganizado;
	}

	public void setLivroPublicadoOuOrganizado(List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado) {
		this.livroPublicadoOuOrganizado = livroPublicadoOuOrganizado;
	}
}
