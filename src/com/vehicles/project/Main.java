package com.vehicles.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Throwable {
		vehiclecontroller vc = new vehiclecontroller();
		ConductorController cc = new ConductorController();
		System.out.println("M7 vehicles - Milestone 2");
		String tecla;
		String tipusLicencia = "";
		Llicencia Llic = new Llicencia(tipusLicencia);

		boolean validacio = false;
		Titular Titular1 = new Titular("Josep", "Solano", 1978, 02, 15, 1, "moto", 1999, 05, 12, "Si", "No");
		System.out.println(Titular1);
		int opciomenu = 0;
		Scanner opcio = new Scanner(System.in);

		System.out.println("-------------------------------------");
		System.out.println("¿Quin vehicle vols crear ?");
		System.out.println("-------------------------------------");
		System.out.println("1-Cotxe");
		System.out.println("2-moto");
		System.out.println("3-camió");
		System.out.println("-------------------------------------");

		System.out.println("Selecciona:");
		do {
			try {

				opciomenu = opcio.nextInt();
				validacio = true;

			} catch (Exception e) {
				System.out.println("Opció incorrecte selecciona 1, 2 o 3");
				opcio.nextLine();
				validacio = false;

			}

			validacio = false;

			switch (opciomenu) {
			case 1:
				if (opciomenu == 1) {
					Llic.setTipusLicencia("cotxe");
					if (Llic.getTipusLicencia().equalsIgnoreCase(Titular1.tipusLicencia)) {
						System.out.println("Llicencia correcte");
						vc.createCar();
						validacio = true;
					} else {
						System.out.println("El titular no te la Llicencia adecuada");
						validacio = false;

					}
				}
				break;
			case 2:
				if (opciomenu == 2) {
					Llic.setTipusLicencia("moto");
					if (Llic.getTipusLicencia().equalsIgnoreCase(Titular1.tipusLicencia)) {
						System.out.println("Llicencia correcte");
						vc.createBike();
						validacio = true;
					} else {
						System.out.println("El titular no te la Llicencia adecuada");
						validacio = false;
					}
				}
				break;
			case 3:
				if (opciomenu == 3) {
					Llic.setTipusLicencia("camio");
					if (Llic.getTipusLicencia().equalsIgnoreCase(Titular1.tipusLicencia)) {
						System.out.println("Llicencia correcte");
						vc.createTruck();
						validacio = true;
					} else {
						System.out.println("El titular no te la Llicencia adecuada");
						validacio = false;
					}
				}
				break;

			}
		} while (!validacio);

		System.out.println("-------------------------------------");
		System.out.println("\nEl titular serà el conductor ? (S/N)\n");
		validacio = false;
		do {
			opcio.nextLine();
			tecla = opcio.nextLine();
			if (tecla.equalsIgnoreCase("s")) {
				Conductor cTitular = new Conductor(Titular1.nom, Titular1.cognoms, Titular1.agno, Titular1.mes,
						Titular1.dia, opciomenu, Titular1.tipusLicencia, Titular1.agnoL, Titular1.mesL, Titular1.diaL);
				System.out.println("El conductor sera el Titular : ");
				System.out.println(cTitular);
				validacio = true;

			} else if (tecla.equalsIgnoreCase("n")) {
				cc.crearConductor(Llic.getTipusLicencia());
				validacio = true;
			} else {
				System.out.println("L' opcio escollida es incorrecte");
				validacio = false;
			}
		} while (!validacio);

		System.out.println("Fi programa");

	}

}
