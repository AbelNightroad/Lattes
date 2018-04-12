package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@Embeddable
@XStreamAlias("DISCIPLINA")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = { "conteudo" })
public class Disciplina {

	@XStreamAsAttribute
	@XStreamAlias("SEQUENCIA-ESPECIFICACAO")
	private String sequenciaEspecificacao;

	private String conteudo;

	public String getSequenciaEspecificacao() {
		return sequenciaEspecificacao;
	}

	public void setSequenciaEspecificacao(String sequenciaEspecificacao) {
		this.sequenciaEspecificacao = sequenciaEspecificacao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
