package Kata8;

public class MutliplicationTable {
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d\t", i * j);
			}
			System.out.println();
		}
	}
}
/* Multiplication table
 *
 * Creation multiplication table 10x10, using a loop "for".
 */