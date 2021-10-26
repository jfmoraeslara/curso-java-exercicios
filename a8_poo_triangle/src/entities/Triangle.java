package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	// criando uma nova função ou método
	public double area() { // area() não precisa receber a função (a, b , c) porque ela já está nessa classe
		double p = (a + b + c) / 2;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

}
