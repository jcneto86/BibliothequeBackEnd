package net_biblio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class RechercheUtilisateur extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textField_1;
	private JTable table;


	/**
	 * Create the application.
	 */
	public RechercheUtilisateur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Rechercher un utilisateur");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 43, 306, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.setBounds(25, 38, 86, 38);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(25, 81, 404, 138);
		frame.getContentPane().add(table);
		
		JButton btnNewButton1 = new JButton("<< Retour");
		btnNewButton1.setBounds(25, 231, 90, 29);
		frame.getContentPane().add(btnNewButton1);
	}

}
