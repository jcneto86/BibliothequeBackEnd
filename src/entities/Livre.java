package entities;

public class Livre {
	
	private String titre;
	private String nomauteur;
	private int annee;
	private String edition; 
	private int nb_pages; 
	private String maison_edition; 
	private String corridor; 
	private String cote; 
	private String rangee;
	private String rayon;
	private String position; 
	private int id_exemplaire;
	
	
	public Livre(String titre, String nomauteur, int annee, String edition, int nb_pages, String maison_edition,
			String corridor, String cote, String rangee, String rayon, String position, int id_exemplaire) {
		super();
		this.titre = titre;
		this.nomauteur = nomauteur;
		this.annee = annee;
		this.edition = edition;
		this.nb_pages = nb_pages;
		this.maison_edition = maison_edition;
		this.corridor = corridor;
		this.cote = cote;
		this.rangee = rangee;
		this.rayon = rayon;
		this.position = position;
		this.id_exemplaire = id_exemplaire;
	}
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomauteur() {
		return nomauteur;
	}
	public void setNomauteur(String nomauteur) {
		this.nomauteur = nomauteur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getNb_pages() {
		return nb_pages;
	}
	public void setNb_pages(int nb_pages) {
		this.nb_pages = nb_pages;
	}
	public String getMaison_edition() {
		return maison_edition;
	}
	public void setMaison_edition(String maison_edition) {
		this.maison_edition = maison_edition;
	}
	public String getCorridor() {
		return corridor;
	}
	public void setCorridor(String corridor) {
		this.corridor = corridor;
	}
	public String getCote() {
		return cote;
	}
	public void setCote(String cote) {
		this.cote = cote;
	}
	public String getRangee() {
		return rangee;
	}
	public void setRangee(String rangee) {
		this.rangee = rangee;
	}
	public String getRayon() {
		return rayon;
	}
	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getId_exemplaire() {
		return id_exemplaire;
	}
	public void setId_exemplaire(int id_exemplaire) {
		this.id_exemplaire = id_exemplaire;
	}


	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", nomauteur=" + nomauteur + ", annee=" + annee + ", edition=" + edition
				+ ", nb_pages=" + nb_pages + ", maison_edition=" + maison_edition + ", corridor=" + corridor + ", cote="
				+ cote + ", rangee=" + rangee + ", rayon=" + rayon + ", position=" + position + ", id_exemplaire="
				+ id_exemplaire + "]";
	}
	
	

}
