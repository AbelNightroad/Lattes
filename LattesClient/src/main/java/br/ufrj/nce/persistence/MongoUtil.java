package br.ufrj.nce.persistence;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoUtil {
	private Datastore datastore;
	private final Morphia morphia = new Morphia();
	
	public Datastore getDatastore() {
		morphia.mapPackage("br.ufrj.nce.xml");
		
		datastore = morphia.createDatastore(new MongoClient(), "Lattes");
		datastore.ensureIndexes();
		
		return datastore;
	}
}
