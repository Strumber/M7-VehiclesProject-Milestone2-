package com.vehicles.project;

public class Titular extends Conductor {
	private String asseguranša;
	private String garatge;
	
	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, String asseguranša, String garatge) {
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.asseguranša = "si";
		this.garatge = "no";
	}

	
	public String getAsseguranša() {
		return asseguranša;
	}

	public void setAsseguranša(String asseguranša) {
		this.asseguranša = asseguranša;
	}

	public String getGaratge() {
		return garatge;
	}

	public void setGaratge(String garatge) {
		this.garatge = garatge;
	}


	@Override
	public String toString() {
		return "Titular [Id "+id +" Nom: " + nom + ", cognoms=" + cognoms +" ]"
				+ "\n Data Naixement :" + dia + "/" + mes+ "/"+agno 
				+ "\n Tipus Licencia " + tipusLicencia
				+"\n Data Caducitat :" + diaL + "/" + mesL+ "/"+agnoL 
				+ "\n Asseguranša= " + asseguranša + "\n Garatge= " + garatge ;
	}

	
	
	

	

}
