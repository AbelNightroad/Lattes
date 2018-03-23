package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OUTRA-ORIENTACAO-CONCLUIDA")
public class OutraOrientacaoConcluida {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	private DadosBasicosDeOutrasOrientacoesConcluidas dadosBasicosDeOutrasOrientacoesConcluidas;

	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	private DetalhamentoDeOutrasOrientacoesConcluidas detalhamentoDeOutrasOrientacoesConcluidas;

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

	public DadosBasicosDeOutrasOrientacoesConcluidas getDadosBasicosDeOutrasOrientacoesConcluidas() {
		return dadosBasicosDeOutrasOrientacoesConcluidas;
	}

	public void setDadosBasicosDeOutrasOrientacoesConcluidas(
			DadosBasicosDeOutrasOrientacoesConcluidas dadosBasicosDeOutrasOrientacoesConcluidas) {
		this.dadosBasicosDeOutrasOrientacoesConcluidas = dadosBasicosDeOutrasOrientacoesConcluidas;
	}

	public DetalhamentoDeOutrasOrientacoesConcluidas getDetalhamentoDeOutrasOrientacoesConcluidas() {
		return detalhamentoDeOutrasOrientacoesConcluidas;
	}

	public void setDetalhamentoDeOutrasOrientacoesConcluidas(
			DetalhamentoDeOutrasOrientacoesConcluidas detalhamentoDeOutrasOrientacoesConcluidas) {
		this.detalhamentoDeOutrasOrientacoesConcluidas = detalhamentoDeOutrasOrientacoesConcluidas;
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
