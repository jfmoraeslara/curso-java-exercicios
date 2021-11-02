package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// instanciando a lista com a classe ArrayList
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Lucas");
		list.add("Anna");
		list.add("Luis");
		// para inserir um elemento em uma posição
		list.add(2, "Claudio");
		
		// para ver o tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());		
		
		// imprimir a lista
		for (String x: list) {
			System.out.println(x);		
		}
						
		System.out.println("-----------------------");
		// encontrar a posição de um elemento
		System.out.println("Posição do Alex: " + list.indexOf("Alex"));
		// caso o elemento não esteja na lista
		System.out.println("Posição do Marco: " + list.indexOf("Marco"));		
		// para fazer um filtro na lista
		System.out.println("-----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);		
		}
		// filtra e pegar o primeiro elemento que atende ao predicado caso contrario retornar null
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);		
	}
}
