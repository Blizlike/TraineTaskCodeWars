package Kata8;

import java.util.Scanner;

public class ScannerTraning {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		
		do {
			System.out.println("Input a first num: ");
			int num = in.nextInt();
			System.out.println("Input a second num: ");
			int num2 = in.nextInt();
			System.out.printf("%d * %d = %d\t", num, num2, num * num2);
			
			System.out.println("If you want to end the pogramm - press 1 on keybord, if you want continue - press choose "
					+ "another number");
			x = in.nextInt();
		}
		while (x != 1);
	}
}