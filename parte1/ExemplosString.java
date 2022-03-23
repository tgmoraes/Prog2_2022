package aula1;

public class ExemplosString {

	public static void main(String[] args) {
		String palavra= "ola mundo";
		
		System.out.println("tamanho string:"+palavra.length());
		System.out.println("teste equals:"+palavra.equals("ola mundo"));
		
		
		for(int i=0;i<palavra.length();i++) System.out.print(palavra.charAt(i));
		
		System.out.println("\n testes com ASCII:");
		
		int valorAscii = (int)palavra.charAt(0);
		char charMinusculo = (char)valorAscii;
		char charMaiusculo = (char)(valorAscii-32);
		System.out.println("inteiro ascii de 'o':"+valorAscii);
		System.out.println("traduzindo "+valorAscii+" pela tabela ascii:"+charMinusculo);
		System.out.println("obtendo O (maiúsculo) utilizando o valor ascii:"+charMaiusculo);
		
		String palavra2 = new String("ola mundo");
//		
		System.out.println("testes igualdade");
		System.out.println(palavra.equals(palavra2));
		System.out.println(palavra==palavra2);

	}

}
