package proyecto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Dentro extends JFrame implements WindowListener, ActionListener, MouseListener {

	private JPanel miPanel;
	private JLabel lblConsultas;
	private JButton btnAnimes, btnRecomendaciones,btnAtras;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Dentro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 298);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		lblConsultas = new JLabel("Consultas");
		lblConsultas.setBounds(200, 42, 62, 14);
		miPanel.add(lblConsultas);
		
		btnRecomendaciones = new JButton("Recomendaciones");
		btnRecomendaciones.setBounds(78, 127, 123, 23);
		miPanel.add(btnRecomendaciones);
		
		btnRecomendaciones.addActionListener(this); 
		
		
		btnAnimes = new JButton("Animes");
		btnAnimes.setBounds(270, 127, 123, 23);
		miPanel.add(btnAnimes);
		
		btnAnimes.addActionListener(this);
		
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(171, 196, 123, 23);
		miPanel.add(btnAtras);
		
		btnAtras.addActionListener(this);
		
		
		
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAnimes) {
			System.out.println("boton Animes");
			dispose();
			Tablas ta = new Tablas("Animes");
			
		} else if (e.getSource() == btnRecomendaciones) {
			System.out.println("boton Incorporaciones");
			dispose();
			Tablas ti = new Tablas("Recomendaciones");
			
		}else if (e.getSource() == btnAtras) {
			System.out.println("atras");
			dispose();
			
			login l = new login();
			
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
