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
			System.out.println("O elevador est� com carga m�xima, n�o se deve adicionar ningu�m ao elevador");
		}
		else {
			this.pessoasPresentes++;
		}
	}
	
	
	public void removerPessoa() {
		if(this.pessoasPresentes == 0) {
			System.out.println("N�o tem ninguem no elevador para remover");
		}
		else {
			this.pessoasPresentes--;
		}

	}
	
	public void subirElevador() {
		if(this.pessoasPresentes > this.capacidade) {
			System.out.println("Carga m�xima excedida, algu�m deve sair do elevador");
		}
		else {
			if(this.andarAtual == this.totalAndares) {
				System.out.println("Voc� j� est� no �ltimo andar");
			}
			else {
				this.andarAtual++;
			}
		}
	}
	
	public void descerElevador() {
		if(this.pessoasPresentes > this.capacidade) {
			System.out.println("Carga m�xima excedida, algu�m deve sair do elevador");
		}
		else {
			if(this.andarAtual == 0) {
				System.out.println("Voc� j� est� no t�rreo");
			}
			else {
				this.andarAtual--;
			}
		}
	}
	
	public void exibirRelatorio() {
		System.out.println("O pr�dio tem: " + this.totalAndares + " andares");
		System.out.println("O elevador tem: " + this.capacidade + " pessoas de capacidade");
		if(this.andarAtual == 0) {
			System.out.println("O elevador est� no t�rreo");
		}
		else {
			System.out.println("O elevador est� no : " + this.andarAtual + " andar atualmente");
		}
		
		System.out.println("O elevador possui: " + this.pessoasPresentes + " pessoas no Elevador");
	}

	@Override
	public String toString() {
		return "Elevador [totalAndares=" + totalAndares + ", capacidade=" + capacidade + ", andarAtual=" + andarAtual
				+ ", pessoasPresentes=" + pessoasPresentes + "]";
	}
	
	
	
}
