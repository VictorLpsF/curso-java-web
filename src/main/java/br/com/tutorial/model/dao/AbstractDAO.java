package br.com.tutorial.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO {
	private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("PU-UDF");
	private EntityManager em;
	protected EntityManager getEm() {
		return EMF.createEntityManager();
	}
}
