package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-OFICINA")
public class DetalhamentoParticipacaoEmOficina {

	@XStreamAlias("NOME-DO-EVENTO")
	@XStreamAsAttribute
	private String nomeEvento;
	
	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;
	
	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE-DO-EVENTO")
	@XStreamAsAttribute
	private String cidadeEvento;
	
	@XStreamAlias("NOME-EVENTO-INGLES")
	@XStreamAsAttribute
	private String nomeEventoIngles;

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
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

	public String getNomeEventoIngles() {
		return nomeEventoIngles;
	}

	public void setNomeEventoIngles(String nomeEventoIngles) {
		this.nomeEventoIngles = nomeEventoIngles;
	}
}
