package Kata8;

import java.util.Scanner;

public class NumberСomparison {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int a = in.nextInt();
		in.close();
		
		String answer = (a > 2) && (a < 9) ? "The number greater than 5 and lower than 10" : "Unknown number";
		System.out.println(answer);
	}
}