/*Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment74 {
	
	public int[] getOutputArray(int[] inArr) {
		int[] outArr = new int[inArr.length];
		int index = 0;
		outArr[0] = inArr[inArr.length-1];
		for(int i=1; i<inArr.length; i++) {
			outArr[i]=inArr[index];
			index++;
		}
		return outArr;
	}

	
	public static void main(String[] args) {
		int[] input = {10,20,30,40,50};
		Assignment74 assign74 = new Assignment74();
		System.out.println("Input Array is: "+Arrays.toString(input));
		int[] outArr1 = assign74.getOutputArray(input);
		int[] outArr2 = assign74.getOutputArray(outArr1);
		
		System.out.println("Output Array for 1st Rotation: "+Arrays.toString(outArr1));
		System.out.println("Output Array for 1st Rotation: "+Arrays.toString(outArr2));
	}
}
