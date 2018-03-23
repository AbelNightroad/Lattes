package br.ufrj.nce.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class CustomXStream {
	public static XStream newCustomXStream() {
		return new XStream(new DomDriver()) {
			@Override
			protected MapperWrapper wrapMapper(MapperWrapper next) {
				return new MapperWrapper(next) {
					@Override
					@SuppressWarnings("rawtypes")
					public boolean shouldSerializeMember(Class definedIn,
							String fieldName) {
						return !Object.class.equals(definedIn)
								&& super.shouldSerializeMember(definedIn,
										fieldName);
					}
				};
			}

		};
	}

}
