package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DO-CURSO-DE-CURTA-DURACAO")
public class DetalhamentoCursoCurtaDuracaoMinistrado {

	@XStreamAlias("PARTICIPACAO-DOS-AUTORES")
	@XStreamAsAttribute
	private String participacaoAutores;
	
	@XStreamAlias("INSTITUICAO-PROMOTORA-DO-CURSO")
	@XStreamAsAttribute
	private String instituicaoPromotoraCurso;
	
	@XStreamAlias("LOCAL-DO-CURSO")
	@XStreamAsAttribute
	private String localCurso;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;
	
	@XStreamAlias("DURACAO")
	@XStreamAsAttribute
	private String duracao;
	
	@XStreamAlias("UNIDADE")
	@XStreamAsAttribute
	private String unidade;
	
	@XStreamAlias("UNIDADE-INGLES")
	@XStreamAsAttribute
	private String unidadeIngles;

	public String getParticipacaoAutores() {
		return participacaoAutores;
	}

	public void setParticipacaoAutores(String participacaoAutores) {
		this.participacaoAutores = participacaoAutores;
	}

	public String getInstituicaoPromotoraCurso() {
		return instituicaoPromotoraCurso;
	}

	public void setInstituicaoPromotoraCurso(String instituicaoPromotoraCurso) {
		this.instituicaoPromotoraCurso = instituicaoPromotoraCurso;
	}

	public String getLocalCurso() {
		return localCurso;
	}

	public void setLocalCurso(String localCurso) {
		this.localCurso = localCurso;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getUnidadeIngles() {
		return unidadeIngles;
	}

	public void setUnidadeIngles(String unidadeIngles) {
		this.unidadeIngles = unidadeIngles;
	}
}
