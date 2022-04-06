package parte1;

public class Funcoes {
	static int soma(int a, int b) {
		return a + b;
	}

	static String ola() {
		return "ola mundo";
	}

	public static void main(String[] args) {
		String frase = ola();
		System.out.println(frase);
		// testes de soma
		System.out.println(soma(5, 10) == 15);
		System.out.println(soma(5, -10) == -5);
		System.out.println(soma(5, 0) == 5);
		System.out.println(soma(-5, 0) == -5);

	}
}
