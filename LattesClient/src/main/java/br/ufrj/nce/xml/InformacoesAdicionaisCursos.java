package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
public class InformacoesAdicionaisCursos {

	@XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-CURSO")
	private List<InformacaoAdicionalCurso> informacaoAdicionalCurso;

	public List<InformacaoAdicionalCurso> getInformacaoAdicionalCurso() {
		return informacaoAdicionalCurso;
	}

	public void setInformacaoAdicionalCurso(List<InformacaoAdicionalCurso> informacaoAdicionalCurso) {
		this.informacaoAdicionalCurso = informacaoAdicionalCurso;
	}
	
}
