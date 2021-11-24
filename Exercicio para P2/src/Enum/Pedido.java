package Enum;

public class Pedido {
	private Integer id;
	private String data;
	private Status statusPedido;//1,2,3.....
	
	
	public Pedido(Integer id, String data) {
		super();
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void atualizarPedido(Status statusAtual) {
		this.statusPedido = statusAtual;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", statusPedido=" + statusPedido + "]";
	}
	

}
