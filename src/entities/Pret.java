package entities;

import java.time.LocalDate;

public class Pret {
    private int id_pret; //INT NOT NULL AUTO_INCREMENT,
    private int employe; //INT NOT NULL,
    private LocalDate date_retiree; //DATE NOT NULL,
    private LocalDate date_retour; //DATE NOT NULL,
    private byte retourne; //BINARY(1) NOT NULL,
    
    
    
	public Pret(int id_pret, int employe, LocalDate date_retiree, LocalDate date_retour) {
		super();
		this.id_pret = id_pret;
		this.employe = employe;
		this.date_retiree = date_retiree;
		this.date_retour = date_retour;
		this.retourne = 0;
	}


	public int getId_pret() {
		return id_pret;
	}

	public void setId_pret(int id_pret) {
		this.id_pret = id_pret;
	}

	public int getEmploye() {
		return employe;
	}

	public void setEmploye(int employe) {
		this.employe = employe;
	}

	public LocalDate getDate_retiree() {
		return date_retiree;
	}

	public void setDate_retiree(LocalDate date_retiree) {
		this.date_retiree = date_retiree;
	}

	public LocalDate getDate_retour() {
		return date_retour;
	}

	public void setDate_retour(LocalDate date_retour) {
		this.date_retour = date_retour;
	}

	public byte getRetourne() {
		return retourne;
	}

	public void setRetourne(byte retourne) {
		this.retourne = retourne;
	}

	@Override
	public String toString() {
		return "Pret [id_pret=" + id_pret + ", employe=" + employe + ", date_retiree=" + date_retiree + ", date_retour="
				+ date_retour + ", retourne=" + retourne + "]";
	}

}
