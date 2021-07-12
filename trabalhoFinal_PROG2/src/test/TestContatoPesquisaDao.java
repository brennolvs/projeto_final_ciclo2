package test;

import java.util.Scanner;

import dao.ContatoPesquisaDao;
import model.Contato;

public class TestContatoPesquisaDao {

	public static void main(String[] args) {
		try {
			String nome = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe nome: ");
			nome=sc.nextLine();
			
			ContatoPesquisaDao cpdao = new ContatoPesquisaDao();
			cpdao.buscarContatoPeloNome(nome);;
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		
	}
}
