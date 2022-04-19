package parte3.exemplosAula;

import java.util.Scanner;

public class TestaMoto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o modelo da moto:");
		
		Moto motinha;
		motinha = new Moto();
		
		motinha.modelo = entrada.nextLine();
		motinha.velocidade =0;
		
		System.out.println("Informe quanto acelerar:");
		
		motinha.acelerar(entrada.nextInt());
		
		System.out.println("Moto: "+motinha.modelo+
				" velocidade: "+motinha.velocidade);

	}

}
