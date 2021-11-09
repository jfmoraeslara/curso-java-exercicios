package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta; // declarado fora do if e else

		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String name = sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, name, initialDeposit);			
		} else {
			// instanciando com o construtor de 2 argumentos
			conta = new Conta(number, name);			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.depositValue(depositValue);
		System.out.println("Updated accont data: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a with draw value: ");
		double drawValue = sc.nextDouble();
		conta.drawValue(drawValue);
		System.out.println("Updated accont data: ");
		System.out.print(conta);

		sc.close();
	}
}
