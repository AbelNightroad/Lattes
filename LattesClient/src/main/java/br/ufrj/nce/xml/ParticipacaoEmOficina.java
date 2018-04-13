package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XStreamAlias("PARTICIPACAO-EM-OFICINA")
public class ParticipacaoEmOficina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String seqeuenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-OFICINA")
	private DadosBasicosParticipacaoEmOficina dadosBasicosParticipacaoEmOficina;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-OFICINA")
	private DetalhamentoParticipacaoEmOficina detalhamentoParticipacaoEmOficina;
	
	@ElementCollection
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	private List<ParticipanteEventosCongressos> participanteEventosCongressos;
	
	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@Embedded
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@Embedded
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeqeuenciaProducao() {
		return seqeuenciaProducao;
	}

	public void setSeqeuenciaProducao(String seqeuenciaProducao) {
		this.seqeuenciaProducao = seqeuenciaProducao;
	}

	public DadosBasicosParticipacaoEmOficina getDadosBasicosParticipacaoEmOficina() {
		return dadosBasicosParticipacaoEmOficina;
	}

	public void setDadosBasicosParticipacaoEmOficina(DadosBasicosParticipacaoEmOficina dadosBasicosParticipacaoEmOficina) {
		this.dadosBasicosParticipacaoEmOficina = dadosBasicosParticipacaoEmOficina;
	}

	public DetalhamentoParticipacaoEmOficina getDetalhamentoParticipacaoEmOficina() {
		return detalhamentoParticipacaoEmOficina;
	}

	public void setDetalhamentoParticipacaoEmOficina(DetalhamentoParticipacaoEmOficina detalhamentoParticipacaoEmOficina) {
		this.detalhamentoParticipacaoEmOficina = detalhamentoParticipacaoEmOficina;
	}

	public List<ParticipanteEventosCongressos> getParticipanteEventosCongressos() {
		return participanteEventosCongressos;
	}

	public void setParticipanteEventosCongressos(List<ParticipanteEventosCongressos> participanteEventosCongressos) {
		this.participanteEventosCongressos = participanteEventosCongressos;
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

	public InformacoesAdicionais getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}
}
