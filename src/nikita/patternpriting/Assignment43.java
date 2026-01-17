/* write a logic to print below pattern.

A
B C
D E F
G H I J
*/

package nikita.patternpriting;

public class Assignment43 {
	
	void printPatter() {
	char ch = 'A';
	for (int i=1; i<=4; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment43 a43 = new Assignment43();
		a43.printPatter();
	}
}
