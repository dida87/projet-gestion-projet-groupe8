package fenetre;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controle.MyTableModel;

import modele.Chambre;

public class ListChambre extends JFrame {
	ArrayList<Chambre> listChambre = new ArrayList<Chambre>();
	MyTableModel listChambreModel = null;

	public JPanel setChambre(JPanel panel) {

		String[] columnNames = { "CHAMBRES", "DÉSCRIPTION" };

		JTable table = new JTable();

		listChambreModel = new MyTableModel(columnNames);
		Chambre chambre = new Chambre();

		table.setModel(listChambreModel);
		table.setPreferredScrollableViewportSize(table.getPreferredSize());
		table.setRowHeight(50);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(800, 800);
		getContentPane().add(scrollPane).setBounds(400, 0, 600, 500);
		panel.add(scrollPane);

		getListeChambre();
		remplirTable();
		return panel;
	}

	public void getListeChambre() {

		Chambre chambre = new Chambre();
		listChambre = chambre.getListChambre();
		System.out.println("Chambre" + listChambre.size());
	}

	public void remplirTable() {

		listChambreModel.removeAllRows();

		for (int iIndex = 0; iIndex < listChambre.size(); iIndex++) {
			Chambre oChambre = (Chambre) listChambre.get(iIndex);
			listChambreModel.addNewRow();
			int iIndexNewRow = listChambreModel.getRowCount();
			ImageIcon aboutIcon = new ImageIcon("image/acceu.jpeg");
			listChambreModel.setValueAt(aboutIcon, iIndexNewRow - 1, 0);
			listChambreModel.setValueAt(oChambre.getDescrip_chambre(),
					iIndexNewRow - 1, 1);

		}

		listChambreModel.fireTableDataChanged();

	}

}