package com.vehicles.project;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Throwable {
		vehiclecontroller vc = new vehiclecontroller();
		ConductorController tc = new ConductorController();
		System.out.println("M7 vehicles - Milestone 2");
		//String tecla="n";
		String Llicencia;
		boolean validacio = false;
		Titular Titular1 = new Titular("Josep", "Solano", 1978, 02, 15, 1, "cotxe", 1999, 05, 12, "Si", "No");
		System.out.println(Titular1);
		int opciomenu = 0;
		Scanner opcio = new Scanner(System.in);
		do {
			
		
			System.out.println("-------------------------------------");
			System.out.println("¿Quin vehicle vols crear ?");
			System.out.println("-------------------------------------");
			System.out.println("1-Cotxe");
			System.out.println("2-moto");
			System.out.println("3-camió");
			System.out.println("-------------------------------------");

			System.out.println("Selecciona:");
			
			try {

				opciomenu = opcio.nextInt();
				validacio=true;
				//tecla = "s";
			} catch (Exception e) {
				System.out.println("Opció incorrecte selecciona 1, 2 o 3");
				validacio = false;
				//opciomenu=0;

			}
			//System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");
			//tecla = opcio.next();
		}while (validacio == false); 

		switch (opciomenu) {
		case 1:
			if (opciomenu == 1) {
				Llicencia = "cotxe";
				if (Llicencia.equals(Titular1.tipusLicencia)) {
					System.out.println("Llicencia correcte");
					vc.createCar();
				} else {
					System.out.println("El titular no te la Llicencia adecuada");
				}
			}
			break;
		case 2:
			if (opciomenu == 2) {
				Llicencia = "moto";
				if (Llicencia.equals(Titular1.tipusLicencia)) {
					System.out.println("Llicencia correcte");
					vc.createBike();
				} else {
					System.out.println("El titular no te la Llicencia adecuada");
				}
			}
			break;
		case 3:
			if (opciomenu == 3) {
				Llicencia = "camio";
				if (Llicencia.equals(Titular1.tipusLicencia)) {
					System.out.println("Llicencia correcte");
					vc.createTruck();
				} else {
					System.out.println("El titular no te la Llicencia adecuada");
				}
			}
			break;

		}

		System.out.println("-------------------------------------");
		System.out.println("\nEl titula serà el conductor ? (S/N)\n");

		opcio.close();

		// tc.crearConductor();
		/*
		 * String tecla ;// Per continuar fent operacions int opciomenu; Scanner opcio =
		 * new Scanner(System.in);
		 * 
		 * do { System.out.println("-------------------------------------");
		 * System.out.println("M7 vehicles - Milestone 2");
		 * System.out.println("-------------------------------------");
		 * System.out.println("1  - Crear cotxe");
		 * System.out.println("2  - Crear moto");
		 * System.out.println("3  - Crear camió"); System.out.println("4  - Sortir");
		 * opciomenu = opcio.nextInt();
		 * 
		 * if (opciomenu > 0 && opciomenu <= 4) { // Adaptar if al nombre d' opcions
		 * 
		 * switch (opciomenu) { case 1: vc.createCar(); break; case 2: vc.createBike();
		 * break; case 3: vc.createTruck(); case 4: // ec.eliminarEdifici(); return; }
		 * 
		 * } else { System.out.println("Introdueïx una opció correcte"); }
		 * 
		 * System.out.println("_______________________________________"); //
		 * System.out.println("Operacions amb edificis:"); //
		 * System.out.println("________________________");
		 * System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");
		 * 
		 * tecla = opcio.next();
		 * 
		 * } while (tecla.equals("s"));
		 * 
		 * opcio.close();
		 */

	}

}
