package com.vehicles.project;

public class Titular extends Conductor {
	private char assegurança;
	private char garatge;
	
	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, char assegurança, char garatge) {
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.assegurança = assegurança;
		this.garatge = garatge;
	}

	public char getAssegurança() {
		return assegurança;
	}

	public void setAssegurança(char assegurança) {
		this.assegurança = assegurança;
	}

	public char getGaratge() {
		return garatge;
	}

	public void setGaratge(char garatge) {
		this.garatge = garatge;
	}

	
	
	

	

}
