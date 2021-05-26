package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Utiles {
	
public static void nomCombo(ArrayList<String> animeNom) {
	
	
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
			
		
		rs=stmt.executeQuery("select * from animes");
		
		while(rs.next()) {
			
			animeNom.add(rs.getString("nombreA"));
			
		}
		
		}catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		}catch (SQLException e1) {
		
			e1.printStackTrace();
		}
	}
}
