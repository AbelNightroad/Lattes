package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
public class InformacoesAdicionaisInstituicoes {

	@XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-INSTITUICAO")
	private List<InformacaoAdicionalInstituicao> informacaoAdicionalInstituicao;

	public List<InformacaoAdicionalInstituicao> getInformacaoAdicionalInstituicao() {
		return informacaoAdicionalInstituicao;
	}

	public void setInformacaoAdicionalInstituicao(List<InformacaoAdicionalInstituicao> informacaoAdicionalInstituicao) {
		this.informacaoAdicionalInstituicao = informacaoAdicionalInstituicao;
	}
}
