package br.ufrj.nce.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ORGANIZACAO-DE-EVENTO")
public class OrganizacaoDeEvento {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@XStreamAlias("DADOS-BASICOS-DA-ORGANIZACAO-DE-EVENTO")
	private DadosBasicosDaOrganizacaoDeEvento dadosBasicosDaOrganizacaoDeEvento;

	@XStreamAlias("DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
	private DetalhamentoDaOrganizacaoDeEvento detalhamentoDaOrganizacaoDeEvento;

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

	public DadosBasicosDaOrganizacaoDeEvento getDadosBasicosDaOrganizacaoDeEvento() {
		return dadosBasicosDaOrganizacaoDeEvento;
	}

	public void setDadosBasicosDaOrganizacaoDeEvento(DadosBasicosDaOrganizacaoDeEvento dadosBasicosDaOrganizacaoDeEvento) {
		this.dadosBasicosDaOrganizacaoDeEvento = dadosBasicosDaOrganizacaoDeEvento;
	}

	public DetalhamentoDaOrganizacaoDeEvento getDetalhamentoDaOrganizacaoDeEvento() {
		return detalhamentoDaOrganizacaoDeEvento;
	}

	public void setDetalhamentoDaOrganizacaoDeEvento(DetalhamentoDaOrganizacaoDeEvento detalhamentoDaOrganizacaoDeEvento) {
		this.detalhamentoDaOrganizacaoDeEvento = detalhamentoDaOrganizacaoDeEvento;
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
