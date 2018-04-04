package br.ufrj.nce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.mongodb.morphia.Key;

import com.thoughtworks.xstream.XStream;

import br.ufrj.nce.persistence.CurriculoDAO;
import br.ufrj.nce.util.CustomXStream;
import br.ufrj.nce.util.XmlUtil;
import br.ufrj.nce.xml.Curriculo;

public class Main {

	public static void main(String[] args) {
//		CurriculoDAO dao = new CurriculoDAO("testeMongo");
		
		Main m = new Main();
		ClassLoader cl = Main.class.getClassLoader();
		InputStream input = cl.getResourceAsStream("files/5225613952947884.xml");
		
		Curriculo curriculo = XmlUtil.fromXML(m.readFromInputStream(input));
		
		System.out.println(curriculo.getNumeroIdentificador());
		System.out.println(curriculo.getHoraAtualizacao());
		System.out.println(curriculo.getOrigemXml());

//		Key<Curriculo> key = dao.save(curriculo);
//		System.out.println(key);
		
		input = cl.getResourceAsStream("files/5378961528259963.xml");
		
		curriculo = XmlUtil.fromXML(m.readFromInputStream(input));
		
		System.out.println(curriculo.getNumeroIdentificador());
		System.out.println(curriculo.getHoraAtualizacao());
		System.out.println(curriculo.getOrigemXml());		
		
//		key = dao.save(curriculo);
//		System.out.println(key);
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
