import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) { // x diferente de 0
			soma = soma + x;
			x = sc.nextInt(); //retorno para não gerar um loop
		}
		
		System.out.println(soma);
		
		sc.close();

	}
}

