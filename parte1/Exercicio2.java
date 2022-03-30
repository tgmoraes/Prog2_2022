package parte1;

public class Exercicio2 {

	public static void main(String[] args) {
		double ze, chico;
		int anos = 0;

		ze = 1.1;
		chico = 1.5;

		while(ze<=chico) {
			ze +=  0.04;
			chico +=  0.02;
			anos ++;
		}
		
		System.out.println("serão necessários "+anos+" anos!");
	}

}

//Chico tem 1,50 metro e cresce 2 centímetros por ano,
//Zé tem 1,10 metro e cresce 4 centímetros por ano. 
//
//Construa um algoritmo que calcule e imprima quantos anos 
//serão necessários para que Zé seja maior que Chico.