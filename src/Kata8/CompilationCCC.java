package Kata8;

import java.util.Scanner;

public class CompilationCCC {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first num: ");
		int a = in.nextInt();
		
		System.out.print("Input second num: ");
		int b = in.nextInt();
		
		System.out.println("Choose operator: 1. Addition 2. Substruction 3. Multiply ");
		int operator = in.nextInt();
		int result   = 0;
		
		switch (operator) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
		}
		
		if (operator >= 1 && operator <= 3) {
			System.out.printf("Result is: %d", result);
		}
	}
	
}