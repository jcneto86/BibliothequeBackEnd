package entities;

public class Auteur {

    private int id_auteur; //INT NOT NULL AUTO_INCREMENT,
    private String nomAuteur; // VARCHAR(45) NULL,
    
    
	public int getId_auteur() {
		return id_auteur;
	}


	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}


	public String getNomAuteur() {
		return nomAuteur;
	}


	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}


	@Override
	public String toString() {
		return "Auteur [id_auteur=" + id_auteur + ", nomAuteur=" + nomAuteur + "]";
	}

}
