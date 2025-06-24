package br.com.senaisp.bauru.aula07;

import java.util.Random;

public class CartaTeste {

	public static void main(String[] args) {
		Carta ct = new Carta(rnd.nextInt(4),rnd.nextInt(13));//AS DE Ouro
		Random rnd= new Random();
		System.out.println(ct.getNaipe());
		System.out.println(ct.getNumero());
		System.out.println(ct.getValor());
	}

}
