package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
public class InformacoesAdicionaisCursos {

	@Embedded
	@XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-CURSO")
	private List<InformacaoAdicionalCurso> informacaoAdicionalCurso;

	public List<InformacaoAdicionalCurso> getInformacaoAdicionalCurso() {
		return informacaoAdicionalCurso;
	}

	public void setInformacaoAdicionalCurso(List<InformacaoAdicionalCurso> informacaoAdicionalCurso) {
		this.informacaoAdicionalCurso = informacaoAdicionalCurso;
	}
	
}
