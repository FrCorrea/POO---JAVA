package francisco;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Elevador elevador = new Elevador(4,5); // instanciando objeto
		
		int op = 1;
		
		System.out.println(elevador.toString());
		
		while(op>=1 && op <=5) {
			System.out.println("Digite: \n"
					+ "1 - adicionar pessoas"
					+ "\n 2 - remover pessoas"
					+ "\n 3 - subir elevador"
					+ "\n 4 - descer elevador"
					+ "\n 5 - exibir relatorio"
					+ "\n Outro numero : Sair ");
			op = input.nextInt();
			
			if(op == 1) {
				elevador.adicionarPessoa();
			}
			if(op == 2) {
				elevador.removerPessoa();
			}
			if(op == 3) {
				elevador.subirElevador();
			}
			if(op==4) {
				elevador.descerElevador();
			}
			if(op == 5) {
				elevador.exibirRelatorio();
			}
			input.nextLine();
		}
		input.close();
	}
}
