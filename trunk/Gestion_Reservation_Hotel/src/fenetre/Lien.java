package fenetre;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Lien extends JFrame {
//public JPanel setChambre(JPanel panelF){	
	
private String tabMois [] = new String[] {"Janvier", "F\u00E9vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "D\u00E9cembre"};
        private JPanel contentPane;
        private JTextField textField;
        private JTextField textField_1;
        private JTextField textField_2;

       
        /**
         * Create the frame.
         */
     
//        public Lien(ActionListener ctrl) {
//                super();
//                afficher(ctrl);
//               
//        }
        

        public JPanel setLien(JPanel panel1){
                // TODO Auto-generated method stub
               
                Calendar cal = new GregorianCalendar();

                this.setBounds(500, 300, 515, 492);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);
               
                JPanel panel = new JPanel();
                panel.setBackground(new Color(244, 247, 252));
                panel.setBounds(0, 0, 509, 464);
                contentPane.add(panel);
                panel.setLayout(null);
               
                JLabel lblIdDuClient = new JLabel("ID du client");
                lblIdDuClient.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblIdDuClient.setBounds(10, 11, 118, 14);
                panel.add(lblIdDuClient);
               
                JLabel label = new JLabel("1");
                label.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label.setBounds(239, 11, 46, 14);
                panel.add(label);
               
                JLabel lblNomDuClient = new JLabel("Nom du client");
                lblNomDuClient.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblNomDuClient.setBounds(10, 38, 118, 14);
                panel.add(lblNomDuClient);
               
                textField = new JTextField();
                textField.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                textField.setBounds(239, 35, 132, 20);
                panel.add(textField);
                textField.setColumns(20);
               
                JLabel lblPrenomDuClien = new JLabel("Prenom du client");
                lblPrenomDuClien.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblPrenomDuClien.setBounds(10, 65, 128, 14);
                panel.add(lblPrenomDuClien);
               
                textField_1 = new JTextField();
                textField_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                textField_1.setBounds(239, 62, 132, 20);
                panel.add(textField_1);
                textField_1.setColumns(10);
               
                JLabel lblNewLabel = new JLabel("Numero de telephone");
                lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblNewLabel.setBounds(10, 90, 151, 14);
                panel.add(lblNewLabel);
               
                textField_2 = new JTextField();
                textField_2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                textField_2.setBounds(239, 87, 132, 20);
                panel.add(textField_2);
                textField_2.setColumns(10);
               
                JLabel lblNewLabel_1 = new JLabel("Adresse");
                lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblNewLabel_1.setBounds(10, 114, 151, 14);
                panel.add(lblNewLabel_1);
               
                JTextArea textArea = new JTextArea();
                textArea.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                textArea.setBounds(239, 118, 234, 42);
                panel.add(textArea);
               
                JLabel lblDateDarrivee = new JLabel("Date d'arrivee");
                lblDateDarrivee.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblDateDarrivee.setBounds(10, 176, 151, 14);
                panel.add(lblDateDarrivee);
               
                JLabel lblDateDeDepart = new JLabel("Date de depart");
                lblDateDeDepart.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblDateDeDepart.setBounds(10, 218, 128, 14);
                panel.add(lblDateDeDepart);
               
                JLabel label_1 = new JLabel("Jour");
                label_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_1.setBounds(167, 174, 41, 16);
                panel.add(label_1);

                 
               
               
                JSpinner jourArr = new JSpinner();
                jourArr.setBounds(200, 173, 35, 20);
                jourArr.setValue(cal.get(Calendar.DAY_OF_MONTH));
                panel.add(jourArr);
               
                JLabel label_2 = new JLabel("mois");
                label_2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_2.setBounds(241, 174, 52, 16);
                panel.add(label_2);
               
               
                JLabel label_3 = new JLabel("Ann\u00E9e");
                label_3.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_3.setBounds(371, 174, 52, 16);
                panel.add(label_3);
               
                JSpinner anneArr = new JSpinner();
                 
               
                anneArr.setValue(cal.get(Calendar.YEAR));
                anneArr.setBounds(416, 173, 57, 20);
                panel.add(anneArr);
               
                JLabel label_4 = new JLabel("Jour");
                label_4.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_4.setBounds(167, 216, 41, 16);
                panel.add(label_4);
               
                JSpinner jourDep = new JSpinner();

                jourDep.setValue(cal.get(Calendar.DAY_OF_MONTH)+2);
                jourDep.setBounds(200, 215, 35, 20);
                panel.add(jourDep);
               
                JLabel label_5 = new JLabel("mois");
                label_5.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_5.setBounds(241, 216, 52, 16);
                panel.add(label_5);
                               
                JLabel label_6 = new JLabel("Ann\u00E9e");
                label_6.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                label_6.setBounds(371, 216, 52, 16);
                panel.add(label_6);
               
                JSpinner anneeDep = new JSpinner();
                anneeDep.setValue(cal.get(Calendar.YEAR));
                anneeDep.setBounds(416, 215, 57, 20);
                panel.add(anneeDep);
               
                JLabel lblCategorieChambre = new JLabel("Categorie chambre");
                lblCategorieChambre.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                lblCategorieChambre.setBounds(10, 247, 151, 14);
                panel.add(lblCategorieChambre);
               
                JComboBox comboBoxCat = new JComboBox();
                comboBoxCat.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                comboBoxCat.setBounds(239, 243, 234, 20);
                panel.add(comboBoxCat);
               
                JButton btnAjouter = new JButton("Ajouter");
                //btnAjouter.addActionListener (ctrl);
                //btnAjouter.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_AJOUTER));
               
                btnAjouter.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                btnAjouter.setBounds(100, 430, 89, 23);
                panel.add(btnAjouter);
               
                JButton btnTerminer = new JButton("Terminer");
                //btnTerminer.addActionListener (ctrl);
                //btnTerminer.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_TERMINER));
               
                btnTerminer.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                btnTerminer.setBounds(220, 430, 109, 23);
                panel.add(btnTerminer);
               
                JButton btnAnnuler = new JButton("Annuler");
                //btnAnnuler.addActionListener (ctrl);
                //btnAnnuler.setActionCommand(String.valueOf(ControleurCommis.FENETRE_CLIENT_ANNULER_RESERVATION));
               
                btnAnnuler.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
                btnAnnuler.setBounds(352, 430, 89, 23);
                panel.add(btnAnnuler);
               
                JList list = new JList();
                list.setBounds(10, 299, 463, 54);
                list.setSize(200,50);
                panel.add(list);
               
                final JComboBox comboBoxMoisArr = new JComboBox();
                comboBoxMoisArr.setModel(new DefaultComboBoxModel(tabMois));
                comboBoxMoisArr.setBounds(285, 171, 76, 20);
                panel.add(comboBoxMoisArr);
               
               
               
               
                final  JComboBox comboBoxMoisDep = new JComboBox();
                comboBoxMoisDep.setModel(new DefaultComboBoxModel(tabMois));
                comboBoxMoisDep.setBounds(285, 216, 76, 20);
                panel.add(comboBoxMoisDep);
                setBackground(new Color(204, 204, 255));
               
                setTitle("Information du Client");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                setVisible(true);
                return panel1;
        }

}



