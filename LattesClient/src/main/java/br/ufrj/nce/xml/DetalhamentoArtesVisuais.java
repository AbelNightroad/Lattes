package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DE-ARTES-VISUAIS")
public class DetalhamentoArtesVisuais {

	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;
	
	@XStreamAlias("ATIVIDADE-DOS-AUTORES")
	@XStreamAsAttribute
	private String atividadeAutores;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-EVENTO")
	@XStreamAsAttribute
	private String instituicaoPromotoraEvento;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE-DO-EVENTO")
	@XStreamAsAttribute
	private String cidadeEvento;
	
	@XStreamAlias("TEMPORADA")
	@XStreamAsAttribute
	private String temporada;

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getAtividadeAutores() {
		return atividadeAutores;
	}

	public void setAtividadeAutores(String atividadeAutores) {
		this.atividadeAutores = atividadeAutores;
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

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
}
