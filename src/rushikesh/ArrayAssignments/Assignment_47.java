package rushikesh.ArrayAssignments;

public class Assignment_47 {

	void printNameOfString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (str.length() > 6) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_47 assignment_47 = new Assignment_47();
		String[] arr = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		assignment_47.printNameOfString(arr);
	}

}
