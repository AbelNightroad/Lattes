package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
public class BancaJulgadoraLivreDocencia {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
	private DadosBasicosBancaJulgadoraLivreDocencia dadosBasicosBancaJulgadoraLivreDocencia;
	
	@XStreamAlias("DETALHAMENTO-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
	private DetalhamentoBancaJulgadoraLivreDocencia detalhamentoBancaJulgadoraLivreDocencia;
	
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

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosBancaJulgadoraLivreDocencia getDadosBasicosBancaJulgadoraLivreDocencia() {
		return dadosBasicosBancaJulgadoraLivreDocencia;
	}

	public void setDadosBasicosBancaJulgadoraLivreDocencia(
			DadosBasicosBancaJulgadoraLivreDocencia dadosBasicosBancaJulgadoraLivreDocencia) {
		this.dadosBasicosBancaJulgadoraLivreDocencia = dadosBasicosBancaJulgadoraLivreDocencia;
	}

	public DetalhamentoBancaJulgadoraLivreDocencia getDetalhamentoBancaJulgadoraLivreDocencia() {
		return detalhamentoBancaJulgadoraLivreDocencia;
	}

	public void setDetalhamentoBancaJulgadoraLivreDocencia(
			DetalhamentoBancaJulgadoraLivreDocencia detalhamentoBancaJulgadoraLivreDocencia) {
		this.detalhamentoBancaJulgadoraLivreDocencia = detalhamentoBancaJulgadoraLivreDocencia;
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
