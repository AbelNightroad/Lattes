package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("DETALHAMENTO-DE-MANUTENCAO-DE-OBRA-ARTISTICA")
public class DetalhamentoManutencaoObraArtistica {

	@XStreamAlias("NOME-DA-OBRA")
	@XStreamAsAttribute
	private String nomeObra;
	
	@XStreamAlias("AUTOR-DA-OBRA")
	@XStreamAsAttribute
	private String autorObra;
	
	@XStreamAlias("ANO-DA-OBRA")
	@XStreamAsAttribute
	private String anoObra;
	
	@XStreamAlias("ACERVO")
	@XStreamAsAttribute
	private String acervo;
	
	@XStreamAlias("LOCAL")
	@XStreamAsAttribute
	private String local;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	public String getNomeObra() {
		return nomeObra;
	}

	public void setNomeObra(String nomeObra) {
		this.nomeObra = nomeObra;
	}

	public String getAutorObra() {
		return autorObra;
	}

	public void setAutorObra(String autorObra) {
		this.autorObra = autorObra;
	}

	public String getAnoObra() {
		return anoObra;
	}

	public void setAnoObra(String anoObra) {
		this.anoObra = anoObra;
	}

	public String getAcervo() {
		return acervo;
	}

	public void setAcervo(String acervo) {
		this.acervo = acervo;
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
