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
		fila.add("Jo�o");
		
		System.out.println(fila);
		
		String primeiro = fila.peek();
		System.out.println("O primeiro da lista �: "+primeiro);
		
		String removeOPrimeiro = fila.poll();
		System.out.println("Elemento que ser� removido: "+removeOPrimeiro);
		System.out.println("Ap�s a remo��o, a fila ficou assim: "+fila);
		
		fila.add("Daniel");
		
		
		System.out.println("O tamanho da fila �: "+fila.size());
		boolean verifica = fila.isEmpty();
		if(verifica == true) {
			System.out.println("A fila est� vazia");
		}else {
			System.out.println("A fila n�o est� vazia");
		}
		
	}

}
