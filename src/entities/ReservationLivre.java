package entities;

import java.sql.SQLData;

public class ReservationLivre {
    private int id_reservation_livre; // INT NOT NULL,
    private int id_exemplaire; // INT NOT NULL,
    private int id_utilisateur; // INT NOT NULL,
    private SQLData date; // DATE NULL,
    private byte complete; // BINARY(1) NULL,
}
