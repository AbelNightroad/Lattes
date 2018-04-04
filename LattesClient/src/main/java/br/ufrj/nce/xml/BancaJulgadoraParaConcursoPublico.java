package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
public class BancaJulgadoraParaConcursoPublico {
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
	private DadosBasicosDaBancaJulgadoraParaConcursoPublico dadosBasicosDaBancaJulgadoraParaConcursoPublico;

	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
	private DetalhamentoDaBancaJulgadoraParaConcursoPublico detalhamentoDaBancaJulgadoraParaConcursoPublico;
	
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

	public DadosBasicosDaBancaJulgadoraParaConcursoPublico getDadosBasicosDaBancaJulgadoraParaConcursoPublico() {
		return dadosBasicosDaBancaJulgadoraParaConcursoPublico;
	}

	public void setDadosBasicosDaBancaJulgadoraParaConcursoPublico(
			DadosBasicosDaBancaJulgadoraParaConcursoPublico dadosBasicosDaBancaJulgadoraParaConcursoPublico) {
		this.dadosBasicosDaBancaJulgadoraParaConcursoPublico = dadosBasicosDaBancaJulgadoraParaConcursoPublico;
	}

	public DetalhamentoDaBancaJulgadoraParaConcursoPublico getDetalhamentoDaBancaJulgadoraParaConcursoPublico() {
		return detalhamentoDaBancaJulgadoraParaConcursoPublico;
	}

	public void setDetalhamentoDaBancaJulgadoraParaConcursoPublico(
			DetalhamentoDaBancaJulgadoraParaConcursoPublico detalhamentoDaBancaJulgadoraParaConcursoPublico) {
		this.detalhamentoDaBancaJulgadoraParaConcursoPublico = detalhamentoDaBancaJulgadoraParaConcursoPublico;
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
