package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DA-APRESENTACAO-DE-OBRA-ARTISTICA")
public class DetalhamentoApresentacaoObraArtistica {

	@XStreamAlias("TIPO-DE-EVENTO")
	@XStreamAsAttribute
	private String tipoEvento;
	
	@XStreamAlias("ATIVIDADE-DOS-AUTORES")
	@XStreamAsAttribute
	private String atividadeAutores;
	
	@XStreamAlias("FLAG-INEDITISMO-DA-OBRA")
	@XStreamAsAttribute
	private String flagIneditismoObra;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;
	
	@XStreamAlias("OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String obraReferencia;
	
	@XStreamAlias("AUTOR-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String autorObraReferencia;
	
	@XStreamAlias("ANO-DA-OBRA-DE-REFERENCIA")
	@XStreamAsAttribute
	private String anoObraReferencia;
	
	@XStreamAlias("DURACAO-EM-MINUTOS")
	@XStreamAsAttribute
	private String duracaoMinutos;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-EVENTO")
	@XStreamAsAttribute
	private String instituicaoPromotoraEvento;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

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

	public String getFlagIneditismoObra() {
		return flagIneditismoObra;
	}

	public void setFlagIneditismoObra(String flagIneditismoObra) {
		this.flagIneditismoObra = flagIneditismoObra;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
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

	public String getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(String duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
