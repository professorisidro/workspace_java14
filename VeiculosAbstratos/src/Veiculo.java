
public abstract class Veiculo {
	protected String marca;
	protected int    ano;
	
	public Veiculo(String marca, int ano) {
		super();
		this.marca = marca;
		this.ano = ano;
	}
	
	/* com classes abstratas, apesar de "não poder dar new no objeto" eu consigo
	 * criar "cláusulas contratuais", de modo que meus descendentes sejam obrigados
	 * a implementar a lógica destes métodos
	*/
	 
	public abstract void acelerar();
	public abstract void frear();

}
