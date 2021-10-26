package Ex2;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private String modalidade;
	private Double cargaHoraria;
	private String conteudoPragmatico;
	
	public Disciplina(int codigo, String nome, String modalidade, Double cargaHoraria, String conteudoPragmatico) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudoPragmatico = conteudoPragmatico;
	}
	public void exibirRelatorio() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga Horária: " + this.cargaHoraria);
		System.out.println("Conteudo Pragmático: " + this.conteudoPragmatico);
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getConteudoPragmatico() {
		return conteudoPragmatico;
	}

	public void setConteudoPragmatico(String conteudoPragmatico) {
		this.conteudoPragmatico = conteudoPragmatico;
	}
	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + ", conteudoPragmatico=" + conteudoPragmatico + "]";
	}
		
		
	}
	
