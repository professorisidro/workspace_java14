
public class Carro extends Veiculo {
	private String modelo;

	public Carro(String marca, int ano, String modelo) {
		super(marca, ano);
		this.modelo = modelo;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marca+ "/"+this.modelo+ " acelera no pé VRUUUMMMM!");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro "+super.marca+"/"+this.modelo+" freia na mão IIIICCCCHHHHH");
		
	}

	
	
	
	

}
