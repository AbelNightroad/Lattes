package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
public class DemaisTiposDeProducaoTecnica {
	
	@XStreamImplicit(itemFieldName = "APRESENTACAO-DE-TRABALHO")
	private List<ApresentacaoTrabalho> apresentacaoTrabalho;
	
	@XStreamImplicit(itemFieldName = "CARTA-MAPA-OU-SIMILAR")
	private List<CartaMapaSimilar> cartaMapaSimilar;
	
	@XStreamImplicit(itemFieldName = "CURSO-DE-CURTA-DURACAO-MINISTRADO")
	private List<CursoCurtaDuracaoMinistrado> cursoCurtaDuracaoMinistrado;
	
	@XStreamImplicit(itemFieldName = "DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
	private List<DesenvolvimentoDeMaterialDidaticoOuIntrucional> desenvolvimentoDeMateriaisDidaticoOuIntrucional;
	
	@XStreamImplicit(itemFieldName = "EDITORACAO")
	private List<Editoracao> editoracao;
	
	@XStreamImplicit(itemFieldName = "MANUTENCAO-DE-OBRA-ARTISTICA")
	private List<ManutencaoObraArtistica> manutencaoObraArtistica;
	
	@XStreamImplicit(itemFieldName = "MAQUETE")
	private List<Maquete> maquete;

	@XStreamImplicit(itemFieldName = "ORGANIZACAO-DE-EVENTO")
	private List<OrganizacaoDeEvento> organizacaoDeEventos;
	
	@XStreamImplicit(itemFieldName = "PROGRAMA-DE-RADIO-TV")
	private List<ProgramaRadioTv> programaRadioTv;
	
	@XStreamImplicit(itemFieldName = "RELATORIO-DE-PESQUISA")
	private List<RelatorioPesquisa> relatorioPesquisa;
	
	@XStreamImplicit(itemFieldName = "MIDIA-SOCIAL-WEBSITE-BLOG")
	private List<MidiaSocialWebsiteBlog> MidiSocialWebsiteBlog;
	
	@XStreamImplicit(itemFieldName = "OUTRA-PRODUCAO-TECNICA")
	private List<OutraProducaoTecnica> outraProducaoTecnica;

	public List<ApresentacaoTrabalho> getApresentacaoTrabalho() {
		return apresentacaoTrabalho;
	}

	public void setApresentacaoTrabalho(List<ApresentacaoTrabalho> apresentacaoTrabalho) {
		this.apresentacaoTrabalho = apresentacaoTrabalho;
	}

	public List<CartaMapaSimilar> getCartaMapaSimilar() {
		return cartaMapaSimilar;
	}

	public void setCartaMapaSimilar(List<CartaMapaSimilar> cartaMapaSimilar) {
		this.cartaMapaSimilar = cartaMapaSimilar;
	}

	public List<CursoCurtaDuracaoMinistrado> getCursoCurtaDuracaoMinistrado() {
		return cursoCurtaDuracaoMinistrado;
	}

	public void setCursoCurtaDuracaoMinistrado(List<CursoCurtaDuracaoMinistrado> cursoCurtaDuracaoMinistrado) {
		this.cursoCurtaDuracaoMinistrado = cursoCurtaDuracaoMinistrado;
	}

	public List<DesenvolvimentoDeMaterialDidaticoOuIntrucional> getDesenvolvimentoDeMateriaisDidaticoOuIntrucional() {
		return desenvolvimentoDeMateriaisDidaticoOuIntrucional;
	}

	public void setDesenvolvimentoDeMateriaisDidaticoOuIntrucional(
			List<DesenvolvimentoDeMaterialDidaticoOuIntrucional> desenvolvimentoDeMateriaisDidaticoOuIntrucional) {
		this.desenvolvimentoDeMateriaisDidaticoOuIntrucional = desenvolvimentoDeMateriaisDidaticoOuIntrucional;
	}

	public List<Editoracao> getEditoracao() {
		return editoracao;
	}

	public void setEditoracao(List<Editoracao> editoracao) {
		this.editoracao = editoracao;
	}

	public List<ManutencaoObraArtistica> getManutencaoObraArtistica() {
		return manutencaoObraArtistica;
	}

	public void setManutencaoObraArtistica(List<ManutencaoObraArtistica> manutencaoObraArtistica) {
		this.manutencaoObraArtistica = manutencaoObraArtistica;
	}

	public List<Maquete> getMaquete() {
		return maquete;
	}

	public void setMaquete(List<Maquete> maquete) {
		this.maquete = maquete;
	}

	public List<OrganizacaoDeEvento> getOrganizacaoDeEventos() {
		return organizacaoDeEventos;
	}

	public void setOrganizacaoDeEventos(List<OrganizacaoDeEvento> organizacaoDeEventos) {
		this.organizacaoDeEventos = organizacaoDeEventos;
	}

	public List<ProgramaRadioTv> getProgramaRadioTv() {
		return programaRadioTv;
	}

	public void setProgramaRadioTv(List<ProgramaRadioTv> programaRadioTv) {
		this.programaRadioTv = programaRadioTv;
	}

	public List<RelatorioPesquisa> getRelatorioPesquisa() {
		return relatorioPesquisa;
	}

	public void setRelatorioPesquisa(List<RelatorioPesquisa> relatorioPesquisa) {
		this.relatorioPesquisa = relatorioPesquisa;
	}

	public List<MidiaSocialWebsiteBlog> getMidiSocialWebsiteBlog() {
		return MidiSocialWebsiteBlog;
	}

	public void setMidiSocialWebsiteBlog(List<MidiaSocialWebsiteBlog> midiSocialWebsiteBlog) {
		MidiSocialWebsiteBlog = midiSocialWebsiteBlog;
	}

	public List<OutraProducaoTecnica> getOutraProducaoTecnica() {
		return outraProducaoTecnica;
	}

	public void setOutraProducaoTecnica(List<OutraProducaoTecnica> outraProducaoTecnica) {
		this.outraProducaoTecnica = outraProducaoTecnica;
	}
}
