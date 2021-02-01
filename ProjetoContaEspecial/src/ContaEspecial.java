
public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	
	
	public ContaEspecial(int numConta, String nomeTitular, double saldo, double limite) {
		super(numConta, nomeTitular, saldo);
		this.limite = limite;
	}
	
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String exibirInfo() {
		return super.numConta + " - " + super.nomeTitular + " R$ "+super.saldo+"   R$ "+this.limite;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
