package rohan;

public class Assignment38 {

	public static void main(String[] args) {
		Assignment38 assignment = new Assignment38();
		assignment.star();
	}
	void star() {
		for(int i=1;i<=5;i++) {
			for(int j=1 ;j<=i;j++) {
				System.out.print("* ");
			}System.out.println("");
		}
	}

}
