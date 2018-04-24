package br.ufrj.nce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Status;
import javax.transaction.TransactionManager;

import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;

import br.ufrj.nce.persistence.CurriculoDAO;
import br.ufrj.nce.util.FileUtil;
import br.ufrj.nce.util.XmlUtil;
import br.ufrj.nce.xml.Curriculo;

public class Main {

	public static void main(String[] args) {
		//CurriculoDAO dao = new CurriculoDAO("testeMongo");
		TransactionManager tm = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LattesClient");
		
		FileUtil util = new FileUtil();
		List<String> listaXML = util.listFiles("./bin/files");
		String nome = "files/" + listaXML.get(2);
		
		Main m = new Main();
		ClassLoader cl = Main.class.getClassLoader();

		InputStream input = cl.getResourceAsStream(nome);
		
		Curriculo c = XmlUtil.fromXML(m.readFromInputStream(input));
		System.out.println(c.getNumeroIdentificador());
		System.out.println(c.getHoraAtualizacao());
		System.out.println(c.getOrigemXml());
		System.out.println(c.getDadosGerais().getNomeCompleto());
		System.out.println();
		
		try {
			tm.begin();
			EntityManager em = emf.createEntityManager();
			em.persist(c);
			
			System.out.println(c.getId());
			
			em.flush();
			em.close();
			
			tm.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		for (String nome : listaXML) {
//			
//			InputStream input = cl.getResourceAsStream("files/" + nome);
//			
//			Curriculo curriculo = XmlUtil.fromXML(m.readFromInputStream(input));
//
//			System.out.println(curriculo.getNumeroIdentificador());
//			System.out.println(curriculo.getHoraAtualizacao());
//			System.out.println(curriculo.getOrigemXml());
//			System.out.println(curriculo.getDadosGerais().getNomeCompleto());
//			System.out.println();
//			
//			try {
//				int tmStatus = tm.getStatus();
//				
//				if (tmStatus == Status.STATUS_MARKED_ROLLBACK || tmStatus == Status.STATUS_ROLLEDBACK) tm.rollback();
//				
//				tm.begin();
//				EntityManager em = emf.createEntityManager();
//				
//				em.persist(curriculo);
//				System.out.println(curriculo.getId());
//				
//				em.flush();
//				em.close();
//				
//				tm.commit();
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
////			Key<Curriculo> key = dao.save(curriculo);
////			System.out.println(key);
////			System.out.println();
//		}
		

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
	
	private void salvar(Curriculo curriculo) {
		
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
