package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
public class ParticipacaoEmBancaDeDoutorado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
	private DadosBasicosDaParticipacaoEmBancaDeDoutorado dadosBasicosDaParticipacaoEmBancaDeDoutorado;

	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
	private DetalhamentoDaParticipacaoEmBancaDeDoutorado detalhamentoDaParticipacaoEmBancaDeDoutorado;

	@ElementCollection
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
