package deepali.forLoop;

/*write a logic to print below pattern.
1
2 2
3 3 3
4 4 4 4

**/
public class Assignment_43 {

	void getPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Assignment_43 assignment = new Assignment_43();
		assignment.getPattern();
	}
}
