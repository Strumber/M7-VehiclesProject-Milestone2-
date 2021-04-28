package com.vehicles.project;

public class Conductor extends Persona {
	protected int id;
	protected String tipusLicencia;
	protected int agnoL;
	protected int mesL;
	protected int diaL;
	
	public Conductor(String nom, String cognoms, int agno, int mes, int dia, int id, String tipusLicencia, int agnoL,
			int mesL, int diaL) {
		super(nom, cognoms, agno, mes, dia);
		this.id = id;
		this.tipusLicencia = tipusLicencia;
		this.agnoL = agnoL;
		this.mesL = mesL;
		this.diaL = diaL;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipusLicencia() {
		return tipusLicencia;
	}
	public void setTipusLicencia(String tipusLicencia) {
		this.tipusLicencia = tipusLicencia;
	}
	public int getAgnoL() {
		return agnoL;
	}
	public void setAgnoL(int agnoL) {
		this.agnoL = agnoL;
	}
	public int getMesL() {
		return mesL;
	}
	public void setMesL(int mesL) {
		this.mesL = mesL;
	}
	public int getDiaL() {
		return diaL;
	}
	public void setDiaL(int diaL) {
		this.diaL = diaL;
	}
	//crear to String

	@Override
	public String toString() {
		return "Conductor [ id= " + id + " nom=" + nom + ", cognoms=" + cognoms + "]"
				+ "\n Data Naixement :" + dia + "/" + mes+ "/"+agno 
				+ "\n tipus Llicencia=" + tipusLicencia 
				+ "\n Data caducitat Llicencia: " + agnoL + "/" + mesL + "/"+ diaL;
	}
	
}
