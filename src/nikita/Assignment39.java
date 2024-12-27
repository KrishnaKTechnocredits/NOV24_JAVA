/* write a logic to print below pattern.

1
1 2
1 2 3
1 2 3 4

*/

package nikita;

public class Assignment39 {
	
	void printPattern() {
		for(int i = 1; i<=4; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment39 a39 = new Assignment39();
		a39.printPattern();
	}
}
