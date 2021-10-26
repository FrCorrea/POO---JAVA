package Ex1;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(0,"Joaquim","20/08/1954","F","TI","45454");
		Endereco endereco = new Endereco("Rua dos mano",10,"Mano","Cidades dos mano","Estado dos mano");
		
		
		funcionario.exibirRelatorio(funcionario,endereco);
	}
	
	
}
