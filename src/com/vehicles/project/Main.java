package com.vehicles.project;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Throwable {
		vehiclecontroller vc = new vehiclecontroller();
		ConductorController cc = new ConductorController();
		System.out.println("M7 vehicles - Milestone 2");
		String tecla;
		String Llicencia;
		boolean validacio = false;
		Titular Titular1 = new Titular("Josep", "Solano", 1978, 02, 15, 1, "cotxe", 1999, 05, 12, "Si", "No");
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
				validacio=true;
				
			} catch (Exception e) {
				System.out.println("Opció incorrecte selecciona 1, 2 o 3"); 
				opcio.nextLine();
				validacio = false;
				

			}
			
		}while (!validacio); 
			
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
		System.out.println("\nEl titular serà el conductor ? (S/N)\n");
		opcio.nextLine();
		tecla = opcio.nextLine();
		if (tecla.equalsIgnoreCase("s")) {
			Conductor cTitular = new Conductor(Titular1.nom,Titular1.cognoms,Titular1.agno,
					Titular1.mes,Titular1.dia,opciomenu, Titular1.tipusLicencia,Titular1.agnoL,
					Titular1.mesL,Titular1.diaL);
			System.out.println("El conductor sera el Titular : ");
			System.out.println(cTitular);
			
		}else if(tecla.equalsIgnoreCase("n")) {
				cc.crearConductor();
		}else {
			System.out.println("L' opcio escollida es incorrecte");
		}
		
		
		System.out.println("Fi programa");
		
		

	}

}
