package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("FINANCIADOR-DO-PROJETO")
public class FinanciadorDoProjeto {

	@XStreamAlias("SEQUENCIA-FINANCIADOR")
	@XStreamAsAttribute
	private String sequenciaFinanciador;

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;

	public String getSequenciaFinanciador() {
		return sequenciaFinanciador;
	}

	public void setSequenciaFinanciador(String sequenciaFinanciador) {
		this.sequenciaFinanciador = sequenciaFinanciador;
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

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

}
