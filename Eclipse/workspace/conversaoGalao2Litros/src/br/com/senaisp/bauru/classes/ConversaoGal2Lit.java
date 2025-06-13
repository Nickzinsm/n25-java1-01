package br.com.senaisp.bauru.classes;

import java.util.Scanner;

public class ConversaoGal2Lit {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
		System.out.println("Favor digitar a quantidade a " + "quantidade de galões:");
		
		double galao = sc.nextDouble();														
		double litros = galao * 3.785;

		// Fazendo a converão e mostrando
		System.out.println(galao + " galões é igual a " + litros + " litros ");
		sc.close();
	}

}
