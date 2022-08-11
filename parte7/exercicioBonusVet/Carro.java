package parte7.exercicioBonusVet;

public class Carro {

	// Atributos:
	private final String nome;
	private int marcha;
	private double velocidade;
	private boolean ligado;
	
	public Carro(String nome) {
		this.ligado = false;
		this.velocidade = 0;
		this.marcha = 0;
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public int getMarcha() {
		return this.marcha;
	}
	public double getVelocidade() {
		return this.velocidade;
	}
	public void upMarcha() {
		if (this.marcha < 5)
			this.marcha++;
	}

	public void downMarcha() {
		if (this.marcha > 0)
			this.marcha--;
	}

	public boolean isLigado() {
		return this.ligado;
	}

	public void liga() {
		if (!this.ligado && this.marcha == 0)
			this.ligado = true;
	}

	public void desliga() {
		this.ligado = false;
	}

	public void freia(double valor) {
		if (this.velocidade - valor < 0)
			this.velocidade = 0;
		else
			this.velocidade -= valor;
	}

	public String acelera(double valor) {
		if (this.marcha == 0 || !this.ligado) {
			return "Para carro andar deve estar ligado e com marcha engatada!"
					+ "Status atual: ligado:"
					+ this.ligado + ", marcha:" + this.marcha;
		}
		int lim = this.marcha * 20;
		if (this.velocidade + valor > lim)
			this.velocidade = lim;
		else
			this.velocidade += valor;
		return "Carro na velocidade: "+this.velocidade;
	}
}
