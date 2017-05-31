package galleria.model;

import java.util.List;

/**
 * La classe Stanza rappresenta una stanza in cui sono esposti dei quadri.
 *
 */
public class Stanza {
	private String nome;
	private String descrizione;
	private List<Quadro> quadri;
	
	public Stanza() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Quadro> getQuadri() {
		return quadri;
	}

	public void setQuadri(List<Quadro> quadri) {
		this.quadri = quadri;
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Stanza s = (Stanza)obj;
		return this.getNome().equals(s.getNome());
	}

}
