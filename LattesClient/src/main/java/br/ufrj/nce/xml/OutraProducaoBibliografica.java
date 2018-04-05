package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("OUTRA-PRODUCAO-BIBLIOGRAFICA")
public class OutraProducaoBibliografica {
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-OUTRA-PRODUCAO")
	private DadosBasicosOutraProducao dadosBasicosOutraProducao;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-OUTRA-PRODUCAO")
	private DetalhamentoOutraProducao detalhamentoOutraProducao;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
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

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosOutraProducao getDadosBasicosOutraProducao() {
		return dadosBasicosOutraProducao;
	}

	public void setDadosBasicosOutraProducao(DadosBasicosOutraProducao dadosBasicosOutraProducao) {
		this.dadosBasicosOutraProducao = dadosBasicosOutraProducao;
	}

	public DetalhamentoOutraProducao getDetalhamentoOutraProducao() {
		return detalhamentoOutraProducao;
	}

	public void setDetalhamentoOutraProducao(DetalhamentoOutraProducao detalhamentoOutraProducao) {
		this.detalhamentoOutraProducao = detalhamentoOutraProducao;
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
