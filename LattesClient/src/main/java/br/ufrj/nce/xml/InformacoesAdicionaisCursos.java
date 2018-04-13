package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
public class InformacoesAdicionaisCursos {

	@ElementCollection
	@XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-CURSO")
	private List<InformacaoAdicionalCurso> informacaoAdicionalCurso;

	public List<InformacaoAdicionalCurso> getInformacaoAdicionalCurso() {
		return informacaoAdicionalCurso;
	}

	public void setInformacaoAdicionalCurso(List<InformacaoAdicionalCurso> informacaoAdicionalCurso) {
		this.informacaoAdicionalCurso = informacaoAdicionalCurso;
	}
	
}
