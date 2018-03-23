package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
public class DetalhamentoDaOrganizacaoDeEvento {

	@XStreamAlias("INSTITUICAO-PROMOTORA")
	@XStreamAsAttribute
	private String instituicaoPromotora;

	@XStreamAlias("DURACAO-EM-SEMANAS")
	@XStreamAsAttribute
	private String duracaoEmSemanas;

	@XStreamAlias("FLAG-EVENTO-ITINERANTE")
	@XStreamAsAttribute
	private String flagEventoItinerante;

	@XStreamAlias("FLAG-CATALOGO")
	@XStreamAsAttribute
	private String flagCatalogo;

	@XStreamAlias("LOCAL")
	@XStreamAsAttribute
	private String local;

	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}

	public String getDuracaoEmSemanas() {
		return duracaoEmSemanas;
	}

	public void setDuracaoEmSemanas(String duracaoEmSemanas) {
		this.duracaoEmSemanas = duracaoEmSemanas;
	}

	public String getFlagEventoItinerante() {
		return flagEventoItinerante;
	}

	public void setFlagEventoItinerante(String flagEventoItinerante) {
		this.flagEventoItinerante = flagEventoItinerante;
	}

	public String getFlagCatalogo() {
		return flagCatalogo;
	}

	public void setFlagCatalogo(String flagCatalogo) {
		this.flagCatalogo = flagCatalogo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
