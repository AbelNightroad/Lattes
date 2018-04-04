package br.ufrj.nce.xml;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Embedded
@XStreamAlias("ATUACAO-PROFISSIONAL")
public class AtuacaoProfissional {

	@XStreamAlias("CODIGO-INSTITUICAO")
	@XStreamAsAttribute
	private String codigoInstituicao;

	@XStreamAlias("NOME-INSTITUICAO")
	@XStreamAsAttribute
	private String nomeInstituicao;

	@XStreamAlias("SEQUENCIA-ATIVIDADE")
	@XStreamAsAttribute
	private String sequenciaAtividade;

	@XStreamAlias("SEQUENCIA-IMPORTANCIA")
	@XStreamAsAttribute
	private String sequenciaImportancia;

	@Embedded
	@XStreamImplicit(itemFieldName = "VINCULOS")
	private List<Vinculo> vinculos;

	@Embedded
	@XStreamAlias("ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO")
	private List<AtividadeDeDirecaoEAdministracao> atividadesDeDirecaoEAdministracao;;

	@Embedded
	@XStreamAlias("ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
	private List<AtividadeDePesquisaEDesenvolvimento> atividadesDePesquisaEDesenvolvimento;

	@Embedded
	@XStreamAlias("ATIVIDADES-DE-ENSINO")
	private List<AtividadeDeEnsino> atividadesDeEnsino;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-ESTAGIO")
	private List<AtividadeDeEstagio> atividadesDeEstagio;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-SERVICO-TECNICO-ESPECIALIZADO")
	private List<AtividadeDeServicoTecnicoEspecializado> atividadesDeServicoTecnicoEspecializado;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-EXTENSAO-UNIVERSITARIA")
	private List<AtividadeExtensaoUniversitaria> atividadesExtensaoUniversitaria;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-TREINAMENTO-MINISTRADO")
	private List<AtividadeTreinamentoMinistrado> atividadesTreinamentoMinistrado;
	
	@Embedded
	@XStreamAlias("OUTRAS-ATIVIDADES-TECNICO-CIENTIFICA")
	private List<OutraAtividadeTecnicoCientifica> outrasAtividadesTecnicoCientificas;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-CONSELHO-COMISSAO-E-CONSULTORIA")
	private List<AtividadeConselhoComissaoConsultoria> atividadesConselhoComissaoConsultoria;
	
	@Embedded
	@XStreamAlias("ATIVIDADES-DE-PARTICIPACAO-EM-PROJETO")
	private List<AtividadeDeParticipacaoEmProjeto> atividadesDeParticipacaoEmProjeto;

	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}

	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getSequenciaAtividade() {
		return sequenciaAtividade;
	}

	public void setSequenciaAtividade(String sequenciaAtividade) {
		this.sequenciaAtividade = sequenciaAtividade;
	}

	public String getSequenciaImportancia() {
		return sequenciaImportancia;
	}

	public void setSequenciaImportancia(String sequenciaImportancia) {
		this.sequenciaImportancia = sequenciaImportancia;
	}

	public List<Vinculo> getVinculos() {
		return vinculos;
	}

	public void setVinculos(List<Vinculo> vinculos) {
		this.vinculos = vinculos;
	}

	public List<AtividadeDeDirecaoEAdministracao> getAtividadesDeDirecaoEAdministracao() {
		return atividadesDeDirecaoEAdministracao;
	}

	public void setAtividadesDeDirecaoEAdministracao(
			List<AtividadeDeDirecaoEAdministracao> atividadesDeDirecaoEAdministracao) {
		this.atividadesDeDirecaoEAdministracao = atividadesDeDirecaoEAdministracao;
	}

	public List<AtividadeDePesquisaEDesenvolvimento> getAtividadesDePesquisaEDesenvolvimento() {
		return atividadesDePesquisaEDesenvolvimento;
	}

	public void setAtividadesDePesquisaEDesenvolvimento(
			List<AtividadeDePesquisaEDesenvolvimento> atividadesDePesquisaEDesenvolvimento) {
		this.atividadesDePesquisaEDesenvolvimento = atividadesDePesquisaEDesenvolvimento;
	}

	public List<AtividadeDeEnsino> getAtividadesDeEnsino() {
		return atividadesDeEnsino;
	}

	public void setAtividadesDeEnsino(List<AtividadeDeEnsino> atividadesDeEnsino) {
		this.atividadesDeEnsino = atividadesDeEnsino;
	}

	public List<AtividadeDeEstagio> getAtividadesDeEstagio() {
		return atividadesDeEstagio;
	}

	public void setAtividadesDeEstagio(List<AtividadeDeEstagio> atividadesDeEstagio) {
		this.atividadesDeEstagio = atividadesDeEstagio;
	}

	public List<AtividadeDeServicoTecnicoEspecializado> getAtividadesDeServicoTecnicoEspecializado() {
		return atividadesDeServicoTecnicoEspecializado;
	}

	public void setAtividadesDeServicoTecnicoEspecializado(
			List<AtividadeDeServicoTecnicoEspecializado> atividadesDeServicoTecnicoEspecializado) {
		this.atividadesDeServicoTecnicoEspecializado = atividadesDeServicoTecnicoEspecializado;
	}

	public List<AtividadeExtensaoUniversitaria> getAtividadesExtensaoUniversitaria() {
		return atividadesExtensaoUniversitaria;
	}

	public void setAtividadesExtensaoUniversitaria(List<AtividadeExtensaoUniversitaria> atividadesExtensaoUniversitaria) {
		this.atividadesExtensaoUniversitaria = atividadesExtensaoUniversitaria;
	}

	public List<AtividadeTreinamentoMinistrado> getAtividadesTreinamentoMinistrado() {
		return atividadesTreinamentoMinistrado;
	}

	public void setAtividadesTreinamentoMinistrado(List<AtividadeTreinamentoMinistrado> atividadesTreinamentoMinistrado) {
		this.atividadesTreinamentoMinistrado = atividadesTreinamentoMinistrado;
	}

	public List<OutraAtividadeTecnicoCientifica> getOutrasAtividadesTecnicoCientificas() {
		return outrasAtividadesTecnicoCientificas;
	}

	public void setOutrasAtividadesTecnicoCientificas(
			List<OutraAtividadeTecnicoCientifica> outrasAtividadesTecnicoCientificas) {
		this.outrasAtividadesTecnicoCientificas = outrasAtividadesTecnicoCientificas;
	}

	public List<AtividadeConselhoComissaoConsultoria> getAtividadesConselhoComissaoConsultoria() {
		return atividadesConselhoComissaoConsultoria;
	}

	public void setAtividadesConselhoComissaoConsultoria(
			List<AtividadeConselhoComissaoConsultoria> atividadesConselhoComissaoConsultoria) {
		this.atividadesConselhoComissaoConsultoria = atividadesConselhoComissaoConsultoria;
	}

	public List<AtividadeDeParticipacaoEmProjeto> getAtividadesDeParticipacaoEmProjeto() {
		return atividadesDeParticipacaoEmProjeto;
	}

	public void setAtividadesDeParticipacaoEmProjeto(
			List<AtividadeDeParticipacaoEmProjeto> atividadesDeParticipacaoEmProjeto) {
		this.atividadesDeParticipacaoEmProjeto = atividadesDeParticipacaoEmProjeto;
	}

}