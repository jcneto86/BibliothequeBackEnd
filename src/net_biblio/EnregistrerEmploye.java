package net_biblio;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EnregistrerEmploye extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField txtUtyiop;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;



	/**
	 * Create the application.
	 */
	public EnregistrerEmploye() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Enregistrement d'un Employé");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClient = new JLabel("Employé");
		lblClient.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblClient.setForeground(SystemColor.inactiveCaptionText);
		lblClient.setBounds(124, 38, 73, 16);
		frame.getContentPane().add(lblClient);
		
		JLabel lblCouriellctronique = new JLabel("Couriel élèctronique:");
		lblCouriellctronique.setBounds(59, 153, 138, 16);
		frame.getContentPane().add(lblCouriellctronique);
		
		JLabel lblNumDeClient = new JLabel("Fonction:");
		lblNumDeClient.setBounds(60, 130, 138, 16);
		frame.getContentPane().add(lblNumDeClient);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(59, 108, 138, 16);
		frame.getContentPane().add(lblAdresse);
		
		JLabel lblPrnom = new JLabel("Prénom:");
		lblPrnom.setBounds(60, 86, 138, 16);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(59, 64, 138, 16);
		frame.getContentPane().add(lblNom);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(280, 209, 117, 29);
		frame.getContentPane().add(btnAjouter);
		
		JLabel lblTlphone = new JLabel("Télèphone: ");
		lblTlphone.setBounds(59, 175, 138, 16);
		frame.getContentPane().add(lblTlphone);
		
		txtUtyiop = new JTextField();
		txtUtyiop.setBounds(205, 59, 130, 26);
		frame.getContentPane().add(txtUtyiop);
		txtUtyiop.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(205, 81, 130, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 103, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 125, 130, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(205, 147, 130, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 169, 130, 26);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(48, 209, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}

}