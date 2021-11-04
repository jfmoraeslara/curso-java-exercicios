package entities;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		return (nota1 + nota2 + nota3) / 3.0;
	}

	public String toString() {
		if (finalGrade() >= 7.00) {
			return "NOTA FINAL " + String.format("%.2f%n", finalGrade()) + "APROVADO";
		} else {
			double missing = 7.0 - finalGrade();
			return "NOTA FINAL " + String.format("%.2f%n", finalGrade()) + "REPROVADO"
					+ String.format("%nFALTARAM: %.2f", missing) + " PONTOS\n";
		}
	}
}
