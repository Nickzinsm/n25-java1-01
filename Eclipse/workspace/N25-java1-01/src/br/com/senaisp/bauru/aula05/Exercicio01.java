package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Usando o Scanner para ler um aquivo de texto
		Scanner sc = new Scanner(
				Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine(); //pegando cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//Imprimindo o cabeçaclho
		while(sca.hasNext()) {
			System.out.print(sca.next()+"\t\t"); // \t = tab
		}
		System.out.println(); //Pulando a linha
		sca.close(); //fechado o scanner de apoio
		while(sc.hasNextLine()) {
		linha = sc.nextLine();
		sca = new Scanner(linha);
		sca.useDelimiter(";");
			
		}
		
	}

}
