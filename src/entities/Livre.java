package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class Livre {

    private int id_exemplaire;
    private int id_auteur;
    private int id_edition;
    private int id_maison_edition;
    private int id_oeuvre_litteraire;
    private int id_localization_livre;
    private String titre;
    private String nomauteur;
    private int annee;
    private String edition;
    private int nb_pages;
    private String maison_edition;
    private String isbn;
    private String corridor;
    private String cote;
    private String rangee;
    private String rayon;
    private String position;
    private String description;
    private String langue_originale;
    private int anneeOeuvre;
    private byte rarete;

    public Livre() {
    }

    public Livre(int id_exemplaire, int id_auteur, int id_edition, int id_maison_edition, int id_oeuvre_litteraire, int id_localization_livre, String titre, String nomauteur, int annee, String edition, int nb_pages, String maison_edition, String isbn, String corridor, String cote, String rangee, String rayon, String position, String description, String langue_originale, int anneeOeuvre, byte rarete) {
        this.id_exemplaire = id_exemplaire;
        this.id_auteur = id_auteur;
        this.id_edition = id_edition;
        this.id_maison_edition = id_maison_edition;
        this.id_oeuvre_litteraire = id_oeuvre_litteraire;
        this.id_localization_livre = id_localization_livre;
        this.titre = titre;
        this.nomauteur = nomauteur;
        this.annee = annee;
        this.edition = edition;
        this.nb_pages = nb_pages;
        this.maison_edition = maison_edition;
        this.isbn = isbn;
        this.corridor = corridor;
        this.cote = cote;
        this.rangee = rangee;
        this.rayon = rayon;
        this.position = position;
        this.description = description;
        this.langue_originale = langue_originale;
        this.anneeOeuvre = anneeOeuvre;
        this.rarete = rarete;
    }

    public Livre getLivreById(int id) {
        Livre livre = null;
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT OEUVRE_LITTERAIRE.ID_OEUVRE_LITTERAIRE, \n" + "OEUVRE_LITTERAIRE.TITRE, \n" + "OEUVRE_LITTERAIRE.LANGUE_ORIGINALE, \n" + "OEUVRE_LITTERAIRE.ANNEE AS ANNEEOEUVRE, \n" + "AUTEUR.NOMAUTEUR, \n" + "AUTEUR.ID_AUTEUR, \n" + "EDITION.ANNEE AS ANNEEEDITION, \n" + "EDITION.EDITION, \n" + "EDITION.NB_PAGES, \n" + "EDITION.ID_EDITION, \n" + "EDITION.ISBN, \n" + "EDITION.DESCRIPTION, \n" + "EDITION.RARETE, \n" + "MAISON_EDITION.NOM, \n" + "MAISON_EDITION.ID_MAISON_EDITION, \n" + "LOCALIZATION_LIVRE.ID_LOCALIZATION_LIVRE, \n" + "LOCALIZATION_LIVRE.CORRIDOR, \n" + "LOCALIZATION_LIVRE.COTE, \n" + "LOCALIZATION_LIVRE.RANGEE, \n" + "LOCALIZATION_LIVRE.RAYON, \n" + "LOCALIZATION_LIVRE.POSITION, \n" + "EXEMPLAIRE.ID_EXEMPLAIRE\n" + "FROM OEUVRE_LITTERAIRE \n" + "JOIN AUTEUR ON AUTEUR.ID_AUTEUR = OEUVRE_LITTERAIRE.ID_AUTEUR \n" + "JOIN EDITION ON EDITION.ID_OEUVRE_LITTERAIRE = OEUVRE_LITTERAIRE.ID_OEUVRE_LITTERAIRE \n" + "JOIN MAISON_EDITION ON MAISON_EDITION.ID_MAISON_EDITION = EDITION.ID_MAISON_EDITION \n" + "JOIN EXEMPLAIRE ON EXEMPLAIRE.ID_EDITION = EDITION.ID_EDITION \n" + "JOIN LOCALIZATION_LIVRE ON LOCALIZATION_LIVRE.ID_LOCALIZATION_LIVRE = EXEMPLAIRE.ID_LOCALIZATION_LIVRE \n"
                    + "WHERE EXEMPLAIRE.ID_EXEMPLAIRE = ('" + id + "')");
            while (rs.next()) {
                int id_exemplaire = rs.getInt("ID_EXEMPLAIRE");
                int id_auteur = rs.getInt("ID_AUTEUR");
                int id_edition = rs.getInt("ID_EDITION");
                int id_maison_edition = rs.getInt("ID_MAISON_EDITION");
                int id_oeuvre_litteraire = rs.getInt("ID_OEUVRE_LITTERAIRE");
                int id_localization_livre = rs.getInt("ID_LOCALIZATION_LIVRE");
                String titre = rs.getString("TITRE");
                String nomauteur = rs.getString("NOMAUTEUR");
                int annee = rs.getInt("ANNEEEDITION");
                String edition = rs.getString("EDITION");
                int nb_pages = rs.getInt("NB_PAGES");
                String nom_maison_edition = rs.getString("NOM");
                String isbn = rs.getString("ISBN");
                String corridor = rs.getString("CORRIDOR");
                String cote = rs.getString("COTE");
                String rangee = rs.getString("RANGEE");
                String rayon = rs.getString("RAYON");
                String position = rs.getString("POSITION");
                String description = rs.getString("DESCRIPTION");
                String langue_originale = rs.getString("LANGUE_ORIGINALE");
                int anneeOeuvre = rs.getInt("ANNEEOEUVRE");
                byte rarete = rs.getByte("RARETE");
                livre = new Livre(id_exemplaire, id_auteur, id_edition, id_maison_edition, id_oeuvre_litteraire, id_localization_livre, titre, nomauteur, annee, edition, nb_pages, nom_maison_edition, isbn, corridor, cote, rangee, rayon, position, description, langue_originale, anneeOeuvre, rarete);

            }
            return livre;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return livre;

    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomauteur() {
        return nomauteur;
    }

    public void setNomauteur(String nomauteur) {
        this.nomauteur = nomauteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNb_pages() {
        return nb_pages;
    }

    public void setNb_pages(int nb_pages) {
        this.nb_pages = nb_pages;
    }

    public String getMaison_edition() {
        return maison_edition;
    }

    public void setMaison_edition(String maison_edition) {
        this.maison_edition = maison_edition;
    }

    public String getCorridor() {
        return corridor;
    }

    public void setCorridor(String corridor) {
        this.corridor = corridor;
    }

    public String getCote() {
        return cote;
    }

    public void setCote(String cote) {
        this.cote = cote;
    }

    public String getRangee() {
        return rangee;
    }

    public void setRangee(String rangee) {
        this.rangee = rangee;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId_exemplaire() {
        return id_exemplaire;
    }

    public void setId_exemplaire(int id_exemplaire) {
        this.id_exemplaire = id_exemplaire;
    }


    @Override
    public String toString() {
        return "Livre{" + "id_exemplaire=" + id_exemplaire + ", id_auteur=" + id_auteur + ", id_edition=" + id_edition + ", id_maison_edition=" + id_maison_edition + ", id_oeuvre_litteraire=" + id_oeuvre_litteraire + ", id_localization_livre=" + id_localization_livre + ", titre='" + titre + '\'' + ", nomauteur='" + nomauteur + '\'' + ", annee=" + annee + ", edition='" + edition + '\'' + ", nb_pages=" + nb_pages + ", maison_edition='" + maison_edition + '\'' + ", isbn='" + isbn + '\'' + ", corridor='" + corridor + '\'' + ", cote='" + cote + '\'' + ", rangee='" + rangee + '\'' + ", rayon='" + rayon + '\'' + ", position='" + position + '\'' + ", description='" + description + '\'' + ", langue_originale='" + langue_originale + '\'' + ", anneeOeuvre=" + anneeOeuvre + ", rarete=" + rarete + '}';
    }
}
