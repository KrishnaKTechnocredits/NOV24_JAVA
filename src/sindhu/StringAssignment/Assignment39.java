/* Pattern 2nd:
1
1 2
1 2 3
1 2 3 4*/

package sindhu.StringAssignment;

public class Assignment39 {
	
	void getPattern() {
		for(int i=1;i<5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Assignment39 assign39 = new Assignment39();
		assign39.getPattern();
	}
}
