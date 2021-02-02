package userinterface;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		CartaoPrePago cartoes[];
		
		// vetor de 4 referências para objetos da classe-pai (Cartao Pre Pago)
		cartoes = new CartaoPrePago[4];
		
		cartoes[0] = new CartaoPrePago("111 111", "Cliente PP1", 2020, 10, 0.0);
		cartoes[1] = new CartaoCashBack("222 222", "Cliente CB1", 2020, 10, 0.0, 2);
		cartoes[2] = new CartaoCashBack("333 333", "Cliente CB2", 2020, 10, 0.0, 1);
		cartoes[3] = new CartaoCashBack("444 444", "Cliente CB3", 2020, 10, 0.0, 0);
		
		for (int pos=0; pos<4; pos++) {
			cartoes[pos].adicionarCredito(1000.0);
			System.out.println(cartoes[pos]);
			
			cartoes[pos].comprar(100);
			System.out.println(cartoes[pos]);
		}
		
		
		/*CartaoPrePago cpp;
		CartaoCashBack cb1, cb2, cb3;
		
		cpp = new CartaoPrePago ("111 222 333 444", "Isidro        ", 2022, 10, 0.0);
		cb1 = new CartaoCashBack("222 333 444 555", "Cliente Gold  ", 2022, 10, 0.0, 0);
		cb2 = new CartaoCashBack("222 444 555 666", "Cliente Silver", 2022, 10, 0.0, 1);
		cb3 = new CartaoCashBack("222 555 666 777", "Cliente Bronze", 2022, 10, 0.0, 2);
		
		
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		// adicionando crédito em todo mundo...
		cpp.adicionarCredito(1000);
		cb1.adicionarCredito(1000);
		cb2.adicionarCredito(1000);
		cb3.adicionarCredito(1000);
		System.out.println("\n\n ---> Adicionando R$ 1000,00 de crédito nos cartoes");
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		// 
		
		cpp.comprar(100);
		cb1.comprar(100);
		cb2.comprar(100);
		cb3.comprar(100);
		
		System.out.println("\n\n ---> Comprando R$ 100,00 em todos os cartoes");
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);*/
		
	}

}
