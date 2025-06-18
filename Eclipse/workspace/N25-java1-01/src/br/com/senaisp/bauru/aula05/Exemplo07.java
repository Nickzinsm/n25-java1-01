package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE S ou N:");
		String res = sc.nextLine(); 
				//Usnando operador ternario
				//TesteLogico ? valor_se_verdade : valor_se_falso
		System.out.println("Voce digitou " +
		( res.charAt(0)=='S' ? "sim" : "nao"));
		sc.close();
	}

}
