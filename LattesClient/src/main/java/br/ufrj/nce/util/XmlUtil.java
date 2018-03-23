package br.ufrj.nce.util;

import br.ufrj.nce.xml.Curriculo;
import br.ufrj.nce.util.CustomXStream;

import com.thoughtworks.xstream.XStream;

public class XmlUtil {
	private static final Class<?>[] XML_DTO_LATTES = { Curriculo.class };

	private static final XStream XSTREAM;
	static {
		// XSTREAM = new XStream(new DomDriver("UTF-8"));
		XSTREAM = CustomXStream.newCustomXStream();
		XSTREAM.processAnnotations(XML_DTO_LATTES);
	}

	@SuppressWarnings("unchecked")
	public static <T> T fromXML(String xml) {
		return (T) XSTREAM.fromXML(xml);
	}

	public static String toXML(Object object) {
		return XSTREAM.toXML(object);
	}
}
