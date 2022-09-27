package parte8.heranca.outroPacote;

import parte8.heranca.Pessoa;

public class Estudante extends Pessoa{

	private String matricula; //maneira mais indicada para tributos sempre é private
	
	public Estudante(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}
	@Override
	public String quemSou() {
		return super.quemSou()+
				" E sou estudante de matricula:"+
				this.matricula ;
	}
}
