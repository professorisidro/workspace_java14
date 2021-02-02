package br.com.isidrocorp.folha.core;

public class Comissionado extends Funcionario{
	private float salarioBase;
	private float comissao;
	
	public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao / 100;
	}
	
	
	

}
