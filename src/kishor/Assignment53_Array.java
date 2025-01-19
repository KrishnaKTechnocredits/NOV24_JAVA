package kishor;
//print the array in reverse order. 

public class Assignment53_Array {

	void displayRevArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 34, 22, 16, 19, 99 };
		Assignment53_Array assignment53 = new Assignment53_Array();
		assignment53.displayRevArray(arr);
	}
}
