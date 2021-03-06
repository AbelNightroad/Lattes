package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("PRODUCAO-ARTISTICA-CULTURAL")
public class ProducaoArtisticaCultural {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "APRESENTACAO-DE-OBRA-ARTISTICA")
	private List<ApresentacaoObraArtistica> apresentacoesObraArtistica;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "APRESENTACAO-EM-RADIO-OU-TV")
	private List<ApresentacaoRadioTv> apresentacoesRadioTv;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "ARRANJO-MUSICAL")
	private List<ArranjoMusical> arranjosMusicais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "COMPOSICAO-MUSICAL")
	private List<ComposicaoMusical> composicoesMusicais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "CURSO-DE-CURTA-DURACAO")
	private List<CursoCurtaDuracao> cursosCurtaDuracao;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "OBRA-DE-ARTES-VISUAIS")
	private List<ObraArtesVisuais> obrasArtesVisuais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "OUTRA-PRODUCAO-ARTISTICA-CULTURAL")
	private List<OutraProducaoArtisticaCultural> outrasProducoesArtisticasCulturais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "SONOPLASTIA")
	private List<Sonoplastia> sonoplastias;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "ARTES-CENICAS")
	private List<ArtesCenicas> artesCenicas;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "ARTE-VISUAIS")
	private List<ArtesVisuais> artesVisuais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "MUSICAS")
	private List<Musica> musicas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ApresentacaoObraArtistica> getApresentacoesObraArtistica() {
		return apresentacoesObraArtistica;
	}

	public void setApresentacoesObraArtistica(List<ApresentacaoObraArtistica> apresentacoesObraArtistica) {
		this.apresentacoesObraArtistica = apresentacoesObraArtistica;
	}

	public List<ApresentacaoRadioTv> getApresentacoesRadioTv() {
		return apresentacoesRadioTv;
	}

	public void setApresentacoesRadioTv(List<ApresentacaoRadioTv> apresentacoesRadioTv) {
		this.apresentacoesRadioTv = apresentacoesRadioTv;
	}

	public List<ArranjoMusical> getArranjosMusicais() {
		return arranjosMusicais;
	}

	public void setArranjosMusicais(List<ArranjoMusical> arranjosMusicais) {
		this.arranjosMusicais = arranjosMusicais;
	}

	public List<ComposicaoMusical> getComposicoesMusicais() {
		return composicoesMusicais;
	}

	public void setComposicoesMusicais(List<ComposicaoMusical> composicoesMusicais) {
		this.composicoesMusicais = composicoesMusicais;
	}

	public List<CursoCurtaDuracao> getCursosCurtaDuracao() {
		return cursosCurtaDuracao;
	}

	public void setCursosCurtaDuracao(List<CursoCurtaDuracao> cursosCurtaDuracao) {
		this.cursosCurtaDuracao = cursosCurtaDuracao;
	}

	public List<ObraArtesVisuais> getObrasArtesVisuais() {
		return obrasArtesVisuais;
	}

	public void setObrasArtesVisuais(List<ObraArtesVisuais> obrasArtesVisuais) {
		this.obrasArtesVisuais = obrasArtesVisuais;
	}

	public List<OutraProducaoArtisticaCultural> getOutrasProducoesArtisticasCulturais() {
		return outrasProducoesArtisticasCulturais;
	}

	public void setOutrasProducoesArtisticasCulturais(
			List<OutraProducaoArtisticaCultural> outrasProducoesArtisticasCulturais) {
		this.outrasProducoesArtisticasCulturais = outrasProducoesArtisticasCulturais;
	}

	public List<Sonoplastia> getSonoplastias() {
		return sonoplastias;
	}

	public void setSonoplastias(List<Sonoplastia> sonoplastias) {
		this.sonoplastias = sonoplastias;
	}

	public List<ArtesCenicas> getArtesCenicas() {
		return artesCenicas;
	}

	public void setArtesCenicas(List<ArtesCenicas> artesCenicas) {
		this.artesCenicas = artesCenicas;
	}

	public List<ArtesVisuais> getArtesVisuais() {
		return artesVisuais;
	}

	public void setArtesVisuais(List<ArtesVisuais> artesVisuais) {
		this.artesVisuais = artesVisuais;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
}
