package githubproject;

import java.util.Scanner;

import githubproject.model.Cliente;

public class GitHubExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Olá amigo.");
		
		System.out.println("github");

		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		cliente.setNome(nome);
		
		System.out.println(cliente);
		
	}

}
