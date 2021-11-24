package p2;

public abstract class Cartao {
	protected int id;
	protected int senha;
	protected String nome;
	protected Double limite;
	protected Double fatura;
	protected boolean status;
	
	public Cartao(int id, int senha, String nome, Double limite) {
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.limite = limite;
		this.fatura = 0.0;
		this.status = false;
	}

	public abstract void visualizarFatura(int senha);
	public abstract void fazerCompra(Produto produto,int senha);
	
	public void bloquearCartao(int senha) {
		if(this.senha == senha) {
			this.status = true;
			System.out.println("bloqueado");
		}
		else {
			System.out.println("Senha não compativel, impossilve bloquear");
		}
	}
	public void desbloquearCartao(int senha) {
		if(this.senha == senha) {
			this.status = false;
			System.out.println("desbloqueado");
		}
		else {
			System.out.println("Senha não compativel, impossilve desbloquear");
		}
	}
	
	public Double getFatura() {
		return fatura;
	}

	public void setFatura(Double fatura) {
		this.fatura = fatura;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
