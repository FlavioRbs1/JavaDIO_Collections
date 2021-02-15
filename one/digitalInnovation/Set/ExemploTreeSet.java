package one.digitalInnovation.Set;

import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		//retorna o primeiro no topo da arvore
		System.out.println(treeCapitais.first());
		
		//retorna o ultimo no final da arvore
		System.out.println(treeCapitais.last());
		
		//retorna o elemento acima do elemento parametrizado
		System.out.println(treeCapitais.higher("São Paulo"));
		
		//retorna o elemento abaixo do elemento parametrizado
		System.out.println(treeCapitais.lower("São Paulo"));
				
	}

}
