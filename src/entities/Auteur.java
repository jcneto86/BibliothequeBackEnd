package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class Auteur {

    private int id_auteur; //INT NOT NULL AUTO_INCREMENT,
    private String nomAuteur; // VARCHAR(45) NULL,

	public Auteur() {
	}

	public Auteur(int id_auteur, String nomAuteur) {
		this.id_auteur = id_auteur;
		this.nomAuteur = nomAuteur;
	}

	public Auteur getAuteurById(int id) {
		Auteur auteur = null;
		SQLClass.connect();
		try {
			ResultSet rs = SQLClass.executeQuery("SELECT id_auteur, nomAuteur  \n"
					+ "FROM auteur\n" + "where id_auteur = "+ id+ ";");
			while (rs.next()) {
				int id_auteur =  rs.getInt("id_auteur");
				String nomAuteur = rs.getString("nomAuteur");
				auteur = new Auteur(id_auteur, nomAuteur);
			}
			return auteur;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLClass.close();
		}
		return auteur;
	}
    
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
