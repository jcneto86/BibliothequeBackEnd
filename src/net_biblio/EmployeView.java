package net_biblio;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EmployeView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;



	/**
	 * Create the application.
	 */
	public EmployeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Employé");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClient = new JLabel("Fiche identifiant d'un Employé");
		lblClient.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblClient.setForeground(SystemColor.inactiveCaptionText);
		lblClient.setBounds(45, 33, 359, 16);
		frame.getContentPane().add(lblClient);
		
		JLabel lblCouriellctronique = new JLabel("Couriel élèctronique:");
		lblCouriellctronique.setBounds(55, 167, 349, 16);
		frame.getContentPane().add(lblCouriellctronique);
		
		JLabel lblNumDeClient = new JLabel("Fonction:");
		lblNumDeClient.setBounds(56, 144, 348, 16);
		frame.getContentPane().add(lblNumDeClient);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(55, 122, 349, 16);
		frame.getContentPane().add(lblAdresse);
		
		JLabel lblPrnom = new JLabel("Prénom:");
		lblPrnom.setBounds(56, 100, 348, 16);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(55, 78, 349, 16);
		frame.getContentPane().add(lblNom);
		
		JLabel lblTlphone = new JLabel("Télèphone: ");
		lblTlphone.setBounds(55, 189, 349, 16);
		frame.getContentPane().add(lblTlphone);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 66, 359, 157);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(45, 235, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
