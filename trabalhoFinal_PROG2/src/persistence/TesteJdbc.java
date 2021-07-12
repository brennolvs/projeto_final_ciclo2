
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteJdbc {

	public static void main(String[] args) {
		try {
			String url_con = "jdbc:mysql://127.0.0.1:3306/test";
			String user = "root";
			String pass = "bakuman2";
			Connection con = DriverManager.getConnection(url_con, user, pass);
			System.out.println("Ok, conectado ao banco");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
