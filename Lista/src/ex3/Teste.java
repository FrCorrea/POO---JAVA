package ex3;

public class Teste {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora("Marca","Modelo","B�sica",23.2);
		
		System.out.println(calculadora.getMarca());
		System.out.println(calculadora.getModelo());
		System.out.println(calculadora.getTipo());
		System.out.println(calculadora.getQtdMemoria());
		
		System.out.println("soma � " + calculadora.somar(12.0,10.0));
		System.out.println("subtracao � " + calculadora.subtrair(12.0,10.0));
		System.out.println("divisao � " + calculadora.dividir(12.0,10.0));
		System.out.println("multiplicar � " + calculadora.multiplicar(12.0,10.0));
	}
}
