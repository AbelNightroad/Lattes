package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-BANCA-JULGADORA")
public class ParticipacaoEmBancaJulgadora {
	
	@XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
	private List<BancaJulgadoraProfessorTitular> bancaJulgadoraProfessorTitular;
	
	@XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
	private List<BancaJulgadoraParaConcursoPublico> bancaBancaJulgadoraParaConcursoPublico;
	
	@XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
	private List<BancaJulgadoraLivreDocencia> bancaJulgadoraLivreDocencia;
	
	@XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-AVALIACAO-CURSOS")
	private List<BancaJulgadoraAvaliacaoCursos> bancaJulgadoraAvaliacaoCursos;
	
	@XStreamImplicit(itemFieldName = "OUTRAS-BANCAS-JULGADORAS")
	private List<OutrasBancasJulgadoras> outrasBancasJulgadoras;

	public List<BancaJulgadoraProfessorTitular> getBancaJulgadoraProfessorTitular() {
		return bancaJulgadoraProfessorTitular;
	}

	public void setBancaJulgadoraProfessorTitular(List<BancaJulgadoraProfessorTitular> bancaJulgadoraProfessorTitular) {
		this.bancaJulgadoraProfessorTitular = bancaJulgadoraProfessorTitular;
	}

	public List<BancaJulgadoraParaConcursoPublico> getBancaBancaJulgadoraParaConcursoPublico() {
		return bancaBancaJulgadoraParaConcursoPublico;
	}

	public void setBancaBancaJulgadoraParaConcursoPublico(
			List<BancaJulgadoraParaConcursoPublico> bancaBancaJulgadoraParaConcursoPublico) {
		this.bancaBancaJulgadoraParaConcursoPublico = bancaBancaJulgadoraParaConcursoPublico;
	}

	public List<BancaJulgadoraLivreDocencia> getBancaJulgadoraLivreDocencia() {
		return bancaJulgadoraLivreDocencia;
	}

	public void setBancaJulgadoraLivreDocencia(List<BancaJulgadoraLivreDocencia> bancaJulgadoraLivreDocencia) {
		this.bancaJulgadoraLivreDocencia = bancaJulgadoraLivreDocencia;
	}

	public List<BancaJulgadoraAvaliacaoCursos> getBancaJulgadoraAvaliacaoCursos() {
		return bancaJulgadoraAvaliacaoCursos;
	}

	public void setBancaJulgadoraAvaliacaoCursos(List<BancaJulgadoraAvaliacaoCursos> bancaJulgadoraAvaliacaoCursos) {
		this.bancaJulgadoraAvaliacaoCursos = bancaJulgadoraAvaliacaoCursos;
	}

	public List<OutrasBancasJulgadoras> getOutrasBancasJulgadoras() {
		return outrasBancasJulgadoras;
	}

	public void setOutrasBancasJulgadoras(List<OutrasBancasJulgadoras> outrasBancasJulgadoras) {
		this.outrasBancasJulgadoras = outrasBancasJulgadoras;
	}
	
}
