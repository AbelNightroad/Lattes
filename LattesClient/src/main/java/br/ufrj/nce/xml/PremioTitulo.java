package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("PREMIO-TITULO")
public class PremioTitulo {

	@XStreamAlias("NOME-DO-PREMIO-OU-TITULO")
	@XStreamAsAttribute
	private String nomeDoPremioOuTiulo;

	@XStreamAlias("NOME-DA-ENTIDADE-PROMOTORA")
	@XStreamAsAttribute
	private String nomeDaEntidadePromotora;

	@XStreamAlias("ANO-DA-PREMIACAO")
	@XStreamAsAttribute
	private String anoDaPremiacao;

	@XStreamAlias("NOME-DO-PREMIO-OU-TITULO-INGLES")
	@XStreamAsAttribute
	private String nomeDoPremioOuTituloIngles;

	public String getNomeDoPremioOuTiulo() {
		return nomeDoPremioOuTiulo;
	}

	public void setNomeDoPremioOuTiulo(String nomeDoPremioOuTiulo) {
		this.nomeDoPremioOuTiulo = nomeDoPremioOuTiulo;
	}

	public String getNomeDaEntidadePromotora() {
		return nomeDaEntidadePromotora;
	}

	public void setNomeDaEntidadePromotora(String nomeDaEntidadePromotora) {
		this.nomeDaEntidadePromotora = nomeDaEntidadePromotora;
	}

	public String getAnoDaPremiacao() {
		return anoDaPremiacao;
	}

	public void setAnoDaPremiacao(String anoDaPremiacao) {
		this.anoDaPremiacao = anoDaPremiacao;
	}

	public String getNomeDoPremioOuTituloIngles() {
		return nomeDoPremioOuTituloIngles;
	}

	public void setNomeDoPremioOuTituloIngles(String nomeDoPremioOuTituloIngles) {
		this.nomeDoPremioOuTituloIngles = nomeDoPremioOuTituloIngles;
	}

}
