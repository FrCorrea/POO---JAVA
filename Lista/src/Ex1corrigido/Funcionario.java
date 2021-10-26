package Ex1corrigido;

public class Funcionario {

	private int registro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String numeroTelefone;
	
	// o Funcion�rio possui um objeto do tipo Endereco
	// ent�o estou declarando um objeto que ser� instanciado no m�todo construtor
	private Endereco endereco;

	public Funcionario(int registro, String nome, String dataNascimento,String sexo, String setor,
			String numeroTelefone, Endereco endereco) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.numeroTelefone = numeroTelefone;
	
		// o objeto declarado na linha 14, est� sendo instanciado aqui, passando ao m�todo construtor de Endereco
		// todos os par�metros necess�rios
		this.endereco = endereco;
	}

	

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	// nota que retirei os par�metros.
	// voc� pode acessar diretamente, sem esses par�metros.
	public void exibirRelatorio() {
		
		// voc� n�o precisa invocar "funcionario.get..." pq os atributos s�o do pr�prio objeto que
		// voc� est� manipulando
		System.out.println(getRegistro());
		System.out.println(getNome());
		System.out.println(getDataNascimento());
		System.out.println(getSexo());
		System.out.println(getSetor());
		System.out.println(getNumeroTelefone());
		
		// daqui para baixo, precisa do objeto "endereco" que foi declarado no in�cio da classe, 
		// pois rua, numero, (...) n�o s�o do objeto funcion�rio, e sim do objeto "endereco", logo 
		// vc precisa "navegar" entre os objetos
		System.out.println(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getEstado());
	}

	// gerei novamente o m�todo toString para ele imprimir o objeto de Endereco
	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", setor=" + setor + ", numeroTelefone=" + numeroTelefone + ", end=" + endereco + "]";
	}
}
