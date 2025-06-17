package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr = sc.nextInt();
		switch(vlr) {
		case 1: System.out.println("Você ganhou uma caneta");
		case 2: System.out.println("Você ganhou um lapis");
		case 3: System.out.println("Você ganhou borracha");
		case 4: System.out.println("Você ganhou bombom");
		case 5: System.out.println("Opção invalida");
		}
		sc.close();
	}

}
