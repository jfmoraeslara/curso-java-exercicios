import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// URI 1051 ponto cumulativo
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto = 0.0; // (= 0.0) inicialização para rodar a variável por causa do condicional if
		if (salario <= 2000.00) {
			imposto = 0.00;
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}

		if (imposto == 0.00) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}
}

