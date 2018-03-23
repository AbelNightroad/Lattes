package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DE-OUTRA-PRODUCAO-ARTISTICA-CULTURAL")
public class DetalhamentoOutraProducaoArtisticaCultural {

	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-EVENTO")
	@XStreamAsAttribute
	private String instituicaoPromotoraEvento;
	
	@XStreamAlias("LOCAL-DO-EVENTO")
	@XStreamAsAttribute
	private String localEvento;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;
	
	@XStreamAlias("EXPOSICAO")
	@XStreamAsAttribute
	private String exposicao;
	
	@XStreamAlias("PREMIACAO")
	@XStreamAsAttribute
	private String premiacao;

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

	public String getExposicao() {
		return exposicao;
	}

	public void setExposicao(String exposicao) {
		this.exposicao = exposicao;
	}

	public String getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}
}
