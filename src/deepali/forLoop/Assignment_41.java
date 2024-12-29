package deepali.forLoop;

/*write a logic to print below pattern.

write a logic to print below pattern.

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5

**/
public class Assignment_41 {

	void getPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Assignment_41 assignment = new Assignment_41();
		assignment.getPattern();
	}
}
