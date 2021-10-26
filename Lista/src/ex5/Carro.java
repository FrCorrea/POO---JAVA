package ex5;

public class Carro {
	
	private int marcha;
	private int velocidade;
	
	public Carro() {
		this.marcha = 0;
		this.velocidade = 0;
	}

	private void trocarMarcha() {
		if(this.velocidade == 0)
			this.marcha = 0;
		if(this.velocidade >=1 && this.velocidade <= 19)
			this.marcha = 1;
		if(this.velocidade >=20 && this.velocidade <= 39)
			this.marcha = 2;
		if(this.velocidade >=40 && this.velocidade <= 59)
			this.marcha = 3;
		if(this.velocidade >=60 && this.velocidade <= 89)
			this.marcha = 4;
		if(this.velocidade >=89 && this.velocidade <= 130)
			this.marcha = 5;
	}
	
	public void acelerar() {
		if(this.velocidade == 130){
			System.out.println("Impossivel acelerar mais");
		}
		else {
			this.velocidade += 5;
			trocarMarcha();
		}
	}
	
	public void frear() {
		if(this.velocidade == 0) {
			System.out.println("O carro ja esta parado");
		}
		else {
			this.velocidade -= 5;
			trocarMarcha();
		}
	}
	
	
	
	
	
	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	
	@Override
	public String toString() {
		return "Carro [marcha=" + marcha + ", velocidade=" + velocidade + "]";
	}
	
}
