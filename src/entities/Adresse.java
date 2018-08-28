package entities;

public class Adresse {

    private int id_adresse;
    private String coordonner;
    private int nb;
    private String codepostal;
    private String complement;
    
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
