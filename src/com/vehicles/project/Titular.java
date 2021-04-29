package com.vehicles.project;

public class Titular extends Conductor {
	protected String asseguran�a;
	protected String garatge;

	public Titular(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL, String asseguran�a, String garatge) {
		// super();
		super(nom, cognoms, agno, mes, dia, id, tipusLicencia, agnoL, mesL, diaL);
		this.asseguran�a = "si";
		this.garatge = "no";
	}

	public String getAsseguran�a() {
		return asseguran�a;
	}

	public void setAsseguran�a(String asseguran�a) {
		this.asseguran�a = asseguran�a;
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
				+ "/" + agnoL + "\n Asseguran�a= " + asseguran�a + "\n Garatge= " + garatge;
	}

}
