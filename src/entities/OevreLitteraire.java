package entities;

public class OevreLitteraire {

    private int id_oeuvre_litteraire; // INT NOT NULL AUTO_INCREMENT,
    private int id_auteur; // INT NOT NULL,
    private String titre; // VARCHAR(45) NOT NULL,
    private String langue_originale;// VARCHAR(45) NULL,
    private int annee;// INT NULL,

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
}
