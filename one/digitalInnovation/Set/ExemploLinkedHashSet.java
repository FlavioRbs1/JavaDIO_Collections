package one.digitalInnovation.Set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(5);
		sequenciaNumerica.add(9);
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(12);
		
		System.out.println(sequenciaNumerica);

	}

}
