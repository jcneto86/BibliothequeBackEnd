package net_biblio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class AcceuilClient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;



	/**
	 * Create the application.
	 */
	public AcceuilClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Acceuil/Client");
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
		
		JButton btnNewButton = new JButton("<< Retour");
		btnNewButton.setBounds(16, 221, 90, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
