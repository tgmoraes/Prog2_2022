package parte5.exercicios;

public class Livro {
	//Atributos: titulo, páginas, número de páginas lidas.
	private final String titulo;
	private final int paginas;
	private int pagLidas;
	
	public Livro(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
		this.pagLidas = 0;
	}
	//metoddynhos!
	public void recomeca() {
		this.pagLidas=0;
	}
	
	public boolean ler(int pags) {
		int pagsQFaltamLer = this.paginas - this.pagLidas;
		if(pagsQFaltamLer>= pags) {
			this.pagLidas = this.pagLidas + pags;
		}else {
			this.pagLidas = this.paginas;
		}
		return this.pagLidas==this.paginas;
	}
	public int getPaginas() {
		return this.paginas;
	}
	
	public int getPagLidas() {
		return this.pagLidas;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	
	@Override
	public String toString() {
		return "Livro: "+ this.titulo+" ("+this.pagLidas+"/"+this.paginas+")";
		//"Livro: <titulo> (<pagsLidas>/<paginas>)"
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj==this) return true;
		if(!(obj instanceof Livro)) return false;
		Livro l = (Livro)obj;

		return 	l.paginas==this.paginas &&
				l.pagLidas==this.pagLidas &&
				l.titulo.equals(this.titulo);
		
	}
}


