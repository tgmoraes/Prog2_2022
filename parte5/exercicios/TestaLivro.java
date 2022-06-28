package parte5.exercicios;

public class TestaLivro {
	public static void main(String[] args) {
		//criar e inicializar um objeto de Livro
		Livro orgPrec = new Livro("Orgulho e Preconceito",424);
		Livro hobbbit = new Livro("O Hobbbit: um reality inesperado", 350);
		Livro orgPrec2 = new Livro("Orgulho e Preconceito",424);
		
		
		System.out.println(orgPrec.ler(30)==false);
		
		System.out.println(orgPrec);
		System.out.println(hobbbit);
	
		System.out.println(hobbbit.equals(orgPrec)==false);
		System.out.println(orgPrec2.equals(orgPrec)==false);
		orgPrec.recomeca();
		System.out.println(orgPrec2.equals(orgPrec)==true);
	}
}
