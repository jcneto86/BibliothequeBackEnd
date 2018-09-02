package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class OevreLitteraire {

    private int id_oeuvre_litteraire;
    private int id_auteur;
    private String titre;
    private String langue_originale;
    private int annee;

    public OevreLitteraire() {
    }

    public OevreLitteraire(int id_oeuvre_litteraire, int id_auteur, String titre, String langue_originale, int annee) {
        this.id_oeuvre_litteraire = id_oeuvre_litteraire;
        this.id_auteur = id_auteur;
        this.titre = titre;
        this.langue_originale = langue_originale;
        this.annee = annee;
    }

    public OevreLitteraire getOevreLitteraireById(int id) {
        OevreLitteraire oevreLitteraire = null;
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT id_oeuvre_litteraire, id_auteur, titre, langue_originale, annee\n" + " FROM biblioteque.oeuvre_litteraire\n" + " where id_oeuvre_litteraire = " + id + ";");
            while (rs.next()) {
                int id_oeuvre_litteraire = rs.getInt("id_oeuvre_litteraire");
                int id_auteur = rs.getInt("id_auteur");
                String titre = rs.getString("titre");
                String langue_originale = rs.getString("langue_originale");
                int annee = rs.getInt("annee");
                oevreLitteraire = new OevreLitteraire(id_oeuvre_litteraire, id_auteur, titre, langue_originale, annee);
            }
            return oevreLitteraire;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return oevreLitteraire;
    }

    public int getId_oeuvre_litteraire() {
        return id_oeuvre_litteraire;
    }

    public void setId_oeuvre_litteraire(int id_oeuvre_litteraire) {
        this.id_oeuvre_litteraire = id_oeuvre_litteraire;
    }

    public int getId_auteur() {
        return id_auteur;
    }

    public void setId_auteur(int id_auteur) {
        this.id_auteur = id_auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLangue_originale() {
        return langue_originale;
    }

    public void setLangue_originale(String langue_originale) {
        this.langue_originale = langue_originale;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "OevreLitteraire{" + "id_oeuvre_litteraire=" + id_oeuvre_litteraire + ", id_auteur=" + id_auteur + ", titre='" + titre + '\'' + ", langue_originale='" + langue_originale + '\'' + ", annee=" + annee + '}';
    }
}
