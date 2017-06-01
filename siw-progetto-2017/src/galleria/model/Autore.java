package galleria.model;

import java.util.Date;
import java.util.Set;

/**
 * La classe Autore rappresenta un autore di un opera d'arte.<br>
 * Un Autore ha un nome e un cognome, la nazionalità, la data di nascita,
 * la data di morte (la quale potrebbe essere indefinita).
 * Un Autore conosce anche tutte le opere che ha realizzato.
 *
 */
public class Autore {
	private String nome;
	private String cognome;
	private String nazionalita;
	private Date dataNascita;
	private Date dataMorte;
	private Set<Quadro> quadri;
	
	public Autore() {}

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

	public Set<Quadro> getQuadri() {
		return quadri;
	}

	public void setQuadri(Set<Quadro> quadri) {
		this.quadri = quadri;
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
		Autore a = (Autore)obj;
		return this.getNome().equals(a.getNome()) &&
				this.getCognome().equals(a.getCognome()) &&
				this.getNazionalita().equals(a.getNazionalita()) &&
				this.getDataNascita().equals(a.getDataNascita());
	}

}
