package entities;

public class LivrePret {

    private int id_pret;  // INT NOT NULL,
    private int id_exemplaire;  // INT NOT NULL,
    private int id_utilisateur; // INT NOT NULL,

    public int getId_pret() {
        return id_pret;
    }

    public void setId_pret(int id_pret) {
        this.id_pret = id_pret;
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
}
