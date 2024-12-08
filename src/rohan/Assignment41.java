package rohan;

public class Assignment41 {

	public static void main(String[] args) {
		Assignment41 assignment = new Assignment41();
		assignment.printNum();
	}
	void printNum() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
