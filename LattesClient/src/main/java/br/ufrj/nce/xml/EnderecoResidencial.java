package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("ENDERECO-RESIDENCIAL")
public class EnderecoResidencial {
	
	@XStreamAlias("LOGRADOURO")
	@XStreamAsAttribute
	private String logradouro;
	
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
