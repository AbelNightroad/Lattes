package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
public class ProducaoBibliografica {

	@XStreamAlias("TRABALHOS-EM-EVENTOS")
	private List<TrabalhoEmEvento> trabalhosEmEventos;

	@XStreamAlias("ARTIGOS-PUBLICADOS")
	private List<ArtigoPublicado> artigosPublicados;

	@XStreamAlias("LIVROS-E-CAPITULOS")
	private List<LivrosECapitulos> livrosECapitulos;
	
	@XStreamAlias("TEXTOS-EM-JORNAIS-OU-REVISTAS")
	private List<TextojornaisRevistas> textojornaisRevistas;
	
	@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
	private List<DemaisTiposProducaoBibliografica> demaisTiposProducaoBibliograficas;
	
	@XStreamAlias("ARTIGOS-ACEITOS-PARA-PUBLICACAO")
	private List<ArtigoAceitosPublicacao> artigosAceitosPublicacaos;

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

	public List<TextojornaisRevistas> getTextojornaisRevistas() {
		return textojornaisRevistas;
	}

	public void setTextojornaisRevistas(List<TextojornaisRevistas> textojornaisRevistas) {
		this.textojornaisRevistas = textojornaisRevistas;
	}

	public List<DemaisTiposProducaoBibliografica> getDemaisTiposProducaoBibliograficas() {
		return demaisTiposProducaoBibliograficas;
	}

	public void setDemaisTiposProducaoBibliograficas(
			List<DemaisTiposProducaoBibliografica> demaisTiposProducaoBibliograficas) {
		this.demaisTiposProducaoBibliograficas = demaisTiposProducaoBibliograficas;
	}

	public List<ArtigoAceitosPublicacao> getArtigosAceitosPublicacaos() {
		return artigosAceitosPublicacaos;
	}

	public void setArtigosAceitosPublicacaos(List<ArtigoAceitosPublicacao> artigosAceitosPublicacaos) {
		this.artigosAceitosPublicacaos = artigosAceitosPublicacaos;
	}

}
