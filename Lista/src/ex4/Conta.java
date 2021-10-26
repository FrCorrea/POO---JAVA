package ex4;

public class Conta {
	
	private int numeroAgencia;
	private int numeroConta;
	private Double saldo;
	
	public Conta(int numeroAgencia, int numeroConta) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void sacar(Double a) {
		
		if(a>this.saldo){
			System.out.println("Saldo insuficiente para o saque");
		}
		else {
			this.saldo = this.saldo - a;
			System.out.println("Seu novo saldo é de : "+ this.saldo + "reais");
		}

	}
	public void depositar(Double a) {
		this.saldo = this.saldo + a;
	}
	
	public void imprimirSaldo() {
		System.out.println("Seu saldo é de:" + this.saldo + "reais");
	}
	
}
