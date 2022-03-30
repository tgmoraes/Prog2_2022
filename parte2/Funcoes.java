package parte2;

public class Funcoes {
	static int soma(int a, int b) {
		return a + b;
	}
	static String ola() {
		return "ola mundo";
	}
	static void olaMundo() {
		System.out.println("ola mundo!!!");
	}
	
	static String trocaBrancoPorChar(char c,
			String texto) {
		String ret= "";
		for(int i=0;i<texto.length();i++) {
			char aux;
			if(texto.charAt(i)==' ') aux=c;
			else aux = texto.charAt(i);
			ret = ret + aux;
		}
		return ret;
	}
	
	static int mult(int p1, int p2) {
		int res =0;
		boolean trocaSinal= false;
		//logica:
		
		if(p1<0) {
			p1= -p1;
			trocaSinal =true;
		}
		while(p1>0) {
			res+= p2;
			p1--;
		}
		if(trocaSinal)return -res;
		else return res;
	}
	public static void main(String[] args) {
		String frase = ola();
		
		System.out.println(frase);
		olaMundo();
		
		// testes de soma
		System.out.println(soma(5, 10) ==15);
		System.out.println(soma(5, -10) == -5);
		System.out.println(soma(5, 0) == 5);
		System.out.println(soma(-5, 0) == -5);
		
		System.out.println(mult(3,5)==15);
		System.out.println(mult(3,-5)==-15);
		System.out.println(mult(-3,5)==-15);
		System.out.println(mult(-3,-5)==15);
		System.out.println(mult(3,0)==0);
		System.out.println(mult(0,5)==0);

		String texto = " Olá amiguinhos ! !";
		System.out.println(
				trocaBrancoPorChar('$', texto).equals
				("$Olá$amiguinhos$!$!"));
	}
}
