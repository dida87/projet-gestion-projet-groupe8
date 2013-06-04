package fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Acceuil extends JFrame implements ActionListener {
	private JPanel jPanel1;
	private JButton jButton1;
	private JLabel jLabel1;
	private JPanel jPanel8;
	static public JPanel jPanel7;
	static public JPanel jPanel6;
	static public int database = 1;
	private ButtonGroup bg = new ButtonGroup();
	private JTabbedPane jTabbedPane1;
	private JButton jButton2;
	private JPanel jPanel5;
	private JPanel jPanel4;
	private JPanel jPanel3;
	private JPanel jPanel9;
	private JLabel imageLab;
	private JLabel imageLab1;
	private JLabel imageLab2;

	/**
	 * Auto-generated main method to display this JFrame
	 */

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
			
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Gestion de Reservation de Chambre d'Hotel");
			{
				jPanel1 = new JPanel();
				FlowLayout jPanel1Layout = new FlowLayout();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setLayout(jPanel1Layout);
				{
					jLabel1 = new JLabel(new ImageIcon("image/acc.jpeg"));
					jLabel1.setPreferredSize(new Dimension(180,150));
					jPanel1.add(jLabel1);
					
			
				}
			}

			{
				jPanel3 = new JPanel();
				BorderLayout jPanel3Layout = new BorderLayout();
				jPanel3.setLayout(jPanel3Layout);
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				{
					jTabbedPane1 = new JTabbedPane();
					jPanel3.add(jTabbedPane1, BorderLayout.CENTER);
					{
						jPanel6 = new JPanel();
						jTabbedPane1.addTab("Acceuil", null, jPanel6, null);
						jPanel6.setLayout(null);
						
					   imageLab =new JLabel(new ImageIcon("image/acceuil.jpeg"));
					 
//						public void actionPerformed(ActionEvent e){
//						     if(e.getSource().equals(timer))
//						        clockLabel.setText(sdf.format(new Date(System.currentTimeMillis())));
//						  }
//					    
					  		   // imageLab1 = new JLabel(new ImageIcon("image/superior-room.jpg"));
					    jPanel6.add(imageLab);
					    //jPanel6.add(imageLab1);
						
						}

					}
					{
						jPanel7 = new JPanel();
						ListChambre c =new ListChambre();
					    jPanel7= c.setChambre(jPanel7);
						jTabbedPane1.addTab("Chambre", null, jPanel7, null);
						jPanel7.setLayout(null);
					    
						
					}
					{
						jPanel8 = new JPanel();
						Reservation u = new Reservation();
						jPanel8.add(u);
						jTabbedPane1.addTab("Reservation", null, jPanel8, null);
						jPanel8.setLayout(null);
						
						
					}
					{
						jPanel9 = new JPanel();
						//Lien L = new Lien();
						//jPanel9=L.setLien(jPanel9);
						//.add(L);
						jTabbedPane1.addTab("Contacter Nous", null, jPanel9, null);
						jPanel9.setLayout(null);
						
						
					}
				
			}
			{
				jPanel4 = new JPanel();
				getContentPane().add(jPanel4, BorderLayout.EAST);
			}
			{
			
				}
				
			//}
			pack();
			this.setSize(567, 416);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();}
		}
	
	
//	private void etablishImage() {
//		// TODO Auto-generated method stub
//		JLabel imageLab = null;
//		JLabel imageLab1 = null;
//		JLabel imageLab2 = null;
//		
//		try {
//			BufferedImage picture = ImageIO.read(new File("image/acc.jpeg"));
//			imageLab = new JLabel (new ImageIcon(picture));
//			
//			BufferedImage picture1 = ImageIO.read(new File("image/superior-room.jpeg"));
//			imageLab1 = new JLabel (new ImageIcon(picture1));
//			
//			BufferedImage picture2 = ImageIO.read(new File("image/acceuil.jpeg"));
//			imageLab2 = new JLabel (new ImageIcon(picture2));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		imageLab.setBounds(40,10,400,300);
//		imageLab1.setBounds(470,10,360,500);
//		imageLab2.setBounds(60,300,350,250);
//		
//		jPanel6.add(imageLab);
//		jPanel6.add(imageLab1);
//		jPanel6.add(imageLab2);
//	}
		

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@SuppressWarnings("static-access")
			public void run() {
				Acceuil inst = new Acceuil();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setExtendedState(inst.MAXIMIZED_BOTH);
			}
		});
		// DataBase db = new DataBase();
		// Connection con = db.getConnection();
		// if (con != null)
		// System.out.println("reussi");

	}

	// public void afficher(ActionListener ctrl) {
	// // TODO Auto-generated method stub
	//
	// }
}