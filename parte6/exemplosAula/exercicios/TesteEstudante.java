package parte6.exemplosAula.exercicios;

import java.time.LocalDate;

public class TesteEstudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante joao = new Estudante("João Matias", LocalDate.of(2000, 2, 4));
		Estudante joao2 = new Estudante("João Matias", LocalDate.of(2000, 2, 4));
		//Estudante joao3 = new Estudante(null, LocalDate.of(2000, 2, 4));
		//Estudante joao4 = new Estudante("João Matias", null);
		
		Estudante maria = new Estudante("Maria Silva", LocalDate.of(2005, 3, 22));
		
		System.out.println(joao);
		
		joao.insereNota(7);
		joao.insereNota(8);
		
		System.out.println(joao);
		System.out.println(joao.getIdade()==22);
		System.out.println(joao.calculaMedia()==7.5);
		System.out.println(joao.ehMaisVelho(maria)==false);
		System.out.println(joao.ehMaisVelho(joao2)==false);
		System.out.println(maria.ehMaisVelho(joao2)==true);
		System.out.println(joao.equals(maria)==false);
		System.out.println(joao.equals(joao2)==false);
		
		joao2.insereNota(7);
		joao2.insereNota(8);
		System.out.println(joao.equals(joao2)==true);
		
		//joao.insereNota(11);
		//joao.insereNota(-1);
		joao.insereNota(5);
		System.out.println(joao);
		//joao.insereNota(5);
		
	}

}
