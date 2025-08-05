package prem;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment101 {
	
		public static void main(String[] args) {
			Assignment101 obj = new Assignment101();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the total count of input");
			int size = sc.nextInt();
			System.out.println("Please keep on entering num to process and Enter any name to stop: ");
			int[] arr1 = new int[size];

		for (int i = 0 ; i<arr1.length ; i++) {
				arr1[i] = sc.nextInt();
				System.out.println("Entered num: "  + arr1[i]);
			}

			System.out.println("Scanner stopped");
			sc.close();
			System.out.println("Input array : "+Arrays.toString(arr1));
			obj.findMaxFromArray(arr1);
		}

		private void findMaxFromArray(int[] arr1) {
			int maxum =  arr1[0];
			int secondMax = arr1[1];
			if(secondMax > maxum) {
				maxum = secondMax;
			}
			for(int i = 2 ; i<arr1.length ; i++) {
				if(arr1[i]>maxum) {
					secondMax = maxum;
					maxum = arr1[i];
				}else if(arr1[i]<maxum && arr1[i]>secondMax) {
					secondMax = arr1[i];
				}
			}
			System.out.println("Second max from given input is: " +secondMax);
			
		}

}
