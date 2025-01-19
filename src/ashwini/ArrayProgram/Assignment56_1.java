package ashwini.ArrayProgram;

import java.util.Arrays;

public class Assignment56_1 {
	
		int[] returnMaxnum(int[] arr1, int[] arr2) {
			int[] output = new int[arr1.length];
			System.out.println("Input1: {10,55,22,77,88}");
			System.out.println("Input2: {5,102,28,77,18}");
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] > arr2[i]) {
					output[i] = arr1[i];
				} else
					output[i] = arr2[i];
			}
			return output;
		}

		public static void main(String[] args) {
			int[] arr1 = { 10, 55, 22, 77, 88 };
			int[] arr2 = { 5, 102, 28, 77, 18 };
			Assignment56 a56 = new Assignment56();
			int[] maxNum = a56.returnMaxnum(arr1, arr2);
				System.out.println( Arrays.toString(maxNum));
			
			
		}
}

