package com.vehicles.project;

public class Titular extends Conductor {
	private char asseguran�a;
	private char garatge;
	
	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, char asseguran�a, char garatge) {
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.asseguran�a = asseguran�a;
		this.garatge = garatge;
	}

	public char getAsseguran�a() {
		return asseguran�a;
	}

	public void setAsseguran�a(char asseguran�a) {
		this.asseguran�a = asseguran�a;
	}

	public char getGaratge() {
		return garatge;
	}

	public void setGaratge(char garatge) {
		this.garatge = garatge;
	}

	
	
	

	

}
