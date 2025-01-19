/*
Assignment - Extra
write a logic to print below pattern.

1A
2B 3C
4D 5E 6F
7G 8H 9I 10J
 
*/

package amruta.PatternPrintingCode;

public class InterviewPatternPrintCode {

	static void print() {
		char ch = 'A';
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				System.out.print(ch);
				System.out.print(" ");
				ch++;
				count++;
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		print();
	}
}
