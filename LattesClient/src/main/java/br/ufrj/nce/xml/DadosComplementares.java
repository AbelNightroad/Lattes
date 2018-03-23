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
}
