package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		System.out.println("Digite seu sobrenome");
		String nome = sc.next(); //Utiliza o delimitador padrão
		String sobrenome = sc.next();
		System.out.println("Seu nome é " + nome);
		System.out.println("Seu sobrenome é " +" "+ sobrenome );
		//Pegando o nome completo
		System.out.println("Digite seu nome completo ");
		sc.nextLine();//Captura o enter do comando anterior
		String nomeCompleto = sc.next();
		sc.close();
	}

}
