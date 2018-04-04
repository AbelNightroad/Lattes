package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("IDIOMA")
public class Idioma {

	@XStreamAlias("IDIOMA")
	@XStreamAsAttribute
	private String idioma;

	@XStreamAlias("DESCRICAO-DO-IDIOMA")
	@XStreamAsAttribute
	private String descricaoDoIdioma;

	@XStreamAlias("PROFICIENCIA-DE-LEITURA")
	@XStreamAsAttribute
	private String proficienciaDeLeitura;

	@XStreamAlias("PROFICIENCIA-DE-FALA")
	@XStreamAsAttribute
	private String proficienciaDeFala;

	@XStreamAlias("PROFICIENCIA-DE-ESCRITA")
	@XStreamAsAttribute
	private String proficienciaDeEscrita;

	@XStreamAlias("PROFICIENCIA-DE-COMPREENSAO")
	@XStreamAsAttribute
	private String proficienciaDeCompreensao;

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDescricaoDoIdioma() {
		return descricaoDoIdioma;
	}

	public void setDescricaoDoIdioma(String descricaoDoIdioma) {
		this.descricaoDoIdioma = descricaoDoIdioma;
	}

	public String getProficienciaDeLeitura() {
		return proficienciaDeLeitura;
	}

	public void setProficienciaDeLeitura(String proficienciaDeLeitura) {
		this.proficienciaDeLeitura = proficienciaDeLeitura;
	}

	public String getProficienciaDeFala() {
		return proficienciaDeFala;
	}

	public void setProficienciaDeFala(String proficienciaDeFala) {
		this.proficienciaDeFala = proficienciaDeFala;
	}

	public String getProficienciaDeEscrita() {
		return proficienciaDeEscrita;
	}

	public void setProficienciaDeEscrita(String proficienciaDeEscrita) {
		this.proficienciaDeEscrita = proficienciaDeEscrita;
	}

	public String getProficienciaDeCompreensao() {
		return proficienciaDeCompreensao;
	}

	public void setProficienciaDeCompreensao(String proficienciaDeCompreensao) {
		this.proficienciaDeCompreensao = proficienciaDeCompreensao;
	}

}
