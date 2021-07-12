package test;

import java.sql.Connection;
import java.util.List;

import dao.ContatoListaDao;
import model.Contato;
import persistence.BancoDeDados;

public class TestDaoGetLista {
	public static void main(String[] args) {
		try {
			ContatoListaDao cdao = new ContatoListaDao();
			List<Contato> contatos = cdao.getLista();
			
			System.out.println(contatos);
		
		for (Contato contato : contatos) {
			System.out.println("Nome: "+contato.getNome());
			System.out.println("E-mail: "+contato.getEmail());
			System.out.println("Endereço: "+contato.getEndereco());
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	}
}
