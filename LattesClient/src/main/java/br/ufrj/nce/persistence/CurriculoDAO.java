package br.ufrj.nce.persistence;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.MongoClient;

import br.ufrj.nce.xml.Curriculo;

public class CurriculoDAO extends BasicDAO<Curriculo, ObjectId>{

	public CurriculoDAO(String dbName) {
		super(new MongoClient(), new Morphia(), dbName);
		this.ensureIndexes();
	}

}
