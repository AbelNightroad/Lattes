package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-SIMPOSIO")
public class ParticipacaoEmSimposio {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-SIMPOSIO")
	private DadosBasicosDaParticipacaoEmSimposio dadosBasicosDaParticipacaoEmSimposio;

	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-SIMPOSIO")
	private DetalhamentoDaParticipacaoEmSimposio detalhamentoDaParticipacaoEmSimposio;

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

	public DadosBasicosDaParticipacaoEmSimposio getDadosBasicosDaParticipacaoEmSimposio() {
		return dadosBasicosDaParticipacaoEmSimposio;
	}

	public void setDadosBasicosDaParticipacaoEmSimposio(
			DadosBasicosDaParticipacaoEmSimposio dadosBasicosDaParticipacaoEmSimposio) {
		this.dadosBasicosDaParticipacaoEmSimposio = dadosBasicosDaParticipacaoEmSimposio;
	}

	public DetalhamentoDaParticipacaoEmSimposio getDetalhamentoDaParticipacaoEmSimposio() {
		return detalhamentoDaParticipacaoEmSimposio;
	}

	public void setDetalhamentoDaParticipacaoEmSimposio(
			DetalhamentoDaParticipacaoEmSimposio detalhamentoDaParticipacaoEmSimposio) {
		this.detalhamentoDaParticipacaoEmSimposio = detalhamentoDaParticipacaoEmSimposio;
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
