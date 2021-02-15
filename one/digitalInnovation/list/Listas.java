package one.digitalInnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Maria");	
		nomes.add("Jo�o");
		nomes.add("Juliana");
		nomes.add("Anderson");
		
		System.out.println("Lista original "+nomes);
		
		nomes.set(2, "Larissa");
		System.out.println("Ap�s aplica��o da fun��o set "+nomes);
		// Em ordem alfab�tica
		
		Collections.sort(nomes);
		
		//Altera o valor de uma posi��o
		nomes.set(2, "Wesley");
		System.out.println("Ap�s aplica��o da fun��o sort "+nomes);
	
		// remove o valor de uma posi��o
		nomes.remove(4);
		System.out.println("Ap�s remo��o da posi��o 4 "+nomes);
			
		//remo��o de um valor espec�fico
		nomes.remove("Wesley");
		System.out.println("Ap�s remo��o do nome Wesley "+nomes);
		
		int posicao = nomes.indexOf("Carlos");
		System.out.println("A posi��o de Carlos �: "+posicao);
		
		//M�TODO GET
		//retorna o elemento do indice informado
		
		String nome = nomes.get(1);
		System.out.println("Get no indice 1 da lista "+nome);
		
		//Tamanho da lista
		int tamanho = nomes.size();
		System.out.println("Tamanho da lista "+tamanho);
		
		//Verifica se cont�m um determinado elemento na lista
		
		boolean temMaria = nomes.contains("Maria");
		System.out.println(temMaria);
		
		boolean temPedro= nomes.contains("Pedro");
		System.out.println(temPedro);
		if (temPedro == true) {
			System.out.println("� true");
		}
		
		for( String nomeDoItem: nomes) {
			System.out.println("-->"+nomeDoItem);
		}
		
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println("---->"+iterator.next());
		}
		
		//verificase a lista est� vazia
		boolean listaVazia = nomes.isEmpty();
		System.out.println(listaVazia);
		
		// clear, limpa a lista
		nomes.clear();
		listaVazia = nomes.isEmpty();
		System.out.println("A lista est� vazia? "+listaVazia);
		
		
	}

}
