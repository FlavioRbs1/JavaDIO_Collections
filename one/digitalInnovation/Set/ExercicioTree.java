package one.digitalInnovation.Set;

import java.util.TreeSet;

public class ExercicioTree {

	public static void main(String[] args) {


		TreeSet<Integer> numero = new TreeSet<>();
		
		numero.add(3);
		numero.add(88);
		numero.add(20);
		numero.add(44);
		numero.add(3);
		
		System.out.println(numero);
		
		int primeiro = numero.first();
		System.out.println(numero.pollFirst());
		
		numero.add(23);
		
		System.out.println(numero);
		
		System.out.println(numero.size());
		
		System.out.println(numero.isEmpty());
		
	}

}
