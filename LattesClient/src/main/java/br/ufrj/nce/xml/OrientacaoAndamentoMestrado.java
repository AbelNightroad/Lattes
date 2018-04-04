package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
public class OrientacaoAndamentoMestrado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
	private DadosBasicosOrientacaoAndamentoMestrado dadosBasicosOrientacaoAndamentoMestrado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
	private DetalhamentoOrientacaoAndamentoMestrado detalhamentoOrientacaoAndamentoMestrado;
	
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

	public DadosBasicosOrientacaoAndamentoMestrado getDadosBasicosOrientacaoAndamentoMestrado() {
		return dadosBasicosOrientacaoAndamentoMestrado;
	}

	public void setDadosBasicosOrientacaoAndamentoMestrado(
			DadosBasicosOrientacaoAndamentoMestrado dadosBasicosOrientacaoAndamentoMestrado) {
		this.dadosBasicosOrientacaoAndamentoMestrado = dadosBasicosOrientacaoAndamentoMestrado;
	}

	public DetalhamentoOrientacaoAndamentoMestrado getDetalhamentoOrientacaoAndamentoMestrado() {
		return detalhamentoOrientacaoAndamentoMestrado;
	}

	public void setDetalhamentoOrientacaoAndamentoMestrado(
			DetalhamentoOrientacaoAndamentoMestrado detalhamentoOrientacaoAndamentoMestrado) {
		this.detalhamentoOrientacaoAndamentoMestrado = detalhamentoOrientacaoAndamentoMestrado;
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
