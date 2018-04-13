package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DE-ARTES-CENICAS")
public class DetalhamentoArtesCenicas {

	@XStreamAlias("TIPO-DE-EVENTO")
	@XStreamAsAttribute
	private String tipoEvento;
	
	@XStreamAlias("ATIVIDADE-DOS-AUTORES")
	@XStreamAsAttribute
	private String atividadeAutores;
	
	@XStreamAlias("DATA-ESTREIA")
	@XStreamAsAttribute
	private String dataEstreia;
	
	@XStreamAlias("DATA-ENCERRAMENTO")
	@XStreamAsAttribute
	private String dataEncerramento;
	
	@XStreamAlias("LOCAL-DE-ESTREIA")
	@XStreamAsAttribute
	private String localEstreia;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-PREMIO")
	@XStreamAsAttribute
	private String instituicaoPromotoraPremio;
	
	@XStreamAlias("OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String obraReferencia;
	
	@XStreamAlias("AUTOR-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String autorObraReferencia;
	
	@XStreamAlias("ANO-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String anoObraReferencia;
	
	@XStreamAlias("DURACAO")
	@XStreamAsAttribute
	private String duracao;
	
	@XStreamAlias("TEMPORADA")
	@XStreamAsAttribute
	private String temporada;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-EVENTO")
	@XStreamAsAttribute
	private String instituicaoPromotoraEvento;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE-DO-EVENTO")
	@XStreamAsAttribute
	private String cidadeEvento;
	
	@XStreamAlias("FLAG-ITINERANTE")
	@XStreamAsAttribute
	private String flagItinerante;

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getAtividadeAutores() {
		return atividadeAutores;
	}

	public void setAtividadeAutores(String atividadeAutores) {
		this.atividadeAutores = atividadeAutores;
	}

	public String getDataEstreia() {
		return dataEstreia;
	}

	public void setDataEstreia(String dataEstreia) {
		this.dataEstreia = dataEstreia;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getLocalEstreia() {
		return localEstreia;
	}

	public void setLocalEstreia(String localEstreia) {
		this.localEstreia = localEstreia;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getInstituicaoPromotoraPremio() {
		return instituicaoPromotoraPremio;
	}

	public void setInstituicaoPromotoraPremio(String instituicaoPromotoraPremio) {
		this.instituicaoPromotoraPremio = instituicaoPromotoraPremio;
	}

	public String getObraReferencia() {
		return obraReferencia;
	}

	public void setObraReferencia(String obraReferencia) {
		this.obraReferencia = obraReferencia;
	}

	public String getAutorObraReferencia() {
		return autorObraReferencia;
	}

	public void setAutorObraReferencia(String autorObraReferencia) {
		this.autorObraReferencia = autorObraReferencia;
	}

	public String getAnoObraReferencia() {
		return anoObraReferencia;
	}

	public void setAnoObraReferencia(String anoObraReferencia) {
		this.anoObraReferencia = anoObraReferencia;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getInstituicaoPromotoraEvento() {
		return instituicaoPromotoraEvento;
	}

	public void setInstituicaoPromotoraEvento(String instituicaoPromotoraEvento) {
		this.instituicaoPromotoraEvento = instituicaoPromotoraEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getCidadeEvento() {
		return cidadeEvento;
	}

	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}

	public String getFlagItinerante() {
		return flagItinerante;
	}

	public void setFlagItinerante(String flagItinerante) {
		this.flagItinerante = flagItinerante;
	}
}
