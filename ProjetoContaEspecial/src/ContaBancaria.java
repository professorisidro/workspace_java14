
public class ContaBancaria {
	/* a visibilidade "protected" protege o acesso dos atributos a partir de outras classes (que não
	 * são filhas de ContaBancária) porém permite que as classes filhas tenham acesso à estrutura
	 * declarada na classe pai
	 */
	protected int    numConta;
	protected String nomeTitular;
	protected double saldo;
	
	public ContaBancaria(int numConta, String nomeTitular, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String exibirInfo() {
		return this.numConta + " - " + this.nomeTitular + " R$ "+ this.saldo;
	}

	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
