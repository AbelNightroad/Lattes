package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ENSINO")
public class AtividadeDeEnsino {
	@XStreamAlias("SEQUENCIA-FUNCAO-ATIVIDADE")
	@XStreamAsAttribute
	private String sequenciaFuncaoAtividade;

	@XStreamAlias("FLAG-PERIODO")
	@XStreamAsAttribute
	private String flagPeriodo;

	@XStreamAlias("TIPO-ENSINO")
	@XStreamAsAttribute
	private String tipoEnsino;

	@XStreamAlias("MES-INICIO")
	@XStreamAsAttribute
	private String mesInicio;

	@XStreamAlias("ANO-INICIO")
	@XStreamAsAttribute
	private String anoInicio;

	@XStreamAlias("MES-FIM")
	@XStreamAsAttribute
	private String mesFim;

	@XStreamAlias("ANO-FIM")
	@XStreamAsAttribute
	private String anoFim;

	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;

	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;

	@XStreamAlias("CODIGO-CURSO")
	@XStreamAsAttribute
	private String codigoCurso;

	@XStreamAlias("NOME-CURSO")
	@XStreamAsAttribute
	private String nomeCurso;

	@XStreamAlias("NOME-CURSO-INGLES")
	@XStreamAsAttribute
	private String nomeCursoIngles;

	@XStreamImplicit(itemFieldName = "DISCIPLINA")
	private List<Disciplina> disciplinas;

	public String getSequenciaFuncaoAtividade() {
		return sequenciaFuncaoAtividade;
	}

	public void setSequenciaFuncaoAtividade(String sequenciaFuncaoAtividade) {
		this.sequenciaFuncaoAtividade = sequenciaFuncaoAtividade;
	}

	public String getFlagPeriodo() {
		return flagPeriodo;
	}

	public void setFlagPeriodo(String flagPeriodo) {
		this.flagPeriodo = flagPeriodo;
	}

	public String getTipoEnsino() {
		return tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public String getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getMesFim() {
		return mesFim;
	}

	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}

	public String getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}

	public String getCodigoOrgao() {
		return codigoOrgao;
	}

	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}

	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
