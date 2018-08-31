package entities;

import java.time.LocalDate;

public class ConsultationSurPlace {

	private int id_consultation_sur_place; // INT NOT NULL AUTO_INCREMENT,
	private int id_utilisateur; // INT NOT NULL,
	private int id_exemplaire; // INT NOT NULL,
	private int employe; // id_utilisateur,
	private LocalDate data; // DATETIME NOT NULL,
	private String periode; // VARCHAR(15) NOT NULL,

	public ConsultationSurPlace(int id_consultation_sur_place, int id_utilisateur, int id_exemplaire, int employe, LocalDate data, String periode) {
		super();
		this.id_consultation_sur_place = id_consultation_sur_place;
		this.id_utilisateur = id_utilisateur;
		this.id_exemplaire = id_exemplaire;
		this.employe = employe;
		this.data = data;
		this.periode = periode;
	}

	public int getId_consultation_sur_place() {
		return id_consultation_sur_place;
	}





	public void setId_consultation_sur_place(int id_consultation_sur_place) {
		this.id_consultation_sur_place = id_consultation_sur_place;
	}





	public int getId_utilisateur() {
		return id_utilisateur;
	}





	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}





	public int getId_exemplaire() {
		return id_exemplaire;
	}





	public void setId_exemplaire(int id_exemplaire) {
		this.id_exemplaire = id_exemplaire;
	}





	public int getEmploye() {
		return employe;
	}





	public void setEmploye(int employe) {
		this.employe = employe;
	}





	public LocalDate getData() {
		return data;
	}





	public void setData(LocalDate data) {
		this.data = data;
	}





	public String getPeriode() {
		return periode;
	}





	public void setPeriode(String periode) {
		this.periode = periode;
	}





	@Override
	public String toString() {
		return "ConsultationSurPlace [id_consultation_sur_place=" + id_consultation_sur_place + ", id_utilisateur="
				+ id_utilisateur + ", id_exemplaire=" + id_exemplaire + ", employe=" + employe + ", data=" + data
				+ ", periode=" + periode + "]";
	}
}
