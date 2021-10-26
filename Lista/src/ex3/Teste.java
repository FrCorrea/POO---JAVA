package ex3;

public class Teste {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora("Marca","Modelo","Básica",23.2);
		
		System.out.println(calculadora.getMarca());
		System.out.println(calculadora.getModelo());
		System.out.println(calculadora.getTipo());
		System.out.println(calculadora.getQtdMemoria());
		
		System.out.println("soma é " + calculadora.somar(12.0,10.0));
		System.out.println("subtracao é " + calculadora.subtrair(12.0,10.0));
		System.out.println("divisao é " + calculadora.dividir(12.0,10.0));
		System.out.println("multiplicar é " + calculadora.multiplicar(12.0,10.0));
	}
}
