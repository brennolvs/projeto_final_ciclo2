package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contato;

import persistence.BancoDeDados;


public class ContatoInsertDao {
		private Connection con;
		
		public ContatoInsertDao() throws SQLException{
			this.con = BancoDeDados.getConnection();
		}
		
		public void adiciona(Contato contato) throws SQLException{
			String sql ="insert into contatos(nome, email, endereco) values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			
			stmt.execute();
			stmt.close();
	}
}
