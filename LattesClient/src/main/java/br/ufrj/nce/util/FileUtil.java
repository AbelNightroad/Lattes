package br.ufrj.nce.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public List<String> listFiles(String path) {
		List<String> result = new ArrayList<>();
		File directory = new File(path);
		
		if (directory.exists()) {
			File[] lista = directory.listFiles();
			Stream<File> stream = Arrays.stream(lista);
			result = stream.filter(file -> file.getName().endsWith(".xml")).map(File::getName).collect(Collectors.toList());
		}
	
		return result;
	}
}
