package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
public class OrientacaoAndamentoPosDoutorado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
	private DadosBasicosOrientacaoAndamentoPosDoutorado dadosBasicosOrientacaoAndamentoPosDoutorado;
	
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
	private DetalhamentoOrientacaoAndamentoPosDoutorado detalhamentoOrientacaoAndamentoPosDoutorado;

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

	public DadosBasicosOrientacaoAndamentoPosDoutorado getDadosBasicosOrientacaoAndamentoPosDoutorado() {
		return dadosBasicosOrientacaoAndamentoPosDoutorado;
	}

	public void setDadosBasicosOrientacaoAndamentoPosDoutorado(
			DadosBasicosOrientacaoAndamentoPosDoutorado dadosBasicosOrientacaoAndamentoPosDoutorado) {
		this.dadosBasicosOrientacaoAndamentoPosDoutorado = dadosBasicosOrientacaoAndamentoPosDoutorado;
	}

	public DetalhamentoOrientacaoAndamentoPosDoutorado getDetalhamentoOrientacaoAndamentoPosDoutorado() {
		return detalhamentoOrientacaoAndamentoPosDoutorado;
	}

	public void setDetalhamentoOrientacaoAndamentoPosDoutorado(
			DetalhamentoOrientacaoAndamentoPosDoutorado detalhamentoOrientacaoAndamentoPosDoutorado) {
		this.detalhamentoOrientacaoAndamentoPosDoutorado = detalhamentoOrientacaoAndamentoPosDoutorado;
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
