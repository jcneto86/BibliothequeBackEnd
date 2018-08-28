package net_biblio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class enregistrementRetour {

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
					enregistrementRetour window = new enregistrementRetour();
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
	public enregistrementRetour() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Enregistrement de retour");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomsDesLivres = new JLabel("Titres des livres: ");
		lblNomsDesLivres.setBounds(75, 51, 117, 16);
		frame.getContentPane().add(lblNomsDesLivres);
		
		JLabel lbIdClient = new JLabel("Num. du Client:");
		lbIdClient.setBounds(75, 189, 117, 16);
		frame.getContentPane().add(lbIdClient);
		
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
		txtJjj.setBounds(192, 184, 205, 26);
		frame.getContentPane().add(txtJjj);
		
		JButton btnReserve = new JButton("+");
		btnReserve.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnReserve.setBackground(Color.BLACK);
		btnReserve.setBounds(340, 222, 54, 35);
		frame.getContentPane().add(btnReserve);
	}

}
