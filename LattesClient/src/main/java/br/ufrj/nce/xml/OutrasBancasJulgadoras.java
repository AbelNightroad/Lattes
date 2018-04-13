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
@XStreamAlias("OUTRAS-BANCAS-JULGADORAS")
public class OutrasBancasJulgadoras {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-BANCAS-JULGADORAS")
	private DadosBasicosOutrasBancasJulgadoras dadosBasicosOutrasBancasJulgadoras;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-BANCAS-JULGADORAS")
	private DetalhamentoOutrasBancasJulgadoras detalhamentoOutrasBancasJulgadoras;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
	private List<ParticipanteBanca> participanteBancas;
	
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

	public DadosBasicosOutrasBancasJulgadoras getDadosBasicosOutrasBancasJulgadoras() {
		return dadosBasicosOutrasBancasJulgadoras;
	}

	public void setDadosBasicosOutrasBancasJulgadoras(
			DadosBasicosOutrasBancasJulgadoras dadosBasicosOutrasBancasJulgadoras) {
		this.dadosBasicosOutrasBancasJulgadoras = dadosBasicosOutrasBancasJulgadoras;
	}

	public DetalhamentoOutrasBancasJulgadoras getDetalhamentoOutrasBancasJulgadoras() {
		return detalhamentoOutrasBancasJulgadoras;
	}

	public void setDetalhamentoOutrasBancasJulgadoras(
			DetalhamentoOutrasBancasJulgadoras detalhamentoOutrasBancasJulgadoras) {
		this.detalhamentoOutrasBancasJulgadoras = detalhamentoOutrasBancasJulgadoras;
	}

	public List<ParticipanteBanca> getParticipanteBancas() {
		return participanteBancas;
	}

	public void setParticipanteBancas(List<ParticipanteBanca> participanteBancas) {
		this.participanteBancas = participanteBancas;
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
