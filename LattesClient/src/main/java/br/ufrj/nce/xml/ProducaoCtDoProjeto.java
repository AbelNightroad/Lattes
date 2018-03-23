package br.ufrj.nce.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("PRODUCAO-CT-DO-PROJETO")
public class ProducaoCtDoProjeto {

	@XStreamAlias("SEQUENCIA-PRODUCAO-CT")
	@XStreamAsAttribute
	private String sequenciaProducaoCT;

	@XStreamAlias("TITULO-DA-PRODUCAO-CT")
	@XStreamAsAttribute
	private String tituloDaProducaoCt;

	@XStreamAlias("TIPO-PRODUCAO-CT")
	@XStreamAsAttribute
	private String tipoProducaoCt;

	@XStreamAlias("TITULO-DA-PRODUCAO-CT-INGLES")
	@XStreamAsAttribute
	private String tituloDaProducaoCtIngles;

	public String getSequenciaProducaoCT() {
		return sequenciaProducaoCT;
	}

	public void setSequenciaProducaoCT(String sequenciaProducaoCT) {
		this.sequenciaProducaoCT = sequenciaProducaoCT;
	}

	public String getTituloDaProducaoCt() {
		return tituloDaProducaoCt;
	}

	public void setTituloDaProducaoCt(String tituloDaProducaoCt) {
		this.tituloDaProducaoCt = tituloDaProducaoCt;
	}

	public String getTipoProducaoCt() {
		return tipoProducaoCt;
	}

	public void setTipoProducaoCt(String tipoProducaoCt) {
		this.tipoProducaoCt = tipoProducaoCt;
	}

	public String getTituloDaProducaoCtIngles() {
		return tituloDaProducaoCtIngles;
	}

	public void setTituloDaProducaoCtIngles(String tituloDaProducaoCtIngles) {
		this.tituloDaProducaoCtIngles = tituloDaProducaoCtIngles;
	}
}
