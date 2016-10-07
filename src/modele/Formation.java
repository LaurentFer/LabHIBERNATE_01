package modele;

public class Formation {
	
	// Identifiant formation (Clé primaire)
	private Long id;
	// Thème formation
	private String theme;

	// Constructeur
	public Formation(String pTheme) {
		super(); //C'est l'Objet la Mère 
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