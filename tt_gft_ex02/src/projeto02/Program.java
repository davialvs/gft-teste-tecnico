package projeto02;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double rg = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(String nome, double rg, double salario_total);
		
		
		
		System.out.println();
		
		
		System.out.println();
		
		sc.close();

	}

}
