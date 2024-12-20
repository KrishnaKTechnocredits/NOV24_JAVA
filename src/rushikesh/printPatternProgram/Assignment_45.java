package rushikesh.printPatternProgram;

public class Assignment_45 {

	void printPattern() {
		for (int i = 1; i <= 4; i++) {
			int count = 0;
			if (i % 2 == 0) {
				count = 3;
			} else {
				count = 5;
			}
			for (int j = 1; j <= count; j++) {
				if (j % 2 == 0) {
					System.out.print("#"+" ");
				} else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_45 assignment_45 = new Assignment_45();
		assignment_45.printPattern();
	}

}
