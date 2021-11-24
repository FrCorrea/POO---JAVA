package francisco;

public final class ContaPoupanca extends Conta{
	private Double rendimento;

	public ContaPoupanca(int numeroAgencia, int numeroConta, int senha, Double saldo, Correntista correntista,
			Double rendimento) {
		super(numeroAgencia, numeroConta, senha, saldo, correntista);
		this.rendimento = rendimento;
	}
	
	public Double calcularRendimento(Double valor) {
		return valor*(1+this.rendimento);
	}
	@Override
	public void depositar(int valor) {
		Double novoSaldo = calcularRendimento(valor + this.saldo);
		this.saldo = novoSaldo;
		System.out.println("Deposito feito com sucesso");
	}

	@Override
	public void sacar(int valor, int senha) {
		if(this.senha != senha) {
			System.out.println("Senha incorreta");
		}
		else if(valor > this.saldo) {
			System.out.println("Saldo insuficiente para saque");
		}
		else {
			this.saldo -= valor;
		}
		
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", numeroAgencia=" + numeroAgencia + ", numeroConta="
				+ numeroConta + ", senha=" + senha + ", saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
	
}
