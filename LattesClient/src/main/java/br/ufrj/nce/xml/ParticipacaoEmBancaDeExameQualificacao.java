package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
public class ParticipacaoEmBancaDeExameQualificacao {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
	private DadosBasicosDaParticipacaoEmBancaDeExameQualificacao dadosBasicosDaParticipacaoEmBancaDeExameQualificacao;

	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
	private DetalhamentoDaParticipacaoEmBancaDeExameQualificacao detalhamentoDaParticipacaoEmBancaDeExameQualificacao;

	@XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
	private List<ParticipanteBanca> participantesBanca;
	
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

	public DadosBasicosDaParticipacaoEmBancaDeExameQualificacao getDadosBasicosDaParticipacaoEmBancaDeExameQualificacao() {
		return dadosBasicosDaParticipacaoEmBancaDeExameQualificacao;
	}

	public void setDadosBasicosDaParticipacaoEmBancaDeExameQualificacao(
			DadosBasicosDaParticipacaoEmBancaDeExameQualificacao dadosBasicosDaParticipacaoEmBancaDeExameQualificacao) {
		this.dadosBasicosDaParticipacaoEmBancaDeExameQualificacao = dadosBasicosDaParticipacaoEmBancaDeExameQualificacao;
	}

	public DetalhamentoDaParticipacaoEmBancaDeExameQualificacao getDetalhamentoDaParticipacaoEmBancaDeExameQualificacao() {
		return detalhamentoDaParticipacaoEmBancaDeExameQualificacao;
	}

	public void setDetalhamentoDaParticipacaoEmBancaDeExameQualificacao(
			DetalhamentoDaParticipacaoEmBancaDeExameQualificacao detalhamentoDaParticipacaoEmBancaDeExameQualificacao) {
		this.detalhamentoDaParticipacaoEmBancaDeExameQualificacao = detalhamentoDaParticipacaoEmBancaDeExameQualificacao;
	}

	public List<ParticipanteBanca> getParticipantesBanca() {
		return participantesBanca;
	}

	public void setParticipantesBanca(List<ParticipanteBanca> participantesBanca) {
		this.participantesBanca = participantesBanca;
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
