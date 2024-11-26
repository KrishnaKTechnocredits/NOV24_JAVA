package pankaj.stringAssignment;

public class Assignment19 {

	void printStringlen(String str) {

		System.out.println("======The Length of the string========");
		System.out.println("                   "+str.length());
		System.out.println("======The RZeverse String is as below====");
		for (int index = str.length() - 1; index >= 0; index--) {

			System.out.println(str.charAt(index));

		}

	}

	public static void main(String[] args) {

		Assignment19 A19 = new Assignment19();
		A19.printStringlen("PankajAssignment");
	}

}
