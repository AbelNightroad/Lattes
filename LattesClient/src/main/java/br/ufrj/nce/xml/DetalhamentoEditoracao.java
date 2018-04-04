package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DE-EDITORACAO")
public class DetalhamentoEditoracao {

	@XStreamAlias("NUMERO-DE-PAGINAS")
	@XStreamAsAttribute
	private String numeroPaginas;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA")
	@XStreamAsAttribute
	private String instituicaoPromotora;
	
	@XStreamAlias("EDITORA")
	@XStreamAsAttribute
	private String editora;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
