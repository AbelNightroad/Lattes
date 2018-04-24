package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
public class LivrosPublicadosOuOrganizados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "LIVRO-PUBLICADO-OU-ORGANIZADO")
	private List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<LivroPublicadoOuOrganizado> getLivroPublicadoOuOrganizado() {
		return livroPublicadoOuOrganizado;
	}

	public void setLivroPublicadoOuOrganizado(List<LivroPublicadoOuOrganizado> livroPublicadoOuOrganizado) {
		this.livroPublicadoOuOrganizado = livroPublicadoOuOrganizado;
	}
}
