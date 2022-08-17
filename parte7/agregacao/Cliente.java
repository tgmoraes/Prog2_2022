package parte7.agregacao;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
	private String nome;
	private LocalDate dataNascimento;
	private double rendaMensal;

	//construtores
	public Cliente () {
	}
	public Cliente(String nome, double rendaMensal) {
		this.nome = nome;
		this.rendaMensal = rendaMensal;
	}
	//getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaMensal() {
		return this.rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNascimento= LocalDate.of(ano, mes, dia);
	}
	public String getDataNascimento() {
		//16 de agosto de 2022
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("d 'de' LLL 'de' YYYY (EEE)");
		return this.dataNascimento.format(f);
	}
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period p = Period.between(this.dataNascimento,hoje);
		return p.getYears();
	}
}
