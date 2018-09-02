package entities;

import sql.SQLClass;

import java.sql.ResultSet;

public class Adresse {

    private int id_adresse;
    private String coordonner;
    private int nb;
    private String codepostal;
    private String complement;

    public Adresse() {
    }

    public Adresse(int id_adresse, String coordonner, int nb, String codepostal, String complement) {
        this.id_adresse = id_adresse;
        this.coordonner = coordonner;
        this.nb = nb;
        this.codepostal = codepostal;
        this.complement = complement;
    }

    public Adresse getAdresseById(int id) {
        Adresse andre = null;
        SQLClass.connect();
        try {
            ResultSet rs = SQLClass.executeQuery("SELECT id_adresse, coordonner, nb, codepostal, complement \n"
                    + "FROM adresse\n"
                    + "where id_adresse = "+ id +";");
            while (rs.next()) {
                int id_adresse = rs.getInt("id_adresse");
                String coordonner = rs.getString("coordonner");
                int nb = rs.getInt("nb");
                String codepostal = rs.getString("codepostal");;
                String complement = rs.getString("complement");;
                andre = new Adresse(id_adresse, coordonner, nb, codepostal, complement);
            }
            return andre;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClass.close();
        }
        return andre;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getCoordonner() {
        return coordonner;
    }

    public void setCoordonner(String coordonner) {
        this.coordonner = coordonner;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return nb + ", " + coordonner + ", " + complement + ", " + codepostal;
    }


}
