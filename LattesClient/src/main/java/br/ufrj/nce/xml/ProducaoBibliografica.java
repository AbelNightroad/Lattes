package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
public class ProducaoBibliografica {

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("TRABALHOS-EM-EVENTOS")
	private List<TrabalhoEmEvento> trabalhosEmEventos;

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("ARTIGOS-PUBLICADOS")
	private List<ArtigoPublicado> artigosPublicados;

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("LIVROS-E-CAPITULOS")
	private List<LivrosECapitulos> livrosECapitulos;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("TEXTOS-EM-JORNAIS-OU-REVISTAS")
	private List<TextoJornaisRevistas> textojornaisRevistas;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
	private List<DemaisTiposProducaoBibliografica> demaisTiposProducaoBibliograficas;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamAlias("ARTIGOS-ACEITOS-PARA-PUBLICACAO")
	private List<ArtigoAceitoPublicacao> artigosAceitosPublicacaos;

	public List<TrabalhoEmEvento> getTrabalhosEmEventos() {
		return trabalhosEmEventos;
	}

	public void setTrabalhosEmEventos(List<TrabalhoEmEvento> trabalhosEmEventos) {
		this.trabalhosEmEventos = trabalhosEmEventos;
	}

	public List<ArtigoPublicado> getArtigosPublicados() {
		return artigosPublicados;
	}

	public void setArtigosPublicados(List<ArtigoPublicado> artigosPublicados) {
		this.artigosPublicados = artigosPublicados;
	}

	public List<LivrosECapitulos> getLivrosECapitulos() {
		return livrosECapitulos;
	}

	public void setLivrosECapitulos(List<LivrosECapitulos> livrosECapitulos) {
		this.livrosECapitulos = livrosECapitulos;
	}

	public List<TextoJornaisRevistas> getTextojornaisRevistas() {
		return textojornaisRevistas;
	}

	public void setTextojornaisRevistas(List<TextoJornaisRevistas> textojornaisRevistas) {
		this.textojornaisRevistas = textojornaisRevistas;
	}

	public List<DemaisTiposProducaoBibliografica> getDemaisTiposProducaoBibliograficas() {
		return demaisTiposProducaoBibliograficas;
	}

	public void setDemaisTiposProducaoBibliograficas(
			List<DemaisTiposProducaoBibliografica> demaisTiposProducaoBibliograficas) {
		this.demaisTiposProducaoBibliograficas = demaisTiposProducaoBibliograficas;
	}

	public List<ArtigoAceitoPublicacao> getArtigosAceitosPublicacaos() {
		return artigosAceitosPublicacaos;
	}

	public void setArtigosAceitosPublicacaos(List<ArtigoAceitoPublicacao> artigosAceitosPublicacaos) {
		this.artigosAceitosPublicacaos = artigosAceitosPublicacaos;
	}

}
