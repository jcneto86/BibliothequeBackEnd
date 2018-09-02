package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class MaisonEdition {

    private int id_maison_edition; // INT NOT NULL AUTO_INCREMENT,
    private String nom; // VARCHAR(45) NULL,

    public MaisonEdition() {
    }

    public MaisonEdition(int id_maison_edition, String nom) {
        super();
        this.id_maison_edition = id_maison_edition;
        this.nom = nom;
    }
    public MaisonEdition getMaisonEditionById(int id) {
        MaisonEdition maisonEdition = null;
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT id_maison_edition, nom\n"
                    + " FROM biblioteque.maison_edition\n"
                    + " where id_maison_edition = " + id + ";");
            while (rs.next()) {
                int id_maison_edition = rs.getInt("id_maison_edition");
                String nom = rs.getString("nom");
                maisonEdition = new MaisonEdition(id_maison_edition, nom);
            }
            return maisonEdition;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return maisonEdition;
    }

    public int getId_maison_edition() {
        return id_maison_edition;
    }
    public void setId_maison_edition(int id_maison_edition) {
        this.id_maison_edition = id_maison_edition;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "MaisonEdition [id_maison_edition=" + id_maison_edition + ", nom=" + nom + "]";
    }


}
