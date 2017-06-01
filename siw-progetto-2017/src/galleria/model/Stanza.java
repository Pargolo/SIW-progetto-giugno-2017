package galleria.model;

import java.util.List;

/**
 * La classe Stanza rappresenta una stanza in cui sono esposte delle opere.
 *
 */
public class Stanza {
	private String nome;
	private String descrizione;
	private List<Opera> opere;
	
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

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Stanza stanza = (Stanza)obj;
		return this.getNome().equals(stanza.getNome());
	}

}
