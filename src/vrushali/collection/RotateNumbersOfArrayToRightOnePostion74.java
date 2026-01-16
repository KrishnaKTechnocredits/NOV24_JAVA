package vrushali.collection;

import java.util.Arrays;

//Assignment - 74 : 8th Jan
//Rotate all the numbers of an array to the right by one position. 
//input : {10,20,30,40,50}
//output : {50,10,20,30,40};
//         {40,50,10,20,30}


public class RotateNumbersOfArrayToRightOnePostion74 {
	
	int[] rotateNumFromArrayToRightOnePosition(int[] numArray)
	{
		int[] outputArray=new int[numArray.length];
		outputArray[0]=numArray[numArray.length-1];
		
		for(int i=1,j=0;j<numArray.length-1;i++,j++)
		{
			outputArray[i]=numArray[j];
		}
		return outputArray;
	}
	public static void main(String[] args) {
		RotateNumbersOfArrayToRightOnePostion74  rotateNumbersOfArrayToRightOnePostion74=new RotateNumbersOfArrayToRightOnePostion74();
		int[] numArray={10,20,30,40,50};
		int[] outputArray=rotateNumbersOfArrayToRightOnePostion74.rotateNumFromArrayToRightOnePosition(numArray);
		System.out.println(Arrays.toString(outputArray));
		outputArray=rotateNumbersOfArrayToRightOnePostion74.rotateNumFromArrayToRightOnePosition(outputArray);
		System.out.println(Arrays.toString(outputArray));
	}
}
