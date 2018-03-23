package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO")
public class OrientacaoAndamentoAperfeicoamentoEspecializacao {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao dadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao;
	
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO")
	private DetalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao detalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao getDadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao() {
		return dadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao;
	}

	public void setDadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao(
			DadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao dadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao) {
		this.dadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao = dadosBasicosOrientacaoAndamentoAperfeicoamentoEspecializacao;
	}

	public DetalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao getDetalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao() {
		return detalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao;
	}

	public void setDetalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao(
			DetalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao detalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao) {
		this.detalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao = detalhamentoOrientacaoAndamentoAperfeicoamentoEspecializacao;
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
