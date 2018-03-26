package br.ufrj.nce.xml;

import java.time.LocalDate;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DADOS-GERAIS")
public class DadosGerais {

	@XStreamAlias("NOME-COMPLETO")
	@XStreamAsAttribute
	private String nomeCompleto;

	@XStreamAlias("NOME-EM-CITACOES-BIBLIOGRAFICAS")
	@XStreamAsAttribute
	private String nomeCitacoesBibliograficas;

	@XStreamAlias("NACIONALIDADE")
	@XStreamAsAttribute
	private String nacionalidade;
	
	@XStreamAlias("CPF")
	@XStreamAsAttribute
	private String CPF;
	
	@XStreamAlias("NUMERO-DO-PASSAPORTE")
	@XStreamAsAttribute
	private String numeroPassaporte;

	@XStreamAlias("PAIS-DE-NASCIMENTO")
	@XStreamAsAttribute
	private String paisNascimento;

	@XStreamAlias("UF-NASCIMENTO")
	@XStreamAsAttribute
	private String ufNascimento;

	@XStreamAlias("CIDADE-NASCIMENTO")
	@XStreamAsAttribute
	private String cidadeNascimento;
	
	@XStreamAlias("FORMATO-DATA-DE-NASCIMENTO")
	@XStreamAsAttribute
	private String formatoData;
	
	@XStreamAlias("DATA-NASCIMENTO")
	@XStreamAsAttribute
	private String dataNascimento;
	
	@XStreamAlias("SEXO")
	@XStreamAsAttribute
	private String sexo;
	
	@XStreamAlias("NUMERO-IDENTIDADE")
	@XStreamAsAttribute
	private String numeroIdentidade;
	
	@XStreamAlias("ORGAO-EMISSOR")
	@XStreamAsAttribute
	private String orgaoEmissor;
	
	@XStreamAlias("UF-ORGAO-EMISSOR")
	@XStreamAsAttribute
	private String ufOrgaoEmissor;
	
	@XStreamAlias("FORMATO-DATA-DE-EMISSAO")
	@XStreamAsAttribute
	private String formatoDataEmissao;
	
	@XStreamAlias("DATA-DE-EMISSAO")
	@XStreamAsAttribute
	private String dataEmissao;
	
	@XStreamAlias("NOME-DO-PAI")
	@XStreamAsAttribute
	private String nomePai;
	
	@XStreamAlias("NOME-DA-MAE")
	@XStreamAsAttribute
	private String nomeMae;

	@XStreamAlias("PERMISSAO-DE-DIVULGACAO")
	@XStreamAsAttribute
	private String permissaoDivulgacao;
	
	@XStreamAlias("NOME-DO-ARQUIVO-DE-FOTO")
	@XStreamAsAttribute
	private String nomeArquivoFoto;
	
	@XStreamAlias("TEXTO-RESUMO-CV-RH")
	@XStreamAsAttribute
	private String resumoCVRH;
	
	@XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
	@XStreamAsAttribute
	private String outrasInformacoes;

	@XStreamAlias("DATA-FALECIMENTO")
	@XStreamAsAttribute
	private String dataFalecimento;

	@XStreamAlias("SIGLA-PAIS-NACIONALIDADE")
	@XStreamAsAttribute
	private String siglaPaisNacionalidade;

	@XStreamAlias("PAIS-DE-NACIONALIDADE")
	@XStreamAsAttribute
	private String paisNacionalidade;

	@XStreamAlias("RACA-OU-COR")
	@XStreamAsAttribute
	private String racaOuCor;
	
	@XStreamAlias("RESUMO-CV")
	private ResumoCV resumoCV;

	@XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
	private OutrasInformacoesRelevantes outrasInfoRelevantes;

	@XStreamAlias("ENDERECO")
	private Endereco endereco;

	@XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
	private FormacaoAcademicaTitulacao formacaoAcademicaTitulacao;

	@XStreamAlias("ATUACOES-PROFISSIONAIS")
	private List<AtuacaoProfissional> atuacoesProfissionais;

	@XStreamAlias("AREAS-DE-ATUACAO")
	private List<AreaDeAtuacao> areasDeAtuacao;

	@XStreamAlias("IDIOMAS")
	private List<Idioma> idiomas;

