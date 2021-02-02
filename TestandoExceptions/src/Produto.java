
public class Produto {
	private int id;
	private String descricao;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		// se o parametro do id for menor ou igual a 0, gere um erro
		if (id <= 0) {
			throw new IsiException("ID nao pode ser zero ou negativo!");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao)  {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descricao nao pode estar vazia!");
		}
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco)  {
		if (preco < 0) {
			throw new IsiException("Preco nao pode ser negativo");
		}
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	

}
