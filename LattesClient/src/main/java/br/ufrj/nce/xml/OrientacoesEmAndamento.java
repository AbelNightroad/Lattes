package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ORIENTACOES-EM-ANDAMENTO")
public class OrientacoesEmAndamento {

	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
	private List<OrientacaoAndamentoMestrado> orientacaoAndamentoMestrado;
	
	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO")
	private List<OrientacaoAndamentoDoutorado> orientacaoAndamentoDoutorado;
	
	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
	private List<OrientacaoAndamentoPosDoutorado> orientacaoAndamentoPosDoutorado;
	
	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private List<OrientacaoAndamentoAperfeicoamentoEspecializacao> orientacaoAndamentoAperfeicoamentoEspecializacao;
	
	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO")
	private List<OrientacaoAndamentoGraduacao> orientacaoAndamentoGraduacao;
	
	@XStreamImplicit(itemFieldName = "ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
	private List<OrientacaoAndamentoIniciacaoCientifica> orientacaoAndamentoIniciacaoCientifica;
	
	@XStreamImplicit(itemFieldName = "OUTRAS-ORIENTACOES-EM-ANDAMENTO")
	private List<OutrasOrientacoesAndamento> outrasOrientacoesAndamento;

	public List<OrientacaoAndamentoMestrado> getOrientacaoAndamentoMestrado() {
		return orientacaoAndamentoMestrado;
	}

	public void setOrientacaoAndamentoMestrado(List<OrientacaoAndamentoMestrado> orientacaoAndamentoMestrado) {
		this.orientacaoAndamentoMestrado = orientacaoAndamentoMestrado;
	}

	public List<OrientacaoAndamentoDoutorado> getOrientacaoAndamentoDoutorado() {
		return orientacaoAndamentoDoutorado;
	}

	public void setOrientacaoAndamentoDoutorado(List<OrientacaoAndamentoDoutorado> orientacaoAndamentoDoutorado) {
		this.orientacaoAndamentoDoutorado = orientacaoAndamentoDoutorado;
	}

	public List<OrientacaoAndamentoPosDoutorado> getOrientacaoAndamentoPosDoutorado() {
		return orientacaoAndamentoPosDoutorado;
	}

	public void setOrientacaoAndamentoPosDoutorado(List<OrientacaoAndamentoPosDoutorado> orientacaoAndamentoPosDoutorado) {
		this.orientacaoAndamentoPosDoutorado = orientacaoAndamentoPosDoutorado;
	}

	public List<OrientacaoAndamentoAperfeicoamentoEspecializacao> getOrientacaoAndamentoAperfeicoamentoEspecializacao() {
		return orientacaoAndamentoAperfeicoamentoEspecializacao;
	}

	public void setOrientacaoAndamentoAperfeicoamentoEspecializacao(
			List<OrientacaoAndamentoAperfeicoamentoEspecializacao> orientacaoAndamentoAperfeicoamentoEspecializacao) {
		this.orientacaoAndamentoAperfeicoamentoEspecializacao = orientacaoAndamentoAperfeicoamentoEspecializacao;
	}

	public List<OrientacaoAndamentoGraduacao> getOrientacaoAndamentoGraduacao() {
		return orientacaoAndamentoGraduacao;
	}

	public void setOrientacaoAndamentoGraduacao(List<OrientacaoAndamentoGraduacao> orientacaoAndamentoGraduacao) {
		this.orientacaoAndamentoGraduacao = orientacaoAndamentoGraduacao;
	}

	public List<OrientacaoAndamentoIniciacaoCientifica> getOrientacaoAndamentoIniciacaoCientifica() {
		return orientacaoAndamentoIniciacaoCientifica;
	}

	public void setOrientacaoAndamentoIniciacaoCientifica(
			List<OrientacaoAndamentoIniciacaoCientifica> orientacaoAndamentoIniciacaoCientifica) {
		this.orientacaoAndamentoIniciacaoCientifica = orientacaoAndamentoIniciacaoCientifica;
	}

	public List<OutrasOrientacoesAndamento> getOutrasOrientacoesAndamento() {
		return outrasOrientacoesAndamento;
	}

	public void setOutrasOrientacoesAndamento(List<OutrasOrientacoesAndamento> outrasOrientacoesAndamento) {
		this.outrasOrientacoesAndamento = outrasOrientacoesAndamento;
	}
}
