package francisco;

public final class ContaCorrente extends Conta{
	private Double limite;
	
	public ContaCorrente(int numeroAgencia, int numeroConta, int senha, Double saldo, Correntista correntista, Double limite) {
		super(numeroAgencia, numeroConta, senha, saldo, correntista);
		this.limite = limite;
	}

	@Override
	public void depositar(int valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(int valor, int senha) {
		
		if(this.senha != senha) {
			System.out.println("Senha incorreta");
		}
		else if(valor > (this.saldo + this.limite)) {
			System.out.println("Excedeu o limite de saque");
		}
		else if(valor > this.saldo) {
			Double valorExcedente = valor - this.saldo;
			this.saldo = saldo - valor;
			this.limite -= valorExcedente;
			System.out.println("Saque realizado com sucesso");
		}
		else {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso");
		}
		
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta
				+ ", senha=" + senha + ", saldo=" + saldo + ", correntista=" + correntista + "]";
	}	

	
}
