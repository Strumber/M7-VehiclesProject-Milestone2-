package com.vehicles.project;

public abstract class Persona {
	protected String nom;
	protected String cognoms;
	protected int agno;
	protected int mes;
	protected int dia;
	
	public Persona(String nom, String cognoms, int agno, int mes, int dia) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.agno = agno;
		this.mes = mes;
		this.dia = dia;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public int getAgno() {
		return agno;
	}
	public void setAgno(int agno) {
		this.agno = agno;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	

}
