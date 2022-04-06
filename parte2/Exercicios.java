package parte2;

public class Exercicios {
	static int soma(int a, int b) {
		return a + b;
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
			res =  soma(res,p2);
			p1 = soma(p1,-1);
		}
		if(trocaSinal)return -res;
		else return res;
	}
	
	//exe 5:
	static int pot(int base, int exp) {
		int res = 1;
		while(exp>0) {
			res = mult(res,base);
			exp = soma(exp,-1);
		}
		return res;
	}
	
	//exe 8:
	static void printaVet(int[] vet) {
		System.out.print("[");
		for(int i=0; i<vet.length; i++) {
			if(i==vet.length-1)	System.out.print(vet[i]+ "]\n");			
			else System.out.print(vet[i]+ ", ");			
		}
	}
	//exe 10:
	
	static int maiorVet (int[] array) {
		int maior = array[0];
		for(int i=1; i<array.length ;i++) {
			if(maior<array[i]) maior = array[i];
		}
		return maior;
	}
	
	
	public static void main(String[] args) {
		// testes de soma
		int res = pot(5,3);
		System.out.println(res==125);
		
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
		System.out.println("\ntestes pot:");
		System.out.println(pot(3, 4) == 81);
		System.out.println(pot(3, 5) == 243);
		System.out.println(pot(-3,0) == 1);
		System.out.println(pot(-3, 5) == -243);
		
		
		System.out.println("testes vet:");
		int[] vet = {3, 5, 8, 1, 600, 34, 23 ,23 ,111};
		printaVet(vet);

		System.out.println((maiorVet(vet))==600);
		vet[4] = 5;

		printaVet(vet);
		System.out.println(maiorVet(vet)==111);
	
	
	
	
	
	
	
	
	
	
	}
}
