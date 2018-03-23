package br.ufrj.nce.util;

import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
	public static String readerFileAsString(InputStream input)
			throws IOException {
		StringBuilder builder = new StringBuilder(input.available());
		int b = -1;
		while ((b = input.read()) >= 0) {
			builder.append((char) b);
		}
		input.close();
		return builder.toString();
	}
}
