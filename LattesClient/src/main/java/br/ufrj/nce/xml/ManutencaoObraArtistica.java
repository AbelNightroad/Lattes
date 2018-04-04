package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("MANUTENCAO-DE-OBRA-ARTISTICA")
public class ManutencaoObraArtistica {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-MANUTENCAO-DE-OBRA-ARTISTICA")
	private DadosBasicosManutencaoObraArtistica dadosBasicosManutencaoObraArtistica;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-MANUTENCAO-DE-OBRA-ARTISTICA")
	private DetalhamentoManutencaoObraArtistica detalhamentoManutencaoObraArtistica;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
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

	public DadosBasicosManutencaoObraArtistica getDadosBasicosManutencaoObraArtistica() {
		return dadosBasicosManutencaoObraArtistica;
	}

	public void setDadosBasicosManutencaoObraArtistica(
			DadosBasicosManutencaoObraArtistica dadosBasicosManutencaoObraArtistica) {
		this.dadosBasicosManutencaoObraArtistica = dadosBasicosManutencaoObraArtistica;
	}

	public DetalhamentoManutencaoObraArtistica getDetalhamentoManutencaoObraArtistica() {
		return detalhamentoManutencaoObraArtistica;
	}

	public void setDetalhamentoManutencaoObraArtistica(
			DetalhamentoManutencaoObraArtistica detalhamentoManutencaoObraArtistica) {
		this.detalhamentoManutencaoObraArtistica = detalhamentoManutencaoObraArtistica;
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
