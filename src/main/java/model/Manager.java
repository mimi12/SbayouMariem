package model;

public class Manager extends Employe {

	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void demanderFormation(DemandeFormation formation) {
		super.demanderFormation(formation);
		formation.setEtatValidation(formation.ACCORDE);
	}

}
