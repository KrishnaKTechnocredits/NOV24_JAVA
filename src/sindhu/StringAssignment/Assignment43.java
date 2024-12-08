/*write a logic to print below pattern.

A
B C
D E F
G H I J*/

package sindhu.StringAssignment;

public class Assignment43 {
	void getPattern() {
		char ch = 'A';
		for(int i=1;i<=4; i++) {
			for(char j=1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Assignment43 assign43 = new Assignment43();
		assign43.getPattern();
	}
}
