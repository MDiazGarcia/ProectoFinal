package proyecto;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JFrame implements WindowListener, ActionListener, MouseListener{

	private JPanel miPanel;
	private JTextField textUsuario, textNombre, textCorreo, textPass;
	private JLabel lblUsuario, lblNombre, lblCorreo, lblPass;
	private JButton btnAceptar, btnAtras;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Registro() {
		
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
			
			if(textUsuario.getText().equals("") || textNombre.getText().equals("") || 
					textCorreo.getText().equals("") || textPass.getText().equals("")) {
			
				JOptionPane.showMessageDialog(null, "Un campo esta vacio",
						"Campo vacio", JOptionPane.WARNING_MESSAGE);
				
			}else {
				String bd ="proyecto";
				String url="jdbc:mysql://localhost:3306/"+bd;
			
				String user="root";
				String pasw="";
			
				Connection conn= null;
				Statement stmt=null;
				ResultSet rs=null;
			
				try {
				
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url,user,pasw);
					stmt = conn.createStatement();
					
					boolean flag=false;
					rs = stmt.executeQuery("Select * from usuarios where nickname like '"+textUsuario.getText()+"'");
					if(rs.next()) {
						
						JOptionPane.showMessageDialog(null, "El usuario ya existe",
								"Usuario existente", JOptionPane.WARNING_MESSAGE);
					}else {
						
						stmt.executeUpdate("insert into usuarios values('"+textUsuario.getText()+"','"+
						textNombre.getText()+"','"+textCorreo.getText()+"','"+textPass.getText()+"',0)");
						
						JOptionPane.showMessageDialog(null, "Usuario creado",
								"Usuario creado", JOptionPane.INFORMATION_MESSAGE);
						
						dispose();
						Login l= new Login();
					}
					rs.close();
					stmt.close();
					conn.close();
			}catch (ClassNotFoundException e1) {
							
				e1.printStackTrace();
			}catch (SQLException e1) {
							
				e1.printStackTrace();
			}
			
			
			
			System.out.println("aceptar");
			}	
		}if (e.getSource() == btnAtras) {
			System.out.println("Atras");
			dispose();
			
			Login l = new Login();
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
