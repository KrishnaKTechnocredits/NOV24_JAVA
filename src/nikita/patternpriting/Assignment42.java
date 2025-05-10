/* write a logic to print below pattern.

1
2 2
3 3 3
4 4 4 4
*/

package nikita.patternpriting;

public class Assignment42 {
	
	void printPattern() {
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment42 a42= new Assignment42();
		a42.printPattern();
	}
}
