package pruebas;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Arrays;

/**
 * 
 * Clase de ejemplo para crear una tabla en Java con datos
 * de una consulta SQL
 * 
 * Requisitos: Disponer de una tabla "productos" con registros dentro
 * 
 * */


public class TablaBBDD extends JFrame {

	//Atributos de clase. Componentes gr�ficos
	private JPanel miPanel;
	private JTable table;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
		
		//Variables para establecer la conexi�n con la BBDD
		String bd = "base";
		String url="jdbc:mysql://localhost:3306/" + bd ;
		
		String user="manu";
		String pass="mipass";
		
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
			rs = stmt.executeQuery("Select * from productos");
			
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
			TablaBBDD miTabla = new TablaBBDD(nombreColumnas,datos);
			
		}catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException: " + ex.getMessage());
		}catch(SQLException ex) {
			System.out.println("SQLException: " +ex.getMessage());
			ex.printStackTrace();
		}
		
		
	}


	public TablaBBDD(String[] nombreColumnas, String[][] datos) {
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
		
		//Creamos un JScrollPane (barra de desplazamiento) que contendra la tabla, asi
		//nuestra tabla tendr� las barras de desplazamiento
		scrollPane = new JScrollPane(table);
		//Dar tama�o al JScrollPane(mejor desde la vista de Design)
		scrollPane.setBounds(0, 0, 786, 563);
		//A�adimos el JScrollPane al panel, la tabla no hace falta, pues esta dentro del JScrollPane
		miPanel.add(scrollPane);
		
		//Hacemos visible la ventana
		setVisible(true);
	
	}

}
