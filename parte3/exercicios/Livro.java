package parte3.exercicios;

public class Livro {
	//Atributos: titulo, páginas, número de páginas lidas.
	String titulo;
	int paginas;
	int pagLidas;
	
	//metoddynhos!
	void recomeca() {
		this.pagLidas=0;
	}
	
	boolean ler(int pags) {
		int pagsQFaltamLer = this.paginas - this.pagLidas;
		if(pagsQFaltamLer>= pags) {
			this.pagLidas = this.pagLidas + pags;
		}else {
			this.pagLidas = this.paginas;
		}
		return this.pagLidas==this.paginas;
	}
}


