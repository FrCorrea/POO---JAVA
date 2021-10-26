package av1pass;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Livro livro = new Livro("Lala", "Maicon", "Editora", 400, 2012);
		
		int op = 1;
		
		while(op >=1 && op<=2) {
			
			System.out.println("Digite 1 para emprestar um livro,2 para devolver e outro numero para sair");
			op = input.nextInt();
			input.nextLine();
			
			if(op == 1) {
				System.out.println("Digite o nome do livro procurado");
				String nomeLivro = input.nextLine();
				System.out.println("Digite o nome do aluno");
				String nomeAluno = input.nextLine();
				System.out.println("Digite o dia de hoje");
				int diaHoje = input.nextInt();
				input.nextLine();
				
				livro.emprestarLivro(nomeLivro, nomeAluno, diaHoje);
				livro.emprestarLivro(nomeLivro, nomeAluno, diaHoje); //tentando emprestar de novo um livro ja emprestado
			}
			else {
				System.out.println("Digite o nome do livro procurado");
				String nomeLivro = input.nextLine();
				System.out.println("Digite o dia de hoje");
				int diaHoje = input.nextInt();
				
				livro.devolverLivro(nomeLivro, diaHoje);
			}
		}
		
		System.out.println(livro.toString());
		
		
		
		input.close();
		
	}
}
