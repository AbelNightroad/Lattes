package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DO-CURSO-DE-CURTA-DURACAO")
public class DetalhamentoCursoCurtaDuracao {

	@XStreamAlias("DURACAO")
	@XStreamAsAttribute
	private String duracao;
	
	@XStreamAlias("UNIDADE")
	@XStreamAsAttribute
	private String unidades;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-EVENTO")
	@XStreamAsAttribute
	private String instituicaoPromotoraEvento;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
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
