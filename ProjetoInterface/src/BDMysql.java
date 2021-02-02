
public class BDMysql implements InterfaceBD {

	@Override
	public void conectar(String banco, String user, String senha) {
		System.out.println("Conectando MySQL no banco "+banco+" com usuario "+user);		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
	}

	@Override
	public void desconectar(String banco) {
		System.out.println("Desconectando Mysql do banco "+banco);
	}

}
