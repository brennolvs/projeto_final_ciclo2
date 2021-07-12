package test;

import dao.ContatoInsertDao;
import model.Contato;

import java.util.Scanner;


public class TestContatoInsert {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe nome: ");
			contato.setNome(sc.nextLine());
			
			System.out.println("Informe o email: ");
			contato.setEmail(sc.nextLine());
			
			System.out.println("Informe o endereco: ");
			contato.setEndereco(sc.nextLine());
			
			ContatoInsertDao dao = new ContatoInsertDao();
			dao.adiciona(contato);
			System.out.println("Contato adicionado com sucesso.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
