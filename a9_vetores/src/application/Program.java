package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with quantity product: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
				
		//vect.lenght substitui o n
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Name product: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice(); // get.Price para pegar o somente o preço no vetor
		}
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}
