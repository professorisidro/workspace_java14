
public class BombaDeCombustivel {
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private double valorTotal;
	
	public BombaDeCombustivel(String nomeCombustivel, double precoLitro) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
	}

	public void abastecerPorLitros(double qtde) {
		this.qtdeLitros = qtde;  // eu quero armazenar a quantidade informada, para depois utiliza-la no recibo
		this.valorTotal = this.qtdeLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double total) {
		this.valorTotal = total;
		this.qtdeLitros = this.valorTotal / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo =   "=========================================\n"
	                    + "      IsidroCorp(c) - Gas & Energy       \n"
				        + "-----------------------------------------\n"
				        + "  Combustivel : "+nomeCombustivel+ "\n"
				        + "  Preço Litro : R$ "+String.format("%.3f", precoLitro) + "\n"
				        + "  Litros      : " + String.format("%.3f", qtdeLitros) + "\n"
				        + "  VALOR TOTAL : R$ "+String.format("%.2f", valorTotal)+ "\n"
				        + "-----------------------------------------";
        return recibo;
	}
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
