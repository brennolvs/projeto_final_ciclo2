package dao;

import java.sql.SQLException;
import java.util.List;

import model.Contato;

public class ContatoPesquisaDao {
	
	public static void buscarContatoPeloNome(String nome) throws SQLException {
		
		try {
			ContatoListaDao cldao = new ContatoListaDao();
			List<Contato> contatos = cldao.getLista();
			
			for (Contato contato : contatos) {
				if (contato.getNome().equalsIgnoreCase(nome)) {
					
				System.out.println("Nome: "+contato.getNome());
				System.out.println("E-mail: "+contato.getEmail());
				System.out.println("Endereço: "+contato.getEndereco());
				
				}else {
					System.out.println("Nenhum contato encontrado");
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
