package net_biblio;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class AcceuiAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;



	/**
	 * Create the application.
	 */
	public AcceuiAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame("Acceuil/Admin");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ButtonRechercheLivre = new JButton("Recherche Livre");
		ButtonRechercheLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonRechercheLivre.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonRechercheLivre.setBounds(16, 16, 280, 29);
		frame.getContentPane().add(ButtonRechercheLivre);
		
		JButton ButtonRéservationLivre = new JButton("Réservation Livre");
		ButtonRéservationLivre.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonRéservationLivre.setBounds(16, 38, 280, 29);
		frame.getContentPane().add(ButtonRéservationLivre);
		
		JButton btnRendezvous = new JButton("Prendre un rendez-vous Livre rare");
		btnRendezvous.setHorizontalAlignment(SwingConstants.LEFT);
		btnRendezvous.setBounds(16, 60, 280, 29);
		frame.getContentPane().add(btnRendezvous);
		
		JButton btnUtilisateur = new JButton("Voir l'utilisateur");
		btnUtilisateur.setHorizontalAlignment(SwingConstants.LEFT);
		btnUtilisateur.setBounds(16, 82, 280, 29);
		frame.getContentPane().add(btnUtilisateur);
		
		JButton btnEnregistrerLivre = new JButton("Enregistrer un livre");
		btnEnregistrerLivre.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnregistrerLivre.setBounds(16, 104, 280, 29);
		frame.getContentPane().add(btnEnregistrerLivre);
		
		JButton btnEnregistrerUnPret = new JButton("Enregistrer un prêt");
		btnEnregistrerUnPret.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnregistrerUnPret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnregistrerUnPret.setBounds(16, 126, 280, 29);
		frame.getContentPane().add(btnEnregistrerUnPret);
		
		JButton btnEnregistrerRetour = new JButton("Enregistrer un retour");
		btnEnregistrerRetour.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnregistrerRetour.setBounds(16, 148, 280, 29);
		frame.getContentPane().add(btnEnregistrerRetour);
		
		JButton btnEnregistrerEmploy = new JButton("Enregistrer un employé");
		btnEnregistrerEmploy.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnregistrerEmploy.setBounds(16, 170, 280, 29);
		frame.getContentPane().add(btnEnregistrerEmploy);
		
		JButton btnEnregistrerUtilisateur = new JButton("Enregistrer un utilisateur");
		btnEnregistrerUtilisateur.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnregistrerUtilisateur.setBounds(16, 192, 280, 29);
		frame.getContentPane().add(btnEnregistrerUtilisateur);
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(16, 233, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
