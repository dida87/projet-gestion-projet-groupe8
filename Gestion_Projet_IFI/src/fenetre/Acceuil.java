package fenetre;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;

import modele.Chambre;
import modele.Reservation;
import controle.MyTableModel;

@SuppressWarnings("serial")
public class Acceuil extends JFrame implements ActionListener {
	private JPanel jPanel1, jPanel4;
	private JButton jButton1;

	static public int database = 1;
	private ButtonGroup bg = new ButtonGroup();
	private JTabbedPane jTabbedPane1;
	private JButton jButton2;

	MyTableModel listChambreModel, listReservatioModel;

	String[] columnNames = { "CHAMBRES", "DÉSCRIPTIONS" };
	String[] colReserv = { "Client", "Numéro Chambre", "Début Réservation",
			"Fin Réservation", "État" };
	String tabEtat[] = { "confirmee", "en cours", "annulee" };
	JTable listChambreTab, listReservTab;
	ArrayList<Chambre> listChambre;
	ArrayList<Reservation> listeReserv;
	JTextField txtNomUser, txtNumChambre, txtDateDeb, txtDateFin;
	JButton butSarch, butCharger, butModifier;
	JComboBox comboBoxEtat;
	int reservSelected = -1;

	public Acceuil() {

		try {
			UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager
					.getLookAndFeel());

		} catch (Exception e) {

		}
		initGUI();

	}

	private void initGUI() {
		try {

			// BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Gestion de Reservation de Chambre d'Hotel");
			// etablir le panel de l'entete
			// jPanel1 = new JPanel();
			etablishEntete();

			jTabbedPane1 = new JTabbedPane();
			jTabbedPane1.setBounds(0, 320, 1000, 750);

			// etablir l'onglet Accueil
			etablishAccueil();

			// etablir l'onglet Chambre
			etablishChambrePanel();

			// etablir l'onglet Reservation
			etablishReservPanel();

			// etablir l'onglet Contact
			etablishListReservPanel();

			getContentPane().add(jTabbedPane1);

			this.setSize(1000, 860);
			this.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@SuppressWarnings("static-access")
			public void run() {
				Acceuil inst = new Acceuil();
				// inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				// inst.setExtendedState(inst.MAXIMIZED_BOTH);
			}
		});

	}

	// entete panel
	public void etablishEntete() {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1000, 320);
		jPanel.setLayout(null);
		JLabel labelBack = new JLabel(new ImageIcon("image/hotel-pics.png"));
		labelBack.setBounds(120, 20, 800, 300);

		jPanel.add(labelBack);// etablishIma // jPanel =
								// c.setChambre(jPanel);ge();

		this.getContentPane().add(jPanel);
	}

	// etablir les panels
	public void etablishAccueil() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		jPanel.setBounds(0, 320, 1000, 400);

		// JLabel labelBack1 = new JLabel(new ImageIcon("image/acceuil.jpeg"));
		// labelBack1.setBounds(5, 0, 200, 200);
		// jPanel.add(labelBack1);

		jTabbedPane1.addTab("Acceuil", null, jPanel, null);
		Clock clock = new Clock();

		clock.setBounds(400, 400, 50, 50);

		jPanel.add(clock);

		JLabel imageLab = null;
		JLabel imageLab1 = null;
		JLabel imageLab2 = null;
		JLabel imageLab3 = null;
		// JLabel imageLab4 = null;

		try {
			BufferedImage picture = ImageIO.read(new File("image/C5.jpeg"));
			imageLab = new JLabel(new ImageIcon(picture));

			BufferedImage picture1 = ImageIO.read(new File("image/C2.jpeg"));
			imageLab1 = new JLabel(new ImageIcon(picture1));

			BufferedImage picture2 = ImageIO.read(new File("image/C3.jpeg"));
			imageLab2 = new JLabel(new ImageIcon(picture2));

			// BufferedImage picture3 = ImageIO.read(new File("image/C.jpeg"));
			// imageLab3 = new JLabel(new ImageIcon(picture3));

			// BufferedImage picture4 = ImageIO.read(new File("image/C8.jpeg"));
			// imageLab4 = new JLabel (new ImageIcon(picture4));
		} catch (IOException e) {
			e.printStackTrace();
		}

		imageLab.setBounds(20, 10, 200, 150);
		// imageLab1.setPreferredSize(new Dimension(300, 150));
		imageLab1.setBounds(20, 185, 200, 150);
		// imageLab2.setPreferredSize(new Dimension(300, 150));
		imageLab2.setBounds(20, 360, 200, 130);
		// imageLab3.setPreferredSize(new Dimension(300, 150));
		// imageLab3.setBounds(20,470, 200, 150);
		// imageLab4.setPreferredSize(new Dimension(320,220));

		jPanel.add(imageLab);
		jPanel.add(imageLab1);
		jPanel.add(imageLab2);
		// etablishImage();

	}

	// etablir l'onglet chambre
	public void etablishChambrePanel() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		jPanel.setBounds(0, 320, 1000, 450);
		// ListChambre c = new ListChambre();
		// jPanel = c.setChambre(jPanel);

		JLabel entete = new JLabel("Liste des chambres");
		entete.setFont(new java.awt.Font("Century Schoolbook L",
				java.awt.Font.BOLD, 17));
		entete.setForeground(Color.blue);
		entete.setBounds(400, 5, 250, 30);

		listChambreModel = new MyTableModel(columnNames);
		listChambreTab = new JTable();
		listChambreTab.setModel(listChambreModel);
		listChambreTab.setOpaque(false);
		listChambreTab.setRowHeight(150);
		listChambreTab.setGridColor(Color.darkGray);
		listChambreTab.setShowGrid(true);

		JScrollPane scroll = new JScrollPane(listChambreTab);
		scroll.setBounds(200, 45, 580, 450);

		jPanel.add(entete);
		jPanel.add(scroll);
		updateInitialDataTable();
		jTabbedPane1.addTab("Chambre", null, jPanel, null);

	}

	// etablir l'onglet Reservation
	public void etablishReservPanel() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		jPanel.setBounds(0, 0, 1000, 400);

		AddReservation u = new AddReservation();
		// u.setBounds(0,0,500,350);
		jPanel.add(u);
		jTabbedPane1.addTab("Réservation", null, jPanel, null);

	}

	public void etablishListReservPanel() {

		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		jPanel.setBounds(0, 320, 1000, 500);

		// JLabel entete = new JLabel("Liste de tout les réservations");
		// entete.setFont(new java.awt.Font("Century Schoolbook L",
		// java.awt.Font.BOLD, 16));
		// entete.setForeground(Color.blue);
		// entete.setBounds(330, 5, 250, 30);

		listReservatioModel = new MyTableModel(colReserv);
		listReservTab = new JTable();
		listReservTab.setModel(listReservatioModel);
		listReservTab.setBounds(20, 40, 600, 300);
		listReservTab.setOpaque(false);
		listReservTab.setRowHeight(30);
		listReservTab.setGridColor(Color.darkGray);
		listReservTab.setShowGrid(true);

		JScrollPane scroll = new JScrollPane(listReservTab);
		scroll.setBounds(20, 40, 600, 440);

		// Recherche Reserv

		JPanel panSearch = new JPanel();
		panSearch.setBounds(700, 45, 300, 300);
		panSearch.setBackground(Color.white);
		panSearch.setLayout(null);

		JLabel labSearch = new JLabel("Recherche");
		labSearch.setFont(new java.awt.Font("Century Schoolbook L",
				java.awt.Font.BOLD, 18));
		labSearch.setForeground(Color.blue);
		labSearch.setBounds(50, 0, 150, 30);

		JLabel lblNomUser = new JLabel("Nom Client");
		lblNomUser.setBounds(0, 30, 150, 30);
		txtNomUser = new JTextField();
		txtNomUser.setBounds(120, 30, 150, 30);

		JLabel lblNumChambre = new JLabel("Numéro Chambre");
		lblNumChambre.setBounds(0, 70, 150, 30);
		txtNumChambre = new JTextField();
		txtNumChambre.setBounds(120, 70, 150, 30);

		JLabel lblDebReserv = new JLabel("Début réservation");
		lblDebReserv.setBounds(0, 110, 150, 30);
		txtDateDeb = new JTextField();
		txtDateDeb.setBounds(120, 110, 150, 30);

		JLabel lblFinReserv = new JLabel("Fin réservation");
		lblFinReserv.setBounds(0, 150, 150, 30);
		txtDateFin = new JTextField();
		txtDateFin.setBounds(120, 150, 150, 30);

		// Etat
		JLabel lblEtat = new JLabel("État chambre");
		lblEtat.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblEtat.setBounds(0, 190, 150, 30);

		// Etat Chambre
		comboBoxEtat = new JComboBox(tabEtat);
		comboBoxEtat.setBounds(120, 190, 150, 30);

		butSarch = new JButton("Recherche");
		butSarch.setBounds(140, 230, 120, 30);
		butSarch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Test Recherche" + txtNumChambre.getText());
				updateDataTableReserv();

			}
		});
		// Bouton Charger
		butCharger = new JButton(">>");
		butCharger.setBounds(620, 60, 50, 30);
		butCharger.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int indexSelected = listReservTab.getSelectedRow();
				if (indexSelected == -1) {
					// erreur JOptionPane
				} else {

					Reservation reserCharge = listeReserv.get(indexSelected);
					reservSelected = reserCharge.getId_reserv();
					txtNomUser.setText(reserCharge.getNom_user());
					txtNumChambre.setText(String.valueOf(reserCharge
							.getNum_chambre()));
					txtDateDeb.setText(reserCharge.getDate_deb_reserv());
					txtDateFin.setText(reserCharge.getDate_fin_reserv());
					comboBoxEtat.setSelectedItem(reserCharge
							.getEtat_reservation());

				}

			}
		});
		// Bouton Modifier
		butModifier = new JButton("Modifier");
		butModifier.setBounds(10, 230, 120, 30);
		butModifier.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Reservation reserv = new Reservation();
				Reservation reservation = new Reservation();

				reservation.setId_reserv(reservSelected);
				System.out.println(reservSelected);
				if (!txtNomUser.getText().isEmpty()) {
					reservation.setNom_user(txtNomUser.getText());
				}
				if (!txtNumChambre.getText().isEmpty()) {
					reservation.setNum_chambre(Integer.valueOf(txtNumChambre
							.getText()));
				}
				if (!txtDateDeb.getText().isEmpty()) {
					reservation.setDate_deb_reserv(txtDateDeb.getText());
				}
				if (!txtDateFin.getText().isEmpty()) {
					reservation.setDate_fin_reserv(txtDateFin.getText());
				}

				reservation.setEtat_reservation(comboBoxEtat.getSelectedItem()
						.toString());
				reservation.updateReservation();
				listReservatioModel.removeAllRows();
				listReservatioModel.fireTableDataChanged();
				updateInitialDataTableReserv();

			}
		});

		panSearch.add(labSearch);
		panSearch.add(lblNomUser);
		panSearch.add(txtNomUser);
		panSearch.add(lblNumChambre);
		panSearch.add(txtNumChambre);
		panSearch.add(lblDebReserv);
		panSearch.add(txtDateDeb);
		panSearch.add(lblFinReserv);
		panSearch.add(txtDateFin);
		panSearch.add(butSarch);
		jPanel.add(butCharger);
		panSearch.add(butModifier);
		panSearch.add(lblEtat);
		panSearch.add(comboBoxEtat);
		// jPanel.add(entete);
		jPanel.add(scroll);
		jPanel.add(panSearch);
		updateInitialDataTableReserv();
		jTabbedPane1.addTab("Liste Réservations", null, jPanel, null);

	}

	// recuperer tous les listes de la chambre
	public void updateInitialDataTable() {
		Chambre chambre = new Chambre();
		listChambre = chambre.getListChambre();

		listChambreTab.getColumnModel().getColumn(0)
				.setCellRenderer(new ImageRenderer());

		if (listChambre.size() > 0) {

			for (int i = 0; i < listChambre.size(); i++) {
				listChambreModel.addNewRow();
				Chambre chambre1 = listChambre.get(i);
				System.out.println(chambre1.getImage_chambre());
				ImageIcon apple = new ImageIcon(chambre1.getImage_chambre());
				listChambreModel.setValueAt(apple, i, 0);
				listChambreModel
						.setValueAt(chambre1.getDescrip_chambre(), i, 1);

			}
			listChambreModel.fireTableDataChanged();
		}
	}

	// //////////Liste de tout les reservations
	public void updateInitialDataTableReserv() {
		Reservation reserv = new Reservation();
		Reservation reservation = new Reservation(0, "", "", "", "");
		listeReserv = reserv.getListReservation(reservation);
		if (listeReserv.size() > 0) {

			for (int i = 0; i < listeReserv.size(); i++) {
				listReservatioModel.addNewRow();
				Reservation reservat = listeReserv.get(i);
				listReservatioModel.setValueAt(reservat.getNom_user(), i, 0);
				listReservatioModel.setValueAt(reservat.getNum_chambre(), i, 1);
				listReservatioModel.setValueAt(reservat.getDate_deb_reserv(),
						i, 2);
				listReservatioModel.setValueAt(reservat.getDate_fin_reserv(),
						i, 3);
				listReservatioModel.setValueAt(reservat.getEtat_reservation(),
						i, 4);

			}
			listReservatioModel.fireTableDataChanged();
		}
	}

	// /Recherceh
	public void updateDataTableReserv() {
		Reservation reserv = new Reservation();
		Reservation reservation = new Reservation(0, "", "", "", "");
		if (!txtNomUser.getText().isEmpty()) {
			reservation.setNom_user(txtNomUser.getText());
		}
		if (!txtNumChambre.getText().isEmpty()) {
			reservation
					.setNum_chambre(Integer.valueOf(txtNumChambre.getText()));
		}
		if (!txtDateDeb.getText().isEmpty()) {
			reservation.setDate_deb_reserv(txtDateDeb.getText());
		}
		listeReserv = reserv.getListReservation(reservation);
		listReservatioModel.removeAllRows();
		if (listeReserv.size() > 0) {

			for (int i = 0; i < listeReserv.size(); i++) {
				listReservatioModel.addNewRow();
				Reservation reservat = listeReserv.get(i);
				listReservatioModel.setValueAt(reservat.getNom_user(), i, 0);
				listReservatioModel.setValueAt(reservat.getNum_chambre(), i, 1);
				listReservatioModel.setValueAt(reservat.getDate_deb_reserv(),
						i, 2);
				listReservatioModel.setValueAt(reservat.getDate_fin_reserv(),
						i, 3);
				listReservatioModel.setValueAt(reservat.getEtat_reservation(),
						i, 4);

			}
			listReservatioModel.fireTableDataChanged();
		}
	}
}

class ImageRenderer extends DefaultTableCellRenderer {
	JLabel lbl = new JLabel();

	ImageIcon icon = new ImageIcon("image/H1.jpeg");

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {

		JLabel res = (JLabel) super.getTableCellRendererComponent(table, value,
				isSelected, hasFocus, row, column);

		if (value instanceof ImageIcon) {
			ImageIcon imge = (ImageIcon) value;
			res.setText(null);
			res.setIcon(imge);
			return res;
		} else {
			return res;
		}

	}

}