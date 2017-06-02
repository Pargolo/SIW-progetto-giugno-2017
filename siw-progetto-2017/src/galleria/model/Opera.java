package galleria.model;

import java.awt.Dimension;

/**
 * La classe Opera rappresenta un'opera d'arte.<br>
 * Un'Opera ha un titolo, l'anno di creazione, la tecnica di 
 * realizzazione, le sue dimensioni e l'autore che lo ha realizzato.
 * 
 */
public class Opera {
	private String titolo;
	private Integer anno;
	private String tecnica;
	private Dimension dimensioni;
	private Autore autore;

	public Opera() {}

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
		Opera opera = (Opera)obj;
		return this.getTitolo().equals(opera.getTitolo()) &&
				this.getAnno().equals(opera.getAnno()) &&
				this.getTecnica().equals(opera.getTecnica());
	}

}
