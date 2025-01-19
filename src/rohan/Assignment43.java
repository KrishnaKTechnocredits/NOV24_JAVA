package rohan;

public class Assignment43 {

	public static void main(String[] args) {
		Assignment43 assignment = new Assignment43();
		assignment.printNum();
	}
	void printNum() {
		char ch = 'A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
		}
	}
}
