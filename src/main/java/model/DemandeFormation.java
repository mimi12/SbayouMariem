package model;

public class DemandeFormation {

	public static final String REFUS = "refus";
	public static final String ACCORDE = "valide";
	public static final String ATTENTE = "en attente";

	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String dateDebut, String dateFin, String etatValidation) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String dateDebut, String dateFin) {

		this(dateDebut, dateFin, ATTENTE);
	}

	@Override
	public String toString() {
		return "DemandeFormation [dateDebut=" + dateDebut + ", dateDemande=" + dateDemande + ", dateFin=" + dateFin
				+ ", etatValidation=" + etatValidation + "]";
	}

}
