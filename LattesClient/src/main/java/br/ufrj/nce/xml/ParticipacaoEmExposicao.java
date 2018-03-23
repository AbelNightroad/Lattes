package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-EXPOSICAO")
public class ParticipacaoEmExposicao {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-EXPOSICAO")
	private DadosBasicosParticipacaoEmExposicao dadosBasicosParticipacaoEmExposicao;
	
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-EXPOSICAO")
	private DetalhamentoParticipacaoEmExposicao detalhamentoParticipacaoEmExposicao;
	
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	private List<ParticipanteEventosCongressos> participanteEventosCongressos;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosParticipacaoEmExposicao getDadosBasicosParticipacaoEmExposicao() {
		return dadosBasicosParticipacaoEmExposicao;
	}

	public void setDadosBasicosParticipacaoEmExposicao(
			DadosBasicosParticipacaoEmExposicao dadosBasicosParticipacaoEmExposicao) {
		this.dadosBasicosParticipacaoEmExposicao = dadosBasicosParticipacaoEmExposicao;
	}

	public DetalhamentoParticipacaoEmExposicao getDetalhamentoParticipacaoEmExposicao() {
		return detalhamentoParticipacaoEmExposicao;
	}

	public void setDetalhamentoParticipacaoEmExposicao(
			DetalhamentoParticipacaoEmExposicao detalhamentoParticipacaoEmExposicao) {
		this.detalhamentoParticipacaoEmExposicao = detalhamentoParticipacaoEmExposicao;
	}

	public List<ParticipanteEventosCongressos> getParticipanteEventosCongressos() {
		return participanteEventosCongressos;
	}

	public void setParticipanteEventosCongressos(List<ParticipanteEventosCongressos> participanteEventosCongressos) {
		this.participanteEventosCongressos = participanteEventosCongressos;
	}

	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public AreasDoConhecimento getAreasDoConhecimento() {
		return areasDoConhecimento;
	}

	public void setAreasDoConhecimento(AreasDoConhecimento areasDoConhecimento) {
		this.areasDoConhecimento = areasDoConhecimento;
	}

	public SetoresDeAtividade getSetoresDeAtividade() {
		return setoresDeAtividade;
	}

	public void setSetoresDeAtividade(SetoresDeAtividade setoresDeAtividade) {
		this.setoresDeAtividade = setoresDeAtividade;
	}

	public InformacoesAdicionais getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}
}