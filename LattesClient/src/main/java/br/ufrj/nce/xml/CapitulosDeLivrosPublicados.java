package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
public class CapitulosDeLivrosPublicados {

	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "CAPITULO-DE-LIVRO-PUBLICADO")
	private List<CapituloDeLivroPublicado> capituloDeLivroPublicado;

	public List<CapituloDeLivroPublicado> getCapituloDeLivroPublicado() {
		return capituloDeLivroPublicado;
	}

	public void setCapituloDeLivroPublicado(List<CapituloDeLivroPublicado> capituloDeLivroPublicado) {
		this.capituloDeLivroPublicado = capituloDeLivroPublicado;
	}
}
