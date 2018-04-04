package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("OUTRA-ORIENTACAO-CONCLUIDA")
public class OutraOrientacaoConcluida {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	private DadosBasicosDeOutrasOrientacoesConcluidas dadosBasicosDeOutrasOrientacoesConcluidas;

	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	private DetalhamentoDeOutrasOrientacoesConcluidas detalhamentoDeOutrasOrientacoesConcluidas;

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
