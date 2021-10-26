package ex4;

public class Teste {
	public static void main(String[] args) {
		Conta conta = new Conta(2255,6541);
		
		
		System.out.println(conta.toString());
		conta.imprimirSaldo();
		conta.depositar(100.0);
		conta.imprimirSaldo();
		conta.sacar(50.0);
		conta.imprimirSaldo();
		conta.sacar(200.0);
	
	}
}
