package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("DADOS-COMPLEMENTARES")
public class DadosComplementares {
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR")
	private List<FormacaoComplementar> formacaoComplementar;

	@Embedded
	@XStreamAlias("PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
	private ParticipacaoEmBancaTrabalhosConclusao participacaoEmBancaTrabalhosConclusao;

	@Embedded
	@XStreamAlias("PARTICIPACAO-EM-BANCA-JULGADORA")
	private ParticipacaoEmBancaJulgadora participacaoEmBancaoJulgadora;

	@Embedded
	@XStreamAlias("PARTICIPACAO-EM-EVENTOS-CONGRESSOS")
	private ParticipacaoEmEventosCongressos participacaoEmEventosCongressos;
	
	@Embedded
	@XStreamAlias("ORIENTACOES-EM-ANDAMENTO")
	private OrientacoesEmAndamento orientacoesEmAndamento;
	
	@Embedded
	@XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
	private InformacoesAdicionaisInstituicoes informacoesAdicionaisInstituicoes;
	
	@Embedded
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
