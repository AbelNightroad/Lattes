package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("CURSO-DE-CURTA-DURACAO-MINISTRADO")
public class CursoCurtaDuracaoMinistrado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@Embedded
	@XStreamAlias("DADOS-BASICOS-DO-CURSO-DE-CURTA-DURACAO-MINISTRADO")
	private DadosBasicosCursoCurtaDuracaoMinistrado dadosBasicosCursoCurtaDuracaoMinistrado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DO-CURSO-DE-CURTA-DURACAO-MINISTRADO")
	private DetalhamentoCursoCurtaDuracaoMinistrado detalhamentoCursoCurtaDuracaoMinistrado;
	
	@Embedded
	@XStreamImplicit(itemFieldName = "AUTORES")
	private List<Autor> autores;
	
	@Embedded
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@Embedded
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreaDoConhecimento areaDoConhecimento;
	
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

	public DadosBasicosCursoCurtaDuracaoMinistrado getDadosBasicosCursoCurtaDuracaoMinistrado() {
		return dadosBasicosCursoCurtaDuracaoMinistrado;
	}

	public void setDadosBasicosCursoCurtaDuracaoMinistrado(
			DadosBasicosCursoCurtaDuracaoMinistrado dadosBasicosCursoCurtaDuracaoMinistrado) {
		this.dadosBasicosCursoCurtaDuracaoMinistrado = dadosBasicosCursoCurtaDuracaoMinistrado;
	}

	public DetalhamentoCursoCurtaDuracaoMinistrado getDetalhamentoCursoCurtaDuracaoMinistrado() {
		return detalhamentoCursoCurtaDuracaoMinistrado;
	}

	public void setDetalhamentoCursoCurtaDuracaoMinistrado(
			DetalhamentoCursoCurtaDuracaoMinistrado detalhamentoCursoCurtaDuracaoMinistrado) {
		this.detalhamentoCursoCurtaDuracaoMinistrado = detalhamentoCursoCurtaDuracaoMinistrado;
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

	public AreaDoConhecimento getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public void setAreaDoConhecimento(AreaDoConhecimento areaDoConhecimento) {
		this.areaDoConhecimento = areaDoConhecimento;
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
