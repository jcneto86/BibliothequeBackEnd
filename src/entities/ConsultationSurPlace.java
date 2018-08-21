package entities;

import java.sql.SQLData;

public class ConsultationSurPlace {
    private int id_consultation_sur_place; // INT NOT NULL AUTO_INCREMENT,
    private int id_utilisateur; // INT NOT NULL,
    private int id_exemplaire; // INT NOT NULL,
    private int employe; // id_utilisateur,
    private SQLData data; // DATETIME NOT NULL,
    private String periode; // VARCHAR(15) NOT NULL,
}
