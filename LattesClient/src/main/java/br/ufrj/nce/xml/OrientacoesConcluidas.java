package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("ORIENTACOES-CONCLUIDAS")
public class OrientacoesConcluidas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
	private List<OrientacaoConcluidaParaMestrado> orientacoesConcluidasParaMestrado;

	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
	private List<OrientacaoConcluidaParaDoutorado> orientacoesConcluidasParaDoutorado;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private List<OrientacaoConcluidaParaPosDoutorado> orientacoesConcluidasParaPosDoutorado;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@XStreamImplicit(itemFieldName = "OUTRAS-ORIENTACOES-CONCLUIDAS")
	private List<OutraOrientacaoConcluida> outrasOrientacoesConcluidas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<OrientacaoConcluidaParaMestrado> getOrientacoesConcluidasParaMestrado() {
		return orientacoesConcluidasParaMestrado;
	}

	public void setOrientacoesConcluidasParaMestrado(
			List<OrientacaoConcluidaParaMestrado> orientacoesConcluidasParaMestrado) {
		this.orientacoesConcluidasParaMestrado = orientacoesConcluidasParaMestrado;
	}

	public List<OrientacaoConcluidaParaDoutorado> getOrientacoesConcluidasParaDoutorado() {
		return orientacoesConcluidasParaDoutorado;
	}

	public void setOrientacoesConcluidasParaDoutorado(
			List<OrientacaoConcluidaParaDoutorado> orientacoesConcluidasParaDoutorado) {
		this.orientacoesConcluidasParaDoutorado = orientacoesConcluidasParaDoutorado;
	}

	public List<OrientacaoConcluidaParaPosDoutorado> getOrientacoesConcluidasParaPosDoutorado() {
		return orientacoesConcluidasParaPosDoutorado;
	}

	public void setOrientacoesConcluidasParaPosDoutorado(
			List<OrientacaoConcluidaParaPosDoutorado> orientacoesConcluidasParaPosDoutorado) {
		this.orientacoesConcluidasParaPosDoutorado = orientacoesConcluidasParaPosDoutorado;
	}

	public List<OutraOrientacaoConcluida> getOutrasOrientacoesConcluidas() {
		return outrasOrientacoesConcluidas;
	}

	public void setOutrasOrientacoesConcluidas(List<OutraOrientacaoConcluida> outrasOrientacoesConcluidas) {
		this.outrasOrientacoesConcluidas = outrasOrientacoesConcluidas;
	}
	
}
