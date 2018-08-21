package entities;

public class Edition {

    private int id_edition; // INT NOT NULL AUTO_INCREMENT,
    private int id_maison_edition; // INT NOT NULL,
    private int id_oeuvre_litteraire; // INT NOT NULL,
    private int annee; /// INT NOT NULL,
    private String edition; // VARCHAR(45) NOT NULL,
    private int nb_pages; // INT NOT NULL,
    private String isbn; // VARCHAR(45) NOT NULL,
    private String description; // VARCHAR(45) NOT NULL,
    private byte rarete; // BINARY(1) NOT NULL,

}
