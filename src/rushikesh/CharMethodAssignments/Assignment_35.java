package rushikesh.CharMethodAssignments;

public class Assignment_35 {

	void getCountMethod(String str) {
		int uCount = 0;
		int lCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				uCount++;
			} else if (Character.isLowerCase(str.charAt(index))) {
				lCount++;
			}
		}
		System.out.println("upper case character count is " + uCount);
		System.out.println("lower case character count is " + lCount);
		System.out.println();
		if (uCount > lCount) {
			System.out.println("Upper case character count is greter than loewr case");
		} else if (uCount < lCount) {
			System.out.println("Lower case character count is greter than upper case");
		}

	}

	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		assignment_35.getCountMethod("AARCsgdrdhdhWE");

	}

}
