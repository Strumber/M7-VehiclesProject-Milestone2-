package com.vehicles.project;

public class Llicencia {
	protected int id;
	protected String tipusLicencia;
	protected String nomComplet;
	protected int agnoL;
	protected int mesL;
	protected int diaL;

	public Llicencia(String tipusLicencia) {
		this.tipusLicencia = tipusLicencia;

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

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
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
