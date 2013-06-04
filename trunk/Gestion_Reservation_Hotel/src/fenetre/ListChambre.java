package fenetre;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListChambre extends JFrame {
	
	public JPanel setChambre(JPanel panel){
		
	
		
		ImageIcon aboutIcon = new ImageIcon("image/acceu.jpeg");
        ImageIcon addIcon = new ImageIcon("add16.gif");
        ImageIcon copyIcon = new ImageIcon("copy16.gif");

        String[] columnNames = {"Chambres", "Description"};
        Object[][] data =
        {
            {aboutIcon, ""},
            {addIcon, ""},
            {copyIcon, ""},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable( model )
        {
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setRowHeight(50);
        JScrollPane scrollPane = new JScrollPane( table );
        scrollPane.setSize(800, 800);
        getContentPane().add(scrollPane).setBounds(400, 0, 600, 500);
        panel.add(scrollPane);
		return panel;
	}

}