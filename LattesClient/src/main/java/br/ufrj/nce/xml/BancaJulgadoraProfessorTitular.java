package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
public class BancaJulgadoraProfessorTitular {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
	private DadosBasicosBancaJulgadoraProfessorTitular dadosBasicosBancaJulgadoraProfessorTitular;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
	private DetalhamentoBancaJulgadoraProfessorTitular detalhamentoBancaJulgadoraProfessorTitular;
	
	@Embedded
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

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosBancaJulgadoraProfessorTitular getDadosBasicosBancaJulgadoraProfessorTitular() {
		return dadosBasicosBancaJulgadoraProfessorTitular;
	}

	public void setDadosBasicosBancaJulgadoraProfessorTitular(
			DadosBasicosBancaJulgadoraProfessorTitular dadosBasicosBancaJulgadoraProfessorTitular) {
		this.dadosBasicosBancaJulgadoraProfessorTitular = dadosBasicosBancaJulgadoraProfessorTitular;
	}

	public DetalhamentoBancaJulgadoraProfessorTitular getDetalhamentoBancaJulgadoraProfessorTitular() {
		return detalhamentoBancaJulgadoraProfessorTitular;
	}

	public void setDetalhamentoBancaJulgadoraProfessorTitular(
			DetalhamentoBancaJulgadoraProfessorTitular detalhamentoBancaJulgadoraProfessorTitular) {
		this.detalhamentoBancaJulgadoraProfessorTitular = detalhamentoBancaJulgadoraProfessorTitular;
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
