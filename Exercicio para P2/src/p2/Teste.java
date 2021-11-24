package p2;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Cartao cartao = null;
		
		Produto produto = new Produto("PC",1000.00,"20/05/2020");
		
		System.out.println("Seu cartão é?");
		System.out.println("1 - Cartao Comum");
		System.out.println("2 - Cartao Premium");
		int op = input.nextInt();
		
		switch(op) {
			case 1:
				cartao = new Comum(1, 1234, "maicon", 2000.00);
				break;
			case 2:
				cartao = new Premium(1, 1234, "maicon", 2000.00);
				break;
			default:
				System.out.println("Opcao invalida");
		}
		
		int senha;
		
		while (op < 5) {
			System.out.printf("\n");
			System.out.println("Escolha: ");
			System.out.println("1 - Bloquear");
			System.out.println("2 - Desbloquear");
			System.out.println("3 - Comprar");
			System.out.println("4 - Fatura");
			op = input.nextInt();
			
			switch(op) {
				case 1: 
					System.out.println("Informe a senha: ");
					senha = input.nextInt();
					cartao.bloquearCartao(senha);
					break;
				case 2:
					System.out.println("Informe a senha: ");
					senha = input.nextInt();
					cartao.desbloquearCartao(senha);
					break;
		
				case 3:
					System.out.println("Informe a senha: ");
					senha = input.nextInt();
					cartao.fazerCompra(produto, senha);
					break;
				
				case 4:
					System.out.println("Informe a senha: ");
					senha = input.nextInt();
					cartao.visualizarFatura(senha);
					break;
				default:
					op = 5;
				break;
			}
		}
		
		input.close();
		
	}
}
