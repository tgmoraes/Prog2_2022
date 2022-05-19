package parte4.exercicios;

import java.util.Scanner;

public class AppCarro {
	public static Carro criaCarro() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe o nome do carro: ");
		return  new Carro(ent.nextLine());
	}
	public static int printaMenu() {
		Scanner ent = new Scanner(System.in);
		System.out.println("O que quer fazer com o carro? Informe a opcao desejada:\n"+
				"(0) sair\n"+
				"(1) imprimir status do carro\n"+
				"(2) aumentar a marcha\n"+
				"(3) diminuir marcha\n"+
				"(4) freiar\n" +
				"(5) acelerar\n" +
				"(6) ligar\n"+
				"(7) desligar");
		return  ent.nextInt();
	}
	public static void menuPrintaInfo(Carro c) {
		String lig;
		if(c.isLigado()) lig = "ligado";
		else lig = "desligado";
		System.out.println("carro: "+c.getNome()+"("+lig+") "+
				"marcha: "+	c.getMarcha()+ 
				" velocidade: "+c.getVelocidade());
	}
	public static void menuFreia(Carro c) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe o valor que deseja freiar: ");
		double val = ent.nextDouble(); 
		c.freia(val);
	}
	public static void menuAcelera(Carro c) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe o valor que deseja acelerar: ");
		double val = ent.nextDouble(); 
		System.out.println(c.acelera(val));
	}
	public static void main(String[] args) {
		//usuario informa nome do carro e um carro é criado
		Carro car = criaCarro();
		
		int opcao;
		while(true) {
			//imprime um menu que se repete e solicita para o user informar a opcao escolhida
			opcao  = printaMenu();
			if(opcao == 0) {
				//sair
				System.out.println("Até mais!");
				break;
			} else if(opcao == 1) {
				//imprimir status do carro
				menuPrintaInfo(car);
			} else if(opcao == 2) {
				//aumentar marcha
				car.upMarcha();
			} else if(opcao == 3) {
				//diminuir marcha
				car.downMarcha();
			} else if(opcao == 4) {
				//freiar o carro
				menuFreia(car);
			} else if(opcao == 5) {	
				//acelerar o carro
				menuAcelera(car);
			} else if(opcao == 6) {
				//ligar o carro
				car.liga();
			} else if(opcao == 7) {
				//desligar o carro	
				car.desliga();
			}
		}
	}
}

