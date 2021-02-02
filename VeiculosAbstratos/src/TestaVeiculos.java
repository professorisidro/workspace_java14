
public class TestaVeiculos {
	public static void main(String[] args) {
		Veiculo v,m;
		
		v = new Carro("Vokis",1965,"Fuscao");
		m = new Moto("CG",1980,"Superbike");
		v.acelerar();
		v.frear();
		
		m.acelerar();
		m.frear();
		
	}
}
