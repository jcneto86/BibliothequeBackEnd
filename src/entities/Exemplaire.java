package entities;

public class Exemplaire {
    private int id_exemplaire;
    private int id_localization_livre;
    private int id_edition;

    public int getId_exemplaire() {
        return id_exemplaire;
    }

    public void setId_exemplaire(int id_exemplaire) {
        this.id_exemplaire = id_exemplaire;
    }

    public int getId_localization_livre() {
        return id_localization_livre;
    }

    public void setId_localization_livre(int id_localization_livre) {
        this.id_localization_livre = id_localization_livre;
    }

    public int getId_edition() {
        return id_edition;
    }

    public void setId_edition(int id_edition) {
        this.id_edition = id_edition;
    }
}
