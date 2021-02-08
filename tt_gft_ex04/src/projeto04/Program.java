package projeto04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		String C = A;
		
		A = B;
		B = C;
		
		System.out.print(A + " " + B);		
		
		sc.close();

	}

}
