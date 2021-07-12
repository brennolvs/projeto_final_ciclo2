package persistence;

import java.sql.Connection;


public class TestConnection_factory {

	public static void main(String[] args) {
		try {
			Connection con = BancoDeDados.getConnection();
			System.out.println("Conectado ao SGBD MySql local.");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
 