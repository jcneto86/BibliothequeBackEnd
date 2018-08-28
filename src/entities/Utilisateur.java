package entities;

import java.sql.ResultSet;
import sql.SQLClass;

public class Utilisateur {

	private int id_utilisateur; //INT NOT NULL AUTO_INCREMENT,
	private int id_adresse; //INT NULL,
	private String nom; //VARCHAR(128) NOT NULL,
	private String nom_de_famille; //VARCHAR(128) NOT NULL,
	private String email; //VARCHAR(128) NOT NULL,
	private String telephone; //VARCHAR(126) NOT NULL,
	private String password;



	private String permission; //VARCHAR(45) NOT NULL,

	public Utilisateur(int id_utilisateur, int id_adresse, String nom, String nom_de_famille, String email, String telephone, String permission) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.id_adresse = id_adresse;
		this.nom = nom;
		this.nom_de_famille = nom_de_famille;
		this.email = email;
		this.telephone = telephone;
		this.permission = permission;
		this.password = "";
	}
	public void setUtilisateurById(int idUtilisateur) {
		SQLClass.connect();
		try {
			ResultSet rs = SQLClass.executeQuery("SELECT * \n" + 
					"FROM UTILISATEUR \n" + 
					"WHERE ID_UTILISATEUR = " + idUtilisateur + "'"		
					);
			while ( rs.next() ) {
				this.id_utilisateur = rs.getInt("id_utilisateur");
				this.id_adresse = rs.getInt("id_adresse");
				this.nom = rs.getString("nom");
				this.nom_de_famille = rs.getString("nom_de_famille");
				this.email = rs.getString("email");
				this.telephone = rs.getString("telephone");
				this.permission = rs.getString("permission");
				this.password = "";
			}
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			SQLClass.close();
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getId_utilisateur() {
		return id_utilisateur;
	}



	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}



	public int getId_adresse() {
		return id_adresse;
	}



	public void setId_adresse(int id_adresse) {
		this.id_adresse = id_adresse;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getNom_de_famille() {
		return nom_de_famille;
	}



	public void setNom_de_famille(String nom_de_famille) {
		this.nom_de_famille = nom_de_famille;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getPermission() {
		return permission;
	}



	public void setPermission(String permission) {
		this.permission = permission;
	}



	@Override
	public String toString() {
		return "Utilisateur [id_utilisateur=" + id_utilisateur + ", id_adresse=" + id_adresse + ", nom=" + nom
				+ ", nom_de_famille=" + nom_de_famille + ", email=" + email + ", telephone=" + telephone
				+ ", permission=" + permission + "]";
	}

}
