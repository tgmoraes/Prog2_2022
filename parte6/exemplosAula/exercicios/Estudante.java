package parte6.exemplosAula.exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Objects;


public class Estudante {
	private final String nome;
	private final LocalDate dataNascimento;
	private final int[] notas;
	private int notasRecebidas;

	public Estudante(String nome, LocalDate dataNasc) {
		Objects.requireNonNull(nome, "O estudante deve ter nome não nulo");
		//Bônus 1
		Objects.requireNonNull(dataNasc, "O estudante deve ter uma data de nascimento não nula");
		//fim Bônus 1
		this.notas= new int[3];
		this.nome = nome;
		this.dataNascimento = dataNasc;
		this.notasRecebidas = 0;
	}
	public String getNome() {
		return this.nome;
	}
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	//Bônus 2
	//recebe trimestre 1, dois ou três
	public int getNota(int trimestre) {
		if(trimestre<1  || trimestre>3) {
			throw new IllegalArgumentException("trimestre invalido!");
		}
		return this.notas[trimestre-1];
	}
	//fim Bônus 2
	
	public void insereNota(int nota) {
		if(nota>10 || nota<0) {
			throw new IllegalArgumentException("nota="+nota+": A nota deve ser entre 0 e 10");
		}
		if(this.notasRecebidas>2) {
			throw new IllegalArgumentException("O estudante já tem nota nos três trimestres");
		}
		this.notas[this.notasRecebidas] = nota;
		this.notasRecebidas++;
	}
	//Método : calculaMedia –> calcula a média das notas já inseridas.
	public double calculaMedia() {
		double sum = 0;
		for(int i=0;i< this.notasRecebidas;i++) {
			sum = sum + this.notas[i];
		}
		return sum/this.notasRecebidas;
	}
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period tempoDeVida = this.dataNascimento.until(hoje);
		return tempoDeVida.getYears();
	}
	//crie um método ehMaisVelho(Estudante e) que recebe um estudante e 
	//retorna um boolean indicando se true se o estudante passado por parâmetro for 
	//mais velho (que o this) e false no caso oposto.
	public boolean ehMaisVelho(Estudante e) {
		return this.dataNascimento.isAfter(e.dataNascimento);
	}
	@Override
	public String toString() {
		String data = 	this.dataNascimento.getDayOfMonth()+"/"+
					 	this.dataNascimento.getMonthValue()+"/"+
					 	this.dataNascimento.getYear();
		String notas = "Sem notas! -";
		if(this.notasRecebidas>0) {
			notas = "(";
			for(int i=0; i<this.notasRecebidas; i++) {
				if((i+1) == this.notasRecebidas) {
					notas=notas+this.notas[i]+")";
				} else {
					notas=notas+this.notas[i]+", ";
				}
			}
		}
		return "nome: "+ this.nome+" notas: "+ notas+ " data de nascimento: "+ data;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(o==this) return true;
		if(! (o instanceof Estudante)) return false;

		Estudante aux = (Estudante)o;
		
		boolean compNotas = Arrays.equals(this.notas, aux.notas);
		boolean compNomes = this.nome.equals(aux.nome);
		boolean compDtNasc = this.dataNascimento.equals(aux.dataNascimento);
		
		return compNotas && compNomes && compDtNasc && this.notasRecebidas==aux.notasRecebidas;
	}
}


