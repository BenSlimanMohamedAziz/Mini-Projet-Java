package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	static Connection Cx = null ;
	static {
		try{
		String db_url="jdbc:mysql://localhost:3306/entreprise";
		
		String userName="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Cx=DriverManager.getConnection(db_url,userName,password);
		System.out.print("Connexion succes !");
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Connexion Error:"+ e.getMessage());
		}
	}
	public static Connection getCon(){
		return Cx ;

}
}

	