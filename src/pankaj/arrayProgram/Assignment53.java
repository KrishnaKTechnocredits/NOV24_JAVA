package pankaj.arrayProgram;

public class Assignment53 {

	void revOrder(int[] arr) {
		System.out.println("==The reverse order of the given array==");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("            " + arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] data = { 10, 34, 22, 16, 19, 99 };
		Assignment53 A = new Assignment53();
		A.revOrder(data);
	}
}
