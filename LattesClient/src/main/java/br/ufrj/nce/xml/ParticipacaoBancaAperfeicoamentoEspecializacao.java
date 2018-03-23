package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
public class ParticipacaoBancaAperfeicoamentoEspecializacao {

	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequenciaFormacao;
	
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao;
	
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao;
	
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

	public String getSequenciaFormacao() {
		return sequenciaFormacao;
	}

	public void setSequenciaFormacao(String sequenciaFormacao) {
		this.sequenciaFormacao = sequenciaFormacao;
	}

	public DadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao getDadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao() {
		return dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao;
	}

	public void setDadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao(
			DadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao) {
		this.dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao = dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao;
	}

	public DetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao getDetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao() {
		return detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao;
	}

	public void setDetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao(
			DetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao) {
		this.detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao = detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao;
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
