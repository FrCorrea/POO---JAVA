package p2;

public final class Produto {
	private String nome;
	private Double valor;
	private String dataCompra;
	
	public Produto(String nome, Double valor, String dataCompra) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.dataCompra = dataCompra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
