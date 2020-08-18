package com.turath.SDBActorsBean;

public class Expert {

	private int id;
	private String mail;
	private String password;
	private String nom;
	private String prenom;
	private String etablissement;
	private boolean valide;
	private String piece_identity;
	private String diplome;



	

	public Expert(int id, String mail, String password, String nom, String prenom, String etablissement, String piece_identity, String diplome) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;
		this.piece_identity=piece_identity;
		this.diplome=diplome;

	}

	public Expert(int id, String mail, String password, String nom, String prenom, String etablissement,  boolean valide, String piece_identity, String diplome) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;
		this.valide=valide;
		this.piece_identity=piece_identity;
		this.diplome=diplome;
	}
	
	public Expert( String mail, String password, String nom, String prenom,  String etablissement, boolean valide, String piece_identity, String diplome) {
		super();
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement= etablissement;
		this.valide=valide;
		this.piece_identity=piece_identity;
		this.diplome=diplome;
	}
	

	public Expert(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}


	public Expert() {
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
	public String getPiece_identity() {
		return piece_identity;
	}

	public void setPiece_identity(String piece_identity) {
		this.piece_identity = piece_identity;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	
}
