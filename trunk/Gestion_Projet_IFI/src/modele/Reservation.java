package modele;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//\\\\\\\\*****Reservation*****//////////\\
//====Projet Gestion projet====\\
//****Promotion 17-IFI 2013****\\

public class Reservation {
	int id_reserv;
	int num_chambre;
	String nom_user;
	String prenom_user;
	String tel_user;
	String mail_user;
	String date_deb_reserv;
	String date_fin_reserv;
	String etat_reservation;

	// le constructeur
	public Reservation() {

		this.date_deb_reserv = "";
		this.date_fin_reserv = "";

	}

	public Reservation(int num_chambre, String nom_user, String prenom_user,
			String tel_user, String mail_user) {
		super();
		this.num_chambre = num_chambre;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.tel_user = tel_user;
		this.mail_user = mail_user;
		this.date_deb_reserv = "";
		this.date_fin_reserv = "";
		this.etat_reservation="";
		
	}

	public String getEtat_reservation() {
		return etat_reservation;
	}

	public void setEtat_reservation(String etat_reservation) {
		this.etat_reservation = etat_reservation;
	}

	public Reservation(String lib_reserv, String date_deb_reserv,
			String date_fin_reserv) {
		super();

		this.date_deb_reserv = date_deb_reserv;
		this.date_fin_reserv = date_fin_reserv;
	}

	// Getters & setters
	public int getId_reserv() {
		return id_reserv;
	}

	public void setId_reserv(int id_reserv) {
		this.id_reserv = id_reserv;
	}

	public int getNum_chambre() {
		return num_chambre;
	}

	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
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

	public void saveReservation() {
		DataBase base = new DataBase();
		ResultSet rs = null;
		Statement st = null;
		// String req =
		// "INSERT INTO \"Utilisateur\" (prenom_user,tel_user,mail_user,nom_user,adress_user)"
		// +
		// "VALUES('"+prenom+"','"+tel+"','"+mail+"','"+nom+"','"+adress+"')";
		String reqReserv = "INSERT INTO \"Reservation\"(num_chambre,date_deb_reserv,date_fin_reserv,"
				+ "nom_user,prenom_user,tel_user,mail_user) VALUES("
				+ this.num_chambre
				+ ",'"
				+ this.date_deb_reserv
				+ "','"
				+ this.date_fin_reserv
				+ "','"
				+ this.nom_user
				+ "','"
				+ this.prenom_user
				+ "','"
				+ this.tel_user
				+ "','"
				+ this.mail_user + "')";
		System.out.println(reqReserv);

		try {
			st = base.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			st.executeUpdate(reqReserv);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	//Modifier

	public void updateReservation() {
		DataBase base = new DataBase();
		ResultSet rs = null;
		Statement st = null;
		;
		String reqReserv = "UPDATE \"Reservation\" SET date_deb_reserv='"+this.getDate_deb_reserv()+ "'" +
				" , date_fin_reserv='"+this.getDate_fin_reserv()+"'"+", nom_user ='"+this.getNom_user()+"'"+
				",etat_reservation='"+this.getEtat_reservation()+"'"+",num_chambre="+this.getNum_chambre()+" WHERE id_reserv="+this.getId_reserv();
		
				
		System.out.println(reqReserv);

		try {
			st = base.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			st.executeUpdate(reqReserv);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// //Liste Reservatrion
	public ArrayList<Reservation> getListReservation(Reservation reservation) {
		DataBase base = new DataBase();
		ResultSet rs = null;
		Statement st = null;
		ArrayList<Reservation> listReservation = new ArrayList<Reservation>();

		try {
			st = base.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String requete= "" ;
			 if(reservation.getNum_chambre()==0)
				 requete="SELECT * FROM \"Reservation\" WHERE nom_user LIKE '%"+reservation.getNom_user()+"%' AND date_deb_reserv LIKE '%"+reservation.getDate_deb_reserv()+"%' AND date_fin_reserv LIKE '%"+reservation.getDate_fin_reserv()+"%'";
			 
			 else 
				 requete="SELECT * FROM \"Reservation\" WHERE nom_user LIKE '%"+reservation.getNom_user()+"%' AND date_deb_reserv LIKE '%"+reservation.getDate_deb_reserv()+"%' AND date_fin_reserv LIKE '%"+reservation.getDate_fin_reserv()+ "%' AND num_chambre= "+reservation.getNum_chambre();
			 System.out.println("Requete" + requete);
			 rs = st.executeQuery(requete);
			
			while (rs.next()) {
				Reservation reserv = new Reservation();
				reserv.id_reserv = rs.getInt("id_reserv");
				reserv.nom_user = rs.getString("nom_user");
				reserv.num_chambre = rs.getInt("num_chambre");
				reserv.date_deb_reserv = rs.getString("date_deb_reserv");
				reserv.date_fin_reserv = rs.getString("date_fin_reserv");
				reserv.etat_reservation=rs.getString("etat_reservation");

				listReservation.add(reserv);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listReservation;

	}

}
