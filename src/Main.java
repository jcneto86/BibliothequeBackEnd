
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import bibliotheque.FonctionsBibli;
import entities.*;
import sql.SQLClass;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //		ArrayList<Livre> livres = FonctionsBibli.rechercheLivre("Turcotte");
        //		ArrayList<Utilisateur> users = FonctionsBibli.rechercheUtilisateur("1");
        //
        //		for (int i = 0; i < livres.size(); i++) {
        //			Livre livre = livres.get(i);
        //			System.out.println(livre.toString());
        //		}
        //		System.out.println("\n");
        //		for (int i = 0; i < users.size(); i++) {
        //			Utilisateur user = users.get(i);
        //			System.out.println(user.toString());
        //		}
        //
        //
        //		if (FonctionsBibli.validerLogin("11", "123453")) {
        //			System.out.println("😀\n");
        //
        //		}else {
        //			System.out.println("☹️\n");
        //		}
        //		Utilisateur user = FonctionsBibli.utilisateurConnecte;
        //		System.out.println(user.toString());
        SQLClass.setDb("datatest");
        LocalDate data = LocalDate.now();
        System.out.println(data);
        System.out.println(data.toString());



        SQLClass.connect();
        try {
            SQLClass.executeQuery("INSERT INTO table_test VALUES (NULL, " + data.toString() + ");");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }


    }

}
