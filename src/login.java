import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class login extends JFrame implements WindowListener, ActionListener, MouseListener{

	private JPanel miPanel;
	private JTextField textUsuario, textPass;
	private JLabel lblUsuario, lblPass;
	private JButton btnAceptar, btnRegistrar;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					login frame = new login();
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
	public login() {
		
		setEnabled(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 298);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(101, 120, 69, 20);
		miPanel.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(180, 120, 144, 20);
		miPanel.add(textUsuario);
		textUsuario.setColumns(10);
		
		lblPass = new JLabel("Contrase\u00F1a: ");
		lblPass.setBounds(101, 162, 87, 20);
		miPanel.add(lblPass);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(180, 162, 144, 20);
		miPanel.add(textPass);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(270, 213, 89, 23);
		miPanel.add(btnAceptar);
		
		btnAceptar.addActionListener(this);
	
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(118, 213, 89, 23);
		miPanel.add(btnRegistrar);
		
		btnRegistrar.addActionListener(this);
		
		
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
			dispose();
			
			Dentro d = new Dentro();
		} else if (e.getSource() == btnRegistrar) {
			System.out.println("registrar");
			dispose();
			registro r = new registro();
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
