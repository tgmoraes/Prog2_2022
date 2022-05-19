package parte4.exercicios;

public class TestaCarro {

	public static void main(String[] args) {
		Carro clio = new Carro("Clio Autenthic");
		
		
		System.out.println(clio.acelera(20));
		clio.upMarcha();
		clio.liga();
		System.out.println(clio.acelera(20));
		clio.downMarcha();
		clio.downMarcha();
		clio.liga();
		clio.upMarcha();
		clio.freia(10);
		System.out.println(clio.acelera(10));
		System.out.println(clio.acelera(30));
		clio.upMarcha();

		System.out.println(clio.acelera(30));
		clio.freia(5);
		clio.upMarcha();
		clio.upMarcha();
		System.out.println(clio.acelera(30));
		clio.upMarcha();
		clio.upMarcha();
		clio.desliga();
		System.out.println(clio.acelera(40));
	}

}
