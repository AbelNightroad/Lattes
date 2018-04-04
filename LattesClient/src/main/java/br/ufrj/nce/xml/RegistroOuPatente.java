package br.ufrj.nce.xml;

import org.mongodb.morphia.annotations.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embedded
@XStreamAlias("REGISTRO-OU-PATENTE")
public class RegistroOuPatente {

	@XStreamAlias("TIPO-PATENTE")
	@XStreamAsAttribute
	private String tipoPatente;
	
	@XStreamAlias("CODIGO-DO-REGISTRO-OU-PATENTE")
	@XStreamAsAttribute
	private String codigoRegistroPatente;
	
	@XStreamAlias("TITULO-PATENTE")
	@XStreamAsAttribute
	private String tituloPatente;
	
	@XStreamAlias("FORMATO-DATA-PEDIDO")
	@XStreamAsAttribute
	private String formatoDataPedido;
	
	@XStreamAlias("DATA-PEDIDO-DE-DEPOSITO")
	@XStreamAsAttribute
	private String dataPedidoDeposito;
	
	@XStreamAlias("DATA-DE-PEDIDO-DE-EXAME")
	@XStreamAsAttribute
	private String dataPedidoExame;
	
	@XStreamAlias("DATA-DE-CONCESSAO")
	@XStreamAsAttribute
	private String dataConcessao;
	
	@XStreamAlias("INSTITUICAO-DEPOSITO-REGISTRO")
	@XStreamAsAttribute
	private String instituicaoDepositoRegistro;
	
	@XStreamAlias("NUMERO-DEPOSITO-PCT")
	@XStreamAsAttribute
	private String numeroDepositoPct;
	
	@XStreamAlias("FORMATO-DATA-DEPOSITO-PCT")
	@XStreamAsAttribute
	private String formatoDataDepositoPct;
	
	@XStreamAlias("DATA-DEPOSITO-PCT")
	@XStreamAsAttribute
	private String dataDepositoPct;
	
	@XStreamAlias("NOME-DO-TITULAR")
	@XStreamAsAttribute
	private String nomeTitular;

	public String getTipoPatente() {
		return tipoPatente;
	}

	public void setTipoPatente(String tipoPatente) {
		this.tipoPatente = tipoPatente;
	}

	public String getCodigoRegistroPatente() {
		return codigoRegistroPatente;
	}

	public void setCodigoRegistroPatente(String codigoRegistroPatente) {
		this.codigoRegistroPatente = codigoRegistroPatente;
	}

	public String getTituloPatente() {
		return tituloPatente;
	}

	public void setTituloPatente(String tituloPatente) {
		this.tituloPatente = tituloPatente;
	}

	public String getFormatoDataPedido() {
		return formatoDataPedido;
	}

	public void setFormatoDataPedido(String formatoDataPedido) {
		this.formatoDataPedido = formatoDataPedido;
	}

	public String getDataPedidoDeposito() {
		return dataPedidoDeposito;
	}

	public void setDataPedidoDeposito(String dataPedidoDeposito) {
		this.dataPedidoDeposito = dataPedidoDeposito;
	}

	public String getDataPedidoExame() {
		return dataPedidoExame;
	}

	public void setDataPedidoExame(String dataPedidoExame) {
		this.dataPedidoExame = dataPedidoExame;
	}

	public String getDataConcessao() {
		return dataConcessao;
	}

	public void setDataConcessao(String dataConcessao) {
		this.dataConcessao = dataConcessao;
	}

	public String getInstituicaoDepositoRegistro() {
		return instituicaoDepositoRegistro;
	}

	public void setInstituicaoDepositoRegistro(String instituicaoDepositoRegistro) {
		this.instituicaoDepositoRegistro = instituicaoDepositoRegistro;
	}

	public String getNumeroDepositoPct() {
		return numeroDepositoPct;
	}

	public void setNumeroDepositoPct(String numeroDepositoPct) {
		this.numeroDepositoPct = numeroDepositoPct;
	}

	public String getFormatoDataDepositoPct() {
		return formatoDataDepositoPct;
	}

	public void setFormatoDataDepositoPct(String formatoDataDepositoPct) {
		this.formatoDataDepositoPct = formatoDataDepositoPct;
	}

	public String getDataDepositoPct() {
		return dataDepositoPct;
	}

	public void setDataDepositoPct(String dataDepositoPct) {
		this.dataDepositoPct = dataDepositoPct;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
}
