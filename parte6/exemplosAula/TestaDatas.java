package parte6.exemplosAula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class TestaDatas {
	public static void main(String[] args) {
		//pegar a data e hora do sistema:
		LocalDateTime hojeHora = LocalDateTime.now();
		System.out.println(hojeHora);
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		LocalDate dt = LocalDate.of(2005, 3, 8);
		System.out.println(dt);
		LocalTime lt = LocalTime.of(16, 30,15);
		System.out.println(lt);
		Period p = dt.until(hoje);
		System.out.println(p);
		System.out.println(hoje.getDayOfMonth());
		System.out.println(hoje.getDayOfYear());
 		System.out.println(hoje.getDayOfWeek());
		System.out.println(hoje.getMonthValue());
		System.out.println(hoje.getMonth());

	}
}
