package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
public class InformacoesAdicionaisInstituicoes {

	@ElementCollection
	@XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-INSTITUICAO")
	private List<InformacaoAdicionalInstituicao> informacaoAdicionalInstituicao;

	public List<InformacaoAdicionalInstituicao> getInformacaoAdicionalInstituicao() {
		return informacaoAdicionalInstituicao;
	}

	public void setInformacaoAdicionalInstituicao(List<InformacaoAdicionalInstituicao> informacaoAdicionalInstituicao) {
		this.informacaoAdicionalInstituicao = informacaoAdicionalInstituicao;
	}
}
