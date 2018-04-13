package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
public class LivrosPublicadosOuOrganizados {

	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "LIVRO-PUBLICADO-OU-ORGANIZADO")
	private List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado;

	public List<LivroPublicadoOuOrganizado> getLivroPublicadoOuOrganizado() {
		return livroPublicadoOuOrganizado;
	}

	public void setLivroPublicadoOuOrganizado(List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado) {
		this.livroPublicadoOuOrganizado = livroPublicadoOuOrganizado;
	}
}
