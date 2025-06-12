package br.co.senaisp.bauru.classes;

public class Estudante {
	//Fields ou campos ou Variaveis de instância
	private String nome;
	private int ra;
	private double nota;
	private boolean ehFumante;
	//Constructor
	public Estudante() {
		setNome("sem nome");
		ra = 0;
		nota = 0.0;
		ehFumante = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public double getNota() {
		return nota;
	}
	public boolean isEhFumante() {
		return ehFumante;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public void setEhFumante(boolean ehFumante) {
		this.ehFumante = ehFumante;
	}
	

}
