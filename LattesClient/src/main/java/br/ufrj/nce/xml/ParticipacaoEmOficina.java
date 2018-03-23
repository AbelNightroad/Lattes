package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PARTICIPACAO-EM-OFICINA")
public class ParticipacaoEmOficina {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String seqeuenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-OFICINA")
	private DadosBasicosParticipacaoEmOficina dadosBasicosParticipacaoEmOficina;
	
	@XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-OFICINA")
	private DetalhamentoParticipacaoEmOficina detalhamentoParticipacaoEmOficina;
	
	@XStreamImplicit(itemFieldName = "PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
	private List<ParticipanteEventosCongressos> participanteEventosCongressos;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

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
