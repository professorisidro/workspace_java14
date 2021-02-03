
public class ContaBancaria {
	private int    numeroConta;
	private int    digitoVerif;
	private String cpfTitular;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, int dv, String nome, String cpf) {
		this.numeroConta = numeroConta;
		this.digitoVerif = dv;
		this.nomeTitular = nome;
		this.cpfTitular  = cpf;
		this.saldo       = 0.0;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
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

	public String exibirInfo() {
		return numeroConta+"-"+digitoVerif+" : " +nomeTitular+"("+cpfTitular+")  R$ "+saldo; 
	}
	
	public void creditar(double valor) {
		if (valor <= 0 ) {
			throw new ContaException("Valor invalido para crédito!");
		}
		saldo += valor;
	}
	
	public boolean debitar(double valor){
		if (valor <= 0) {
			throw new ContaException("Valor invalido para débito");
		}
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferir(double valor, ContaBancaria destino) {
		if (saldo >= valor) {
			this.saldo -= valor;      // debitei da minha conta
			destino.creditar(valor);  // creditei na conta destino
			return true;
		}
		else {
			return false;
		}
	}

}
