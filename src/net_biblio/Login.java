package net_biblio;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import bibliotheque.FonctionsBibli;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;
	private JTextField Username;
	private JPasswordField passwordField;

	//	/**
	//	 * Launch the application.
	//	 */
	//	public static void main(String[] args) {
	//		EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				try {
	//					Login window = new Login();
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
				System.out.println(user + ", " + pass);
				if (FonctionsBibli.validerLogin(user, pass))
				{
					System.out.println(FonctionsBibli.utilisateurConnecte.getPermission());
					System.out.println(FonctionsBibli.utilisateurConnecte.getPermission() == "EMPLOYE");
					if (FonctionsBibli.utilisateurConnecte.getPermission().equals("UTILISATEUR")) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									AcceuilClient window = new AcceuilClient();
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});

					}
					else if (FonctionsBibli.utilisateurConnecte.getPermission().equals("EMPLOYE")) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									AcceuilEmploye window = new AcceuilEmploye();
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						
					}
					else if (FonctionsBibli.utilisateurConnecte.getPermission().equals("ADMIN")) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									AcceuiAdmin window = new AcceuiAdmin();
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}

				}

			}
		});
		btnSeConnecter.setBounds(49, 210, 357, 29);
		frame.getContentPane().add(btnSeConnecter);


	}
}


//package net_biblio;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JButton;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.SwingConstants;
//import javax.swing.border.EmptyBorder;
//
//import bibliotheque.FonctionsBibli;
//import javax.swing.JPanel;
//import java.awt.Rectangle;
//
//public class Login extends JFrame{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JFrame frame;
//	private JPanel contentPane;
//	private JTextField Username;
//	private JPasswordField passwordField;
//
//	public static Login current;
//	/**
//	 * Launch the application.
//	 */
//
//	/**
//	 * Create the application.
//	 */
//	public Login() {
//		setResizable(false);
//		setBounds(new Rectangle(100, 100, 450, 300));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	//	setSize(450,300);
//		initialize();
//		current = this;
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//    public void initialize() {
//		frame = new JFrame("Se connecter");
//		frame.setBounds(100, 100, 450, 300);
//		
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);	
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		contentPane.setLayout(null);
//		
//	//	frame.getContentPane().setLayout(null);
//		
//		JLabel lblLogin = new JLabel("Login");
//		lblLogin.setBounds(51, 18, 348, 23);
//		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
//		lblLogin.setBackground(Color.WHITE);
//		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
//		lblLogin.setForeground(Color.ORANGE);
//		contentPane.add(lblLogin);
//		
//		JLabel lblNewLabel_1 = new JLabel("Nom d'utulisateur: ");
//		lblNewLabel_1.setBounds(51, 53, 123, 23);
//		contentPane.add(lblNewLabel_1);
//		
//		JLabel lblMotsDePasse = new JLabel("Mots de passe: ");
//		lblMotsDePasse.setBounds(51, 88, 123, 23);
//		contentPane.add(lblMotsDePasse);
//		
//		Username = new JTextField();
//		Username.setBounds(172, 50, 227, 26);
//		contentPane.add(Username);
//		Username.setColumns(10);
//		
//		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(172, 85, 227, 26);
//		contentPane.add(passwordField);
//		
//		JButton btnSeConnecter = new JButton("Se Connecter");
//		btnSeConnecter.setBounds(5, 5, 440, 268);
//		contentPane.add(btnSeConnecter);
//		
//		
//		
//		
//	}
//}


//	
