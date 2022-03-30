package parte1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = entrada.nextLine();
		System.out.println(texto);
		
		String aux = "";
		//texto = texto.toUpperCase();
		for(int i = 0 ;i<texto.length() ;i++) {
			char caractere = texto.charAt(i);
			int valorAscii = (int) caractere;
			if(valorAscii>=97 && valorAscii<=122) {
				valorAscii -= 32;
				caractere = (char) valorAscii;
			}
			aux = aux + caractere;
		}
		texto = aux;
		System.out.println(texto);
	}	
}


//Faça um algoritmo que lê uma string (com caracteres alfabéticos)
//e transforme todos para maiúsculo. 