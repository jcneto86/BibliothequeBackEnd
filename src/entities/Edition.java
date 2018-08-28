package entities;

public class Edition {

    private int id_edition; // INT NOT NULL AUTO_INCREMENT,
    private int id_maison_edition; // INT NOT NULL,
    private int id_oeuvre_litteraire; // INT NOT NULL,
    private int annee; /// INT NOT NULL,
    private String edition; // VARCHAR(45) NOT NULL,
    private int nb_pages; // INT NOT NULL,
    private String isbn; // VARCHAR(45) NOT NULL,
    private String description; // VARCHAR(45) NOT NULL,
    private byte rarete; // BINARY(1) NOT NULL,
	@Override
	public String toString() {
		return "Edition [id_edition=" + id_edition + ", id_maison_edition=" + id_maison_edition
				+ ", id_oeuvre_litteraire=" + id_oeuvre_litteraire + ", annee=" + annee + ", edition=" + edition
				+ ", nb_pages=" + nb_pages + ", isbn=" + isbn + ", description=" + description + ", rarete=" + rarete
				+ "]";
	}
	public int getId_edition() {
		return id_edition;
	}
	public void setId_edition(int id_edition) {
		this.id_edition = id_edition;
	}
	public int getId_maison_edition() {
		return id_maison_edition;
	}
	public void setId_maison_edition(int id_maison_edition) {
		this.id_maison_edition = id_maison_edition;
	}
	public int getId_oeuvre_litteraire() {
		return id_oeuvre_litteraire;
	}
	public void setId_oeuvre_litteraire(int id_oeuvre_litteraire) {
		this.id_oeuvre_litteraire = id_oeuvre_litteraire;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getNb_pages() {
		return nb_pages;
	}
	public void setNb_pages(int nb_pages) {
		this.nb_pages = nb_pages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte getRarete() {
		return rarete;
	}
	public void setRarete(byte rarete) {
		this.rarete = rarete;
	}
	
    
    

}
