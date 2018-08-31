package entities;

import java.time.LocalDate;

public class ReservationLivre {
    private int id_reservation_livre; // INT NOT NULL,
    private int id_exemplaire; // INT NOT NULL,
    private int id_utilisateur; // INT NOT NULL,
    private LocalDate date; // DATE NULL,
    private byte complete; // BINARY(1) NULL,
    
	public ReservationLivre(int id_reservation_livre, int id_exemplaire, int id_utilisateur, LocalDate date) {
		super();
		this.id_reservation_livre = id_reservation_livre;
		this.id_exemplaire = id_exemplaire;
		this.id_utilisateur = id_utilisateur;
		this.date = date;
		this.complete = 0;
	}

	public int getId_reservation_livre() {
		return id_reservation_livre;
	}
	public void setId_reservation_livre(int id_reservation_livre) {
		this.id_reservation_livre = id_reservation_livre;
	}






	public int getId_exemplaire() {
		return id_exemplaire;
	}






	public void setId_exemplaire(int id_exemplaire) {
		this.id_exemplaire = id_exemplaire;
	}






	public int getId_utilisateur() {
		return id_utilisateur;
	}






	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}






	public LocalDate getDate() {
		return date;
	}






	public void setDate(LocalDate date) {
		this.date = date;
	}






	public byte getComplete() {
		return complete;
	}






	public void setComplete(byte complete) {
		this.complete = complete;
	}






	@Override
	public String toString() {
		return "ReservationLivre [id_reservation_livre=" + id_reservation_livre + ", id_exemplaire=" + id_exemplaire
				+ ", id_utilisateur=" + id_utilisateur + ", date=" + date + ", complete=" + complete + "]";
	}
    
}
