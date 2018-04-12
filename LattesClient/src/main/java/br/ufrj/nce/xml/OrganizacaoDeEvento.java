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
@XStreamAlias("ORGANIZACAO-DE-EVENTO")
public class OrganizacaoDeEvento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DA-ORGANIZACAO-DE-EVENTO")
	private DadosBasicosDaOrganizacaoDeEvento dadosBasicosDaOrganizacaoDeEvento;

	@Embedded
	@XStreamAlias("DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
	private DetalhamentoDaOrganizacaoDeEvento detalhamentoDaOrganizacaoDeEvento;

	@ElementCollection
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
