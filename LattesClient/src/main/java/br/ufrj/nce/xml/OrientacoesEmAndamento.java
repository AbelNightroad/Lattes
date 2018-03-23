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
}
