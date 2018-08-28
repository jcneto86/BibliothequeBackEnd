package net_biblio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class LivreRare {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtJjj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivreRare window = new LivreRare();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LivreRare() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Prendre un rendez-vous pour Livre rare");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomsDesLivres = new JLabel("Titres des livres: ");
		lblNomsDesLivres.setBounds(75, 51, 117, 16);
		frame.getContentPane().add(lblNomsDesLivres);
		
		JLabel lblDate = new JLabel("Date: ");
		lblDate.setBounds(149, 176, 43, 16);
		frame.getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(192, 46, 205, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 75, 205, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 104, 205, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 133, 205, 26);
		frame.getContentPane().add(textField_3);
		
		txtJjj = new JTextField();
		txtJjj.setToolTipText("");
		txtJjj.setColumns(10);
		txtJjj.setBounds(192, 171, 117, 26);
		frame.getContentPane().add(txtJjj);
		
		JButton btnReserve = new JButton("Réservée");
		btnReserve.setBackground(Color.BLACK);
		btnReserve.setBounds(301, 222, 93, 29);
		frame.getContentPane().add(btnReserve);
		
		JRadioButton rdbtnApresMidi = new JRadioButton("Àprés-Midi");
		rdbtnApresMidi.setBounds(289, 198, 108, 23);
		frame.getContentPane().add(rdbtnApresMidi);
		
		JRadioButton rdbtnMattin = new JRadioButton("Avant-Midi");
		rdbtnMattin.setBounds(192, 198, 205, 23);
		frame.getContentPane().add(rdbtnMattin);
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(50, 222, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
