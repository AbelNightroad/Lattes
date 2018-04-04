package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
public class ParticipacaoEmBancaDeDoutorado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
	private DadosBasicosDaParticipacaoEmBancaDeDoutorado dadosBasicosDaParticipacaoEmBancaDeDoutorado;

	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
	private DetalhamentoDaParticipacaoEmBancaDeDoutorado detalhamentoDaParticipacaoEmBancaDeDoutorado;

	@Embedded
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
	private List<ParticipanteBanca> participantesBanca;

	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;

	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@Embedded
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;

	@Embedded
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosDaParticipacaoEmBancaDeDoutorado getDadosBasicosDaParticipacaoEmBancaDeDoutorado() {
		return dadosBasicosDaParticipacaoEmBancaDeDoutorado;
	}

	public void setDadosBasicosDaParticipacaoEmBancaDeDoutorado(
			DadosBasicosDaParticipacaoEmBancaDeDoutorado dadosBasicosDaParticipacaoEmBancaDeDoutorado) {
		this.dadosBasicosDaParticipacaoEmBancaDeDoutorado = dadosBasicosDaParticipacaoEmBancaDeDoutorado;
	}

	public DetalhamentoDaParticipacaoEmBancaDeDoutorado getDetalhamentoDaParticipacaoEmBancaDeDoutorado() {
		return detalhamentoDaParticipacaoEmBancaDeDoutorado;
	}

	public void setDetalhamentoDaParticipacaoEmBancaDeDoutorado(
			DetalhamentoDaParticipacaoEmBancaDeDoutorado detalhamentoDaParticipacaoEmBancaDeDoutorado) {
		this.detalhamentoDaParticipacaoEmBancaDeDoutorado = detalhamentoDaParticipacaoEmBancaDeDoutorado;
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
