package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contato;
import persistence.BancoDeDados;

public class ContatoListaDao {
	
	private Connection con;
	
	public ContatoListaDao() throws SQLException{
		this.con = BancoDeDados.getConnection();
	}
	
	public List<Contato> getLista() throws SQLException{
		String sql ="SELECT * FROM 	contatos";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset =stmt.executeQuery();
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		while(rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
		}
		rset.close();
		stmt.close();
		return contatos;
	}

}
