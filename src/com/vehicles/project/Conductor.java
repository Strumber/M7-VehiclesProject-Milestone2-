package com.vehicles.project;

public class Conductor extends Persona {
	private int id;
	private String tipusLicencia;
	private int agnoL;
	private int mesL;
	private int diaL;
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
	
}