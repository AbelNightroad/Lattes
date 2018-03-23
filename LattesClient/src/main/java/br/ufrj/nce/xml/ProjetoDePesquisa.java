package br.ufrj.nce.xml;

import java.time.LocalDate;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("PROJETO-DE-PESQUISA")
public class ProjetoDePesquisa {

	@XStreamAlias("SEQUENCIA-PROJETO")
	@XStreamAsAttribute
	private String sequenciaProjeto;

	@XStreamAlias("ANO-INICIO")
	@XStreamAsAttribute
	private String anoInicio;

	@XStreamAlias("ANO-FIM")
	@XStreamAsAttribute
	private String anoFim;

	@XStreamAlias("NOME-DO-PROJETO")
	@XStreamAsAttribute
	private String nomeDoProjeto;

	@XStreamAlias("SITUACAO")
	@XStreamAsAttribute
	private String situacao;

	@XStreamAlias("NATUREZA")
	@XStreamAsAttribute
	private String natureza;

	@XStreamAlias("NUMERO-GRADUACAO")
	@XStreamAsAttribute
	private String numeroGraduacao;

	@XStreamAlias("NUMERO-ESPECIALIZACAO")
	@XStreamAsAttribute
	private String numeroEspecializacao;

	@XStreamAlias("NUMERO-MESTRADO-ACADEMICO")
	@XStreamAsAttribute
	private String numeroMestradoAcademico;

	@XStreamAlias("NUMERO-MESTRADO-PROF")
	@XStreamAsAttribute
	private String numeroMestradoProf;

	@XStreamAlias("NUMERO-DOUTORADO")
	@XStreamAsAttribute
	private String numeroDoutorado;

	@XStreamAlias("DESCRICAO-DO-PROJETO")
	@XStreamAsAttribute
	private String descricaoDoProjeto;
	
	@XStreamAlias("IDENTIFICADOR-PROJETO")
	@XStreamAsAttribute
	private String identificadorProjeto;

	@XStreamAlias("DESCRICAO-DO-PROJETO-INGLES")
	@XStreamAsAttribute
	private String descricaoDoProjetoIngles;

	@XStreamAlias("NOME-DO-PROJETO-INGLES")
	@XStreamAsAttribute
	private String nomeDoProjetoIngles;

	@XStreamAlias("FLAG-POTENCIAL-INOVACAO")
	@XStreamAsAttribute
	private String flagPotencialInovacao;
	
	@XStreamAlias("FLAG-PROJETO-CERTIFICADO")
	@XStreamAsAttribute
	private String flagProjetoCertificado;
	
	@XStreamAlias("NOME-COORDENADOR-CERTIFICACAO")
	@XStreamAsAttribute
	private String nomeCoordenadorCertificacao;
	
	@XStreamAlias("FORMATO-DATA-CERTIFICACAO")
	@XStreamAsAttribute
	private String formatoDataCertificacao;
	
	@XStreamAlias("DATA-CERTIFICAO")
	@XStreamAsAttribute
	private LocalDate dataCertificacao;
	
	@XStreamAlias("NUMERO_TECNICO_NIVEL_MEDIO")
	@XStreamAsAttribute
	private String numeroTecnicoNivelMedio;
	
	@XStreamAlias("EQUIPE-DO-PROJETO")
	private List<IntegranteDoProjeto> integrantesDoProjeto;

	@XStreamAlias("FINANCIADORES-DO-PROJETO")
	private List<FinanciadorDoProjeto> financiadoresDoProjeto;

	@XStreamAlias("PRODUCOES-CT-DO-PROJETO")
	private List<ProducaoCtDoProjeto> producoesCtDoProjeto;

	@XStreamAlias("ORIENTACOES")
	private List<Orientacao> orientacoes;

	public String getSequenciaProjeto() {
		return sequenciaProjeto;
	}

