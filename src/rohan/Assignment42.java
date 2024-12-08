package rohan;

public class Assignment42 {

	public static void main(String[] args) {
		Assignment42 assignment = new Assignment42();
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
