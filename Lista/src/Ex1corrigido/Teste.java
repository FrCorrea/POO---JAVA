package Ex1corrigido;

public class Teste {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua dos mano",10,"Mano","Cidades dos mano","Estado dos mano");

		// voc� j� tem o objeto "endereco", ent�o na hora que voc� vai criar um funcion�rio, pode enviar o endere�o por par�metro
		Funcionario funcionario = new Funcionario(0,"Joaquim","20/08/1954","F","TI","45454", endereco);
		
		System.out.println(funcionario.toString());
		funcionario.exibirRelatorio();
	}
	
	
}
