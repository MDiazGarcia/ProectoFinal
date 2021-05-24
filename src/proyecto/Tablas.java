package proyecto;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Tablas extends JFrame implements WindowListener, ActionListener, MouseListener{

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
public Tablas(String tablaNom) {
		
		//Variables para establecer la conexi�n con la BBDD
		String bd = "proyectoprueba";
		String url="jdbc:mysql://localhost:3306/" + bd ;

		String user="root";
		String pass="";
		
		//Creamos un array para almacenar los nombres de las columnas de la tabla BBDD
		String nombreColumnas[];
		//Creamos una matriz para almacenar los registros recuperados de BBDD
		String datos[][];
		//Almacenamos el n�mero de filas y columnas para dimensionar los arrays
		int numFilas=0, numCol=0, pos=0;
		
		//Objetos necesarios para manipular la BBDD
		Connection conn=null;		
		Statement stmt=null;
		ResultSet rs = null;
		
		
	 
		try {
			
			//Creamos la conexi�n
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user,pass);
			
			//Generamos el statement para realizar querys SQL
			//ResultSet.TYPE_SCROLL_INSENSITIVE, nos permite movernos por el resultset adelante y atras
			//ResultSet.CONCUR_READ_ONLY en modo lectura. No permitiria a�adir registros al Statement
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
			rs = stmt.executeQuery("Select * from "+tablaNom);
			
			//getMetaData() nos devuelve un objeto con info de la tabla SQL a la que hemos realizado
			//la consulta. Entre ellos el m�todo getColumnCount() para obtener el n�mero de columnas
			numCol = rs.getMetaData().getColumnCount();
			
			//Damos el tama�o de columnas al array que almacenar� el t�tulo de los registros
			nombreColumnas = new String[numCol];
			//Rellenamos el array con los nombres de la columna de la tabla getColumnName(n�meroColumna)
			for(int i=0 ; i< nombreColumnas.length ; i++) {
				nombreColumnas[i] = rs.getMetaData().getColumnName(i+1);
			}
			
			//Para saber el n�mero de registros que nos devuelve la consulta en el ResultSet, debemos primero
			//apuntar al �ltimo registro del mismo
			rs.last();
			
			//Obtenemos el n�mero de fila del �ltimo registro(o el n�mero total de registros)
			numFilas = rs.getRow();
			//Asignamos el tama�o de filas y columnas a nuestra matriz.
			datos = new String[numFilas][numCol];
			
			//Apuntamos al inicio del ResulSet para recorrerlo desde el primer elemento
			rs.beforeFirst();
			//Recorremos el ResultSet mientras exista un registro siguiente
			while(rs.next()) {
				//Por cada fila, rellenamos las columnas con los datos del ResultSet
				//pos empieza en cero, y determina las filas
				//i determina las columnas (articulo,descripcion,precio,cantidad)
				for(int i=0 ; i<numCol ; i++) {
					datos[pos][i] = rs.getString(i+1);
				}
				//Una vez relllenado la fila, nos movemos a la siguiente mediante pos + 1
				pos++;
			}		
			
			//Cerramos las conexiones a la BBDD
			rs.close();
			stmt.close();
			conn.close();
			
			//Llamamos a nuestra clase que pinta la ventana que contiene una tabla JTable
			//AL ser una ventana que necesita informaci�n para rellenar, pasamos dicha informaci�n en 
			//el formato que se necesita, en este caso lo que necesita JTable
			Tablas miTabla = new Tablas(nombreColumnas,datos);
			
		}catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException: " + ex.getMessage());
		}catch(SQLException ex) {
			System.out.println("SQLException: " +ex.getMessage());
			ex.printStackTrace();
		}
		
		
	}

	/**
	 * Create the frame.
	 */
//	public TablaAnimes(String[] nombreColumnas, String[][] datos) {
	public Tablas(String[] nombreColumnas, String[][] datos) {
		//Definimos las propiedades del JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		//Creamos y a�adimos un panel a nuestro marco
		miPanel = new JPanel();
		setContentPane(miPanel);
		//Sin Layout
		miPanel.setLayout(null);
		
		//Creamos la tabla con la informaci�n JTable(info.filas,info.columnas)
		table = new JTable(datos,nombreColumnas);
//		table = new JTable(datos,nombreColumnas);
		
		//Creamos un JScrollPane (barra de desplazamiento) que contendra la tabla, asi
		//nuestra tabla tendr� las barras de desplazamiento
		scrollPane = new JScrollPane(table);
		//Dar tama�o al JScrollPane(mejor desde la vista de Design)
		scrollPane.setBounds(0, 0, 786, 563);
		//A�adimos el JScrollPane al panel, la tabla no hace falta, pues esta dentro del JScrollPane
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
