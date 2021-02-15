package one.digitalInnovation.list;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioLinkedList {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		
		System.out.println(fila);
		
		String primeiro = fila.peek();
		System.out.println("O primeiro da lista é: "+primeiro);
		
		String removeOPrimeiro = fila.poll();
		System.out.println("Elemento que será removido: "+removeOPrimeiro);
		System.out.println("Após a remoção, a fila ficou assim: "+fila);
		
		fila.add("Daniel");
		
		
		System.out.println("O tamanho da fila é: "+fila.size());
		boolean verifica = fila.isEmpty();
		if(verifica == true) {
			System.out.println("A fila está vazia");
		}else {
			System.out.println("A fila não está vazia");
		}
		
	}

}
