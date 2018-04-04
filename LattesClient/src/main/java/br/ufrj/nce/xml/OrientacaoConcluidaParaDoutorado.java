package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
public class OrientacaoConcluidaParaDoutorado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
	private DadosBasicosOrientacaoConcluidaParaDoutorado dadosBasicosOrientacaoConcluidaParaDoutorado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
	private DetalhamentoOrientacaoConcluidaParaDoutorado detalhamentoOrientacaoConcluidaParaDoutorado;
	
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

	public DadosBasicosOrientacaoConcluidaParaDoutorado getDadosBasicosOrientacaoConcluidaParaDoutorado() {
		return dadosBasicosOrientacaoConcluidaParaDoutorado;
	}

	public void setDadosBasicosOrientacaoConcluidaParaDoutorado(
			DadosBasicosOrientacaoConcluidaParaDoutorado dadosBasicosOrientacaoConcluidaParaDoutorado) {
		this.dadosBasicosOrientacaoConcluidaParaDoutorado = dadosBasicosOrientacaoConcluidaParaDoutorado;
	}

	public DetalhamentoOrientacaoConcluidaParaDoutorado getDetalhamentoOrientacaoConcluidaParaDoutorado() {
		return detalhamentoOrientacaoConcluidaParaDoutorado;
	}

	public void setDetalhamentoOrientacaoConcluidaParaDoutorado(
			DetalhamentoOrientacaoConcluidaParaDoutorado detalhamentoOrientacaoConcluidaParaDoutorado) {
		this.detalhamentoOrientacaoConcluidaParaDoutorado = detalhamentoOrientacaoConcluidaParaDoutorado;
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
