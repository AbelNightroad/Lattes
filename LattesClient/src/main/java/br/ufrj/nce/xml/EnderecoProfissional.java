package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ENDERECO-PROFISSIONAL")
public class EnderecoProfissional {

	@XStreamAlias("CODIGO-INSTITUICAO-EMPRESA")
	@XStreamAsAttribute
	private String codigoInstituicaoEmpresa;

	@XStreamAlias("NOME-INSTITUICAO-EMPRESA")
	@XStreamAsAttribute
	private String nomeInstituicaoEmpresa;
	
	@XStreamAlias("CODIGO-ORGAO")
	@XStreamAsAttribute
	private String codigoOrgao;
	
	@XStreamAlias("NOME-ORGAO")
	@XStreamAsAttribute
	private String nomeOrgao;

	@XStreamAlias("CODIGO-UNIDADE")
	@XStreamAsAttribute
	private String codigoUnidade;

	@XStreamAlias("NOME-UNIDADE")
	@XStreamAsAttribute
	private String nomeUnidade;
	
	@XStreamAlias("LOGRADOURO-COMPLEMENTO")
	@XStreamAsAttribute
	private String logradouroComplemento;

	@XStreamAlias("PAIS")
	@XStreamAsAttribute
	private String pais;

	@XStreamAlias("UF")
	@XStreamAsAttribute
	private String uf;
	
	@XStreamAlias("CEP")
	@XStreamAsAttribute
	private String cep;
	
	@XStreamAlias("CIDADE")
	@XStreamAsAttribute
	private String cidade;

	@XStreamAlias("BAIRRO")
	@XStreamAsAttribute
	private String bairro;
	
	@XStreamAlias("DDD")
	@XStreamAsAttribute
	private String ddd;
	
	@XStreamAlias("TELEFONE")
	@XStreamAsAttribute
	private String telefone;
	
	@XStreamAlias("RAMAL")
	@XStreamAsAttribute
	private String ramal;
	
	@XStreamAlias("FAX")
	@XStreamAsAttribute
	private String fax;

	@XStreamAlias("CAIXA-POSTAL")
	@XStreamAsAttribute
	private String caixaPostal;

	@XStreamAlias("E-MAIL")
	@XStreamAsAttribute
	private String email;
	
	@XStreamAlias("HOME-PAGE")
	@XStreamAsAttribute
	private String homePage;

	public String getCodigoInstituicaoEmpresa() {
		return codigoInstituicaoEmpresa;
	}

	public void setCodigoInstituicaoEmpresa(String codigoInstituicaoEmpresa) {
		this.codigoInstituicaoEmpresa = codigoInstituicaoEmpresa;
	}

	public String getNomeInstituicaoEmpresa() {
		return nomeInstituicaoEmpresa;
	}

	public void setNomeInstituicaoEmpresa(String nomeInstituicaoEmpresa) {
		this.nomeInstituicaoEmpresa = nomeInstituicaoEmpresa;
	}

	public String getCodigoOrgao() {
		return codigoOrgao;
	}

	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getCodigoUnidade() {
		return codigoUnidade;
	}

	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public String getLogradouroComplemento() {
		return logradouroComplemento;
	}

	public void setLogradouroComplemento(String logradouroComplemento) {
		this.logradouroComplemento = logradouroComplemento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
}
