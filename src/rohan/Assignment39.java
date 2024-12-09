package rohan;

public class Assignment39 {

	public static void main(String[] args) {
		Assignment39 assignment = new Assignment39();
		assignment.printNum();
	}
	void printNum() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
