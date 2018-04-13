package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO")
public class OrientacaoAndamentoGraduacao {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO")
	private DadosBasicosOrientacaoAndamentoGraduacao dadosBasicosOrientacaoAndamentoGraduacao;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO")
	private DetalhamentoOrientacaoAndamentoGraduacao detalhamentoOrientacaoAndamentoGraduacao;
	
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

	public DadosBasicosOrientacaoAndamentoGraduacao getDadosBasicosOrientacaoAndamentoGraduacao() {
		return dadosBasicosOrientacaoAndamentoGraduacao;
	}

	public void setDadosBasicosOrientacaoAndamentoGraduacao(
			DadosBasicosOrientacaoAndamentoGraduacao dadosBasicosOrientacaoAndamentoGraduacao) {
		this.dadosBasicosOrientacaoAndamentoGraduacao = dadosBasicosOrientacaoAndamentoGraduacao;
	}

	public DetalhamentoOrientacaoAndamentoGraduacao getDetalhamentoOrientacaoAndamentoGraduacao() {
		return detalhamentoOrientacaoAndamentoGraduacao;
	}

	public void setDetalhamentoOrientacaoAndamentoGraduacao(
			DetalhamentoOrientacaoAndamentoGraduacao detalhamentoOrientacaoAndamentoGraduacao) {
		this.detalhamentoOrientacaoAndamentoGraduacao = detalhamentoOrientacaoAndamentoGraduacao;
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
