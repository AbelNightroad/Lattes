package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
public class ParticipacaoEmBancaTrabalhosConclusao {
	
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-MESTRADO")
	private List<ParticipacaoEmBancaDeMestrado> participacaoEmBancaDeMestrados;

	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
	private List<ParticipacaoEmBancaDeDoutorado> participacaoEmBancaDeDoutorados;

	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
	private List<ParticipacaoEmBancaDeExameQualificacao> participacaoEmBancaDeExameQualificacaos;
	
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private List<ParticipacaoBancaAperfeicoamentoEspecializacao> participacaoBancaAperfeicoamentoEspecializacao;
	
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-GRADUACAO")
	private List<ParticipacaoBancaGraduacao> participacaoBancaGraduacao;
	
	@XStreamImplicit(itemFieldName = "OUTRAS-PARTICIPACOES-EM-BANCA")
	private List<OutrasParticipacoesBanca> outrasParticipacoesBanca;

	public List<ParticipacaoEmBancaDeMestrado> getParticipacaoEmBancaDeMestrados() {
		return participacaoEmBancaDeMestrados;
	}

	public void setParticipacaoEmBancaDeMestrados(List<ParticipacaoEmBancaDeMestrado> participacaoEmBancaDeMestrados) {
		this.participacaoEmBancaDeMestrados = participacaoEmBancaDeMestrados;
	}

	public List<ParticipacaoEmBancaDeDoutorado> getParticipacaoEmBancaDeDoutorados() {
		return participacaoEmBancaDeDoutorados;
	}

	public void setParticipacaoEmBancaDeDoutorados(List<ParticipacaoEmBancaDeDoutorado> participacaoEmBancaDeDoutorados) {
		this.participacaoEmBancaDeDoutorados = participacaoEmBancaDeDoutorados;
	}

	public List<ParticipacaoEmBancaDeExameQualificacao> getParticipacaoEmBancaDeExameQualificacaos() {
		return participacaoEmBancaDeExameQualificacaos;
	}

	public void setParticipacaoEmBancaDeExameQualificacaos(
			List<ParticipacaoEmBancaDeExameQualificacao> participacaoEmBancaDeExameQualificacaos) {
		this.participacaoEmBancaDeExameQualificacaos = participacaoEmBancaDeExameQualificacaos;
	}

	public List<ParticipacaoBancaAperfeicoamentoEspecializacao> getParticipacaoBancaAperfeicoamentoEspecializacao() {
		return participacaoBancaAperfeicoamentoEspecializacao;
	}

	public void setParticipacaoBancaAperfeicoamentoEspecializacao(
			List<ParticipacaoBancaAperfeicoamentoEspecializacao> participacaoBancaAperfeicoamentoEspecializacao) {
		this.participacaoBancaAperfeicoamentoEspecializacao = participacaoBancaAperfeicoamentoEspecializacao;
	}

	public List<ParticipacaoBancaGraduacao> getParticipacaoBancaGraduacao() {
		return participacaoBancaGraduacao;
	}

	public void setParticipacaoBancaGraduacao(List<ParticipacaoBancaGraduacao> participacaoBancaGraduacao) {
		this.participacaoBancaGraduacao = participacaoBancaGraduacao;
	}

	public List<OutrasParticipacoesBanca> getOutrasParticipacoesBanca() {
		return outrasParticipacoesBanca;
	}

	public void setOutrasParticipacoesBanca(List<OutrasParticipacoesBanca> outrasParticipacoesBanca) {
		this.outrasParticipacoesBanca = outrasParticipacoesBanca;
	}
}
