package galleria.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import galleria.model.Autore;
import galleria.persistence.jpa.AutoreRepository;

public class AutoreService {
	private EntityManager em;
	private AutoreRepository repository;
	
	public AutoreService() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria-unit");
		this.em = emf.createEntityManager();
		this.repository = new AutoreRepository(this.em);
	}
	
	public Autore insertAutore(Autore autore) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Autore autoreEntity = this.repository.save(autore);
		tx.commit();
		
		return autoreEntity;
	}
	
	public List<Autore> getAutori() {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		List<Autore> autori = this.repository.findAll();
		tx.commit();
		
		return autori;
	}
	
	public Autore getOneAutore(Long id) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Autore autore = this.repository.findOne(id);
		tx.commit();
		
		return autore;
	}
	
	public void removeAutore(Autore autore) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.repository.delete(autore);
		tx.commit();
	}
	
	public void removeAutoreByID(Long id) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Autore autore = this.repository.findOne(id);
		this.repository.delete(autore);
		tx.commit();
	}

}
