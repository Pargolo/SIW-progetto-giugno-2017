package galleria.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import galleria.model.Opera;
import galleria.repository.jpa.OperaRepository;

public class OperaService {
	private EntityManager em;
	private OperaRepository repository;
	
	public OperaService() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria-unit");
		this.em = emf.createEntityManager();
		this.repository = new OperaRepository(this.em);
	}
	
	public Opera insertOpera(Opera opera) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Opera operaEntity = this.repository.save(opera);
		tx.commit();
		
		return operaEntity;
	}
	
	public Opera getOneOpera(Long id) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Opera opera = this.repository.findOne(id);
		tx.commit();
		
		return opera;
	}
	
	public List<Opera> getOpere() {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		List<Opera> opere = this.repository.findAll();
		tx.commit();
		
		return opere;
	}
	
	public void removeOpera(Opera opera) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.repository.delete(opera);
		tx.commit();
	}
	
	public void removeOperaById(Long id) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Opera opera = this.repository.findOne(id);
		this.repository.delete(opera);
		tx.commit();
	}

}
