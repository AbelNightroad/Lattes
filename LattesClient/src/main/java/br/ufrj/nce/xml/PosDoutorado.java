package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("POS-DOUTORADO")
public class PosDoutorado {

	@XStreamAlias("SEQUENCIA-FORMACAO")
	@XStreamAsAttribute
	private String sequenciaFormacao;

	@XStreamAlias("NIVEL")
	@XStreamAsAttribute
	private String nivel;

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;

	@XStreamAlias("ANO-DE-INICIO")
	@XStreamAsAttribute
	private String anoInicio;

	@XStreamAlias("ANO-DE-CONCLUSAO")
	@XStreamAsAttribute
	private String anoConclusao;

	@XStreamAlias("ANO-DE-OBTENCAO-DO-TITULO")
	@XStreamAsAttribute
	private String anoObtencaoDoTitulo;

	@XStreamAlias("FLAG-BOLSA")
	@XStreamAsAttribute
	private String flagBolsa;

	@XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
	@XStreamAsAttribute
	private String codigoAgenciaFinanciadora;

	@XStreamAlias("NOME-AGENCIA")
	@XStreamAsAttribute
	private String nomeAgencia;
	
	@XStreamAlias("STATUS-DO-ESTAGIO")
	@XStreamAsAttribute
	private String statusEstagio;

	@XStreamAlias("STATUS-DO-CURSO")
	@XStreamAsAttribute
	private String statusCurso;
	
	@XStreamAlias("NUMERO-ID-ORIENTADOR")
	@XStreamAsAttribute
	private String numeroIdOrientador;
	
	@XStreamAlias("CODIGO-CURSO-CAPES")
	@XStreamAsAttribute
	private String codigoCursoCapes;

	@XStreamAlias("TITULO-DO-TRABALHO")
	@XStreamAsAttribute
	private String tituloDoTrabalho;

	@XStreamAlias("TITULO-DO-TRABALHO-INGLES")
	@XStreamAsAttribute
	private String tituloDoTrabalhoIngles;

	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;
	
	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@Embedded
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;

	public String getSequenciaFormacao() {
		return sequenciaFormacao;
	}

	public void setSequenciaFormacao(String sequenciaFormacao) {
		this.sequenciaFormacao = sequenciaFormacao;
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

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(String anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

	public String getAnoObtencaoDoTitulo() {
		return anoObtencaoDoTitulo;
	}

	public void setAnoObtencaoDoTitulo(String anoObtencaoDoTitulo) {
		this.anoObtencaoDoTitulo = anoObtencaoDoTitulo;
	}

	public String getFlagBolsa() {
		return flagBolsa;
	}

	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}

	public String getCodigoAgenciaFinanciadora() {
		return codigoAgenciaFinanciadora;
	}

	public void setCodigoAgenciaFinanciadora(String codigoAgenciaFinanciadora) {
		this.codigoAgenciaFinanciadora = codigoAgenciaFinanciadora;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getStatusEstagio() {
		return statusEstagio;
	}

	public void setStatusEstagio(String statusEstagio) {
		this.statusEstagio = statusEstagio;
	}

	public String getStatusCurso() {
		return statusCurso;
	}

	public void setStatusCurso(String statusCurso) {
		this.statusCurso = statusCurso;
	}

	public String getNumeroIdOrientador() {
		return numeroIdOrientador;
	}

	public void setNumeroIdOrientador(String numeroIdOrientador) {
		this.numeroIdOrientador = numeroIdOrientador;
	}

	public String getCodigoCursoCapes() {
		return codigoCursoCapes;
	}

	public void setCodigoCursoCapes(String codigoCursoCapes) {
		this.codigoCursoCapes = codigoCursoCapes;
	}

	public String getTituloDoTrabalho() {
		return tituloDoTrabalho;
	}

	public void setTituloDoTrabalho(String tituloDoTrabalho) {
		this.tituloDoTrabalho = tituloDoTrabalho;
	}

	public String getTituloDoTrabalhoIngles() {
		return tituloDoTrabalhoIngles;
	}

	public void setTituloDoTrabalhoIngles(String tituloDoTrabalhoIngles) {
		this.tituloDoTrabalhoIngles = tituloDoTrabalhoIngles;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
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
