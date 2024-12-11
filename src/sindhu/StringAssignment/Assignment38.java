/*write a logic to print below pattern.

*
**
***
****  */

package sindhu.StringAssignment;

public class Assignment38 {
	
	void getPattern() {
		for(int i=1;i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment38 assign38 = new Assignment38();
		assign38.getPattern();
	}
}
