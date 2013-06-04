package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import modele.DataBase;

//\\\\\\\\*****Chambre*****//////////\\
//====Projet Gestion projet====\\
//****Promotion 17-IFI 2013****\\

public class Chambre {

	int id_chambre;
	String etage_chambre;
	String nbre_lit;
	String prix_chambre;
	String dispo_chambre;
	String image_chambre;
	String descrip_chambre;
	int id_hotel;

	// /////le constructeur//////////

	public Chambre() {

		this.etage_chambre = "";
		this.nbre_lit = "";
		this.prix_chambre = "";
		this.dispo_chambre = "";
		this.image_chambre = "";
		this.descrip_chambre = "";
	}

	public Chambre(String etage_chambre, String nbre_lit, String prix_chambre,
			String dispo_chambre, String image_chambre, String descrip_chambre) {
		super();
		this.etage_chambre = etage_chambre;
		this.nbre_lit = nbre_lit;
		this.prix_chambre = prix_chambre;
		this.dispo_chambre = dispo_chambre;
		this.image_chambre = image_chambre;
		this.descrip_chambre = descrip_chambre;
	}

	// **Getters & Setters**\\
	public int getId_chambre() {
		return id_chambre;
	}

	public void setId_chambre(int id_chambre) {
		this.id_chambre = id_chambre;
	}

	public String getEtage_chambre() {
		return etage_chambre;
	}

	public void setEtage_chambre(String etage_chambre) {
		this.etage_chambre = etage_chambre;
	}

	public String getNbre_lit() {
		return nbre_lit;
	}

	public void setNbre_lit(String nbre_lit) {
		this.nbre_lit = nbre_lit;
	}

	public String getPrix_chambre() {
		return prix_chambre;
	}

	public void setPrix_chambre(String prix_chambre) {
		this.prix_chambre = prix_chambre;
	}

	public String getDispo_chambre() {
		return dispo_chambre;
	}

	public void setDispo_chambre(String dispo_chambre) {
		this.dispo_chambre = dispo_chambre;
	}

	public String getImage_chambre() {
		return image_chambre;
	}

	public void setImage_chambre(String image_chambre) {
		this.image_chambre = image_chambre;
	}

	public String getDescrip_chambre() {
		return descrip_chambre;
	}

	public void setDescrip_chambre(String descrip_chambre) {
		this.descrip_chambre = descrip_chambre;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

}
