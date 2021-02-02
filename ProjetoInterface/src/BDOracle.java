
public class BDOracle implements InterfaceBD {

	@Override
	public void conectar(String banco, String user, String senha) {
		System.out.println("Oracle Service - connecting "+user+"@"+banco);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle> "+comando);
		
	}

	@Override
	public void desconectar(String banco) {
		System.out.println("Oracle service - disconnecting "+banco);
	}

}
