import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
				
		for (int i=0; i<N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double media = (x * 0.2 + y * 0.3 + z * 0.5);
			
			System.out.printf("%.1f%n", media);
			
			}		
		
		sc.close();
	}
}