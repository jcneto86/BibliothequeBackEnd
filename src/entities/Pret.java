package entities;

import sql.SQLClass;

import java.sql.*;
import java.time.LocalDate;

public class Pret {
    private int id_pret;
    private int employe;
    private LocalDate date_retiree;
    private LocalDate date_retour;
    private byte retourne;


	public Pret() {
	}

	public Pret(int id_pret, int employe, LocalDate date_retiree, LocalDate date_retour) {
		super();
		this.id_pret = id_pret;
		this.employe = employe;
		this.date_retiree = date_retiree;
		this.date_retour = date_retour;
		this.retourne = 0;
	}

	public Pret getPretById(int id) {
		Pret pret = null;
		SQLClass.connect();
		try {
			ResultSet rs = SQLClass.executeQuery("SELECT id_pret, employe, date_retiree, date_retour  \n"
					+ "FROM pret \n" + "where id_pret = "+ id+ ";");
			while (rs.next()) {
				int id_pret = rs.getInt("id_pret");
				int employe = rs.getInt("employe");
				LocalDate date_retiree = rs.getDate("date_retiree").toLocalDate();
				LocalDate date_retour = rs.getDate("date_retour").toLocalDate();
				pret = new Pret(id_pret, employe, date_retiree, date_retour);
			}
			return pret;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLClass.close();
		}
		return pret;
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
