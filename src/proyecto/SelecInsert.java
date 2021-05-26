package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SelecInsert extends JFrame implements WindowListener, ActionListener, MouseListener{

	private JPanel miPanel;
	JLabel lblNewLabel;
	JButton btnGestInc;
	JButton btnRecomendar; 
	JButton btnAtras;
	

	/**
	 * Create the frame.
	 */
	public SelecInsert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		 lblNewLabel = new JLabel("Elige opci\u00F3n");
		lblNewLabel.setBounds(181, 42, 79, 14);
		miPanel.add(lblNewLabel);
		
		btnGestInc = new JButton("Gestionar Incorporaciones");
		btnGestInc.setBounds(124, 82, 190, 23);
		miPanel.add(btnGestInc);
		btnGestInc.addActionListener(this);
		
		btnRecomendar = new JButton("Recomendar Anime");
		btnRecomendar.setBounds(124, 126, 190, 23);
		miPanel.add(btnRecomendar);
		btnRecomendar.addActionListener(this);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(181, 189, 89, 23);
		miPanel.add(btnAtras);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == btnRecomendar) {
			System.out.println("boton Animes");
			dispose();
			Recomendar ta = new Recomendar();
			
		} else if (e.getSource() == btnGestInc) {
			System.out.println("boton Recomendaciones");
			dispose();
			
			
		}
		
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
