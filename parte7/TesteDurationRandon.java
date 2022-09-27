package parte7;


import java.time.Duration;

public class TesteDurationRandon {
	public static void main(String[] args) {
		Duration in = Duration.ofSeconds(90);	//1:30
		Duration in2 = Duration.ofSeconds(156);	//2:36
		Duration soma = in.plus(in2);			//4:06
		
		System.out.println(in.plus(in2));
		System.out.println("total de segundos:"+in2.toSeconds());
		System.out.println("segundos descontados os minutos:"+in2.toSecondsPart());
		//passando para uma string bonita
		String intText = String.format("%d:%02d",soma.toMinutes(),soma.toSecondsPart());
		System.out.println(intText);
		//verificando se o período é negativo
		System.out.println(in.isNegative());	//false
		//gerar um inteiro de 2 a 4
		System.out.println((int)(Math.random()*3+2));
	}
}

