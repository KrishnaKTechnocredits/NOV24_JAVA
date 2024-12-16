package rushikesh.printPatternProgram;

public class Assignment_44 {

	void printPatternMethod() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("#" + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_44 assignment_44 = new Assignment_44();
		assignment_44.printPatternMethod();
	}

}
