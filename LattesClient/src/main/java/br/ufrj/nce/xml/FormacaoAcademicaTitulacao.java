package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
public class FormacaoAcademicaTitulacao {
	

	@XStreamImplicit(itemFieldName = "GRADUACAO")
	private List<Graduacao> graduacoes;
	
	@XStreamImplicit(itemFieldName = "ESPECIALIZACAO")
	private List<Especializacao> especializacoes;
	
	@XStreamImplicit(itemFieldName = "MESTRADO")
	private List<Mestrado> mestrados;

	@XStreamImplicit(itemFieldName = "DOUTORADO")
	private List<Doutorado> doutorados;

	@XStreamImplicit(itemFieldName = "POS-DOUTORADO")
	private List<PosDoutorado> posDoutorados;
	
	@XStreamImplicit(itemFieldName = "LIVRE-DOCENCIA")
	private List<LivreDocencia> livreDocencias;
	
	@XStreamImplicit(itemFieldName = "CURSO-TECNICOPROFISSIONALIZANTE")
	private List<CursoTecnicoProfissionalizante> cursosTecnicoProfissionalizantes;
	
	@XStreamImplicit(itemFieldName = "MESTRADO-PROFISSIONALIZANTE")
	private List<MestradoProfissionalizante> mestradosProficionalizantes;
	
	@XStreamImplicit(itemFieldName = "ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU")
	private List<EnsinoFundamental> ensinoFundamental;
	
	@XStreamImplicit(itemFieldName = "ENSINO-MEDIO-SEGUNDO-GRAU")
	private List<EnsinoMedio> ensinoMedio;
	
	@XStreamImplicit(itemFieldName = "RESIDENCIA-MEDICA")
	private List<ResidenciaMedica> residenciasMedicas;
	
	@XStreamImplicit(itemFieldName = "APERFEICOAMENTO")
	private List<Aperfeicoamento> aperfeicoamentos;

	public List<Graduacao> getGraduacoes() {
		return graduacoes;
	}

	public void setGraduacoes(List<Graduacao> graduacoes) {
		this.graduacoes = graduacoes;
	}

	public List<Especializacao> getEspecializacoes() {
		return especializacoes;
	}

	public void setEspecializacoes(List<Especializacao> especializacoes) {
		this.especializacoes = especializacoes;
	}

	public List<Mestrado> getMestrados() {
		return mestrados;
	}

	public void setMestrados(List<Mestrado> mestrados) {
		this.mestrados = mestrados;
	}

	public List<Doutorado> getDoutorados() {
		return doutorados;
	}

	public void setDoutorados(List<Doutorado> doutorados) {
		this.doutorados = doutorados;
	}

	public List<PosDoutorado> getPosDoutorados() {
		return posDoutorados;
	}

	public void setPosDoutorados(List<PosDoutorado> posDoutorados) {
		this.posDoutorados = posDoutorados;
	}

	public List<LivreDocencia> getLivreDocencias() {
		return livreDocencias;
	}

	public void setLivreDocencias(List<LivreDocencia> livreDocencias) {
		this.livreDocencias = livreDocencias;
	}

	public List<CursoTecnicoProfissionalizante> getCursosTecnicoProfissionalizantes() {
		return cursosTecnicoProfissionalizantes;
	}

	public void setCursosTecnicoProfissionalizantes(List<CursoTecnicoProfissionalizante> cursosTecnicoProfissionalizantes) {
		this.cursosTecnicoProfissionalizantes = cursosTecnicoProfissionalizantes;
	}

	public List<MestradoProfissionalizante> getMestradosProficionalizantes() {
		return mestradosProficionalizantes;
	}

	public void setMestradosProficionalizantes(List<MestradoProfissionalizante> mestradosProficionalizantes) {
		this.mestradosProficionalizantes = mestradosProficionalizantes;
	}

	public List<EnsinoFundamental> getEnsinoFundamental() {
		return ensinoFundamental;
	}

	public void setEnsinoFundamental(List<EnsinoFundamental> ensinoFundamental) {
		this.ensinoFundamental = ensinoFundamental;
	}

	public List<EnsinoMedio> getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(List<EnsinoMedio> ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}

	public List<ResidenciaMedica> getResidenciasMedicas() {
		return residenciasMedicas;
	}

	public void setResidenciasMedicas(List<ResidenciaMedica> residenciasMedicas) {
		this.residenciasMedicas = residenciasMedicas;
	}

	public List<Aperfeicoamento> getAperfeicoamentos() {
		return aperfeicoamentos;
	}

	public void setAperfeicoamentos(List<Aperfeicoamento> aperfeicoamentos) {
		this.aperfeicoamentos = aperfeicoamentos;
	}

}
