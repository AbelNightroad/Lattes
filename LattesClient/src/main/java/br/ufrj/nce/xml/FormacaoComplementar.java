package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class FormacaoComplementar {

	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR-DE-EXTENSAO-UNIVERSITARIA")
	private List<FormacaoComplementarExtensaoUniversitaria> formacaoComplementarExtensaoUniversitaria;
	
	@XStreamImplicit(itemFieldName = "MBA")
	private List<MBA> mba;
	
	@XStreamImplicit(itemFieldName = "FORMACAO-COMPLEMENTAR-CURSO-DE-CURTA-DURACAO")
	private List<FormacaoComplementarCursoCurtaDuracao> formacaoComplementarCursoCurtaDuracao;
	
	@XStreamImplicit(itemFieldName = "OUTROS")
	private List<Outros> outros;

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
