
package francisco;

public final class Correntista {
	private int cpf;
	private String nome;
	private Endereco endereco;
	
	
	public Correntista(int cpf, String nome, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Correntista [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
}
