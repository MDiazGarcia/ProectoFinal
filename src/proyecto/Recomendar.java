package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Recomendar extends JFrame {
	
	
	private JPanel miPanel;
	JComboBox animeSel;
	

	/**
	 * Create the frame.
	 */
	public Recomendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		JComboBox animeSel = new JComboBox();
		animeSel.setMaximumRowCount(50);
		animeSel.setBounds(180, 75, 95, 20);
		miPanel.add(animeSel);
		ArrayList<String> animeNom=new ArrayList<String>();
		Utiles u=new Utiles();
		u.nomCombo(animeNom);
		for(int i=0;i<animeNom.size();i++) {
		animeSel.addItem(animeNom.get(i));
		}
		
		
		
		setVisible(true);
	}
	
}
	
