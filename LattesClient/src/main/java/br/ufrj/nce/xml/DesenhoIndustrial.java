package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("DESENHO-INDUSTRIAL")
public class DesenhoIndustrial {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DO-DESENHO-INDUSTRIAL")
	private DadosBasicosDesenhoIndustrial dadosBasicosDesenhoIndustrial;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DO-DESENHO-INDUSTRIAL")
	private DetalhamentoDesenhoIndustrial detalhamentoDesenhoIndustrial;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@Embedded
	@XStreamAlias("AREAS-DE-CONHECIMENTO")
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

	public DadosBasicosDesenhoIndustrial getDadosBasicosDesenhoIndustrial() {
		return dadosBasicosDesenhoIndustrial;
	}

	public void setDadosBasicosDesenhoIndustrial(DadosBasicosDesenhoIndustrial dadosBasicosDesenhoIndustrial) {
		this.dadosBasicosDesenhoIndustrial = dadosBasicosDesenhoIndustrial;
	}

	public DetalhamentoDesenhoIndustrial getDetalhamentoDesenhoIndustrial() {
		return detalhamentoDesenhoIndustrial;
	}

	public void setDetalhamentoDesenhoIndustrial(DetalhamentoDesenhoIndustrial detalhamentoDesenhoIndustrial) {
		this.detalhamentoDesenhoIndustrial = detalhamentoDesenhoIndustrial;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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
