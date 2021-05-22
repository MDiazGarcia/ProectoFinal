import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

public class TablaAnimes extends JFrame implements WindowListener, ActionListener, MouseListener{

	private JPanel miPanel;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnAtrs;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TablaAnimes frame = new TablaAnimes();
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
//	public TablaAnimes(String[] nombreColumnas, String[][] datos) {
	public TablaAnimes() {
		//Definimos las propiedades del JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		//Creamos y añadimos un panel a nuestro marco
		miPanel = new JPanel();
		setContentPane(miPanel);
		//Sin Layout
		miPanel.setLayout(null);
		
		//Creamos la tabla con la información JTable(info.filas,info.columnas)
		table = new JTable();
//		table = new JTable(datos,nombreColumnas);
		
		//Creamos un JScrollPane (barra de desplazamiento) que contendra la tabla, asi
		//nuestra tabla tendrá las barras de desplazamiento
		scrollPane = new JScrollPane(table);
		//Dar tamaño al JScrollPane(mejor desde la vista de Design)
		scrollPane.setBounds(0, 0, 786, 563);
		//Añadimos el JScrollPane al panel, la tabla no hace falta, pues esta dentro del JScrollPane
		miPanel.add(scrollPane);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(this);
		
		scrollPane.setRowHeaderView(btnAtrs);
		
		//Hacemos visible la ventana
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
		if (e.getSource() == btnAtrs) {
			System.out.println("aceptar");
			dispose();
			
			Dentro d = new Dentro();
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
