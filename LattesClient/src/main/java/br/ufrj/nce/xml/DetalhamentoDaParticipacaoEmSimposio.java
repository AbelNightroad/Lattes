package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-SIMPOSIO")
public class DetalhamentoDaParticipacaoEmSimposio {
	
	@XStreamAlias("NOME-DO-EVENTO")
	@XStreamAsAttribute
	private String nomeDoEvento;
	
	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;

	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localDoEvento;

	@XStreamAlias("CIDADE-DO-EVENTO")
	@XStreamAsAttribute
	private String cidadeDoEvento;

	@XStreamAlias("NOME-DO-EVENTO-INGLES")
	@XStreamAsAttribute
	private String nomeDoEventoIngles;

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}

	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getLocalDoEvento() {
		return localDoEvento;
	}

	public void setLocalDoEvento(String localDoEvento) {
		this.localDoEvento = localDoEvento;
	}

	public String getCidadeDoEvento() {
		return cidadeDoEvento;
	}

	public void setCidadeDoEvento(String cidadeDoEvento) {
		this.cidadeDoEvento = cidadeDoEvento;
	}

	public String getNomeDoEventoIngles() {
		return nomeDoEventoIngles;
	}

	public void setNomeDoEventoIngles(String nomeDoEventoIngles) {
		this.nomeDoEventoIngles = nomeDoEventoIngles;
	}
}
