package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("ARTES-VISUAIS")
public class ArtesVisuais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-ARTES-VISUAIS")
	private DadosBasicosArtesVisuais dadosBasicosArtesVisuais;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-ARTES-VISUAIS")
	private DetalhamentoArtesVisuais detalhamentoArtesVisuais;
	
	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;

	@ElementCollection
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@Embedded
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@Embedded
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
