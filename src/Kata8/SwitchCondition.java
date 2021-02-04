package Kata8;

import java.util.Scanner;

public class SwitchCondition {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("1.Multiply 2.Devision 3.Addition 4.Substructin ");
		System.out.println("Enter condition number: ");
		int num = in.nextInt();
		
		switch (num) {
			
			case 1:
				System.out.println("Multiply");
				break;
			case 2:
				System.out.println("Devision");
				break;
			case 3:
				System.out.println("Addition");
				break;
			case 4:
				System.out.println("Substructin");
				break;
			default:
				System.out.println("Wrong input");
				break;
		}
	}
}