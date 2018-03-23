package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ARTIGO-PUBLICADO")
public class ArtigoPublicado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("ORDEM-IMPORTANCIA")
	private String ordemImportancia;

	@XStreamAlias("DADOS-BASICOS-DO-ARTIGO")
	private DadosBasicosDoArtigo dadosBasicosDoArtigo;

	@XStreamAlias("DETALHAMENTO-DO-ARTIGO")
	private DetalhamentoDoArtigo detalhamentoDoArtigo;

	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
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

	public String getOrdemImportancia() {
		return ordemImportancia;
	}

	public void setOrdemImportancia(String ordemImportancia) {
		this.ordemImportancia = ordemImportancia;
	}

	public DadosBasicosDoArtigo getDadosBasicosDoArtigo() {
		return dadosBasicosDoArtigo;
	}

	public void setDadosBasicosDoArtigo(DadosBasicosDoArtigo dadosBasicosDoArtigo) {
		this.dadosBasicosDoArtigo = dadosBasicosDoArtigo;
	}

	public DetalhamentoDoArtigo getDetalhamentoDoArtigo() {
		return detalhamentoDoArtigo;
	}

	public void setDetalhamentoDoArtigo(DetalhamentoDoArtigo detalhamentoDoArtigo) {
		this.detalhamentoDoArtigo = detalhamentoDoArtigo;
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
