package deepali.forLoop;

/*write a logic to print below pattern.
*
**
***
****

**/
public class Assignment_38 {

	void getPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Assignment_38 assignment = new Assignment_38();
		assignment.getPattern();
	}
}
