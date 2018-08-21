package entities;

import java.sql.SQLData;

public class Pret {
    private int id_pret; //INT NOT NULL AUTO_INCREMENT,
    private int employe; //INT NOT NULL,
    private SQLData date_retiree; //DATE NOT NULL,
    private SQLData date_retour; //DATE NOT NULL,
    private byte retourne; //BINARY(1) NOT NULL,

}
