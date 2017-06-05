package galleria.repository.jpa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import galleria.repository.CrudRepository;

public class CrudRepositoryJPA<T> implements CrudRepository<T> {
	private EntityManager em;
	private Class<T> entityClass;
	
	public CrudRepositoryJPA(EntityManager em, Class<T> entityClass) {
		this.em = em;
		this.entityClass = entityClass;
	}
	
	private String getEntityClassName() {
		return this.entityClass.getSimpleName();
	}

	@Override
	public T save(T entity) {
		Method getId = null;
		T persistenceEntity = null;
		
		try {
			getId = this.entityClass.getMethod("getId");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		try {
			if (getId.invoke(entity) == null) {
				em.persist(entity);
				persistenceEntity = entity;
			} else
				persistenceEntity = em.merge(entity);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return persistenceEntity;
	}

	@Override
	public T findOne(Long id) {
		return this.em.find(this.entityClass, id);
	}

	@Override
	public List<T> findAll() {
		TypedQuery<T> query = this.em.createQuery("SELECT e FROM "+ this.getEntityClassName() +" e", this.entityClass);
		return query.getResultList();
	}

	@Override
	public void delete(T entity) {
		this.em.remove(entity);
	}

	@Override
	public void deleteAll() {
		Query query = this.em.createQuery("DELETE FROM "+ this.getEntityClassName());
		query.executeUpdate();
	}

}
