package rushikesh.printPatternProgram;

public class Assignment_44 {

	void printPatternMethod() {
		int count = 0;
		for (int index = 1; index <= 5; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (count == 0 && index == 1) {
					System.out.println("*");
					count++;
				} else if (count == 1 && index == 2) {
					System.out.println("*" + " #");
					count++;
				} else if (count == 2 && index == 3) {
					System.out.println("#");
					count++;
				} else if (count == 3 && index == 4) {
					System.out.println("#" + " #");
					count++;
				} else if (count == 4 && index == 5) {
					System.out.println("#" + " #" + " *");
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_44 assignment_44 = new Assignment_44();
		assignment_44.printPatternMethod();
	}

}
