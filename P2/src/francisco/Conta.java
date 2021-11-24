package francisco;

public abstract class Conta {
	protected int numeroAgencia;
	protected int numeroConta;
	protected int senha;
	protected Double saldo;
	protected Correntista correntista;
	
	public Conta(int numeroAgencia, int numeroConta, int senha, Double saldo, Correntista correntista) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.saldo = saldo;
		this.correntista = correntista;
	}
	
	public abstract void depositar(int valor);
	public abstract void sacar(int valor, int senha);
	
	public void verificarSaldo(int senha) {
		if(this.senha != senha) {
			System.out.println("Senha incorreta");
		}
		else {
			System.out.println("Agencia: " + this.numeroAgencia);
			System.out.println("Conta: " + this.numeroConta);
			System.out.println("Correntista: " + correntista.getNome());
			System.out.println("Saldo: " + this.saldo + " reais");
		}
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", senha=" + senha
				+ ", saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
}

