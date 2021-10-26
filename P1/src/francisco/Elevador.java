package francisco;

public class Elevador {
	
	private int totalAndares;
	private int capacidade;
	
	private int andarAtual;
	private int pessoasPresentes;
	
	public Elevador(int totalAndares, int capacidade) {
		
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.andarAtual = 0;
		this.pessoasPresentes = 0;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
	
	public void adicionarPessoa() {
		if(this.pessoasPresentes == this.capacidade) {
			System.out.println("O elevador está com carga máxima, não se deve adicionar ninguém ao elevador");
		}
		else {
			this.pessoasPresentes++;
		}
	}
	
	
	public void removerPessoa() {
		if(this.pessoasPresentes == 0) {
			System.out.println("Não tem ninguem no elevador para remover");
		}
		else {
			this.pessoasPresentes--;
		}

	}
	
	public void subirElevador() {
		if(this.pessoasPresentes > this.capacidade) {
			System.out.println("Carga máxima excedida, alguém deve sair do elevador");
		}
		else {
			if(this.andarAtual == this.totalAndares) {
				System.out.println("Você já está no último andar");
			}
			else {
				this.andarAtual++;
			}
		}
	}
	
	public void descerElevador() {
		if(this.pessoasPresentes > this.capacidade) {
			System.out.println("Carga máxima excedida, alguém deve sair do elevador");
		}
		else {
			if(this.andarAtual == 0) {
				System.out.println("Você já está no térreo");
			}
			else {
				this.andarAtual--;
			}
		}
	}
	
	public void exibirRelatorio() {
		System.out.println("O prédio tem: " + this.totalAndares + " andares");
		System.out.println("O elevador tem: " + this.capacidade + " pessoas de capacidade");
		if(this.andarAtual == 0) {
			System.out.println("O elevador está no térreo");
		}
		else {
			System.out.println("O elevador está no : " + this.andarAtual + " andar atualmente");
		}
		
		System.out.println("O elevador possui: " + this.pessoasPresentes + " pessoas no Elevador");
	}

	@Override
	public String toString() {
		return "Elevador [totalAndares=" + totalAndares + ", capacidade=" + capacidade + ", andarAtual=" + andarAtual
				+ ", pessoasPresentes=" + pessoasPresentes + "]";
	}
	
	
	
}
