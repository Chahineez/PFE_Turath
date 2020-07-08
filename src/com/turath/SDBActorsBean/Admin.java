 package com.turath.SDBActorsBean;

public class Admin {
	private int id;
	private String mail;
	private String password;
	private String nom;
	private String prenom;
	


	public Admin(int id, String mail, String password, String nom, String prenom) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Admin( String mail, String password, String nom, String prenom) {
		super();
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;

	}
	

	public Admin(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}


	public Admin() {
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
	
}
