package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DA-PARTITURA")
public class DetalhamentoPartitura {

	@XStreamAlias("FORMACAO-INSTRUMENTAL")
	@XStreamAsAttribute
	private String formacaoInstrumental;
	
	@XStreamAlias("EDITORA")
	@XStreamAsAttribute
	private String editora;
	
	@XStreamAlias("CIDADE-DA-EDITORA")
	@XStreamAsAttribute
	private String cidadeEditora;
	
	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("NUMERO-DO-CATALOGO")
	@XStreamAsAttribute
	private String numeroCatalogo;

	public String getFormacaoInstrumental() {
		return formacaoInstrumental;
	}

	public void setFormacaoInstrumental(String formacaoInstrumental) {
		this.formacaoInstrumental = formacaoInstrumental;
	}

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

	public String getNumeroCatalogo() {
		return numeroCatalogo;
	}

	public void setNumeroCatalogo(String numeroCatalogo) {
		this.numeroCatalogo = numeroCatalogo;
	}
}
