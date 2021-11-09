package entities;

public class Conta {
	private int number;
	private String name;
	private double value;
		
	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}	

	public Conta(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositValue(initialDeposit);
	}
	
	// getters e setters
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}	
	
	// operação depósito
	public void depositValue(double value) {
		this.value += value;
	}
	// operação saque
	public void drawValue(double value) {
		this.value -= value + 5.00;
	}
		
	public String toString() {
		return "Account " + number +
				", Holder: " + name + 
				", Balance: $ " + String.format("%.2f", value);		
	}
}
