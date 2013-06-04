package fenetre;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Reservation extends JPanel {
	// Tableau pour choisir la date de reservation

	private String tabMois[] = new String[] { "Janvier", "F\u00E9vrier",
			"Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
			"Octobre", "Novembre", "D\u00E9cembre" };
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNomDuClient, lblPrenomDuClien, lblNoTel, lblMail,
			lblAdresse, lblDateDebReserv, lblDateFinReserv, lblJour, lblMois,lblAnnee;
	private JTextField txtFldNomClient, txtFldPrenomClient, txtFldNoTel,
			txtFldMail;
	private JTextArea textAdresse;

	public Reservation() {
		super();
		Calendar cal = new GregorianCalendar();

		this.setBackground(new Color(244, 247, 252));
		this.setSize(700,600);
		this.setLayout(null);

		contentPane = new JPanel();

		lblNomDuClient = new JLabel("Nom du client");
		lblNomDuClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNomDuClient.setBounds(30, 30, 120, 30);
		this.add(lblNomDuClient);

		txtFldNomClient = new JTextField();
		txtFldNomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldNomClient.setBounds(210, 30, 240, 30);
		this.add(txtFldNomClient);
		txtFldNomClient.setColumns(20);

		lblPrenomDuClien = new JLabel("Prenom du client");
		lblPrenomDuClien.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblPrenomDuClien.setBounds(30, 70, 140, 30);
		this.add(lblPrenomDuClien);

		txtFldPrenomClient = new JTextField();
		txtFldPrenomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldPrenomClient.setBounds(210, 70, 240, 30);
		this.add(txtFldPrenomClient);
		txtFldPrenomClient.setColumns(10);

		lblNoTel = new JLabel("Numero de telephone");
		lblNoTel.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNoTel.setBounds(30, 110, 180, 30);
		this.add(lblNoTel);

		txtFldNoTel = new JTextField();
		txtFldNoTel.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldNoTel.setBounds(210, 110, 240, 30);
		this.add(txtFldNoTel);
		txtFldNoTel.setColumns(10);

		lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblMail.setBounds(30, 150, 132, 30);
		this.add(lblMail);

		txtFldMail = new JTextField();
		txtFldMail.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldMail.setBounds(210, 150, 240, 30);
		this.add(txtFldMail);

		lblDateDebReserv = new JLabel("Date debut reservation");
		lblDateDebReserv.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblDateDebReserv.setBounds(30, 230, 200, 30);
		this.add(lblDateDebReserv);

		lblDateFinReserv = new JLabel("Date fin reservation");
		lblDateFinReserv.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblDateFinReserv.setBounds(30, 270, 200, 30);
		this.add(lblDateFinReserv);
		
		lblJour = new JLabel("Jour");
		lblJour.setFont(new Font("Bookman Old Style",Font.BOLD,14));
		lblJour.setBounds(140, 230, 100, 30);
		this.add(lblJour);
		
		///////Mois//////
		lblMois = new JLabel("Mois");
		lblMois.setFont(new Font("Bookman Old Style",Font.BOLD,14));
		lblMois.setBounds(180,230,120,30);
		this.add(lblMois);
		
		JSpinner jourArriv = new JSpinner();
		jourArriv.setBounds(220,230,120,30);
		jourArriv.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.add(jourArriv);
		
		
		//////Annee////////
	
		
		
	
	    setVisible(true);
	}

	public void setConsultationMode(boolean mode) {
		txtFldNomClient.setEditable(!mode);
		txtFldPrenomClient.setEditable(!mode);
		txtFldNoTel.setEditable(!mode);
		textAdresse.setEditable(!mode);
	}

	// public void fillWithClient(Client client){
	// txtFldNomClient.setText(client.getNom());
	// txtFldPrenomClient.setText(client.getPrenom());
	// txtFldNoTel.setText(client.getTelephone());
	// textAdresse.setText(client.getAdresse());
	// }
	//
	// public Client getInfoClient(){
	// Client client = new Client();
	//
	//
	// if (client.setTelephone(txtFldNoTel.getText())){
	// client.setNom(txtFldNomClient.getText());
	// client.setPrenom(txtFldPrenomClient.getText());
	// client.setAdresse(textAdresse.getText());
	// }
	// else{
	// client = null;
	// }
	//
	// return client;
	// }
}
