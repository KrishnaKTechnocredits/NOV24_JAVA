package pooja.array;

import java.util.Arrays;

/*Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}*/
public class Assignment_74 {

	void rightShiftAraay(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i + 1] = arr[i];
		}
		System.out.println("Rotated Array is : " + Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Assignment_74 assignment_74 = new Assignment_74();
		System.out.println("Given Array is : " + Arrays.toString(arr));
		assignment_74.rightShiftAraay(arr);
	}
}