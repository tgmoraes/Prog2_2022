package parte8.heranca.outroPacote;

import parte8.heranca.EstudanteSuperior;
import parte8.heranca.Pessoa;

public class TestaHeranca {

	public static void main(String[] args) {
		Pessoa julio = new Pessoa("Julio");
		Estudante ota = new Estudante("Otávio","08050467");
		EstudanteSuperior isa = new EstudanteSuperior("Isadora", "08050508");

		System.out.println(julio.quemSou());
		System.out.println(ota.quemSou());
		System.out.println(isa.quemSou());
		
		julio.setNome("Julio Xandro");
		
		System.out.println(julio.quemSou());
		
		System.out.println(isa instanceof Estudante);
		System.out.println(isa instanceof Pessoa);
		System.out.println(isa instanceof Object);

		System.out.println(!(ota instanceof EstudanteSuperior));
		System.out.println(ota instanceof Pessoa);
		System.out.println(ota instanceof Object);

	}

}
