package galleria.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * La classe Autore rappresenta un autore di un opera d'arte.<br>
 * Un Autore ha un nome e un cognome, la nazionalità, la data di nascita,
 * la data di morte (la quale potrebbe essere indefinita).
 * Un Autore conosce anche tutte le opere che ha realizzato.
 *
 */
@Entity
public class Autore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private String nazionalita;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	
	@Temporal(TemporalType.DATE)
	private Date dataMorte;
	
	@OneToMany(mappedBy="autore", fetch=FetchType.LAZY, cascade={CascadeType.REMOVE})
	private List<Opera> opere;
	
	public Autore() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Date getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode() +
				this.getCognome().hashCode() +
				this.getNazionalita().hashCode() +
				this.getDataNascita().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Autore autore = (Autore)obj;
		return this.getNome().equals(autore.getNome()) &&
				this.getCognome().equals(autore.getCognome()) &&
				this.getNazionalita().equals(autore.getNazionalita()) &&
				this.getDataNascita().equals(autore.getDataNascita());
	}

}
