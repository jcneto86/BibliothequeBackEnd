package entities;

import java.sql.SQLData;

public class Pret {
    private int id_pret; //INT NOT NULL AUTO_INCREMENT,
    private int employe; //INT NOT NULL,
    private SQLData date_retiree; //DATE NOT NULL,
    private SQLData date_retour; //DATE NOT NULL,
    private byte retourne; //BINARY(1) NOT NULL,
    
    
    
	public Pret(int id_pret, int employe, SQLData date_retiree, SQLData date_retour) {
		super();
		this.id_pret = id_pret;
		this.employe = employe;
		this.date_retiree = date_retiree;
		this.date_retour = date_retour;
		this.retourne = 0;
	}



	@Override
	public String toString() {
		return "Pret [id_pret=" + id_pret + ", employe=" + employe + ", date_retiree=" + date_retiree + ", date_retour="
				+ date_retour + ", retourne=" + retourne + "]";
	}

}
