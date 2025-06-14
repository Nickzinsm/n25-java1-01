package br.com.senaisp.bauru.aula04;

public class Exomplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str01 = "Roberto da Silva Sauro";
		//Verificar se ha dino no texto
		System.out.println(str01.contains("Sauro"));
		//Obter aa posição no texto deum subtexto
		System.out.println(str01.indexOf("o " ,7));
		//Obter o caracter na posição desejada
		System.out.println(str01.charAt(3));
		//Obtndo substring de uma string sem limitar final
		System.out.println(str01.substring(0));
		//Obtndo substring de uma string sem limitando final
		System.out.println(str01.substring(8,16));
		//Usando o compareTo
		System.out.println(str01.compareTo("Roberta"));
		
		

	}

}
