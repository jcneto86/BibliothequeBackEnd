package bibliotheque;

import entities.*;
import sql.SQLClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FonctionsBibli {

    public static Utilisateur utilisateurConnecte;

    /* longin */
    public static boolean validerLogin(String idUtilisateur, String pass) {
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT * FROM utilisateur WHERE id_utilisateur = " + idUtilisateur);
            rs.getFetchSize();
            while (rs.next()) {
                int id_utilisateur = rs.getInt("id_utilisateur");
                int id_adresse = rs.getInt("id_utilisateur");
                String nom = rs.getString("nom");
                String nom_de_famille = rs.getString("nom_de_famille");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String permission = rs.getString("permission");
                Utilisateur user = new Utilisateur(id_utilisateur, id_adresse, nom, nom_de_famille, email, telephone, permission);
                utilisateurConnecte = user;
                if (id_utilisateur == Integer.parseInt(idUtilisateur) && validerMotDePasse(idUtilisateur, pass)) {
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            SQLClass.close();
        }
        return false;
    }

    public static boolean validerMotDePasse(String idUtilisateur, String pass) {
        SQLClass.connect();
        ResultSet rs = SQLClass.executeQuery("SELECT AES_DECRYPT(password,'" + pass + "') AS PW  FROM utilisateur WHERE id_utilisateur = '" + idUtilisateur + "'");
        try {
            while (rs.next()) {
                String passBD = rs.getString("PW");
                if (pass.equals(passBD)) {
                    return true;
                }
            }
        } catch (SQLException ee) {
            // TODO Auto-generated catch block
            ee.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return false;
    }

    /* fin longin */


    public static ArrayList<Livre> rechercheLivre(String titreLivreOuNomAuteur) {
        ArrayList<Livre> livres = new ArrayList<Livre>();
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT OEUVRE_LITTERAIRE.ID_OEUVRE_LITTERAIRE, \n" + "OEUVRE_LITTERAIRE.TITRE, \n" + "AUTEUR.NOMAUTEUR, \n" + "EDITION.ANNEE, \n" + "EDITION.EDITION, \n" + "EDITION.NB_PAGES, \n" + "MAISON_EDITION.NOM, \n" + "LOCALIZATION_LIVRE.CORRIDOR, \n" + "LOCALIZATION_LIVRE.COTE, \n" + "LOCALIZATION_LIVRE.RANGEE, \n" + "LOCALIZATION_LIVRE.RAYON, \n" + "LOCALIZATION_LIVRE.POSITION, \n" + "EXEMPLAIRE.ID_EXEMPLAIRE\n" + "FROM OEUVRE_LITTERAIRE \n" + "JOIN AUTEUR ON AUTEUR.ID_AUTEUR = OEUVRE_LITTERAIRE.ID_AUTEUR \n" + "JOIN EDITION ON EDITION.ID_OEUVRE_LITTERAIRE = OEUVRE_LITTERAIRE.ID_OEUVRE_LITTERAIRE \n" + "JOIN MAISON_EDITION ON MAISON_EDITION.ID_MAISON_EDITION = EDITION.ID_MAISON_EDITION \n" + "JOIN EXEMPLAIRE ON EXEMPLAIRE.ID_EDITION = EDITION.ID_EDITION \n" + "JOIN LOCALIZATION_LIVRE ON LOCALIZATION_LIVRE.ID_LOCALIZATION_LIVRE = EXEMPLAIRE.ID_LOCALIZATION_LIVRE \n" + "\n" + "WHERE OEUVRE_LITTERAIRE.TITRE LIKE ('%" + titreLivreOuNomAuteur + "%') OR AUTEUR.NOMAUTEUR LIKE ('%" + titreLivreOuNomAuteur + "%')");
            while (rs.next()) {
                String titre = rs.getString("TITRE");
                String nomauteur = rs.getString("NOMAUTEUR");
                int annee = rs.getInt("ANNEE");
                String edition = rs.getString("EDITION");
                int nb_pages = rs.getInt("NB_PAGES");
                String maison_edition = rs.getString("NOM");
                String corridor = rs.getString("CORRIDOR");
                String cote = rs.getString("COTE");
                String rangee = rs.getString("RANGEE");
                String rayon = rs.getString("RAYON");
                String position = rs.getString("POSITION");
                int id_exemplaire = rs.getInt("ID_EXEMPLAIRE");
                Livre livre = new Livre(titre, nomauteur, annee, edition, nb_pages, maison_edition, corridor, cote, rangee, rayon, position, id_exemplaire);
                livres.add(livre);

            }
            return livres;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return livres;
    }

    public static ArrayList<Utilisateur> rechercheUtilisateur(String nomOuIduser) {
        ArrayList<Utilisateur> users = new ArrayList<Utilisateur>();
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT UTILISATEUR.ID_UTILISATEUR, \n" + "UTILISATEUR.ID_ADRESSE, \n" + "UTILISATEUR.NOM, \n" + "UTILISATEUR.NOM_DE_FAMILLE, \n" + "UTILISATEUR.EMAIL, \n" + "UTILISATEUR.TELEPHONE, \n" + "UTILISATEUR.PERMISSION \n" + "FROM UTILISATEUR \n" + "JOIN ADRESSE ON ADRESSE.ID_ADRESSE = UTILISATEUR.ID_ADRESSE \n" + "WHERE UTILISATEUR.ID_UTILISATEUR LIKE ('%" + nomOuIduser + "%') OR UTILISATEUR.NOM LIKE ('%" + nomOuIduser + "%')");
            while (rs.next()) {
                int id_utilisateur = rs.getInt("ID_UTILISATEUR");
                int id_adresse = rs.getInt("ID_ADRESSE");
                String nom = rs.getString("NOM");
                String nom_de_famille = rs.getString("NOM_DE_FAMILLE");
                String email = rs.getString("EMAIL");
                String telephone = rs.getString("TELEPHONE");
                String permission = rs.getString("PERMISSION");
                Utilisateur user = new Utilisateur(id_utilisateur, id_adresse, nom, nom_de_famille, email, telephone, permission);
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return users;
    }

    public static void reserverLivre(ReservationLivre reservationLivre) {
        SQLClass.connect();
        try {
            SQLClass.executeUpdate("INSERT INTO RESERVATION_LIVRE \n" + "VALUES (NULL, " + reservationLivre.getId_exemplaire() + ", \n" + reservationLivre.getId_utilisateur() + ", '" + reservationLivre.getDate() + "', 0);");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
    }

    public static void faireConsultationSurPlace(ConsultationSurPlace consultationSurPlace) {
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("INSERT INTO CONSULTATION_SUR_PLACE VALUES "
                    + "(NULL, " + consultationSurPlace.getId_utilisateur()
                    + " , " + consultationSurPlace.getId_utilisateur()
                    + ", " + consultationSurPlace.getEmploye() + ", '"
                    + consultationSurPlace.getData() + "', '"
                    + consultationSurPlace.getPeriode() + "' );");
            while (rs.next()) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
    }


    public static void fairePret(Pret pret, Utilisateur utilisateur, ArrayList<Exemplaire> exemplaires) {
        SQLClass.connect();
        try {
            SQLClass.executeUpdate("INSERT INTO PRET VALUES \n"
                    + "(NULL, " + utilisateur.getId_utilisateur() +
                    ", '" + pret.getDate_retiree()
                    + "', " + pret.getDate_retiree().plusDays(15) + ", 0);\n" + "");
            for (Exemplaire e : exemplaires) {
                SQLClass.executeUpdate("INSERT INTO LIVRE_PRET VALUES (" + pret.getId_pret() + ", "
                                + e.getId_exemplaire() + ", "
                                + utilisateur.getId_utilisateur() + ";");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }

    }

    public static void faireRetour() {

    }

    public static void enregistrerUtilisateur(Utilisateur utilisateur, Adresse adresse) {
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_adresse  \n" + "FROM adresse \n" + "WHERE coordonner LIKE '" + adresse.getCoordonner() + "' AND nb LIKE '" + adresse.getNb() + "' AND codepostal LIKE '" + adresse.getCodepostal() + "'");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO ADRESSE VALUES \n" + "(NULL, '" + adresse.getCoordonner() + "', " + adresse.getNb() + ", '" + adresse.getCodepostal() + "', '" + adresse.getComplement() + "');");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_adresse  \n" + "FROM adresse \n" + "WHERE coordonner LIKE '" + adresse.getCoordonner() + "' AND nb LIKE '" + adresse.getNb() + "' AND codepostal LIKE '" + adresse.getCodepostal() + "'");
                    while (rs1.next()) {
                        adresse.setId_adresse(rs1.getInt("id_adresse"));
                    }
                    SQLClass.executeUpdate("INSERT INTO UTILISATEUR VALUES (NULL, , '" + adresse.getId_adresse() + "', '" + utilisateur.getNom() + "', '" + utilisateur.getNom_de_famille() + "', '" + utilisateur.getEmail() + "' , AES_ENCRYPT('" + utilisateur.getPassword() + "', '" + utilisateur.getPassword() + "'), '" + utilisateur.getTelephone() + "', '" + utilisateur.getPermission() + "');");
                } else {
                    adresse.setId_adresse(rs.getInt("id_adresse"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }

    }

    public static void enregistrerLivre(Auteur auteur, Edition edition, OevreLitteraire oevreLitteraire, MaisonEdition maisonEdition, LocalizationLivre localizationLivre) {

        SQLClass.connect();

        try {
            //verificar autor
            ResultSet rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_auteur \n" + "FROM auteur WHERE nomAuteur LIKE '" + auteur.getNomAuteur() + "';");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO AUTEUR VALUES (NULL, '" + auteur.getNomAuteur() + "');");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT * \n" + "FROM auteur WHERE nomAuteur LIKE '" + auteur.getNomAuteur() + "';");
                    while (rs1.next()) {
                        auteur.setId_auteur(rs.getInt("id_auteur"));
                    }
                } else {
                    auteur.setId_auteur(rs.getInt("id_auteur"));
                }
            }
            //verificar oevre litteraire
            rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_oeuvre_litteraire, id_auteur  \n" + "FROM oeuvre_litteraire WHERE titre LIKE '" + oevreLitteraire.getTitre() + "';");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO oeuvre_litteraire VALUES (NULL, " + "'" + auteur.getId_auteur() + "', '" + oevreLitteraire.getTitre() + "', '" + oevreLitteraire.getLangue_originale() + "', " + oevreLitteraire.getAnnee() + ");");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_auteur \n" + "FROM auteur WHERE nomAuteur LIKE '" + auteur.getNomAuteur() + "';");
                    while (rs1.next()) {
                        oevreLitteraire.setId_oeuvre_litteraire(rs1.getInt("id_oeuvre_litteraire"));
                        oevreLitteraire.setId_auteur(rs.getInt("id_auteur"));
                    }
                    SQLClass.executeQuery("");
                } else {
                    oevreLitteraire.setId_oeuvre_litteraire(rs.getInt("id_oeuvre_litteraire"));
                    oevreLitteraire.setId_auteur(rs.getInt("id_auteur"));
                }
            }
            //verificar maison edition
            rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_maison_edition \n" + "FROM maison_edition WHERE nom LIKE '" + maisonEdition.getNom() + "';");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO maison_edition VALUES (NULL, " + "'" + maisonEdition.getNom() + ");");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_maison_edition \n" + "FROM auteur WHERE nomAuteur LIKE '" + maisonEdition.getNom() + "';");
                    while (rs1.next()) {
                        maisonEdition.setId_maison_edition(rs1.getInt("id_maison_edition"));
                    }
                } else {
                    maisonEdition.setId_maison_edition(rs.getInt("id_maison_edition"));
                }
            }
            //verificar edition
            rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_edition \n" + "FROM edition WHERE annee LIKE '" + edition.getAnnee() + "' \n" + "AND edition LIKE '" + edition.getEdition() + "' \n" + "AND nb_pages LIKE '" + edition.getNb_pages() + "' \n" + "AND isbn LIKE '" + edition.getIsbn() + "' \n" + "AND description LIKE '" + edition.getDescription() + "';");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO EDITION VALUES (NULL, " + maisonEdition.getId_maison_edition() + ", " + oevreLitteraire.getId_oeuvre_litteraire() + ", " + edition.getAnnee() + ", " + "'" + edition.getEdition() + "', " + edition.getNb_pages() + ", " + "'" + edition.getIsbn() + "', " + "'" + edition.getDescription() + "', " + edition.getRarete() + ");\n");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_edition \n" + "FROM edition WHERE annee LIKE '" + edition.getAnnee() + "' \n" + "AND edition LIKE '" + edition.getEdition() + "' \n" + "AND nb_pages LIKE '" + edition.getNb_pages() + "' \n" + "AND isbn LIKE '" + edition.getIsbn() + "' \n" + "AND description LIKE '" + edition.getDescription() + "';");
                    while (rs1.next()) {
                        edition.setId_edition(rs1.getInt("id_edition"));
                    }
                    SQLClass.executeQuery("");
                } else {
                    edition.setId_edition(rs.getInt("id_edition"));
                }
            }
            //verificar LocalizationLivre
            rs = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_localization_livre \n" + "FROM localization_livre WHERE corridor LIKE '" + localizationLivre.getCorridor() + "' AND cote LIKE '" + localizationLivre.getCote() + "' AND rangee LIKE '" + localizationLivre.getRangee() + "' AND rayon LIKE '" + localizationLivre.getRayon() + "' AND position LIKE '" + localizationLivre.getPosition() + "';");
            while (rs.next()) {
                int nbRegist = rs.getInt("nbRegist");
                if (nbRegist == 0) {
                    //registrar
                    SQLClass.executeUpdate("INSERT INTO LOCALIZATION_LIVRE VALUES (NULL, '" + localizationLivre.getCorridor() + "', '" + localizationLivre.getCote() + "', '" + localizationLivre.getRangee() + "', '" + localizationLivre.getRayon() + "', '" + localizationLivre.getPosition() + "');");
                    ResultSet rs1 = SQLClass.executeQuery("SELECT COUNT(*) as nbRegist, id_localization_livre \n" + "FROM localization_livre WHERE corridor LIKE '" + localizationLivre.getCorridor() + "' AND cote LIKE '" + localizationLivre.getCote() + "' AND rangee LIKE '" + localizationLivre.getRangee() + "' AND rayon LIKE '" + localizationLivre.getRayon() + "' AND position LIKE '" + localizationLivre.getPosition() + "';");
                    while (rs1.next()) {
                        localizationLivre.setId_localization_livre(rs1.getInt("id_localization_livre"));
                    }
                    SQLClass.executeQuery("");
                } else {
                    maisonEdition.setId_maison_edition(rs.getInt("id_maison_edition"));
                }
            }
            // gegistrar exemplar
            SQLClass.executeUpdate("INSERT INTO EXEMPLAIRE VALUES \n" + "(NULL, '" + localizationLivre.getId_localization_livre() + "', '" + edition.getId_edition() + "');\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }

    }

    public static void modifierUtilisateur(Utilisateur user, Adresse adresse) {
    }

    public static void modifierLivre(Auteur auteur, Edition edition, OevreLitteraire oevreLitteraire, MaisonEdition maisonEdition, LocalizationLivre localizationLivre) {


    }


}
