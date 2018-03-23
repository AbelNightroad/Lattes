package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
public class OrientacaoAndamentoMestrado {

	@XStreamAlias("SEQUENCIA-PRODUCAO")
	@XStreamAsAttribute
	private String sequenciaProducao;
	
	@XStreamAlias("DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
	private DadosBasicosOrientacaoAndamentoMestrado dadosBasicosOrientacaoAndamentoMestrado;
	
	@XStreamAlias("DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
	private DetalhamentoOrientacaoAndamentoMestrado detalhamentoOrientacaoAndamentoMestrado;
	
	@XStreamAlias("PALAVRAS-CHAVE")
	private PalavrasChave palavrasChave;
	
	@XStreamAlias("AREAS-DO-CONHECIMENTO")
	private AreasDoConhecimento areasDoConhecimento;
	
	@XStreamAlias("SETORES-DE-ATIVIDADE")
	private SetoresDeAtividade setoresDeAtividade;
	
	@XStreamAlias("INFORMACOES-ADICIONAIS")
	private InformacoesAdicionais informacoesAdicionais;
}
