package parte5.exemplosAula;
//

//public
//private
//default package

public class Moto {
	// atributos
	private final String modelo;
	private int velocidade;
	private static int cont = 0;

	public Moto(String modelo) {
		this.modelo = modelo;
		this.velocidade = 0;
		Moto.cont++;
	}

	// metodos
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

	@Override
	public String toString() {
		return "modelo: " + this.modelo + ", velocidade: " 
				+ this.velocidade + "km/h";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;

		// if(!(this.getClass().isInstance(o))) return false;
		if (!(o instanceof Moto))
			return false;

		Moto par = (Moto) o;
		boolean retorno = (this.velocidade == par.velocidade) && (this.modelo.equals(par.modelo));
		return retorno;

	}
	public static int getCont() {
		return Moto.cont;
	}

}
