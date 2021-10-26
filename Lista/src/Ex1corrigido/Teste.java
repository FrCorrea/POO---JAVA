package Ex1corrigido;

public class Teste {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua dos mano",10,"Mano","Cidades dos mano","Estado dos mano");

		// você já tem o objeto "endereco", então na hora que você vai criar um funcionário, pode enviar o endereço por parâmetro
		Funcionario funcionario = new Funcionario(0,"Joaquim","20/08/1954","F","TI","45454", endereco);
		
		System.out.println(funcionario.toString());
		funcionario.exibirRelatorio();
	}
	
	
}
