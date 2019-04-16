package model;

import java.util.ArrayList;
import java.util.List;

public class Employe {
	private int id;
	private String nom;
	private String prenom;

	private List<DemandeFormation> formations = new ArrayList<>();

	public Employe(List<DemandeFormation> formations) {
		super();
		this.formations = formations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<DemandeFormation> getFormations() {
		return formations;
	}

	public void setFormations(List<DemandeFormation> formations) {
		this.formations = formations;
	}

	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}



	public void demanderFormation(DemandeFormation formation) {
		formations.add(formation);

		System.out.println("l'employe " + prenom + " " + nom + "demande le congès du " + formation.getDateDebut()
				+ "au " + formation.getDateFin());

	}

	public List<DemandeFormation> consulter() {
		return formations;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
