package net_biblio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class EnregistrerLivre {

	private JFrame frame;
	private JTextField txtTitreLivreENR;
	private JTextField textAuteurENR;
	private JTextField textDateLivreENR;
	private JTextField textCategLivreENR;
	private JTextField textResumeLivreENR;
	private JTextField textPositionLivreENR;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EnregistrerLivre window = new EnregistrerLivre();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public EnregistrerLivre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Enregistrer un Livre");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabelLivreENR = new JLabel("Description");
		lblNewLabelLivreENR.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabelLivreENR.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabelLivreENR.setBackground(Color.BLACK);
		lblNewLabelLivreENR.setBounds(147, 17, 117, 21);
		frame.getContentPane().add(lblNewLabelLivreENR);
		
		JLabel lblPhoto = new JLabel("Photo");
		lblPhoto.setBounds(40, 17, 82, 109);
		frame.getContentPane().add(lblPhoto);
		
		txtTitreLivreENR = new JTextField();
		txtTitreLivreENR.setBounds(194, 42, 183, 26);
		frame.getContentPane().add(txtTitreLivreENR);
		txtTitreLivreENR.setColumns(10);
		
		JLabel lblTitre = new JLabel("Titre:");
		lblTitre.setBounds(147, 50, 61, 16);
		frame.getContentPane().add(lblTitre);
		
		JLabel lblAuteur = new JLabel("Auteur:");
		lblAuteur.setBounds(147, 70, 61, 16);
		frame.getContentPane().add(lblAuteur);
		
		JLabel lblDateDeParution = new JLabel("Date de parution:");
		lblDateDeParution.setBounds(147, 92, 130, 16);
		frame.getContentPane().add(lblDateDeParution);
		
		JLabel lblCategorie = new JLabel("Categorie:");
		lblCategorie.setBounds(147, 116, 75, 16);
		frame.getContentPane().add(lblCategorie);
		
		textAuteurENR = new JTextField();
		textAuteurENR.setColumns(10);
		textAuteurENR.setBounds(194, 65, 183, 26);
		frame.getContentPane().add(textAuteurENR);
		
		textDateLivreENR = new JTextField();
		textDateLivreENR.setColumns(10);
		textDateLivreENR.setBounds(260, 88, 117, 26);
		frame.getContentPane().add(textDateLivreENR);
		
		textCategLivreENR = new JTextField();
		textCategLivreENR.setColumns(10);
		textCategLivreENR.setBounds(224, 111, 153, 26);
		frame.getContentPane().add(textCategLivreENR);
		
		JLabel lblRsum = new JLabel("Résumé");
		lblRsum.setBounds(23, 152, 61, 16);
		frame.getContentPane().add(lblRsum);
		
		textResumeLivreENR = new JTextField();
		textResumeLivreENR.setBounds(96, 152, 281, 72);
		frame.getContentPane().add(textResumeLivreENR);
		textResumeLivreENR.setColumns(10);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(23, 239, 61, 16);
		frame.getContentPane().add(lblPosition);
		
		textPositionLivreENR = new JTextField();
		textPositionLivreENR.setBounds(96, 236, 130, 26);
		frame.getContentPane().add(textPositionLivreENR);
		textPositionLivreENR.setColumns(10);
		
		JButton btnAjouterLivreENR = new JButton("+");
		btnAjouterLivreENR.setBounds(229, 234, 61, 29);
		frame.getContentPane().add(btnAjouterLivreENR);
		
		JButton btnRetourLivreENR = new JButton("Retour>>");
		btnRetourLivreENR.setBounds(287, 234, 90, 29);
		frame.getContentPane().add(btnRetourLivreENR);
	}
}
