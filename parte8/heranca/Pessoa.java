package parte8.heranca;

import java.util.Objects;

public class Pessoa {
	//poderia ser private para um melhor encapsulamento 
	//(inclusive é a maneira mais indicada!)
	protected String nome;	
	
	public Pessoa(String nome) {
		Objects.requireNonNull(nome, "nome nulo!");
		this.nome = nome;
	}
	public String quemSou() {
		return "Sou "+this.nome+", uma pessoa.";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
