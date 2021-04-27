package com.vehicles.project;

public class Titular extends Conductor {
	private char asseguranša;
	private char garatge;
	
	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, char asseguranša, char garatge) {
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.asseguranša = asseguranša;
		this.garatge = garatge;
	}

	public char getAsseguranša() {
		return asseguranša;
	}

	public void setAsseguranša(char asseguranša) {
		this.asseguranša = asseguranša;
	}

	public char getGaratge() {
		return garatge;
	}

	public void setGaratge(char garatge) {
		this.garatge = garatge;
	}

	
	
	

	

}
