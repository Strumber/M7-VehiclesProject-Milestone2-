package com.vehicles.project;

public class Titular extends Conductor {
	protected String assegurança;
	protected String garatge;

	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, String assegurança, String garatge) {
		// super();
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.assegurança = "si";
		this.garatge = "no";
	}

	public String getAssegurança() {
		return assegurança;
	}

	public void setAssegurança(String assegurança) {
		this.assegurança = assegurança;
	}

	public String getGaratge() {
		return garatge;
	}

	public void setGaratge(String garatge) {
		this.garatge = garatge;
	}

	@Override
	public String toString() {
		return "Titular [Id " + id + " Nom: " + nom + ", cognoms=" + cognoms + " ]" + "\n Data Naixement :" + dia + "/"
				+ mes + "/" + agno + "\n Tipus Licencia " + tipusLicencia + "\n Data Caducitat :" + diaL + "/" + mesL
				+ "/" + agnoL + "\n Assegurança= " + assegurança + "\n Garatge= " + garatge;
	}

}
