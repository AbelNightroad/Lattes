package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ARTES-VISUAIS")
public class ArtesVisuais {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DE-ARTES-VISUAIS")
	private DadosBasicosArtesVisuais dadosBasicosArtesVisuais;
	
	@XStreamAlias("DETALHAMENTO-DE-ARTES-VISUAIS")
	private DetalhamentoArtesVisuais detalhamentoArtesVisuais;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;

	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
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

	public DadosBasicosArtesVisuais getDadosBasicosArtesVisuais() {
		return dadosBasicosArtesVisuais;
	}

	public void setDadosBasicosArtesVisuais(DadosBasicosArtesVisuais dadosBasicosArtesVisuais) {
		this.dadosBasicosArtesVisuais = dadosBasicosArtesVisuais;
	}

	public DetalhamentoArtesVisuais getDetalhamentoArtesVisuais() {
		return detalhamentoArtesVisuais;
	}

	public void setDetalhamentoArtesVisuais(DetalhamentoArtesVisuais detalhamentoArtesVisuais) {
		this.detalhamentoArtesVisuais = detalhamentoArtesVisuais;
	}

	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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
