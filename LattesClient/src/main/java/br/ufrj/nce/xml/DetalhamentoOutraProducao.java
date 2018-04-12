package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DE-OUTRA-PRODUCAO")
public class DetalhamentoOutraProducao {

	@XStreamAlias("EDITORA")
	@XStreamAsAttribute
	private String editora;
	
	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeEditora;
	
	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("ISSN-ISBN")
	@XStreamAsAttribute
	private String issnIsbn;

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getCidadeEditora() {
		return cidadeEditora;
	}

	public void setCidadeEditora(String cidadeEditora) {
		this.cidadeEditora = cidadeEditora;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getIssnIsbn() {
		return issnIsbn;
	}

	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
	}
}
