package ex3;

public class Calculadora {
	
	private String marca;
	private String modelo;
	private String tipo;
	private Double qtdMemoria;
	
	public Calculadora(String marca, String modelo, String tipo, Double qtdMemoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.qtdMemoria = qtdMemoria;
	}
	
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", qtdMemoria=" + qtdMemoria
				+ "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getQtdMemoria() {
		return qtdMemoria;
	}
	
	public Double somar(Double a, Double b) {
		return a+b;
	}
	
	public Double subtrair(Double a, Double b) {
		return a-b;
	}
	
	public Double multiplicar(Double a, Double b) {
		return a*b;
	}
	
	public Double dividir(Double a, Double b) {
		return a/b;
	}
	
	
	
}
