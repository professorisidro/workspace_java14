import java.util.Scanner;

import javax.swing.JOptionPane;


public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria(10012, 3, "Professor Isidro", "987.654.321-00");

		// System.out.println(c1.exibirInfo());

		int opcao=3;
		double valor;
		String texto;

//		c1.setNumeroConta(100123);
//		c1.setDigitoVerif(4);  
//		c1.setCpfTitular("987.654.321-00");		
//		c1.setNomeTitular("Professor Isidro");
//		c1.setSaldo(0.0);

		do {
			try {
//				System.out.println("Banco IsiTaú - Feito procê ");
//				System.out.println("Digite 1 - Deposito / 2 - Saque / 3 - Info / 0 - Encerrar");
				texto = JOptionPane.showInputDialog("Banco IsiTaú - Feito procê \nDigite 1 - Deposito / 2 - Saque / 3 - Info / 0 - Encerrar");				
				opcao = Integer.parseInt(texto);
				switch (opcao) {
				case 1:

//					System.out.print("Digite o valor do deposito:");
//					valor = teclado.nextDouble();
					texto = JOptionPane.showInputDialog("Digite o valor do deposito");
					valor = Double.parseDouble(texto);
					c1.creditar(valor);

					break;
				case 2:

//					System.out.print("Digite o valor do saque:");
//					valor = teclado.nextDouble();
					texto = JOptionPane.showInputDialog("Digite o valor do saque");
					valor = Double.parseDouble(texto);
					if (c1.debitar(valor)) {
						System.out.println("Autorizado!!");

					} else {
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
			} catch (ContaException ex) {
				JOptionPane.showMessageDialog(null, "ERRO - "+ex.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "CUIDADO - Entrada Incompativel","CUIDADO", JOptionPane.WARNING_MESSAGE);
			}

		} while (opcao != 0);

		/*
		 * ContaBancaria c2; c1.creditar(1000.00); c2 = new ContaBancaria(10021, 4,
		 * "Jose Louveira", "123.456.789-00");
		 * 
		 * System.out.println(c1.exibirInfo()); System.out.println(c2.exibirInfo());
		 * 
		 * c1.transferir(250.0, c2);
		 * 
		 * System.out.println("--- transferindo 250 mangos de c1 pra c2");
		 * System.out.println(c1.exibirInfo()); System.out.println(c2.exibirInfo());
		 * 
		 */

		teclado.close();
	}

}
