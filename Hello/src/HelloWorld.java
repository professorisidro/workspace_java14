import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		
		System.out.println("ufa... depois de tudo, funfou!");
		System.out.println("agora vai!!!");
		a = teclado.nextInt();
		System.out.println("Voce digitou = "+a);
		
		teclado.close();
	}
}

