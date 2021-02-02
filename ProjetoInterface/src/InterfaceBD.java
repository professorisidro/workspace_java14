/* o que é uma interface?
 * uma interface é uma "especificação" de serviços
 * ou seja, um conjunto de cláusulas contratuais, nas quais uma classe 
 * se compromete a implementar lógica?
 * Ok, qual a diferença para Classes Abstratas?
 * 	em interfaces, não temos atributos, portanto, o uso de interfaces está
 * mais relacionado a classes de serviços (classes que só tem métodos/funcionalidades),
 * e não são associadas a tipos de dados).
 * 
 */
public interface InterfaceBD {
	public void conectar(String banco, String user, String senha);
	public void executar(String comando);
	public void desconectar(String banco);
}
