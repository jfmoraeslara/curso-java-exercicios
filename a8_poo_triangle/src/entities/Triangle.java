package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	// criando uma nova fun��o ou m�todo
	public double area() { // area() n�o precisa receber a fun��o (a, b , c) porque ela j� est� nessa classe
		double p = (a + b + c) / 2;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

}
