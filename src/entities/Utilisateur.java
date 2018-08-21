package entities;

public class Utilisateur {

    private int id_utilisateur; //INT NOT NULL AUTO_INCREMENT,
    private int id_adresse; //INT NULL,
    private String nom; //VARCHAR(128) NOT NULL,
    private String nom_de_famille; //VARCHAR(128) NOT NULL,
    private String email; //VARCHAR(128) NOT NULL,
    private String password; //BLOB NOT NULL,
    private String telephone; //VARCHAR(126) NOT NULL,
    private String permission; //VARCHAR(45) NOT NULL,
}
