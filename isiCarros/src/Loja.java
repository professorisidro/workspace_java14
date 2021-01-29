
public class Loja {
	public static void main(String[] args) {
		
		Carro c1;  // declarei uma variável c1 do tipo Carro
		Carro c2;
		
		// antes de começar a preencher os dados, preciso criar a área de memória
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca  = "Xevrolé";
		c1.modelo = "Corça";
		c1.cor    = "Branco com detalhes em preto para realçar a beleza";
		c1.ano    = 1997;
		c1.preco  = 6999.00;
		
		c2.marca  = "Porxe";
		c2.modelo = "Kaieni";
		c2.cor    = "Preta";
		c2.ano    = 2019;
		c2.preco  = 839999.00;
		
		// exibindo os anuncios
		c1.exibirAnuncio();
		double ipvaC1 = c1.calcularIPVA(); // internamente ipvaC1 = valorIPVA (variável que está dentro do método)
		System.out.println("para voce que perguntou, o IPVA deste carro é R$ "+ipvaC1);
		
		c2.exibirAnuncio();
		double ipvaC2 = c2.calcularIPVA(); 
		System.out.println("Agora, este outro carro, tem IPVA no valor de R$ "+ipvaC2);
		
		System.out.println("O patrao ficou louco!!! Todos os carros com 10% de desconto");
		System.out.println(c1.marca+"/"+c1.modelo+ " agora por R$ "+ c1.calcularNovoPrecoComDesconto(10.0));
		
		/*
		System.out.println("----- Anuncio do isiCarros");
		System.out.println(" Carro: "+ c1.marca+"  "+c1.modelo+ "/" + c1.ano);
		System.out.println(" Cor:  "+c1.cor);
		System.out.println(" Preço  R$ "+c1.preco);
		
		System.out.println("----- Anuncio do isiCarros");
		System.out.println(" Carro: "+ c2.marca+"  "+c2.modelo+ "/" + c2.ano);
		System.out.println(" Cor:  "+c2.cor);
		System.out.println(" Preço  R$ "+c2.preco);
		*/
	}

}
