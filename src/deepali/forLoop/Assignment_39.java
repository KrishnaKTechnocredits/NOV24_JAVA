package deepali.forLoop;

/*write a logic to print below pattern.

1  
1 2  
1 2 3  
1 2 3 4 

**/
public class Assignment_39 {

	void getPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Assignment_39 assignment = new Assignment_39();
		assignment.getPattern();
	}
}
