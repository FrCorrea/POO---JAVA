package Ex1;

public class Funcionario {

	private int registro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String numeroTelefone;

	public Funcionario(int registro, String nome, String dataNascimento,String sexo, String setor,
			String numeroTelefone) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.numeroTelefone = numeroTelefone;
	}

	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", setor=" + setor + ", numeroTelefone=" + numeroTelefone + "]";
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

	public void exibirRelatorio(Funcionario funcionario , Endereco endereco) {
		System.out.println(funcionario.getRegistro());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getDataNascimento());
		System.out.println(funcionario.getSexo());
		System.out.println(funcionario.getSetor());
		System.out.println(funcionario.getNumeroTelefone());
		System.out.println(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getEstado());
	}
}
