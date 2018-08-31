package net_biblio;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ClientView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;



	/**
	 * Create the application.
	 */
	public ClientView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Client");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClient = new JLabel("Fiche identifiant d'un Client");
		lblClient.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblClient.setForeground(SystemColor.inactiveCaptionText);
		lblClient.setBounds(45, 37, 359, 16);
		frame.getContentPane().add(lblClient);
		
		JLabel lblCouriellctronique = new JLabel("Couriel élèctronique:");
		lblCouriellctronique.setBounds(55, 161, 349, 16);
		frame.getContentPane().add(lblCouriellctronique);
		
		JLabel lblNumDeClient = new JLabel("Num. de Client:");
		lblNumDeClient.setBounds(56, 138, 348, 16);
		frame.getContentPane().add(lblNumDeClient);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(55, 116, 349, 16);
		frame.getContentPane().add(lblAdresse);
		
		JLabel lblPrnom = new JLabel("Prénom:");
		lblPrnom.setBounds(56, 94, 348, 16);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(55, 72, 349, 16);
		frame.getContentPane().add(lblNom);
		
		JLabel lblTlphone = new JLabel("Télèphone: ");
		lblTlphone.setBounds(55, 183, 349, 16);
		frame.getContentPane().add(lblTlphone);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 66, 359, 152);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(45, 230, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
