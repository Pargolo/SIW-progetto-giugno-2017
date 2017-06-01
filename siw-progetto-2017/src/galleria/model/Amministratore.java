package galleria.model;

/**
 * La classe Amministratore rappresenta un super utente che possiede
 * diritti di amministrazione sulle operazioni disponibili.
 *
 */
public class Amministratore {
	private String email;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	
	public Amministratore() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	@Override
	public int hashCode() {
		return this.getEmail().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Amministratore a = (Amministratore)obj;
		return this.getEmail().equalsIgnoreCase(a.getEmail());
	}

}
