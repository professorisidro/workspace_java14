import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String texto;
		int idUser;
		String descUser;
		double precoUser;
		int opcao=1;

		do {
			try {
				Produto p = new Produto();
				System.out.print("Digite o ID:");
				texto = teclado.nextLine();
				idUser = Integer.parseInt(texto);
				p.setId(idUser);

				System.out.print("Digite a Descricao:");
				descUser = teclado.nextLine();
				p.setDescricao(descUser);

				System.out.print("Digite o Preço:");
				texto = teclado.nextLine();
				precoUser = Double.parseDouble(texto.replace(",", "."));
				p.setPreco(precoUser);

				System.out.println("Produto CADASTRADO");
				System.out.println(p);
				
				System.out.println("Deseja cadastrar outro? 1-sim / 0-nao");
				opcao = Integer.parseInt(teclado.nextLine());

			}
			catch(IsiException ex) {
				System.out.println("Erro de Regra de Negocio "+ex.getMessage());
			}
			catch (Exception ex) {
				System.out.println("ERRO - " + ex.getMessage());
				System.out.println("tipo="+ex.getClass().getName());
			}

		} while (opcao != 0);
		teclado.close();
	}

}
