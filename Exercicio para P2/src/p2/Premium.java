package p2;

public final class Premium extends Cartao{

	private int pontos;
	
	public Premium(int id, int senha, String nome, Double limite) {
		super(id, senha, nome, limite);
		this.pontos = 0;
	}

	public void visualizarFatura(int senha) {
		if(this.senha == senha) {
			System.out.println("Nome:" + getNome());
			System.out.println("Fatura:" + getFatura() + "reais");
			System.out.println("Você tem :" + this.pontos + "pontos");
			
		}
		else {
			System.out.println("Impossivel visualizar fatura, senha incorreta");
		}
		
	}

	@Override
	public void fazerCompra(Produto produto, int senha) {
		if(getStatus() || this.senha != senha) {
			System.out.println("Senha incorreta ou limite bloqueado - Impossivel comprar");
		}
		else if(produto.getValor() >= this.limite) {
			System.out.println("Limite insuficiente - Impossivel comprar");
		}
		else {
			this.fatura += produto.getValor();
			this.limite -= produto.getValor();
			this.pontos += produto.getValor();
			
			System.out.println("Compra realizada com sucesso ! ");
			System.out.println("Data da compra:" + produto.getDataCompra());
			System.out.println("Produto:" + produto.getNome());
			System.out.println("Valor da compra:" + produto.getValor());
			
		}
	}
	
}
