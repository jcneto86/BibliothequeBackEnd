package bibliotheque;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import entities.Utilisateur;

public class FonctionsBibli {

    /* longin */
    public static boolean validerUtilisateur(String idUtilisateur) {
        return false;
    }

    public static boolean validerMotDePasse(String motDePasse) {
        return false;
    }

    /* fin longin */

    public static void reinitialiserMotDePasse() {

    }

    public static LinkedList<Livre> rechercheLivre() {
        Livre f = new Livre();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeQuery(
                    "select * from filme where id_filme = " + id
            );
            if (result.first()) {
                f = new Film(id,
                        result.getString("titulo"),
                        result.getString("descricao"),
                        result.getInt("ano"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void reserverLivre() {

    }

    public static void faireConsultationSurPlace() {

    }

    public static LinkedList<Utilisateur> rechercheUtilisateur() {
        return null;
    }

    public static void creerUtilisateur() {


    }

    public static void creerLivre() {

    }

    public static Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
        try {
            PreparedStatement prepare =
                    this.connect
                            .prepareStatement(
                                    "insert into filme "
                                            + "(titulo, "
                                            + "descricao, ano) "
                                            + "values (?, ?, ?)"
                                    , Statement.RETURN_GENERATED_KEYS);

            prepare.setString(1, utilisateur.getTitulo());
            prepare.setString(2, utilisateur.getDescricao());
            prepare.setInt(3, utilisateur.getAno());


            prepare.executeUpdate();


            ResultSet rs = prepare.getGeneratedKeys();
            if (rs.next()) {
                utilisateur.setId_filme(rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateur;
    }

    public static Livre enregistrerLivre(Livre livre) {
        try {
            PreparedStatement prepare =
                    this.connect
                            .prepareStatement(
                                    "insert into filme "
                                            + "(titulo, "
                                            + "descricao, ano) "
                                            + "values (?, ?, ?)"
                                    , Statement.RETURN_GENERATED_KEYS);

            prepare.setString(1, livre.getTitulo());
            prepare.setString(2, livre.getDescricao());
            prepare.setInt(3, livre.getAno());


            prepare.executeUpdate();


            ResultSet rs = prepare.getGeneratedKeys();
            if (rs.next()) {
                livre.setId_filme(rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livre;
    }

    public static void modifierUtilisateur() {

    }

    public static void modifierLivre() {

    }

    public static void fairePret() {

    }

    public static void faireRetour() {

    }
}
