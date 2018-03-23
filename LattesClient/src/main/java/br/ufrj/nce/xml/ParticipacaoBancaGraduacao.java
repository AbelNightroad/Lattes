package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-GRADUACAO")
public class ParticipacaoBancaGraduacao {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-GRADUACAO")
	private DadosBasicosParticipacaoBancaGraduacao dadosBasicosParticipacaoBancaGraduacao;
	
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-GRADUACAO")
	private DetalhamentoParticipacaoBancaGraduacao detalhamentoParticipacaoBancaGraduacao;
	
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

	public DadosBasicosParticipacaoBancaGraduacao getDadosBasicosParticipacaoBancaGraduacao() {
		return dadosBasicosParticipacaoBancaGraduacao;
	}

	public void setDadosBasicosParticipacaoBancaGraduacao(
			DadosBasicosParticipacaoBancaGraduacao dadosBasicosParticipacaoBancaGraduacao) {
		this.dadosBasicosParticipacaoBancaGraduacao = dadosBasicosParticipacaoBancaGraduacao;
	}

	public DetalhamentoParticipacaoBancaGraduacao getDetalhamentoParticipacaoBancaGraduacao() {
		return detalhamentoParticipacaoBancaGraduacao;
	}

	public void setDetalhamentoParticipacaoBancaGraduacao(
			DetalhamentoParticipacaoBancaGraduacao detalhamentoParticipacaoBancaGraduacao) {
		this.detalhamentoParticipacaoBancaGraduacao = detalhamentoParticipacaoBancaGraduacao;
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
