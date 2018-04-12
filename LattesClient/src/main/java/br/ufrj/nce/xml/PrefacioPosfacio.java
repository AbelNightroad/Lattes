package br.ufrj.nce.xml;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embeddable
@XStreamAlias("PREFACIO-POSFACIO")
public class PrefacioPosfacio {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DO-PREFACIO-POSFACIO")
	private DadosBasicosPrefacioPosfacio dadosBasicosPrefacioPosfacio;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DO-PREFACIO-POSFACIO")
	private DetalhamentoPrefacioPosfacio detalhamentoPrefacioPosfacio;
	
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

	public DadosBasicosPrefacioPosfacio getDadosBasicosPrefacioPosfacio() {
		return dadosBasicosPrefacioPosfacio;
	}

	public void setDadosBasicosPrefacioPosfacio(DadosBasicosPrefacioPosfacio dadosBasicosPrefacioPosfacio) {
		this.dadosBasicosPrefacioPosfacio = dadosBasicosPrefacioPosfacio;
	}

	public DetalhamentoPrefacioPosfacio getDetalhamentoPrefacioPosfacio() {
		return detalhamentoPrefacioPosfacio;
	}

	public void setDetalhamentoPrefacioPosfacio(DetalhamentoPrefacioPosfacio detalhamentoPrefacioPosfacio) {
		this.detalhamentoPrefacioPosfacio = detalhamentoPrefacioPosfacio;
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
