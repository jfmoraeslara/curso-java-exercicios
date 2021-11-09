package entities;

public class Product {
	// atributos encapsulados (privado)
	private String name;
	private double price;
	private int quantity;
	
	public Product() {		
	}
	
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
	// constru��o do set e get
		
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/* para proteger a quantidade de estoque, somente iremos criar o get e n�o o set para
	que n�o	haja altera��es no estoque sem que seja pela entrada ou sa�da no estoque*/
	public int getQuantity() {
		return quantity;
	}
		
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());				
	}
}