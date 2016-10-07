package modele;

public class Formation {
	
	// Identifiant formation (Cl� primaire)
	private Long id;
	// Th�me formation
	private String theme;

	// Constructeur
	public Formation(String pTheme) {
		super(); //C'est l'Objet la M�re 
		this.theme = pTheme;
	}
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long pId) {
		this.id = pId;
	}
	public String getTheme() {
		return theme;
	}
	
	public void setTheme(String pTheme) {
		this.theme = pTheme;		
	}

}