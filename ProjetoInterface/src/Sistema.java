
public class Sistema {
	public static void main(String[] args) {
		
		InterfaceBD ibd;
		
		ibd = new BDOracle();
		
		ibd.conectar("db_clientes", "admin", "1234");
		ibd.executar("SELECT * FROM tbl_clientes");
		ibd.desconectar("db_clientes");
	}

}
