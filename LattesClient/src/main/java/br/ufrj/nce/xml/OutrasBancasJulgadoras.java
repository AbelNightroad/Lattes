package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("OUTRAS-BANCAS-JULGADORAS")
public class OutrasBancasJulgadoras {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-BANCAS-JULGADORAS")
	private DadosBasicosOutrasBancasJulgadoras dadosBasicosOutrasBancasJulgadoras;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-BANCAS-JULGADORAS")
	private DetalhamentoOutrasBancasJulgadoras detalhamentoOutrasBancasJulgadoras;
	
	@Embedded
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
