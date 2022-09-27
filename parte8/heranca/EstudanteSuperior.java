package parte8.heranca;

import parte8.heranca.outroPacote.Estudante;

public  class EstudanteSuperior extends Estudante{
	
	public EstudanteSuperior(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public String quemSou() {
		return super.quemSou()+". E faço um curso Superior!";
	}
	
}
