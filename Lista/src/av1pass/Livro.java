package av1pass;


public class Livro {

	
	private String titulo;
	private String autor;
	private String editora;
	private int numPaginas;
	private int anoPublicacao;
	
	private int disponibilidade;
	
	private String aluno;
	private int diaEmprestimo;
	private int diaDevolucao;
	
	public Livro(String titulo, String autor, String editora, int numPaginas, int anoPublicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.anoPublicacao = anoPublicacao;
		
		this.disponibilidade = 0;
		this.aluno = "";
		this.diaEmprestimo = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}
		
	public void emprestarLivro(String livro, String nomeAluno, int dataHoje) {
		if(livro.equals(this.titulo)){
			if(this.disponibilidade == 0) {
				setDisponibilidade(1);
				setAluno(nomeAluno);
				setDiaEmprestimo(dataHoje);
				System.out.println("O livro foi emprestado com sucesso");
				
			}
			else {
				System.out.println("O livro foi emprestado por outro aluno");
			}
		}
		else {
			System.out.println("Não possuimos o livro na biblioteca");
		}
	}
	public void devolverLivro(String livro, int dataHoje) {
		
		if(livro.equals(this.titulo)){
			if(this.disponibilidade == 1) {
				setDisponibilidade(0);
				if(dataHoje - this.diaEmprestimo > 7) {
					int multa = 3*((dataHoje - this.diaEmprestimo)-7);
					setAluno("");
					setDiaEmprestimo(0);
					System.out.println("O livro foi devolvido com sucesso e com multa de" + multa + "reais");
				}
				else {
					setAluno("");
					setDiaEmprestimo(0);
					System.out.println("O livro foi devolvido com sucesso");
				}
			}
			else {
				System.out.println("O livro não foi emprestado");
			}
		}
	
		
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", numPaginas=" + numPaginas
				+ ", anoPublicacao=" + anoPublicacao + ", disponibilidade=" + disponibilidade + ", aluno=" + aluno
				+ ", diaEmprestimo=" + diaEmprestimo + ", diaDevolucao=" + diaDevolucao + "]";
	}
	
	
	}


