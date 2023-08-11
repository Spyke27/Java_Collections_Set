package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		
		set.add("Notebook");
		set.add("Televisão");
		set.add("Telefone");
		
		System.out.print("Pesquisar produto: ");
		String productSearch = scan.next();
		
		if(set.contains(productSearch)) {
			System.out.println("Product exists!");
		}else {
			System.out.println("Product doesn't exist!");
		}
		
		set.removeIf(x -> x.charAt(0) == 'N'); //Aspas simples
		
		for(String product: set) {
			System.out.println(product);
		}
		
	}

}
