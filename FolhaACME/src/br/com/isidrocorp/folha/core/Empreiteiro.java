package br.com.isidrocorp.folha.core;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(int numRegistro, String nome, float valorEmpreita) {
		super(numRegistro, nome);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	

}
