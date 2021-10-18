import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		// caso preço < 20.0, recebe o valor preço x 0.1 caso contrário recebe preço x 0.05.
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
				
		System.out.println("O desconto é: " + desconto);
		
		sc.close();
	}
}
