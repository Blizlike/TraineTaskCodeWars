package Kata8;

import java.util.Scanner;

public class BankCalculator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount of money: ");
		int money = in.nextInt();
		
		if (money < 100) {
			money += money * 0.05;
		} else if (money >= 100 && money <= 200) {
			money += money * 0.07;
		} else {
			money += money * 0.1;
		}
		System.out.printf("Sum of deposit after percent accrual: %d", money);
	}
}