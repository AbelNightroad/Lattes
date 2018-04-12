package br.ufrj.nce.xml;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("AREAS-DO-CONHECIMENTO")
public class AreasDoConhecimento {

	@Embedded
	@XStreamAlias("AREA-DO-CONHECIMENTO-1")
	private AreaDoConhecimento areaDoConhecimento1;

	@Embedded
	@XStreamAlias("AREA-DO-CONHECIMENTO-2")
	private AreaDoConhecimento areaDoConhecimento2;

	@Embedded
	@XStreamAlias("AREA-DO-CONHECIMENTO-3")
	private AreaDoConhecimento areaDoConhecimento3;

	public AreaDoConhecimento getAreaDoConhecimento1() {
		return areaDoConhecimento1;
	}

	public void setAreaDoConhecimento1(AreaDoConhecimento areaDoConhecimento1) {
		this.areaDoConhecimento1 = areaDoConhecimento1;
	}

	public AreaDoConhecimento getAreaDoConhecimento2() {
		return areaDoConhecimento2;
	}

	public void setAreaDoConhecimento2(AreaDoConhecimento areaDoConhecimento2) {
		this.areaDoConhecimento2 = areaDoConhecimento2;
	}

	public AreaDoConhecimento getAreaDoConhecimento3() {
		return areaDoConhecimento3;
	}

	public void setAreaDoConhecimento3(AreaDoConhecimento areaDoConhecimento3) {
		this.areaDoConhecimento3 = areaDoConhecimento3;
	}
}
