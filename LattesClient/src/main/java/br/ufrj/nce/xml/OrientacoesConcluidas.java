package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("ORIENTACOES-CONCLUIDAS")
public class OrientacoesConcluidas {

	@Embedded
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
	private List<OrientacaoConcluidaParaMestrado> orientacoesConcluidasParaMestrado;

	@Embedded
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
	private List<OrientacaoConcluidaParaDoutorado> orientacoesConcluidasParaDoutorado;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private List<OrientacaoConcluidaParaPosDoutorado> orientacoesConcluidasParaPosDoutorado;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "OUTRAS-ORIENTACOES-CONCLUIDAS")
	private List<OutraOrientacaoConcluida> outrasOrientacoesConcluidas;

	public List<OrientacaoConcluidaParaMestrado> getOrientacoesConcluidasParaMestrado() {
		return orientacoesConcluidasParaMestrado;
	}

	public void setOrientacoesConcluidasParaMestrado(
			List<OrientacaoConcluidaParaMestrado> orientacoesConcluidasParaMestrado) {
		this.orientacoesConcluidasParaMestrado = orientacoesConcluidasParaMestrado;
	}

	public List<OrientacaoConcluidaParaDoutorado> getOrientacoesConcluidasParaDoutorado() {
		return orientacoesConcluidasParaDoutorado;
	}

	public void setOrientacoesConcluidasParaDoutorado(
			List<OrientacaoConcluidaParaDoutorado> orientacoesConcluidasParaDoutorado) {
		this.orientacoesConcluidasParaDoutorado = orientacoesConcluidasParaDoutorado;
	}

	public List<OrientacaoConcluidaParaPosDoutorado> getOrientacoesConcluidasParaPosDoutorado() {
		return orientacoesConcluidasParaPosDoutorado;
	}

	public void setOrientacoesConcluidasParaPosDoutorado(
			List<OrientacaoConcluidaParaPosDoutorado> orientacoesConcluidasParaPosDoutorado) {
		this.orientacoesConcluidasParaPosDoutorado = orientacoesConcluidasParaPosDoutorado;
	}

	public List<OutraOrientacaoConcluida> getOutrasOrientacoesConcluidas() {
		return outrasOrientacoesConcluidas;
	}

	public void setOutrasOrientacoesConcluidas(List<OutraOrientacaoConcluida> outrasOrientacoesConcluidas) {
		this.outrasOrientacoesConcluidas = outrasOrientacoesConcluidas;
	}
	
}
