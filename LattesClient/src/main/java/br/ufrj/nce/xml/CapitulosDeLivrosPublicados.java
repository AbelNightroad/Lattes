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
@XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
public class CapitulosDeLivrosPublicados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "CAPITULO-DE-LIVRO-PUBLICADO")
	private List<CapituloDeLivroPublicado> capituloDeLivroPublicado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CapituloDeLivroPublicado> getCapituloDeLivroPublicado() {
		return capituloDeLivroPublicado;
	}

	public void setCapituloDeLivroPublicado(List<CapituloDeLivroPublicado> capituloDeLivroPublicado) {
		this.capituloDeLivroPublicado = capituloDeLivroPublicado;
	}
}
