package one.digitalInnovation.Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(5.3);
		notasAlunos.add(2.3);
		notasAlunos.add(5.9);
		notasAlunos.add(5.6);
		notasAlunos.add(9.5);
		notasAlunos.add(7.6);
		notasAlunos.add(4.0);
		notasAlunos.add(null);
		System.out.println(notasAlunos);



	}

}
