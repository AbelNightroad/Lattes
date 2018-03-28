package br.ufrj.nce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		ClassLoader cl = Main.class.getClassLoader();
		System.out.println(m.readFromInputStream(cl.getResourceAsStream("files/5225613952947884.xml")));
	}

	private String readFromInputStream(InputStream inputStream) {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		return resultStringBuilder.toString();
	}
}
