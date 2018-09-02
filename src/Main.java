import entities.OevreLitteraire;
import net_biblio.Login;
import sql.SQLClass;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SQLClass.commit();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
