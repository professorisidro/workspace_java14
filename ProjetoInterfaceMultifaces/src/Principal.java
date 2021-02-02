
public class Principal {
	public static void main(String[] args) {
		ObjetoAB obj = new ObjetoAB();
		
		obj.metodoA1();
		obj.metodoA2();
		obj.metodoB1();
		obj.metodoB2();
		
		
		InterfaceA ia = obj;
		ia.metodoA1();
		ia.metodoA2();
		
		InterfaceB ib = obj;
		ib.metodoB1();
		ib.metodoB2();
	}

}
