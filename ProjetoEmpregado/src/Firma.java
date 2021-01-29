
public class Firma {
	public static void main(String[] args) {
		Empregado e1, e2;
		
		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.nome = "Professor Isidro";
		e1.cargo = "Professor";
		e1.salario = 32643.00;
		
		e2.nome = "Regina Giovanini";
		e2.cargo = "Coordenadora";
		e2.salario = 38917.00;

		e1.imprimirInfo();
		e2.imprimirInfo();
		
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(15.0);
		
		e1.imprimirInfo();
		e2.imprimirInfo();
		
	}

}
