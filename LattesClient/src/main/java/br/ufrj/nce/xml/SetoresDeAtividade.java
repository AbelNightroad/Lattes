package br.ufrj.nce.xml;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@Embeddable
@XStreamAlias("SETORES-DE-ATIVIDADE")
public class SetoresDeAtividade {

	@XStreamAlias("SETOR-DE-ATIVIDADE-1")
	@XStreamAsAttribute
	private String setorDeAtividade1;

	@XStreamAlias("SETOR-DE-ATIVIDADE-2")
	@XStreamAsAttribute
	private String setorDeAtividade2;

	@XStreamAlias("SETOR-DE-ATIVIDADE-3")
	@XStreamAsAttribute
	private String setorDeAtividade3;

	public String getSetorDeAtividade1() {
		return setorDeAtividade1;
	}

	public void setSetorDeAtividade1(String setorDeAtividade1) {
		this.setorDeAtividade1 = setorDeAtividade1;
	}

	public String getSetorDeAtividade2() {
		return setorDeAtividade2;
	}

	public void setSetorDeAtividade2(String setorDeAtividade2) {
		this.setorDeAtividade2 = setorDeAtividade2;
	}

	public String getSetorDeAtividade3() {
		return setorDeAtividade3;
	}

	public void setSetorDeAtividade3(String setorDeAtividade3) {
		this.setorDeAtividade3 = setorDeAtividade3;
	}
}
