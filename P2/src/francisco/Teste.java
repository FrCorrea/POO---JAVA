package francisco;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Rosas", 100, "PG","PR");
		Correntista correntista = new Correntista(12345678,"Francisco",endereco);
		
		Conta conta = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seu conta  é?");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança");
		int op = input.nextInt();
		
		switch(op) {
		case 1:
			conta = new ContaCorrente(25447,12345,1234,1000.00,correntista,250.00);
			break;
		case 2:
			conta = new ContaPoupanca(25447,12345,1234,1000.00,correntista,0.10);
			break;
		default:
			System.out.println("Opcao invalida");
		}
		
		int senha, valor;
		
		System.out.println(correntista.toString());
		op = 0;
		
		while(op < 4) {
			System.out.printf("\n");
			System.out.println("Escolha: ");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			System.out.println("3 - Saldo");
			op = input.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Digite o valor para deposito");
					valor = input.nextInt();
					conta.depositar(valor);
					break;
				case 2:
					System.out.println("Digite o valor para saque");
					valor = input.nextInt();
					System.out.println("Digite a sua senha");
					senha = input.nextInt();
					conta.sacar(valor, senha);
					break;
				case 3:
					System.out.println("Digite a sua senha");
					senha = input.nextInt();
					conta.verificarSaldo(senha);
					break;
				default:
					System.out.println("Opcao invalida - Sistema finalizado");
					op = 4;
			}
		}
		
		input.close();
	}
}
