package ex5;

public class Teste {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.frear();
		carro.frear();
		
		System.out.println("marcha: " + carro.getMarcha());
		System.out.println("velocidade:" +carro.getVelocidade());
		
	}
}
