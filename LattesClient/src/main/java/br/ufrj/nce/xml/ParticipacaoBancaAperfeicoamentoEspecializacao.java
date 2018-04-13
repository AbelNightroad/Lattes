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
@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
public class ParticipacaoBancaAperfeicoamentoEspecializacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequenciaFormacao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao dadosBasicosParticipacaoBancaAperfeicoamentoEspecializacao;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DetalhamentoParticipacaoBancaAperfeicoamentoEspecializacao detalhamentoParticipacaoBancaAperfeicoamentoEspecializacao;
	
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
