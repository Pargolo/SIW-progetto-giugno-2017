package galleria.model;

import java.awt.Dimension;

/**
 * La classe Quadro rappresenta un'opera d'arte.<br>
 * Un Quadro ha un titolo, l'anno di creazione, la tecnica di pittura
 * con cui è stato realizzato, le sue dimensioni e l'autore che lo ha realizzato.
 * 
 */
public class Quadro {
	private String titolo;
	private Integer anno;
	private String tecnica;
	private Dimension dimensioni;
	private Autore autore;

	public Quadro() {}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Dimension getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(Dimension dimensioni) {
		this.dimensioni = dimensioni;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	@Override
	public int hashCode() {
		return this.getTitolo().hashCode() + 
				this.getAnno().hashCode() + 
				this.getTecnica().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Quadro q = (Quadro)obj;
		return this.getTitolo().equals(q.getTitolo()) &&
				this.getAnno().equals(q.getAnno()) &&
				this.getTecnica().equals(q.getTecnica());
	}

}
