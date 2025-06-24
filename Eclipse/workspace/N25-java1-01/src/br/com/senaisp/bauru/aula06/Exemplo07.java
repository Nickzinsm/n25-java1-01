package br.com.senaisp.bauru.aula06;

public class Exemplo07 {

	public static void main(String[] args) {
		//Erro de sintax 
		int x=1, y=2
				if (x==y) {
					System.out.println("Aqui tem erro de sintax!");
				}
		if (x<y);{
			System.out.println("X e menor que Y");
		}
		for(int i=0;i<5;i++);{//Finalizei o for antes do bloco
			System.out.println("*");
		}
		if (x>y) {
			System.out.println("A conta é");
		}
		
	}
	

}
