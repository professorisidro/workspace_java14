package br.com.isidrocorp.folha.core;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * adicionalFuncao/100 + beneficioTerno;
	}
	

}
