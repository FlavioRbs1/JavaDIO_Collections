package one.digitalInnovation.list;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		filaBanco.clear();
		//poll remove o primeiro da fila
		String clienteASerAtendido = filaBanco.poll();
		System.out.println("Proximo cliente a ser atendido "+clienteASerAtendido);
		System.out.println(filaBanco);
		
		//peek mostra o primeiro da fila sem deletar ele, retorna null se a lista tiver vazia
		//element mostra o primeiro da fila sem deletar ele, retorna um erro se a lista tiver vazia
		String primeiroCliente = filaBanco.peek();
		System.out.println("O primeiro da fila é: "+primeiroCliente);
		System.out.println(filaBanco);

		for (String cliente: filaBanco) {
			System.out.println(cliente);
		}

		
	}

}
