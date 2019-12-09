package in.codeblog.cmsapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DBUtil class represent connection related inform.
 * 
 * @author admin
 *
 */
public class DBUtil {

	private Connection connection = null;
	private PreparedStatement  preparedStatement=null;
	static {
		try {
			Class c = Class.forName("com.mysql.jdbc.Driver");
			System.out.println(c);
			System.out.println("Driver Load Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection connect() {
		String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
		try {
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return null;
		return connection;

	}

	public PreparedStatement preparedStatement(String sql) {
		
		 try {
			preparedStatement=connect().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
		
	}

}
