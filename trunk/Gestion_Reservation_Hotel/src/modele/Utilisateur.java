package modele;

//\\\\\\\\*****Utilisateur*****//////////\\
//====Projet Gestion projet====\\
//****Promotion 17-IFI 2013****\\

public class Utilisateur {
	int id_user;
	String nom_user;
	String prenom_user;
	String adress_user;
	String tel_user;
	String mail_user;
	
	
	//Le constructeur
	public Utilisateur(){
		this.nom_user="";
		this.prenom_user="";
		this.adress_user="";
		this.tel_user="";
		this.mail_user="";
	}
	public Utilisateur(int id_user, String nom_user, String prenom_user,
			String adress_user, String tel_user, String mail_user) {
		super();
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.adress_user = adress_user;
		this.tel_user = tel_user;
		this.mail_user = mail_user;
	}
	
	//Getters & Setters
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getPrenom_user() {
		return prenom_user;
	}
	public void setPrenom_user(String prenom_user) {
		this.prenom_user = prenom_user;
	}
	public String getAdress_user() {
		return adress_user;
	}
	public void setAdress_user(String adress_user) {
		this.adress_user = adress_user;
	}
	public String getTel_user() {
		return tel_user;
	}
	public void setTel_user(String tel_user) {
		this.tel_user = tel_user;
	}
	public String getMail_user() {
		return mail_user;
	}
	public void setMail_user(String mail_user) {
		this.mail_user = mail_user;
	}
	

	
	

}
