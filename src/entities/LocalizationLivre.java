package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class LocalizationLivre {

    private int id_localization_livre; // INT NOT NULL AUTO_INCREMENT,
    private String corridor; // VARCHAR(45) NOT NULL,
    private String cote; // VARCHAR(45) NOT NULL,
    private String rangee; // VARCHAR(45) NOT NULL,
    private String rayon; // VARCHAR(45) NOT NULL,
    private String position; // VARCHAR(45) NOT NULL,

	public LocalizationLivre() {
	}

	public LocalizationLivre(int id_localization_livre, String corridor, String cote, String rangee, String rayon, String position) {
		this.id_localization_livre = id_localization_livre;
		this.corridor = corridor;
		this.cote = cote;
		this.rangee = rangee;
		this.rayon = rayon;
		this.position = position;
	}

	public LocalizationLivre getLocalizationLivreById (int id) {
		LocalizationLivre localizationLivre = null;
		SQLClass.connect();
		try {
			ResultSet rs = SQLClass.executeQuery("SELECT  id_localization_livre, corridor, cote, rangee, rayon, position\n"
					+ " FROM biblioteque.localization_livre\n"
					+ " where id_localization_livre = " + id + ";");
			while (rs.next()) {
				int id_localization_livre = rs.getInt("id_localization_livre");
				String corridor = rs.getString("corridor");
				String cote = rs.getString("cote");
				String rangee = rs.getString("rangee");
				String rayon = rs.getString("rayon");
				String position = rs.getString("position");
				localizationLivre = new LocalizationLivre(id_localization_livre, corridor, cote, rangee, rayon, position);
			}
			return localizationLivre;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLClass.close();
		}
		return localizationLivre;
	}

	public int getId_localization_livre() {
		return id_localization_livre;
	}
	public void setId_localization_livre(int id_localization_livre) {
		this.id_localization_livre = id_localization_livre;
	}
	public String getCorridor() {
		return corridor;
	}
	public void setCorridor(String corridor) {
		this.corridor = corridor;
	}
	public String getCote() {
		return cote;
	}
	public void setCote(String cote) {
		this.cote = cote;
	}
	public String getRangee() {
		return rangee;
	}
	public void setRangee(String rangee) {
		this.rangee = rangee;
	}
	public String getRayon() {
		return rayon;
	}
	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "corridor : " + corridor +
				", cote : " + cote + 
				", rangee : " + rangee + 
				", rayon : " + rayon + 
				", position : " + position;
	}
    
    
}
