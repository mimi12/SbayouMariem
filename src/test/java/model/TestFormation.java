package model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFormation {
	private Employe e = new Employe(1, "Mimi", "Sb");
	private Manager m = new Manager(1, "Mimi", "Sb");

	@BeforeEach
	public void initialisation() {

		DemandeFormation df1 = new DemandeFormation("000", "Tom");
		DemandeFormation df2 = new DemandeFormation("000", "yann");
		e.demanderFormation(df1);
		m.demanderFormation(df2);

	}

	@Test
	public void employeAvoirFormationAccorder() {
		List<DemandeFormation> formationEmploye = e.getFormations();
		for (DemandeFormation dm : formationEmploye) {

			assertTrue(DemandeFormation.ATTENTE.equals(dm.getEtatValidation()));
		}

	}

	@Test
	public void managerAvoirFormationAccorder() {
		List<DemandeFormation> formationManager = m.consulter();
		for (DemandeFormation dm2 : formationManager) {

			assertTrue(DemandeFormation.ACCORDE.equals(dm2.getEtatValidation()));
		}

	}

}