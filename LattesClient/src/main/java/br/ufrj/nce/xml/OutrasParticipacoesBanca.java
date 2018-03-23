package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("OUTRAS-PARTICIPACOES-EM-BANCA")
public class OutrasParticipacoesBanca {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-PARTICIPACOES-EM-BANCA")
	private DadosBasicosOutrasParticipacoesBanca dadosBasicosOutrasParticipacoesBanca;
	
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-PARTICIPACOES-EM-BANCA")
	private DetalhamentoOutrasParticipacoesBanca detalhamentoOutrasParticipacoesBanca;
	
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
	private List<ParticipanteBanca> participanteBanca;
	
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

	public DadosBasicosOutrasParticipacoesBanca getDadosBasicosOutrasParticipacoesBanca() {
		return dadosBasicosOutrasParticipacoesBanca;
	}

	public void setDadosBasicosOutrasParticipacoesBanca(
			DadosBasicosOutrasParticipacoesBanca dadosBasicosOutrasParticipacoesBanca) {
		this.dadosBasicosOutrasParticipacoesBanca = dadosBasicosOutrasParticipacoesBanca;
	}

	public DetalhamentoOutrasParticipacoesBanca getDetalhamentoOutrasParticipacoesBanca() {
		return detalhamentoOutrasParticipacoesBanca;
	}

	public void setDetalhamentoOutrasParticipacoesBanca(
			DetalhamentoOutrasParticipacoesBanca detalhamentoOutrasParticipacoesBanca) {
		this.detalhamentoOutrasParticipacoesBanca = detalhamentoOutrasParticipacoesBanca;
	}

	public List<ParticipanteBanca> getParticipanteBanca() {
		return participanteBanca;
	}

	public void setParticipanteBanca(List<ParticipanteBanca> participanteBanca) {
		this.participanteBanca = participanteBanca;
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
