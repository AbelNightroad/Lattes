package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-APRESENTACAO-DE-TRABALHO")
public class DetalhamentoApresentacaoTrabalho {

	@XStreamAlias("NOME-EVENTO")
	@XStreamAsAttribute
	private String nomeEvento;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA")
	@XStreamAsAttribute
	private String instituicaoPromotora;
	
	@XStreamAlias("LOCAL-DA-APRESENTACAO")
	@XStreamAsAttribute
	private String localApresentacao;
	
	@XStreamAlias("CIDADE-DA-APRESENTACAO")
	@XStreamAsAttribute
	private String cidadeApresentacao;
	
	@XStreamAlias("NOME-EVENTO-INGLES")
	@XStreamAsAttribute
	private String nomeEventoIngles;

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}

	public String getLocalApresentacao() {
		return localApresentacao;
	}

	public void setLocalApresentacao(String localApresentacao) {
		this.localApresentacao = localApresentacao;
	}

	public String getCidadeApresentacao() {
		return cidadeApresentacao;
	}

	public void setCidadeApresentacao(String cidadeApresentacao) {
		this.cidadeApresentacao = cidadeApresentacao;
	}

	public String getNomeEventoIngles() {
		return nomeEventoIngles;
	}

	public void setNomeEventoIngles(String nomeEventoIngles) {
		this.nomeEventoIngles = nomeEventoIngles;
	}
}
