import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int soma = 0;
		// (inicio (define a quantidade); condição; incremento)
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x; // simplificação de (soma = soma + x)
		}

		System.out.println("Valor da soma é: " + soma);

		sc.close();
		
		System.out.println("");		
		// Contagem até 5 vezes
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);			
		}
		
		System.out.println("");
		// Contagem regressiva
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}
	}
}
