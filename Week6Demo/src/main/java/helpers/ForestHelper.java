/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 27, 2023
 */
package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import models.Forest;
import models.Tree;

/**
 * @author lscha
 *
 */
public class ForestHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Week6Demo");
	
	public void persist(Forest model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Forest model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Tree.class, model.getForestId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Forest> showAllForests() {
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery("SELECT i FROM forest i");
		List<Forest> allItems = q.getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(Forest model) {
		EntityManager manager = factory.createEntityManager();
		Forest dbEntity = manager.find(Forest.class, model.getForestId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setLocation(model.getLocation());
		manager.getTransaction().commit();
		manager.close();
		
	}

	public Forest searchForestByName(String name) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Forest> query = manager.createQuery("SELECT i FROM forest AS i WHERE i.name = :name", Forest.class);
		query.setParameter("name", name);
		Forest dbEntity = query.getSingleResult();
		return dbEntity;
	}

}
