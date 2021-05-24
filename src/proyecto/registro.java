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
import javax.swing.JTextField;
import javax.swing.JButton;

public class registro extends JFrame implements WindowListener, ActionListener, MouseListener{

	private JPanel miPanel;
	private JTextField textUsuario, textNombre, textCorreo, textPass;
	private JLabel lblUsuario, lblNombre, lblCorreo, lblPass;
	private JButton btnAceptar, btnAtras;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					registro frame = new registro();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public registro() {
		
		setEnabled(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 341);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(102, 86, 76, 14);
		miPanel.add(lblUsuario);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(102, 124, 76, 14);
		miPanel.add(lblNombre);
		
		lblCorreo = new JLabel("Correo: ");
		lblCorreo.setBounds(102, 164, 89, 14);
		miPanel.add(lblCorreo);
		
		lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setBounds(102, 205, 89, 14);
		miPanel.add(lblPass);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(210, 83, 156, 20);
		miPanel.add(textUsuario);
		textUsuario.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(210, 121, 156, 20);
		miPanel.add(textNombre);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(210, 161, 156, 20);
		miPanel.add(textCorreo);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(210, 199, 156, 20);
		miPanel.add(textPass);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(317, 257, 89, 23);
		miPanel.add(btnAceptar);
		
		btnAceptar.addActionListener(this);
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(102, 257, 89, 23);
		miPanel.add(btnAtras);
		
		btnAtras.addActionListener(this);
		
		setVisible(true);
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnAceptar) {
			System.out.println("aceptar");
			
		}if (e.getSource() == btnAtras) {
			System.out.println("Atras");
			dispose();
			
			login l = new login();
		}
		
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
