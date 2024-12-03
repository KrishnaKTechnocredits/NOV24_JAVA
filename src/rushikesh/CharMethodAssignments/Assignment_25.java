package rushikesh.CharMethodAssignments;

public class Assignment_25 {

	void printSumOfdidgitInString(String str) {
		
		System.out.println("Given string is "+str);
		int sum = 0;
		int index = 0;
		for (; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int ch = Character.getNumericValue(str.charAt(index));
				sum = sum + ch;
			}
		}
		System.out.println("sum of digit in given string is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_25 assignment_25 = new Assignment_25();
		assignment_25.printSumOfdidgitInString("te1ch2no3cre7dits");
		System.out.println();
		assignment_25.printSumOfdidgitInString("techno");
		System.out.println();
		assignment_25.printSumOfdidgitInString("4563");

	}

}
