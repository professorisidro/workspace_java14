package br.com.isidrocorp.folha.core;

public class Horista extends Funcionario {
	
	private int numHoras;
	private float valorHora;
	
	public Horista(int numRegistro, String nome, int numHoras, float valorHora) {
		super(numRegistro, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return numHoras * valorHora;
	}
	
	

}
