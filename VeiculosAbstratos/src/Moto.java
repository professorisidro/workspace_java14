
public class Moto  extends Veiculo{
	private String tipo;

	public Moto(String marca, int ano, String tipo) {
		super(marca, ano);
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+" acelera na mão PROPROPRORPORPORPRPROOR");
		
	}

	@Override
	public void frear() {
		System.out.println("Moto "+super.marca+" freia no pé A9DSAUFPOIJASKLDAKÇLDFVMNQO=JQP0OIFIJMV");
		
	}
	
	

}
