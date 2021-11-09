package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// � possivel manter o construtor padr�o caso queira instancialo na classe do programa
	public Product() {		
	}
	
	// construtor personalizado (vem logo ap�s os atributos)
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// construtor que iniciar� com a quantity = 0
	public Product(String name, double price) {
		this.name = name;
		this.price = price;		
	}
		
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // this d� acesso ao atributo quantity da classe
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name	+ ", " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());				
	}
}
