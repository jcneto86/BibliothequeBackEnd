package entities;

public class LivrePret {

    private int id_pret;  // INT NOT NULL,
    private int id_livre;  // INT NOT NULL,
    private int id_utilisateur; // INT NOT NULL,

    public int getId_pret() {
        return id_pret;
    }

    public void setId_pret(int id_pret) {
        this.id_pret = id_pret;
    }

    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }
}
