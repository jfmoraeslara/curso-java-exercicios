public class Main {

	public static void main(String[] args) {		
		
		String s = "potato-apple-lemon";
		
		String[] vect = s.split("-"); //usando o tra�o como separador
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);		
	}
}
