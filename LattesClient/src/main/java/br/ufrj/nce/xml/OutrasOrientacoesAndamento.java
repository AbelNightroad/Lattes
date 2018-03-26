package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OUTRAS-ORIENTACOES-EM-ANDAMENTO")
public class OutrasOrientacoesAndamento {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-EM-ANDAMENTO")
	private DadosBasicosOutrasOrientacoesAndamento dadosBasicosOutrasOrientacoesAndamento;
	
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-ORIENTACOES-EM-ANDAMENTO")
	private DetalhamentoOutrasOrientacoesAndamento detalhamentoOutrasOrientacoesAndamento;
		
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

	public DadosBasicosOutrasOrientacoesAndamento getDadosBasicosOutrasOrientacoesAndamento() {
		return dadosBasicosOutrasOrientacoesAndamento;
	}

	public void setDadosBasicosOutrasOrientacoesAndamento(
			DadosBasicosOutrasOrientacoesAndamento dadosBasicosOutrasOrientacoesAndamento) {
		this.dadosBasicosOutrasOrientacoesAndamento = dadosBasicosOutrasOrientacoesAndamento;
	}

	public DetalhamentoOutrasOrientacoesAndamento getDetalhamentoOutrasOrientacoesAndamento() {
		return detalhamentoOutrasOrientacoesAndamento;
	}

	public void setDetalhamentoOutrasOrientacoesAndamento(
			DetalhamentoOutrasOrientacoesAndamento detalhamentoOutrasOrientacoesAndamento) {
		this.detalhamentoOutrasOrientacoesAndamento = detalhamentoOutrasOrientacoesAndamento;
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
