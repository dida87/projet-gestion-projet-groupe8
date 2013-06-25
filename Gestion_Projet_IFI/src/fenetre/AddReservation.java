package fenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modele.Chambre;
import modele.Reservation;

public class AddReservation extends JPanel {
	// Tableau pour choisir la date de reservation

	public String tabMois[] = new String[] { "Janvier", "F\u00E9vrier", "Mars",
			"Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre",
			"Novembre", "D\u00E9cembre" };
	public String tabJour[];
	public String tabChambre[];

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel imageLabel;
	private JLabel lblNomClient, lblPrenomClient, lblTelClient, lblMailClient,
			lblAdresse, lblDateDebReserv, lblDateFinReserv, lblJour, lblMois,
			lblAnnee;
	private JTextField txtFldNomClient, txtFldPrenomClient, txtFldTelClient,
			txtFldMailClient;
	private JTextArea textAdresse;
	private JButton btnAjouter, btnTerminer, btnAnnuler;
	public String tabAnnee[] = new String[8];
	JComboBox comboBoxJourArriv, comboBoxMoisArr, comboBoxAnArr,
			comboBoxJourDepart, comboBoxMoisDep, comboBoxAnDep,
			comboBoxNumChambre, comboBoxEtat;

	public AddReservation() {
		super();
		Calendar cal = new GregorianCalendar();

		this.setBackground(new Color(244, 247, 252));
		this.setSize(1200, 900);
		this.setLayout(null);

		contentPane = new JPanel();
		imageLabel = new JLabel(new ImageIcon());
		imageLabel.setPreferredSize(new Dimension(240, 200));
		imageLabel.setBounds(380, 380, 800, 260);
		this.add(imageLabel);
		// Nom client
		lblNomClient = new JLabel("Nom client");
		lblNomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNomClient.setForeground(Color.blue);
		lblNomClient.setBounds(300, 30, 180, 30);
		this.add(lblNomClient);

		txtFldNomClient = new JTextField();
		txtFldNomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldNomClient.setBounds(460, 30, 240, 30);
		this.add(txtFldNomClient);

		// prenom Client
		lblPrenomClient = new JLabel("Prénom client");
		lblPrenomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblPrenomClient.setForeground(Color.blue);
		lblPrenomClient.setBounds(300, 70, 180, 30);
		this.add(lblPrenomClient);

		txtFldPrenomClient = new JTextField();
		txtFldPrenomClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldPrenomClient.setBounds(460, 70, 240, 30);
		this.add(txtFldPrenomClient);

		// numero telephone
		lblTelClient = new JLabel("Numéro téléphone");
		lblTelClient.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblTelClient.setForeground(Color.blue);
		lblTelClient.setBounds(300, 110, 180, 30);
		this.add(lblTelClient);

		txtFldTelClient = new JTextField();
		txtFldTelClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldTelClient.setBounds(460, 110, 240, 30);
		this.add(txtFldTelClient);

		// mail
		lblMailClient = new JLabel("Mail client");
		lblMailClient.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblMailClient.setForeground(Color.blue);
		lblMailClient.setBounds(300, 150, 180, 30);
		this.add(lblMailClient);

		txtFldMailClient = new JTextField();
		txtFldMailClient.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFldMailClient.setBounds(460, 150, 240, 30);
		this.add(txtFldMailClient);

		// Debut Reservation
		lblDateDebReserv = new JLabel("Début reservation");
		lblDateDebReserv.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblDateDebReserv.setForeground(Color.blue);
		lblDateDebReserv.setBounds(300, 190, 230, 30);
		this.add(lblDateDebReserv);

		comboBoxJourArriv = new JComboBox();
		comboBoxJourArriv.setBounds(460, 190, 60, 30);
		tabJour = new String[31];
		for (int i = 1; i <= 31; i++) {
			tabJour[i - 1] = String.valueOf(i);
		}
		comboBoxJourArriv.setModel(new DefaultComboBoxModel(tabJour));
		this.add(comboBoxJourArriv);

		// Mois
		comboBoxMoisArr = new JComboBox();
		comboBoxMoisArr.setModel(new DefaultComboBoxModel(tabMois));
		comboBoxMoisArr.setBounds(520, 190, 110, 30);
		this.add(comboBoxMoisArr);

		// year
		int j = 0;
		for (int i = 2013; i < (2013 + tabAnnee.length); i++) {
			tabAnnee[j] = String.valueOf(i);
			j++;
		}

		comboBoxAnArr = new JComboBox();
		comboBoxAnArr.setModel(new DefaultComboBoxModel(tabAnnee));
		comboBoxAnArr.setBounds(640, 190, 70, 30);
		this.add(comboBoxAnArr);

		// Date fin reservation
		lblDateFinReserv = new JLabel("Fin reservation");
		lblDateFinReserv.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblDateFinReserv.setForeground(Color.blue);
		lblDateFinReserv.setBounds(300, 230, 230, 30);
		this.add(lblDateFinReserv);

		// jour

		comboBoxJourDepart = new JComboBox();
		comboBoxJourDepart.setBounds(460, 230, 60, 30);
		comboBoxJourDepart.setModel(new DefaultComboBoxModel(tabJour));
		this.add(comboBoxJourDepart);

		// moi
		comboBoxMoisDep = new JComboBox();
		comboBoxMoisDep.setModel(new DefaultComboBoxModel(tabMois));
		comboBoxMoisDep.setBounds(520, 230, 110, 30);
		this.add(comboBoxMoisDep);

		// annee
		// year
		int k = 0;
		for (int i = 2013; i < (2013 + tabAnnee.length); i++) {
			tabAnnee[k] = String.valueOf(i);
			k++;
		}

		comboBoxAnDep = new JComboBox();
		comboBoxAnDep.setModel(new DefaultComboBoxModel(tabAnnee));
		comboBoxAnDep.setBounds(640, 230, 70, 30);
		this.add(comboBoxAnDep);

		// Categorie Chambre
		JLabel lblCategorieChambre = new JLabel("Numéro chambre");
		lblCategorieChambre.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblCategorieChambre.setForeground(Color.blue);
		lblCategorieChambre.setBounds(300, 270, 180, 30);
		this.add(lblCategorieChambre);

		// Initialisation de liste de chambre
		Chambre chambre = new Chambre();
		ArrayList<Chambre> listeChambre = chambre.getListChambre();
		tabChambre = new String[listeChambre.size()];
		for (int l = 0; l < tabChambre.length; l++) {
			Chambre c = listeChambre.get(l);
			tabChambre[l] = String.valueOf(c.getNum_chambre());
		}

		comboBoxNumChambre = new JComboBox(tabChambre);
		comboBoxNumChambre
				.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		comboBoxNumChambre.setBounds(460, 270, 110, 30);
		this.add(comboBoxNumChambre);

		// Boutons
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Reservation reserv = new Reservation();
				reserv.setNom_user(txtFldNomClient.getText());
				reserv.setPrenom_user(txtFldPrenomClient.getText());
				reserv.setTel_user(txtFldTelClient.getText());
				reserv.setMail_user(txtFldMailClient.getText());
				reserv.setNum_chambre(Integer.valueOf(comboBoxNumChambre
						.getSelectedItem().toString()));

				int reservJour = comboBoxJourArriv.getSelectedIndex() + 1;
				if (reservJour == 0)
					reservJour = 1;
				int reservMoi = comboBoxMoisArr.getSelectedIndex() + 1;
				if (reservMoi == 0)
					reservMoi = 1;
				int reservAn = Integer.valueOf(comboBoxAnArr.getSelectedItem()
						.toString());
				int reservJourDep = comboBoxJourDepart.getSelectedIndex() + 1;
				if (reservJourDep == 0)
					reservJourDep = 1;
				int reservMoiDep = comboBoxMoisDep.getSelectedIndex() + 1;
				if (reservMoiDep == 0)
					reservMoiDep = 1;
				int reservAnDep = Integer.valueOf(comboBoxAnDep
						.getSelectedItem().toString());
				String dateReserv = TransformDate(reservJour) + "/"
						+ TransformDate(reservMoi) + "/"
						+ String.valueOf(reservAn);
				String dateReservDep = TransformDate(reservJourDep) + "/"
						+ TransformDate(reservMoiDep) + "/"
						+ String.valueOf(reservAnDep);

				reserv.setDate_deb_reserv(dateReserv);
				reserv.setDate_fin_reserv(dateReservDep);
				reserv.saveReservation();

			}
		});
		// btnAjouter.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_AJOUTER));

		btnAjouter.setFont(new Font("Bookman Old Style", Font.BOLD, 15));

		btnAjouter.setBounds(320, 350, 100, 36);
		this.add(btnAjouter);

		// JButton btnTerminer = new JButton("Terminer");
		// btnTerminer.addActionListener (new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
		// btnTerminer.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_TERMINER));

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtFldNomClient.setText("");
				txtFldPrenomClient.setText("");
				txtFldTelClient.setText("");
				txtFldMailClient.setText("");

			}
		});
		// btnAnnuler.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_ANNULER_RESERVATION));

		btnAnnuler.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		btnAnnuler.setBounds(590, 350, 100, 36);
		this.add(btnAnnuler);

		setVisible(true);
	}

	public void setConsultationMode(boolean mode) {
		txtFldNomClient.setEditable(!mode);
		txtFldPrenomClient.setEditable(!mode);
		txtFldTelClient.setEditable(!mode);
		txtFldMailClient.setEditable(!mode);

	}

	public String TransformDate(int jour) {
		String result = "0";
		if (jour <= 9) {
			result += String.valueOf(jour);
		} else
			result = String.valueOf(jour);
		return result;
	}

}
