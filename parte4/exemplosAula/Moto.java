package parte4.exemplosAula;
//

//public
//private
//default package

public class Moto {
	// atributos
	private String modelo;
	private int velocidade;

	// construtores
	public Moto() {
		this.velocidade = 0;
	}
	public Moto(String modelo) {
		this();
		this.setModelo(modelo);
	}
	public Moto(String modelo, int velocidade) {
		this(modelo);
		this.velocidade = velocidade;
	}

	// metodos
	public void setModelo(String novoModelo) {
		if (novoModelo.length() <= 10) {
			this.modelo = novoModelo;
		}
	}

	public String getModelo() {
		return this.modelo;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	public void acelerar(int valor) {
		int velLim = 150;
		if ((this.velocidade + valor) > velLim) {
			this.velocidade = velLim;
		} else {
			this.velocidade = this.velocidade + valor;
		}
	}

	public void frear(int valor) {
		this.velocidade -= valor;
		if (this.velocidade < 0) {
			this.velocidade = 0;
		}
	}
}
