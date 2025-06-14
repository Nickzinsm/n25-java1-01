package br.com.senaisp.bauru.aula03;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by = 127;// -128 a 127
		by+= 2;
		System.out.println(by);
		char letra = 'A'; //65 // tabela ascii
		letra += 3;
		System.out.println(letra);
		if ('A'>'a') { //a = 97
			
			System.out.println("A é maior que a");
		}else {
			System.out.println("a é Maior que A");
		}
		char letra2 = 'X';
		System.out.println(letra + letra2);
		System.out.println("" +letra + letra2);
		int vl = 10;
		int vl2 = ++vl + 5;     
		System.out.println(vl + " " + vl2);
		vl = 10;
		vl2 = ++vl + 5;
		System.out.println(vl + " " + vl2);                //se for ++ depois do vl (pos-incremento) ele 
		                                     //  so ira incrementar +1 no final de todas as contas,
		                                     //  se for ++ antes do vl (pre-incremento) ele prioriza incrementar antes
		                                     //  de realizar as operações.
		System.out.println(vl + " " + vl2);
	}

}
