package projeto03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	// Elefante incomoda
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for (int i = 0; i<entrada; i++) {
			System.out.print("Incomoda ");
		}
		
		System.out.println("muito mais");
		
		sc.close();
		
	}

}