	public void setSequenciaProjeto(String sequenciaProjeto) {
		this.sequenciaProjeto = sequenciaProjeto;
	}

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}

	public String getNomeDoProjeto() {
		return nomeDoProjeto;
	}

	public void setNomeDoProjeto(String nomeDoProjeto) {
		this.nomeDoProjeto = nomeDoProjeto;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getNumeroGraduacao() {
		return numeroGraduacao;
	}

	public void setNumeroGraduacao(String numeroGraduacao) {
		this.numeroGraduacao = numeroGraduacao;
	}

	public String getNumeroEspecializacao() {
		return numeroEspecializacao;
	}

	public void setNumeroEspecializacao(String numeroEspecializacao) {
		this.numeroEspecializacao = numeroEspecializacao;
	}

	public String getNumeroMestradoAcademico() {
		return numeroMestradoAcademico;
	}

	public void setNumeroMestradoAcademico(String numeroMestradoAcademico) {
		this.numeroMestradoAcademico = numeroMestradoAcademico;
	}

	public String getNumeroMestradoProf() {
		return numeroMestradoProf;
	}

	public void setNumeroMestradoProf(String numeroMestradoProf) {
		this.numeroMestradoProf = numeroMestradoProf;
	}

	public String getNumeroDoutorado() {
		return numeroDoutorado;
	}

	public void setNumeroDoutorado(String numeroDoutorado) {
		this.numeroDoutorado = numeroDoutorado;
	}

	public String getDescricaoDoProjeto() {
		return descricaoDoProjeto;
	}

	public void setDescricaoDoProjeto(String descricaoDoProjeto) {
		this.descricaoDoProjeto = descricaoDoProjeto;
	}

	public String getIdentificadorProjeto() {
		return identificadorProjeto;
	}

	public void setIdentificadorProjeto(String identificadorProjeto) {
		this.identificadorProjeto = identificadorProjeto;
	}

	public String getDescricaoDoProjetoIngles() {
		return descricaoDoProjetoIngles;
	}

	public void setDescricaoDoProjetoIngles(String descricaoDoProjetoIngles) {
		this.descricaoDoProjetoIngles = descricaoDoProjetoIngles;
	}

	public String getNomeDoProjetoIngles() {
		return nomeDoProjetoIngles;
	}

	public void setNomeDoProjetoIngles(String nomeDoProjetoIngles) {
		this.nomeDoProjetoIngles = nomeDoProjetoIngles;
	}

	public String getFlagPotencialInovacao() {
		return flagPotencialInovacao;
	}

	public void setFlagPotencialInovacao(String flagPotencialInovacao) {
		this.flagPotencialInovacao = flagPotencialInovacao;
	}

	public String getFlagProjetoCertificado() {
		return flagProjetoCertificado;
	}

	public void setFlagProjetoCertificado(String flagProjetoCertificado) {
		this.flagProjetoCertificado = flagProjetoCertificado;
	}

	public String getNomeCoordenadorCertificacao() {
		return nomeCoordenadorCertificacao;
	}

	public void setNomeCoordenadorCertificacao(String nomeCoordenadorCertificacao) {
		this.nomeCoordenadorCertificacao = nomeCoordenadorCertificacao;
	}

	public String getFormatoDataCertificacao() {
		return formatoDataCertificacao;
	}

	public void setFormatoDataCertificacao(String formatoDataCertificacao) {
		this.formatoDataCertificacao = formatoDataCertificacao;
	}

	public LocalDate getDataCertificacao() {
		return dataCertificacao;
	}

	public void setDataCertificacao(LocalDate dataCertificacao) {
		this.dataCertificacao = dataCertificacao;
	}

	public String getNumeroTecnicoNivelMedio() {
		return numeroTecnicoNivelMedio;
	}

	public void setNumeroTecnicoNivelMedio(String numeroTecnicoNivelMedio) {
		this.numeroTecnicoNivelMedio = numeroTecnicoNivelMedio;
	}

	public List<IntegranteDoProjeto> getIntegrantesDoProjeto() {
		return integrantesDoProjeto;
	}

	public void setIntegrantesDoProjeto(List<IntegranteDoProjeto> integrantesDoProjeto) {
		this.integrantesDoProjeto = integrantesDoProjeto;
	}

	public List<FinanciadorDoProjeto> getFinanciadoresDoProjeto() {
		return financiadoresDoProjeto;
	}

	public void setFinanciadoresDoProjeto(List<FinanciadorDoProjeto> financiadoresDoProjeto) {
		this.financiadoresDoProjeto = financiadoresDoProjeto;
	}

	public List<ProducaoCtDoProjeto> getProducoesCtDoProjeto() {
		return producoesCtDoProjeto;
	}

	public void setProducoesCtDoProjeto(List<ProducaoCtDoProjeto> producoesCtDoProjeto) {
		this.producoesCtDoProjeto = producoesCtDoProjeto;
	}

	public List<Orientacao> getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(List<Orientacao> orientacoes) {
		this.orientacoes = orientacoes;
	}

}
