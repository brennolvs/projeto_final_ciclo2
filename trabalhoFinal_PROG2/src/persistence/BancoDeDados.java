package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BancoDeDados {

	public static Connection getConnection() throws SQLException {
			String url_con = "jdbc:mysql://127.0.0.1:3306/agenda";
			String user = "root";
			String pass = "bakuman2";
			return DriverManager.getConnection(url_con, user, pass);
		}
}