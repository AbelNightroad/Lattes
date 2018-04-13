package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
public class OrientacaoAndamentoIniciacaoCientifica {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
	private DadosBasicosOrientacaoAndamentoIniciacaoCientifica dadosBasicosOrientacaoAndamentoIniciacaoCientifica;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
	private DetalhamentoOrientacaoAndamentoIniciacaoCientifica detalhamentoOrientacaoAndamentoIniciacaoCientifica;
	
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

	public DadosBasicosOrientacaoAndamentoIniciacaoCientifica getDadosBasicosOrientacaoAndamentoIniciacaoCientifica() {
		return dadosBasicosOrientacaoAndamentoIniciacaoCientifica;
	}

	public void setDadosBasicosOrientacaoAndamentoIniciacaoCientifica(
			DadosBasicosOrientacaoAndamentoIniciacaoCientifica dadosBasicosOrientacaoAndamentoIniciacaoCientifica) {
		this.dadosBasicosOrientacaoAndamentoIniciacaoCientifica = dadosBasicosOrientacaoAndamentoIniciacaoCientifica;
	}

	public DetalhamentoOrientacaoAndamentoIniciacaoCientifica getDetalhamentoOrientacaoAndamentoIniciacaoCientifica() {
		return detalhamentoOrientacaoAndamentoIniciacaoCientifica;
	}

	public void setDetalhamentoOrientacaoAndamentoIniciacaoCientifica(
			DetalhamentoOrientacaoAndamentoIniciacaoCientifica detalhamentoOrientacaoAndamentoIniciacaoCientifica) {
		this.detalhamentoOrientacaoAndamentoIniciacaoCientifica = detalhamentoOrientacaoAndamentoIniciacaoCientifica;
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
