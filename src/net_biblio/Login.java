package net_biblio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import bibliotheque.FonctionsBibli;

public class Login {

	private JFrame frame;
	private JTextField Username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Se connecter");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblLogin.setForeground(Color.ORANGE);
		lblLogin.setBounds(58, 94, 348, 23);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Nom d'utulisateur: ");
		lblNewLabel_1.setBounds(58, 140, 348, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMotsDePasse = new JLabel("Mots de passe: ");
		lblMotsDePasse.setBounds(58, 175, 348, 23);
		frame.getContentPane().add(lblMotsDePasse);
		
		Username = new JTextField();
		Username.setBounds(179, 137, 227, 26);
		frame.getContentPane().add(Username);
		Username.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(179, 172, 227, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnSeConnecter = new JButton("Se Connecter");
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = Username.getText();
				String pass = String.copyValueOf(passwordField.getPassword());
				FonctionsBibli.validerLogin(user, pass);
			}
		});
		btnSeConnecter.setBounds(49, 210, 357, 29);
		frame.getContentPane().add(btnSeConnecter);
		
		
	}
}
