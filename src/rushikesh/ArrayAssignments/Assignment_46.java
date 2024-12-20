package rushikesh.ArrayAssignments;

public class Assignment_46 {

	void printMidCharFromString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (str.length() % 2 == 0) {
				char ch = str.charAt(str.length() / 2 - 1);
				System.out.println(str + "->" + ch);
			} else if (str.length() % 2 == 1) {
				char ch = str.charAt(str.length() / 2);
				System.out.println(str + "->" + ch);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_46 assignment_46 = new Assignment_46();
		String[] arr = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		assignment_46.printMidCharFromString(arr);
	}
}
