package parte4.exemplosAula;

import java.util.Scanner;

public class TestaMoto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o modelo da moto:");
		
		Moto motinha, mota1;
		String aux = entrada.nextLine();
		mota1 = new Moto();
		mota1.setModelo(aux);
		
		motinha = new Moto(aux);
		//motinha.modelo = entrada.nextLine();
		//motinha.velocidade = 0;
		
		System.out.println("Informe quanto acelerar:");
		
		motinha.acelerar(entrada.nextInt());
		
		System.out.println("Moto: "+motinha.getModelo()+
				" velocidade: "+motinha.getVelocidade());

	}

}
