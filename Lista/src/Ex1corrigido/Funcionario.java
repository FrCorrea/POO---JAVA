package Ex1corrigido;

public class Funcionario {

	private int registro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String numeroTelefone;
	
	// o Funcionário possui um objeto do tipo Endereco
	// então estou declarando um objeto que será instanciado no método construtor
	private Endereco endereco;

	public Funcionario(int registro, String nome, String dataNascimento,String sexo, String setor,
			String numeroTelefone, Endereco endereco) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.numeroTelefone = numeroTelefone;
	
		// o objeto declarado na linha 14, está sendo instanciado aqui, passando ao método construtor de Endereco
		// todos os parámetros necessários
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

	// nota que retirei os parâmetros.
	// você pode acessar diretamente, sem esses parâmetros.
	public void exibirRelatorio() {
		
		// você não precisa invocar "funcionario.get..." pq os atributos são do próprio objeto que
		// você está manipulando
		System.out.println(getRegistro());
		System.out.println(getNome());
		System.out.println(getDataNascimento());
		System.out.println(getSexo());
		System.out.println(getSetor());
		System.out.println(getNumeroTelefone());
		
		// daqui para baixo, precisa do objeto "endereco" que foi declarado no início da classe, 
		// pois rua, numero, (...) não são do objeto funcionário, e sim do objeto "endereco", logo 
		// vc precisa "navegar" entre os objetos
		System.out.println(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getEstado());
	}

	// gerei novamente o método toString para ele imprimir o objeto de Endereco
	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", setor=" + setor + ", numeroTelefone=" + numeroTelefone + ", end=" + endereco + "]";
	}
}
