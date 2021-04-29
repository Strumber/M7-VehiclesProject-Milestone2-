package com.vehicles.project;

import java.util.Scanner;

public class ConductorController {

	String nm;
	String cog;
	int ag;
	int m;
	int d;
	String tl;
	int agl;
	int ml;
	int dl;
	Scanner tecla = new Scanner(System.in);

	public void crearConductor(String Llic) throws Exception {
		int idC = 1;
		Boolean valtl = false;

		System.out.println("Introdueix el nom del Conductor");
		nm = tecla.nextLine();
		System.out.println("Introdueix els cognoms del Conductor");
		cog = tecla.nextLine();
		System.out.println("DATA NAIXEMENT");
		System.out.println("Introdueix l' any de neixement del conductor");
		ag = tecla.nextInt();
		System.out.println("Introdueix el mes de neixement del conductor");
		m = tecla.nextInt();
		System.out.println("Introdueix el dia de neixement del conductor");
		d = tecla.nextInt();
		System.out.println("Introdueix el tipus de Licencia (cotxe,moto,camio");
		do {

			tl = tecla.next();
			if (tl.equalsIgnoreCase(Llic)) {
				valtl = true;
			} else {
				System.out.println("Has introduït un tipus de licencia incorrecte, torna a introduïr");
				valtl = false;
			}
		} while (valtl == false);
		System.out.println("DATA CADUCITAT LLICENCIA");
		System.out.println("Introdueix any");
		agl = tecla.nextInt();
		System.out.println("introdueix mes");
		ml = tecla.nextInt();
		System.out.println("introdueix dia");
		dl = tecla.nextInt();

		Conductor conductor = new Conductor(nm, cog, ag, m, d, idC, tl, agl, ml, dl);

		System.out.println(conductor);

	}

}
