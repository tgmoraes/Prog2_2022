package parte7;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {
		
		
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("sal");
		lista.add("azeite");
		lista.add("massa");
		lista.add(0,"tomate");

		System.out.println(lista.size());
		System.out.println("pos 1:"+lista.remove(1));
		
		for(String elem : lista) {
			System.out.println(elem);
		}
		
	}
}
