package rushikesh.nestedForLoop;

public class Assignment_36 {
	
	void printTableMethod() {
		for (int index=1;index<=5;index++) {
			for (int innerIndex=1;innerIndex<=10;innerIndex++) {
				System.out.println(index+" * "+innerIndex+" = "+index*innerIndex);
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args) {
		Assignment_36 assignment_36 = new Assignment_36();
		assignment_36.printTableMethod();
	}
}
