package provaUF2ex5;

public class Vehicle {

	private int vLimit;
	private int velocitatActual = 0;
	private boolean engegat = false;
	private String matricula;

	public Vehicle(int velocitatLimit, String matriculaCotxe) {
		vLimit = velocitatLimit;
		matricula = matriculaCotxe;
	}

	public void engega() {
		engegat = true;
		estatDelVehicle();
	}

	public void atura() {
		engegat = false;
		System.out.println("M'he aturat");
	}

	public void accelera() {
		final boolean noSuperaVelocitatLimit = (velocitatActual + 10) < vLimit;
		if (engegat && noSuperaVelocitatLimit) {
			velocitatActual += 10;
		}
		estatDelVehicle();
	}

	public void desaccelera() {
		final boolean enMoviment = velocitatActual > 0;
		if (engegat && enMoviment) {
			velocitatActual -= 10;
		}
		estatDelVehicle();
	}

	public void repararVehicle() {
		System.out.println("El cotxe amb matrícula " + matricula + " està  en reparació.");
	}

	private void estatDelVehicle() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + vLimit);
		System.out.println("Matrícula = " + matricula);
	}

}