package dao.base;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.AlunoDao;
import dao.CursoDao;
import dao.InstrutorDao;
import dao.MatriculaDao;
import dao.TurmaDao;

public final class DaoFactory {

	private DaoFactory() {
	}

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null)
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory("matricula-oracle");
		return entityManagerFactoryInstance;
	}	
	
}
