// return second maximum number from given array.


package imran.ArrayPrograms;
import java.util.*;

public class Assignment60_ReturnSecondMaxNumberFromArray {

	int returnSecondMaxElement(int[] data)
	{
		int maxElement = data[0];
		int secondMaxElement = data[1];
		
		if(maxElement < secondMaxElement)
		{
			secondMaxElement = data[0];
			maxElement = data[1];
		}
		
		for(int i=2; i<=data.length-1;i++)
		{
			if(maxElement < data[i])
			{
				secondMaxElement = maxElement;
				maxElement = data[i];
			}
			else if(secondMaxElement < data[i])
			{
				secondMaxElement = data[i];
			}
		}
		return secondMaxElement;
	}
	
	public static void main(String[] args) {
		Assignment60_ReturnSecondMaxNumberFromArray assignment60_ReturnSecondMaxNumberFromArray_1 = new Assignment60_ReturnSecondMaxNumberFromArray();
		int[] arr = {33,33,19,55,53,11};
		System.out.println(" The Given Array is : " +Arrays.toString(arr) );
		int secondMaxElement = assignment60_ReturnSecondMaxNumberFromArray_1.returnSecondMaxElement(arr);
		System.out.println(" The Second Maximum Number present in the array is : " + secondMaxElement);
	}
}
