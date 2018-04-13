package br.ufrj.nce.xml;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Entity
@XStreamAlias("ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
public class OrientacaoConcluidaParaPosDoutorado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;

	@Embedded
	@XStreamAlias("DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private DadosBasicosOrientacaoConcluidaParaPosDoutorado dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	
	@Embedded
	@XStreamAlias("DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	private DetalhamentoOrientacaoConcluidaParaPosDoutorado detalhamentoOrientacaoConcluidaParaPosDoutorado;
	
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

	public String getSequenciaProducao() {
		return sequenciaProducao;
	}

	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}

	public DadosBasicosOrientacaoConcluidaParaPosDoutorado getDadosBasicosOrientacaoConcluidaParaPosDoutorado() {
		return dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	}

	public void setDadosBasicosOrientacaoConcluidaParaPosDoutorado(
			DadosBasicosOrientacaoConcluidaParaPosDoutorado dadosBasicosOrientacaoConcluidaParaPosDoutorado) {
		this.dadosBasicosOrientacaoConcluidaParaPosDoutorado = dadosBasicosOrientacaoConcluidaParaPosDoutorado;
	}

	public DetalhamentoOrientacaoConcluidaParaPosDoutorado getDetalhamentoOrientacaoConcluidaParaPosDoutorado() {
		return detalhamentoOrientacaoConcluidaParaPosDoutorado;
	}

	public void setDetalhamentoOrientacaoConcluidaParaPosDoutorado(
			DetalhamentoOrientacaoConcluidaParaPosDoutorado detalhamentoOrientacaoConcluidaParaPosDoutorado) {
		this.detalhamentoOrientacaoConcluidaParaPosDoutorado = detalhamentoOrientacaoConcluidaParaPosDoutorado;
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
