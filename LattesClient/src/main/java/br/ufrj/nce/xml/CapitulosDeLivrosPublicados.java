package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
public class CapitulosDeLivrosPublicados {

	@Embedded
	@XStreamImplicit(itemFieldName = "CAPITULO-DE-LIVRO-PUBLICADO")
	private List<CapituloDeLivroPublicado> capituloDeLivroPublicado;

	public List<CapituloDeLivroPublicado> getCapituloDeLivroPublicado() {
		return capituloDeLivroPublicado;
	}

	public void setCapituloDeLivroPublicado(List<CapituloDeLivroPublicado> capituloDeLivroPublicado) {
		this.capituloDeLivroPublicado = capituloDeLivroPublicado;
	}
}
