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
@XStreamAlias("OUTRAS-PARTICIPACOES-EM-BANCA")
public class OutrasParticipacoesBanca {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-PARTICIPACOES-EM-BANCA")
	private DadosBasicosOutrasParticipacoesBanca dadosBasicosOutrasParticipacoesBanca;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-PARTICIPACOES-EM-BANCA")
	private DetalhamentoOutrasParticipacoesBanca detalhamentoOutrasParticipacoesBanca;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
	private List<ParticipanteBanca> participanteBanca;
	
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
