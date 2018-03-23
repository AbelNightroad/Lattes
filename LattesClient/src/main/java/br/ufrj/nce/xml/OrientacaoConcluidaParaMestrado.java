package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ORIENTACAO-CONCLUIDA-PARA-MESTRADO")
public class OrientacaoConcluidaParaMestrado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
	private DadosBasicosDeOrientacoesConcluidasParaMestrado dadosBasicosDeOrientacoesConcluidasParaMestrado;

	@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
	private DetalhamentoDeOrientacoesConcluidaParaMestrado detalhamentoDeOrientacoesConcluidaParaMestrado;

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

	public DadosBasicosDeOrientacoesConcluidasParaMestrado getDadosBasicosDeOrientacoesConcluidasParaMestrado() {
		return dadosBasicosDeOrientacoesConcluidasParaMestrado;
	}

	public void setDadosBasicosDeOrientacoesConcluidasParaMestrado(
			DadosBasicosDeOrientacoesConcluidasParaMestrado dadosBasicosDeOrientacoesConcluidasParaMestrado) {
		this.dadosBasicosDeOrientacoesConcluidasParaMestrado = dadosBasicosDeOrientacoesConcluidasParaMestrado;
	}

	public DetalhamentoDeOrientacoesConcluidaParaMestrado getDetalhamentoDeOrientacoesConcluidaParaMestrado() {
		return detalhamentoDeOrientacoesConcluidaParaMestrado;
	}

	public void setDetalhamentoDeOrientacoesConcluidaParaMestrado(
			DetalhamentoDeOrientacoesConcluidaParaMestrado detalhamentoDeOrientacoesConcluidaParaMestrado) {
		this.detalhamentoDeOrientacoesConcluidaParaMestrado = detalhamentoDeOrientacoesConcluidaParaMestrado;
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
