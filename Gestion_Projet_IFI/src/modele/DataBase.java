package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	public static Connection connection;
	Statement st;
	public DataBase() {
		setConnection(null);
		st = null;
		
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Driver JDBC manquant de PostgreSQL ? "
					+ "Inclure le driver dans le chemin de la librairie!");
			e.printStackTrace();
			return;

		}
		try {

			setConnection(DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/Gestion_Reservation_Hotel",
					"postgres", "postgres"));
		
			
		} catch (SQLException e) {

			System.out.println("Erreur de connection au serveur de la base de donnee! ");
			e.printStackTrace();
		}
	}

	public void insertFonction() {
		if (getConnection() != null) {
			System.out.println("Connection reussie!");

		}

	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		DataBase.connection = connection;
	}

}
