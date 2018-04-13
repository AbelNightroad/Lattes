package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
public class OrientacaoAndamentoPosDoutorado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
	private DadosBasicosOrientacaoAndamentoPosDoutorado dadosBasicosOrientacaoAndamentoPosDoutorado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
	private DetalhamentoOrientacaoAndamentoPosDoutorado detalhamentoOrientacaoAndamentoPosDoutorado;

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
