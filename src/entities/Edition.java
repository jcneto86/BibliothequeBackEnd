package entities;

import sql.SQLClass;

import java.sql.ResultSet;

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

	public Edition() {
	}

	public Edition(int id_edition, int id_maison_edition, int id_oeuvre_litteraire, int annee, String edition, int nb_pages, String isbn, String description, byte rarete) {
		this.id_edition = id_edition;
		this.id_maison_edition = id_maison_edition;
		this.id_oeuvre_litteraire = id_oeuvre_litteraire;
		this.annee = annee;
		this.edition = edition;
		this.nb_pages = nb_pages;
		this.isbn = isbn;
		this.description = description;
		this.rarete = rarete;
	}

	public Edition getEditionById(int id) {
		Edition ed = null;
		SQLClass.connect();
		try {
			ResultSet rs = SQLClass.executeQuery("SELECT id_edition, " +
					"id_maison_edition, " +
					"id_oeuvre_litteraire, " +
					"annee, " +
					"edition, " +
					"nb_pages, " +
					"isbn, " +
					"description, " +
					"rarete\n"
					+ "FROM edition\n"
					+ "where id_edition = "+ id+ ";");
			while (rs.next()) {
				int id_edition = rs.getInt("id_edition");
				int id_maison_edition = rs.getInt("id_maison_edition");
				int id_oeuvre_litteraire = rs.getInt("id_oeuvre_litteraire");
				int annee = rs.getInt("annee");
				String edition = rs.getString("edition");
				int nb_pages = rs.getInt("nb_pages");
				String isbn = rs.getString("isbn");
				String description = rs.getString("description");
				byte rarete = rs.getByte("rarete");
				ed = new Edition(id_edition, id_maison_edition, id_oeuvre_litteraire, annee, edition, nb_pages, isbn, description, rarete);
			}
			return ed;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLClass.close();
		}
		return ed;
	}

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
