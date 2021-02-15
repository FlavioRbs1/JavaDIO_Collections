package one.digitalInnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicioLista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Juliana");
		lista.add("Pedro");
		lista.add("Carlos");
		lista.add("Larissa");
		lista.add("Jo�o");
		System.out.println(lista);

		lista.set(2, "Roberto");
		System.out.println("Trocando Carlos por Roberto: "+lista);
		
		String primeiro = lista.get(0);
		System.out.println("O primeiro nome da lista �: "+primeiro);
		
		lista.remove(3);
		System.out.println("Removendo o 4� item da lista: "+lista);
		
		int tamanho = lista.size();
		System.out.println("O tamanho da lista  de "+tamanho+" elementos.");
		
		lista.remove("Jo�o");
		tamanho = lista.size();
		System.out.println("Removido o nome Jo�o, o tamanho da lista agora � de "+tamanho+" elementos.");
		
		boolean verifica = lista.contains("Juliano");
		if(verifica == true) {
			System.out.println("Existe o nome Juliano na lista");
		}else {
			System.out.println("N�o existe o nome Juliano na lista");
		}
		List<String> newlista = new ArrayList<>();
		newlista.add("Ismael");
		newlista.add("Rodrigo");
		System.out.println("Criada nova lista"+newlista);
		
		lista.addAll(newlista);
		System.out.println("Adicionando a nova lista na lista antiga"+lista);
		
		Collections.sort(lista);
		System.out.println("Ordenando a lista"+lista);
		
		boolean vazio = lista.isEmpty();
		if(vazio == true) {
			System.out.println("A lista est� vazia");
		}else{
			System.out.println("A lista n�o est� vazia");
		}
		
		
	}

}
