package parte6.exemplosAula;

import java.util.Scanner;

public class TestaMoto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Moto motinha;
		System.out.println(Moto.getCont()==0);
		motinha = new Moto("CG titan");
		System.out.println(Moto.getCont()==1);

		motinha.acelerar(30);
		
		System.out.println(motinha);
		Moto m1 = new Moto("CG titan");
		System.out.println(m1.getCont()==2);
		System.out.println(motinha.getCont()==2);

		System.out.println(motinha.equals(m1)==false);
		m1.acelerar(30);
		System.out.println(motinha.equals(m1)==true);
		System.out.println(motinha.equals("oi")==false);
		System.out.println(motinha.equals(null)==false);
		
		System.out.println("testes instanceof");
		Object o = (Object) motinha;
		System.out.println(o instanceof Moto);
		System.out.println(o instanceof String);
		System.out.println(o instanceof Object);

	}

}
