 package com.turath.SDBActorsBean;

public class Architecte {
	private int id;
	private String mail;
	private String password;
	private String nom;
	private String prenom;
	private String etablissement;
	private boolean valide;

	
	public Architecte(int id, String mail, String password, String nom, String prenom, String etablissement) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;

	}

	public Architecte(int id, String mail, String password, String nom, String prenom, String etablissement,  boolean valide) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;
		this.valide=valide;
	}
	
	public Architecte( String mail, String password, String nom, String prenom,  String etablissement, boolean valide) {
		super();
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;
		this.valide=valide;
	}
	

	public Architecte(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}


	public Architecte() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
	this.id=id;	
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}
	
}
