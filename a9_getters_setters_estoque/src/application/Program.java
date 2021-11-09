package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();		
		Product product = new Product(name, price);
		
		// get e set para atualização do preço
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		// chamada leitura toString da classe product
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); //atualização do produto em estoque
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		sc.close();	
	}
}