	@XStreamAlias("PREMIOS-TITULOS")
	private List<PremioTitulo> premiosTitulos;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeCitacoesBibliograficas() {
		return nomeCitacoesBibliograficas;
	}

	public void setNomeCitacoesBibliograficas(String nomeCitacoesBibliograficas) {
		this.nomeCitacoesBibliograficas = nomeCitacoesBibliograficas;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNumeroPassaporte() {
		return numeroPassaporte;
	}

	public void setNumeroPassaporte(String numeroPassaporte) {
		this.numeroPassaporte = numeroPassaporte;
	}

	public String getPaisNascimento() {
		return paisNascimento;
	}

	public void setPaisNascimento(String paisNascimento) {
		this.paisNascimento = paisNascimento;
	}

	public String getUfNascimento() {
		return ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public String getFormatoData() {
		return formatoData;
	}

	public void setFormatoData(String formatoData) {
		this.formatoData = formatoData;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getUfOrgaoEmissor() {
		return ufOrgaoEmissor;
	}

	public void setUfOrgaoEmissor(String ufOrgaoEmissor) {
		this.ufOrgaoEmissor = ufOrgaoEmissor;
	}

	public String getFormatoDataEmissao() {
		return formatoDataEmissao;
	}

	public void setFormatoDataEmissao(String formatoDataEmissao) {
		this.formatoDataEmissao = formatoDataEmissao;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getPermissaoDivulgacao() {
		return permissaoDivulgacao;
	}

	public void setPermissaoDivulgacao(String permissaoDivulgacao) {
		this.permissaoDivulgacao = permissaoDivulgacao;
	}

	public String getNomeArquivoFoto() {
		return nomeArquivoFoto;
	}

	public void setNomeArquivoFoto(String nomeArquivoFoto) {
		this.nomeArquivoFoto = nomeArquivoFoto;
	}

	public String getResumoCVRH() {
		return resumoCVRH;
	}

	public void setResumoCVRH(String resumoCVRH) {
		this.resumoCVRH = resumoCVRH;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public String getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public String getSiglaPaisNacionalidade() {
		return siglaPaisNacionalidade;
	}

	public void setSiglaPaisNacionalidade(String siglaPaisNacionalidade) {
		this.siglaPaisNacionalidade = siglaPaisNacionalidade;
	}

	public String getPaisNacionalidade() {
		return paisNacionalidade;
	}

	public void setPaisNacionalidade(String paisNacionalidade) {
		this.paisNacionalidade = paisNacionalidade;
	}

	public String getRacaOuCor() {
		return racaOuCor;
	}

	public void setRacaOuCor(String racaOuCor) {
		this.racaOuCor = racaOuCor;
	}

	public ResumoCV getResumoCV() {
		return resumoCV;
	}

	public void setResumoCV(ResumoCV resumoCV) {
		this.resumoCV = resumoCV;
	}

	public OutrasInformacoesRelevantes getOutrasInfoRelevantes() {
		return outrasInfoRelevantes;
	}

	public void setOutrasInfoRelevantes(OutrasInformacoesRelevantes outrasInfoRelevantes) {
		this.outrasInfoRelevantes = outrasInfoRelevantes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public FormacaoAcademicaTitulacao getFormacaoAcademicaTitulacao() {
		return formacaoAcademicaTitulacao;
	}

	public void setFormacaoAcademicaTitulacao(FormacaoAcademicaTitulacao formacaoAcademicaTitulacao) {
		this.formacaoAcademicaTitulacao = formacaoAcademicaTitulacao;
	}

	public List<AtuacaoProfissional> getAtuacoesProfissionais() {
		return atuacoesProfissionais;
	}

	public void setAtuacoesProfissionais(List<AtuacaoProfissional> atuacoesProfissionais) {
		this.atuacoesProfissionais = atuacoesProfissionais;
	}

	public List<AreaDeAtuacao> getAreasDeAtuacao() {
		return areasDeAtuacao;
	}

	public void setAreasDeAtuacao(List<AreaDeAtuacao> areasDeAtuacao) {
		this.areasDeAtuacao = areasDeAtuacao;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public List<PremioTitulo> getPremiosTitulos() {
		return premiosTitulos;
	}

	public void setPremiosTitulos(List<PremioTitulo> premiosTitulos) {
		this.premiosTitulos = premiosTitulos;
	}

}
