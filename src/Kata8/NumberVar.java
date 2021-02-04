package Kata8;

import java.util.Scanner;

public class NumberVar {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = in.nextInt();
		System.out.print("Input second number: ");
		int b = in.nextInt();
		in.close();
		
		if (a > b) {
			System.out.println("The first number is greater than the second");
		} else if (a < b) {
			System.out.println("The second number is greater than the first");
		} else {
			System.out.println("Number's are equal");
		}
	}
}