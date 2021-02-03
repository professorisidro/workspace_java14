import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria c1  = new ContaBancaria(10012,3,"Professor Isidro","987.654.321-00");
		
		//System.out.println(c1.exibirInfo());
		
		int opcao;
		double valor;
		
//		c1.setNumeroConta(100123);
//		c1.setDigitoVerif(4);  
//		c1.setCpfTitular("987.654.321-00");		
//		c1.setNomeTitular("Professor Isidro");
//		c1.setSaldo(0.0);
		
		do {
			System.out.println("Banco IsiTaú - Feito procê ");
			System.out.println("Digite 1 - Deposito / 2 - Saque / 3 - Info / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digite o valor do deposito:");
				valor = teclado.nextDouble();
				c1.creditar(valor);
				break;				
			case 2:
				System.out.print("Digite o valor do saque:");
				valor = teclado.nextDouble();				
				if (c1.debitar(valor)) {
					 
				}
				else {
					System.out.println("Saque não autorizado");
				}
				break;
			case 3:
				System.out.println(c1.exibirInfo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:	
				System.out.println("Opcao invalida! Tente novamente");
			}
			
			
		} while (opcao  != 0);
		
		
		
		/*ContaBancaria c2;
		c1.creditar(1000.00);
		c2 = new ContaBancaria(10021, 4, "Jose Louveira", "123.456.789-00");
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		c1.transferir(250.0, c2);
		
		System.out.println("--- transferindo 250 mangos de c1 pra c2");
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		*/
		
		
		teclado.close();
	}

}
