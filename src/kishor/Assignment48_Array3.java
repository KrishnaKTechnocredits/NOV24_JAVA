package kishor;

public class Assignment48_Array3 {

	int getCount(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] value = { 10, 30, -45, 66, -10 };
		Assignment48_Array3 assignment48 = new Assignment48_Array3();
		int ans = assignment48.getCount(value);
		System.out.println("Count of positive number is:-" + ans);
	}
}
