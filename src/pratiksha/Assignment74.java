//Assignment - 74 : 8th Jan
//Rotate all the numbers of an array to the right by one position. 
//input : {10,20,30,40,50}
//output : {50,10,20,30,40};
//         {40,50,10,20,30}

package pratiksha;

import java.util.Arrays;

public class Assignment74 {
	int[] rightByOnePosition(int[] array) {
		int[] array1=new int[array.length];
		for (int i=0;i<array.length-1;i++) {
			array1[i+1]= array[i];
		}
		array1[0]=array[array.length-1];
		return array1;
	}
	
	public static void main(String[] args) {
		int[] input ={10,20,30,40,50};
		System.out.println("Input:" +Arrays.toString(input));
		Assignment74 assignment74=new Assignment74();
		System.out.println("output"+Arrays.toString(assignment74.rightByOnePosition(input)));
	}

}
