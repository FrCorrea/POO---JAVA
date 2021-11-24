package Enum;

public class Teste {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(1,"21/10/2020");
		System.out.println(pedido.toString());
		
		pedido.atualizarPedido(Status.ENTREGUE);
		System.out.println(pedido.toString());
	}
}
