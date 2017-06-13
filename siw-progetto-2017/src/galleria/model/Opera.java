package galleria.model;

import java.awt.Dimension;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * La classe Opera rappresenta un'opera d'arte.<br>
 * Un'Opera ha un titolo, l'anno di creazione, la tecnica di 
 * realizzazione, le sue dimensioni e l'autore che lo ha realizzato.
 * 
 */
@Entity
public class Opera {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String titolo;
	
	@Column(nullable=false)
	private Integer anno;
	
	@Column(nullable=false)
	private String tecnica;
	
	@Column(nullable=false)
	private Dimension dimensioni;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Autore autore;

	public Opera() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

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
	
	public void setDimensioni(int altezza, int larghezza) {
		this.dimensioni.setSize(altezza, larghezza);
	}
	
	public int getAltezza() {
		return dimensioni.height;
	}
	
	public void setAltezza(int altezza) {
		this.dimensioni.height = altezza;
	}
	
	public int getLarghezza() {
		return dimensioni.width;
	}
	
	public void setLarghezza(int larghezza) {
		this.dimensioni.width = larghezza;
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
