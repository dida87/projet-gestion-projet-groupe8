package modele;

import java.sql.Date;

//\\\\\\\\*****Reservation*****//////////\\
//====Projet Gestion projet====\\
//****Promotion 17-IFI 2013****\\

public class Reservation {
	int id_reserv;
	int id_chambre;
	int id_user;
	String lib_reserv;
	String date_deb_reserv;
	String date_fin_reserv;
	
	
	//le constructeur
	public Reservation (){
		this.lib_reserv="";
		this.date_deb_reserv="";
		this.date_fin_reserv="";
	
	}
	public Reservation(String lib_reserv, String date_deb_reserv,
			String date_fin_reserv) {
		super();
		this.lib_reserv = lib_reserv;
		this.date_deb_reserv = date_deb_reserv;
		this.date_fin_reserv = date_fin_reserv;
	}
	
	//Getters & setters	
	public int getId_reserv() {
		return id_reserv;
	}
	public void setId_reserv(int id_reserv) {
		this.id_reserv = id_reserv;
	}
	public int getId_chambre() {
		return id_chambre;
	}
	public void setId_chambre(int id_chambre) {
		this.id_chambre = id_chambre;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getLib_reserv() {
		return lib_reserv;
	}
	public void setLib_reserv(String lib_reserv) {
		this.lib_reserv = lib_reserv;
	}
	public String getDate_deb_reserv() {
		return date_deb_reserv;
	}
	public void setDate_deb_reserv(String date_deb_reserv) {
		this.date_deb_reserv = date_deb_reserv;
	}
	public String getDate_fin_reserv() {
		return date_fin_reserv;
	}
	public void setDate_fin_reserv(String date_fin_reserv) {
		this.date_fin_reserv = date_fin_reserv;
	}
	
	
	
	
}
