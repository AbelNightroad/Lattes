package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("PARTICIPACAO-EM-EVENTOS-CONGRESSOS")
public class ParticipacaoEmEventosCongressos {

	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-CONGRESSO")
	private List<ParticipacaoEmCongresso> participacaoEmCongresso;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-FEIRA")
	private List<ParticipacaoEmFeira> participacaoEmFeira;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-SEMINARIO")
	private List<ParticipacaoEmSeminario> participacaoEmSeminario;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-SIMPOSIO")
	private List<ParticipacaoEmSimposio> participacaoEmSimposio;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-OFICINA")
	private List<ParticipacaoEmOficina> participacaoEmOficina;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-ENCONTRO")
	private List<ParticipacaoEmEncontro> participacaoEmEncontro;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-EXPOSICAO")
	private List<ParticipacaoEmExposicao> participacaoEmExposicao;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-OLIMPIADA")
	private List<ParticipacaoEmOlimpiada> participacaoEmOlimpiada;
	
	@OneToMany(cascade = CascadeType.ALL)
	@XStreamImplicit(itemFieldName = "OUTRAS-PARTICIPACOES-EM-EVENTOS-CONGRESSOS")
	private List<OutrasParticipacoesEmEventosCongressos> outrasParticipacoesEmEventosCongressos;

	public List<ParticipacaoEmCongresso> getParticipacaoEmCongresso() {
		return participacaoEmCongresso;
	}

	public void setParticipacaoEmCongresso(List<ParticipacaoEmCongresso> participacaoEmCongresso) {
		this.participacaoEmCongresso = participacaoEmCongresso;
	}

	public List<ParticipacaoEmFeira> getParticipacaoEmFeira() {
		return participacaoEmFeira;
	}

	public void setParticipacaoEmFeira(List<ParticipacaoEmFeira> participacaoEmFeira) {
		this.participacaoEmFeira = participacaoEmFeira;
	}

	public List<ParticipacaoEmSeminario> getParticipacaoEmSeminario() {
		return participacaoEmSeminario;
	}

	public void setParticipacaoEmSeminario(List<ParticipacaoEmSeminario> participacaoEmSeminario) {
		this.participacaoEmSeminario = participacaoEmSeminario;
	}

	public List<ParticipacaoEmSimposio> getParticipacaoEmSimposio() {
		return participacaoEmSimposio;
	}

	public void setParticipacaoEmSimposio(List<ParticipacaoEmSimposio> participacaoEmSimposio) {
		this.participacaoEmSimposio = participacaoEmSimposio;
	}

	public List<ParticipacaoEmOficina> getParticipacaoEmOficina() {
		return participacaoEmOficina;
	}

	public void setParticipacaoEmOficina(List<ParticipacaoEmOficina> participacaoEmOficina) {
		this.participacaoEmOficina = participacaoEmOficina;
	}

	public List<ParticipacaoEmEncontro> getParticipacaoEmEncontro() {
		return participacaoEmEncontro;
	}

	public void setParticipacaoEmEncontro(List<ParticipacaoEmEncontro> participacaoEmEncontro) {
		this.participacaoEmEncontro = participacaoEmEncontro;
	}

	public List<ParticipacaoEmExposicao> getParticipacaoEmExposicao() {
		return participacaoEmExposicao;
	}

	public void setParticipacaoEmExposicao(List<ParticipacaoEmExposicao> participacaoEmExposicao) {
		this.participacaoEmExposicao = participacaoEmExposicao;
	}

	public List<ParticipacaoEmOlimpiada> getParticipacaoEmOlimpiada() {
		return participacaoEmOlimpiada;
	}

	public void setParticipacaoEmOlimpiada(List<ParticipacaoEmOlimpiada> participacaoEmOlimpiada) {
		this.participacaoEmOlimpiada = participacaoEmOlimpiada;
	}

	public List<OutrasParticipacoesEmEventosCongressos> getOutrasParticipacoesEmEventosCongressos() {
		return outrasParticipacoesEmEventosCongressos;
	}

	public void setOutrasParticipacoesEmEventosCongressos(
			List<OutrasParticipacoesEmEventosCongressos> outrasParticipacoesEmEventosCongressos) {
		this.outrasParticipacoesEmEventosCongressos = outrasParticipacoesEmEventosCongressos;
	}
}
