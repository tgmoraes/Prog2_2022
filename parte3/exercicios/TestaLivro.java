package parte3.exercicios;

public class TestaLivro {
	public static void main(String[] args) {
		//criar e inicializar um objeto de Livro
		Livro orgPrec = new Livro();
		Livro hobbit = new Livro();
		
		orgPrec.titulo = "Orgulho e Preconceito";
		orgPrec.paginas = 424;
		orgPrec.pagLidas = 0;
		
		System.out.println(orgPrec.ler(30)==false);
		System.out.println(orgPrec.pagLidas==30);
		
		orgPrec.recomeca();
		System.out.println(orgPrec.pagLidas==0);
		System.out.println(orgPrec.ler(130)==false);
		System.out.println(orgPrec.ler(300)==true);
		System.out.println(orgPrec.pagLidas==424);
		
	}
}
