package VaishnaviD;

import java.util.Arrays;

public class Challenge1 {

		int[] sumOfOtherArrayEle(int[] arr) {
			int[] sum = new int [arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i !=j) {
						sum[i] = sum[i]+arr[j];
					}
				}
			}
			return sum;
		}

		public static void main(String[] args) {
			int[] input = {3, 5, 7, 1, 9};
			Challenge1 obj = new Challenge1();
			System.out.println(Arrays.toString(obj.sumOfOtherArrayEle(input)));	
		}
	}


