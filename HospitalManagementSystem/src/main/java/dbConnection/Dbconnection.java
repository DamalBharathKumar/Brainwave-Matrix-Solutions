package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	
	private static Connection con=null;
	private Dbconnection() {}
	static {
		try {
			
			Class.forName(DBINFO.driver);
			con= DriverManager.getConnection(DBINFO.dbUrl,DBINFO.dbName,DBINFO.dbPword);
			
			
		}catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getCon() {
		return con;
	}
	
}
