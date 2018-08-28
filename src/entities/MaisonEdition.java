package entities;

public class MaisonEdition {

    private int id_maison_edition; // INT NOT NULL AUTO_INCREMENT,
    private String nom; // VARCHAR(45) NULL,
    
    
    
	public MaisonEdition(int id_maison_edition, String nom) {
		super();
		this.id_maison_edition = id_maison_edition;
		this.nom = nom;
	}



	public int getId_maison_edition() {
		return id_maison_edition;
	}



	public void setId_maison_edition(int id_maison_edition) {
		this.id_maison_edition = id_maison_edition;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "MaisonEdition [id_maison_edition=" + id_maison_edition + ", nom=" + nom + "]";
	}
    
    

}
