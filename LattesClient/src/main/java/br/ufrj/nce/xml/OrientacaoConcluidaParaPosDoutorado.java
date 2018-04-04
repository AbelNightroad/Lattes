package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
public class OrientacaoConcluidaParaPosDoutorado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private DadosBasicosOrientacaoConcluidaParaPosDoutorado dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private DetalhamentoOrientacaoConcluidaParaPosDoutorado detalhamentoOrientacaoConcluidaParaPosDoutorado;
	
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

	public DadosBasicosOrientacaoConcluidaParaPosDoutorado getDadosBasicosOrientacaoConcluidaParaPosDoutorado() {
		return dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	}

	public void setDadosBasicosOrientacaoConcluidaParaPosDoutorado(
			DadosBasicosOrientacaoConcluidaParaPosDoutorado dadosBasicosOrientacaoConcluidaParaPosDoutorado) {
		this.dadosBasicosOrientacaoConcluidaParaPosDoutorado = dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	}

	public DetalhamentoOrientacaoConcluidaParaPosDoutorado getDetalhamentoOrientacaoConcluidaParaPosDoutorado() {
		return detalhamentoOrientacaoConcluidaParaPosDoutorado;
	}

	public void setDetalhamentoOrientacaoConcluidaParaPosDoutorado(
			DetalhamentoOrientacaoConcluidaParaPosDoutorado detalhamentoOrientacaoConcluidaParaPosDoutorado) {
		this.detalhamentoOrientacaoConcluidaParaPosDoutorado = detalhamentoOrientacaoConcluidaParaPosDoutorado;
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
