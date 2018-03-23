package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("LIVRE-DOCENCIA")
public class LivreDocencia {
	
	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequeciaFormacao;
	
	@XStreamAlias("NIVEL")
	@XStreamAsAttribute
	private String nivel;
	
	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;
	
	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;
	
	@XStreamAlias("ANO-DE-OBTENCAO-DO-TITULO")
	@XStreamAsAttribute
	private String anoObtencaoTitulo;
	
	@XStreamAlias("TITULO-DO-TRABALHO")
	@XStreamAsAttribute
	private String tituloTrabalho;
	
	@XStreamAlias("TITULO-DO-TRABALHO-INGLES")
	@XStreamAsAttribute
	private String tituloTrabalhoIngles;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	@XStreamAsAttribute
	private PalavrasChave palavrasChave;
	
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	@XStreamAsAttribute
	private AreasDoConhecimento areasDoConhecimento;
	
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	@XStreamAsAttribute
	private SetoresDeAtividade setoresDeAtividade;

	public String getSequeciaFormacao() {
		return sequeciaFormacao;
	}

	public void setSequeciaFormacao(String sequeciaFormacao) {
		this.sequeciaFormacao = sequeciaFormacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
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

	public String getAnoObtencaoTitulo() {
		return anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public String getTituloTrabalho() {
		return tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}

	public String getTituloTrabalhoIngles() {
		return tituloTrabalhoIngles;
	}

	public void setTituloTrabalhoIngles(String tituloTrabalhoIngles) {
		this.tituloTrabalhoIngles = tituloTrabalhoIngles;
	}

	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public AreasDoConhecimento getAreasDoConhecimento() {
		return areasDoConhecimento;
	}

	public void setAreasDoConhecimento(AreasDoConhecimento areasDoConhecimento) {
		this.areasDoConhecimento = areasDoConhecimento;
	}

	public SetoresDeAtividade getSetoresDeAtividade() {
		return setoresDeAtividade;
	}

	public void setSetoresDeAtividade(SetoresDeAtividade setoresDeAtividade) {
		this.setoresDeAtividade = setoresDeAtividade;
	}
}
