
public class Empregado {

	String nome;
	String cargo;
	double salario;
	
	void imprimirInfo(){
		System.out.println("Funcionario: "+nome+ "("+cargo+") R$ "+salario);
	}
	
	void aumentarSalario(double percentual){
		salario = salario + salario * percentual / 100;
	}
}
