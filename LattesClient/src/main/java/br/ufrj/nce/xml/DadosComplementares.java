package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("DADOS-COMPLEMENTARES")
public class DadosComplementares {
	
	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR")
	private List<FormacaoComplementar> formacaoComplementar;

	@XStreamAlias("PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
	private ParticipacaoEmBancaTrabalhosConclusao participacaoEmBancaTrabalhosConclusao;

	@XStreamAlias("PARTICIPACAO-EM-BANCA-JULGADORA")
	private ParticipacaoEmBancaJulgadora participacaoEmBancaoJulgadora;

	@XStreamAlias("PARTICIPACAO-EM-EVENTOS-CONGRESSOS")
	private ParticipacaoEmEventosCongressos participacaoEmEventosCongressos;
	
	@XStreamAlias("ORIENTACOES-EM-ANDAMENTO")
	private OrientacoesEmAndamento orientacoesEmAndamento;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
	private InformacoesAdicionaisInstituicoes informacoesAdicionaisInstituicoes;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
	private InformacoesAdicionaisCursos informacoesAdicionaisCursos;

	public List<FormacaoComplementar> getFormacaoComplementar() {
		return formacaoComplementar;
	}

	public void setFormacaoComplementar(List<FormacaoComplementar> formacaoComplementar) {
		this.formacaoComplementar = formacaoComplementar;
	}

	public ParticipacaoEmBancaTrabalhosConclusao getParticipacaoEmBancaTrabalhosConclusao() {
		return participacaoEmBancaTrabalhosConclusao;
	}

	public void setParticipacaoEmBancaTrabalhosConclusao(
			ParticipacaoEmBancaTrabalhosConclusao participacaoEmBancaTrabalhosConclusao) {
		this.participacaoEmBancaTrabalhosConclusao = participacaoEmBancaTrabalhosConclusao;
	}

	public ParticipacaoEmBancaJulgadora getParticipacaoEmBancaoJulgadora() {
		return participacaoEmBancaoJulgadora;
	}

	public void setParticipacaoEmBancaoJulgadora(ParticipacaoEmBancaJulgadora participacaoEmBancaoJulgadora) {
		this.participacaoEmBancaoJulgadora = participacaoEmBancaoJulgadora;
	}

	public ParticipacaoEmEventosCongressos getParticipacaoEmEventosCongressos() {
		return participacaoEmEventosCongressos;
	}

	public void setParticipacaoEmEventosCongressos(ParticipacaoEmEventosCongressos participacaoEmEventosCongressos) {
		this.participacaoEmEventosCongressos = participacaoEmEventosCongressos;
	}

	public OrientacoesEmAndamento getOrientacoesEmAndamento() {
		return orientacoesEmAndamento;
	}

	public void setOrientacoesEmAndamento(OrientacoesEmAndamento orientacoesEmAndamento) {
		this.orientacoesEmAndamento = orientacoesEmAndamento;
	}

	public InformacoesAdicionaisInstituicoes getInformacoesAdicionaisInstituicoes() {
		return informacoesAdicionaisInstituicoes;
	}

	public void setInformacoesAdicionaisInstituicoes(InformacoesAdicionaisInstituicoes informacoesAdicionaisInstituicoes) {
		this.informacoesAdicionaisInstituicoes = informacoesAdicionaisInstituicoes;
	}

	public InformacoesAdicionaisCursos getInformacoesAdicionaisCursos() {
		return informacoesAdicionaisCursos;
	}

	public void setInformacoesAdicionaisCursos(InformacoesAdicionaisCursos informacoesAdicionaisCursos) {
		this.informacoesAdicionaisCursos = informacoesAdicionaisCursos;
	}
}
