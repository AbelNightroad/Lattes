package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("APRESENTACAO-EM-RADIO-OU-TV")
public class ApresentacaoRadioTv {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-APRESENTACAO-EM-RADIO-OU-TV")
	private DadosBasicosApresentacaoRadioTv dadosBasicosApresentacaoRadioTv;
	
	@XStreamAlias("DETALHAMENTO-DA-APRESENTACAO-EM-RADIO-OU-TV")
	private DetalhamentoApresentacaoRadioTv detalhamentoApresentacaoRadioTv;
	
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
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

	public DadosBasicosApresentacaoRadioTv getDadosBasicosApresentacaoRadioTv() {
		return dadosBasicosApresentacaoRadioTv;
	}

	public void setDadosBasicosApresentacaoRadioTv(DadosBasicosApresentacaoRadioTv dadosBasicosApresentacaoRadioTv) {
		this.dadosBasicosApresentacaoRadioTv = dadosBasicosApresentacaoRadioTv;
	}

	public DetalhamentoApresentacaoRadioTv getDetalhamentoApresentacaoRadioTv() {
		return detalhamentoApresentacaoRadioTv;
	}

	public void setDetalhamentoApresentacaoRadioTv(DetalhamentoApresentacaoRadioTv detalhamentoApresentacaoRadioTv) {
		this.detalhamentoApresentacaoRadioTv = detalhamentoApresentacaoRadioTv;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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
