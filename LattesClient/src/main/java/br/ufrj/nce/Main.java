package br.ufrj.nce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;

import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;

import br.ufrj.nce.persistence.CurriculoDAO;
import br.ufrj.nce.util.FileUtil;
import br.ufrj.nce.util.XmlUtil;
import br.ufrj.nce.xml.Curriculo;

public class Main {

	public static void main(String[] args) {
		CurriculoDAO dao = new CurriculoDAO("testeMongo");
		
		FileUtil util = new FileUtil();
		List<String> listaXML = util.listFiles("./bin/files");

		Main m = new Main();
		ClassLoader cl = Main.class.getClassLoader();
		
		TransactionManager tm = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LattesClient");
		
		for (String nome : listaXML) {
			InputStream input = cl.getResourceAsStream("files/" + nome);
			
			Curriculo curriculo = XmlUtil.fromXML(m.readFromInputStream(input));

			System.out.println(curriculo.getNumeroIdentificador());
			System.out.println(curriculo.getHoraAtualizacao());
			System.out.println(curriculo.getOrigemXml());
			System.out.println(curriculo.getDadosGerais().getNomeCompleto());
			System.out.println();
			
			try {
				tm.begin();
				EntityManager em = emf.createEntityManager();
				em.persist(curriculo);
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
//			Key<Curriculo> key = dao.save(curriculo);
//			System.out.println(key);
//			System.out.println();
		}
		

//		Query<Curriculo> query = dao.createQuery();
//		query.field("dadosGerais.nomeCompleto").contains("Jos");
//		System.out.println("QUERY >> ");
//		query.asList().forEach(i -> System.out.println(i.getDadosGerais().getNomeCompleto()));
//		
//		System.out.println("--------------");
//		
//		query = dao.createQuery();
//		query.asList().stream().map(Curriculo::getDadosGerais).forEach(i -> System.out.println(i.getNomeCompleto()));
		
	}
	
	private String readFromInputStream(InputStream inputStream) {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"))) {
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
