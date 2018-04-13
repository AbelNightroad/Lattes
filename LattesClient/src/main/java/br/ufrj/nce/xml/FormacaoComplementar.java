package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("FORMACAO-COMPLEMENTAR")
public class FormacaoComplementar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR-DE-EXTENSAO-UNIVERSITARIA")
	private List<FormacaoComplementarExtensaoUniversitaria> formacaoComplementarExtensaoUniversitaria;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "MBA")
	private List<MBA> mba;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR-CURSO-DE-CURTA-DURACAO")
	private List<FormacaoComplementarCursoCurtaDuracao> formacaoComplementarCursoCurtaDuracao;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "OUTROS")
	private List<Outros> outros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FormacaoComplementarExtensaoUniversitaria> getFormacaoComplementarExtensaoUniversitaria() {
		return formacaoComplementarExtensaoUniversitaria;
	}

	public void setFormacaoComplementarExtensaoUniversitaria(
			List<FormacaoComplementarExtensaoUniversitaria> formacaoComplementarExtensaoUniversitaria) {
		this.formacaoComplementarExtensaoUniversitaria = formacaoComplementarExtensaoUniversitaria;
	}

	public List<MBA> getMba() {
		return mba;
	}

	public void setMba(List<MBA> mba) {
		this.mba = mba;
	}

	public List<FormacaoComplementarCursoCurtaDuracao> getFormacaoComplementarCursoCurtaDuracao() {
		return formacaoComplementarCursoCurtaDuracao;
	}

	public void setFormacaoComplementarCursoCurtaDuracao(
			List<FormacaoComplementarCursoCurtaDuracao> formacaoComplementarCursoCurtaDuracao) {
		this.formacaoComplementarCursoCurtaDuracao = formacaoComplementarCursoCurtaDuracao;
	}

	public List<Outros> getOutros() {
		return outros;
	}

	public void setOutros(List<Outros> outros) {
		this.outros = outros;
	}
}
