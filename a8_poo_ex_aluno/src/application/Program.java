package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aluno(a): ");
		Aluno aluno = new Aluno();
		aluno.name = sc.nextLine();
		System.out.println("Entre com as notas do aluno(a): ");	
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(aluno);
		
		sc.close();	
	}
}
