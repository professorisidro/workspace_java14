
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		
		p1 = new Produto(1,"Computador", 2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; // pergunta: dupliquei a área da memória?
		
		// simulação: vou alterar o preço do produto p2
		// de 2000.00 vai para 2500.00
		
		// se efetivamente, ao atribuir p2 = p1 nós duplicássemos a área de 
		// memória, eu alteraria o produto p2 e o produto p1 ficaria intacto, correto?
		
		p2.setPreco(2500.00);
		
		System.out.println("------- após a alteração do preço de p2");
		System.out.println("p1 = "+ p1.exibirInfo());
		System.out.println("p2 = "+ p2.exibirInfo());
		
		p2 = new Produto(p1.getId(), p1.getDescricao(), p1.getPreco());
	
		
	}

}
